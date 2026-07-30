package p149l;

import com.immomo.utils.tools.TraceData;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public class yjl {

    /* JADX INFO: renamed from: a */
    String f198638a;

    /* JADX INFO: renamed from: b */
    String f198639b;

    public yjl(String str, String str2) {
        this.f198638a = str;
        this.f198639b = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m215068a(u760 u760Var, x4j0 x4j0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        exc0 exc0VarM164943a = null;
        try {
            exc0VarM164943a = oll.m164943a(this.f198638a, this.f198639b, u760Var, x4j0Var);
            if (exc0VarM164943a != null) {
                stringBuffer.append(exc0VarM164943a.m118606k().string());
                exc0VarM164943a.m118606k().close();
            }
        } catch (Exception e) {
            if (x4j0Var != null) {
                x4j0Var.mo206987a(ygw.m214777c(), TraceData.m19517a(TraceData.LogNode.NETWORK_REQUEST_EXCEPTION, u760Var, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, HttpTokens.CARRIAGE_RETURN}) + e.getMessage(), new Object[0]));
            }
            if (exc0VarM164943a != null) {
                exc0VarM164943a.m118606k().close();
            }
        }
        return stringBuffer.toString();
    }
}
