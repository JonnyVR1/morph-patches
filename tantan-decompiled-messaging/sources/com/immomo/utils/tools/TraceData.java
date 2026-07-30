package com.immomo.utils.tools;

import android.os.Process;
import android.text.TextUtils;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.sgw;
import p149l.u760;
import p149l.ygw;

/* JADX INFO: loaded from: classes7.dex */
public class TraceData {

    public enum LogNode {
        START_COLLECTION_DATA(sgw.m184137a(new byte[]{-43, -38, -79, -46, -58, -19, -42, -14, -121, -34, -6, -32, -42, -13, -127, -47, -20, -56}), sgw.m184137a(new byte[]{93, 57, 66, 67, 0, 20, 68, 57, 82, 88, HttpTokens.CARRIAGE_RETURN, 10, 85, 5, 69, 94, 15, 1, 111, 2, 80, 67, 0})),
        DATA_COLLECTION_COMPLETED(sgw.m184137a(new byte[]{-42, -14, -121, -34, -6, -32, -42, -13, -127, -47, -20, -56, -43, -56, -67, -47, -23, -10}), sgw.m184137a(new byte[]{93, 57, 85, 86, 21, 7, 111, 5, 94, 91, HttpTokens.CARRIAGE_RETURN, 3, 83, 18, 88, 88, 15, 57, 83, 9, 92, 71, HttpTokens.CARRIAGE_RETURN, 3, 68, 3, 85})),
        PREPARE_TO_SEND_NETWORK_REQUEST(sgw.m184137a(new byte[]{-43, -31, -73, -46, -59, -31, -43, -23, -96, -34, -31, -25, -41, -37, -96, -48, -38, -6, -40, -55, -122, -47, -48, -28}), sgw.m184137a(new byte[]{93, 57, 65, 69, 4, 22, 81, 20, 84, 104, 21, 9, 111, 21, 84, 89, 5, 57, 94, 3, 69, 64, 14, 20, 91, 57, 67, 82, Tnaf.POW_2_WIDTH, 19, 85, 21, 69})),
        SEND_NETWORK_REQUEST_TIMES(sgw.m184137a(new byte[]{-41, -54, -99, 76, 81, 27, -42, -54, -112, -46, -18, -9, -39, -26, -80, -48, -36, -9, -41, -35, -83, -33, -50, -47, -42, -41, -77}), sgw.m184137a(new byte[]{93, 57, 66, 82, 15, 2, 111, 8, 84, 67, 22, 9, 66, HttpTokens.CARRIAGE_RETURN, 110, 69, 4, 23, 69, 3, 66, 67, 18, 57, 68, 15, 92, 82, 18, 92, 75, 86, 76})),
        NETWORK_REQUEST_SUCCESSFUL_TIMES(sgw.m184137a(new byte[]{-41, -54, -99, 76, 81, 27, -42, -54, -112, -48, -36, -9, -41, -35, -83, -33, -50, -47, -42, -41, -77, -47, -23, -10, -43, -20, -82}), sgw.m184137a(new byte[]{93, 57, 95, 82, 21, 17, 95, 20, 90, 104, 19, 3, 65, 19, 84, 68, 21, 57, 67, 19, 82, 84, 4, 21, 67, 0, 68, 91, 62, 18, 89, 11, 84, 68, 91, 29, 0, 27})),
        NETWORK_REQUEST_FAILED_TIMES(sgw.m184137a(new byte[]{-41, -54, -99, 76, 81, 27, -42, -54, -112, -48, -36, -9, -41, -35, -83, -33, -50, -47, -42, -41, -77, -46, -59, -41, -40, -46, -108}), sgw.m184137a(new byte[]{93, 57, 95, 82, 21, 17, 95, 20, 90, 104, 19, 3, 65, 19, 84, 68, 21, 57, 86, 7, 88, 91, 4, 2, 111, 18, 88, 90, 4, 21, 10, 29, 1, 74})),
        NETWORK_REQUEST_FAILED(sgw.m184137a(new byte[]{-41, -37, -96, -48, -38, -6, -40, -55, -122, -47, -48, -28, -43, -62, -128, -33, -43, -61, -33, -38, -67, -33, -50, -47, -41, -50, PSSSigner.TRAILER_IMPLICIT, -46, -15, -24, -39, -31, PSSSigner.TRAILER_IMPLICIT, -33, -50, -13}), sgw.m184137a(new byte[]{93, 57, 95, 82, 21, 17, 95, 20, 90, 104, 19, 3, 65, 19, 84, 68, 21, 57, 86, 7, 88, 91, 4, 2})),
        REQUEST_TIMED_OUT(sgw.m184137a(new byte[]{-41, -54, -99, 76, 81, 27, -42, -54, -112, -48, -36, -9, -41, -35, -83, -33, -50, -47, -42, -41, -77, -46, -59, -41, -40, -46, -108, -40, -35, -22, -41, -37, -96, -48, -38, -6, -40, -55, -122, -47, -48, -28, -40, -48, -76, -47, -10, -48, -42, -18, -89, -33, -31, -29, -40, -48, -76, -33, -34, -31, -42, -6, -79, -46, -59, -63, -39, -31, PSSSigner.TRAILER_IMPLICIT, -33, -50, -13, -42, -54, -112, -47, -12, -42}), sgw.m184137a(new byte[]{93, 57, 67, 82, Tnaf.POW_2_WIDTH, 19, 85, 21, 69, 104, 21, 15, 93, 3, 85, 104, 14, 19, 68, 57, 94, 69, 62, 3, 72, 5, 84, 82, 5, 3, 84, 57, 69, 95, 4, 57, 94, 19, 92, 85, 4, 20, 111, 9, 87, 104, 19, 3, 68, 20, 88, 82, 18, 57, 68, 15, 92, 82, 18, 92, 75, 86, 76})),
        NETWORK_UNAVAILABLE(sgw.m184137a(new byte[]{-41, -54, -99, 76, 81, 27, -42, -54, -112, -48, -36, -9, -41, -35, -83, -33, -50, -47, -42, -41, -77, -46, -59, -41, -40, -46, -108, -40, -35, -22, -43, -37, -94, -46, -24, -21, -41, -37, -96, -48, -38, -6, -44, -34, PSSSigner.TRAILER_IMPLICIT, -46, -18, -55, -41, -14, -103}), sgw.m184137a(new byte[]{93, 57, 95, 82, 21, 17, 95, 20, 90, 104, 20, 8, 81, Tnaf.POW_2_WIDTH, 80, 94, HttpTokens.CARRIAGE_RETURN, 7, 82, 10, 84, 104, 21, 15, 93, 3, 66, HttpTokens.CARRIAGE_RETURN, 26, 86, 77})),
        WAIT_ONE_SECOND_AND_REQUEST_AGAIN(sgw.m184137a(new byte[]{-41, -54, -99, 76, 81, 27, -42, -54, -112, -48, -36, -9, -41, -35, -83, -33, -50, -47, -42, -41, -77, -46, -59, -41, -40, -46, -108, 27, -122, -53, -71, -125, -113, -78, -123, -34, -80, -127, -106, -91, -124, -32, -67, -128, -99, -106, -120, -31, -67, -114, -98, -94}), sgw.m184137a(new byte[]{93, 57, 70, 86, 8, 18, 111, 9, 95, 82, 62, 21, 85, 5, 94, 89, 5, 57, 81, 8, 85, 104, 19, 3, 65, 19, 84, 68, 21, 57, 81, 1, 80, 94, 15, 57, 68, 15, 92, 82, 18, 92, 75, 86, 76})),
        CALL_SDK_FAILED(sgw.m184137a(new byte[]{-40, -42, -78, -48, -11, -50, -43, -56, -72, -46, -28, -50, Tnaf.POW_2_WIDTH, 53, 117, 124, 65, -125, -108, -41, -39, -125, -60}), sgw.m184137a(new byte[]{93, 57, 82, 86, HttpTokens.CARRIAGE_RETURN, 10, 111, 21, 85, 92, 62, 0, 81, 15, 93, 82, 5})),
        DATA_COLLECTION_FAILED(sgw.m184137a(new byte[]{-42, -14, -121, -34, -6, -32, -42, -13, -127, -47, -20, -56, -43, -62, -128, -33, -43, -61}), sgw.m184137a(new byte[]{93, 57, 85, 86, 21, 7, 111, 5, 94, 91, HttpTokens.CARRIAGE_RETURN, 3, 83, 18, 88, 88, 15, 57, 86, 7, 88, 91, 4, 2})),
        NETWORK_REQUEST_EXCEPTION(sgw.m184137a(new byte[]{-41, -37, -96, -48, -38, -6, -40, -55, -122, -47, -48, -28, -43, -38, -77, -46, -39, -34}), sgw.m184137a(new byte[]{93, 57, 95, 82, 21, 17, 95, 20, 90, 104, 19, 3, 65, 19, 84, 68, 21, 57, 85, 30, 82, 82, 17, 18, 89, 9, 95}));

