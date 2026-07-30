package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VSwitch;
import p147v.VText;
import p149l.g1d0;
import p149l.v4d0;
import p149l.x4d0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class RightSwitchItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public RightSwitchItemView f46120d;

    /* JADX INFO: renamed from: e */
    public VText f46121e;

    /* JADX INFO: renamed from: f */
    public VSwitch f46122f;

    /* JADX INFO: renamed from: g */
    public View f46123g;

    /* JADX INFO: renamed from: h */
    public VText f46124h;

    /* JADX INFO: renamed from: i */
    public v4d0 f46125i;

    public RightSwitchItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70648i0(View view) {
        x4d0.m206968a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m70649j0(final v4d0 v4d0Var, final g1d0 g1d0Var) {
        this.f46125i = v4d0Var;
        this.f46122f.setChecked(v4d0Var.isChecked());
        xdl0.m208329E0(this.f46123g, new View.OnClickListener() { // from class: l.w4d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g1d0Var.mo124072d(v4d0Var);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public void m70650k0() {
        this.f46122f.setChecked(this.f46125i.isChecked());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70648i0(this);
    }

    public RightSwitchItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightSwitchItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
