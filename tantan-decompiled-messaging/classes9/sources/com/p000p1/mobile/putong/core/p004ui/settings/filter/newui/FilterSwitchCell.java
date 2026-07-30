package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.i5c0;
import v.VListCell;
import v.VSwitchButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class FilterSwitchCell extends VListCell {

    /* JADX INFO: renamed from: i */
    public VSwitchButton f5850i;

    public FilterSwitchCell(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public void m8743d(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (NullChecker.a(this.f5850i)) {
            this.f5850i.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    public VSwitchButton getSwitchButton() {
        return this.f5850i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        VSwitchButton vSwitchButtonFindViewById = findViewById(i5c0.t);
        this.f5850i = vSwitchButtonFindViewById;
        vSwitchButtonFindViewById.setEnabled(false);
    }

    public FilterSwitchCell(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilterSwitchCell(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
