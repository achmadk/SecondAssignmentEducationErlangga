package dev.achmadk.simpleform.book.ui;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import dev.achmadk.simpleform.R;
import dev.achmadk.simpleform.book.ErlanggaBook;
import dev.achmadk.simpleform.databinding.FragmentBooksBinding;
import dev.achmadk.simpleform.databinding.FragmentFirstBinding;

public class BooksFragment extends Fragment {

    private BooksViewModel mViewModel;
    private FragmentBooksBinding binding;

    public static BooksFragment newInstance() {
        return new BooksFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentBooksBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BooksViewModel.class);
        // TODO: Use the ViewModel
        mViewModel.getBooks();
        mViewModel.books.observe(getViewLifecycleOwner(), books -> {
            binding.booksText.setText(books.get(0).title);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}