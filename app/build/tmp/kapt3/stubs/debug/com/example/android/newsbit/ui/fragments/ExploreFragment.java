package com.example.android.newsbit.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00102\u001a\u00020/2\u0006\u00103\u001a\u0002042\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00105\u001a\u00020/H\u0002J\b\u00106\u001a\u00020/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010+\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u00a8\u00067"}, d2 = {"Lcom/example/android/newsbit/ui/fragments/ExploreFragment;", "Landroidx/fragment/app/Fragment;", "()V", "bottomSection1", "Landroid/widget/LinearLayout;", "categories", "", "Lcom/example/android/newsbit/models/Category;", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "categoryAdapter", "Lcom/example/android/newsbit/adapters/CategoryAdapter;", "categoryItemView", "Landroidx/recyclerview/widget/RecyclerView;", "date", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "day", "", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "isScrolling", "", "()Z", "setScrolling", "(Z)V", "month", "newsSourceAdapter", "Lcom/example/android/newsbit/adapters/NewsSourceAdapter;", "newsSourceItemView", "newsSources", "Lcom/example/android/newsbit/models/NewsSource;", "paginationProgressBarView", "Landroid/widget/ProgressBar;", "searchKeyword", "viewModel", "Lcom/example/android/newsbit/ui/NewsViewModel;", "year", "getYear", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "setupCategoryRecyclerView", "setupNewsSourceRecyclerView", "app_debug"})
public final class ExploreFragment extends androidx.fragment.app.Fragment {
    private com.example.android.newsbit.ui.NewsViewModel viewModel;
    private com.example.android.newsbit.adapters.CategoryAdapter categoryAdapter;
    private androidx.recyclerview.widget.RecyclerView categoryItemView;
    private com.example.android.newsbit.adapters.NewsSourceAdapter newsSourceAdapter;
    private androidx.recyclerview.widget.RecyclerView newsSourceItemView;
    private java.lang.String searchKeyword;
    private android.widget.ProgressBar paginationProgressBarView;
    private android.widget.LinearLayout bottomSection1;
    private boolean isScrolling = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.android.newsbit.models.Category> categories;
    private java.util.List<com.example.android.newsbit.models.NewsSource> newsSources;
    private final java.util.Calendar date = null;
    private final int year = 0;
    private final int month = 0;
    private final int day = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String from;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isScrolling() {
        return false;
    }
    
    public final void setScrolling(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.android.newsbit.models.Category> getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.newsbit.models.Category> p0) {
    }
    
    public final int getYear() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupCategoryRecyclerView() {
    }
    
    private final void setupNewsSourceRecyclerView() {
    }
    
    public ExploreFragment() {
        super();
    }
}