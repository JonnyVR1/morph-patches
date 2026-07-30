package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.live.base.data.AuctionState;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class vgt0 implements bqs0 {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Integer m201242b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            dct0.m115298g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        ugt0 xgt0Var;
        int i;
        bft0 bft0Var = (bft0) obj;
        if (dct0.m115301j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            dct0.m115293b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        ngt0<mgt0> ngt0VarM106915A = bxy0.m106915A();
        if (map.containsKey(AuctionState.abort)) {
            if (ngt0VarM106915A.m163010g(bft0Var)) {
                return;
            }
            dct0.m115298g("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numM201242b = m201242b(map, "periodicReportIntervalMs");
        Integer numM201242b2 = m201242b(map, "exoPlayerRenderingIntervalMs");
        Integer numM201242b3 = m201242b(map, "exoPlayerIdleIntervalMs");
        aft0 aft0Var = new aft0((String) map.get("flags"));
        boolean z = aft0Var.f71063l;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            mgt0 mgt0VarM163007a = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i = 0;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            strArr2[i2] = jSONArray.getString(i2);
                        } catch (JSONException unused) {
                            dct0.m115298g("Malformed demuxed URL list for precache: ".concat(str2));
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
                for (mgt0 mgt0Var : ngt0VarM106915A) {
                    if (mgt0Var.f136781c == bft0Var && str.equals(mgt0Var.m158379e())) {
                        mgt0VarM163007a = mgt0Var;
                        break;
                    }
                }
            } else {
                mgt0VarM163007a = ngt0VarM106915A.m163007a(bft0Var);
            }
            if (mgt0VarM163007a != null) {
                dct0.m115298g("Precache task is already running.");
                return;
            }
            if (bft0Var.zzj() == null) {
                dct0.m115298g("Precache requires a dependency provider.");
                return;
            }
            Integer numM201242b4 = m201242b(map, GameIdentity.player);
            if (numM201242b4 == null) {
                numM201242b4 = Integer.valueOf(i);
            }
            if (numM201242b != null) {
                bft0Var.mo13707D(numM201242b.intValue());
            }
            if (numM201242b2 != null) {
                bft0Var.mo13744h0(numM201242b2.intValue());
            }
            if (numM201242b3 != null) {
                bft0Var.mo13740f0(numM201242b3.intValue());
            }
            int iIntValue = numM201242b4.intValue();
            ggt0 ggt0Var = bft0Var.zzj().f98006b;
            if (iIntValue > 0) {
                int i3 = aft0Var.f71059h;
                int iM185573Q = set0.m185573Q();
                xgt0Var = iM185573Q < i3 ? new nht0(bft0Var, aft0Var) : iM185573Q < aft0Var.f71053b ? new kht0(bft0Var, aft0Var) : new iht0(bft0Var);
            } else {
                xgt0Var = new xgt0(bft0Var);
            }
            new mgt0(bft0Var, xgt0Var, str, strArr).mo96667b();
        } else {
            mgt0 mgt0VarM163007a2 = ngt0VarM106915A.m163007a(bft0Var);
            if (mgt0VarM163007a2 == null) {
                dct0.m115298g("Precache must specify a source.");
                return;
            }
            xgt0Var = mgt0VarM163007a2.f136782d;
        }
        Integer numM201242b5 = m201242b(map, "minBufferMs");
        if (numM201242b5 != null) {
            xgt0Var.mo163240t(numM201242b5.intValue());
        }
        Integer numM201242b6 = m201242b(map, "maxBufferMs");
        if (numM201242b6 != null) {
            xgt0Var.mo163239s(numM201242b6.intValue());
        }
        Integer numM201242b7 = m201242b(map, "bufferForPlaybackMs");
        if (numM201242b7 != null) {
            xgt0Var.mo163237q(numM201242b7.intValue());
        }
        Integer numM201242b8 = m201242b(map, "bufferForPlaybackAfterRebufferMs");
        if (numM201242b8 != null) {
            xgt0Var.mo163238r(numM201242b8.intValue());
        }
    }
}
