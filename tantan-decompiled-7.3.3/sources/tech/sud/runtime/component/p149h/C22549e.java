package tech.sud.runtime.component.p149h;

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
public class C22549e {

    /* JADX INFO: renamed from: a */
    private static int f208700a;

    /* JADX INFO: renamed from: tech.sud.runtime.component.h.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo223005a(int i);
    }

    /* JADX INFO: renamed from: a */
    public static void m223095a(final Context context, final Window window, final a aVar) {
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        final int[] iArr = {m223097b(context, window)};
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tech.sud.runtime.component.h.e.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int iM223097b = C22549e.m223097b(context, window);
                if (iArr[0] != iM223097b) {
                    aVar.mo223005a(iM223097b);
                    iArr[0] = iM223097b;
                }
            }
        };
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        frameLayout.setTag(-88, onGlobalLayoutListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static int m223097b(Context context, Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iAbs = Math.abs(decorView.getBottom() - rect.bottom);
        if (iAbs > C22546b.m223087a(context) + C22546b.m223088b(context)) {
            return iAbs - f208700a;
        }
        f208700a = iAbs;
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m223098b(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m223096a(Window window) {
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
    public static void m223093a(Context context, View view) {
        m223094a(context, view, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m223092a(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m223094a(final Context context, View view, int i) {
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
                    C22549e.m223092a(context);
                }
            }
        });
        inputMethodManager.toggleSoftInput(2, 1);
    }
}
