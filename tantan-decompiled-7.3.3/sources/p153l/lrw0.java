package p153l;

import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(32)
public final class lrw0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static void m155666a(AudioAttributes.Builder builder, int i) {
        builder.setSpatializationBehavior(i);
    }
}
