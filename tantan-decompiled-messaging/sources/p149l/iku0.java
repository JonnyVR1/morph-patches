package p149l;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: loaded from: classes6.dex */
public final class iku0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Context f113727a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public PopupWindow f113728b;

    /* JADX INFO: renamed from: a */
    public final void m136898a(Context context, View view) {
        PopupWindow popupWindow;
        if (!PlatformVersion.isAtLeastKitKat() || PlatformVersion.isAtLeastLollipop()) {
            return;
        }
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            popupWindow = null;
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            x2t0.m206864b("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
                popupWindow = null;
            }
        }
        this.f113728b = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.f113727a = context;
    }

    /* JADX INFO: renamed from: b */
    public final void m136899b() {
        Context context = this.f113727a;
        if (context == null || this.f113728b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f113728b.isShowing()) {
            this.f113728b.dismiss();
        }
        this.f113727a = null;
        this.f113728b = null;
    }
}
