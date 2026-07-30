package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.izs;
import p153l.jad0;
import p153l.lad0;
import p153l.nbc0;

/* JADX INFO: loaded from: classes9.dex */
public class RightEquipAnchorItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public RightEquipAnchorItemView f46902d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46903e;

    /* JADX INFO: renamed from: f */
    public VText f46904f;

    /* JADX INFO: renamed from: g */
    public VImage f46905g;

    /* JADX INFO: renamed from: h */
    public jad0 f46906h;

    public RightEquipAnchorItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71774i0(View view) {
        lad0.m153471a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m71775j0(jad0 jad0Var, View view) {
        jad0Var.f118976b = !jad0Var.f118976b;
        m71777l0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m71776k0(final jad0 jad0Var) {
        this.f46906h = jad0Var;
        izs.m142868s("context_right_act", this.f46903e, jad0Var.f118975a.avatar);
        this.f46904f.setText(jad0Var.f118975a.name);
        m71777l0();
        setOnClickListener(new View.OnClickListener() { // from class: l.kad0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124651a.m71775j0(jad0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final void m71777l0() {
        VImage vImage = this.f46905g;
        if (vImage != null) {
            vImage.setImageResource(this.f46906h.f118976b ? nbc0.f141151d : nbc0.f141148c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71774i0(this);
    }

    public RightEquipAnchorItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightEquipAnchorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
