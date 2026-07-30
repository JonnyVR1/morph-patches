package p149l;

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
import com.facebook.C1577c;
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
import com.p046p1.mobile.putong.core.data.Permissions;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 \u008e\u00012\u00020\u0001:\u0006sw|\u007f\u0083\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JS\u0010\u001d\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$JO\u0010/\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u001b2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0004\b2\u00103J'\u00106\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u0001042\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,¢\u0006\u0004\b6\u00107J3\u0010;\u001a\u00020\u001b2\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0017¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0005¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00002\b\u0010L\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bM\u0010KJ\u0015\u0010O\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u001b¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001b¢\u0006\u0004\bR\u0010PJ\u0015\u0010T\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u001b¢\u0006\u0004\bT\u0010PJ\u000f\u0010U\u001a\u00020\u0007H\u0016¢\u0006\u0004\bU\u0010\u0003J%\u0010X\u001a\u00020\u00072\u0006\u0010W\u001a\u00020V2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\bX\u0010YJ/\u0010]\u001a\u00020\u00072\u0006\u0010[\u001a\u00020Z2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b]\u0010^J/\u0010`\u001a\u00020\u00072\u0006\u0010[\u001a\u00020_2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b`\u0010aJ/\u0010c\u001a\u00020\u00072\u0006\u0010[\u001a\u00020b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bc\u0010dJ\u001d\u0010g\u001a\u00020\u00072\u0006\u0010W\u001a\u00020V2\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hJ/\u0010i\u001a\u00020\u00072\u0006\u0010W\u001a\u00020V2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bi\u0010jJ+\u0010l\u001a\u00060kR\u00020\u00002\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\f2\u0006\u0010f\u001a\u00020eH\u0014¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\bp\u0010qR$\u0010>\u001a\u00020=2\u0006\u0010r\u001a\u00020=8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR$\u0010F\u001a\u00020E2\u0006\u0010r\u001a\u00020E8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R'\u0010I\u001a\u00020\u00052\u0006\u0010r\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010L\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0080\u0001R\u0018\u0010N\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R)\u0010\u008a\u0001\u001a\u00020A2\u0006\u0010r\u001a\u00020A8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R'\u0010Q\u001a\u00020\u001b2\u0006\u0010r\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u008b\u0001\u0010\u0085\u0001\u001a\u0005\bQ\u0010\u008c\u0001R'\u0010S\u001a\u00020\u001b2\u0006\u0010r\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bl\u0010\u0085\u0001\u001a\u0006\b\u008d\u0001\u0010\u008c\u0001¨\u0006\u008f\u0001"}, m87232d2 = {"Ll/bzv;", "", "<init>", "()V", "", "", Permissions.TYPE, "", "N", "(Ljava/util/Collection;)V", "Ll/fuf0;", "startActivityDelegate", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "K", "(Ll/fuf0;Lcom/facebook/login/LoginClient$Request;)V", "Landroid/content/Context;", "context", "loginRequest", ResourceDirection.f38808v, "(Landroid/content/Context;Lcom/facebook/login/LoginClient$Request;)V", "Lcom/facebook/login/LoginClient$Result$Code;", LovePlanetStage.result, "", "resultExtras", "Ljava/lang/Exception;", "exception", "", "wasLoginActivityTried", "n", "(Landroid/content/Context;Lcom/facebook/login/LoginClient$Result$Code;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/LoginClient$Request;)V", "M", "(Ll/fuf0;Lcom/facebook/login/LoginClient$Request;)Z", "Landroid/content/Intent;", "intent", "A", "(Landroid/content/Intent;)Z", "Lcom/facebook/AccessToken;", "newToken", "Lcom/facebook/AuthenticationToken;", "newIdToken", "origRequest", "Lcom/facebook/FacebookException;", "isCanceled", "Ll/fuf;", "Ll/czv;", "callback", "k", "(Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Lcom/facebook/login/LoginClient$Request;Lcom/facebook/FacebookException;ZLl/fuf;)V", "isExpressLoginAllowed", "D", "(Z)V", "Ll/c84;", "callbackManager", BaseSei.f13931Y, "(Ll/c84;Ll/fuf;)V", "", "resultCode", "data", "w", "(ILandroid/content/Intent;Ll/fuf;)Z", "Lcom/facebook/login/LoginBehavior;", "loginBehavior", "F", "(Lcom/facebook/login/LoginBehavior;)Ll/bzv;", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "G", "(Lcom/facebook/login/LoginTargetApp;)Ll/bzv;", "Lcom/facebook/login/DefaultAudience;", "defaultAudience", b2s.C_ZONE, "(Lcom/facebook/login/DefaultAudience;)Ll/bzv;", "authType", "B", "(Ljava/lang/String;)Ll/bzv;", "messengerPageId", "H", "resetMessengerState", "I", "(Z)Ll/bzv;", "isFamilyLogin", "E", "shouldSkipAccountDeduplication", "J", "u", "Landroid/app/Activity;", "activity", Constants.KEY_T, "(Landroid/app/Activity;Ljava/util/Collection;)V", "Landroidx/fragment/app/Fragment;", "fragment", "loggerID", "r", "(Landroidx/fragment/app/Fragment;Ljava/util/Collection;Ljava/lang/String;)V", "Landroid/app/Fragment;", "q", "(Landroid/app/Fragment;Ljava/util/Collection;Ljava/lang/String;)V", "Ll/e3j;", BLiveStormDanmakuGiftResourceType.f44446s, "(Ll/e3j;Ljava/util/Collection;Ljava/lang/String;)V", "Ll/ryv;", "loginConfig", "p", "(Landroid/app/Activity;Ll/ryv;)V", "o", "(Landroid/app/Activity;Ljava/util/Collection;Ljava/lang/String;)V", "Ll/bzv$c;", RXScreenCaptureService.KEY_INDEX, "(Ll/c84;Ljava/lang/String;)Ll/bzv$c;", "j", "(Ll/ryv;)Lcom/facebook/login/LoginClient$Request;", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/facebook/login/LoginClient$Request;)Landroid/content/Intent;", "<set-?>", "a", "Lcom/facebook/login/LoginBehavior;", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "b", "Lcom/facebook/login/DefaultAudience;", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "Landroid/content/SharedPreferences;", "c", "Landroid/content/SharedPreferences;", "sharedPreferences", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "e", "f", "Z", "g", "Lcom/facebook/login/LoginTargetApp;", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "loginTargetApp", "h", "()Z", "getShouldSkipAccountDeduplication", "Companion", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public class bzv {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Set<String> f78066j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final String f78067k;

    /* JADX INFO: renamed from: l */
    public static volatile bzv f78068l;

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

    /* JADX INFO: renamed from: l.bzv$a */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Ll/bzv$a;", "Ll/fuf0;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "", "requestCode", "", "startActivityForResult", "(Landroid/content/Intent;I)V", "a", "Landroid/app/Activity;", "()Landroid/app/Activity;", "activityContext", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class C16025a implements fuf0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Activity activityContext;

        public C16025a(@NotNull Activity activity) {
            activity.getClass();
            this.activityContext = activity;
        }

        @Override // p149l.fuf0
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // p149l.fuf0
        public void startActivityForResult(@NotNull Intent intent, int requestCode) {
            intent.getClass();
            getActivityContext().startActivityForResult(intent, requestCode);
        }
    }

    /* JADX INFO: renamed from: l.bzv$c */
    @Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, m87232d2 = {"Ll/bzv$c;", "Ll/b60;", "", "", "Ll/c84$a;", "Ll/c84;", "callbackManager", "loggerID", "<init>", "(Ll/bzv;Ll/c84;Ljava/lang/String;)V", "Landroid/content/Context;", "context", Permissions.TYPE, "Landroid/content/Intent;", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Ljava/util/Collection;)Landroid/content/Intent;", "", "resultCode", "intent", "e", "(ILandroid/content/Intent;)Ll/c84$a;", "a", "Ll/c84;", "getCallbackManager", "()Ll/c84;", "f", "(Ll/c84;)V", "b", "Ljava/lang/String;", "getLoggerID", "()Ljava/lang/String;", "setLoggerID", "(Ljava/lang/String;)V", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public final class C16027c extends b60<Collection<? extends String>, c84.C16093a> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public c84 callbackManager;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String loggerID;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bzv f78081c;

        public C16027c(@Nullable bzv bzvVar, @Nullable c84 c84Var, String str) {
            bzvVar.getClass();
            this.f78081c = bzvVar;
            this.callbackManager = c84Var;
            this.loggerID = str;
        }

        @Override // p149l.b60
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo2617a(@NotNull Context context, @NotNull Collection<String> permissions) {
            context.getClass();
            permissions.getClass();
            LoginClient.Request requestM104672j = this.f78081c.m104672j(new ryv(permissions, null, 2, null));
            String str = this.loggerID;
            if (str != null) {
                requestM104672j.m9069u(str);
            }
            this.f78081c.m104683v(context, requestM104672j);
            Intent intentM104674l = this.f78081c.m104674l(requestM104672j);
            if (this.f78081c.m104658A(intentM104674l)) {
                return intentM104674l;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            this.f78081c.m104675n(context, LoginClient.Result.Code.ERROR, null, facebookException, false, requestM104672j);
            throw facebookException;
        }

        @Override // p149l.b60
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c84.C16093a mo2618c(int resultCode, @Nullable Intent intent) {
            bzv.m104656x(this.f78081c, resultCode, intent, null, 4, null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            c84 c84Var = this.callbackManager;
            if (c84Var != null) {
                c84Var.mo8661a(requestCode, resultCode, intent);
            }
            return new c84.C16093a(requestCode, resultCode, intent);
        }

        /* JADX INFO: renamed from: f */
        public final void m104694f(@Nullable c84 c84Var) {
            this.callbackManager = c84Var;
        }
    }

    /* JADX INFO: renamed from: l.bzv$d */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Ll/bzv$d;", "Ll/fuf0;", "Ll/e3j;", "fragment", "<init>", "(Ll/e3j;)V", "Landroid/content/Intent;", "intent", "", "requestCode", "", "startActivityForResult", "(Landroid/content/Intent;I)V", "a", "Ll/e3j;", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "()Landroid/app/Activity;", "activityContext", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class C16028d implements fuf0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final e3j fragment;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Activity activityContext;

        public C16028d(@NotNull e3j e3jVar) {
            e3jVar.getClass();
            this.fragment = e3jVar;
            this.activityContext = e3jVar.m114598a();
        }

        @Override // p149l.fuf0
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // p149l.fuf0
        public void startActivityForResult(@NotNull Intent intent, int requestCode) {
            intent.getClass();
            this.fragment.m114601d(intent, requestCode);
        }
    }

    /* JADX INFO: renamed from: l.bzv$e */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m87232d2 = {"Ll/bzv$e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/yyv;", "a", "(Landroid/content/Context;)Ll/yyv;", "Ll/yyv;", "logger", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class C16029e {

        @NotNull
        public static final C16029e INSTANCE = new C16029e();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public static yyv logger;

        /* JADX WARN: Code duplicated, block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:14:0x0013 A[Catch: all -> 0x0008, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x000c A[DONT_GENERATE] */
        /* JADX WARN: Instruction removed from duplicated block: B:9:0x000c, please report this as an issue */
        @Nullable
        /* JADX INFO: renamed from: a */
        public final synchronized yyv m104695a(@Nullable Context context) {
            if (context != null) {
                if (context == null) {
                    return null;
                }
                if (logger == null) {
                    logger = new yyv(context, C1577c.m8048m());
                }
                return logger;
            }
            context = C1577c.m8047l();
            if (context == null) {
                return null;
            }
            if (logger == null) {
                logger = new yyv(context, C1577c.m8048m());
            }
            return logger;
            throw th;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f78066j = companion.m104690d();
        String string = bzv.class.toString();
        string.getClass();
        f78067k = string;
    }

    public bzv() {
        ark0.m98523l();
        SharedPreferences sharedPreferences = C1577c.m8047l().getSharedPreferences("com.facebook.loginManager", 0);
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
        if (!C1577c.hasCustomTabsPrefetching || eyb.m118747a() == null) {
            return;
        }
        gyb.m128687a(C1577c.m8047l(), "com.android.chrome", new dyb());
        gyb.m128688b(C1577c.m8047l(), C1577c.m8047l().getPackageName());
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m104646L(bzv bzvVar, int i, Intent intent) {
        bzvVar.getClass();
        return m104656x(bzvVar, i, intent, null, 4, null);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static bzv m104655m() {
        return INSTANCE.m104689c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m104656x(bzv bzvVar, int i, Intent intent, fuf fufVar, int i2, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: onActivityResult");
            return false;
        }
        if ((i2 & 4) != 0) {
            fufVar = null;
        }
        return bzvVar.m104684w(i, intent, fufVar);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m104657z(bzv bzvVar, fuf fufVar, int i, Intent intent) {
        bzvVar.getClass();
        return bzvVar.m104684w(i, intent, fufVar);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m104658A(Intent intent) {
        return C1577c.m8047l().getPackageManager().resolveActivity(intent, 0) != null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final bzv m104659B(@NotNull String authType) {
        authType.getClass();
        this.authType = authType;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final bzv m104660C(@NotNull DefaultAudience defaultAudience) {
        defaultAudience.getClass();
        this.defaultAudience = defaultAudience;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public final void m104661D(boolean isExpressLoginAllowed) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("express_login_allowed", isExpressLoginAllowed);
        editorEdit.apply();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final bzv m104662E(boolean isFamilyLogin) {
        this.isFamilyLogin = isFamilyLogin;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final bzv m104663F(@NotNull LoginBehavior loginBehavior) {
        loginBehavior.getClass();
        this.loginBehavior = loginBehavior;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final bzv m104664G(@NotNull LoginTargetApp targetApp) {
        targetApp.getClass();
        this.loginTargetApp = targetApp;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final bzv m104665H(@Nullable String messengerPageId) {
        this.messengerPageId = messengerPageId;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final bzv m104666I(boolean resetMessengerState) {
        this.resetMessengerState = resetMessengerState;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final bzv m104667J(boolean shouldSkipAccountDeduplication) {
        this.shouldSkipAccountDeduplication = shouldSkipAccountDeduplication;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final void m104668K(fuf0 startActivityDelegate, LoginClient.Request request) throws FacebookException {
        m104683v(startActivityDelegate.getActivityContext(), request);
        CallbackManagerImpl.INSTANCE.m8666c(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.InterfaceC1636a() { // from class: l.zyv
            @Override // com.facebook.internal.CallbackManagerImpl.InterfaceC1636a
            /* JADX INFO: renamed from: a */
            public final boolean mo8663a(int i, Intent intent) {
                return bzv.m104646L(this.f205743a, i, intent);
            }
        });
        if (m104669M(startActivityDelegate, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        m104675n(startActivityDelegate.getActivityContext(), LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m104669M(fuf0 startActivityDelegate, LoginClient.Request request) {
        Intent intentM104674l = m104674l(request);
        if (!m104658A(intentM104674l)) {
            return false;
        }
        try {
            startActivityDelegate.startActivityForResult(intentM104674l, LoginClient.INSTANCE.m9088b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m104670N(Collection<String> permissions) {
        if (permissions == null) {
            return;
        }
        for (String str : permissions) {
            if (INSTANCE.m104691e(str)) {
                throw new FacebookException("Cannot pass a publish or manage permission (" + str + ") to a request for read authorization");
            }
        }
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: i */
    public final C16027c m104671i(@Nullable c84 callbackManager, @Nullable String loggerID) {
        return new C16027c(this, callbackManager, loggerID);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public LoginClient.Request m104672j(@NotNull ryv loginConfig) {
        String codeVerifier;
        loginConfig.getClass();
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            f460 f460Var = f460.INSTANCE;
            codeVerifier = f460.m119283b(loginConfig.getCodeVerifier(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            codeVerifier = loginConfig.getCodeVerifier();
        }
        CodeChallengeMethod codeChallengeMethod2 = codeChallengeMethod;
        String str = codeVerifier;
        LoginBehavior loginBehavior = this.loginBehavior;
        Set set = CollectionsKt.toSet(loginConfig.m181714c());
        DefaultAudience defaultAudience = this.defaultAudience;
        String str2 = this.authType;
        String strM8048m = C1577c.m8048m();
        String string = UUID.randomUUID().toString();
        string.getClass();
        LoginClient.Request request = new LoginClient.Request(loginBehavior, set, defaultAudience, str2, strM8048m, string, this.loginTargetApp, loginConfig.getNonce(), loginConfig.getCodeVerifier(), str, codeChallengeMethod2);
        request.m9073z(AccessToken.INSTANCE.m7438g());
        request.m9071x(this.messengerPageId);
        request.m9047A(this.resetMessengerState);
        request.m9070w(this.isFamilyLogin);
        request.m9048B(this.shouldSkipAccountDeduplication);
        return request;
    }

    /* JADX INFO: renamed from: k */
    public final void m104673k(AccessToken newToken, AuthenticationToken newIdToken, LoginClient.Request origRequest, FacebookException exception, boolean isCanceled, fuf<czv> callback) {
        if (newToken != null) {
            AccessToken.INSTANCE.m7440i(newToken);
            Profile.INSTANCE.m7621a();
        }
        if (newIdToken != null) {
            AuthenticationToken.INSTANCE.m7451a(newIdToken);
        }
        if (callback != null) {
            czv czvVarM104688b = (newToken == null || origRequest == null) ? null : INSTANCE.m104688b(origRequest, newToken, newIdToken);
            if (isCanceled || (czvVarM104688b != null && czvVarM104688b.m109432b().isEmpty())) {
                callback.onCancel();
                return;
            }
            if (exception != null) {
                callback.mo50769a(exception);
            } else {
                if (newToken == null || czvVarM104688b == null) {
                    return;
                }
                m104661D(true);
                callback.onSuccess(czvVarM104688b);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public Intent m104674l(@NotNull LoginClient.Request request) {
        request.getClass();
        Intent intent = new Intent();
        intent.setClass(C1577c.m8047l(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable(SocialConstants.TYPE_REQUEST, request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: n */
    public final void m104675n(Context context, LoginClient.Result.Code result, Map<String, String> resultExtras, Exception exception, boolean wasLoginActivityTried, LoginClient.Request request) {
        yyv yyvVarM104695a = C16029e.INSTANCE.m104695a(context);
        if (yyvVarM104695a == null) {
            return;
        }
        if (request == null) {
            yyv.m216572k(yyvVarM104695a, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("try_login_activity", wasLoginActivityTried ? "1" : "0");
        yyvVarM104695a.m216577f(request.getAuthId(), map, result, resultExtras, exception, request.getIsFamilyLogin() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    /* JADX INFO: renamed from: o */
    public final void m104676o(@NotNull Activity activity, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        activity.getClass();
        LoginClient.Request requestM104672j = m104672j(new ryv(permissions, null, 2, null));
        if (loggerID != null) {
            requestM104672j.m9069u(loggerID);
        }
        m104668K(new C16025a(activity), requestM104672j);
    }

    /* JADX INFO: renamed from: p */
    public final void m104677p(@NotNull Activity activity, @NotNull ryv loginConfig) {
        activity.getClass();
        loginConfig.getClass();
        m104668K(new C16025a(activity), m104672j(loginConfig));
    }

    /* JADX INFO: renamed from: q */
    public final void m104678q(@NotNull Fragment fragment, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        fragment.getClass();
        m104680s(new e3j(fragment), permissions, loggerID);
    }

    /* JADX INFO: renamed from: r */
    public final void m104679r(@NotNull androidx.fragment.app.Fragment fragment, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        fragment.getClass();
        m104680s(new e3j(fragment), permissions, loggerID);
    }

    /* JADX INFO: renamed from: s */
    public final void m104680s(@NotNull e3j fragment, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        fragment.getClass();
        LoginClient.Request requestM104672j = m104672j(new ryv(permissions, null, 2, null));
        if (loggerID != null) {
            requestM104672j.m9069u(loggerID);
        }
        m104668K(new C16028d(fragment), requestM104672j);
    }

    /* JADX INFO: renamed from: t */
    public final void m104681t(@NotNull Activity activity, @Nullable Collection<String> permissions) {
        activity.getClass();
        m104670N(permissions);
        m104677p(activity, new ryv(permissions, null, 2, null));
    }

    /* JADX INFO: renamed from: u */
    public void m104682u() {
        AccessToken.INSTANCE.m7440i(null);
        AuthenticationToken.INSTANCE.m7451a(null);
        Profile.INSTANCE.m7623c(null);
        m104661D(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m104683v(Context context, LoginClient.Request loginRequest) {
        yyv yyvVarM104695a = C16029e.INSTANCE.m104695a(context);
        if (yyvVarM104695a == null || loginRequest == null) {
            return;
        }
        yyvVarM104695a.m216579i(loginRequest, loginRequest.getIsFamilyLogin() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    @JvmOverloads
    @VisibleForTesting(otherwise = 3)
    /* JADX INFO: renamed from: w */
    public boolean m104684w(int resultCode, @Nullable Intent data, @Nullable fuf<czv> callback) {
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
        m104675n(null, code, map, facebookException2, true, request);
        m104673k(accessToken, authenticationToken, request, facebookException2, z, callback);
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m104685y(@Nullable c84 callbackManager, @Nullable final fuf<czv> callback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).m8662c(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.InterfaceC1636a() { // from class: l.azv
            @Override // com.facebook.internal.CallbackManagerImpl.InterfaceC1636a
            /* JADX INFO: renamed from: a */
            public final boolean mo8663a(int i, Intent intent) {
                return bzv.m104657z(this.f72387a, callback, i, intent);
            }
        });
    }

    /* JADX INFO: renamed from: l.bzv$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Ll/bzv$b;", "", "<init>", "()V", "Ll/bzv;", "c", "()Ll/bzv;", "", "permission", "", "e", "(Ljava/lang/String;)Z", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "Lcom/facebook/AccessToken;", "newToken", "Lcom/facebook/AuthenticationToken;", "newIdToken", "Ll/czv;", "b", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;)Ll/czv;", "", Constants.INAPP_DATA_TAG, "()Ljava/util/Set;", "otherPublishPermissions", "EXPRESS_LOGIN_ALLOWED", "Ljava/lang/String;", "MANAGE_PERMISSION_PREFIX", "OTHER_PUBLISH_PERMISSIONS", "Ljava/util/Set;", "PREFERENCE_LOGIN_MANAGER", "PUBLISH_PERMISSION_PREFIX", "TAG", "instance", "Ll/bzv;", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @VisibleForTesting(otherwise = 2)
        @NotNull
        /* JADX INFO: renamed from: b */
        public final czv m104688b(@NotNull LoginClient.Request request, @NotNull AccessToken newToken, @Nullable AuthenticationToken newIdToken) {
            request.getClass();
            newToken.getClass();
            Set<String> setM9063o = request.m9063o();
            Set mutableSet = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(newToken.m7420l()));
            if (request.getIsRerequest()) {
                mutableSet.retainAll(setM9063o);
            }
            Set mutableSet2 = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(setM9063o));
            mutableSet2.removeAll(mutableSet);
            return new czv(newToken, newIdToken, mutableSet, mutableSet2);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public bzv m104689c() {
            if (bzv.f78068l == null) {
                synchronized (this) {
                    bzv.f78068l = new bzv();
                    Unit unit = Unit.INSTANCE;
                }
            }
            bzv bzvVar = bzv.f78068l;
            if (bzvVar != null) {
                return bzvVar;
            }
            Intrinsics.m87502r("instance");
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public final Set<String> m104690d() {
            return SetsKt.setOf((Object[]) new String[]{"ads_management", "create_event", "rsvp_event"});
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* JADX INFO: renamed from: e */
        public final boolean m104691e(@Nullable String permission) {
            if (permission != null) {
                return C15386d.m93483J(permission, "publish", false, 2, null) || C15386d.m93483J(permission, "manage", false, 2, null) || bzv.f78066j.contains(permission);
            }
            return false;
        }

        public Companion() {
        }
    }
}
