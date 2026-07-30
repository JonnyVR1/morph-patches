package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.BannerFrequencyType;
import com.tantanapp.httpdns.model.DomainModel;
import com.tantanapp.httpdns.model.IpModel;
import com.tantanapp.httpdns.model.MetaModel;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class c6c {
    /* JADX INFO: renamed from: a */
    public static ArrayList<DomainModel> m108124a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).getJSONObject("data").optJSONArray("records");
            if (jSONArrayOptJSONArray != null) {
                ArrayList<DomainModel> arrayList = new ArrayList<>();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    DomainModel domainModelM108125b = m108125b(jSONArrayOptJSONArray.get(i).toString());
                    if (domainModelM108125b != null) {
                        arrayList.add(domainModelM108125b);
                    }
                }
                return arrayList;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static DomainModel m108125b(String str) {
        f0l f0lVar;
        ArrayList<IpModel> arrayList;
        ArrayList<IpModel> arrayList2;
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("domain");
            int iOptInt = jSONObject.optInt("ttl");
            if (iOptInt <= 10) {
                iOptInt = 30;
            }
            String strOptString2 = jSONObject.optString("type");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("healthcheck");
            if (jSONObjectOptJSONObject != null) {
                f0lVar = new f0l();
                f0lVar.f96693a = jSONObjectOptJSONObject.optString("mode");
                f0lVar.f96694b = Math.max(1, jSONObjectOptJSONObject.optInt(BannerFrequencyType.interval));
                f0lVar.f96695c = jSONObjectOptJSONObject.optInt("rise");
                f0lVar.f96696d = jSONObjectOptJSONObject.optInt("fall");
                f0lVar.f96698f = jSONObjectOptJSONObject.optInt("timeout");
                f0lVar.f96697e = jSONObjectOptJSONObject.optInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
            } else {
                f0lVar = null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("addr");
            if (jSONArrayOptJSONArray2 != null) {
                arrayList = new ArrayList<>();
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    IpModel ipModel = new IpModel();
                    ipModel.f56959ip = jSONArrayOptJSONArray2.get(i).toString();
                    ipModel.ttl = iOptInt;
                    ipModel.domain = strOptString;
                    arrayList.add(ipModel);
                }
            } else {
                arrayList = null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("backup");
            if (jSONObjectOptJSONObject2 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("addr")) == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList<>();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    IpModel ipModel2 = new IpModel();
                    ipModel2.f56959ip = jSONArrayOptJSONArray.get(i2).toString();
                    ipModel2.ttl = iOptInt;
                    ipModel2.domain = strOptString;
                    arrayList2.add(ipModel2);
                }
            }
            DomainModel domainModel = new DomainModel();
            domainModel.domain = strOptString;
            domainModel.mainIpModelList = arrayList;
            domainModel.ttl = iOptInt;
            domainModel.type = strOptString2;
            domainModel.backupIpModelList = arrayList2;
            ArrayList<IpModel> arrayList3 = new ArrayList<>();
            if (arrayList != null) {
                arrayList3.addAll(arrayList);
            }
            if (arrayList2 != null) {
                arrayList3.addAll(arrayList2);
            }
            domainModel.totalIpModelList = arrayList3;
            domainModel.json = str;
            domainModel.healthCheckModel = f0lVar;
            r6e.m180005a("parseDomain:" + domainModel.toString());
            return domainModel;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static MetaModel m108126c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("meta");
            if (jSONObject == null) {
                return null;
            }
            MetaModel metaModel = new MetaModel();
            metaModel.msg = jSONObject.optString("msg");
            metaModel.retcode = jSONObject.optInt("retcode");
            r6e.m180005a("parseMeta:" + metaModel.toString());
            return metaModel;
        } catch (JSONException unused) {
            return null;
        }
    }
}
