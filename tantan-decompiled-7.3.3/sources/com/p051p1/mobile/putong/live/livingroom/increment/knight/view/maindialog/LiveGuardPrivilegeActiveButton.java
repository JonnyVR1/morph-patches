package com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p151v.VLinear;
import p153l.ats;
import p153l.bnl0;
import p153l.l51;
import p153l.lsw;
import p153l.pts;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeActiveButton extends VLinear {

    /* JADX INFO: renamed from: c */
    public LiveGuardPrivilegeActiveButton f51329c;

    /* JADX INFO: renamed from: d */
    public VLinear f51330d;

    /* JADX INFO: renamed from: e */
    public TextView f51331e;

    /* JADX INFO: renamed from: f */
    public LiveTextRollView f51332f;

    /* JADX INFO: renamed from: g */
    public Runnable f51333g;

    /* JADX INFO: renamed from: h */
    public Runnable f51334h;

    /* JADX INFO: renamed from: i */
    public HorizontalMarqueeView f51335i;

    /* JADX INFO: renamed from: j */
    public final int f51336j;

    /* JADX INFO: renamed from: k */
    public final int f51337k;

    public LiveGuardPrivilegeActiveButton(Context context) {
        super(context);
        this.f51336j = 2000;
        this.f51337k = 400;
    }

    /* JADX INFO: renamed from: T */
    public final void m75859T(View view) {
        pts.m173780a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m75860V() {
        l51.m152888H(getContext(), this.f51333g, 2000L);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m75861W(lsw.C18451a c18451a) {
        this.f51332f.setNextAnim(400L);
        this.f51332f.m77898G(c18451a.f133498s, new Runnable() { // from class: l.ots
            @Override // java.lang.Runnable
            public final void run() {
                this.f149005a.m75860V();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m75862X() {
        this.f51332f.m77899H(400);
    }

    /* JADX INFO: renamed from: Y */
    public void m75863Y(final ats atsVar, final lsw.C18451a c18451a) {
        bnl0.m105509E0(this.f51329c, new View.OnClickListener() { // from class: l.lts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ats atsVar2 = atsVar;
                lsw.C18451a c18451a2 = c18451a;
                atsVar2.m100253I(c18451a2.f133480a, c18451a2.f133500u);
            }
        });
        this.f51329c.setBackgroundResource(c18451a.f133488i);
        this.f51330d.setBackgroundResource(c18451a.f133487h);
        this.f51331e.setText(c18451a.f133499t);
    }

    /* JADX INFO: renamed from: Z */
    public void m75864Z(String str, lsw.C18451a c18451a) {
        if (this.f51335i == null) {
            this.f51335i = (HorizontalMarqueeView) this.f51332f.getCurrentView();
            this.f51332f.m77896E(17, true);
            m75866b0(c18451a);
        }
        this.f51335i.setMarqueeText(str);
    }

    /* JADX INFO: renamed from: a0 */
    public void m75865a0() {
        l51.m152890J(this.f51334h);
        l51.m152890J(this.f51333g);
        this.f51332f.reset();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m75866b0(final lsw.C18451a c18451a) {
        if (TextUtils.isEmpty(c18451a.f133498s) || !zrv.m221193k().m203689nb()) {
            return;
        }
        this.f51332f.m77894C(c18451a.f133498s, false);
        this.f51334h = new Runnable() { // from class: l.mts
            @Override // java.lang.Runnable
            public final void run() {
                this.f138664a.m75861W(c18451a);
            }
        };
        this.f51333g = new Runnable() { // from class: l.nts
            @Override // java.lang.Runnable
            public final void run() {
                this.f143632a.m75862X();
            }
        };
        l51.m152888H(getContext(), this.f51334h, 2000L);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75859T(this);
    }

    public LiveGuardPrivilegeActiveButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51336j = 2000;
        this.f51337k = 400;
    }

    public LiveGuardPrivilegeActiveButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51336j = 2000;
        this.f51337k = 400;
    }
}
