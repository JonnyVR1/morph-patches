package p153l;

import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\"\u0010\"\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, m88121d2 = {"Ll/ef0;", "", "<init>", "()V", "Ll/jxd0;", "e", "()Ll/jxd0;", "f", "", Constants.INAPP_DATA_TAG, "()I", "", Constants.KEY_CONFIG, "g", "(Ljava/lang/String;)I", "Lrx/subjects/a;", "", "a", "Lrx/subjects/a;", "getAiAlbumConfigIsInitBs", "()Lrx/subjects/a;", "aiAlbumConfigIsInitBs", "Lrx/subjects/b;", "b", "Lrx/subjects/b;", "c", "()Lrx/subjects/b;", "aiAlbumStatusChange", "Lkotlin/Lazy;", "getSwipeCount", "swipeCount", "Ljava/lang/String;", "gender", "Z", "isStaticAnim", "()Z", "setStaticAnim", "(Z)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ef0 {

    @NotNull
    public static final ef0 INSTANCE = new ef0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final C22507a<Boolean> aiAlbumConfigIsInitBs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C22508b<Boolean> aiAlbumStatusChange;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static String gender;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static boolean isStaticAnim;

    static {
        C22507a<Boolean> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        aiAlbumConfigIsInitBs = c22507aM222758b;
        C22508b<Boolean> c22508bM222767b = C22508b.m222767b();
        c22508bM222767b.getClass();
        aiAlbumStatusChange = c22508bM222767b;
        swipeCount = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.cf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(ef0.m120573b());
            }
        });
        gender = "";
        isStaticAnim = true;
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m120572a(int i) {
        return Boolean.valueOf(uqb0.f180400f0 == i);
    }

    /* JADX INFO: renamed from: b */
    public static int m120573b() {
        return INSTANCE.m120575d();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C22508b<Boolean> m120574c() {
        return aiAlbumStatusChange;
    }

    /* JADX INFO: renamed from: d */
    public final int m120575d() {
        return m120578g("intl_ai_album");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final jxd0 m120576e() {
        return new jxd0("ai_album" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final jxd0 m120577f() {
        return new jxd0("ai_album_upload" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public final int m120578g(String config) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F(config);
            strM80485F.getClass();
            JSONObject jSONObject = new JSONObject(strM80485F);
            if (!jSONObject.optBoolean("enable") || !jyb.m147520m(JSON.parseArray(jSONObject.optString("mcc"), Integer.TYPE), new qcj() { // from class: l.df0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ef0.m120572a(((Integer) obj).intValue());
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
