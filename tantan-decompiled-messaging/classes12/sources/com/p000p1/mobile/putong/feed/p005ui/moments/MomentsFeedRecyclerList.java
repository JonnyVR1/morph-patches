package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.data.BannerLoc;
import com.p000p1.mobile.putong.data.Banners;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.IntlOperationArticles;
import com.p000p1.mobile.putong.data.IntlOperationBanner;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.p005ui.moments.operation.OperationArticleFeedView;
import com.p000p1.mobile.putong.feed.p005ui.moments.operation.OperationBannerFeedView;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l.d30;
import l.dac0;
import l.e30;
import l.ig3;
import l.j760;
import l.mkd0;
import l.q860;
import l.roj0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p007l.b5c0;
import p007l.e1c0;
import p007l.hg00;
import p007l.ijb0;
import p007l.kjb0;
import p007l.o6c0;
import p007l.u2h;
import rx.c;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsFeedRecyclerList extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f5355c;

    /* JADX INFO: renamed from: d */
    public C2249a f5356d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2250b f5357e;

    /* JADX INFO: renamed from: f */
    public View f5358f;

    /* JADX INFO: renamed from: g */
    public View f5359g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f5360h;

    /* JADX INFO: renamed from: i */
    public int f5361i;

    /* JADX INFO: renamed from: j */
    public int f5362j;

    /* JADX INFO: renamed from: k */
    public boolean f5363k;

    /* JADX INFO: renamed from: l */
    public MomentsFeedFrag f5364l;

    /* JADX INFO: renamed from: m */
    public boolean f5365m;

    /* JADX INFO: renamed from: n */
    public e30<Boolean> f5366n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsFeedRecyclerList$a */
    public class C2249a extends dac0<hg00> {

        /* JADX INFO: renamed from: c */
        public q860<hg00> f5367c = q860.a();

        /* JADX INFO: renamed from: d */
        public HashMap<String, Boolean> f5368d = new HashMap<>();

        /* JADX INFO: renamed from: e */
        public HashMap<String, Integer> f5369e = new HashMap<>();

        /* JADX INFO: renamed from: f */
        public HashSet<String> f5370f = new HashSet<>();

        public C2249a() {
        }

        /* JADX INFO: renamed from: C */
        public int m8092C() {
            return this.f5367c.a.size() + 1 + (ijb0.m10906Q() ? 1 : 0);
        }

        /* JADX INFO: renamed from: D */
        public View m8093D(ViewGroup viewGroup, int i) {
            if (i == 4) {
                return MomentsFeedRecyclerList.this.f5359g;
            }
            if (i == 7) {
                return MomentsFeedRecyclerList.this.m8078M().inflater().inflate(o6c0.f11107P1, viewGroup, false);
            }
            if (i == 8) {
                return MomentsFeedRecyclerList.this.m8078M().inflater().inflate(o6c0.f11095N1, viewGroup, false);
            }
            if (i == 5) {
                return MomentsFeedRecyclerList.this.f5360h;
            }
            if (i == 0) {
                return MomentsFeedRecyclerList.this.f5358f;
            }
            if (i == 1) {
                return MomentsFeedRecyclerList.this.m8078M().inflater().inflate(o6c0.f11330w4, viewGroup, false);
            }
            if (i == 2) {
                return MomentsFeedRecyclerList.this.m8078M().inflater().inflate(o6c0.f11337x4, viewGroup, false);
            }
            if (i == 3) {
                return MomentsFeedRecyclerList.this.m8078M().inflater().inflate(o6c0.f11302s4, viewGroup, false);
            }
            if (i == 9) {
                return MomentsFeedRecyclerList.this.m8078M().inflater().inflate(o6c0.f11330w4, viewGroup, false);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m8091A(View view, final hg00 hg00Var, int i, int i2) {
            if (i != 1 && i != 2 && i != 3 && i != 9) {
                if (i == 7) {
                    if (!(view instanceof OperationBannerFeedView) || vwb.J(hg00Var.f8709k)) {
                        return;
                    }
                    ((OperationBannerFeedView) view).m8301C(MomentsFeedRecyclerList.this.m8078M(), hg00Var.f8709k);
                    return;
                }
                if (i == 8 && (view instanceof OperationArticleFeedView) && NullChecker.a(hg00Var.f8708j)) {
                    zvf0.A("e_explore_tantan_story", "p_moments_view", new j760[]{j760.a("intl_story_id", hg00Var.f8708j.f223id)});
                    IntlOperationArticles intlOperationArticles = hg00Var.f8708j;
                    ((OperationArticleFeedView) view).m8294R(intlOperationArticles.title, intlOperationArticles.cover.url, new d30() { // from class: l.zo00
                        public final void call() {
                            this.f15813a.m8097J(hg00Var);
                        }
                    });
                    return;
                }
                return;
            }
            hg00 item = getItem(i2 + 1);
            boolean z = item == null || item.m10624c();
            if (i == 1 || i == 9) {
                boolean z2 = z;
                MomentView momentView = (MomentView) view;
                momentView.m7975j0(hg00Var, this.f5368d, this.f5369e, MomentsFeedRecyclerList.this);
                momentView.m7978n0(z2);
                if (i == 1) {
                    zvf0.A("e_moments_view_page_unit", "p_moments_view", new j760[]{j760.a("moment_id", NullChecker.a(hg00Var.f8699a) ? ((DbObject) hg00Var.f8699a).id : ""), j760.a("moments_user_id", NullChecker.a(hg00Var.f8699a) ? hg00Var.f8699a.owner : "")});
                    return;
                } else {
                    zvf0.A("e_live_audio_room_enter", "p_follow", new j760[]{new j760("anchorId", hg00Var.f8699a.voiceLive.anchor.f264id), new j760("liveId", hg00Var.f8699a.voiceLive.f711id), new j760("topic_id", hg00Var.f8699a.voiceLive.voiceRoomInfo.topics.size() == 0 ? 0 : hg00Var.f8699a.voiceLive.voiceRoomInfo.topics.get(0).f300id), new j760("index", Integer.valueOf(i2)), new j760("audio_room_type", hg00Var.f8699a.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio")});
                    return;
                }
            }
            if (i == 2) {
                MomentViewLarge momentViewLarge = (MomentViewLarge) view;
                momentViewLarge.m8009K(hg00Var, this.f5368d, this.f5369e, MomentsFeedRecyclerList.this);
                momentViewLarge.m8011N(z);
            } else {
                MomentMessage momentMessage = hg00Var.f8700b;
                Moment moment = hg00Var.f8699a;
                ((CommentView) view).m7822x(this, momentMessage, moment.owner, ((DbObject) moment).id, z, hg00Var.f8702d, true, null);
            }
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public hg00 getItem(int i) {
            if (ijb0.m10906Q() && i > 0) {
                i--;
            }
            if (i < 0 || i >= this.f5367c.a.size()) {
                return null;
            }
            return (hg00) this.f5367c.a.get(i);
        }

        /* JADX INFO: renamed from: I */
        public String m8096I(int i) {
            hg00 item = getItem(i - 1);
            if (NullChecker.a(item) && !item.f8707i && !item.f8706h && NullChecker.b(item.f8699a) && NullChecker.b(item.f8699a.media) && item.f8699a.media.size() > 0 && NullChecker.b(item.f8699a.media.get(0)) && (item.f8699a.media.get(0) instanceof Video)) {
                return ((Video) item.f8699a.media.get(0)).formatAspectRatio();
            }
            return null;
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m8097J(hg00 hg00Var) {
            zvf0.u("e_explore_tantan_story", "p_moments_view", new j760[]{j760.a("intl_story_id", hg00Var.f8708j.f223id)});
            FeedModule.m1140H().pa(MomentsFeedRecyclerList.this.m8078M(), 2, (IntlOperationBanner) null, hg00Var.f8708j);
        }

        /* JADX INFO: renamed from: K */
        public void m8098K(q860<hg00> q860Var) {
            List list;
            this.f5367c = q860Var;
            xdl0.M0(MomentsFeedRecyclerList.this.f5358f, this.f5367c.a.size() > 0 && MomentsFeedRecyclerList.this.f5357e.mo8101b());
            notifyDataSetChanged();
            MomentsFeedRecyclerList momentsFeedRecyclerList = MomentsFeedRecyclerList.this;
            if ((momentsFeedRecyclerList.f5357e instanceof C2253a) && momentsFeedRecyclerList.f5364l.m8031S4()) {
                q860<hg00> q860Var2 = this.f5367c;
                if (q860Var2 == null || (list = q860Var2.a) == null || list.size() <= 0) {
                    MomentsFeedRecyclerList.this.f5357e.mo8100a();
                }
                MomentsFeedRecyclerList.this.f5364l.m8033U4(false);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m8099e(int i) {
            if (!MomentsFeedRecyclerList.this.f5357e.mo8101b() || this.f5367c.a.size() <= 0 || this.f5367c.a.size() - i >= 4 || !NullChecker.a(vwb.r(this.f5367c.a, new w9j() { // from class: l.yo00
                public final Object call(Object obj) {
                    hg00 hg00Var = (hg00) obj;
                    return Boolean.valueOf((hg00Var.f8706h || hg00Var.f8707i) ? false : true);
                }
            }))) {
                return;
            }
            MomentsFeedRecyclerList.this.f5357e.mo8106g();
        }

        public long getItemId(int i) {
            return i;
        }

        public int getItemViewType(int i) {
            if (ijb0.m10906Q() && i == 0) {
                return 5;
            }
            if (this.f5367c.a.size() == 0 && !MomentsFeedRecyclerList.this.f5357e.mo8101b()) {
                return 4;
            }
            boolean zM10906Q = ijb0.m10906Q();
            q860<hg00> q860Var = this.f5367c;
            if (i == (zM10906Q ? q860Var.a.size() + 1 : q860Var.a.size())) {
                return 0;
            }
            hg00 item = getItem(i);
            Moment moment = item.f8699a;
            if (moment != null && moment.isVoiceLive) {
                return 9;
            }
            if (item.f8707i) {
                return 8;
            }
            if (item.f8706h) {
                return 7;
            }
            return item.m10624c() ? 1 : 3;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsFeedRecyclerList$b */
    public interface InterfaceC2250b {
        /* JADX INFO: renamed from: a */
        c<roj0> mo8100a();

        /* JADX INFO: renamed from: b */
        boolean mo8101b();

        /* JADX INFO: renamed from: c */
        void mo8102c();

        /* JADX INFO: renamed from: d */
        c<Envelope> mo8103d(Moment moment);

        /* JADX INFO: renamed from: e */
        void mo8104e(String str, e30<User> e30Var);

        /* JADX INFO: renamed from: f */
        void mo8105f(Moment moment);

        /* JADX INFO: renamed from: g */
        void mo8106g();

        /* JADX INFO: renamed from: h */
        void mo8107h(boolean z);

        /* JADX INFO: renamed from: i */
        void mo8108i(ArrayList<Media> arrayList);

        /* JADX INFO: renamed from: j */
        void mo8109j(Moment moment);
    }

    public MomentsFeedRecyclerList(Context context) {
        super(context);
        this.f5355c = Integer.MAX_VALUE;
        this.f5362j = -1;
        this.f5363k = false;
        this.f5366n = new e30() { // from class: l.vo00
            public final void call(Object obj) {
                this.f14254a.m8082Q((Boolean) obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public PutongAct m8078M() {
        return getContext();
    }

    /* JADX INFO: renamed from: N */
    public void m8079N(Moment moment) {
        m8078M().startActivity(MomentDetailAct.m7851V1(m8078M(), ((DbObject) moment).id, moment.owner, false, false));
    }

    /* JADX INFO: renamed from: O */
    public void m8080O(ArrayList<Media> arrayList) {
        this.f5357e.mo8108i(arrayList);
    }

    /* JADX INFO: renamed from: P */
    public void m8081P(String str, e30<User> e30Var) {
        this.f5357e.mo8104e(str, e30Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m8082Q(Boolean bool) {
        if (bool.booleanValue()) {
            if (this.f5361i != 0) {
                if (this.f5362j == -1 || this.f5365m) {
                    this.f5362j = getMeasuredHeight();
                }
                if (this.f5365m) {
                    this.f5365m = false;
                }
                getLayoutManager().scrollToPositionWithOffset(this.f5361i, this.f5362j - t100.d(30.0f));
            }
            this.f5364l.m8028P4();
        } else {
            this.f5364l.m8027O4(false);
        }
        this.f5361i = 0;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m8083R(int[] iArr) {
        this.f5359g.setMinimumHeight(iArr[1] - t100.d(200.0f));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m8084S(Banners banners) {
        this.f5360h.setBackgroundColor(m8078M().getResources().getColor(e1c0.f7159p0));
        kjb0.m11439C(m8078M(), this.f5360h, banners);
        kjb0.m11447K(banners);
        this.f5356d.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public c<Envelope> m8085T(Moment moment) {
        return this.f5357e.mo8103d(moment);
    }

    /* JADX INFO: renamed from: U */
    public boolean m8086U(int i, int i2, Intent intent) {
        if (i == 72) {
            this.f5357e.mo8102c();
            return true;
        }
        if (i == 50) {
            if (i2 == -1) {
                Moment moment = (Moment) intent.getExtras().getSerializable("moment");
                if (NullChecker.b(moment)) {
                    this.f5357e.mo8109j(moment);
                }
                this.f5363k = true;
            }
            return true;
        }
        if (!(this.f5357e instanceof C2253a) || i != 22) {
            return false;
        }
        if (i2 == -1) {
            this.f5364l.m8033U4(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: V */
    public c<roj0> m8087V() {
        return this.f5357e.mo8100a();
    }

    /* JADX INFO: renamed from: W */
    public void m8088W(InterfaceC2250b interfaceC2250b, boolean z, MomentsFeedFrag momentsFeedFrag) {
        this.f5357e = interfaceC2250b;
        this.f5364l = momentsFeedFrag;
        interfaceC2250b.mo8107h(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        this.f5365m = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setHasFixedSize(false);
        this.f5359g = m8078M().inflater().inflate(o6c0.f11316u4, (ViewGroup) this, false);
        this.f5360h = ijb0.m10927n(m8078M(), this);
        this.f5359g.setBackgroundColor(getResources().getColor(e1c0.f7121T));
        this.f5359g.setBackgroundColor(getResources().getColor(e1c0.f7121T));
        this.f5359g.findViewById(b5c0.f6000S1).setTextColor(m8078M().getResources().getColor(e1c0.f7153m0));
        xdl0.Q0(this, new e30() { // from class: l.wo00
            public final void call(Object obj) {
                this.f14652a.m8083R((int[]) obj);
            }
        });
        View viewInflate = m8078M().inflater().inflate(o6c0.f11347z0, (ViewGroup) this, false);
        this.f5358f = viewInflate;
        viewInflate.setBackgroundColor(getResources().getColor(e1c0.f7121T));
        this.f5356d = new C2249a();
        if (u2h.m14722g()) {
            m8078M().duringCreated(kjb0.m11460l(BannerLoc.get(BannerLoc.moment_feed))).subscribe(mkd0.G(new e30() { // from class: l.xo00
                public final void call(Object obj) {
                    this.f15054a.m8084S((Banners) obj);
                }
            }));
        }
    }

    public void setFoldLimit(int i) {
        if (i >= 0) {
            this.f5355c = i;
        } else {
            ig3.a("must be positive");
        }
    }

    public MomentsFeedRecyclerList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5355c = Integer.MAX_VALUE;
        this.f5362j = -1;
        this.f5363k = false;
        this.f5366n = new e30() { // from class: l.vo00
            public final void call(Object obj) {
                this.f14254a.m8082Q((Boolean) obj);
            }
        };
    }

    public MomentsFeedRecyclerList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5355c = Integer.MAX_VALUE;
        this.f5362j = -1;
        this.f5363k = false;
        this.f5366n = new e30() { // from class: l.vo00
            public final void call(Object obj) {
                this.f14254a.m8082Q((Boolean) obj);
            }
        };
    }
}
