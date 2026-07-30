package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.AbstractC2421y;
import java.io.IOException;
import java.util.List;
import p149l.oox0;
import p149l.smx0;
import p149l.t6x0;
import p149l.wbw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2421y<MessageType extends AbstractC2421y<MessageType, BuilderType>, BuilderType extends wbw0<MessageType, BuilderType>> implements smx0 {
    protected int zza = 0;

    /* JADX INFO: renamed from: c */
    public static void m14964c(Iterable iterable, List list) {
        wbw0.m202587d(iterable, list);
    }

    /* JADX INFO: renamed from: b */
    public int mo14767b(oox0 oox0Var) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m14965d() {
        try {
            int iZzk = zzk();
            byte[] bArr = new byte[iZzk];
            C2423z c2423z = new C2423z(bArr, 0, iZzk);
            mo14766a(c2423z);
            c2423z.m14722b();
            return bArr;
        } catch (IOException e) {
            t6x0.m187393a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    @Override // p149l.smx0
    public final zzgk zzf() {
        try {
            int iZzk = zzk();
            zzgk zzgkVar = zzgk.zzb;
            byte[] bArr = new byte[iZzk];
            C2423z c2423z = new C2423z(bArr, 0, iZzk);
            mo14766a(c2423z);
            c2423z.m14722b();
            return new zzgi(bArr);
        } catch (IOException e) {
            t6x0.m187393a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }
}
