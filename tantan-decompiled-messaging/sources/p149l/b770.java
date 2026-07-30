package p149l;

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
import androidx.fragment.app.AbstractC0427k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.NearbyBanner;
import com.p046p1.mobile.putong.data.OMSData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithLinkItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.MomentPostBar;
import com.p046p1.mobile.putong.feed.newui.photoalbum.MomentSeeEntryAndTopicHeaderView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.p059ai.FeedAiStoryHeadView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedNewUserBubbleView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedPersonalizeSuggestGuideView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedSvipLimitedMomentItemView;
import com.p046p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateFollowFeedHeaderView;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p149l.d670;

/* JADX INFO: loaded from: classes12.dex */
public class b770<P extends d670> implements s7m<P>, yzl {

    /* JADX INFO: renamed from: M */
    public static long f73909M = 5000;

    /* JADX INFO: renamed from: N */
    public static int f73910N = 3;

    /* JADX INFO: renamed from: A */
    public boolean f73911A;

    /* JADX INFO: renamed from: B */
    public boolean f73912B;

    /* JADX INFO: renamed from: C */
    public boolean f73913C;

    /* JADX INFO: renamed from: D */
    public boolean f73914D;

    /* JADX INFO: renamed from: E */
    public Runnable f73915E;

    /* JADX INFO: renamed from: F */
    public SimplePushBubble f73916F;

    /* JADX INFO: renamed from: G */
    public FeedNewUserBubbleView f73917G;

    /* JADX INFO: renamed from: J */
    public String f73920J;

    /* JADX INFO: renamed from: K */
    public boolean f73921K;

    /* JADX INFO: renamed from: L */
    public dd80 f73922L;

    /* JADX INFO: renamed from: a */
    public VLinear f73923a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f73924b;

    /* JADX INFO: renamed from: c */
    public VImage f73925c;

    /* JADX INFO: renamed from: d */
    public MomentPostBar f73926d;

    /* JADX INFO: renamed from: e */
    public FeedDraftView f73927e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f73928f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f73929g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f73930h;

    /* JADX INFO: renamed from: j */
    public PhotoAlbumFeedFrag f73932j;

    /* JADX INFO: renamed from: k */
    public PhotoAlbumFeedBaseFrag f73933k;

    /* JADX INFO: renamed from: l */
    public Act f73934l;

    /* JADX INFO: renamed from: m */
    public d670 f73935m;

    /* JADX INFO: renamed from: n */
    public C11280a f73936n;

    /* JADX INFO: renamed from: o */
    public d7h f73937o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f73938p;

    /* JADX INFO: renamed from: q */
    public ViewTreeObserver.OnGlobalLayoutListener f73939q;

    /* JADX INFO: renamed from: r */
    public boolean f73940r;

    /* JADX INFO: renamed from: t */
    public boolean f73942t;

    /* JADX INFO: renamed from: u */
    public int f73943u;

    /* JADX INFO: renamed from: w */
    public boolean f73945w;

    /* JADX INFO: renamed from: x */
    public boolean f73946x;

    /* JADX INFO: renamed from: y */
    public Moment f73947y;

    /* JADX INFO: renamed from: z */
    public List<Moment> f73948z;

    /* JADX INFO: renamed from: i */
    public final int f73931i = 10;

    /* JADX INFO: renamed from: s */
    public boolean f73941s = false;

    /* JADX INFO: renamed from: v */
    public int f73944v = -1;

