package com.example.android.newsbit.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010V\u001a\u00020&H\u0002J\u0014\u0010W\u001a\u00020&2\n\b\u0001\u0010X\u001a\u0004\u0018\u00010YH\u0016J*\u0010Z\u001a\u0004\u0018\u00010[2\u0006\u0010\\\u001a\u00020]2\n\b\u0001\u0010^\u001a\u0004\u0018\u00010_2\n\b\u0001\u0010X\u001a\u0004\u0018\u00010YH\u0017J\u001a\u0010`\u001a\u00020&2\u0006\u0010a\u001a\u00020[2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u0010\u0010b\u001a\u00020&2\u0006\u00108\u001a\u00020\rH\u0002J\b\u0010c\u001a\u00020&H\u0002J\b\u0010d\u001a\u00020&H\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020-X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R\u001a\u0010;\u001a\u00020<X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010DR\u001b\u0010E\u001a\u00020F8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bG\u0010HR\u001a\u0010K\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u000b\"\u0004\bM\u0010DR\u001a\u0010N\u001a\u00020OX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0011\u0010T\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010\u000b\u00a8\u0006e"}, d2 = {"Lcom/example/android/newsbit/ui/fragments/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "date", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getDate", "()Ljava/util/Calendar;", "day", "", "getDay", "()I", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "isLoading", "", "()Z", "setLoading", "(Z)V", "isScrolling", "setScrolling", "month", "getMonth", "newsScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getNewsScrollListener", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "paginationProgressBarView", "Landroid/widget/ProgressBar;", "getPaginationProgressBarView", "()Landroid/widget/ProgressBar;", "setPaginationProgressBarView", "(Landroid/widget/ProgressBar;)V", "previous", "", "getPrevious", "()Lkotlin/Unit;", "setPrevious", "(Lkotlin/Unit;)V", "Lkotlin/Unit;", "search", "Landroid/widget/SearchView;", "getSearch", "()Landroid/widget/SearchView;", "setSearch", "(Landroid/widget/SearchView;)V", "searchItemView", "Landroidx/recyclerview/widget/RecyclerView;", "getSearchItemView", "()Landroidx/recyclerview/widget/RecyclerView;", "setSearchItemView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "searchKeyword", "getSearchKeyword", "setSearchKeyword", "searchNewsAdapter", "Lcom/example/android/newsbit/adapters/NewsAdapter;", "getSearchNewsAdapter", "()Lcom/example/android/newsbit/adapters/NewsAdapter;", "setSearchNewsAdapter", "(Lcom/example/android/newsbit/adapters/NewsAdapter;)V", "searchNewsPageTemp", "getSearchNewsPageTemp", "setSearchNewsPageTemp", "(I)V", "searchedArgs", "Lcom/example/android/newsbit/ui/fragments/SearchFragmentArgs;", "getSearchedArgs", "()Lcom/example/android/newsbit/ui/fragments/SearchFragmentArgs;", "searchedArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "totalResults", "getTotalResults", "setTotalResults", "viewModel", "Lcom/example/android/newsbit/ui/NewsViewModel;", "getViewModel", "()Lcom/example/android/newsbit/ui/NewsViewModel;", "setViewModel", "(Lcom/example/android/newsbit/ui/NewsViewModel;)V", "year", "getYear", "hideProgressBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "searchNewsByKeyword", "searchNewsRecyclerView", "showProgressBar", "app_debug"})
public final class SearchFragment extends androidx.fragment.app.Fragment {
    public com.example.android.newsbit.ui.NewsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchKeyword = "";
    public com.example.android.newsbit.adapters.NewsAdapter searchNewsAdapter;
    public androidx.recyclerview.widget.RecyclerView searchItemView;
    public android.widget.ProgressBar paginationProgressBarView;
    private int searchNewsPageTemp = 1;
    private int totalResults = 0;
    private boolean isLoading = false;
    private boolean isScrolling = false;
    private final java.util.Calendar date = null;
    @org.jetbrains.annotations.NotNull()
    private kotlin.Unit previous;
    private final int year = 0;
    private final int month = 0;
    private final int day = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String from;
    public android.widget.SearchView search;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy searchedArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener newsScrollListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.newsbit.ui.NewsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.newsbit.ui.NewsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchKeyword() {
        return null;
    }
    
    public final void setSearchKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.newsbit.adapters.NewsAdapter getSearchNewsAdapter() {
        return null;
    }
    
    public final void setSearchNewsAdapter(@org.jetbrains.annotations.NotNull()
    com.example.android.newsbit.adapters.NewsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getSearchItemView() {
        return null;
    }
    
    public final void setSearchItemView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getPaginationProgressBarView() {
        return null;
    }
    
    public final void setPaginationProgressBarView(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    public final int getSearchNewsPageTemp() {
        return 0;
    }
    
    public final void setSearchNewsPageTemp(int p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.SearchView getSearch() {
        return null;
    }
    
    public final void setSearch(@org.jetbrains.annotations.NotNull()
    android.widget.SearchView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.newsbit.ui.fragments.SearchFragmentArgs getSearchedArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void searchNewsByKeyword(java.lang.String searchKeyword) {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showProgressBar() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.OnScrollListener getNewsScrollListener() {
        return null;
    }
    
    private final void searchNewsRecyclerView() {
    }
    
    public SearchFragment() {
        super();
    }
}