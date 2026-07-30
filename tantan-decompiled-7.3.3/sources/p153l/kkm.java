package p153l;

import android.content.Context;
import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.internal.C1680e;
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
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\u0018\u0000 \u001f2\u00020\u0001:\u0003\r\u0011\u0013B3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0011\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a¨\u0006 "}, m88121d2 = {"Ll/kkm;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "imageUri", "Ll/kkm$b;", "callback", "", "allowCachedRedirects", "callerTag", "<init>", "(Landroid/content/Context;Landroid/net/Uri;Ll/kkm$b;ZLjava/lang/Object;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "Ll/kkm$b;", "()Ll/kkm$b;", Constants.INAPP_DATA_TAG, "Z", "getAllowCachedRedirects", "()Z", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "isCachedRedirectAllowed", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class kkm {

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
    public final InterfaceC18196b callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean allowCachedRedirects;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Object callerTag;

    /* JADX INFO: renamed from: l.kkm$a */
    @Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m88121d2 = {"Ll/kkm$a;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "imageUri", "<init>", "(Landroid/content/Context;Landroid/net/Uri;)V", "Ll/kkm$b;", "callback", "c", "(Ll/kkm$b;)Ll/kkm$a;", "callerTag", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ll/kkm$a;", "", "allowCachedRedirects", "b", "(Z)Ll/kkm$a;", "Ll/kkm;", "a", "()Ll/kkm;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "Landroid/net/Uri;", "Ll/kkm$b;", "Z", "e", "Ljava/lang/Object;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final /* data */ class C18195a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Uri imageUri;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public InterfaceC18196b callback;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean allowCachedRedirects;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public Object callerTag;

        public C18195a(@NotNull Context context, @NotNull Uri uri) {
            context.getClass();
            uri.getClass();
            this.context = context;
            this.imageUri = uri;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final kkm m150265a() {
            Context context = this.context;
            Uri uri = this.imageUri;
            InterfaceC18196b interfaceC18196b = this.callback;
            boolean z = this.allowCachedRedirects;
            Object obj = this.callerTag;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                wtq0.m207906a("Required value was null.");
                return null;
            }
            return new kkm(context, uri, interfaceC18196b, z, obj, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C18195a m150266b(boolean allowCachedRedirects) {
            this.allowCachedRedirects = allowCachedRedirects;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C18195a m150267c(@Nullable InterfaceC18196b callback) {
            this.callback = callback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C18195a m150268d(@Nullable Object callerTag) {
            this.callerTag = callerTag;
            return this;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C18195a)) {
                return false;
            }
            C18195a c18195a = (C18195a) other;
            return Intrinsics.m88377d(this.context, c18195a.context) && Intrinsics.m88377d(this.imageUri, c18195a.imageUri);
        }

        public int hashCode() {
            return (this.context.hashCode() * 31) + this.imageUri.hashCode();
        }

        @NotNull
        public String toString() {
            return "Builder(context=" + this.context + ", imageUri=" + this.imageUri + ')';
        }
    }

    /* JADX INFO: renamed from: l.kkm$b */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/kkm$b;", "", "Ll/mkm;", "response", "", "a", "(Ll/mkm;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC18196b {
        /* JADX INFO: renamed from: a */
        void mo9259a(@Nullable mkm response);
    }

    public kkm(Context context, Uri uri, InterfaceC18196b interfaceC18196b, boolean z, Object obj) {
        this.context = context;
        this.imageUri = uri;
        this.callback = interfaceC18196b;
        this.allowCachedRedirects = z;
        this.callerTag = obj;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Uri m150260d(@Nullable String str, int i, int i2, @Nullable String str2) {
        return INSTANCE.m150269a(str, i, i2, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC18196b getCallback() {
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

    /* JADX INFO: renamed from: l.kkm$c, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, m88121d2 = {"Ll/kkm$c;", "", "<init>", "()V", "", "userId", "", "width", "height", "accessToken", "Landroid/net/Uri;", "a", "(Ljava/lang/String;IILjava/lang/String;)Landroid/net/Uri;", "ACCESS_TOKEN_PARAM", "Ljava/lang/String;", "HEIGHT_PARAM", "MIGRATION_PARAM", "MIGRATION_VALUE", "PATH", "UNSPECIFIED_DIMENSION", "I", "WIDTH_PARAM", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Uri m150269a(@Nullable String userId, int width, int height, @Nullable String accessToken) {
            g0l0.m128440k(userId, "userId");
            int iMax = Math.max(width, 0);
            int iMax2 = Math.max(height, 0);
            if (iMax == 0 && iMax2 == 0) {
                wg3.m206174a("Either width or height must be greater than 0");
                return null;
            }
            Uri.Builder builderBuildUpon = Uri.parse(kre0.m151038h()).buildUpon();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Uri.Builder builderPath = builderBuildUpon.path(String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{C1600c.m8113x(), userId}, 2)));
            if (iMax2 != 0) {
                builderPath.appendQueryParameter("height", String.valueOf(iMax2));
            }
            if (iMax != 0) {
                builderPath.appendQueryParameter("width", String.valueOf(iMax));
            }
            builderPath.appendQueryParameter("migration_overrides", "{october_2012:true}");
            if (!C1680e.m8886c0(accessToken)) {
                builderPath.appendQueryParameter("access_token", accessToken);
            } else if (!C1680e.m8886c0(C1600c.m8108s()) && !C1680e.m8886c0(C1600c.m8102m())) {
                builderPath.appendQueryParameter("access_token", C1600c.m8102m() + '|' + C1600c.m8108s());
            }
            Uri uriBuild = builderPath.build();
            uriBuild.getClass();
            return uriBuild;
        }

        public Companion() {
        }
    }

    public /* synthetic */ kkm(Context context, Uri uri, InterfaceC18196b interfaceC18196b, boolean z, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, interfaceC18196b, z, obj);
    }
}
