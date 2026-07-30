package p149l;

import com.google.android.gms.internal.ads.C2253t4;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class iww0 implements snw0 {

    /* JADX INFO: renamed from: a */
    public final String f115310a;

    /* JADX INFO: renamed from: b */
    public final Class f115311b;

    /* JADX INFO: renamed from: c */
    public final zzgus f115312c;

    /* JADX INFO: renamed from: d */
    public final fbx0 f115313d;

    public iww0(String str, Class cls, zzgus zzgusVar, fbx0 fbx0Var) {
        this.f115313d = fbx0Var;
        this.f115310a = str;
        this.f115311b = cls;
        this.f115312c = zzgusVar;
    }

    /* JADX INFO: renamed from: c */
    public static snw0 m138778c(String str, Class cls, zzgus zzgusVar, fbx0 fbx0Var) {
        return new iww0(str, cls, zzgusVar, fbx0Var);
    }

    @Override // p149l.snw0
    /* JADX INFO: renamed from: a */
    public final Object mo138779a(zzgyl zzgylVar) throws GeneralSecurityException {
        return axw0.m99526a().m99528c(dxw0.m114030d().m114031a(wxw0.m206041a(this.f115310a, zzgylVar, this.f115312c, zzgvz.RAW, null), qnw0.m175705a()), this.f115311b);
    }

    @Override // p149l.snw0
    /* JADX INFO: renamed from: b */
    public final C2253t4 mo138780b(zzgyl zzgylVar) throws GeneralSecurityException {
        y3x0 y3x0VarM13343L = C2261u4.m13343L();
        y3x0VarM13343L.m212862r(this.f115310a);
        y3x0VarM13343L.m212863s(zzgylVar);
        y3x0VarM13343L.m212861q(zzgvz.RAW);
        fyw0 fyw0VarM114034e = dxw0.m114030d().m114034e(qww0.m176927b().m176928a(dxw0.m114030d().m114033c(xxw0.m211569a((C2261u4) y3x0VarM13343L.m153521m())), null), wxw0.class, qnw0.m175705a());
        t3x0 t3x0VarM13319L = C2253t4.m13319L();
        wxw0 wxw0Var = (wxw0) fyw0VarM114034e;
        t3x0VarM13319L.m187129r(wxw0Var.m206046f());
        t3x0VarM13319L.m187130s(wxw0Var.m206044d());
        t3x0VarM13319L.m187128q(wxw0Var.m206042b());
        return (C2253t4) t3x0VarM13319L.m153521m();
    }

    @Override // p149l.snw0
    public final Class zzb() {
        return this.f115311b;
    }
}
