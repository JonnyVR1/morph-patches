package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2109b implements DynamiteModule.InterfaceC2107a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC2107a
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC2107a.b mo12540a(Context context, String str, DynamiteModule.InterfaceC2107a.a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.InterfaceC2107a.b bVar = new DynamiteModule.InterfaceC2107a.b();
        int iMo12541a = aVar.mo12541a(context, str, true);
        bVar.f9859b = iMo12541a;
        if (iMo12541a != 0) {
            bVar.f9860c = 1;
            return bVar;
        }
        int iMo12542b = aVar.mo12542b(context, str);
        bVar.f9858a = iMo12542b;
        if (iMo12542b != 0) {
            bVar.f9860c = -1;
        }
        return bVar;
    }
}
