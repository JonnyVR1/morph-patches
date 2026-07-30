package p153l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0428k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.NearbyBanner;
import com.p051p1.mobile.putong.data.OMSData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithLinkItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.MomentPostBar;
import com.p051p1.mobile.putong.feed.newui.photoalbum.MomentSeeEntryAndTopicHeaderView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.p064ai.FeedAiStoryHeadView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedNewUserBubbleView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedPersonalizeSuggestGuideView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSvipLimitedMomentItemView;
import com.p051p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateFollowFeedHeaderView;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p153l.je70;

/* JADX INFO: loaded from: classes13.dex */
public class hf70<P extends je70> implements iam<P>, s2m {

    /* JADX INFO: renamed from: M */
    public static long f109219M = 5000;

    /* JADX INFO: renamed from: N */
    public static int f109220N = 3;

    /* JADX INFO: renamed from: A */
    public boolean f109221A;

    /* JADX INFO: renamed from: B */
    public boolean f109222B;

    /* JADX INFO: renamed from: C */
    public boolean f109223C;

    /* JADX INFO: renamed from: D */
    public boolean f109224D;

    /* JADX INFO: renamed from: E */
    public Runnable f109225E;

    /* JADX INFO: renamed from: F */
    public SimplePushBubble f109226F;

    /* JADX INFO: renamed from: G */
    public FeedNewUserBubbleView f109227G;

    /* JADX INFO: renamed from: J */
    public String f109230J;

    /* JADX INFO: renamed from: K */
    public boolean f109231K;

    /* JADX INFO: renamed from: L */
    public jl80 f109232L;

    /* JADX INFO: renamed from: a */
    public VLinear f109233a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f109234b;

    /* JADX INFO: renamed from: c */
    public VImage f109235c;

    /* JADX INFO: renamed from: d */
    public MomentPostBar f109236d;

    /* JADX INFO: renamed from: e */
    public FeedDraftView f109237e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f109238f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f109239g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f109240h;

    /* JADX INFO: renamed from: j */
    public PhotoAlbumFeedFrag f109242j;

    /* JADX INFO: renamed from: k */
    public PhotoAlbumFeedBaseFrag f109243k;

    /* JADX INFO: renamed from: l */
    public Act f109244l;

    /* JADX INFO: renamed from: m */
    public je70 f109245m;

    /* JADX INFO: renamed from: n */
    public C11443a f109246n;

    /* JADX INFO: renamed from: o */
    public s8h f109247o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f109248p;

    /* JADX INFO: renamed from: q */
    public ViewTreeObserver.OnGlobalLayoutListener f109249q;

    /* JADX INFO: renamed from: r */
    public boolean f109250r;

    /* JADX INFO: renamed from: t */
    public boolean f109252t;

    /* JADX INFO: renamed from: u */
    public int f109253u;

    /* JADX INFO: renamed from: w */
    public boolean f109255w;

    /* JADX INFO: renamed from: x */
    public boolean f109256x;

    /* JADX INFO: renamed from: y */
    public Moment f109257y;

    /* JADX INFO: renamed from: z */
    public List<Moment> f109258z;

    /* JADX INFO: renamed from: i */
    public final int f109241i = 10;

    /* JADX INFO: renamed from: s */
    public boolean f109251s = false;

    /* JADX INFO: renamed from: v */
    public int f109254v = -1;

