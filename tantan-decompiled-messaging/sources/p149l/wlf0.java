package p149l;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C1577c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Ll/wlf0;", "", "", "callingApplicationPackage", "", "isOpenedByAppLink", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "a", "()V", "Ljava/lang/String;", "getCallingApplicationPackage", "b", "Z", "()Z", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class wlf0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String callingApplicationPackage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isOpenedByAppLink;

    public wlf0(String str, boolean z) {
        this.callingApplicationPackage = str;
        this.isOpenedByAppLink = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m203808a() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C1577c.m8047l()).edit();
        editorEdit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.callingApplicationPackage);
        editorEdit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.isOpenedByAppLink);
        editorEdit.apply();
    }

    @NotNull
    public String toString() {
        String str = this.isOpenedByAppLink ? "Applink" : "Unclassified";
        if (this.callingApplicationPackage == null) {
            return str;
        }
        return str + '(' + this.callingApplicationPackage + ')';
    }

    /* JADX INFO: renamed from: l.wlf0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m87232d2 = {"Ll/wlf0$a;", "", "<init>", "()V", "Ll/wlf0;", "b", "()Ll/wlf0;", "", "a", "", "CALL_APPLICATION_PACKAGE_KEY", "Ljava/lang/String;", "OPENED_BY_APP_LINK_KEY", "SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m203809a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C1577c.m8047l()).edit();
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            editorEdit.apply();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final wlf0 m203810b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1577c.m8047l());
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new wlf0(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), defaultConstructorMarker);
            }
            return null;
        }

        public Companion() {
        }
    }

    public /* synthetic */ wlf0(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }
}
