package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C2113f implements DynamiteModule.InterfaceC2107a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC2107a
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC2107a.b mo12540a(Context context, String str, DynamiteModule.InterfaceC2107a.a aVar) throws DynamiteModule.LoadingException {
        int iMo12541a;
        DynamiteModule.InterfaceC2107a.b bVar = new DynamiteModule.InterfaceC2107a.b();
        int iMo12542b = aVar.mo12542b(context, str);
        bVar.f9858a = iMo12542b;
        int i = 1;
        int i2 = 0;
        if (iMo12542b != 0) {
            iMo12541a = aVar.mo12541a(context, str, false);
            bVar.f9859b = iMo12541a;
        } else {
            iMo12541a = aVar.mo12541a(context, str, true);
            bVar.f9859b = iMo12541a;
        }
        int i3 = bVar.f9858a;
        if (i3 == 0) {
            if (iMo12541a == 0) {
                i = 0;
            }
            bVar.f9860c = i;
            return bVar;
        }
        i2 = i3;
        if (i2 >= iMo12541a) {
            i = -1;
        }
        bVar.f9860c = i;
        return bVar;
    }
}
