package com.p046p1.mobile.putong.core.p053ui.result;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.d3c0;
import p149l.hmb;
import p149l.q8b0;
import p149l.t100;
import p149l.xdl0;
import p149l.z53;

/* JADX INFO: loaded from: classes9.dex */
public class BoostContent extends ScrollView implements q8b0 {

    /* JADX INFO: renamed from: a */
    public VFrame f35573a;

    /* JADX INFO: renamed from: b */
    public VImage f35574b;

    /* JADX INFO: renamed from: c */
    public VText f35575c;

    /* JADX INFO: renamed from: d */
    public boolean f35576d;

    /* JADX INFO: renamed from: e */
    public Animator f35577e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.BoostContent$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC8830a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8830a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BoostContent boostContent = BoostContent.this;
            boostContent.f35577e = bt0.m103739l(boostContent.f35574b, bt0.f77162i, 0L, 200L, bt0.f77156c, 0.0f, 1.0f);
            BoostContent.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public BoostContent(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private void m54709d() {
        this.f35575c.setText(CoreModule.m29935P().m94654e().mo34992yb(getContext()));
        m54711c();
        this.f35574b.setImageResource(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? d3c0.f83597Hb : d3c0.f83583Gb);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8830a());
    }

    /* JADX INFO: renamed from: b */
    public final void m54710b(View view) {
        z53.m217274a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m54711c() {
        if (xdl0.m208408w0() <= 1280) {
            this.f35573a.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 260.0f);
            this.f35574b.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 156.0f);
            this.f35574b.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 225.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m54712e() {
        xdl0.m208345M0(this.f35574b, true);
        if (NullChecker.m81303a(this.f35577e)) {
            this.f35576d = true;
            this.f35577e.start();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m54710b(this);
        super.onFinishInflate();
        m54709d();
        if (xdl0.m208408w0() / getResources().getDisplayMetrics().density <= 700.0f) {
            this.f35573a.getLayoutParams().height = t100.m186890d(245.0f);
            this.f35575c.setPadding(0, 0, 0, 0);
        }
    }

    @Override // p149l.q8b0
    /* JADX INFO: renamed from: w */
    public void mo54713w(PutongFrag putongFrag) {
        m54712e();
    }

    public BoostContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
