package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.C1600c;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.internal.C1680e;
import com.facebook.internal.CallbackManagerImpl;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.c4s;
import p153l.g0l0;
import p153l.mnd0;
import p153l.w0w;
import p153l.z0w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u0082\u00012\u00020\u0001:\u0007\u0011&4\u0083\u0001\u0084\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00132\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u000bJ\u000f\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J'\u0010/\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020'\u0018\u0001012\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000f¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u000bJ\r\u00107\u001a\u00020\u000f¢\u0006\u0004\b7\u00105J\u0015\u00108\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b8\u0010\u0016J\u0015\u00109\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b9\u0010\u0016J\u0015\u0010;\u001a\u00020*2\u0006\u0010:\u001a\u00020\f¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0013¢\u0006\u0004\b>\u0010\u0016J\r\u0010?\u001a\u00020\t¢\u0006\u0004\b?\u0010\u000bJ\r\u0010@\u001a\u00020\t¢\u0006\u0004\b@\u0010\u000bJ\u000f\u0010A\u001a\u00020*H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010E\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020*H\u0016¢\u0006\u0004\bE\u0010FR*\u0010G\u001a\n\u0012\u0004\u0012\u00020'\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR.\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010\u0005R$\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010[\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u00105\"\u0004\bd\u0010eR$\u0010f\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010$R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR0\u0010q\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010l\u001a\u0004\br\u0010n\"\u0004\bs\u0010pR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010NR\u0016\u0010x\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010NR\u0014\u0010{\u001a\u00020t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0013\u0010\u007f\u001a\u0004\u0018\u00010|8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0013\u0010\u0081\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u00105¨\u0006\u0085\u0001"}, m88121d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "h", "()V", "", Constants.KEY_KEY, "value", "", "accumulate", "a", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/facebook/login/LoginClient$Result;", "outcome", "u", "(Lcom/facebook/login/LoginClient$Result;)V", FirebaseAnalytics.Param.METHOD, LovePlanetStage.result, "", "loggingExtras", "q", "(Ljava/lang/String;Lcom/facebook/login/LoginClient$Result;Ljava/util/Map;)V", "errorMessage", "errorCode", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "A", "(Lcom/facebook/login/LoginClient$Request;)V", "b", "c", "Lcom/facebook/login/LoginMethodHandler;", "k", "()Lcom/facebook/login/LoginMethodHandler;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "w", "(IILandroid/content/Intent;)Z", "", "m", "(Lcom/facebook/login/LoginClient$Request;)[Lcom/facebook/login/LoginMethodHandler;", Constants.INAPP_DATA_TAG, "()Z", c4s.C_ZONE, "B", "g", "f", "permission", "e", "(Ljava/lang/String;)I", "pendingResult", "D", BLiveStormDanmakuGiftResourceType.f45294s, Constants.KEY_T, "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "handlersToTry", "[Lcom/facebook/login/LoginMethodHandler;", "getHandlersToTry", "()[Lcom/facebook/login/LoginMethodHandler;", "setHandlersToTry", "([Lcom/facebook/login/LoginMethodHandler;)V", "currentHandler", "I", "Landroidx/fragment/app/Fragment;", BLiveStormDanmakuGiftResourceType.f45292l, "()Landroidx/fragment/app/Fragment;", BaseSei.f14625Y, "Lcom/facebook/login/LoginClient$d;", "onCompletedListener", "Lcom/facebook/login/LoginClient$d;", "getOnCompletedListener", "()Lcom/facebook/login/LoginClient$d;", BaseSei.f14626Z, "(Lcom/facebook/login/LoginClient$d;)V", "Lcom/facebook/login/LoginClient$a;", "backgroundProcessingListener", "Lcom/facebook/login/LoginClient$a;", "getBackgroundProcessingListener", "()Lcom/facebook/login/LoginClient$a;", BaseSei.f14624X, "(Lcom/facebook/login/LoginClient$a;)V", "checkedInternetPermission", "Z", "getCheckedInternetPermission", "setCheckedInternetPermission", "(Z)V", "pendingRequest", "Lcom/facebook/login/LoginClient$Request;", "p", "()Lcom/facebook/login/LoginClient$Request;", "setPendingRequest", "", "Ljava/util/Map;", "getLoggingExtras", "()Ljava/util/Map;", "setLoggingExtras", "(Ljava/util/Map;)V", "extraData", "getExtraData", "setExtraData", "Ll/w0w;", "loginLogger", "Ll/w0w;", "numActivitiesReturned", "numTotalIntentsFired", "o", "()Ll/w0w;", "logger", "Landroidx/fragment/app/FragmentActivity;", RXScreenCaptureService.KEY_INDEX, "()Landroidx/fragment/app/FragmentActivity;", "activity", "n", "inProgress", "Companion", "Request", "Result", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LoginClient implements Parcelable {

    @Nullable
    private InterfaceC1707a backgroundProcessingListener;
    private boolean checkedInternetPermission;
    private int currentHandler;

    @Nullable
    private Map<String, String> extraData;

    @Nullable
    private Fragment fragment;

    @Nullable
    private LoginMethodHandler[] handlersToTry;

    @Nullable
    private Map<String, String> loggingExtras;

    @Nullable
    private w0w loginLogger;
    private int numActivitiesReturned;
    private int numTotalIntentsFired;

    @Nullable
    private InterfaceC1710d onCompletedListener;

    @Nullable
    private Request pendingRequest;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<LoginClient> CREATOR = new C1708b();

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"Lcom/facebook/login/LoginClient$a;", "", "", "a", "()V", "b", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public interface InterfaceC1707a {
        /* JADX INFO: renamed from: a */
        void mo9137a();

        /* JADX INFO: renamed from: b */
        void mo9138b();
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$b */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/login/LoginClient$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/LoginClient;", "", "size", "", "b", "(I)[Lcom/facebook/login/LoginClient;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C1708b implements Parcelable.Creator<LoginClient> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new LoginClient(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int size) {
            return new LoginClient[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$c, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lcom/facebook/login/LoginClient$c;", "", "<init>", "()V", "", "b", "()I", "", "a", "()Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient;", "CREATOR", "Landroid/os/Parcelable$Creator;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m9141a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            string.getClass();
            return string;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final int m9142b() {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$d */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/facebook/login/LoginClient$d;", "", "Lcom/facebook/login/LoginClient$Result;", LovePlanetStage.result, "", "a", "(Lcom/facebook/login/LoginClient$Result;)V", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public interface InterfaceC1710d {
        /* JADX INFO: renamed from: a */
        void mo9143a(@NotNull Result result);
    }

    public LoginClient(@NotNull Parcel parcel) {
        parcel.getClass();
        this.currentHandler = -1;
        Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.m9168n(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array == null) {
            mnd0.m159157a("null cannot be cast to non-null type kotlin.Array<T>");
            throw null;
        }
        this.handlersToTry = (LoginMethodHandler[]) array;
        this.currentHandler = parcel.readInt();
        this.pendingRequest = (Request) parcel.readParcelable(Request.class.getClassLoader());
        Map<String, String> mapM8913r0 = C1680e.m8913r0(parcel);
        this.loggingExtras = mapM8913r0 == null ? null : MapsKt.toMutableMap(mapM8913r0);
        Map<String, String> mapM8913r1 = C1680e.m8913r0(parcel);
        this.extraData = mapM8913r1 != null ? MapsKt.toMutableMap(mapM8913r1) : null;
    }

    /* JADX INFO: renamed from: A */
    public final void m9073A(@Nullable Request request) {
        if (m9089n()) {
            return;
        }
        m9078b(request);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m9074B() {
        LoginMethodHandler loginMethodHandlerM9086k = m9086k();
        if (loginMethodHandlerM9086k == null) {
            return false;
        }
        if (loginMethodHandlerM9086k.mo9166i() && !m9080d()) {
            m9077a("no_internet_permission", "1", false);
            return false;
        }
        Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int iMo8998p = loginMethodHandlerM9086k.mo8998p(request);
        this.numActivitiesReturned = 0;
        if (iMo8998p > 0) {
            m9090o().m204348e(request.getAuthId(), loginMethodHandlerM9086k.getNameForLogging(), request.getIsFamilyLogin() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.numTotalIntentsFired = iMo8998p;
        } else {
            m9090o().m204347d(request.getAuthId(), loginMethodHandlerM9086k.getNameForLogging(), request.getIsFamilyLogin() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            m9077a("not_tried", loginMethodHandlerM9086k.getNameForLogging(), true);
        }
        return iMo8998p > 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m9075C() {
        LoginClient loginClient;
        LoginMethodHandler loginMethodHandlerM9086k = m9086k();
        if (loginMethodHandlerM9086k != null) {
            loginClient = this;
            loginClient.m9093r(loginMethodHandlerM9086k.getNameForLogging(), "skipped", null, null, loginMethodHandlerM9086k.m9164e());
        } else {
            loginClient = this;
        }
        LoginMethodHandler[] loginMethodHandlerArr = loginClient.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i = loginClient.currentHandler;
            if (i >= loginMethodHandlerArr.length - 1) {
                break;
            }
            loginClient.currentHandler = i + 1;
            if (loginClient.m9074B()) {
                return;
            }
        }
        if (loginClient.pendingRequest != null) {
            loginClient.m9084h();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:6:0x0011, B:8:0x001f, B:12:0x003e, B:11:0x002f), top: B:18:0x0011 }] */
    /* JADX INFO: renamed from: D */
    public final void m9076D(@NotNull Result pendingResult) {
        Result resultM9134b;
        pendingResult.getClass();
        if (pendingResult.token == null) {
            throw new FacebookException("Can't validate without a token");
        }
        AccessToken accessTokenM7490e = AccessToken.INSTANCE.m7490e();
        AccessToken accessToken = pendingResult.token;
        if (accessTokenM7490e != null) {
            try {
                if (Intrinsics.m88377d(accessTokenM7490e.getUserId(), accessToken.getUserId())) {
                    resultM9134b = Result.INSTANCE.m9134b(this.pendingRequest, pendingResult.token, pendingResult.authenticationToken);
                } else {
                    resultM9134b = Result.Companion.m9132d(Result.INSTANCE, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
                }
            } catch (Exception e) {
                m9082f(Result.Companion.m9132d(Result.INSTANCE, this.pendingRequest, "Caught exception", e.getMessage(), null, 8, null));
                return;
            }
        } else {
            resultM9134b = Result.Companion.m9132d(Result.INSTANCE, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
        }
        m9082f(resultM9134b);
    }

    /* JADX INFO: renamed from: a */
    public final void m9077a(String key, String value, boolean accumulate) {
        Map<String, String> map = this.loggingExtras;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(key) && accumulate) {
            value = ((Object) map.get(key)) + ',' + value;
        }
        map.put(key, value);
    }

    /* JADX INFO: renamed from: b */
    public final void m9078b(@Nullable Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.INSTANCE.m7492g() || m9080d()) {
            this.pendingRequest = request;
            this.handlersToTry = m9088m(request);
            m9075C();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9079c() {
        LoginMethodHandler loginMethodHandlerM9086k = m9086k();
        if (loginMethodHandlerM9086k == null) {
            return;
        }
        loginMethodHandlerM9086k.mo9061b();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9080d() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (m9081e("android.permission.INTERNET") == 0) {
            this.checkedInternetPermission = true;
            return true;
        }
        FragmentActivity fragmentActivityM9085i = m9085i();
        m9082f(Result.Companion.m9132d(Result.INSTANCE, this.pendingRequest, fragmentActivityM9085i == null ? null : fragmentActivityM9085i.getString(com.facebook.common.R$string.f6291c), fragmentActivityM9085i != null ? fragmentActivityM9085i.getString(com.facebook.common.R$string.f6290b) : null, null, 8, null));
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m9081e(@NotNull String permission) {
        permission.getClass();
        FragmentActivity fragmentActivityM9085i = m9085i();
        if (fragmentActivityM9085i == null) {
            return -1;
        }
        return fragmentActivityM9085i.checkCallingOrSelfPermission(permission);
    }

    /* JADX INFO: renamed from: f */
    public final void m9082f(@NotNull Result outcome) {
        outcome.getClass();
        LoginMethodHandler loginMethodHandlerM9086k = m9086k();
        if (loginMethodHandlerM9086k != null) {
            m9092q(loginMethodHandlerM9086k.getNameForLogging(), outcome, loginMethodHandlerM9086k.m9164e());
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            outcome.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            outcome.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        m9096u(outcome);
    }

    /* JADX INFO: renamed from: g */
    public final void m9083g(@NotNull Result outcome) {
        outcome.getClass();
        if (outcome.token == null || !AccessToken.INSTANCE.m7492g()) {
            m9082f(outcome);
        } else {
            m9076D(outcome);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m9084h() {
        m9082f(Result.Companion.m9132d(Result.INSTANCE, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final FragmentActivity m9085i() {
        Fragment fragment = this.fragment;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final LoginMethodHandler m9086k() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.currentHandler;
        if (i < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public LoginMethodHandler[] m9088m(@NotNull Request request) {
        request.getClass();
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehavior = request.getLoginBehavior();
        if (!request.m9121s()) {
            if (loginBehavior.getAllowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!C1600c.bypassAppSwitch && loginBehavior.getAllowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!C1600c.bypassAppSwitch && loginBehavior.getAllowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehavior.getAllowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.getAllowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.m9121s() && loginBehavior.getAllowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            return (LoginMethodHandler[]) array;
        }
        mnd0.m159157a("null cannot be cast to non-null type kotlin.Array<T>");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m9089n() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    /* JADX INFO: renamed from: o */
    public final w0w m9090o() {
        w0w w0wVar = this.loginLogger;
        if (w0wVar != null) {
            String strM204345b = w0wVar.m204345b();
            Request request = this.pendingRequest;
            if (Intrinsics.m88377d(strM204345b, request == null ? null : request.getApplicationId())) {
                return w0wVar;
            }
        }
        Context contextM9085i = m9085i();
        if (contextM9085i == null) {
            contextM9085i = C1600c.m8101l();
        }
        Request request2 = this.pendingRequest;
        w0w w0wVar2 = new w0w(contextM9085i, request2 == null ? C1600c.m8102m() : request2.getApplicationId());
        this.loginLogger = w0wVar2;
        return w0wVar2;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Request getPendingRequest() {
        return this.pendingRequest;
    }

    /* JADX INFO: renamed from: q */
    public final void m9092q(String method, Result result, Map<String, String> loggingExtras) {
        m9093r(method, result.code.getLoggingValue(), result.errorMessage, result.errorCode, loggingExtras);
    }

    /* JADX INFO: renamed from: r */
    public final void m9093r(String method, String result, String errorMessage, String errorCode, Map<String, String> loggingExtras) {
        Request request = this.pendingRequest;
        if (request == null) {
            m9090o().m204352j("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", method);
        } else {
            m9090o().m204346c(request.getAuthId(), method, result, errorMessage, errorCode, loggingExtras, request.getIsFamilyLogin() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m9094s() {
        InterfaceC1707a interfaceC1707a = this.backgroundProcessingListener;
        if (interfaceC1707a == null) {
            return;
        }
        interfaceC1707a.mo9137a();
    }

    /* JADX INFO: renamed from: t */
    public final void m9095t() {
        InterfaceC1707a interfaceC1707a = this.backgroundProcessingListener;
        if (interfaceC1707a == null) {
            return;
        }
        interfaceC1707a.mo9138b();
    }

    /* JADX INFO: renamed from: u */
    public final void m9096u(Result outcome) {
        InterfaceC1710d interfaceC1710d = this.onCompletedListener;
        if (interfaceC1710d == null) {
            return;
        }
        interfaceC1710d.mo9143a(outcome);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m9097w(int requestCode, int resultCode, @Nullable Intent data) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (data != null && data.getBooleanExtra(CustomTabMainActivity.f5920i, false)) {
                m9075C();
                return false;
            }
            LoginMethodHandler loginMethodHandlerM9086k = m9086k();
            if (loginMethodHandlerM9086k != null && (!loginMethodHandlerM9086k.mo9070o() || data != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                return loginMethodHandlerM9086k.mo8996k(requestCode, resultCode, data);
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeParcelableArray(this.handlersToTry, flags);
        dest.writeInt(this.currentHandler);
        dest.writeParcelable(this.pendingRequest, flags);
        C1680e c1680e = C1680e.INSTANCE;
        C1680e.m8868F0(dest, this.loggingExtras);
        C1680e.m8868F0(dest, this.extraData);
    }

    /* JADX INFO: renamed from: x */
    public final void m9098x(@Nullable InterfaceC1707a interfaceC1707a) {
        this.backgroundProcessingListener = interfaceC1707a;
    }

    /* JADX INFO: renamed from: y */
    public final void m9099y(@Nullable Fragment fragment) {
        if (this.fragment != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.fragment = fragment;
    }

    /* JADX INFO: renamed from: z */
    public final void m9100z(@Nullable InterfaceC1710d interfaceC1710d) {
        this.onCompletedListener = interfaceC1710d;
    }

    @Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&'B9\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBC\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0010B\u0011\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000b\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006("}, m88121d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "Lcom/facebook/login/LoginClient$Result$Code;", "code", "Lcom/facebook/AccessToken;", "token", "", "errorMessage", "errorCode", "<init>", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$Code;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)V", "accessToken", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$Code;Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/facebook/login/LoginClient$Result$Code;", "Lcom/facebook/AccessToken;", "Lcom/facebook/AuthenticationToken;", "Ljava/lang/String;", "Lcom/facebook/login/LoginClient$Request;", "", "loggingExtras", "Ljava/util/Map;", "extraData", "Companion", "Code", "b", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Result implements Parcelable {

        @JvmField
        @Nullable
        public final AuthenticationToken authenticationToken;

        @JvmField
        @NotNull
        public final Code code;

        @JvmField
        @Nullable
        public final String errorCode;

        @JvmField
        @Nullable
        public final String errorMessage;

        @JvmField
        @Nullable
        public Map<String, String> extraData;

        @JvmField
        @Nullable
        public Map<String, String> loggingExtras;

        @JvmField
        @Nullable
        public final Request request;

        @JvmField
        @Nullable
        public final AccessToken token;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new C1705a();

        @Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m88121d2 = {"Lcom/facebook/login/LoginClient$Result$Code;", "", "loggingValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingValue", "()Ljava/lang/String;", "SUCCESS", "CANCEL", "ERROR", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");


            @NotNull
            private final String loggingValue;

            Code(String str) {
                this.loggingValue = str;
            }

            /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
            public static Code[] valuesCustom() {
                Code[] codeArrValuesCustom = values();
                return (Code[]) Arrays.copyOf(codeArrValuesCustom, codeArrValuesCustom.length);
            }

            @NotNull
            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        /* JADX INFO: renamed from: com.facebook.login.LoginClient$Result$a */
        @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/login/LoginClient$Result$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/LoginClient$Result;", "", "size", "", "b", "(I)[Lcom/facebook/login/LoginClient$Result;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
        public static final class C1705a implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(@NotNull Parcel source) {
                source.getClass();
                return new Result(source, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int size) {
                return new Result[size];
            }
        }

        /* JADX INFO: renamed from: com.facebook.login.LoginClient$Result$b, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0017\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Lcom/facebook/login/LoginClient$Result$b;", "", "<init>", "()V", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "Lcom/facebook/AccessToken;", "token", "Lcom/facebook/login/LoginClient$Result;", "e", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/AccessToken;)Lcom/facebook/login/LoginClient$Result;", "accessToken", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "b", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;)Lcom/facebook/login/LoginClient$Result;", "", "message", "a", "(Lcom/facebook/login/LoginClient$Request;Ljava/lang/String;)Lcom/facebook/login/LoginClient$Result;", "errorType", "errorDescription", "errorCode", "c", "(Lcom/facebook/login/LoginClient$Request;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: d */
            public static /* synthetic */ Result m9132d(Companion companion, Request request, String str, String str2, String str3, int i, Object obj) {
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return companion.m9135c(request, str, str2, str3);
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: a */
            public final Result m9133a(@Nullable Request request, @Nullable String message) {
                return new Result(request, Code.CANCEL, null, message, null);
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: b */
            public final Result m9134b(@Nullable Request request, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
                return new Result(request, Code.SUCCESS, accessToken, authenticationToken, null, null);
            }

            @JvmStatic
            @JvmOverloads
            @NotNull
            /* JADX INFO: renamed from: c */
            public final Result m9135c(@Nullable Request request, @Nullable String errorType, @Nullable String errorDescription, @Nullable String errorCode) {
                ArrayList arrayList = new ArrayList();
                if (errorType != null) {
                    arrayList.add(errorType);
                }
                if (errorDescription != null) {
                    arrayList.add(errorDescription);
                }
                return new Result(request, Code.ERROR, null, TextUtils.join(": ", arrayList), errorCode);
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: e */
            public final Result m9136e(@Nullable Request request, @NotNull AccessToken token) {
                token.getClass();
                return new Result(request, Code.SUCCESS, token, null, null);
            }

            public Companion() {
            }
        }

        public Result(Parcel parcel) {
            String string = parcel.readString();
            this.code = Code.valueOf(string == null ? "error" : string);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = C1680e.m8913r0(parcel);
            this.extraData = C1680e.m8913r0(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.code.name());
            dest.writeParcelable(this.token, flags);
            dest.writeParcelable(this.authenticationToken, flags);
            dest.writeString(this.errorMessage);
            dest.writeString(this.errorCode);
            dest.writeParcelable(this.request, flags);
            C1680e c1680e = C1680e.INSTANCE;
            C1680e.m8868F0(dest, this.loggingExtras);
            C1680e.m8868F0(dest, this.extraData);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(@Nullable Request request, @NotNull Code code, @Nullable AccessToken accessToken, @Nullable String str, @Nullable String str2) {
            this(request, code, accessToken, null, str, str2);
            code.getClass();
        }

        public Result(@Nullable Request request, @NotNull Code code, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @Nullable String str, @Nullable String str2) {
            code.getClass();
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        public /* synthetic */ Result(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }
    }

    public LoginClient(@NotNull Fragment fragment) {
        fragment.getClass();
        this.currentHandler = -1;
        m9099y(fragment);
    }

    @Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b:\u0018\u0000 Y2\u00020\u0001:\u00015B}\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00102\u001a\u0004\b5\u00104\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001eR$\u0010<\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00102\u001a\u0004\b=\u00104\"\u0004\b>\u00107R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00102\u001a\u0004\b?\u00104\"\u0004\b@\u00107R$\u0010A\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00102\u001a\u0004\bB\u00104\"\u0004\bC\u00107R$\u0010D\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u00104\"\u0004\bF\u00107R\"\u0010G\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00109\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010\u001eR\u0017\u0010J\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010N\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00109\u001a\u0004\bO\u0010\u001a\"\u0004\bP\u0010\u001eR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00109R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\bQ\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\bR\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\bS\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\bU\u0010VR\u0011\u0010X\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bW\u0010\u001a¨\u0006Z"}, m88121d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "Lcom/facebook/login/LoginBehavior;", "loginBehavior", "", "", Permissions.TYPE, "Lcom/facebook/login/DefaultAudience;", "defaultAudience", "authType", "applicationId", "authId", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "nonce", "codeVerifier", "codeChallenge", "Lcom/facebook/login/CodeChallengeMethod;", "codeChallengeMethod", "<init>", "(Lcom/facebook/login/LoginBehavior;Ljava/util/Set;Lcom/facebook/login/DefaultAudience;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/LoginTargetApp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/CodeChallengeMethod;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", c4s.C_ZONE, "()Z", "shouldSkipAccountDeduplication", "", "B", "(Z)V", "q", "", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/facebook/login/LoginBehavior;", "k", "()Lcom/facebook/login/LoginBehavior;", "Ljava/util/Set;", "o", "()Ljava/util/Set;", BaseSei.f14625Y, "(Ljava/util/Set;)V", "Lcom/facebook/login/DefaultAudience;", "g", "()Lcom/facebook/login/DefaultAudience;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "u", "(Ljava/lang/String;)V", "isRerequest", "Z", Constants.KEY_T, BaseSei.f14626Z, "deviceRedirectUriString", RXScreenCaptureService.KEY_INDEX, "setDeviceRedirectUriString", "c", "setAuthType", "deviceAuthTargetUserId", "h", "setDeviceAuthTargetUserId", "messengerPageId", "m", BaseSei.f14624X, "resetMessengerState", "p", "A", "loginTargetApp", "Lcom/facebook/login/LoginTargetApp;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/facebook/login/LoginTargetApp;", "isFamilyLogin", "r", "w", "n", "f", Constants.INAPP_DATA_TAG, "Lcom/facebook/login/CodeChallengeMethod;", "e", "()Lcom/facebook/login/CodeChallengeMethod;", BLiveStormDanmakuGiftResourceType.f45294s, "isInstagramLogin", "Companion", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Request implements Parcelable {

        @NotNull
        private final String applicationId;

        @NotNull
        private String authId;

        @NotNull
        private String authType;

        @Nullable
        private final String codeChallenge;

        @Nullable
        private final CodeChallengeMethod codeChallengeMethod;

        @Nullable
        private final String codeVerifier;

        @NotNull
        private final DefaultAudience defaultAudience;

        @Nullable
        private String deviceAuthTargetUserId;

        @Nullable
        private String deviceRedirectUriString;
        private boolean isFamilyLogin;
        private boolean isRerequest;

        @NotNull
        private final LoginBehavior loginBehavior;

        @NotNull
        private final LoginTargetApp loginTargetApp;

        @Nullable
        private String messengerPageId;

        @NotNull
        private final String nonce;

        @NotNull
        private Set<String> permissions;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new C1703a();

        /* JADX INFO: renamed from: com.facebook.login.LoginClient$Request$a */
        @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/login/LoginClient$Request$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/LoginClient$Request;", "", "size", "", "b", "(I)[Lcom/facebook/login/LoginClient$Request;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
        public static final class C1703a implements Parcelable.Creator<Request> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(@NotNull Parcel source) {
                source.getClass();
                return new Request(source, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int size) {
                return new Request[size];
            }
        }

        public Request(Parcel parcel) {
            g0l0 g0l0Var = g0l0.INSTANCE;
            this.loginBehavior = LoginBehavior.valueOf(g0l0.m128440k(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String string = parcel.readString();
            this.defaultAudience = string != null ? DefaultAudience.valueOf(string) : DefaultAudience.NONE;
            this.applicationId = g0l0.m128440k(parcel.readString(), "applicationId");
            this.authId = g0l0.m128440k(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = g0l0.m128440k(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String string2 = parcel.readString();
            this.loginTargetApp = string2 != null ? LoginTargetApp.valueOf(string2) : LoginTargetApp.FACEBOOK;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            this.nonce = g0l0.m128440k(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String string3 = parcel.readString();
            this.codeChallengeMethod = string3 == null ? null : CodeChallengeMethod.valueOf(string3);
        }

        /* JADX INFO: renamed from: A */
        public final void m9101A(boolean z) {
            this.resetMessengerState = z;
        }

        /* JADX INFO: renamed from: B */
        public final void m9102B(boolean shouldSkipAccountDeduplication) {
            this.shouldSkipAccountDeduplication = shouldSkipAccountDeduplication;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAuthId() {
            return this.authId;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAuthType() {
            return this.authType;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final CodeChallengeMethod getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final Set<String> m9117o() {
            return this.permissions;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m9119q() {
            Iterator<String> it = this.permissions.iterator();
            while (it.hasNext()) {
                if (z0w.INSTANCE.m218221e(it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getIsFamilyLogin() {
            return this.isFamilyLogin;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m9121s() {
            return this.loginTargetApp == LoginTargetApp.INSTAGRAM;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsRerequest() {
            return this.isRerequest;
        }

        /* JADX INFO: renamed from: u */
        public final void m9123u(@NotNull String str) {
            str.getClass();
            this.authId = str;
        }

        /* JADX INFO: renamed from: w */
        public final void m9124w(boolean z) {
            this.isFamilyLogin = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.loginBehavior.name());
            dest.writeStringList(new ArrayList(this.permissions));
            dest.writeString(this.defaultAudience.name());
            dest.writeString(this.applicationId);
            dest.writeString(this.authId);
            dest.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            dest.writeString(this.deviceRedirectUriString);
            dest.writeString(this.authType);
            dest.writeString(this.deviceAuthTargetUserId);
            dest.writeString(this.messengerPageId);
            dest.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            dest.writeString(this.loginTargetApp.name());
            dest.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            dest.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            dest.writeString(this.nonce);
            dest.writeString(this.codeVerifier);
            dest.writeString(this.codeChallenge);
            CodeChallengeMethod codeChallengeMethod = this.codeChallengeMethod;
            dest.writeString(codeChallengeMethod == null ? null : codeChallengeMethod.name());
        }

        /* JADX INFO: renamed from: x */
        public final void m9125x(@Nullable String str) {
            this.messengerPageId = str;
        }

        /* JADX INFO: renamed from: y */
        public final void m9126y(@NotNull Set<String> set) {
            set.getClass();
            this.permissions = set;
        }

        /* JADX INFO: renamed from: z */
        public final void m9127z(boolean z) {
            this.isRerequest = z;
        }

        @JvmOverloads
        public Request(@NotNull LoginBehavior loginBehavior, @Nullable Set<String> set, @NotNull DefaultAudience defaultAudience, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable LoginTargetApp loginTargetApp, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable CodeChallengeMethod codeChallengeMethod) {
            loginBehavior.getClass();
            defaultAudience.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.loginBehavior = loginBehavior;
            this.permissions = set == null ? new HashSet<>() : set;
            this.defaultAudience = defaultAudience;
            this.authType = str;
            this.applicationId = str2;
            this.authId = str3;
            this.loginTargetApp = loginTargetApp == null ? LoginTargetApp.FACEBOOK : loginTargetApp;
            if (str4 != null && str4.length() != 0) {
                this.nonce = str4;
            } else {
                String string = UUID.randomUUID().toString();
                string.getClass();
                this.nonce = string;
            }
            this.codeVerifier = str5;
            this.codeChallenge = str6;
            this.codeChallengeMethod = codeChallengeMethod;
        }

        public /* synthetic */ Request(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }
    }
}
