package p149l;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mmt0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f134695a;

    public mmt0(ehx0 ehx0Var) {
        this.f134695a = ehx0Var;
    }

    @Override // p149l.ehx0
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((vqt0) this.f134695a).m199592a().f125157A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
