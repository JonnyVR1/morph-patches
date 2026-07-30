package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import p153l.cvb;

/* JADX INFO: loaded from: classes7.dex */
abstract class PickerFragment<S> extends Fragment {
    protected final LinkedHashSet<OnSelectionChangedListener<S>> onSelectionChangedListeners = new LinkedHashSet<>();

    public boolean addOnSelectionChangedListener(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.onSelectionChangedListeners.add(onSelectionChangedListener);
    }

    public void clearOnSelectionChangedListeners() {
        this.onSelectionChangedListeners.clear();
    }

    public abstract DateSelector<S> getDateSelector();

    @NotNull
    public /* bridge */ /* synthetic */ cvb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public boolean removeOnSelectionChangedListener(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.onSelectionChangedListeners.remove(onSelectionChangedListener);
    }
}
