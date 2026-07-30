package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2387a = versionedParcel.m4131p(audioAttributesImplBase.f2387a, 1);
        audioAttributesImplBase.f2388b = versionedParcel.m4131p(audioAttributesImplBase.f2388b, 2);
        audioAttributesImplBase.f2389c = versionedParcel.m4131p(audioAttributesImplBase.f2389c, 3);
        audioAttributesImplBase.f2390d = versionedParcel.m4131p(audioAttributesImplBase.f2390d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.m4139x(false, false);
        versionedParcel.m4107F(audioAttributesImplBase.f2387a, 1);
        versionedParcel.m4107F(audioAttributesImplBase.f2388b, 2);
        versionedParcel.m4107F(audioAttributesImplBase.f2389c, 3);
        versionedParcel.m4107F(audioAttributesImplBase.f2390d, 4);
    }
}
