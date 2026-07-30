package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2337o0;
import java.io.IOException;
import java.util.List;
import p149l.elx0;
import p149l.g0y0;
import p149l.i3y0;
import p149l.t6x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2337o0<MessageType extends AbstractC2337o0<MessageType, BuilderType>, BuilderType extends elx0<MessageType, BuilderType>> implements g0y0 {
    protected int zza = 0;

    /* JADX INFO: renamed from: d */
    public static <T> void m14249d(Iterable<T> iterable, List<? super T> list) {
        elx0.m117157j(iterable, list);
    }

    @Override // p149l.g0y0
    /* JADX INFO: renamed from: O */
    public final zzik mo14250O() {
        try {
            C2341q0 c2341q0Zzc = zzik.zzc(mo14354P());
            mo14357S(c2341q0Zzc.m14277b());
            return c2341q0Zzc.m14276a();
        } catch (IOException e) {
            t6x0.m187393a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int mo14251c(i3y0 i3y0Var) {
        int iMo14252e = mo14252e();
        if (iMo14252e != -1) {
            return iMo14252e;
        }
        int iZza = i3y0Var.zza(this);
        mo14253f(iZza);
        return iZza;
    }

    /* JADX INFO: renamed from: e */
    public int mo14252e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: f */
    public void mo14253f(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m14254g() {
        try {
            byte[] bArr = new byte[mo14354P()];
            zzjc zzjcVarM14640H = zzjc.m14640H(bArr);
            mo14357S(zzjcVarM14640H);
            zzjcVarM14640H.m14681I();
            return bArr;
        } catch (IOException e) {
            t6x0.m187393a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }
}
