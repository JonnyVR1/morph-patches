package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class zzkb extends IOException {
    public zzkb(String str) {
        super(str);
    }

    public static zzke zza() {
        return new zzke("Protocol message tag had invalid wire type.");
    }

    public static zzkb zzb() {
        return new zzkb("Protocol message end-group tag did not match expected tag.");
    }

    public static zzkb zzc() {
        return new zzkb("Protocol message contained an invalid tag (zero).");
    }

    public static zzkb zzd() {
        return new zzkb("Protocol message had invalid UTF-8.");
    }

    public static zzkb zze() {
        return new zzkb("CodedInputStream encountered a malformed varint.");
    }

    public static zzkb zzf() {
        return new zzkb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzkb zzg() {
        return new zzkb("Failed to parse the message.");
    }

    public static zzkb zzh() {
        return new zzkb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static zzkb zzi() {
        return new zzkb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
