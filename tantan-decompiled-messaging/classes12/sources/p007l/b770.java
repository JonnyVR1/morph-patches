package p007l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
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
import androidx.fragment.app.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.NearbyBanner;
import com.p000p1.mobile.putong.data.OMSData;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithLinkItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.MomentPostBar;
import com.p000p1.mobile.putong.feed.newui.photoalbum.MomentSeeEntryAndTopicHeaderView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.p004ai.FeedAiStoryHeadView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedNewUserBubbleView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedPersonalizeSuggestGuideView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSvipLimitedMomentItemView;
import com.p000p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateFollowFeedHeaderView;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.e51;
import l.h0m;
import l.hdb0;
import l.i0e;
import l.ic50;
import l.j760;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import org.json.JSONException;
import org.json.JSONObject;
import p007l.d670;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class b770<P extends d670> implements s7m<P>, yzl {

    /* JADX INFO: renamed from: M */
    public static long f6123M = 5000;

    /* JADX INFO: renamed from: N */
    public static int f6124N = 3;

    /* JADX INFO: renamed from: A */
    public boolean f6125A;

    /* JADX INFO: renamed from: B */
    public boolean f6126B;

    /* JADX INFO: renamed from: C */
    public boolean f6127C;

    /* JADX INFO: renamed from: D */
    public boolean f6128D;

    /* JADX INFO: renamed from: E */
    public Runnable f6129E;

    /* JADX INFO: renamed from: F */
    public SimplePushBubble f6130F;

    /* JADX INFO: renamed from: G */
    public FeedNewUserBubbleView f6131G;

    /* JADX INFO: renamed from: J */
    public String f6134J;

    /* JADX INFO: renamed from: K */
    public boolean f6135K;

    /* JADX INFO: renamed from: L */
    public dd80 f6136L;

    /* JADX INFO: renamed from: a */
    public VLinear f6137a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f6138b;

    /* JADX INFO: renamed from: c */
    public VImage f6139c;

    /* JADX INFO: renamed from: d */
    public MomentPostBar f6140d;

    /* JADX INFO: renamed from: e */
    public FeedDraftView f6141e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f6142f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f6143g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f6144h;

    /* JADX INFO: renamed from: j */
    public PhotoAlbumFeedFrag f6146j;

    /* JADX INFO: renamed from: k */
    public PhotoAlbumFeedBaseFrag f6147k;

    /* JADX INFO: renamed from: l */
    public Act f6148l;

    /* JADX INFO: renamed from: m */
    public d670 f6149m;

    /* JADX INFO: renamed from: n */
    public C2124a f6150n;

    /* JADX INFO: renamed from: o */
    public d7h f6151o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f6152p;

    /* JADX INFO: renamed from: q */
    public ViewTreeObserver.OnGlobalLayoutListener f6153q;

    /* JADX INFO: renamed from: r */
    public boolean f6154r;

    /* JADX INFO: renamed from: t */
    public boolean f6156t;

    /* JADX INFO: renamed from: u */
    public int f6157u;

    /* JADX INFO: renamed from: w */
    public boolean f6159w;

    /* JADX INFO: renamed from: x */
    public boolean f6160x;

    /* JADX INFO: renamed from: y */
    public Moment f6161y;

    /* JADX INFO: renamed from: z */
    public List<Moment> f6162z;

    /* JADX INFO: renamed from: i */
    public final int f6145i = 10;

    /* JADX INFO: renamed from: s */
    public boolean f6155s = false;

    /* JADX INFO: renamed from: v */
    public int f6158v = -1;

    /* JADX INFO: renamed from: H */
    public e30<Boolean> f6132H = new e30() { // from class: l.e670
        public final void call(Object obj) {
            this.f7230a.m8735u0((Boolean) obj);
        }
    };

    /* JADX INFO: renamed from: I */
    public RecyclerView.t f6133I = new C2334a();

    /* JADX INFO: renamed from: l.b770$a */
    public class C2334a extends RecyclerView.t {
        public C2334a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            b770.this.f6149m.m9339Q0(i);
            if (nkg.m12250l0()) {
                b770.this.f6146j.m5441P4();
            }
            b770 b770Var = b770.this;
            if (i != 0) {
                b770Var.f6128D = false;
                b770Var.m8679H0();
                return;
            }
            b770Var.m8721g1();
            b770.this.m8699S();
            if (nkg.m12211I()) {
                b770 b770Var2 = b770.this;
                if (b770Var2.f6149m.f6848g == 12) {
                    b770Var2.m8687M();
                }
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            b770.this.m8719f1();
        }
    }

    public b770(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f6146j = photoAlbumFeedFrag;
    }

    /* JADX INFO: renamed from: W */
    private VRecyclerView m8649W() {
        return m8708Y().f7990p;
    }

    /* JADX INFO: renamed from: X */
    private py60 m8650X() {
        return this.f6147k.f2912A;
    }

    /* JADX INFO: renamed from: a0 */
    private void m8652a0(boolean z) {
        if (z) {
            m8649W().setOnTouchListener(new View.OnTouchListener() { // from class: l.u670
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f13560a.m8728m0(view, motionEvent);
                }
            });
        } else {
            m8649W().setOnTouchListener(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.MomentSeeEntryAndTopicHeaderView] */
    /* JADX INFO: renamed from: d0 */
    private void m8656d0() {
        LinearLayout linearLayout = new LinearLayout(this.f6148l);
        this.f6152p = linearLayout;
        linearLayout.setOrientation(1);
        ab70.C2321a c2321a = ab70.m8476a().m8477b().get(this.f6149m.f6845d);
        boolean zM9334H0 = this.f6149m.m9334H0();
        boolean zM9331E0 = this.f6149m.m9331E0();
        boolean zM9330D0 = this.f6149m.m9330D0();
        if (this.f6149m.m9329C0()) {
            this.f6152p.addView(new FeedAiStoryHeadView(this.f6148l));
        }
        if (!nkg.m12250l0()) {
            m8707W0();
        } else if (this.f6149m.m9332F0()) {
            if (m8726k0()) {
                this.f6142f.addView(this.f6131G);
            } else {
                this.f6152p.addView(this.f6131G);
            }
            this.f6131G.m6266O(FeedModule.f316d.f14926H1);
        } else {
            this.f6148l.duringCreated(FeedModule.f316d.m16507Mc()).subscribe(mkd0.H(new e30() { // from class: l.y670
                public final void call(Object obj) {
                    this.f15268a.m8729n0((TopicOperations) obj);
                }
            }, new e30() { // from class: l.z670
                public final void call(Object obj) {
                    this.f15605a.m8730o0((Throwable) obj);
                }
            }));
        }
        if ((NullChecker.a(c2321a) && c2321a.f5693b) || zM9331E0 || zM9334H0 || zM9330D0) {
            if (zM9334H0) {
                ?? momentSeeEntryAndTopicHeaderView = new MomentSeeEntryAndTopicHeaderView(this.f6148l);
                this.f6152p.addView(momentSeeEntryAndTopicHeaderView);
                momentSeeEntryAndTopicHeaderView.m4272Q(this.f6146j);
            } else if (zM9331E0) {
                this.f6152p.addView(new TopicNearByHeaderView(this.f6148l));
            } else if (zM9330D0) {
                this.f6152p.addView(new FeedStateFollowFeedHeaderView((Context) this.f6148l, this.f6149m.f6845d));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m8664n(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m8665p(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.f(cwf0Var);
        p6j0.m12914d("e_newuser_checkin_record_pop_get", "p_newuser_checkin_record_pop", new p6j0.C2456a[0]);
        p6j0.m12914d("e_newuser_checkin_record_pop_giveup", "p_newuser_checkin_record_pop", new p6j0.C2456a[0]);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m8672z(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m8673A0() {
        this.f6136L.dismiss();
        p6j0.m12912b("e_newuser_checkin_record_pop_giveup", "p_newuser_checkin_record_pop", new p6j0.C2456a[0]);
    }

    /* JADX INFO: renamed from: B0 */
    public void m8674B0(int i) {
        this.f6150n.notifyItemChanged(i);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8675C0() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public void m8676D0() {
        if (NullChecker.a(this.f6147k)) {
            m8708Y().mo10062z();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m8677E0(Moment moment, String str) {
        this.f6140d.mo4269y(moment);
        m8649W().scrollToPosition(0);
    }

    /* JADX INFO: renamed from: G0 */
    public void m8678G0() {
        this.f6135K = true;
    }

    /* JADX INFO: renamed from: H0 */
    public void m8679H0() {
        e51.J(this.f6129E);
    }

    /* JADX INFO: renamed from: I */
    public View m8680I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c770.m9104b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m8681I0() {
        boolean zM12263s = nkg.m12263s();
        d670 d670Var = this.f6149m;
        if (zM12263s) {
            if (d670Var.f6848g == 14) {
                this.f6141e.m6219b0(this.f6146j);
            }
        } else {
            int i = d670Var.f6848g;
            if (i == 0 || i == 12) {
                this.f6141e.m6219b0(this.f6146j);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m8682J() {
        c770.m9105c(this);
    }

    /* JADX INFO: renamed from: J0 */
    public void m8683J0(List<TopicMoment> list) {
        for (int i = 0; i < this.f6152p.getChildCount(); i++) {
            View childAt = this.f6152p.getChildAt(i);
            if (childAt instanceof TopicNearByHeaderView) {
                ((TopicNearByHeaderView) childAt).m7279f(list);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m8684K() {
        if (fm20.m10235o().size() > 0) {
            if (fm20.m10235o().contains(vqg.m15485K(this.f6149m.f6845d, false))) {
                m8702T0();
            }
        } else if (this.f6160x) {
            m8702T0();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m8685K0(boolean z) {
        xdl0.M(this.f6138b, z);
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m8724i1(d670 d670Var) {
        this.f6149m = d670Var;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo3004L0() {
        return this.f6149m.m9348y0();
    }

    /* JADX INFO: renamed from: M */
    public final void m8687M() {
        if (m8649W() == null) {
            return;
        }
        View childAt = m8649W().getLayoutManager().getChildAt(m8649W().getLayoutManager().getChildCount() - 1);
        int bottom = childAt.getBottom();
        int bottom2 = m8649W().getBottom() - m8649W().getPaddingBottom();
        int position = m8649W().getLayoutManager().getPosition(childAt);
        if (bottom == bottom2 && position == m8649W().getLayoutManager().getItemCount() - 1) {
            m8709Y0();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m8688M0() {
        act().duringCreated(PhotoAlbumFeedFrag.f3086F).subscribe(mkd0.H(new e30() { // from class: l.g670
            public final void call(Object obj) {
                this.f8369a.m8736v0((Integer) obj);
            }
        }, new e30() { // from class: l.h670
            public final void call(Object obj) {
                b770.m8672z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final Runnable m8689N(final PhotoAlbumBottomView photoAlbumBottomView) {
        return new Runnable() { // from class: l.k670
            @Override // java.lang.Runnable
            public final void run() {
                photoAlbumBottomView.m4459a2("moment_stay");
            }
        };
    }

    /* JADX INFO: renamed from: N0 */
    public void m8690N0(Act act) {
        this.f6148l = act;
    }

    /* JADX INFO: renamed from: O */
    public void m8691O() {
        m8708Y().m14399m();
        if (NullChecker.a(this.f6153q)) {
            this.f6148l.removeKeyboardListener(this.f6137a, this.f6153q);
        }
        m8649W().removeOnScrollListener(this.f6133I);
    }

    /* JADX INFO: renamed from: O0 */
    public void m8692O0() {
        this.f6147k.m5071g5(new d30() { // from class: l.v670
            public final void call() {
                this.f14076a.m8737w0();
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m8693P() {
        if (NullChecker.a(this.f6134J)) {
            d.l().k(this.f6134J);
            this.f6134J = null;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m8694P0() {
        this.f6147k.m5072h5(this);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m8695Q(j760<Links, List<Moment>> j760Var, List<Moment> list) {
        List list2 = (List) j760Var.b;
        int i = 0;
        if (list2 == null) {
            return false;
        }
        for (final Moment moment : list) {
            Moment moment2 = (Moment) vwb.r(list2, new w9j() { // from class: l.l670
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((DbObject) ((Moment) obj)).id, ((DbObject) moment).id));
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
    public void m8696Q0(boolean z) {
        this.f6159w = z;
    }

    /* JADX INFO: renamed from: R */
    public boolean m8697R(j760<Links, List<Moment>> j760Var, final Moment moment) {
        List list = (List) j760Var.b;
        if (list == null) {
            return false;
        }
        Moment moment2 = (Moment) vwb.r(list, new w9j() { // from class: l.m670
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((DbObject) ((Moment) obj)).id, ((DbObject) moment).id));
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
    public void m8698R0(boolean z) {
        this.f6155s = z;
        if (NullChecker.a(this.f6147k)) {
            m8708Y().m14392K(this.f6155s);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m8699S() {
        if (vqg.m15524k0(this.f6149m.f6848g)) {
            int iZ0 = xdl0.z0(this.f6148l) / 2;
            int iX0 = xdl0.x0(this.f6148l) / 2;
            int[] iArr = new int[2];
            m8649W().getLocationInWindow(iArr);
            Object objFindChildViewUnder = m8649W().findChildViewUnder(iZ0 - iArr[0], iX0 - iArr[1]);
            if (objFindChildViewUnder == null) {
                return;
            }
            if (objFindChildViewUnder instanceof PhotoAlbumTopView) {
                m8703U(((PhotoAlbumTopView) objFindChildViewUnder).f3409c.f14820a);
                return;
            }
            if (objFindChildViewUnder instanceof FeedCenterView) {
                m8703U(((FeedCenterView) objFindChildViewUnder).f3355i);
                return;
            }
            if (objFindChildViewUnder instanceof FeedListImageLinkItem) {
                m8703U(((FeedListImageLinkItem) objFindChildViewUnder).f2308j);
            } else if (objFindChildViewUnder instanceof FeedListTextWithLinkItem) {
                m8703U(((FeedListTextWithLinkItem) objFindChildViewUnder).f2335i);
            } else if (objFindChildViewUnder instanceof PhotoAlbumBottomView) {
                m8701T((PhotoAlbumBottomView) objFindChildViewUnder);
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m8700S0(e30<String> e30Var) {
        if (NullChecker.a(this.f6147k)) {
            m8708Y().m10055P(e30Var);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m8701T(PhotoAlbumBottomView photoAlbumBottomView) {
        this.f6129E = m8689N(photoAlbumBottomView);
        if (nkg.m12277z()) {
            f6123M = 2000L;
        }
        e51.H(this.f6148l, this.f6129E, f6123M);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m8702T0() {
        final FeedBannersView feedBannersView = new FeedBannersView((Context) this.f6148l, this.f6149m.f6845d);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, (int) (((xdl0.y0() - t100.d(24.0f)) * 100.0f) / 351.0f));
        marginLayoutParams.leftMargin = t100.d(12.0f);
        marginLayoutParams.rightMargin = t100.d(12.0f);
        marginLayoutParams.bottomMargin = t100.d(2.0f);
        feedBannersView.setLayoutParams(marginLayoutParams);
        feedBannersView.setVisibility(8);
        this.f6152p.addView(feedBannersView);
        ic50.j().s().subscribe(mkd0.H(new e30() { // from class: l.i670
            public final void call(Object obj) {
                this.f8913a.m8738x0(feedBannersView, (OMSData) obj);
            }
        }, new e30() { // from class: l.j670
            public final void call(Object obj) {
                b770.m8664n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public final void m8703U(Moment moment) {
        if (moment == null) {
            return;
        }
        int childCount = m8649W().getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childAt = m8649W().getChildAt(i);
            if (NullChecker.a(childAt) && (childAt instanceof PhotoAlbumBottomView)) {
                PhotoAlbumBottomView photoAlbumBottomView = (PhotoAlbumBottomView) childAt;
                if (NullChecker.a(photoAlbumBottomView.f2555K) && ((DbObject) moment).id.equals(((DbObject) photoAlbumBottomView.f2555K).id)) {
                    m8701T(photoAlbumBottomView);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m8704U0(final Group group, List<User> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("欢迎加入，成为第 ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(group.userCounter));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f6148l.getResources().getColor(e1c0.f7154n)), length, String.valueOf(group.userCounter).length() + length, 33);
        StringBuilder sb = new StringBuilder(" 位");
        sb.append(group.isGroupAnonymousType() ? "圈友" : group.memberRole);
        spannableStringBuilder.append((CharSequence) sb.toString());
        j9h j9hVarM11119I = new j9h(this.f6148l, a8c0.f5636e).m11120u(spannableStringBuilder).m11117G(group.isGroupAnonymousType()).m11116F(group.headIcon).m11119I(new Runnable() { // from class: l.s670
            @Override // java.lang.Runnable
            public final void run() {
                this.f12806a.m8739y0(group);
            }
        });
        j9hVarM11119I.m11115E(list);
        j9hVarM11119I.show();
    }

    /* JADX INFO: renamed from: V */
    public RecyclerView.o m8705V() {
        return m8649W().getLayoutManager();
    }

    /* JADX INFO: renamed from: V0 */
    public void m8706V0(final String str) {
        final cwf0 cwf0VarC = i0e.c("p_newuser_checkin_record_pop", Dialog.class.getName());
        this.f6136L = new dd80.a(this.f6148l).S(f3c0.f7887q3).y0("恭喜！获得7日新人挂件").t0("100流量曝光已生效，特权期间发动态可获得更多互动").c0("领取", new Runnable() { // from class: l.n670
            @Override // java.lang.Runnable
            public final void run() {
                this.f10677a.m8740z0(str);
            }
        }).X("放弃", new Runnable() { // from class: l.o670
            @Override // java.lang.Runnable
            public final void run() {
                this.f11012a.m8673A0();
            }
        }).P(false).o0(new DialogInterface.OnShowListener() { // from class: l.q670
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                b770.m8665p(cwf0VarC, dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.r670
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m8707W0() {
        if (this.f6149m.m9333G0()) {
            View viewInflate = this.f6148l.inflater().inflate(o6c0.f11143V1, (ViewGroup) null);
            ((FeedPersonalizeSuggestGuideView) viewInflate.findViewById(b5c0.f6064k1)).m6277i(this.f6148l);
            this.f6152p.addView(viewInflate);
        }
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo3008X0() {
        m8656d0();
        m8684K();
        if (!NullChecker.a(this.f6152p) || this.f6152p.getChildCount() <= 0) {
            return null;
        }
        d7h d7hVar = new d7h(this.f6150n);
        this.f6151o = d7hVar;
        d7hVar.H(this.f6152p);
        this.f6150n.m4968s0(1);
        return this.f6151o;
    }

    /* JADX INFO: renamed from: Y */
    public final f570 m8708Y() {
        return (f570) this.f6147k.f2915z;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m8709Y0() {
        LinearLayoutManager layoutManager = m8649W().getLayoutManager();
        int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
        for (int iFindLastVisibleItemPosition = layoutManager.findLastVisibleItemPosition(); iFindLastVisibleItemPosition >= iFindFirstVisibleItemPosition; iFindLastVisibleItemPosition--) {
            View viewFindViewByPosition = layoutManager.findViewByPosition(iFindLastVisibleItemPosition);
            if (viewFindViewByPosition instanceof FeedSvipLimitedMomentItemView) {
                ((FeedSvipLimitedMomentItemView) viewFindViewByPosition).m6356f();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m8710Z() {
        SimplePushBubble simplePushBubble = this.f6130F;
        if (simplePushBubble != null) {
            simplePushBubble.I();
        }
        this.f6130F = null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m8711Z0() {
        if (j2e.m11062b().m11063c()) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f6148l).inflate(o6c0.f11079K3, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(b5c0.f6049g2);
        int iNextInt = new Random().nextInt(26) + 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("已为你更新了 ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(iNextInt));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f6148l.getResources().getColor(e1c0.f7154n)), length, String.valueOf(iNextInt).length() + length, 33);
        spannableStringBuilder.append((CharSequence) " 条动态");
        textView.setText(spannableStringBuilder);
        this.f6130F = new SimplePushBubble.a(this.f6148l, viewInflate).B(1).w(2000).z(new h0m("feed_showUpdateSuccessTips")).s();
        hdb0.c().i(this.f6130F);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: a1 */
    public boolean mo8712a1(j760<Links, List<Moment>> j760Var) {
        if (this.f6126B) {
            boolean zJ = vwb.J((Collection) j760Var.b);
            d670 d670Var = this.f6149m;
            if (!zJ) {
                if (d670Var.f6848g == 12) {
                    int iIntValue = ((Integer) FeedModule.f316d.f14933K.get()).intValue();
                    if (iIntValue < f6124N && !j2e.m11062b().m11063c()) {
                        m8715d1();
                        FeedModule.f316d.f14933K.put(Integer.valueOf(iIntValue + 1));
                    }
                } else {
                    m8711Z0();
                }
                if (this.f6149m.f6848g == 14 && !nkg.m12265t()) {
                    e51.I(this.f6146j, new Runnable() { // from class: l.w670
                        @Override // java.lang.Runnable
                        public final void run() {
                            fm20.f8151b.onNext(roj0.a);
                        }
                    }, 3000L);
                }
            } else if (d670Var.f6848g == 14 && !nkg.m12265t()) {
                fm20.f8151b.onNext(roj0.a);
            }
            this.f6126B = false;
            if (this.f6127C) {
                FeedModule.m1140H().Pq(this.f6148l, true);
                this.f6127C = false;
            }
            if (NullChecker.a(this.f6152p)) {
                for (int i = 0; i < this.f6152p.getChildCount(); i++) {
                    final View childAt = this.f6152p.getChildAt(i);
                    if (childAt instanceof FeedPersonalizeSuggestGuideView) {
                        this.f6152p.postDelayed(new Runnable() { // from class: l.x670
                            @Override // java.lang.Runnable
                            public final void run() {
                                xdl0.M(childAt, false);
                            }
                        }, 500L);
                        break;
                    }
                }
            }
        }
        this.f6125A = true;
        if (NullChecker.a(this.f6161y)) {
            m8697R(j760Var, this.f6161y);
            this.f6161y = null;
        }
        if (!vwb.J(this.f6162z)) {
            m8695Q(j760Var, this.f6162z);
            this.f6162z = null;
        }
        return false;
    }

    @Nullable
    public Act act() {
        return this.f6148l;
    }

    /* JADX INFO: renamed from: b0 */
    public void m8713b0(boolean z) {
        m8652a0(false);
        if (kjb0.m11468t(this.f6148l)) {
            kjb0.m11474z(this.f6148l, true);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m8714c0(boolean z) {
        if (this.f6154r && this.f6155s && this.f6148l.hasWindowFocus()) {
            if (!kjb0.m11468t(this.f6148l)) {
                m8652a0(true);
            } else if (kjb0.m11465q(this.f6148l)) {
                kjb0.m11474z(this.f6148l, false);
                m8652a0(true);
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m8715d1() {
        View viewInflate = LayoutInflater.from(this.f6148l).inflate(o6c0.f11079K3, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(b5c0.f6049g2)).setText("右滑喜欢的人的动态会出现在这里");
        this.f6130F = new SimplePushBubble.a(this.f6148l, viewInflate).B(1).w(2000).z(new h0m("feed_update_success_small")).s();
        hdb0.c().i(this.f6130F);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m8716e0() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragI0 = this.f6146j.getChildFragmentManager().i0("PhotoAlbumFeedBaseFrag");
        this.f6147k = photoAlbumFeedBaseFragI0;
        if (NullChecker.a(photoAlbumFeedBaseFragI0)) {
            m8694P0();
            m8692O0();
            return;
        }
        d670 d670Var = this.f6149m;
        this.f6147k = PhotoAlbumFeedBaseFrag.m5082p5(d670Var.f6844c, d670Var.f6845d, d670Var.f6846e, d670Var.f6847f, d670Var.f6848g, d670Var.f6849h);
        m8694P0();
        m8692O0();
        k kVarM = this.f6146j.getChildFragmentManager().m();
        kVarM.c(b5c0.f6046g, this.f6147k, "PhotoAlbumFeedBaseFrag");
        kVarM.j();
    }

    /* JADX INFO: renamed from: e1 */
    public void m8717e1() {
        this.f6128D = true;
    }

    /* JADX INFO: renamed from: f0 */
    public void m8718f0() {
        this.f6139c.setOnClickListener(new View.OnClickListener() { // from class: l.a770
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5597a.m8731p0(view);
            }
        });
        this.f6139c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.f670
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f7998a.m8732q0(view);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final void m8719f1() {
        if (((Boolean) FeedModule.f316d.f14974e0.get()).booleanValue()) {
            return;
        }
        int i = this.f6149m.f6848g;
        if ((i == 1 || i == 14 || i == 15 || i == 17 || i == 18 || i == 12 || i == 0) && (m8705V() instanceof LinearLayoutManager)) {
            int iFindFirstVisibleItemPosition = m8705V().findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = m8705V().findLastVisibleItemPosition();
            for (int iMax = Math.max(0, iFindFirstVisibleItemPosition); iMax < Math.min(iFindLastVisibleItemPosition, this.f6150n.f2849m.a.size()); iMax++) {
                Object objFindViewByPosition = m8705V().findViewByPosition(iMax);
                if (NullChecker.a(objFindViewByPosition) && (objFindViewByPosition instanceof PhotoAlbumTopView) && this.f6134J == null) {
                    this.f6134J = ((PhotoAlbumTopView) objFindViewByPosition).m5802K();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m8720g0(Bundle bundle) {
        m8716e0();
        m8681I0();
        if (nkg.m12250l0()) {
            FeedNewUserBubbleView feedNewUserBubbleView = new FeedNewUserBubbleView(this.f6148l);
            this.f6131G = feedNewUserBubbleView;
            feedNewUserBubbleView.m6265M(this.f6146j, this.f6149m.f6848g);
        }
        if (this.f6149m.m9342U0()) {
            this.f6140d.mo4260o(this.f6149m.f6848g);
            this.f6140d.m4251E(new e30() { // from class: l.p670
                public final void call(Object obj) {
                    this.f11703a.m8733r0((Moment) obj);
                }
            }, new e30() { // from class: l.t670
                public final void call(Object obj) {
                    this.f13200a.m8734t0((Moment) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m8721g1() {
        int i = this.f6149m.f6848g;
        if ((i == 1 || i == 14 || i == 15 || i == 17 || i == 18 || i == 12) && !this.f6127C && !this.f6128D && (m8705V() instanceof LinearLayoutManager)) {
            int iFindLastVisibleItemPosition = m8705V().findLastVisibleItemPosition();
            int i2 = 0;
            for (int i3 = 0; i3 < Math.min(iFindLastVisibleItemPosition, this.f6150n.f2849m.a.size()); i3++) {
                if (((MomentItem) this.f6150n.f2849m.a.get(i3)).f2810b == 1) {
                    i2++;
                }
            }
            if (i2 > 10) {
                this.f6127C = true;
                FeedModule.m1140H().jg(this.f6148l, true);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m8722h0(List<Moment> list) {
        ArrayList arrayList = new ArrayList();
        this.f6162z = arrayList;
        arrayList.addAll(list);
        this.f6161y = null;
        if (!this.f6125A) {
            return true;
        }
        m8676D0();
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m8723i0(Moment moment) {
        this.f6161y = moment;
        this.f6162z = null;
        if (!this.f6125A) {
            return true;
        }
        m8676D0();
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM8680I = m8680I(layoutInflater, viewGroup);
        this.f6153q = this.f6148l.setKeyboardListener(viewM8680I, this.f6132H);
        if (!TextUtils.equals(this.f6149m.f6845d, "from_nearby_online")) {
            xdl0.f0(this.f6137a, (!nkg.m12265t() || TextUtils.equals(this.f6149m.f6845d, "from_discover_discussion")) ? t100.d(44.0f) + xdl0.F0() : t100.d(44.0f));
        }
        viewM8680I.setBackgroundColor(this.f6146j.getResources().getColor(e1c0.f7159p0));
        return viewM8680I;
    }

    /* JADX INFO: renamed from: j0 */
    public void m8725j0() {
        this.f6160x = true;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m8726k0() {
        try {
            return new JSONObject(RemoteConfig.x().F("newuser_checkin")).optBoolean("fixed");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m8727l0() {
        if (NullChecker.a(this.f6147k)) {
            return m8708Y().mo10060w();
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ boolean m8728m0(View view, MotionEvent motionEvent) {
        m8713b0(true);
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m8729n0(TopicOperations topicOperations) {
        if (!this.f6149m.m9332F0()) {
            m8707W0();
            return;
        }
        if (m8726k0()) {
            this.f6142f.addView(this.f6131G);
        } else {
            this.f6152p.addView(this.f6131G);
        }
        this.f6131G.m6266O(FeedModule.f316d.f14926H1);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo3011n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m8730o0(Throwable th) {
        m8707W0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m8731p0(View view) {
        this.f6149m.m9338P0();
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: q */
    public void mo3013q() {
        int i = this.f6149m.f6848g;
        if (i == 1 || i == 14 || i == 15 || i == 17 || i == 18 || i == 12) {
            this.f6126B = true;
        }
        if (NullChecker.a(this.f6152p)) {
            for (int i2 = 0; i2 < this.f6152p.getChildCount(); i2++) {
                Object childAt = this.f6152p.getChildAt(i2);
                if (childAt instanceof bwh) {
                    ((bwh) childAt).mo6923b();
                }
                if (childAt instanceof MomentSeeEntryAndTopicHeaderView) {
                    ((MomentSeeEntryAndTopicHeaderView) childAt).m4273R(this.f6146j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean m8732q0(View view) {
        this.f6149m.m9340R0();
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m8733r0(Moment moment) {
        oe40.m12557V(moment, false, false, null);
        m8677E0(moment, "p_moment_post");
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: s0 */
    public C2124a mo3014s0() {
        C2124a c2124aM14402s = m8708Y().m14402s();
        this.f6150n = c2124aM14402s;
        return c2124aM14402s;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m8734t0(Moment moment) {
        m8650X().f12011b.mo10739k(moment);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m8735u0(Boolean bool) {
        if (bool.booleanValue()) {
            m8713b0(false);
            if (this.f6157u != 0) {
                if (this.f6158v == -1 || this.f6156t) {
                    this.f6158v = m8649W().getMeasuredHeight();
                }
                if (this.f6156t) {
                    this.f6156t = false;
                }
                m8649W().getLayoutManager().scrollToPositionWithOffset(this.f6157u, this.f6158v - t100.d(48.0f));
            }
            m8714c0(false);
        }
        this.f6157u = 0;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m8736v0(Integer num) {
        if (this.f6149m.f6848g == num.intValue()) {
            m8679H0();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m8737w0() {
        this.f6149m.m9328A0();
        m8649W().clearOnScrollListeners();
        m8649W().addOnScrollListener(this.f6133I);
        m8708Y().m14392K(this.f6155s);
        this.f6147k.m5074j5(this.f6159w);
        if (this.f6135K) {
            this.f6147k.m5064b5();
        }
        if (this.f6149m.m9342U0()) {
            this.f6149m.m9347x0();
        }
        m8688M0();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m8738x0(FeedBannersView feedBannersView, OMSData oMSData) {
        if (oMSData.slots.size() <= 0 || oMSData.slots.get(0).nearbyBanners.size() <= 0) {
            return;
        }
        for (NearbyBanner nearbyBanner : oMSData.slots.get(0).nearbyBanners) {
            List<Long> list = nearbyBanner.timeRange;
            long jGuessedCurrentServerTime = qib0.H.guessedCurrentServerTime() / 1000;
            if (list.get(0).longValue() <= jGuessedCurrentServerTime && list.get(1).longValue() >= jGuessedCurrentServerTime && nearbyBanner.materials.size() > 0) {
                feedBannersView.setVisibility(0);
                feedBannersView.m6585h(act(), nearbyBanner.materials, nearbyBanner.slideshowSec);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m8739y0(Group group) {
        Act act = this.f6148l;
        act.startActivity(new FeedGroupDetailAct.C2044a(act, ((DbObject) group).id).m2962b().m2961a());
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m8740z0(String str) {
        this.f6136L.dismiss();
        p6j0.m12912b("e_newuser_checkin_record_pop_get", "p_newuser_checkin_record_pop", new p6j0.C2456a[0]);
        FeedModule.f316d.m16674kc(str);
    }

    public void destroy() {
    }
}
