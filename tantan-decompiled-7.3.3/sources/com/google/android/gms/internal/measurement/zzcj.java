package com.google.android.gms.internal.measurement;

import p153l.w2y0;
import p153l.wg3;

/* JADX INFO: loaded from: classes6.dex */
public enum zzcj implements w2y0 {
    UNSPECIFIED_TYPE(0),
    RAW_FILE_IO_TYPE(1),
    MOBSTORE_TYPE(2),
    SQLITE_OPEN_HELPER_TYPE(3),
    LEVEL_DB_TYPE(5),
    ROOM_TYPE(6),
    SHARED_PREFS_TYPE(7),
    PROTO_DATA_STORE_TYPE(8),
    UNRECOGNIZED(-1);

    private final int zzk;

    zzcj(int i) {
        this.zzk = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzcj.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    @Override // p153l.w2y0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzk;
        }
        wg3.m206174a("Can't get the number of an unknown enum value.");
        return 0;
    }
}
