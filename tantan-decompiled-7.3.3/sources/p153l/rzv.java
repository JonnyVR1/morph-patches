package p153l;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.LoggingBehavior;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0010\"\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001a\u0010!\u001a\u00060\u001ej\u0002`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R*\u0010(\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, m88121d2 = {"Ll/rzv;", "", "Lcom/facebook/LoggingBehavior;", CreditScoreTaskType.behavior, "", "tag", "<init>", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V", "", "e", "()V", "string", "g", "(Ljava/lang/String;)V", "b", "format", "", "args", "c", "(Ljava/lang/String;[Ljava/lang/Object;)V", Constants.KEY_KEY, "value", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/Object;)V", "", "h", "()Z", "a", "Lcom/facebook/LoggingBehavior;", "Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "contents", "", "I", "getPriority", "()I", "setPriority", "(I)V", "priority", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class rzv {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final HashMap<String, String> f165627e = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LoggingBehavior behavior;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public StringBuilder contents;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int priority;

    public rzv(@NotNull LoggingBehavior loggingBehavior, @NotNull String str) {
        loggingBehavior.getClass();
        str.getClass();
        this.priority = 3;
        this.behavior = loggingBehavior;
        this.tag = "FacebookSDK." + g0l0.m128440k(str, "tag");
        this.contents = new StringBuilder();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m183840f(@NotNull LoggingBehavior loggingBehavior, int i, @NotNull String str, @NotNull String str2) {
        INSTANCE.m183847a(loggingBehavior, i, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final void m183841b(@NotNull String string) {
        string.getClass();
        if (m183846h()) {
            this.contents.append(string);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m183842c(@NotNull String format, @NotNull Object... args) {
        format.getClass();
        args.getClass();
        if (m183846h()) {
            StringBuilder sb = this.contents;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            sb.append(String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m183843d(@NotNull String key, @NotNull Object value) {
        key.getClass();
        value.getClass();
        m183842c("  %s:\t%s\n", key, value);
    }

    /* JADX INFO: renamed from: e */
    public final void m183844e() {
        m183845g(this.contents.toString());
        this.contents = new StringBuilder();
    }

    /* JADX INFO: renamed from: g */
    public final void m183845g(@NotNull String string) {
        string.getClass();
        INSTANCE.m183847a(this.behavior, this.priority, this.tag, string);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m183846h() {
        return C1600c.m8083H(this.behavior);
    }

    /* JADX INFO: renamed from: l.rzv$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0014\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR0\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m88121d2 = {"Ll/rzv$a;", "", "<init>", "()V", "", "original", "replace", "", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "accessToken", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "Lcom/facebook/LoggingBehavior;", CreditScoreTaskType.behavior, "tag", "string", "b", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V", "format", "", "args", "c", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "", "priority", "a", "(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V", "f", "(Ljava/lang/String;)Ljava/lang/String;", "LOG_TAG_BASE", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "stringsToReplace", "Ljava/util/HashMap;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m183847a(@NotNull LoggingBehavior behavior, int priority, @NotNull String tag, @NotNull String string) {
            behavior.getClass();
            tag.getClass();
            string.getClass();
            if (C1600c.m8083H(behavior)) {
                String strM183852f = m183852f(string);
                if (!C15493d.m94374J(tag, "FacebookSDK.", false, 2, null)) {
                    tag = "FacebookSDK." + tag;
                }
                Log.println(priority, tag, strM183852f);
                if (behavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m183848b(@NotNull LoggingBehavior behavior, @NotNull String tag, @NotNull String string) {
            behavior.getClass();
            tag.getClass();
            string.getClass();
            m183847a(behavior, 3, tag, string);
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m183849c(@NotNull LoggingBehavior behavior, @NotNull String tag, @NotNull String format, @NotNull Object... args) {
            behavior.getClass();
            tag.getClass();
            format.getClass();
            args.getClass();
            if (C1600c.m8083H(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                m183847a(behavior, 3, tag, String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final synchronized void m183850d(@NotNull String accessToken) {
            accessToken.getClass();
            if (!C1600c.m8083H(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                m183851e(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final synchronized void m183851e(@NotNull String original, @NotNull String replace) {
            original.getClass();
            replace.getClass();
            rzv.f165627e.put(original, replace);
        }

        /* JADX INFO: renamed from: f */
        public final synchronized String m183852f(String string) {
            String strM94370F;
            strM94370F = string;
            for (Map.Entry entry : rzv.f165627e.entrySet()) {
                strM94370F = C15493d.m94370F(strM94370F, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return strM94370F;
        }

        public Companion() {
        }
    }
}
