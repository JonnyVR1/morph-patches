package com.p051p1.mobile.putong.feed.p065ui.moments;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.IntlOperationArticles;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.p065ui.moments.operation.OperationArticleFeedView;
import com.p051p1.mobile.putong.feed.p065ui.moments.operation.OperationBannerFeedView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.hdc0;
import p153l.i4g0;
import p153l.j4h;
import p153l.jic0;
import p153l.jyb;
import p153l.k9c0;
import p153l.mrb0;
import p153l.orb0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qo00;
import p153l.tec0;
import p153l.uxj0;
import p153l.vg60;
import p153l.wg3;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsFeedRecyclerList extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f44742c;

    /* JADX INFO: renamed from: d */
    public C11568a f44743d;

    /* JADX INFO: renamed from: e */
    public InterfaceC11569b f44744e;

    /* JADX INFO: renamed from: f */
    public View f44745f;

    /* JADX INFO: renamed from: g */
    public View f44746g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f44747h;

    /* JADX INFO: renamed from: i */
    public int f44748i;

    /* JADX INFO: renamed from: j */
    public int f44749j;

    /* JADX INFO: renamed from: k */
    public boolean f44750k;

    /* JADX INFO: renamed from: l */
    public MomentsFeedFrag f44751l;

    /* JADX INFO: renamed from: m */
    public boolean f44752m;

    /* JADX INFO: renamed from: n */
    public y20<Boolean> f44753n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsFeedRecyclerList$a */
    public class C11568a extends jic0<qo00> {

        /* JADX INFO: renamed from: c */
        public vg60<qo00> f44754c = vg60.m201219a();

        /* JADX INFO: renamed from: d */
        public HashMap<String, Boolean> f44755d = new HashMap<>();

        /* JADX INFO: renamed from: e */
        public HashMap<String, Integer> f44756e = new HashMap<>();

        /* JADX INFO: renamed from: f */
        public HashSet<String> f44757f = new HashSet<>();

        public C11568a() {
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return this.f44754c.f184001a.size() + 1 + (mrb0.m159639Q() ? 1 : 0);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i == 4) {
                return MomentsFeedRecyclerList.this.f44746g;
            }
            if (i == 7) {
                return MomentsFeedRecyclerList.this.m68067M().inflater().inflate(tec0.f173557P1, viewGroup, false);
            }
            if (i == 8) {
                return MomentsFeedRecyclerList.this.m68067M().inflater().inflate(tec0.f173545N1, viewGroup, false);
            }
            if (i == 5) {
                return MomentsFeedRecyclerList.this.f44747h;
            }
            if (i == 0) {
                return MomentsFeedRecyclerList.this.f44745f;
            }
            if (i == 1) {
                return MomentsFeedRecyclerList.this.m68067M().inflater().inflate(tec0.f173780w4, viewGroup, false);
            }
            if (i == 2) {
                return MomentsFeedRecyclerList.this.m68067M().inflater().inflate(tec0.f173787x4, viewGroup, false);
            }
            if (i == 3) {
                return MomentsFeedRecyclerList.this.m68067M().inflater().inflate(tec0.f173752s4, viewGroup, false);
            }
            if (i == 9) {
                return MomentsFeedRecyclerList.this.m68067M().inflater().inflate(tec0.f173780w4, viewGroup, false);
            }
            return null;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final qo00 qo00Var, int i, int i2) {
            if (i != 1 && i != 2 && i != 3 && i != 9) {
                if (i == 7) {
                    if (!(view instanceof OperationBannerFeedView) || jyb.m147479J(qo00Var.f158690k)) {
                        return;
                    }
                    ((OperationBannerFeedView) view).m68277C(MomentsFeedRecyclerList.this.m68067M(), qo00Var.f158690k);
                    return;
                }
                if (i == 8 && (view instanceof OperationArticleFeedView) && NullChecker.m82486a(qo00Var.f158689j)) {
                    i4g0.m138492A("e_explore_tantan_story", "p_moments_view", pf60.m172085a("intl_story_id", qo00Var.f158689j.f39610id));
                    IntlOperationArticles intlOperationArticles = qo00Var.f158689j;
                    ((OperationArticleFeedView) view).m68270R(intlOperationArticles.title, intlOperationArticles.cover.url, new x20() { // from class: l.ix00
                        @Override // p153l.x20
                        public final void call() {
                            this.f117306a.m68083J(qo00Var);
                        }
                    });
                    return;
                }
                return;
            }
            qo00 item = getItem(i2 + 1);
            boolean z = item == null || item.m177271c();
            if (i == 1 || i == 9) {
                boolean z2 = z;
                MomentView momentView = (MomentView) view;
                momentView.m67967j0(qo00Var, this.f44755d, this.f44756e, MomentsFeedRecyclerList.this);
                momentView.m67970n0(z2);
                if (i == 1) {
                    i4g0.m138492A("e_moments_view_page_unit", "p_moments_view", pf60.m172085a("moment_id", NullChecker.m82486a(qo00Var.f158680a) ? qo00Var.f158680a.f56859id : ""), pf60.m172085a("moments_user_id", NullChecker.m82486a(qo00Var.f158680a) ? qo00Var.f158680a.owner : ""));
                    return;
                } else {
                    i4g0.m138492A("e_live_audio_room_enter", "p_follow", new pf60("anchorId", qo00Var.f158680a.voiceLive.anchor.f39651id), new pf60("liveId", qo00Var.f158680a.voiceLive.f40098id), new pf60("topic_id", qo00Var.f158680a.voiceLive.voiceRoomInfo.topics.size() == 0 ? 0 : qo00Var.f158680a.voiceLive.voiceRoomInfo.topics.get(0).f39687id), new pf60(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2)), new pf60("audio_room_type", qo00Var.f158680a.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio"));
                    return;
                }
            }
            if (i == 2) {
                MomentViewLarge momentViewLarge = (MomentViewLarge) view;
                momentViewLarge.m68001K(qo00Var, this.f44755d, this.f44756e, MomentsFeedRecyclerList.this);
                momentViewLarge.m68003N(z);
            } else {
                MomentMessage momentMessage = qo00Var.f158681b;
                Moment moment = qo00Var.f158680a;
                ((CommentView) view).m67814x(this, momentMessage, moment.owner, moment.f56859id, z, qo00Var.f158683d, true, null);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public qo00 getItem(int i) {
            if (mrb0.m159639Q() && i > 0) {
                i--;
            }
            if (i < 0 || i >= this.f44754c.f184001a.size()) {
                return null;
            }
            return this.f44754c.f184001a.get(i);
        }

        /* JADX INFO: renamed from: I */
        public String m68082I(int i) {
            qo00 item = getItem(i - 1);
            if (NullChecker.m82486a(item) && !item.f158688i && !item.f158687h && NullChecker.m82487b(item.f158680a) && NullChecker.m82487b(item.f158680a.media) && item.f158680a.media.size() > 0 && NullChecker.m82487b(item.f158680a.media.get(0)) && (item.f158680a.media.get(0) instanceof Video)) {
                return ((Video) item.f158680a.media.get(0)).formatAspectRatio();
            }
            return null;
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m68083J(qo00 qo00Var) {
            i4g0.m138523u("e_explore_tantan_story", "p_moments_view", pf60.m172085a("intl_story_id", qo00Var.f158689j.f39610id));
            FeedModule.m61406H().mo31807pa(MomentsFeedRecyclerList.this.m68067M(), 2, null, qo00Var.f158689j);
        }

        /* JADX INFO: renamed from: K */
        public void m68084K(vg60<qo00> vg60Var) {
            List<qo00> list;
            this.f44754c = vg60Var;
            bnl0.m105525M0(MomentsFeedRecyclerList.this.f44745f, this.f44754c.f184001a.size() > 0 && MomentsFeedRecyclerList.this.f44744e.mo68086b());
            notifyDataSetChanged();
            MomentsFeedRecyclerList momentsFeedRecyclerList = MomentsFeedRecyclerList.this;
            if ((momentsFeedRecyclerList.f44744e instanceof C11572a) && momentsFeedRecyclerList.f44751l.m68020S4()) {
                vg60<qo00> vg60Var2 = this.f44754c;
                if (vg60Var2 == null || (list = vg60Var2.f184001a) == null || list.size() <= 0) {
                    MomentsFeedRecyclerList.this.f44744e.mo68085a();
                }
                MomentsFeedRecyclerList.this.f44751l.m68022U4(false);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: e */
        public void mo48510e(int i) {
            if (!MomentsFeedRecyclerList.this.f44744e.mo68086b() || this.f44754c.f184001a.size() <= 0 || this.f44754c.f184001a.size() - i >= 4 || !NullChecker.m82486a(jyb.m147529r(this.f44754c.f184001a, new qcj() { // from class: l.hx00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    qo00 qo00Var = (qo00) obj;
                    return Boolean.valueOf((qo00Var.f158687h || qo00Var.f158688i) ? false : true);
                }
            }))) {
                return;
            }
            MomentsFeedRecyclerList.this.f44744e.mo68091g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (mrb0.m159639Q() && i == 0) {
                return 5;
            }
            if (this.f44754c.f184001a.size() == 0 && !MomentsFeedRecyclerList.this.f44744e.mo68086b()) {
                return 4;
            }
            boolean zM159639Q = mrb0.m159639Q();
            vg60<qo00> vg60Var = this.f44754c;
            if (i == (zM159639Q ? vg60Var.f184001a.size() + 1 : vg60Var.f184001a.size())) {
                return 0;
            }
            qo00 item = getItem(i);
            Moment moment = item.f158680a;
            if (moment != null && moment.isVoiceLive) {
                return 9;
            }
            if (item.f158688i) {
                return 8;
            }
            if (item.f158687h) {
                return 7;
            }
            return item.m177271c() ? 1 : 3;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsFeedRecyclerList$b */
    public interface InterfaceC11569b {
        /* JADX INFO: renamed from: a */
        C22421c<uxj0> mo68085a();

        /* JADX INFO: renamed from: b */
        boolean mo68086b();

        /* JADX INFO: renamed from: c */
        void mo68087c();

        /* JADX INFO: renamed from: d */
        C22421c<Envelope> mo68088d(Moment moment);

        /* JADX INFO: renamed from: e */
        void mo68089e(String str, y20<User> y20Var);

        /* JADX INFO: renamed from: f */
        void mo68090f(Moment moment);

        /* JADX INFO: renamed from: g */
        void mo68091g();

        /* JADX INFO: renamed from: h */
        void mo68092h(boolean z);

        /* JADX INFO: renamed from: i */
        void mo68093i(ArrayList<Media> arrayList);

        /* JADX INFO: renamed from: j */
        void mo68094j(Moment moment);
    }

    public MomentsFeedRecyclerList(Context context) {
        super(context);
        this.f44742c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f44749j = -1;
        this.f44750k = false;
        this.f44753n = new y20() { // from class: l.ex00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96226a.m68071Q((Boolean) obj);
            }
        };
    }

    /* JADX INFO: renamed from: M */
    public PutongAct m68067M() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: N */
    public void m68068N(Moment moment) {
        m68067M().startActivity(MomentDetailAct.m67843X1(m68067M(), moment.f56859id, moment.owner, false, false));
    }

    /* JADX INFO: renamed from: O */
    public void m68069O(ArrayList<Media> arrayList) {
        this.f44744e.mo68093i(arrayList);
    }

    /* JADX INFO: renamed from: P */
    public void m68070P(String str, y20<User> y20Var) {
        this.f44744e.mo68089e(str, y20Var);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m68071Q(Boolean bool) {
        if (bool.booleanValue()) {
            if (this.f44748i != 0) {
                if (this.f44749j == -1 || this.f44752m) {
                    this.f44749j = getMeasuredHeight();
                }
                if (this.f44752m) {
                    this.f44752m = false;
                }
                ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(this.f44748i, this.f44749j - qa00.m175859d(30.0f));
            }
            this.f44751l.m68017P4();
        } else {
            this.f44751l.m68016O4(false);
        }
        this.f44748i = 0;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m68072R(int[] iArr) {
        this.f44746g.setMinimumHeight(iArr[1] - qa00.m175859d(200.0f));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m68073S(Banners banners) {
        this.f44747h.setBackgroundColor(m68067M().getResources().getColor(k9c0.f124526p0));
        orb0.m168874C(m68067M(), this.f44747h, banners);
        orb0.m168882K(banners);
        this.f44743d.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public C22421c<Envelope> m68074T(Moment moment) {
        return this.f44744e.mo68088d(moment);
    }

    /* JADX INFO: renamed from: U */
    public boolean m68075U(int i, int i2, Intent intent) {
        if (i == 72) {
            this.f44744e.mo68087c();
            return true;
        }
        if (i == 50) {
            if (i2 == -1) {
                Moment moment = (Moment) intent.getExtras().getSerializable("moment");
                if (NullChecker.m82487b(moment)) {
                    this.f44744e.mo68094j(moment);
                }
                this.f44750k = true;
            }
            return true;
        }
        if (!(this.f44744e instanceof C11572a) || i != 22) {
            return false;
        }
        if (i2 == -1) {
            this.f44751l.m68022U4(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: V */
    public C22421c<uxj0> m68076V() {
        return this.f44744e.mo68085a();
    }

    /* JADX INFO: renamed from: W */
    public void m68077W(InterfaceC11569b interfaceC11569b, boolean z, MomentsFeedFrag momentsFeedFrag) {
        this.f44744e = interfaceC11569b;
        this.f44751l = momentsFeedFrag;
        interfaceC11569b.mo68092h(z);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f44752m = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setHasFixedSize(false);
        this.f44746g = m68067M().inflater().inflate(tec0.f173766u4, (ViewGroup) this, false);
        this.f44747h = mrb0.m159660n(m68067M(), this);
        this.f44746g.setBackgroundColor(getResources().getColor(k9c0.f124488T));
        this.f44746g.setBackgroundColor(getResources().getColor(k9c0.f124488T));
        ((VText) this.f44746g.findViewById(hdc0.f108872S1)).setTextColor(m68067M().getResources().getColor(k9c0.f124520m0));
        bnl0.m105533Q0(this, new y20() { // from class: l.fx00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101230a.m68072R((int[]) obj);
            }
        });
        View viewInflate = m68067M().inflater().inflate(tec0.f173797z0, (ViewGroup) this, false);
        this.f44745f = viewInflate;
        viewInflate.setBackgroundColor(getResources().getColor(k9c0.f124488T));
        this.f44743d = new C11568a();
        if (j4h.m143423g()) {
            m68067M().duringCreated(orb0.m168895l(BannerLoc.get(BannerLoc.moment_feed))).subscribe(psd0.m173596G(new y20() { // from class: l.gx00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f106880a.m68073S((Banners) obj);
                }
            }));
        }
    }

    public void setFoldLimit(int i) {
        if (i >= 0) {
            this.f44742c = i;
        } else {
            wg3.m206174a("must be positive");
        }
    }

    public MomentsFeedRecyclerList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44742c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f44749j = -1;
        this.f44750k = false;
        this.f44753n = new y20() { // from class: l.ex00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96226a.m68071Q((Boolean) obj);
            }
        };
    }

    public MomentsFeedRecyclerList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44742c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f44749j = -1;
        this.f44750k = false;
        this.f44753n = new y20() { // from class: l.ex00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96226a.m68071Q((Boolean) obj);
            }
        };
    }
}
