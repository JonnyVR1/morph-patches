package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.helper.MomentPreviewNullMomentException;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e51;
import p007l.b5c0;
import p007l.e1c0;
import p007l.ro00;
import p007l.to00;
import p007l.uzb0;
import v.VFrame;
import v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsFeedPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ro00 f5353c;

    /* JADX INFO: renamed from: d */
    public to00 f5354d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m8063X1(Context context, String str, int i) {
        return m8064Y1(context, str, i, false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m8064Y1(Context context, String str, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MomentsFeedPreviewAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("current position", i);
        intent.putExtra("need draganimation", z);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m8065Z1(Context context, String str, int i, boolean z, String str2) {
        Intent intentM8064Y1 = m8064Y1(context, str, i, z);
        intentM8064Y1.putExtra("from", str2);
        return intentM8064Y1;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m8066a2(Context context, String str, int i, boolean z, String str2, String str3) {
        Intent intentM8065Z1 = m8065Z1(context, str, i, z, str2);
        intentM8065Z1.putExtra("otherId", str3);
        return intentM8065Z1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public final void m8068b2(to00 to00Var) {
        to00Var.f13363f = getIntent().getStringExtra("from");
    }

    /* JADX INFO: renamed from: c2 */
    public Moment m8069c2(String str) {
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(str);
        return momentM16753w7 == null ? FeedModule.f315c.m1635X3(str) : momentM16753w7;
    }

    /* JADX INFO: renamed from: e2 */
    public void m8070e2() {
    }

    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m8067d2() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(uzb0.f13987a, uzb0.f13988b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g2 */
    public void m8071g2() {
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
        return setTopViewLayout(this.f5354d.inflateView(layoutInflater, viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        String stringExtra = getIntent().getStringExtra("moment id");
        Moment momentM8069c2 = m8069c2(stringExtra);
        if (momentM8069c2 == null) {
            MomentPreviewNullMomentException.reportNullMoment(stringExtra, getIntent().getStringExtra("from"), getIntent().getStringExtra("otherId"));
            finishWithoutCustomAnimation();
        }
        this.f5353c = new ro00(this);
        to00 to00Var = new to00(this);
        this.f5354d = to00Var;
        ro00 ro00Var = this.f5353c;
        ro00Var.f12704d = momentM8069c2;
        ro00Var.C(to00Var);
        m8068b2(this.f5354d);
    }

    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.a(this.f5353c)) {
            this.f5353c.m13938a0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        if (NullChecker.a(this.f5354d)) {
            VFrame vFrameM14589f = this.f5354d.m14589f();
            if (vFrameM14589f instanceof VFrame) {
                View view = (SubsamplingScaleImageView) vFrameM14589f.findViewById(b5c0.f5978L0);
                if (NullChecker.a(view)) {
                    view.setOnImageEventListener((SubsamplingScaleImageView.h) null);
                    view.setVisibility(8);
                    vFrameM14589f.removeView(view);
                    e51.H(this, new Runnable() { // from class: l.io00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9106a.m8067d2();
                        }
                    }, 100L);
                    return;
                }
            }
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
        return "p_moment_fullscreen_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        m8071g2();
        Intent intent = getIntent();
        this.f5353c.m13939l0(intent.getStringExtra("moment id"), intent.getIntExtra("current position", 0), intent.getBooleanExtra("need draganimation", false));
    }

    public List<Object> trackedArgs() {
        return this.f5353c.m13940m0();
    }
}
