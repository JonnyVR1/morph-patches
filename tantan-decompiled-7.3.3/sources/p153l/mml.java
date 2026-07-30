package p153l;

import com.immomo.utils.tools.TraceData;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public class mml {

    /* JADX INFO: renamed from: a */
    String f137605a;

    /* JADX INFO: renamed from: b */
    String f137606b;

    public mml(String str, String str2) {
        this.f137605a = str;
        this.f137606b = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m159075a(ag60 ag60Var, bej0 bej0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        i5d0 i5d0VarM111670a = null;
        try {
            i5d0VarM111670a = col.m111670a(this.f137605a, this.f137606b, ag60Var, bej0Var);
            if (i5d0VarM111670a != null) {
                stringBuffer.append(i5d0VarM111670a.m138670k().string());
                i5d0VarM111670a.m138670k().close();
            }
        } catch (Exception e) {
            if (bej0Var != null) {
                bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.NETWORK_REQUEST_EXCEPTION, ag60Var, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, HttpTokens.CARRIAGE_RETURN}) + e.getMessage(), new Object[0]));
            }
            if (i5d0VarM111670a != null) {
                i5d0VarM111670a.m138670k().close();
            }
        }
        return stringBuffer.toString();
    }
}
