package p009l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.ClevertapApi;
import com.p1.mobile.putong.app.TantanApp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import l.fe50;
import l.qib0;
import l.w2e0;
import l.wv3;
import l.xv3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001f\u0010\u001dR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Ll/w85;", "", "<init>", "()V", "Lcom/p1/mobile/putong/app/TantanApp;", "app", "", "j", "(Lcom/p1/mobile/putong/app/TantanApp;)V", "Lkotlin/Function1;", "", "call", "g", "(Lkotlin/jvm/functions/Function1;)V", "name", "", "params", "m", "(Ljava/lang/String;Ljava/util/Map;)V", "Landroid/location/Location;", "location", "q", "(Landroid/location/Location;)V", "Landroid/os/Bundle;", "bundle", "o", "(Landroid/os/Bundle;)V", "token", "p", "(Ljava/lang/String;)V", "identity", "k", "Landroid/app/Application;", "a", "Landroid/app/Application;", "application", "Lcom/p1/mobile/putong/api/api/ClevertapApi;", "b", "Lkotlin/Lazy;", "h", "()Lcom/p1/mobile/putong/api/api/ClevertapApi;", "api", "Lcom/clevertap/android/sdk/CleverTapAPI;", "c", "i", "()Lcom/clevertap/android/sdk/CleverTapAPI;", "cleverTapDefaultInstance", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class w85 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static Application application;

    @NotNull
    public static final w85 INSTANCE = new w85();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy api = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.q85
        public final Object invoke() {
            return w85.m23988b();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy cleverTapDefaultInstance = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.r85
        public final Object invoke() {
            return w85.m23990d();
        }
    });

    /* JADX INFO: renamed from: a */
    public static void m23987a(HashMap map) {
        Object obj;
        String string;
        Application application2;
        try {
            Result.Companion companion = Result.Companion;
            String str = null;
            Object obj2 = map != null ? map.get("wzrk_dl") : null;
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null) {
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    str = str2;
                } else if (map != null) {
                    str = string;
                }
            } else if (map != null && (obj = map.get("wzrk_dl")) != null && (string = obj.toString()) != null && string.length() > 0) {
                str = string;
            }
            if (str != null && str.length() != 0 && (application2 = application) != null) {
                w2e0.g = str;
                Intent mainActIntent = qib0.c0.getMainActIntent(application2);
                mainActIntent.addFlags(268435456);
                application2.startActivity(mainActIntent);
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.a(th));
        }
    }

    /* JADX INFO: renamed from: b */
    public static ClevertapApi m23988b() {
        return new ClevertapApi();
    }

    /* JADX INFO: renamed from: d */
    public static CleverTapAPI m23990d() {
        try {
            return CleverTapAPI.K(App.e);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m23991e(Bundle bundle) {
        CleverTapAPI.s(application, bundle);
    }

    /* JADX INFO: renamed from: f */
    public static void m23992f(Function1 function1, String str) {
        function1.invoke(str);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m23993l(Map map, List list) {
        CleverTapAPI cleverTapAPIM23997i;
        if (map != null && (cleverTapAPIM23997i = INSTANCE.m23997i()) != null) {
            cleverTapAPIM23997i.n0(map);
        }
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            CleverTapAPI cleverTapAPIM23997i2 = INSTANCE.m23997i();
            if (cleverTapAPIM23997i2 != null) {
                cleverTapAPIM23997i2.r0(str);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m23994n(w85 w85Var, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        w85Var.m24000m(str, map);
    }

    /* JADX INFO: renamed from: g */
    public final void m23995g(@NotNull final Function1<? super String, Unit> call) {
        call.getClass();
        CleverTapAPI cleverTapAPIM23997i = m23997i();
        if (cleverTapAPIM23997i != null) {
            cleverTapAPIM23997i.E(new fe50() { // from class: l.u85
                /* JADX INFO: renamed from: a */
                public final void m22761a(String str) {
                    w85.m23992f(call, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final ClevertapApi m23996h() {
        return (ClevertapApi) api.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final CleverTapAPI m23997i() {
        return (CleverTapAPI) cleverTapDefaultInstance.getValue();
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: j */
    public final void m23998j(@NotNull TantanApp app) {
        app.getClass();
        application = app;
        try {
            Result.Companion companion = Result.Companion;
            CleverTapAPI.u(app, "clevertap", "active", "active notification", 3, true);
            CleverTapAPI.x0(CleverTapAPI.LogLevel.OFF);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.a(th));
        }
        CleverTapAPI cleverTapAPIM23997i = m23997i();
        if (cleverTapAPIM23997i != null) {
            cleverTapAPIM23997i.x(true);
        }
        CleverTapAPI cleverTapAPIM23997i2 = m23997i();
        if (cleverTapAPIM23997i2 != null) {
            cleverTapAPIM23997i2.u0(new wv3() { // from class: l.t85
                /* JADX INFO: renamed from: a */
                public final void m22466a(Bundle bundle) {
                    w85.m23991e(bundle);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m23999k(@Nullable String identity) {
        CleverTapAPI cleverTapAPIM23997i;
        try {
            Result.Companion companion = Result.Companion;
            if (identity != null) {
                if (identity.length() <= 0) {
                    identity = null;
                }
                if (identity != null && (cleverTapAPIM23997i = INSTANCE.m23997i()) != null) {
                    cleverTapAPIM23997i.d0(MapsKt.mapOf(TuplesKt.a("Identity", identity)));
                }
            }
            INSTANCE.m23996h().x(new Function2() { // from class: l.s85
                public final Object invoke(Object obj, Object obj2) {
                    return w85.m23993l((Map) obj, (List) obj2);
                }
            });
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.a(th));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m24000m(@NotNull String name, @Nullable Map<String, ? extends Object> params) {
        Unit unit;
        name.getClass();
        try {
            Result.Companion companion = Result.Companion;
            CleverTapAPI cleverTapAPIM23997i = INSTANCE.m23997i();
            if (cleverTapAPIM23997i != null) {
                cleverTapAPIM23997i.j0(name, params);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.a(th));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m24001o(@NotNull Bundle bundle) {
        bundle.getClass();
        try {
            Result.Companion companion = Result.Companion;
            CleverTapAPI cleverTapAPIM23997i = INSTANCE.m23997i();
            if (cleverTapAPIM23997i != null) {
                cleverTapAPIM23997i.m0(bundle);
            }
            CleverTapAPI.f0(application, bundle);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.a(th));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m24002p(@Nullable String token) {
        CleverTapAPI cleverTapAPIM23997i;
        if (token != null) {
            if (token.length() <= 0) {
                token = null;
            }
            if (token != null && (cleverTapAPIM23997i = INSTANCE.m23997i()) != null) {
                cleverTapAPIM23997i.k0(token, true);
            }
        }
        CleverTapAPI cleverTapAPIM23997i2 = m23997i();
        if (cleverTapAPIM23997i2 != null) {
            cleverTapAPIM23997i2.v0(new xv3() { // from class: l.v85
                /* JADX INFO: renamed from: a */
                public final void m23311a(HashMap map) {
                    w85.m23987a(map);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m24003q(@Nullable Location location) {
        CleverTapAPI cleverTapAPIM23997i;
        if (location == null || (cleverTapAPIM23997i = INSTANCE.m23997i()) == null) {
            return;
        }
        cleverTapAPIM23997i.y0(location);
    }
}
