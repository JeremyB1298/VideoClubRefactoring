package fr.videoclub;

public abstract class Statement {
    protected final Customer customer;

    public Statement(Customer customer) {
        this.customer = customer;
    }

    public String value() {
        StringBuilder builder = new StringBuilder();
        builder.append(headerString());
        for (Rental rental : customer.getRentals()) {

            // add frequent renter points
            // show figures for this rental
            builder.append(eachRentalString(rental));

        }
        // add footer lines
        builder.append(footerString());
        return builder.toString();

    }

    protected abstract String footerString();

    protected abstract String eachRentalString(Rental rental);

    protected abstract String headerString();
}
