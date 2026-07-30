package com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p133rx.subjects.C22393b;
import p149l.e30;
import p149l.e51;
import p149l.f30;
import p149l.j760;
import p149l.mkd0;
import p149l.nkg;
import p149l.o6c0;
import p149l.p6j0;
import p149l.pe00;
import p149l.ze00;
import p149l.zi60;

/* JADX INFO: loaded from: classes12.dex */
public class MomentDetailAct extends PutongAct {

    /* JADX INFO: renamed from: h */
    public static C22393b<j760<Boolean, Integer>> f42066h = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public ze00 f42067c;

    /* JADX INFO: renamed from: d */
    public boolean f42068d;

    /* JADX INFO: renamed from: e */
    public pe00 f42069e;

    /* JADX INFO: renamed from: f */
    public Bundle f42070f;

    /* JADX INFO: renamed from: g */
    public PopupWindow f42071g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct$a */
    public static final class C11306a {

        /* JADX INFO: renamed from: a */
        public Context f42072a;

        /* JADX INFO: renamed from: b */
        public String f42073b;

        /* JADX INFO: renamed from: c */
        public String f42074c;

        /* JADX INFO: renamed from: d */
        public String f42075d;

        /* JADX INFO: renamed from: e */
        public boolean f42076e;

        /* JADX INFO: renamed from: f */
        public int f42077f;

        /* JADX INFO: renamed from: g */
        public String f42078g;

        /* JADX INFO: renamed from: h */
        public String f42079h;

        /* JADX INFO: renamed from: i */
        public boolean f42080i;

        /* JADX INFO: renamed from: j */
        public Moment f42081j;

        /* JADX INFO: renamed from: k */
        public boolean f42082k;

        /* JADX INFO: renamed from: l */
        public String f42083l;

        /* JADX INFO: renamed from: m */
        public boolean f42084m;

        /* JADX INFO: renamed from: n */
        public boolean f42085n;

        /* JADX INFO: renamed from: o */
        public String f42086o;

        /* JADX INFO: renamed from: p */
        public String f42087p;

        /* JADX INFO: renamed from: q */
        public boolean f42088q;

        /* JADX INFO: renamed from: r */
        public RawFeed f42089r;

        /* JADX INFO: renamed from: s */
        public String f42090s;

        /* JADX INFO: renamed from: t */
        public boolean f42091t = false;

        /* JADX INFO: renamed from: u */
        public String f42092u;

        /* JADX INFO: renamed from: v */
        public boolean f42093v;

        public C11306a(Context context) {
            this.f42072a = context;
        }

        /* JADX INFO: renamed from: a */
        public static C11306a m64834a(Context context) {
            return new C11306a(context);
        }

        /* JADX INFO: renamed from: b */
        public Intent m64835b() {
            Intent intent = new Intent(this.f42072a, (Class<?>) MomentDetailAct.class);
            intent.putExtra("from", this.f42073b);
            intent.putExtra("momentId", this.f42074c);
            intent.putExtra("momentOwner", this.f42075d);
            intent.putExtra("showDetail", this.f42076e);
            intent.putExtra("initMediaIndex", this.f42077f);
            intent.putExtra("lastPageAvailableMoment", this.f42081j);
            intent.putExtra("keyHideNeedMatchUid", this.f42078g);
            intent.putExtra("keyOriginFrom", this.f42079h);
            intent.putExtra("isHideComment", this.f42080i);
            intent.putExtra("isFromFeed", this.f42082k);
            intent.putExtra("momentValue", this.f42083l);
            intent.putExtra("canGreeting", this.f42084m);
            intent.putExtra("start_home_card", this.f42085n);
            intent.putExtra("msg_id", this.f42086o);
            intent.putExtra("enterPage", this.f42087p);
            intent.putExtra("showInput", this.f42088q);
            intent.putExtra("rawFeed", this.f42089r);
            if (!TextUtils.isEmpty(this.f42090s)) {
                intent.putExtra("clickedMsgid", this.f42090s);
            }
            return intent;
        }

