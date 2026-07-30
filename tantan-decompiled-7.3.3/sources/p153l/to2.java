package p153l;

import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.uniqueid.UniqueAndroidId;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001Bw\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0017"}, m88121d2 = {"Ll/to2;", "", "Lkotlin/Function0;", "", Oauth2AccessToken.KEY_UID, "oaId", Constants.DEVICE_ID_TAG, UniqueAndroidId.IDTAG, "versionName", "", "versionCode", "userInfoJson", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", Constants.INAPP_DATA_TAG, "()Lkotlin/jvm/functions/Function0;", "b", "c", "e", "g", "f", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class to2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> uid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> oaId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> deviceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> androidId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> versionName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> versionCode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> userInfoJson;

    public to2(@NotNull Function0<String> function0, @NotNull Function0<String> function1, @NotNull Function0<String> function2, @NotNull Function0<String> function3, @NotNull Function0<String> function4, @NotNull Function0<Integer> function5, @NotNull Function0<String> function6) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        this.uid = function0;
        this.oaId = function1;
        this.deviceId = function2;
        this.androidId = function3;
        this.versionName = function4;
        this.versionCode = function5;
        this.userInfoJson = function6;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Function0<String> m192001a() {
        return this.androidId;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function0<String> m192002b() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Function0<String> m192003c() {
        return this.oaId;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Function0<String> m192004d() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Function0<String> m192005e() {
        return this.userInfoJson;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Function0<Integer> m192006f() {
        return this.versionCode;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Function0<String> m192007g() {
        return this.versionName;
    }
}
