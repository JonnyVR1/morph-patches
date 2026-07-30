package p153l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.data.ResourceDirection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\tB'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\r\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/ja00;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "keyRules", "valRule", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "()Ljava/util/List;", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ja00 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Set<ja00> f118929d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String valRule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<String> keyRules;

    public ja00(String str, List<String> list, String str2) {
        this.name = str;
        this.valRule = str2;
        this.keyRules = list;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Set m143953a() {
        if (ztb.m221490d(ja00.class)) {
            return null;
        }
        try {
            return f118929d;
        } catch (Throwable th) {
            ztb.m221488b(th, ja00.class);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<String> m143954b() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.keyRules);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m143955c() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return this.name;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m143956d() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return this.valRule;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.ja00$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/ja00$a;", "", "<init>", "()V", "", "Ll/ja00;", "c", "()Ljava/util/Set;", "", "rulesFromServer", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "b", "Lorg/json/JSONObject;", "jsonObject", "a", "(Lorg/json/JSONObject;)V", "FIELD_K", "Ljava/lang/String;", "FIELD_K_DELIMITER", "FIELD_V", "", "rules", "Ljava/util/Set;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m143957a(JSONObject jsonObject) {
            Iterator<String> itKeys = jsonObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("k");
                    String strOptString2 = jSONObjectOptJSONObject.optString(ResourceDirection.f39656v);
                    strOptString.getClass();
                    if (strOptString.length() != 0) {
                        Set setM143953a = ja00.m143953a();
                        next.getClass();
                        List listSplit$default = StringsKt.split$default(strOptString, new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null);
                        strOptString2.getClass();
                        setM143953a.add(new ja00(next, listSplit$default, strOptString2, null));
                    }
                }
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final Set<String> m143958b() {
            HashSet hashSet = new HashSet();
            Iterator it = ja00.m143953a().iterator();
            while (it.hasNext()) {
                hashSet.add(((ja00) it.next()).m143955c());
            }
            return hashSet;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final Set<ja00> m143959c() {
            return new HashSet(ja00.m143953a());
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m143960d(@NotNull String rulesFromServer) {
            rulesFromServer.getClass();
            try {
                ja00.m143953a().clear();
                m143957a(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ ja00(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }
}
