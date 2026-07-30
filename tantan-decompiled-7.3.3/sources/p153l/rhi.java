package p153l;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.immomo.momomediaext.sei.BaseSei;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0018J%\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/rhi;", "Ll/a7m;", "<init>", "()V", "", "url", "bid", "Ll/zgi;", "h", "(Ljava/lang/String;Ljava/lang/String;)Ll/zgi;", "", "g", "(Ljava/lang/String;Ljava/lang/String;)V", "", "needUrlCheckGrey", "Ll/cd00;", "callback", "Lkotlin/Function0;", "onFinished", "c", "(Ljava/lang/String;Ljava/lang/String;ZLl/cd00;Lkotlin/jvm/functions/Function0;)V", "e", "(Ll/cd00;)V", "a", "()Z", "", "b", "()I", "f", "Ll/a7m$a;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)Ll/a7m$a;", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class rhi implements a7m {

    /* JADX INFO: renamed from: l.rhi$a */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/rhi$a;", "Ll/a7m$a;", "Ll/zgi;", BaseSei.INFO, "<init>", "(Ll/zgi;)V", "", "a", "()J", "Ll/zgi;", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C19848a implements a7m.InterfaceC15666a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final zgi info;

        public C19848a(@NotNull zgi zgiVar) {
            zgiVar.getClass();
            this.info = zgiVar;
        }

        @Override // p153l.a7m.InterfaceC15666a
        /* JADX INFO: renamed from: a */
        public long mo96380a() {
            FepPackageConfig fepPackageConfigM219623f = this.info.m219623f();
            if (fepPackageConfigM219623f != null) {
                return (long) fepPackageConfigM219623f.getFrequency();
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: h */
    private final zgi m181519h(String url, String bid) {
        if (url != null && !StringsKt.m94329e0(url)) {
            return FepManager.m17580m(FepManager.INSTANCE.m17610a(), url, null, 2, null);
        }
        if (bid == null || StringsKt.m94329e0(bid)) {
            return null;
        }
        return FepManager.m17581o(FepManager.INSTANCE.m17610a(), bid, null, url, null, 8, null);
    }

    @Override // p153l.a7m
    /* JADX INFO: renamed from: a */
    public boolean mo96373a() {
        return rs8.m182925p();
    }

    @Override // p153l.a7m
    /* JADX INFO: renamed from: b */
    public int mo96374b() {
        return rs8.m182931v();
    }

    @Override // p153l.a7m
    /* JADX INFO: renamed from: c */
    public void mo96375c(@Nullable String url, @Nullable String bid, boolean needUrlCheckGrey, @Nullable cd00 callback, @NotNull Function0<Unit> onFinished) {
        onFinished.getClass();
        if (bid == null || StringsKt.m94329e0(bid) || Intrinsics.m88377d(bid, "0")) {
            onFinished.invoke();
        } else {
            m181519h(url, bid);
            onFinished.invoke();
        }
    }

    @Override // p153l.a7m
    @Nullable
    /* JADX INFO: renamed from: d */
    public a7m.InterfaceC15666a mo96376d(@Nullable String bid, @Nullable String url) {
        zgi zgiVarM17593p = FepManager.INSTANCE.m17610a().m17593p(url, bid, CheckPolicy.LOCAL_ONLY);
        if (zgiVarM17593p != null) {
            return new C19848a(zgiVarM17593p);
        }
        return null;
    }

    @Override // p153l.a7m
    /* JADX INFO: renamed from: e */
    public void mo96377e(@Nullable cd00 callback) {
        FepManager.INSTANCE.m17610a().m17585f(FepConfigFetchType.MANUAL);
    }

    @Override // p153l.a7m
    /* JADX INFO: renamed from: f */
    public boolean mo96378f() {
        return rs8.m182932w();
    }

    @Override // p153l.a7m
    /* JADX INFO: renamed from: g */
    public void mo96379g(@Nullable String url, @Nullable String bid) {
        zgi zgiVarM181519h = m181519h(url, bid);
        StringBuilder sb = new StringBuilder("executeCheckUpdate：bid=");
        sb.append(zgiVarM181519h != null ? zgiVarM181519h.getBid() : null);
        sb.append(" url=");
        sb.append(zgiVarM181519h != null ? zgiVarM181519h.getPageUrl() : null);
        sb.append("  baseVersion=");
        sb.append(zgiVarM181519h != null ? zgiVarM181519h.getBaseVersion() : null);
        sb.append(" version=");
        sb.append(zgiVarM181519h != null ? Long.valueOf(zgiVarM181519h.m219624g()) : null);
        jzv.m147732e("MK---WebView", sb.toString());
    }
}
