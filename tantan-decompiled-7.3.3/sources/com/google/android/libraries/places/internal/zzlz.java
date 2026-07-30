package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzlz extends zzlx {
    static final int zza = Integer.numberOfLeadingZeros(31);
    static final zzma zzb = new zzlz();

    public zzlz() {
        super("CharMatcher.whitespace()");
    }

    @Override // com.google.android.libraries.places.internal.zzma
    public final boolean zza(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> zza) == c;
    }
}
