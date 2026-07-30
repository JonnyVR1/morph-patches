package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2181h5;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p153l.fkx0;
import p153l.gjx0;
import p153l.jjx0;
import p153l.mkx0;
import p153l.mnd0;
import p153l.ukx0;
import p153l.yfx0;
import p153l.zfx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2181h5<MessageType extends AbstractC2181h5<MessageType, BuilderType>, BuilderType extends yfx0<MessageType, BuilderType>> implements fkx0 {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static void m12794f(Iterable iterable, List list) {
        Charset charset = gjx0.f104688a;
        iterable.getClass();
        if (iterable instanceof jjx0) {
            List listZzh = ((jjx0) iterable).zzh();
            jjx0 jjx0Var = (jjx0) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String str = "Element at index " + (jjx0Var.size() - size) + " is null.";
                    int size2 = jjx0Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            mnd0.m159157a(str);
                            return;
                        }
                        jjx0Var.remove(size2);
                    }
                } else if (obj instanceof zzgyl) {
                    jjx0Var.mo140242Z((zzgyl) obj);
                } else {
                    jjx0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof mkx0) {
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
                        mnd0.m159157a(str2);
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
    public int mo12795b(ukx0 ukx0Var) {
        throw null;
    }

    @Override // p153l.fkx0
    /* JADX INFO: renamed from: c */
    public final zzgyl mo12796c() {
        try {
            int iZzaz = zzaz();
            zzgyl zzgylVar = zzgyl.zzb;
            byte[] bArr = new byte[iZzaz];
            AbstractC2237o5 abstractC2237o5M13151c = AbstractC2237o5.m13151c(bArr, 0, iZzaz);
            mo13237d(abstractC2237o5M13151c);
            abstractC2237o5M13151c.m13155d();
            return new zzgyh(bArr);
        } catch (IOException e) {
            zfx0.m219588a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12797g(OutputStream outputStream) throws IOException {
        int iZzaz = zzaz();
        Logger logger = AbstractC2237o5.f10053b;
        if (iZzaz > 4096) {
            iZzaz = 4096;
        }
        C2229n5 c2229n5 = new C2229n5(outputStream, iZzaz);
        mo13237d(c2229n5);
        c2229n5.mo12966g();
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m12798h() {
        try {
            int iZzaz = zzaz();
            byte[] bArr = new byte[iZzaz];
            AbstractC2237o5 abstractC2237o5M13151c = AbstractC2237o5.m13151c(bArr, 0, iZzaz);
            mo13237d(abstractC2237o5M13151c);
            abstractC2237o5M13151c.m13155d();
            return bArr;
        } catch (IOException e) {
            zfx0.m219588a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }
}
