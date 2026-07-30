package p153l;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.internal.ads.zzcfz;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class igt0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public boolean f114813a;

    /* JADX INFO: renamed from: b */
    public static int m139956b(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                k6s0.m148569b();
                i = obt0.m167049z(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                dct0.m115298g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (d2v0.m113739m()) {
            d2v0.m113737k("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static void m139957c(zzcfz zzcfzVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcfzVar.m13652d(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                dct0.m115298g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcfzVar.m13651c(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcfzVar.m13647B(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcfzVar.m13648C(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcfzVar.m13655f(Integer.parseInt(str5));
        }
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        int iMin;
        int iMin2;
        bft0 bft0Var = (bft0) obj;
        String str = (String) map.get("action");
        if (str == null) {
            dct0.m115298g("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numM176269b = bft0Var.zzo() != null ? bft0Var.zzo().m176269b() : null;
        if (numValueOf2 != null && numM176269b != null && !numValueOf2.equals(numM176269b) && !str.equals(TrackLoadSettingsAtom.TYPE)) {
            dct0.m115297f(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numM176269b));
            return;
        }
        if (dct0.m115301j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            dct0.m115293b("Video GMSG: " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + jSONObject.toString());
        }
        if (OMSResourceType.background.equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                dct0.m115298g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                bft0Var.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                dct0.m115298g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                dct0.m115298g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                bft0Var.mo13772x(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                dct0.m115298g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i = 0;
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                dct0.m115298g("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put("error", "missingMimeTypes");
                bft0Var.mo13728Z("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            String[] strArrSplit = str4.split(Constants.SEPARATOR_COMMA);
            int length = strArrSplit.length;
            while (i < length) {
                String str5 = strArrSplit[i];
                map3.put(str5, fnt0.m126381a(str5.trim()));
                i++;
            }
            HashMap map4 = new HashMap();
            map4.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            bft0Var.mo13728Z("onVideoEvent", map4);
            return;
        }
        qet0 qet0VarZzo = bft0Var.zzo();
        if (qet0VarZzo == null) {
            dct0.m115298g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = ShareConstants.NEW_VERSION.equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = bft0Var.getContext();
            int iM139956b = m139956b(context, map, BaseSei.f14624X, 0);
            int iM139956b2 = m139956b(context, map, BaseSei.f14625Y, 0);
            int iM139956b3 = m139956b(context, map, "w", -1);
            dgs0 dgs0Var = sgs0.f168039K3;
            if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue()) {
                iMin = iM139956b3 == -1 ? bft0Var.zzh() : Math.min(iM139956b3, bft0Var.zzh());
            } else {
                if (d2v0.m113739m()) {
                    d2v0.m113737k("Calculate width with original width " + iM139956b3 + ", videoHost.getVideoBoundingWidth() " + bft0Var.zzh() + ", x " + iM139956b + ".");
                }
                iMin = Math.min(iM139956b3, bft0Var.zzh() - iM139956b);
            }
            int i2 = iMin;
            int iM139956b4 = m139956b(context, map, "h", -1);
            if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue()) {
                iMin2 = iM139956b4 == -1 ? bft0Var.zzg() : Math.min(iM139956b4, bft0Var.zzg());
            } else {
                if (d2v0.m113739m()) {
                    d2v0.m113737k("Calculate height with original height " + iM139956b4 + ", videoHost.getVideoBoundingHeight() " + bft0Var.zzg() + ", y " + iM139956b2 + ".");
                }
                iMin2 = Math.min(iM139956b4, bft0Var.zzg() - iM139956b2);
            }
            int i3 = iMin2;
            try {
                i = Integer.parseInt((String) map.get(GameIdentity.player));
            } catch (NumberFormatException unused3) {
            }
            int i4 = i;
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || qet0VarZzo.m176268a() != null) {
                qet0VarZzo.m176270c(iM139956b, iM139956b2, i2, i3);
                return;
            }
            qet0VarZzo.m176271d(iM139956b, iM139956b2, i2, i3, i4, z, new aft0((String) map.get("flags")));
            zzcfz zzcfzVarM176268a = qet0VarZzo.m176268a();
            if (zzcfzVarM176268a != null) {
                m139957c(zzcfzVarM176268a, map);
                return;
            }
            return;
        }
        yjt0 yjt0VarMo13729a = bft0Var.mo13729a();
        if (yjt0VarMo13729a != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    dct0.m115298g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    yjt0VarMo13729a.m216433t8(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    dct0.m115298g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (FreeSpaceBox.TYPE.equals(str)) {
                yjt0VarMo13729a.zzu();
                return;
            }
        }
        zzcfz zzcfzVarM176268a2 = qet0VarZzo.m176268a();
        if (zzcfzVarM176268a2 == null) {
            HashMap map5 = new HashMap();
            map5.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            bft0Var.mo13728Z("onVideoEvent", map5);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = bft0Var.getContext();
            int iM139956b5 = m139956b(context2, map, BaseSei.f14624X, 0);
            float fM139956b = m139956b(context2, map, BaseSei.f14625Y, 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iM139956b5, fM139956b, 0);
            zzcfzVarM176268a2.m13646A(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                dct0.m115298g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcfzVarM176268a2.m13674z((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                dct0.m115298g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if ("hide".equals(str)) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167987G)).booleanValue()) {
                zzcfzVarM176268a2.setVisibility(8);
                return;
            } else {
                zzcfzVarM176268a2.setVisibility(4);
                return;
            }
        }
        if (TrackLoadSettingsAtom.TYPE.equals(str)) {
            zzcfzVarM176268a2.m13669u(numValueOf2);
            return;
        }
        if ("loadControl".equals(str)) {
            m139957c(zzcfzVarM176268a2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcfzVarM176268a2.m13670v();
                return;
            } else {
                zzcfzVarM176268a2.m13660k();
                return;
            }
        }
        if ("pause".equals(str)) {
            zzcfzVarM176268a2.m13672x();
            return;
        }
        if ("play".equals(str)) {
            zzcfzVarM176268a2.m13673y();
            return;
        }
        if ("show".equals(str)) {
            zzcfzVarM176268a2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    dct0.m115298g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        strArr2[i5] = jSONArray.getString(i5);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    dct0.m115298g("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                bft0Var.mo13707D(numValueOf.intValue());
            }
            zzcfzVarM176268a2.m13656g(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = bft0Var.getContext();
            zzcfzVarM176268a2.m13659j(m139956b(context3, map, "dx", 0), m139956b(context3, map, "dy", 0));
            if (this.f114813a) {
                return;
            }
            bft0Var.zzu();
            this.f114813a = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                zzcfzVarM176268a2.m13665q();
                return;
            } else {
                dct0.m115298g("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            dct0.m115298g("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcfzVarM176268a2.m13658i(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            dct0.m115298g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
