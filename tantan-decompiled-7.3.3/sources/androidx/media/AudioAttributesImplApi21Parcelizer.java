package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2385a = (AudioAttributes) versionedParcel.m4135r(audioAttributesImplApi21.f2385a, 1);
        audioAttributesImplApi21.f2386b = versionedParcel.m4133p(audioAttributesImplApi21.f2386b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.m4141x(false, false);
        versionedParcel.m4111H(audioAttributesImplApi21.f2385a, 1);
        versionedParcel.m4109F(audioAttributesImplApi21.f2386b, 2);
    }
}
