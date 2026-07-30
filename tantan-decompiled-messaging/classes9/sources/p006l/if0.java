package p006l;

import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import l.hpd0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\"\u0010\"\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ll/if0;", "", "<init>", "()V", "Ll/hpd0;", "e", "()Ll/hpd0;", "f", "", "d", "()I", "", "config", "g", "(Ljava/lang/String;)I", "Lrx/subjects/a;", "", "a", "Lrx/subjects/a;", "getAiAlbumConfigIsInitBs", "()Lrx/subjects/a;", "aiAlbumConfigIsInitBs", "Lrx/subjects/b;", "b", "Lrx/subjects/b;", "c", "()Lrx/subjects/b;", "aiAlbumStatusChange", "Lkotlin/Lazy;", "getSwipeCount", "swipeCount", "Ljava/lang/String;", "gender", "Z", "isStaticAnim", "()Z", "setStaticAnim", "(Z)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class if0 {

    @NotNull
    public static final if0 INSTANCE = new if0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final a<Boolean> aiAlbumConfigIsInitBs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final b<Boolean> aiAlbumStatusChange;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static String gender;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static boolean isStaticAnim;

    static {
        a<Boolean> aVarB = a.b();
        aVarB.getClass();
        aiAlbumConfigIsInitBs = aVarB;
        b<Boolean> bVarB = b.b();
        bVarB.getClass();
        aiAlbumStatusChange = bVarB;
        swipeCount = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.gf0
            public final Object invoke() {
                return Integer.valueOf(if0.m16647b());
            }
        });
        gender = "";
        isStaticAnim = true;
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m16646a(int i) {
        return Boolean.valueOf(qib0.f19808f0 == i);
    }

    /* JADX INFO: renamed from: b */
    public static int m16647b() {
        return INSTANCE.m16649d();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final b<Boolean> m16648c() {
        return aiAlbumStatusChange;
    }

    /* JADX INFO: renamed from: d */
    public final int m16649d() {
        return m16652g("intl_ai_album");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final hpd0 m16650e() {
        return new hpd0("ai_album" + CoreModule.m1850H().userId(), Boolean.FALSE);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final hpd0 m16651f() {
        return new hpd0("ai_album_upload" + CoreModule.m1850H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public final int m16652g(String config) {
        try {
            String strF = RemoteConfig.x().F(config);
            strF.getClass();
            JSONObject jSONObject = new JSONObject(strF);
            if (!jSONObject.optBoolean("enable") || !vwb.m(JSON.parseArray(jSONObject.optString("mcc"), Integer.TYPE), new w9j() { // from class: l.hf0
                public final Object call(Object obj) {
                    return if0.m16646a(((Integer) obj).intValue());
                }
            })) {
                return -1;
            }
            String strOptString = jSONObject.optString("gender");
            strOptString.getClass();
            gender = strOptString;
            return jSONObject.optInt("swipe_count");
        } catch (Exception unused) {
            return -1;
        }
    }
}
