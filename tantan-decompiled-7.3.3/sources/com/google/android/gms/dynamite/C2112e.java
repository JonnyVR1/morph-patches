package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C2112e implements DynamiteModule.InterfaceC2107a {
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
      0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC2107a
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC2107a.b mo12540a(Context context, String str, DynamiteModule.InterfaceC2107a.a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.InterfaceC2107a.b bVar = new DynamiteModule.InterfaceC2107a.b();
        bVar.f9858a = aVar.mo12542b(context, str);
        int i = 1;
        int iMo12541a = aVar.mo12541a(context, str, true);
        bVar.f9859b = iMo12541a;
        int i2 = bVar.f9858a;
        if (i2 == 0) {
            i2 = 0;
            if (iMo12541a == 0) {
                i = 0;
            } else if (i2 >= iMo12541a) {
                i = -1;
            }
        } else if (i2 >= iMo12541a) {
            i = -1;
        }
        bVar.f9860c = i;
        return bVar;
    }
}
