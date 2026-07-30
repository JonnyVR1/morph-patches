package com.p051p1.mobile.android.p053ui;

import android.app.Dialog;
import android.app.UiModeManager;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AbstractC0076b;
import com.p051p1.mobile.android.app.App;
import p153l.vxd0;

/* JADX INFO: loaded from: classes8.dex */
public class UIModeHelper {

    /* JADX INFO: renamed from: a */
    public static final PorterDuff.Mode f16373a;

    /* JADX INFO: renamed from: b */
    public static final ColorFilter f16374b;

    /* JADX INFO: renamed from: c */
    public static vxd0 f16375c;

    public enum UIMode {
        DAY,
        NIGHT,
        FOLLOW_SYSTEM
    }

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        f16373a = mode;
        f16374b = new PorterDuffColorFilter(838860800, mode);
        f16375c = new vxd0("ui_mode_setting", UIMode.DAY.ordinal());
    }

    /* JADX INFO: renamed from: a */
    public static UIMode m21816a() {
        return UIMode.values()[f16375c.get().intValue()];
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21817b() {
        return m21816a() == UIMode.NIGHT;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m21818c(@Nullable Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return drawable.mutate();
    }

    /* JADX INFO: renamed from: d */
    public static void m21819d(Dialog dialog, boolean z) {
        if (m21823h()) {
            m21821f(dialog.getWindow(), z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m21820e(View view, boolean z) {
        if (m21823h()) {
            view.setForceDarkAllowed(z);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m21821f(Window window, boolean z) {
        if (m21823h()) {
            m21820e(window.getDecorView(), z);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m21822g(UIMode uIMode) {
        int i;
        if (m21823h()) {
            UiModeManager uiModeManager = (UiModeManager) App.f16088e.getSystemService(UiModeManager.class);
            UIMode uIMode2 = UIMode.NIGHT;
            int i2 = 1;
            if (uIMode == uIMode2) {
                i = 2;
            } else {
                i = uIMode == UIMode.DAY ? 1 : 0;
            }
            uiModeManager.setApplicationNightMode(i);
            if (uIMode == uIMode2) {
                i2 = 2;
            } else if (uIMode != UIMode.DAY) {
                i2 = -1;
            }
            AbstractC0076b.m360D(i2);
            f16375c.put(Integer.valueOf(uIMode.ordinal()));
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m21823h() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
