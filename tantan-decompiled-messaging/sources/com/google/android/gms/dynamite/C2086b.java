package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2086b implements DynamiteModule.InterfaceC2084a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC2084a
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC2084a.b mo12486a(Context context, String str, DynamiteModule.InterfaceC2084a.a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.InterfaceC2084a.b bVar = new DynamiteModule.InterfaceC2084a.b();
        int iMo12487a = aVar.mo12487a(context, str, true);
        bVar.f9822b = iMo12487a;
        if (iMo12487a != 0) {
            bVar.f9823c = 1;
            return bVar;
        }
        int iMo12488b = aVar.mo12488b(context, str);
        bVar.f9821a = iMo12488b;
        if (iMo12488b != 0) {
            bVar.f9823c = -1;
        }
        return bVar;
    }
}
