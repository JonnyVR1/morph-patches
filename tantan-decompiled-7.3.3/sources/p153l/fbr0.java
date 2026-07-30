package p153l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(26)
public final class fbr0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static boolean m124925a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
