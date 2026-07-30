package com.momo.piplineext.http;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.jetty.http.MimeTypes;
import p149l.d0f;
import p149l.dix;
import p149l.dyx;
import p149l.eyx;
import p149l.igf0;
import p149l.imx;
import p149l.se2;
import p149l.wtc0;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class HttpWrapper {
    private static final String URL_OF_CREATECHANNEL = "https://schedule-media.immomo.com/v1/paas/media/self_developed_mix/create_channel";
    private static final String URL_OF_DESTORYECHANNEL = "https://schedule-media.immomo.com/v1/paas/media/self_developed_mix/destory_channel";
    private static final String URL_OF_UPDATEECHANNEL = "https://schedule-media.immomo.com/v1/paas/media/self_developed_mix/update_channel";
    private List<String> MIXINFO_LIST;

    /* JADX INFO: renamed from: com.momo.piplineext.http.HttpWrapper$a */
    public class C4095a extends wtc0<se2> {
        public C4095a() {
        }

        @Override // p149l.wtc0
        public void onError(int i, String str, String str2) {
            eyx.m118802c().m118808g("URL_OF_CREATECHANNEL ec:" + i + ",em:" + str + ",body:" + str2);
            super.onError(i, str, str2);
        }

        @Override // p149l.wtc0
        public void onSuccess(int i, se2 se2Var, String str) {
            super.onSuccess(i, se2Var, str);
            eyx.m118802c().m118808g("URL_OF_CREATECHANNEL onSuccess");
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.http.HttpWrapper$b */
    public class C4096b extends wtc0<se2> {
        public C4096b() {
        }

        @Override // p149l.wtc0
        public void onError(int i, String str, String str2) {
            eyx.m118802c().m118808g("URL_OF_UPDATEECHANNEL update ec:" + i + ",em:" + str + ",body:" + str2);
            super.onError(i, str, str2);
        }

        @Override // p149l.wtc0
        public void onSuccess(int i, se2 se2Var, String str) {
            super.onSuccess(i, se2Var, str);
            eyx.m118802c().m118808g("URL_OF_UPDATEECHANNEL success");
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.http.HttpWrapper$c */
    public class C4097c extends wtc0<se2> {
        public C4097c() {
        }

        @Override // p149l.wtc0
        public void onError(int i, String str, String str2) {
            eyx.m118802c().m118808g("URL_OF_DESTORYECHANNEL ec:" + i + ",em:" + str + ",body:" + str2);
            super.onError(i, str, str2);
        }

        @Override // p149l.wtc0
        public void onSuccess(int i, se2 se2Var, String str) {
            eyx.m118802c().m118808g("URL_OF_DESTORYECHANNEL success");
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.http.HttpWrapper$d */
    public static class C4098d {

        /* JADX INFO: renamed from: a */
        private static HttpWrapper f14487a = new HttpWrapper(null);
    }

    private HttpWrapper() {
        this.MIXINFO_LIST = new ArrayList();
    }

    private void genCreateList() {
        this.MIXINFO_LIST.clear();
        this.MIXINFO_LIST.add("appid");
        this.MIXINFO_LIST.add(BLivePkCategory.random);
        this.MIXINFO_LIST.add(UserId.TYPE);
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
        this.MIXINFO_LIST.add(BLivePkCategory.random);
        this.MIXINFO_LIST.add(UserId.TYPE);
        this.MIXINFO_LIST.add("time");
        this.MIXINFO_LIST.add("secret");
        this.MIXINFO_LIST.add("rmid");
        this.MIXINFO_LIST.add("provider");
        this.MIXINFO_LIST.add("channelid");
        this.MIXINFO_LIST.add("body");
        Collections.sort(this.MIXINFO_LIST);
    }

    public static HttpWrapper getInstance() {
        return C4098d.f14487a;
    }

    public void createChannel(String str, String str2, int i, String str3, String str4, String str5, MixInfoBean mixInfoBean, String str6, String str7, String str8, int i2) {
        String str9 = "";
        try {
            ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
            concurrentHashMap.clear();
            concurrentHashMap.put("appid", str);
            concurrentHashMap.put("secret", str2);
            concurrentHashMap.put(UserId.TYPE, "" + i);
            concurrentHashMap.put(BLivePkCategory.random, String.valueOf(imx.m137112s()));
            concurrentHashMap.put("time", String.valueOf(dyx.m114098a().m114099b() / 1000));
            concurrentHashMap.put("provider", "mixprovider");
            concurrentHashMap.put("rmid", str4);
            concurrentHashMap.put("channelid", TextUtils.isEmpty(str5) ? "" : str5);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mixInfo", (Object) mixInfoBean);
            jSONObject.put("appid", (Object) str);
            jSONObject.put("rtcprovider", (Object) str7);
            jSONObject.put(UserId.TYPE, (Object) ("" + i));
            jSONObject.put("rmid", (Object) (TextUtils.isEmpty(str4) ? "" : str4));
            jSONObject.put("biz", (Object) Integer.valueOf(i2));
            jSONObject.put("mmid", (Object) ("" + str3));
            jSONObject.put("channelid", (Object) (TextUtils.isEmpty(str5) ? "" : str5));
            if (!TextUtils.isEmpty(str8)) {
                str9 = str8;
            }
            jSONObject.put("sei", (Object) str9);
            concurrentHashMap.put("body", jSONObject.toJSONString());
            eyx.m118802c().m118808g("createChannel" + jSONObject.toJSONString());
            genCreateList();
            post(URL_OF_CREATECHANNEL, str6, str, str2, str3, str4, concurrentHashMap, new C4095a());
        } catch (Exception unused) {
        }
    }

    public void destoryChannel(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, int i2) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("appid", str);
        concurrentHashMap.put("secret", str2);
        concurrentHashMap.put(UserId.TYPE, "" + i);
        concurrentHashMap.put(BLivePkCategory.random, String.valueOf(imx.m137112s()));
        concurrentHashMap.put("time", String.valueOf(dyx.m114098a().m114099b() / 1000));
        concurrentHashMap.put("provider", "mixprovider");
        concurrentHashMap.put("rmid", str4);
        String str8 = str5;
        concurrentHashMap.put("channelid", str8);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rtcprovider", (Object) str7);
        jSONObject.put("appid", (Object) str);
        jSONObject.put(UserId.TYPE, (Object) ("" + i));
        jSONObject.put("rmid", (Object) (TextUtils.isEmpty(str4) ? "" : str4));
        jSONObject.put("mmid", (Object) str3);
        if (TextUtils.isEmpty(str8)) {
            str8 = "";
        }
        jSONObject.put("channelid", (Object) str8);
        jSONObject.put("biz", (Object) Integer.valueOf(i2));
        concurrentHashMap.put("body", jSONObject.toJSONString());
        eyx.m118802c().m118808g("destoryChannle:" + jSONObject.toJSONString());
        genSLAList();
        post(URL_OF_DESTORYECHANNEL, str6, str, str2, str3, str4, concurrentHashMap, new C4097c());
    }

    public void post(String str, String str2, String str3, String str4, String str5, String str6, ConcurrentHashMap<String, String> concurrentHashMap, wtc0<se2> wtc0Var) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.MIXINFO_LIST.iterator();
        while (it.hasNext()) {
            sb.append(concurrentHashMap.get(it.next()));
        }
        concurrentHashMap.put("sign", d0f.m109479c(sb.toString()));
        concurrentHashMap.remove("secret");
        HashMap map = new HashMap();
        map.put("User-Agent", dix.m111940d().m111947g(str3));
        map.put("Content-Type", MimeTypes.FORM_ENCODED);
        map.put("x-forwarded-for", "172.16.232.161");
        new igf0(str, concurrentHashMap, map).m185438g(wtc0Var);
    }

    public void updateChannel(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("appid", str);
        concurrentHashMap.put("secret", str2);
        concurrentHashMap.put(UserId.TYPE, "" + i);
        concurrentHashMap.put(BLivePkCategory.random, String.valueOf(imx.m137112s()));
        concurrentHashMap.put("time", String.valueOf(dyx.m114098a().m114099b() / 1000));
        concurrentHashMap.put("provider", "mixprovider");
        concurrentHashMap.put("rmid", str4);
        String str10 = str5;
        concurrentHashMap.put("channelid", str10);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sei", (Object) str7);
        jSONObject.put("rtcprovider", (Object) str8);
        jSONObject.put("appid", (Object) str);
        jSONObject.put(UserId.TYPE, (Object) ("" + i));
        jSONObject.put("biz", (Object) Integer.valueOf(i2));
        jSONObject.put("mmid", (Object) str3);
        jSONObject.put("rmid", (Object) (TextUtils.isEmpty(str4) ? "" : str4));
        if (TextUtils.isEmpty(str10)) {
            str10 = "";
        }
        jSONObject.put("channelid", (Object) str10);
        jSONObject.put("pushUrl", (Object) str9);
        concurrentHashMap.put("body", JSON.toJSONString(jSONObject));
        eyx.m118802c().m118808g("updateChannle" + jSONObject.toJSONString());
        genSLAList();
        post(URL_OF_UPDATEECHANNEL, str6, str, str2, str3, str4, concurrentHashMap, new C4096b());
    }

    public /* synthetic */ HttpWrapper(C4095a c4095a) {
        this();
    }
}
