package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.AbstractC2444y;
import java.io.IOException;
import java.util.List;
import p153l.clw0;
import p153l.uxx0;
import p153l.yvx0;
import p153l.zfx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2444y<MessageType extends AbstractC2444y<MessageType, BuilderType>, BuilderType extends clw0<MessageType, BuilderType>> implements yvx0 {
    protected int zza = 0;

    /* JADX INFO: renamed from: c */
    public static void m15018c(Iterable iterable, List list) {
        clw0.m110707d(iterable, list);
    }

    /* JADX INFO: renamed from: b */
    public int mo14821b(uxx0 uxx0Var) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m15019d() {
        try {
            int iZzk = zzk();
            byte[] bArr = new byte[iZzk];
            C2446z c2446z = new C2446z(bArr, 0, iZzk);
            mo14820a(c2446z);
            c2446z.m14776b();
            return bArr;
        } catch (IOException e) {
            zfx0.m219588a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    @Override // p153l.yvx0
    public final zzgk zzf() {
        try {
            int iZzk = zzk();
            zzgk zzgkVar = zzgk.zzb;
            byte[] bArr = new byte[iZzk];
            C2446z c2446z = new C2446z(bArr, 0, iZzk);
            mo14820a(c2446z);
            c2446z.m14776b();
            return new zzgi(bArr);
        } catch (IOException e) {
            zfx0.m219588a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }
}
