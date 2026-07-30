package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.mwc.sdk.C4072c;
import com.immomo.mwc.sdk.EventType;
import com.immomo.mwc.sdk.exception.MWCException;
import com.quickjs.QuickJSException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class yqw implements byl {
    @Override // p153l.byl
    /* JADX INFO: renamed from: a */
    public Object mo20376a(String str) throws QuickJSException {
        return null;
    }

    @Override // p153l.byl
    /* JADX INFO: renamed from: b */
    public void mo20377b(EventType eventType, String str, JSONObject jSONObject, @Nullable z84 z84Var) {
        if (z84Var != null) {
            z84Var.mo99785a(new y84(-1, "reason: call MWCEngineEmptyImpl#trigger"), null);
        }
    }

    @Override // p153l.byl
    /* JADX INFO: renamed from: c */
    public Object mo20378c(String str, String str2) throws QuickJSException {
        return null;
    }

    @Override // p153l.byl
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public yqw mo20379d(@NonNull C4072c c4072c, ro5 ro5Var) {
        if (ro5Var != null) {
            ro5Var.mo182358a(new MWCException(-1, "reason: call MWCEngineEmptyImpl#addWorker"), null);
        }
        return this;
    }
}
