package com.p003p1.mobile.android.statistic;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.tantanapp.common.utils.CrashHelper;
import l.d30;
import l.m23;
import p007l.u660;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AutoSpeedFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f1339a;

    /* JADX INFO: renamed from: b */
    public boolean f1340b;

    public AutoSpeedFrameLayout(@NonNull Context context) {
        super(context);
        this.f1339a = false;
        this.f1340b = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1084a() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f1339a) {
            return;
        }
        u660.m11183e().m11194l(this);
        this.f1339a = true;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Throwable th) {
            CrashHelper.c(th);
            m23.b(this, th, new d30() { // from class: l.kj1
                public final void call() {
                    AutoSpeedFrameLayout.m1084a();
                }
            });
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f1340b) {
            u660.m11183e().m11190h(this);
            this.f1340b = true;
        }
        super.onMeasure(i, i2);
    }

    public AutoSpeedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1339a = false;
        this.f1340b = false;
    }

    public AutoSpeedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1339a = false;
        this.f1340b = false;
    }
}
