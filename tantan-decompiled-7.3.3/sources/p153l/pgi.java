package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function6;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012F\b\u0002\u0010\u000b\u001a@\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJW\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00062\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJE\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\b2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 RR\u0010\u000b\u001a@\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Ll/pgi;", "", "Lcom/hellogroup/fep/base/FepLogModuleType;", "moduleType", "Lkotlin/Function6;", "Lcom/hellogroup/fep/base/FepLogLevel;", "", "", "", "", "", "callback", "<init>", "(Lcom/hellogroup/fep/base/FepLogModuleType;Lkotlin/jvm/functions/Function6;)V", FirebaseAnalytics.Param.LEVEL, "message", "extraInfo", "throwable", "errorCode", "h", "(Lcom/hellogroup/fep/base/FepLogLevel;Lcom/hellogroup/fep/base/FepLogModuleType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;I)V", "", "g", "(Lcom/hellogroup/fep/base/FepLogModuleType;I)Z", "a", "(Ljava/lang/String;Ljava/util/Map;)V", "e", "(Ljava/lang/String;Ljava/util/Map;I)V", "j", "(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;)V", "c", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "Lcom/hellogroup/fep/base/FepLogModuleType;", "b", "Lkotlin/jvm/functions/Function6;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class pgi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FepLogModuleType moduleType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function6<FepLogModuleType, FepLogLevel, String, Map<String, ? extends Object>, Integer, Throwable, Unit> callback;

    /* JADX WARN: Multi-variable type inference failed */
    public pgi(@NotNull FepLogModuleType fepLogModuleType, @Nullable Function6<? super FepLogModuleType, ? super FepLogLevel, ? super String, ? super Map<String, ? extends Object>, ? super Integer, ? super Throwable, Unit> function6) {
        fepLogModuleType.getClass();
        this.moduleType = fepLogModuleType;
        this.callback = function6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m172233b(pgi pgiVar, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        pgiVar.m172240a(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m172234d(pgi pgiVar, int i, String str, Throwable th, Map map, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        if ((i2 & 8) != 0) {
            map = null;
        }
        pgiVar.m172241c(i, str, th, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m172235f(pgi pgiVar, String str, Map map, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            map = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        pgiVar.m172242e(str, map, i);
    }

    /* JADX INFO: renamed from: g */
    private final boolean m172236g(FepLogModuleType moduleType, int errorCode) {
        IntRange intRange;
        int i = ogi.f147273a[moduleType.ordinal()];
        if (i == 1) {
            intRange = new IntRange(-1999, -1000);
        } else if (i == 2) {
            intRange = new IntRange(-2999, -2000);
        } else {
            if (i != 3) {
                nbr.m162172a();
                return false;
            }
            intRange = new IntRange(-3999, -3000);
        }
        return !intRange.m88474i(errorCode);
    }

    /* JADX INFO: renamed from: h */
    private final void m172237h(FepLogLevel level, FepLogModuleType moduleType, String message, Map<String, ? extends Object> extraInfo, Throwable throwable, int errorCode) {
        if (extraInfo == null) {
            extraInfo = new LinkedHashMap<>();
        }
        Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(extraInfo);
        if (errorCode != 0) {
            mutableMap.put("fep_error_code", Integer.valueOf(errorCode));
            mutableMap.put("fep_error_module", moduleType.name());
            mutableMap.put("fep_error_module_mismatch", Boolean.valueOf(m172236g(moduleType, errorCode)));
        }
        String str = "[code:" + errorCode + "] " + message;
        Function6<FepLogModuleType, FepLogLevel, String, Map<String, ? extends Object>, Integer, Throwable, Unit> function6 = this.callback;
        if (function6 != null) {
            function6.invoke(moduleType, level, str, mutableMap, Integer.valueOf(errorCode), throwable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m172238i(pgi pgiVar, FepLogLevel fepLogLevel, FepLogModuleType fepLogModuleType, String str, Map map, Throwable th, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            map = null;
        }
        if ((i2 & 16) != 0) {
            th = null;
        }
        if ((i2 & 32) != 0) {
            i = 0;
        }
        pgiVar.m172237h(fepLogLevel, fepLogModuleType, str, map, th, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m172239k(pgi pgiVar, String str, Throwable th, int i, Map map, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            map = null;
        }
        pgiVar.m172243j(str, th, i, map);
    }

    /* JADX INFO: renamed from: a */
    public final void m172240a(@NotNull String message, @Nullable Map<String, ? extends Object> extraInfo) {
        message.getClass();
        m172238i(this, FepLogLevel.debug, this.moduleType, message, extraInfo, null, 0, 48, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m172241c(int errorCode, @NotNull String message, @Nullable Throwable throwable, @Nullable Map<String, ? extends Object> extraInfo) {
        message.getClass();
        m172237h(FepLogLevel.error, this.moduleType, message, extraInfo, throwable, errorCode);
    }

    /* JADX INFO: renamed from: e */
    public final void m172242e(@NotNull String message, @Nullable Map<String, ? extends Object> extraInfo, int errorCode) {
        message.getClass();
        m172238i(this, FepLogLevel.info, this.moduleType, message, extraInfo, null, errorCode, 16, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m172243j(@NotNull String message, @Nullable Throwable throwable, int errorCode, @Nullable Map<String, ? extends Object> extraInfo) {
        message.getClass();
        m172237h(FepLogLevel.warning, this.moduleType, message, extraInfo, throwable, errorCode);
    }
}
