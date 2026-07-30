package com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.f30;
import l.j760;
import l.mkd0;
import p007l.nkg;
import p007l.o6c0;
import p007l.p6j0;
import p007l.pe00;
import p007l.ze00;
import p007l.zi60;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentDetailAct extends PutongAct {

    /* JADX INFO: renamed from: h */
    public static b<j760<Boolean, Integer>> f3527h = b.b();

    /* JADX INFO: renamed from: c */
    public ze00 f3528c;

    /* JADX INFO: renamed from: d */
    public boolean f3529d;

    /* JADX INFO: renamed from: e */
    public pe00 f3530e;

    /* JADX INFO: renamed from: f */
    public Bundle f3531f;

    /* JADX INFO: renamed from: g */
    public PopupWindow f3532g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct$a */
    public static final class C2150a {

        /* JADX INFO: renamed from: a */
        public Context f3533a;

        /* JADX INFO: renamed from: b */
        public String f3534b;

        /* JADX INFO: renamed from: c */
        public String f3535c;

        /* JADX INFO: renamed from: d */
        public String f3536d;

        /* JADX INFO: renamed from: e */
        public boolean f3537e;

        /* JADX INFO: renamed from: f */
        public int f3538f;

        /* JADX INFO: renamed from: g */
        public String f3539g;

        /* JADX INFO: renamed from: h */
        public String f3540h;

        /* JADX INFO: renamed from: i */
        public boolean f3541i;

        /* JADX INFO: renamed from: j */
        public Moment f3542j;

        /* JADX INFO: renamed from: k */
        public boolean f3543k;

        /* JADX INFO: renamed from: l */
        public String f3544l;

        /* JADX INFO: renamed from: m */
        public boolean f3545m;

        /* JADX INFO: renamed from: n */
        public boolean f3546n;

        /* JADX INFO: renamed from: o */
        public String f3547o;

        /* JADX INFO: renamed from: p */
        public String f3548p;

        /* JADX INFO: renamed from: q */
        public boolean f3549q;

        /* JADX INFO: renamed from: r */
        public RawFeed f3550r;

        /* JADX INFO: renamed from: s */
        public String f3551s;

        /* JADX INFO: renamed from: t */
        public boolean f3552t = false;

        /* JADX INFO: renamed from: u */
        public String f3553u;

        /* JADX INFO: renamed from: v */
        public boolean f3554v;

        public C2150a(Context context) {
            this.f3533a = context;
        }

        /* JADX INFO: renamed from: a */
        public static C2150a m5931a(Context context) {
            return new C2150a(context);
        }

        /* JADX INFO: renamed from: b */
        public Intent m5932b() {
            Intent intent = new Intent(this.f3533a, (Class<?>) MomentDetailAct.class);
            intent.putExtra("from", this.f3534b);
            intent.putExtra("momentId", this.f3535c);
            intent.putExtra("momentOwner", this.f3536d);
            intent.putExtra("showDetail", this.f3537e);
            intent.putExtra("initMediaIndex", this.f3538f);
            intent.putExtra("lastPageAvailableMoment", this.f3542j);
            intent.putExtra("keyHideNeedMatchUid", this.f3539g);
            intent.putExtra("keyOriginFrom", this.f3540h);
            intent.putExtra("isHideComment", this.f3541i);
            intent.putExtra("isFromFeed", this.f3543k);
            intent.putExtra("momentValue", this.f3544l);
            intent.putExtra("canGreeting", this.f3545m);
            intent.putExtra("start_home_card", this.f3546n);
            intent.putExtra("msg_id", this.f3547o);
            intent.putExtra("enterPage", this.f3548p);
            intent.putExtra("showInput", this.f3549q);
            intent.putExtra("rawFeed", this.f3550r);
            if (!TextUtils.isEmpty(this.f3551s)) {
                intent.putExtra("clickedMsgid", this.f3551s);
            }
            return intent;
        }

        /* JADX INFO: renamed from: c */
        public C2150a m5933c(boolean z) {
            this.f3545m = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2150a m5934d(String str) {
            this.f3551s = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C2150a m5935e(String str) {
            this.f3548p = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C2150a m5936f(String str) {
            this.f3534b = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C2150a m5937g(int i) {
            this.f3538f = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C2150a m5938h(boolean z) {
            this.f3543k = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C2150a m5939i(boolean z) {
            this.f3541i = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2150a m5940j(boolean z) {
            this.f3546n = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C2150a m5941k(Moment moment) {
            this.f3542j = moment;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C2150a m5942l(String str) {
            this.f3553u = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C2150a m5943m(String str) {
            this.f3535c = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C2150a m5944n(String str) {
            this.f3536d = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C2150a m5945o(String str) {
            this.f3544l = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C2150a m5946p(String str) {
            this.f3547o = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C2150a m5947q(String str) {
            this.f3539g = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C2150a m5948r(String str) {
            this.f3540h = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C2150a m5949s(RawFeed rawFeed) {
            this.f3550r = rawFeed;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C2150a m5950t(boolean z) {
            this.f3537e = z;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C2150a m5951u(boolean z) {
            this.f3549q = z;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C2150a m5952v(boolean z) {
            this.f3554v = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private void m5923Y1() {
        PopupWindow popupWindow = new PopupWindow();
        this.f3532g = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(o6c0.f11293r2, (ViewGroup) null, false));
        this.f3532g.setInputMethodMode(1);
        this.f3532g.setWidth(0);
        this.f3532g.setHeight(0);
    }

    /* JADX INFO: renamed from: c2 */
    public static String m5924c2(String str) {
        if (TextUtils.isEmpty(str)) {
            return "album";
        }
        str.getClass();
        switch (str) {
            case "from_no_topic_aggregation_list":
            case "from_qa_topic_aggregation":
            case "from_topic_aggregation":
            case "from_topic_nearby_header":
            case "from_h5_topic_aggregation":
            case "from_topic_official":
                return "topic_detail";
            case "from_activities_moment":
                return RXScreenCaptureService.KEY_LAUNCH_ACTIVITY;
            case "topic_recommend":
                return "topic_recommend";
            case "qa_recommend":
                return "qa_recommend";
            case "p_live_moment_article_detail":
                return "live_moment_article";
            case "from_video_flow":
                return "live_moment_video";
            case "chat":
                return "chat";
            case "push":
            case "push_new_moment":
                return "push";
            case "aggregate_page":
                return "music";
            case "from_nearby_falls_feed":
                return "nearby";
            case "qa_latest":
                return "qa_latest";
            case "topic_latest":
                return "topic_latest";
            case "from_nearby_focus":
                return "follow";
            default:
                return "album";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m5925d2(c cVar) {
        if (cVar == c.m) {
            if (nkg.m12277z() && m5926e2()) {
                m5927Z1();
                return;
            }
            return;
        }
        if (cVar != c.k) {
            if (cVar == c.j) {
                FeedModule.f316d.f14976f0.clear();
            }
        } else if (nkg.m12277z() && m5926e2() && NullChecker.a(this.f3530e)) {
            e51.J(this.f3530e.f11816o);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static boolean m5926e2() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: Z1 */
    public void m5927Z1() {
        if (NullChecker.a(this.f3532g) && this.f3532g.isShowing()) {
            this.f3532g.dismiss();
            this.f3532g = null;
        }
    }

    /* JADX INFO: renamed from: a2 */
    public MomentDetailFrag m5928a2() {
        return this.f3528c.f15700d;
    }

    /* JADX INFO: renamed from: b2 */
    public Moment m5929b2(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(str);
        return momentM16753w7 == null ? FeedModule.f315c.m1635X3(str) : momentM16753w7;
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (nkg.m12210H() && NullChecker.a(this.f3528c) && NullChecker.a(this.f3528c.f15700d)) {
            PhotoAlbumFeedFrag.m5438l5(this.f3530e.f11805d, this.f3528c.f15700d.m5957Q4());
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m5930g2(Moment moment) {
        pe00 pe00Var = this.f3530e;
        if (pe00Var == null) {
            return;
        }
        ((PutongAct) this).pageHelper.o(p6j0.m12911a(p6j0.C2456a.m12922g("moment_id", pe00Var.f11804c), p6j0.C2456a.m12922g("owner_id", this.f3530e.f11805d), p6j0.C2456a.m12922g("moment_type", moment == null ? "" : zi60.m17436w().m17467y(moment)), p6j0.C2456a.m12922g("moment_detail_showfrom", m5924c2(this.f3530e.f11803b))));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f3528c.inflateView(layoutInflater, viewGroup);
        if (nkg.m12277z()) {
            viewInflateView = act().setUpKeyboardDetectorLayout(viewInflateView, new View(act()), new f30() { // from class: l.l900
                public final void call(Object obj, Object obj2) {
                    MomentDetailAct.f3527h.onNext(new j760((Boolean) obj, (Integer) obj2));
                }
            });
            if (m5926e2()) {
                m5923Y1();
            }
        }
        return viewInflateView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        this.f3528c = new ze00(this);
        this.f3530e = new pe00(this);
        this.f3529d = getIntent().getBooleanExtra("isFromFeed", false);
        Bundle bundle = this.f3531f;
        if (bundle != null) {
            this.f3530e.m13035l0(bundle);
        }
        this.f3530e.C(this.f3528c);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f3530e.m13032a0();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.k900
            public final void call(Object obj) {
                this.f9641a.m5925d2((c) obj);
            }
        }));
    }

    public boolean isAnonymousMode() {
        if (NullChecker.a(this.f3530e) && TextUtils.equals(this.f3530e.f11803b, "push_new_moment")) {
            return true;
        }
        return super.isAnonymousMode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onBackPressed() {
        if (NullChecker.a(this.f3528c) && NullChecker.a(this.f3528c.f15700d)) {
            this.f3528c.f15700d.m5971o();
        }
    }

    public void onRestoreGlobalState(Bundle bundle) {
        super.onRestoreGlobalState(bundle);
        this.f3531f = bundle;
        pe00 pe00Var = this.f3530e;
        if (pe00Var != null) {
            pe00Var.m13035l0(bundle);
        }
    }

    public void onSaveGlobalState(Bundle bundle) {
        super.onSaveGlobalState(bundle);
        pe00 pe00Var = this.f3530e;
        if (pe00Var != null) {
            pe00Var.m13036m0(bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        if (nkg.m12277z() && z && m5926e2() && NullChecker.a(this.f3532g) && !this.f3532g.isShowing()) {
            this.f3532g.setBackgroundDrawable(new ColorDrawable(0));
            this.f3532g.showAtLocation(((Act) this).act.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    public String pageId() {
        return "p_user_moment_interactions_details_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Moment momentM5929b2 = m5929b2(this.f3530e.f11804c);
        if (momentM5929b2 != null) {
            momentM5929b2.momentValue = this.f3530e.f11808g;
        }
        if (momentM5929b2 == null) {
            momentM5929b2 = (Moment) getIntent().getSerializableExtra("lastPageAvailableMoment");
        }
        m5930g2(momentM5929b2);
    }
}
