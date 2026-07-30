package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLivePKBufferInfo;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p046p1.mobile.putong.live.base.data.BLivePkBountyResource;
import com.p046p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p046p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p046p1.mobile.putong.live.base.data.BLivePkPointList;
import com.p046p1.mobile.putong.live.base.data.BLivePkSituation;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkAction;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkBountyData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkContributor;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.AutoVisibleEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkCursorView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkDecorateView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkMagnetCardView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkScoreView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkFirstGiftView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty.PkBountyView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.AbstractC18387m4;
import p149l.a480;
import p149l.ap0;
import p149l.aqe;
import p149l.b2c0;
import p149l.bmf0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.e30;
import p149l.el70;
import p149l.f26;
import p149l.h1c0;
import p149l.hfw;
import p149l.ht70;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.l9e;
import p149l.m280;
import p149l.mm70;
import p149l.mp70;
import p149l.mqi0;
import p149l.n080;
import p149l.o280;
import p149l.pn40;
import p149l.qqi0;
import p149l.s7m;
import p149l.sds;
import p149l.spe;
import p149l.t0g0;
import p149l.t100;
import p149l.uep0;
import p149l.vdt;
import p149l.vwb;
import p149l.wx70;
import p149l.xdl0;
import p149l.xlf0;
import p149l.ypv;
import p149l.zcu;
import p149l.zvf0;

/* JADX INFO: loaded from: classes5.dex */
public class PkViewInternal extends FrameLayout implements s7m<mp70> {

    /* JADX INFO: renamed from: A */
    public VImage f51568A;

    /* JADX INFO: renamed from: B */
    public RecyclerView f51569B;

    /* JADX INFO: renamed from: C */
    public AutoVisibleEffectPlayer f51570C;

    /* JADX INFO: renamed from: D */
    public PkFirstGiftView f51571D;

    /* JADX INFO: renamed from: E */
    public VText f51572E;

    /* JADX INFO: renamed from: E0 */
    public boolean f51573E0;

    /* JADX INFO: renamed from: F */
    public VDraweeView f51574F;

    /* JADX INFO: renamed from: F0 */
    public boolean f51575F0;

    /* JADX INFO: renamed from: G */
    public LinearLayout f51576G;

    /* JADX INFO: renamed from: G0 */
    public String f51577G0;

    /* JADX INFO: renamed from: H */
    public PkWinTimesViewInternal f51578H;

    /* JADX INFO: renamed from: H0 */
    public m280 f51579H0;

    /* JADX INFO: renamed from: I */
    public VImage f51580I;

    /* JADX INFO: renamed from: I0 */
    public n080 f51581I0;

    /* JADX INFO: renamed from: J */
    public RecyclerView f51582J;

    /* JADX INFO: renamed from: J0 */
    public el70 f51583J0;

    /* JADX INFO: renamed from: K */
    public AutoVisibleEffectPlayer f51584K;

    /* JADX INFO: renamed from: L */
    public VText f51585L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f51586M;

    /* JADX INFO: renamed from: N */
    public PkBountyView f51587N;

    /* JADX INFO: renamed from: O */
    public AutoVisibleEffectPlayer f51588O;

    /* JADX INFO: renamed from: P */
    public VButton f51589P;

    /* JADX INFO: renamed from: Q */
    public VText f51590Q;

    /* JADX INFO: renamed from: R */
    public AnimEffectPlayer f51591R;

    /* JADX INFO: renamed from: S */
    public VImage f51592S;

    /* JADX INFO: renamed from: T */
    public mp70 f51593T;

    /* JADX INFO: renamed from: U */
    public f26 f51594U;

    /* JADX INFO: renamed from: V */
    public f26 f51595V;

    /* JADX INFO: renamed from: W */
    public AnimatorSet f51596W;

    /* JADX INFO: renamed from: a */
    public LivePkDecorateView f51597a;

    /* JADX INFO: renamed from: b */
    public LivePkScoreView f51598b;

    /* JADX INFO: renamed from: c */
    public LivePkCursorView f51599c;

    /* JADX INFO: renamed from: d */
    public LivePkMagnetCardView f51600d;

    /* JADX INFO: renamed from: e */
    public View f51601e;

    /* JADX INFO: renamed from: f */
    public View f51602f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f51603g;

    /* JADX INFO: renamed from: h */
    public VImage f51604h;

    /* JADX INFO: renamed from: i */
    public TextView f51605i;

    /* JADX INFO: renamed from: j */
    public TextView f51606j;

    /* JADX INFO: renamed from: k */
    public View f51607k;

    /* JADX INFO: renamed from: k0 */
    public boolean f51608k0;

    /* JADX INFO: renamed from: l */
    public VImage f51609l;

    /* JADX INFO: renamed from: m */
    public View f51610m;

