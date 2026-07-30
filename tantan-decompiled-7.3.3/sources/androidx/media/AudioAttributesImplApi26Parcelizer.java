package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f2385a = (AudioAttributes) versionedParcel.m4135r(audioAttributesImplApi26.f2385a, 1);
        audioAttributesImplApi26.f2386b = versionedParcel.m4133p(audioAttributesImplApi26.f2386b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.m4141x(false, false);
        versionedParcel.m4111H(audioAttributesImplApi26.f2385a, 1);
        versionedParcel.m4109F(audioAttributesImplApi26.f2386b, 2);
    }
}
