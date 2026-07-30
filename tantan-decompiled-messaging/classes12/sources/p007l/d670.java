package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.FeedUserLiveLabel;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.jo0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.s7m;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class d670 extends jq2<b770> {

    /* JADX INFO: renamed from: a */
    public PhotoAlbumFeedFrag f6842a;

    /* JADX INFO: renamed from: b */
    public PhotoAlbumFeedBaseFrag f6843b;

    /* JADX INFO: renamed from: c */
    public String f6844c;

    /* JADX INFO: renamed from: d */
    public String f6845d;

    /* JADX INFO: renamed from: e */
    public int f6846e;

    /* JADX INFO: renamed from: f */
    public String f6847f;

    /* JADX INFO: renamed from: g */
    public int f6848g;

    /* JADX INFO: renamed from: h */
    public boolean f6849h;

    /* JADX INFO: renamed from: i */
    public boolean f6850i;

    /* JADX INFO: renamed from: j */
    public hx60 f6851j;

    /* JADX INFO: renamed from: k */
    public boolean f6852k;

    /* JADX INFO: renamed from: l */
    public long f6853l;

    public d670(mcr mcrVar) {
        super(mcrVar);
        this.f6847f = User.ID_TEAM_ACCOUNT;
        this.f6850i = false;
        this.f6842a = (PhotoAlbumFeedFrag) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m9311L0() {
        ((b770) ((jq2) this).viewModel).m8691O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m9312N0(Boolean bool) {
        this.f6852k = bool.booleanValue();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m9313e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m9314f0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ List m9321m0(j760 j760Var) {
        return (List) j760Var.b;
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Boolean m9324p0(j760 j760Var) {
        return j760Var.b == null ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: s0 */
    private PhotoAlbumFeedBaseFrag m9325s0() {
        if (this.f6843b == null) {
            this.f6843b = this.f6842a.m5443R4();
        }
        return this.f6843b;
    }

    /* JADX INFO: renamed from: t0 */
    private py60 m9326t0() {
        return m9325s0().f2912A;
    }

    /* JADX INFO: renamed from: u0 */
    private f570 m9327u0() {
        return (f570) m9325s0().f2915z;
    }

    /* JADX INFO: renamed from: A0 */
    public void m9328A0() {
        if (m9331E0() || m9334H0()) {
            duringCreated(FeedModule.f316d.m16614c8().filter(new w9j() { // from class: l.a670
                public final Object call(Object obj) {
                    return d670.m9324p0((j760) obj);
                }
            }).map(new w9j() { // from class: l.b670
                public final Object call(Object obj) {
                    return d670.m9321m0((j760) obj);
                }
            }).map(new w9j() { // from class: l.c670
                public final Object call(Object obj) {
                    return vwb.n((List) obj, new w9j() { // from class: l.t570
                        public final Object call(Object obj2) {
                            TopicMoment topicMoment = (TopicMoment) obj2;
                            return Boolean.valueOf(("deleted".equals(topicMoment.status) || "offline".equals(topicMoment.status)) ? false : true);
                        }
                    });
                }
            }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.s570
                public final void call(Object obj) {
                    this.f12797a.m9336J0((ArrayList) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m9329C0() {
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m9330D0() {
        int i = this.f6848g;
        return (i == 0 || i == 12) && nkg.m12276y0();
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m9331E0() {
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m9332F0() {
        return this.f6848g == m9345q0() && nkg.m12250l0() && NullChecker.a(FeedModule.f316d.f14926H1);
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m9333G0() {
        boolean zM12263s = nkg.m12263s();
        int i = this.f6848g;
        if (zM12263s) {
            return i == 14 && djh.m9419a();
        }
        return i == 1 && djh.m9419a();
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m9334H0() {
        User userMe_ = FeedModule.m1140H().me_();
        if (!nkg.m12263s() && userMe_ != null) {
            userMe_.isFemale();
        }
        return false;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m9335I0(Moment moment) {
        ((b770) ((jq2) this).viewModel).m8677E0(moment, "p_moment_post");
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m9336J0(ArrayList arrayList) {
        List<TopicMoment> arrayList2 = new ArrayList<>(arrayList);
        if (arrayList2.size() > 5) {
            arrayList2 = arrayList2.subList(0, 5);
        }
        ((b770) ((jq2) this).viewModel).m8683J0(arrayList2);
        ((b770) ((jq2) this).viewModel).m8674B0(0);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m9337O0(List list, List list2) {
        for (final MomentItem momentItem : ((b770) ((jq2) this).viewModel).f6150n.f2849m.a) {
            if (momentItem.f2812d != null) {
                FeedUserLiveLabel feedUserLiveLabel = (FeedUserLiveLabel) vwb.r(list2, new w9j() { // from class: l.z570
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((FeedUserLiveLabel) obj).userId.equals(momentItem.f2812d.owner));
                    }
                });
                boolean zA = NullChecker.a(feedUserLiveLabel);
                Moment moment = momentItem.f2812d;
                if (zA) {
                    moment.liveState = feedUserLiveLabel.liveState;
                    moment.live.f228id = feedUserLiveLabel.liveId;
                    moment.iconTitle = feedUserLiveLabel.iconTitle;
                    moment.multiCallInfo = feedUserLiveLabel.multiCallInfo;
                } else {
                    moment.liveState = null;
                    moment.live.f228id = null;
                    moment.iconTitle = null;
                    moment.multiCallInfo = null;
                }
            }
        }
        m9327u0().m14387E(list, false, null, this.f6846e);
    }

    /* JADX INFO: renamed from: P0 */
    public void m9338P0() {
        if (act() instanceof PutongAct) {
            act().pickMediasWithInstaPicker();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m9339Q0(int i) {
        j760<Integer, Integer> j760VarM13335b1 = m9326t0().m13335b1();
        if (i == 0 && NullChecker.a(j760VarM13335b1)) {
            m9327u0().m14384B();
            m9326t0().m13313I1(((Integer) j760VarM13335b1.a).intValue(), ((Integer) j760VarM13335b1.b).intValue());
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m9340R0() {
        oe40.m12579i0(act(), vwb.f0(new Media[0]), true);
    }

    /* JADX INFO: renamed from: S0 */
    public void m9341S0() {
        s7m s7mVar;
        if (mqi0.o() - this.f6853l < 60000 || (s7mVar = ((jq2) this).viewModel) == null || ((b770) s7mVar).f6150n == null || vwb.J(((b770) s7mVar).f6150n.f2849m.a)) {
            return;
        }
        this.f6853l = mqi0.o();
        HashSet<String> hashSet = new HashSet<>();
        final List<MomentItem> list = ((b770) ((jq2) this).viewModel).f6150n.f2849m.a;
        for (MomentItem momentItem : list) {
            if (NullChecker.a(momentItem.f2812d) && !TextUtils.isEmpty(momentItem.f2812d.owner)) {
                hashSet.add(momentItem.f2812d.owner);
            }
            if (hashSet.size() > 40) {
                break;
            }
        }
        duringCreated(FeedModule.f316d.m16627e7(m9346r0(), hashSet)).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.w570
            public final void call(Object obj) {
                this.f14409a.m9337O0(list, (List) obj);
            }
        }, new e30() { // from class: l.x570
            public final void call(Object obj) {
                d670.m9313e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m9342U0() {
        boolean zM12263s = nkg.m12263s();
        int i = this.f6848g;
        if (zM12263s) {
            return i == 14 || i == 4;
        }
        return i == 0 || i == 4;
    }

    /* JADX INFO: renamed from: V0 */
    public void m9343V0() {
        m9327u0().m10056Q();
        act().setTitle(R$string.f540i5);
        m9326t0().f12020k = PhotoAlbumFallsFeedFrag.f2660I;
        List<Moment> list = m9326t0().f12019j;
        list.clear();
        list.addAll(PhotoAlbumFallsFeedFrag.f2659H);
        m9326t0().m13317P1(list, false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m9344a0() {
        super.a0();
        creates(new e30() { // from class: l.r570
            public final void call(Object obj) {
                d670.m9314f0((Bundle) obj);
            }
        }, new d30() { // from class: l.u570
            public final void call() {
                this.f13547a.m9311L0();
            }
        });
        if (nkg.m12213K()) {
            this.f6842a.duringCreated(NewPhotoAlbumFrag.f3001p1).subscribe(mkd0.G(new e30() { // from class: l.v570
                public final void call(Object obj) {
                    this.f14068a.m9312N0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public int m9345q0() {
        if (this.f6852k) {
            this.f6852k = false;
            return 12;
        }
        String strM10231k = fm20.m10231k();
        if (TextUtils.equals(strM10231k, fm20.m10229i())) {
            return 12;
        }
        return TextUtils.equals(strM10231k, fm20.m10237q()) ? 14 : 15;
    }

    /* JADX INFO: renamed from: r0 */
    public String m9346r0() {
        if ("from_nearby_focus".equals(this.f6845d)) {
            return "momentFollow";
        }
        if ("from_like".equals(this.f6845d)) {
            return "momentLike";
        }
        return (!"from_nearby_falls_feed".equals(this.f6845d) && "from_nearby_online".equals(this.f6845d)) ? "momentNearbyOnline" : "momentNearby";
    }

    /* JADX INFO: renamed from: x0 */
    public void m9347x0() {
        duringCreated(oe40.m12541F()).subscribe(mkd0.G(new e30() { // from class: l.y570
            public final void call(Object obj) {
                this.f15263a.m9335I0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public hx60 m9348y0() {
        if ("from_nearby_focus".equals(this.f6845d)) {
            this.f6851j = new sxi(this.f6842a);
            ((b770) ((jq2) this).viewModel).m8685K0(false);
        } else if ("from_nearby_falls_feed".equals(this.f6845d)) {
            this.f6851j = new t720(this.f6842a);
            ((b770) ((jq2) this).viewModel).m8685K0(false);
        } else if ("recommend_only_video".equals(this.f6845d) || "recommend_multiple".equals(this.f6845d)) {
            ((b770) ((jq2) this).viewModel).m8685K0(false);
        } else if ("original_moments".equals(this.f6845d)) {
            ((b770) ((jq2) this).viewModel).m8685K0(true);
            ((b770) ((jq2) this).viewModel).m8718f0();
        } else if ("from_nearby_online".equals(this.f6845d)) {
            this.f6851j = new l7h(this.f6842a);
            ((b770) ((jq2) this).viewModel).m8685K0(false);
        } else if ("from_like".equals(this.f6845d)) {
            this.f6851j = new v9h(this.f6842a);
            ((b770) ((jq2) this).viewModel).m8685K0(false);
        } else if ("from_discover_dating".equals(this.f6845d)) {
            this.f6851j = new o8j(this.f6842a);
            ((b770) ((jq2) this).viewModel).m8685K0(false);
        } else if ("from_discover_discussion".equals(this.f6845d)) {
            this.f6851j = new ezg(this.f6842a);
            ((b770) ((jq2) this).viewModel).m8685K0(false);
        } else if ("from_activity_tab_one".equals(this.f6845d)) {
            this.f6851j = new x50(this.f6842a);
            ((b770) ((jq2) this).viewModel).m8685K0(false);
        } else if ("from_activity_tab_two".equals(this.f6845d)) {
            this.f6851j = new s60(this.f6842a);
            ((b770) ((jq2) this).viewModel).m8685K0(false);
        } else {
            ((b770) ((jq2) this).viewModel).m8685K0(false);
        }
        return this.f6851j;
    }

    /* JADX INFO: renamed from: z0 */
    public void m9349z0() {
        this.f6845d = this.f6842a.getArguments().getString("from");
        this.f6844c = this.f6842a.getArguments().getString("user_id");
        this.f6846e = this.f6842a.getArguments().getInt("selected_item_position");
        this.f6847f = this.f6842a.getArguments().getString("target_moment_id");
        this.f6848g = this.f6842a.getArguments().getInt("page_type", -1);
        this.f6849h = this.f6842a.getArguments().getBoolean("is_auto_refresh");
    }

    public void destroy() {
    }
}
