package com.p046p1.mobile.android.p048ui;

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
import androidx.appcompat.app.AbstractC0075b;
import com.p046p1.mobile.android.app.App;
import p149l.tpd0;

/* JADX INFO: loaded from: classes8.dex */
public class UIModeHelper {

    /* JADX INFO: renamed from: a */
    public static final PorterDuff.Mode f15654a;

    /* JADX INFO: renamed from: b */
    public static final ColorFilter f15655b;

    /* JADX INFO: renamed from: c */
    public static tpd0 f15656c;

    public enum UIMode {
        DAY,
        NIGHT,
        FOLLOW_SYSTEM
    }

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        f15654a = mode;
        f15655b = new PorterDuffColorFilter(838860800, mode);
        f15656c = new tpd0("ui_mode_setting", UIMode.DAY.ordinal());
    }

    /* JADX INFO: renamed from: a */
    public static UIMode m20817a() {
        return UIMode.values()[f15656c.get().intValue()];
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20818b() {
        return m20817a() == UIMode.NIGHT;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m20819c(@Nullable Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return drawable.mutate();
    }

    /* JADX INFO: renamed from: d */
    public static void m20820d(Dialog dialog, boolean z) {
        if (m20824h()) {
            m20822f(dialog.getWindow(), z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m20821e(View view, boolean z) {
        if (m20824h()) {
            view.setForceDarkAllowed(z);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m20822f(Window window, boolean z) {
        if (m20824h()) {
            m20821e(window.getDecorView(), z);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m20823g(UIMode uIMode) {
        int i;
        if (m20824h()) {
            UiModeManager uiModeManager = (UiModeManager) App.f15369e.getSystemService(UiModeManager.class);
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
            AbstractC0075b.m359D(i2);
            f15656c.put(Integer.valueOf(uIMode.ordinal()));
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20824h() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
