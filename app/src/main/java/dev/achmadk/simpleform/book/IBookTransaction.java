package dev.achmadk.simpleform.book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface IBookTransaction {
    public String id = "";

    public List<String> bookIds = new ArrayList<>();

    public Date transactionDate = null;
}
