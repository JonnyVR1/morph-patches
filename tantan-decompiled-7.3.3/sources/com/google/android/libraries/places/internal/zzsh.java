package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
class zzsh extends zzsi {
    final zzsd zzb;
    final Character zzc;

    public zzsh(zzsd zzsdVar, Character ch) {
        this.zzb = zzsdVar;
        boolean z = true;
        if (ch != null && zzsdVar.zzd('=')) {
            z = false;
        }
        zzmt.zzj(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzsh) {
            zzsh zzshVar = (zzsh) obj;
            if (this.zzb.equals(zzshVar.zzb) && Objects.equals(this.zzc, zzshVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ Objects.hashCode(this.zzc);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzsi
    public int zza(byte[] bArr, CharSequence charSequence) throws zzsg {
        zzsd zzsdVar;
        CharSequence charSequenceZzg = zzg(charSequence);
        if (!this.zzb.zzc(charSequenceZzg.length())) {
            throw new zzsg("Invalid input length " + charSequenceZzg.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZzg.length()) {
            long jZzb = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                zzsdVar = this.zzb;
                if (i3 >= zzsdVar.zzc) {
                    break;
                }
                jZzb <<= zzsdVar.zzb;
                if (i + i3 < charSequenceZzg.length()) {
                    jZzb |= (long) this.zzb.zzb(charSequenceZzg.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = zzsdVar.zzd;
            int i6 = i4 * zzsdVar.zzb;
            int i7 = (i5 - 1) * 8;
            while (i7 >= (i5 * 8) - i6) {
                bArr[i2] = (byte) ((jZzb >>> i7) & 255);
                i7 -= 8;
                i2++;
            }
            i += this.zzb.zzc;
        }
        return i2;
    }

    public zzsi zzb(zzsd zzsdVar, Character ch) {
        return new zzsh(zzsdVar, null);
    }

    @Override // com.google.android.libraries.places.internal.zzsi
    public void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzmt.zzn(0, i2, bArr.length);
        while (i3 < i2) {
            zzh(appendable, bArr, i3, Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzsi
    public final int zzd(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.libraries.places.internal.zzsi
    public final int zze(int i) {
        zzsd zzsdVar = this.zzb;
        return zzsdVar.zzc * zzajl.zza(i, zzsdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.libraries.places.internal.zzsi
    public final zzsi zzf() {
        return this.zzc == null ? this : zzb(this.zzb, null);
    }

    @Override // com.google.android.libraries.places.internal.zzsi
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzh(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzmt.zzn(i, i + i2, bArr.length);
        int i3 = 0;
        zzmt.zze(i2 <= this.zzb.zzd);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = (i2 + 1) * 8;
        zzsd zzsdVar = this.zzb;
        while (i3 < i2 * 8) {
            long j2 = j >>> ((i5 - zzsdVar.zzb) - i3);
            zzsd zzsdVar2 = this.zzb;
            appendable.append(zzsdVar2.zza(((int) j2) & zzsdVar2.zza));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i3 += this.zzb.zzb;
            }
        }
    }

    public zzsh(String str, String str2, Character ch) {
        this(new zzsd(str, str2.toCharArray()), ch);
    }
}
