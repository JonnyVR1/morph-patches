package immomo.com.mklibrary.fep.download;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p149l.cql;
import p149l.d4e;
import p149l.gsd;
import p149l.jh3;
import p149l.ppb;
import p149l.qkq0;
import p149l.t1k;
import p149l.uwp;
import p149l.x750;
import p149l.y750;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\u00002\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\r\"\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m87232d2 = {"Limmomo/com/mklibrary/fep/download/PreOfflineDownloader;", "", "<init>", "()V", "Ll/y750;", "offlineResponse", "", "f", "(Ll/y750;)V", "Lorg/json/JSONObject;", LovePlanetStage.result, "g", "(Lorg/json/JSONObject;)Ll/y750;", "", "Ll/cql;", "downloader", "c", "([Ll/cql;)Limmomo/com/mklibrary/fep/download/PreOfflineDownloader;", "Ll/x750;", "call", "e", "(Ll/x750;)V", "Ll/ppb;", "coroutineScope", "", "", Constants.INAPP_DATA_TAG, "(Ll/ppb;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/util/List;", "downloaderList", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class PreOfflineDownloader {
    public static final PreOfflineDownloader INSTANCE = new PreOfflineDownloader();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final List<cql> downloaderList = new ArrayList();

    private PreOfflineDownloader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m87187f(y750 offlineResponse) {
        Iterator<T> it = downloaderList.iterator();
        while (it.hasNext()) {
            jh3.m141367d(t1k.INSTANCE, d4e.m109981b(), null, new PreOfflineDownloader$download$$inlined$forEach$lambda$1((cql) it.next(), null, offlineResponse), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final y750 m87188g(JSONObject result) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = (result == null || (jSONObjectOptJSONObject = result.optJSONObject("data")) == null) ? null : jSONObjectOptJSONObject.optJSONObject("mk_config");
        y750 y750Var = new y750();
        y750Var.m213308e(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("swBlackList") : null);
        y750Var.m213307d(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("serviceWorker") : null);
        y750Var.m213306c(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray("downloadMk") : null);
        y750Var.m213305b(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray("downloadMg") : null);
        return y750Var;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final PreOfflineDownloader m87189c(@NotNull cql... downloader) {
        downloader.getClass();
        for (cql cqlVar : downloader) {
            if (cqlVar != null) {
                downloaderList.add(cqlVar);
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object m87190d(@NotNull ppb ppbVar, @NotNull Continuation<? super Map<String, String>> continuation) throws Throwable {
        PreOfflineDownloader$build$1 preOfflineDownloader$build$1;
        PreOfflineDownloader preOfflineDownloader;
        Iterator it;
        List list;
        Map map;
        ppb ppbVar2;
        Iterable iterable;
        if (continuation instanceof PreOfflineDownloader$build$1) {
            preOfflineDownloader$build$1 = (PreOfflineDownloader$build$1) continuation;
            int i = preOfflineDownloader$build$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preOfflineDownloader$build$1.label = i - Integer.MIN_VALUE;
                preOfflineDownloader = this;
            } else {
                preOfflineDownloader = this;
                preOfflineDownloader$build$1 = new PreOfflineDownloader$build$1(preOfflineDownloader, continuation);
            }
        } else {
            preOfflineDownloader = this;
            preOfflineDownloader$build$1 = new PreOfflineDownloader$build$1(preOfflineDownloader, continuation);
        }
        Object obj = preOfflineDownloader$build$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = preOfflineDownloader$build$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = downloaderList.iterator();
            while (it2.hasNext()) {
                arrayList.add(jh3.m141365b(ppbVar, d4e.m109981b(), null, new PreOfflineDownloader$build$$inlined$forEach$lambda$1((cql) it2.next(), null, arrayList, ppbVar, linkedHashMap), 2, null));
            }
            it = arrayList.iterator();
            list = arrayList;
            map = linkedHashMap;
            ppbVar2 = ppbVar;
            iterable = arrayList;
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Iterator it3 = (Iterator) preOfflineDownloader$build$1.L$5;
            Iterable iterable2 = (Iterable) preOfflineDownloader$build$1.L$4;
            List list2 = (List) preOfflineDownloader$build$1.L$3;
            map = (Map) preOfflineDownloader$build$1.L$2;
            ppb ppbVar3 = (ppb) preOfflineDownloader$build$1.L$1;
            PreOfflineDownloader preOfflineDownloader2 = (PreOfflineDownloader) preOfflineDownloader$build$1.L$0;
            ResultKt.m87239b(obj);
            it = it3;
            preOfflineDownloader = preOfflineDownloader2;
            iterable = iterable2;
            ppbVar2 = ppbVar3;
            list = list2;
        }
        while (it.hasNext()) {
            Object next = it.next();
            gsd gsdVar = (gsd) next;
            preOfflineDownloader$build$1.L$0 = preOfflineDownloader;
            preOfflineDownloader$build$1.L$1 = ppbVar2;
            preOfflineDownloader$build$1.L$2 = map;
            preOfflineDownloader$build$1.L$3 = list;
            preOfflineDownloader$build$1.L$4 = iterable;
            preOfflineDownloader$build$1.L$5 = it;
            preOfflineDownloader$build$1.L$6 = next;
            preOfflineDownloader$build$1.L$7 = gsdVar;
            preOfflineDownloader$build$1.label = 1;
            if (gsdVar.mo127793t(preOfflineDownloader$build$1) == objM196133e) {
                return objM196133e;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public final void m87191e(@Nullable x750 call) {
        jh3.m141367d(t1k.INSTANCE, d4e.m109980a(), null, new PreOfflineDownloader$buildRequest$1(call, null), 2, null);
    }
}
