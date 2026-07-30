package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\u0006`\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\b2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020!0\u000fj\b\u0012\u0004\u0012\u00020!`\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(R'\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R+\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\u0006`\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0012¨\u00062"}, m88121d2 = {"Ll/iej0;", "Ll/fej0;", "<init>", "()V", "", Constants.KEY_KEY, "Ll/aej0;", "traceBean", "", "g", "(Ljava/lang/String;Ll/aej0;)V", "p", "(Ljava/lang/String;)V", "o", "(Ljava/lang/String;)Ll/aej0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "k", "()Ljava/util/ArrayList;", "extras", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "describe", "e", "extra", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bean", "q", "(Ll/aej0;)V", "", "n", "()I", "Ll/vbg0;", "subTraceBeans", "h", "(Ljava/util/ArrayList;)V", RXScreenCaptureService.KEY_INDEX, "(Ll/vbg0;)V", "j", "(Ljava/lang/String;)Ll/vbg0;", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Lkotlin/Lazy;", "m", "()Ljava/util/concurrent/ConcurrentHashMap;", "mTempTraceMap", "b", BLiveStormDanmakuGiftResourceType.f45292l, "mLocalTraceList", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iej0 extends fej0 {

    @NotNull
    public static final iej0 INSTANCE = new iej0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mTempTraceMap = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.gej0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return iej0.m139617a();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mLocalTraceList = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.hej0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return iej0.m139618b();
        }
    });

    /* JADX INFO: renamed from: a */
    public static ConcurrentHashMap m139617a() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m139618b() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m139619d(iej0 iej0Var, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        iej0Var.m139620c(str, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public final void m139620c(@NotNull String key, @NotNull String describe, @NotNull String extra) {
        key.getClass();
        describe.getClass();
        extra.getClass();
        aej0 aej0VarM139631o = m139631o(key);
        if (aej0VarM139631o != null) {
            if (!TextUtils.isEmpty(extra)) {
                aej0VarM139631o.m97252d(extra);
            }
            iej0 iej0Var = INSTANCE;
            vbg0 vbg0VarM139626j = iej0Var.m139626j(describe);
            vbg0VarM139626j.m200707h(vbg0VarM139626j.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String() - ((vbg0) CollectionsKt.last((List) aej0VarM139631o.m97251c())).getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String());
            iej0Var.m139625i(vbg0VarM139626j);
            aej0VarM139631o.m97251c().add(vbg0VarM139626j);
            iej0Var.m139624h(aej0VarM139631o.m97251c());
            iej0Var.m139632p(key);
            iej0Var.m139633q(aej0VarM139631o);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m139621e(@NotNull String key, @NotNull String describe) {
        key.getClass();
        describe.getClass();
        aej0 aej0VarM139631o = m139631o(key);
        if (aej0VarM139631o != null) {
            iej0 iej0Var = INSTANCE;
            vbg0 vbg0VarM139626j = iej0Var.m139626j(describe);
            vbg0VarM139626j.m200707h(vbg0VarM139626j.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String() - ((vbg0) CollectionsKt.last((List) aej0VarM139631o.m97251c())).getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String());
            iej0Var.m139625i(vbg0VarM139626j);
            aej0VarM139631o.m97251c().add(vbg0VarM139626j);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m139622f(@NotNull String key, @NotNull String extras) {
        key.getClass();
        extras.getClass();
        aej0 aej0Var = new aej0(new ArrayList(), key, extras);
        aej0Var.m97251c().add(m139626j("trace start"));
        m139623g(key, aej0Var);
    }

    /* JADX INFO: renamed from: g */
    public void m139623g(@NotNull String key, @NotNull aej0 traceBean) {
        key.getClass();
        traceBean.getClass();
        m139629m().put(key, traceBean);
    }

    /* JADX INFO: renamed from: h */
    public final void m139624h(ArrayList<vbg0> subTraceBeans) {
        ((vbg0) CollectionsKt.first((List) subTraceBeans)).m200707h(((vbg0) CollectionsKt.last((List) subTraceBeans)).getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String() - ((vbg0) CollectionsKt.first((List) subTraceBeans)).getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String());
    }

    /* JADX INFO: renamed from: j */
    public final vbg0 m139626j(String describe) {
        return new vbg0("", "", 0, 0L, System.currentTimeMillis(), describe, null, 64, null);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ArrayList<aej0> m139627k() {
        return m139628l();
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList<aej0> m139628l() {
        return (ArrayList) mLocalTraceList.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap<String, aej0> m139629m() {
        return (ConcurrentHashMap) mTempTraceMap.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final int m139630n() {
        return 200;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public aej0 m139631o(@NotNull String key) {
        key.getClass();
        return m139629m().get(key);
    }

    /* JADX INFO: renamed from: p */
    public void m139632p(@NotNull String key) {
        key.getClass();
        m139629m().remove(key);
    }

    /* JADX INFO: renamed from: q */
    public final void m139633q(@NotNull aej0 bean) {
        bean.getClass();
        lej0.INSTANCE.m153913g(bean);
    }

    /* JADX INFO: renamed from: i */
    public final void m139625i(vbg0 bean) {
    }
}