        private final String chineseDescription;
        private final String englishName;

        LogNode(String str, String str2) {
            this.chineseDescription = str;
            this.englishName = str2;
        }

        private String format(String str, Object... objArr) {
            return new MessageFormat(str, Locale.US).format(objArr);
        }

        public String getChineseDescription(Object... objArr) {
            return format(this.chineseDescription, objArr);
        }

        public String getEnglishName(Object... objArr) {
            return format(this.englishName, objArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m19517a(LogNode logNode, u760 u760Var, String str, Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        m19518b(jSONObject, sgw.m184137a(new byte[]{84, 3, 66, 84, 19, 15, 64, 18, 88, 88, 15}), logNode.getChineseDescription(objArr));
        m19518b(jSONObject, sgw.m184137a(new byte[]{64, 9, 88, 89, 21}), logNode.getEnglishName(objArr));
        m19518b(jSONObject, sgw.m184137a(new byte[]{68, 15, 92, 82, 18, 18, 81, 11, 65}), Long.valueOf(System.currentTimeMillis()));
        m19518b(jSONObject, sgw.m184137a(new byte[]{81, 5, 82, 88, 20, 8, 68, 15, 85}), u760Var.f174932b);
        m19518b(jSONObject, sgw.m184137a(new byte[]{67, 9, 68, 69, 2, 3}), u760Var.f174931a);
        m19518b(jSONObject, sgw.m184137a(new byte[]{81, 22, 65, 89, 0, 11, 85}), u760Var.f174936f);
        m19518b(jSONObject, sgw.m184137a(new byte[]{66, 3, 64, 104, 8, 2}), u760Var.f174937g);
        m19518b(jSONObject, sgw.m184137a(new byte[]{64, 15, 85}), Process.myPid() + "");
        m19518b(jSONObject, sgw.m184137a(new byte[]{67, 2, 90, 97, 4, 20, 67, 15, 94, 89}), ygw.m214776b());
        String strM184137a = sgw.m184137a(new byte[]{85, 30, 82, 82, 17, 18, 89, 9, 95});
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        m19518b(jSONObject, strM184137a, str);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: b */
    private static void m19518b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            sgw.m184137a(new byte[]{100, 20, 80, 84, 4, 34, 81, 18, 80});
            sgw.m184137a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 17, 19, 68, 70, 90, 82, 24, 92, Tnaf.POW_2_WIDTH});
            sgw.m184137a(new byte[]{28, 70, 71, 86, HttpTokens.CARRIAGE_RETURN, 19, 85, 92, 17});
            Objects.toString(obj);
        }
    }
}
