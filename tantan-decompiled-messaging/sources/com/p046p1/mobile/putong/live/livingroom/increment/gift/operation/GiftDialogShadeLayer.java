package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.bt0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogShadeLayer extends View {

    /* JADX INFO: renamed from: a */
    public Animator f49758a;

    /* JADX INFO: renamed from: b */
    public Animator f49759b;

    /* JADX INFO: renamed from: c */
    public boolean f49760c;

    public GiftDialogShadeLayer(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public void m73687c(boolean z) {
        if (this.f49760c) {
            if (z) {
                if (this.f49759b == null) {
                    Animator animatorM103741n = bt0.m103741n(this, View.ALPHA, 1.0f, 0.0f);
                    this.f49759b = animatorM103741n;
                    animatorM103741n.setDuration(180L);
                    bt0.m103733f(this.f49759b, new Runnable() { // from class: l.uoj
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f177511a.m73688d();
                        }
                    });
                }
                this.f49759b.start();
            } else {
                xdl0.m208344M(this, false);
            }
            this.f49760c = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m73688d() {
        setAlpha(0.0f);
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m73689e() {
        setAlpha(0.0f);
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: f */
    public void m73690f() {
        if (this.f49760c) {
            return;
        }
        if (this.f49758a == null) {
            Animator animatorM103741n = bt0.m103741n(this, View.ALPHA, 0.0f, 1.0f);
            this.f49758a = animatorM103741n;
            animatorM103741n.setDuration(300L);
            bt0.m103749v(this.f49758a, new Runnable() { // from class: l.voj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182388a.m73689e();
                }
            });
        }
        this.f49758a.start();
        this.f49760c = true;
    }

    public GiftDialogShadeLayer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftDialogShadeLayer(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
