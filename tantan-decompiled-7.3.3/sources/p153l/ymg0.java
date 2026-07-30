package p153l;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ymg0 extends uvg0 {

    /* JADX INFO: renamed from: a */
    public final Class f200665a;

    public ymg0(Class cls) {
        this.f200665a = cls;
    }

    @Override // p153l.uvg0
    /* JADX INFO: renamed from: a */
    public oxg0 mo105060a(JSONObject jSONObject) {
        try {
            return (oxg0) this.f200665a.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
