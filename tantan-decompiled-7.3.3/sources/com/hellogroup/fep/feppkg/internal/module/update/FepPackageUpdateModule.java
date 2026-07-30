package com.hellogroup.fep.feppkg.internal.module.update;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.feppkg.core.FepPackageManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.hellogroup.fep.feppkg.model.FepPackageStatus;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.d8g0;
import p153l.jhi;
import p153l.nc60;
import p153l.ngi;
import p153l.nhi;
import p153l.pgi;
import p153l.tgi;
import p153l.xgi;
import p153l.zgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001a"}, m88121d2 = {"Lcom/hellogroup/fep/feppkg/internal/module/update/FepPackageUpdateModule;", "", "<init>", "()V", "Ll/zgi;", BaseSei.INFO, "Ll/tgi;", "checkResult", "", "", "recordData", "", Constants.INAPP_DATA_TAG, "(Ll/zgi;Ll/tgi;Ljava/util/Map;)V", "f", "(Ll/tgi;Ll/zgi;Ljava/util/Map;)Ljava/lang/String;", "e", "", "g", "(Ll/zgi;Ll/tgi;)Z", "infoCheck", "Ll/ngi;", "fepGreyState", "c", "(Ll/zgi;Ll/ngi;)V", "h", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepPackageUpdateModule {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX INFO: renamed from: d */
    public final void m17737d(zgi info, tgi checkResult, Map<String, String> recordData) {
        boolean zM104347c;
        long newVersion = checkResult.getNewVersion();
        String bid = info.getBid();
        String baseVersion = info.getBaseVersion();
        if (StringsKt.m94329e0(bid) || StringsKt.m94329e0(baseVersion) || newVersion <= 0) {
            zM104347c = false;
        } else {
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            File fileM109818u = fepPackageContext.m17684k().m109818u(bid, baseVersion, newVersion);
            if (fileM109818u.exists()) {
                nhi nhiVarM17694u = fepPackageContext.m17694u();
                String absolutePath = fileM109818u.getAbsolutePath();
                absolutePath.getClass();
                Pair<Boolean, FepPackageConfig> pairM163100m = nhi.m163100m(nhiVarM17694u, bid, baseVersion, absolutePath, checkResult.getAsymEncrypt() == 1, false, recordData, 16, null);
                zM104347c = pairM163100m.getFirst().booleanValue();
                if (zM104347c) {
                    fepPackageContext.m17683j().m104346b(bid, baseVersion, newVersion, fileM109818u, pairM163100m);
                } else {
                    FileUtil.m17527k(fileM109818u);
                    pgi.m172234d(fepPackageContext.m17685l(), -3007, "Package verify failed，by check old pkg", null, recordData, 4, null);
                }
            } else {
                zM104347c = false;
            }
        }
        if (!zM104347c) {
            info.m219638u(FepPackageStatus.Downloading);
            String strM17739f = m17739f(checkResult, info, recordData);
            if (strM17739f == null) {
                info.m219638u(FepPackageStatus.Failed);
                return;
            } else {
                info.m219638u(FepPackageStatus.Installing);
                zM104347c = FepPackageContext.INSTANCE.m17683j().m104347c(strM17739f, info.getBid(), info.getBaseVersion(), checkResult.getNewVersion(), checkResult.getAsymEncrypt() == 1, recordData);
            }
        }
        if (zM104347c) {
            info.m219638u(FepPackageStatus.Ready);
        } else {
            info.m219638u(FepPackageStatus.Failed);
        }
    }

    /* JADX INFO: renamed from: e */
    private final String m17738e(tgi checkResult, zgi info, Map<String, String> recordData) {
        nc60 nc60VarM17679f = FepPackageContext.INSTANCE.m17679f();
        String zipUrl = checkResult.getZipUrl();
        if (zipUrl == null) {
            Intrinsics.m88386m();
        }
        return nc60VarM17679f.m162506b(zipUrl, info.getBid(), checkResult.getNewVersion(), recordData);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b3 A[Catch: Exception -> 0x0098, TRY_LEAVE, TryCatch #1 {Exception -> 0x0098, blocks: (B:15:0x005e, B:17:0x008a, B:19:0x0092, B:30:0x00b3, B:23:0x009d, B:25:0x00a3, B:27:0x00ab), top: B:50:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:3:0x0005, B:5:0x0013, B:11:0x002d, B:13:0x004a, B:34:0x00c6, B:37:0x00d1, B:41:0x00e8, B:43:0x0106, B:45:0x011c), top: B:49:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:3:0x0005, B:5:0x0013, B:11:0x002d, B:13:0x004a, B:34:0x00c6, B:37:0x00d1, B:41:0x00e8, B:43:0x0106, B:45:0x011c), top: B:49:0x0005 }] */
    /* JADX INFO: renamed from: f */
    private final String m17739f(tgi checkResult, zgi info, Map<String, String> recordData) {
        String str;
        String absolutePath;
        String strM130251a;
        Map<String, String> map = recordData;
        try {
            String strM114836a = d8g0.m114836a(checkResult.getPatchUrl());
            boolean z = !StringsKt.m94329e0(strM114836a) && FepPackageContext.INSTANCE.m17684k().m109814p(info.getBid(), checkResult.getLocalVersion());
            xgi.m210888a(map, "patchUrl=" + strM114836a + "###zipUrl=" + checkResult.getZipUrl());
            if (!z) {
                return m17738e(checkResult, info, recordData);
            }
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            String strM162507c = fepPackageContext.m17679f().m162507c(strM114836a, info.getBid(), checkResult.getNewVersion(), map);
            if (strM162507c == null) {
                pgi.m172239k(fepPackageContext.m17685l(), "Patch download failed, fallback to full download", null, 0, null, 14, null);
                return m17738e(checkResult, info, recordData);
            }
            try {
                File fileM109810l = fepPackageContext.m17684k().m109810l(info.getBid(), checkResult.getLocalVersion(), ".zip");
                File fileM109810l2 = fepPackageContext.m17684k().m109810l(info.getBid(), checkResult.getLocalVersion(), ".7z");
                if (!fileM109810l.exists() || fileM109810l.length() <= 0) {
                    if (!fileM109810l2.exists() || fileM109810l2.length() <= 0) {
                        str = null;
                    } else {
                        absolutePath = fileM109810l2.getAbsolutePath();
                    }
                    if (str != null) {
                        pgi.m172239k(fepPackageContext.m17685l(), "Backup package not exists, fallback to full download", null, 0, null, 14, null);
                        new File(strM162507c).delete();
                        return m17738e(checkResult, info, recordData);
                    }
                    try {
                        strM130251a = fepPackageContext.m17687n().m130251a(strM162507c, str, info.getBid(), checkResult.getNewVersion(), recordData);
                        new File(strM162507c).delete();
                        if (strM130251a != null) {
                            return strM130251a;
                        }
                        pgi.m172239k(fepPackageContext.m17685l(), "Patch merge failed, fallback to full download", null, 0, null, 14, null);
                        return m17738e(checkResult, info, recordData);
                    } catch (Exception e) {
                        e = e;
                        map = recordData;
                    }
                    FepPackageContext.INSTANCE.m17685l().m172241c(-3004, "Download failed: " + e.getMessage(), e, map);
                    return null;
                }
                absolutePath = fileM109810l.getAbsolutePath();
                str = absolutePath;
                if (str != null) {
                    pgi.m172239k(fepPackageContext.m17685l(), "Backup package not exists, fallback to full download", null, 0, null, 14, null);
                    new File(strM162507c).delete();
                    return m17738e(checkResult, info, recordData);
                }
                strM130251a = fepPackageContext.m17687n().m130251a(strM162507c, str, info.getBid(), checkResult.getNewVersion(), recordData);
                new File(strM162507c).delete();
                if (strM130251a != null) {
                    return strM130251a;
                }
                pgi.m172239k(fepPackageContext.m17685l(), "Patch merge failed, fallback to full download", null, 0, null, 14, null);
                return m17738e(checkResult, info, recordData);
            } catch (Exception e2) {
                e = e2;
                map = recordData;
            }
            FepPackageContext.INSTANCE.m17685l().m172241c(-3004, "Download failed: " + e.getMessage(), e, map);
            return null;
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final boolean m17740g(zgi info, tgi checkResult) {
        boolean z = checkResult.getIsSandbox() == 1;
        FepPackageConfig fepPackageConfigM219623f = info.m219623f();
        boolean z2 = fepPackageConfigM219623f != null && fepPackageConfigM219623f.isSandbox();
        boolean z3 = z != z2;
        if (z3) {
            pgi.m172233b(FepPackageContext.INSTANCE.m17685l(), "needSwitchEnv: " + z3 + ", localIsSandbox: " + z2 + ", checkUpdate, isSandbox: " + z, null, 2, null);
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m17741c(@NotNull zgi infoCheck, @Nullable ngi fepGreyState) {
        infoCheck.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = infoCheck;
        infoCheck.m219638u(FepPackageStatus.CheckingUpdate);
        final String pageUrl = ((zgi) objectRef.element).getPageUrl();
        final Map<String, String> mapM210888a = xgi.m210888a(MapsKt.mutableMapOf(TuplesKt.m88129a("bid", ((zgi) objectRef.element).getBid()), TuplesKt.m88129a("url", d8g0.m114836a(pageUrl))), "FepPackageUpdateModule-checkAndUpdate");
        FepPackageCheckUpdateModule fepPackageCheckUpdateModuleM17675b = FepPackageContext.INSTANCE.m17675b();
        T t = objectRef.element;
        fepPackageCheckUpdateModuleM17675b.m17734a((zgi) t, ((zgi) t).getBid(), ((zgi) objectRef.element).getBaseVersion(), pageUrl, ((zgi) objectRef.element).m219624g(), mapM210888a, fepGreyState, new Function2<tgi, Throwable, Unit>() { // from class: com.hellogroup.fep.feppkg.internal.module.update.FepPackageUpdateModule$checkAndUpdate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v32, types: [T, l.zgi] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable tgi tgiVar, @Nullable Throwable th) {
                String strM219626i;
                if (th != null) {
                    ((zgi) objectRef.element).m219638u(FepPackageStatus.Failed);
                    return;
                }
                if (tgiVar == null) {
                    ((zgi) objectRef.element).m219638u(FepPackageStatus.Failed);
                    return;
                }
                String strM144902a = jhi.m144902a(String.valueOf(tgiVar.getNewVersion()));
                if (!Intrinsics.m88377d(strM144902a, ((zgi) objectRef.element).getBaseVersion())) {
                    pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Check update process start, but baseVersion is not match, use server baseVersion", null, 0, MapsKt.hashMapOf(TuplesKt.m88129a("bid", ((zgi) objectRef.element).getBid()), TuplesKt.m88129a("baseVersion", ((zgi) objectRef.element).getBaseVersion()), TuplesKt.m88129a("serverBaseVersion", String.valueOf(tgiVar.getNewVersion()))), 6, null);
                    ?? M17666n = FepPackageManager.INSTANCE.m17673a().m17666n(((zgi) objectRef.element).getBid(), strM144902a, ((zgi) objectRef.element).getPageUrl(), CheckPolicy.LOCAL_ONLY);
                    if (M17666n != 0) {
                        objectRef.element = M17666n;
                    }
                }
                ((zgi) objectRef.element).m219636s(tgiVar.getOriginSourceJson());
                if (this.this$0.m17740g((zgi) objectRef.element, tgiVar) && (strM219626i = ((zgi) objectRef.element).m219626i()) != null) {
                    FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
                    fepPackageContext.m17684k().m109803b(new File(strM219626i));
                    fepPackageContext.m17682i().m97844h(((zgi) objectRef.element).getBid(), ((zgi) objectRef.element).getBaseVersion());
                    FepPackageRecordModule.m17713n(fepPackageContext.m17691r(), ((zgi) objectRef.element).getBid(), ((zgi) objectRef.element).getBaseVersion(), null, 4, null);
                    ((zgi) objectRef.element).m219638u(FepPackageStatus.None);
                }
                FepPackageContext fepPackageContext2 = FepPackageContext.INSTANCE;
                fepPackageContext2.m17691r().m17722F(((zgi) objectRef.element).getBid(), ((zgi) objectRef.element).getBaseVersion());
                if (tgiVar.m191035j()) {
                    this.this$0.m17737d((zgi) objectRef.element, tgiVar, mapM210888a);
                    return;
                }
                ((zgi) objectRef.element).m219638u(FepPackageStatus.Ready);
                pgi.m172235f(fepPackageContext2.m17685l(), "FepPackageUpdateModule: skip currentUrl=" + pageUrl + ", bid=" + ((zgi) objectRef.element).getBid() + ",baseVer=" + ((zgi) objectRef.element).getBaseVersion() + ", no new version", null, 0, 6, null);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(tgi tgiVar, Throwable th) {
                invoke2(tgiVar, th);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m17742h(@NotNull zgi info, @NotNull tgi checkResult, @NotNull Map<String, String> recordData) {
        info.getClass();
        checkResult.getClass();
        recordData.getClass();
        if (checkResult.m191035j()) {
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            fepPackageContext.m17691r().m17722F(info.getBid(), info.getBaseVersion());
            fepPackageContext.m17691r().m17721E(info.getBid(), info.getBaseVersion(), checkResult.getAsymEncrypt());
            m17737d(info, checkResult, recordData);
            return;
        }
        pgi.m172233b(FepPackageContext.INSTANCE.m17685l(), "Preload: skip " + info.getBid() + ", no new version", null, 2, null);
        info.m219638u(FepPackageStatus.Ready);
    }
}
