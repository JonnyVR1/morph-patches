package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2360o0;
import java.io.IOException;
import java.util.List;
import p153l.kux0;
import p153l.m9y0;
import p153l.ocy0;
import p153l.zfx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2360o0<MessageType extends AbstractC2360o0<MessageType, BuilderType>, BuilderType extends kux0<MessageType, BuilderType>> implements m9y0 {
    protected int zza = 0;

    /* JADX INFO: renamed from: d */
    public static <T> void m14303d(Iterable<T> iterable, List<? super T> list) {
        kux0.m151623j(iterable, list);
    }

    @Override // p153l.m9y0
    /* JADX INFO: renamed from: O */
    public final zzik mo14304O() {
        try {
            C2364q0 c2364q0Zzc = zzik.zzc(mo14408P());
            mo14411S(c2364q0Zzc.m14331b());
            return c2364q0Zzc.m14330a();
        } catch (IOException e) {
            zfx0.m219588a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int mo14305c(ocy0 ocy0Var) {
        int iMo14306e = mo14306e();
        if (iMo14306e != -1) {
            return iMo14306e;
        }
        int iZza = ocy0Var.zza(this);
        mo14307f(iZza);
        return iZza;
    }

    /* JADX INFO: renamed from: e */
    public int mo14306e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: f */
    public void mo14307f(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m14308g() {
        try {
            byte[] bArr = new byte[mo14408P()];
            zzjc zzjcVarM14694H = zzjc.m14694H(bArr);
            mo14411S(zzjcVarM14694H);
            zzjcVarM14694H.m14735I();
            return bArr;
        } catch (IOException e) {
            zfx0.m219588a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }
}
