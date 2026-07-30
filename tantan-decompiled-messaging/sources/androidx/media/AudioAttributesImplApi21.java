package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributes f2385a;

    /* JADX INFO: renamed from: b */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f2386b;

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f2385a = audioAttributes;
        this.f2386b = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2385a.equals(((AudioAttributesImplApi21) obj).f2385a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2385a.hashCode();
    }

    @NonNull
    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2385a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplApi21() {
        this.f2386b = -1;
    }
}