    /* JADX INFO: renamed from: H */
    public y20<Boolean> f109228H = new y20() { // from class: l.ke70
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f125307a.m134778u0((Boolean) obj);
        }
    };

    /* JADX INFO: renamed from: I */
    public RecyclerView.AbstractC0584t f109229I = new C17445a();

    /* JADX INFO: renamed from: l.hf70$a */
    public class C17445a extends RecyclerView.AbstractC0584t {
        public C17445a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            hf70.this.f109245m.m144547Q0(i);
            if (cmg.m111220l0()) {
                hf70.this.f109242j.m65550P4();
            }
            hf70 hf70Var = hf70.this;
            if (i != 0) {
                hf70Var.f109224D = false;
                hf70Var.m134723H0();
                return;
            }
            hf70Var.m134765g1();
            hf70.this.m134743S();
            if (cmg.m111181I()) {
                hf70 hf70Var2 = hf70.this;
                if (hf70Var2.f109245m.f120402g == 12) {
                    hf70Var2.m134731M();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            hf70.this.m134763f1();
        }
    }

    public hf70(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f109242j = photoAlbumFeedFrag;
    }

    /* JADX INFO: renamed from: W */
    private VRecyclerView m134694W() {
        return m134752Y().f131420p;
    }

    /* JADX INFO: renamed from: X */
    private v670 m134695X() {
        return this.f109243k.f42299A;
    }

    /* JADX INFO: renamed from: a0 */
    private void m134697a0(boolean z) {
        if (z) {
            m134694W().setOnTouchListener(new View.OnTouchListener() { // from class: l.af70
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f70878a.m134771m0(view, motionEvent);
                }
            });
        } else {
            m134694W().setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m134701d0() {
        LinearLayout linearLayout = new LinearLayout(this.f109244l);
        this.f109248p = linearLayout;
        linearLayout.setOrientation(1);
        gj70.C17230a c17230a = gj70.m130463a().m130464b().get(this.f109245m.f120399d);
        boolean zM144542H0 = this.f109245m.m144542H0();
        boolean zM144539E0 = this.f109245m.m144539E0();
        boolean zM144538D0 = this.f109245m.m144538D0();
        if (this.f109245m.m144537C0()) {
            this.f109248p.addView(new FeedAiStoryHeadView(this.f109244l));
        }
        if (!cmg.m111220l0()) {
            m134751W0();
        } else if (this.f109245m.m144540F0()) {
            if (m134769k0()) {
                this.f109238f.addView(this.f109227G);
            } else {
                this.f109248p.addView(this.f109227G);
            }
            this.f109227G.m66348O(FeedModule.f39703d.f121301H1);
        } else {
            this.f109244l.duringCreated(FeedModule.f39703d.m145567Mc()).subscribe(psd0.m173597H(new y20() { // from class: l.ef70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f93712a.m134772n0((TopicOperations) obj);
                }
            }, new y20() { // from class: l.ff70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98751a.m134773o0((Throwable) obj);
                }
            }));
        }
        if ((NullChecker.m82486a(c17230a) && c17230a.f104610b) || zM144539E0 || zM144542H0 || zM144538D0) {
            if (zM144542H0) {
                MomentSeeEntryAndTopicHeaderView momentSeeEntryAndTopicHeaderView = new MomentSeeEntryAndTopicHeaderView(this.f109244l);
                this.f109248p.addView(momentSeeEntryAndTopicHeaderView);
                momentSeeEntryAndTopicHeaderView.m64438Q(this.f109242j);
            } else if (zM144539E0) {
                this.f109248p.addView(new TopicNearByHeaderView(this.f109244l));
            } else if (zM144538D0) {
                this.f109248p.addView(new FeedStateFollowFeedHeaderView(this.f109244l, this.f109245m.f120399d));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m134709n(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m134710q(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204402f(l4g0Var);
        tfj0.m190941d("e_newuser_checkin_record_pop_get", "p_newuser_checkin_record_pop", new tfj0.C20302a[0]);
        tfj0.m190941d("e_newuser_checkin_record_pop_giveup", "p_newuser_checkin_record_pop", new tfj0.C20302a[0]);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m134717z(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m134718A0() {
        this.f109232L.dismiss();
        tfj0.m190939b("e_newuser_checkin_record_pop_giveup", "p_newuser_checkin_record_pop", new tfj0.C20302a[0]);
    }

    /* JADX INFO: renamed from: B0 */
    public void m134719B0(int i) {
        this.f109246n.notifyItemChanged(i);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public void m134720D0() {
        if (NullChecker.m82486a(this.f109243k)) {
            m134752Y().mo153737z();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m134721E0(Moment moment, String str) {
        this.f109236d.mo64435y(moment);
        m134694W().scrollToPosition(0);
    }

    /* JADX INFO: renamed from: G0 */
    public void m134722G0() {
        this.f109231K = true;
    }

    /* JADX INFO: renamed from: H0 */
    public void m134723H0() {
        l51.m152890J(this.f109225E);
    }

    /* JADX INFO: renamed from: I */
    public View m134724I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return if70.m139724b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m134725I0() {
        boolean zM111233s = cmg.m111233s();
        je70 je70Var = this.f109245m;
        if (zM111233s) {
            if (je70Var.f120402g == 14) {
                this.f109237e.m66301b0(this.f109242j);
            }
        } else {
            int i = je70Var.f120402g;
            if (i == 0 || i == 12) {
                this.f109237e.m66301b0(this.f109242j);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m134726J() {
        if70.m139725c(this);
    }

    /* JADX INFO: renamed from: J0 */
    public void m134727J0(List<TopicMoment> list) {
        for (int i = 0; i < this.f109248p.getChildCount(); i++) {
            View childAt = this.f109248p.getChildAt(i);
            if (childAt instanceof TopicNearByHeaderView) {
                ((TopicNearByHeaderView) childAt).m67310f(list);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m134728K() {
        if (pu20.m173820o().size() > 0) {
            if (pu20.m173820o().contains(ksg.m151174K(this.f109245m.f120399d, false))) {
                m134746T0();
            }
        } else if (this.f109256x) {
            m134746T0();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m134729K0(boolean z) {
        bnl0.m105524M(this.f109234b, z);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(je70 je70Var) {
        this.f109245m = je70Var;
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: L0 */
    public n570 mo63211L0() {
        return this.f109245m.m144555y0();
    }

    /* JADX INFO: renamed from: M */
    public final void m134731M() {
        if (m134694W() == null) {
            return;
        }
        View childAt = m134694W().getLayoutManager().getChildAt(m134694W().getLayoutManager().getChildCount() - 1);
        int bottom = childAt.getBottom();
        int bottom2 = m134694W().getBottom() - m134694W().getPaddingBottom();
        int position = m134694W().getLayoutManager().getPosition(childAt);
        if (bottom == bottom2 && position == m134694W().getLayoutManager().getItemCount() - 1) {
            m134753Y0();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m134732M0() {
        getAct().duringCreated(PhotoAlbumFeedFrag.f42473F).subscribe(psd0.m173597H(new y20() { // from class: l.me70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136440a.m134779v0((Integer) obj);
            }
        }, new y20() { // from class: l.ne70
            @Override // p153l.y20
            public final void call(Object obj) {
                hf70.m134717z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final Runnable m134733N(final PhotoAlbumBottomView photoAlbumBottomView) {
        return new Runnable() { // from class: l.qe70
            @Override // java.lang.Runnable
            public final void run() {
                photoAlbumBottomView.m64625a2("moment_stay");
            }
        };
    }

    /* JADX INFO: renamed from: N0 */
    public void m134734N0(Act act) {
        this.f109244l = act;
    }

    /* JADX INFO: renamed from: O */
    public void m134735O() {
        m134752Y().m214397m();
        if (NullChecker.m82486a(this.f109249q)) {
            this.f109244l.removeKeyboardListener(this.f109233a, this.f109249q);
        }
        m134694W().removeOnScrollListener(this.f109229I);
    }

    /* JADX INFO: renamed from: O0 */
    public void m134736O0() {
        this.f109243k.m65209g5(new x20() { // from class: l.bf70
            @Override // p153l.x20
            public final void call() {
                this.f76465a.m134780w0();
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m134737P() {
        if (NullChecker.m82486a(this.f109230J)) {
            C4499d.m21895l().m21899k(this.f109230J);
            this.f109230J = null;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m134738P0() {
        this.f109243k.m65210h5(this);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m134739Q(pf60<Links, List<Moment>> pf60Var, List<Moment> list) {
        List<Moment> list2 = pf60Var.f152157b;
        int i = 0;
        if (list2 == null) {
            return false;
        }
        for (final Moment moment : list) {
            Moment moment2 = (Moment) jyb.m147529r(list2, new qcj() { // from class: l.re70
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Moment) obj).f56859id, moment.f56859id));
                }
            });
            if (moment2 == null) {
                list2.add(i, moment);
            } else {
                list2.remove(moment2);
                list2.add(i, moment2);
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m134740Q0(boolean z) {
        this.f109255w = z;
    }

    /* JADX INFO: renamed from: R */
    public boolean m134741R(pf60<Links, List<Moment>> pf60Var, final Moment moment) {
        List<Moment> list = pf60Var.f152157b;
        if (list == null) {
            return false;
        }
        Moment moment2 = (Moment) jyb.m147529r(list, new qcj() { // from class: l.se70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Moment) obj).f56859id, moment.f56859id));
            }
        });
        if (moment2 == null) {
            list.add(0, moment);
            return true;
        }
        list.remove(moment2);
        list.add(0, moment2);
        return true;
    }

    /* JADX INFO: renamed from: R0 */
    public void m134742R0(boolean z) {
        this.f109251s = z;
        if (NullChecker.m82486a(this.f109243k)) {
            m134752Y().m214390K(this.f109251s);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m134743S() {
        if (ksg.m151213k0(this.f109245m.f120402g)) {
            int iM105594z0 = bnl0.m105594z0(this.f109244l) / 2;
            int iM105590x0 = bnl0.m105590x0(this.f109244l) / 2;
            int[] iArr = new int[2];
            m134694W().getLocationInWindow(iArr);
            View viewFindChildViewUnder = m134694W().findChildViewUnder(iM105594z0 - iArr[0], iM105590x0 - iArr[1]);
            if (viewFindChildViewUnder == null) {
                return;
            }
            if (viewFindChildViewUnder instanceof PhotoAlbumTopView) {
                m134747U(((PhotoAlbumTopView) viewFindChildViewUnder).f42796c.f88791a);
                return;
            }
            if (viewFindChildViewUnder instanceof FeedCenterView) {
                m134747U(((FeedCenterView) viewFindChildViewUnder).f42742i);
                return;
            }
            if (viewFindChildViewUnder instanceof FeedListImageLinkItem) {
                m134747U(((FeedListImageLinkItem) viewFindChildViewUnder).f41695j);
            } else if (viewFindChildViewUnder instanceof FeedListTextWithLinkItem) {
                m134747U(((FeedListTextWithLinkItem) viewFindChildViewUnder).f41722i);
            } else if (viewFindChildViewUnder instanceof PhotoAlbumBottomView) {
                m134745T((PhotoAlbumBottomView) viewFindChildViewUnder);
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m134744S0(y20<String> y20Var) {
        if (NullChecker.m82486a(this.f109243k)) {
            m134752Y().m153732P(y20Var);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m134745T(PhotoAlbumBottomView photoAlbumBottomView) {
        this.f109225E = m134733N(photoAlbumBottomView);
        if (cmg.m111247z()) {
            f109219M = 2000L;
        }
        l51.m152888H(this.f109244l, this.f109225E, f109219M);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m134746T0() {
        final FeedBannersView feedBannersView = new FeedBannersView(this.f109244l, this.f109245m.f120399d);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, (int) (((bnl0.m105592y0() - qa00.m175859d(24.0f)) * 100.0f) / 351.0f));
        marginLayoutParams.leftMargin = qa00.m175859d(12.0f);
        marginLayoutParams.rightMargin = qa00.m175859d(12.0f);
        marginLayoutParams.bottomMargin = qa00.m175859d(2.0f);
        feedBannersView.setLayoutParams(marginLayoutParams);
        feedBannersView.setVisibility(8);
        this.f109248p.addView(feedBannersView);
        pk50.m172568j().m172586s().subscribe(psd0.m173597H(new y20() { // from class: l.oe70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146974a.m134781x0(feedBannersView, (OMSData) obj);
            }
        }, new y20() { // from class: l.pe70
            @Override // p153l.y20
            public final void call(Object obj) {
                hf70.m134709n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public final void m134747U(Moment moment) {
        if (moment == null) {
            return;
        }
        int childCount = m134694W().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = m134694W().getChildAt(i);
            if (NullChecker.m82486a(childAt) && (childAt instanceof PhotoAlbumBottomView)) {
                PhotoAlbumBottomView photoAlbumBottomView = (PhotoAlbumBottomView) childAt;
                if (NullChecker.m82486a(photoAlbumBottomView.f41942K) && moment.f56859id.equals(photoAlbumBottomView.f41942K.f56859id)) {
                    m134745T(photoAlbumBottomView);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m134748U0(final Group group, List<User> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("欢迎加入，成为第 ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(group.userCounter));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f109244l.getResources().getColor(k9c0.f124521n)), length, String.valueOf(group.userCounter).length() + length, 33);
        StringBuilder sb = new StringBuilder(" 位");
        sb.append(group.isGroupAnonymousType() ? "圈友" : group.memberRole);
        spannableStringBuilder.append((CharSequence) sb.toString());
        yah yahVarM214883I = new yah(this.f109244l, fgc0.f98902e).m214884u(spannableStringBuilder).m214881G(group.isGroupAnonymousType()).m214880F(group.headIcon).m214883I(new Runnable() { // from class: l.ye70
            @Override // java.lang.Runnable
            public final void run() {
                this.f198669a.m134782y0(group);
            }
        });
        yahVarM214883I.m214879E(list);
        yahVarM214883I.show();
    }

    /* JADX INFO: renamed from: V */
    public RecyclerView.AbstractC0579o m134749V() {
        return m134694W().getLayoutManager();
    }

    /* JADX INFO: renamed from: V0 */
    public void m134750V0(final String str) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_newuser_checkin_record_pop", Dialog.class.getName());
        this.f109232L = new jl80.C17971a(this.f109244l).m146024S(lbc0.f131122q3).m146056y0("恭喜！获得7日新人挂件").m146051t0("100流量曝光已生效，特权期间发动态可获得更多互动").m146034c0("领取", new Runnable() { // from class: l.te70
            @Override // java.lang.Runnable
            public final void run() {
                this.f173447a.m134783z0(str);
            }
        }).m146029X("放弃", new Runnable() { // from class: l.ue70
            @Override // java.lang.Runnable
            public final void run() {
                this.f178638a.m134718A0();
            }
        }).m146021P(false).m146046o0(new DialogInterface.OnShowListener() { // from class: l.we70
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                hf70.m134710q(l4g0VarM204399c, dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.xe70
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m134751W0() {
        if (this.f109245m.m144541G0()) {
            View viewInflate = this.f109244l.inflater().inflate(tec0.f173593V1, (ViewGroup) null);
            ((FeedPersonalizeSuggestGuideView) viewInflate.findViewById(hdc0.f108936k1)).m66359i(this.f109244l);
            this.f109248p.addView(viewInflate);
        }
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: X0 */
    public s8h mo63215X0() {
        m134701d0();
        m134728K();
        if (!NullChecker.m82486a(this.f109248p) || this.f109248p.getChildCount() <= 0) {
            return null;
        }
        s8h s8hVar = new s8h(this.f109246n);
        this.f109247o = s8hVar;
        s8hVar.m222265H(this.f109248p);
        this.f109246n.m65113s0(1);
        return this.f109247o;
    }

    /* JADX INFO: renamed from: Y */
    public final ld70 m134752Y() {
        return (ld70) this.f109243k.f42302z;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m134753Y0() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) m134694W().getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        for (int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition(); iFindLastVisibleItemPosition >= iFindFirstVisibleItemPosition; iFindLastVisibleItemPosition--) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
            if (viewFindViewByPosition instanceof FeedSvipLimitedMomentItemView) {
                ((FeedSvipLimitedMomentItemView) viewFindViewByPosition).m66438f();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m134754Z() {
        SimplePushBubble simplePushBubble = this.f109226F;
        if (simplePushBubble != null) {
            simplePushBubble.m22134I();
        }
        this.f109226F = null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m134755Z0() {
        if (x3e.m209204b().m209205c()) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f109244l).inflate(tec0.f173529K3, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(hdc0.f108921g2);
        int iNextInt = new Random().nextInt(26) + 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("已为你更新了 ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(iNextInt));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f109244l.getResources().getColor(k9c0.f124521n)), length, String.valueOf(iNextInt).length() + length, 33);
        spannableStringBuilder.append((CharSequence) " 条动态");
        textView.setText(spannableStringBuilder);
        this.f109226F = new SimplePushBubble.C4523a(this.f109244l, viewInflate).m22163B(1).m22172w(2000).m22175z(new b3m("feed_showUpdateSuccessTips")).m22168s();
        llb0.m154703c().m154710i(this.f109226F);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: a1 */
    public boolean mo134756a1(pf60<Links, List<Moment>> pf60Var) {
        if (this.f109222B) {
            boolean zM147479J = jyb.m147479J(pf60Var.f152157b);
            je70 je70Var = this.f109245m;
            if (!zM147479J) {
                if (je70Var.f120402g == 12) {
                    int iIntValue = FeedModule.f39703d.f121308K.get().intValue();
                    if (iIntValue < f109220N && !x3e.m209204b().m209205c()) {
                        m134759d1();
                        FeedModule.f39703d.f121308K.put(Integer.valueOf(iIntValue + 1));
                    }
                } else {
                    m134755Z0();
                }
                if (this.f109245m.f120402g == 14 && !cmg.m111235t()) {
                    l51.m152889I(this.f109242j, new Runnable() { // from class: l.cf70
                        @Override // java.lang.Runnable
                        public final void run() {
                            pu20.f154137b.onNext(uxj0.f181467a);
                        }
                    }, 3000L);
                }
            } else if (je70Var.f120402g == 14 && !cmg.m111235t()) {
                pu20.f154137b.onNext(uxj0.f181467a);
            }
            this.f109222B = false;
            if (this.f109223C) {
                FeedModule.m61406H().mo31720Pq(this.f109244l, true);
                this.f109223C = false;
            }
            if (NullChecker.m82486a(this.f109248p)) {
                for (int i = 0; i < this.f109248p.getChildCount(); i++) {
                    final View childAt = this.f109248p.getChildAt(i);
                    if (childAt instanceof FeedPersonalizeSuggestGuideView) {
                        this.f109248p.postDelayed(new Runnable() { // from class: l.df70
                            @Override // java.lang.Runnable
                            public final void run() {
                                bnl0.m105524M(childAt, false);
                            }
                        }, 500L);
                        break;
                    }
                }
            }
        }
        this.f109221A = true;
        if (NullChecker.m82486a(this.f109257y)) {
            m134741R(pf60Var, this.f109257y);
            this.f109257y = null;
        }
        if (!jyb.m147479J(this.f109258z)) {
            m134739Q(pf60Var, this.f109258z);
            this.f109258z = null;
        }
        return false;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f109244l;
    }

    /* JADX INFO: renamed from: b0 */
    public void m134757b0(boolean z) {
        m134697a0(false);
        if (orb0.m168903t(this.f109244l)) {
            orb0.m168909z(this.f109244l, true);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m134758c0(boolean z) {
        if (this.f109250r && this.f109251s && this.f109244l.hasWindowFocus()) {
            if (!orb0.m168903t(this.f109244l)) {
                m134697a0(true);
            } else if (orb0.m168900q(this.f109244l)) {
                orb0.m168909z(this.f109244l, false);
                m134697a0(true);
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m134759d1() {
        View viewInflate = LayoutInflater.from(this.f109244l).inflate(tec0.f173529K3, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(hdc0.f108921g2)).setText("右滑喜欢的人的动态会出现在这里");
        this.f109226F = new SimplePushBubble.C4523a(this.f109244l, viewInflate).m22163B(1).m22172w(2000).m22175z(new b3m("feed_update_success_small")).m22168s();
        llb0.m154703c().m154710i(this.f109226F);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m134760e0() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) this.f109242j.getChildFragmentManager().m2558i0("PhotoAlbumFeedBaseFrag");
        this.f109243k = photoAlbumFeedBaseFrag;
        if (NullChecker.m82486a(photoAlbumFeedBaseFrag)) {
            m134738P0();
            m134736O0();
            return;
        }
        je70 je70Var = this.f109245m;
        this.f109243k = PhotoAlbumFeedBaseFrag.m65218p5(je70Var.f120398c, je70Var.f120399d, je70Var.f120400e, je70Var.f120401f, je70Var.f120402g, je70Var.f120403h);
        m134738P0();
        m134736O0();
        AbstractC0428k abstractC0428kM2568m = this.f109242j.getChildFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108918g, this.f109243k, "PhotoAlbumFeedBaseFrag");
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: e1 */
    public void m134761e1() {
        this.f109224D = true;
    }

    /* JADX INFO: renamed from: f0 */
    public void m134762f0() {
        this.f109235c.setOnClickListener(new View.OnClickListener() { // from class: l.gf70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103889a.m134774p0(view);
            }
        });
        this.f109235c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.le70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f131719a.m134775q0(view);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final void m134763f1() {
        if (FeedModule.f39703d.f121349e0.get().booleanValue()) {
            return;
        }
        int i = this.f109245m.f120402g;
        if ((i == 1 || i == 14 || i == 15 || i == 17 || i == 18 || i == 12 || i == 0) && (m134749V() instanceof LinearLayoutManager)) {
            int iFindFirstVisibleItemPosition = ((LinearLayoutManager) m134749V()).findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) m134749V()).findLastVisibleItemPosition();
            for (int iMax = Math.max(0, iFindFirstVisibleItemPosition); iMax < Math.min(iFindLastVisibleItemPosition, this.f109246n.f42236m.f184001a.size()); iMax++) {
                View viewFindViewByPosition = ((LinearLayoutManager) m134749V()).findViewByPosition(iMax);
                if (NullChecker.m82486a(viewFindViewByPosition) && (viewFindViewByPosition instanceof PhotoAlbumTopView) && this.f109230J == null) {
                    this.f109230J = ((PhotoAlbumTopView) viewFindViewByPosition).m65891K();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m134764g0(Bundle bundle) {
        m134760e0();
        m134725I0();
        if (cmg.m111220l0()) {
            FeedNewUserBubbleView feedNewUserBubbleView = new FeedNewUserBubbleView(this.f109244l);
            this.f109227G = feedNewUserBubbleView;
            feedNewUserBubbleView.m66347M(this.f109242j, this.f109245m.f120402g);
        }
        if (this.f109245m.m144550U0()) {
            this.f109236d.mo64426o(this.f109245m.f120402g);
            this.f109236d.m64417E(new y20() { // from class: l.ve70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183708a.m134776r0((Moment) obj);
                }
            }, new y20() { // from class: l.ze70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203983a.m134777t0((Moment) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m134765g1() {
        int i = this.f109245m.f120402g;
        if ((i == 1 || i == 14 || i == 15 || i == 17 || i == 18 || i == 12) && !this.f109223C && !this.f109224D && (m134749V() instanceof LinearLayoutManager)) {
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) m134749V()).findLastVisibleItemPosition();
            int i2 = 0;
            for (int i3 = 0; i3 < Math.min(iFindLastVisibleItemPosition, this.f109246n.f42236m.f184001a.size()); i3++) {
                if (this.f109246n.f42236m.f184001a.get(i3).f42197b == 1) {
                    i2++;
                }
            }
            if (i2 > 10) {
                this.f109223C = true;
                FeedModule.m61406H().mo31782jg(this.f109244l, true);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m134766h0(List<Moment> list) {
        ArrayList arrayList = new ArrayList();
        this.f109258z = arrayList;
        arrayList.addAll(list);
        this.f109257y = null;
        if (!this.f109221A) {
            return true;
        }
        m134720D0();
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m134767i0(Moment moment) {
        this.f109257y = moment;
        this.f109258z = null;
        if (!this.f109221A) {
            return true;
        }
        m134720D0();
        return true;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM134724I = m134724I(layoutInflater, viewGroup);
        this.f109249q = this.f109244l.setKeyboardListener(viewM134724I, this.f109228H);
        if (!TextUtils.equals(this.f109245m.f120399d, "from_nearby_online")) {
            bnl0.m105554f0(this.f109233a, (!cmg.m111235t() || TextUtils.equals(this.f109245m.f120399d, "from_discover_discussion")) ? qa00.m175859d(44.0f) + bnl0.m105511F0() : qa00.m175859d(44.0f));
        }
        viewM134724I.setBackgroundColor(this.f109242j.getResources().getColor(k9c0.f124526p0));
        return viewM134724I;
    }

    /* JADX INFO: renamed from: j0 */
    public void m134768j0() {
        this.f109256x = true;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m134769k0() {
        try {
            return new JSONObject(RemoteConfig.m80481x().m80485F("newuser_checkin")).optBoolean("fixed");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m134770l0() {
        if (NullChecker.m82486a(this.f109243k)) {
            return m134752Y().mo153736w();
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ boolean m134771m0(View view, MotionEvent motionEvent) {
        m134757b0(true);
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m134772n0(TopicOperations topicOperations) {
        if (!this.f109245m.m144540F0()) {
            m134751W0();
            return;
        }
        if (m134769k0()) {
            this.f109238f.addView(this.f109227G);
        } else {
            this.f109248p.addView(this.f109227G);
        }
        this.f109227G.m66348O(FeedModule.f39703d.f121301H1);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: n1 */
    public boolean mo63216n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m134773o0(Throwable th) {
        m134751W0();
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: p */
    public void mo63218p() {
        int i = this.f109245m.f120402g;
        if (i == 1 || i == 14 || i == 15 || i == 17 || i == 18 || i == 12) {
            this.f109222B = true;
        }
        if (NullChecker.m82486a(this.f109248p)) {
            for (int i2 = 0; i2 < this.f109248p.getChildCount(); i2++) {
                KeyEvent.Callback childAt = this.f109248p.getChildAt(i2);
                if (childAt instanceof qxh) {
                    ((qxh) childAt).mo66960b();
                }
                if (childAt instanceof MomentSeeEntryAndTopicHeaderView) {
                    ((MomentSeeEntryAndTopicHeaderView) childAt).m64439R(this.f109242j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m134774p0(View view) {
        this.f109245m.m144546P0();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean m134775q0(View view) {
        this.f109245m.m144548R0();
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m134776r0(Moment moment) {
        cn40.m111370V(moment, false, false, null);
        m134721E0(moment, "p_moment_post");
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: s0 */
    public C11443a mo63219s0() {
        C11443a c11443aM214400s = m134752Y().m214400s();
        this.f109246n = c11443aM214400s;
        return c11443aM214400s;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m134777t0(Moment moment) {
        m134695X().f182605b.mo137269k(moment);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m134778u0(Boolean bool) {
        if (bool.booleanValue()) {
            m134757b0(false);
            if (this.f109253u != 0) {
                if (this.f109254v == -1 || this.f109252t) {
                    this.f109254v = m134694W().getMeasuredHeight();
                }
                if (this.f109252t) {
                    this.f109252t = false;
                }
                ((LinearLayoutManager) m134694W().getLayoutManager()).scrollToPositionWithOffset(this.f109253u, this.f109254v - qa00.m175859d(48.0f));
            }
            m134758c0(false);
        }
        this.f109253u = 0;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m134779v0(Integer num) {
        if (this.f109245m.f120402g == num.intValue()) {
            m134723H0();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m134780w0() {
        this.f109245m.m144536A0();
        m134694W().clearOnScrollListeners();
        m134694W().addOnScrollListener(this.f109229I);
        m134752Y().m214390K(this.f109251s);
        this.f109243k.m65212j5(this.f109255w);
        if (this.f109231K) {
            this.f109243k.m65204b5();
        }
        if (this.f109245m.m144550U0()) {
            this.f109245m.m144554x0();
        }
        m134732M0();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m134781x0(FeedBannersView feedBannersView, OMSData oMSData) {
        if (oMSData.slots.size() <= 0 || oMSData.slots.get(0).nearbyBanners.size() <= 0) {
            return;
        }
        for (NearbyBanner nearbyBanner : oMSData.slots.get(0).nearbyBanners) {
            List<Long> list = nearbyBanner.timeRange;
            long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime() / 1000;
            if (list.get(0).longValue() <= jGuessedCurrentServerTime && list.get(1).longValue() >= jGuessedCurrentServerTime && nearbyBanner.materials.size() > 0) {
                feedBannersView.setVisibility(0);
                feedBannersView.m66642h(getAct(), nearbyBanner.materials, nearbyBanner.slideshowSec);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m134782y0(Group group) {
        Act act = this.f109244l;
        act.startActivity(new FeedGroupDetailAct.C11363a(act, group.f56859id).m63171b().m63170a());
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m134783z0(String str) {
        this.f109232L.dismiss();
        tfj0.m190939b("e_newuser_checkin_record_pop_get", "p_newuser_checkin_record_pop", new tfj0.C20302a[0]);
        FeedModule.f39703d.m145734kc(str);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
