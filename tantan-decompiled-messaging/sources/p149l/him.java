package p149l;

import android.content.Context;
import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.C1657e;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\u0018\u0000 \u001f2\u00020\u0001:\u0003\r\u0011\u0013B3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0011\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a¨\u0006 "}, m87232d2 = {"Ll/him;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "imageUri", "Ll/him$b;", "callback", "", "allowCachedRedirects", "callerTag", "<init>", "(Landroid/content/Context;Landroid/net/Uri;Ll/him$b;ZLjava/lang/Object;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "Ll/him$b;", "()Ll/him$b;", Constants.INAPP_DATA_TAG, "Z", "getAllowCachedRedirects", "()Z", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "isCachedRedirectAllowed", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class him {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Uri imageUri;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC17326b callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean allowCachedRedirects;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Object callerTag;

    /* JADX INFO: renamed from: l.him$a */
    @Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m87232d2 = {"Ll/him$a;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "imageUri", "<init>", "(Landroid/content/Context;Landroid/net/Uri;)V", "Ll/him$b;", "callback", "c", "(Ll/him$b;)Ll/him$a;", "callerTag", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ll/him$a;", "", "allowCachedRedirects", "b", "(Z)Ll/him$a;", "Ll/him;", "a", "()Ll/him;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "Landroid/net/Uri;", "Ll/him$b;", "Z", "e", "Ljava/lang/Object;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final /* data */ class C17325a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Uri imageUri;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public InterfaceC17326b callback;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean allowCachedRedirects;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public Object callerTag;

        public C17325a(@NotNull Context context, @NotNull Uri uri) {
            context.getClass();
            uri.getClass();
            this.context = context;
            this.imageUri = uri;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final him m131287a() {
            Context context = this.context;
            Uri uri = this.imageUri;
            InterfaceC17326b interfaceC17326b = this.callback;
            boolean z = this.allowCachedRedirects;
            Object obj = this.callerTag;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                qkq0.m175383a("Required value was null.");
                return null;
            }
            return new him(context, uri, interfaceC17326b, z, obj, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C17325a m131288b(boolean allowCachedRedirects) {
            this.allowCachedRedirects = allowCachedRedirects;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C17325a m131289c(@Nullable InterfaceC17326b callback) {
            this.callback = callback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C17325a m131290d(@Nullable Object callerTag) {
            this.callerTag = callerTag;
            return this;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C17325a)) {
                return false;
            }
            C17325a c17325a = (C17325a) other;
            return Intrinsics.m87488d(this.context, c17325a.context) && Intrinsics.m87488d(this.imageUri, c17325a.imageUri);
        }

        public int hashCode() {
            return (this.context.hashCode() * 31) + this.imageUri.hashCode();
        }

        @NotNull
        public String toString() {
            return "Builder(context=" + this.context + ", imageUri=" + this.imageUri + ')';
        }
    }

    /* JADX INFO: renamed from: l.him$b */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/him$b;", "", "Ll/jim;", "response", "", "a", "(Ll/jim;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC17326b {
        /* JADX INFO: renamed from: a */
        void mo9205a(@Nullable jim response);
    }

    public him(Context context, Uri uri, InterfaceC17326b interfaceC17326b, boolean z, Object obj) {
        this.context = context;
        this.imageUri = uri;
        this.callback = interfaceC17326b;
        this.allowCachedRedirects = z;
        this.callerTag = obj;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Uri m131282d(@Nullable String str, int i, int i2, @Nullable String str2) {
        return INSTANCE.m131291a(str, i, i2, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC17326b getCallback() {
        return this.callback;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getCallerTag() {
        return this.callerTag;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Uri getImageUri() {
        return this.imageUri;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getAllowCachedRedirects() {
        return this.allowCachedRedirects;
    }

    /* JADX INFO: renamed from: l.him$c, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, m87232d2 = {"Ll/him$c;", "", "<init>", "()V", "", "userId", "", "width", "height", "accessToken", "Landroid/net/Uri;", "a", "(Ljava/lang/String;IILjava/lang/String;)Landroid/net/Uri;", "ACCESS_TOKEN_PARAM", "Ljava/lang/String;", "HEIGHT_PARAM", "MIGRATION_PARAM", "MIGRATION_VALUE", "PATH", "UNSPECIFIED_DIMENSION", "I", "WIDTH_PARAM", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Uri m131291a(@Nullable String userId, int width, int height, @Nullable String accessToken) {
            ark0.m98522k(userId, "userId");
            int iMax = Math.max(width, 0);
            int iMax2 = Math.max(height, 0);
            if (iMax == 0 && iMax2 == 0) {
                ig3.m135964a("Either width or height must be greater than 0");
                return null;
            }
            Uri.Builder builderBuildUpon = Uri.parse(fje0.m121587h()).buildUpon();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Uri.Builder builderPath = builderBuildUpon.path(String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{C1577c.m8059x(), userId}, 2)));
            if (iMax2 != 0) {
                builderPath.appendQueryParameter("height", String.valueOf(iMax2));
            }
            if (iMax != 0) {
                builderPath.appendQueryParameter("width", String.valueOf(iMax));
            }
            builderPath.appendQueryParameter("migration_overrides", "{october_2012:true}");
            if (!C1657e.m8832c0(accessToken)) {
                builderPath.appendQueryParameter("access_token", accessToken);
            } else if (!C1657e.m8832c0(C1577c.m8054s()) && !C1657e.m8832c0(C1577c.m8048m())) {
                builderPath.appendQueryParameter("access_token", C1577c.m8048m() + '|' + C1577c.m8054s());
            }
            Uri uriBuild = builderPath.build();
            uriBuild.getClass();
            return uriBuild;
        }

        public Companion() {
        }
    }

    public /* synthetic */ him(Context context, Uri uri, InterfaceC17326b interfaceC17326b, boolean z, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, interfaceC17326b, z, obj);
    }
}
