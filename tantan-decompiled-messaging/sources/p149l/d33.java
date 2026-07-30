package p149l;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class d33 implements npl {

    /* JADX INFO: renamed from: b */
    private static d33 f83450b;

    /* JADX INFO: renamed from: a */
    private npl f83451a;

    private d33() {
    }

    /* JADX INFO: renamed from: c */
    public static d33 m109851c() {
        if (f83450b == null) {
            synchronized (d33.class) {
                try {
                    if (f83450b == null) {
                        f83450b = new d33();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f83450b;
    }

    @Override // p149l.npl
    /* JADX INFO: renamed from: a */
    public boolean mo109852a(Map<String, Object> map, InterfaceC18132l1<Map<String, Object>> interfaceC18132l1) {
        npl nplVar = this.f83451a;
        return nplVar != null && nplVar.mo109852a(map, interfaceC18132l1);
    }

    @Override // p149l.npl
    /* JADX INFO: renamed from: b */
    public void mo109853b(Context context, Map<String, Object> map) {
        npl nplVar = this.f83451a;
        if (nplVar != null) {
            nplVar.mo109853b(context, map);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m109854d() {
        return this.f83451a != null;
    }

    /* JADX INFO: renamed from: e */
    public d33 m109855e(npl nplVar) {
        if (m109854d()) {
            return this;
        }
        this.f83451a = nplVar;
        return this;
    }
}
