package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view;

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
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.bgv;
import p149l.d410;
import p149l.fld0;
import p149l.g5c0;
import p149l.h1c0;
import p149l.h4t;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.lsi0;
import p149l.qi10;
import p149l.r610;
import p149l.s410;
import p149l.t100;
import p149l.uvr;
import p149l.vdt;
import p149l.ve10;
import p149l.vg10;
import p149l.w8u;
import p149l.x8u;
import p149l.xdl0;
import p149l.yb2;
import p149l.ypv;
import p149l.zi10;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes5.dex */
public class MultiCallCellTopView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public int f51385A;

    /* JADX INFO: renamed from: B */
    public BLiveMultiCall f51386B;

    /* JADX INFO: renamed from: C */
    public boolean f51387C;

    /* JADX INFO: renamed from: d */
    public VFrame f51388d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51389e;

    /* JADX INFO: renamed from: f */
    public LiveWaveVoiceView f51390f;

    /* JADX INFO: renamed from: g */
    public VLinear f51391g;

    /* JADX INFO: renamed from: h */
    public VImage f51392h;

    /* JADX INFO: renamed from: i */
    public VText f51393i;

    /* JADX INFO: renamed from: j */
    public VLinear f51394j;

    /* JADX INFO: renamed from: k */
    public VImage f51395k;

    /* JADX INFO: renamed from: l */
    public VText f51396l;

    /* JADX INFO: renamed from: m */
    public VText f51397m;

    /* JADX INFO: renamed from: n */
    public VText f51398n;

    /* JADX INFO: renamed from: o */
    public VImage f51399o;

    /* JADX INFO: renamed from: p */
    public View f51400p;

    /* JADX INFO: renamed from: q */
    public VText f51401q;

    /* JADX INFO: renamed from: r */
    public VImage f51402r;

    /* JADX INFO: renamed from: s */
    public VText f51403s;

    /* JADX INFO: renamed from: t */
    public VText f51404t;

    /* JADX INFO: renamed from: u */
    public Space f51405u;

    /* JADX INFO: renamed from: v */
    public AnimEffectPlayer f51406v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f51407w;

    /* JADX INFO: renamed from: x */
    public VText f51408x;

    /* JADX INFO: renamed from: y */
    public h4t<?, ?> f51409y;

    /* JADX INFO: renamed from: z */
    public int f51410z;

    public MultiCallCellTopView(Context context) {
        super(context);
        this.f51410z = 0;
        this.f51385A = 0;
        this.f51387C = false;
    }

    /* JADX INFO: renamed from: B0 */
    public void m75808B0() {
        this.f51387C = false;
        m75813I0(false);
        xdl0.m208344M(this.f51406v, false);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m75809D0(String str, LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer) {
        xdl0.m208344M(this.f51406v, false);
        m75811G0(str, multiPkPlayer);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m75810E0(LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer, LongLinkLiveMultiPk.MultiPk multiPk) {
        m75811G0(multiPk.getId(), multiPkPlayer);
        if (multiPkPlayer == null) {
            return;
        }
        xdl0.m208344M(this.f51406v, multiPkPlayer.getRole().equals(GameIdentity.player));
        if (multiPkPlayer.getRole().equals("spectator")) {
            return;
        }
        if (TextUtils.isEmpty(multiPk.getWinnerUserId())) {
            this.f51406v.m68500j("https://auto.tancdn.com/v1/raw/3f5a1f2d-0489-4bd0-8ec7-0666a02f3c8b12.so", 1);
            return;
        }
        boolean zEquals = multiPk.getWinnerUserId().equals(multiPkPlayer.getUserId());
        AnimEffectPlayer animEffectPlayer = this.f51406v;
        if (zEquals) {
            animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/c7eec371-945d-47e1-9ea5-ba707903eae812.so", 1);
        } else {
            animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/e17699e3-c1ad-4db4-9329-0e69c893f56b13.so", 1);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m75811G0(final String str, final LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer) {
        this.f51387C = true;
        if (multiPkPlayer == null) {
            return;
        }
        m75813I0(true);
        if (multiPkPlayer.getRole().equals("spectator")) {
            this.f51404t.setText("旁观者");
            this.f51404t.setCompoundDrawables(null, null, null, null);
            this.f51404t.setBackground(kvc0.m147353b(i3c0.f110950b0));
            xdl0.m208329E0(this.f51404t, null);
            return;
        }
        if (multiPkPlayer.getRole().equals(GameIdentity.player)) {
            m75814J0(multiPkPlayer);
            xdl0.m208329E0(this.f51404t, new View.OnClickListener() { // from class: l.a410
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f67434a.m75824s0(str, multiPkPlayer, view);
                }
            });
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: H0 */
    public void m75812H0(BLiveMultiCall bLiveMultiCall) {
        xdl0.m208344M(this.f51403s, uvr.m196087d().m162719u0() && !this.f51387C);
        boolean zM198092b = vdt.m198092b(2);
        VText vText = this.f51403s;
        if (!zM198092b) {
            vText.setText(x8u.m207433c(bLiveMultiCall.receivedRewardPoint));
            Drawable drawableM147353b = kvc0.m147353b(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? i3c0.f110908X3 : i3c0.f110886V3);
            drawableM147353b.setBounds(0, 0, t100.m186890d(10.0f), t100.m186890d(10.0f));
            this.f51403s.setCompoundDrawablePadding(t100.m186890d(2.0f));
            this.f51403s.setCompoundDrawables(drawableM147353b, null, null, null);
            return;
        }
        vText.setCompoundDrawables(null, null, null, null);
        VText vText2 = this.f51403s;
        StringBuilder sb = new StringBuilder();
        sb.append(x8u.m207433c(bLiveMultiCall.receivedRewardPoint));
        sb.append(w8u.m202217t(uvr.m196087d().m162715s0() ? R$string.f46608C7 : R$string.f47014V5));
        vText2.setText(sb.toString());
    }

    /* JADX INFO: renamed from: I0 */
    public void m75813I0(boolean z) {
        xdl0.m208344M(this.f51404t, z);
        VText vText = this.f51403s;
        boolean z2 = false;
        if (uvr.m196087d().m162719u0()) {
            boolean z3 = !z;
            BLiveMultiCall bLiveMultiCall = this.f51386B;
            if ((z3 & (bLiveMultiCall != null)) && !TextUtils.isEmpty(bLiveMultiCall.userId)) {
                z2 = true;
            }
        }
        xdl0.m208344M(vText, z2);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: J0 */
    public void m75814J0(LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer) {
        Drawable drawable;
        if (multiPkPlayer != null && multiPkPlayer.getRole().equals(GameIdentity.player)) {
            this.f51404t.setText(x8u.m207433c(multiPkPlayer.getPoint()) + "");
            this.f51404t.setBackground(kvc0.m147353b(i3c0.f110950b0));
            if (multiPkPlayer.getPoint() == 0) {
                drawable = getResources().getDrawable(i3c0.f110954b4);
            } else if (multiPkPlayer.getRank() == 1) {
                drawable = getResources().getDrawable(i3c0.f110930Z3);
                this.f51404t.setBackground(kvc0.m147353b(i3c0.f110942a4));
            } else if (multiPkPlayer.getRank() == 2) {
                drawable = getResources().getDrawable(i3c0.f110966c4);
            } else if (multiPkPlayer.getRank() == 3) {
                drawable = getResources().getDrawable(i3c0.f110978d4);
            } else {
                drawable = multiPkPlayer.getRank() == 4 ? getResources().getDrawable(i3c0.f110919Y3) : getResources().getDrawable(i3c0.f110954b4);
            }
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f51404t.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m75815K0(String str) {
        if (TextUtils.equals(str, "2x2")) {
            int i = this.f51385A;
            setBackgroundColor(kvc0.m147352a((i == 1 || i == 4) ? h1c0.f105368g1 : h1c0.f105314J));
            return;
        }
        boolean zEquals = TextUtils.equals(str, "1plus8");
        int i2 = this.f51385A;
        if (zEquals) {
            setBackgroundColor(kvc0.m147352a((i2 == 2 || i2 == 5 || i2 == 6 || i2 == 9) ? h1c0.f105368g1 : h1c0.f105314J));
        } else if (i2 == 1) {
            setBackgroundColor(kvc0.m147352a(h1c0.f105365f1));
        } else {
            setBackgroundColor(kvc0.m147352a(i2 % 2 == 0 ? h1c0.f105368g1 : h1c0.f105314J));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m75816k0(View view) {
        d410.m109968a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m75817l0(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f51407w.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f51408x.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i2;
        }
        this.f51408x.setTextSize(i3);
        this.f51408x.setPadding(i5, i4, i5, i4);
        this.f51408x.setBackground(z ? yb2.m213876a(RoundedDrawable.DEFAULT_BORDER_COLOR, i6, false) : yb2.m213876a(-98787, i6, false));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m75818m0(boolean z) {
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f51401q.getLayoutParams();
        if (z) {
            c0220a.f1267r = -1;
            c0220a.f1257k = -1;
            int i = g5c0.f101102y2;
            c0220a.f1255j = i;
            c0220a.f1266q = i;
            this.f51401q.setTextSize(10.0f);
            this.f51403s.setTextSize(8.0f);
            this.f51401q.setGravity(8388611);
        } else {
            int i2 = g5c0.f100748M1;
            c0220a.f1267r = i2;
            c0220a.f1257k = i2;
            c0220a.f1255j = -1;
            c0220a.f1266q = -1;
            this.f51401q.setTextSize(12.0f);
            this.f51403s.setTextSize(12.0f);
            this.f51401q.setGravity(8388613);
        }
        this.f51401q.setLayoutParams(c0220a);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m75819n0(BLiveMultiCall bLiveMultiCall) {
        String strM202217t;
        if (r610.m177984S(bLiveMultiCall) && ve10.m198132f(bLiveMultiCall)) {
            strM202217t = r610.m177988W(bLiveMultiCall.userId) ? w8u.m202217t(R$string.f46741I8) : w8u.m202217t(R$string.f47166c8);
        } else {
            strM202217t = r610.m177985T(bLiveMultiCall) ? w8u.m202217t(R$string.f46763J8) : w8u.m202217t(R$string.f47210e8);
        }
        if (TextUtils.isEmpty(strM202217t)) {
            return;
        }
        lsi0.m151595y(strM202217t);
    }

    /* JADX INFO: renamed from: o0 */
    public void m75820o0() {
        xdl0.m208344M(this.f51407w, false);
        xdl0.m208344M(this.f51408x, false);
        xdl0.m208344M(this.f51391g, !vg10.m198312d(this.f51386B));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75816k0(this);
        this.f51402r.setBackground(yb2.m213876a(-98787, t100.f167257f, false));
        this.f51398n.setBackground(yb2.m213876a(-98787, t100.f167259h, false));
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m75821p0() {
        return getParent() != null;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m75822q0(qi10 qi10Var, View view) {
        zi10.m218892b(qi10Var.m174747k4());
        qi10Var.m174741e4(this.f51385A);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m75823r0(BLiveMultiCall bLiveMultiCall, View view) {
        m75819n0(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m75824s0(String str, LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer, View view) {
        this.f51409y.m206028F2().MultiCallEvent.clickPkBoard().mo172463j(new Pair(str, multiPkPlayer.getUserId()));
    }

    public void setFollowView(boolean z) {
        xdl0.m208344M(this.f51402r, !z);
    }

    public void setViewPosition(int i) {
        this.f51385A = i;
        this.f51397m.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: t0 */
    public void m75825t0(boolean z, Float f) {
        xdl0.m208344M(this.f51390f, z);
        if (z) {
            this.f51410z = 0;
            this.f51390f.m75803h(f.floatValue());
            return;
        }
        int i = this.f51410z + 1;
        this.f51410z = i;
        if (i > 5) {
            this.f51390f.m75804i();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: u0 */
    public void m75826u0(BLiveMultiCall bLiveMultiCall, h4t<?, ?> h4tVar, String str) {
        Float fValueOf = Float.valueOf(0.0f);
        this.f51386B = bLiveMultiCall;
        this.f51409y = h4tVar;
        boolean z = false;
        xdl0.m208344M(this.f51407w, false);
        xdl0.m208344M(this.f51408x, false);
        m75815K0(str);
        boolean z2 = bLiveMultiCall != null && bLiveMultiCall.isLeadRole;
        xdl0.m208344M(this.f51397m, !z2);
        xdl0.m208344M(this.f51398n, z2);
        if (vg10.m198312d(bLiveMultiCall)) {
            xdl0.m208345M0(this.f51391g, false);
            xdl0.m208344M(this.f51401q, true);
            xdl0.m208344M(this.f51400p, true);
            this.f51401q.setText(bLiveMultiCall.userName);
            m75812H0(bLiveMultiCall);
            boolean zEquals = s410.f162243i.equals(bLiveMultiCall.category);
            VFrame vFrame = this.f51388d;
            if (zEquals) {
                xdl0.m208344M(vFrame, false);
                m75825t0(false, fValueOf);
            } else {
                xdl0.m208344M(vFrame, true);
                hxs.m133404q(this.f51389e, bLiveMultiCall.userAvatar, 1, t100.m186890d(6.0f));
            }
            m75829y0(bLiveMultiCall, h4tVar);
            xdl0.m208344M(this.f51394j, bLiveMultiCall.isAway);
        } else if (bLiveMultiCall == null || s410.f162220J.equals(bLiveMultiCall.state)) {
            String strM177969D = r610.m177969D(h4tVar);
            xdl0.m208344M(this.f51388d, false);
            m75825t0(false, fValueOf);
            xdl0.m208344M(this.f51401q, false);
            xdl0.m208344M(this.f51403s, false);
            xdl0.m208344M(this.f51400p, false);
            xdl0.m208344M(this.f51394j, false);
            xdl0.m208344M(this.f51399o, false);
            xdl0.m208344M(this.f51391g, true);
            xdl0.m208344M(this.f51404t, false);
            this.f51391g.setClickable(true);
            setFollowView(true);
            m75827v0(strM177969D);
        }
        if (this.f51386B == null) {
            return;
        }
        if (TextUtils.equals(str, "1plus8")) {
            this.f51401q.setMaxEms(this.f51386B.position != 1 ? 5 : 6);
        } else if (TextUtils.equals(str, "1plus5")) {
            this.f51401q.setMaxEms(this.f51386B.position != 1 ? 3 : 6);
        } else {
            boolean zEquals2 = TextUtils.equals(str, "2x2");
            VText vText = this.f51401q;
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
            m75818m0(z);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m75827v0(String str) {
        if (ve10.m198137k(str)) {
            this.f51392h.setImageResource(i3c0.f110809O3);
            this.f51393i.setText(R$string.f47671z8);
        } else if (ve10.m198133g(str) || ve10.m198129c(str) || ve10.m198142p(str)) {
            this.f51392h.setImageResource(i3c0.f110976d2);
            this.f51393i.setText(w8u.m202217t(R$string.f46653E8));
        } else if (ve10.m198141o(str)) {
            this.f51392h.setImageResource(i3c0.f110809O3);
            this.f51393i.setText(w8u.m202217t(R$string.f46653E8));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m75828w0(final qi10<?> qi10Var, boolean z, String str) {
        xdl0.m208344M(this.f51407w, true);
        xdl0.m208344M(this.f51408x, true);
        xdl0.m208344M(this.f51391g, false);
        if (TextUtils.equals(str, "2x2")) {
            int i = t100.f167232G;
            int iM186890d = t100.m186890d(50.0f);
            int i2 = t100.f167258g;
            m75817l0(i, iM186890d, 12, i2, t100.f167259h, i2, z);
        } else if (!TextUtils.equals(str, "1plus8") || this.f51385A <= 1) {
            m75817l0(t100.f167226A, t100.m186890d(38.0f), 10, t100.m186890d(7.0f), t100.f167260i, t100.m186890d(8.7f), z);
        } else {
            int i3 = t100.f167273v;
            int iM186890d2 = t100.m186890d(38.0f);
            int i4 = t100.f167256e;
            int i5 = t100.f167258g;
            m75817l0(i3, iM186890d2, 9, i4, i5, i5, z);
        }
        hxs.m133401n("context_livingAct", this.f51407w, ypv.f199493a.m199329V());
        xdl0.m208411y(this.f51408x, !z);
        this.f51408x.setTextColor(kvc0.m147352a(z ? h1c0.f105377j1 : h1c0.f105362e1));
        this.f51408x.setText(z ? R$string.f46784K7 : R$string.f46847N6);
        if (z) {
            return;
        }
        xdl0.m208329E0(this.f51408x, new View.OnClickListener() { // from class: l.b410
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73279a.m75822q0(qi10Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m75829y0(final BLiveMultiCall bLiveMultiCall, h4t<?, ?> h4tVar) {
        xdl0.m208344M(this.f51399o, r610.m177983R(bLiveMultiCall, h4tVar));
        xdl0.m208329E0(this.f51399o, new View.OnClickListener() { // from class: l.c410
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79149a.m75823r0(bLiveMultiCall, view);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z0 */
    public void m75830z0(LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer, LongLinkLiveMultiPk.MultiPk multiPk) {
        String stage = multiPk.getStage();
        stage.getClass();
        if (stage.equals(BLivePkStage.punishing)) {
            m75810E0(multiPkPlayer, multiPk);
        } else if (stage.equals("playing")) {
            m75809D0(multiPk.getId(), multiPkPlayer);
        } else {
            m75808B0();
        }
    }

    public MultiCallCellTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51410z = 0;
        this.f51385A = 0;
        this.f51387C = false;
    }

    public MultiCallCellTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51410z = 0;
        this.f51385A = 0;
        this.f51387C = false;
    }
}
