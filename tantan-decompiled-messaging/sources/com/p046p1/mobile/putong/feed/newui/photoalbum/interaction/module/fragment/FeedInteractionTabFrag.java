package com.p046p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.interaction.module.FeedInteractionTab;
import com.p046p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VText;
import p149l.AbstractC16769f7;
import p149l.a5i;
import p149l.d7h;
import p149l.df50;
import p149l.e30;
import p149l.f3c0;
import p149l.f5c;
import p149l.flh;
import p149l.hnc0;
import p149l.j760;
import p149l.k8h;
import p149l.kwh;
import p149l.l80;
import p149l.mkd0;
import p149l.mqi0;
import p149l.ovg;
import p149l.pv60;
import p149l.qib0;
import p149l.s8h;
import p149l.t100;
import p149l.vu60;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.ymg;
import p149l.z9h;
import p149l.zkg;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedInteractionTabFrag extends PutongFrag implements f5c<List<MomentActivity>>, df50, zkg {

    /* JADX INFO: renamed from: A */
    public FeedMaxHeightRecyclerView f41995A;

    /* JADX INFO: renamed from: B */
    public VLinear f41996B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f41997C;

    /* JADX INFO: renamed from: D */
    public VText f41998D;

    /* JADX INFO: renamed from: E */
    public vu60 f41999E;

    /* JADX INFO: renamed from: G */
    public AbstractC16769f7<List<MomentActivity>> f42001G;

    /* JADX INFO: renamed from: H */
    public FeedInteractionTab f42002H;

    /* JADX INFO: renamed from: I */
    public kwh<TextView> f42003I;

    /* JADX INFO: renamed from: K */
    public PhotoAlbumInterestedHeaderView f42005K;

    /* JADX INFO: renamed from: L */
    public TextView f42006L;

    /* JADX INFO: renamed from: N */
    public boolean f42008N;

    /* JADX INFO: renamed from: O */
    public l80<MomentActivity> f42009O;

    /* JADX INFO: renamed from: P */
    public boolean f42010P;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f42011z;

    /* JADX INFO: renamed from: F */
    public List<MomentActivity> f42000F = new ArrayList();

    /* JADX INFO: renamed from: J */
    public pv60 f42004J = new pv60();

    /* JADX INFO: renamed from: M */
    public zpd0 f42007M = new zpd0("feed_interaction_attention_toast" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag$a */
    public class C11304a extends l80<MomentActivity> {
        public C11304a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(MomentActivity momentActivity, int i) {
            FeedInteractionTabFrag.this.m64762U4(momentActivity);
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(MomentActivity momentActivity, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag$b */
    public static /* synthetic */ class C11305b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f42013a;

        static {
            int[] iArr = new int[FeedInteractionTab.values().length];
            f42013a = iArr;
            try {
                iArr[FeedInteractionTab.Like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42013a[FeedInteractionTab.Comment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42013a[FeedInteractionTab.Attention.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m64752P4(Throwable th) {
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m64754R4(Throwable th) {
    }

    /* JADX INFO: renamed from: g5 */
    private void m64756g5() {
        duringCreated(this.f42004J.m171604H()).subscribe(mkd0.m154956H(new e30() { // from class: l.n8h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137644a.m64769b5((xaj0) obj);
            }
        }, new e30() { // from class: l.o8h
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedInteractionTabFrag.m64754R4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: G3 */
    public void mo64757G3(String str) {
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: L3 */
    public void mo64758L3() {
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: M1 */
    public void mo64759M1(String str, int i) {
        duringCreated(this.f42004J.m171612w(flh.f98171j, str)).subscribe(mkd0.m154956H(new e30() { // from class: l.p8h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147604a.m64770c5((String) obj);
            }
        }, new e30() { // from class: l.q8h
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedInteractionTabFrag.m64752P4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: T0 */
    public void mo64760T0(PhotoAlbumActivitiesView photoAlbumActivitiesView) {
        photoAlbumActivitiesView.setFrom(PhotoAlbumActivitiesAct.f42245k);
    }

    /* JADX INFO: renamed from: T4 */
    public View m64761T4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s8h.m182589b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U4 */
    public void m64762U4(MomentActivity momentActivity) {
        zvf0.m220368A("e_interactcell_message", "p_interactcell_detail", j760.m140076a("other_user_id", momentActivity.actors), j760.m140076a("interact_type", this.f42002H.getValue()));
        MomentMessage momentMessage = FeedModule.f38855d.f192990H0.get(momentActivity.messageid);
        if (this.f42002H != FeedInteractionTab.Comment || momentMessage == null) {
            return;
        }
        j760<User, Moment> j760VarM64765X4 = m64765X4(momentActivity);
        zvf0.m220368A("e_interactcell_comment_like", "p_interactcell_detail", j760.m140076a("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"), j760.m140076a("moment_id", j760VarM64765X4.f116565b.f56011id), j760.m140076a("comment_user_id", j760VarM64765X4.f116564a.f56011id));
        zvf0.m220368A("e_interactcell_comment_reply", "p_interactcell_detail", j760.m140076a("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"), j760.m140076a("moment_id", j760VarM64765X4.f116565b.f56011id), j760.m140076a("comment_user_id", j760VarM64765X4.f116564a.f56011id));
    }

    /* JADX INFO: renamed from: V4 */
    public final AbstractC16769f7<List<MomentActivity>> m64763V4() {
        int i = C11305b.f42013a[this.f42002H.ordinal()];
        if (i != 1) {
            return i != 2 ? new ymg(act()) : new ovg(act());
        }
        return new z9h(act());
    }

    /* JADX INFO: renamed from: W4 */
    public PhotoAlbumInterestedHeaderView m64764W4() {
        return this.f42005K;
    }

    /* JADX INFO: renamed from: X4 */
    public j760<User, Moment> m64765X4(MomentActivity momentActivity) {
        return new j760<>(FeedModule.f38855d.m209447e8(momentActivity.actors), FeedModule.f38855d.f193047i0.get(momentActivity.reference.f39232id));
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m64766Y4() {
        if (this.f42006L != null) {
            return;
        }
        TextView textView = new TextView(act());
        this.f42006L = textView;
        textView.setText("回应关注你的人，双方即可开启聊天");
        this.f42006L.setPadding(t100.m186890d(16.0f), t100.m186890d(17.0f), t100.m186890d(17.0f), t100.m186890d(16.0f));
        this.f42006L.setTextSize(15.0f);
        this.f42006L.getPaint().setFakeBoldText(true);
        this.f42006L.setTextColor(Color.parseColor("#e6000000"));
        this.f42006L.setBackgroundResource(f3c0.f94602q1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = t100.m186890d(12.0f);
        layoutParams.topMargin = t100.m186890d(12.0f);
        layoutParams.rightMargin = t100.m186890d(12.0f);
        layoutParams.bottomMargin = t100.m186890d(2.0f);
        this.f42006L.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Z4 */
    public final boolean m64767Z4() {
        return !a5i.m95036l(this.f42007M.get().longValue(), mqi0.m155944o());
    }

    @Override // p149l.f5c
    /* JADX INFO: renamed from: a */
    public void mo61985a(Throwable th) {
        m64782n5();
        this.f42008N = false;
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m64768a5() {
        this.f42009O.m148842o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m64769b5(xaj0 xaj0Var) {
        m64776h5((List) xaj0Var.f191752b, ((Integer) xaj0Var.f191753c).intValue());
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m64770c5(final String str) {
        MomentActivity momentActivity = (MomentActivity) vwb.m200346r(this.f42000F, new w9j() { // from class: l.r8h
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((MomentActivity) obj).f56011id.equals(str));
            }
        });
        if (NullChecker.m81303a(momentActivity)) {
            momentActivity.read = true;
            m64778j5();
        }
        kwh<TextView> kwhVar = this.f42003I;
        if (kwhVar != null) {
            kwhVar.mo124942c(-2);
        }
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: d0 */
    public void mo64771d0() {
    }

    @Override // p149l.f5c
    /* JADX INFO: renamed from: d5, reason: merged with bridge method [inline-methods] */
    public void mo61986z0(List<MomentActivity> list, Links links) {
        this.f42000F.clear();
        this.f42000F.addAll(list);
        m64778j5();
        m64782n5();
        if (this.f42008N) {
            if (NullChecker.m81303a(this.f42003I)) {
                this.f42003I.mo124941b();
            }
            this.f42008N = false;
        }
    }

    @Override // p149l.zkg
    /* JADX INFO: renamed from: e */
    public void mo64773e(int i) {
        if (i < this.f42000F.size() - 4 || this.f42000F.size() <= 0) {
            return;
        }
        this.f42001G.next();
    }

    /* JADX INFO: renamed from: e5 */
    public void m64774e5() {
        this.f42010P = true;
        if (this.f42009O != null) {
            act().postDelayed(new Runnable() { // from class: l.l8h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f126828a.m64768a5();
                }
            }, 500L);
        }
        PhotoAlbumInterestedHeaderView photoAlbumInterestedHeaderView = this.f42005K;
        if (photoAlbumInterestedHeaderView != null) {
            photoAlbumInterestedHeaderView.m64996R();
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m64775f5() {
        this.f42010P = false;
        TextView textView = this.f42006L;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // p149l.zkg
    public String getFrom() {
        return this.f42002H.getValue();
    }

    /* JADX INFO: renamed from: h5 */
    public void m64776h5(List<User> list, int i) {
        this.f42005K.m64998W(list, i);
        if (this.f42010P) {
            this.f42005K.m64996R();
        }
    }

    /* JADX INFO: renamed from: i5 */
    public void m64777i5(List<String> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        for (MomentActivity momentActivity : this.f42000F) {
            final String str = momentActivity.actors;
            if (vwb.m200346r(list, new w9j() { // from class: l.m8h
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(str));
                }
            }) != null && !TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) && !TEnum.equals(momentActivity.action, "comment")) {
                momentActivity.read = true;
            }
        }
        m64778j5();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM64761T4 = m64761T4(layoutInflater, viewGroup);
        if (getArguments() != null) {
            this.f42002H = (FeedInteractionTab) getArguments().getSerializable("TAB_VALUE");
        }
        AbstractC16769f7<List<MomentActivity>> abstractC16769f7M64763V4 = m64763V4();
        this.f42001G = abstractC16769f7M64763V4;
        abstractC16769f7M64763V4.m119701a(this);
        this.f42009O = new C11304a();
        this.f41999E = new vu60(act(), new View(act()), this, this.f42009O);
        PhotoAlbumInterestedHeaderView photoAlbumInterestedHeaderView = new PhotoAlbumInterestedHeaderView(act());
        this.f42005K = photoAlbumInterestedHeaderView;
        photoAlbumInterestedHeaderView.setInteractionType(this.f42002H.getValue());
        d7h d7hVar = new d7h(this.f41999E);
        m64779k5();
        if (this.f42002H == FeedInteractionTab.Attention && m64767Z4()) {
            m64766Y4();
            this.f42007M.put(Long.valueOf(mqi0.m155944o()));
            LinearLayout linearLayout = new LinearLayout(act());
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            linearLayout.addView(this.f42005K);
            linearLayout.addView(this.f42006L);
            d7hVar.m143815H(linearLayout);
        } else {
            LinearLayout linearLayout2 = new LinearLayout(act());
            linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(1);
            linearLayout2.addView(this.f42005K);
            d7hVar.m143815H(linearLayout2);
        }
        this.f41995A.setAdapter(d7hVar);
        xdl0.m208368c0(this.f41995A, t100.m186890d(106.0f));
        this.f41995A.setClipToPadding(false);
        this.f42001G.previous();
        this.f42011z.mo223159O(this);
        m64756g5();
        return viewM64761T4;
    }

    /* JADX INFO: renamed from: j5 */
    public void m64778j5() {
        List<MomentActivity> list = this.f42000F;
        if (list != null && list.size() > 0) {
            this.f41996B.setVisibility(8);
            this.f42011z.setVisibility(0);
            this.f41999E.m200064G(this.f42000F);
            return;
        }
        this.f41996B.setVisibility(0);
        this.f42011z.setVisibility(8);
        qib0.f154691G.m102354Y0(this.f41997C, f3c0.f94514f1);
        this.f41998D.setText("你没有收到任何消息");
        if (this.f42002H == FeedInteractionTab.Attention && m64767Z4()) {
            m64766Y4();
            this.f41996B.addView(this.f42006L, 0);
            this.f42007M.put(Long.valueOf(mqi0.m155944o()));
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final void m64779k5() {
        if (act() instanceof k8h) {
            this.f42005K.setClickOuterAction(((k8h) act()).mo64743W());
        }
    }

    /* JADX INFO: renamed from: l5 */
    public void m64780l5(boolean z) {
        this.f42010P = z;
    }

    /* JADX INFO: renamed from: m5 */
    public void m64781m5(kwh kwhVar) {
        this.f42003I = kwhVar;
    }

    /* JADX INFO: renamed from: n5 */
    public void m64782n5() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f42011z;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m223778w(true);
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull hnc0 hnc0Var) {
        AbstractC16769f7<List<MomentActivity>> abstractC16769f7 = this.f42001G;
        if (abstractC16769f7 != null) {
            this.f42008N = true;
            abstractC16769f7.previous();
        }
        m64756g5();
    }
}