    /* JADX INFO: renamed from: n */
    public View f51611n;

    /* JADX INFO: renamed from: o */
    public VText f51612o;

    /* JADX INFO: renamed from: p */
    public VText f51613p;

    /* JADX INFO: renamed from: p0 */
    public boolean f51614p0;

    /* JADX INFO: renamed from: q */
    public VImage f51615q;

    /* JADX INFO: renamed from: r */
    public ConstraintLayout f51616r;

    /* JADX INFO: renamed from: s */
    public View f51617s;

    /* JADX INFO: renamed from: t */
    public Space f51618t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f51619u;

    /* JADX INFO: renamed from: v */
    public VText f51620v;

    /* JADX INFO: renamed from: w */
    public VImage f51621w;

    /* JADX INFO: renamed from: x */
    public VText f51622x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f51623y;

    /* JADX INFO: renamed from: z */
    public PkWinTimesViewInternal f51624z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.internal.PkViewInternal$a */
    public class C12908a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PkData f51625a;

        public C12908a(PkData pkData) {
            this.f51625a = pkData;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            if (this.f51625a.isRankPk()) {
                n080 n080Var = PkViewInternal.this.f51581I0;
                mp70 mp70Var = PkViewInternal.this.f51593T;
                final PkData pkData = this.f51625a;
                n080Var.m157255e(mp70Var, pkData, new d30() { // from class: l.z380
                    @Override // p149l.d30
                    public final void call() {
                        this.f201320a.m76131j(pkData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m76131j(PkData pkData) {
            PkViewInternal.this.m76114l0(pkData);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.internal.PkViewInternal$b */
    public class C12909b extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PkData f51627a;

        public C12909b(PkData pkData) {
            this.f51627a = pkData;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            PkViewInternal.this.m76100V(this.f51627a);
        }
    }

    public PkViewInternal(Context context) {
        super(context);
        this.f51614p0 = false;
        this.f51573E0 = false;
        this.f51575F0 = false;
        this.f51577G0 = "";
        this.f51579H0 = new m280();
        this.f51581I0 = new n080();
        this.f51583J0 = new el70();
    }

    /* JADX INFO: renamed from: A */
    private List<PkContributor> m76056A(boolean z, List<BLivePkContributor> list, boolean z2, boolean z3, boolean z4) {
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

    /* JADX INFO: renamed from: C */
    private void m76057C() {
        if (NullChecker.m81303a(this.f51596W) && this.f51596W.isStarted()) {
            return;
        }
        Animator animatorM103741n = bt0.m103741n(getFollowView(), View.ALPHA, 1.0f, 0.0f);
        animatorM103741n.setDuration(300L);
        Animator animatorM103742o = bt0.m103742o(getFollowView(), dt0.f87802n, getFollowView().getWidth(), 0);
        animatorM103742o.setDuration(300L);
        animatorM103742o.setStartDelay(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f51596W = animatorSet;
        animatorSet.play(animatorM103741n).with(animatorM103742o);
        this.f51596W.setDuration(500L);
        this.f51596W.start();
        bt0.m103733f(this.f51596W, new Runnable() { // from class: l.m380
            @Override // java.lang.Runnable
            public final void run() {
                this.f131027a.m76098L();
            }
        });
        this.f51620v.setPadding(0, 0, xdl0.m208407w(8.0f), 0);
    }

    /* JADX INFO: renamed from: E */
    public static int m76058E(long j, int i) {
        return (int) (((long) i) - (((long) (mqi0.m155944o() - (j / 1000000.0d))) / 1000));
    }

    /* JADX INFO: renamed from: F */
    public static int m76059F(BLivePKCardItem bLivePKCardItem) {
        return m76058E(bLivePKCardItem.startTs, bLivePKCardItem.duration);
    }

    /* JADX INFO: renamed from: I */
    private void m76060I() {
        xdl0.m208344M(this.f51572E, false);
        xdl0.m208344M(this.f51585L, false);
    }

    /* JADX INFO: renamed from: J */
    private void m76061J() {
        xdl0.m208344M(getFollowView(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m76062M(View view) {
        this.f51593T.mo119102V3(PkAction.ACTION_FOLLOW_USER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m76063N(View view) {
        this.f51593T.mo119102V3(PkAction.ACTION_PK_ONCE_MORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m76064O(View view) {
        this.f51593T.mo119102V3(PkAction.ACTION_PK_EXIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m76065P(Boolean bool) {
        this.f51592S.setSelected(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m76066Q(View view) {
        boolean zIsSelected = this.f51592S.isSelected();
        this.f51593T.mo119104m4(!zIsSelected, this.f51620v.getText().toString(), new e30() { // from class: l.x380
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190873a.m76065P((Boolean) obj);
            }
        });
        o280.m162288a(this.f51593T, !zIsSelected);
        ht70.m132847d(this.f51593T, zIsSelected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m76067R(View view) {
        this.f51593T.mo119102V3(PkAction.ACTION_SHOW_USER_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m76068S(View view) {
        mm70.m155305a(this.f51593T, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m76069T(View view) {
        mm70.m155305a(this.f51593T, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m76070Y(PkContributor pkContributor) {
        mp70 mp70Var = this.f51593T;
        if (mp70Var != null) {
            mp70Var.m155792k4(pkContributor);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    private void m76078i0(PkData pkData) {
        if (((pn40) this.f51593T.m206027E2()).mo97490p()) {
            if (pkData.isPlaying()) {
                o280.m162289b(this.f51592S, this.f51593T);
                xdl0.m208344M(this.f51592S, true);
                wx70.m205913n(getContext(), this.f51592S, this);
                return;
            }
            return;
        }
        if (pkData.isPking()) {
            boolean zM205912l = wx70.m205912l(pkData);
            xdl0.m208344M(this.f51592S, zM205912l);
            this.f51592S.setSelected(zM205912l);
        }
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m76084o0(PkBountyData pkBountyData) {
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

    /* JADX INFO: renamed from: r */
    private void m76087r() {
        this.f51608k0 = vdt.m198092b(2);
        m76061J();
        xdl0.m208329E0(getFollowView(), new View.OnClickListener() { // from class: l.l380
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125851a.m76062M(view);
            }
        });
        xdl0.m208329E0(this.f51589P, new View.OnClickListener() { // from class: l.q380
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152387a.m76063N(view);
            }
        });
        xdl0.m208329E0(this.f51609l, new View.OnClickListener() { // from class: l.r380
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157512a.m76064O(view);
            }
        });
        xdl0.m208329E0(this.f51592S, new View.OnClickListener() { // from class: l.s380
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162082a.m76066Q(view);
            }
        });
        xdl0.m208329E0(this.f51616r, new View.OnClickListener() { // from class: l.t380
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167601a.m76067R(view);
            }
        });
        xdl0.m208329E0(this.f51610m, new View.OnClickListener() { // from class: l.u380
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173583a.m76068S(view);
            }
        });
        xdl0.m208329E0(this.f51611n, new View.OnClickListener() { // from class: l.v380
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179755a.m76069T(view);
            }
        });
        int i = t100.f167256e;
        bmf0 bmf0Var = new bmf0(i, 0);
        this.f51569B.setLayoutManager(new LinearLayoutManager(getContext(), 0, true));
        this.f51569B.addItemDecoration(bmf0Var);
        xlf0 xlf0Var = new xlf0(i, 0);
        this.f51582J.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f51582J.addItemDecoration(xlf0Var);
        m76060I();
        xdl0.m208344M(this.f51587N, false);
        this.f51598b.setCursorListener(new e30() { // from class: l.w380
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184316a.m76099U((Float) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    private void m76088r0() {
        xdl0.m208344M(this.f51589P, false);
        xdl0.m208344M(this.f51606j, false);
        xdl0.m208344M(this.f51568A, false);
        xdl0.m208344M(this.f51580I, false);
        xdl0.m208344M(this.f51624z, false);
        xdl0.m208344M(this.f51578H, false);
        m76061J();
        this.f51571D.m76165p0();
    }

    /* JADX INFO: renamed from: s0 */
    private void m76090s0() {
        int iM193329p = ((uep0.m193329p() * 804) / 1080) + t100.m186890d(64.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        if (this.f51593T.m206032L2()) {
            layoutParams.topMargin = t100.m186890d(160.0f);
        } else {
            layoutParams.topMargin = t100.m186890d(130.0f);
        }
        layoutParams.width = uep0.m193329p();
        layoutParams.height = iM193329p;
        setLayoutParams(layoutParams);
        post(new Runnable() { // from class: l.p380
            @Override // java.lang.Runnable
            public final void run() {
                this.f146969a.m76102X();
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public void m76093A0(int i) {
        if (!TextUtils.equals(this.f51605i.getText(), "00:00") || i >= 0) {
            List<String> listM175933a = qqi0.m175933a(i * 1000);
            this.f51605i.setText(listM175933a.get(1) + ":" + listM175933a.get(2));
        }
    }

    /* JADX INFO: renamed from: B */
    public void m76094B() {
        this.f51593T.m206028F2().ChatEvent.changeInputSize().mo172463j(new Size(0, l9e.f127077a));
        ht70.m132853j("pkView endPk");
        this.f51579H0.m152663a();
        m76096H();
        this.f51598b.m76148a();
        this.f51599c.m76141b();
        this.f51600d.m76146d();
        this.f51579H0.m152664b();
        m76088r0();
        this.f51592S.setSelected(false);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: G */
    public String m76095G(boolean z) {
        return z ? "https://auto.tancdn.com/v1/raw/1e59b30b-025e-4fad-814e-cb38badff31012.svga" : "https://auto.tancdn.com/v1/raw/ad732906-9c77-48a7-b866-1bc5c7f6eef013.svga";
    }

    /* JADX INFO: renamed from: H */
    public void m76096H() {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: K */
    public boolean m76097K() {
        PkData pkDataM180303N3 = this.f51593T.f135015i.m180303N3();
        return (pkDataM180303N3 == null || !pkDataM180303N3.isRankPk()) && this.f51593T.m155789d4() && this.f51598b.getLeftScore() <= 0 && !xdl0.m208349O0(this.f51606j) && this.f51598b.getRightScore() <= 0;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m76098L() {
        xdl0.m208344M(getFollowView(), false);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m76099U(Float f) {
        this.f51599c.setCursorOffset(f.floatValue());
        this.f51600d.setCursorOffset(f.floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m76101W(long[] jArr, List list, List list2, String str, String str2) {
        if (TextUtils.equals(str2, ((pn40) this.f51593T.m206027E2()).m132146l0().f56011id)) {
            jArr[0] = Long.valueOf((String) list.get(list2.indexOf(str2))).longValue();
        }
        if (TextUtils.equals(str2, str)) {
            jArr[1] = Long.valueOf((String) list.get(list2.indexOf(str2))).longValue();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m76102X() {
        this.f51593T.m206028F2().ChatEvent.changeInputSize().mo172463j(new Size(0, Math.min(((((View) getParent()).getHeight() - getBottom()) + ((FrameLayout.LayoutParams) this.f51598b.getLayoutParams()).bottomMargin) - l9e.f127087k, l9e.f127077a)));
    }

    /* JADX INFO: renamed from: Z */
    public void m76103Z() {
        boolean z = xdl0.m208349O0(this.f51611n) || xdl0.m208349O0(this.f51610m);
        int iM186890d = t100.m186890d(43.0f);
        if (this.f51575F0) {
            iM186890d += t100.m186890d(30.0f);
        }
        if (z) {
            iM186890d += t100.m186890d(15.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51616r.getLayoutParams();
        layoutParams.topMargin = iM186890d;
        this.f51616r.setLayoutParams(layoutParams);
        int iM186890d2 = t100.m186890d(73.0f);
        if (this.f51575F0) {
            iM186890d2 += t100.m186890d(30.0f);
        }
        if (z) {
            iM186890d2 += t100.m186890d(15.0f);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f51592S.getLayoutParams();
        layoutParams2.topMargin = iM186890d2;
        this.f51592S.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: a0 */
    public void m76104a0() {
        this.f51570C.m68504n();
        this.f51584K.m68504n();
        xdl0.m208344M(this.f51568A, false);
        xdl0.m208344M(this.f51580I, false);
        xdl0.m208344M(this.f51578H, false);
        xdl0.m208344M(this.f51624z, false);
        this.f51598b.m76148a();
        this.f51579H0.m152663a();
        this.f51599c.m76141b();
        this.f51600d.m76146d();
    }

    /* JADX INFO: renamed from: b0 */
    public void m76105b0() {
        m76107d0(null, -1);
        m76128z();
        this.f51600d.m76146d();
        m76116n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public void m76106c0(final PkData pkData, boolean z, boolean z2) {
        if (!xdl0.m208349O0(this)) {
            zvf0.m220368A("e_pk_adverseprofile_button", this.f51593T.mo77274R2(), vwb.m200311Y("liveId", ((pn40) this.f51593T.m206027E2()).m149814k()));
            if (this.f51593T.m206032L2()) {
                zvf0.m220368A("e_pk_close_button", this.f51593T.mo77274R2(), vwb.m200311Y("liveId", ((pn40) this.f51593T.m206027E2()).m149814k()), vwb.m200311Y("anchorId", ((pn40) this.f51593T.m206027E2()).m132146l0().f56011id));
            }
        }
        if (!xdl0.m208349O0(this)) {
            xdl0.m208344M(this, z2);
        }
        xdl0.m208344M(this.f51568A, false);
        xdl0.m208344M(this.f51580I, false);
        xdl0.m208344M(this.f51609l, this.f51593T.m206032L2());
        xdl0.m208344M(this.f51607k, !this.f51593T.m206032L2());
        xdl0.m208344M(this.f51605i, true);
        xdl0.m208344M(this.f51574F, false);
        xdl0.m208344M(this.f51586M, false);
        this.f51583J0.m117085c(pkData.isBountyPk());
        m76060I();
        m76090s0();
        User userOtherUser = pkData.otherUser();
        if (userOtherUser == null) {
            return;
        }
        xdl0.m208344M(this.f51589P, false);
        hxs.m133405r("context_single_room", this.f51619u, userOtherUser.m60124fp().profileSmall());
        this.f51620v.setText(userOtherUser.name);
        if (pkData.isPunishing()) {
            this.f51604h.setImageResource(i3c0.f110751J5);
            m76121v0((pkData.isRankPk() || pkData.isBountyPk() || !this.f51593T.m206032L2()) ? false : true);
            this.f51579H0.m152664b();
            this.f51579H0.m152663a();
            m76119t0(false);
            if (!z) {
                m76100V(pkData);
            } else if (pkData.isBountyPk() && m76084o0(pkData.getPkBountyData())) {
                this.f51583J0.m117086d(pkData.getPkBountyData(), new d30() { // from class: l.y380
                    @Override // p149l.d30
                    public final void call() {
                        this.f195777a.m76100V(pkData);
                    }
                });
            } else {
                m76123w0(pkData);
            }
            m76114l0(pkData);
            this.f51581I0.m157254d(pkData);
        } else if (pkData.isPlaying()) {
            this.f51604h.setImageResource(i3c0.f110955b5);
            if (pkData.isBountyPk()) {
                this.f51583J0.m117088f(pkData.getPkBountyData());
            }
            if (z) {
                if (pkData.isBountyPk() && m76084o0(pkData.getPkBountyData())) {
                    this.f51583J0.m117087e(pkData.getPkBountyData());
                } else {
                    this.f51588O.mo68502l("https://auto.tancdn.com/v1/raw/d9e41474-7ea7-4f9c-a05e-40b41937f64213.svga", 1, new C12908a(pkData));
                }
            }
        }
        String strOtherUserId = pkData.otherUserId();
        BLivePkPointList bLivePkPointList = pkData.f51567pk.situation.points;
        m76113k0(strOtherUserId, bLivePkPointList.userId, bLivePkPointList.point);
        boolean zEquals = TEnum.equals(pkData.f51567pk.situation.currentStageInfo.stage, BLivePkStage.punishing);
        List<BLivePkContributor> hostContributors = pkData.getHostContributors();
        List<BLivePkContributor> otherContributors = pkData.getOtherContributors();
        BLivePkSituation bLivePkSituation = pkData.f51567pk.situation;
        m76111h0(hostContributors, otherContributors, zEquals, bLivePkSituation.isTied, TextUtils.equals(bLivePkSituation.winnerId, pkData.getAnchorId()));
        m76078i0(pkData);
        this.f51597a.setDecorateData(pkData.f51567pk.pkScoreViewConfig);
        this.f51599c.m76140a(pkData.f51567pk.pkScoreViewConfig.cursorUrl);
    }

    /* JADX INFO: renamed from: d0 */
    public void m76107d0(BLivePKBufferInfo bLivePKBufferInfo, int i) {
        VText vText = this.f51590Q;
        if (bLivePKBufferInfo == null) {
            if (xdl0.m208349O0(vText)) {
                xdl0.m208344M(this.f51590Q, false);
                xdl0.m208344M(this.f51591R, false);
                return;
            }
            return;
        }
        xdl0.m208344M(vText, true);
        if (!this.f51577G0.equals(bLivePKBufferInfo.type)) {
            String str = bLivePKBufferInfo.type;
            this.f51577G0 = str;
            str.getClass();
            switch (str) {
                case "supportTask":
                    this.f51590Q.setBackground(kvc0.m147353b(i3c0.f111010g0));
                    xdl0.m208344M(this.f51591R, true);
                    this.f51591R.m68500j("https://auto.tancdn.com/v1/raw/a00bebb8-f672-4b0a-af83-ebf361a5f54014.so", -1);
                    break;
                case "firstSend":
                case "supportTaskFinished":
                    this.f51590Q.setBackground(kvc0.m147353b(i3c0.f110674D0));
                    xdl0.m208344M(this.f51591R, true);
                    this.f51591R.m68500j("https://auto.tancdn.com/v1/raw/a00bebb8-f672-4b0a-af83-ebf361a5f54014.so", -1);
                    break;
                default:
                    this.f51590Q.setBackground(kvc0.m147353b(i3c0.f111165t));
                    xdl0.m208344M(this.f51591R, false);
                    break;
            }
        }
        String str2 = bLivePKBufferInfo.text;
        if (i < 0 || !bLivePKBufferInfo.showCountdown) {
            boolean z = bLivePKBufferInfo.showCountdown;
            VText vText2 = this.f51590Q;
            if (!z) {
                vText2.setText(str2);
                return;
            } else {
                xdl0.m208344M(vText2, false);
                xdl0.m208344M(this.f51591R, false);
                return;
            }
        }
        String str3 = str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + BLiveStormDanmakuGiftResourceType.f44446s;
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new ForegroundColorSpan(kvc0.m147352a(h1c0.f105416w1)), (str3.length() - String.valueOf(i).length()) - 1, str3.length(), 18);
        this.f51590Q.setText(spannableString);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m76108e0(boolean z, boolean z2) {
        this.f51573E0 = z;
        this.f51614p0 = z2;
        this.f51600d.m76144b(z);
        LivePkScoreView livePkScoreView = this.f51598b;
        livePkScoreView.m76149b(livePkScoreView.getLeftScore(), this.f51598b.getRightScore(), this.f51573E0, z2);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: f0 */
    public void m76109f0(BLivePkOwner bLivePkOwner, boolean z) {
        if (bLivePkOwner == null) {
            if (xdl0.m208349O0(this.f51610m)) {
                m76120u0(z, false);
            }
            if (xdl0.m208349O0(this.f51611n)) {
                m76120u0(z, false);
                return;
            }
            return;
        }
        VText vText = z ? this.f51612o : this.f51613p;
        m76120u0(z, true);
        BLivePKCardItem bLivePKCardItem = bLivePkOwner.itemCardList.get(0);
        if (!bLivePKCardItem.showCountdown) {
            vText.setCompoundDrawables(null, null, null, null);
            vText.setText(bLivePKCardItem.text);
            return;
        }
        Drawable drawableM147353b = kvc0.m147353b(i3c0.f110774L4);
        drawableM147353b.setBounds(0, 0, t100.m186890d(12.0f), t100.m186890d(12.0f));
        vText.setCompoundDrawables(null, null, drawableM147353b, null);
        vText.setText(bLivePKCardItem.text + "生效中(" + m76059F(bLivePKCardItem) + "s)");
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g0 */
    public void m76110g0(List<BLivePKCardItem> list, boolean z) {
        Drawable drawableM147353b;
        int size = list.size();
        VText vText = z ? this.f51612o : this.f51613p;
        m76120u0(z, true);
        if (size == 2) {
            drawableM147353b = kvc0.m147353b(i3c0.f110798N4);
        } else if (size != 3) {
            drawableM147353b = size != 4 ? kvc0.m147353b(i3c0.f110750J4) : kvc0.m147353b(i3c0.f110762K4);
        } else {
            drawableM147353b = kvc0.m147353b(i3c0.f110786M4);
        }
        drawableM147353b.setBounds(0, 0, t100.m186890d(15.0f), t100.m186890d(15.0f));
        Drawable drawableM147353b2 = kvc0.m147353b(i3c0.f110774L4);
        drawableM147353b2.setBounds(0, 0, t100.m186890d(12.0f), t100.m186890d(12.0f));
        vText.setCompoundDrawables(drawableM147353b, null, drawableM147353b2, null);
        vText.setText("张卡片生效中(" + m76059F(list.get(0)) + "s)");
    }

    public View getFollowView() {
        return this.f51608k0 ? this.f51622x : this.f51621w;
    }

    /* JADX INFO: renamed from: h0 */
    public void m76111h0(List<BLivePkContributor> list, List<BLivePkContributor> list2, boolean z, boolean z2, boolean z3) {
        ht70.m132853j("renderContributors isPunishStage:" + z + ",hostContributors:" + list.size() + ",otherContributors: " + list2.size());
        if (this.f51594U == null) {
            f26 f26Var = new f26(new e30() { // from class: l.n380
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136922a.m76070Y((PkContributor) obj);
                }
            });
            this.f51594U = f26Var;
            this.f51569B.setAdapter(f26Var);
        }
        this.f51594U.m119162I(m76056A(true, list, z, z2, z3));
        if (this.f51595V == null) {
            f26 f26Var2 = new f26(new e30() { // from class: l.n380
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136922a.m76070Y((PkContributor) obj);
                }
            });
            this.f51595V = f26Var2;
            this.f51582J.setAdapter(f26Var2);
        }
        this.f51595V.m119162I(m76056A(false, list2, z, z2, !z3));
        mp70 mp70Var = this.f51593T;
        if (mp70Var != null) {
            mp70Var.m155794q4(list, list2);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m76112j0(boolean z, PkData pkData) {
        if (pkData.isRankPk()) {
            return;
        }
        xdl0.m208344M(this.f51624z, false);
        xdl0.m208344M(this.f51578H, false);
        if (!pkData.isBountyPk() && ypv.m215672k().m195752V4() && pkData.showWinTimesTag) {
            this.f51624z.m76133b(z, pkData.getAnchorWinTimes());
            this.f51578H.m76133b(z, pkData.getOtherWinTimes());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m76113k0(final String str, final List<String> list, final List<String> list2) {
        final long[] jArr = {0, 0};
        vwb.m200354z(list, new e30() { // from class: l.o380
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141631a.m76101W(jArr, list2, list, str, (String) obj);
            }
        });
        this.f51598b.m76149b(jArr[0], jArr[1], this.f51573E0, this.f51614p0);
        ht70.m132857n(this.f51598b, jArr[0], jArr[1]);
        this.f51593T.m155786Y3();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m76114l0(PkData pkData) {
        if (pkData.isRankPk()) {
            boolean zIsPlaying = pkData.isPlaying();
            PkWinTimesViewInternal pkWinTimesViewInternal = this.f51624z;
            if (zIsPlaying) {
                pkWinTimesViewInternal.m76133b(true, pkData.getAnchorWinTimes());
                this.f51578H.m76133b(true, pkData.getOtherWinTimes());
            } else {
                xdl0.m208344M(pkWinTimesViewInternal, false);
                xdl0.m208344M(this.f51578H, false);
            }
        }
    }

    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void m76100V(PkData pkData) {
        xdl0.m208344M(this.f51568A, true);
        xdl0.m208344M(this.f51580I, true);
        if (pkData.f51567pk.situation.isTied) {
            this.f51568A.setImageResource(i3c0.f110844R5);
            this.f51580I.setImageResource(i3c0.f110844R5);
        } else {
            boolean zM186871l = t0g0.m186871l(pkData.otherUserId(), pkData.f51567pk.situation.winnerId);
            this.f51568A.setImageResource(zM186871l ? i3c0.f110887V4 : i3c0.f110822P5);
            this.f51580I.setImageResource(zM186871l ? i3c0.f110822P5 : i3c0.f110887V4);
            hfw.m130790a("LivePkConstant", "pkInfo anchorWinTimes:" + pkData.getAnchorWinTimes() + ",otherWinTimes:" + pkData.getOtherWinTimes());
        }
        if (pkData.isRankPk()) {
            return;
        }
        m76112j0(true, pkData);
    }

    /* JADX INFO: renamed from: n0 */
    public void m76116n0() {
        this.f51614p0 = false;
        this.f51573E0 = false;
        LivePkScoreView livePkScoreView = this.f51598b;
        livePkScoreView.m76149b(livePkScoreView.getLeftScore(), this.f51598b.getRightScore(), false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f51579H0.m152663a();
        if (NullChecker.m81303a(this.f51596W)) {
            this.f51596W.cancel();
            this.f51596W = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76122w(this);
        m76087r();
        this.f51579H0 = new m280(this.f51601e, this.f51602f, this.f51603g, this.f51605i);
        this.f51581I0 = new n080(this.f51570C, this.f51584K, this.f51574F, this.f51586M);
        this.f51583J0 = new el70(this.f51587N, this.f51572E, this.f51585L);
    }

    /* JADX INFO: renamed from: p0 */
    public void m76117p0() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51598b.getLayoutParams();
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = t100.m186890d(20.0f);
        this.f51598b.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f51599c.getLayoutParams();
        layoutParams2.gravity = 80;
        layoutParams2.topMargin = t100.m186890d(10.0f);
        this.f51599c.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f51597a.getLayoutParams();
        layoutParams3.gravity = 80;
        layoutParams3.topMargin = t100.m186890d(10.0f);
        this.f51597a.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f51600d.getLayoutParams();
        layoutParams4.gravity = 80;
        layoutParams4.bottomMargin = t100.m186890d(20.0f);
        this.f51600d.setLayoutParams(layoutParams4);
        this.f51575F0 = false;
        m76103Z();
    }

    /* JADX INFO: renamed from: q0 */
    public void m76118q0() {
        boolean z = xdl0.m208349O0(this.f51611n) || xdl0.m208349O0(this.f51610m);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51598b.getLayoutParams();
        layoutParams.gravity = 48;
        layoutParams.topMargin = z ? t100.m186890d(57.0f) : t100.m186890d(47.0f);
        this.f51598b.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f51599c.getLayoutParams();
        layoutParams2.gravity = 48;
        layoutParams2.topMargin = z ? t100.m186890d(47.0f) : t100.m186890d(37.0f);
        this.f51599c.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f51597a.getLayoutParams();
        layoutParams3.gravity = 48;
        layoutParams3.topMargin = z ? t100.m186890d(47.0f) : t100.m186890d(37.0f);
        this.f51597a.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f51600d.getLayoutParams();
        layoutParams4.gravity = 48;
        layoutParams4.topMargin = z ? t100.m186890d(57.0f) : t100.m186890d(47.0f);
        this.f51600d.setLayoutParams(layoutParams4);
        this.f51575F0 = true;
        m76103Z();
    }

    /* JADX INFO: renamed from: t0 */
    public void m76119t0(boolean z) {
        xdl0.m208344M(this.f51606j, z);
        xdl0.m208344M(this.f51605i, !z);
    }

    /* JADX INFO: renamed from: u0 */
    public void m76120u0(boolean z, boolean z2) {
        if (z) {
            xdl0.m208344M(this.f51610m, z2);
            xdl0.m208344M(this.f51612o, z2);
        } else {
            xdl0.m208344M(this.f51611n, z2);
            xdl0.m208344M(this.f51613p, z2);
        }
        if (this.f51575F0) {
            m76118q0();
        } else {
            m76117p0();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m76121v0(boolean z) {
        xdl0.m208344M(this.f51589P, z);
    }

    /* JADX INFO: renamed from: w */
    public final void m76122w(View view) {
        a480.m94829a(this, view);
    }

    /* JADX INFO: renamed from: w0 */
    public void m76123w0(PkData pkData) {
        boolean zM186871l = t0g0.m186871l(pkData.otherUserId(), pkData.f51567pk.situation.winnerId);
        if (pkData.isRankPk()) {
            this.f51581I0.m157256f(this.f51593T, pkData, zM186871l, this);
            return;
        }
        C12909b c12909b = new C12909b(pkData);
        boolean z = pkData.f51567pk.situation.isTied;
        AutoVisibleEffectPlayer autoVisibleEffectPlayer = this.f51570C;
        if (z) {
            autoVisibleEffectPlayer.mo68502l("https://auto.tancdn.com/v1/raw/8f12e6b0-762c-4bf7-8733-7f8801aed51013.svga", 1, c12909b);
            this.f51584K.mo68502l("https://auto.tancdn.com/v1/raw/8f12e6b0-762c-4bf7-8733-7f8801aed51013.svga", 1, c12909b);
        } else {
            autoVisibleEffectPlayer.mo68502l(m76095G(!zM186871l), 1, c12909b);
            this.f51584K.mo68502l(m76095G(zM186871l), 1, c12909b);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(mp70 mp70Var) {
        this.f51593T = mp70Var;
    }

    /* JADX INFO: renamed from: x0 */
    public void m76125x0(int i) {
        this.f51579H0.m152663a();
        m280 m280Var = this.f51579H0;
        if (i > 0) {
            m280Var.m152665c();
            return;
        }
        m280Var.m152664b();
        if (this.f51593T.f135015i.m180303N3().isPlaying()) {
            m76119t0(true);
            this.f51571D.m76165p0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public void m76126y(boolean z, User user, boolean z2) {
        if (!z) {
            zcu.m218089d(this.f51593T.mo77274R2(), sds.m183540k().m183543b(this.f51593T.m206027E2(), false).m183546e("live_pk_main").m183549h(user.f56011id).m183542a());
        }
        if (z) {
            if (z2) {
                m76057C();
                return;
            } else {
                m76061J();
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams = getFollowView().getLayoutParams();
        if (this.f51608k0) {
            layoutParams.width = t100.m186890d(12.0f) + uep0.m193332s(10, getContext().getString(R$string.f46627D4));
        } else {
            layoutParams.width = getResources().getDimensionPixelSize(b2c0.f72684b);
        }
        getFollowView().setLayoutParams(layoutParams);
        getFollowView().setAlpha(1.0f);
        xdl0.m208344M(getFollowView(), true);
        this.f51620v.setPadding(0, 0, xdl0.m208407w(4.0f), 0);
        zvf0.m220368A("e_pk_adverseprofile_button", this.f51593T.mo77274R2(), vwb.m200311Y("liveId", ((pn40) this.f51593T.m206027E2()).m149814k()));
    }

    /* JADX INFO: renamed from: y0 */
    public void m76127y0(boolean z) {
        xdl0.m208344M(this.f51592S, z);
        m76129z0(z);
    }

    /* JADX INFO: renamed from: z */
    public void m76128z() {
        m76120u0(false, false);
        m76120u0(true, false);
    }

    /* JADX INFO: renamed from: z0 */
    public void m76129z0(boolean z) {
        this.f51592S.setSelected(z);
    }

    public PkViewInternal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51614p0 = false;
        this.f51573E0 = false;
        this.f51575F0 = false;
        this.f51577G0 = "";
        this.f51579H0 = new m280();
        this.f51581I0 = new n080();
        this.f51583J0 = new el70();
    }

    public PkViewInternal(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51614p0 = false;
        this.f51573E0 = false;
        this.f51575F0 = false;
        this.f51577G0 = "";
        this.f51579H0 = new m280();
        this.f51581I0 = new n080();
        this.f51583J0 = new el70();
    }
}
