package com.p051p1.mobile.putong.core.p058ui.result;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.jbc0;
import p153l.o63;
import p153l.qa00;
import p153l.ugb0;
import p153l.vnb;

/* JADX INFO: loaded from: classes12.dex */
public class BoostContent extends ScrollView implements ugb0 {

    /* JADX INFO: renamed from: a */
    public VFrame f36421a;

    /* JADX INFO: renamed from: b */
    public VImage f36422b;

    /* JADX INFO: renamed from: c */
    public VText f36423c;

    /* JADX INFO: renamed from: d */
    public boolean f36424d;

    /* JADX INFO: renamed from: e */
    public Animator f36425e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.BoostContent$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC8993a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8993a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BoostContent boostContent = BoostContent.this;
            boostContent.f36425e = gt0.m132166l(boostContent.f36422b, gt0.f106354i, 0L, 200L, gt0.f106348c, 0.0f, 1.0f);
            BoostContent.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public BoostContent(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private void m55892d() {
        this.f36423c.setText(CoreModule.m30933P().m143408e().mo35995yb(getContext()));
        m55894c();
        this.f36422b.setImageResource(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? jbc0.f119252Hb : jbc0.f119238Gb);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8993a());
    }

    /* JADX INFO: renamed from: b */
    public final void m55893b(View view) {
        o63.m166201a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m55894c() {
        if (bnl0.m105588w0() <= 1280) {
            this.f36421a.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 260.0f);
            this.f36422b.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 156.0f);
            this.f36422b.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 225.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m55895e() {
        bnl0.m105525M0(this.f36422b, true);
        if (NullChecker.m82486a(this.f36425e)) {
            this.f36424d = true;
            this.f36425e.start();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m55893b(this);
        super.onFinishInflate();
        m55892d();
        if (bnl0.m105588w0() / getResources().getDisplayMetrics().density <= 700.0f) {
            this.f36421a.getLayoutParams().height = qa00.m175859d(245.0f);
            this.f36423c.setPadding(0, 0, 0, 0);
        }
    }

    @Override // p153l.ugb0
    /* JADX INFO: renamed from: w */
    public void mo55896w(PutongFrag putongFrag) {
        m55895e();
    }

    public BoostContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
