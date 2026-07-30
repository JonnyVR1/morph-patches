package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p147v.VListCell;
import p147v.VSwitchButton;
import p149l.i5c0;

/* JADX INFO: loaded from: classes9.dex */
public class FilterSwitchCell extends VListCell {

    /* JADX INFO: renamed from: i */
    public VSwitchButton f36069i;

    public FilterSwitchCell(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public void m55370d(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (NullChecker.m81303a(this.f36069i)) {
            this.f36069i.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    public VSwitchButton getSwitchButton() {
        return this.f36069i;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        VSwitchButton vSwitchButton = (VSwitchButton) findViewById(i5c0.f111559t);
        this.f36069i = vSwitchButton;
        vSwitchButton.setEnabled(false);
    }

    public FilterSwitchCell(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilterSwitchCell(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
