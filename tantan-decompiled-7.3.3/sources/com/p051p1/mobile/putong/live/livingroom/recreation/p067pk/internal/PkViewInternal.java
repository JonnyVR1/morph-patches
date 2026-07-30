package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal;

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
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLivePKBufferInfo;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p051p1.mobile.putong.live.base.data.BLivePkBountyResource;
import com.p051p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p051p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p051p1.mobile.putong.live.base.data.BLivePkPointList;
import com.p051p1.mobile.putong.live.base.data.BLivePkSituation;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkAction;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkBountyData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkContributor;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.AutoVisibleEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkCursorView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkDecorateView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkMagnetCardView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkScoreView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkFirstGiftView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty.PkBountyView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.AbstractC18340l4;
import p153l.a9g0;
import p153l.afu;
import p153l.bnl0;
import p153l.c680;
import p153l.dw40;
import p153l.ere;
import p153l.fhw;
import p153l.gc80;
import p153l.gt0;
import p153l.guf0;
import p153l.i4g0;
import p153l.iac0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.jyb;
import p153l.k36;
import p153l.kt70;
import p153l.kuf0;
import p153l.n180;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.pae;
import p153l.pzi0;
import p153l.qa00;
import p153l.sa80;
import p153l.su70;
import p153l.sx70;
import p153l.t880;
import p153l.tfs;
import p153l.tzi0;
import p153l.ua80;
import p153l.wft;
import p153l.wo0;
import p153l.wqe;
import p153l.x20;
import p153l.y20;
import p153l.ynp0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class PkViewInternal extends FrameLayout implements iam<sx70> {

    /* JADX INFO: renamed from: A */
    public VImage f52416A;

    /* JADX INFO: renamed from: B */
    public RecyclerView f52417B;

    /* JADX INFO: renamed from: C */
    public AutoVisibleEffectPlayer f52418C;

    /* JADX INFO: renamed from: D */
    public PkFirstGiftView f52419D;

    /* JADX INFO: renamed from: E */
    public VText f52420E;

    /* JADX INFO: renamed from: E0 */
    public boolean f52421E0;

    /* JADX INFO: renamed from: F */
    public VDraweeView f52422F;

    /* JADX INFO: renamed from: F0 */
    public boolean f52423F0;

    /* JADX INFO: renamed from: G */
    public LinearLayout f52424G;

    /* JADX INFO: renamed from: G0 */
    public String f52425G0;

    /* JADX INFO: renamed from: H */
    public PkWinTimesViewInternal f52426H;

    /* JADX INFO: renamed from: H0 */
    public sa80 f52427H0;

    /* JADX INFO: renamed from: I */
    public VImage f52428I;

    /* JADX INFO: renamed from: I0 */
    public t880 f52429I0;

    /* JADX INFO: renamed from: J */
    public RecyclerView f52430J;

    /* JADX INFO: renamed from: J0 */
    public kt70 f52431J0;

    /* JADX INFO: renamed from: K */
    public AutoVisibleEffectPlayer f52432K;

    /* JADX INFO: renamed from: L */
    public VText f52433L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f52434M;

    /* JADX INFO: renamed from: N */
    public PkBountyView f52435N;

    /* JADX INFO: renamed from: O */
    public AutoVisibleEffectPlayer f52436O;

    /* JADX INFO: renamed from: P */
    public VButton f52437P;

    /* JADX INFO: renamed from: Q */
    public VText f52438Q;

    /* JADX INFO: renamed from: R */
    public AnimEffectPlayer f52439R;

    /* JADX INFO: renamed from: S */
    public VImage f52440S;

    /* JADX INFO: renamed from: T */
    public sx70 f52441T;

    /* JADX INFO: renamed from: U */
    public k36 f52442U;

    /* JADX INFO: renamed from: V */
    public k36 f52443V;

    /* JADX INFO: renamed from: W */
    public AnimatorSet f52444W;

    /* JADX INFO: renamed from: a */
    public LivePkDecorateView f52445a;

    /* JADX INFO: renamed from: b */
    public LivePkScoreView f52446b;

    /* JADX INFO: renamed from: c */
    public LivePkCursorView f52447c;

    /* JADX INFO: renamed from: d */
    public LivePkMagnetCardView f52448d;

    /* JADX INFO: renamed from: e */
    public View f52449e;

    /* JADX INFO: renamed from: f */
    public View f52450f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f52451g;

    /* JADX INFO: renamed from: h */
    public VImage f52452h;

    /* JADX INFO: renamed from: i */
    public TextView f52453i;

    /* JADX INFO: renamed from: j */
    public TextView f52454j;

    /* JADX INFO: renamed from: k */
    public View f52455k;

    /* JADX INFO: renamed from: k0 */
    public boolean f52456k0;

    /* JADX INFO: renamed from: l */
    public VImage f52457l;

    /* JADX INFO: renamed from: m */
    public View f52458m;

    /* JADX INFO: renamed from: n */
    public View f52459n;

    /* JADX INFO: renamed from: o */
    public VText f52460o;

    /* JADX INFO: renamed from: p */
    public VText f52461p;

    /* JADX INFO: renamed from: p0 */
    public boolean f52462p0;

    /* JADX INFO: renamed from: q */
    public VImage f52463q;

    /* JADX INFO: renamed from: r */
    public ConstraintLayout f52464r;

    /* JADX INFO: renamed from: s */
    public View f52465s;

    /* JADX INFO: renamed from: t */
    public Space f52466t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f52467u;

    /* JADX INFO: renamed from: v */
    public VText f52468v;

    /* JADX INFO: renamed from: w */
    public VImage f52469w;

    /* JADX INFO: renamed from: x */
    public VText f52470x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f52471y;

    /* JADX INFO: renamed from: z */
    public PkWinTimesViewInternal f52472z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.internal.PkViewInternal$a */
    public class C13071a extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PkData f52473a;

        public C13071a(PkData pkData) {
            this.f52473a = pkData;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            if (this.f52473a.isRankPk()) {
                t880 t880Var = PkViewInternal.this.f52429I0;
                sx70 sx70Var = PkViewInternal.this.f52441T;
                final PkData pkData = this.f52473a;
                t880Var.m189650e(sx70Var, pkData, new x20() { // from class: l.fc80
                    @Override // p153l.x20
                    public final void call() {
                        this.f98201a.m77314j(pkData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m77314j(PkData pkData) {
            PkViewInternal.this.m77297l0(pkData);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.internal.PkViewInternal$b */
    public class C13072b extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PkData f52475a;

        public C13072b(PkData pkData) {
            this.f52475a = pkData;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            PkViewInternal.this.m77283V(this.f52475a);
        }
    }

    public PkViewInternal(Context context) {
        super(context);
        this.f52462p0 = false;
        this.f52421E0 = false;
        this.f52423F0 = false;
        this.f52425G0 = "";
        this.f52427H0 = new sa80();
        this.f52429I0 = new t880();
        this.f52431J0 = new kt70();
    }

    /* JADX INFO: renamed from: A */
    private List<PkContributor> m77239A(boolean z, List<BLivePkContributor> list, boolean z2, boolean z3, boolean z4) {
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

    /* JADX INFO: renamed from: C */
    private void m77240C() {
        if (NullChecker.m82486a(this.f52444W) && this.f52444W.isStarted()) {
            return;
        }
        Animator animatorM132168n = gt0.m132168n(getFollowView(), View.ALPHA, 1.0f, 0.0f);
        animatorM132168n.setDuration(300L);
        Animator animatorM132169o = gt0.m132169o(getFollowView(), it0.f116781n, getFollowView().getWidth(), 0);
        animatorM132169o.setDuration(300L);
        animatorM132169o.setStartDelay(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f52444W = animatorSet;
        animatorSet.play(animatorM132168n).with(animatorM132169o);
        this.f52444W.setDuration(500L);
        this.f52444W.start();
        gt0.m132160f(this.f52444W, new Runnable() { // from class: l.sb80
            @Override // java.lang.Runnable
            public final void run() {
                this.f167113a.m77281L();
            }
        });
        this.f52468v.setPadding(0, 0, bnl0.m105587w(8.0f), 0);
    }

    /* JADX INFO: renamed from: E */
    public static int m77241E(long j, int i) {
        return (int) (((long) i) - (((long) (pzi0.m174454o() - (j / 1000000.0d))) / 1000));
    }

    /* JADX INFO: renamed from: F */
    public static int m77242F(BLivePKCardItem bLivePKCardItem) {
        return m77241E(bLivePKCardItem.startTs, bLivePKCardItem.duration);
    }

    /* JADX INFO: renamed from: I */
    private void m77243I() {
        bnl0.m105524M(this.f52420E, false);
        bnl0.m105524M(this.f52433L, false);
    }

    /* JADX INFO: renamed from: J */
    private void m77244J() {
        bnl0.m105524M(getFollowView(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m77245M(View view) {
        this.f52441T.mo153354V3(PkAction.ACTION_FOLLOW_USER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m77246N(View view) {
        this.f52441T.mo153354V3(PkAction.ACTION_PK_ONCE_MORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m77247O(View view) {
        this.f52441T.mo153354V3(PkAction.ACTION_PK_EXIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m77248P(Boolean bool) {
        this.f52440S.setSelected(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m77249Q(View view) {
        boolean zIsSelected = this.f52440S.isSelected();
        this.f52441T.mo153356m4(!zIsSelected, this.f52468v.getText().toString(), new y20() { // from class: l.dc80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87759a.m77248P((Boolean) obj);
            }
        });
        ua80.m195159a(this.f52441T, !zIsSelected);
        n180.m161087d(this.f52441T, zIsSelected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m77250R(View view) {
        this.f52441T.mo153354V3(PkAction.ACTION_SHOW_USER_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m77251S(View view) {
        su70.m187993a(this.f52441T, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m77252T(View view) {
        su70.m187993a(this.f52441T, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m77253Y(PkContributor pkContributor) {
        sx70 sx70Var = this.f52441T;
        if (sx70Var != null) {
            sx70Var.m188459k4(pkContributor);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    private void m77261i0(PkData pkData) {
        if (((dw40) this.f52441T.m213810E2()).mo118373p()) {
            if (pkData.isPlaying()) {
                ua80.m195160b(this.f52440S, this.f52441T);
                bnl0.m105524M(this.f52440S, true);
                c680.m108114n(getContext(), this.f52440S, this);
                return;
            }
            return;
        }
        if (pkData.isPking()) {
            boolean zM108113l = c680.m108113l(pkData);
            bnl0.m105524M(this.f52440S, zM108113l);
            this.f52440S.setSelected(zM108113l);
        }
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m77267o0(PkBountyData pkBountyData) {
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

    /* JADX INFO: renamed from: r */
    private void m77270r() {
        this.f52456k0 = wft.m206159b(2);
        m77244J();
        bnl0.m105509E0(getFollowView(), new View.OnClickListener() { // from class: l.rb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161997a.m77245M(view);
            }
        });
        bnl0.m105509E0(this.f52437P, new View.OnClickListener() { // from class: l.wb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188212a.m77246N(view);
            }
        });
        bnl0.m105509E0(this.f52457l, new View.OnClickListener() { // from class: l.xb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193136a.m77247O(view);
            }
        });
        bnl0.m105509E0(this.f52440S, new View.OnClickListener() { // from class: l.yb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198281a.m77249Q(view);
            }
        });
        bnl0.m105509E0(this.f52464r, new View.OnClickListener() { // from class: l.zb80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203635a.m77250R(view);
            }
        });
        bnl0.m105509E0(this.f52458m, new View.OnClickListener() { // from class: l.ac80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69684a.m77251S(view);
            }
        });
        bnl0.m105509E0(this.f52459n, new View.OnClickListener() { // from class: l.bc80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76108a.m77252T(view);
            }
        });
        int i = qa00.f156318e;
        kuf0 kuf0Var = new kuf0(i, 0);
        this.f52417B.setLayoutManager(new LinearLayoutManager(getContext(), 0, true));
        this.f52417B.addItemDecoration(kuf0Var);
        guf0 guf0Var = new guf0(i, 0);
        this.f52430J.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f52430J.addItemDecoration(guf0Var);
        m77243I();
        bnl0.m105524M(this.f52435N, false);
        this.f52446b.setCursorListener(new y20() { // from class: l.cc80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80893a.m77282U((Float) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    private void m77271r0() {
        bnl0.m105524M(this.f52437P, false);
        bnl0.m105524M(this.f52454j, false);
        bnl0.m105524M(this.f52416A, false);
        bnl0.m105524M(this.f52428I, false);
        bnl0.m105524M(this.f52472z, false);
        bnl0.m105524M(this.f52426H, false);
        m77244J();
        this.f52419D.m77348p0();
    }

    /* JADX INFO: renamed from: s0 */
    private void m77273s0() {
        int iM216939p = ((ynp0.m216939p() * 804) / 1080) + qa00.m175859d(64.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        if (this.f52441T.m213815L2()) {
            layoutParams.topMargin = qa00.m175859d(160.0f);
        } else {
            layoutParams.topMargin = qa00.m175859d(130.0f);
        }
        layoutParams.width = ynp0.m216939p();
        layoutParams.height = iM216939p;
        setLayoutParams(layoutParams);
        post(new Runnable() { // from class: l.vb80
            @Override // java.lang.Runnable
            public final void run() {
                this.f183216a.m77285X();
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public void m77276A0(int i) {
        if (!TextUtils.equals(this.f52453i.getText(), "00:00") || i >= 0) {
            List<String> listM193663a = tzi0.m193663a(i * 1000);
            this.f52453i.setText(listM193663a.get(1) + ":" + listM193663a.get(2));
        }
    }

    /* JADX INFO: renamed from: B */
    public void m77277B() {
        this.f52441T.m213811F2().ChatEvent.changeInputSize().mo199273j(new Size(0, pae.f151257a));
        n180.m161093j("pkView endPk");
        this.f52427H0.m185265a();
        m77279H();
        this.f52446b.m77331a();
        this.f52447c.m77324b();
        this.f52448d.m77329d();
        this.f52427H0.m185266b();
        m77271r0();
        this.f52440S.setSelected(false);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: G */
    public String m77278G(boolean z) {
        return z ? "https://auto.tancdn.com/v1/raw/1e59b30b-025e-4fad-814e-cb38badff31012.svga" : "https://auto.tancdn.com/v1/raw/ad732906-9c77-48a7-b866-1bc5c7f6eef013.svga";
    }

    /* JADX INFO: renamed from: H */
    public void m77279H() {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: K */
    public boolean m77280K() {
        PkData pkDataM213503N3 = this.f52441T.f171085i.m213503N3();
        return (pkDataM213503N3 == null || !pkDataM213503N3.isRankPk()) && this.f52441T.m188456d4() && this.f52446b.getLeftScore() <= 0 && !bnl0.m105529O0(this.f52454j) && this.f52446b.getRightScore() <= 0;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m77281L() {
        bnl0.m105524M(getFollowView(), false);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m77282U(Float f) {
        this.f52447c.setCursorOffset(f.floatValue());
        this.f52448d.setCursorOffset(f.floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m77284W(long[] jArr, List list, List list2, String str, String str2) {
        if (TextUtils.equals(str2, ((dw40) this.f52441T.m213810E2()).m168532l0().f56859id)) {
            jArr[0] = Long.valueOf((String) list.get(list2.indexOf(str2))).longValue();
        }
        if (TextUtils.equals(str2, str)) {
            jArr[1] = Long.valueOf((String) list.get(list2.indexOf(str2))).longValue();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m77285X() {
        this.f52441T.m213811F2().ChatEvent.changeInputSize().mo199273j(new Size(0, Math.min(((((View) getParent()).getHeight() - getBottom()) + ((FrameLayout.LayoutParams) this.f52446b.getLayoutParams()).bottomMargin) - pae.f151267k, pae.f151257a)));
    }

    /* JADX INFO: renamed from: Z */
    public void m77286Z() {
        boolean z = bnl0.m105529O0(this.f52459n) || bnl0.m105529O0(this.f52458m);
        int iM175859d = qa00.m175859d(43.0f);
        if (this.f52423F0) {
            iM175859d += qa00.m175859d(30.0f);
        }
        if (z) {
            iM175859d += qa00.m175859d(15.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52464r.getLayoutParams();
        layoutParams.topMargin = iM175859d;
        this.f52464r.setLayoutParams(layoutParams);
        int iM175859d2 = qa00.m175859d(73.0f);
        if (this.f52423F0) {
            iM175859d2 += qa00.m175859d(30.0f);
        }
        if (z) {
            iM175859d2 += qa00.m175859d(15.0f);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f52440S.getLayoutParams();
        layoutParams2.topMargin = iM175859d2;
        this.f52440S.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: a0 */
    public void m77287a0() {
        this.f52418C.m69687n();
        this.f52432K.m69687n();
        bnl0.m105524M(this.f52416A, false);
        bnl0.m105524M(this.f52428I, false);
        bnl0.m105524M(this.f52426H, false);
        bnl0.m105524M(this.f52472z, false);
        this.f52446b.m77331a();
        this.f52427H0.m185265a();
        this.f52447c.m77324b();
        this.f52448d.m77329d();
    }

    /* JADX INFO: renamed from: b0 */
    public void m77288b0() {
        m77290d0(null, -1);
        m77311z();
        this.f52448d.m77329d();
        m77299n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public void m77289c0(final PkData pkData, boolean z, boolean z2) {
        if (!bnl0.m105529O0(this)) {
            i4g0.m138492A("e_pk_adverseprofile_button", this.f52441T.mo78457R2(), jyb.m147494Y("liveId", ((dw40) this.f52441T.m213810E2()).m202191k()));
            if (this.f52441T.m213815L2()) {
                i4g0.m138492A("e_pk_close_button", this.f52441T.mo78457R2(), jyb.m147494Y("liveId", ((dw40) this.f52441T.m213810E2()).m202191k()), jyb.m147494Y("anchorId", ((dw40) this.f52441T.m213810E2()).m168532l0().f56859id));
            }
        }
        if (!bnl0.m105529O0(this)) {
            bnl0.m105524M(this, z2);
        }
        bnl0.m105524M(this.f52416A, false);
        bnl0.m105524M(this.f52428I, false);
        bnl0.m105524M(this.f52457l, this.f52441T.m213815L2());
        bnl0.m105524M(this.f52455k, !this.f52441T.m213815L2());
        bnl0.m105524M(this.f52453i, true);
        bnl0.m105524M(this.f52422F, false);
        bnl0.m105524M(this.f52434M, false);
        this.f52431J0.m151336c(pkData.isBountyPk());
        m77243I();
        m77273s0();
        User userOtherUser = pkData.otherUser();
        if (userOtherUser == null) {
            return;
        }
        bnl0.m105524M(this.f52437P, false);
        izs.m142867r("context_single_room", this.f52467u, userOtherUser.m61308fp().profileSmall());
        this.f52468v.setText(userOtherUser.name);
        if (pkData.isPunishing()) {
            this.f52452h.setImageResource(obc0.f146079J5);
            m77304v0((pkData.isRankPk() || pkData.isBountyPk() || !this.f52441T.m213815L2()) ? false : true);
            this.f52427H0.m185266b();
            this.f52427H0.m185265a();
            m77302t0(false);
            if (!z) {
                m77283V(pkData);
            } else if (pkData.isBountyPk() && m77267o0(pkData.getPkBountyData())) {
                this.f52431J0.m151337d(pkData.getPkBountyData(), new x20() { // from class: l.ec80
                    @Override // p153l.x20
                    public final void call() {
                        this.f93019a.m77283V(pkData);
                    }
                });
            } else {
                m77306w0(pkData);
            }
            m77297l0(pkData);
            this.f52429I0.m189649d(pkData);
        } else if (pkData.isPlaying()) {
            this.f52452h.setImageResource(obc0.f146283b5);
            if (pkData.isBountyPk()) {
                this.f52431J0.m151339f(pkData.getPkBountyData());
            }
            if (z) {
                if (pkData.isBountyPk() && m77267o0(pkData.getPkBountyData())) {
                    this.f52431J0.m151338e(pkData.getPkBountyData());
                } else {
                    this.f52436O.mo69685l("https://auto.tancdn.com/v1/raw/d9e41474-7ea7-4f9c-a05e-40b41937f64213.svga", 1, new C13071a(pkData));
                }
            }
        }
        String strOtherUserId = pkData.otherUserId();
        BLivePkPointList bLivePkPointList = pkData.f52415pk.situation.points;
        m77296k0(strOtherUserId, bLivePkPointList.userId, bLivePkPointList.point);
        boolean zEquals = TEnum.equals(pkData.f52415pk.situation.currentStageInfo.stage, BLivePkStage.punishing);
        List<BLivePkContributor> hostContributors = pkData.getHostContributors();
        List<BLivePkContributor> otherContributors = pkData.getOtherContributors();
        BLivePkSituation bLivePkSituation = pkData.f52415pk.situation;
        m77294h0(hostContributors, otherContributors, zEquals, bLivePkSituation.isTied, TextUtils.equals(bLivePkSituation.winnerId, pkData.getAnchorId()));
        m77261i0(pkData);
        this.f52445a.setDecorateData(pkData.f52415pk.pkScoreViewConfig);
        this.f52447c.m77323a(pkData.f52415pk.pkScoreViewConfig.cursorUrl);
    }

    /* JADX INFO: renamed from: d0 */
    public void m77290d0(BLivePKBufferInfo bLivePKBufferInfo, int i) {
        VText vText = this.f52438Q;
        if (bLivePKBufferInfo == null) {
            if (bnl0.m105529O0(vText)) {
                bnl0.m105524M(this.f52438Q, false);
                bnl0.m105524M(this.f52439R, false);
                return;
            }
            return;
        }
        bnl0.m105524M(vText, true);
        if (!this.f52425G0.equals(bLivePKBufferInfo.type)) {
            String str = bLivePKBufferInfo.type;
            this.f52425G0 = str;
            str.getClass();
            switch (str) {
                case "supportTask":
                    this.f52438Q.setBackground(n3d0.m161278b(obc0.f146338g0));
                    bnl0.m105524M(this.f52439R, true);
                    this.f52439R.m69683j("https://auto.tancdn.com/v1/raw/a00bebb8-f672-4b0a-af83-ebf361a5f54014.so", -1);
                    break;
                case "firstSend":
                case "supportTaskFinished":
                    this.f52438Q.setBackground(n3d0.m161278b(obc0.f146002D0));
                    bnl0.m105524M(this.f52439R, true);
                    this.f52439R.m69683j("https://auto.tancdn.com/v1/raw/a00bebb8-f672-4b0a-af83-ebf361a5f54014.so", -1);
                    break;
                default:
                    this.f52438Q.setBackground(n3d0.m161278b(obc0.f146493t));
                    bnl0.m105524M(this.f52439R, false);
                    break;
            }
        }
        String str2 = bLivePKBufferInfo.text;
        if (i < 0 || !bLivePKBufferInfo.showCountdown) {
            boolean z = bLivePKBufferInfo.showCountdown;
            VText vText2 = this.f52438Q;
            if (!z) {
                vText2.setText(str2);
                return;
            } else {
                bnl0.m105524M(vText2, false);
                bnl0.m105524M(this.f52439R, false);
                return;
            }
        }
        String str3 = str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + BLiveStormDanmakuGiftResourceType.f45294s;
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new ForegroundColorSpan(n3d0.m161277a(n9c0.f140877w1)), (str3.length() - String.valueOf(i).length()) - 1, str3.length(), 18);
        this.f52438Q.setText(spannableString);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m77291e0(boolean z, boolean z2) {
        this.f52421E0 = z;
        this.f52462p0 = z2;
        this.f52448d.m77327b(z);
        LivePkScoreView livePkScoreView = this.f52446b;
        livePkScoreView.m77332b(livePkScoreView.getLeftScore(), this.f52446b.getRightScore(), this.f52421E0, z2);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: f0 */
    public void m77292f0(BLivePkOwner bLivePkOwner, boolean z) {
        if (bLivePkOwner == null) {
            if (bnl0.m105529O0(this.f52458m)) {
                m77303u0(z, false);
            }
            if (bnl0.m105529O0(this.f52459n)) {
                m77303u0(z, false);
                return;
            }
            return;
        }
        VText vText = z ? this.f52460o : this.f52461p;
        m77303u0(z, true);
        BLivePKCardItem bLivePKCardItem = bLivePkOwner.itemCardList.get(0);
        if (!bLivePKCardItem.showCountdown) {
            vText.setCompoundDrawables(null, null, null, null);
            vText.setText(bLivePKCardItem.text);
            return;
        }
        Drawable drawableM161278b = n3d0.m161278b(obc0.f146102L4);
        drawableM161278b.setBounds(0, 0, qa00.m175859d(12.0f), qa00.m175859d(12.0f));
        vText.setCompoundDrawables(null, null, drawableM161278b, null);
        vText.setText(bLivePKCardItem.text + "生效中(" + m77242F(bLivePKCardItem) + "s)");
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g0 */
    public void m77293g0(List<BLivePKCardItem> list, boolean z) {
        Drawable drawableM161278b;
        int size = list.size();
        VText vText = z ? this.f52460o : this.f52461p;
        m77303u0(z, true);
        if (size == 2) {
            drawableM161278b = n3d0.m161278b(obc0.f146126N4);
        } else if (size != 3) {
            drawableM161278b = size != 4 ? n3d0.m161278b(obc0.f146078J4) : n3d0.m161278b(obc0.f146090K4);
        } else {
            drawableM161278b = n3d0.m161278b(obc0.f146114M4);
        }
        drawableM161278b.setBounds(0, 0, qa00.m175859d(15.0f), qa00.m175859d(15.0f));
        Drawable drawableM161278b2 = n3d0.m161278b(obc0.f146102L4);
        drawableM161278b2.setBounds(0, 0, qa00.m175859d(12.0f), qa00.m175859d(12.0f));
        vText.setCompoundDrawables(drawableM161278b, null, drawableM161278b2, null);
        vText.setText("张卡片生效中(" + m77242F(list.get(0)) + "s)");
    }

    public View getFollowView() {
        return this.f52456k0 ? this.f52470x : this.f52469w;
    }

    /* JADX INFO: renamed from: h0 */
    public void m77294h0(List<BLivePkContributor> list, List<BLivePkContributor> list2, boolean z, boolean z2, boolean z3) {
        n180.m161093j("renderContributors isPunishStage:" + z + ",hostContributors:" + list.size() + ",otherContributors: " + list2.size());
        if (this.f52442U == null) {
            k36 k36Var = new k36(new y20() { // from class: l.tb80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172845a.m77253Y((PkContributor) obj);
                }
            });
            this.f52442U = k36Var;
            this.f52417B.setAdapter(k36Var);
        }
        this.f52442U.m148001I(m77239A(true, list, z, z2, z3));
        if (this.f52443V == null) {
            k36 k36Var2 = new k36(new y20() { // from class: l.tb80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172845a.m77253Y((PkContributor) obj);
                }
            });
            this.f52443V = k36Var2;
            this.f52430J.setAdapter(k36Var2);
        }
        this.f52443V.m148001I(m77239A(false, list2, z, z2, !z3));
        sx70 sx70Var = this.f52441T;
        if (sx70Var != null) {
            sx70Var.m188461q4(list, list2);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m77295j0(boolean z, PkData pkData) {
        if (pkData.isRankPk()) {
            return;
        }
        bnl0.m105524M(this.f52472z, false);
        bnl0.m105524M(this.f52426H, false);
        if (!pkData.isBountyPk() && zrv.m221193k().m203539V4() && pkData.showWinTimesTag) {
            this.f52472z.m77316b(z, pkData.getAnchorWinTimes());
            this.f52426H.m77316b(z, pkData.getOtherWinTimes());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m77296k0(final String str, final List<String> list, final List<String> list2) {
        final long[] jArr = {0, 0};
        jyb.m147537z(list, new y20() { // from class: l.ub80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178286a.m77284W(jArr, list2, list, str, (String) obj);
            }
        });
        this.f52446b.m77332b(jArr[0], jArr[1], this.f52421E0, this.f52462p0);
        n180.m161097n(this.f52446b, jArr[0], jArr[1]);
        this.f52441T.m188453Y3();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m77297l0(PkData pkData) {
        if (pkData.isRankPk()) {
            boolean zIsPlaying = pkData.isPlaying();
            PkWinTimesViewInternal pkWinTimesViewInternal = this.f52472z;
            if (zIsPlaying) {
                pkWinTimesViewInternal.m77316b(true, pkData.getAnchorWinTimes());
                this.f52426H.m77316b(true, pkData.getOtherWinTimes());
            } else {
                bnl0.m105524M(pkWinTimesViewInternal, false);
                bnl0.m105524M(this.f52426H, false);
            }
        }
    }

    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void m77283V(PkData pkData) {
        bnl0.m105524M(this.f52416A, true);
        bnl0.m105524M(this.f52428I, true);
        if (pkData.f52415pk.situation.isTied) {
            this.f52416A.setImageResource(obc0.f146172R5);
            this.f52428I.setImageResource(obc0.f146172R5);
        } else {
            boolean zM96577l = a9g0.m96577l(pkData.otherUserId(), pkData.f52415pk.situation.winnerId);
            this.f52416A.setImageResource(zM96577l ? obc0.f146215V4 : obc0.f146150P5);
            this.f52428I.setImageResource(zM96577l ? obc0.f146150P5 : obc0.f146215V4);
            fhw.m125605a("LivePkConstant", "pkInfo anchorWinTimes:" + pkData.getAnchorWinTimes() + ",otherWinTimes:" + pkData.getOtherWinTimes());
        }
        if (pkData.isRankPk()) {
            return;
        }
        m77295j0(true, pkData);
    }

    /* JADX INFO: renamed from: n0 */
    public void m77299n0() {
        this.f52462p0 = false;
        this.f52421E0 = false;
        LivePkScoreView livePkScoreView = this.f52446b;
        livePkScoreView.m77332b(livePkScoreView.getLeftScore(), this.f52446b.getRightScore(), false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f52427H0.m185265a();
        if (NullChecker.m82486a(this.f52444W)) {
            this.f52444W.cancel();
            this.f52444W = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77305w(this);
        m77270r();
        this.f52427H0 = new sa80(this.f52449e, this.f52450f, this.f52451g, this.f52453i);
        this.f52429I0 = new t880(this.f52418C, this.f52432K, this.f52422F, this.f52434M);
        this.f52431J0 = new kt70(this.f52435N, this.f52420E, this.f52433L);
    }

    /* JADX INFO: renamed from: p0 */
    public void m77300p0() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52446b.getLayoutParams();
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = qa00.m175859d(20.0f);
        this.f52446b.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f52447c.getLayoutParams();
        layoutParams2.gravity = 80;
        layoutParams2.topMargin = qa00.m175859d(10.0f);
        this.f52447c.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f52445a.getLayoutParams();
        layoutParams3.gravity = 80;
        layoutParams3.topMargin = qa00.m175859d(10.0f);
        this.f52445a.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f52448d.getLayoutParams();
        layoutParams4.gravity = 80;
        layoutParams4.bottomMargin = qa00.m175859d(20.0f);
        this.f52448d.setLayoutParams(layoutParams4);
        this.f52423F0 = false;
        m77286Z();
    }

    /* JADX INFO: renamed from: q0 */
    public void m77301q0() {
        boolean z = bnl0.m105529O0(this.f52459n) || bnl0.m105529O0(this.f52458m);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52446b.getLayoutParams();
        layoutParams.gravity = 48;
        layoutParams.topMargin = z ? qa00.m175859d(57.0f) : qa00.m175859d(47.0f);
        this.f52446b.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f52447c.getLayoutParams();
        layoutParams2.gravity = 48;
        layoutParams2.topMargin = z ? qa00.m175859d(47.0f) : qa00.m175859d(37.0f);
        this.f52447c.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f52445a.getLayoutParams();
        layoutParams3.gravity = 48;
        layoutParams3.topMargin = z ? qa00.m175859d(47.0f) : qa00.m175859d(37.0f);
        this.f52445a.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f52448d.getLayoutParams();
        layoutParams4.gravity = 48;
        layoutParams4.topMargin = z ? qa00.m175859d(57.0f) : qa00.m175859d(47.0f);
        this.f52448d.setLayoutParams(layoutParams4);
        this.f52423F0 = true;
        m77286Z();
    }

    /* JADX INFO: renamed from: t0 */
    public void m77302t0(boolean z) {
        bnl0.m105524M(this.f52454j, z);
        bnl0.m105524M(this.f52453i, !z);
    }

    /* JADX INFO: renamed from: u0 */
    public void m77303u0(boolean z, boolean z2) {
        if (z) {
            bnl0.m105524M(this.f52458m, z2);
            bnl0.m105524M(this.f52460o, z2);
        } else {
            bnl0.m105524M(this.f52459n, z2);
            bnl0.m105524M(this.f52461p, z2);
        }
        if (this.f52423F0) {
            m77301q0();
        } else {
            m77300p0();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m77304v0(boolean z) {
        bnl0.m105524M(this.f52437P, z);
    }

    /* JADX INFO: renamed from: w */
    public final void m77305w(View view) {
        gc80.m129860a(this, view);
    }

    /* JADX INFO: renamed from: w0 */
    public void m77306w0(PkData pkData) {
        boolean zM96577l = a9g0.m96577l(pkData.otherUserId(), pkData.f52415pk.situation.winnerId);
        if (pkData.isRankPk()) {
            this.f52429I0.m189651f(this.f52441T, pkData, zM96577l, this);
            return;
        }
        C13072b c13072b = new C13072b(pkData);
        boolean z = pkData.f52415pk.situation.isTied;
        AutoVisibleEffectPlayer autoVisibleEffectPlayer = this.f52418C;
        if (z) {
            autoVisibleEffectPlayer.mo69685l("https://auto.tancdn.com/v1/raw/8f12e6b0-762c-4bf7-8733-7f8801aed51013.svga", 1, c13072b);
            this.f52432K.mo69685l("https://auto.tancdn.com/v1/raw/8f12e6b0-762c-4bf7-8733-7f8801aed51013.svga", 1, c13072b);
        } else {
            autoVisibleEffectPlayer.mo69685l(m77278G(!zM96577l), 1, c13072b);
            this.f52432K.mo69685l(m77278G(zM96577l), 1, c13072b);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(sx70 sx70Var) {
        this.f52441T = sx70Var;
    }

    /* JADX INFO: renamed from: x0 */
    public void m77308x0(int i) {
        this.f52427H0.m185265a();
        sa80 sa80Var = this.f52427H0;
        if (i > 0) {
            sa80Var.m185267c();
            return;
        }
        sa80Var.m185266b();
        if (this.f52441T.f171085i.m213503N3().isPlaying()) {
            m77302t0(true);
            this.f52419D.m77348p0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public void m77309y(boolean z, User user, boolean z2) {
        if (!z) {
            afu.m97555d(this.f52441T.mo78457R2(), tfs.m190969k().m190972b(this.f52441T.m213810E2(), false).m190975e("live_pk_main").m190978h(user.f56859id).m190971a());
        }
        if (z) {
            if (z2) {
                m77240C();
                return;
            } else {
                m77244J();
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams = getFollowView().getLayoutParams();
        if (this.f52456k0) {
            layoutParams.width = qa00.m175859d(12.0f) + ynp0.m216942s(10, getContext().getString(R$string.f47475D4));
        } else {
            layoutParams.width = getResources().getDimensionPixelSize(iac0.f113580b);
        }
        getFollowView().setLayoutParams(layoutParams);
        getFollowView().setAlpha(1.0f);
        bnl0.m105524M(getFollowView(), true);
        this.f52468v.setPadding(0, 0, bnl0.m105587w(4.0f), 0);
        i4g0.m138492A("e_pk_adverseprofile_button", this.f52441T.mo78457R2(), jyb.m147494Y("liveId", ((dw40) this.f52441T.m213810E2()).m202191k()));
    }

    /* JADX INFO: renamed from: y0 */
    public void m77310y0(boolean z) {
        bnl0.m105524M(this.f52440S, z);
        m77312z0(z);
    }

    /* JADX INFO: renamed from: z */
    public void m77311z() {
        m77303u0(false, false);
        m77303u0(true, false);
    }

    /* JADX INFO: renamed from: z0 */
    public void m77312z0(boolean z) {
        this.f52440S.setSelected(z);
    }

    public PkViewInternal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52462p0 = false;
        this.f52421E0 = false;
        this.f52423F0 = false;
        this.f52425G0 = "";
        this.f52427H0 = new sa80();
        this.f52429I0 = new t880();
        this.f52431J0 = new kt70();
    }

    public PkViewInternal(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52462p0 = false;
        this.f52421E0 = false;
        this.f52423F0 = false;
        this.f52425G0 = "";
        this.f52427H0 = new sa80();
        this.f52429I0 = new t880();
        this.f52431J0 = new kt70();
    }
}
