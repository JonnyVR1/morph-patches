package p149l;

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
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class kek0 {

    /* JADX INFO: renamed from: l.kek0$a */
    public static class C17995a implements MDevice.MmuidCallBack {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ u760 f122719a;

        public C17995a(u760 u760Var) {
            this.f122719a = u760Var;
        }

        @Override // com.immomo.hdata.android.MDevice.MmuidCallBack
        public void onMMUIDGetComplete(String str) {
            this.f122719a.m192098d(str);
        }

        @Override // com.immomo.hdata.android.MDevice.MmuidCallBack
        public void onMMUIDGetError(Throwable th) {
            this.f122719a.m192098d("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m145784b(u760 u760Var, x4j0 x4j0Var) {
        try {
            if (TextUtils.isEmpty(sjw.m184560b(ygw.m214775a()))) {
                MDevice.getMMuidV3(u760Var.f174932b, new C17995a(u760Var));
            }
            u760Var.m192097c(d0g0.m109498c(sjw.m184562d()) ? "" : sjw.m184562d());
            u760Var.m192099e(d0g0.m109498c(sjw.m184563e()) ? "" : sjw.m184563e());
            try {
                u760Var.m192096b(d0g0.m109498c(sjw.m184559a()) ? "" : sjw.m184559a());
            } catch (Exception unused) {
                u760Var.m192096b("");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(sgw.m184137a(new byte[]{94, 19, 92}), ygw.m214778d());
            ygw.f198255d = jSONObject.getInt(sgw.m184137a(new byte[]{94, 19, 92})) == 28;
            String strM145786d = m145786d(u760Var, x4j0Var);
            if (x4j0Var != null) {
                x4j0Var.mo206987a(ygw.m214777c(), TraceData.m19517a(TraceData.LogNode.DATA_COLLECTION_COMPLETED, u760Var, "", new Object[0]));
            }
            new yjl(m145791i(u760Var, jSONObject), strM145786d).m215068a(u760Var, x4j0Var);
        } catch (Exception e) {
            if (x4j0Var != null) {
                x4j0Var.mo206987a(ygw.m214777c(), TraceData.m19517a(TraceData.LogNode.DATA_COLLECTION_FAILED, u760Var, e.getMessage(), new Object[0]));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m145785c() {
        try {
            return d0g0.m109496a();
        } catch (Exception unused) {
            return sgw.m184137a(new byte[]{66, 3, 64, 104}) + System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m145786d(u760 u760Var, x4j0 x4j0Var) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            m145790h(jSONObject, u760Var);
            m145790h(jSONObject2, u760Var);
        } catch (JSONException e) {
            ljw.m150044a(e);
        }
        try {
            String strM145788f = m145788f(ygw.m214775a(), u760Var);
            jSONObject.put(sgw.m184137a(new byte[]{82, 7, 66, 94, 2, 15, 94, 0, 94}), strM145788f);
            jSONObject2.put(sgw.m184137a(new byte[]{82, 7, 66, 94, 2, 15, 94, 0, 94}), strM145788f);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(sgw.m184137a(new byte[]{83, 10, 88, 82, 15, 18, 111, 15, 95, 81, 14}), jSONObject.toString());
            byte[] bArrDoCommand = Coded.doCommand(jSONObject3.toString().getBytes(), 102);
            if (bArrDoCommand != null && bArrDoCommand.length > 0) {
                return Base64.encodeToString(bArrDoCommand, 0);
            }
            if (x4j0Var != null) {
                x4j0Var.mo206987a(ygw.m214777c(), TraceData.m19517a(TraceData.LogNode.DATA_COLLECTION_FAILED, u760Var, sgw.m184137a(new byte[]{-43, -20, -111, -46, -50, -32, -42, -13, -127, -47, -20, -56, -44, -34, -117, -48, -56, -36}), new Object[0]));
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            m145789g(jSONObject2, e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m145787e(String str, String str2, String str3, String str4, String str5, String str6, final x4j0 x4j0Var) {
        try {
            final u760 u760Var = new u760(str, str2, str3, str4, str5, str6, m145785c(), System.currentTimeMillis());
            if (x4j0Var != null) {
                x4j0Var.mo206987a(ygw.m214777c(), TraceData.m19517a(TraceData.LogNode.START_COLLECTION_DATA, u760Var, "", new Object[0]));
            }
            m145792j(str6);
            kpi0.m146869a(new Runnable() { // from class: l.pdk0
                @Override // java.lang.Runnable
                public final void run() {
                    kek0.m145784b(u760Var, x4j0Var);
                }
            });
        } catch (Exception e) {
            try {
                u760 u760Var2 = new u760(str, str2, str3, str4, str5, str6, "", 0L);
                if (x4j0Var != null) {
                    x4j0Var.mo206987a(ygw.m214777c(), TraceData.m19517a(TraceData.LogNode.CALL_SDK_FAILED, u760Var2, e.getMessage(), new Object[0]));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m145788f(Context context, u760 u760Var) {
        wjw wjwVar = new wjw();
        new rd5(context, wjwVar, u760Var).m178861b(u760Var.f174931a);
        return wjwVar.toString();
    }

    /* JADX INFO: renamed from: g */
    private static void m145789g(JSONObject jSONObject, Exception exc) {
        try {
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
                arrayList.add(stackTraceElement.getClassName() + sgw.m184137a(new byte[]{30}) + stackTraceElement.getMethodName());
            }
            jSONObject.put(sgw.m184137a(new byte[]{85, 20, 67, 88, 19}), exc + sgw.m184137a(new byte[]{19, 21, 69, 86, 2, HttpTokens.CARRIAGE_RETURN, 10}) + arrayList);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m145790h(JSONObject jSONObject, u760 u760Var) throws JSONException {
        jSONObject.put(sgw.m184137a(new byte[]{81, 5, 82, 88, 20, 8, 68, 15, 85}), u760Var.f174932b);
        jSONObject.put(sgw.m184137a(new byte[]{67, 3, 66, 68, 8, 9, 94, 15, 85}), u760Var.f174933c);
        jSONObject.put(sgw.m184137a(new byte[]{83, 14, 80, 89, 15, 3, 92}), u760Var.f174934d);
        jSONObject.put(sgw.m184137a(new byte[]{67, 9, 68, 69, 2, 3}), u760Var.f174931a);
        jSONObject.put(sgw.m184137a(new byte[]{67, 2, 90, 65, 4, 20, 67, 15, 94, 89}), ygw.m214776b());
    }

    /* JADX INFO: renamed from: i */
    private static String m145791i(u760 u760Var, JSONObject jSONObject) {
        try {
            return new String(Coded.doCommand(jSONObject.toString().getBytes(), 104)) + System.currentTimeMillis() + sgw.m184137a(new byte[]{22, 7, 82, 84, 14, 19, 94, 18, 88, 83, 92}) + URLEncoder.encode(u760Var.f174932b, sgw.m184137a(new byte[]{101, 50, 119, 26, 89})) + sgw.m184137a(new byte[]{22, 20, 84, 70, 62, 15, 84, 91}) + u760Var.f174937g;
        } catch (Exception e) {
            ljw.m150044a(e);
            pkq0.m170054a(sgw.m184137a(new byte[]{101, 52, 125, -46, -26, -32, -43, -62, -74, -46, -59, -41, -40, -46, -108}), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m145792j(String str) {
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a(sgw.m184137a(new byte[]{113, 20, 86, 66, 12, 3, 94, 18, 17, Tnaf.POW_2_WIDTH, 2, 10, 89, 3, 95, 67, 70, 70, 83, 7, 95, 89, 14, 18, Tnaf.POW_2_WIDTH, 4, 84, 23, 15, 19, 92, 10, Tnaf.POW_2_WIDTH}));
        } else {
            if (ygw.m214775a() != null) {
                return;
            }
            ig3.m135964a(sgw.m184137a(new byte[]{96, 10, 84, 86, 18, 3, Tnaf.POW_2_WIDTH, 5, 80, 91, HttpTokens.CARRIAGE_RETURN, 70, 125, 34, 84, 65, 8, 5, 85, 72, 88, 89, 8, 18, Tnaf.POW_2_WIDTH, 0, 88, 69, 18, 18, 17}));
        }
    }
}
