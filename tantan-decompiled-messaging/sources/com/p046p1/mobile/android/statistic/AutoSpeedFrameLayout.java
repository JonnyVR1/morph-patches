package com.p046p1.mobile.android.statistic;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.tantanapp.common.utils.CrashHelper;
import p149l.d30;
import p149l.m23;
import p149l.u660;

/* JADX INFO: loaded from: classes8.dex */
public class AutoSpeedFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f15640a;

    /* JADX INFO: renamed from: b */
    public boolean f15641b;

    public AutoSpeedFrameLayout(@NonNull Context context) {
        super(context);
        this.f15640a = false;
        this.f15641b = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20813a() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f15640a) {
            return;
        }
        u660.m191956e().m191967l(this);
        this.f15640a = true;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            m23.m152650b(this, th, new d30() { // from class: l.kj1
                @Override // p149l.d30
                public final void call() {
                    AutoSpeedFrameLayout.m20813a();
                }
            });
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f15641b) {
            u660.m191956e().m191963h(this);
            this.f15641b = true;
        }
        super.onMeasure(i, i2);
    }

    public AutoSpeedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15640a = false;
        this.f15641b = false;
    }

    public AutoSpeedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15640a = false;
        this.f15641b = false;
    }
}
