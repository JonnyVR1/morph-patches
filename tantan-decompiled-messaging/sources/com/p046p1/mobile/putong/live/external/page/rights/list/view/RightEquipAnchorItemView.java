package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.g2d0;
import p149l.h3c0;
import p149l.hxs;
import p149l.i2d0;

/* JADX INFO: loaded from: classes13.dex */
public class RightEquipAnchorItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public RightEquipAnchorItemView f46054d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46055e;

    /* JADX INFO: renamed from: f */
    public VText f46056f;

    /* JADX INFO: renamed from: g */
    public VImage f46057g;

    /* JADX INFO: renamed from: h */
    public g2d0 f46058h;

    public RightEquipAnchorItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70591i0(View view) {
        i2d0.m134050a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m70592j0(g2d0 g2d0Var, View view) {
        g2d0Var.f100258b = !g2d0Var.f100258b;
        m70594l0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m70593k0(final g2d0 g2d0Var) {
        this.f46058h = g2d0Var;
        hxs.m133406s("context_right_act", this.f46055e, g2d0Var.f100257a.avatar);
        this.f46056f.setText(g2d0Var.f100257a.name);
        m70594l0();
        setOnClickListener(new View.OnClickListener() { // from class: l.h2d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105525a.m70592j0(g2d0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final void m70594l0() {
        VImage vImage = this.f46057g;
        if (vImage != null) {
            vImage.setImageResource(this.f46058h.f100258b ? h3c0.f105660d : h3c0.f105657c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70591i0(this);
    }

    public RightEquipAnchorItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightEquipAnchorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
