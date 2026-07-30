package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AsyncTaskC1614d;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.C1600c;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.C1577f;
import com.facebook.internal.C1679d;
import com.facebook.internal.C1680e;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.login.DeviceAuthDialog;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.data.BannerFrequencyType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.c4s;
import p153l.ffc0;
import p153l.g0e;
import p153l.g0l0;
import p153l.jcc0;
import p153l.mnd0;
import p153l.ogc0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 m2\u00020\u0001:\u0003nopB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#H\u0015¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0014¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020#H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0003JC\u0010?\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b?\u0010@J)\u0010C\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020A2\b\u0010>\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ;\u0010E\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010_\u001a\b\u0012\u0002\b\u0003\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010cR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006q"}, m88121d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "", "onDismiss", "(Landroid/content/DialogInterface;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "w4", "(Lcom/facebook/login/LoginClient$Request;)V", "", "", "d4", "()Ljava/util/Map;", "f4", "()Ljava/lang/String;", "", "isSmartLogin", "i4", "(Z)Landroid/view/View;", "", "g4", "(Z)I", "Lcom/facebook/FacebookException;", "ex", "m4", "(Lcom/facebook/FacebookException;)V", "l4", "k4", "()Z", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "currentRequestState", "v4", "(Lcom/facebook/login/DeviceAuthDialog$RequestState;)V", "p4", "t4", "userId", "Lcom/facebook/login/DeviceAuthDialog$b;", Permissions.TYPE, "accessToken", AuthenticationTokenClaims.JSON_KEY_NAME, "Ljava/util/Date;", "expirationTime", "dataAccessExpirationTime", "q4", "(Ljava/lang/String;Lcom/facebook/login/DeviceAuthDialog$b;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "", "expiresIn", "n4", "(Ljava/lang/String;JLjava/lang/Long;)V", "e4", "(Ljava/lang/String;Lcom/facebook/login/DeviceAuthDialog$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", BaseSei.f14626Z, "Landroid/view/View;", "progressBar", "Landroid/widget/TextView;", "A", "Landroid/widget/TextView;", "confirmationCode", "B", "instructions", "Lcom/facebook/login/DeviceAuthMethodHandler;", c4s.C_ZONE, "Lcom/facebook/login/DeviceAuthMethodHandler;", "deviceAuthMethodHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "D", "Ljava/util/concurrent/atomic/AtomicBoolean;", "completed", "Lcom/facebook/d;", "E", "Lcom/facebook/d;", "currentGraphRequestPoll", "Ljava/util/concurrent/ScheduledFuture;", "F", "Ljava/util/concurrent/ScheduledFuture;", "scheduledPoll", "G", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "H", "Z", "isBeingDestroyed", "I", "isRetry", "J", "Lcom/facebook/login/LoginClient$Request;", "Lcom/facebook/GraphRequest;", "h4", "()Lcom/facebook/GraphRequest;", "pollRequest", "Companion", "a", "b", "RequestState", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public class DeviceAuthDialog extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: K */
    @NotNull
    public static final String f6765K = "device/login";

    /* JADX INFO: renamed from: L */
    @NotNull
    public static final String f6766L = "device/login_status";

    /* JADX INFO: renamed from: M */
    public static final int f6767M = 1349174;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public TextView confirmationCode;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public TextView instructions;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public DeviceAuthMethodHandler deviceAuthMethodHandler;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean completed = new AtomicBoolean();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public volatile AsyncTaskC1614d currentGraphRequestPoll;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public volatile ScheduledFuture<?> scheduledPoll;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public volatile RequestState currentRequestState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean isBeingDestroyed;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean isRetry;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public LoginClient.Request request;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public View progressBar;

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Lcom/facebook/login/DeviceAuthDialog$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", LovePlanetStage.result, "Lcom/facebook/login/DeviceAuthDialog$b;", "b", "(Lorg/json/JSONObject;)Lcom/facebook/login/DeviceAuthDialog$b;", "", "LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED", "I", "LOGIN_ERROR_SUBCODE_CODE_EXPIRED", "LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING", "", "REQUEST_STATE_KEY", "Ljava/lang/String;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final C1692b m9045b(JSONObject result) throws JSONException {
            String strOptString;
            JSONArray jSONArray = result.getJSONObject(Permissions.TYPE).getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    String strOptString2 = jSONObjectOptJSONObject.optString("permission");
                    strOptString2.getClass();
                    if (strOptString2.length() != 0 && !Intrinsics.m88377d(strOptString2, "installed") && (strOptString = jSONObjectOptJSONObject.optString(NotificationCompat.CATEGORY_STATUS)) != null) {
                        int iHashCode = strOptString.hashCode();
                        if (iHashCode != -1309235419) {
                            if (iHashCode != 280295099) {
                                if (iHashCode == 568196142 && strOptString.equals("declined")) {
                                    arrayList2.add(strOptString2);
                                }
                            } else if (strOptString.equals("granted")) {
                                arrayList.add(strOptString2);
                            }
                        } else if (strOptString.equals("expired")) {
                            arrayList3.add(strOptString2);
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return new C1692b(arrayList, arrayList2, arrayList3);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$b */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0010\u0010\u000eR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, m88121d2 = {"Lcom/facebook/login/DeviceAuthDialog$b;", "", "", "", "grantedPermissions", "declinedPermissions", "expiredPermissions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "setGrantedPermissions", "(Ljava/util/List;)V", "b", "setDeclinedPermissions", "setExpiredPermissions", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C1692b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public List<String> grantedPermissions;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public List<String> declinedPermissions;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public List<String> expiredPermissions;

        public C1692b(@NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.grantedPermissions = list;
            this.declinedPermissions = list2;
            this.expiredPermissions = list3;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<String> m9046a() {
            return this.declinedPermissions;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<String> m9047b() {
            return this.expiredPermissions;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final List<String> m9048c() {
            return this.grantedPermissions;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$c */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/facebook/login/DeviceAuthDialog$c", "Landroid/app/Dialog;", "", "onBackPressed", "()V", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class DialogC1693c extends Dialog {
        public DialogC1693c(FragmentActivity fragmentActivity, int i) {
            super(fragmentActivity, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (DeviceAuthDialog.this.m9024k4()) {
                super.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m9011c4(DeviceAuthDialog deviceAuthDialog, GraphResponse graphResponse) {
        deviceAuthDialog.getClass();
        graphResponse.getClass();
        if (deviceAuthDialog.completed.get()) {
            return;
        }
        FacebookRequestError error = graphResponse.getError();
        if (error == null) {
            try {
                JSONObject graphObject = graphResponse.getGraphObject();
                if (graphObject == null) {
                    graphObject = new JSONObject();
                }
                String string = graphObject.getString("access_token");
                string.getClass();
                deviceAuthDialog.m9027n4(string, graphObject.getLong("expires_in"), Long.valueOf(graphObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
                return;
            } catch (JSONException e) {
                deviceAuthDialog.m9026m4(new FacebookException(e));
                return;
            }
        }
        int subErrorCode = error.getSubErrorCode();
        if (subErrorCode == f6767M || subErrorCode == 1349172) {
            deviceAuthDialog.m9030t4();
            return;
        }
        if (subErrorCode != 1349152) {
            if (subErrorCode == 1349173) {
                deviceAuthDialog.m9025l4();
                return;
            }
            FacebookRequestError error2 = graphResponse.getError();
            FacebookException exception = error2 == null ? null : error2.getException();
            if (exception == null) {
                exception = new FacebookException();
            }
            deviceAuthDialog.m9026m4(exception);
            return;
        }
        RequestState requestState = deviceAuthDialog.currentRequestState;
        if (requestState != null) {
            g0e g0eVar = g0e.INSTANCE;
            g0e.m128419a(requestState.getUserCode());
        }
        LoginClient.Request request = deviceAuthDialog.request;
        if (request != null) {
            deviceAuthDialog.m9032w4(request);
        } else {
            deviceAuthDialog.m9025l4();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m9012j4(DeviceAuthDialog deviceAuthDialog, View view) {
        deviceAuthDialog.getClass();
        deviceAuthDialog.m9025l4();
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m9013o4(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2, GraphResponse graphResponse) {
        JSONException jSONException;
        EnumSet<SmartLoginOption> enumSetM8851w;
        deviceAuthDialog.getClass();
        str.getClass();
        graphResponse.getClass();
        if (deviceAuthDialog.completed.get()) {
            return;
        }
        FacebookRequestError error = graphResponse.getError();
        if (error != null) {
            FacebookException exception = error.getException();
            if (exception == null) {
                exception = new FacebookException();
            }
            deviceAuthDialog.m9026m4(exception);
            return;
        }
        try {
            JSONObject graphObject = graphResponse.getGraphObject();
            if (graphObject == null) {
                try {
                    graphObject = new JSONObject();
                } catch (JSONException e) {
                    jSONException = e;
                    deviceAuthDialog.m9026m4(new FacebookException(jSONException));
                    return;
                }
            }
            String string = graphObject.getString("id");
            string.getClass();
            C1692b c1692bM9045b = INSTANCE.m9045b(graphObject);
            String string2 = graphObject.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
            string2.getClass();
            RequestState requestState = deviceAuthDialog.currentRequestState;
            if (requestState != null) {
                g0e g0eVar = g0e.INSTANCE;
                g0e.m128419a(requestState.getUserCode());
            }
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            C1679d c1679dM8743f = FetchedAppSettingsManager.m8743f(C1600c.m8102m());
            Boolean boolValueOf = null;
            if (c1679dM8743f != null && (enumSetM8851w = c1679dM8743f.m8851w()) != null) {
                boolValueOf = Boolean.valueOf(enumSetM8851w.contains(SmartLoginOption.RequireConfirm));
            }
            if (!Intrinsics.m88377d(boolValueOf, Boolean.TRUE) || deviceAuthDialog.isRetry) {
                deviceAuthDialog.m9019e4(string, c1692bM9045b, str, date, date2);
            } else {
                deviceAuthDialog.isRetry = true;
                deviceAuthDialog.m9029q4(string, c1692bM9045b, str, string2, date, date2);
            }
        } catch (JSONException e2) {
            jSONException = e2;
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m9014r4(DeviceAuthDialog deviceAuthDialog, String str, C1692b c1692b, String str2, Date date, Date date2, DialogInterface dialogInterface, int i) {
        deviceAuthDialog.getClass();
        str.getClass();
        c1692b.getClass();
        str2.getClass();
        deviceAuthDialog.m9019e4(str, c1692b, str2, date, date2);
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m9015s4(DeviceAuthDialog deviceAuthDialog, DialogInterface dialogInterface, int i) {
        deviceAuthDialog.getClass();
        View viewM9023i4 = deviceAuthDialog.m9023i4(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView(viewM9023i4);
        }
        LoginClient.Request request = deviceAuthDialog.request;
        if (request == null) {
            return;
        }
        deviceAuthDialog.m9032w4(request);
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m9016u4(DeviceAuthDialog deviceAuthDialog) {
        deviceAuthDialog.getClass();
        deviceAuthDialog.m9028p4();
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m9017x4(DeviceAuthDialog deviceAuthDialog, GraphResponse graphResponse) {
        deviceAuthDialog.getClass();
        graphResponse.getClass();
        if (deviceAuthDialog.isBeingDestroyed) {
            return;
        }
        if (graphResponse.getError() != null) {
            FacebookRequestError error = graphResponse.getError();
            FacebookException exception = error == null ? null : error.getException();
            if (exception == null) {
                exception = new FacebookException();
            }
            deviceAuthDialog.m9026m4(exception);
            return;
        }
        JSONObject graphObject = graphResponse.getGraphObject();
        if (graphObject == null) {
            graphObject = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            requestState.m9040h(graphObject.getString("user_code"));
            requestState.m9039g(graphObject.getString("code"));
            requestState.m9037e(graphObject.getLong(BannerFrequencyType.interval));
            deviceAuthDialog.m9031v4(requestState);
        } catch (JSONException e) {
            deviceAuthDialog.m9026m4(new FacebookException(e));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d4 */
    public Map<String, String> m9018d4() {
        return null;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m9019e4(String userId, C1692b permissions, String accessToken, Date expirationTime, Date dataAccessExpirationTime) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.m9054w(accessToken, C1600c.m8102m(), userId, permissions.m9048c(), permissions.m9046a(), permissions.m9047b(), AccessTokenSource.DEVICE_AUTH, expirationTime, null, dataAccessExpirationTime);
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: f4 */
    public String m9020f4() {
        return g0l0.m128431b() + '|' + g0l0.m128432c();
    }

    @LayoutRes
    /* JADX INFO: renamed from: g4 */
    public int m9021g4(boolean isSmartLogin) {
        return isSmartLogin ? ffc0.f98758d : ffc0.f98756b;
    }

    /* JADX INFO: renamed from: h4 */
    public final GraphRequest m9022h4() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.currentRequestState;
        bundle.putString("code", requestState == null ? null : requestState.getRequestCode());
        bundle.putString("access_token", m9020f4());
        return GraphRequest.INSTANCE.m7609A(null, f6766L, bundle, new GraphRequest.InterfaceC1539b() { // from class: l.kzd
            @Override // com.facebook.GraphRequest.InterfaceC1539b
            /* JADX INFO: renamed from: a */
            public final void mo7602a(GraphResponse graphResponse) {
                DeviceAuthDialog.m9011c4(this.f129399a, graphResponse);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: i4 */
    public View m9023i4(boolean isSmartLogin) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(m9021g4(isSmartLogin), (ViewGroup) null);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(jcc0.f120043f);
        viewFindViewById.getClass();
        this.progressBar = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(jcc0.f120042e);
        if (viewFindViewById2 == null) {
            mnd0.m159157a("null cannot be cast to non-null type android.widget.TextView");
            return null;
        }
        this.confirmationCode = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(jcc0.f120038a);
        if (viewFindViewById3 == null) {
            mnd0.m159157a("null cannot be cast to non-null type android.widget.Button");
            return null;
        }
        ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: l.izd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAuthDialog.m9012j4(this.f117689a, view);
            }
        });
        View viewFindViewById4 = viewInflate.findViewById(jcc0.f120039b);
        if (viewFindViewById4 == null) {
            mnd0.m159157a("null cannot be cast to non-null type android.widget.TextView");
            return null;
        }
        TextView textView = (TextView) viewFindViewById4;
        this.instructions = textView;
        textView.setText(Html.fromHtml(getString(com.facebook.common.R$string.f6289a)));
        return viewInflate;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m9024k4() {
        return true;
    }

    /* JADX INFO: renamed from: l4 */
    public void m9025l4() {
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                g0e g0eVar = g0e.INSTANCE;
                g0e.m128419a(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.m9052t();
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m9026m4(@NotNull FacebookException ex) {
        ex.getClass();
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                g0e g0eVar = g0e.INSTANCE;
                g0e.m128419a(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.m9053u(ex);
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final void m9027n4(final String accessToken, long expiresIn, Long dataAccessExpirationTime) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        Date date2 = expiresIn != 0 ? new Date(new Date().getTime() + (expiresIn * 1000)) : null;
        if ((dataAccessExpirationTime == null || dataAccessExpirationTime.longValue() != 0) && dataAccessExpirationTime != null) {
            date = new Date(dataAccessExpirationTime.longValue() * 1000);
        }
        final Date date3 = date;
        final Date date4 = date2;
        GraphRequest graphRequestM7639x = GraphRequest.INSTANCE.m7639x(new AccessToken(accessToken, C1600c.m8102m(), "0", null, null, null, null, date2, null, date3, null, 1024, null), "me", new GraphRequest.InterfaceC1539b() { // from class: l.mzd
            @Override // com.facebook.GraphRequest.InterfaceC1539b
            /* JADX INFO: renamed from: a */
            public final void mo7602a(GraphResponse graphResponse) {
                DeviceAuthDialog.m9013o4(this.f139499a, accessToken, date4, date3, graphResponse);
            }
        });
        graphRequestM7639x.m7573F(HttpMethod.GET);
        graphRequestM7639x.m7574G(bundle);
        graphRequestM7639x.m7580k();
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        DialogC1693c dialogC1693c = new DialogC1693c(requireActivity(), ogc0.f147210b);
        dialogC1693c.setContentView(m9023i4(g0e.m128422e() && !this.isRetry));
        return dialogC1693c;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RequestState requestState;
        LoginClient loginClientM9153c4;
        inflater.getClass();
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        LoginFragment loginFragment = (LoginFragment) ((FacebookActivity) requireActivity()).getCurrentFragment();
        LoginMethodHandler loginMethodHandlerM9086k = null;
        if (loginFragment != null && (loginClientM9153c4 = loginFragment.m9153c4()) != null) {
            loginMethodHandlerM9086k = loginClientM9153c4.m9086k();
        }
        this.deviceAuthMethodHandler = (DeviceAuthMethodHandler) loginMethodHandlerM9086k;
        if (savedInstanceState == null || (requestState = (RequestState) savedInstanceState.getParcelable("request_state")) == null) {
            return viewOnCreateView;
        }
        m9031v4(requestState);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        AsyncTaskC1614d asyncTaskC1614d = this.currentGraphRequestPoll;
        if (asyncTaskC1614d != null) {
            asyncTaskC1614d.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.scheduledPoll;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        dialog.getClass();
        super.onDismiss(dialog);
        if (this.isBeingDestroyed) {
            return;
        }
        m9025l4();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        super.onSaveInstanceState(outState);
        if (this.currentRequestState != null) {
            outState.putParcelable("request_state", this.currentRequestState);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m9028p4() {
        RequestState requestState = this.currentRequestState;
        if (requestState != null) {
            requestState.m9038f(new Date().getTime());
        }
        this.currentGraphRequestPoll = m9022h4().m7580k();
    }

    /* JADX INFO: renamed from: q4 */
    public final void m9029q4(final String userId, final C1692b permissions, final String accessToken, String name, final Date expirationTime, final Date dataAccessExpirationTime) {
        String string = getResources().getString(com.facebook.common.R$string.f6295g);
        string.getClass();
        String string2 = getResources().getString(com.facebook.common.R$string.f6294f);
        string2.getClass();
        String string3 = getResources().getString(com.facebook.common.R$string.f6293e);
        string3.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(string2, Arrays.copyOf(new Object[]{name}, 1));
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(str, new DialogInterface.OnClickListener() { // from class: l.nzd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.m9014r4(this.f144421a, userId, permissions, accessToken, expirationTime, dataAccessExpirationTime, dialogInterface, i);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: l.ozd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.m9015s4(this.f149860a, dialogInterface, i);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: renamed from: t4 */
    public final void m9030t4() {
        RequestState requestState = this.currentRequestState;
        Long lValueOf = requestState == null ? null : Long.valueOf(requestState.getInterval());
        if (lValueOf != null) {
            this.scheduledPoll = DeviceAuthMethodHandler.INSTANCE.m9058a().schedule(new Runnable() { // from class: l.jzd
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceAuthDialog.m9016u4(this.f123256a);
                }
            }, lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final void m9031v4(RequestState currentRequestState) {
        this.currentRequestState = currentRequestState;
        TextView textView = this.confirmationCode;
        if (textView == null) {
            Intrinsics.m88391r("confirmationCode");
            throw null;
        }
        textView.setText(currentRequestState.getUserCode());
        g0e g0eVar = g0e.INSTANCE;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), g0e.m128420c(currentRequestState.getAuthorizationUri()));
        TextView textView2 = this.instructions;
        if (textView2 == null) {
            Intrinsics.m88391r("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.confirmationCode;
        if (textView3 == null) {
            Intrinsics.m88391r("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.m88391r("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.isRetry && g0e.m128423f(currentRequestState.getUserCode())) {
            new C1577f(getContext()).m7830f("fb_smart_login_service");
        }
        if (currentRequestState.m9041i()) {
            m9030t4();
        } else {
            m9028p4();
        }
    }

    /* JADX INFO: renamed from: w4 */
    public void m9032w4(@NotNull LoginClient.Request request) {
        request.getClass();
        this.request = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(Constants.SEPARATOR_COMMA, request.m9117o()));
        C1680e c1680e = C1680e.INSTANCE;
        C1680e.m8911q0(bundle, WBConstants.AUTH_PARAMS_REDIRECT_URL, request.getDeviceRedirectUriString());
        C1680e.m8911q0(bundle, "target_user_id", request.getDeviceAuthTargetUserId());
        bundle.putString("access_token", m9020f4());
        g0e g0eVar = g0e.INSTANCE;
        Map<String, String> mapM9018d4 = m9018d4();
        bundle.putString("device_info", g0e.m128421d(mapM9018d4 == null ? null : MapsKt.toMutableMap(mapM9018d4)));
        GraphRequest.INSTANCE.m7609A(null, f6765K, bundle, new GraphRequest.InterfaceC1539b() { // from class: l.lzd
            @Override // com.facebook.GraphRequest.InterfaceC1539b
            /* JADX INFO: renamed from: a */
            public final void mo7602a(GraphResponse graphResponse) {
                DeviceAuthDialog.m9017x4(this.f134180a, graphResponse);
            }
        }).m7580k();
    }

    @Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001%B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\rR\"\u0010#\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0011R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010$¨\u0006)"}, m88121d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "userCode", "", "h", "(Ljava/lang/String;)V", "", "lastPoll", "f", "(J)V", "", RXScreenCaptureService.KEY_INDEX, "()Z", "", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "<set-?>", "authorizationUri", "Ljava/lang/String;", "a", "requestCode", "c", "g", BannerFrequencyType.interval, "J", "b", "()J", "e", "Companion", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class RequestState implements Parcelable {

        @Nullable
        private String authorizationUri;
        private long interval;
        private long lastPoll;

        @Nullable
        private String requestCode;

        @Nullable
        private String userCode;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<RequestState> CREATOR = new C1689a();

        /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$RequestState$a */
        @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/login/DeviceAuthDialog$RequestState$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/DeviceAuthDialog$RequestState;", "", "size", "", "b", "(I)[Lcom/facebook/login/DeviceAuthDialog$RequestState;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
        public static final class C1689a implements Parcelable.Creator<RequestState> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(@NotNull Parcel parcel) {
                parcel.getClass();
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int size) {
                return new RequestState[size];
            }
        }

        public RequestState(@NotNull Parcel parcel) {
            parcel.getClass();
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAuthorizationUri() {
            return this.authorizationUri;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getInterval() {
            return this.interval;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRequestCode() {
            return this.requestCode;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUserCode() {
            return this.userCode;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public final void m9037e(long j) {
            this.interval = j;
        }

        /* JADX INFO: renamed from: f */
        public final void m9038f(long lastPoll) {
            this.lastPoll = lastPoll;
        }

        /* JADX INFO: renamed from: g */
        public final void m9039g(@Nullable String str) {
            this.requestCode = str;
        }

        /* JADX INFO: renamed from: h */
        public final void m9040h(@Nullable String userCode) {
            this.userCode = userCode;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            this.authorizationUri = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{userCode}, 1));
        }

        /* JADX INFO: renamed from: i */
        public final boolean m9041i() {
            return this.lastPoll != 0 && (new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.authorizationUri);
            dest.writeString(this.userCode);
            dest.writeString(this.requestCode);
            dest.writeLong(this.interval);
            dest.writeLong(this.lastPoll);
        }

        public RequestState() {
        }
    }
}
