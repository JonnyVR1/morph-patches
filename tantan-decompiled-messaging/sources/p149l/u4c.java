package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.BannerFrequencyType;
import com.tantanapp.httpdns.model.DomainModel;
import com.tantanapp.httpdns.model.IpModel;
import com.tantanapp.httpdns.model.MetaModel;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class u4c {
    /* JADX INFO: renamed from: a */
    public static ArrayList<DomainModel> m191722a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).getJSONObject("data").optJSONArray("records");
            if (jSONArrayOptJSONArray != null) {
                ArrayList<DomainModel> arrayList = new ArrayList<>();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    DomainModel domainModelM191723b = m191723b(jSONArrayOptJSONArray.get(i).toString());
                    if (domainModelM191723b != null) {
                        arrayList.add(domainModelM191723b);
                    }
                }
                return arrayList;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static DomainModel m191723b(String str) {
        pxk pxkVar;
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
                pxkVar = new pxk();
                pxkVar.f151688a = jSONObjectOptJSONObject.optString("mode");
                pxkVar.f151689b = Math.max(1, jSONObjectOptJSONObject.optInt(BannerFrequencyType.interval));
                pxkVar.f151690c = jSONObjectOptJSONObject.optInt("rise");
                pxkVar.f151691d = jSONObjectOptJSONObject.optInt("fall");
                pxkVar.f151693f = jSONObjectOptJSONObject.optInt("timeout");
                pxkVar.f151692e = jSONObjectOptJSONObject.optInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
            } else {
                pxkVar = null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("addr");
            if (jSONArrayOptJSONArray2 != null) {
                arrayList = new ArrayList<>();
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    IpModel ipModel = new IpModel();
                    ipModel.f56111ip = jSONArrayOptJSONArray2.get(i).toString();
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
                    ipModel2.f56111ip = jSONArrayOptJSONArray.get(i2).toString();
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
            domainModel.healthCheckModel = pxkVar;
            d5e.m110050a("parseDomain:" + domainModel.toString());
            return domainModel;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static MetaModel m191724c(String str) {
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
            d5e.m110050a("parseMeta:" + metaModel.toString());
            return metaModel;
        } catch (JSONException unused) {
            return null;
        }
    }
}
