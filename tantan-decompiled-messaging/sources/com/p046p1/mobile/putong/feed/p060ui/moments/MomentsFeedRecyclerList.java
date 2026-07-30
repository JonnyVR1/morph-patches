package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.Api;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.IntlOperationArticles;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.p060ui.moments.operation.OperationArticleFeedView;
import com.p046p1.mobile.putong.feed.p060ui.moments.operation.OperationBannerFeedView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.b5c0;
import p149l.d30;
import p149l.dac0;
import p149l.e1c0;
import p149l.e30;
import p149l.hg00;
import p149l.ig3;
import p149l.ijb0;
import p149l.j760;
import p149l.kjb0;
import p149l.mkd0;
import p149l.o6c0;
import p149l.q860;
import p149l.roj0;
import p149l.t100;
import p149l.u2h;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsFeedRecyclerList extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f43894c;

    /* JADX INFO: renamed from: d */
    public C11405a f43895d;

    /* JADX INFO: renamed from: e */
    public InterfaceC11406b f43896e;

    /* JADX INFO: renamed from: f */
    public View f43897f;

    /* JADX INFO: renamed from: g */
    public View f43898g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f43899h;

    /* JADX INFO: renamed from: i */
    public int f43900i;

    /* JADX INFO: renamed from: j */
    public int f43901j;

    /* JADX INFO: renamed from: k */
    public boolean f43902k;

    /* JADX INFO: renamed from: l */
    public MomentsFeedFrag f43903l;

    /* JADX INFO: renamed from: m */
    public boolean f43904m;

    /* JADX INFO: renamed from: n */
    public e30<Boolean> f43905n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsFeedRecyclerList$a */
    public class C11405a extends dac0<hg00> {

        /* JADX INFO: renamed from: c */
        public q860<hg00> f43906c = q860.m173341a();

        /* JADX INFO: renamed from: d */
        public HashMap<String, Boolean> f43907d = new HashMap<>();

        /* JADX INFO: renamed from: e */
        public HashMap<String, Integer> f43908e = new HashMap<>();

        /* JADX INFO: renamed from: f */
        public HashSet<String> f43909f = new HashSet<>();

        public C11405a() {
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return this.f43906c.f153135a.size() + 1 + (ijb0.m136553Q() ? 1 : 0);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i == 4) {
                return MomentsFeedRecyclerList.this.f43898g;
            }
            if (i == 7) {
                return MomentsFeedRecyclerList.this.m66884M().inflater().inflate(o6c0.f142088P1, viewGroup, false);
            }
            if (i == 8) {
                return MomentsFeedRecyclerList.this.m66884M().inflater().inflate(o6c0.f142076N1, viewGroup, false);
            }
            if (i == 5) {
                return MomentsFeedRecyclerList.this.f43899h;
            }
            if (i == 0) {
                return MomentsFeedRecyclerList.this.f43897f;
            }
            if (i == 1) {
                return MomentsFeedRecyclerList.this.m66884M().inflater().inflate(o6c0.f142311w4, viewGroup, false);
            }
            if (i == 2) {
                return MomentsFeedRecyclerList.this.m66884M().inflater().inflate(o6c0.f142318x4, viewGroup, false);
            }
            if (i == 3) {
                return MomentsFeedRecyclerList.this.m66884M().inflater().inflate(o6c0.f142283s4, viewGroup, false);
            }
            if (i == 9) {
                return MomentsFeedRecyclerList.this.m66884M().inflater().inflate(o6c0.f142311w4, viewGroup, false);
            }
            return null;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final hg00 hg00Var, int i, int i2) {
            if (i != 1 && i != 2 && i != 3 && i != 9) {
                if (i == 7) {
                    if (!(view instanceof OperationBannerFeedView) || vwb.m200296J(hg00Var.f107552k)) {
                        return;
                    }
                    ((OperationBannerFeedView) view).m67094C(MomentsFeedRecyclerList.this.m66884M(), hg00Var.f107552k);
                    return;
                }
                if (i == 8 && (view instanceof OperationArticleFeedView) && NullChecker.m81303a(hg00Var.f107551j)) {
                    zvf0.m220368A("e_explore_tantan_story", "p_moments_view", j760.m140076a("intl_story_id", hg00Var.f107551j.f38762id));
                    IntlOperationArticles intlOperationArticles = hg00Var.f107551j;
                    ((OperationArticleFeedView) view).m67087R(intlOperationArticles.title, intlOperationArticles.cover.url, new d30() { // from class: l.zo00
                        @Override // p149l.d30
                        public final void call() {
                            this.f204079a.m66900J(hg00Var);
                        }
                    });
                    return;
                }
                return;
            }
            hg00 item = getItem(i2 + 1);
            boolean z = item == null || item.m130806c();
            if (i == 1 || i == 9) {
                boolean z2 = z;
                MomentView momentView = (MomentView) view;
                momentView.m66784j0(hg00Var, this.f43907d, this.f43908e, MomentsFeedRecyclerList.this);
                momentView.m66787n0(z2);
                if (i == 1) {
                    zvf0.m220368A("e_moments_view_page_unit", "p_moments_view", j760.m140076a("moment_id", NullChecker.m81303a(hg00Var.f107542a) ? hg00Var.f107542a.f56011id : ""), j760.m140076a("moments_user_id", NullChecker.m81303a(hg00Var.f107542a) ? hg00Var.f107542a.owner : ""));
                    return;
                } else {
                    zvf0.m220368A("e_live_audio_room_enter", "p_follow", new j760("anchorId", hg00Var.f107542a.voiceLive.anchor.f38803id), new j760("liveId", hg00Var.f107542a.voiceLive.f39250id), new j760("topic_id", hg00Var.f107542a.voiceLive.voiceRoomInfo.topics.size() == 0 ? 0 : hg00Var.f107542a.voiceLive.voiceRoomInfo.topics.get(0).f38839id), new j760(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2)), new j760("audio_room_type", hg00Var.f107542a.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio"));
                    return;
                }
            }
            if (i == 2) {
                MomentViewLarge momentViewLarge = (MomentViewLarge) view;
                momentViewLarge.m66818K(hg00Var, this.f43907d, this.f43908e, MomentsFeedRecyclerList.this);
                momentViewLarge.m66820N(z);
            } else {
                MomentMessage momentMessage = hg00Var.f107543b;
                Moment moment = hg00Var.f107542a;
                ((CommentView) view).m66631x(this, momentMessage, moment.owner, moment.f56011id, z, hg00Var.f107545d, true, null);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public hg00 getItem(int i) {
            if (ijb0.m136553Q() && i > 0) {
                i--;
            }
            if (i < 0 || i >= this.f43906c.f153135a.size()) {
                return null;
            }
            return this.f43906c.f153135a.get(i);
        }

        /* JADX INFO: renamed from: I */
        public String m66899I(int i) {
            hg00 item = getItem(i - 1);
            if (NullChecker.m81303a(item) && !item.f107550i && !item.f107549h && NullChecker.m81304b(item.f107542a) && NullChecker.m81304b(item.f107542a.media) && item.f107542a.media.size() > 0 && NullChecker.m81304b(item.f107542a.media.get(0)) && (item.f107542a.media.get(0) instanceof Video)) {
                return ((Video) item.f107542a.media.get(0)).formatAspectRatio();
            }
            return null;
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m66900J(hg00 hg00Var) {
            zvf0.m220399u("e_explore_tantan_story", "p_moments_view", j760.m140076a("intl_story_id", hg00Var.f107551j.f38762id));
            FeedModule.m60222H().mo30804pa(MomentsFeedRecyclerList.this.m66884M(), 2, null, hg00Var.f107551j);
        }

        /* JADX INFO: renamed from: K */
        public void m66901K(q860<hg00> q860Var) {
            List<hg00> list;
            this.f43906c = q860Var;
            xdl0.m208345M0(MomentsFeedRecyclerList.this.f43897f, this.f43906c.f153135a.size() > 0 && MomentsFeedRecyclerList.this.f43896e.mo66903b());
            notifyDataSetChanged();
            MomentsFeedRecyclerList momentsFeedRecyclerList = MomentsFeedRecyclerList.this;
            if ((momentsFeedRecyclerList.f43896e instanceof C11409a) && momentsFeedRecyclerList.f43903l.m66837S4()) {
                q860<hg00> q860Var2 = this.f43906c;
                if (q860Var2 == null || (list = q860Var2.f153135a) == null || list.size() <= 0) {
                    MomentsFeedRecyclerList.this.f43896e.mo66902a();
                }
                MomentsFeedRecyclerList.this.f43903l.m66839U4(false);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: e */
        public void mo47327e(int i) {
            if (!MomentsFeedRecyclerList.this.f43896e.mo66903b() || this.f43906c.f153135a.size() <= 0 || this.f43906c.f153135a.size() - i >= 4 || !NullChecker.m81303a(vwb.m200346r(this.f43906c.f153135a, new w9j() { // from class: l.yo00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    hg00 hg00Var = (hg00) obj;
                    return Boolean.valueOf((hg00Var.f107549h || hg00Var.f107550i) ? false : true);
                }
            }))) {
                return;
            }
            MomentsFeedRecyclerList.this.f43896e.mo66908g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (ijb0.m136553Q() && i == 0) {
                return 5;
            }
            if (this.f43906c.f153135a.size() == 0 && !MomentsFeedRecyclerList.this.f43896e.mo66903b()) {
                return 4;
            }
            boolean zM136553Q = ijb0.m136553Q();
            q860<hg00> q860Var = this.f43906c;
            if (i == (zM136553Q ? q860Var.f153135a.size() + 1 : q860Var.f153135a.size())) {
                return 0;
            }
            hg00 item = getItem(i);
            Moment moment = item.f107542a;
            if (moment != null && moment.isVoiceLive) {
                return 9;
            }
            if (item.f107550i) {
                return 8;
            }
            if (item.f107549h) {
                return 7;
            }
            return item.m130806c() ? 1 : 3;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsFeedRecyclerList$b */
    public interface InterfaceC11406b {
        /* JADX INFO: renamed from: a */
        C22306c<roj0> mo66902a();

        /* JADX INFO: renamed from: b */
        boolean mo66903b();

        /* JADX INFO: renamed from: c */
        void mo66904c();

        /* JADX INFO: renamed from: d */
        C22306c<Envelope> mo66905d(Moment moment);

        /* JADX INFO: renamed from: e */
        void mo66906e(String str, e30<User> e30Var);

        /* JADX INFO: renamed from: f */
        void mo66907f(Moment moment);

        /* JADX INFO: renamed from: g */
        void mo66908g();

        /* JADX INFO: renamed from: h */
        void mo66909h(boolean z);

        /* JADX INFO: renamed from: i */
        void mo66910i(ArrayList<Media> arrayList);

        /* JADX INFO: renamed from: j */
        void mo66911j(Moment moment);
    }

    public MomentsFeedRecyclerList(Context context) {
        super(context);
        this.f43894c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f43901j = -1;
        this.f43902k = false;
        this.f43905n = new e30() { // from class: l.vo00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182327a.m66888Q((Boolean) obj);
            }
        };
    }

    /* JADX INFO: renamed from: M */
    public PutongAct m66884M() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: N */
    public void m66885N(Moment moment) {
        m66884M().startActivity(MomentDetailAct.m66660V1(m66884M(), moment.f56011id, moment.owner, false, false));
    }

    /* JADX INFO: renamed from: O */
    public void m66886O(ArrayList<Media> arrayList) {
        this.f43896e.mo66910i(arrayList);
    }

    /* JADX INFO: renamed from: P */
    public void m66887P(String str, e30<User> e30Var) {
        this.f43896e.mo66906e(str, e30Var);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m66888Q(Boolean bool) {
        if (bool.booleanValue()) {
            if (this.f43900i != 0) {
                if (this.f43901j == -1 || this.f43904m) {
                    this.f43901j = getMeasuredHeight();
                }
                if (this.f43904m) {
                    this.f43904m = false;
                }
                ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(this.f43900i, this.f43901j - t100.m186890d(30.0f));
            }
            this.f43903l.m66834P4();
        } else {
            this.f43903l.m66833O4(false);
        }
        this.f43900i = 0;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m66889R(int[] iArr) {
        this.f43898g.setMinimumHeight(iArr[1] - t100.m186890d(200.0f));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m66890S(Banners banners) {
        this.f43899h.setBackgroundColor(m66884M().getResources().getColor(e1c0.f88803p0));
        kjb0.m146180C(m66884M(), this.f43899h, banners);
        kjb0.m146188K(banners);
        this.f43895d.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public C22306c<Envelope> m66891T(Moment moment) {
        return this.f43896e.mo66905d(moment);
    }

    /* JADX INFO: renamed from: U */
    public boolean m66892U(int i, int i2, Intent intent) {
        if (i == 72) {
            this.f43896e.mo66904c();
            return true;
        }
        if (i == 50) {
            if (i2 == -1) {
                Moment moment = (Moment) intent.getExtras().getSerializable("moment");
                if (NullChecker.m81304b(moment)) {
                    this.f43896e.mo66911j(moment);
                }
                this.f43902k = true;
            }
            return true;
        }
        if (!(this.f43896e instanceof C11409a) || i != 22) {
            return false;
        }
        if (i2 == -1) {
            this.f43903l.m66839U4(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: V */
    public C22306c<roj0> m66893V() {
        return this.f43896e.mo66902a();
    }

    /* JADX INFO: renamed from: W */
    public void m66894W(InterfaceC11406b interfaceC11406b, boolean z, MomentsFeedFrag momentsFeedFrag) {
        this.f43896e = interfaceC11406b;
        this.f43903l = momentsFeedFrag;
        interfaceC11406b.mo66909h(z);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f43904m = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setHasFixedSize(false);
        this.f43898g = m66884M().inflater().inflate(o6c0.f142297u4, (ViewGroup) this, false);
        this.f43899h = ijb0.m136574n(m66884M(), this);
        this.f43898g.setBackgroundColor(getResources().getColor(e1c0.f88765T));
        this.f43898g.setBackgroundColor(getResources().getColor(e1c0.f88765T));
        ((VText) this.f43898g.findViewById(b5c0.f73519S1)).setTextColor(m66884M().getResources().getColor(e1c0.f88797m0));
        xdl0.m208353Q0(this, new e30() { // from class: l.wo00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187374a.m66889R((int[]) obj);
            }
        });
        View viewInflate = m66884M().inflater().inflate(o6c0.f142328z0, (ViewGroup) this, false);
        this.f43897f = viewInflate;
        viewInflate.setBackgroundColor(getResources().getColor(e1c0.f88765T));
        this.f43895d = new C11405a();
        if (u2h.m191498g()) {
            m66884M().duringCreated(kjb0.m146201l(BannerLoc.get(BannerLoc.moment_feed))).subscribe(mkd0.m154955G(new e30() { // from class: l.xo00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193773a.m66890S((Banners) obj);
                }
            }));
        }
    }

    public void setFoldLimit(int i) {
        if (i >= 0) {
            this.f43894c = i;
        } else {
            ig3.m135964a("must be positive");
        }
    }

    public MomentsFeedRecyclerList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43894c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f43901j = -1;
        this.f43902k = false;
        this.f43905n = new e30() { // from class: l.vo00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182327a.m66888Q((Boolean) obj);
            }
        };
    }

    public MomentsFeedRecyclerList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43894c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f43901j = -1;
        this.f43902k = false;
        this.f43905n = new e30() { // from class: l.vo00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182327a.m66888Q((Boolean) obj);
            }
        };
    }
}
