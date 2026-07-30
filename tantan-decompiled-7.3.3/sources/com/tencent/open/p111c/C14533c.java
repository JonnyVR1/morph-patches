package com.tencent.open.p111c;

import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.open.c.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14533c extends FrameLayout {
    public C14533c(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    private void m85474a(WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List boundingRects;
        if (Build.VERSION.SDK_INT < 28 || windowInsets == null || (displayCutout = windowInsets.getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null || boundingRects.isEmpty()) {
            return;
        }
        setPadding(Math.max(displayCutout.getSafeInsetLeft(), 0), Math.max(displayCutout.getSafeInsetTop(), 0), Math.max(displayCutout.getSafeInsetRight(), 0), Math.max(displayCutout.getSafeInsetBottom(), 0));
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m85474a(windowInsets);
        return super.onApplyWindowInsets(windowInsets);
    }
}
