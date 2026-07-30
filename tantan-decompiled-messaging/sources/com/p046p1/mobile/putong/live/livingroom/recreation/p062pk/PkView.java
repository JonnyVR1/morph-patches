package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLivePkBountyResource;
import com.p046p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p046p1.mobile.putong.live.base.data.BLivePkPointList;
import com.p046p1.mobile.putong.live.base.data.BLivePkSituation;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkBountyData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkContributor;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.AutoVisibleEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkScoreView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkTimeView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkFirstGiftView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty.PkBountyView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesContainerView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesResultView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.AbstractC18387m4;
import p149l.ap0;
import p149l.aqe;
import p149l.b2c0;
import p149l.b480;
import p149l.bmf0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.e30;
import p149l.eqh0;
import p149l.f26;
import p149l.ffx;
import p149l.hfw;
import p149l.ht70;
import p149l.hxs;
import p149l.i3c0;
import p149l.l9e;
import p149l.my70;
import p149l.o280;
import p149l.pn40;
import p149l.s7m;
import p149l.sds;
import p149l.spe;
import p149l.t0g0;
import p149l.t100;
import p149l.uep0;
import p149l.vdt;
import p149l.vwb;
import p149l.w8u;
import p149l.wx70;
import p149l.xdl0;
import p149l.xlf0;
import p149l.ypv;
import p149l.zcu;
import p149l.zvf0;

/* JADX INFO: loaded from: classes5.dex */
public class PkView extends FrameLayout implements s7m<my70> {

    /* JADX INFO: renamed from: A */
    public PkWinTimesResultView f51522A;

    /* JADX INFO: renamed from: B */
    public VImage f51523B;

    /* JADX INFO: renamed from: C */
    public VImage f51524C;

    /* JADX INFO: renamed from: D */
    public RecyclerView f51525D;

    /* JADX INFO: renamed from: E */
    public AutoVisibleEffectPlayer f51526E;

    /* JADX INFO: renamed from: F */
    public VText f51527F;

    /* JADX INFO: renamed from: G */
    public PkWinTimesContainerView f51528G;

    /* JADX INFO: renamed from: H */
    public PkBountyView f51529H;

    /* JADX INFO: renamed from: I */
    public AutoVisibleEffectPlayer f51530I;

    /* JADX INFO: renamed from: J */
    public VButton f51531J;

    /* JADX INFO: renamed from: K */
    public VImage f51532K;

    /* JADX INFO: renamed from: L */
    public my70 f51533L;

    /* JADX INFO: renamed from: M */
    public Animator f51534M;

    /* JADX INFO: renamed from: N */
    public f26 f51535N;

    /* JADX INFO: renamed from: O */
    public f26 f51536O;

    /* JADX INFO: renamed from: P */
    public AnimatorSet f51537P;

    /* JADX INFO: renamed from: Q */
    public boolean f51538Q;

    /* JADX INFO: renamed from: a */
    public LivePkScoreView f51539a;

    /* JADX INFO: renamed from: b */
    public View f51540b;

    /* JADX INFO: renamed from: c */
    public View f51541c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f51542d;

    /* JADX INFO: renamed from: e */
    public VImage f51543e;

    /* JADX INFO: renamed from: f */
    public LivePkTimeView f51544f;

    /* JADX INFO: renamed from: g */
    public TextView f51545g;

    /* JADX INFO: renamed from: h */
    public View f51546h;

    /* JADX INFO: renamed from: i */
    public VImage f51547i;

    /* JADX INFO: renamed from: j */
    public VImage f51548j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f51549k;

    /* JADX INFO: renamed from: l */
    public View f51550l;

    /* JADX INFO: renamed from: m */
    public Space f51551m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f51552n;

    /* JADX INFO: renamed from: o */
    public VText f51553o;

    /* JADX INFO: renamed from: p */
    public VImage f51554p;

    /* JADX INFO: renamed from: q */
    public VText f51555q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f51556r;

    /* JADX INFO: renamed from: s */
    public VImage f51557s;

    /* JADX INFO: renamed from: t */
    public VImage f51558t;

