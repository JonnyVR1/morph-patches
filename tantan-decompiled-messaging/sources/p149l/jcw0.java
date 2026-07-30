package p149l;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes6.dex */
public final class jcw0 {

    /* JADX INFO: renamed from: a */
    public static final int f117349a = 67108864;

    /* JADX INFO: renamed from: b */
    public static final ClipData f117350b = ClipData.newIntent("", new Intent());

    /* JADX INFO: renamed from: a */
    public static PendingIntent m140993a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, 0, m140995c(intent, 201326592, 0), 201326592);
    }

    /* JADX INFO: renamed from: b */
    public static PendingIntent m140994b(Context context, int i, Intent intent, int i2, int i3) {
        return PendingIntent.getService(context, 0, m140995c(intent, i2, 0), i2);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m140995c(Intent intent, int i, int i2) {
        nfw0.m159284f((i & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        nfw0.m159284f((i & 1) == 0 || m140996d(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        nfw0.m159284f((i & 2) == 0 || m140996d(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        nfw0.m159284f((i & 4) == 0 || m140996d(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        nfw0.m159284f((i & 128) == 0 || m140996d(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        nfw0.m159284f(intent.getComponent() != null, "Must set component on Intent.");
        if (m140996d(0, 1)) {
            nfw0.m159284f(!m140996d(i, AudioRoutingController.DEVICE_OUT_USB_HEADSET), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            nfw0.m159284f(m140996d(i, AudioRoutingController.DEVICE_OUT_USB_HEADSET), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!m140996d(i, AudioRoutingController.DEVICE_OUT_USB_HEADSET)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!m140996d(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!m140996d(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!m140996d(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!m140996d(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f117350b);
            }
        }
        return intent2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m140996d(int i, int i2) {
        return (i & i2) == i2;
    }
}
