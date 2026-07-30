package com.p046p1.mobile.putong.feed.newui.preview.act;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.helper.MomentPreviewNullMomentException;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.b9i;
import p149l.e1c0;
import p149l.e51;
import p149l.ib1;
import p149l.jmh;
import p149l.p6j0;
import p149l.q770;
import p149l.u9i;
import p149l.uzb0;
import p149l.vqg;
import p149l.wvh;
import p149l.x770;
import p149l.yvh;
import p149l.yye;
import p149l.zi60;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumFeedPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: l */
    public static String f42597l = null;

    /* JADX INFO: renamed from: m */
    public static boolean f42598m = false;

    /* JADX INFO: renamed from: c */
    public x770 f42599c;

    /* JADX INFO: renamed from: d */
    public C11315a f42600d;

    /* JADX INFO: renamed from: e */
    public b9i f42601e;

    /* JADX INFO: renamed from: f */
    public wvh f42602f;

    /* JADX INFO: renamed from: g */
    public boolean f42603g;

    /* JADX INFO: renamed from: h */
    public int f42604h;

    /* JADX INFO: renamed from: i */
    public boolean f42605i;

    /* JADX INFO: renamed from: j */
    public Runnable f42606j = new RunnableC11314a();

    /* JADX INFO: renamed from: k */
    public Moment f42607k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct$a */
    public class RunnableC11314a implements Runnable {
        public RunnableC11314a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedModule.f38855d.m209528pc(PhotoAlbumFeedPreviewAct.this.f42607k.f56011id);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m65305X1(Context context, String str, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumFeedPreviewAct.class);
        f42597l = str;
        intent.putExtra("moment_id", str);
        intent.putExtra("current position", i);
        intent.putExtra("need draganimation", z);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m65306Y1(Context context, String str, int i, boolean z, String str2, boolean z2, boolean z3) {
        Intent intentM65305X1 = m65305X1(context, str, i, z);
        intentM65305X1.putExtra("from", str2);
        intentM65305X1.putExtra("canGreeting", z2);
        intentM65305X1.putExtra("start_home_card", z3);
        return intentM65305X1;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m65307Z1(Context context, String str, int i, boolean z, String str2, boolean z2, boolean z3, int i2) {
        Intent intentM65306Y1 = m65306Y1(context, str, i, z, str2, z2, z3);
        intentM65306Y1.putExtra("pageType", i2);
        return intentM65306Y1;
    }

    /* JADX INFO: renamed from: a2 */
    public final void m65308a2() {
        this.f42599c = new x770(this);
        C11315a c11315aM65335b = C11315a.a.m65334a().m65337d(this.act).m65335b();
        this.f42600d = c11315aM65335b;
        this.f42599c.mo51532C(c11315aM65335b);
    }

    /* JADX INFO: renamed from: b2 */
    public b9i m65309b2() {
        return this.f42601e;
    }

    /* JADX INFO: renamed from: c2 */
    public Moment m65310c2(String str) {
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(str);
        return momentM209572w7 == null ? FeedModule.f38854c.m60709X3(str) : momentM209572w7;
    }

    /* JADX INFO: renamed from: d2 */
    public final String m65311d2(Moment moment) {
        if (m65312e2(moment)) {
            return ReminderAction.photo;
        }
        return m65313g2(moment) ? "video" : "";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            q770.m173191N();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e2 */
    public final boolean m65312e2(Moment moment) {
        return NullChecker.m81303a(moment) && moment.media.size() > 0 && (moment.media.get(0) instanceof Picture);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        e51.m114745J(this.f42606j);
        ib1.m135233b().mo135234a("PhotoAlbumFeedPreviewAdapter");
        ib1.m135233b().mo135237e("PhotoAlbumFeedPreviewAdapter");
        if (!hasCustomTransition()) {
            overridePendingTransition(uzb0.f178976a, uzb0.f178977b);
        }
        this.f42601e.m100808i();
        if (f42598m) {
            FeedModule.m60223M().mo67253Zo().mo111895f(false);
            f42598m = false;
        }
        if (this.f42603g) {
            PhotoAlbumFeedFrag.m64363j5(this.f42599c.m207251k0(), this.f42604h);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final boolean m65313g2(Moment moment) {
        return NullChecker.m81303a(moment) && moment.media.size() > 0 && (moment.media.get(0) instanceof Video);
    }

    /* JADX INFO: renamed from: h2 */
    public void m65314h2() {
        wvh wvhVar = this.f42602f;
        if (wvhVar != null) {
            wvhVar.mo142715a(false);
        }
    }

    /* JADX INFO: renamed from: i2 */
    public void m65315i2() {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(e1c0.f88801o0));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        dimStatusBar(true);
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 16);
        }
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(uzb0.f178978c, uzb0.f178979d);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return setTopViewLayout(this.f42600d.inflateView(layoutInflater, viewGroup));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        PhotoAlbumFeedPreviewAct photoAlbumFeedPreviewAct;
        super.initDataOnCreate();
        if (f42598m) {
            FeedModule.m60223M().mo67253Zo().mo111895f(true);
        }
        this.f42601e = new b9i(this);
        Moment momentM65310c2 = m65310c2(getIntent().getStringExtra("moment_id"));
        this.f42607k = momentM65310c2;
        if (momentM65310c2 == null) {
            MomentPreviewNullMomentException.reportNullMoment("", getIntent().getStringExtra("from"), getIntent().getStringExtra("otherId"));
            finishWithoutCustomAnimation();
            m65308a2();
            return;
        }
        e51.m114743H(this, this.f42606j, ((long) vqg.m199511I("detailTime")) * 1000);
        this.f42605i = getIntent().getBooleanExtra("start_home_card", false);
        this.f42599c = new x770(this);
        if (!getIntent().getBooleanExtra("no_preview_cover", false)) {
            boolean zM65312e2 = m65312e2(this.f42607k);
            Moment moment = this.f42607k;
            if (zM65312e2) {
                this.f42602f = new jmh(moment, getIntent().getBooleanExtra("canGreeting", false), this.f42605i, this);
            } else {
                photoAlbumFeedPreviewAct = this;
                photoAlbumFeedPreviewAct.f42602f = new u9i(moment, getIntent().getBooleanExtra("canGreeting", false), this.f42605i, photoAlbumFeedPreviewAct, new yvh());
            }
            C11315a c11315aM65335b = C11315a.a.m65334a().m65337d(photoAlbumFeedPreviewAct.act).m65336c(photoAlbumFeedPreviewAct.f42602f).m65339f(photoAlbumFeedPreviewAct.f42602f).m65335b();
            photoAlbumFeedPreviewAct.f42600d = c11315aM65335b;
            x770 x770Var = photoAlbumFeedPreviewAct.f42599c;
            x770Var.f191324e = photoAlbumFeedPreviewAct.f42607k;
            x770Var.mo51532C(c11315aM65335b);
            photoAlbumFeedPreviewAct.f42600d.f42618j = photoAlbumFeedPreviewAct.getIntent().getStringExtra("from");
            String strM65311d2 = photoAlbumFeedPreviewAct.m65311d2(photoAlbumFeedPreviewAct.f42607k);
            Moment moment2 = photoAlbumFeedPreviewAct.f42607k;
            photoAlbumFeedPreviewAct.m65316k2(strM65311d2, moment2.f56011id, moment2.owner);
        }
        this.f42602f = new yye();
        photoAlbumFeedPreviewAct = this;
        C11315a c11315aM65335b2 = C11315a.a.m65334a().m65337d(photoAlbumFeedPreviewAct.act).m65336c(photoAlbumFeedPreviewAct.f42602f).m65339f(photoAlbumFeedPreviewAct.f42602f).m65335b();
        photoAlbumFeedPreviewAct.f42600d = c11315aM65335b2;
        x770 x770Var2 = photoAlbumFeedPreviewAct.f42599c;
        x770Var2.f191324e = photoAlbumFeedPreviewAct.f42607k;
        x770Var2.mo51532C(c11315aM65335b2);
        photoAlbumFeedPreviewAct.f42600d.f42618j = photoAlbumFeedPreviewAct.getIntent().getStringExtra("from");
        String strM65311d3 = photoAlbumFeedPreviewAct.m65311d2(photoAlbumFeedPreviewAct.f42607k);
        Moment moment3 = photoAlbumFeedPreviewAct.f42607k;
        photoAlbumFeedPreviewAct.m65316k2(strM65311d3, moment3.f56011id, moment3.owner);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.m81303a(this.f42599c)) {
            this.f42599c.mo39470a0();
        }
    }

    /* JADX INFO: renamed from: k2 */
    public void m65316k2(String str, String str2, String str3) {
        this.pageHelper.m109039o(p6j0.m167667a(p6j0.C19147a.m167678g("moment_type", str), p6j0.C19147a.m167678g("moment_id", str2), p6j0.C19147a.m167678g("owner_id", str3), p6j0.C19147a.m167678g("moment_showfrom", zi60.m218960D(getIntent().getStringExtra("from")))));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m81303a(this.f42600d)) {
            this.f42600d.m65330q();
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

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_moment_preview";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        m65315i2();
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("pageType", -1);
        this.f42604h = intExtra;
        this.f42603g = vqg.m199554k0(intExtra);
        this.f42599c.m207253p0(intent.getIntExtra("current position", 0), intent.getBooleanExtra("need draganimation", false));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f42599c.m207254q0();
    }
}
