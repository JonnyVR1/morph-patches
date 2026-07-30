package com.google.android.gms.internal.ads;

import java.io.IOException;
import p149l.zax0;

/* JADX INFO: loaded from: classes6.dex */
public class zzhag extends IOException {
    private zax0 zza;
    private boolean zzb;

    public zzhag(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public static zzhaf zza() {
        return new zzhaf("Protocol message tag had invalid wire type.");
    }

    public static zzhag zzb() {
        return new zzhag("Protocol message end-group tag did not match expected tag.");
    }

    public static zzhag zzc() {
        return new zzhag("Protocol message contained an invalid tag (zero).");
    }

    public static zzhag zzd() {
        return new zzhag("Protocol message had invalid UTF-8.");
    }

    public static zzhag zze() {
        return new zzhag("CodedInputStream encountered a malformed varint.");
    }

    public static zzhag zzf() {
        return new zzhag("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzhag zzg() {
        return new zzhag("Failed to parse the message.");
    }

    public static zzhag zzi() {
        return new zzhag("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzhag zzj() {
        return new zzhag("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzhag zzh(zax0 zax0Var) {
        this.zza = zax0Var;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public zzhag(String str) {
        super(str);
        this.zza = null;
    }
}
