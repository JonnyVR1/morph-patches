package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p149l.ctq0;
import p149l.o0l0;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements o0l0 {

    /* JADX INFO: renamed from: b */
    public static final SparseIntArray f2381b;

    /* JADX INFO: renamed from: c */
    public static boolean f2382c;

    /* JADX INFO: renamed from: d */
    public static final int[] f2383d;

    /* JADX INFO: renamed from: a */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImpl f2384a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2381b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f2383d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f2384a = audioAttributesImpl;
    }

    /* JADX INFO: renamed from: a */
    public static int m3124a(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z) {
                    return 3;
                }
                ctq0.m108694a("Unknown usage value ", i2, " in audio attributes");
                return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m3125b(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static AudioAttributesCompat m3126c(@NonNull Object obj) {
        if (f2382c) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 26 ? new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj)) : new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f2384a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f2384a;
        if (audioAttributesImpl == null) {
            return audioAttributesImpl2 == null;
        }
        return audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int hashCode() {
        return this.f2384a.hashCode();
    }

    public String toString() {
        return this.f2384a.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesCompat() {
    }
}
