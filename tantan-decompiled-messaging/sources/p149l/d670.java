package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.FeedUserLiveLabel;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class d670 extends jq2<b770> {

    /* JADX INFO: renamed from: a */
    public PhotoAlbumFeedFrag f84593a;

    /* JADX INFO: renamed from: b */
    public PhotoAlbumFeedBaseFrag f84594b;

    /* JADX INFO: renamed from: c */
    public String f84595c;

    /* JADX INFO: renamed from: d */
    public String f84596d;

    /* JADX INFO: renamed from: e */
    public int f84597e;

    /* JADX INFO: renamed from: f */
    public String f84598f;

    /* JADX INFO: renamed from: g */
    public int f84599g;

    /* JADX INFO: renamed from: h */
    public boolean f84600h;

    /* JADX INFO: renamed from: i */
    public boolean f84601i;

    /* JADX INFO: renamed from: j */
    public hx60 f84602j;

    /* JADX INFO: renamed from: k */
    public boolean f84603k;

    /* JADX INFO: renamed from: l */
    public long f84604l;

    public d670(mcr mcrVar) {
        super(mcrVar);
        this.f84598f = User.ID_TEAM_ACCOUNT;
        this.f84601i = false;
        this.f84593a = (PhotoAlbumFeedFrag) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m110116L0() {
        ((b770) this.viewModel).m100572O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m110117N0(Boolean bool) {
        this.f84603k = bool.booleanValue();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m110118e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m110119f0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ List m110126m0(j760 j760Var) {
        return (List) j760Var.f116565b;
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Boolean m110129p0(j760 j760Var) {
        return j760Var.f116565b == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: s0 */
    private PhotoAlbumFeedBaseFrag m110130s0() {
        if (this.f84594b == null) {
            this.f84594b = this.f84593a.m64369R4();
        }
        return this.f84594b;
    }

    /* JADX INFO: renamed from: t0 */
    private py60 m110131t0() {
        return m110130s0().f41451A;
    }

    /* JADX INFO: renamed from: u0 */
    private f570 m110132u0() {
        return (f570) m110130s0().f41454z;
    }

    /* JADX INFO: renamed from: A0 */
    public void m110133A0() {
        if (m110136E0() || m110139H0()) {
            duringCreated(FeedModule.f38855d.m209433c8().filter(new w9j() { // from class: l.a670
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return d670.m110129p0((j760) obj);
                }
            }).map(new w9j() { // from class: l.b670
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return d670.m110126m0((j760) obj);
                }
            }).map(new w9j() { // from class: l.c670
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return vwb.m200339n((List) obj, new w9j() { // from class: l.t570
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            TopicMoment topicMoment = (TopicMoment) obj2;
                            return Boolean.valueOf(("deleted".equals(topicMoment.status) || UserBanAppealSwitch.offline.equals(topicMoment.status)) ? false : true);
                        }
                    });
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.s570
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f162487a.m110141J0((ArrayList) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m110134C0() {
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m110135D0() {
        int i = this.f84599g;
        return (i == 0 || i == 12) && nkg.m159917y0();
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m110136E0() {
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m110137F0() {
        return this.f84599g == m110149q0() && nkg.m159891l0() && NullChecker.m81303a(FeedModule.f38855d.f192991H1);
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m110138G0() {
        boolean zM159904s = nkg.m159904s();
        int i = this.f84599g;
        if (zM159904s) {
            return i == 14 && djh.m112036a();
        }
        return i == 1 && djh.m112036a();
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m110139H0() {
        User userMe_ = FeedModule.m60222H().me_();
        if (!nkg.m159904s() && userMe_ != null) {
            userMe_.isFemale();
        }
        return false;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m110140I0(Moment moment) {
        ((b770) this.viewModel).m100558E0(moment, "p_moment_post");
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m110141J0(ArrayList arrayList) {
        List<TopicMoment> arrayList2 = new ArrayList<>(arrayList);
        if (arrayList2.size() > 5) {
            arrayList2 = arrayList2.subList(0, 5);
        }
        ((b770) this.viewModel).m100564J0(arrayList2);
        ((b770) this.viewModel).m100556B0(0);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m110142O0(List list, List list2) {
        for (final MomentItem momentItem : ((b770) this.viewModel).f73936n.f41388m.f153135a) {
            if (momentItem.f41351d != null) {
                FeedUserLiveLabel feedUserLiveLabel = (FeedUserLiveLabel) vwb.m200346r(list2, new w9j() { // from class: l.z570
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((FeedUserLiveLabel) obj).userId.equals(momentItem.f41351d.owner));
                    }
                });
                boolean zM81303a = NullChecker.m81303a(feedUserLiveLabel);
                Moment moment = momentItem.f41351d;
                if (zM81303a) {
                    moment.liveState = feedUserLiveLabel.liveState;
                    moment.live.f38767id = feedUserLiveLabel.liveId;
                    moment.iconTitle = feedUserLiveLabel.iconTitle;
                    moment.multiCallInfo = feedUserLiveLabel.multiCallInfo;
                } else {
                    moment.liveState = null;
                    moment.live.f38767id = null;
                    moment.iconTitle = null;
                    moment.multiCallInfo = null;
                }
            }
        }
        m110132u0().m186615E(list, false, null, this.f84597e);
    }

    /* JADX INFO: renamed from: P0 */
    public void m110143P0() {
        if (act() instanceof PutongAct) {
            ((PutongAct) act()).pickMediasWithInstaPicker();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m110144Q0(int i) {
        j760<Integer, Integer> j760VarM172076b1 = m110131t0().m172076b1();
        if (i == 0 && NullChecker.m81303a(j760VarM172076b1)) {
            m110132u0().m186613B();
            m110131t0().m172055I1(j760VarM172076b1.f116564a.intValue(), j760VarM172076b1.f116565b.intValue());
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m110145R0() {
        oe40.m163842i0(act(), vwb.m200324f0(new Media[0]), true);
    }

    /* JADX INFO: renamed from: S0 */
    public void m110146S0() {
        V v2;
        if (mqi0.m155944o() - this.f84604l < Constants.ONE_MIN_IN_MILLIS || (v2 = this.viewModel) == 0 || ((b770) v2).f73936n == null || vwb.m200296J(((b770) v2).f73936n.f41388m.f153135a)) {
            return;
        }
        this.f84604l = mqi0.m155944o();
        HashSet<String> hashSet = new HashSet<>();
        final List<MomentItem> list = ((b770) this.viewModel).f73936n.f41388m.f153135a;
        for (MomentItem momentItem : list) {
            if (NullChecker.m81303a(momentItem.f41351d) && !TextUtils.isEmpty(momentItem.f41351d.owner)) {
                hashSet.add(momentItem.f41351d.owner);
            }
            if (hashSet.size() > 40) {
                break;
            }
        }
        duringCreated(FeedModule.f38855d.m209446e7(m110150r0(), hashSet)).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.w570
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184649a.m110142O0(list, (List) obj);
            }
        }, new e30() { // from class: l.x570
            @Override // p149l.e30
            public final void call(Object obj) {
                d670.m110118e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m110147U0() {
        boolean zM159904s = nkg.m159904s();
        int i = this.f84599g;
        if (zM159904s) {
            return i == 14 || i == 4;
        }
        return i == 0 || i == 4;
    }

    /* JADX INFO: renamed from: V0 */
    public void m110148V0() throws Throwable {
        m110132u0().m119481Q();
        act().setTitle(R$string.f39079i5);
        m110131t0().f151812k = PhotoAlbumFallsFeedFrag.f41199I;
        List<Moment> list = m110131t0().f151811j;
        list.clear();
        list.addAll(PhotoAlbumFallsFeedFrag.f41198H);
        m110131t0().m172059P1(list, false);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.r570
            @Override // p149l.e30
            public final void call(Object obj) {
                d670.m110119f0((Bundle) obj);
            }
        }, new d30() { // from class: l.u570
            @Override // p149l.d30
            public final void call() {
                this.f174660a.m110116L0();
            }
        });
        if (nkg.m159854K()) {
            this.f84593a.duringCreated(NewPhotoAlbumFrag.f41540p1).subscribe(mkd0.m154955G(new e30() { // from class: l.v570
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f180008a.m110117N0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public int m110149q0() {
        if (this.f84603k) {
            this.f84603k = false;
            return 12;
        }
        String strM122128k = fm20.m122128k();
        if (TextUtils.equals(strM122128k, fm20.m122126i())) {
            return 12;
        }
        return TextUtils.equals(strM122128k, fm20.m122134q()) ? 14 : 15;
    }

    /* JADX INFO: renamed from: r0 */
    public String m110150r0() {
        if ("from_nearby_focus".equals(this.f84596d)) {
            return "momentFollow";
        }
        if ("from_like".equals(this.f84596d)) {
            return "momentLike";
        }
        return (!"from_nearby_falls_feed".equals(this.f84596d) && "from_nearby_online".equals(this.f84596d)) ? "momentNearbyOnline" : "momentNearby";
    }

    /* JADX INFO: renamed from: x0 */
    public void m110151x0() {
        duringCreated(oe40.m163804F()).subscribe(mkd0.m154955G(new e30() { // from class: l.y570
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196388a.m110140I0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public hx60 m110152y0() {
        if ("from_nearby_focus".equals(this.f84596d)) {
            this.f84602j = new sxi(this.f84593a);
            ((b770) this.viewModel).m100566K0(false);
        } else if ("from_nearby_falls_feed".equals(this.f84596d)) {
            this.f84602j = new t720(this.f84593a);
            ((b770) this.viewModel).m100566K0(false);
        } else if ("recommend_only_video".equals(this.f84596d) || "recommend_multiple".equals(this.f84596d)) {
            ((b770) this.viewModel).m100566K0(false);
        } else if ("original_moments".equals(this.f84596d)) {
            ((b770) this.viewModel).m100566K0(true);
            ((b770) this.viewModel).m100599f0();
        } else if ("from_nearby_online".equals(this.f84596d)) {
            this.f84602j = new l7h(this.f84593a);
            ((b770) this.viewModel).m100566K0(false);
        } else if ("from_like".equals(this.f84596d)) {
            this.f84602j = new v9h(this.f84593a);
            ((b770) this.viewModel).m100566K0(false);
        } else if ("from_discover_dating".equals(this.f84596d)) {
            this.f84602j = new o8j(this.f84593a);
            ((b770) this.viewModel).m100566K0(false);
        } else if ("from_discover_discussion".equals(this.f84596d)) {
            this.f84602j = new ezg(this.f84593a);
            ((b770) this.viewModel).m100566K0(false);
        } else if ("from_activity_tab_one".equals(this.f84596d)) {
            this.f84602j = new x50(this.f84593a);
            ((b770) this.viewModel).m100566K0(false);
        } else if ("from_activity_tab_two".equals(this.f84596d)) {
            this.f84602j = new s60(this.f84593a);
            ((b770) this.viewModel).m100566K0(false);
        } else {
            ((b770) this.viewModel).m100566K0(false);
        }
        return this.f84602j;
    }

    /* JADX INFO: renamed from: z0 */
    public void m110153z0() {
        this.f84596d = this.f84593a.getArguments().getString("from");
        this.f84595c = this.f84593a.getArguments().getString("user_id");
        this.f84597e = this.f84593a.getArguments().getInt("selected_item_position");
        this.f84598f = this.f84593a.getArguments().getString("target_moment_id");
        this.f84599g = this.f84593a.getArguments().getInt("page_type", -1);
        this.f84600h = this.f84593a.getArguments().getBoolean("is_auto_refresh");
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
