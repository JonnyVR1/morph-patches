package com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p147v.VLinear;
import p149l.e51;
import p149l.mpw;
import p149l.ors;
import p149l.xdl0;
import p149l.ypv;
import p149l.zqs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeActiveButton extends VLinear {

    /* JADX INFO: renamed from: c */
    public LiveGuardPrivilegeActiveButton f50481c;

    /* JADX INFO: renamed from: d */
    public VLinear f50482d;

    /* JADX INFO: renamed from: e */
    public TextView f50483e;

    /* JADX INFO: renamed from: f */
    public LiveTextRollView f50484f;

    /* JADX INFO: renamed from: g */
    public Runnable f50485g;

    /* JADX INFO: renamed from: h */
    public Runnable f50486h;

    /* JADX INFO: renamed from: i */
    public HorizontalMarqueeView f50487i;

    /* JADX INFO: renamed from: j */
    public final int f50488j;

    /* JADX INFO: renamed from: k */
    public final int f50489k;

    public LiveGuardPrivilegeActiveButton(Context context) {
        super(context);
        this.f50488j = 2000;
        this.f50489k = 400;
    }

    /* JADX INFO: renamed from: T */
    public final void m74676T(View view) {
        ors.m165678a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m74677V() {
        e51.m114743H(getContext(), this.f50485g, 2000L);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m74678W(mpw.C18528a c18528a) {
        this.f50484f.setNextAnim(400L);
        this.f50484f.m76715G(c18528a.f135122s, new Runnable() { // from class: l.nrs
            @Override // java.lang.Runnable
            public final void run() {
                this.f140218a.m74677V();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m74679X() {
        this.f50484f.m76716H(400);
    }

    /* JADX INFO: renamed from: Y */
    public void m74680Y(final zqs zqsVar, final mpw.C18528a c18528a) {
        xdl0.m208329E0(this.f50481c, new View.OnClickListener() { // from class: l.krs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqs zqsVar2 = zqsVar;
                mpw.C18528a c18528a2 = c18528a;
                zqsVar2.m219887I(c18528a2.f135104a, c18528a2.f135124u);
            }
        });
        this.f50481c.setBackgroundResource(c18528a.f135112i);
        this.f50482d.setBackgroundResource(c18528a.f135111h);
        this.f50483e.setText(c18528a.f135123t);
    }

    /* JADX INFO: renamed from: Z */
    public void m74681Z(String str, mpw.C18528a c18528a) {
        if (this.f50487i == null) {
            this.f50487i = (HorizontalMarqueeView) this.f50484f.getCurrentView();
            this.f50484f.m76713E(17, true);
            m74683b0(c18528a);
        }
        this.f50487i.setMarqueeText(str);
    }

    /* JADX INFO: renamed from: a0 */
    public void m74682a0() {
        e51.m114745J(this.f50486h);
        e51.m114745J(this.f50485g);
        this.f50484f.reset();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m74683b0(final mpw.C18528a c18528a) {
        if (TextUtils.isEmpty(c18528a.f135122s) || !ypv.m215672k().m195902nb()) {
            return;
        }
        this.f50484f.m76711C(c18528a.f135122s, false);
        this.f50486h = new Runnable() { // from class: l.lrs
            @Override // java.lang.Runnable
            public final void run() {
                this.f129750a.m74678W(c18528a);
            }
        };
        this.f50485g = new Runnable() { // from class: l.mrs
            @Override // java.lang.Runnable
            public final void run() {
                this.f135408a.m74679X();
            }
        };
        e51.m114743H(getContext(), this.f50486h, 2000L);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74676T(this);
    }

    public LiveGuardPrivilegeActiveButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50488j = 2000;
        this.f50489k = 400;
    }

    public LiveGuardPrivilegeActiveButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50488j = 2000;
        this.f50489k = 400;
    }
}
