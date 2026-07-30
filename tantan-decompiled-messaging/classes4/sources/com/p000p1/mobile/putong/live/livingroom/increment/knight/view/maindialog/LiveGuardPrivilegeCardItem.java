package com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.xdl0;
import p002l.i3c0;
import p002l.mpw;
import p002l.qrs;
import p002l.zqs;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardPrivilegeCardItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeCardItem f6532d;

    /* JADX INFO: renamed from: e */
    public View f6533e;

    /* JADX INFO: renamed from: f */
    public View f6534f;

    /* JADX INFO: renamed from: g */
    public VText f6535g;

    /* JADX INFO: renamed from: h */
    public VText f6536h;

    /* JADX INFO: renamed from: i */
    public VText f6537i;

    /* JADX INFO: renamed from: j */
    public View f6538j;

    public LiveGuardPrivilegeCardItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8279i0(View view) {
        qrs.m21539a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m8280j0(final zqs zqsVar, mpw.C0681a c0681a, boolean z) {
        this.f6533e.setBackgroundResource(c0681a.f15543l);
        this.f6534f.setBackgroundResource(c0681a.f15544m);
        this.f6535g.setTextColor(c0681a.f15545n);
        this.f6536h.setTextColor(c0681a.f15546o);
        View view = this.f6538j;
        if (z) {
            xdl0.M(view, true);
            this.f6538j.setBackgroundResource(mpw.C0681a.m18129a(c0681a.f15532a) ? i3c0.f12818i : i3c0.f12830j);
            xdl0.E0(this.f6538j, new View.OnClickListener() { // from class: l.prs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zqsVar.m27519M();
                }
            });
        } else {
            xdl0.M(view, false);
        }
        m8281k0(c0681a);
        this.f6535g.setText(c0681a.f15533b);
        this.f6536h.setText(c0681a.f15535d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final void m8281k0(mpw.C0681a c0681a) {
        boolean zIsEmpty = TextUtils.isEmpty(c0681a.f15534c);
        VText vText = this.f6537i;
        if (zIsEmpty) {
            xdl0.M(vText, false);
            return;
        }
        vText.setText(c0681a.f15534c);
        xdl0.M(this.f6537i, true);
        this.f6537i.setBackground(getResources().getDrawable(c0681a.f15547p));
        this.f6537i.setTextColor(Color.parseColor(c0681a.f15548q));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8279i0(this);
    }

    public LiveGuardPrivilegeCardItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardPrivilegeCardItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
