package com.p051p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.interaction.module.FeedInteractionTab;
import com.p051p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VText;
import p153l.AbstractC15662a7;
import p153l.b370;
import p153l.bkj0;
import p153l.bnl0;
import p153l.byd0;
import p153l.dxg;
import p153l.h80;
import p153l.hah;
import p153l.i4g0;
import p153l.jn50;
import p153l.jyb;
import p153l.l6c;
import p153l.lbc0;
import p153l.mvc0;
import p153l.nog;
import p153l.obh;
import p153l.omg;
import p153l.p6i;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.s8h;
import p153l.umh;
import p153l.uqb0;
import p153l.v370;
import p153l.y20;
import p153l.z9h;
import p153l.zxh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedInteractionTabFrag extends PutongFrag implements l6c<List<MomentActivity>>, jn50, omg {

    /* JADX INFO: renamed from: A */
    public FeedMaxHeightRecyclerView f42843A;

    /* JADX INFO: renamed from: B */
    public VLinear f42844B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f42845C;

    /* JADX INFO: renamed from: D */
    public VText f42846D;

    /* JADX INFO: renamed from: E */
    public b370 f42847E;

    /* JADX INFO: renamed from: G */
    public AbstractC15662a7<List<MomentActivity>> f42849G;

    /* JADX INFO: renamed from: H */
    public FeedInteractionTab f42850H;

    /* JADX INFO: renamed from: I */
    public zxh<TextView> f42851I;

    /* JADX INFO: renamed from: K */
    public PhotoAlbumInterestedHeaderView f42853K;

    /* JADX INFO: renamed from: L */
    public TextView f42854L;

    /* JADX INFO: renamed from: N */
    public boolean f42856N;

    /* JADX INFO: renamed from: O */
    public h80<MomentActivity> f42857O;

    /* JADX INFO: renamed from: P */
    public boolean f42858P;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f42859z;

    /* JADX INFO: renamed from: F */
    public List<MomentActivity> f42848F = new ArrayList();

    /* JADX INFO: renamed from: J */
    public v370 f42852J = new v370();

    /* JADX INFO: renamed from: M */
    public byd0 f42855M = new byd0("feed_interaction_attention_toast" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag$a */
    public class C11467a extends h80<MomentActivity> {
        public C11467a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(MomentActivity momentActivity, int i) {
            FeedInteractionTabFrag.this.m65945U4(momentActivity);
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(MomentActivity momentActivity, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag$b */
    public static /* synthetic */ class C11468b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f42861a;

        static {
            int[] iArr = new int[FeedInteractionTab.values().length];
            f42861a = iArr;
            try {
                iArr[FeedInteractionTab.Like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42861a[FeedInteractionTab.Comment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42861a[FeedInteractionTab.Attention.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m65935P4(Throwable th) {
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m65937R4(Throwable th) {
    }

    /* JADX INFO: renamed from: g5 */
    private void m65939g5() {
        duringCreated(this.f42852J.m199237H()).subscribe(psd0.m173597H(new y20() { // from class: l.cah
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80589a.m65952b5((bkj0) obj);
            }
        }, new y20() { // from class: l.dah
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedInteractionTabFrag.m65937R4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: G3 */
    public void mo65940G3(String str) {
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: L3 */
    public void mo65941L3() {
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: M1 */
    public void mo65942M1(String str, int i) {
        duringCreated(this.f42852J.m199245w(umh.f179635j, str)).subscribe(psd0.m173597H(new y20() { // from class: l.eah
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92784a.m65953c5((String) obj);
            }
        }, new y20() { // from class: l.fah
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedInteractionTabFrag.m65935P4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: T0 */
    public void mo65943T0(PhotoAlbumActivitiesView photoAlbumActivitiesView) {
        photoAlbumActivitiesView.setFrom(PhotoAlbumActivitiesAct.f43093k);
    }

    /* JADX INFO: renamed from: T4 */
    public View m65944T4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hah.m134154b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U4 */
    public void m65945U4(MomentActivity momentActivity) {
        i4g0.m138492A("e_interactcell_message", "p_interactcell_detail", pf60.m172085a("other_user_id", momentActivity.actors), pf60.m172085a("interact_type", this.f42850H.getValue()));
        MomentMessage momentMessage = FeedModule.f39703d.f121300H0.get(momentActivity.messageid);
        if (this.f42850H != FeedInteractionTab.Comment || momentMessage == null) {
            return;
        }
        pf60<User, Moment> pf60VarM65948X4 = m65948X4(momentActivity);
        i4g0.m138492A("e_interactcell_comment_like", "p_interactcell_detail", pf60.m172085a("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"), pf60.m172085a("moment_id", pf60VarM65948X4.f152157b.f56859id), pf60.m172085a("comment_user_id", pf60VarM65948X4.f152156a.f56859id));
        i4g0.m138492A("e_interactcell_comment_reply", "p_interactcell_detail", pf60.m172085a("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"), pf60.m172085a("moment_id", pf60VarM65948X4.f152157b.f56859id), pf60.m172085a("comment_user_id", pf60VarM65948X4.f152156a.f56859id));
    }

    /* JADX INFO: renamed from: V4 */
    public final AbstractC15662a7<List<MomentActivity>> m65946V4() {
        int i = C11468b.f42861a[this.f42850H.ordinal()];
        if (i != 1) {
            return i != 2 ? new nog(act()) : new dxg(act());
        }
        return new obh(act());
    }

    /* JADX INFO: renamed from: W4 */
    public PhotoAlbumInterestedHeaderView m65947W4() {
        return this.f42853K;
    }

    /* JADX INFO: renamed from: X4 */
    public pf60<User, Moment> m65948X4(MomentActivity momentActivity) {
        return new pf60<>(FeedModule.f39703d.m145688e8(momentActivity.actors), FeedModule.f39703d.f121357i0.get(momentActivity.reference.f40080id));
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m65949Y4() {
        if (this.f42854L != null) {
            return;
        }
        TextView textView = new TextView(act());
        this.f42854L = textView;
        textView.setText("回应关注你的人，双方即可开启聊天");
        this.f42854L.setPadding(qa00.m175859d(16.0f), qa00.m175859d(17.0f), qa00.m175859d(17.0f), qa00.m175859d(16.0f));
        this.f42854L.setTextSize(15.0f);
        this.f42854L.getPaint().setFakeBoldText(true);
        this.f42854L.setTextColor(Color.parseColor("#e6000000"));
        this.f42854L.setBackgroundResource(lbc0.f131120q1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = qa00.m175859d(12.0f);
        layoutParams.topMargin = qa00.m175859d(12.0f);
        layoutParams.rightMargin = qa00.m175859d(12.0f);
        layoutParams.bottomMargin = qa00.m175859d(2.0f);
        this.f42854L.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Z4 */
    public final boolean m65950Z4() {
        return !p6i.m170903l(this.f42855M.get().longValue(), pzi0.m174454o());
    }

    @Override // p153l.l6c
    /* JADX INFO: renamed from: a */
    public void mo63168a(Throwable th) {
        m65965n5();
        this.f42856N = false;
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m65951a5() {
        this.f42857O.m133884o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m65952b5(bkj0 bkj0Var) {
        m65959h5((List) bkj0Var.f77082b, ((Integer) bkj0Var.f77083c).intValue());
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m65953c5(final String str) {
        MomentActivity momentActivity = (MomentActivity) jyb.m147529r(this.f42848F, new qcj() { // from class: l.gah
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((MomentActivity) obj).f56859id.equals(str));
            }
        });
        if (NullChecker.m82486a(momentActivity)) {
            momentActivity.read = true;
            m65961j5();
        }
        zxh<TextView> zxhVar = this.f42851I;
        if (zxhVar != null) {
            zxhVar.mo200710c(-2);
        }
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: d0 */
    public void mo65954d0() {
    }

    @Override // p153l.l6c
    /* JADX INFO: renamed from: d5, reason: merged with bridge method [inline-methods] */
    public void mo63169z0(List<MomentActivity> list, Links links) {
        this.f42848F.clear();
        this.f42848F.addAll(list);
        m65961j5();
        m65965n5();
        if (this.f42856N) {
            if (NullChecker.m82486a(this.f42851I)) {
                this.f42851I.mo200709b();
            }
            this.f42856N = false;
        }
    }

    @Override // p153l.omg
    /* JADX INFO: renamed from: e */
    public void mo65956e(int i) {
        if (i < this.f42848F.size() - 4 || this.f42848F.size() <= 0) {
            return;
        }
        this.f42849G.next();
    }

    /* JADX INFO: renamed from: e5 */
    public void m65957e5() {
        this.f42858P = true;
        if (this.f42857O != null) {
            act().postDelayed(new Runnable() { // from class: l.aah
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69143a.m65951a5();
                }
            }, 500L);
        }
        PhotoAlbumInterestedHeaderView photoAlbumInterestedHeaderView = this.f42853K;
        if (photoAlbumInterestedHeaderView != null) {
            photoAlbumInterestedHeaderView.m66179R();
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m65958f5() {
        this.f42858P = false;
        TextView textView = this.f42854L;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // p153l.omg
    public String getFrom() {
        return this.f42850H.getValue();
    }

    /* JADX INFO: renamed from: h5 */
    public void m65959h5(List<User> list, int i) {
        this.f42853K.m66181W(list, i);
        if (this.f42858P) {
            this.f42853K.m66179R();
        }
    }

    /* JADX INFO: renamed from: i5 */
    public void m65960i5(List<String> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        for (MomentActivity momentActivity : this.f42848F) {
            final String str = momentActivity.actors;
            if (jyb.m147529r(list, new qcj() { // from class: l.bah
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(str));
                }
            }) != null && !TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) && !TEnum.equals(momentActivity.action, "comment")) {
                momentActivity.read = true;
            }
        }
        m65961j5();
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
    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM65944T4 = m65944T4(layoutInflater, viewGroup);
        if (getArguments() != null) {
            this.f42850H = (FeedInteractionTab) getArguments().getSerializable("TAB_VALUE");
        }
        AbstractC15662a7<List<MomentActivity>> abstractC15662a7M65946V4 = m65946V4();
        this.f42849G = abstractC15662a7M65946V4;
        abstractC15662a7M65946V4.m96352a(this);
        this.f42857O = new C11467a();
        this.f42847E = new b370(act(), new View(act()), this, this.f42857O);
        PhotoAlbumInterestedHeaderView photoAlbumInterestedHeaderView = new PhotoAlbumInterestedHeaderView(act());
        this.f42853K = photoAlbumInterestedHeaderView;
        photoAlbumInterestedHeaderView.setInteractionType(this.f42850H.getValue());
        s8h s8hVar = new s8h(this.f42847E);
        m65962k5();
        if (this.f42850H == FeedInteractionTab.Attention && m65950Z4()) {
            m65949Y4();
            this.f42855M.put(Long.valueOf(pzi0.m174454o()));
            LinearLayout linearLayout = new LinearLayout(act());
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            linearLayout.addView(this.f42853K);
            linearLayout.addView(this.f42854L);
            s8hVar.m222265H(linearLayout);
        } else {
            LinearLayout linearLayout2 = new LinearLayout(act());
            linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(1);
            linearLayout2.addView(this.f42853K);
            s8hVar.m222265H(linearLayout2);
        }
        this.f42843A.setAdapter(s8hVar);
        bnl0.m105548c0(this.f42843A, qa00.m175859d(106.0f));
        this.f42843A.setClipToPadding(false);
        this.f42849G.previous();
        this.f42859z.mo224405O(this);
        m65939g5();
        return viewM65944T4;
    }

    /* JADX INFO: renamed from: j5 */
    public void m65961j5() {
        List<MomentActivity> list = this.f42848F;
        if (list != null && list.size() > 0) {
            this.f42844B.setVisibility(8);
            this.f42859z.setVisibility(0);
            this.f42847E.m102275G(this.f42848F);
            return;
        }
        this.f42844B.setVisibility(0);
        this.f42859z.setVisibility(8);
        uqb0.f180374G.m127138Y0(this.f42845C, lbc0.f131032f1);
        this.f42846D.setText("你没有收到任何消息");
        if (this.f42850H == FeedInteractionTab.Attention && m65950Z4()) {
            m65949Y4();
            this.f42844B.addView(this.f42854L, 0);
            this.f42855M.put(Long.valueOf(pzi0.m174454o()));
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final void m65962k5() {
        if (act() instanceof z9h) {
            this.f42853K.setClickOuterAction(((z9h) act()).mo65926X());
        }
    }

    /* JADX INFO: renamed from: l5 */
    public void m65963l5(boolean z) {
        this.f42858P = z;
    }

    /* JADX INFO: renamed from: m5 */
    public void m65964m5(zxh zxhVar) {
        this.f42851I = zxhVar;
    }

    /* JADX INFO: renamed from: n5 */
    public void m65965n5() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f42859z;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m225024w(true);
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull mvc0 mvc0Var) {
        AbstractC15662a7<List<MomentActivity>> abstractC15662a7 = this.f42849G;
        if (abstractC15662a7 != null) {
            this.f42856N = true;
            abstractC15662a7.previous();
        }
        m65939g5();
    }
}
