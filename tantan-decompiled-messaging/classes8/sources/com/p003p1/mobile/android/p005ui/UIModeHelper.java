package com.p003p1.mobile.android.p005ui;

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
import androidx.appcompat.app.b;
import com.p003p1.mobile.android.app.App;
import l.tpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class UIModeHelper {

    /* JADX INFO: renamed from: a */
    public static final PorterDuff.Mode f1353a;

    /* JADX INFO: renamed from: b */
    public static final ColorFilter f1354b;

    /* JADX INFO: renamed from: c */
    public static tpd0 f1355c;

    public enum UIMode {
        DAY,
        NIGHT,
        FOLLOW_SYSTEM
    }

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        f1353a = mode;
        f1354b = new PorterDuffColorFilter(838860800, mode);
        f1355c = new tpd0("ui_mode_setting", UIMode.DAY.ordinal());
    }

    /* JADX INFO: renamed from: a */
    public static UIMode m1088a() {
        return UIMode.values()[((Integer) f1355c.get()).intValue()];
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1089b() {
        return m1088a() == UIMode.NIGHT;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m1090c(@Nullable Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return drawable.mutate();
    }

    /* JADX INFO: renamed from: d */
    public static void m1091d(Dialog dialog, boolean z) {
        if (m1095h()) {
            m1093f(dialog.getWindow(), z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1092e(View view, boolean z) {
        if (m1095h()) {
            view.setForceDarkAllowed(z);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1093f(Window window, boolean z) {
        if (m1095h()) {
            m1092e(window.getDecorView(), z);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1094g(UIMode uIMode) {
        int i;
        if (m1095h()) {
            UiModeManager uiModeManager = (UiModeManager) App.f1068e.getSystemService(UiModeManager.class);
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
            b.D(i2);
            f1355c.put(Integer.valueOf(uIMode.ordinal()));
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1095h() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
