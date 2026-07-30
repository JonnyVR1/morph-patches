package com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.HashMap;
import p151v.VImage;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;
import p153l.bce;
import p153l.bnl0;
import p153l.f3e;
import p153l.jyb;
import p153l.pbe;
import p153l.qbe;
import p153l.wbe;
import p153l.wo0;
import p153l.x20;
import p153l.xau;
import p153l.xbe;
import p153l.y20;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class DrawGiftContainer extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public wbe f50392A;

    /* JADX INFO: renamed from: B */
    public xbe f50393B;

    /* JADX INFO: renamed from: C */
    public z20<BLiveGiftItem, BLiveGiftExtraDrawInfo> f50394C;

    /* JADX INFO: renamed from: D */
    public HashMap<bce, y20<Integer>> f50395D;

    /* JADX INFO: renamed from: d */
    public View f50396d;

    /* JADX INFO: renamed from: e */
    public View f50397e;

    /* JADX INFO: renamed from: f */
    public VText f50398f;

    /* JADX INFO: renamed from: g */
    public VImage f50399g;

    /* JADX INFO: renamed from: h */
    public VImage f50400h;

    /* JADX INFO: renamed from: i */
    public VImage f50401i;

    /* JADX INFO: renamed from: j */
    public VImage f50402j;

    /* JADX INFO: renamed from: k */
    public VImage f50403k;

    /* JADX INFO: renamed from: l */
    public VImage f50404l;

    /* JADX INFO: renamed from: m */
    public VImage f50405m;

    /* JADX INFO: renamed from: n */
    public DrawPanelView f50406n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f50407o;

    /* JADX INFO: renamed from: p */
    public VText f50408p;

    /* JADX INFO: renamed from: q */
    public View f50409q;

    /* JADX INFO: renamed from: r */
    public View f50410r;

    /* JADX INFO: renamed from: s */
    public Space f50411s;

    /* JADX INFO: renamed from: t */
    public Space f50412t;

    /* JADX INFO: renamed from: u */
    public VText f50413u;

    /* JADX INFO: renamed from: v */
    public VPager f50414v;

    /* JADX INFO: renamed from: w */
    public VPagerCircleIndicator f50415w;

    /* JADX INFO: renamed from: x */
    public VText f50416x;

    /* JADX INFO: renamed from: y */
    public VText f50417y;

    /* JADX INFO: renamed from: z */
    public BLiveGiftItem f50418z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer$a */
    public class C12957a extends wo0 {
        public C12957a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: c */
        public void mo74703c() {
            super.mo74703c();
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
        }
    }

    public DrawGiftContainer(Context context) {
        super(context);
        this.f50395D = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m74678D0(View view) {
        this.f50406n.m74715l(BLiveGiftExtraDrawInfo.getFirstTemple());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m74679E0(View view) {
        this.f50406n.m74715l(BLiveGiftExtraDrawInfo.getSecondTemple());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m74680G0(View view) {
        this.f50406n.m74715l(BLiveGiftExtraDrawInfo.getThirdTemple());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m74694v0(View view) {
        this.f50406n.m74712i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m74695w0(View view) {
        boolean zM74720q = this.f50406n.m74720q();
        DrawPanelView drawPanelView = this.f50406n;
        if (zM74720q) {
            drawPanelView.m74712i();
        } else {
            drawPanelView.m74728y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m74696y0(View view) {
        this.f50406n.m74715l(BLiveGiftExtraDrawInfo.getForthTemple());
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m74697B0(x20 x20Var, View view) {
        this.f50406n.m74712i();
        x20Var.call();
    }

    /* JADX INFO: renamed from: H0 */
    public void m74698H0(qbe qbeVar) {
        jyb.m147537z(this.f50393B.f193152a, new y20() { // from class: l.cbe
            @Override // p153l.y20
            public final void call(Object obj) {
                jyb.m147537z(((bce) obj).f76134b, new y20() { // from class: l.gbe
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        ((qbe) obj2).f156469b = false;
                    }
                });
            }
        });
        qbeVar.f156469b = true;
        qbeVar.f156471d = 0;
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: I0 */
    public void m74699I0(xbe xbeVar, z20<BLiveGiftItem, BLiveGiftExtraDrawInfo> z20Var, final x20 x20Var, final x20 x20Var2, final x20 x20Var3) {
        this.f50394C = z20Var;
        this.f50393B = xbeVar;
        setGiftItem(xbeVar.f193153b.m145122h());
        wbe wbeVar = new wbe(this);
        this.f50392A = wbeVar;
        wbeVar.m205715t(xbeVar);
        this.f50414v.setAdapter(this.f50392A);
        this.f50405m.setOnClickListener(new View.OnClickListener() { // from class: l.hbe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108585a.m74694v0(view);
            }
        });
        this.f50413u.setText(String.format(getContext().getString(R$string.f47882W4), String.valueOf(zrv.m221193k().m203626g4())));
        this.f50413u.setTextColor(-1);
        this.f50404l.setOnClickListener(new View.OnClickListener() { // from class: l.ibe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114204a.m74695w0(view);
            }
        });
        this.f50406n.setNumberChageListener(new y20() { // from class: l.jbe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119862a.m74702z0((Integer) obj);
            }
        });
        this.f50403k.setOnClickListener(new View.OnClickListener() { // from class: l.kbe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124933a.m74697B0(x20Var3, view);
            }
        });
        this.f50416x.setOnClickListener(new View.OnClickListener() { // from class: l.lbe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        this.f50417y.setOnClickListener(new View.OnClickListener() { // from class: l.mbe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var2.call();
            }
        });
        this.f50407o.m69682i("https://auto.tancdn.com/v1/raw/800579c8-8a99-4f49-bd19-244e32b4fa2511.pdf", -1, new C12957a(), true);
        this.f50399g.setOnClickListener(new View.OnClickListener() { // from class: l.nbe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141222a.m74678D0(view);
            }
        });
        this.f50400h.setOnClickListener(new View.OnClickListener() { // from class: l.obe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146578a.m74679E0(view);
            }
        });
        this.f50401i.setOnClickListener(new View.OnClickListener() { // from class: l.dbe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87660a.m74680G0(view);
            }
        });
        this.f50402j.setOnClickListener(new View.OnClickListener() { // from class: l.ebe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92920a.m74696y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public void m74700J0() {
        z20<BLiveGiftItem, BLiveGiftExtraDrawInfo> z20Var;
        if (this.f50406n.m74720q() || (z20Var = this.f50394C) == null) {
            return;
        }
        z20Var.call(this.f50418z, this.f50406n.getDrawParam());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50407o.m69688o();
        this.f50406n.m74711h();
        this.f50395D.clear();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74701u0(this);
    }

    public void setGiftItem(BLiveGiftItem bLiveGiftItem) {
        this.f50406n.setGiftUrl(bLiveGiftItem.url);
        this.f50418z = bLiveGiftItem;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m74701u0(View view) {
        pbe.m171509a(this, view);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m74702z0(final Integer num) {
        jyb.m147537z(this.f50395D.values(), new y20() { // from class: l.fbe
            @Override // p153l.y20
            public final void call(Object obj) {
                ((y20) obj).call(num);
            }
        });
        int iIntValue = num.intValue();
        VImage vImage = this.f50405m;
        if (iIntValue < 1) {
            bnl0.m105525M0(vImage, false);
            bnl0.m105525M0(this.f50404l, false);
            bnl0.m105525M0(this.f50407o, true);
            bnl0.m105525M0(this.f50408p, true);
        } else {
            bnl0.m105525M0(vImage, true);
            bnl0.m105525M0(this.f50404l, true);
            bnl0.m105525M0(this.f50407o, false);
            bnl0.m105525M0(this.f50408p, false);
        }
        if (num.intValue() < zrv.m221193k().m203626g4()) {
            this.f50413u.setText(String.format(getContext().getString(R$string.f47882W4), String.valueOf(zrv.m221193k().m203626g4())));
            this.f50413u.setTextColor(-1);
            return;
        }
        String strValueOf = String.valueOf(f3e.m123725d(this.f50418z, num.intValue()));
        String strM209911u = xau.m209911u(R$string.f47945Z4, strValueOf);
        SpannableString spannableString = new SpannableString(strM209911u);
        int iIndexOf = strM209911u.indexOf(strValueOf);
        int length = strValueOf.length() + iIndexOf;
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffffff")), 0, iIndexOf, 17);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff8817")), iIndexOf, length, 17);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffffff")), length, strM209911u.length(), 17);
        this.f50413u.setText(spannableString);
    }

    public DrawGiftContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50395D = new HashMap<>();
    }

    public DrawGiftContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50395D = new HashMap<>();
    }
}
