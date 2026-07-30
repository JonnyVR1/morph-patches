package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkMagnetCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVisibleEffectPlayer f51649a;

    /* JADX INFO: renamed from: b */
    public AutoVisibleEffectPlayer f51650b;

    /* JADX INFO: renamed from: c */
    public AutoVisibleEffectPlayer f51651c;

    /* JADX INFO: renamed from: d */
    public boolean f51652d;

    /* JADX INFO: renamed from: e */
    public boolean f51653e;

    /* JADX INFO: renamed from: f */
    public boolean f51654f;

    public LivePkMagnetCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m76143a(boolean z) {
        xdl0.m208344M(this.f51649a, z);
        if (!z) {
            this.f51653e = false;
            this.f51649a.m68504n();
        } else {
            if (this.f51653e) {
                return;
            }
            this.f51653e = true;
            this.f51649a.m68500j("https://auto.tancdn.com/v1/raw/54e8aeb4-7273-42e8-835b-760674ef213314.so", -1);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76144b(boolean z) {
        xdl0.m208344M(this.f51651c, z);
        if (!z) {
            this.f51652d = false;
            this.f51651c.m68504n();
        } else {
            if (this.f51652d) {
                return;
            }
            this.f51652d = true;
            this.f51651c.m68500j("https://auto.tancdn.com/v1/raw/42b34630-f2e8-4932-bb33-20e140dcacc514.so", -1);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m76145c(boolean z) {
        xdl0.m208344M(this.f51650b, z);
        if (!z) {
            this.f51654f = false;
            this.f51650b.m68504n();
        } else {
            if (this.f51654f) {
                return;
            }
            this.f51654f = true;
            this.f51650b.m68500j("https://auto.tancdn.com/v1/raw/7b84354a-5216-4332-83b5-680d2660dcf014.so", -1);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m76146d() {
        m76147e(this.f51650b);
        m76147e(this.f51649a);
        m76147e(this.f51651c);
        this.f51654f = false;
        this.f51653e = false;
        this.f51652d = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m76147e(AutoVisibleEffectPlayer autoVisibleEffectPlayer) {
        autoVisibleEffectPlayer.m68504n();
        xdl0.m208344M(autoVisibleEffectPlayer, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f51649a = new AutoVisibleEffectPlayer(getContext());
        this.f51650b = new AutoVisibleEffectPlayer(getContext());
        this.f51651c = new AutoVisibleEffectPlayer(getContext());
        int i = t100.f167271t;
        int i2 = t100.f167267p;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        addView(this.f51649a, layoutParams);
        addView(this.f51650b, layoutParams);
        addView(this.f51651c, new FrameLayout.LayoutParams(-1, i2));
    }

    public void setCursorOffset(float f) {
        this.f51649a.setTranslationX(f - t100.f167271t);
        this.f51650b.setTranslationX(f);
    }

    public LivePkMagnetCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePkMagnetCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
