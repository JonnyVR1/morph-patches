package p153l;

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
public final class otu0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Context f149010a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public PopupWindow f149011b;

    /* JADX INFO: renamed from: a */
    public final void m169182a(Context context, View view) {
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
            dct0.m115293b("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
                popupWindow = null;
            }
        }
        this.f149011b = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.f149010a = context;
    }

    /* JADX INFO: renamed from: b */
    public final void m169183b() {
        Context context = this.f149010a;
        if (context == null || this.f149011b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f149011b.isShowing()) {
            this.f149011b.dismiss();
        }
        this.f149010a = null;
        this.f149011b = null;
    }
}