    /* JADX INFO: renamed from: H */
    public e30<Boolean> f73918H = new e30() { // from class: l.e670
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f89510a.m100615u0((Boolean) obj);
        }
    };

    /* JADX INFO: renamed from: I */
    public RecyclerView.AbstractC0582t f73919I = new C15819a();

    /* JADX INFO: renamed from: l.b770$a */
    public class C15819a extends RecyclerView.AbstractC0582t {
        public C15819a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            b770.this.f73935m.m110144Q0(i);
            if (nkg.m159891l0()) {
                b770.this.f73932j.m64367P4();
            }
            b770 b770Var = b770.this;
            if (i != 0) {
                b770Var.f73914D = false;
                b770Var.m100560H0();
                return;
            }
            b770Var.m100602g1();
            b770.this.m100580S();
            if (nkg.m159852I()) {
                b770 b770Var2 = b770.this;
                if (b770Var2.f73935m.f84599g == 12) {
                    b770Var2.m100568M();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            b770.this.m100600f1();
        }
    }

    public b770(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f73932j = photoAlbumFeedFrag;
    }

    /* JADX INFO: renamed from: W */
    private VRecyclerView m100531W() {
        return m100589Y().f94967p;
    }

    /* JADX INFO: renamed from: X */
    private py60 m100532X() {
        return this.f73933k.f41451A;
    }

    /* JADX INFO: renamed from: a0 */
    private void m100534a0(boolean z) {
        if (z) {
            m100531W().setOnTouchListener(new View.OnTouchListener() { // from class: l.u670
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f174814a.m100608m0(view, motionEvent);
                }
            });
        } else {
            m100531W().setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m100538d0() {
        LinearLayout linearLayout = new LinearLayout(this.f73934l);
        this.f73938p = linearLayout;
        linearLayout.setOrientation(1);
        ab70.C15567a c15567a = ab70.m95586a().m95587b().get(this.f73935m.f84596d);
        boolean zM110139H0 = this.f73935m.m110139H0();
        boolean zM110136E0 = this.f73935m.m110136E0();
        boolean zM110135D0 = this.f73935m.m110135D0();
        if (this.f73935m.m110134C0()) {
            this.f73938p.addView(new FeedAiStoryHeadView(this.f73934l));
        }
        if (!nkg.m159891l0()) {
            m100588W0();
        } else if (this.f73935m.m110137F0()) {
            if (m100606k0()) {
                this.f73928f.addView(this.f73917G);
            } else {
                this.f73938p.addView(this.f73917G);
            }
            this.f73917G.m65165O(FeedModule.f38855d.f192991H1);
        } else {
            this.f73934l.duringCreated(FeedModule.f38855d.m209326Mc()).subscribe(mkd0.m154956H(new e30() { // from class: l.y670
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f196525a.m100609n0((TopicOperations) obj);
                }
            }, new e30() { // from class: l.z670
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201893a.m100610o0((Throwable) obj);
                }
            }));
        }
        if ((NullChecker.m81303a(c15567a) && c15567a.f68630b) || zM110136E0 || zM110139H0 || zM110135D0) {
            if (zM110139H0) {
                MomentSeeEntryAndTopicHeaderView momentSeeEntryAndTopicHeaderView = new MomentSeeEntryAndTopicHeaderView(this.f73934l);
                this.f73938p.addView(momentSeeEntryAndTopicHeaderView);
                momentSeeEntryAndTopicHeaderView.m63255Q(this.f73932j);
            } else if (zM110136E0) {
                this.f73938p.addView(new TopicNearByHeaderView(this.f73934l));
            } else if (zM110135D0) {
                this.f73938p.addView(new FeedStateFollowFeedHeaderView(this.f73934l, this.f73935m.f84596d));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m100546n(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m100547p(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133797f(cwf0Var);
        p6j0.m167670d("e_newuser_checkin_record_pop_get", "p_newuser_checkin_record_pop", new p6j0.C19147a[0]);
        p6j0.m167670d("e_newuser_checkin_record_pop_giveup", "p_newuser_checkin_record_pop", new p6j0.C19147a[0]);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m100554z(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m100555A0() {
        this.f73922L.dismiss();
        p6j0.m167668b("e_newuser_checkin_record_pop_giveup", "p_newuser_checkin_record_pop", new p6j0.C19147a[0]);
    }

    /* JADX INFO: renamed from: B0 */
    public void m100556B0(int i) {
        this.f73936n.notifyItemChanged(i);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public void m100557D0() {
        if (NullChecker.m81303a(this.f73933k)) {
            m100589Y().mo119485z();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m100558E0(Moment moment, String str) {
        this.f73926d.mo63252y(moment);
        m100531W().scrollToPosition(0);
    }

    /* JADX INFO: renamed from: G0 */
    public void m100559G0() {
        this.f73921K = true;
    }

    /* JADX INFO: renamed from: H0 */
    public void m100560H0() {
        e51.m114745J(this.f73915E);
    }

    /* JADX INFO: renamed from: I */
    public View m100561I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c770.m105528b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m100562I0() {
        boolean zM159904s = nkg.m159904s();
        d670 d670Var = this.f73935m;
        if (zM159904s) {
            if (d670Var.f84599g == 14) {
                this.f73927e.m65118b0(this.f73932j);
            }
        } else {
            int i = d670Var.f84599g;
            if (i == 0 || i == 12) {
                this.f73927e.m65118b0(this.f73932j);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m100563J() {
        c770.m105529c(this);
    }

    /* JADX INFO: renamed from: J0 */
    public void m100564J0(List<TopicMoment> list) {
        for (int i = 0; i < this.f73938p.getChildCount(); i++) {
            View childAt = this.f73938p.getChildAt(i);
            if (childAt instanceof TopicNearByHeaderView) {
                ((TopicNearByHeaderView) childAt).m66127f(list);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m100565K() {
        if (fm20.m122132o().size() > 0) {
            if (fm20.m122132o().contains(vqg.m199515K(this.f73935m.f84596d, false))) {
                m100583T0();
            }
        } else if (this.f73946x) {
            m100583T0();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m100566K0(boolean z) {
        xdl0.m208344M(this.f73924b, z);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(d670 d670Var) {
        this.f73935m = d670Var;
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo62028L0() {
        return this.f73935m.m110152y0();
    }

    /* JADX INFO: renamed from: M */
    public final void m100568M() {
        if (m100531W() == null) {
            return;
        }
        View childAt = m100531W().getLayoutManager().getChildAt(m100531W().getLayoutManager().getChildCount() - 1);
        int bottom = childAt.getBottom();
        int bottom2 = m100531W().getBottom() - m100531W().getPaddingBottom();
        int position = m100531W().getLayoutManager().getPosition(childAt);
        if (bottom == bottom2 && position == m100531W().getLayoutManager().getItemCount() - 1) {
            m100590Y0();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m100569M0() {
        getAct().duringCreated(PhotoAlbumFeedFrag.f41625F).subscribe(mkd0.m154956H(new e30() { // from class: l.g670
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101236a.m100616v0((Integer) obj);
            }
        }, new e30() { // from class: l.h670
            @Override // p149l.e30
            public final void call(Object obj) {
                b770.m100554z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final Runnable m100570N(final PhotoAlbumBottomView photoAlbumBottomView) {
        return new Runnable() { // from class: l.k670
            @Override // java.lang.Runnable
            public final void run() {
                photoAlbumBottomView.m63442a2("moment_stay");
            }
        };
    }

    /* JADX INFO: renamed from: N0 */
    public void m100571N0(Act act) {
        this.f73934l = act;
    }

    /* JADX INFO: renamed from: O */
    public void m100572O() {
        m100589Y().m186627m();
        if (NullChecker.m81303a(this.f73939q)) {
            this.f73934l.removeKeyboardListener(this.f73923a, this.f73939q);
        }
        m100531W().removeOnScrollListener(this.f73919I);
    }

    /* JADX INFO: renamed from: O0 */
    public void m100573O0() {
        this.f73933k.m64026g5(new d30() { // from class: l.v670
            @Override // p149l.d30
            public final void call() {
                this.f180164a.m100617w0();
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m100574P() {
        if (NullChecker.m81303a(this.f73920J)) {
            C4348d.m20896l().m20900k(this.f73920J);
            this.f73920J = null;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m100575P0() {
        this.f73933k.m64027h5(this);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m100576Q(j760<Links, List<Moment>> j760Var, List<Moment> list) {
        List<Moment> list2 = j760Var.f116565b;
        int i = 0;
        if (list2 == null) {
            return false;
        }
        for (final Moment moment : list) {
            Moment moment2 = (Moment) vwb.m200346r(list2, new w9j() { // from class: l.l670
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Moment) obj).f56011id, moment.f56011id));
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
    public void m100577Q0(boolean z) {
        this.f73945w = z;
    }

    /* JADX INFO: renamed from: R */
    public boolean m100578R(j760<Links, List<Moment>> j760Var, final Moment moment) {
        List<Moment> list = j760Var.f116565b;
        if (list == null) {
            return false;
        }
        Moment moment2 = (Moment) vwb.m200346r(list, new w9j() { // from class: l.m670
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Moment) obj).f56011id, moment.f56011id));
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
    public void m100579R0(boolean z) {
        this.f73941s = z;
        if (NullChecker.m81303a(this.f73933k)) {
            m100589Y().m186620K(this.f73941s);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m100580S() {
        if (vqg.m199554k0(this.f73935m.f84599g)) {
            int iM208414z0 = xdl0.m208414z0(this.f73934l) / 2;
            int iM208410x0 = xdl0.m208410x0(this.f73934l) / 2;
            int[] iArr = new int[2];
            m100531W().getLocationInWindow(iArr);
            View viewFindChildViewUnder = m100531W().findChildViewUnder(iM208414z0 - iArr[0], iM208410x0 - iArr[1]);
            if (viewFindChildViewUnder == null) {
                return;
            }
            if (viewFindChildViewUnder instanceof PhotoAlbumTopView) {
                m100584U(((PhotoAlbumTopView) viewFindChildViewUnder).f41948c.f191689a);
                return;
            }
            if (viewFindChildViewUnder instanceof FeedCenterView) {
                m100584U(((FeedCenterView) viewFindChildViewUnder).f41894i);
                return;
            }
            if (viewFindChildViewUnder instanceof FeedListImageLinkItem) {
                m100584U(((FeedListImageLinkItem) viewFindChildViewUnder).f40847j);
            } else if (viewFindChildViewUnder instanceof FeedListTextWithLinkItem) {
                m100584U(((FeedListTextWithLinkItem) viewFindChildViewUnder).f40874i);
            } else if (viewFindChildViewUnder instanceof PhotoAlbumBottomView) {
                m100582T((PhotoAlbumBottomView) viewFindChildViewUnder);
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m100581S0(e30<String> e30Var) {
        if (NullChecker.m81303a(this.f73933k)) {
            m100589Y().m119480P(e30Var);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m100582T(PhotoAlbumBottomView photoAlbumBottomView) {
        this.f73915E = m100570N(photoAlbumBottomView);
        if (nkg.m159918z()) {
            f73909M = 2000L;
        }
        e51.m114743H(this.f73934l, this.f73915E, f73909M);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m100583T0() {
        final FeedBannersView feedBannersView = new FeedBannersView(this.f73934l, this.f73935m.f84596d);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, (int) (((xdl0.m208412y0() - t100.m186890d(24.0f)) * 100.0f) / 351.0f));
        marginLayoutParams.leftMargin = t100.m186890d(12.0f);
        marginLayoutParams.rightMargin = t100.m186890d(12.0f);
        marginLayoutParams.bottomMargin = t100.m186890d(2.0f);
        feedBannersView.setLayoutParams(marginLayoutParams);
        feedBannersView.setVisibility(8);
        this.f73938p.addView(feedBannersView);
        ic50.m135327j().m135345s().subscribe(mkd0.m154956H(new e30() { // from class: l.i670
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111681a.m100618x0(feedBannersView, (OMSData) obj);
            }
        }, new e30() { // from class: l.j670
            @Override // p149l.e30
            public final void call(Object obj) {
                b770.m100546n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public final void m100584U(Moment moment) {
        if (moment == null) {
            return;
        }
        int childCount = m100531W().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = m100531W().getChildAt(i);
            if (NullChecker.m81303a(childAt) && (childAt instanceof PhotoAlbumBottomView)) {
                PhotoAlbumBottomView photoAlbumBottomView = (PhotoAlbumBottomView) childAt;
                if (NullChecker.m81303a(photoAlbumBottomView.f41094K) && moment.f56011id.equals(photoAlbumBottomView.f41094K.f56011id)) {
                    m100582T(photoAlbumBottomView);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m100585U0(final Group group, List<User> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("欢迎加入，成为第 ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(group.userCounter));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f73934l.getResources().getColor(e1c0.f88798n)), length, String.valueOf(group.userCounter).length() + length, 33);
        StringBuilder sb = new StringBuilder(" 位");
        sb.append(group.isGroupAnonymousType() ? "圈友" : group.memberRole);
        spannableStringBuilder.append((CharSequence) sb.toString());
        j9h j9hVarM140564I = new j9h(this.f73934l, a8c0.f68016e).m140565u(spannableStringBuilder).m140562G(group.isGroupAnonymousType()).m140561F(group.headIcon).m140564I(new Runnable() { // from class: l.s670
            @Override // java.lang.Runnable
            public final void run() {
                this.f162621a.m100619y0(group);
            }
        });
        j9hVarM140564I.m140560E(list);
        j9hVarM140564I.show();
    }

    /* JADX INFO: renamed from: V */
    public RecyclerView.AbstractC0577o m100586V() {
        return m100531W().getLayoutManager();
    }

    /* JADX INFO: renamed from: V0 */
    public void m100587V0(final String str) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_newuser_checkin_record_pop", Dialog.class.getName());
        this.f73922L = new dd80.C16336a(this.f73934l).m110964S(f3c0.f94604q3).m110996y0("恭喜！获得7日新人挂件").m110991t0("100流量曝光已生效，特权期间发动态可获得更多互动").m110974c0("领取", new Runnable() { // from class: l.n670
            @Override // java.lang.Runnable
            public final void run() {
                this.f137275a.m100620z0(str);
            }
        }).m110969X("放弃", new Runnable() { // from class: l.o670
            @Override // java.lang.Runnable
            public final void run() {
                this.f141985a.m100555A0();
            }
        }).m110961P(false).m110986o0(new DialogInterface.OnShowListener() { // from class: l.q670
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                b770.m100547p(cwf0VarM133794c, dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.r670
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m100588W0() {
        if (this.f73935m.m110138G0()) {
            View viewInflate = this.f73934l.inflater().inflate(o6c0.f142124V1, (ViewGroup) null);
            ((FeedPersonalizeSuggestGuideView) viewInflate.findViewById(b5c0.f73583k1)).m65176i(this.f73934l);
            this.f73938p.addView(viewInflate);
        }
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo62032X0() {
        m100538d0();
        m100565K();
        if (!NullChecker.m81303a(this.f73938p) || this.f73938p.getChildCount() <= 0) {
            return null;
        }
        d7h d7hVar = new d7h(this.f73936n);
        this.f73937o = d7hVar;
        d7hVar.m143815H(this.f73938p);
        this.f73936n.m63930s0(1);
        return this.f73937o;
    }

    /* JADX INFO: renamed from: Y */
    public final f570 m100589Y() {
        return (f570) this.f73933k.f41454z;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m100590Y0() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) m100531W().getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        for (int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition(); iFindLastVisibleItemPosition >= iFindFirstVisibleItemPosition; iFindLastVisibleItemPosition--) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
            if (viewFindViewByPosition instanceof FeedSvipLimitedMomentItemView) {
                ((FeedSvipLimitedMomentItemView) viewFindViewByPosition).m65255f();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m100591Z() {
        SimplePushBubble simplePushBubble = this.f73916F;
        if (simplePushBubble != null) {
            simplePushBubble.m21135I();
        }
        this.f73916F = null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m100592Z0() {
        if (j2e.m139429b().m139430c()) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f73934l).inflate(o6c0.f142060K3, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(b5c0.f73568g2);
        int iNextInt = new Random().nextInt(26) + 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("已为你更新了 ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(iNextInt));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f73934l.getResources().getColor(e1c0.f88798n)), length, String.valueOf(iNextInt).length() + length, 33);
        spannableStringBuilder.append((CharSequence) " 条动态");
        textView.setText(spannableStringBuilder);
        this.f73916F = new SimplePushBubble.C4372a(this.f73934l, viewInflate).m21164B(1).m21173w(2000).m21176z(new h0m("feed_showUpdateSuccessTips")).m21169s();
        hdb0.m130575c().m130582i(this.f73916F);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: a1 */
    public boolean mo100593a1(j760<Links, List<Moment>> j760Var) {
        if (this.f73912B) {
            boolean zM200296J = vwb.m200296J(j760Var.f116565b);
            d670 d670Var = this.f73935m;
            if (!zM200296J) {
                if (d670Var.f84599g == 12) {
                    int iIntValue = FeedModule.f38855d.f192998K.get().intValue();
                    if (iIntValue < f73910N && !j2e.m139429b().m139430c()) {
                        m100596d1();
                        FeedModule.f38855d.f192998K.put(Integer.valueOf(iIntValue + 1));
                    }
                } else {
                    m100592Z0();
                }
                if (this.f73935m.f84599g == 14 && !nkg.m159906t()) {
                    e51.m114744I(this.f73932j, new Runnable() { // from class: l.w670
                        @Override // java.lang.Runnable
                        public final void run() {
                            fm20.f98239b.onNext(roj0.f160388a);
                        }
                    }, 3000L);
                }
            } else if (d670Var.f84599g == 14 && !nkg.m159906t()) {
                fm20.f98239b.onNext(roj0.f160388a);
            }
            this.f73912B = false;
            if (this.f73913C) {
                FeedModule.m60222H().mo30717Pq(this.f73934l, true);
                this.f73913C = false;
            }
            if (NullChecker.m81303a(this.f73938p)) {
                for (int i = 0; i < this.f73938p.getChildCount(); i++) {
                    final View childAt = this.f73938p.getChildAt(i);
                    if (childAt instanceof FeedPersonalizeSuggestGuideView) {
                        this.f73938p.postDelayed(new Runnable() { // from class: l.x670
                            @Override // java.lang.Runnable
                            public final void run() {
                                xdl0.m208344M(childAt, false);
                            }
                        }, 500L);
                        break;
                    }
                }
            }
        }
        this.f73911A = true;
        if (NullChecker.m81303a(this.f73947y)) {
            m100578R(j760Var, this.f73947y);
            this.f73947y = null;
        }
        if (!vwb.m200296J(this.f73948z)) {
            m100576Q(j760Var, this.f73948z);
            this.f73948z = null;
        }
        return false;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f73934l;
    }

    /* JADX INFO: renamed from: b0 */
    public void m100594b0(boolean z) {
        m100534a0(false);
        if (kjb0.m146209t(this.f73934l)) {
            kjb0.m146215z(this.f73934l, true);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m100595c0(boolean z) {
        if (this.f73940r && this.f73941s && this.f73934l.hasWindowFocus()) {
            if (!kjb0.m146209t(this.f73934l)) {
                m100534a0(true);
            } else if (kjb0.m146206q(this.f73934l)) {
                kjb0.m146215z(this.f73934l, false);
                m100534a0(true);
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m100596d1() {
        View viewInflate = LayoutInflater.from(this.f73934l).inflate(o6c0.f142060K3, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(b5c0.f73568g2)).setText("右滑喜欢的人的动态会出现在这里");
        this.f73916F = new SimplePushBubble.C4372a(this.f73934l, viewInflate).m21164B(1).m21173w(2000).m21176z(new h0m("feed_update_success_small")).m21169s();
        hdb0.m130575c().m130582i(this.f73916F);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m100597e0() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) this.f73932j.getChildFragmentManager().m2557i0("PhotoAlbumFeedBaseFrag");
        this.f73933k = photoAlbumFeedBaseFrag;
        if (NullChecker.m81303a(photoAlbumFeedBaseFrag)) {
            m100575P0();
            m100573O0();
            return;
        }
        d670 d670Var = this.f73935m;
        this.f73933k = PhotoAlbumFeedBaseFrag.m64035p5(d670Var.f84595c, d670Var.f84596d, d670Var.f84597e, d670Var.f84598f, d670Var.f84599g, d670Var.f84600h);
        m100575P0();
        m100573O0();
        AbstractC0427k abstractC0427kM2567m = this.f73932j.getChildFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73565g, this.f73933k, "PhotoAlbumFeedBaseFrag");
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: e1 */
    public void m100598e1() {
        this.f73914D = true;
    }

    /* JADX INFO: renamed from: f0 */
    public void m100599f0() {
        this.f73925c.setOnClickListener(new View.OnClickListener() { // from class: l.a770
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67844a.m100611p0(view);
            }
        });
        this.f73925c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.f670
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f95237a.m100612q0(view);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final void m100600f1() {
        if (FeedModule.f38855d.f193039e0.get().booleanValue()) {
            return;
        }
        int i = this.f73935m.f84599g;
        if ((i == 1 || i == 14 || i == 15 || i == 17 || i == 18 || i == 12 || i == 0) && (m100586V() instanceof LinearLayoutManager)) {
            int iFindFirstVisibleItemPosition = ((LinearLayoutManager) m100586V()).findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) m100586V()).findLastVisibleItemPosition();
            for (int iMax = Math.max(0, iFindFirstVisibleItemPosition); iMax < Math.min(iFindLastVisibleItemPosition, this.f73936n.f41388m.f153135a.size()); iMax++) {
                View viewFindViewByPosition = ((LinearLayoutManager) m100586V()).findViewByPosition(iMax);
                if (NullChecker.m81303a(viewFindViewByPosition) && (viewFindViewByPosition instanceof PhotoAlbumTopView) && this.f73920J == null) {
                    this.f73920J = ((PhotoAlbumTopView) viewFindViewByPosition).m64708K();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m100601g0(Bundle bundle) {
        m100597e0();
        m100562I0();
        if (nkg.m159891l0()) {
            FeedNewUserBubbleView feedNewUserBubbleView = new FeedNewUserBubbleView(this.f73934l);
            this.f73917G = feedNewUserBubbleView;
            feedNewUserBubbleView.m65164M(this.f73932j, this.f73935m.f84599g);
        }
        if (this.f73935m.m110147U0()) {
            this.f73926d.mo63243o(this.f73935m.f84599g);
            this.f73926d.m63234E(new e30() { // from class: l.p670
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147377a.m100613r0((Moment) obj);
                }
            }, new e30() { // from class: l.t670
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167933a.m100614t0((Moment) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m100602g1() {
        int i = this.f73935m.f84599g;
        if ((i == 1 || i == 14 || i == 15 || i == 17 || i == 18 || i == 12) && !this.f73913C && !this.f73914D && (m100586V() instanceof LinearLayoutManager)) {
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) m100586V()).findLastVisibleItemPosition();
            int i2 = 0;
            for (int i3 = 0; i3 < Math.min(iFindLastVisibleItemPosition, this.f73936n.f41388m.f153135a.size()); i3++) {
                if (this.f73936n.f41388m.f153135a.get(i3).f41349b == 1) {
                    i2++;
                }
            }
            if (i2 > 10) {
                this.f73913C = true;
                FeedModule.m60222H().mo30779jg(this.f73934l, true);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m100603h0(List<Moment> list) {
        ArrayList arrayList = new ArrayList();
        this.f73948z = arrayList;
        arrayList.addAll(list);
        this.f73947y = null;
        if (!this.f73911A) {
            return true;
        }
        m100557D0();
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m100604i0(Moment moment) {
        this.f73947y = moment;
        this.f73948z = null;
        if (!this.f73911A) {
            return true;
        }
        m100557D0();
        return true;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM100561I = m100561I(layoutInflater, viewGroup);
        this.f73939q = this.f73934l.setKeyboardListener(viewM100561I, this.f73918H);
        if (!TextUtils.equals(this.f73935m.f84596d, "from_nearby_online")) {
            xdl0.m208374f0(this.f73923a, (!nkg.m159906t() || TextUtils.equals(this.f73935m.f84596d, "from_discover_discussion")) ? t100.m186890d(44.0f) + xdl0.m208331F0() : t100.m186890d(44.0f));
        }
        viewM100561I.setBackgroundColor(this.f73932j.getResources().getColor(e1c0.f88803p0));
        return viewM100561I;
    }

    /* JADX INFO: renamed from: j0 */
    public void m100605j0() {
        this.f73946x = true;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m100606k0() {
        try {
            return new JSONObject(RemoteConfig.m79298x().m79302F("newuser_checkin")).optBoolean("fixed");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m100607l0() {
        if (NullChecker.m81303a(this.f73933k)) {
            return m100589Y().mo119484w();
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ boolean m100608m0(View view, MotionEvent motionEvent) {
        m100594b0(true);
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m100609n0(TopicOperations topicOperations) {
        if (!this.f73935m.m110137F0()) {
            m100588W0();
            return;
        }
        if (m100606k0()) {
            this.f73928f.addView(this.f73917G);
        } else {
            this.f73938p.addView(this.f73917G);
        }
        this.f73917G.m65165O(FeedModule.f38855d.f192991H1);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo62033n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m100610o0(Throwable th) {
        m100588W0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m100611p0(View view) {
        this.f73935m.m110143P0();
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: q */
    public void mo62035q() {
        int i = this.f73935m.f84599g;
        if (i == 1 || i == 14 || i == 15 || i == 17 || i == 18 || i == 12) {
            this.f73912B = true;
        }
        if (NullChecker.m81303a(this.f73938p)) {
            for (int i2 = 0; i2 < this.f73938p.getChildCount(); i2++) {
                KeyEvent.Callback childAt = this.f73938p.getChildAt(i2);
                if (childAt instanceof bwh) {
                    ((bwh) childAt).mo65777b();
                }
                if (childAt instanceof MomentSeeEntryAndTopicHeaderView) {
                    ((MomentSeeEntryAndTopicHeaderView) childAt).m63256R(this.f73932j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean m100612q0(View view) {
        this.f73935m.m110145R0();
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m100613r0(Moment moment) {
        oe40.m163820V(moment, false, false, null);
        m100558E0(moment, "p_moment_post");
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: s0 */
    public C11280a mo62036s0() {
        C11280a c11280aM186630s = m100589Y().m186630s();
        this.f73936n = c11280aM186630s;
        return c11280aM186630s;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m100614t0(Moment moment) {
        m100532X().f151803b.mo133304k(moment);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m100615u0(Boolean bool) {
        if (bool.booleanValue()) {
            m100594b0(false);
            if (this.f73943u != 0) {
                if (this.f73944v == -1 || this.f73942t) {
                    this.f73944v = m100531W().getMeasuredHeight();
                }
                if (this.f73942t) {
                    this.f73942t = false;
                }
                ((LinearLayoutManager) m100531W().getLayoutManager()).scrollToPositionWithOffset(this.f73943u, this.f73944v - t100.m186890d(48.0f));
            }
            m100595c0(false);
        }
        this.f73943u = 0;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m100616v0(Integer num) {
        if (this.f73935m.f84599g == num.intValue()) {
            m100560H0();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m100617w0() {
        this.f73935m.m110133A0();
        m100531W().clearOnScrollListeners();
        m100531W().addOnScrollListener(this.f73919I);
        m100589Y().m186620K(this.f73941s);
        this.f73933k.m64029j5(this.f73945w);
        if (this.f73921K) {
            this.f73933k.m64021b5();
        }
        if (this.f73935m.m110147U0()) {
            this.f73935m.m110151x0();
        }
        m100569M0();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m100618x0(FeedBannersView feedBannersView, OMSData oMSData) {
        if (oMSData.slots.size() <= 0 || oMSData.slots.get(0).nearbyBanners.size() <= 0) {
            return;
        }
        for (NearbyBanner nearbyBanner : oMSData.slots.get(0).nearbyBanners) {
            List<Long> list = nearbyBanner.timeRange;
            long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime() / 1000;
            if (list.get(0).longValue() <= jGuessedCurrentServerTime && list.get(1).longValue() >= jGuessedCurrentServerTime && nearbyBanner.materials.size() > 0) {
                feedBannersView.setVisibility(0);
                feedBannersView.m65459h(getAct(), nearbyBanner.materials, nearbyBanner.slideshowSec);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m100619y0(Group group) {
        Act act = this.f73934l;
        act.startActivity(new FeedGroupDetailAct.C11200a(act, group.f56011id).m61988b().m61987a());
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m100620z0(String str) {
        this.f73922L.dismiss();
        p6j0.m167668b("e_newuser_checkin_record_pop_get", "p_newuser_checkin_record_pop", new p6j0.C19147a[0]);
        FeedModule.f38855d.m209493kc(str);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
