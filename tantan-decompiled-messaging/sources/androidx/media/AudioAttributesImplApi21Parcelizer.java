package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2385a = (AudioAttributes) versionedParcel.m4133r(audioAttributesImplApi21.f2385a, 1);
        audioAttributesImplApi21.f2386b = versionedParcel.m4131p(audioAttributesImplApi21.f2386b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.m4139x(false, false);
        versionedParcel.m4109H(audioAttributesImplApi21.f2385a, 1);
        versionedParcel.m4107F(audioAttributesImplApi21.f2386b, 2);
    }
}
