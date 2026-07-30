package p153l;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class t33 implements asl {

    /* JADX INFO: renamed from: b */
    private static t33 f171890b;

    /* JADX INFO: renamed from: a */
    private asl f171891a;

    private t33() {
    }

    /* JADX INFO: renamed from: c */
    public static t33 m189069c() {
        if (f171890b == null) {
            synchronized (t33.class) {
                try {
                    if (f171890b == null) {
                        f171890b = new t33();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f171890b;
    }

    @Override // p153l.asl
    /* JADX INFO: renamed from: a */
    public boolean mo99940a(Map<String, Object> map, InterfaceC18331l1<Map<String, Object>> interfaceC18331l1) {
        asl aslVar = this.f171891a;
        return aslVar != null && aslVar.mo99940a(map, interfaceC18331l1);
    }

    @Override // p153l.asl
    /* JADX INFO: renamed from: b */
    public void mo99941b(Context context, Map<String, Object> map) {
        asl aslVar = this.f171891a;
        if (aslVar != null) {
            aslVar.mo99941b(context, map);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m189070d() {
        return this.f171891a != null;
    }

    /* JADX INFO: renamed from: e */
    public t33 m189071e(asl aslVar) {
        if (m189070d()) {
            return this;
        }
        this.f171891a = aslVar;
        return this;
    }
}
