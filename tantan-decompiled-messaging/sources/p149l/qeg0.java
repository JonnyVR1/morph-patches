package p149l;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qeg0 extends mng0 {

    /* JADX INFO: renamed from: a */
    public final Class f154033a;

    public qeg0(Class cls) {
        this.f154033a = cls;
    }

    @Override // p149l.mng0
    /* JADX INFO: renamed from: a */
    public gpg0 mo146978a(JSONObject jSONObject) {
        try {
            return (gpg0) this.f154033a.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
