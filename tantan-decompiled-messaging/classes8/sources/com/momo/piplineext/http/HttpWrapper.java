package com.momo.piplineext.http;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l.d0f;
import l.dix;
import l.dyx;
import l.eyx;
import l.igf0;
import l.imx;
import l.se2;
import l.wtc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class HttpWrapper {
    private static final String URL_OF_CREATECHANNEL = "https://schedule-media.immomo.com/v1/paas/media/self_developed_mix/create_channel";
    private static final String URL_OF_DESTORYECHANNEL = "https://schedule-media.immomo.com/v1/paas/media/self_developed_mix/destory_channel";
    private static final String URL_OF_UPDATEECHANNEL = "https://schedule-media.immomo.com/v1/paas/media/self_developed_mix/update_channel";
    private List<String> MIXINFO_LIST;

    /* JADX INFO: renamed from: com.momo.piplineext.http.HttpWrapper$a */
    public class C0007a extends wtc0<se2> {
        public C0007a() {
        }

        public void onError(int i, String str, String str2) {
            eyx.c().g(new Object[]{"URL_OF_CREATECHANNEL ec:" + i + ",em:" + str + ",body:" + str2});
            super.onError(i, str, str2);
        }

        public void onSuccess(int i, se2 se2Var, String str) {
            super.onSuccess(i, se2Var, str);
            eyx.c().g(new Object[]{"URL_OF_CREATECHANNEL onSuccess"});
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.http.HttpWrapper$b */
    public class C0008b extends wtc0<se2> {
        public C0008b() {
        }

        public void onError(int i, String str, String str2) {
            eyx.c().g(new Object[]{"URL_OF_UPDATEECHANNEL update ec:" + i + ",em:" + str + ",body:" + str2});
            super.onError(i, str, str2);
        }

        public void onSuccess(int i, se2 se2Var, String str) {
            super.onSuccess(i, se2Var, str);
            eyx.c().g(new Object[]{"URL_OF_UPDATEECHANNEL success"});
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.http.HttpWrapper$c */
    public class C0009c extends wtc0<se2> {
        public C0009c() {
        }

        public void onError(int i, String str, String str2) {
            eyx.c().g(new Object[]{"URL_OF_DESTORYECHANNEL ec:" + i + ",em:" + str + ",body:" + str2});
            super.onError(i, str, str2);
        }

        public void onSuccess(int i, se2 se2Var, String str) {
            eyx.c().g(new Object[]{"URL_OF_DESTORYECHANNEL success"});
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.http.HttpWrapper$d */
    public static class C0010d {

        /* JADX INFO: renamed from: a */
        private static HttpWrapper f186a = new HttpWrapper(null);
    }

    private HttpWrapper() {
        this.MIXINFO_LIST = new ArrayList();
    }

    private void genCreateList() {
        this.MIXINFO_LIST.clear();
        this.MIXINFO_LIST.add("appid");
        this.MIXINFO_LIST.add("random");
        this.MIXINFO_LIST.add("userid");
        this.MIXINFO_LIST.add("time");
        this.MIXINFO_LIST.add("secret");
        this.MIXINFO_LIST.add("rmid");
        this.MIXINFO_LIST.add("provider");
        this.MIXINFO_LIST.add("channelid");
        this.MIXINFO_LIST.add("body");
        Collections.sort(this.MIXINFO_LIST);
    }

    private void genSLAList() {
        this.MIXINFO_LIST.clear();
        this.MIXINFO_LIST.add("appid");
        this.MIXINFO_LIST.add("random");
        this.MIXINFO_LIST.add("userid");
        this.MIXINFO_LIST.add("time");
        this.MIXINFO_LIST.add("secret");
        this.MIXINFO_LIST.add("rmid");
        this.MIXINFO_LIST.add("provider");
        this.MIXINFO_LIST.add("channelid");
        this.MIXINFO_LIST.add("body");
        Collections.sort(this.MIXINFO_LIST);
    }

    public static HttpWrapper getInstance() {
        return C0010d.f186a;
    }

    public void createChannel(String str, String str2, int i, String str3, String str4, String str5, MixInfoBean mixInfoBean, String str6, String str7, String str8, int i2) {
        String str9 = "";
        try {
            ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
            concurrentHashMap.clear();
            concurrentHashMap.put("appid", str);
            concurrentHashMap.put("secret", str2);
            concurrentHashMap.put("userid", "" + i);
            concurrentHashMap.put("random", String.valueOf(imx.s()));
            concurrentHashMap.put("time", String.valueOf(dyx.a().b() / 1000));
            concurrentHashMap.put("provider", "mixprovider");
            concurrentHashMap.put("rmid", str4);
            concurrentHashMap.put("channelid", TextUtils.isEmpty(str5) ? "" : str5);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mixInfo", mixInfoBean);
            jSONObject.put("appid", str);
            jSONObject.put("rtcprovider", str7);
            jSONObject.put("userid", "" + i);
            jSONObject.put("rmid", TextUtils.isEmpty(str4) ? "" : str4);
            jSONObject.put("biz", Integer.valueOf(i2));
            jSONObject.put("mmid", "" + str3);
            jSONObject.put("channelid", TextUtils.isEmpty(str5) ? "" : str5);
            if (!TextUtils.isEmpty(str8)) {
                str9 = str8;
            }
            jSONObject.put("sei", str9);
            concurrentHashMap.put("body", jSONObject.toJSONString());
            eyx.c().g(new Object[]{"createChannel" + jSONObject.toJSONString()});
            genCreateList();
            post(URL_OF_CREATECHANNEL, str6, str, str2, str3, str4, concurrentHashMap, new C0007a());
        } catch (Exception unused) {
        }
    }

    public void destoryChannel(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, int i2) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("appid", str);
        concurrentHashMap.put("secret", str2);
        concurrentHashMap.put("userid", "" + i);
        concurrentHashMap.put("random", String.valueOf(imx.s()));
        concurrentHashMap.put("time", String.valueOf(dyx.a().b() / 1000));
        concurrentHashMap.put("provider", "mixprovider");
        concurrentHashMap.put("rmid", str4);
        String str8 = str5;
        concurrentHashMap.put("channelid", str8);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rtcprovider", str7);
        jSONObject.put("appid", str);
        jSONObject.put("userid", "" + i);
        jSONObject.put("rmid", TextUtils.isEmpty(str4) ? "" : str4);
        jSONObject.put("mmid", str3);
        if (TextUtils.isEmpty(str8)) {
            str8 = "";
        }
        jSONObject.put("channelid", str8);
        jSONObject.put("biz", Integer.valueOf(i2));
        concurrentHashMap.put("body", jSONObject.toJSONString());
        eyx.c().g(new Object[]{"destoryChannle:" + jSONObject.toJSONString()});
        genSLAList();
        post(URL_OF_DESTORYECHANNEL, str6, str, str2, str3, str4, concurrentHashMap, new C0009c());
    }

    public void post(String str, String str2, String str3, String str4, String str5, String str6, ConcurrentHashMap<String, String> concurrentHashMap, wtc0<se2> wtc0Var) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.MIXINFO_LIST.iterator();
        while (it.hasNext()) {
            sb.append(concurrentHashMap.get(it.next()));
        }
        concurrentHashMap.put("sign", d0f.c(sb.toString()));
        concurrentHashMap.remove("secret");
        HashMap map = new HashMap();
        map.put("User-Agent", dix.d().g(str3));
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("x-forwarded-for", "172.16.232.161");
        new igf0(str, concurrentHashMap, map).g(wtc0Var);
    }

    public void updateChannel(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("appid", str);
        concurrentHashMap.put("secret", str2);
        concurrentHashMap.put("userid", "" + i);
        concurrentHashMap.put("random", String.valueOf(imx.s()));
        concurrentHashMap.put("time", String.valueOf(dyx.a().b() / 1000));
        concurrentHashMap.put("provider", "mixprovider");
        concurrentHashMap.put("rmid", str4);
        String str10 = str5;
        concurrentHashMap.put("channelid", str10);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sei", str7);
        jSONObject.put("rtcprovider", str8);
        jSONObject.put("appid", str);
        jSONObject.put("userid", "" + i);
        jSONObject.put("biz", Integer.valueOf(i2));
        jSONObject.put("mmid", str3);
        jSONObject.put("rmid", TextUtils.isEmpty(str4) ? "" : str4);
        if (TextUtils.isEmpty(str10)) {
            str10 = "";
        }
        jSONObject.put("channelid", str10);
        jSONObject.put("pushUrl", str9);
        concurrentHashMap.put("body", JSON.toJSONString(jSONObject));
        eyx.c().g(new Object[]{"updateChannle" + jSONObject.toJSONString()});
        genSLAList();
        post(URL_OF_UPDATEECHANNEL, str6, str, str2, str3, str4, concurrentHashMap, new C0008b());
    }

    public /* synthetic */ HttpWrapper(C0007a c0007a) {
        this();
    }
}
