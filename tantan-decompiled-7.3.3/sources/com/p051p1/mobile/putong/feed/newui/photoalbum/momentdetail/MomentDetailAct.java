package com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p137rx.subjects.C22508b;
import p153l.cmg;
import p153l.er60;
import p153l.in00;
import p153l.l51;
import p153l.pf60;
import p153l.psd0;
import p153l.tec0;
import p153l.tfj0;
import p153l.y20;
import p153l.ym00;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentDetailAct extends PutongAct {

    /* JADX INFO: renamed from: h */
    public static C22508b<pf60<Boolean, Integer>> f42914h = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public in00 f42915c;

    /* JADX INFO: renamed from: d */
    public boolean f42916d;

    /* JADX INFO: renamed from: e */
    public ym00 f42917e;

    /* JADX INFO: renamed from: f */
    public Bundle f42918f;

    /* JADX INFO: renamed from: g */
    public PopupWindow f42919g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct$a */
    public static final class C11469a {

        /* JADX INFO: renamed from: a */
        public Context f42920a;

        /* JADX INFO: renamed from: b */
        public String f42921b;

        /* JADX INFO: renamed from: c */
        public String f42922c;

        /* JADX INFO: renamed from: d */
        public String f42923d;

        /* JADX INFO: renamed from: e */
        public boolean f42924e;

        /* JADX INFO: renamed from: f */
        public int f42925f;

        /* JADX INFO: renamed from: g */
        public String f42926g;

        /* JADX INFO: renamed from: h */
        public String f42927h;

        /* JADX INFO: renamed from: i */
        public boolean f42928i;

        /* JADX INFO: renamed from: j */
        public Moment f42929j;

        /* JADX INFO: renamed from: k */
        public boolean f42930k;

        /* JADX INFO: renamed from: l */
        public String f42931l;

        /* JADX INFO: renamed from: m */
        public boolean f42932m;

        /* JADX INFO: renamed from: n */
        public boolean f42933n;

        /* JADX INFO: renamed from: o */
        public String f42934o;

        /* JADX INFO: renamed from: p */
        public String f42935p;

        /* JADX INFO: renamed from: q */
        public boolean f42936q;

        /* JADX INFO: renamed from: r */
        public RawFeed f42937r;

        /* JADX INFO: renamed from: s */
        public String f42938s;

        /* JADX INFO: renamed from: t */
        public boolean f42939t = false;

        /* JADX INFO: renamed from: u */
        public String f42940u;

        /* JADX INFO: renamed from: v */
        public boolean f42941v;

        public C11469a(Context context) {
            this.f42920a = context;
        }

        /* JADX INFO: renamed from: a */
        public static C11469a m66017a(Context context) {
            return new C11469a(context);
        }

        /* JADX INFO: renamed from: b */
        public Intent m66018b() {
            Intent intent = new Intent(this.f42920a, (Class<?>) MomentDetailAct.class);
            intent.putExtra("from", this.f42921b);
            intent.putExtra("momentId", this.f42922c);
            intent.putExtra("momentOwner", this.f42923d);
            intent.putExtra("showDetail", this.f42924e);
            intent.putExtra("initMediaIndex", this.f42925f);
            intent.putExtra("lastPageAvailableMoment", this.f42929j);
            intent.putExtra("keyHideNeedMatchUid", this.f42926g);
            intent.putExtra("keyOriginFrom", this.f42927h);
            intent.putExtra("isHideComment", this.f42928i);
            intent.putExtra("isFromFeed", this.f42930k);
            intent.putExtra("momentValue", this.f42931l);
            intent.putExtra("canGreeting", this.f42932m);
            intent.putExtra("start_home_card", this.f42933n);
            intent.putExtra("msg_id", this.f42934o);
            intent.putExtra("enterPage", this.f42935p);
            intent.putExtra("showInput", this.f42936q);
            intent.putExtra("rawFeed", this.f42937r);
            if (!TextUtils.isEmpty(this.f42938s)) {
                intent.putExtra("clickedMsgid", this.f42938s);
            }
            return intent;
        }

        /* JADX INFO: renamed from: c */
        public C11469a m66019c(boolean z) {
            this.f42932m = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11469a m66020d(String str) {
            this.f42938s = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C11469a m66021e(String str) {
            this.f42935p = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C11469a m66022f(String str) {
            this.f42921b = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C11469a m66023g(int i) {
            this.f42925f = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C11469a m66024h(boolean z) {
            this.f42930k = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C11469a m66025i(boolean z) {
            this.f42928i = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C11469a m66026j(boolean z) {
            this.f42933n = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C11469a m66027k(Moment moment) {
            this.f42929j = moment;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C11469a m66028l(String str) {
            this.f42940u = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C11469a m66029m(String str) {
            this.f42922c = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C11469a m66030n(String str) {
            this.f42923d = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C11469a m66031o(String str) {
            this.f42931l = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C11469a m66032p(String str) {
            this.f42934o = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C11469a m66033q(String str) {
            this.f42926g = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C11469a m66034r(String str) {
            this.f42927h = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C11469a m66035s(RawFeed rawFeed) {
            this.f42937r = rawFeed;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C11469a m66036t(boolean z) {
            this.f42924e = z;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C11469a m66037u(boolean z) {
            this.f42936q = z;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C11469a m66038v(boolean z) {
            this.f42941v = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private void m66009Z1() {
        PopupWindow popupWindow = new PopupWindow();
        this.f42919g = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(tec0.f173743r2, (ViewGroup) null, false));
        this.f42919g.setInputMethodMode(1);
        this.f42919g.setWidth(0);
        this.f42919g.setHeight(0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d2 */
    public static String m66010d2(String str) {
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
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m66011e2(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            if (cmg.m111247z() && m66012g2()) {
                m66013a2();
                return;
            }
            return;
        }
        if (c4470c != C4470c.f16269k) {
            if (c4470c == C4470c.f16268j) {
                FeedModule.f39703d.f121351f0.clear();
            }
        } else if (cmg.m111247z() && m66012g2() && NullChecker.m82486a(this.f42917e)) {
            l51.m152890J(this.f42917e.f200621o);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public static boolean m66012g2() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: a2 */
    public void m66013a2() {
        if (NullChecker.m82486a(this.f42919g) && this.f42919g.isShowing()) {
            this.f42919g.dismiss();
            this.f42919g = null;
        }
    }

    /* JADX INFO: renamed from: b2 */
    public MomentDetailFrag m66014b2() {
        return this.f42915c.f115853d;
    }

    /* JADX INFO: renamed from: c2 */
    public Moment m66015c2(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(str);
        return momentM145813w7 == null ? FeedModule.f39702c.m61893X3(str) : momentM145813w7;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        if (cmg.m111180H() && NullChecker.m82486a(this.f42915c) && NullChecker.m82486a(this.f42915c.f115853d)) {
            PhotoAlbumFeedFrag.m65547l5(this.f42917e.f200610d, this.f42915c.f115853d.m66043Q4());
        }
    }

    /* JADX INFO: renamed from: h2 */
    public void m66016h2(Moment moment) {
        ym00 ym00Var = this.f42917e;
        if (ym00Var == null) {
            return;
        }
        this.pageHelper.m152780o(tfj0.m190938a(tfj0.C20302a.m190949g("moment_id", ym00Var.f200609c), tfj0.C20302a.m190949g("owner_id", this.f42917e.f200610d), tfj0.C20302a.m190949g("moment_type", moment == null ? "" : er60.m122104w().m122135y(moment)), tfj0.C20302a.m190949g("moment_detail_showfrom", m66010d2(this.f42917e.f200608b))));
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f42915c.inflateView(layoutInflater, viewGroup);
        if (cmg.m111247z()) {
            viewInflateView = act().setUpKeyboardDetectorLayout(viewInflateView, new View(act()), new z20() { // from class: l.uh00
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    MomentDetailAct.f42914h.onNext(new pf60<>((Boolean) obj, (Integer) obj2));
                }
            });
            if (m66012g2()) {
                m66009Z1();
            }
        }
        return viewInflateView;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f42915c = new in00(this);
        this.f42917e = new ym00(this);
        this.f42916d = getIntent().getBooleanExtra("isFromFeed", false);
        Bundle bundle = this.f42918f;
        if (bundle != null) {
            this.f42917e.m216650l0(bundle);
        }
        this.f42917e.mo52715C(this.f42915c);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f42917e.mo40473a0();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.th00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174223a.m66011e2((C4470c) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        if (NullChecker.m82486a(this.f42917e) && TextUtils.equals(this.f42917e.f200608b, "push_new_moment")) {
            return true;
        }
        return super.isAnonymousMode();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            setResult(-1, intent);
            m68056e2();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m82486a(this.f42915c) && NullChecker.m82486a(this.f42915c.f115853d)) {
            this.f42915c.f115853d.m66055o();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onRestoreGlobalState(Bundle bundle) {
        super.onRestoreGlobalState(bundle);
        this.f42918f = bundle;
        ym00 ym00Var = this.f42917e;
        if (ym00Var != null) {
            ym00Var.m216650l0(bundle);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onSaveGlobalState(Bundle bundle) {
        super.onSaveGlobalState(bundle);
        ym00 ym00Var = this.f42917e;
        if (ym00Var != null) {
            ym00Var.m216651m0(bundle);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (cmg.m111247z() && z && m66012g2() && NullChecker.m82486a(this.f42919g) && !this.f42919g.isShowing()) {
            this.f42919g.setBackgroundDrawable(new ColorDrawable(0));
            this.f42919g.showAtLocation(this.act.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_user_moment_interactions_details_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Moment momentM66015c2 = m66015c2(this.f42917e.f200609c);
        if (momentM66015c2 != null) {
            momentM66015c2.momentValue = this.f42917e.f200613g;
        }
        if (momentM66015c2 == null) {
            momentM66015c2 = (Moment) getIntent().getSerializableExtra("lastPageAvailableMoment");
        }
        m66016h2(momentM66015c2);
    }
}
