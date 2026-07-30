package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/fje0;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "", Constants.INAPP_DATA_TAG, "()Ljava/util/Collection;", "e", "c", "b", "g", "k", "h", "j", "f", "subdomain", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Ljava/lang/String;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class fje0 {

    @NotNull
    public static final fje0 INSTANCE = new fje0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = fje0.class.getName();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m121580a() {
        return "v16.0";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m121581b() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("m.%s", Arrays.copyOf(new Object[]{C1577c.m8057v()}, 1));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m121582c() {
        return "CONNECTION_FAILURE";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Collection<String> m121583d() {
        return CollectionsKt.listOf((Object[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"});
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Collection<String> m121584e() {
        return CollectionsKt.listOf((Object[]) new String[]{"access_denied", "OAuthAccessDeniedException"});
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m121585f() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("https://graph.%s", Arrays.copyOf(new Object[]{C1577c.m8057v()}, 1));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m121586g() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s", Arrays.copyOf(new Object[]{C1577c.m8058w()}, 1));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m121587h() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("https://graph.%s", Arrays.copyOf(new Object[]{C1577c.m8060y()}, 1));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m121588i(@NotNull String subdomain) {
        subdomain.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m121589j() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{C1577c.m8060y()}, 1));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m121590k() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("m.%s", Arrays.copyOf(new Object[]{C1577c.m8061z()}, 1));
    }
}
