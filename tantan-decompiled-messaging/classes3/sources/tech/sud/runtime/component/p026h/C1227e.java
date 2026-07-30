package tech.sud.runtime.component.p026h;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: tech.sud.runtime.component.h.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1227e {

    /* JADX INFO: renamed from: a */
    private static int f11403a;

    /* JADX INFO: renamed from: tech.sud.runtime.component.h.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo10230a(int i);
    }

    /* JADX INFO: renamed from: a */
    public static void m10320a(final Context context, final Window window, final a aVar) {
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        final int[] iArr = {m10322b(context, window)};
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tech.sud.runtime.component.h.e.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int iM10322b = C1227e.m10322b(context, window);
                if (iArr[0] != iM10322b) {
                    aVar.mo10230a(iM10322b);
                    iArr[0] = iM10322b;
                }
            }
        };
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        frameLayout.setTag(-88, onGlobalLayoutListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static int m10322b(Context context, Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iAbs = Math.abs(decorView.getBottom() - rect.bottom);
        if (iAbs > C1224b.m10312a(context) + C1224b.m10313b(context)) {
            return iAbs - f11403a;
        }
        f11403a = iAbs;
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m10323b(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m10321a(Window window) {
        View viewFindViewById = window.findViewById(R.id.content);
        if (viewFindViewById == null) {
            return;
        }
        Object tag = viewFindViewById.getTag(-88);
        if (tag instanceof ViewTreeObserver.OnGlobalLayoutListener) {
            viewFindViewById.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) tag);
            viewFindViewById.setTag(-88, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10318a(Context context, View view) {
        m10319a(context, view, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m10317a(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m10319a(final Context context, View view, int i) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || view == null) {
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, i, new ResultReceiver(new Handler()) { // from class: tech.sud.runtime.component.h.e.2
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i2, Bundle bundle) {
                if (i2 == 1 || i2 == 3) {
                    C1227e.m10317a(context);
                }
            }
        });
        inputMethodManager.toggleSoftInput(2, 1);
    }
}