        /* JADX INFO: renamed from: c */
        public C11306a m64836c(boolean z) {
            this.f42084m = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11306a m64837d(String str) {
            this.f42090s = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C11306a m64838e(String str) {
            this.f42087p = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C11306a m64839f(String str) {
            this.f42073b = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C11306a m64840g(int i) {
            this.f42077f = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C11306a m64841h(boolean z) {
            this.f42082k = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C11306a m64842i(boolean z) {
            this.f42080i = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C11306a m64843j(boolean z) {
            this.f42085n = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C11306a m64844k(Moment moment) {
            this.f42081j = moment;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C11306a m64845l(String str) {
            this.f42092u = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C11306a m64846m(String str) {
            this.f42074c = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C11306a m64847n(String str) {
            this.f42075d = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C11306a m64848o(String str) {
            this.f42083l = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C11306a m64849p(String str) {
            this.f42086o = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C11306a m64850q(String str) {
            this.f42078g = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C11306a m64851r(String str) {
            this.f42079h = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C11306a m64852s(RawFeed rawFeed) {
            this.f42089r = rawFeed;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C11306a m64853t(boolean z) {
            this.f42076e = z;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C11306a m64854u(boolean z) {
            this.f42088q = z;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C11306a m64855v(boolean z) {
            this.f42093v = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private void m64826Y1() {
        PopupWindow popupWindow = new PopupWindow();
        this.f42071g = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(o6c0.f142274r2, (ViewGroup) null, false));
        this.f42071g.setInputMethodMode(1);
        this.f42071g.setWidth(0);
        this.f42071g.setHeight(0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c2 */
    public static String m64827c2(String str) {
        if (TextUtils.isEmpty(str)) {
            return ProfileLikeModuleType.album;
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2005618476:
                if (str.equals("from_no_topic_aggregation_list")) {
                    b = 0;
                }
                break;
            case -1672308419:
                if (str.equals("from_activities_moment")) {
                    b = 1;
                }
                break;
            case -1636931156:
                if (str.equals("topic_recommend")) {
                    b = 2;
                }
                break;
            case -1303853747:
                if (str.equals("qa_recommend")) {
                    b = 3;
                }
                break;
            case -1170904872:
                if (str.equals("from_qa_topic_aggregation")) {
                    b = 4;
                }
                break;
            case -1053905283:
                if (str.equals("from_topic_aggregation")) {
                    b = 5;
                }
                break;
            case -914473483:
                if (str.equals("p_live_moment_article_detail")) {
                    b = 6;
                }
                break;
            case -760789720:
                if (str.equals("from_topic_nearby_header")) {
                    b = 7;
                }
                break;
            case -200480217:
                if (str.equals("from_video_flow")) {
                    b = 8;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    b = 9;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    b = 10;
                }
                break;
            case 16899343:
                if (str.equals("aggregate_page")) {
                    b = 11;
                }
                break;
            case 329784720:
                if (str.equals("from_nearby_falls_feed")) {
                    b = 12;
                }
                break;
            case 768576662:
                if (str.equals("qa_latest")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 842716100:
                if (str.equals("push_new_moment")) {
                    b = 14;
                }
                break;
            case 1010569813:
                if (str.equals("from_h5_topic_aggregation")) {
                    b = 15;
                }
                break;
            case 1194876055:
                if (str.equals("topic_latest")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 1252285837:
                if (str.equals("from_nearby_focus")) {
                    b = 17;
                }
                break;
            case 1527525680:
                if (str.equals("from_topic_official")) {
                    b = 18;
                }
                break;
        }
        switch (b) {
            case 0:
            case 4:
            case 5:
            case 7:
            case 15:
            case 18:
                return "topic_detail";
            case 1:
                return "activity";
            case 2:
                return "topic_recommend";
            case 3:
                return "qa_recommend";
            case 6:
                return "live_moment_article";
            case 8:
                return "live_moment_video";
            case 9:
                return "chat";
            case 10:
            case 14:
                return "push";
            case 11:
                return "music";
            case 12:
                return "nearby";
            case 13:
                return "qa_latest";
            case 16:
                return "topic_latest";
            case 17:
                return "follow";
            default:
                return ProfileLikeModuleType.album;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m64828d2(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            if (nkg.m159918z() && m64829e2()) {
                m64830Z1();
                return;
            }
            return;
        }
        if (c4319c != C4319c.f15550k) {
            if (c4319c == C4319c.f15549j) {
                FeedModule.f38855d.f193041f0.clear();
            }
        } else if (nkg.m159918z() && m64829e2() && NullChecker.m81303a(this.f42069e)) {
            e51.m114745J(this.f42069e.f148396o);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static boolean m64829e2() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: Z1 */
    public void m64830Z1() {
        if (NullChecker.m81303a(this.f42071g) && this.f42071g.isShowing()) {
            this.f42071g.dismiss();
            this.f42071g = null;
        }
    }

    /* JADX INFO: renamed from: a2 */
    public MomentDetailFrag m64831a2() {
        return this.f42067c.f202760d;
    }

    /* JADX INFO: renamed from: b2 */
    public Moment m64832b2(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(str);
        return momentM209572w7 == null ? FeedModule.f38854c.m60709X3(str) : momentM209572w7;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        if (nkg.m159851H() && NullChecker.m81303a(this.f42067c) && NullChecker.m81303a(this.f42067c.f202760d)) {
            PhotoAlbumFeedFrag.m64364l5(this.f42069e.f148385d, this.f42067c.f202760d.m64860Q4());
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m64833g2(Moment moment) {
        pe00 pe00Var = this.f42069e;
        if (pe00Var == null) {
            return;
        }
        this.pageHelper.m109039o(p6j0.m167667a(p6j0.C19147a.m167678g("moment_id", pe00Var.f148384c), p6j0.C19147a.m167678g("owner_id", this.f42069e.f148385d), p6j0.C19147a.m167678g("moment_type", moment == null ? "" : zi60.m218961w().m218992y(moment)), p6j0.C19147a.m167678g("moment_detail_showfrom", m64827c2(this.f42069e.f148383b))));
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f42067c.inflateView(layoutInflater, viewGroup);
        if (nkg.m159918z()) {
            viewInflateView = act().setUpKeyboardDetectorLayout(viewInflateView, new View(act()), new f30() { // from class: l.l900
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    MomentDetailAct.f42066h.onNext(new j760<>((Boolean) obj, (Integer) obj2));
                }
            });
            if (m64829e2()) {
                m64826Y1();
            }
        }
        return viewInflateView;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f42067c = new ze00(this);
        this.f42069e = new pe00(this);
        this.f42068d = getIntent().getBooleanExtra("isFromFeed", false);
        Bundle bundle = this.f42070f;
        if (bundle != null) {
            this.f42069e.m168497l0(bundle);
        }
        this.f42069e.mo51532C(this.f42067c);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f42069e.mo39470a0();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.k900
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121893a.m64828d2((C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        if (NullChecker.m81303a(this.f42069e) && TextUtils.equals(this.f42069e.f148383b, "push_new_moment")) {
            return true;
        }
        return super.isAnonymousMode();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            setResult(-1, intent);
            m66873d2();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m81303a(this.f42067c) && NullChecker.m81303a(this.f42067c.f202760d)) {
            this.f42067c.f202760d.m64872o();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onRestoreGlobalState(Bundle bundle) {
        super.onRestoreGlobalState(bundle);
        this.f42070f = bundle;
        pe00 pe00Var = this.f42069e;
        if (pe00Var != null) {
            pe00Var.m168497l0(bundle);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onSaveGlobalState(Bundle bundle) {
        super.onSaveGlobalState(bundle);
        pe00 pe00Var = this.f42069e;
        if (pe00Var != null) {
            pe00Var.m168498m0(bundle);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (nkg.m159918z() && z && m64829e2() && NullChecker.m81303a(this.f42071g) && !this.f42071g.isShowing()) {
            this.f42071g.setBackgroundDrawable(new ColorDrawable(0));
            this.f42071g.showAtLocation(this.act.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_user_moment_interactions_details_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Moment momentM64832b2 = m64832b2(this.f42069e.f148384c);
        if (momentM64832b2 != null) {
            momentM64832b2.momentValue = this.f42069e.f148388g;
        }
        if (momentM64832b2 == null) {
            momentM64832b2 = (Moment) getIntent().getSerializableExtra("lastPageAvailableMoment");
        }
        m64833g2(momentM64832b2);
    }
}
