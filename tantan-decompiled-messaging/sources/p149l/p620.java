package p149l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.internal.C1657e;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Permissions;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import io.agora.utils2.internal.CommonUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007ehk\u000b\b\u0006bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J!\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0083\u0001\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\n2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\n2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0019H\u0007¢\u0006\u0004\b$\u0010%J©\u0001\u0010,\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\n2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\n2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010\n2\b\u0010+\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b,\u0010-J±\u0001\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\n2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\n2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u000200H\u0007¢\u0006\u0004\b4\u00105J-\u0010;\u001a\u0004\u0018\u00010\u000f2\u0006\u00106\u001a\u00020\u000f2\b\u00108\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u0002002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b?\u0010@J\u001b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u0004\u0018\u0001072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u0001072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\bF\u0010EJ\u0017\u0010H\u001a\u00020\u00192\u0006\u0010G\u001a\u00020\u000fH\u0007¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u0004\u0018\u0001092\b\u0010J\u001a\u0004\u0018\u000107H\u0007¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u0004\u0018\u0001072\b\u0010\b\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u0002002\u0006\u0010O\u001a\u000200H\u0007¢\u0006\u0004\bP\u0010QJ'\u0010V\u001a\u00020U2\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u00020XH\u0007¢\u0006\u0004\bY\u0010\u0003J\u001d\u0010[\u001a\b\u0012\u0004\u0012\u0002000Z2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b[\u0010\\J/\u0010_\u001a\u0002002\u000e\u0010]\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010Z2\u0006\u0010^\u001a\u0002002\u0006\u0010T\u001a\u00020SH\u0007¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020a2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\bb\u0010cR\u001c\u0010g\u001a\n d*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010iR&\u0010n\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010mR\u0014\u0010q\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010pR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u0002000r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010s¨\u0006u"}, m87232d2 = {"Ll/p620;", "", "<init>", "()V", "", "Ll/p620$e;", "f", "()Ljava/util/List;", "e", "", "", Constants.INAPP_DATA_TAG, "()Ljava/util/Map;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "appInfo", "A", "(Landroid/content/Context;Landroid/content/Intent;Ll/p620$e;)Landroid/content/Intent;", "B", "applicationId", "", Permissions.TYPE, "e2e", "", "isRerequest", "isForPublish", "Lcom/facebook/login/DefaultAudience;", "defaultAudience", "clientState", "authType", "messengerPageId", "resetMessengerState", "isFamilyLogin", "shouldSkipAccountDedupe", "j", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;ZZLcom/facebook/login/DefaultAudience;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;", "ignoreAppSwitchToLoggedOut", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "nonce", "codeChallenge", "codeChallengeMethod", "k", "(Ll/p620$e;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;ZLcom/facebook/login/DefaultAudience;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/facebook/login/LoginTargetApp;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "n", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;ZZLcom/facebook/login/DefaultAudience;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "", "u", "()I", WBConstants.AUTH_PARAMS_VERSION, BaseSei.f13931Y, "(I)Z", "requestIntent", "Landroid/os/Bundle;", "results", "Lcom/facebook/FacebookException;", "error", "m", "(Landroid/content/Intent;Landroid/os/Bundle;Lcom/facebook/FacebookException;)Landroid/content/Intent;", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/content/Context;)Landroid/content/Intent;", "w", "(Landroid/content/Intent;)I", "Ljava/util/UUID;", "q", "(Landroid/content/Intent;)Ljava/util/UUID;", "p", "(Landroid/content/Intent;)Landroid/os/Bundle;", ResourceDirection.f38808v, "resultIntent", BaseSei.f13930X, "(Landroid/content/Intent;)Z", "errorData", "r", "(Landroid/os/Bundle;)Lcom/facebook/FacebookException;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/FacebookException;)Landroid/os/Bundle;", "minimumVersion", Constants.KEY_T, "(I)I", "appInfoList", "", "versionSpec", "Ll/p620$f;", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/util/List;[I)Ll/p620$f;", "", BaseSei.f13932Z, "Ljava/util/TreeSet;", "o", "(Ll/p620$e;)Ljava/util/TreeSet;", "allAvailableFacebookAppVersions", "latestSdkVersion", "h", "(Ljava/util/TreeSet;I[I)I", "Landroid/net/Uri;", "g", "(Ll/p620$e;)Landroid/net/Uri;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "b", "Ljava/util/List;", "facebookAppInfoList", "c", "effectCameraAppInfoList", "Ljava/util/Map;", "actionToAppInfoMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "protocolVersionsAsyncUpdating", "", "[Ljava/lang/Integer;", "KNOWN_PROTOCOL_VERSIONS", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class p620 {

    @NotNull
    public static final p620 INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<AbstractC19144e> facebookAppInfoList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<AbstractC19144e> effectCameraAppInfoList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, List<AbstractC19144e>> actionToAppInfoMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean protocolVersionsAsyncUpdating;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Integer[] KNOWN_PROTOCOL_VERSIONS;

    /* JADX INFO: renamed from: l.p620$a */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/p620$a;", "Ll/p620$e;", "<init>", "()V", "", "g", "()Ljava/lang/Void;", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C19140a extends AbstractC19144e {
        @Override // p149l.p620.AbstractC19144e
        /* JADX INFO: renamed from: c */
        public /* bridge */ /* synthetic */ String mo167605c() {
            return (String) m167607g();
        }

        @Override // p149l.p620.AbstractC19144e
        @NotNull
        /* JADX INFO: renamed from: d */
        public String mo167606d() {
            return "com.facebook.arstudio.player";
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public Void m167607g() {
            return null;
        }
    }

    /* JADX INFO: renamed from: l.p620$b */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m87232d2 = {"Ll/p620$b;", "Ll/p620$e;", "<init>", "()V", "", "c", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "e", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C19141b extends AbstractC19144e {
        @Override // p149l.p620.AbstractC19144e
        @NotNull
        /* JADX INFO: renamed from: c */
        public String mo167605c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // p149l.p620.AbstractC19144e
        @NotNull
        /* JADX INFO: renamed from: d */
        public String mo167606d() {
            return "com.instagram.android";
        }

        @Override // p149l.p620.AbstractC19144e
        @NotNull
        /* JADX INFO: renamed from: e */
        public String mo167608e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* JADX INFO: renamed from: l.p620$c */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/p620$c;", "Ll/p620$e;", "<init>", "()V", "", "c", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "", "f", "", "g", "()Z", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C19142c extends AbstractC19144e {
        @Override // p149l.p620.AbstractC19144e
        @NotNull
        /* JADX INFO: renamed from: c */
        public String mo167605c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // p149l.p620.AbstractC19144e
        @NotNull
        /* JADX INFO: renamed from: d */
        public String mo167606d() {
            return "com.facebook.katana";
        }

        @Override // p149l.p620.AbstractC19144e
        /* JADX INFO: renamed from: f */
        public void mo167609f() {
            if (m167610g()) {
                p620.m167581c();
            }
        }

        /* JADX INFO: renamed from: g */
        public final boolean m167610g() {
            return C1577c.m8047l().getApplicationInfo().targetSdkVersion >= 30;
        }
    }

    /* JADX INFO: renamed from: l.p620$d */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/p620$d;", "Ll/p620$e;", "<init>", "()V", "", "g", "()Ljava/lang/Void;", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C19143d extends AbstractC19144e {
        @Override // p149l.p620.AbstractC19144e
        /* JADX INFO: renamed from: c */
        public /* bridge */ /* synthetic */ String mo167605c() {
            return (String) m167611g();
        }

        @Override // p149l.p620.AbstractC19144e
        @NotNull
        /* JADX INFO: renamed from: d */
        public String mo167606d() {
            return "com.facebook.orca";
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public Void m167611g() {
            return null;
        }
    }

    /* JADX INFO: renamed from: l.p620$g */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"Ll/p620$g;", "Ll/p620$e;", "<init>", "()V", "", "c", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C19146g extends AbstractC19144e {
        @Override // p149l.p620.AbstractC19144e
        @NotNull
        /* JADX INFO: renamed from: c */
        public String mo167605c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // p149l.p620.AbstractC19144e
        @NotNull
        /* JADX INFO: renamed from: d */
        public String mo167606d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        p620 p620Var = new p620();
        INSTANCE = p620Var;
        TAG = p620.class.getName();
        facebookAppInfoList = p620Var.m167600f();
        effectCameraAppInfoList = p620Var.m167599e();
        actionToAppInfoMap = p620Var.m167598d();
        protocolVersionsAsyncUpdating = new AtomicBoolean(false);
        KNOWN_PROTOCOL_VERSIONS = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: A */
    public static final Intent m167577A(@NotNull Context context, @Nullable Intent intent, @Nullable AbstractC19144e appInfo) {
        ResolveInfo resolveInfoResolveActivity;
        if (lsb.m151554d(p620.class)) {
            return null;
        }
        try {
            context.getClass();
            if (intent == null || (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            str.getClass();
            if (qvf.m176697a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: B */
    public static final Intent m167578B(@NotNull Context context, @Nullable Intent intent, @Nullable AbstractC19144e appInfo) {
        ResolveInfo resolveInfoResolveService;
        if (lsb.m151554d(p620.class)) {
            return null;
        }
        try {
            context.getClass();
            if (intent == null || (resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            String str = resolveInfoResolveService.serviceInfo.packageName;
            str.getClass();
            if (qvf.m176697a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m167579a() {
        if (lsb.m151554d(p620.class)) {
            return;
        }
        try {
            try {
                Iterator<AbstractC19144e> it = facebookAppInfoList.iterator();
                while (it.hasNext()) {
                    it.next().m167612a(true);
                }
                protocolVersionsAsyncUpdating.set(false);
            } catch (Throwable th) {
                protocolVersionsAsyncUpdating.set(false);
                throw th;
            }
        } catch (Throwable th2) {
            lsb.m151552b(th2, p620.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ TreeSet m167580b(p620 p620Var, AbstractC19144e abstractC19144e) {
        if (lsb.m151554d(p620.class)) {
            return null;
        }
        try {
            return p620Var.m167603o(abstractC19144e);
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ String m167581c() {
        if (lsb.m151554d(p620.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final int m167582h(@Nullable TreeSet<Integer> allAvailableFacebookAppVersions, int latestSdkVersion, @NotNull int[] versionSpec) {
        if (lsb.m151554d(p620.class)) {
            return 0;
        }
        try {
            versionSpec.getClass();
            if (allAvailableFacebookAppVersions == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator<Integer> itDescendingIterator = allAvailableFacebookAppVersions.descendingIterator();
            int iMax = -1;
            while (itDescendingIterator.hasNext()) {
                Integer next = itDescendingIterator.next();
                next.getClass();
                iMax = Math.max(iMax, next.intValue());
                while (length >= 0 && versionSpec[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == next.intValue()) {
                    if (length % 2 != 0) {
                        break;
                    }
                    return Math.min(iMax, latestSdkVersion);
                }
            }
            return -1;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return 0;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final Bundle m167583i(@Nullable FacebookException e) {
        if (lsb.m151554d(p620.class) || e == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", e.toString());
            if (!(e instanceof FacebookOperationCanceledException)) {
                return bundle;
            }
            bundle.putString("error_type", "UserCanceled");
            return bundle;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j */
    public static final Intent m167584j(@NotNull Context context, @NotNull String applicationId, @NotNull Collection<String> permissions, @NotNull String e2e, boolean isRerequest, boolean isForPublish, @NotNull DefaultAudience defaultAudience, @NotNull String clientState, @NotNull String authType, @Nullable String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe) {
        if (lsb.m151554d(p620.class)) {
            return null;
        }
        try {
            context.getClass();
            applicationId.getClass();
            permissions.getClass();
            e2e.getClass();
            defaultAudience.getClass();
            clientState.getClass();
            authType.getClass();
            C19141b c19141b = new C19141b();
            return m167577A(context, INSTANCE.m167602k(c19141b, applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, false, messengerPageId, resetMessengerState, LoginTargetApp.INSTAGRAM, isFamilyLogin, shouldSkipAccountDedupe, "", null, null), c19141b);
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: l */
    public static final Intent m167585l(@NotNull Context context) {
        if (lsb.m151554d(p620.class)) {
            return null;
        }
        try {
            context.getClass();
            for (AbstractC19144e abstractC19144e : facebookAppInfoList) {
                Intent intentM167578B = m167578B(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(abstractC19144e.mo167606d()).addCategory("android.intent.category.DEFAULT"), abstractC19144e);
                if (intentM167578B != null) {
                    return intentM167578B;
                }
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: m */
    public static final Intent m167586m(@NotNull Intent requestIntent, @Nullable Bundle results, @Nullable FacebookException error) {
        if (lsb.m151554d(p620.class)) {
            return null;
        }
        try {
            requestIntent.getClass();
            UUID uuidM167589q = m167589q(requestIntent);
            if (uuidM167589q == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m167594w(requestIntent));
            Bundle bundle = new Bundle();
            bundle.putString("action_id", uuidM167589q.toString());
            if (error != null) {
                bundle.putBundle("error", m167583i(error));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle);
            if (results != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", results);
            }
            return intent;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final List<Intent> m167587n(@Nullable Context context, @NotNull String applicationId, @NotNull Collection<String> permissions, @NotNull String e2e, boolean isRerequest, boolean isForPublish, @NotNull DefaultAudience defaultAudience, @NotNull String clientState, @NotNull String authType, boolean ignoreAppSwitchToLoggedOut, @Nullable String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe, @Nullable String nonce, @Nullable String codeChallenge, @Nullable String codeChallengeMethod) {
        if (lsb.m151554d(p620.class)) {
            return null;
        }
        try {
            applicationId.getClass();
            permissions.getClass();
            e2e.getClass();
            defaultAudience.getClass();
            clientState.getClass();
            authType.getClass();
            List<AbstractC19144e> list = facebookAppInfoList;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Intent intentM167602k = INSTANCE.m167602k((AbstractC19144e) it.next(), applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, ignoreAppSwitchToLoggedOut, messengerPageId, resetMessengerState, LoginTargetApp.FACEBOOK, isFamilyLogin, shouldSkipAccountDedupe, nonce, codeChallenge, codeChallengeMethod);
                if (intentM167602k != null) {
                    arrayList.add(intentM167602k);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: p */
    public static final Bundle m167588p(@NotNull Intent intent) {
        if (lsb.m151554d(p620.class)) {
            return null;
        }
        try {
            intent.getClass();
            if (m167596y(m167594w(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: q */
    public static final UUID m167589q(@Nullable Intent intent) {
        String stringExtra;
        if (lsb.m151554d(p620.class) || intent == null) {
            return null;
        }
        try {
            if (m167596y(m167594w(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra != null) {
                try {
                    return UUID.fromString(stringExtra);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: r */
    public static final FacebookException m167590r(@Nullable Bundle errorData) {
        if (lsb.m151554d(p620.class) || errorData == null) {
            return null;
        }
        try {
            String string = errorData.getString("error_type");
            if (string == null) {
                string = errorData.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = errorData.getString("error_description");
            if (string2 == null) {
                string2 = errorData.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !C15386d.m93490x(string, "UserCanceled", true)) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final int m167591t(int minimumVersion) {
        if (lsb.m151554d(p620.class)) {
            return 0;
        }
        try {
            return INSTANCE.m167604s(facebookAppInfoList, new int[]{minimumVersion}).getProtocolVersion();
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return 0;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final int m167592u() {
        if (lsb.m151554d(p620.class)) {
            return 0;
        }
        try {
            return KNOWN_PROTOCOL_VERSIONS[0].intValue();
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return 0;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: v */
    public static final Bundle m167593v(@NotNull Intent intent) {
        if (lsb.m151554d(p620.class)) {
            return null;
        }
        try {
            intent.getClass();
            return !m167596y(m167594w(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final int m167594w(@NotNull Intent intent) {
        if (lsb.m151554d(p620.class)) {
            return 0;
        }
        try {
            intent.getClass();
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return 0;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: x */
    public static final boolean m167595x(@NotNull Intent resultIntent) {
        if (lsb.m151554d(p620.class)) {
            return false;
        }
        try {
            resultIntent.getClass();
            Bundle bundleM167588p = m167588p(resultIntent);
            return bundleM167588p != null ? bundleM167588p.containsKey("error") : resultIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: y */
    public static final boolean m167596y(int version) {
        if (lsb.m151554d(p620.class)) {
            return false;
        }
        try {
            return ArraysKt.contains(KNOWN_PROTOCOL_VERSIONS, Integer.valueOf(version)) && version >= 20140701;
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: z */
    public static final void m167597z() {
        if (lsb.m151554d(p620.class)) {
            return;
        }
        try {
            if (protocolVersionsAsyncUpdating.compareAndSet(false, true)) {
                C1577c.m8056u().execute(new Runnable() { // from class: l.o620
                    @Override // java.lang.Runnable
                    public final void run() {
                        p620.m167579a();
                    }
                });
            }
        } catch (Throwable th) {
            lsb.m151552b(th, p620.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, List<AbstractC19144e>> m167598d() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C19143d());
            List<AbstractC19144e> list = facebookAppInfoList;
            map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.CAMERA_EFFECT", effectCameraAppInfoList);
            map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return map;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final List<AbstractC19144e> m167599e() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new C19140a());
            arrayListArrayListOf.addAll(m167600f());
            return arrayListArrayListOf;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final List<AbstractC19144e> m167600f() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            return CollectionsKt.arrayListOf(new C19142c(), new C19146g());
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Uri m167601g(AbstractC19144e appInfo) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            Uri uri = Uri.parse(CommonUtility.PREFIX_URI + appInfo.mo167606d() + ".provider.PlatformProvider/versions");
            uri.getClass();
            return uri;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final Intent m167602k(AbstractC19144e appInfo, String applicationId, Collection<String> permissions, String e2e, boolean isForPublish, DefaultAudience defaultAudience, String clientState, String authType, boolean ignoreAppSwitchToLoggedOut, String messengerPageId, boolean resetMessengerState, LoginTargetApp targetApp, boolean isFamilyLogin, boolean shouldSkipAccountDedupe, String nonce, String codeChallenge, String codeChallengeMethod) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            String strMo167605c = appInfo.mo167605c();
            if (strMo167605c == null) {
                return null;
            }
            Intent intentPutExtra = new Intent().setClassName(appInfo.mo167606d(), strMo167605c).putExtra("client_id", applicationId);
            intentPutExtra.getClass();
            intentPutExtra.putExtra("facebook_sdk_version", C1577c.m8024C());
            if (!C1657e.m8833d0(permissions)) {
                intentPutExtra.putExtra("scope", TextUtils.join(Constants.SEPARATOR_COMMA, permissions));
            }
            if (!C1657e.m8832c0(e2e)) {
                intentPutExtra.putExtra("e2e", e2e);
            }
            intentPutExtra.putExtra("state", clientState);
            intentPutExtra.putExtra(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, appInfo.mo167608e());
            intentPutExtra.putExtra("nonce", nonce);
            intentPutExtra.putExtra("return_scopes", "true");
            if (isForPublish) {
                intentPutExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
            }
            intentPutExtra.putExtra("legacy_override", C1577c.m8059x());
            intentPutExtra.putExtra("auth_type", authType);
            if (ignoreAppSwitchToLoggedOut) {
                intentPutExtra.putExtra("fail_on_logged_out", true);
            }
            intentPutExtra.putExtra("messenger_page_id", messengerPageId);
            intentPutExtra.putExtra("reset_messenger_state", resetMessengerState);
            if (isFamilyLogin) {
                intentPutExtra.putExtra("fx_app", targetApp.getTargetApp());
            }
            if (shouldSkipAccountDedupe) {
                intentPutExtra.putExtra("skip_dedupe", true);
            }
            return intentPutExtra;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:5:0x000c, B:39:0x0097, B:40:0x009a, B:34:0x008d), top: B:43:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:53:? A[Catch: all -> 0x0091, SYNTHETIC, TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:5:0x000c, B:39:0x0097, B:40:0x009a, B:34:0x008d), top: B:43:0x000c }] */
    /* JADX INFO: renamed from: o */
    public final TreeSet<Integer> m167603o(AbstractC19144e appInfo) {
        Throwable th;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            ContentResolver contentResolver = C1577c.m8047l().getContentResolver();
            String[] strArr = {WBConstants.AUTH_PARAMS_VERSION};
            Uri uriM167601g = m167601g(appInfo);
            try {
                try {
                    providerInfoResolveContentProvider = C1577c.m8047l().getPackageManager().resolveContentProvider(appInfo.mo167606d() + ".provider.PlatformProvider", 0);
                } catch (RuntimeException e) {
                    Log.e(TAG, "Failed to query content resolver.", e);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        try {
                            cursorQuery = contentResolver.query(uriM167601g, strArr, null, null, null);
                        } catch (NullPointerException unused) {
                            Log.e(TAG, "Failed to query content resolver.");
                            cursorQuery = null;
                        }
                    } catch (IllegalArgumentException unused2) {
                        Log.e(TAG, "Failed to query content resolver.");
                        cursorQuery = null;
                    } catch (SecurityException unused3) {
                        Log.e(TAG, "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex(WBConstants.AUTH_PARAMS_VERSION))));
                            } catch (Throwable th2) {
                                cursor = cursorQuery;
                                th = th2;
                                if (cursor != null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (Throwable th4) {
            lsb.m151552b(th4, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final C19145f m167604s(List<? extends AbstractC19144e> appInfoList, int[] versionSpec) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            m167597z();
            if (appInfoList == null) {
                return C19145f.INSTANCE.m167618b();
            }
            for (AbstractC19144e abstractC19144e : appInfoList) {
                int iM167582h = m167582h(abstractC19144e.m167613b(), m167592u(), versionSpec);
                if (iM167582h != -1) {
                    return C19145f.INSTANCE.m167617a(abstractC19144e, iM167582h);
                }
            }
            return C19145f.INSTANCE.m167618b();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.p620$f */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m87232d2 = {"Ll/p620$f;", "", "<init>", "()V", "Ll/p620$e;", "<set-?>", "a", "Ll/p620$e;", "getAppInfo", "()Ll/p620$e;", "appInfo", "", "b", "I", "c", "()I", "protocolVersion", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C19145f {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public AbstractC19144e appInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int protocolVersion;

        public /* synthetic */ C19145f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getProtocolVersion() {
            return this.protocolVersion;
        }

        /* JADX INFO: renamed from: l.p620$f$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/p620$f$a;", "", "<init>", "()V", "Ll/p620$e;", "nativeAppInfo", "", "protocolVersion", "Ll/p620$f;", "a", "(Ll/p620$e;I)Ll/p620$f;", "b", "()Ll/p620$f;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: a */
            public final C19145f m167617a(@Nullable AbstractC19144e nativeAppInfo, int protocolVersion) {
                C19145f c19145f = new C19145f(null);
                c19145f.appInfo = nativeAppInfo;
                c19145f.protocolVersion = protocolVersion;
                return c19145f;
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: b */
            public final C19145f m167618b() {
                C19145f c19145f = new C19145f(null);
                c19145f.protocolVersion = -1;
                return c19145f;
            }

            public Companion() {
            }
        }

        public C19145f() {
        }
    }

    /* JADX INFO: renamed from: l.p620$e */
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Ll/p620$e;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "c", "e", "", "f", "Ljava/util/TreeSet;", "", "b", "()Ljava/util/TreeSet;", "", "force", "a", "(Z)V", "Ljava/util/TreeSet;", "availableVersions", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static abstract class AbstractC19144e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public TreeSet<Integer> availableVersions;

        /* JADX WARN: Code duplicated, block: B:12:0x0012 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x0003, B:7:0x0009, B:13:0x001a, B:15:0x001e, B:17:0x0024, B:12:0x0012), top: B:22:0x0003 }] */
        /* JADX INFO: renamed from: a */
        public final synchronized void m167612a(boolean force) {
            if (force) {
                this.availableVersions = p620.m167580b(p620.INSTANCE, this);
            } else {
                try {
                    TreeSet<Integer> treeSet = this.availableVersions;
                    if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                        this.availableVersions = p620.m167580b(p620.INSTANCE, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            TreeSet<Integer> treeSet2 = this.availableVersions;
            if (treeSet2 == null || treeSet2.isEmpty()) {
                mo167609f();
            }
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final TreeSet<Integer> m167613b() {
            TreeSet<Integer> treeSet = this.availableVersions;
            if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                m167612a(false);
            }
            return this.availableVersions;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public abstract String mo167605c();

        @NotNull
        /* JADX INFO: renamed from: d */
        public abstract String mo167606d();

        @NotNull
        /* JADX INFO: renamed from: e */
        public String mo167608e() {
            return "id_token,token,signed_request,graph_domain";
        }

        /* JADX INFO: renamed from: f */
        public void mo167609f() {
        }
    }
}
