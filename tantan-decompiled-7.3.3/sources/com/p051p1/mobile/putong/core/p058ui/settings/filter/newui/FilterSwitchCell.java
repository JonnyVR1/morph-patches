package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.VListCell;
import p151v.VSwitchButton;
import p153l.odc0;

/* JADX INFO: loaded from: classes12.dex */
public class FilterSwitchCell extends VListCell {

    /* JADX INFO: renamed from: i */
    public VSwitchButton f36917i;

    public FilterSwitchCell(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public void m56553d(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (NullChecker.m82486a(this.f36917i)) {
            this.f36917i.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    public VSwitchButton getSwitchButton() {
        return this.f36917i;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        VSwitchButton vSwitchButton = (VSwitchButton) findViewById(odc0.f146881t);
        this.f36917i = vSwitchButton;
        vSwitchButton.setEnabled(false);
    }

    public FilterSwitchCell(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilterSwitchCell(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
