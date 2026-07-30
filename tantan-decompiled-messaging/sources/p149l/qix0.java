package p149l;

import com.google.android.gms.measurement.internal.C2456e;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class qix0 implements jby0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f154822a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2456e f154823b;

    public qix0(C2456e c2456e, String str) {
        this.f154822a = str;
        this.f154823b = c2456e;
    }

    @Override // p149l.jby0
    public final String zza(String str) {
        Map map = (Map) this.f154823b.f10472d.get(this.f154822a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
