package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.helper.MomentPreviewNullMomentException;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;
import p153l.a8c0;
import p153l.ax00;
import p153l.cx00;
import p153l.hdc0;
import p153l.k9c0;
import p153l.l51;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsFeedPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ax00 f44740c;

    /* JADX INFO: renamed from: d */
    public cx00 f44741d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m68052Y1(Context context, String str, int i) {
        return m68053Z1(context, str, i, false);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m68053Z1(Context context, String str, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MomentsFeedPreviewAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("current position", i);
        intent.putExtra("need draganimation", z);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m68054a2(Context context, String str, int i, boolean z, String str2) {
        Intent intentM68053Z1 = m68053Z1(context, str, i, z);
        intentM68053Z1.putExtra("from", str2);
        return intentM68053Z1;
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m68055b2(Context context, String str, int i, boolean z, String str2, String str3) {
        Intent intentM68054a2 = m68054a2(context, str, i, z, str2);
        intentM68054a2.putExtra("otherId", str3);
        return intentM68054a2;
    }

    /* JADX INFO: renamed from: c2 */
    public final void m68057c2(cx00 cx00Var) {
        cx00Var.f84163f = getIntent().getStringExtra("from");
    }

    /* JADX INFO: renamed from: d2 */
    public Moment m68058d2(String str) {
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(str);
        return momentM145813w7 == null ? FeedModule.f39702c.m61893X3(str) : momentM145813w7;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m68056e2() {
        super.lambda$debugItems$19();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(a8c0.f68901a, a8c0.f68902b);
    }

    /* JADX INFO: renamed from: g2 */
    public void m68059g2() {
    }

    /* JADX INFO: renamed from: h2 */
    public void m68060h2() {
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

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return setTopViewLayout(this.f44741d.inflateView(layoutInflater, viewGroup));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        String stringExtra = getIntent().getStringExtra("moment id");
        Moment momentM68058d2 = m68058d2(stringExtra);
        if (momentM68058d2 == null) {
            MomentPreviewNullMomentException.reportNullMoment(stringExtra, getIntent().getStringExtra("from"), getIntent().getStringExtra("otherId"));
            finishWithoutCustomAnimation();
        }
        this.f44740c = new ax00(this);
        cx00 cx00Var = new cx00(this);
        this.f44741d = cx00Var;
        ax00 ax00Var = this.f44740c;
        ax00Var.f73811d = momentM68058d2;
        ax00Var.mo52715C(cx00Var);
        m68057c2(this.f44741d);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.m82486a(this.f44740c)) {
            this.f44740c.mo40473a0();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m82486a(this.f44741d)) {
            View viewM112953f = this.f44741d.m112953f();
            if (viewM112953f instanceof VFrame) {
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) viewM112953f.findViewById(hdc0.f108850L0);
                if (NullChecker.m82486a(subsamplingScaleImageView)) {
                    subsamplingScaleImageView.setOnImageEventListener(null);
                    subsamplingScaleImageView.setVisibility(8);
                    ((VFrame) viewM112953f).removeView(subsamplingScaleImageView);
                    l51.m152888H(this, new Runnable() { // from class: l.rw00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f165091a.m68056e2();
                        }
                    }, 100L);
                    return;
                }
            }
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
        return "p_moment_fullscreen_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        m68060h2();
        Intent intent = getIntent();
        this.f44740c.m100752l0(intent.getStringExtra("moment id"), intent.getIntExtra("current position", 0), intent.getBooleanExtra("need draganimation", false));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f44740c.m100753m0();
    }
}
