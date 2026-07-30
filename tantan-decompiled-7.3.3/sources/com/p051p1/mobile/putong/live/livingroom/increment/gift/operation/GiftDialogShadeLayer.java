package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.gt0;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogShadeLayer extends View {

    /* JADX INFO: renamed from: a */
    public Animator f50606a;

    /* JADX INFO: renamed from: b */
    public Animator f50607b;

    /* JADX INFO: renamed from: c */
    public boolean f50608c;

    public GiftDialogShadeLayer(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public void m74870c(boolean z) {
        if (this.f50608c) {
            if (z) {
                if (this.f50607b == null) {
                    Animator animatorM132168n = gt0.m132168n(this, View.ALPHA, 1.0f, 0.0f);
                    this.f50607b = animatorM132168n;
                    animatorM132168n.setDuration(180L);
                    gt0.m132160f(this.f50607b, new Runnable() { // from class: l.krj
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f128479a.m74871d();
                        }
                    });
                }
                this.f50607b.start();
            } else {
                bnl0.m105524M(this, false);
            }
            this.f50608c = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m74871d() {
        setAlpha(0.0f);
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m74872e() {
        setAlpha(0.0f);
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: f */
    public void m74873f() {
        if (this.f50608c) {
            return;
        }
        if (this.f50606a == null) {
            Animator animatorM132168n = gt0.m132168n(this, View.ALPHA, 0.0f, 1.0f);
            this.f50606a = animatorM132168n;
            animatorM132168n.setDuration(300L);
            gt0.m132176v(this.f50606a, new Runnable() { // from class: l.lrj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133333a.m74872e();
                }
            });
        }
        this.f50606a.start();
        this.f50608c = true;
    }

    public GiftDialogShadeLayer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftDialogShadeLayer(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
