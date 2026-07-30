package com.p051p1.mobile.android.statistic;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.tantanapp.common.utils.CrashHelper;
import p153l.af60;
import p153l.c33;
import p153l.x20;

/* JADX INFO: loaded from: classes8.dex */
public class AutoSpeedFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f16359a;

    /* JADX INFO: renamed from: b */
    public boolean f16360b;

    public AutoSpeedFrameLayout(@NonNull Context context) {
        super(context);
        this.f16359a = false;
        this.f16360b = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21812a() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f16359a) {
            return;
        }
        af60.m97310e().m97321l(this);
        this.f16359a = true;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            c33.m107766b(this, th, new x20() { // from class: l.rj1
                @Override // p153l.x20
                public final void call() {
                    AutoSpeedFrameLayout.m21812a();
                }
            });
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f16360b) {
            af60.m97310e().m97317h(this);
            this.f16360b = true;
        }
        super.onMeasure(i, i2);
    }

    public AutoSpeedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16359a = false;
        this.f16360b = false;
    }

    public AutoSpeedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16359a = false;
        this.f16360b = false;
    }
}
