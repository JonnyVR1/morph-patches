package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.google.gson.Gson;
import com.heytap.mcssdk.mode.CommandMessage;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import immomo.com.mklibrary.fep.download.OfflineMkRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/k400;", "Ll/cql;", "<init>", "()V", "Lorg/json/JSONArray;", "jsonArray", "", "Ll/esj0;", "c", "(Lorg/json/JSONArray;)Ljava/util/List;", "Ljava/util/ArrayList;", "Ll/v750;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "()Ljava/util/ArrayList;", "", "", CommandMessage.PARAMS, "", "b", "(Ljava/util/Map;)V", "Ll/y750;", "offlineResponse", "a", "(Ll/y750;)V", "Ljava/lang/String;", "TAG", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class k400 implements cql {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = "MkDownload";

    /* JADX INFO: renamed from: c */
    private final List<esj0> m144462c(JSONArray jsonArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            esj0 esj0VarM117908a = esj0.m117908a(jsonArray.getJSONObject(i));
            esj0VarM117908a.getClass();
            arrayList.add(esj0VarM117908a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private final ArrayList<v750> m144463d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        kiw kiwVarM146150f = kiw.m146150f();
        ArrayList<v750> arrayList = new ArrayList<>();
        File fileM164475m = ohw.m164475m();
        if (fileM164475m != null && fileM164475m.isDirectory()) {
            File[] fileArrListFiles = fileM164475m.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                MDLog.m7389d(this.TAG, "----离线包为 " + fileArrListFiles.length);
                try {
                    for (File file : fileArrListFiles) {
                        if (file != null && file.isDirectory() && file.exists()) {
                            String name = file.getName();
                            MDLog.m7389d(this.TAG, "-----准备读取离线包信息 " + name);
                            if (TextUtils.isEmpty(name)) {
                                MDLog.m7389d(this.TAG, "----读取了临时包，跳过");
                            } else {
                                name.getClass();
                                String str = ohw.f144066m;
                                str.getClass();
                                if (StringsKt.m93436c0(name, str, 0, false, 6, null) >= 0) {
                                    MDLog.m7389d(this.TAG, "----读取了临时包，跳过");
                                } else {
                                    v750 v750Var = new v750(name);
                                    File fileM217437h = z750.m217437h(name);
                                    fileM217437h.getClass();
                                    v750Var.m197342h(fileM217437h.getAbsolutePath());
                                    if (v750Var.f180303c == null) {
                                        MDLog.m7389d(this.TAG, "-----不存在离线包配置");
                                    } else {
                                        n460 n460VarM146155i = kiwVarM146150f.m146155i(name);
                                        if (n460VarM146155i == null) {
                                            n460VarM146155i = new n460(name);
                                        }
                                        v750Var.m197347m(n460VarM146155i);
                                        arrayList.add(v750Var);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    MDLog.printErrStackTrace(this.TAG, e);
                }
                MDLog.m7389d(this.TAG, "-----读取所有离线包的信息：耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "  读取到的离线包列表数量有 " + arrayList.size());
                return arrayList;
            }
            MDLog.m7389d(this.TAG, "----离线包目录为空");
        }
        return arrayList;
    }

    @Override // p149l.cql
    /* JADX INFO: renamed from: a */
    public void mo108277a(@NotNull y750 offlineResponse) throws JSONException {
        offlineResponse.getClass();
        JSONArray downloadMk = offlineResponse.getDownloadMk();
        if (downloadMk != null) {
            List<esj0> listM144462c = m144462c(downloadMk);
            mxv.m156931f(false);
            yhw.m214862s().m214869m(listM144462c);
        }
        MDLog.m7395i("OfflineDownloader", "mk start download");
    }

    @Override // p149l.cql
    /* JADX INFO: renamed from: b */
    public void mo108278b(@NotNull Map<String, String> params) {
        params.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList<v750> arrayListM144463d = m144463d();
        if (arrayListM144463d != null) {
            for (v750 v750Var : arrayListM144463d) {
                OfflineMkRequest offlineMkRequest = new OfflineMkRequest();
                String str = v750Var.f180301a;
                if (str == null) {
                    str = "";
                }
                offlineMkRequest.setBid(str);
                offlineMkRequest.setVersion(String.valueOf(v750Var.m197340f()));
                arrayList.add(offlineMkRequest);
            }
        }
        try {
            String json = arrayList.size() > 0 ? new Gson().toJson(arrayList) : WeJson.EMPTY_ARR;
            json.getClass();
            params.put("mkVersion", json);
        } catch (Throwable th) {
            MDLog.printErrStackTrace(this.TAG, th);
        }
        MDLog.m7395i("OfflineDownloader", "mk build finished");
    }
}
