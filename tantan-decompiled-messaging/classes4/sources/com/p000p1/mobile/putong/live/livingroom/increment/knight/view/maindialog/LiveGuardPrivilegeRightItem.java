package com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.hxs;
import l.kvc0;
import l.t100;
import p002l.mpw;
import p002l.srs;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardPrivilegeRightItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeRightItem f6539d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6540e;

    /* JADX INFO: renamed from: f */
    public VText f6541f;

    /* JADX INFO: renamed from: g */
    public VText f6542g;

    public LiveGuardPrivilegeRightItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8282h0(View view) {
        srs.m22634a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m8283i0(mpw.C0682b c0682b) {
        hxs.u("context_livingAct", this.f6540e, c0682b.f15553a, t100.d(44.0f), t100.d(44.0f));
        this.f6542g.setText(c0682b.f15555c);
        this.f6542g.setTextColor(Color.parseColor(c0682b.f15554b));
        if (c0682b.f15556d > 0) {
            this.f6541f.setBackground(kvc0.c("#ff3938", 4));
            VText vText = this.f6541f;
            int i = c0682b.f15556d;
            vText.setText(i > 99 ? "99+" : String.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8282h0(this);
    }

    public LiveGuardPrivilegeRightItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardPrivilegeRightItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
