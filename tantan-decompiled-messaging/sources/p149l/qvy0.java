package p149l;

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
public class qvy0 extends isy0 {
    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ WindowInsets m176734m(Activity activity, View view, WindowInsets windowInsets) {
        if (vny0.m199079q().m212279i().zzm() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                aiw0 aiw0VarM212279i = vny0.m199079q().m212279i();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                aiw0VarM212279i.mo96950i(strConcat);
            } else {
                vny0.m199079q().m212279i().mo96950i("");
            }
        }
        m176735n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: n */
    public static final void m176735n(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = true != z ? 2 : 1;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // p149l.w2r0
    /* JADX INFO: renamed from: i */
    public final int mo176736i(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // p149l.w2r0
    /* JADX INFO: renamed from: j */
    public final void mo176737j(final Activity activity) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132223f1)).booleanValue() && vny0.m199079q().m212279i().zzm() == null && !activity.isInMultiWindowMode()) {
            m176735n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: l.yty0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return qvy0.m176734m(activity, view, windowInsets);
                }
            });
        }
    }
}
