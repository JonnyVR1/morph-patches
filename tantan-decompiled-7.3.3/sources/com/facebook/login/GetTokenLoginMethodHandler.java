package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessTokenSource;
import com.facebook.C1600c;
import com.facebook.FacebookException;
import com.facebook.internal.C1680e;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
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
import p153l.id80;
import p153l.tmj;
import p153l.wtq0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m88121d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "b", "()V", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "", "p", "(Lcom/facebook/login/LoginClient$Request;)I", "Landroid/os/Bundle;", LovePlanetStage.result, BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;)V", Constants.KEY_T, "r", "describeContents", "()I", "Ll/tmj;", "getTokenClient", "Ll/tmj;", "", "nameForLogging", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Companion", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    @Nullable
    private tmj getTokenClient;

    @NotNull
    private final String nameForLogging;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C1696a();

    /* JADX INFO: renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/login/GetTokenLoginMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/GetTokenLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/GetTokenLoginMethodHandler;", "", "size", "", "b", "(I)[Lcom/facebook/login/GetTokenLoginMethodHandler;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C1696a implements Parcelable.Creator<GetTokenLoginMethodHandler> {
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
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/facebook/login/GetTokenLoginMethodHandler$c", "Lcom/facebook/internal/e$a;", "Lorg/json/JSONObject;", "userInfo", "", "a", "(Lorg/json/JSONObject;)V", "Lcom/facebook/FacebookException;", "error", "b", "(Lcom/facebook/FacebookException;)V", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C1698c implements C1680e.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Bundle f6783a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GetTokenLoginMethodHandler f6784b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LoginClient.Request f6785c;

        public C1698c(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.f6783a = bundle;
            this.f6784b = getTokenLoginMethodHandler;
            this.f6785c = request;
        }

        @Override // com.facebook.internal.C1680e.a
        /* JADX INFO: renamed from: a */
        public void mo7678a(@Nullable JSONObject userInfo) {
            try {
                this.f6783a.putString("com.facebook.platform.extra.USER_ID", userInfo == null ? null : userInfo.getString("id"));
                this.f6784b.m9064t(this.f6785c, this.f6783a);
            } catch (JSONException e) {
                this.f6784b.m9163d().m9082f(LoginClient.Result.Companion.m9132d(LoginClient.Result.INSTANCE, this.f6784b.m9163d().getPendingRequest(), "Caught exception", e.getMessage(), null, 8, null));
            }
        }

        @Override // com.facebook.internal.C1680e.a
        /* JADX INFO: renamed from: b */
        public void mo7679b(@Nullable FacebookException error) {
            this.f6784b.m9163d().m9082f(LoginClient.Result.Companion.m9132d(LoginClient.Result.INSTANCE, this.f6784b.m9163d().getPendingRequest(), "Caught exception", error == null ? null : error.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "get_token";
    }

    /* JADX INFO: renamed from: u */
    public static final void m9060u(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        getTokenLoginMethodHandler.getClass();
        request.getClass();
        getTokenLoginMethodHandler.m9063s(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: b */
    public void mo9061b() {
        tmj tmjVar = this.getTokenClient;
        if (tmjVar == null) {
            return;
        }
        tmjVar.m139512b();
        tmjVar.m139517g(null);
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
    public int mo8998p(@NotNull final LoginClient.Request request) {
        request.getClass();
        Context contextM9085i = m9163d().m9085i();
        if (contextM9085i == null) {
            contextM9085i = C1600c.m8101l();
        }
        tmj tmjVar = new tmj(contextM9085i, request);
        this.getTokenClient = tmjVar;
        if (Intrinsics.m88377d(Boolean.valueOf(tmjVar.m139518h()), Boolean.FALSE)) {
            return 0;
        }
        m9163d().m9094s();
        id80.InterfaceC17706b interfaceC17706b = new id80.InterfaceC17706b() { // from class: l.umj
            @Override // p153l.id80.InterfaceC17706b
            /* JADX INFO: renamed from: a */
            public final void mo139519a(Bundle bundle) {
                GetTokenLoginMethodHandler.m9060u(this.f179649a, request, bundle);
            }
        };
        tmj tmjVar2 = this.getTokenClient;
        if (tmjVar2 == null) {
            return 1;
        }
        tmjVar2.m139517g(interfaceC17706b);
        return 1;
    }

    /* JADX INFO: renamed from: r */
    public final void m9062r(@NotNull LoginClient.Request request, @NotNull Bundle result) {
        request.getClass();
        result.getClass();
        String string = result.getString("com.facebook.platform.extra.USER_ID");
        if (string != null && string.length() != 0) {
            m9064t(request, result);
            return;
        }
        m9163d().m9094s();
        String string2 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            wtq0.m207906a("Required value was null.");
        } else {
            C1680e c1680e = C1680e.INSTANCE;
            C1680e.m8870H(string2, new C1698c(result, this, request));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m9063s(@NotNull LoginClient.Request request, @Nullable Bundle result) {
        request.getClass();
        tmj tmjVar = this.getTokenClient;
        if (tmjVar != null) {
            tmjVar.m139517g(null);
        }
        this.getTokenClient = null;
        m9163d().m9095t();
        if (result != null) {
            List stringArrayList = result.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = CollectionsKt.emptyList();
            }
            Set<String> setM9117o = request.m9117o();
            if (setM9117o == null) {
                setM9117o = SetsKt.emptySet();
            }
            String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
            if (setM9117o.contains("openid") && (string == null || string.length() == 0)) {
                m9163d().m9075C();
                return;
            }
            if (stringArrayList.containsAll(setM9117o)) {
                m9062r(request, result);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : setM9117o) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                m9161a("new_permissions", TextUtils.join(Constants.SEPARATOR_COMMA, hashSet));
            }
            request.m9126y(hashSet);
        }
        m9163d().m9075C();
    }

    /* JADX INFO: renamed from: t */
    public final void m9064t(@NotNull LoginClient.Request request, @NotNull Bundle result) {
        LoginClient.Result resultM9132d;
        request.getClass();
        result.getClass();
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            resultM9132d = LoginClient.Result.INSTANCE.m9134b(request, companion.m9169a(result, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId()), companion.m9171c(result, request.getNonce()));
        } catch (FacebookException e) {
            resultM9132d = LoginClient.Result.Companion.m9132d(LoginClient.Result.INSTANCE, m9163d().getPendingRequest(), null, e.getMessage(), null, 8, null);
        }
        m9163d().m9083g(resultM9132d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "get_token";
    }
}
