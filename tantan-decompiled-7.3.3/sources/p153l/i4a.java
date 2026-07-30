package p153l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.common.thread.C3486c;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.hellogroup.fep.feppkg.model.FepPackageStatus;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001'B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, m88121d2 = {"Ll/i4a;", "Ll/qpl;", "Ll/hul;", "pMkWebview", "<init>", "(Ll/hul;)V", "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", Constants.KEY_T, "(Lorg/json/JSONObject;)V", "r", "json", "", "k", "", "b", BLiveStormDanmakuGiftResourceType.f45294s, "(Lorg/json/JSONObject;Ljava/lang/String;Z)V", "namespace", FirebaseAnalytics.Param.METHOD, "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", BLiveStormDanmakuGiftResourceType.f45292l, "()V", "Ll/ehi;", "c", "Ll/ehi;", "packageObserver", "", "Ll/jf3;", Constants.INAPP_DATA_TAG, "Ljava/util/Map;", "cacheCallbacks", "e", "Ll/hul;", "getPMkWebview", "()Ll/hul;", "Companion", "a", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class i4a extends qpl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ehi packageObserver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Map<String, jf3> cacheCallbacks;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final hul pMkWebview;

    /* JADX INFO: renamed from: l.i4a$b */
    @Metadata(m88120d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m88121d2 = {"l/i4a$b", "Ll/ehi;", "Ll/zgi;", BaseSei.INFO, "Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;", "newStatus", "", Constants.INAPP_DATA_TAG, "(Ll/zgi;Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;)V", "", "bid", "Ll/tgi;", "checkResult", "", "", "requestData", "e", "(Ljava/lang/String;Ll/tgi;Ljava/util/Map;)V", "Lcom/hellogroup/fep/base/FepLogModuleType;", "moduleType", "Lcom/hellogroup/fep/base/FepLogLevel;", FirebaseAnalytics.Param.LEVEL, "message", "extraInfo", "", "errorCode", "", "throwable", "f", "(Lcom/hellogroup/fep/base/FepLogModuleType;Lcom/hellogroup/fep/base/FepLogLevel;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Throwable;)V", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C17638b implements ehi {
        public C17638b() {
        }

        @Override // p153l.ehi
        /* JADX INFO: renamed from: d */
        public void mo17607d(@NotNull zgi info, @NotNull FepPackageStatus newStatus) {
            info.getClass();
            newStatus.getClass();
            try {
                Result.Companion companion = Result.INSTANCE;
                jf3 jf3Var = (jf3) i4a.this.cacheCallbacks.get(info.getBid() + info.getBaseVersion());
                if (jf3Var == null) {
                    jf3Var = null;
                } else if (newStatus == FepPackageStatus.Ready) {
                    jf3Var.m144657i(info.m219627j());
                    i4a.this.cacheCallbacks.remove(info.getBid() + info.getBaseVersion());
                } else if (newStatus == FepPackageStatus.Failed) {
                    jf3Var.m144656h("更新失败");
                    i4a.this.cacheCallbacks.remove(info.getBid() + info.getBaseVersion());
                }
                Result.m225066constructorimpl(jf3Var);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
        }

        @Override // p153l.ehi
        /* JADX INFO: renamed from: e */
        public void mo17608e(@NotNull String bid, @Nullable tgi checkResult, @Nullable Map<String, ? extends Object> requestData) {
            bid.getClass();
        }

        @Override // p153l.ehi
        /* JADX INFO: renamed from: f */
        public void mo17609f(@NotNull FepLogModuleType moduleType, @NotNull FepLogLevel level, @NotNull String message, @Nullable Map<String, ? extends Object> extraInfo, int errorCode, @Nullable Throwable throwable) {
            moduleType.getClass();
            level.getClass();
            message.getClass();
        }
    }

    /* JADX INFO: renamed from: l.i4a$c */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC17639c implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f112859b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ elj f112860c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f112861d;

        /* JADX INFO: renamed from: l.i4a$c$a */
        @Metadata(m88120d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"l/i4a$c$a", "Ll/okj;", "", "tag", "", "type", NotificationCompat.CATEGORY_STATUS, "", "total", "progress", "", "a", "(Ljava/lang/String;IIJJ)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "b", "(Ljava/lang/String;ILjava/lang/Exception;)V", "c", "(Ljava/lang/String;I)V", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
        public static final class a implements okj {
            public a() {
            }

            @Override // p153l.okj
            /* JADX INFO: renamed from: a */
            public void mo138410a(@NotNull String tag, int type, int status, long total, long progress) {
                tag.getClass();
            }

            @Override // p153l.okj
            /* JADX INFO: renamed from: b */
            public void mo138411b(@NotNull String tag, int type, @NotNull Exception e) {
                tag.getClass();
                e.getClass();
                RunnableC17639c runnableC17639c = RunnableC17639c.this;
                if (type == 1) {
                    i4a.this.m177463g(runnableC17639c.f112861d, glw.m130705b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{2}).toString());
                } else {
                    i4a.this.m177463g(runnableC17639c.f112861d, glw.m130705b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{1}).toString());
                }
            }

            @Override // p153l.okj
            /* JADX INFO: renamed from: c */
            public void mo138412c(@NotNull String tag, int type) {
                tag.getClass();
                if (type == 1) {
                    RunnableC17639c runnableC17639c = RunnableC17639c.this;
                    i4a.this.m177463g(runnableC17639c.f112861d, glw.m130705b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{0}).toString());
                }
            }
        }

        public RunnableC17639c(String str, elj eljVar, String str2) {
            this.f112859b = str;
            this.f112860c = eljVar;
            this.f112861d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            FepManager.Companion companion = FepManager.INSTANCE;
            FepManager fepManagerM17610a = companion.m17610a();
            String str = this.f112859b;
            str.getClass();
            zgi zgiVarM17592n = fepManagerM17610a.m17592n(str, null, null, CheckPolicy.LOCAL_ONLY);
            if (zgiVarM17592n != null) {
                companion.m17610a().m17597t(zgiVarM17592n);
            }
            if (glj.m130659g(this.f112859b, this.f112860c)) {
                i4a.this.m177463g(this.f112861d, glw.m130705b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{0}).toString());
            } else {
                flj.m126149g().m126155f(this.f112859b, this.f112860c, false, true, new a());
            }
        }
    }

    public i4a(@Nullable hul hulVar) {
        super(hulVar);
        this.pMkWebview = hulVar;
        this.packageObserver = new C17638b();
        this.cacheCallbacks = new LinkedHashMap();
        ehi ehiVar = this.packageObserver;
        if (ehiVar != null) {
            FepManager.INSTANCE.m17610a().m17599v(ehiVar);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m138407r(JSONObject params) {
        String strM130707d = glw.m130707d(params);
        JSONObject jSONObjectOptJSONObject = params.optJSONObject("resources");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = params.optString("bid");
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            JSONObject jSONObject = new JSONObject();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString2 = jSONObjectOptJSONObject.optString(next);
                if (TextUtils.isEmpty(strOptString2)) {
                    next.getClass();
                    m138408s(jSONObject, next, false);
                } else {
                    String strM96329a = a6k0.m96329a(strOptString2);
                    if (i8g0.m139002d(strOptString)) {
                        strOptString.getClass();
                        strM96329a = strOptString;
                    }
                    if (TextUtils.isEmpty(strM96329a)) {
                        next.getClass();
                        m138408s(jSONObject, next, false);
                    } else {
                        FepManager.Companion companion = FepManager.INSTANCE;
                        zgi zgiVarM17592n = companion.m17610a().m17592n(strM96329a, null, strOptString2, CheckPolicy.LOCAL_ONLY);
                        File fileM219625h = zgiVarM17592n != null ? zgiVarM17592n.m219625h() : null;
                        String strM96332f = a6k0.m96332f(strOptString2);
                        File file = new File(fileM219625h, strM96332f);
                        if (!file.exists() || file.length() <= 0) {
                            zgi zgiVarM17587h = companion.m17610a().m17587h(strM96329a, "custom", strOptString2);
                            File file2 = new File(zgiVarM17587h != null ? zgiVarM17587h.m219625h() : null, strM96332f);
                            if (!file2.exists() || file2.length() <= 0) {
                                next.getClass();
                                m138408s(jSONObject, next, false);
                            } else {
                                next.getClass();
                                m138408s(jSONObject, next, true);
                            }
                        } else {
                            next.getClass();
                            m138408s(jSONObject, next, true);
                        }
                    }
                }
            }
            m177463g(strM130707d, jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m138408s(JSONObject json, String k, boolean b) {
        try {
            json.putOpt(k, Boolean.valueOf(b));
        } catch (JSONException e) {
            jzv.m147730c(qpl.f158878b, "", e);
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m138409t(JSONObject params) {
        String strOptString = params.optString("bid");
        String strM130707d = glw.m130707d(params);
        if (TextUtils.isEmpty(strOptString)) {
            m177463g(strM130707d, glw.m130705b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{1}).toString());
            return;
        }
        elj eljVarM121227b = elj.m121227b(params);
        if (eljVarM121227b == null || !eljVarM121227b.m121228a()) {
            m177463g(strM130707d, glw.m130705b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{1}).toString());
        } else {
            C3486c.m17566d(2, new RunnableC17639c(strOptString, eljVarM121227b, strM130707d));
        }
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: l */
    public void mo121328l() {
        super.mo121328l();
        try {
            Result.Companion companion = Result.INSTANCE;
            this.cacheCallbacks.clear();
            ehi ehiVar = this.packageObserver;
            if (ehiVar != null) {
                FepManager.INSTANCE.m17610a().m17601x(ehiVar);
            }
            this.packageObserver = null;
            Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:52:0x013c  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141  */
    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@NotNull String namespace, @NotNull String method, @NotNull JSONObject params) {
        String str;
        zgi zgiVarM177462e;
        FepPackageConfig fepPackageConfigM219623f;
        String offlineType;
        String str2;
        x4d0 resourceResponse;
        namespace.getClass();
        method.getClass();
        params.getClass();
        String strM130707d = glw.m130707d(params);
        String strConcat = null;
        switch (method) {
            case "update":
                jzv.m147728a(qpl.f158878b, "强制更新 " + params);
                String strOptString = params.optString("bid");
                String strOptString2 = params.optString("url");
                if (strOptString2 == null || StringsKt.m94329e0(strOptString2)) {
                    strOptString2 = params.optString("zip_url");
                }
                String strM114836a = d8g0.m114836a(params.optString("newest_version"));
                jf3.C17939b c17939bM144660c = new jf3.C17939b().m144662e(this.f158879a).m144661d(strM130707d).m144663f(0).m144664g("更新成功").m144659b(1).m144660c("更新失败");
                String strM144902a = jhi.m144902a(strM114836a);
                jf3 jf3VarM144658a = c17939bM144660c.m144658a();
                jf3VarM144658a.getClass();
                this.cacheCallbacks.put(strOptString + strM144902a, jf3VarM144658a);
                FepManager fepManagerM17610a = FepManager.INSTANCE.m17610a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("bid", d8g0.m114836a(strOptString));
                linkedHashMap.put("newest_version", strM114836a);
                linkedHashMap.put("zip_url", d8g0.m114836a(strOptString2));
                fepManagerM17610a.m17596s(CollectionsKt.arrayListOf(linkedHashMap));
            case "clearCache":
                FepManager.INSTANCE.m17610a().m17584e();
                m177464h(strM130707d, null, "删除成功", "0");
            case "removeCache":
                String strOptString3 = params.optString("bid");
                String strOptString4 = params.optString("baseVersion");
                FepManager fepManagerM17610a2 = FepManager.INSTANCE.m17610a();
                strOptString3.getClass();
                fepManagerM17610a2.m17600w(strOptString3, strOptString4);
                m177463g(strM130707d, glw.m130705b(new String[]{NotificationCompat.CATEGORY_STATUS, "message"}, new String[]{"0", "删除成功"}).toString());
            case "isResourceOfflined":
                m138407r(params);
            case "getOfflineType":
                String strOptString5 = params.optString("bid");
                String strOptString6 = params.optString("baseVersion");
                hul hulVar = this.f158879a;
                hulVar.getClass();
                x4d0 resourceResponse2 = hulVar.getResourceResponse();
                if (resourceResponse2 != null) {
                    strOptString5.getClass();
                    String strM209306c = resourceResponse2.m209306c(strOptString5);
                    if (strM209306c != null) {
                        strConcat = strM209306c;
                    } else {
                        if (strOptString6 != null || strOptString6.length() == 0) {
                            str = null;
                        } else {
                            str = strOptString6;
                        }
                        if (str != null) {
                            strConcat = "https://v-/".concat(str);
                        }
                    }
                } else {
                    if (strOptString6 != null || strOptString6.length() == 0) {
                        str = strOptString6;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        strConcat = "https://v-/".concat(str);
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strOptString5);
                String str3 = NotificationStatus.undefined;
                if (!zIsEmpty && (zgiVarM177462e = m177462e(strConcat, strOptString5, strOptString6, CheckPolicy.LOCAL_ONLY)) != null && (fepPackageConfigM219623f = zgiVarM177462e.m219623f()) != null && (offlineType = fepPackageConfigM219623f.getOfflineType()) != null) {
                    str3 = offlineType;
                }
                m177463g(strM130707d, glw.m130705b(new String[]{"type"}, new String[]{str3}).toString());
            case "checkUpdate":
                jzv.m147728a(qpl.f158878b, "检查更新 " + params);
                String strOptString7 = params.optString("bid");
                String strOptString8 = params.optString("url");
                jf3.C17939b c17939bM144660c2 = new jf3.C17939b().m144662e(this.f158879a).m144661d(strM130707d).m144663f(0).m144664g("更新成功").m144659b(1).m144660c("更新失败");
                Pair<String, String> pairM96330b = a6k0.m96330b(strOptString8, strOptString7);
                String strComponent1 = pairM96330b.component1();
                String strComponent2 = pairM96330b.component2();
                if (strComponent1 == null || StringsKt.m94329e0(strComponent1)) {
                    return true;
                }
                jf3 jf3VarM144658a2 = c17939bM144660c2.m144658a();
                jf3VarM144658a2.getClass();
                this.cacheCallbacks.put(strComponent1 + strComponent2, jf3VarM144658a2);
                FepManager.INSTANCE.m17610a().m17592n(strComponent1, strComponent2, strOptString8, CheckPolicy.FORCE_UPDATE);
            case "sendOfflineRequest":
                m138409t(params);
            case "getVersion":
                String strOptString9 = params.optString("bid");
                String strOptString10 = params.optString("baseVersion");
                hul hulVar2 = this.f158879a;
                if (hulVar2 == null || (resourceResponse = hulVar2.getResourceResponse()) == null) {
                    if (strOptString10 != null || strOptString10.length() == 0) {
                        str2 = null;
                    } else {
                        str2 = strOptString10;
                    }
                    if (str2 != null) {
                        strConcat = "https://s.immomo.com/v-/".concat(str2);
                    }
                } else {
                    strOptString9.getClass();
                    String strM209306c2 = resourceResponse.m209306c(strOptString9);
                    if (strM209306c2 != null) {
                        strConcat = strM209306c2;
                    } else {
                        if (strOptString10 != null || strOptString10.length() == 0) {
                            str2 = strOptString10;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            strConcat = "https://s.immomo.com/v-/".concat(str2);
                        }
                    }
                }
                zgi zgiVarM177462e2 = m177462e(strConcat, strOptString9, strOptString10, CheckPolicy.LOCAL_ONLY);
                m177463g(strM130707d, String.valueOf(zgiVarM177462e2 != null ? zgiVarM177462e2.m219624g() : 0L));
            default:
                if (method.equals("update")) {
                    jzv.m147728a(qpl.f158878b, "强制更新 " + params);
                    String strOptString11 = params.optString("bid");
                    String strOptString12 = params.optString("url");
                    if (strOptString12 == null || StringsKt.m94329e0(strOptString12)) {
                        strOptString12 = params.optString("zip_url");
                    }
                    String strM114836a2 = d8g0.m114836a(params.optString("newest_version"));
                    jf3.C17939b c17939bM144660c3 = new jf3.C17939b().m144662e(this.f158879a).m144661d(strM130707d).m144663f(0).m144664g("更新成功").m144659b(1).m144660c("更新失败");
                    String strM144902a2 = jhi.m144902a(strM114836a2);
                    jf3 jf3VarM144658a3 = c17939bM144660c3.m144658a();
                    jf3VarM144658a3.getClass();
                    this.cacheCallbacks.put(strOptString11 + strM144902a2, jf3VarM144658a3);
                    FepManager fepManagerM17610a3 = FepManager.INSTANCE.m17610a();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("bid", d8g0.m114836a(strOptString11));
                    linkedHashMap2.put("newest_version", strM114836a2);
                    linkedHashMap2.put("zip_url", d8g0.m114836a(strOptString12));
                    fepManagerM17610a3.m17596s(CollectionsKt.arrayListOf(linkedHashMap2));
                }
                return true;
        }
    }
}
