package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class gdt0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f102132a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f102133b;

    public gdt0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f102132a = ehx0Var;
        this.f102133b = ehx0Var2;
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uvs0 zzb() {
        Context contextM110876a = ((dct0) this.f102132a).m110876a();
        b5w0 b5w0Var = (b5w0) this.f102133b.zzb();
        ims0 ims0VarM219292b = vny0.m199070h().m219292b(contextM110876a, zzcei.m13558F(), b5w0Var);
        cms0 cms0Var = fms0.f98370b;
        ims0VarM219292b.m137088a("google.afma.request.getAdDictionary", cms0Var, cms0Var);
        return new tvs0(contextM110876a, vny0.m199070h().m219292b(contextM110876a, zzcei.m13558F(), b5w0Var).m137088a("google.afma.sdkConstants.getSdkConstants", cms0Var, cms0Var));
    }
}
