package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.immomo.hdata.android.Coded;
import com.immomo.hdata.android.MDevice;
import com.immomo.utils.tools.TraceData;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class qnk0 {

    /* JADX INFO: renamed from: l.qnk0$a */
    public static class C19607a implements MDevice.MmuidCallBack {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ag60 f158496a;

        public C19607a(ag60 ag60Var) {
            this.f158496a = ag60Var;
        }

        @Override // com.immomo.hdata.android.MDevice.MmuidCallBack
        public void onMMUIDGetComplete(String str) {
            this.f158496a.m97590d(str);
        }

        @Override // com.immomo.hdata.android.MDevice.MmuidCallBack
        public void onMMUIDGetError(Throwable th) {
            this.f158496a.m97590d("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m177221b(ag60 ag60Var, bej0 bej0Var) {
        try {
            if (TextUtils.isEmpty(rmw.m182110b(xiw.m211170a()))) {
                MDevice.getMMuidV3(ag60Var.f71088b, new C19607a(ag60Var));
            }
            ag60Var.m97589c(l8g0.m153225c(rmw.m182112d()) ? "" : rmw.m182112d());
            ag60Var.m97591e(l8g0.m153225c(rmw.m182113e()) ? "" : rmw.m182113e());
            try {
                ag60Var.m97588b(l8g0.m153225c(rmw.m182109a()) ? "" : rmw.m182109a());
            } catch (Exception unused) {
                ag60Var.m97588b("");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(riw.m181611a(new byte[]{94, 19, 92}), xiw.m211173d());
            xiw.f194525d = jSONObject.getInt(riw.m181611a(new byte[]{94, 19, 92})) == 28;
            String strM177223d = m177223d(ag60Var, bej0Var);
            if (bej0Var != null) {
                bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.DATA_COLLECTION_COMPLETED, ag60Var, "", new Object[0]));
            }
            new mml(m177228i(ag60Var, jSONObject), strM177223d).m159075a(ag60Var, bej0Var);
        } catch (Exception e) {
            if (bej0Var != null) {
                bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.DATA_COLLECTION_FAILED, ag60Var, e.getMessage(), new Object[0]));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m177222c() {
        try {
            return l8g0.m153223a();
        } catch (Exception unused) {
            return riw.m181611a(new byte[]{66, 3, 64, 104}) + System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m177223d(ag60 ag60Var, bej0 bej0Var) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            m177227h(jSONObject, ag60Var);
            m177227h(jSONObject2, ag60Var);
        } catch (JSONException e) {
            kmw.m150491a(e);
        }
        try {
            String strM177225f = m177225f(xiw.m211170a(), ag60Var);
            jSONObject.put(riw.m181611a(new byte[]{82, 7, 66, 94, 2, 15, 94, 0, 94}), strM177225f);
            jSONObject2.put(riw.m181611a(new byte[]{82, 7, 66, 94, 2, 15, 94, 0, 94}), strM177225f);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(riw.m181611a(new byte[]{83, 10, 88, 82, 15, 18, 111, 15, 95, 81, 14}), jSONObject.toString());
            byte[] bArrDoCommand = Coded.doCommand(jSONObject3.toString().getBytes(), 102);
            if (bArrDoCommand != null && bArrDoCommand.length > 0) {
                return Base64.encodeToString(bArrDoCommand, 0);
            }
            if (bej0Var != null) {
                bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.DATA_COLLECTION_FAILED, ag60Var, riw.m181611a(new byte[]{-43, -20, -111, -46, -50, -32, -42, -13, -127, -47, -20, -56, -44, -34, -117, -48, -56, -36}), new Object[0]));
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            m177226g(jSONObject2, e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m177224e(String str, String str2, String str3, String str4, String str5, String str6, final bej0 bej0Var) {
        try {
            final ag60 ag60Var = new ag60(str, str2, str3, str4, str5, str6, m177222c(), System.currentTimeMillis());
            if (bej0Var != null) {
                bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.START_COLLECTION_DATA, ag60Var, "", new Object[0]));
            }
            m177229j(str6);
            nyi0.m165328a(new Runnable() { // from class: l.vmk0
                @Override // java.lang.Runnable
                public final void run() {
                    qnk0.m177221b(ag60Var, bej0Var);
                }
            });
        } catch (Exception e) {
            try {
                ag60 ag60Var2 = new ag60(str, str2, str3, str4, str5, str6, "", 0L);
                if (bej0Var != null) {
                    bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.CALL_SDK_FAILED, ag60Var2, e.getMessage(), new Object[0]));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m177225f(Context context, ag60 ag60Var) {
        vmw vmwVar = new vmw();
        new re5(context, vmwVar, ag60Var).m180968b(ag60Var.f71087a);
        return vmwVar.toString();
    }

    /* JADX INFO: renamed from: g */
    private static void m177226g(JSONObject jSONObject, Exception exc) {
        try {
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
                arrayList.add(stackTraceElement.getClassName() + riw.m181611a(new byte[]{30}) + stackTraceElement.getMethodName());
            }
            jSONObject.put(riw.m181611a(new byte[]{85, 20, 67, 88, 19}), exc + riw.m181611a(new byte[]{19, 21, 69, 86, 2, HttpTokens.CARRIAGE_RETURN, 10}) + arrayList);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m177227h(JSONObject jSONObject, ag60 ag60Var) throws JSONException {
        jSONObject.put(riw.m181611a(new byte[]{81, 5, 82, 88, 20, 8, 68, 15, 85}), ag60Var.f71088b);
        jSONObject.put(riw.m181611a(new byte[]{67, 3, 66, 68, 8, 9, 94, 15, 85}), ag60Var.f71089c);
        jSONObject.put(riw.m181611a(new byte[]{83, 14, 80, 89, 15, 3, 92}), ag60Var.f71090d);
        jSONObject.put(riw.m181611a(new byte[]{67, 9, 68, 69, 2, 3}), ag60Var.f71087a);
        jSONObject.put(riw.m181611a(new byte[]{67, 2, 90, 65, 4, 20, 67, 15, 94, 89}), xiw.m211171b());
    }

    /* JADX INFO: renamed from: i */
    private static String m177228i(ag60 ag60Var, JSONObject jSONObject) {
        try {
            return new String(Coded.doCommand(jSONObject.toString().getBytes(), 104)) + System.currentTimeMillis() + riw.m181611a(new byte[]{22, 7, 82, 84, 14, 19, 94, 18, 88, 83, 92}) + URLEncoder.encode(ag60Var.f71088b, riw.m181611a(new byte[]{101, 50, 119, 26, 89})) + riw.m181611a(new byte[]{22, 20, 84, 70, 62, 15, 84, 91}) + ag60Var.f71093g;
        } catch (Exception e) {
            kmw.m150491a(e);
            vtq0.m202761a(riw.m181611a(new byte[]{101, 52, 125, -46, -26, -32, -43, -62, -74, -46, -59, -41, -40, -46, -108}), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m177229j(String str) {
        if (TextUtils.isEmpty(str)) {
            wg3.m206174a(riw.m181611a(new byte[]{113, 20, 86, 66, 12, 3, 94, 18, 17, Tnaf.POW_2_WIDTH, 2, 10, 89, 3, 95, 67, 70, 70, 83, 7, 95, 89, 14, 18, Tnaf.POW_2_WIDTH, 4, 84, 23, 15, 19, 92, 10, Tnaf.POW_2_WIDTH}));
        } else {
            if (xiw.m211170a() != null) {
                return;
            }
            wg3.m206174a(riw.m181611a(new byte[]{96, 10, 84, 86, 18, 3, Tnaf.POW_2_WIDTH, 5, 80, 91, HttpTokens.CARRIAGE_RETURN, 70, 125, 34, 84, 65, 8, 5, 85, 72, 88, 89, 8, 18, Tnaf.POW_2_WIDTH, 0, 88, 69, 18, 18, 17}));
        }
    }
}
