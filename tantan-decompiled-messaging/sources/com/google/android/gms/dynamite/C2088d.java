package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C2088d implements DynamiteModule.InterfaceC2084a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC2084a
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC2084a.b mo12486a(Context context, String str, DynamiteModule.InterfaceC2084a.a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.InterfaceC2084a.b bVar = new DynamiteModule.InterfaceC2084a.b();
        int iMo12487a = aVar.mo12487a(context, str, false);
        bVar.f9822b = iMo12487a;
        bVar.f9823c = iMo12487a != 0 ? 1 : 0;
        return bVar;
    }
}
