package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2158h5;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p149l.aax0;
import p149l.dax0;
import p149l.gbx0;
import p149l.jfd0;
import p149l.obx0;
import p149l.s6x0;
import p149l.t6x0;
import p149l.zax0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2158h5<MessageType extends AbstractC2158h5<MessageType, BuilderType>, BuilderType extends s6x0<MessageType, BuilderType>> implements zax0 {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static void m12740f(Iterable iterable, List list) {
        Charset charset = aax0.f68607a;
        iterable.getClass();
        if (iterable instanceof dax0) {
            List listZzh = ((dax0) iterable).zzh();
            dax0 dax0Var = (dax0) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String str = "Element at index " + (dax0Var.size() - size) + " is null.";
                    int size2 = dax0Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            jfd0.m141176a(str);
                            return;
                        }
                        dax0Var.remove(size2);
                    }
                } else if (obj instanceof zzgyl) {
                    dax0Var.mo105952Y((zzgyl) obj);
                } else {
                    dax0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof gbx0) {
            list.addAll(iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        jfd0.m141176a(str2);
                        return;
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int mo12741b(obx0 obx0Var) {
        throw null;
    }

    @Override // p149l.zax0
    /* JADX INFO: renamed from: c */
    public final zzgyl mo12742c() {
        try {
            int iZzaz = zzaz();
            zzgyl zzgylVar = zzgyl.zzb;
            byte[] bArr = new byte[iZzaz];
            AbstractC2214o5 abstractC2214o5M13097c = AbstractC2214o5.m13097c(bArr, 0, iZzaz);
            mo13183d(abstractC2214o5M13097c);
            abstractC2214o5M13097c.m13101d();
            return new zzgyh(bArr);
        } catch (IOException e) {
            t6x0.m187393a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12743g(OutputStream outputStream) throws IOException {
        int iZzaz = zzaz();
        Logger logger = AbstractC2214o5.f10016b;
        if (iZzaz > 4096) {
            iZzaz = 4096;
        }
        C2206n5 c2206n5 = new C2206n5(outputStream, iZzaz);
        mo13183d(c2206n5);
        c2206n5.mo12912g();
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m12744h() {
        try {
            int iZzaz = zzaz();
            byte[] bArr = new byte[iZzaz];
            AbstractC2214o5 abstractC2214o5M13097c = AbstractC2214o5.m13097c(bArr, 0, iZzaz);
            mo13183d(abstractC2214o5M13097c);
            abstractC2214o5M13097c.m13101d();
            return bArr;
        } catch (IOException e) {
            t6x0.m187393a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }
}
