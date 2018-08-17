package org.karane.library.mapper;

import org.karane.library.entity.Rent;
import org.karane.library.output.RentOutput;

public class RentOutputMapper {

    public static RentOutput map(Rent rent){
        RentOutput rentOutput = new RentOutput();

        rentOutput.setReceipt(rent.getReceipt());
        rentOutput.setBookId(rent.getBookId());
        rentOutput.setCpf(rent.getCpf());

        return rentOutput;
    }
}
