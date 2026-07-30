package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class wjw {

    /* JADX INFO: renamed from: a */
    private final JSONObject f186687a = new JSONObject();

    /* JADX INFO: renamed from: b */
    private final String f186688b = sgw.m184137a(new byte[]{6, 80, 7, 1});

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: a */
    private void m203499a(String str, Object obj, Object obj2) {
        if (obj != null) {
            try {
                try {
                    if ((obj instanceof String) && TextUtils.isEmpty((String) obj)) {
                        obj = obj2;
                    }
                } catch (JSONException unused) {
                    this.f186687a.put(str, obj2);
                    return;
                }
            } catch (JSONException unused2) {
                return;
            }
        } else {
            obj = obj2;
        }
        this.f186687a.put(str, obj);
    }

    /* JADX INFO: renamed from: A */
    public void m203500A(String str) {
        m203499a(sgw.m184137a(new byte[]{88, 9, 94, 92, 12, 3, 68, 14, 94, 83}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: B */
    public void m203501B(String str) {
        m203499a(sgw.m184137a(new byte[]{89, 11, 84, 94}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: C */
    public void m203502C(String str) {
        m203499a(sgw.m184137a(new byte[]{89, 11, 66, 94}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: D */
    public void m203503D(List<JSONObject> list) {
        m203499a(sgw.m184137a(new byte[]{89, 8, 65, 66, 21, 34, 85, Tnaf.POW_2_WIDTH, 88, 84, 4}), list, this.f186688b);
    }

    /* JADX INFO: renamed from: E */
    public void m203504E(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{89, 8, 66, 67, 0, 10, 92, 47, 95, 81, 14}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: F */
    public void m203505F(String str) {
        m203499a(sgw.m184137a(new byte[]{89, 8, 66, 67, 0, 10, 92, 7, 69, 94, 14, 8, 111, 47, 85}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: G */
    public void m203506G(String str) {
        m203499a(sgw.m184137a(new byte[]{89, 8, 66, 67, 0, 10, 92, 7, 69, 94, 14, 8, 111, 47, 85, 104, 4, 30, 83, 3, 65, 67, 8, 9, 94}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: H */
    public void m203507H(List<JSONObject> list) {
        m203499a(sgw.m184137a(new byte[]{89, 8, 66, 67, 0, 10, 92, 3, 85, 104, 17, 7, 83, HttpTokens.CARRIAGE_RETURN, 80, 80, 4, 21}), list, this.f186688b);
    }

    /* JADX INFO: renamed from: I */
    public void m203508I(String str) {
        m203499a(sgw.m184137a(new byte[]{89, 21, 115, 94, 14, 11, 85, 18, 67, 94, 2, 53, 69, 22, 65, 88, 19, 18, 85, 2}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: J */
    public void m203509J(int i) {
        m203499a(sgw.m184137a(new byte[]{89, 21, 100, 68, 3, 39, 84, 4, 114, 88, 15, 8, 85, 5, 69, 82, 5}), Integer.valueOf(i), -1);
    }

    /* JADX INFO: renamed from: K */
    public void m203510K(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{90, 7, 71, 86, 35, 19, 89, 10, 85, 126, 15, 0, 95}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: L */
    public void m203511L(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{92, 9, 82, 86, 21, 15, 95, 8}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: M */
    public void m203512M(int i) {
        m203499a(sgw.m184137a(new byte[]{93, 11, 85, 89, 18}), Integer.valueOf(i), this.f186688b);
    }

    /* JADX INFO: renamed from: N */
    public void m203513N(String str) {
        m203499a(sgw.m184137a(new byte[]{93, 7, 82}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: O */
    public void m203514O(String str) {
        m203499a(sgw.m184137a(new byte[]{93, 7, 82, 94, 15, 0, 95}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: P */
    public void m203515P(List<String> list) {
        m203499a(sgw.m184137a(new byte[]{93, 7, 93, 94, 2, 15, 95, 19, 66, 104, 0, 22, 64}), list, new ArrayList());
    }

    /* JADX INFO: renamed from: Q */
    public void m203516Q(String str) {
        m203499a(sgw.m184137a(new byte[]{125, 7, 93, 94, 2, 15, 95, 19, 66, 126, 15, 12, 85, 5, 69, 94, 14, 8}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: R */
    public void m203517R(String str) {
        m203499a(sgw.m184137a(new byte[]{93, 11, 68, 94, 5}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: S */
    public void m203518S(String str) {
        m203499a(sgw.m184137a(new byte[]{93, 11, 68, 94, 5, Tnaf.POW_2_WIDTH, 3}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: T */
    public void m203519T(String str) {
        m203499a(sgw.m184137a(new byte[]{93, 9, 85, 91, 4}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: U */
    public void m203520U(String str) {
        m203499a(sgw.m184137a(new byte[]{94, 3, 69, 67, 24, 22, 85}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: V */
    public void m203521V(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{94, 3, 69, 67, 24, 22, 85, 84}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: W */
    public void m203522W(String str) {
        m203499a(sgw.m184137a(new byte[]{95, 7, 88, 83}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: X */
    public void m203523X(String str) {
        m203499a(sgw.m184137a(new byte[]{64, 7, 82, 92, 0, 1, 85, 40, 80, 90, 4}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: Y */
    public void m203524Y(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{64, 7, 67, 68, 4, 2, 114, 19, 88, 91, 5, 47, 94, 0, 94}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: Z */
    public void m203525Z(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{64, 14, 94, 67, 14, 21}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: a0 */
    public void m203526a0(String str) {
        m203499a(sgw.m184137a(new byte[]{64, 20, 94, 84, 62, 11, 95, 19, 95, 67, 18, 57, 90, 7, 71, 86}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: b */
    public void m203527b(String str) {
        m203499a(sgw.m184137a(new byte[]{81, 5, 82, 82, 18, 21, 82, 15, 93, 94, 21, 31, 99, 3, 67, 65, 8, 5, 85, 35, 95, 86, 3, 10, 85}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: b0 */
    public void m203528b0(int i) {
        m203499a(sgw.m184137a(new byte[]{64, 20, 94, 79, 24}), i + "", this.f186688b);
    }

    /* JADX INFO: renamed from: c */
    public void m203529c(String str) {
        m203499a(sgw.m184137a(new byte[]{81, 5, 82, 82, 18, 21, 82, 15, 93, 94, 21, 31, 99, 3, 67, 65, 8, 5, 85, 42, 88, 68, 21}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: c0 */
    public void m203530c0(String str) {
        m203499a(sgw.m184137a(new byte[]{66, 7, 85, 94, 14, 48, 85, 20, 66, 94, 14, 8}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: d */
    public void m203531d(int i) {
        m203499a(sgw.m184137a(new byte[]{81, 2, 83, 114, 15, 7, 82, 10, 84, 83}), Integer.valueOf(i), -1);
    }

    /* JADX INFO: renamed from: d0 */
    public void m203532d0(String str) {
        m203499a(sgw.m184137a(new byte[]{67, 5, 67, 82, 4, 8}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: e */
    public void m203533e(String str) {
        m203499a(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 57, 88, 83}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: e0 */
    public void m203534e0(String str) {
        m203499a(sgw.m184137a(new byte[]{67, 3, 95, 68, 14, 20, 116, 7, 69, 86}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: f */
    public void m203535f(String str) {
        m203499a(sgw.m184137a(new byte[]{81, 22, 65, 89, 0, 11, 85}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: f0 */
    public void m203536f0(String str) {
        m203499a(sgw.m184137a(new byte[]{67, 3, 95, 68, 14, 20, 121, 8, 87, 88}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: g */
    public void m203537g(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{81, 19, 85, 94, 14, 48, 95, 10, 68, 90, 4}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: g0 */
    public void m203538g0(String str) {
        m203499a(sgw.m184137a(new byte[]{67, 15, 86, 89, 37, 7, 68, 7}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: h */
    public void m203539h(String str) {
        m203499a(sgw.m184137a(new byte[]{82, 9, 94, 67, 62, 15, 84}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: h0 */
    public void m203540h0(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{67, 15, 92, 116, 0, 20, 84, 21}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: i */
    public void m203541i(String str) {
        m203499a(sgw.m184137a(new byte[]{82, 19, 88, 91, 5, 8, 69, 11, 83, 82, 19}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: i0 */
    public void m203542i0(String str) {
        m203499a(sgw.m184137a(new byte[]{67, 15, 92, 68, 21, 7, 68, 19, 66}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: j */
    public void m203543j(long j) {
        m203499a(sgw.m184137a(new byte[]{82, 19, 88, 91, 5, 57, 64, 20, 94, 71, 62, 11, 95, 2, 88, 81, 8, 3, 84}), Long.valueOf(j), -1);
    }

    /* JADX INFO: renamed from: j0 */
    public void m203544j0(long j) {
        m203499a(sgw.m184137a(new byte[]{67, 18, 80, 69, 21, 57, 68, 15, 92, 82}), Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: k */
    public void m203545k(String str) {
        m203499a(sgw.m184137a(new byte[]{83, 10, 88, 82, 15, 18}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: k0 */
    public void m203546k0(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{67, 18, 94, 69, 0, 1, 85, 34, 84, 67, 0, 15, 92}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: l */
    public void m203547l(List<JSONObject> list) {
        m203499a(sgw.m184137a(new byte[]{83, 9, 95, 81, 8, 1, 69, 20, 84, 83, 62, 17, 89, 0, 88}), list, this.f186688b);
    }

    /* JADX INFO: renamed from: l0 */
    public void m203548l0(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{68, 14, 66, 83, 10}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: m */
    public void m203549m(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{83, 19, 67, 69, 4, 8, 68, 17, 88, 81, 8}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: m0 */
    public void m203550m0(List<String> list) {
        m203499a(sgw.m184137a(new byte[]{102, 43, 98, 71, 4, 5, 89, 7, 93, 113, 8, 10, 85, 84}), list, this.f186688b);
    }

    /* JADX INFO: renamed from: n */
    public void m203551n(String str) {
        m203499a(sgw.m184137a(new byte[]{84, 7, 69, 86, 37, 15, 66, 39, 82, 84, 4, 21, 67}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: n0 */
    public void m203552n0(String str) {
        m203499a(sgw.m184137a(new byte[]{66, 9, 92}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: o */
    public void m203553o(String str) {
        m203499a(sgw.m184137a(new byte[]{84, 3, 87, 86, 20, 10, 68, 57, 88, 89, 17, 19, 68, 57, 92, 82, 21, 14, 95, 2}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: o0 */
    public void m203554o0(int i) {
        m203499a(sgw.m184137a(new byte[]{70, 3, 67, 68, 8, 9, 94, 57, 82, 88, 5, 3}), Integer.valueOf(i), -1);
    }

    /* JADX INFO: renamed from: p */
    public void m203555p(String str) {
        m203499a(sgw.m184137a(new byte[]{84, 3, 71, 94, 2, 3, 111, 15, 65}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: p0 */
    public void m203556p0(String str) {
        m203499a(sgw.m184137a(new byte[]{70, 3, 67, 68, 8, 9, 94, 57, 95, 86, 12, 3}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: q */
    public void m203557q(int i) {
        m203499a(sgw.m184137a(new byte[]{84, 3, 71, 94, 2, 3, 125, 9, 69, 94, 14, 8, 99, 18, 80, 67, 4}), Integer.valueOf(i), -1);
    }

    /* JADX INFO: renamed from: q0 */
    public void m203558q0(String str) {
        m203499a(sgw.m184137a(new byte[]{70, 15, 67, 67, 20, 7, 92, 22, 80, 67, 9}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: r */
    public void m203559r(int i) {
        m203499a(sgw.m184137a(new byte[]{89, 21, 117, 82, 23, 15, 83, 3, 98, 82, 2, 19, 66, 3}), Integer.valueOf(i), -1);
    }

    /* JADX INFO: renamed from: r0 */
    public void m203560r0(String str) {
        m203499a(sgw.m184137a(new byte[]{70, 22, 95, 68, 21, 7, 68, 19, 66}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: s */
    public void m203561s(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{84, 3, 71, 94, 2, 3, 101, 21, 84, 69, 8, 8, 86, 9}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: s0 */
    public void m203562s0(String str) {
        m203499a(sgw.m184137a(new byte[]{70, 22, 95, 68, 21, 7, 68, 19, 66, 5}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: t */
    public void m203563t(String str) {
        m203499a(sgw.m184137a(new byte[]{84, 20, 92, 66, 8, 2}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: t0 */
    public void m203564t0(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{71, 15, 87, 94, 62, 2, 85, 18, 80, 94, HttpTokens.CARRIAGE_RETURN}), jSONObject, this.f186688b);
    }

    @NonNull
    public String toString() {
        return this.f186687a.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m203565u(long j) {
        m203499a(sgw.m184137a(new byte[]{85, 10, 80, 71, 18, 3, 84, 52, 84, 86, HttpTokens.CARRIAGE_RETURN, 18, 89, 11, 84}), Long.valueOf(j), -1);
    }

    /* JADX INFO: renamed from: u0 */
    public void m203566u0(List<JSONObject> list) {
        m203499a(sgw.m184137a(new byte[]{71, 15, 87, 94, 62, 10, 89, 21, 69}), list, this.f186688b);
    }

    /* JADX INFO: renamed from: v */
    public void m203567v(long j) {
        m203499a(sgw.m184137a(new byte[]{86, 15, 67, 68, 21, 52, 69, 8, 101, 94, 12, 3}), Long.valueOf(j), this.f186688b);
    }

    /* JADX INFO: renamed from: w */
    public void m203568w(String str) {
        m203499a(sgw.m184137a(new byte[]{86, 15, 67, 68, 21, 52, 69, 8, 101, 94, 12, 3, 111, 3, 73, 84, 4, 22, 68, 15, 94, 89}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: x */
    public void m203569x(JSONObject jSONObject) {
        m203499a(sgw.m184137a(new byte[]{87, 22, 68, 126, 15, 0, 95}), jSONObject, this.f186688b);
    }

    /* JADX INFO: renamed from: y */
    public void m203570y(String str) {
        m203499a(sgw.m184137a(new byte[]{87, 31, 67, 88, 18, 5, 95, 22, 84}), str, this.f186688b);
    }

    /* JADX INFO: renamed from: z */
    public void m203571z(int i) {
        m203499a(sgw.m184137a(new byte[]{88, 9, 94, 92}), Integer.valueOf(i), -1);
    }
}
