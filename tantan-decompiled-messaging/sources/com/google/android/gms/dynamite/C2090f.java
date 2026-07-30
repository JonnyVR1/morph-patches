package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C2090f implements DynamiteModule.InterfaceC2084a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC2084a
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC2084a.b mo12486a(Context context, String str, DynamiteModule.InterfaceC2084a.a aVar) throws DynamiteModule.LoadingException {
        int iMo12487a;
        DynamiteModule.InterfaceC2084a.b bVar = new DynamiteModule.InterfaceC2084a.b();
        int iMo12488b = aVar.mo12488b(context, str);
        bVar.f9821a = iMo12488b;
        int i = 1;
        int i2 = 0;
        if (iMo12488b != 0) {
            iMo12487a = aVar.mo12487a(context, str, false);
            bVar.f9822b = iMo12487a;
        } else {
            iMo12487a = aVar.mo12487a(context, str, true);
            bVar.f9822b = iMo12487a;
        }
        int i3 = bVar.f9821a;
        if (i3 == 0) {
            if (iMo12487a == 0) {
                i = 0;
            }
            bVar.f9823c = i;
            return bVar;
        }
        i2 = i3;
        if (i2 >= iMo12487a) {
            i = -1;
        }
        bVar.f9823c = i;
        return bVar;
    }
}
