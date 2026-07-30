package p149l;

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
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \t2\u00020\u0001:\u0001\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m87232d2 = {"Ll/m4j0;", "", "<init>", "()V", "Ll/gkj;", SocialConstants.TYPE_REQUEST, "Ll/hkj;", "a", "(Ll/gkj;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class m4j0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract Object mo3217a(@NotNull gkj gkjVar, @NotNull Continuation<? super hkj> continuation);

    /* JADX INFO: renamed from: l.m4j0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/m4j0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/m4j0;", "a", "(Landroid/content/Context;)Ll/m4j0;", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        /* JADX INFO: renamed from: a */
        public final m4j0 m153037a(@NotNull Context context) {
            context.getClass();
            z70 z70Var = z70.INSTANCE;
            if (z70Var.m217427a() >= 5) {
                return new p4j0(context);
            }
            if (z70Var.m217427a() == 4) {
                return new o4j0(context);
            }
            return null;
        }

        public Companion() {
        }
    }
}
