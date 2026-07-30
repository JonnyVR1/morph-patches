package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR8\u0010\u0010\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u0005 \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/bzc0;", "", "<init>", "()V", "Lrx/c;", "", Constants.INAPP_DATA_TAG, "()Lrx/c;", "updateType", "", "g", "(Ljava/lang/String;)V", "Lrx/subjects/b;", "kotlin.jvm.PlatformType", "a", "Lrx/subjects/b;", "updateMyTabDataBs", "", "b", "Z", "isShowedDlg", "()Z", "setShowedDlg", "(Z)V", "Companion", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class bzc0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile bzc0 f78012c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C22393b<String> updateMyTabDataBs = C22393b.m221521b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isShowedDlg = true;

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final bzc0 m104564c() {
        return INSTANCE.m104570b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m104565e() {
        return INSTANCE.m104571c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m104566f() {
        return INSTANCE.m104572d();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C22306c<String> m104567d() {
        C22306c<String> c22306cAsObservable = this.updateMyTabDataBs.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: g */
    public final void m104568g(@NotNull String updateType) {
        updateType.getClass();
        this.updateMyTabDataBs.onNext(updateType);
    }

    /* JADX INFO: renamed from: l.bzc0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, m87232d2 = {"Ll/bzc0$a;", "", "<init>", "()V", "Ll/bzc0;", "b", "()Ll/bzc0;", "", Constants.INAPP_DATA_TAG, "()Z", "c", "", "parameter", "a", "(Ljava/lang/String;)Z", "instance", "Ll/bzc0;", "REV_NEW_MYTAB_BIZ_V5", "Ljava/lang/String;", "MY_TAB_VIP", "ENABLE_DOT_DISSMIS", "ENABLE_FEMALE_DOT", "ENABLE_SCROLL_GUIDE", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m104569a(@NotNull String parameter) {
            parameter.getClass();
            String strM79302F = RemoteConfig.m79298x().m79302F("my_tab_vip");
            strM79302F.getClass();
            try {
                return new JSONObject(strM79302F).getBoolean(parameter);
            } catch (Exception unused) {
                return false;
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final bzc0 m104570b() {
            bzc0 bzc0Var;
            bzc0 bzc0Var2 = bzc0.f78012c;
            if (bzc0Var2 != null) {
                return bzc0Var2;
            }
            synchronized (this) {
                bzc0Var = bzc0.f78012c;
                if (bzc0Var == null) {
                    bzc0Var = new bzc0();
                    bzc0.f78012c = bzc0Var;
                }
            }
            return bzc0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final boolean m104571c() {
            return m104572d() && m104569a("enable_scroll_guide");
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final boolean m104572d() {
            return Intrinsics.m87488d(AuthenticationTokenClaims.JSON_KEY_EXP, ABManager.m29350i0("REV_vip_navigation5")) || wh5.m203106d().m203109f();
        }

        public Companion() {
        }
    }
}
