package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\u0006`\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\b2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020!0\u000fj\b\u0012\u0004\u0012\u00020!`\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(R'\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R+\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\u0006`\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0012¨\u00062"}, m87232d2 = {"Ll/e5j0;", "Ll/b5j0;", "<init>", "()V", "", Constants.KEY_KEY, "Ll/w4j0;", "traceBean", "", "g", "(Ljava/lang/String;Ll/w4j0;)V", "p", "(Ljava/lang/String;)V", "o", "(Ljava/lang/String;)Ll/w4j0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "k", "()Ljava/util/ArrayList;", "extras", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "describe", "e", "extra", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bean", "q", "(Ll/w4j0;)V", "", "n", "()I", "Ll/o3g0;", "subTraceBeans", "h", "(Ljava/util/ArrayList;)V", RXScreenCaptureService.KEY_INDEX, "(Ll/o3g0;)V", "j", "(Ljava/lang/String;)Ll/o3g0;", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Lkotlin/Lazy;", "m", "()Ljava/util/concurrent/ConcurrentHashMap;", "mTempTraceMap", "b", BLiveStormDanmakuGiftResourceType.f44444l, "mLocalTraceList", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class e5j0 extends b5j0 {

    @NotNull
    public static final e5j0 INSTANCE = new e5j0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mTempTraceMap = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.c5j0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e5j0.m114813a();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mLocalTraceList = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.d5j0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e5j0.m114814b();
        }
    });

    /* JADX INFO: renamed from: a */
    public static ConcurrentHashMap m114813a() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m114814b() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m114815d(e5j0 e5j0Var, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        e5j0Var.m114816c(str, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public final void m114816c(@NotNull String key, @NotNull String describe, @NotNull String extra) {
        key.getClass();
        describe.getClass();
        extra.getClass();
        w4j0 w4j0VarM114827o = m114827o(key);
        if (w4j0VarM114827o != null) {
            if (!TextUtils.isEmpty(extra)) {
                w4j0VarM114827o.m201531d(extra);
            }
            e5j0 e5j0Var = INSTANCE;
            o3g0 o3g0VarM114822j = e5j0Var.m114822j(describe);
            o3g0VarM114822j.m162426h(o3g0VarM114822j.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String() - ((o3g0) CollectionsKt.last((List) w4j0VarM114827o.m201530c())).getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String());
            e5j0Var.m114821i(o3g0VarM114822j);
            w4j0VarM114827o.m201530c().add(o3g0VarM114822j);
            e5j0Var.m114820h(w4j0VarM114827o.m201530c());
            e5j0Var.m114828p(key);
            e5j0Var.m114829q(w4j0VarM114827o);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m114817e(@NotNull String key, @NotNull String describe) {
        key.getClass();
        describe.getClass();
        w4j0 w4j0VarM114827o = m114827o(key);
        if (w4j0VarM114827o != null) {
            e5j0 e5j0Var = INSTANCE;
            o3g0 o3g0VarM114822j = e5j0Var.m114822j(describe);
            o3g0VarM114822j.m162426h(o3g0VarM114822j.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String() - ((o3g0) CollectionsKt.last((List) w4j0VarM114827o.m201530c())).getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String());
            e5j0Var.m114821i(o3g0VarM114822j);
            w4j0VarM114827o.m201530c().add(o3g0VarM114822j);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m114818f(@NotNull String key, @NotNull String extras) {
        key.getClass();
        extras.getClass();
        w4j0 w4j0Var = new w4j0(new ArrayList(), key, extras);
        w4j0Var.m201530c().add(m114822j("trace start"));
        m114819g(key, w4j0Var);
    }

    /* JADX INFO: renamed from: g */
    public void m114819g(@NotNull String key, @NotNull w4j0 traceBean) {
        key.getClass();
        traceBean.getClass();
        m114825m().put(key, traceBean);
    }

    /* JADX INFO: renamed from: h */
    public final void m114820h(ArrayList<o3g0> subTraceBeans) {
        ((o3g0) CollectionsKt.first((List) subTraceBeans)).m162426h(((o3g0) CollectionsKt.last((List) subTraceBeans)).getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String() - ((o3g0) CollectionsKt.first((List) subTraceBeans)).getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String());
    }

    /* JADX INFO: renamed from: j */
    public final o3g0 m114822j(String describe) {
        return new o3g0("", "", 0, 0L, System.currentTimeMillis(), describe, null, 64, null);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ArrayList<w4j0> m114823k() {
        return m114824l();
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList<w4j0> m114824l() {
        return (ArrayList) mLocalTraceList.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap<String, w4j0> m114825m() {
        return (ConcurrentHashMap) mTempTraceMap.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final int m114826n() {
        return 200;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public w4j0 m114827o(@NotNull String key) {
        key.getClass();
        return m114825m().get(key);
    }

    /* JADX INFO: renamed from: p */
    public void m114828p(@NotNull String key) {
        key.getClass();
        m114825m().remove(key);
    }

    /* JADX INFO: renamed from: q */
    public final void m114829q(@NotNull w4j0 bean) {
        bean.getClass();
        h5j0.INSTANCE.m129408g(bean);
    }

    /* JADX INFO: renamed from: i */
    public final void m114821i(o3g0 bean) {
    }
}
