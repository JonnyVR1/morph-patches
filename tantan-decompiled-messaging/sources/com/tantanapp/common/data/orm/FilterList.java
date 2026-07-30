package com.tantanapp.common.data.orm;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class FilterList<T> {
    private final ArrayList<Filter<T>> filterArrayList = new ArrayList<>();

    private FilterList() {
    }

    @SafeVarargs
    public static <R> FilterList<R> list(Filter<R>... filterArr) {
        FilterList<R> filterList = new FilterList<>();
        filterList.addAll(filterArr);
        return filterList;
    }

    public void add(Filter<T> filter) {
        this.filterArrayList.add(filter);
    }

    public void addAll(Filter<T>... filterArr) {
        this.filterArrayList.addAll(Arrays.asList(filterArr));
    }

    public ArrayList<Filter<T>> getList() {
        return this.filterArrayList;
    }

    public Filter<T>[] toFilters() {
        return (Filter[]) this.filterArrayList.toArray(new Filter[0]);
    }

    public static <R> FilterList<R> list() {
        return new FilterList<>();
    }
}
