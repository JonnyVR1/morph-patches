package com.hellogroup.fep.feppkg.core;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.FepContext;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.config.core.FepConfigManager;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.d8g0;
import p153l.dgi;
import p153l.dhi;
import p153l.ehi;
import p153l.fhi;
import p153l.hgi;
import p153l.jzv;
import p153l.kt0;
import p153l.lhi;
import p153l.ngi;
import p153l.nhi;
import p153l.pgi;
import p153l.tc60;
import p153l.wg3;
import p153l.wtq0;
import p153l.xh3;
import p153l.zgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u0001:\u0001BB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J%\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\"\u0010#J/\u0010%\u001a\u0004\u0018\u00010\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010$\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b%\u0010&J7\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010$\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00020\u000f2\u001a\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010,0+¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b4\u00105J#\u00106\u001a\u0004\u0018\u00010(2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000f¢\u0006\u0004\b8\u0010\u0003J\u001f\u00109\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b?\u0010>J#\u0010@\u001a\u0004\u0018\u00010(2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b@\u00107R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006F"}, m88121d2 = {"Lcom/hellogroup/fep/feppkg/core/FepPackageManager;", "", "<init>", "()V", "Ll/fhi$a;", "parseResult", "Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;", "checkPolicy", "Ll/zgi;", "g", "(Ll/fhi$a;Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;)Ll/zgi;", BaseSei.INFO, "Ll/ngi;", "f", "(Ll/fhi$a;Ll/zgi;)Ll/ngi;", "", "e", "", "debugMode", "Lcom/hellogroup/fep/feppkg/core/FepPackageConfiguration;", "configuration", "Ll/tc60;", "provider", "u", "(ZLcom/hellogroup/fep/feppkg/core/FepPackageConfiguration;Ll/tc60;)V", "", "url", "m", "(Ljava/lang/String;Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;)Ll/zgi;", "bid", "baseVersion", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;)Ll/zgi;", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Ljava/lang/String;)J", "baseVer", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/zgi;", WBConstants.AUTH_PARAMS_VERSION, "Ljava/io/File;", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/io/File;", "", "", "packageConfs", "p", "(Ljava/util/List;)V", "fepPackageInfo", "c", "(Ll/zgi;)Z", "packageInfo", "q", "(Ll/zgi;)V", "j", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", Constants.INAPP_DATA_TAG, BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;Ljava/lang/String;)V", "Ll/ehi;", "observer", "r", "(Ll/ehi;)V", Constants.KEY_T, "k", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSetup", "Companion", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepPackageManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    private static volatile FepPackageManager f11944b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicBoolean isSetup;

    /* JADX INFO: renamed from: com.hellogroup.fep.feppkg.core.FepPackageManager$b */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/hellogroup/fep/feppkg/core/FepPackageManager$b", "Ll/dgi;", "Lcom/hellogroup/fep/config/core/FepConfigManager;", "manager", "", "isLocalData", "Lcom/hellogroup/fep/config/model/FepConfigFetchType;", "type", "", "b", "(Lcom/hellogroup/fep/config/core/FepConfigManager;ZLcom/hellogroup/fep/config/model/FepConfigFetchType;)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3500b extends dgi {
        public C3500b() {
        }

        @Override // p153l.dgi, p153l.bgi
        /* JADX INFO: renamed from: b */
        public void mo17604b(@NotNull FepConfigManager manager, boolean isLocalData, @NotNull FepConfigFetchType type) {
            manager.getClass();
            type.getClass();
            if (type != FepConfigFetchType.LAUNCH || isLocalData) {
                return;
            }
            List<Object> listM151324l = kt0.m151324l(FepConfigManager.m17621l(manager, "downloadMk", null, 2, null));
            if (listM151324l != null) {
                List<Object> list = listM151324l.isEmpty() ? null : listM151324l;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Map<String, Object> mapM151326n = kt0.m151326n(it.next());
                        if (mapM151326n != null) {
                            arrayList.add(mapM151326n);
                        }
                    }
                    FepPackageManager.this.m17667p(arrayList);
                }
            }
        }
    }

    private FepPackageManager() {
        this.isSetup = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: e */
    private final void m17654e() {
        if (this.isSetup.get()) {
            return;
        }
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        pgi.m172234d(fepPackageContext.m17685l(), -3002, "PackageManager not setup, call setup() first", null, null, 12, null);
        if (fepPackageContext.m17678e()) {
            wtq0.m207906a("PackageManager not setup, call setup() first");
        }
    }

    /* JADX INFO: renamed from: f */
    private final ngi m17655f(fhi.C16975a parseResult, zgi info) {
        String url = parseResult.getUrl();
        if (url != null) {
            return hgi.INSTANCE.m134945a().m134941d(url, Long.valueOf(info.m219624g()));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, l.ngi] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, l.ngi] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, l.ngi] */
    /* JADX INFO: renamed from: g */
    private final zgi m17656g(fhi.C16975a parseResult, CheckPolicy checkPolicy) {
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        zgi zgiVarM97842f = fepPackageContext.m17682i().m97842f(parseResult);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        int i = dhi.f88528a[checkPolicy.ordinal()];
        if (i == 2) {
            objectRef.element = m17655f(parseResult, zgiVarM97842f);
        } else if (i == 3) {
            long jM17729t = fepPackageContext.m17691r().m17729t(zgiVarM97842f.getBid(), zgiVarM97842f.getBaseVersion());
            long jCurrentTimeMillis = System.currentTimeMillis();
            FepPackageConfig fepPackageConfigM219623f = zgiVarM97842f.m219623f();
            boolean z = true;
            if (fepPackageConfigM219623f != null && jCurrentTimeMillis - jM17729t <= fepPackageConfigM219623f.getFrequency() * 60000.0d) {
                z = false;
            }
            objectRef.element = m17655f(parseResult, zgiVarM97842f);
            if (z) {
                xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageManager$fepPackageInfo$1(zgiVarM97842f, objectRef, null), 3, null);
            }
        } else if (i == 4) {
            objectRef.element = m17655f(parseResult, zgiVarM97842f);
            xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageManager$fepPackageInfo$2(zgiVarM97842f, objectRef, null), 3, null);
        }
        if (checkPolicy != CheckPolicy.LOCAL_NO_VISITOR) {
            fepPackageContext.m17691r().m17719A(zgiVarM97842f);
        }
        zgi zgiVarM219618c = zgi.m219618c(zgiVarM97842f, null, null, null, 0L, null, null, null, null, null, UnixStat.DEFAULT_LINK_PERM, null);
        ngi ngiVar = (ngi) objectRef.element;
        if (ngiVar != null) {
            zgiVarM219618c.m219635r(ngiVar);
            if (ngiVar.m162972g()) {
                zgiVarM219618c.m219619a();
            }
        }
        if (fepPackageContext.m17678e()) {
            jzv.m147734g(FepLogModuleType.offlinepkg.name(), "fepPackageInfo get ready，originData=" + zgiVarM97842f.toString() + "\npackageInfoSnapchat=" + zgiVarM219618c.toString() + SignParameters.NEW_LINE + Log.getStackTraceString(new RuntimeException()));
        }
        return zgiVarM219618c;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ zgi m17657o(FepPackageManager fepPackageManager, String str, String str2, String str3, CheckPolicy checkPolicy, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            checkPolicy = CheckPolicy.NORMAL;
        }
        return fepPackageManager.m17666n(str, str2, str3, checkPolicy);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17658c(@Nullable zgi fepPackageInfo) {
        m17654e();
        if (fepPackageInfo == null) {
            return false;
        }
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        lhi lhiVarM17730u = fepPackageContext.m17691r().m17730u(fepPackageInfo.getBid());
        return ((Boolean) nhi.m163100m(fepPackageContext.m17694u(), fepPackageInfo.getBid(), fepPackageInfo.getBaseVersion(), d8g0.m114836a(fepPackageInfo.m219626i()), lhiVarM17730u != null && lhiVarM17730u.getAsym() == 1, false, null, 48, null).getFirst()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m17659d() {
        m17654e();
        xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageManager$clearAllPackages$1(null), 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final zgi m17660h(@Nullable String bid, @Nullable String baseVer, @Nullable String url) {
        fhi.C16975a c16975aM125556a = fhi.INSTANCE.m125556a(url, bid, baseVer);
        if (c16975aM125556a == null) {
            return null;
        }
        c16975aM125556a.m125560d(true);
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        zgi zgiVarM97841e = fepPackageContext.m17682i().m97841e(c16975aM125556a);
        fepPackageContext.m17691r().m17719A(zgiVarM97841e);
        return zgiVarM97841e;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final File m17661i(@Nullable String bid, @Nullable String baseVer, @Nullable String url, long version) {
        fhi.C16975a c16975aM125556a = fhi.INSTANCE.m125556a(url, bid, baseVer);
        if (c16975aM125556a != null) {
            return FepPackageContext.INSTANCE.m17684k().m109818u(c16975aM125556a.getBid(), c16975aM125556a.getBaseVersion(), version);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final File m17662j(@Nullable String bid, @Nullable String baseVersion) {
        if (bid == null || StringsKt.m94329e0(bid)) {
            return null;
        }
        if (baseVersion == null || StringsKt.m94329e0(baseVersion)) {
            baseVersion = "default";
        }
        return FepPackageContext.INSTANCE.m17684k().m109817t(bid, d8g0.m114836a(baseVersion));
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final File m17663k(@Nullable String bid, @Nullable String baseVersion) {
        if (bid != null) {
            return FepPackageContext.INSTANCE.m17684k().m109820w(bid, d8g0.m114836a(baseVersion));
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final long m17664l(@Nullable String bid, @Nullable String url) {
        fhi.C16975a c16975aM125556a;
        m17654e();
        if (bid == null || StringsKt.m94329e0(bid) || Intrinsics.m88377d(bid, "0") || (c16975aM125556a = fhi.INSTANCE.m125556a(url, bid, null)) == null) {
            return 0L;
        }
        return FepPackageContext.INSTANCE.m17682i().m97842f(c16975aM125556a).m219624g();
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final zgi m17665m(@NotNull String url, @NotNull CheckPolicy checkPolicy) {
        url.getClass();
        checkPolicy.getClass();
        m17654e();
        fhi.C16975a c16975aM125555b = fhi.m125555b(fhi.INSTANCE, url, null, null, 6, null);
        if (c16975aM125555b != null) {
            return m17656g(c16975aM125555b, checkPolicy);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final zgi m17666n(@NotNull String bid, @Nullable String baseVersion, @Nullable String url, @NotNull CheckPolicy checkPolicy) {
        bid.getClass();
        checkPolicy.getClass();
        m17654e();
        fhi.C16975a c16975aM125556a = fhi.INSTANCE.m125556a(url, bid, baseVersion);
        if (c16975aM125556a != null) {
            return m17656g(c16975aM125556a, checkPolicy);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m17667p(@NotNull List<? extends Map<String, ? extends Object>> packageConfs) {
        packageConfs.getClass();
        m17654e();
        xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageManager$preload$1(packageConfs, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m17668q(@Nullable zgi packageInfo) {
        if (packageInfo != null) {
            FepPackageContext.INSTANCE.m17691r().m17720B(packageInfo.getBid(), packageInfo.getBaseVersion(), packageInfo.m219624g());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m17669r(@NotNull ehi observer) {
        observer.getClass();
        FepPackageContext.INSTANCE.m17686m().m191605a(observer);
    }

    /* JADX INFO: renamed from: s */
    public final void m17670s(@NotNull String bid, @Nullable String baseVersion) {
        bid.getClass();
        xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageManager$removeBasePackage$1(bid, baseVersion, null), 3, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m17671t(@NotNull ehi observer) {
        observer.getClass();
        FepPackageContext.INSTANCE.m17686m().m191607c(observer);
    }

    /* JADX INFO: renamed from: u */
    public final void m17672u(boolean debugMode, @NotNull FepPackageConfiguration configuration, @NotNull tc60 provider) {
        configuration.getClass();
        provider.getClass();
        if (this.isSetup.get()) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Already setup, will ignore repeat setup", null, 0, null, 14, null);
            return;
        }
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        fepPackageContext.m17697x(debugMode);
        if (!configuration.m17651e()) {
            pgi.m172234d(fepPackageContext.m17685l(), -3001, "Configuration Invalid", null, null, 12, null);
            if (fepPackageContext.m17678e()) {
                wg3.m206174a("Configuration is invalid");
                return;
            }
        }
        FepConfigManager.INSTANCE.m17633a().m17630o(new C3500b());
        fepPackageContext.m17696w(configuration);
        fepPackageContext.m17698y(provider);
        fepPackageContext.m17691r().m17732w();
        this.isSetup.set(true);
        pgi.m172235f(fepPackageContext.m17685l(), "PackageManager setup completed", null, 0, 6, null);
    }

    /* JADX INFO: renamed from: com.hellogroup.fep.feppkg.core.FepPackageManager$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/hellogroup/fep/feppkg/core/FepPackageManager$a;", "", "<init>", "()V", "Lcom/hellogroup/fep/feppkg/core/FepPackageManager;", "a", "()Lcom/hellogroup/fep/feppkg/core/FepPackageManager;", "instance", "Lcom/hellogroup/fep/feppkg/core/FepPackageManager;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final FepPackageManager m17673a() {
            FepPackageManager fepPackageManager;
            FepPackageManager fepPackageManager2 = FepPackageManager.f11944b;
            if (fepPackageManager2 != null) {
                return fepPackageManager2;
            }
            synchronized (this) {
                fepPackageManager = FepPackageManager.f11944b;
                if (fepPackageManager == null) {
                    fepPackageManager = new FepPackageManager(null);
                    FepPackageManager.f11944b = fepPackageManager;
                }
            }
            return fepPackageManager;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FepPackageManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
