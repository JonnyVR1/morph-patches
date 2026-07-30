package tech.sud.runtime.component.p145h;

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
/* JADX INFO: loaded from: classes3.dex */
public class C22434e {

    /* JADX INFO: renamed from: a */
    private static int f207778a;

    /* JADX INFO: renamed from: tech.sud.runtime.component.h.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo221759a(int i);
    }

    /* JADX INFO: renamed from: a */
    public static void m221849a(final Context context, final Window window, final a aVar) {
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        final int[] iArr = {m221851b(context, window)};
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tech.sud.runtime.component.h.e.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int iM221851b = C22434e.m221851b(context, window);
                if (iArr[0] != iM221851b) {
                    aVar.mo221759a(iM221851b);
                    iArr[0] = iM221851b;
                }
            }
        };
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        frameLayout.setTag(-88, onGlobalLayoutListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static int m221851b(Context context, Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iAbs = Math.abs(decorView.getBottom() - rect.bottom);
        if (iAbs > C22431b.m221841a(context) + C22431b.m221842b(context)) {
            return iAbs - f207778a;
        }
        f207778a = iAbs;
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m221852b(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m221850a(Window window) {
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
    public static void m221847a(Context context, View view) {
        m221848a(context, view, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m221846a(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m221848a(final Context context, View view, int i) {
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
                    C22434e.m221846a(context);
                }
            }
        });
        inputMethodManager.toggleSoftInput(2, 1);
    }
}
