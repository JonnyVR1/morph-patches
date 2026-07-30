package com.p000p1.mobile.putong.feed.newui.preview.act;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.helper.MomentPreviewNullMomentException;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e51;
import l.ib1;
import p007l.b9i;
import p007l.e1c0;
import p007l.jmh;
import p007l.p6j0;
import p007l.q770;
import p007l.u9i;
import p007l.uzb0;
import p007l.vqg;
import p007l.wvh;
import p007l.x770;
import p007l.yvh;
import p007l.yye;
import p007l.zi60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumFeedPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: l */
    public static String f4058l = null;

    /* JADX INFO: renamed from: m */
    public static boolean f4059m = false;

    /* JADX INFO: renamed from: c */
    public x770 f4060c;

    /* JADX INFO: renamed from: d */
    public C2159a f4061d;

    /* JADX INFO: renamed from: e */
    public b9i f4062e;

    /* JADX INFO: renamed from: f */
    public wvh f4063f;

    /* JADX INFO: renamed from: g */
    public boolean f4064g;

    /* JADX INFO: renamed from: h */
    public int f4065h;

    /* JADX INFO: renamed from: i */
    public boolean f4066i;

    /* JADX INFO: renamed from: j */
    public Runnable f4067j = new RunnableC2158a();

    /* JADX INFO: renamed from: k */
    public Moment f4068k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct$a */
    public class RunnableC2158a implements Runnable {
        public RunnableC2158a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedModule.f316d.m16709pc(((DbObject) PhotoAlbumFeedPreviewAct.this.f4068k).id);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m6406X1(Context context, String str, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumFeedPreviewAct.class);
        f4058l = str;
        intent.putExtra("moment_id", str);
        intent.putExtra("current position", i);
        intent.putExtra("need draganimation", z);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m6407Y1(Context context, String str, int i, boolean z, String str2, boolean z2, boolean z3) {
        Intent intentM6406X1 = m6406X1(context, str, i, z);
        intentM6406X1.putExtra("from", str2);
        intentM6406X1.putExtra("canGreeting", z2);
        intentM6406X1.putExtra("start_home_card", z3);
        return intentM6406X1;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m6408Z1(Context context, String str, int i, boolean z, String str2, boolean z2, boolean z3, int i2) {
        Intent intentM6407Y1 = m6407Y1(context, str, i, z, str2, z2, z3);
        intentM6407Y1.putExtra("pageType", i2);
        return intentM6407Y1;
    }

    /* JADX INFO: renamed from: a2 */
    public final void m6409a2() {
        this.f4060c = new x770(this);
        C2159a c2159aM6438b = C2159a.a.m6437a().m6440d(((Act) this).act).m6438b();
        this.f4061d = c2159aM6438b;
        this.f4060c.C(c2159aM6438b);
    }

    /* JADX INFO: renamed from: b2 */
    public b9i m6410b2() {
        return this.f4062e;
    }

    /* JADX INFO: renamed from: c2 */
    public Moment m6411c2(String str) {
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(str);
        return momentM16753w7 == null ? FeedModule.f315c.m1635X3(str) : momentM16753w7;
    }

    /* JADX INFO: renamed from: d2 */
    public final String m6412d2(Moment moment) {
        if (m6413e2(moment)) {
            return "photo";
        }
        return m6414g2(moment) ? "video" : "";
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            q770.m13435N();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e2 */
    public final boolean m6413e2(Moment moment) {
        return NullChecker.a(moment) && moment.media.size() > 0 && (moment.media.get(0) instanceof Picture);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        e51.J(this.f4067j);
        ib1.b().a("PhotoAlbumFeedPreviewAdapter");
        ib1.b().e("PhotoAlbumFeedPreviewAdapter");
        if (!hasCustomTransition()) {
            overridePendingTransition(uzb0.f13987a, uzb0.f13988b);
        }
        this.f4062e.m8774i();
        if (f4059m) {
            FeedModule.m1141M().Zo().f(false);
            f4059m = false;
        }
        if (this.f4064g) {
            PhotoAlbumFeedFrag.m5437j5(this.f4060c.m16029k0(), this.f4065h);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final boolean m6414g2(Moment moment) {
        return NullChecker.a(moment) && moment.media.size() > 0 && (moment.media.get(0) instanceof Video);
    }

    /* JADX INFO: renamed from: h2 */
    public void m6415h2() {
        wvh wvhVar = this.f4063f;
        if (wvhVar != null) {
            wvhVar.mo11298a(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i2 */
    public void m6416i2() {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(e1c0.f7157o0));
        decorOrSwipingDecorView().setBackgroundColor(-16777216);
        dimStatusBar(true);
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 16);
        }
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(uzb0.f13989c, uzb0.f13990d);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return setTopViewLayout(this.f4061d.inflateView(layoutInflater, viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.app.Activity, android.content.Context, com.p1.mobile.android.app.Act, com.p1.mobile.putong.app.PutongAct, com.p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.p1.mobile.android.app.Act, com.p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.app.Activity, com.p1.mobile.android.app.Act, com.p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public void initDataOnCreate() {
        ?? r8;
        super.initDataOnCreate();
        if (f4059m) {
            FeedModule.m1141M().Zo().f(true);
        }
        this.f4062e = new b9i(this);
        Moment momentM6411c2 = m6411c2(getIntent().getStringExtra("moment_id"));
        this.f4068k = momentM6411c2;
        if (momentM6411c2 == null) {
            MomentPreviewNullMomentException.reportNullMoment("", getIntent().getStringExtra("from"), getIntent().getStringExtra("otherId"));
            finishWithoutCustomAnimation();
            m6409a2();
            return;
        }
        e51.H((Context) this, this.f4067j, ((long) vqg.m15481I("detailTime")) * 1000);
        this.f4066i = getIntent().getBooleanExtra("start_home_card", false);
        this.f4060c = new x770(this);
        if (!getIntent().getBooleanExtra("no_preview_cover", false)) {
            boolean zM6413e2 = m6413e2(this.f4068k);
            Moment moment = this.f4068k;
            if (zM6413e2) {
                this.f4063f = new jmh(moment, getIntent().getBooleanExtra("canGreeting", false), this.f4066i, this);
            } else {
                ?? r9 = this;
                r9.f4063f = new u9i(moment, getIntent().getBooleanExtra("canGreeting", false), this.f4066i, r9, new yvh());
                r8 = r9;
            }
            C2159a c2159aM6438b = C2159a.a.m6437a().m6440d(((Act) r8).act).m6439c(r8.f4063f).m6442f(r8.f4063f).m6438b();
            r8.f4061d = c2159aM6438b;
            x770 x770Var = r8.f4060c;
            x770Var.f14788e = r8.f4068k;
            x770Var.C(c2159aM6438b);
            r8.f4061d.f4079j = r8.getIntent().getStringExtra("from");
            String strM6412d2 = r8.m6412d2(r8.f4068k);
            Moment moment2 = r8.f4068k;
            r8.m6417k2(strM6412d2, ((DbObject) moment2).id, moment2.owner);
        }
        this.f4063f = new yye();
        r8 = this;
        C2159a c2159aM6438b2 = C2159a.a.m6437a().m6440d(((Act) r8).act).m6439c(r8.f4063f).m6442f(r8.f4063f).m6438b();
        r8.f4061d = c2159aM6438b2;
        x770 x770Var2 = r8.f4060c;
        x770Var2.f14788e = r8.f4068k;
        x770Var2.C(c2159aM6438b2);
        r8.f4061d.f4079j = r8.getIntent().getStringExtra("from");
        String strM6412d3 = r8.m6412d2(r8.f4068k);
        Moment moment3 = r8.f4068k;
        r8.m6417k2(strM6412d3, ((DbObject) moment3).id, moment3.owner);
    }

    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.a(this.f4060c)) {
            this.f4060c.m16028a0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k2 */
    public void m6417k2(String str, String str2, String str3) {
        ((PutongAct) this).pageHelper.o(p6j0.m12911a(p6j0.C2456a.m12922g("moment_type", str), p6j0.C2456a.m12922g("moment_id", str2), p6j0.C2456a.m12922g("owner_id", str3), p6j0.C2456a.m12922g("moment_showfrom", zi60.m17435D(getIntent().getStringExtra("from")))));
    }

    public void onBackPressed() {
        if (NullChecker.a(this.f4061d)) {
            this.f4061d.m6433q();
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            hideInput();
        }
        return super/*android.app.Activity*/.onTouchEvent(motionEvent);
    }

    public String pageId() {
        return "p_moment_preview";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        m6416i2();
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("pageType", -1);
        this.f4065h = intExtra;
        this.f4064g = vqg.m15524k0(intExtra);
        this.f4060c.m16031p0(intent.getIntExtra("current position", 0), intent.getBooleanExtra("need draganimation", false));
    }

    public List<Object> trackedArgs() {
        return this.f4060c.m16032q0();
    }
}
