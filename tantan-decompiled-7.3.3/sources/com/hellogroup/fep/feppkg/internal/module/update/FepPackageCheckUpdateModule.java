package com.hellogroup.fep.feppkg.internal.module.update;

import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.ehi;
import p153l.ngi;
import p153l.pgi;
import p153l.tgi;
import p153l.zgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJu\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0017\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Lcom/hellogroup/fep/feppkg/internal/module/update/FepPackageCheckUpdateModule;", "", "<init>", "()V", "Ll/zgi;", BaseSei.INFO, "Ll/tgi;", "checkResult", "", "b", "(Ll/zgi;Ll/tgi;)V", "", "bid", "baseVersion", "currentUrl", "", "localVersion", "", "recordData", "Ll/ngi;", "fepGreyState", "Lkotlin/Function2;", "", "completion", "a", "(Ll/zgi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Ll/ngi;Lkotlin/jvm/functions/Function2;)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepPackageCheckUpdateModule {
    /* JADX INFO: renamed from: b */
    private final void m17733b(zgi info, tgi checkResult) {
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        fepPackageContext.m17691r().m17720B(info.getBid(), info.getBaseVersion(), checkResult.getNewVersion());
        fepPackageContext.m17691r().m17721E(info.getBid(), info.getBaseVersion(), checkResult.getAsymEncrypt());
    }

    /* JADX INFO: renamed from: a */
    public final void m17734a(@NotNull zgi info, @NotNull final String bid, @Nullable String baseVersion, @Nullable String currentUrl, long localVersion, @NotNull Map<String, String> recordData, @Nullable ngi fepGreyState, @NotNull Function2<? super tgi, ? super Throwable, Unit> completion) {
        Map<String, String> map = recordData;
        info.getClass();
        bid.getClass();
        map.getClass();
        completion.getClass();
        if (StringsKt.m94329e0(bid)) {
            completion.invoke(null, new IllegalArgumentException("Bid is empty"));
            return;
        }
        try {
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            final Map<String, String> mapM17647a = fepPackageContext.m17677d().m17647a(bid, baseVersion, currentUrl, localVersion, fepGreyState);
            String strMo130066a = fepPackageContext.m17690q().getNetwork().mo130066a(fepPackageContext.m17677d().getCheckUpdateURL(), mapM17647a, null);
            map.put("repData", strMo130066a != null ? strMo130066a : "response is empty");
            if (strMo130066a == null || StringsKt.m94329e0(strMo130066a)) {
                try {
                    pgi.m172234d(fepPackageContext.m17685l(), -3003, "Empty Response Data,response=" + strMo130066a, null, map, 4, null);
                    completion.invoke(null, new IllegalArgumentException("Empty response"));
                    return;
                } catch (Exception e) {
                    e = e;
                    map = map;
                    FepPackageContext.INSTANCE.m17685l().m172241c(-3003, "Request failed: " + e.getMessage(), e, map);
                    completion.invoke(null, e);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(strMo130066a);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject == null) {
                    throw new IllegalArgumentException("Data object is null=" + jSONObject.optString("em"));
                }
                final tgi tgiVarM191040c = tgi.INSTANCE.m191040c(jSONObjectOptJSONObject, bid, localVersion, jSONObject);
                tgiVarM191040c.m191037l(info.m219624g());
                m17733b(info, tgiVarM191040c);
                fepPackageContext.m17686m().m191606b(new Function1<ehi, Unit>() { // from class: com.hellogroup.fep.feppkg.internal.module.update.FepPackageCheckUpdateModule$check$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ehi ehiVar) {
                        ehiVar.getClass();
                        ehiVar.mo17608e(bid, tgi.m191026b(tgiVarM191040c, null, 0L, 0L, null, null, 0, 0, null, null, null, 1023, null), mapM17647a);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ehi ehiVar) {
                        invoke2(ehiVar);
                        return Unit.INSTANCE;
                    }
                }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.feppkg.internal.module.update.FepPackageCheckUpdateModule$check$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                        invoke2(exc);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Exception exc) {
                        exc.getClass();
                    }
                });
                completion.invoke(tgiVarM191040c, null);
            } catch (Exception e2) {
                FepPackageContext.INSTANCE.m17685l().m172241c(-3003, "Invalid Response Data,response=" + strMo130066a, e2, map);
                completion.invoke(null, e2);
            }
        } catch (Exception e3) {
            e = e3;
            FepPackageContext.INSTANCE.m17685l().m172241c(-3003, "Request failed: " + e.getMessage(), e, map);
            completion.invoke(null, e);
        }
    }
}
