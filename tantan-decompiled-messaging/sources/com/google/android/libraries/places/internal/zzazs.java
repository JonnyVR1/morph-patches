package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzazs {
    public static final zzayc zza = zzayc.zza("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    private final List zzb;
    private final zzaye zzc;
    private final int zzd;

    public zzazs(List list, zzaye zzayeVar) {
        zzmt.zzf(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.zzb = listUnmodifiableList;
        zzmt.zzc(zzayeVar, "attrs");
        this.zzc = zzayeVar;
        this.zzd = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzazs)) {
            return false;
        }
        zzazs zzazsVar = (zzazs) obj;
        if (this.zzb.size() != zzazsVar.zzb.size()) {
            return false;
        }
        for (int i = 0; i < this.zzb.size(); i++) {
            if (!((SocketAddress) this.zzb.get(i)).equals(zzazsVar.zzb.get(i))) {
                return false;
            }
        }
        return this.zzc.equals(zzazsVar.zzc);
    }

    public final int hashCode() {
        return this.zzd;
    }

    public final String toString() {
        zzaye zzayeVar = this.zzc;
        return "[" + String.valueOf(this.zzb) + "/" + zzayeVar.toString() + Constants.AES_SUFFIX;
    }

    public final zzaye zza() {
        return this.zzc;
    }

    public final List zzb() {
        return this.zzb;
    }
}
