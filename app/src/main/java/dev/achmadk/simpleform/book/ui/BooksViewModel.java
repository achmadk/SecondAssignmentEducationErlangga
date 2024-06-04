package dev.achmadk.simpleform.book.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import dev.achmadk.simpleform.book.ErlanggaBook;

public class BooksViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<List<ErlanggaBook>> _books = new MutableLiveData<>();
    public LiveData<List<ErlanggaBook>> books = _books;

    public void getBooks() {
        List<ErlanggaBook> books = new ArrayList<>();
        books.add(new ErlanggaBook("Buku 1", "Erlangga", "Achmad K", null));
        _books.setValue(books);
    }
}