package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk;

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
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLivePkBountyResource;
import com.p051p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p051p1.mobile.putong.live.base.data.BLivePkPointList;
import com.p051p1.mobile.putong.live.base.data.BLivePkSituation;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkBountyData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkContributor;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.AutoVisibleEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkScoreView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkTimeView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkFirstGiftView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty.PkBountyView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesContainerView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesResultView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.AbstractC18340l4;
import p153l.a9g0;
import p153l.afu;
import p153l.bnl0;
import p153l.c680;
import p153l.dox;
import p153l.dw40;
import p153l.ere;
import p153l.fhw;
import p153l.gt0;
import p153l.guf0;
import p153l.hc80;
import p153l.i4g0;
import p153l.iac0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.jyb;
import p153l.k36;
import p153l.kuf0;
import p153l.lyh0;
import p153l.n180;
import p153l.obc0;
import p153l.pae;
import p153l.qa00;
import p153l.s680;
import p153l.tfs;
import p153l.ua80;
import p153l.wft;
import p153l.wo0;
import p153l.wqe;
import p153l.x20;
import p153l.xau;
import p153l.y20;
import p153l.ynp0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class PkView extends FrameLayout implements iam<s680> {

    /* JADX INFO: renamed from: A */
    public PkWinTimesResultView f52370A;

    /* JADX INFO: renamed from: B */
    public VImage f52371B;

    /* JADX INFO: renamed from: C */
    public VImage f52372C;

    /* JADX INFO: renamed from: D */
    public RecyclerView f52373D;

    /* JADX INFO: renamed from: E */
    public AutoVisibleEffectPlayer f52374E;

    /* JADX INFO: renamed from: F */
    public VText f52375F;

    /* JADX INFO: renamed from: G */
    public PkWinTimesContainerView f52376G;

    /* JADX INFO: renamed from: H */
    public PkBountyView f52377H;

    /* JADX INFO: renamed from: I */
    public AutoVisibleEffectPlayer f52378I;

    /* JADX INFO: renamed from: J */
    public VButton f52379J;

    /* JADX INFO: renamed from: K */
    public VImage f52380K;

    /* JADX INFO: renamed from: L */
    public s680 f52381L;

    /* JADX INFO: renamed from: M */
    public Animator f52382M;

    /* JADX INFO: renamed from: N */
    public k36 f52383N;

    /* JADX INFO: renamed from: O */
    public k36 f52384O;

    /* JADX INFO: renamed from: P */
    public AnimatorSet f52385P;

    /* JADX INFO: renamed from: Q */
    public boolean f52386Q;

    /* JADX INFO: renamed from: a */
    public LivePkScoreView f52387a;

    /* JADX INFO: renamed from: b */
    public View f52388b;

    /* JADX INFO: renamed from: c */
    public View f52389c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f52390d;

    /* JADX INFO: renamed from: e */
    public VImage f52391e;

    /* JADX INFO: renamed from: f */
    public LivePkTimeView f52392f;

    /* JADX INFO: renamed from: g */
    public TextView f52393g;

    /* JADX INFO: renamed from: h */
    public View f52394h;

    /* JADX INFO: renamed from: i */
    public VImage f52395i;

    /* JADX INFO: renamed from: j */
    public VImage f52396j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f52397k;

    /* JADX INFO: renamed from: l */
    public View f52398l;

    /* JADX INFO: renamed from: m */
    public Space f52399m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f52400n;

    /* JADX INFO: renamed from: o */
    public VText f52401o;

    /* JADX INFO: renamed from: p */
    public VImage f52402p;

    /* JADX INFO: renamed from: q */
    public VText f52403q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f52404r;

    /* JADX INFO: renamed from: s */
    public VImage f52405s;

    /* JADX INFO: renamed from: t */
    public VImage f52406t;

    /* JADX INFO: renamed from: u */
    public PkWinTimesResultView f52407u;

    /* JADX INFO: renamed from: v */
    public RecyclerView f52408v;

    /* JADX INFO: renamed from: w */
    public AutoVisibleEffectPlayer f52409w;

    /* JADX INFO: renamed from: x */
    public PkFirstGiftView f52410x;

    /* JADX INFO: renamed from: y */
    public VText f52411y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f52412z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.PkView$a */
    public class C13070a extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PkData f52413a;

        public C13070a(PkData pkData) {
            this.f52413a = pkData;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            PkView.this.m77193L(this.f52413a);
        }
    }

    public PkView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m77169F(View view) {
        this.f52381L.mo156628V3(PkAction.ACTION_FOLLOW_USER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m77170G(View view) {
        this.f52381L.mo156628V3(PkAction.ACTION_PK_ONCE_MORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m77171H(View view) {
        this.f52381L.mo156628V3(PkAction.ACTION_PK_EXIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m77172J(View view) {
        boolean zIsSelected = this.f52380K.isSelected();
        this.f52381L.mo156629p4(!zIsSelected, this.f52401o.getText().toString(), new y20() { // from class: l.hb80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108572a.m77192I((Boolean) obj);
            }
        });
        ua80.m195159a(this.f52381L, !zIsSelected);
        n180.m161087d(this.f52381L, zIsSelected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m77173K(View view) {
        this.f52381L.mo156628V3(PkAction.ACTION_SHOW_USER_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public void m77174O(PkContributor pkContributor) {
        s680 s680Var = this.f52381L;
        if (s680Var != null) {
            s680Var.m184877n4(pkContributor);
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m77181h0() {
        int iM216939p = ((ynp0.m216939p() * 804) / 1080) + qa00.m175859d(64.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = qa00.m175859d(this.f52381L.m213815L2() ? 160.0f : 130.0f);
        layoutParams.width = ynp0.m216939p();
        layoutParams.height = iM216939p;
        setLayoutParams(layoutParams);
        post(new Runnable() { // from class: l.cb80
            @Override // java.lang.Runnable
            public final void run() {
                this.f80709a.m77195N();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    private void m77187r() {
        this.f52386Q = wft.m206159b(2);
        m77189B();
        bnl0.m105509E0(getFollowView(), new View.OnClickListener() { // from class: l.bb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75776a.m77169F(view);
            }
        });
        bnl0.m105509E0(this.f52379J, new View.OnClickListener() { // from class: l.db80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85971a.m77170G(view);
            }
        });
        bnl0.m105509E0(this.f52395i, new View.OnClickListener() { // from class: l.eb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92837a.m77171H(view);
            }
        });
        bnl0.m105509E0(this.f52380K, new View.OnClickListener() { // from class: l.fb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98053a.m77172J(view);
            }
        });
        bnl0.m105509E0(this.f52397k, new View.OnClickListener() { // from class: l.gb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103062a.m77173K(view);
            }
        });
        int i = qa00.f156318e;
        kuf0 kuf0Var = new kuf0(i, 0);
        this.f52408v.setLayoutManager(new LinearLayoutManager(getContext(), 0, true));
        this.f52408v.addItemDecoration(kuf0Var);
        guf0 guf0Var = new guf0(i, 0);
        this.f52373D.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f52373D.addItemDecoration(guf0Var);
        m77188A();
        bnl0.m105524M(this.f52377H, false);
    }

    /* JADX INFO: renamed from: A */
    public final void m77188A() {
        bnl0.m105524M(this.f52411y, false);
        bnl0.m105524M(this.f52375F, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m77189B() {
        bnl0.m105524M(getFollowView(), false);
    }

    /* JADX INFO: renamed from: C */
    public boolean m77190C() {
        return this.f52381L.m184870g4() && this.f52387a.getLeftScore() <= 0 && !bnl0.m105529O0(this.f52393g) && this.f52387a.getRightScore() <= 0;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m77191E() {
        bnl0.m105524M(getFollowView(), false);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m77192I(Boolean bool) {
        this.f52380K.setSelected(bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m77194M(long[] jArr, List list, List list2, String str, String str2) {
        if (TextUtils.equals(str2, ((dw40) this.f52381L.m213810E2()).m168532l0().f56859id)) {
            jArr[0] = Long.valueOf((String) list.get(list2.indexOf(str2))).longValue();
        }
        if (TextUtils.equals(str2, str)) {
            jArr[1] = Long.valueOf((String) list.get(list2.indexOf(str2))).longValue();
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m77195N() {
        this.f52381L.m213811F2().ChatEvent.changeInputSize().mo199273j(new Size(0, Math.min(((((View) getParent()).getHeight() - getBottom()) + ((FrameLayout.LayoutParams) this.f52387a.getLayoutParams()).bottomMargin) - pae.f151267k, pae.f151257a)));
    }

    /* JADX INFO: renamed from: P */
    public void m77196P(boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52397k.getLayoutParams();
        layoutParams.topMargin = qa00.m175859d(z ? 70.0f : 43.0f);
        this.f52397k.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Q */
    public void m77197Q() {
        this.f52409w.m69687n();
        this.f52374E.m69687n();
        bnl0.m105524M(this.f52404r, false);
        bnl0.m105524M(this.f52412z, false);
        this.f52387a.m77331a();
        m77223q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public void m77198R(final PkData pkData, boolean z, boolean z2) {
        if (!bnl0.m105529O0(this)) {
            i4g0.m138492A("e_pk_adverseprofile_button", this.f52381L.mo78457R2(), jyb.m147494Y("liveId", ((dw40) this.f52381L.m213810E2()).m202191k()));
            if (this.f52381L.m213815L2()) {
                i4g0.m138492A("e_pk_close_button", this.f52381L.mo78457R2(), jyb.m147494Y("liveId", ((dw40) this.f52381L.m213810E2()).m202191k()), jyb.m147494Y("anchorId", ((dw40) this.f52381L.m213810E2()).m168532l0().f56859id));
            }
        }
        if (!bnl0.m105529O0(this)) {
            bnl0.m105524M(this, z2);
        }
        bnl0.m105524M(this.f52404r, false);
        bnl0.m105524M(this.f52412z, false);
        bnl0.m105524M(this.f52395i, this.f52381L.m213815L2());
        bnl0.m105524M(this.f52392f, true);
        m77200T(pkData.isBountyPk());
        m77188A();
        m77181h0();
        User userOtherUser = pkData.otherUser();
        if (userOtherUser == null) {
            return;
        }
        bnl0.m105524M(this.f52379J, false);
        izs.m142867r("context_single_room", this.f52400n, userOtherUser.m61308fp().profileSmall());
        this.f52401o.setText(userOtherUser.name);
        if (pkData.isPunishing()) {
            this.f52391e.setImageResource(obc0.f146067I5);
            m77215j0(!pkData.isBountyPk() && this.f52381L.m213815L2());
            m77209c0();
            m77223q();
            m77214i0(false);
            if (!z) {
                m77193L(pkData);
            } else if (pkData.isBountyPk() && m77210d0(pkData.getPkBountyData())) {
                m77201U(pkData.getPkBountyData(), new x20() { // from class: l.ib80
                    @Override // p153l.x20
                    public final void call() {
                        this.f113739a.m77193L(pkData);
                    }
                });
            } else {
                m77216k0(pkData);
            }
            this.f52381L.m184865b4();
        } else if (pkData.isPlaying()) {
            this.f52391e.setImageResource(obc0.f146271a5);
            if (pkData.isBountyPk()) {
                m77207a0(pkData.getPkBountyData());
            }
            if (z) {
                if (pkData.isBountyPk() && m77210d0(pkData.getPkBountyData())) {
                    m77202V(pkData.getPkBountyData());
                } else {
                    this.f52378I.m69683j("https://auto.tancdn.com/v1/raw/93619dd5-494b-44ef-9a8c-1083f27365fa11.so", 1);
                }
            }
        }
        String strOtherUserId = pkData.otherUserId();
        BLivePkPointList bLivePkPointList = pkData.f52415pk.situation.points;
        m77205Y(strOtherUserId, bLivePkPointList.userId, bLivePkPointList.point);
        boolean zEquals = TEnum.equals(pkData.f52415pk.situation.currentStageInfo.stage, BLivePkStage.punishing);
        List<BLivePkContributor> hostContributors = pkData.getHostContributors();
        List<BLivePkContributor> otherContributors = pkData.getOtherContributors();
        BLivePkSituation bLivePkSituation = pkData.f52415pk.situation;
        m77203W(hostContributors, otherContributors, zEquals, bLivePkSituation.isTied, TextUtils.equals(bLivePkSituation.winnerId, pkData.getAnchorId()));
        m77204X(pkData);
    }

    /* JADX INFO: renamed from: S */
    public void m77199S(VText vText, double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            bnl0.m105524M(vText, false);
            return;
        }
        vText.setText(m77229y("¥ " + d));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        vText.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        vText.getPaint().setShader(new LinearGradient(0.0f, 0.0f, vText.getMeasuredWidth(), 0.0f, new int[]{Color.parseColor("#ffc73e"), Color.parseColor("#ffeab7"), Color.parseColor("#ffc73e")}, new float[]{0.25f, 0.5f, 0.75f}, Shader.TileMode.CLAMP));
        vText.invalidate();
    }

    /* JADX INFO: renamed from: T */
    public final void m77200T(boolean z) {
        bnl0.m105524M(this.f52377H, z);
    }

    /* JADX INFO: renamed from: U */
    public final void m77201U(PkBountyData pkBountyData, x20 x20Var) {
        this.f52377H.m77463j(pkBountyData, x20Var);
    }

    /* JADX INFO: renamed from: V */
    public final void m77202V(PkBountyData pkBountyData) {
        this.f52377H.m77463j(pkBountyData, null);
    }

    /* JADX INFO: renamed from: W */
    public void m77203W(List<BLivePkContributor> list, List<BLivePkContributor> list2, boolean z, boolean z2, boolean z3) {
        n180.m161093j("renderContributors isPunishStage:" + z + ",hostContributors:" + list.size() + ",otherContributors: " + list2.size());
        if (this.f52383N == null) {
            k36 k36Var = new k36(new y20() { // from class: l.jb80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f119136a.m77174O((PkContributor) obj);
                }
            });
            this.f52383N = k36Var;
            this.f52408v.setAdapter(k36Var);
        }
        this.f52383N.m148001I(m77225u(true, list, z, z2, z3));
        if (this.f52384O == null) {
            k36 k36Var2 = new k36(new y20() { // from class: l.jb80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f119136a.m77174O((PkContributor) obj);
                }
            });
            this.f52384O = k36Var2;
            this.f52373D.setAdapter(k36Var2);
        }
        this.f52384O.m148001I(m77225u(false, list2, z, z2, !z3));
        s680 s680Var = this.f52381L;
        if (s680Var != null) {
            s680Var.m184880t4(list, list2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public final void m77204X(PkData pkData) {
        if (((dw40) this.f52381L.m213810E2()).mo118373p()) {
            if (pkData.isPlaying()) {
                ua80.m195160b(this.f52380K, this.f52381L);
                bnl0.m105524M(this.f52380K, true);
                c680.m108114n(getContext(), this.f52380K, this);
                return;
            }
            return;
        }
        if (pkData.isPking()) {
            boolean zM108113l = c680.m108113l(pkData);
            bnl0.m105524M(this.f52380K, zM108113l);
            this.f52380K.setSelected(zM108113l);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m77205Y(final String str, final List<String> list, final List<String> list2) {
        final long[] jArr = {0, 0};
        jyb.m147537z(list, new y20() { // from class: l.lb80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130788a.m77194M(jArr, list2, list, str, (String) obj);
            }
        });
        this.f52387a.m77332b(jArr[0], jArr[1], false, false);
        n180.m161097n(this.f52387a, jArr[0], jArr[1]);
        this.f52381L.m184862Y3();
    }

    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void m77193L(PkData pkData) {
        bnl0.m105524M(this.f52404r, true);
        bnl0.m105524M(this.f52412z, true);
        if (pkData.f52415pk.situation.isTied) {
            this.f52405s.setImageResource(obc0.f146183S5);
            this.f52371B.setImageResource(obc0.f146183S5);
        } else {
            boolean zM96577l = a9g0.m96577l(pkData.otherUserId(), pkData.f52415pk.situation.winnerId);
            this.f52405s.setImageResource(zM96577l ? obc0.f146226W4 : obc0.f146161Q5);
            this.f52371B.setImageResource(zM96577l ? obc0.f146161Q5 : obc0.f146226W4);
            fhw.m125605a("LivePkConstant", "pkInfo anchorWinTimes:" + pkData.getAnchorWinTimes() + ",otherWinTimes:" + pkData.getOtherWinTimes());
        }
        m77208b0(pkData);
    }

    /* JADX INFO: renamed from: a0 */
    public void m77207a0(PkBountyData pkBountyData) {
        if (pkBountyData == null) {
            return;
        }
        bnl0.m105524M(this.f52411y, true);
        bnl0.m105524M(this.f52375F, true);
        this.f52411y.setBackgroundResource(obc0.f146054H4);
        this.f52375F.setBackgroundResource(obc0.f146054H4);
        m77199S(this.f52411y, pkBountyData.getAnchorBounty());
        m77199S(this.f52375F, pkBountyData.getOtherBounty());
    }

    /* JADX INFO: renamed from: b0 */
    public final void m77208b0(PkData pkData) {
        this.f52407u.m77506e();
        this.f52370A.m77506e();
        if (!pkData.isBountyPk() && zrv.m221193k().m203539V4() && pkData.showWinTimesTag) {
            if (pkData.f52415pk.situation.isTied) {
                this.f52407u.m77504c(pkData.getAnchorWinTimes());
                this.f52370A.m77504c(pkData.getOtherWinTimes());
            } else if (a9g0.m96577l(pkData.otherUserId(), pkData.f52415pk.situation.winnerId)) {
                this.f52370A.m77505d(pkData.getOtherWinTimes());
                this.f52407u.m77503b(pkData.getAnchorWinTimes());
            } else {
                this.f52407u.m77505d(pkData.getAnchorWinTimes());
                this.f52370A.m77503b(pkData.getOtherWinTimes());
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m77209c0() {
        this.f52390d.setBackgroundResource(obc0.f146529w);
        bnl0.m105524M(this.f52389c, false);
        bnl0.m105524M(this.f52388b, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m77210d0(PkBountyData pkBountyData) {
        if (pkBountyData == null) {
            return false;
        }
        AbstractC18340l4 abstractC18340l4M207509d = wqe.m207509d("svga");
        BLivePkBountyResource anchorResource = pkBountyData.getAnchorResource();
        if (anchorResource == null) {
            return false;
        }
        return !TextUtils.isEmpty(abstractC18340l4M207509d.mo144686b(ere.m122146i().m122151h(anchorResource.resourceId)));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m77211e0() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52387a.getLayoutParams();
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = qa00.m175859d(20.0f);
        this.f52387a.setLayoutParams(layoutParams);
        m77196P(false);
    }

    /* JADX INFO: renamed from: f0 */
    public void m77212f0() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52387a.getLayoutParams();
        layoutParams.gravity = 48;
        layoutParams.topMargin = qa00.m175859d(45.0f);
        this.f52387a.setLayoutParams(layoutParams);
        m77196P(true);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m77213g0() {
        bnl0.m105524M(this.f52379J, false);
        bnl0.m105524M(this.f52393g, false);
        bnl0.m105524M(this.f52404r, false);
        bnl0.m105524M(this.f52412z, false);
        m77189B();
        this.f52410x.m77348p0();
    }

    public View getFollowView() {
        return this.f52386Q ? this.f52403q : this.f52402p;
    }

    public String getWithdrawSVGAUrl() {
        return xau.m209897B() ? "https://auto.tancdn.com/v1/raw/03d44a3b-6cb4-4bc1-bf0a-36fdef9e62f610.so" : "https://auto.tancdn.com/v1/raw/ba848057-1f40-41ee-b4ba-5f13b78c2cfe11.so";
    }

    /* JADX INFO: renamed from: i0 */
    public void m77214i0(boolean z) {
        bnl0.m105524M(this.f52393g, z);
        bnl0.m105524M(this.f52392f, !z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m77215j0(boolean z) {
        bnl0.m105524M(this.f52379J, z);
    }

    /* JADX INFO: renamed from: k0 */
    public void m77216k0(PkData pkData) {
        C13070a c13070a = new C13070a(pkData);
        if (pkData.f52415pk.situation.isTied) {
            this.f52409w.mo69685l(getWithdrawSVGAUrl(), 1, c13070a);
            this.f52374E.mo69685l(getWithdrawSVGAUrl(), 1, c13070a);
        } else {
            boolean zM96577l = a9g0.m96577l(pkData.otherUserId(), pkData.f52415pk.situation.winnerId);
            this.f52409w.mo69685l(m77228x(!zM96577l), 1, c13070a);
            this.f52374E.mo69685l(m77228x(zM96577l), 1, c13070a);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m77217l0(int i) {
        m77223q();
        if (i <= 0) {
            m77209c0();
            if (this.f52381L.f166543i.m134135N3().isPlaying()) {
                m77214i0(true);
                this.f52410x.m77348p0();
                this.f52381L.m184865b4();
                return;
            }
            return;
        }
        if (!bnl0.m105529O0(this.f52389c)) {
            bnl0.m105524M(this.f52389c, true);
            bnl0.m105524M(this.f52388b, true);
            bnl0.m105524M(this.f52392f, true);
            this.f52390d.measure(dox.m117367e(), dox.m117364b(qa00.m175859d(26.0f)));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52389c.getLayoutParams();
            layoutParams.width = this.f52390d.getMeasuredWidth();
            layoutParams.height = this.f52390d.getMeasuredHeight();
            this.f52389c.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f52388b.getLayoutParams();
            layoutParams2.width = this.f52390d.getMeasuredWidth();
            layoutParams2.height = this.f52390d.getMeasuredHeight();
            this.f52388b.setLayoutParams(layoutParams2);
            this.f52389c.setBackgroundResource(obc0.f146530w0);
            this.f52388b.setBackgroundResource(obc0.f146530w0);
            this.f52390d.setBackgroundResource(obc0.f146132Na);
        }
        View view = this.f52389c;
        Property<View, Float> property = gt0.f106354i;
        Interpolator interpolator = gt0.f106346a;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(view, property, 0L, 1000L, interpolator, 1.0f, 1.3f, 1.0f), gt0.m132170p(this.f52388b, "alpha", 0L, 1000L, new LinearInterpolator(), 1.0f, 0.0f), gt0.m132170p(this.f52388b, "scaleX", 0L, 1000L, interpolator, 1.0f, 1.3f, 1.4f), gt0.m132170p(this.f52388b, "scaleY", 0L, 1000L, interpolator, 1.0f, 1.3f, 1.75f));
        this.f52382M = animatorM132180z;
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: m0 */
    public void m77218m0(boolean z) {
        bnl0.m105524M(this.f52380K, z);
        m77220n0(z);
    }

    /* JADX INFO: renamed from: n */
    public final void m77219n(View view) {
        hc80.m134449a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public void m77220n0(boolean z) {
        this.f52380K.setSelected(z);
    }

    /* JADX INFO: renamed from: o0 */
    public void m77221o0(int i) {
        this.f52392f.m77333a(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m77223q();
        if (NullChecker.m82486a(this.f52385P)) {
            this.f52385P.cancel();
            this.f52385P = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77219n(this);
        m77187r();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(s680 s680Var) {
        this.f52381L = s680Var;
    }

    /* JADX INFO: renamed from: q */
    public void m77223q() {
        Animator animator = this.f52382M;
        if (animator != null) {
            animator.cancel();
            this.f52382M = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public void m77224s(boolean z, User user, boolean z2) {
        if (!z) {
            afu.m97555d(this.f52381L.mo78457R2(), tfs.m190969k().m190972b(this.f52381L.m213810E2(), false).m190975e("live_pk_main").m190978h(user.f56859id).m190971a());
        }
        if (z) {
            if (z2) {
                m77227w();
                return;
            } else {
                m77189B();
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams = getFollowView().getLayoutParams();
        if (this.f52386Q) {
            layoutParams.width = qa00.m175859d(12.0f) + ynp0.m216942s(10, getContext().getString(R$string.f47475D4));
        } else {
            layoutParams.width = getResources().getDimensionPixelSize(iac0.f113580b);
        }
        getFollowView().setLayoutParams(layoutParams);
        getFollowView().setAlpha(1.0f);
        bnl0.m105524M(getFollowView(), true);
        this.f52401o.setPadding(0, 0, bnl0.m105587w(4.0f), 0);
        i4g0.m138492A("e_pk_adverseprofile_button", this.f52381L.mo78457R2(), jyb.m147494Y("liveId", ((dw40) this.f52381L.m213810E2()).m202191k()));
    }

    /* JADX INFO: renamed from: u */
    public final List<PkContributor> m77225u(boolean z, List<BLivePkContributor> list, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            BLivePkContributor bLivePkContributor = null;
            if (!jyb.m147479J(list) && list.size() > i) {
                bLivePkContributor = list.get(i);
            }
            PkContributor success = new PkContributor().setHost(z).setRank(i).setPunishStage(z2).setTied(z3).setSuccess(z4);
            if (NullChecker.m82486a(bLivePkContributor)) {
                success = success.setAvatarUrl(bLivePkContributor.image).setUserId(bLivePkContributor.userId).setScore(bLivePkContributor.point);
            }
            arrayList.add(success);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public void m77226v() {
        this.f52381L.m213811F2().ChatEvent.changeInputSize().mo199273j(new Size(0, pae.f151257a));
        n180.m161093j("pkView endPk");
        m77223q();
        m77230z();
        this.f52387a.m77331a();
        m77209c0();
        m77213g0();
        this.f52380K.setSelected(false);
    }

    /* JADX INFO: renamed from: w */
    public final void m77227w() {
        if (NullChecker.m82486a(this.f52385P) && this.f52385P.isStarted()) {
            return;
        }
        Animator animatorM132168n = gt0.m132168n(getFollowView(), View.ALPHA, 1.0f, 0.0f);
        animatorM132168n.setDuration(300L);
        Animator animatorM132169o = gt0.m132169o(getFollowView(), it0.f116781n, getFollowView().getWidth(), 0);
        animatorM132169o.setDuration(300L);
        animatorM132169o.setStartDelay(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f52385P = animatorSet;
        animatorSet.play(animatorM132168n).with(animatorM132169o);
        this.f52385P.setDuration(500L);
        this.f52385P.start();
        gt0.m132160f(this.f52385P, new Runnable() { // from class: l.kb80
            @Override // java.lang.Runnable
            public final void run() {
                this.f124763a.m77191E();
            }
        });
        this.f52401o.setPadding(0, 0, bnl0.m105587w(8.0f), 0);
    }

    /* JADX INFO: renamed from: x */
    public String m77228x(boolean z) {
        if (z) {
            return xau.m209897B() ? "https://auto.tancdn.com/v1/raw/9eed85f0-5fe1-4b0f-95cc-62e8487779e710.so" : "https://auto.tancdn.com/v1/raw/b4b99d72-60fe-4981-9c2f-ddea917d35ed10.so";
        }
        return xau.m209897B() ? "https://auto.tancdn.com/v1/raw/bb18850a-2de2-4b87-8b20-cbf4a1e252f311.so" : "https://auto.tancdn.com/v1/raw/ec10154f-9a3c-4139-a345-babc7e5eaae711.so";
    }

    /* JADX INFO: renamed from: y */
    public SpannableStringBuilder m77229y(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(3), Color.parseColor("#ffc73e")), 0, 1, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(3), Color.parseColor("#ffc73e")), 1, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public void m77230z() {
        bnl0.m105524M(this, false);
    }

    public PkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
