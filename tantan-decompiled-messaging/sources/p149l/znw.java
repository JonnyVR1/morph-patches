package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.mwc.sdk.C3929c;
import com.immomo.mwc.sdk.EventType;
import com.immomo.mwc.sdk.exception.MWCException;
import com.quickjs.QuickJSException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class znw implements jvl {
    @Override // p149l.jvl
    /* JADX INFO: renamed from: a */
    public Object mo19396a(String str) throws QuickJSException {
        return null;
    }

    @Override // p149l.jvl
    /* JADX INFO: renamed from: b */
    public void mo19397b(EventType eventType, String str, JSONObject jSONObject, @Nullable a84 a84Var) {
        if (a84Var != null) {
            a84Var.mo95332a(new z74(-1, "reason: call MWCEngineEmptyImpl#trigger"), null);
        }
    }

    @Override // p149l.jvl
    /* JADX INFO: renamed from: c */
    public Object mo19398c(String str, String str2) throws QuickJSException {
        return null;
    }

    @Override // p149l.jvl
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public znw mo19399d(@NonNull C3929c c3929c, nn5 nn5Var) {
        if (nn5Var != null) {
            nn5Var.mo97998a(new MWCException(-1, "reason: call MWCEngineEmptyImpl#addWorker"), null);
        }
        return this;
    }
}
