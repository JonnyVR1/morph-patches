package com.hellogroup.fep.config.internal.fetch;

import com.hellogroup.fep.config.internal.FepConfigContext;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.cgi;
import p153l.pgi;
import p153l.wh3;
import p153l.zfi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Lcom/hellogroup/fep/config/internal/fetch/FepConfigFetchModule;", "", "<init>", "()V", "Lcom/hellogroup/fep/config/model/FepConfigFetchType;", "type", "", "currentHash", "Lkotlin/Function2;", "Ll/zfi;", "Lcom/hellogroup/fep/config/internal/fetch/FepConfigError;", "", "completion", "a", "(Lcom/hellogroup/fep/config/model/FepConfigFetchType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepConfigFetchModule {
    /* JADX INFO: renamed from: a */
    public final void m17646a(@NotNull FepConfigFetchType type, @NotNull String currentHash, @NotNull Function2<? super zfi, ? super FepConfigError, Unit> completion) throws JSONException {
        Object objM225066constructorimpl;
        type.getClass();
        currentHash.getClass();
        completion.getClass();
        Map<String, String> mapM210798a = FepConfigContext.INSTANCE.m17634a().m210798a(type, currentHash);
        if (type == FepConfigFetchType.LAUNCH) {
            Map map = (Map) wh3.m206334b(null, new FepConfigFetchModule$fetchConfig$newestPackageConfig$1(null), 1, null);
            JSONArray jSONArray = new JSONArray();
            if (map.isEmpty()) {
                map = null;
            }
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    long jLongValue = ((Number) entry.getValue()).longValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bid", str);
                    jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, jLongValue);
                    jSONArray.put(jSONObject);
                }
                Unit unit = Unit.INSTANCE;
                if (jSONArray.length() <= 0) {
                    unit = null;
                }
                if (unit != null) {
                    String string = jSONArray.toString();
                    string.getClass();
                    mapM210798a.put("mkVersion", string);
                }
            }
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FepConfigContext fepConfigContext = FepConfigContext.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(fepConfigContext.m17639f().mo17611a(fepConfigContext.m17634a().getFetchURL(), mapM210798a));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
        if (thM225069exceptionOrNullimpl != null) {
            completion.invoke(null, new FepConfigError(-1002, "Fetch config failed network error: " + thM225069exceptionOrNullimpl.getMessage(), thM225069exceptionOrNullimpl, mapM210798a));
            return;
        }
        String str2 = (String) objM225066constructorimpl;
        if (str2 == null || str2.length() == 0) {
            completion.invoke(null, new FepConfigError(-1003, "Fetch config failed empty response", null, mapM210798a, 4, null));
            return;
        }
        try {
            zfi zfiVarM109690a = cgi.INSTANCE.m109690a(str2);
            pgi.m172235f(FepConfigContext.INSTANCE.m17638e(), "Config fetched successfully, hash: " + zfiVarM109690a.getHashStr(), null, 0, 6, null);
            completion.invoke(zfiVarM109690a, null);
        } catch (Exception e) {
            completion.invoke(null, new FepConfigError(-1004, "Fetch config success but parsed nil data: " + e.getMessage(), e, mapM210798a));
        }
    }
}
