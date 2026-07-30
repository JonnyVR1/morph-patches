package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessTokenSource;
import com.facebook.C1577c;
import com.facebook.FacebookException;
import com.facebook.internal.C1657e;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.open.SocialConstants;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.c580;
import p149l.dkj;
import p149l.qkq0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m87232d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "b", "()V", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "", "p", "(Lcom/facebook/login/LoginClient$Request;)I", "Landroid/os/Bundle;", LovePlanetStage.result, BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;)V", Constants.KEY_T, "r", "describeContents", "()I", "Ll/dkj;", "getTokenClient", "Ll/dkj;", "", "nameForLogging", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Companion", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    @Nullable
    private dkj getTokenClient;

    @NotNull
    private final String nameForLogging;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C1673a();

    /* JADX INFO: renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/facebook/login/GetTokenLoginMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/GetTokenLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/GetTokenLoginMethodHandler;", "", "size", "", "b", "(I)[Lcom/facebook/login/GetTokenLoginMethodHandler;", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class C1673a implements Parcelable.Creator<GetTokenLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new GetTokenLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int size) {
            return new GetTokenLoginMethodHandler[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.GetTokenLoginMethodHandler$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"com/facebook/login/GetTokenLoginMethodHandler$c", "Lcom/facebook/internal/e$a;", "Lorg/json/JSONObject;", "userInfo", "", "a", "(Lorg/json/JSONObject;)V", "Lcom/facebook/FacebookException;", "error", "b", "(Lcom/facebook/FacebookException;)V", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class C1675c implements C1657e.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Bundle f6746a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GetTokenLoginMethodHandler f6747b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LoginClient.Request f6748c;

        public C1675c(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.f6746a = bundle;
            this.f6747b = getTokenLoginMethodHandler;
            this.f6748c = request;
        }

        @Override // com.facebook.internal.C1657e.a
        /* JADX INFO: renamed from: a */
        public void mo7624a(@Nullable JSONObject userInfo) {
            try {
                this.f6746a.putString("com.facebook.platform.extra.USER_ID", userInfo == null ? null : userInfo.getString("id"));
                this.f6747b.m9010t(this.f6748c, this.f6746a);
            } catch (JSONException e) {
                this.f6747b.m9109d().m9028f(LoginClient.Result.Companion.m9078d(LoginClient.Result.INSTANCE, this.f6747b.m9109d().getPendingRequest(), "Caught exception", e.getMessage(), null, 8, null));
            }
        }

        @Override // com.facebook.internal.C1657e.a
        /* JADX INFO: renamed from: b */
        public void mo7625b(@Nullable FacebookException error) {
            this.f6747b.m9109d().m9028f(LoginClient.Result.Companion.m9078d(LoginClient.Result.INSTANCE, this.f6747b.m9109d().getPendingRequest(), "Caught exception", error == null ? null : error.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "get_token";
    }

    /* JADX INFO: renamed from: u */
    public static final void m9006u(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        getTokenLoginMethodHandler.getClass();
        request.getClass();
        getTokenLoginMethodHandler.m9009s(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: b */
    public void mo9007b() {
        dkj dkjVar = this.getTokenClient;
        if (dkjVar == null) {
            return;
        }
        dkjVar.m105281b();
        dkjVar.m105286g(null);
        this.getTokenClient = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: p */
    public int mo8944p(@NotNull final LoginClient.Request request) {
        request.getClass();
        Context contextM9031i = m9109d().m9031i();
        if (contextM9031i == null) {
            contextM9031i = C1577c.m8047l();
        }
        dkj dkjVar = new dkj(contextM9031i, request);
        this.getTokenClient = dkjVar;
        if (Intrinsics.m87488d(Boolean.valueOf(dkjVar.m105287h()), Boolean.FALSE)) {
            return 0;
        }
        m9109d().m9040s();
        c580.InterfaceC16072b interfaceC16072b = new c580.InterfaceC16072b() { // from class: l.ekj
            @Override // p149l.c580.InterfaceC16072b
            /* JADX INFO: renamed from: a */
            public final void mo105288a(Bundle bundle) {
                GetTokenLoginMethodHandler.m9006u(this.f91986a, request, bundle);
            }
        };
        dkj dkjVar2 = this.getTokenClient;
        if (dkjVar2 == null) {
            return 1;
        }
        dkjVar2.m105286g(interfaceC16072b);
        return 1;
    }

    /* JADX INFO: renamed from: r */
    public final void m9008r(@NotNull LoginClient.Request request, @NotNull Bundle result) {
        request.getClass();
        result.getClass();
        String string = result.getString("com.facebook.platform.extra.USER_ID");
        if (string != null && string.length() != 0) {
            m9010t(request, result);
            return;
        }
        m9109d().m9040s();
        String string2 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            qkq0.m175383a("Required value was null.");
        } else {
            C1657e c1657e = C1657e.INSTANCE;
            C1657e.m8816H(string2, new C1675c(result, this, request));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m9009s(@NotNull LoginClient.Request request, @Nullable Bundle result) {
        request.getClass();
        dkj dkjVar = this.getTokenClient;
        if (dkjVar != null) {
            dkjVar.m105286g(null);
        }
        this.getTokenClient = null;
        m9109d().m9041t();
        if (result != null) {
            List stringArrayList = result.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = CollectionsKt.emptyList();
            }
            Set<String> setM9063o = request.m9063o();
            if (setM9063o == null) {
                setM9063o = SetsKt.emptySet();
            }
            String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
            if (setM9063o.contains("openid") && (string == null || string.length() == 0)) {
                m9109d().m9021C();
                return;
            }
            if (stringArrayList.containsAll(setM9063o)) {
                m9008r(request, result);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : setM9063o) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                m9107a("new_permissions", TextUtils.join(Constants.SEPARATOR_COMMA, hashSet));
            }
            request.m9072y(hashSet);
        }
        m9109d().m9021C();
    }

    /* JADX INFO: renamed from: t */
    public final void m9010t(@NotNull LoginClient.Request request, @NotNull Bundle result) {
        LoginClient.Result resultM9078d;
        request.getClass();
        result.getClass();
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            resultM9078d = LoginClient.Result.INSTANCE.m9080b(request, companion.m9115a(result, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId()), companion.m9117c(result, request.getNonce()));
        } catch (FacebookException e) {
            resultM9078d = LoginClient.Result.Companion.m9078d(LoginClient.Result.INSTANCE, m9109d().getPendingRequest(), null, e.getMessage(), null, 8, null);
        }
        m9109d().m9029g(resultM9078d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "get_token";
    }
}
