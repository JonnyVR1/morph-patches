package p153l;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.C1600c;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.CodeChallengeMethod;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginTargetApp;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 \u008e\u00012\u00020\u0001:\u0006sw|\u007f\u0083\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JS\u0010\u001d\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$JO\u0010/\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u001b2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0004\b2\u00103J'\u00106\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u0001042\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,¢\u0006\u0004\b6\u00107J3\u0010;\u001a\u00020\u001b2\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0017¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0005¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00002\b\u0010L\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bM\u0010KJ\u0015\u0010O\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u001b¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001b¢\u0006\u0004\bR\u0010PJ\u0015\u0010T\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u001b¢\u0006\u0004\bT\u0010PJ\u000f\u0010U\u001a\u00020\u0007H\u0016¢\u0006\u0004\bU\u0010\u0003J%\u0010X\u001a\u00020\u00072\u0006\u0010W\u001a\u00020V2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\bX\u0010YJ/\u0010]\u001a\u00020\u00072\u0006\u0010[\u001a\u00020Z2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b]\u0010^J/\u0010`\u001a\u00020\u00072\u0006\u0010[\u001a\u00020_2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b`\u0010aJ/\u0010c\u001a\u00020\u00072\u0006\u0010[\u001a\u00020b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bc\u0010dJ\u001d\u0010g\u001a\u00020\u00072\u0006\u0010W\u001a\u00020V2\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hJ/\u0010i\u001a\u00020\u00072\u0006\u0010W\u001a\u00020V2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bi\u0010jJ+\u0010l\u001a\u00060kR\u00020\u00002\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\f2\u0006\u0010f\u001a\u00020eH\u0014¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\bp\u0010qR$\u0010>\u001a\u00020=2\u0006\u0010r\u001a\u00020=8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR$\u0010F\u001a\u00020E2\u0006\u0010r\u001a\u00020E8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R'\u0010I\u001a\u00020\u00052\u0006\u0010r\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010L\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0080\u0001R\u0018\u0010N\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R)\u0010\u008a\u0001\u001a\u00020A2\u0006\u0010r\u001a\u00020A8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R'\u0010Q\u001a\u00020\u001b2\u0006\u0010r\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u008b\u0001\u0010\u0085\u0001\u001a\u0005\bQ\u0010\u008c\u0001R'\u0010S\u001a\u00020\u001b2\u0006\u0010r\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bl\u0010\u0085\u0001\u001a\u0006\b\u008d\u0001\u0010\u008c\u0001¨\u0006\u008f\u0001"}, m88121d2 = {"Ll/z0w;", "", "<init>", "()V", "", "", Permissions.TYPE, "", "N", "(Ljava/util/Collection;)V", "Ll/o2g0;", "startActivityDelegate", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "K", "(Ll/o2g0;Lcom/facebook/login/LoginClient$Request;)V", "Landroid/content/Context;", "context", "loginRequest", ResourceDirection.f39656v, "(Landroid/content/Context;Lcom/facebook/login/LoginClient$Request;)V", "Lcom/facebook/login/LoginClient$Result$Code;", LovePlanetStage.result, "", "resultExtras", "Ljava/lang/Exception;", "exception", "", "wasLoginActivityTried", "n", "(Landroid/content/Context;Lcom/facebook/login/LoginClient$Result$Code;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/LoginClient$Request;)V", "M", "(Ll/o2g0;Lcom/facebook/login/LoginClient$Request;)Z", "Landroid/content/Intent;", "intent", "A", "(Landroid/content/Intent;)Z", "Lcom/facebook/AccessToken;", "newToken", "Lcom/facebook/AuthenticationToken;", "newIdToken", "origRequest", "Lcom/facebook/FacebookException;", "isCanceled", "Ll/tvf;", "Ll/a1w;", "callback", "k", "(Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Lcom/facebook/login/LoginClient$Request;Lcom/facebook/FacebookException;ZLl/tvf;)V", "isExpressLoginAllowed", "D", "(Z)V", "Ll/b94;", "callbackManager", BaseSei.f14625Y, "(Ll/b94;Ll/tvf;)V", "", "resultCode", "data", "w", "(ILandroid/content/Intent;Ll/tvf;)Z", "Lcom/facebook/login/LoginBehavior;", "loginBehavior", "F", "(Lcom/facebook/login/LoginBehavior;)Ll/z0w;", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "G", "(Lcom/facebook/login/LoginTargetApp;)Ll/z0w;", "Lcom/facebook/login/DefaultAudience;", "defaultAudience", c4s.C_ZONE, "(Lcom/facebook/login/DefaultAudience;)Ll/z0w;", "authType", "B", "(Ljava/lang/String;)Ll/z0w;", "messengerPageId", "H", "resetMessengerState", "I", "(Z)Ll/z0w;", "isFamilyLogin", "E", "shouldSkipAccountDeduplication", "J", "u", "Landroid/app/Activity;", "activity", Constants.KEY_T, "(Landroid/app/Activity;Ljava/util/Collection;)V", "Landroidx/fragment/app/Fragment;", "fragment", "loggerID", "r", "(Landroidx/fragment/app/Fragment;Ljava/util/Collection;Ljava/lang/String;)V", "Landroid/app/Fragment;", "q", "(Landroid/app/Fragment;Ljava/util/Collection;Ljava/lang/String;)V", "Ll/z5j;", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/z5j;Ljava/util/Collection;Ljava/lang/String;)V", "Ll/o0w;", "loginConfig", "p", "(Landroid/app/Activity;Ll/o0w;)V", "o", "(Landroid/app/Activity;Ljava/util/Collection;Ljava/lang/String;)V", "Ll/z0w$c;", RXScreenCaptureService.KEY_INDEX, "(Ll/b94;Ljava/lang/String;)Ll/z0w$c;", "j", "(Ll/o0w;)Lcom/facebook/login/LoginClient$Request;", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/facebook/login/LoginClient$Request;)Landroid/content/Intent;", "<set-?>", "a", "Lcom/facebook/login/LoginBehavior;", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "b", "Lcom/facebook/login/DefaultAudience;", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "Landroid/content/SharedPreferences;", "c", "Landroid/content/SharedPreferences;", "sharedPreferences", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "e", "f", "Z", "g", "Lcom/facebook/login/LoginTargetApp;", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "loginTargetApp", "h", "()Z", "getShouldSkipAccountDeduplication", "Companion", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public class z0w {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Set<String> f202413j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final String f202414k;

    /* JADX INFO: renamed from: l */
    public static volatile z0w f202415l;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public String messengerPageId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean resetMessengerState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isFamilyLogin;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean shouldSkipAccountDeduplication;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public DefaultAudience defaultAudience = DefaultAudience.FRIENDS;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String authType = "rerequest";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

    /* JADX INFO: renamed from: l.z0w$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/z0w$a;", "Ll/o2g0;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "", "requestCode", "", "startActivityForResult", "(Landroid/content/Intent;I)V", "a", "Landroid/app/Activity;", "()Landroid/app/Activity;", "activityContext", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C21732a implements o2g0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Activity activityContext;

        public C21732a(@NotNull Activity activity) {
            activity.getClass();
            this.activityContext = activity;
        }

        @Override // p153l.o2g0
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // p153l.o2g0
        public void startActivityForResult(@NotNull Intent intent, int requestCode) {
            intent.getClass();
            getActivityContext().startActivityForResult(intent, requestCode);
        }
    }

    /* JADX INFO: renamed from: l.z0w$c */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/z0w$c;", "Ll/x50;", "", "", "Ll/b94$a;", "Ll/b94;", "callbackManager", "loggerID", "<init>", "(Ll/z0w;Ll/b94;Ljava/lang/String;)V", "Landroid/content/Context;", "context", Permissions.TYPE, "Landroid/content/Intent;", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Ljava/util/Collection;)Landroid/content/Intent;", "", "resultCode", "intent", "e", "(ILandroid/content/Intent;)Ll/b94$a;", "a", "Ll/b94;", "getCallbackManager", "()Ll/b94;", "f", "(Ll/b94;)V", "b", "Ljava/lang/String;", "getLoggerID", "()Ljava/lang/String;", "setLoggerID", "(Ljava/lang/String;)V", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public final class C21734c extends x50<Collection<? extends String>, b94.C15948a> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public b94 callbackManager;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String loggerID;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z0w f202428c;

        public C21734c(@Nullable z0w z0wVar, @Nullable b94 b94Var, String str) {
            z0wVar.getClass();
            this.f202428c = z0wVar;
            this.callbackManager = b94Var;
            this.loggerID = str;
        }

        @Override // p153l.x50
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo2618a(@NotNull Context context, @NotNull Collection<String> permissions) {
            context.getClass();
            permissions.getClass();
            LoginClient.Request requestM218203j = this.f202428c.m218203j(new o0w(permissions, null, 2, null));
            String str = this.loggerID;
            if (str != null) {
                requestM218203j.m9123u(str);
            }
            this.f202428c.m218214v(context, requestM218203j);
            Intent intentM218205l = this.f202428c.m218205l(requestM218203j);
            if (this.f202428c.m218189A(intentM218205l)) {
                return intentM218205l;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            this.f202428c.m218206n(context, LoginClient.Result.Code.ERROR, null, facebookException, false, requestM218203j);
            throw facebookException;
        }

        @Override // p153l.x50
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b94.C15948a mo2619c(int resultCode, @Nullable Intent intent) {
            z0w.m218187x(this.f202428c, resultCode, intent, null, 4, null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            b94 b94Var = this.callbackManager;
            if (b94Var != null) {
                b94Var.mo8715a(requestCode, resultCode, intent);
            }
            return new b94.C15948a(requestCode, resultCode, intent);
        }

        /* JADX INFO: renamed from: f */
        public final void m218224f(@Nullable b94 b94Var) {
            this.callbackManager = b94Var;
        }
    }

    /* JADX INFO: renamed from: l.z0w$d */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Ll/z0w$d;", "Ll/o2g0;", "Ll/z5j;", "fragment", "<init>", "(Ll/z5j;)V", "Landroid/content/Intent;", "intent", "", "requestCode", "", "startActivityForResult", "(Landroid/content/Intent;I)V", "a", "Ll/z5j;", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "()Landroid/app/Activity;", "activityContext", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C21735d implements o2g0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final z5j fragment;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Activity activityContext;

        public C21735d(@NotNull z5j z5jVar) {
            z5jVar.getClass();
            this.fragment = z5jVar;
            this.activityContext = z5jVar.m218702a();
        }

        @Override // p153l.o2g0
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // p153l.o2g0
        public void startActivityForResult(@NotNull Intent intent, int requestCode) {
            intent.getClass();
            this.fragment.m218705d(intent, requestCode);
        }
    }

    /* JADX INFO: renamed from: l.z0w$e */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m88121d2 = {"Ll/z0w$e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/w0w;", "a", "(Landroid/content/Context;)Ll/w0w;", "Ll/w0w;", "logger", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C21736e {

        @NotNull
        public static final C21736e INSTANCE = new C21736e();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public static w0w logger;

        /* JADX WARN: Code duplicated, block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:14:0x0013 A[Catch: all -> 0x0008, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x000c A[DONT_GENERATE] */
        /* JADX WARN: Instruction removed from duplicated block: B:9:0x000c, please report this as an issue */
        @Nullable
        /* JADX INFO: renamed from: a */
        public final synchronized w0w m218225a(@Nullable Context context) {
            if (context != null) {
                if (context == null) {
                    return null;
                }
                if (logger == null) {
                    logger = new w0w(context, C1600c.m8102m());
                }
                return logger;
            }
            context = C1600c.m8101l();
            if (context == null) {
                return null;
            }
            if (logger == null) {
                logger = new w0w(context, C1600c.m8102m());
            }
            return logger;
            throw th;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f202413j = companion.m218220d();
        String string = z0w.class.toString();
        string.getClass();
        f202414k = string;
    }

    public z0w() {
        g0l0.m128441l();
        SharedPreferences sharedPreferences = C1600c.m8101l().getSharedPreferences("com.facebook.loginManager", 0);
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
        if (!C1600c.hasCustomTabsPrefetching || szb.m188633a() == null) {
            return;
        }
        uzb.m198719a(C1600c.m8101l(), "com.android.chrome", new rzb());
        uzb.m198720b(C1600c.m8101l(), C1600c.m8101l().getPackageName());
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m218177L(z0w z0wVar, int i, Intent intent) {
        z0wVar.getClass();
        return m218187x(z0wVar, i, intent, null, 4, null);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static z0w m218186m() {
        return INSTANCE.m218219c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m218187x(z0w z0wVar, int i, Intent intent, tvf tvfVar, int i2, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: onActivityResult");
            return false;
        }
        if ((i2 & 4) != 0) {
            tvfVar = null;
        }
        return z0wVar.m218215w(i, intent, tvfVar);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m218188z(z0w z0wVar, tvf tvfVar, int i, Intent intent) {
        z0wVar.getClass();
        return z0wVar.m218215w(i, intent, tvfVar);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m218189A(Intent intent) {
        return C1600c.m8101l().getPackageManager().resolveActivity(intent, 0) != null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final z0w m218190B(@NotNull String authType) {
        authType.getClass();
        this.authType = authType;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final z0w m218191C(@NotNull DefaultAudience defaultAudience) {
        defaultAudience.getClass();
        this.defaultAudience = defaultAudience;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public final void m218192D(boolean isExpressLoginAllowed) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("express_login_allowed", isExpressLoginAllowed);
        editorEdit.apply();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final z0w m218193E(boolean isFamilyLogin) {
        this.isFamilyLogin = isFamilyLogin;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final z0w m218194F(@NotNull LoginBehavior loginBehavior) {
        loginBehavior.getClass();
        this.loginBehavior = loginBehavior;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final z0w m218195G(@NotNull LoginTargetApp targetApp) {
        targetApp.getClass();
        this.loginTargetApp = targetApp;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final z0w m218196H(@Nullable String messengerPageId) {
        this.messengerPageId = messengerPageId;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final z0w m218197I(boolean resetMessengerState) {
        this.resetMessengerState = resetMessengerState;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final z0w m218198J(boolean shouldSkipAccountDeduplication) {
        this.shouldSkipAccountDeduplication = shouldSkipAccountDeduplication;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final void m218199K(o2g0 startActivityDelegate, LoginClient.Request request) throws FacebookException {
        m218214v(startActivityDelegate.getActivityContext(), request);
        CallbackManagerImpl.INSTANCE.m8720c(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.InterfaceC1659a() { // from class: l.x0w
            @Override // com.facebook.internal.CallbackManagerImpl.InterfaceC1659a
            /* JADX INFO: renamed from: a */
            public final boolean mo8717a(int i, Intent intent) {
                return z0w.m218177L(this.f191944a, i, intent);
            }
        });
        if (m218200M(startActivityDelegate, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        m218206n(startActivityDelegate.getActivityContext(), LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m218200M(o2g0 startActivityDelegate, LoginClient.Request request) {
        Intent intentM218205l = m218205l(request);
        if (!m218189A(intentM218205l)) {
            return false;
        }
        try {
            startActivityDelegate.startActivityForResult(intentM218205l, LoginClient.INSTANCE.m9142b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m218201N(Collection<String> permissions) {
        if (permissions == null) {
            return;
        }
        for (String str : permissions) {
            if (INSTANCE.m218221e(str)) {
                throw new FacebookException("Cannot pass a publish or manage permission (" + str + ") to a request for read authorization");
            }
        }
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: i */
    public final C21734c m218202i(@Nullable b94 callbackManager, @Nullable String loggerID) {
        return new C21734c(this, callbackManager, loggerID);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public LoginClient.Request m218203j(@NotNull o0w loginConfig) {
        String codeVerifier;
        loginConfig.getClass();
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            kc60 kc60Var = kc60.INSTANCE;
            codeVerifier = kc60.m149103b(loginConfig.getCodeVerifier(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            codeVerifier = loginConfig.getCodeVerifier();
        }
        CodeChallengeMethod codeChallengeMethod2 = codeChallengeMethod;
        String str = codeVerifier;
        LoginBehavior loginBehavior = this.loginBehavior;
        Set set = CollectionsKt.toSet(loginConfig.m165551c());
        DefaultAudience defaultAudience = this.defaultAudience;
        String str2 = this.authType;
        String strM8102m = C1600c.m8102m();
        String string = UUID.randomUUID().toString();
        string.getClass();
        LoginClient.Request request = new LoginClient.Request(loginBehavior, set, defaultAudience, str2, strM8102m, string, this.loginTargetApp, loginConfig.getNonce(), loginConfig.getCodeVerifier(), str, codeChallengeMethod2);
        request.m9127z(AccessToken.INSTANCE.m7492g());
        request.m9125x(this.messengerPageId);
        request.m9101A(this.resetMessengerState);
        request.m9124w(this.isFamilyLogin);
        request.m9102B(this.shouldSkipAccountDeduplication);
        return request;
    }

    /* JADX INFO: renamed from: k */
    public final void m218204k(AccessToken newToken, AuthenticationToken newIdToken, LoginClient.Request origRequest, FacebookException exception, boolean isCanceled, tvf<a1w> callback) {
        if (newToken != null) {
            AccessToken.INSTANCE.m7494i(newToken);
            Profile.INSTANCE.m7675a();
        }
        if (newIdToken != null) {
            AuthenticationToken.INSTANCE.m7505a(newIdToken);
        }
        if (callback != null) {
            a1w a1wVarM218218b = (newToken == null || origRequest == null) ? null : INSTANCE.m218218b(origRequest, newToken, newIdToken);
            if (isCanceled || (a1wVarM218218b != null && a1wVarM218218b.m95559b().isEmpty())) {
                callback.onCancel();
                return;
            }
            if (exception != null) {
                callback.mo51952a(exception);
            } else {
                if (newToken == null || a1wVarM218218b == null) {
                    return;
                }
                m218192D(true);
                callback.onSuccess(a1wVarM218218b);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public Intent m218205l(@NotNull LoginClient.Request request) {
        request.getClass();
        Intent intent = new Intent();
        intent.setClass(C1600c.m8101l(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable(SocialConstants.TYPE_REQUEST, request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: n */
    public final void m218206n(Context context, LoginClient.Result.Code result, Map<String, String> resultExtras, Exception exception, boolean wasLoginActivityTried, LoginClient.Request request) {
        w0w w0wVarM218225a = C21736e.INSTANCE.m218225a(context);
        if (w0wVarM218225a == null) {
            return;
        }
        if (request == null) {
            w0w.m204344k(w0wVarM218225a, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("try_login_activity", wasLoginActivityTried ? "1" : "0");
        w0wVarM218225a.m204349f(request.getAuthId(), map, result, resultExtras, exception, request.getIsFamilyLogin() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    /* JADX INFO: renamed from: o */
    public final void m218207o(@NotNull Activity activity, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        activity.getClass();
        LoginClient.Request requestM218203j = m218203j(new o0w(permissions, null, 2, null));
        if (loggerID != null) {
            requestM218203j.m9123u(loggerID);
        }
        m218199K(new C21732a(activity), requestM218203j);
    }

    /* JADX INFO: renamed from: p */
    public final void m218208p(@NotNull Activity activity, @NotNull o0w loginConfig) {
        activity.getClass();
        loginConfig.getClass();
        m218199K(new C21732a(activity), m218203j(loginConfig));
    }

    /* JADX INFO: renamed from: q */
    public final void m218209q(@NotNull Fragment fragment, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        fragment.getClass();
        m218211s(new z5j(fragment), permissions, loggerID);
    }

    /* JADX INFO: renamed from: r */
    public final void m218210r(@NotNull androidx.fragment.app.Fragment fragment, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        fragment.getClass();
        m218211s(new z5j(fragment), permissions, loggerID);
    }

    /* JADX INFO: renamed from: s */
    public final void m218211s(@NotNull z5j fragment, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        fragment.getClass();
        LoginClient.Request requestM218203j = m218203j(new o0w(permissions, null, 2, null));
        if (loggerID != null) {
            requestM218203j.m9123u(loggerID);
        }
        m218199K(new C21735d(fragment), requestM218203j);
    }

    /* JADX INFO: renamed from: t */
    public final void m218212t(@NotNull Activity activity, @Nullable Collection<String> permissions) {
        activity.getClass();
        m218201N(permissions);
        m218208p(activity, new o0w(permissions, null, 2, null));
    }

    /* JADX INFO: renamed from: u */
    public void m218213u() {
        AccessToken.INSTANCE.m7494i(null);
        AuthenticationToken.INSTANCE.m7505a(null);
        Profile.INSTANCE.m7677c(null);
        m218192D(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m218214v(Context context, LoginClient.Request loginRequest) {
        w0w w0wVarM218225a = C21736e.INSTANCE.m218225a(context);
        if (w0wVarM218225a == null || loginRequest == null) {
            return;
        }
        w0wVarM218225a.m204351i(loginRequest, loginRequest.getIsFamilyLogin() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    @JvmOverloads
    @VisibleForTesting(otherwise = 3)
    /* JADX INFO: renamed from: w */
    public boolean m218215w(int resultCode, @Nullable Intent data, @Nullable tvf<a1w> callback) {
        LoginClient.Result.Code code;
        boolean z;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        Map<String, String> map;
        LoginClient.Request request;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        FacebookException facebookException = null;
        boolean z2 = false;
        if (data != null) {
            data.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) data.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.Request request2 = result.request;
                LoginClient.Result.Code code3 = result.code;
                if (resultCode != -1) {
                    z2 = resultCode == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (code3 == LoginClient.Result.Code.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    facebookException = new FacebookAuthorizationException(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                request = request2;
                z = z2;
                authenticationToken = authenticationToken2;
                code = code3;
            } else {
                code = code2;
                accessToken = null;
                authenticationToken = null;
                map = null;
                request = null;
                z = false;
            }
        } else if (resultCode == 0) {
            code = LoginClient.Result.Code.CANCEL;
            z = true;
            accessToken = null;
            authenticationToken = null;
            map = null;
            request = null;
        } else {
            code = code2;
            accessToken = null;
            authenticationToken = null;
            map = null;
            request = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        m218206n(null, code, map, facebookException2, true, request);
        m218204k(accessToken, authenticationToken, request, facebookException2, z, callback);
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m218216y(@Nullable b94 callbackManager, @Nullable final tvf<a1w> callback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).m8716c(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.InterfaceC1659a() { // from class: l.y0w
            @Override // com.facebook.internal.CallbackManagerImpl.InterfaceC1659a
            /* JADX INFO: renamed from: a */
            public final boolean mo8717a(int i, Intent intent) {
                return z0w.m218188z(this.f197057a, callback, i, intent);
            }
        });
    }

    /* JADX INFO: renamed from: l.z0w$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Ll/z0w$b;", "", "<init>", "()V", "Ll/z0w;", "c", "()Ll/z0w;", "", "permission", "", "e", "(Ljava/lang/String;)Z", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "Lcom/facebook/AccessToken;", "newToken", "Lcom/facebook/AuthenticationToken;", "newIdToken", "Ll/a1w;", "b", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;)Ll/a1w;", "", Constants.INAPP_DATA_TAG, "()Ljava/util/Set;", "otherPublishPermissions", "EXPRESS_LOGIN_ALLOWED", "Ljava/lang/String;", "MANAGE_PERMISSION_PREFIX", "OTHER_PUBLISH_PERMISSIONS", "Ljava/util/Set;", "PREFERENCE_LOGIN_MANAGER", "PUBLISH_PERMISSION_PREFIX", "TAG", "instance", "Ll/z0w;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @VisibleForTesting(otherwise = 2)
        @NotNull
        /* JADX INFO: renamed from: b */
        public final a1w m218218b(@NotNull LoginClient.Request request, @NotNull AccessToken newToken, @Nullable AuthenticationToken newIdToken) {
            request.getClass();
            newToken.getClass();
            Set<String> setM9117o = request.m9117o();
            Set mutableSet = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(newToken.m7474l()));
            if (request.getIsRerequest()) {
                mutableSet.retainAll(setM9117o);
            }
            Set mutableSet2 = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(setM9117o));
            mutableSet2.removeAll(mutableSet);
            return new a1w(newToken, newIdToken, mutableSet, mutableSet2);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public z0w m218219c() {
            if (z0w.f202415l == null) {
                synchronized (this) {
                    z0w.f202415l = new z0w();
                    Unit unit = Unit.INSTANCE;
                }
            }
            z0w z0wVar = z0w.f202415l;
            if (z0wVar != null) {
                return z0wVar;
            }
            Intrinsics.m88391r("instance");
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public final Set<String> m218220d() {
            return SetsKt.setOf((Object[]) new String[]{"ads_management", "create_event", "rsvp_event"});
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* JADX INFO: renamed from: e */
        public final boolean m218221e(@Nullable String permission) {
            if (permission != null) {
                return C15493d.m94374J(permission, "publish", false, 2, null) || C15493d.m94374J(permission, "manage", false, 2, null) || z0w.f202413j.contains(permission);
            }
            return false;
        }

        public Companion() {
        }
    }
}
