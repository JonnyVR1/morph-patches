package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkMagnetCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVisibleEffectPlayer f52497a;

    /* JADX INFO: renamed from: b */
    public AutoVisibleEffectPlayer f52498b;

    /* JADX INFO: renamed from: c */
    public AutoVisibleEffectPlayer f52499c;

    /* JADX INFO: renamed from: d */
    public boolean f52500d;

    /* JADX INFO: renamed from: e */
    public boolean f52501e;

    /* JADX INFO: renamed from: f */
    public boolean f52502f;

    public LivePkMagnetCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m77326a(boolean z) {
        bnl0.m105524M(this.f52497a, z);
        if (!z) {
            this.f52501e = false;
            this.f52497a.m69687n();
        } else {
            if (this.f52501e) {
                return;
            }
            this.f52501e = true;
            this.f52497a.m69683j("https://auto.tancdn.com/v1/raw/54e8aeb4-7273-42e8-835b-760674ef213314.so", -1);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m77327b(boolean z) {
        bnl0.m105524M(this.f52499c, z);
        if (!z) {
            this.f52500d = false;
            this.f52499c.m69687n();
        } else {
            if (this.f52500d) {
                return;
            }
            this.f52500d = true;
            this.f52499c.m69683j("https://auto.tancdn.com/v1/raw/42b34630-f2e8-4932-bb33-20e140dcacc514.so", -1);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m77328c(boolean z) {
        bnl0.m105524M(this.f52498b, z);
        if (!z) {
            this.f52502f = false;
            this.f52498b.m69687n();
        } else {
            if (this.f52502f) {
                return;
            }
            this.f52502f = true;
            this.f52498b.m69683j("https://auto.tancdn.com/v1/raw/7b84354a-5216-4332-83b5-680d2660dcf014.so", -1);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m77329d() {
        m77330e(this.f52498b);
        m77330e(this.f52497a);
        m77330e(this.f52499c);
        this.f52502f = false;
        this.f52501e = false;
        this.f52500d = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m77330e(AutoVisibleEffectPlayer autoVisibleEffectPlayer) {
        autoVisibleEffectPlayer.m69687n();
        bnl0.m105524M(autoVisibleEffectPlayer, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52497a = new AutoVisibleEffectPlayer(getContext());
        this.f52498b = new AutoVisibleEffectPlayer(getContext());
        this.f52499c = new AutoVisibleEffectPlayer(getContext());
        int i = qa00.f156333t;
        int i2 = qa00.f156329p;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        addView(this.f52497a, layoutParams);
        addView(this.f52498b, layoutParams);
        addView(this.f52499c, new FrameLayout.LayoutParams(-1, i2));
    }

    public void setCursorOffset(float f) {
        this.f52497a.setTranslationX(f - qa00.f156333t);
        this.f52498b.setTranslationX(f);
    }

    public LivePkMagnetCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePkMagnetCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
