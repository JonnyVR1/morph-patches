package com.p000p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.ActivityActionApi;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.interaction.module.FeedInteractionTab;
import com.p000p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.df50;
import l.e30;
import l.hnc0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.zpd0;
import l.zvf0;
import p007l.AbstractC2383f7;
import p007l.a5i;
import p007l.d7h;
import p007l.f3c0;
import p007l.f5c;
import p007l.flh;
import p007l.k8h;
import p007l.kwh;
import p007l.l80;
import p007l.ovg;
import p007l.pv60;
import p007l.s8h;
import p007l.vu60;
import p007l.ymg;
import p007l.z9h;
import p007l.zkg;
import v.VDraweeView;
import v.VLinear;
import v.VPullDownRefreshLayout;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedInteractionTabFrag extends PutongFrag implements f5c<List<MomentActivity>>, df50, zkg {

    /* JADX INFO: renamed from: A */
    public FeedMaxHeightRecyclerView f3456A;

    /* JADX INFO: renamed from: B */
    public VLinear f3457B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f3458C;

    /* JADX INFO: renamed from: D */
    public VText f3459D;

    /* JADX INFO: renamed from: E */
    public vu60 f3460E;

    /* JADX INFO: renamed from: G */
    public AbstractC2383f7<List<MomentActivity>> f3462G;

    /* JADX INFO: renamed from: H */
    public FeedInteractionTab f3463H;

    /* JADX INFO: renamed from: I */
    public kwh<TextView> f3464I;

    /* JADX INFO: renamed from: K */
    public PhotoAlbumInterestedHeaderView f3466K;

    /* JADX INFO: renamed from: L */
    public TextView f3467L;

    /* JADX INFO: renamed from: N */
    public boolean f3469N;

    /* JADX INFO: renamed from: O */
    public l80<MomentActivity> f3470O;

    /* JADX INFO: renamed from: P */
    public boolean f3471P;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f3472z;

    /* JADX INFO: renamed from: F */
    public List<MomentActivity> f3461F = new ArrayList();

    /* JADX INFO: renamed from: J */
    public pv60 f3465J = new pv60();

    /* JADX INFO: renamed from: M */
    public zpd0 f3468M = new zpd0("feed_interaction_attention_toast" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag$a */
    public class C2148a extends l80<MomentActivity> {
        public C2148a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(MomentActivity momentActivity, int i) {
            FeedInteractionTabFrag.this.m5858U4(momentActivity);
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(MomentActivity momentActivity, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag$b */
    public static /* synthetic */ class C2149b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3474a;

        static {
            int[] iArr = new int[FeedInteractionTab.values().length];
            f3474a = iArr;
            try {
                iArr[FeedInteractionTab.Like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3474a[FeedInteractionTab.Comment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3474a[FeedInteractionTab.Attention.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m5848P4(Throwable th) {
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m5850R4(Throwable th) {
    }

    /* JADX INFO: renamed from: g5 */
    private void m5852g5() {
        duringCreated(this.f3465J.m13257H()).subscribe(mkd0.H(new e30() { // from class: l.n8h
            public final void call(Object obj) {
                this.f10700a.m5865b5((xaj0) obj);
            }
        }, new e30() { // from class: l.o8h
            public final void call(Object obj) {
                FeedInteractionTabFrag.m5850R4((Throwable) obj);
            }
        }));
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: G3 */
    public void mo5853G3(String str) {
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: L3 */
    public void mo5854L3() {
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: M1 */
    public void mo5855M1(String str, int i) {
        duringCreated(this.f3465J.m13265w(flh.f8138j, str)).subscribe(mkd0.H(new e30() { // from class: l.p8h
            public final void call(Object obj) {
                this.f11730a.m5866c5((String) obj);
            }
        }, new e30() { // from class: l.q8h
            public final void call(Object obj) {
                FeedInteractionTabFrag.m5848P4((Throwable) obj);
            }
        }));
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: T0 */
    public void mo5856T0(PhotoAlbumActivitiesView photoAlbumActivitiesView) {
        photoAlbumActivitiesView.setFrom(PhotoAlbumActivitiesAct.f3706k);
    }

    /* JADX INFO: renamed from: T4 */
    public View m5857T4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s8h.m14048b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U4 */
    public void m5858U4(MomentActivity momentActivity) {
        zvf0.A("e_interactcell_message", "p_interactcell_detail", new j760[]{j760.a("other_user_id", momentActivity.actors), j760.a("interact_type", this.f3463H.getValue())});
        MomentMessage momentMessage = FeedModule.f316d.f14925H0.get(momentActivity.messageid);
        if (this.f3463H != FeedInteractionTab.Comment || momentMessage == null) {
            return;
        }
        j760<User, Moment> j760VarM5861X4 = m5861X4(momentActivity);
        zvf0.A("e_interactcell_comment_like", "p_interactcell_detail", new j760[]{j760.a("comment_detail", momentMessage.isChildComment() ? "reply" : "comment"), j760.a("moment_id", ((DbObject) ((Moment) j760VarM5861X4.b)).id), j760.a("comment_user_id", ((DbObject) ((User) j760VarM5861X4.a)).id)});
        zvf0.A("e_interactcell_comment_reply", "p_interactcell_detail", new j760[]{j760.a("comment_detail", momentMessage.isChildComment() ? "reply" : "comment"), j760.a("moment_id", ((DbObject) ((Moment) j760VarM5861X4.b)).id), j760.a("comment_user_id", ((DbObject) ((User) j760VarM5861X4.a)).id)});
    }

    /* JADX INFO: renamed from: V4 */
    public final AbstractC2383f7<List<MomentActivity>> m5859V4() {
        int i = C2149b.f3474a[this.f3463H.ordinal()];
        if (i != 1) {
            return i != 2 ? new ymg(act()) : new ovg(act());
        }
        return new z9h(act());
    }

    /* JADX INFO: renamed from: W4 */
    public PhotoAlbumInterestedHeaderView m5860W4() {
        return this.f3466K;
    }

    /* JADX INFO: renamed from: X4 */
    public j760<User, Moment> m5861X4(MomentActivity momentActivity) {
        return new j760<>(FeedModule.f316d.m16628e8(momentActivity.actors), FeedModule.f316d.f14982i0.get(momentActivity.reference.f693id));
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m5862Y4() {
        if (this.f3467L != null) {
            return;
        }
        TextView textView = new TextView(act());
        this.f3467L = textView;
        textView.setText("回应关注你的人，双方即可开启聊天");
        this.f3467L.setPadding(t100.d(16.0f), t100.d(17.0f), t100.d(17.0f), t100.d(16.0f));
        this.f3467L.setTextSize(15.0f);
        this.f3467L.getPaint().setFakeBoldText(true);
        this.f3467L.setTextColor(Color.parseColor("#e6000000"));
        this.f3467L.setBackgroundResource(f3c0.f7885q1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = t100.d(12.0f);
        layoutParams.topMargin = t100.d(12.0f);
        layoutParams.rightMargin = t100.d(12.0f);
        layoutParams.bottomMargin = t100.d(2.0f);
        this.f3467L.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Z4 */
    public final boolean m5863Z4() {
        return !a5i.m8412l(((Long) this.f3468M.get()).longValue(), mqi0.o());
    }

    @Override // p007l.f5c
    /* JADX INFO: renamed from: a */
    public void mo2959a(Throwable th) {
        m5878n5();
        this.f3469N = false;
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m5864a5() {
        this.f3470O.m11597o();
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m5865b5(xaj0 xaj0Var) {
        m5872h5((List) xaj0Var.b, ((Integer) xaj0Var.c).intValue());
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m5866c5(final String str) {
        MomentActivity momentActivity = (MomentActivity) vwb.r(this.f3461F, new w9j() { // from class: l.r8h
            public final Object call(Object obj) {
                return Boolean.valueOf(((DbObject) ((MomentActivity) obj)).id.equals(str));
            }
        });
        if (NullChecker.a(momentActivity)) {
            momentActivity.read = true;
            m5874j5();
        }
        kwh<TextView> kwhVar = this.f3464I;
        if (kwhVar != null) {
            kwhVar.mo10431c(-2);
        }
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: d0 */
    public void mo5867d0() {
    }

    @Override // p007l.f5c
    /* JADX INFO: renamed from: d5, reason: merged with bridge method [inline-methods] */
    public void mo2960z0(List<MomentActivity> list, Links links) {
        this.f3461F.clear();
        this.f3461F.addAll(list);
        m5874j5();
        m5878n5();
        if (this.f3469N) {
            if (NullChecker.a(this.f3464I)) {
                this.f3464I.mo10430b();
            }
            this.f3469N = false;
        }
    }

    @Override // p007l.zkg
    /* JADX INFO: renamed from: e */
    public void mo5869e(int i) {
        if (i < this.f3461F.size() - 4 || this.f3461F.size() <= 0) {
            return;
        }
        this.f3462G.next();
    }

    /* JADX INFO: renamed from: e5 */
    public void m5870e5() {
        this.f3471P = true;
        if (this.f3470O != null) {
            act().postDelayed(new Runnable() { // from class: l.l8h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9942a.m5864a5();
                }
            }, 500L);
        }
        PhotoAlbumInterestedHeaderView photoAlbumInterestedHeaderView = this.f3466K;
        if (photoAlbumInterestedHeaderView != null) {
            photoAlbumInterestedHeaderView.m6096R();
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m5871f5() {
        this.f3471P = false;
        TextView textView = this.f3467L;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // p007l.zkg
    public String getFrom() {
        return this.f3463H.getValue();
    }

    /* JADX INFO: renamed from: h5 */
    public void m5872h5(List<User> list, int i) {
        this.f3466K.m6098W(list, i);
        if (this.f3471P) {
            this.f3466K.m6096R();
        }
    }

    /* JADX INFO: renamed from: i5 */
    public void m5873i5(List<String> list) {
        if (vwb.J(list)) {
            return;
        }
        for (MomentActivity momentActivity : this.f3461F) {
            final String str = momentActivity.actors;
            if (vwb.r(list, new w9j() { // from class: l.m8h
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(str));
                }
            }) != null && !TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) && !TEnum.equals(momentActivity.action, "comment")) {
                momentActivity.read = true;
            }
        }
        m5874j5();
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM5857T4 = m5857T4(layoutInflater, viewGroup);
        if (getArguments() != null) {
            this.f3463H = (FeedInteractionTab) getArguments().getSerializable("TAB_VALUE");
        }
        AbstractC2383f7<List<MomentActivity>> abstractC2383f7M5859V4 = m5859V4();
        this.f3462G = abstractC2383f7M5859V4;
        abstractC2383f7M5859V4.m10069a(this);
        this.f3470O = new C2148a();
        this.f3460E = new vu60(act(), new View(act()), this, this.f3470O);
        PhotoAlbumInterestedHeaderView photoAlbumInterestedHeaderView = new PhotoAlbumInterestedHeaderView(act());
        this.f3466K = photoAlbumInterestedHeaderView;
        photoAlbumInterestedHeaderView.setInteractionType(this.f3463H.getValue());
        d7h d7hVar = new d7h(this.f3460E);
        m5875k5();
        if (this.f3463H == FeedInteractionTab.Attention && m5863Z4()) {
            m5862Y4();
            this.f3468M.put(Long.valueOf(mqi0.o()));
            LinearLayout linearLayout = new LinearLayout(act());
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            linearLayout.addView(this.f3466K);
            linearLayout.addView(this.f3467L);
            d7hVar.H(linearLayout);
        } else {
            LinearLayout linearLayout2 = new LinearLayout(act());
            linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(1);
            linearLayout2.addView(this.f3466K);
            d7hVar.H(linearLayout2);
        }
        this.f3456A.setAdapter(d7hVar);
        xdl0.c0(this.f3456A, t100.d(106.0f));
        this.f3456A.setClipToPadding(false);
        this.f3462G.previous();
        this.f3472z.O(this);
        m5852g5();
        return viewM5857T4;
    }

    /* JADX INFO: renamed from: j5 */
    public void m5874j5() {
        List<MomentActivity> list = this.f3461F;
        if (list != null && list.size() > 0) {
            this.f3457B.setVisibility(8);
            this.f3472z.setVisibility(0);
            this.f3460E.m15583G(this.f3461F);
            return;
        }
        this.f3457B.setVisibility(0);
        this.f3472z.setVisibility(8);
        qib0.G.Y0(this.f3458C, f3c0.f7797f1);
        this.f3459D.setText("你没有收到任何消息");
        if (this.f3463H == FeedInteractionTab.Attention && m5863Z4()) {
            m5862Y4();
            this.f3457B.addView(this.f3467L, 0);
            this.f3468M.put(Long.valueOf(mqi0.o()));
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final void m5875k5() {
        if (act() instanceof k8h) {
            this.f3466K.setClickOuterAction(act().mo5839W());
        }
    }

    /* JADX INFO: renamed from: l5 */
    public void m5876l5(boolean z) {
        this.f3471P = z;
    }

    /* JADX INFO: renamed from: m5 */
    public void m5877m5(kwh kwhVar) {
        this.f3464I = kwhVar;
    }

    /* JADX INFO: renamed from: n5 */
    public void m5878n5() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f3472z;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.w(true);
    }

    /* JADX INFO: renamed from: w2 */
    public void m5879w2(@NonNull hnc0 hnc0Var) {
        AbstractC2383f7<List<MomentActivity>> abstractC2383f7 = this.f3462G;
        if (abstractC2383f7 != null) {
            this.f3469N = true;
            abstractC2383f7.previous();
        }
        m5852g5();
    }
}
