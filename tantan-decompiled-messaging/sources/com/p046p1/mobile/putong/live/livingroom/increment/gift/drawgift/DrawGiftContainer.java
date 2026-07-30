package com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.HashMap;
import p147v.VImage;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;
import p149l.ap0;
import p149l.d30;
import p149l.e30;
import p149l.f30;
import p149l.lae;
import p149l.mae;
import p149l.r1e;
import p149l.sae;
import p149l.tae;
import p149l.vwb;
import p149l.w8u;
import p149l.xae;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class DrawGiftContainer extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public sae f49544A;

    /* JADX INFO: renamed from: B */
    public tae f49545B;

    /* JADX INFO: renamed from: C */
    public f30<BLiveGiftItem, BLiveGiftExtraDrawInfo> f49546C;

    /* JADX INFO: renamed from: D */
    public HashMap<xae, e30<Integer>> f49547D;

    /* JADX INFO: renamed from: d */
    public View f49548d;

    /* JADX INFO: renamed from: e */
    public View f49549e;

    /* JADX INFO: renamed from: f */
    public VText f49550f;

    /* JADX INFO: renamed from: g */
    public VImage f49551g;

    /* JADX INFO: renamed from: h */
    public VImage f49552h;

    /* JADX INFO: renamed from: i */
    public VImage f49553i;

    /* JADX INFO: renamed from: j */
    public VImage f49554j;

    /* JADX INFO: renamed from: k */
    public VImage f49555k;

    /* JADX INFO: renamed from: l */
    public VImage f49556l;

    /* JADX INFO: renamed from: m */
    public VImage f49557m;

    /* JADX INFO: renamed from: n */
    public DrawPanelView f49558n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f49559o;

    /* JADX INFO: renamed from: p */
    public VText f49560p;

    /* JADX INFO: renamed from: q */
    public View f49561q;

    /* JADX INFO: renamed from: r */
    public View f49562r;

    /* JADX INFO: renamed from: s */
    public Space f49563s;

    /* JADX INFO: renamed from: t */
    public Space f49564t;

    /* JADX INFO: renamed from: u */
    public VText f49565u;

    /* JADX INFO: renamed from: v */
    public VPager f49566v;

    /* JADX INFO: renamed from: w */
    public VPagerCircleIndicator f49567w;

    /* JADX INFO: renamed from: x */
    public VText f49568x;

    /* JADX INFO: renamed from: y */
    public VText f49569y;

    /* JADX INFO: renamed from: z */
    public BLiveGiftItem f49570z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer$a */
    public class C12794a extends ap0 {
        public C12794a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: c */
        public void mo73520c() {
            super.mo73520c();
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
        }
    }

    public DrawGiftContainer(Context context) {
        super(context);
        this.f49547D = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m73495D0(View view) {
        this.f49558n.m73532l(BLiveGiftExtraDrawInfo.getFirstTemple());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m73496E0(View view) {
        this.f49558n.m73532l(BLiveGiftExtraDrawInfo.getSecondTemple());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m73497G0(View view) {
        this.f49558n.m73532l(BLiveGiftExtraDrawInfo.getThirdTemple());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m73511v0(View view) {
        this.f49558n.m73529i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m73512w0(View view) {
        boolean zM73537q = this.f49558n.m73537q();
        DrawPanelView drawPanelView = this.f49558n;
        if (zM73537q) {
            drawPanelView.m73529i();
        } else {
            drawPanelView.m73545y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m73513y0(View view) {
        this.f49558n.m73532l(BLiveGiftExtraDrawInfo.getForthTemple());
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m73514B0(d30 d30Var, View view) {
        this.f49558n.m73529i();
        d30Var.call();
    }

    /* JADX INFO: renamed from: H0 */
    public void m73515H0(mae maeVar) {
        vwb.m200354z(this.f49545B.f169109a, new e30() { // from class: l.y9e
            @Override // p149l.e30
            public final void call(Object obj) {
                vwb.m200354z(((xae) obj).f191729b, new e30() { // from class: l.cae
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        ((mae) obj2).f132844b = false;
                    }
                });
            }
        });
        maeVar.f132844b = true;
        maeVar.f132846d = 0;
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: I0 */
    public void m73516I0(tae taeVar, f30<BLiveGiftItem, BLiveGiftExtraDrawInfo> f30Var, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        this.f49546C = f30Var;
        this.f49545B = taeVar;
        setGiftItem(taeVar.f169110b.m136283h());
        sae saeVar = new sae(this);
        this.f49544A = saeVar;
        saeVar.m182913t(taeVar);
        this.f49566v.setAdapter(this.f49544A);
        this.f49557m.setOnClickListener(new View.OnClickListener() { // from class: l.dae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85222a.m73511v0(view);
            }
        });
        this.f49565u.setText(String.format(getContext().getString(R$string.f47034W4), String.valueOf(ypv.m215672k().m195839g4())));
        this.f49565u.setTextColor(-1);
        this.f49556l.setOnClickListener(new View.OnClickListener() { // from class: l.eae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90190a.m73512w0(view);
            }
        });
        this.f49558n.setNumberChageListener(new e30() { // from class: l.fae
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96594a.m73519z0((Integer) obj);
            }
        });
        this.f49555k.setOnClickListener(new View.OnClickListener() { // from class: l.gae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101663a.m73514B0(d30Var3, view);
            }
        });
        this.f49568x.setOnClickListener(new View.OnClickListener() { // from class: l.hae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        this.f49569y.setOnClickListener(new View.OnClickListener() { // from class: l.iae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        this.f49559o.m68499i("https://auto.tancdn.com/v1/raw/800579c8-8a99-4f49-bd19-244e32b4fa2511.pdf", -1, new C12794a(), true);
        this.f49551g.setOnClickListener(new View.OnClickListener() { // from class: l.jae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117080a.m73495D0(view);
            }
        });
        this.f49552h.setOnClickListener(new View.OnClickListener() { // from class: l.kae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122109a.m73496E0(view);
            }
        });
        this.f49553i.setOnClickListener(new View.OnClickListener() { // from class: l.z9e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202288a.m73497G0(view);
            }
        });
        this.f49554j.setOnClickListener(new View.OnClickListener() { // from class: l.aae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68549a.m73513y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public void m73517J0() {
        f30<BLiveGiftItem, BLiveGiftExtraDrawInfo> f30Var;
        if (this.f49558n.m73537q() || (f30Var = this.f49546C) == null) {
            return;
        }
        f30Var.call(this.f49570z, this.f49558n.getDrawParam());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49559o.m68505o();
        this.f49558n.m73528h();
        this.f49547D.clear();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73518u0(this);
    }

    public void setGiftItem(BLiveGiftItem bLiveGiftItem) {
        this.f49558n.setGiftUrl(bLiveGiftItem.url);
        this.f49570z = bLiveGiftItem;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m73518u0(View view) {
        lae.m149148a(this, view);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m73519z0(final Integer num) {
        vwb.m200354z(this.f49547D.values(), new e30() { // from class: l.bae
            @Override // p149l.e30
            public final void call(Object obj) {
                ((e30) obj).call(num);
            }
        });
        int iIntValue = num.intValue();
        VImage vImage = this.f49557m;
        if (iIntValue < 1) {
            xdl0.m208345M0(vImage, false);
            xdl0.m208345M0(this.f49556l, false);
            xdl0.m208345M0(this.f49559o, true);
            xdl0.m208345M0(this.f49560p, true);
        } else {
            xdl0.m208345M0(vImage, true);
            xdl0.m208345M0(this.f49556l, true);
            xdl0.m208345M0(this.f49559o, false);
            xdl0.m208345M0(this.f49560p, false);
        }
        if (num.intValue() < ypv.m215672k().m195839g4()) {
            this.f49565u.setText(String.format(getContext().getString(R$string.f47034W4), String.valueOf(ypv.m215672k().m195839g4())));
            this.f49565u.setTextColor(-1);
            return;
        }
        String strValueOf = String.valueOf(r1e.m177455d(this.f49570z, num.intValue()));
        String strM202218u = w8u.m202218u(R$string.f47097Z4, strValueOf);
        SpannableString spannableString = new SpannableString(strM202218u);
        int iIndexOf = strM202218u.indexOf(strValueOf);
        int length = strValueOf.length() + iIndexOf;
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffffff")), 0, iIndexOf, 17);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff8817")), iIndexOf, length, 17);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffffff")), length, strM202218u.length(), 17);
        this.f49565u.setText(spannableString);
    }

    public DrawGiftContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49547D = new HashMap<>();
    }

    public DrawGiftContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49547D = new HashMap<>();
    }
}
