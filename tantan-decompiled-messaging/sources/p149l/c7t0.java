package p149l;

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
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c7t0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public boolean f79648a;

    /* JADX INFO: renamed from: b */
    public static int m105638b(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                exr0.m118703b();
                i = i2t0.m134096z(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                x2t0.m206869g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (xsu0.m210836m()) {
            xsu0.m210834k("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static void m105639c(zzcfz zzcfzVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcfzVar.m13598d(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                x2t0.m206869g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcfzVar.m13597c(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcfzVar.m13593B(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcfzVar.m13594C(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcfzVar.m13601f(Integer.parseInt(str5));
        }
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        int iMin;
        int iMin2;
        v5t0 v5t0Var = (v5t0) obj;
        String str = (String) map.get("action");
        if (str == null) {
            x2t0.m206869g("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numM144549b = v5t0Var.zzo() != null ? v5t0Var.zzo().m144549b() : null;
        if (numValueOf2 != null && numM144549b != null && !numValueOf2.equals(numM144549b) && !str.equals(TrackLoadSettingsAtom.TYPE)) {
            x2t0.m206868f(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numM144549b));
            return;
        }
        if (x2t0.m206872j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            x2t0.m206864b("Video GMSG: " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + jSONObject.toString());
        }
        if (OMSResourceType.background.equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                x2t0.m206869g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                v5t0Var.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                x2t0.m206869g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                x2t0.m206869g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                v5t0Var.mo13718x(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                x2t0.m206869g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i = 0;
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                x2t0.m206869g("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put("error", "missingMimeTypes");
                v5t0Var.mo13674Z("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            String[] strArrSplit = str4.split(Constants.SEPARATOR_COMMA);
            int length = strArrSplit.length;
            while (i < length) {
                String str5 = strArrSplit[i];
                map3.put(str5, zdt0.m218204a(str5.trim()));
                i++;
            }
            HashMap map4 = new HashMap();
            map4.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            v5t0Var.mo13674Z("onVideoEvent", map4);
            return;
        }
        k5t0 k5t0VarZzo = v5t0Var.zzo();
        if (k5t0VarZzo == null) {
            x2t0.m206869g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = ShareConstants.NEW_VERSION.equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = v5t0Var.getContext();
            int iM105638b = m105638b(context, map, BaseSei.f13930X, 0);
            int iM105638b2 = m105638b(context, map, BaseSei.f13931Y, 0);
            int iM105638b3 = m105638b(context, map, "w", -1);
            x6s0 x6s0Var = m7s0.f131968K3;
            if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue()) {
                iMin = iM105638b3 == -1 ? v5t0Var.zzh() : Math.min(iM105638b3, v5t0Var.zzh());
            } else {
                if (xsu0.m210836m()) {
                    xsu0.m210834k("Calculate width with original width " + iM105638b3 + ", videoHost.getVideoBoundingWidth() " + v5t0Var.zzh() + ", x " + iM105638b + ".");
                }
                iMin = Math.min(iM105638b3, v5t0Var.zzh() - iM105638b);
            }
            int i2 = iMin;
            int iM105638b4 = m105638b(context, map, "h", -1);
            if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue()) {
                iMin2 = iM105638b4 == -1 ? v5t0Var.zzg() : Math.min(iM105638b4, v5t0Var.zzg());
            } else {
                if (xsu0.m210836m()) {
                    xsu0.m210834k("Calculate height with original height " + iM105638b4 + ", videoHost.getVideoBoundingHeight() " + v5t0Var.zzg() + ", y " + iM105638b2 + ".");
                }
                iMin2 = Math.min(iM105638b4, v5t0Var.zzg() - iM105638b2);
            }
            int i3 = iMin2;
            try {
                i = Integer.parseInt((String) map.get(GameIdentity.player));
            } catch (NumberFormatException unused3) {
            }
            int i4 = i;
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || k5t0VarZzo.m144548a() != null) {
                k5t0VarZzo.m144550c(iM105638b, iM105638b2, i2, i3);
                return;
            }
            k5t0VarZzo.m144551d(iM105638b, iM105638b2, i2, i3, i4, z, new u5t0((String) map.get("flags")));
            zzcfz zzcfzVarM144548a = k5t0VarZzo.m144548a();
            if (zzcfzVarM144548a != null) {
                m105639c(zzcfzVarM144548a, map);
                return;
            }
            return;
        }
        sat0 sat0VarMo13675a = v5t0Var.mo13675a();
        if (sat0VarMo13675a != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    x2t0.m206869g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    sat0VarMo13675a.m183095t8(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    x2t0.m206869g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (FreeSpaceBox.TYPE.equals(str)) {
                sat0VarMo13675a.zzu();
                return;
            }
        }
        zzcfz zzcfzVarM144548a2 = k5t0VarZzo.m144548a();
        if (zzcfzVarM144548a2 == null) {
            HashMap map5 = new HashMap();
            map5.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            v5t0Var.mo13674Z("onVideoEvent", map5);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = v5t0Var.getContext();
            int iM105638b5 = m105638b(context2, map, BaseSei.f13930X, 0);
            float fM105638b = m105638b(context2, map, BaseSei.f13931Y, 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iM105638b5, fM105638b, 0);
            zzcfzVarM144548a2.m13592A(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                x2t0.m206869g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcfzVarM144548a2.m13620z((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                x2t0.m206869g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if ("hide".equals(str)) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131916G)).booleanValue()) {
                zzcfzVarM144548a2.setVisibility(8);
                return;
            } else {
                zzcfzVarM144548a2.setVisibility(4);
                return;
            }
        }
        if (TrackLoadSettingsAtom.TYPE.equals(str)) {
            zzcfzVarM144548a2.m13615u(numValueOf2);
            return;
        }
        if ("loadControl".equals(str)) {
            m105639c(zzcfzVarM144548a2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcfzVarM144548a2.m13616v();
                return;
            } else {
                zzcfzVarM144548a2.m13606k();
                return;
            }
        }
        if ("pause".equals(str)) {
            zzcfzVarM144548a2.m13618x();
            return;
        }
        if ("play".equals(str)) {
            zzcfzVarM144548a2.m13619y();
            return;
        }
        if ("show".equals(str)) {
            zzcfzVarM144548a2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    x2t0.m206869g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
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
                    x2t0.m206869g("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                v5t0Var.mo13653D(numValueOf.intValue());
            }
            zzcfzVarM144548a2.m13602g(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = v5t0Var.getContext();
            zzcfzVarM144548a2.m13605j(m105638b(context3, map, "dx", 0), m105638b(context3, map, "dy", 0));
            if (this.f79648a) {
                return;
            }
            v5t0Var.zzu();
            this.f79648a = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                zzcfzVarM144548a2.m13611q();
                return;
            } else {
                x2t0.m206869g("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            x2t0.m206869g("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcfzVarM144548a2.m13604i(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            x2t0.m206869g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
