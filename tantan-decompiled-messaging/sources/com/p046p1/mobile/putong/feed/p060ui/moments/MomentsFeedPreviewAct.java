package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.helper.MomentPreviewNullMomentException;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;
import p149l.b5c0;
import p149l.e1c0;
import p149l.e51;
import p149l.ro00;
import p149l.to00;
import p149l.uzb0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsFeedPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ro00 f43892c;

    /* JADX INFO: renamed from: d */
    public to00 f43893d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m66869X1(Context context, String str, int i) {
        return m66870Y1(context, str, i, false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m66870Y1(Context context, String str, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MomentsFeedPreviewAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("current position", i);
        intent.putExtra("need draganimation", z);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m66871Z1(Context context, String str, int i, boolean z, String str2) {
        Intent intentM66870Y1 = m66870Y1(context, str, i, z);
        intentM66870Y1.putExtra("from", str2);
        return intentM66870Y1;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m66872a2(Context context, String str, int i, boolean z, String str2, String str3) {
        Intent intentM66871Z1 = m66871Z1(context, str, i, z, str2);
        intentM66871Z1.putExtra("otherId", str3);
        return intentM66871Z1;
    }

    /* JADX INFO: renamed from: b2 */
    public final void m66874b2(to00 to00Var) {
        to00Var.f171309f = getIntent().getStringExtra("from");
    }

    /* JADX INFO: renamed from: c2 */
    public Moment m66875c2(String str) {
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(str);
        return momentM209572w7 == null ? FeedModule.f38854c.m60709X3(str) : momentM209572w7;
    }

    /* JADX INFO: renamed from: e2 */
    public void m66876e2() {
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m66873d2() {
        super.lambda$debugItems$19();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(uzb0.f178976a, uzb0.f178977b);
    }

    /* JADX INFO: renamed from: g2 */
    public void m66877g2() {
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
        return setTopViewLayout(this.f43893d.inflateView(layoutInflater, viewGroup));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        String stringExtra = getIntent().getStringExtra("moment id");
        Moment momentM66875c2 = m66875c2(stringExtra);
        if (momentM66875c2 == null) {
            MomentPreviewNullMomentException.reportNullMoment(stringExtra, getIntent().getStringExtra("from"), getIntent().getStringExtra("otherId"));
            finishWithoutCustomAnimation();
        }
        this.f43892c = new ro00(this);
        to00 to00Var = new to00(this);
        this.f43893d = to00Var;
        ro00 ro00Var = this.f43892c;
        ro00Var.f160345d = momentM66875c2;
        ro00Var.mo51532C(to00Var);
        m66874b2(this.f43893d);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.m81303a(this.f43892c)) {
            this.f43892c.mo39470a0();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m81303a(this.f43893d)) {
            View viewM189835f = this.f43893d.m189835f();
            if (viewM189835f instanceof VFrame) {
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) viewM189835f.findViewById(b5c0.f73497L0);
                if (NullChecker.m81303a(subsamplingScaleImageView)) {
                    subsamplingScaleImageView.setOnImageEventListener(null);
                    subsamplingScaleImageView.setVisibility(8);
                    ((VFrame) viewM189835f).removeView(subsamplingScaleImageView);
                    e51.m114743H(this, new Runnable() { // from class: l.io00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f114088a.m66873d2();
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

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_moment_fullscreen_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        m66877g2();
        Intent intent = getIntent();
        this.f43892c.m180219l0(intent.getStringExtra("moment id"), intent.getIntExtra("current position", 0), intent.getBooleanExtra("need draganimation", false));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f43892c.m180220m0();
    }
}
