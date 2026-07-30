package p149l;

import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\"\u0010\"\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, m87232d2 = {"Ll/if0;", "", "<init>", "()V", "Ll/hpd0;", "e", "()Ll/hpd0;", "f", "", Constants.INAPP_DATA_TAG, "()I", "", Constants.KEY_CONFIG, "g", "(Ljava/lang/String;)I", "Lrx/subjects/a;", "", "a", "Lrx/subjects/a;", "getAiAlbumConfigIsInitBs", "()Lrx/subjects/a;", "aiAlbumConfigIsInitBs", "Lrx/subjects/b;", "b", "Lrx/subjects/b;", "c", "()Lrx/subjects/b;", "aiAlbumStatusChange", "Lkotlin/Lazy;", "getSwipeCount", "swipeCount", "Ljava/lang/String;", "gender", "Z", "isStaticAnim", "()Z", "setStaticAnim", "(Z)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class if0 {

    @NotNull
    public static final if0 INSTANCE = new if0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final C22392a<Boolean> aiAlbumConfigIsInitBs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C22393b<Boolean> aiAlbumStatusChange;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static String gender;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static boolean isStaticAnim;

    static {
        C22392a<Boolean> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        aiAlbumConfigIsInitBs = c22392aM221512b;
        C22393b<Boolean> c22393bM221521b = C22393b.m221521b();
        c22393bM221521b.getClass();
        aiAlbumStatusChange = c22393bM221521b;
        swipeCount = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.gf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(if0.m135837b());
            }
        });
        gender = "";
        isStaticAnim = true;
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m135836a(int i) {
        return Boolean.valueOf(qib0.f154717f0 == i);
    }

    /* JADX INFO: renamed from: b */
    public static int m135837b() {
        return INSTANCE.m135839d();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C22393b<Boolean> m135838c() {
        return aiAlbumStatusChange;
    }

    /* JADX INFO: renamed from: d */
    public final int m135839d() {
        return m135842g("intl_ai_album");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final hpd0 m135840e() {
        return new hpd0("ai_album" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final hpd0 m135841f() {
        return new hpd0("ai_album_upload" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public final int m135842g(String config) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F(config);
            strM79302F.getClass();
            JSONObject jSONObject = new JSONObject(strM79302F);
            if (!jSONObject.optBoolean("enable") || !vwb.m200337m(JSON.parseArray(jSONObject.optString("mcc"), Integer.TYPE), new w9j() { // from class: l.hf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return if0.m135836a(((Integer) obj).intValue());
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