    /* JADX INFO: renamed from: u */
    public PkWinTimesResultView f51559u;

    /* JADX INFO: renamed from: v */
    public RecyclerView f51560v;

    /* JADX INFO: renamed from: w */
    public AutoVisibleEffectPlayer f51561w;

    /* JADX INFO: renamed from: x */
    public PkFirstGiftView f51562x;

    /* JADX INFO: renamed from: y */
    public VText f51563y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f51564z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.PkView$a */
    public class C12907a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PkData f51565a;

        public C12907a(PkData pkData) {
            this.f51565a = pkData;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            PkView.this.m76010L(this.f51565a);
        }
    }

    public PkView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m75986F(View view) {
        this.f51533L.mo127905V3(PkAction.ACTION_FOLLOW_USER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m75987G(View view) {
        this.f51533L.mo127905V3(PkAction.ACTION_PK_ONCE_MORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m75988H(View view) {
        this.f51533L.mo127905V3(PkAction.ACTION_PK_EXIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m75989J(View view) {
        boolean zIsSelected = this.f51532K.isSelected();
        this.f51533L.mo127906p4(!zIsSelected, this.f51553o.getText().toString(), new e30() { // from class: l.b380
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72812a.m76009I((Boolean) obj);
            }
        });
        o280.m162288a(this.f51533L, !zIsSelected);
        ht70.m132847d(this.f51533L, zIsSelected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m75990K(View view) {
        this.f51533L.mo127905V3(PkAction.ACTION_SHOW_USER_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public void m75991O(PkContributor pkContributor) {
        my70 my70Var = this.f51533L;
        if (my70Var != null) {
            my70Var.m156993n4(pkContributor);
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m75998h0() {
        int iM193329p = ((uep0.m193329p() * 804) / 1080) + t100.m186890d(64.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = t100.m186890d(this.f51533L.m206032L2() ? 160.0f : 130.0f);
        layoutParams.width = uep0.m193329p();
        layoutParams.height = iM193329p;
        setLayoutParams(layoutParams);
        post(new Runnable() { // from class: l.w280
            @Override // java.lang.Runnable
            public final void run() {
                this.f184097a.m76012N();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    private void m76004r() {
        this.f51538Q = vdt.m198092b(2);
        m76006B();
        xdl0.m208329E0(getFollowView(), new View.OnClickListener() { // from class: l.v280
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179360a.m75986F(view);
            }
        });
        xdl0.m208329E0(this.f51531J, new View.OnClickListener() { // from class: l.x280
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189136a.m75987G(view);
            }
        });
        xdl0.m208329E0(this.f51547i, new View.OnClickListener() { // from class: l.y280
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195498a.m75988H(view);
            }
        });
        xdl0.m208329E0(this.f51532K, new View.OnClickListener() { // from class: l.z280
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201169a.m75989J(view);
            }
        });
        xdl0.m208329E0(this.f51549k, new View.OnClickListener() { // from class: l.a380
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67334a.m75990K(view);
            }
        });
        int i = t100.f167256e;
        bmf0 bmf0Var = new bmf0(i, 0);
        this.f51560v.setLayoutManager(new LinearLayoutManager(getContext(), 0, true));
        this.f51560v.addItemDecoration(bmf0Var);
        xlf0 xlf0Var = new xlf0(i, 0);
        this.f51525D.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f51525D.addItemDecoration(xlf0Var);
        m76005A();
        xdl0.m208344M(this.f51529H, false);
    }

    /* JADX INFO: renamed from: A */
    public final void m76005A() {
        xdl0.m208344M(this.f51563y, false);
        xdl0.m208344M(this.f51527F, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m76006B() {
        xdl0.m208344M(getFollowView(), false);
    }

    /* JADX INFO: renamed from: C */
    public boolean m76007C() {
        return this.f51533L.m156986g4() && this.f51539a.getLeftScore() <= 0 && !xdl0.m208349O0(this.f51545g) && this.f51539a.getRightScore() <= 0;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m76008E() {
        xdl0.m208344M(getFollowView(), false);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m76009I(Boolean bool) {
        this.f51532K.setSelected(bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m76011M(long[] jArr, List list, List list2, String str, String str2) {
        if (TextUtils.equals(str2, ((pn40) this.f51533L.m206027E2()).m132146l0().f56011id)) {
            jArr[0] = Long.valueOf((String) list.get(list2.indexOf(str2))).longValue();
        }
        if (TextUtils.equals(str2, str)) {
            jArr[1] = Long.valueOf((String) list.get(list2.indexOf(str2))).longValue();
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m76012N() {
        this.f51533L.m206028F2().ChatEvent.changeInputSize().mo172463j(new Size(0, Math.min(((((View) getParent()).getHeight() - getBottom()) + ((FrameLayout.LayoutParams) this.f51539a.getLayoutParams()).bottomMargin) - l9e.f127087k, l9e.f127077a)));
    }

    /* JADX INFO: renamed from: P */
    public void m76013P(boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51549k.getLayoutParams();
        layoutParams.topMargin = t100.m186890d(z ? 70.0f : 43.0f);
        this.f51549k.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Q */
    public void m76014Q() {
        this.f51561w.m68504n();
        this.f51526E.m68504n();
        xdl0.m208344M(this.f51556r, false);
        xdl0.m208344M(this.f51564z, false);
        this.f51539a.m76148a();
        m76040q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public void m76015R(final PkData pkData, boolean z, boolean z2) {
        if (!xdl0.m208349O0(this)) {
            zvf0.m220368A("e_pk_adverseprofile_button", this.f51533L.mo77274R2(), vwb.m200311Y("liveId", ((pn40) this.f51533L.m206027E2()).m149814k()));
            if (this.f51533L.m206032L2()) {
                zvf0.m220368A("e_pk_close_button", this.f51533L.mo77274R2(), vwb.m200311Y("liveId", ((pn40) this.f51533L.m206027E2()).m149814k()), vwb.m200311Y("anchorId", ((pn40) this.f51533L.m206027E2()).m132146l0().f56011id));
            }
        }
        if (!xdl0.m208349O0(this)) {
            xdl0.m208344M(this, z2);
        }
        xdl0.m208344M(this.f51556r, false);
        xdl0.m208344M(this.f51564z, false);
        xdl0.m208344M(this.f51547i, this.f51533L.m206032L2());
        xdl0.m208344M(this.f51544f, true);
        m76017T(pkData.isBountyPk());
        m76005A();
        m75998h0();
        User userOtherUser = pkData.otherUser();
        if (userOtherUser == null) {
            return;
        }
        xdl0.m208344M(this.f51531J, false);
        hxs.m133405r("context_single_room", this.f51552n, userOtherUser.m60124fp().profileSmall());
        this.f51553o.setText(userOtherUser.name);
        if (pkData.isPunishing()) {
            this.f51543e.setImageResource(i3c0.f110739I5);
            m76032j0(!pkData.isBountyPk() && this.f51533L.m206032L2());
            m76026c0();
            m76040q();
            m76031i0(false);
            if (!z) {
                m76010L(pkData);
            } else if (pkData.isBountyPk() && m76027d0(pkData.getPkBountyData())) {
                m76018U(pkData.getPkBountyData(), new d30() { // from class: l.c380
                    @Override // p149l.d30
                    public final void call() {
                        this.f78460a.m76010L(pkData);
                    }
                });
            } else {
                m76033k0(pkData);
            }
            this.f51533L.m156981b4();
        } else if (pkData.isPlaying()) {
            this.f51543e.setImageResource(i3c0.f110943a5);
            if (pkData.isBountyPk()) {
                m76024a0(pkData.getPkBountyData());
            }
            if (z) {
                if (pkData.isBountyPk() && m76027d0(pkData.getPkBountyData())) {
                    m76019V(pkData.getPkBountyData());
                } else {
                    this.f51530I.m68500j("https://auto.tancdn.com/v1/raw/93619dd5-494b-44ef-9a8c-1083f27365fa11.so", 1);
                }
            }
        }
        String strOtherUserId = pkData.otherUserId();
        BLivePkPointList bLivePkPointList = pkData.f51567pk.situation.points;
        m76022Y(strOtherUserId, bLivePkPointList.userId, bLivePkPointList.point);
        boolean zEquals = TEnum.equals(pkData.f51567pk.situation.currentStageInfo.stage, BLivePkStage.punishing);
        List<BLivePkContributor> hostContributors = pkData.getHostContributors();
        List<BLivePkContributor> otherContributors = pkData.getOtherContributors();
        BLivePkSituation bLivePkSituation = pkData.f51567pk.situation;
        m76020W(hostContributors, otherContributors, zEquals, bLivePkSituation.isTied, TextUtils.equals(bLivePkSituation.winnerId, pkData.getAnchorId()));
        m76021X(pkData);
    }

    /* JADX INFO: renamed from: S */
    public void m76016S(VText vText, double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            xdl0.m208344M(vText, false);
            return;
        }
        vText.setText(m76046y("¥ " + d));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        vText.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        vText.getPaint().setShader(new LinearGradient(0.0f, 0.0f, vText.getMeasuredWidth(), 0.0f, new int[]{Color.parseColor("#ffc73e"), Color.parseColor("#ffeab7"), Color.parseColor("#ffc73e")}, new float[]{0.25f, 0.5f, 0.75f}, Shader.TileMode.CLAMP));
        vText.invalidate();
    }

    /* JADX INFO: renamed from: T */
    public final void m76017T(boolean z) {
        xdl0.m208344M(this.f51529H, z);
    }

    /* JADX INFO: renamed from: U */
    public final void m76018U(PkBountyData pkBountyData, d30 d30Var) {
        this.f51529H.m76280j(pkBountyData, d30Var);
    }

    /* JADX INFO: renamed from: V */
    public final void m76019V(PkBountyData pkBountyData) {
        this.f51529H.m76280j(pkBountyData, null);
    }

    /* JADX INFO: renamed from: W */
    public void m76020W(List<BLivePkContributor> list, List<BLivePkContributor> list2, boolean z, boolean z2, boolean z3) {
        ht70.m132853j("renderContributors isPunishStage:" + z + ",hostContributors:" + list.size() + ",otherContributors: " + list2.size());
        if (this.f51535N == null) {
            f26 f26Var = new f26(new e30() { // from class: l.d380
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f83475a.m75991O((PkContributor) obj);
                }
            });
            this.f51535N = f26Var;
            this.f51560v.setAdapter(f26Var);
        }
        this.f51535N.m119162I(m76042u(true, list, z, z2, z3));
        if (this.f51536O == null) {
            f26 f26Var2 = new f26(new e30() { // from class: l.d380
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f83475a.m75991O((PkContributor) obj);
                }
            });
            this.f51536O = f26Var2;
            this.f51525D.setAdapter(f26Var2);
        }
        this.f51536O.m119162I(m76042u(false, list2, z, z2, !z3));
        my70 my70Var = this.f51533L;
        if (my70Var != null) {
            my70Var.m156996t4(list, list2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public final void m76021X(PkData pkData) {
        if (((pn40) this.f51533L.m206027E2()).mo97490p()) {
            if (pkData.isPlaying()) {
                o280.m162289b(this.f51532K, this.f51533L);
                xdl0.m208344M(this.f51532K, true);
                wx70.m205913n(getContext(), this.f51532K, this);
                return;
            }
            return;
        }
        if (pkData.isPking()) {
            boolean zM205912l = wx70.m205912l(pkData);
            xdl0.m208344M(this.f51532K, zM205912l);
            this.f51532K.setSelected(zM205912l);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m76022Y(final String str, final List<String> list, final List<String> list2) {
        final long[] jArr = {0, 0};
        vwb.m200354z(list, new e30() { // from class: l.f380
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94250a.m76011M(jArr, list2, list, str, (String) obj);
            }
        });
        this.f51539a.m76149b(jArr[0], jArr[1], false, false);
        ht70.m132857n(this.f51539a, jArr[0], jArr[1]);
        this.f51533L.m156978Y3();
    }

    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void m76010L(PkData pkData) {
        xdl0.m208344M(this.f51556r, true);
        xdl0.m208344M(this.f51564z, true);
        if (pkData.f51567pk.situation.isTied) {
            this.f51557s.setImageResource(i3c0.f110855S5);
            this.f51523B.setImageResource(i3c0.f110855S5);
        } else {
            boolean zM186871l = t0g0.m186871l(pkData.otherUserId(), pkData.f51567pk.situation.winnerId);
            this.f51557s.setImageResource(zM186871l ? i3c0.f110898W4 : i3c0.f110833Q5);
            this.f51523B.setImageResource(zM186871l ? i3c0.f110833Q5 : i3c0.f110898W4);
            hfw.m130790a("LivePkConstant", "pkInfo anchorWinTimes:" + pkData.getAnchorWinTimes() + ",otherWinTimes:" + pkData.getOtherWinTimes());
        }
        m76025b0(pkData);
    }

    /* JADX INFO: renamed from: a0 */
    public void m76024a0(PkBountyData pkBountyData) {
        if (pkBountyData == null) {
            return;
        }
        xdl0.m208344M(this.f51563y, true);
        xdl0.m208344M(this.f51527F, true);
        this.f51563y.setBackgroundResource(i3c0.f110726H4);
        this.f51527F.setBackgroundResource(i3c0.f110726H4);
        m76016S(this.f51563y, pkBountyData.getAnchorBounty());
        m76016S(this.f51527F, pkBountyData.getOtherBounty());
    }

    /* JADX INFO: renamed from: b0 */
    public final void m76025b0(PkData pkData) {
        this.f51559u.m76323e();
        this.f51522A.m76323e();
        if (!pkData.isBountyPk() && ypv.m215672k().m195752V4() && pkData.showWinTimesTag) {
            if (pkData.f51567pk.situation.isTied) {
                this.f51559u.m76321c(pkData.getAnchorWinTimes());
                this.f51522A.m76321c(pkData.getOtherWinTimes());
            } else if (t0g0.m186871l(pkData.otherUserId(), pkData.f51567pk.situation.winnerId)) {
                this.f51522A.m76322d(pkData.getOtherWinTimes());
                this.f51559u.m76320b(pkData.getAnchorWinTimes());
            } else {
                this.f51559u.m76322d(pkData.getAnchorWinTimes());
                this.f51522A.m76320b(pkData.getOtherWinTimes());
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m76026c0() {
        this.f51542d.setBackgroundResource(i3c0.f111201w);
        xdl0.m208344M(this.f51541c, false);
        xdl0.m208344M(this.f51540b, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m76027d0(PkBountyData pkBountyData) {
        if (pkBountyData == null) {
            return false;
        }
        AbstractC18387m4 abstractC18387m4M185365d = spe.m185365d("svga");
        BLivePkBountyResource anchorResource = pkBountyData.getAnchorResource();
        if (anchorResource == null) {
            return false;
        }
        return !TextUtils.isEmpty(abstractC18387m4M185365d.mo107443b(aqe.m98261i().m98266h(anchorResource.resourceId)));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m76028e0() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51539a.getLayoutParams();
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = t100.m186890d(20.0f);
        this.f51539a.setLayoutParams(layoutParams);
        m76013P(false);
    }

    /* JADX INFO: renamed from: f0 */
    public void m76029f0() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51539a.getLayoutParams();
        layoutParams.gravity = 48;
        layoutParams.topMargin = t100.m186890d(45.0f);
        this.f51539a.setLayoutParams(layoutParams);
        m76013P(true);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m76030g0() {
        xdl0.m208344M(this.f51531J, false);
        xdl0.m208344M(this.f51545g, false);
        xdl0.m208344M(this.f51556r, false);
        xdl0.m208344M(this.f51564z, false);
        m76006B();
        this.f51562x.m76165p0();
    }

    public View getFollowView() {
        return this.f51538Q ? this.f51555q : this.f51554p;
    }

    public String getWithdrawSVGAUrl() {
        return w8u.m202204B() ? "https://auto.tancdn.com/v1/raw/03d44a3b-6cb4-4bc1-bf0a-36fdef9e62f610.so" : "https://auto.tancdn.com/v1/raw/ba848057-1f40-41ee-b4ba-5f13b78c2cfe11.so";
    }

    /* JADX INFO: renamed from: i0 */
    public void m76031i0(boolean z) {
        xdl0.m208344M(this.f51545g, z);
        xdl0.m208344M(this.f51544f, !z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m76032j0(boolean z) {
        xdl0.m208344M(this.f51531J, z);
    }

    /* JADX INFO: renamed from: k0 */
    public void m76033k0(PkData pkData) {
        C12907a c12907a = new C12907a(pkData);
        if (pkData.f51567pk.situation.isTied) {
            this.f51561w.mo68502l(getWithdrawSVGAUrl(), 1, c12907a);
            this.f51526E.mo68502l(getWithdrawSVGAUrl(), 1, c12907a);
        } else {
            boolean zM186871l = t0g0.m186871l(pkData.otherUserId(), pkData.f51567pk.situation.winnerId);
            this.f51561w.mo68502l(m76045x(!zM186871l), 1, c12907a);
            this.f51526E.mo68502l(m76045x(zM186871l), 1, c12907a);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m76034l0(int i) {
        m76040q();
        if (i <= 0) {
            m76026c0();
            if (this.f51533L.f136259i.m99904N3().isPlaying()) {
                m76031i0(true);
                this.f51562x.m76165p0();
                this.f51533L.m156981b4();
                return;
            }
            return;
        }
        if (!xdl0.m208349O0(this.f51541c)) {
            xdl0.m208344M(this.f51541c, true);
            xdl0.m208344M(this.f51540b, true);
            xdl0.m208344M(this.f51544f, true);
            this.f51542d.measure(ffx.m121202e(), ffx.m121199b(t100.m186890d(26.0f)));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51541c.getLayoutParams();
            layoutParams.width = this.f51542d.getMeasuredWidth();
            layoutParams.height = this.f51542d.getMeasuredHeight();
            this.f51541c.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f51540b.getLayoutParams();
            layoutParams2.width = this.f51542d.getMeasuredWidth();
            layoutParams2.height = this.f51542d.getMeasuredHeight();
            this.f51540b.setLayoutParams(layoutParams2);
            this.f51541c.setBackgroundResource(i3c0.f111202w0);
            this.f51540b.setBackgroundResource(i3c0.f111202w0);
            this.f51542d.setBackgroundResource(i3c0.f110804Na);
        }
        View view = this.f51541c;
        Property<View, Float> property = bt0.f77162i;
        Interpolator interpolator = bt0.f77154a;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(view, property, 0L, 1000L, interpolator, 1.0f, 1.3f, 1.0f), bt0.m103743p(this.f51540b, "alpha", 0L, 1000L, new LinearInterpolator(), 1.0f, 0.0f), bt0.m103743p(this.f51540b, "scaleX", 0L, 1000L, interpolator, 1.0f, 1.3f, 1.4f), bt0.m103743p(this.f51540b, "scaleY", 0L, 1000L, interpolator, 1.0f, 1.3f, 1.75f));
        this.f51534M = animatorM103753z;
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: m0 */
    public void m76035m0(boolean z) {
        xdl0.m208344M(this.f51532K, z);
        m76037n0(z);
    }

    /* JADX INFO: renamed from: n */
    public final void m76036n(View view) {
        b480.m100216a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public void m76037n0(boolean z) {
        this.f51532K.setSelected(z);
    }

    /* JADX INFO: renamed from: o0 */
    public void m76038o0(int i) {
        this.f51544f.m76150a(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m76040q();
        if (NullChecker.m81303a(this.f51537P)) {
            this.f51537P.cancel();
            this.f51537P = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76036n(this);
        m76004r();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(my70 my70Var) {
        this.f51533L = my70Var;
    }

    /* JADX INFO: renamed from: q */
    public void m76040q() {
        Animator animator = this.f51534M;
        if (animator != null) {
            animator.cancel();
            this.f51534M = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public void m76041s(boolean z, User user, boolean z2) {
        if (!z) {
            zcu.m218089d(this.f51533L.mo77274R2(), sds.m183540k().m183543b(this.f51533L.m206027E2(), false).m183546e("live_pk_main").m183549h(user.f56011id).m183542a());
        }
        if (z) {
            if (z2) {
                m76044w();
                return;
            } else {
                m76006B();
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams = getFollowView().getLayoutParams();
        if (this.f51538Q) {
            layoutParams.width = t100.m186890d(12.0f) + uep0.m193332s(10, getContext().getString(R$string.f46627D4));
        } else {
            layoutParams.width = getResources().getDimensionPixelSize(b2c0.f72684b);
        }
        getFollowView().setLayoutParams(layoutParams);
        getFollowView().setAlpha(1.0f);
        xdl0.m208344M(getFollowView(), true);
        this.f51553o.setPadding(0, 0, xdl0.m208407w(4.0f), 0);
        zvf0.m220368A("e_pk_adverseprofile_button", this.f51533L.mo77274R2(), vwb.m200311Y("liveId", ((pn40) this.f51533L.m206027E2()).m149814k()));
    }

    /* JADX INFO: renamed from: u */
    public final List<PkContributor> m76042u(boolean z, List<BLivePkContributor> list, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            BLivePkContributor bLivePkContributor = null;
            if (!vwb.m200296J(list) && list.size() > i) {
                bLivePkContributor = list.get(i);
            }
            PkContributor success = new PkContributor().setHost(z).setRank(i).setPunishStage(z2).setTied(z3).setSuccess(z4);
            if (NullChecker.m81303a(bLivePkContributor)) {
                success = success.setAvatarUrl(bLivePkContributor.image).setUserId(bLivePkContributor.userId).setScore(bLivePkContributor.point);
            }
            arrayList.add(success);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public void m76043v() {
        this.f51533L.m206028F2().ChatEvent.changeInputSize().mo172463j(new Size(0, l9e.f127077a));
        ht70.m132853j("pkView endPk");
        m76040q();
        m76047z();
        this.f51539a.m76148a();
        m76026c0();
        m76030g0();
        this.f51532K.setSelected(false);
    }

    /* JADX INFO: renamed from: w */
    public final void m76044w() {
        if (NullChecker.m81303a(this.f51537P) && this.f51537P.isStarted()) {
            return;
        }
        Animator animatorM103741n = bt0.m103741n(getFollowView(), View.ALPHA, 1.0f, 0.0f);
        animatorM103741n.setDuration(300L);
        Animator animatorM103742o = bt0.m103742o(getFollowView(), dt0.f87802n, getFollowView().getWidth(), 0);
        animatorM103742o.setDuration(300L);
        animatorM103742o.setStartDelay(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f51537P = animatorSet;
        animatorSet.play(animatorM103741n).with(animatorM103742o);
        this.f51537P.setDuration(500L);
        this.f51537P.start();
        bt0.m103733f(this.f51537P, new Runnable() { // from class: l.e380
            @Override // java.lang.Runnable
            public final void run() {
                this.f88999a.m76008E();
            }
        });
        this.f51553o.setPadding(0, 0, xdl0.m208407w(8.0f), 0);
    }

    /* JADX INFO: renamed from: x */
    public String m76045x(boolean z) {
        if (z) {
            return w8u.m202204B() ? "https://auto.tancdn.com/v1/raw/9eed85f0-5fe1-4b0f-95cc-62e8487779e710.so" : "https://auto.tancdn.com/v1/raw/b4b99d72-60fe-4981-9c2f-ddea917d35ed10.so";
        }
        return w8u.m202204B() ? "https://auto.tancdn.com/v1/raw/bb18850a-2de2-4b87-8b20-cbf4a1e252f311.so" : "https://auto.tancdn.com/v1/raw/ec10154f-9a3c-4139-a345-babc7e5eaae711.so";
    }

    /* JADX INFO: renamed from: y */
    public SpannableStringBuilder m76046y(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(3), Color.parseColor("#ffc73e")), 0, 1, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(3), Color.parseColor("#ffc73e")), 1, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public void m76047z() {
        xdl0.m208344M(this, false);
    }

    public PkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
