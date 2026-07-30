package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.bt0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftDialogShadeLayer extends View {

    /* JADX INFO: renamed from: a */
    public Animator f5800a;

    /* JADX INFO: renamed from: b */
    public Animator f5801b;

    /* JADX INFO: renamed from: c */
    public boolean f5802c;

    public GiftDialogShadeLayer(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public void m7235c(boolean z) {
        if (this.f5802c) {
            if (z) {
                if (this.f5801b == null) {
                    Animator animatorN = bt0.n(this, View.ALPHA, new float[]{1.0f, 0.0f});
                    this.f5801b = animatorN;
                    animatorN.setDuration(180L);
                    bt0.f(this.f5801b, new Runnable() { // from class: l.uoj
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20739a.m7236d();
                        }
                    });
                }
                this.f5801b.start();
            } else {
                xdl0.M(this, false);
            }
            this.f5802c = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m7236d() {
        setAlpha(0.0f);
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7237e() {
        setAlpha(0.0f);
        xdl0.M(this, true);
    }

    /* JADX INFO: renamed from: f */
    public void m7238f() {
        if (this.f5802c) {
            return;
        }
        if (this.f5800a == null) {
            Animator animatorN = bt0.n(this, View.ALPHA, new float[]{0.0f, 1.0f});
            this.f5800a = animatorN;
            animatorN.setDuration(300L);
            bt0.v(this.f5800a, new Runnable() { // from class: l.voj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21251a.m7237e();
                }
            });
        }
        this.f5800a.start();
        this.f5802c = true;
    }

    public GiftDialogShadeLayer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftDialogShadeLayer(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
