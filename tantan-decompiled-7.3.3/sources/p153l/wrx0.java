package p153l;

import com.google.android.gms.measurement.internal.C2479e;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class wrx0 implements pky0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f190574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2479e f190575b;

    public wrx0(C2479e c2479e, String str) {
        this.f190574a = str;
        this.f190575b = c2479e;
    }

    @Override // p153l.pky0
    public final String zza(String str) {
        Map map = (Map) this.f190575b.f10509d.get(this.f190574a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
