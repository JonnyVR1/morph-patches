package p153l;

import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(29)
public final class rxv0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static void m183567a(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }
}
