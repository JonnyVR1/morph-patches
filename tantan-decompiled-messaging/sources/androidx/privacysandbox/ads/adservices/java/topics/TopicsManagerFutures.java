package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d4e;
import p149l.gkj;
import p149l.gnr;
import p149l.hkj;
import p149l.jh3;
import p149l.m4j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, m87232d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "", "<init>", "()V", "Ll/gkj;", SocialConstants.TYPE_REQUEST, "Ll/gnr;", "Ll/hkj;", "b", "(Ll/gkj;)Ll/gnr;", "Companion", "Api33Ext4JavaImpl", "a", "ads-adservices-java_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class TopicsManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "Ll/m4j0;", "mTopicsManager", "<init>", "(Ll/m4j0;)V", "Ll/gkj;", SocialConstants.TYPE_REQUEST, "Ll/gnr;", "Ll/hkj;", "b", "(Ll/gkj;)Ll/gnr;", "a", "Ll/m4j0;", "ads-adservices-java_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Api33Ext4JavaImpl extends TopicsManagerFutures {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final m4j0 mTopicsManager;

        public Api33Ext4JavaImpl(@NotNull m4j0 m4j0Var) {
            m4j0Var.getClass();
            this.mTopicsManager = m4j0Var;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
        @DoNotInline
        @NotNull
        /* JADX INFO: renamed from: b */
        public gnr<hkj> mo3212b(@NotNull gkj request) {
            request.getClass();
            return CoroutineAdapterKt.m3204c(jh3.m141365b(C15424f.m94055a(d4e.m109982c()), null, null, new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this, request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "ads-adservices-java_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final TopicsManagerFutures m3214a(@NotNull Context context) {
            context.getClass();
            m4j0 m4j0VarM153037a = m4j0.INSTANCE.m153037a(context);
            if (m4j0VarM153037a != null) {
                return new Api33Ext4JavaImpl(m4j0VarM153037a);
            }
            return null;
        }

        public Companion() {
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final TopicsManagerFutures m3211a(@NotNull Context context) {
        return INSTANCE.m3214a(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract gnr<hkj> mo3212b(@NotNull gkj request);
}
