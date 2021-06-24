// Generated by view binder compiler. Do not edit!
package com.example.android.newsbit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.android.newsbit.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTopNewsBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final RecyclerView newsItemView;

  @NonNull
  public final ProgressBar paginationProgressBar;

  private FragmentTopNewsBinding(@NonNull NestedScrollView rootView,
      @NonNull RecyclerView newsItemView, @NonNull ProgressBar paginationProgressBar) {
    this.rootView = rootView;
    this.newsItemView = newsItemView;
    this.paginationProgressBar = paginationProgressBar;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTopNewsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTopNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_top_news, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTopNewsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.newsItemView;
      RecyclerView newsItemView = rootView.findViewById(id);
      if (newsItemView == null) {
        break missingId;
      }

      id = R.id.paginationProgressBar;
      ProgressBar paginationProgressBar = rootView.findViewById(id);
      if (paginationProgressBar == null) {
        break missingId;
      }

      return new FragmentTopNewsBinding((NestedScrollView) rootView, newsItemView,
          paginationProgressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
