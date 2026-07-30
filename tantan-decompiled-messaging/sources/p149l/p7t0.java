package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.live.base.data.AuctionState;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class p7t0 implements vgs0 {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Integer m167771b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            x2t0.m206869g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        o7t0 r7t0Var;
        int i;
        v5t0 v5t0Var = (v5t0) obj;
        if (x2t0.m206872j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            x2t0.m206864b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        h7t0<g7t0> h7t0VarM199061A = vny0.m199061A();
        if (map.containsKey(AuctionState.abort)) {
            if (h7t0VarM199061A.m129795g(v5t0Var)) {
                return;
            }
            x2t0.m206869g("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numM167771b = m167771b(map, "periodicReportIntervalMs");
        Integer numM167771b2 = m167771b(map, "exoPlayerRenderingIntervalMs");
        Integer numM167771b3 = m167771b(map, "exoPlayerIdleIntervalMs");
        u5t0 u5t0Var = new u5t0((String) map.get("flags"));
        boolean z = u5t0Var.f174768l;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            g7t0 g7t0VarM129792a = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i = 0;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            strArr2[i2] = jSONArray.getString(i2);
                        } catch (JSONException unused) {
                            x2t0.m206869g("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i] = str;
            }
            if (z) {
                for (g7t0 g7t0Var : h7t0VarM199061A) {
                    if (g7t0Var.f101432c == v5t0Var && str.equals(g7t0Var.m124733e())) {
                        g7t0VarM129792a = g7t0Var;
                        break;
                    }
                }
            } else {
                g7t0VarM129792a = h7t0VarM199061A.m129792a(v5t0Var);
            }
            if (g7t0VarM129792a != null) {
                x2t0.m206869g("Precache task is already running.");
                return;
            }
            if (v5t0Var.zzj() == null) {
                x2t0.m206869g("Precache requires a dependency provider.");
                return;
            }
            Integer numM167771b4 = m167771b(map, GameIdentity.player);
            if (numM167771b4 == null) {
                numM167771b4 = Integer.valueOf(i);
            }
            if (numM167771b != null) {
                v5t0Var.mo13653D(numM167771b.intValue());
            }
            if (numM167771b2 != null) {
                v5t0Var.mo13690h0(numM167771b2.intValue());
            }
            if (numM167771b3 != null) {
                v5t0Var.mo13686f0(numM167771b3.intValue());
            }
            int iIntValue = numM167771b4.intValue();
            a7t0 a7t0Var = v5t0Var.zzj().f201011b;
            if (iIntValue > 0) {
                int i3 = u5t0Var.f174764h;
                int iM153150Q = m5t0.m153150Q();
                r7t0Var = iM153150Q < i3 ? new h8t0(v5t0Var, u5t0Var) : iM153150Q < u5t0Var.f174758b ? new e8t0(v5t0Var, u5t0Var) : new c8t0(v5t0Var);
            } else {
                r7t0Var = new r7t0(v5t0Var);
            }
            new g7t0(v5t0Var, r7t0Var, str, strArr).mo124731b();
        } else {
            g7t0 g7t0VarM129792a2 = h7t0VarM199061A.m129792a(v5t0Var);
            if (g7t0VarM129792a2 == null) {
                x2t0.m206869g("Precache must specify a source.");
                return;
            }
            r7t0Var = g7t0VarM129792a2.f101433d;
        }
        Integer numM167771b5 = m167771b(map, "minBufferMs");
        if (numM167771b5 != null) {
            r7t0Var.mo129901t(numM167771b5.intValue());
        }
        Integer numM167771b6 = m167771b(map, "maxBufferMs");
        if (numM167771b6 != null) {
            r7t0Var.mo129900s(numM167771b6.intValue());
        }
        Integer numM167771b7 = m167771b(map, "bufferForPlaybackMs");
        if (numM167771b7 != null) {
            r7t0Var.mo129898q(numM167771b7.intValue());
        }
        Integer numM167771b8 = m167771b(map, "bufferForPlaybackAfterRebufferMs");
        if (numM167771b8 != null) {
            r7t0Var.mo129899r(numM167771b8.intValue());
        }
    }
}
