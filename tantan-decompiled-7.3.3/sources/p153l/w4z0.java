package p153l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(28)
public class w4z0 extends o1z0 {
    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ WindowInsets m204904m(Activity activity, View view, WindowInsets windowInsets) {
        if (bxy0.m106933q().m120264i().zzm() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                grw0 grw0VarM120264i = bxy0.m106933q().m120264i();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                grw0VarM120264i.mo131899i(strConcat);
            } else {
                bxy0.m106933q().m120264i().mo131899i("");
            }
        }
        m204905n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: n */
    public static final void m204905n(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = true != z ? 2 : 1;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // p153l.ccr0
    /* JADX INFO: renamed from: i */
    public final int mo109057i(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // p153l.ccr0
    /* JADX INFO: renamed from: j */
    public final void mo109058j(final Activity activity) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168294f1)).booleanValue() && bxy0.m106933q().m120264i().zzm() == null && !activity.isInMultiWindowMode()) {
            m204905n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: l.e3z0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return w4z0.m204904m(activity, view, windowInsets);
                }
            });
        }
    }
}
