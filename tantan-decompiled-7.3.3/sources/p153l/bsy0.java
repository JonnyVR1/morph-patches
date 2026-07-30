package p153l;

import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(23)
public final class bsy0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static void m106317a(AudioTrack audioTrack, @Nullable dsy0 dsy0Var) {
        audioTrack.setPreferredDevice(dsy0Var == null ? null : dsy0Var.f90529a);
    }
}
