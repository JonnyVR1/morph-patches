package com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.HashMap;
import l.ap0;
import l.d30;
import l.e30;
import l.f30;
import l.vwb;
import l.w8u;
import l.xdl0;
import l.ypv;
import p002l.lae;
import p002l.mae;
import p002l.r1e;
import p002l.sae;
import p002l.tae;
import p002l.xae;
import v.VImage;
import v.VPager;
import v.VPagerCircleIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DrawGiftContainer extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public sae f5586A;

    /* JADX INFO: renamed from: B */
    public tae f5587B;

    /* JADX INFO: renamed from: C */
    public f30<BLiveGiftItem, BLiveGiftExtraDrawInfo> f5588C;

    /* JADX INFO: renamed from: D */
    public HashMap<xae, e30<Integer>> f5589D;

    /* JADX INFO: renamed from: d */
    public View f5590d;

    /* JADX INFO: renamed from: e */
    public View f5591e;

    /* JADX INFO: renamed from: f */
    public VText f5592f;

    /* JADX INFO: renamed from: g */
    public VImage f5593g;

    /* JADX INFO: renamed from: h */
    public VImage f5594h;

    /* JADX INFO: renamed from: i */
    public VImage f5595i;

    /* JADX INFO: renamed from: j */
    public VImage f5596j;

    /* JADX INFO: renamed from: k */
    public VImage f5597k;

    /* JADX INFO: renamed from: l */
    public VImage f5598l;

    /* JADX INFO: renamed from: m */
    public VImage f5599m;

    /* JADX INFO: renamed from: n */
    public DrawPanelView f5600n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f5601o;

    /* JADX INFO: renamed from: p */
    public VText f5602p;

    /* JADX INFO: renamed from: q */
    public View f5603q;

    /* JADX INFO: renamed from: r */
    public View f5604r;

    /* JADX INFO: renamed from: s */
    public Space f5605s;

    /* JADX INFO: renamed from: t */
    public Space f5606t;

    /* JADX INFO: renamed from: u */
    public VText f5607u;

    /* JADX INFO: renamed from: v */
    public VPager f5608v;

    /* JADX INFO: renamed from: w */
    public VPagerCircleIndicator f5609w;

    /* JADX INFO: renamed from: x */
    public VText f5610x;

    /* JADX INFO: renamed from: y */
    public VText f5611y;

    /* JADX INFO: renamed from: z */
    public BLiveGiftItem f5612z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer$a */
    public class C0383a extends ap0 {
        public C0383a() {
        }

        /* JADX INFO: renamed from: b */
        public void m7062b() {
            super.b();
        }

        /* JADX INFO: renamed from: c */
        public void m7063c() {
            super.c();
        }

        /* JADX INFO: renamed from: g */
        public void m7064g() {
            super.g();
        }
    }

    public DrawGiftContainer(Context context) {
        super(context);
        this.f5589D = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m7037D0(View view) {
        this.f5600n.m7076l(BLiveGiftExtraDrawInfo.getFirstTemple());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m7038E0(View view) {
        this.f5600n.m7076l(BLiveGiftExtraDrawInfo.getSecondTemple());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m7039G0(View view) {
        this.f5600n.m7076l(BLiveGiftExtraDrawInfo.getThirdTemple());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m7053v0(View view) {
        this.f5600n.m7073i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m7054w0(View view) {
        boolean zM7081q = this.f5600n.m7081q();
        DrawPanelView drawPanelView = this.f5600n;
        if (zM7081q) {
            drawPanelView.m7073i();
        } else {
            drawPanelView.m7089y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m7055y0(View view) {
        this.f5600n.m7076l(BLiveGiftExtraDrawInfo.getForthTemple());
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m7056B0(d30 d30Var, View view) {
        this.f5600n.m7073i();
        d30Var.call();
    }

    /* JADX INFO: renamed from: H0 */
    public void m7057H0(mae maeVar) {
        vwb.z(this.f5587B.f20146a, new e30() { // from class: l.y9e
            public final void call(Object obj) {
                vwb.z(((xae) obj).f22195b, new e30() { // from class: l.cae
                    public final void call(Object obj2) {
                        ((mae) obj2).f15295b = false;
                    }
                });
            }
        });
        maeVar.f15295b = true;
        maeVar.f15297d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: I0 */
    public void m7058I0(tae taeVar, f30<BLiveGiftItem, BLiveGiftExtraDrawInfo> f30Var, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        this.f5588C = f30Var;
        this.f5587B = taeVar;
        setGiftItem(taeVar.f20147b.m15160h());
        sae saeVar = new sae(this);
        this.f5586A = saeVar;
        saeVar.m22322t(taeVar);
        this.f5608v.setAdapter(this.f5586A);
        this.f5599m.setOnClickListener(new View.OnClickListener() { // from class: l.dae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9136a.m7053v0(view);
            }
        });
        this.f5607u.setText(String.format(getContext().getString(R$string.f3076W4), String.valueOf(ypv.k().g4())));
        this.f5607u.setTextColor(-1);
        this.f5598l.setOnClickListener(new View.OnClickListener() { // from class: l.eae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9648a.m7054w0(view);
            }
        });
        this.f5600n.setNumberChageListener(new e30() { // from class: l.fae
            public final void call(Object obj) {
                this.f10204a.m7061z0((Integer) obj);
            }
        });
        this.f5597k.setOnClickListener(new View.OnClickListener() { // from class: l.gae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11317a.m7056B0(d30Var3, view);
            }
        });
        this.f5610x.setOnClickListener(new View.OnClickListener() { // from class: l.hae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        this.f5611y.setOnClickListener(new View.OnClickListener() { // from class: l.iae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        this.f5601o.i("https://auto.tancdn.com/v1/raw/800579c8-8a99-4f49-bd19-244e32b4fa2511.pdf", -1, new C0383a(), true);
        this.f5593g.setOnClickListener(new View.OnClickListener() { // from class: l.jae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13653a.m7037D0(view);
            }
        });
        this.f5594h.setOnClickListener(new View.OnClickListener() { // from class: l.kae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14263a.m7038E0(view);
            }
        });
        this.f5595i.setOnClickListener(new View.OnClickListener() { // from class: l.z9e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23314a.m7039G0(view);
            }
        });
        this.f5596j.setOnClickListener(new View.OnClickListener() { // from class: l.aae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7472a.m7055y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public void m7059J0() {
        f30<BLiveGiftItem, BLiveGiftExtraDrawInfo> f30Var;
        if (this.f5600n.m7081q() || (f30Var = this.f5588C) == null) {
            return;
        }
        f30Var.call(this.f5612z, this.f5600n.getDrawParam());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f5601o.o();
        this.f5600n.m7072h();
        this.f5589D.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7060u0(this);
    }

    public void setGiftItem(BLiveGiftItem bLiveGiftItem) {
        this.f5600n.setGiftUrl(bLiveGiftItem.url);
        this.f5612z = bLiveGiftItem;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m7060u0(View view) {
        lae.m17118a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m7061z0(final Integer num) {
        vwb.z(this.f5589D.values(), new e30() { // from class: l.bae
            public final void call(Object obj) {
                ((e30) obj).call(num);
            }
        });
        int iIntValue = num.intValue();
        VImage vImage = this.f5599m;
        if (iIntValue < 1) {
            xdl0.M0(vImage, false);
            xdl0.M0(this.f5598l, false);
            xdl0.M0(this.f5601o, true);
            xdl0.M0(this.f5602p, true);
        } else {
            xdl0.M0(vImage, true);
            xdl0.M0(this.f5598l, true);
            xdl0.M0(this.f5601o, false);
            xdl0.M0(this.f5602p, false);
        }
        if (num.intValue() < ypv.k().g4()) {
            this.f5607u.setText(String.format(getContext().getString(R$string.f3076W4), String.valueOf(ypv.k().g4())));
            this.f5607u.setTextColor(-1);
            return;
        }
        String strValueOf = String.valueOf(r1e.m21717d(this.f5612z, num.intValue()));
        String strU = w8u.u(R$string.f3139Z4, strValueOf);
        SpannableString spannableString = new SpannableString(strU);
        int iIndexOf = strU.indexOf(strValueOf);
        int length = strValueOf.length() + iIndexOf;
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffffff")), 0, iIndexOf, 17);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff8817")), iIndexOf, length, 17);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffffff")), length, strU.length(), 17);
        this.f5607u.setText(spannableString);
    }

    public DrawGiftContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5589D = new HashMap<>();
    }

    public DrawGiftContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5589D = new HashMap<>();
    }
}
