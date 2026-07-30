package p149l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.ClevertapApi;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001f\u0010\u001dR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-¨\u0006/"}, m87232d2 = {"Ll/w85;", "", "<init>", "()V", "Lcom/p1/mobile/putong/app/TantanApp;", "app", "", "j", "(Lcom/p1/mobile/putong/app/TantanApp;)V", "Lkotlin/Function1;", "", "call", "g", "(Lkotlin/jvm/functions/Function1;)V", AuthenticationTokenClaims.JSON_KEY_NAME, "", CommandMessage.PARAMS, "m", "(Ljava/lang/String;Ljava/util/Map;)V", "Landroid/location/Location;", "location", "q", "(Landroid/location/Location;)V", "Landroid/os/Bundle;", StickerBundle.TYPE, "o", "(Landroid/os/Bundle;)V", "token", "p", "(Ljava/lang/String;)V", "identity", "k", "Landroid/app/Application;", "a", "Landroid/app/Application;", "application", "Lcom/p1/mobile/putong/api/api/ClevertapApi;", "b", "Lkotlin/Lazy;", "h", "()Lcom/p1/mobile/putong/api/api/ClevertapApi;", "api", "Lcom/clevertap/android/sdk/CleverTapAPI;", "c", RXScreenCaptureService.KEY_INDEX, "()Lcom/clevertap/android/sdk/CleverTapAPI;", "cleverTapDefaultInstance", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class w85 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static Application application;

    @NotNull
    public static final w85 INSTANCE = new w85();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy api = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.q85
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return w85.m202133b();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy cleverTapDefaultInstance = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.r85
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return w85.m202135d();
        }
    });

    /* JADX INFO: renamed from: a */
    public static void m202132a(HashMap map) {
        Object obj;
        String string;
        Application application2;
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = null;
            Object obj2 = map != null ? map.get(Constants.DEEP_LINK_KEY) : null;
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
            } else if (map != null && (obj = map.get(Constants.DEEP_LINK_KEY)) != null && (string = obj.toString()) != null && string.length() > 0) {
                str = string;
            }
            if (str != null && str.length() != 0 && (application2 = application) != null) {
                w2e0.f184217g = str;
                Intent mainActIntent = qib0.f154714c0.getMainActIntent(application2);
                mainActIntent.addFlags(268435456);
                application2.startActivity(mainActIntent);
            }
            Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
    }

    /* JADX INFO: renamed from: b */
    public static ClevertapApi m202133b() {
        return new ClevertapApi();
    }

    /* JADX INFO: renamed from: d */
    public static CleverTapAPI m202135d() {
        try {
            return CleverTapAPI.m5753K(App.f15369e);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m202136e(Bundle bundle) {
        CleverTapAPI.m5783s(application, bundle);
    }

    /* JADX INFO: renamed from: f */
    public static void m202137f(Function1 function1, String str) {
        function1.invoke(str);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m202138l(Map map, List list) {
        CleverTapAPI cleverTapAPIM202142i;
        if (map != null && (cleverTapAPIM202142i = INSTANCE.m202142i()) != null) {
            cleverTapAPIM202142i.m5812n0(map);
        }
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            CleverTapAPI cleverTapAPIM202142i2 = INSTANCE.m202142i();
            if (cleverTapAPIM202142i2 != null) {
                cleverTapAPIM202142i2.m5815r0(str);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m202139n(w85 w85Var, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        w85Var.m202145m(str, map);
    }

    /* JADX INFO: renamed from: g */
    public final void m202140g(@NotNull final Function1<? super String, Unit> call) {
        call.getClass();
        CleverTapAPI cleverTapAPIM202142i = m202142i();
        if (cleverTapAPIM202142i != null) {
            cleverTapAPIM202142i.m5792E(new fe50() { // from class: l.u85
                @Override // p149l.fe50
                /* JADX INFO: renamed from: a */
                public final void mo121026a(String str) {
                    w85.m202137f(call, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final ClevertapApi m202141h() {
        return (ClevertapApi) api.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final CleverTapAPI m202142i() {
        return (CleverTapAPI) cleverTapDefaultInstance.getValue();
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: j */
    public final void m202143j(@NotNull TantanApp app) {
        app.getClass();
        application = app;
        try {
            Result.Companion companion = Result.INSTANCE;
            CleverTapAPI.m5786u(app, "clevertap", Active.TYPE, "active notification", 3, true);
            CleverTapAPI.m5788x0(CleverTapAPI.LogLevel.OFF);
            Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        CleverTapAPI cleverTapAPIM202142i = m202142i();
        if (cleverTapAPIM202142i != null) {
            cleverTapAPIM202142i.m5821x(true);
        }
        CleverTapAPI cleverTapAPIM202142i2 = m202142i();
        if (cleverTapAPIM202142i2 != null) {
            cleverTapAPIM202142i2.m5817u0(new wv3() { // from class: l.t85
                @Override // p149l.wv3
                /* JADX INFO: renamed from: a */
                public final void mo187519a(Bundle bundle) {
                    w85.m202136e(bundle);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m202144k(@Nullable String identity) {
        CleverTapAPI cleverTapAPIM202142i;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (identity != null) {
                if (identity.length() <= 0) {
                    identity = null;
                }
                if (identity != null && (cleverTapAPIM202142i = INSTANCE.m202142i()) != null) {
                    cleverTapAPIM202142i.m5801d0(MapsKt.mapOf(TuplesKt.m87240a("Identity", identity)));
                }
            }
            INSTANCE.m202141h().m29518x(new Function2() { // from class: l.s85
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w85.m202138l((Map) obj, (List) obj2);
                }
            });
            Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m202145m(@NotNull String name, @Nullable Map<String, ? extends Object> params) {
        Unit unit;
        name.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            CleverTapAPI cleverTapAPIM202142i = INSTANCE.m202142i();
            if (cleverTapAPIM202142i != null) {
                cleverTapAPIM202142i.m5806j0(name, params);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m223820constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m202146o(@NotNull Bundle bundle) {
        bundle.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            CleverTapAPI cleverTapAPIM202142i = INSTANCE.m202142i();
            if (cleverTapAPIM202142i != null) {
                cleverTapAPIM202142i.m5810m0(bundle);
            }
            CleverTapAPI.m5771f0(application, bundle);
            Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m202147p(@Nullable String token) {
        CleverTapAPI cleverTapAPIM202142i;
        if (token != null) {
            if (token.length() <= 0) {
                token = null;
            }
            if (token != null && (cleverTapAPIM202142i = INSTANCE.m202142i()) != null) {
                cleverTapAPIM202142i.m5807k0(token, true);
            }
        }
        CleverTapAPI cleverTapAPIM202142i2 = m202142i();
        if (cleverTapAPIM202142i2 != null) {
            cleverTapAPIM202142i2.m5819v0(new xv3() { // from class: l.v85
                @Override // p149l.xv3
                /* JADX INFO: renamed from: a */
                public final void mo197393a(HashMap map) {
                    w85.m202132a(map);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m202148q(@Nullable Location location) {
        CleverTapAPI cleverTapAPIM202142i;
        if (location == null || (cleverTapAPIM202142i = INSTANCE.m202142i()) == null) {
            return;
        }
        cleverTapAPIM202142i.m5823y0(location);
    }
}
