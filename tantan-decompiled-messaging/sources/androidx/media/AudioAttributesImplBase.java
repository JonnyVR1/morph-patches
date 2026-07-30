package androidx.media;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f2387a = 0;

    /* JADX INFO: renamed from: b */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f2388b = 0;

    /* JADX INFO: renamed from: c */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f2389c = 0;

    /* JADX INFO: renamed from: d */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f2390d = -1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplBase() {
    }

    /* JADX INFO: renamed from: a */
    public int m3127a() {
        return this.f2388b;
    }

    /* JADX INFO: renamed from: b */
    public int m3128b() {
        int i = this.f2389c;
        int iM3129c = m3129c();
        if (iM3129c == 6) {
            i |= 4;
        } else if (iM3129c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* JADX INFO: renamed from: c */
    public int m3129c() {
        int i = this.f2390d;
        return i != -1 ? i : AudioAttributesCompat.m3124a(false, this.f2389c, this.f2387a);
    }

    /* JADX INFO: renamed from: d */
    public int m3130d() {
        return this.f2387a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f2388b == audioAttributesImplBase.m3127a() && this.f2389c == audioAttributesImplBase.m3128b() && this.f2387a == audioAttributesImplBase.m3130d() && this.f2390d == audioAttributesImplBase.f2390d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2388b), Integer.valueOf(this.f2389c), Integer.valueOf(this.f2387a), Integer.valueOf(this.f2390d)});
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2390d != -1) {
            sb.append(" stream=");
            sb.append(this.f2390d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m3125b(this.f2387a));
        sb.append(" content=");
        sb.append(this.f2388b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2389c).toUpperCase());
        return sb.toString();
    }
}
