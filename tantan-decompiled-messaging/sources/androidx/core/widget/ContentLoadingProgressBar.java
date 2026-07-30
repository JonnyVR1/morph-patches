package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: a */
    public long f1467a;

    /* JADX INFO: renamed from: b */
    public boolean f1468b;

    /* JADX INFO: renamed from: c */
    public boolean f1469c;

    /* JADX INFO: renamed from: d */
    public boolean f1470d;

    /* JADX INFO: renamed from: e */
    public final Runnable f1471e;

    /* JADX INFO: renamed from: f */
    public final Runnable f1472f;

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1467a = -1L;
        this.f1468b = false;
        this.f1469c = false;
        this.f1470d = false;
        this.f1471e = new Runnable() { // from class: l.v06
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.m1335b(this.f179071a);
            }
        };
        this.f1472f = new Runnable() { // from class: l.w06
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.m1334a(this.f183713a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1334a(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f1469c = false;
        if (contentLoadingProgressBar.f1470d) {
            return;
        }
        contentLoadingProgressBar.f1467a = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1335b(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f1468b = false;
        contentLoadingProgressBar.f1467a = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    /* JADX INFO: renamed from: c */
    public final void m1336c() {
        removeCallbacks(this.f1471e);
        removeCallbacks(this.f1472f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1336c();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1336c();
    }

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }
}
