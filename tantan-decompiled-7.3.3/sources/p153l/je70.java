package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.FeedUserLiveLabel;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class je70 extends ar2<hf70> {

    /* JADX INFO: renamed from: a */
    public PhotoAlbumFeedFrag f120396a;

    /* JADX INFO: renamed from: b */
    public PhotoAlbumFeedBaseFrag f120397b;

    /* JADX INFO: renamed from: c */
    public String f120398c;

    /* JADX INFO: renamed from: d */
    public String f120399d;

    /* JADX INFO: renamed from: e */
    public int f120400e;

    /* JADX INFO: renamed from: f */
    public String f120401f;

    /* JADX INFO: renamed from: g */
    public int f120402g;

    /* JADX INFO: renamed from: h */
    public boolean f120403h;

    /* JADX INFO: renamed from: i */
    public boolean f120404i;

    /* JADX INFO: renamed from: j */
    public n570 f120405j;

    /* JADX INFO: renamed from: k */
    public boolean f120406k;

    /* JADX INFO: renamed from: l */
    public long f120407l;

    public je70(ner nerVar) {
        super(nerVar);
        this.f120401f = User.ID_TEAM_ACCOUNT;
        this.f120404i = false;
        this.f120396a = (PhotoAlbumFeedFrag) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m144519L0() {
        ((hf70) this.viewModel).m134735O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m144520N0(Boolean bool) {
        this.f120406k = bool.booleanValue();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m144521e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m144522f0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ List m144529m0(pf60 pf60Var) {
        return (List) pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Boolean m144532p0(pf60 pf60Var) {
        return pf60Var.f152157b == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: s0 */
    private PhotoAlbumFeedBaseFrag m144533s0() {
        if (this.f120397b == null) {
            this.f120397b = this.f120396a.m65552R4();
        }
        return this.f120397b;
    }

    /* JADX INFO: renamed from: t0 */
    private v670 m144534t0() {
        return m144533s0().f42299A;
    }

    /* JADX INFO: renamed from: u0 */
    private ld70 m144535u0() {
        return (ld70) m144533s0().f42302z;
    }

    /* JADX INFO: renamed from: A0 */
    public void m144536A0() {
        if (m144539E0() || m144542H0()) {
            duringCreated(FeedModule.f39703d.m145674c8().filter(new qcj() { // from class: l.ge70
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return je70.m144532p0((pf60) obj);
                }
            }).map(new qcj() { // from class: l.he70
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return je70.m144529m0((pf60) obj);
                }
            }).map(new qcj() { // from class: l.ie70
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return jyb.m147522n((List) obj, new qcj() { // from class: l.zd70
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            TopicMoment topicMoment = (TopicMoment) obj2;
                            return Boolean.valueOf(("deleted".equals(topicMoment.status) || UserBanAppealSwitch.offline.equals(topicMoment.status)) ? false : true);
                        }
                    });
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.yd70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f198576a.m144544J0((ArrayList) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m144537C0() {
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m144538D0() {
        int i = this.f120402g;
        return (i == 0 || i == 12) && cmg.m111246y0();
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m144539E0() {
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m144540F0() {
        return this.f120402g == m144552q0() && cmg.m111220l0() && NullChecker.m82486a(FeedModule.f39703d.f121301H1);
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m144541G0() {
        boolean zM111233s = cmg.m111233s();
        int i = this.f120402g;
        if (zM111233s) {
            return i == 14 && skh.m186449a();
        }
        return i == 1 && skh.m186449a();
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m144542H0() {
        User userMe_ = FeedModule.m61406H().me_();
        if (!cmg.m111233s() && userMe_ != null) {
            userMe_.isFemale();
        }
        return false;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m144543I0(Moment moment) {
        ((hf70) this.viewModel).m134721E0(moment, "p_moment_post");
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m144544J0(ArrayList arrayList) {
        List<TopicMoment> arrayList2 = new ArrayList<>(arrayList);
        if (arrayList2.size() > 5) {
            arrayList2 = arrayList2.subList(0, 5);
        }
        ((hf70) this.viewModel).m134727J0(arrayList2);
        ((hf70) this.viewModel).m134719B0(0);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m144545O0(List list, List list2) {
        for (final MomentItem momentItem : ((hf70) this.viewModel).f109246n.f42236m.f184001a) {
            if (momentItem.f42199d != null) {
                FeedUserLiveLabel feedUserLiveLabel = (FeedUserLiveLabel) jyb.m147529r(list2, new qcj() { // from class: l.fe70
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((FeedUserLiveLabel) obj).userId.equals(momentItem.f42199d.owner));
                    }
                });
                boolean zM82486a = NullChecker.m82486a(feedUserLiveLabel);
                Moment moment = momentItem.f42199d;
                if (zM82486a) {
                    moment.liveState = feedUserLiveLabel.liveState;
                    moment.live.f39615id = feedUserLiveLabel.liveId;
                    moment.iconTitle = feedUserLiveLabel.iconTitle;
                    moment.multiCallInfo = feedUserLiveLabel.multiCallInfo;
                } else {
                    moment.liveState = null;
                    moment.live.f39615id = null;
                    moment.iconTitle = null;
                    moment.multiCallInfo = null;
                }
            }
        }
        m144535u0().m214385E(list, false, null, this.f120400e);
    }

    /* JADX INFO: renamed from: P0 */
    public void m144546P0() {
        if (act() instanceof PutongAct) {
            ((PutongAct) act()).pickMediasWithInstaPicker();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m144547Q0(int i) {
        pf60<Integer, Integer> pf60VarM200030b1 = m144534t0().m200030b1();
        if (i == 0 && NullChecker.m82486a(pf60VarM200030b1)) {
            m144535u0().m214383B();
            m144534t0().m200009I1(pf60VarM200030b1.f152156a.intValue(), pf60VarM200030b1.f152157b.intValue());
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m144548R0() {
        cn40.m111392i0(act(), jyb.m147507f0(new Media[0]), true);
    }

    /* JADX INFO: renamed from: S0 */
    public void m144549S0() {
        V v2;
        if (pzi0.m174454o() - this.f120407l < Constants.ONE_MIN_IN_MILLIS || (v2 = this.viewModel) == 0 || ((hf70) v2).f109246n == null || jyb.m147479J(((hf70) v2).f109246n.f42236m.f184001a)) {
            return;
        }
        this.f120407l = pzi0.m174454o();
        HashSet<String> hashSet = new HashSet<>();
        final List<MomentItem> list = ((hf70) this.viewModel).f109246n.f42236m.f184001a;
        for (MomentItem momentItem : list) {
            if (NullChecker.m82486a(momentItem.f42199d) && !TextUtils.isEmpty(momentItem.f42199d.owner)) {
                hashSet.add(momentItem.f42199d.owner);
            }
            if (hashSet.size() > 40) {
                break;
            }
        }
        duringCreated(FeedModule.f39703d.m145687e7(m144553r0(), hashSet)).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.ce70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81314a.m144545O0(list, (List) obj);
            }
        }, new y20() { // from class: l.de70
            @Override // p153l.y20
            public final void call(Object obj) {
                je70.m144521e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m144550U0() {
        boolean zM111233s = cmg.m111233s();
        int i = this.f120402g;
        if (zM111233s) {
            return i == 14 || i == 4;
        }
        return i == 0 || i == 4;
    }

    /* JADX INFO: renamed from: V0 */
    public void m144551V0() throws Throwable {
        m144535u0().m153733Q();
        act().setTitle(R$string.f39927i5);
        m144534t0().f182614k = PhotoAlbumFallsFeedFrag.f42047I;
        List<Moment> list = m144534t0().f182613j;
        list.clear();
        list.addAll(PhotoAlbumFallsFeedFrag.f42046H);
        m144534t0().m200013P1(list, false);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.xd70
            @Override // p153l.y20
            public final void call(Object obj) {
                je70.m144522f0((Bundle) obj);
            }
        }, new x20() { // from class: l.ae70
            @Override // p153l.x20
            public final void call() {
                this.f70773a.m144519L0();
            }
        });
        if (cmg.m111183K()) {
            this.f120396a.duringCreated(NewPhotoAlbumFrag.f42388p1).subscribe(psd0.m173596G(new y20() { // from class: l.be70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76345a.m144520N0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public int m144552q0() {
        if (this.f120406k) {
            this.f120406k = false;
            return 12;
        }
        String strM173816k = pu20.m173816k();
        if (TextUtils.equals(strM173816k, pu20.m173814i())) {
            return 12;
        }
        return TextUtils.equals(strM173816k, pu20.m173822q()) ? 14 : 15;
    }

    /* JADX INFO: renamed from: r0 */
    public String m144553r0() {
        if ("from_nearby_focus".equals(this.f120399d)) {
            return "momentFollow";
        }
        if ("from_like".equals(this.f120399d)) {
            return "momentLike";
        }
        return (!"from_nearby_falls_feed".equals(this.f120399d) && "from_nearby_online".equals(this.f120399d)) ? "momentNearbyOnline" : "momentNearby";
    }

    /* JADX INFO: renamed from: x0 */
    public void m144554x0() {
        duringCreated(cn40.m111354F()).subscribe(psd0.m173596G(new y20() { // from class: l.ee70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93623a.m144543I0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public n570 m144555y0() {
        if ("from_nearby_focus".equals(this.f120399d)) {
            this.f120405j = new o0j(this.f120396a);
            ((hf70) this.viewModel).m134729K0(false);
        } else if ("from_nearby_falls_feed".equals(this.f120399d)) {
            this.f120405j = new bg20(this.f120396a);
            ((hf70) this.viewModel).m134729K0(false);
        } else if ("recommend_only_video".equals(this.f120399d) || "recommend_multiple".equals(this.f120399d)) {
            ((hf70) this.viewModel).m134729K0(false);
        } else if ("original_moments".equals(this.f120399d)) {
            ((hf70) this.viewModel).m134729K0(true);
            ((hf70) this.viewModel).m134762f0();
        } else if ("from_nearby_online".equals(this.f120399d)) {
            this.f120405j = new a9h(this.f120396a);
            ((hf70) this.viewModel).m134729K0(false);
        } else if ("from_like".equals(this.f120399d)) {
            this.f120405j = new kbh(this.f120396a);
            ((hf70) this.viewModel).m134729K0(false);
        } else if ("from_discover_dating".equals(this.f120399d)) {
            this.f120405j = new ibj(this.f120396a);
            ((hf70) this.viewModel).m134729K0(false);
        } else if ("from_discover_discussion".equals(this.f120399d)) {
            this.f120405j = new t0h(this.f120396a);
            ((hf70) this.viewModel).m134729K0(false);
        } else if ("from_activity_tab_one".equals(this.f120399d)) {
            this.f120405j = new t50(this.f120396a);
            ((hf70) this.viewModel).m134729K0(false);
        } else if ("from_activity_tab_two".equals(this.f120399d)) {
            this.f120405j = new o60(this.f120396a);
            ((hf70) this.viewModel).m134729K0(false);
        } else {
            ((hf70) this.viewModel).m134729K0(false);
        }
        return this.f120405j;
    }

    /* JADX INFO: renamed from: z0 */
    public void m144556z0() {
        this.f120399d = this.f120396a.getArguments().getString("from");
        this.f120398c = this.f120396a.getArguments().getString("user_id");
        this.f120400e = this.f120396a.getArguments().getInt("selected_item_position");
        this.f120401f = this.f120396a.getArguments().getString("target_moment_id");
        this.f120402g = this.f120396a.getArguments().getInt("page_type", -1);
        this.f120403h = this.f120396a.getArguments().getBoolean("is_auto_refresh");
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
