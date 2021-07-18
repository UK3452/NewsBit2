package com.example.android.newsbit.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010W\u001a\u00020FH\u0002J\u0012\u0010X\u001a\u00020F2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u001a\u0010[\u001a\u00020F2\u0006\u0010\\\u001a\u00020]2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\b\u0010^\u001a\u00020FH\u0002J\b\u0010_\u001a\u00020FH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"R\u0019\u0010*\u001a\n ,*\u0004\u0018\u00010+0+\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u001a\u00101\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\nR\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u00106\"\u0004\b:\u00108R\u001a\u0010;\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\u0011\u0010=\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010 R\u001a\u0010?\u001a\u00020@X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010E\u001a\u00020FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010K\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010L\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010 \"\u0004\bN\u0010\"R\u001a\u0010O\u001a\u00020PX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0011\u0010U\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010 \u00a8\u0006`"}, d2 = {"Lcom/example/android/newsbit/ui/fragments/CategoryNewsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "category", "getCategory", "setCategory", "(Ljava/lang/String;)V", "categoryArgs", "Lcom/example/android/newsbit/ui/fragments/CategoryNewsFragmentArgs;", "getCategoryArgs", "()Lcom/example/android/newsbit/ui/fragments/CategoryNewsFragmentArgs;", "categoryArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "categoryNewsAdapter", "Lcom/example/android/newsbit/adapters/NewsAdapter;", "getCategoryNewsAdapter", "()Lcom/example/android/newsbit/adapters/NewsAdapter;", "setCategoryNewsAdapter", "(Lcom/example/android/newsbit/adapters/NewsAdapter;)V", "categoryNewsItemView", "Landroidx/recyclerview/widget/RecyclerView;", "getCategoryNewsItemView", "()Landroidx/recyclerview/widget/RecyclerView;", "setCategoryNewsItemView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "categoryNewsPageTemp", "", "getCategoryNewsPageTemp", "()I", "setCategoryNewsPageTemp", "(I)V", "categoryNewsScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getCategoryNewsScrollListener", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "customCategoryNewsPageTemp", "getCustomCategoryNewsPageTemp", "setCustomCategoryNewsPageTemp", "date", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getDate", "()Ljava/util/Calendar;", "day", "getDay", "from", "getFrom", "setFrom", "isCustomCategory", "", "()Z", "setCustomCategory", "(Z)V", "isLoading", "setLoading", "isScrolling", "setScrolling", "month", "getMonth", "paginationProgressBarView", "Landroid/widget/ProgressBar;", "getPaginationProgressBarView", "()Landroid/widget/ProgressBar;", "setPaginationProgressBarView", "(Landroid/widget/ProgressBar;)V", "previous", "", "getPrevious", "()Lkotlin/Unit;", "setPrevious", "(Lkotlin/Unit;)V", "Lkotlin/Unit;", "totalResults", "getTotalResults", "setTotalResults", "viewModel", "Lcom/example/android/newsbit/ui/NewsViewModel;", "getViewModel", "()Lcom/example/android/newsbit/ui/NewsViewModel;", "setViewModel", "(Lcom/example/android/newsbit/ui/NewsViewModel;)V", "year", "getYear", "hideProgressBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "setupRecyclerView", "showProgressBar", "app_debug"})
public final class CategoryNewsFragment extends androidx.fragment.app.Fragment {
    public com.example.android.newsbit.ui.NewsViewModel viewModel;
    public com.example.android.newsbit.adapters.NewsAdapter categoryNewsAdapter;
    public androidx.recyclerview.widget.RecyclerView categoryNewsItemView;
    public android.widget.ProgressBar paginationProgressBarView;
    private int totalResults = 0;
    private boolean isLoading = false;
    private boolean isScrolling = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy categoryArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String category = "";
    private boolean isCustomCategory = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "CategoryNewsFragment";
    private int categoryNewsPageTemp = 1;
    private int customCategoryNewsPageTemp = 1;
    private final java.util.Calendar date = null;
    @org.jetbrains.annotations.NotNull()
    private kotlin.Unit previous;
    private final int year = 0;
    private final int month = 0;
    private final int day = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String from;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener categoryNewsScrollListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.newsbit.ui.NewsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.newsbit.ui.NewsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.newsbit.adapters.NewsAdapter getCategoryNewsAdapter() {
        return null;
    }
    
    public final void setCategoryNewsAdapter(@org.jetbrains.annotations.NotNull()
    com.example.android.newsbit.adapters.NewsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getCategoryNewsItemView() {
        return null;
    }
    
    public final void setCategoryNewsItemView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getPaginationProgressBarView() {
        return null;
    }
    
    public final void setPaginationProgressBarView(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public final void setTotalResults(int p0) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    public final boolean isScrolling() {
        return false;
    }
    
    public final void setScrolling(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.newsbit.ui.fragments.CategoryNewsFragmentArgs getCategoryArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isCustomCategory() {
        return false;
    }
    
    public final void setCustomCategory(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final int getCategoryNewsPageTemp() {
        return 0;
    }
    
    public final void setCategoryNewsPageTemp(int p0) {
    }
    
    public final int getCustomCategoryNewsPageTemp() {
        return 0;
    }
    
    public final void setCustomCategoryNewsPageTemp(int p0) {
    }
    
    public final java.util.Calendar getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Unit getPrevious() {
        return null;
    }
    
    public final void setPrevious(@org.jetbrains.annotations.NotNull()
    kotlin.Unit p0) {
    }
    
    public final int getYear() {
        return 0;
    }
    
    public final int getMonth() {
        return 0;
    }
    
    public final int getDay() {
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
    
    private final void hideProgressBar() {
    }
    
    private final void showProgressBar() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.OnScrollListener getCategoryNewsScrollListener() {
        return null;
    }
    
    private final void setupRecyclerView() {
    }
    
    public CategoryNewsFragment() {
        super();
    }
}