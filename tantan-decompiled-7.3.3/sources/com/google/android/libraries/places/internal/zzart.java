package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzars;
import com.google.android.libraries.places.internal.zzart;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import p153l.mnd0;
import p153l.zfx0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzart<MessageType extends zzart<MessageType, BuilderType>, BuilderType extends zzars<MessageType, BuilderType>> implements zzavf {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzam(Iterable iterable, List list) {
        byte[] bArr = zzaud.zzd;
        if (iterable instanceof zzaun) {
            List listZzh = ((zzaun) iterable).zzh();
            zzaun zzaunVar = (zzaun) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String str = "Element at index " + (zzaunVar.size() - size) + " is null.";
                    int size2 = zzaunVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            mnd0.m159157a(str);
                            return;
                        }
                        zzaunVar.remove(size2);
                    }
                } else if (obj instanceof zzask) {
                    zzaunVar.zzi((zzask) obj);
                } else {
                    zzaunVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzavo) {
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

    public int zzak(zzavt zzavtVar) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzavf
    public final zzask zzal() {
        try {
            int iZzaq = zzaq();
            zzask zzaskVar = zzask.zzb;
            byte[] bArr = new byte[iZzaq];
            zzast zzastVar = new zzast(bArr, 0, iZzaq);
            zzaK(zzastVar);
            zzastVar.zzE();
            return new zzash(bArr);
        } catch (IOException e) {
            zfx0.m219588a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzavf
    public final void zzan(OutputStream outputStream) throws IOException {
        int iZzaq = zzaq();
        int i = zzasx.zzf;
        if (iZzaq > 4096) {
            iZzaq = 4096;
        }
        zzasv zzasvVar = new zzasv(outputStream, iZzaq);
        zzaK(zzasvVar);
        zzasvVar.zzJ();
    }

    @Override // com.google.android.libraries.places.internal.zzavf
    public final byte[] zzao() {
        try {
            int iZzaq = zzaq();
            byte[] bArr = new byte[iZzaq];
            zzast zzastVar = new zzast(bArr, 0, iZzaq);
            zzaK(zzastVar);
            zzastVar.zzE();
            return bArr;
        } catch (IOException e) {
            zfx0.m219588a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }
}
