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
import kotlinx.coroutines.C15531f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hpr;
import p153l.qdj0;
import p153l.r5e;
import p153l.wmj;
import p153l.xh3;
import p153l.xmj;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, m88121d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "", "<init>", "()V", "Ll/wmj;", SocialConstants.TYPE_REQUEST, "Ll/hpr;", "Ll/xmj;", "b", "(Ll/wmj;)Ll/hpr;", "Companion", "Api33Ext4JavaImpl", "a", "ads-adservices-java_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class TopicsManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "Ll/qdj0;", "mTopicsManager", "<init>", "(Ll/qdj0;)V", "Ll/wmj;", SocialConstants.TYPE_REQUEST, "Ll/hpr;", "Ll/xmj;", "b", "(Ll/wmj;)Ll/hpr;", "a", "Ll/qdj0;", "ads-adservices-java_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Api33Ext4JavaImpl extends TopicsManagerFutures {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final qdj0 mTopicsManager;

        public Api33Ext4JavaImpl(@NotNull qdj0 qdj0Var) {
            qdj0Var.getClass();
            this.mTopicsManager = qdj0Var;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
        @DoNotInline
        @NotNull
        /* JADX INFO: renamed from: b */
        public hpr<xmj> mo3213b(@NotNull wmj request) {
            request.getClass();
            return CoroutineAdapterKt.m3205c(xh3.m210978b(C15531f.m94947a(r5e.m179862c()), null, null, new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this, request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "ads-adservices-java_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final TopicsManagerFutures m3215a(@NotNull Context context) {
            context.getClass();
            qdj0 qdj0VarM176168a = qdj0.INSTANCE.m176168a(context);
            if (qdj0VarM176168a != null) {
                return new Api33Ext4JavaImpl(qdj0VarM176168a);
            }
            return null;
        }

        public Companion() {
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final TopicsManagerFutures m3212a(@NotNull Context context) {
        return INSTANCE.m3215a(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract hpr<xmj> mo3213b(@NotNull wmj request);
}
