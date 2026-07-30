package com.p051p1.mobile.putong.feed.newui.preview.act;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.helper.MomentPreviewNullMomentException;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.a8c0;
import p153l.c0f;
import p153l.dg70;
import p153l.er60;
import p153l.jbi;
import p153l.k9c0;
import p153l.ksg;
import p153l.l51;
import p153l.lxh;
import p153l.nxh;
import p153l.pb1;
import p153l.qai;
import p153l.tfj0;
import p153l.wf70;
import p153l.ynh;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumFeedPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: l */
    public static String f43445l = null;

    /* JADX INFO: renamed from: m */
    public static boolean f43446m = false;

    /* JADX INFO: renamed from: c */
    public dg70 f43447c;

    /* JADX INFO: renamed from: d */
    public C11478a f43448d;

    /* JADX INFO: renamed from: e */
    public qai f43449e;

    /* JADX INFO: renamed from: f */
    public lxh f43450f;

    /* JADX INFO: renamed from: g */
    public boolean f43451g;

    /* JADX INFO: renamed from: h */
    public int f43452h;

    /* JADX INFO: renamed from: i */
    public boolean f43453i;

    /* JADX INFO: renamed from: j */
    public Runnable f43454j = new RunnableC11477a();

    /* JADX INFO: renamed from: k */
    public Moment f43455k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct$a */
    public class RunnableC11477a implements Runnable {
        public RunnableC11477a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedModule.f39703d.m145769pc(PhotoAlbumFeedPreviewAct.this.f43455k.f56859id);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m66488Y1(Context context, String str, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumFeedPreviewAct.class);
        f43445l = str;
        intent.putExtra("moment_id", str);
        intent.putExtra("current position", i);
        intent.putExtra("need draganimation", z);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m66489Z1(Context context, String str, int i, boolean z, String str2, boolean z2, boolean z3) {
        Intent intentM66488Y1 = m66488Y1(context, str, i, z);
        intentM66488Y1.putExtra("from", str2);
        intentM66488Y1.putExtra("canGreeting", z2);
        intentM66488Y1.putExtra("start_home_card", z3);
        return intentM66488Y1;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m66490a2(Context context, String str, int i, boolean z, String str2, boolean z2, boolean z3, int i2) {
        Intent intentM66489Z1 = m66489Z1(context, str, i, z, str2, z2, z3);
        intentM66489Z1.putExtra("pageType", i2);
        return intentM66489Z1;
    }

    /* JADX INFO: renamed from: b2 */
    public final void m66491b2() {
        this.f43447c = new dg70(this);
        C11478a c11478aM66518b = C11478a.a.m66517a().m66520d(this.act).m66518b();
        this.f43448d = c11478aM66518b;
        this.f43447c.mo52715C(c11478aM66518b);
    }

    /* JADX INFO: renamed from: c2 */
    public qai m66492c2() {
        return this.f43449e;
    }

    /* JADX INFO: renamed from: d2 */
    public Moment m66493d2(String str) {
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(str);
        return momentM145813w7 == null ? FeedModule.f39702c.m61893X3(str) : momentM145813w7;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            wf70.m206054N();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e2 */
    public final String m66494e2(Moment moment) {
        if (m66495g2(moment)) {
            return ReminderAction.photo;
        }
        return m66496h2(moment) ? "video" : "";
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        l51.m152890J(this.f43454j);
        pb1.m171472b().mo171473a("PhotoAlbumFeedPreviewAdapter");
        pb1.m171472b().mo171476e("PhotoAlbumFeedPreviewAdapter");
        if (!hasCustomTransition()) {
            overridePendingTransition(a8c0.f68901a, a8c0.f68902b);
        }
        this.f43449e.m175936i();
        if (f43446m) {
            FeedModule.m61407M().mo68436Zo().mo136902f(false);
            f43446m = false;
        }
        if (this.f43451g) {
            PhotoAlbumFeedFrag.m65546j5(this.f43447c.m115640k0(), this.f43452h);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final boolean m66495g2(Moment moment) {
        return NullChecker.m82486a(moment) && moment.media.size() > 0 && (moment.media.get(0) instanceof Picture);
    }

    /* JADX INFO: renamed from: h2 */
    public final boolean m66496h2(Moment moment) {
        return NullChecker.m82486a(moment) && moment.media.size() > 0 && (moment.media.get(0) instanceof Video);
    }

    /* JADX INFO: renamed from: i2 */
    public void m66497i2() {
        lxh lxhVar = this.f43450f;
        if (lxhVar != null) {
            lxhVar.mo107409a(false);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return setTopViewLayout(this.f43448d.inflateView(layoutInflater, viewGroup));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct;
        super.initDataOnCreate();
        if (f43446m) {
            FeedModule.m61407M().mo68436Zo().mo136902f(true);
        }
        this.f43449e = new qai(this);
        Moment momentM66493d2 = m66493d2(getIntent().getStringExtra("moment_id"));
        this.f43455k = momentM66493d2;
        if (momentM66493d2 == null) {
            MomentPreviewNullMomentException.reportNullMoment("", getIntent().getStringExtra("from"), getIntent().getStringExtra("otherId"));
            finishWithoutCustomAnimation();
            m66491b2();
            return;
        }
        l51.m152888H(this, this.f43454j, ((long) ksg.m151170I("detailTime")) * 1000);
        this.f43453i = getIntent().getBooleanExtra("start_home_card", false);
        this.f43447c = new dg70(this);
        if (!getIntent().getBooleanExtra("no_preview_cover", false)) {
            boolean zM66495g2 = m66495g2(this.f43455k);
            Moment moment = this.f43455k;
            if (zM66495g2) {
                this.f43450f = new ynh(moment, getIntent().getBooleanExtra("canGreeting", false), this.f43453i, this);
            } else {
                photoAlbumFeedPreviewAct = this;
                photoAlbumFeedPreviewAct.f43450f = new jbi(moment, getIntent().getBooleanExtra("canGreeting", false), this.f43453i, photoAlbumFeedPreviewAct, new nxh());
            }
            C11478a c11478aM66518b = C11478a.a.m66517a().m66520d(photoAlbumFeedPreviewAct.act).m66519c(photoAlbumFeedPreviewAct.f43450f).m66522f(photoAlbumFeedPreviewAct.f43450f).m66518b();
            photoAlbumFeedPreviewAct.f43448d = c11478aM66518b;
            dg70 dg70Var = photoAlbumFeedPreviewAct.f43447c;
            dg70Var.f88270e = photoAlbumFeedPreviewAct.f43455k;
            dg70Var.mo52715C(c11478aM66518b);
            photoAlbumFeedPreviewAct.f43448d.f43466j = photoAlbumFeedPreviewAct.getIntent().getStringExtra("from");
            String strM66494e2 = photoAlbumFeedPreviewAct.m66494e2(photoAlbumFeedPreviewAct.f43455k);
            Moment moment2 = photoAlbumFeedPreviewAct.f43455k;
            photoAlbumFeedPreviewAct.m66499l2(strM66494e2, moment2.f56859id, moment2.owner);
        }
        this.f43450f = new c0f();
        photoAlbumFeedPreviewAct = this;
        C11478a c11478aM66518b2 = C11478a.a.m66517a().m66520d(photoAlbumFeedPreviewAct.act).m66519c(photoAlbumFeedPreviewAct.f43450f).m66522f(photoAlbumFeedPreviewAct.f43450f).m66518b();
        photoAlbumFeedPreviewAct.f43448d = c11478aM66518b2;
        dg70 dg70Var2 = photoAlbumFeedPreviewAct.f43447c;
        dg70Var2.f88270e = photoAlbumFeedPreviewAct.f43455k;
        dg70Var2.mo52715C(c11478aM66518b2);
        photoAlbumFeedPreviewAct.f43448d.f43466j = photoAlbumFeedPreviewAct.getIntent().getStringExtra("from");
        String strM66494e3 = photoAlbumFeedPreviewAct.m66494e2(photoAlbumFeedPreviewAct.f43455k);
        Moment moment3 = photoAlbumFeedPreviewAct.f43455k;
        photoAlbumFeedPreviewAct.m66499l2(strM66494e3, moment3.f56859id, moment3.owner);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.m82486a(this.f43447c)) {
            this.f43447c.mo40473a0();
        }
    }

    /* JADX INFO: renamed from: k2 */
    public void m66498k2() {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(k9c0.f124524o0));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        dimStatusBar(true);
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 16);
        }
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(a8c0.f68903c, a8c0.f68904d);
    }

    /* JADX INFO: renamed from: l2 */
    public void m66499l2(String str, String str2, String str3) {
        this.pageHelper.m152780o(tfj0.m190938a(tfj0.C20302a.m190949g("moment_type", str), tfj0.C20302a.m190949g("moment_id", str2), tfj0.C20302a.m190949g("owner_id", str3), tfj0.C20302a.m190949g("moment_showfrom", er60.m122103D(getIntent().getStringExtra("from")))));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m82486a(this.f43448d)) {
            this.f43448d.m66513q();
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            hideInput();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_moment_preview";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        m66498k2();
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("pageType", -1);
        this.f43452h = intExtra;
        this.f43451g = ksg.m151213k0(intExtra);
        this.f43447c.m115642p0(intent.getIntExtra("current position", 0), intent.getBooleanExtra("need draganimation", false));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f43447c.m115643q0();
    }
}
