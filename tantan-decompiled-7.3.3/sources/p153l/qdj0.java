package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresPermission;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \t2\u00020\u0001:\u0001\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m88121d2 = {"Ll/qdj0;", "", "<init>", "()V", "Ll/wmj;", SocialConstants.TYPE_REQUEST, "Ll/xmj;", "a", "(Ll/wmj;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class qdj0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract Object mo3218a(@NotNull wmj wmjVar, @NotNull Continuation<? super xmj> continuation);

    /* JADX INFO: renamed from: l.qdj0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/qdj0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/qdj0;", "a", "(Landroid/content/Context;)Ll/qdj0;", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        /* JADX INFO: renamed from: a */
        public final qdj0 m176168a(@NotNull Context context) {
            context.getClass();
            v70 v70Var = v70.INSTANCE;
            if (v70Var.m200163a() >= 5) {
                return new tdj0(context);
            }
            if (v70Var.m200163a() == 4) {
                return new sdj0(context);
            }
            return null;
        }

        public Companion() {
        }
    }
}
