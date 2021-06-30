// Generated by view binder compiler. Do not edit!
package com.example.android.newsbit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.android.newsbit.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OnboardingScreenLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView descScreen;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView titleScreen;

  private OnboardingScreenLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView descScreen, @NonNull ImageView imageView, @NonNull TextView titleScreen) {
    this.rootView = rootView;
    this.descScreen = descScreen;
    this.imageView = imageView;
    this.titleScreen = titleScreen;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OnboardingScreenLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OnboardingScreenLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.onboarding_screen_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OnboardingScreenLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.desc_screen;
      TextView descScreen = rootView.findViewById(id);
      if (descScreen == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.title_screen;
      TextView titleScreen = rootView.findViewById(id);
      if (titleScreen == null) {
        break missingId;
      }

      return new OnboardingScreenLayoutBinding((ConstraintLayout) rootView, descScreen, imageView,
          titleScreen);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}