package com.p000p1.mobile.putong.core.p004ui.result;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.d3c0;
import l.hmb;
import l.t100;
import l.xdl0;
import l.z53;
import p006l.q8b0;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class BoostContent extends ScrollView implements q8b0 {

    /* JADX INFO: renamed from: a */
    public VFrame f5354a;

    /* JADX INFO: renamed from: b */
    public VImage f5355b;

    /* JADX INFO: renamed from: c */
    public VText f5356c;

    /* JADX INFO: renamed from: d */
    public boolean f5357d;

    /* JADX INFO: renamed from: e */
    public Animator f5358e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.BoostContent$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC0266a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0266a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BoostContent boostContent = BoostContent.this;
            boostContent.f5358e = bt0.l(boostContent.f5355b, bt0.i, 0L, 200L, bt0.c, new float[]{0.0f, 1.0f});
            BoostContent.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public BoostContent(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private void m8066d() {
        this.f5356c.setText(CoreModule.m1854P().m11709e().m6929yb(getContext()));
        m8068c();
        this.f5355b.setImageResource(CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? d3c0.Hb : d3c0.Gb);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0266a());
    }

    /* JADX INFO: renamed from: b */
    public final void m8067b(View view) {
        z53.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m8068c() {
        if (xdl0.w0() <= 1280) {
            this.f5354a.getLayoutParams().height = t100.d(hmb.m1() * 260.0f);
            this.f5355b.getLayoutParams().width = t100.d(hmb.m1() * 156.0f);
            this.f5355b.getLayoutParams().height = t100.d(hmb.m1() * 225.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m8069e() {
        xdl0.M0(this.f5355b, true);
        if (NullChecker.a(this.f5358e)) {
            this.f5357d = true;
            this.f5358e.start();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m8067b(this);
        super.onFinishInflate();
        m8066d();
        if (xdl0.w0() / getResources().getDisplayMetrics().density <= 700.0f) {
            this.f5354a.getLayoutParams().height = t100.d(245.0f);
            this.f5356c.setPadding(0, 0, 0, 0);
        }
    }

    @Override // p006l.q8b0
    /* JADX INFO: renamed from: w */
    public void mo8070w(PutongFrag putongFrag) {
        m8069e();
    }

    public BoostContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
