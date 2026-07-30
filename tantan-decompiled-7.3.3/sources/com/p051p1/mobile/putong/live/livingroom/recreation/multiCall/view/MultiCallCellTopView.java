package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.ar10;
import p153l.bf10;
import p153l.bnl0;
import p153l.cd10;
import p153l.civ;
import p153l.fc2;
import p153l.fn10;
import p153l.fp10;
import p153l.htd0;
import p153l.i6t;
import p153l.izs;
import p153l.jr10;
import p153l.mdc0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nc10;
import p153l.o1j0;
import p153l.obc0;
import p153l.qa00;
import p153l.vxr;
import p153l.wft;
import p153l.xau;
import p153l.yau;
import p153l.zrv;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes5.dex */
public class MultiCallCellTopView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public int f52233A;

    /* JADX INFO: renamed from: B */
    public BLiveMultiCall f52234B;

    /* JADX INFO: renamed from: C */
    public boolean f52235C;

    /* JADX INFO: renamed from: d */
    public VFrame f52236d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f52237e;

    /* JADX INFO: renamed from: f */
    public LiveWaveVoiceView f52238f;

    /* JADX INFO: renamed from: g */
    public VLinear f52239g;

    /* JADX INFO: renamed from: h */
    public VImage f52240h;

    /* JADX INFO: renamed from: i */
    public VText f52241i;

    /* JADX INFO: renamed from: j */
    public VLinear f52242j;

    /* JADX INFO: renamed from: k */
    public VImage f52243k;

    /* JADX INFO: renamed from: l */
    public VText f52244l;

    /* JADX INFO: renamed from: m */
    public VText f52245m;

    /* JADX INFO: renamed from: n */
    public VText f52246n;

    /* JADX INFO: renamed from: o */
    public VImage f52247o;

    /* JADX INFO: renamed from: p */
    public View f52248p;

    /* JADX INFO: renamed from: q */
    public VText f52249q;

    /* JADX INFO: renamed from: r */
    public VImage f52250r;

    /* JADX INFO: renamed from: s */
    public VText f52251s;

    /* JADX INFO: renamed from: t */
    public VText f52252t;

    /* JADX INFO: renamed from: u */
    public Space f52253u;

    /* JADX INFO: renamed from: v */
    public AnimEffectPlayer f52254v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f52255w;

    /* JADX INFO: renamed from: x */
    public VText f52256x;

    /* JADX INFO: renamed from: y */
    public i6t<?, ?> f52257y;

    /* JADX INFO: renamed from: z */
    public int f52258z;

    public MultiCallCellTopView(Context context) {
        super(context);
        this.f52258z = 0;
        this.f52233A = 0;
        this.f52235C = false;
    }

    /* JADX INFO: renamed from: B0 */
    public void m76991B0() {
        this.f52235C = false;
        m76996I0(false);
        bnl0.m105524M(this.f52254v, false);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m76992D0(String str, LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer) {
        bnl0.m105524M(this.f52254v, false);
        m76994G0(str, multiPkPlayer);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m76993E0(LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer, LongLinkLiveMultiPk.MultiPk multiPk) {
        m76994G0(multiPk.getId(), multiPkPlayer);
        if (multiPkPlayer == null) {
            return;
        }
        bnl0.m105524M(this.f52254v, multiPkPlayer.getRole().equals(GameIdentity.player));
        if (multiPkPlayer.getRole().equals("spectator")) {
            return;
        }
        if (TextUtils.isEmpty(multiPk.getWinnerUserId())) {
            this.f52254v.m69683j("https://auto.tancdn.com/v1/raw/3f5a1f2d-0489-4bd0-8ec7-0666a02f3c8b12.so", 1);
            return;
        }
        boolean zEquals = multiPk.getWinnerUserId().equals(multiPkPlayer.getUserId());
        AnimEffectPlayer animEffectPlayer = this.f52254v;
        if (zEquals) {
            animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/c7eec371-945d-47e1-9ea5-ba707903eae812.so", 1);
        } else {
            animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/e17699e3-c1ad-4db4-9329-0e69c893f56b13.so", 1);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m76994G0(final String str, final LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer) {
        this.f52235C = true;
        if (multiPkPlayer == null) {
            return;
        }
        m76996I0(true);
        if (multiPkPlayer.getRole().equals("spectator")) {
            this.f52252t.setText("旁观者");
            this.f52252t.setCompoundDrawables(null, null, null, null);
            this.f52252t.setBackground(n3d0.m161278b(obc0.f146278b0));
            bnl0.m105509E0(this.f52252t, null);
            return;
        }
        if (multiPkPlayer.getRole().equals(GameIdentity.player)) {
            m76997J0(multiPkPlayer);
            bnl0.m105509E0(this.f52252t, new View.OnClickListener() { // from class: l.kc10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f125013a.m77007s0(str, multiPkPlayer, view);
                }
            });
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: H0 */
    public void m76995H0(BLiveMultiCall bLiveMultiCall) {
        bnl0.m105524M(this.f52251s, vxr.m203876d().m171026u0() && !this.f52235C);
        boolean zM206159b = wft.m206159b(2);
        VText vText = this.f52251s;
        if (!zM206159b) {
            vText.setText(yau.m214935c(bLiveMultiCall.receivedRewardPoint));
            Drawable drawableM161278b = n3d0.m161278b(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? obc0.f146236X3 : obc0.f146214V3);
            drawableM161278b.setBounds(0, 0, qa00.m175859d(10.0f), qa00.m175859d(10.0f));
            this.f52251s.setCompoundDrawablePadding(qa00.m175859d(2.0f));
            this.f52251s.setCompoundDrawables(drawableM161278b, null, null, null);
            return;
        }
        vText.setCompoundDrawables(null, null, null, null);
        VText vText2 = this.f52251s;
        StringBuilder sb = new StringBuilder();
        sb.append(yau.m214935c(bLiveMultiCall.receivedRewardPoint));
        sb.append(xau.m209910t(vxr.m203876d().m171022s0() ? R$string.f47456C7 : R$string.f47862V5));
        vText2.setText(sb.toString());
    }

    /* JADX INFO: renamed from: I0 */
    public void m76996I0(boolean z) {
        bnl0.m105524M(this.f52252t, z);
        VText vText = this.f52251s;
        boolean z2 = false;
        if (vxr.m203876d().m171026u0()) {
            boolean z3 = !z;
            BLiveMultiCall bLiveMultiCall = this.f52234B;
            if ((z3 & (bLiveMultiCall != null)) && !TextUtils.isEmpty(bLiveMultiCall.userId)) {
                z2 = true;
            }
        }
        bnl0.m105524M(vText, z2);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: J0 */
    public void m76997J0(LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer) {
        Drawable drawable;
        if (multiPkPlayer != null && multiPkPlayer.getRole().equals(GameIdentity.player)) {
            this.f52252t.setText(yau.m214935c(multiPkPlayer.getPoint()) + "");
            this.f52252t.setBackground(n3d0.m161278b(obc0.f146278b0));
            if (multiPkPlayer.getPoint() == 0) {
                drawable = getResources().getDrawable(obc0.f146282b4);
            } else if (multiPkPlayer.getRank() == 1) {
                drawable = getResources().getDrawable(obc0.f146258Z3);
                this.f52252t.setBackground(n3d0.m161278b(obc0.f146270a4));
            } else if (multiPkPlayer.getRank() == 2) {
                drawable = getResources().getDrawable(obc0.f146294c4);
            } else if (multiPkPlayer.getRank() == 3) {
                drawable = getResources().getDrawable(obc0.f146306d4);
            } else {
                drawable = multiPkPlayer.getRank() == 4 ? getResources().getDrawable(obc0.f146247Y3) : getResources().getDrawable(obc0.f146282b4);
            }
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f52252t.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m76998K0(String str) {
        if (TextUtils.equals(str, "2x2")) {
            int i = this.f52233A;
            setBackgroundColor(n3d0.m161277a((i == 1 || i == 4) ? n9c0.f140829g1 : n9c0.f140775J));
            return;
        }
        boolean zEquals = TextUtils.equals(str, "1plus8");
        int i2 = this.f52233A;
        if (zEquals) {
            setBackgroundColor(n3d0.m161277a((i2 == 2 || i2 == 5 || i2 == 6 || i2 == 9) ? n9c0.f140829g1 : n9c0.f140775J));
        } else if (i2 == 1) {
            setBackgroundColor(n3d0.m161277a(n9c0.f140826f1));
        } else {
            setBackgroundColor(n3d0.m161277a(i2 % 2 == 0 ? n9c0.f140829g1 : n9c0.f140775J));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m76999k0(View view) {
        nc10.m162476a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m77000l0(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f52255w.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f52256x.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i2;
        }
        this.f52256x.setTextSize(i3);
        this.f52256x.setPadding(i5, i4, i5, i4);
        this.f52256x.setBackground(z ? fc2.m124971a(RoundedDrawable.DEFAULT_BORDER_COLOR, i6, false) : fc2.m124971a(-98787, i6, false));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m77001m0(boolean z) {
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f52249q.getLayoutParams();
        if (z) {
            c0221a.f1267r = -1;
            c0221a.f1257k = -1;
            int i = mdc0.f136347y2;
            c0221a.f1255j = i;
            c0221a.f1266q = i;
            this.f52249q.setTextSize(10.0f);
            this.f52251s.setTextSize(8.0f);
            this.f52249q.setGravity(8388611);
        } else {
            int i2 = mdc0.f135993M1;
            c0221a.f1267r = i2;
            c0221a.f1257k = i2;
            c0221a.f1255j = -1;
            c0221a.f1266q = -1;
            this.f52249q.setTextSize(12.0f);
            this.f52251s.setTextSize(12.0f);
            this.f52249q.setGravity(8388613);
        }
        this.f52249q.setLayoutParams(c0221a);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m77002n0(BLiveMultiCall bLiveMultiCall) {
        String strM209910t;
        if (bf10.m103813S(bLiveMultiCall) && fn10.m126338f(bLiveMultiCall)) {
            strM209910t = bf10.m103817W(bLiveMultiCall.userId) ? xau.m209910t(R$string.f47589I8) : xau.m209910t(R$string.f48014c8);
        } else {
            strM209910t = bf10.m103814T(bLiveMultiCall) ? xau.m209910t(R$string.f47611J8) : xau.m209910t(R$string.f48058e8);
        }
        if (TextUtils.isEmpty(strM209910t)) {
            return;
        }
        o1j0.m165651y(strM209910t);
    }

    /* JADX INFO: renamed from: o0 */
    public void m77003o0() {
        bnl0.m105524M(this.f52255w, false);
        bnl0.m105524M(this.f52256x, false);
        bnl0.m105524M(this.f52239g, !fp10.m126517d(this.f52234B));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76999k0(this);
        this.f52250r.setBackground(fc2.m124971a(-98787, qa00.f156319f, false));
        this.f52246n.setBackground(fc2.m124971a(-98787, qa00.f156321h, false));
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m77004p0() {
        return getParent() != null;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m77005q0(ar10 ar10Var, View view) {
        jr10.m146656b(ar10Var.m99620k4());
        ar10Var.m99614e4(this.f52233A);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m77006r0(BLiveMultiCall bLiveMultiCall, View view) {
        m77002n0(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m77007s0(String str, LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer, View view) {
        this.f52257y.m213811F2().MultiCallEvent.clickPkBoard().mo199273j(new Pair(str, multiPkPlayer.getUserId()));
    }

    public void setFollowView(boolean z) {
        bnl0.m105524M(this.f52250r, !z);
    }

    public void setViewPosition(int i) {
        this.f52233A = i;
        this.f52245m.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: t0 */
    public void m77008t0(boolean z, Float f) {
        bnl0.m105524M(this.f52238f, z);
        if (z) {
            this.f52258z = 0;
            this.f52238f.m76986h(f.floatValue());
            return;
        }
        int i = this.f52258z + 1;
        this.f52258z = i;
        if (i > 5) {
            this.f52238f.m76987i();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: u0 */
    public void m77009u0(BLiveMultiCall bLiveMultiCall, i6t<?, ?> i6tVar, String str) {
        Float fValueOf = Float.valueOf(0.0f);
        this.f52234B = bLiveMultiCall;
        this.f52257y = i6tVar;
        boolean z = false;
        bnl0.m105524M(this.f52255w, false);
        bnl0.m105524M(this.f52256x, false);
        m76998K0(str);
        boolean z2 = bLiveMultiCall != null && bLiveMultiCall.isLeadRole;
        bnl0.m105524M(this.f52245m, !z2);
        bnl0.m105524M(this.f52246n, z2);
        if (fp10.m126517d(bLiveMultiCall)) {
            bnl0.m105525M0(this.f52239g, false);
            bnl0.m105524M(this.f52249q, true);
            bnl0.m105524M(this.f52248p, true);
            this.f52249q.setText(bLiveMultiCall.userName);
            m76995H0(bLiveMultiCall);
            boolean zEquals = cd10.f81081i.equals(bLiveMultiCall.category);
            VFrame vFrame = this.f52236d;
            if (zEquals) {
                bnl0.m105524M(vFrame, false);
                m77008t0(false, fValueOf);
            } else {
                bnl0.m105524M(vFrame, true);
                izs.m142866q(this.f52237e, bLiveMultiCall.userAvatar, 1, qa00.m175859d(6.0f));
            }
            m77012y0(bLiveMultiCall, i6tVar);
            bnl0.m105524M(this.f52242j, bLiveMultiCall.isAway);
        } else if (bLiveMultiCall == null || cd10.f81058J.equals(bLiveMultiCall.state)) {
            String strM103798D = bf10.m103798D(i6tVar);
            bnl0.m105524M(this.f52236d, false);
            m77008t0(false, fValueOf);
            bnl0.m105524M(this.f52249q, false);
            bnl0.m105524M(this.f52251s, false);
            bnl0.m105524M(this.f52248p, false);
            bnl0.m105524M(this.f52242j, false);
            bnl0.m105524M(this.f52247o, false);
            bnl0.m105524M(this.f52239g, true);
            bnl0.m105524M(this.f52252t, false);
            this.f52239g.setClickable(true);
            setFollowView(true);
            m77010v0(strM103798D);
        }
        if (this.f52234B == null) {
            return;
        }
        if (TextUtils.equals(str, "1plus8")) {
            this.f52249q.setMaxEms(this.f52234B.position != 1 ? 5 : 6);
        } else if (TextUtils.equals(str, "1plus5")) {
            this.f52249q.setMaxEms(this.f52234B.position != 1 ? 3 : 6);
        } else {
            boolean zEquals2 = TextUtils.equals(str, "2x2");
            VText vText = this.f52249q;
            if (zEquals2) {
                vText.setMaxEms(6);
            } else {
                vText.setMaxEms(3);
            }
        }
        if (bLiveMultiCall != null) {
            if (TextUtils.equals(str, "1plus8") && bLiveMultiCall.position != 1) {
                z = true;
            }
            m77001m0(z);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m77010v0(String str) {
        if (fn10.m126343k(str)) {
            this.f52240h.setImageResource(obc0.f146137O3);
            this.f52241i.setText(R$string.f48519z8);
        } else if (fn10.m126339g(str) || fn10.m126335c(str) || fn10.m126348p(str)) {
            this.f52240h.setImageResource(obc0.f146304d2);
            this.f52241i.setText(xau.m209910t(R$string.f47501E8));
        } else if (fn10.m126347o(str)) {
            this.f52240h.setImageResource(obc0.f146137O3);
            this.f52241i.setText(xau.m209910t(R$string.f47501E8));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m77011w0(final ar10<?> ar10Var, boolean z, String str) {
        bnl0.m105524M(this.f52255w, true);
        bnl0.m105524M(this.f52256x, true);
        bnl0.m105524M(this.f52239g, false);
        if (TextUtils.equals(str, "2x2")) {
            int i = qa00.f156294G;
            int iM175859d = qa00.m175859d(50.0f);
            int i2 = qa00.f156320g;
            m77000l0(i, iM175859d, 12, i2, qa00.f156321h, i2, z);
        } else if (!TextUtils.equals(str, "1plus8") || this.f52233A <= 1) {
            m77000l0(qa00.f156288A, qa00.m175859d(38.0f), 10, qa00.m175859d(7.0f), qa00.f156322i, qa00.m175859d(8.7f), z);
        } else {
            int i3 = qa00.f156335v;
            int iM175859d2 = qa00.m175859d(38.0f);
            int i4 = qa00.f156318e;
            int i5 = qa00.f156320g;
            m77000l0(i3, iM175859d2, 9, i4, i5, i5, z);
        }
        izs.m142863n("context_livingAct", this.f52255w, zrv.f205799a.m207651V());
        bnl0.m105591y(this.f52256x, !z);
        this.f52256x.setTextColor(n3d0.m161277a(z ? n9c0.f140838j1 : n9c0.f140823e1));
        this.f52256x.setText(z ? R$string.f47632K7 : R$string.f47695N6);
        if (z) {
            return;
        }
        bnl0.m105509E0(this.f52256x, new View.OnClickListener() { // from class: l.lc10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131265a.m77005q0(ar10Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m77012y0(final BLiveMultiCall bLiveMultiCall, i6t<?, ?> i6tVar) {
        bnl0.m105524M(this.f52247o, bf10.m103812R(bLiveMultiCall, i6tVar));
        bnl0.m105509E0(this.f52247o, new View.OnClickListener() { // from class: l.mc10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135788a.m77006r0(bLiveMultiCall, view);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z0 */
    public void m77013z0(LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer, LongLinkLiveMultiPk.MultiPk multiPk) {
        String stage = multiPk.getStage();
        stage.getClass();
        if (stage.equals(BLivePkStage.punishing)) {
            m76993E0(multiPkPlayer, multiPk);
        } else if (stage.equals("playing")) {
            m76992D0(multiPk.getId(), multiPkPlayer);
        } else {
            m76991B0();
        }
    }

    public MultiCallCellTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52258z = 0;
        this.f52233A = 0;
        this.f52235C = false;
    }

    public MultiCallCellTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52258z = 0;
        this.f52233A = 0;
        this.f52235C = false;
    }
}
