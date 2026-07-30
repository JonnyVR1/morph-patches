package p006l;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.d;
import l.br2;
import l.stc0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Ll/uel;", "", "<init>", "()V", "", "enable", "", "f", "(Z)V", "g", "Ll/stc0;", "request", "d", "(Ll/stc0;)Ll/stc0;", "", "source", "c", "(Ljava/lang/String;)Ljava/lang/String;", "host", "e", "", "a", "Ljava/util/Set;", "HOST_WHITELIST", "b", "Lkotlin/Lazy;", "()Z", "changeHostEnable", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class uel {

    @NotNull
    public static final uel INSTANCE = new uel();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> HOST_WHITELIST = SetsKt.setOf(new String[]{"accounts.tantanapp.com", "active.tantanapp.com", "core.tantanapp.com", "growth.tantanapp.com", "intl-web-api.tantanapp.com", "live-web-api.tantanapp.com", "m.tantanapp.com", "mcn-live.tantanapp.com", "miheappintl.tantanapp.com", "oms.tantanapp.com", "order.tantanapp.com", "passport.tantanapp.com", "web-api.tantanapp.com", "wechat.tantanapp.com", "client-monitor.tantanapp.com", "httpdns.tantanapp.com", "connperf.tantanapp.com", "devices.tantanapp.com", "audio.tantanapp.com", "image.tantanapp.com", "affiliate.tantanapp.com", "seiya.tantanapp.com", "cloud.tantanapp.com", "cloud-direct.tantanapp.com", "intl-fep-api.tantanapp.com", "default.tantanapp.com", "deviceid.tantanapp.com", "report.tantanapp.com", "sc-report.tantanapp.com", "io-sm-log.tantanapp.com", "intlaffiliate.tantanapp.com", "live-web.tantanapp.com", "live-activity.tantanapp.com", "h5-static-overseas.tantanapp.com", "live-realtime.tantanapp.com", "l.tantanapp.com", "asset.tantanapp.com", "abtest.tantanapp.com", "counter.tantanapp.com", "autoupdate.tantanapp.com", "i.tantanapp.com", "intlweb.tantanapp.com", "int.tantanapp.com", "www.int.tantanapp.com", "lp.tantanapp.com", "pco-sm-log.tantanapp.com", "my-tantan.tantanapp.com", "openapi.tantanapp.com", "intl-live-activity.tantanapp.com", "i.tancdn.com", "auto.tancdn.com", "live-static.tancdn.com", "static.tancdn.com", "short-video.tancdn.com", "fe-static.tancdn.com", "h5-static-overseas.tancdn.com", "apk-ssl.tanapk.com"});

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy changeHostEnable = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.tel
        public final Object invoke() {
            return Boolean.valueOf(uel.m25198a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static boolean m25198a() {
        return br2.b().a("inner_domain_enable", false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25199b() {
        return ((Boolean) changeHostEnable.getValue()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m25200c(@NotNull String source) {
        source.getClass();
        try {
            Result.Companion companion = Result.Companion;
            Uri uri = Uri.parse(source);
            uri.getClass();
            String host = uri.getHost();
            try {
                if (host != null) {
                    return d.H(source, host, INSTANCE.m25202e(host), false, 4, (Object) null);
                }
                Result.constructor-impl((Object) null);
                return source;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable th3 = th;
        Result.Companion companion2 = Result.Companion;
        Result.constructor-impl(ResultKt.a(th3));
        return source;
    }

    @SuppressLint({"LogUseError"})
    @NotNull
    /* JADX INFO: renamed from: d */
    public final stc0 m25201d(@NotNull stc0 request) {
        request.getClass();
        try {
            if (m25199b()) {
                String strM = request.k().m();
                strM.getClass();
                String strM25202e = m25202e(strM);
                if (!TextUtils.equals(strM, strM25202e)) {
                    stc0 stc0VarB = request.h().s(request.k().p().h(strM25202e).d()).b();
                    stc0VarB.getClass();
                    return stc0VarB;
                }
            }
        } catch (Exception unused) {
        }
        return request;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m25202e(@NotNull String host) {
        host.getClass();
        if (!HOST_WHITELIST.contains(host)) {
            return host;
        }
        if (StringsKt.P(host, "tantanapp.com", false, 2, (Object) null)) {
            return d.H(host, "tantanapp.com", "tantantribe.com", false, 4, (Object) null);
        }
        if (StringsKt.P(host, "tancdn.com", false, 2, (Object) null)) {
            return d.H(host, "tancdn.com", "tantantribecdn.com", false, 4, (Object) null);
        }
        return StringsKt.P(host, "tanapk.com", false, 2, (Object) null) ? d.H(host, "tanapk.com", "tantantribeapk.com", false, 4, (Object) null) : host;
    }

    /* JADX INFO: renamed from: f */
    public final void m25203f(boolean enable) {
        try {
            br2.b().e("inner_domain_enable", Boolean.valueOf(enable));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m25204g(boolean enable) {
        try {
            br2.b().e("inner_domain_enable_stage", Boolean.valueOf(enable));
        } catch (Throwable unused) {
        }
    }
}
