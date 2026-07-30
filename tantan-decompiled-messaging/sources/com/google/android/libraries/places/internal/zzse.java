package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzse extends zzsh {
    final char[] zza;

    private zzse(zzsd zzsdVar) {
        super(zzsdVar, null);
        this.zza = new char[512];
        zzmt.zze(zzsdVar.zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzsdVar.zza(i >>> 4);
            this.zza[i | 256] = zzsdVar.zza(i & 15);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzsh, com.google.android.libraries.places.internal.zzsi
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzsg {
        if (charSequence.length() % 2 == 1) {
            throw new zzsg("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) ((this.zzb.zzb(charSequence.charAt(i)) << 4) | this.zzb.zzb(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // com.google.android.libraries.places.internal.zzsh
    public final zzsi zzb(zzsd zzsdVar, Character ch) {
        return new zzse(zzsdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzsh, com.google.android.libraries.places.internal.zzsi
    public final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzmt.zzn(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            appendable.append(this.zza[i4]);
            appendable.append(this.zza[i4 | 256]);
        }
    }

    public zzse(String str, String str2) {
        this(new zzsd("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
