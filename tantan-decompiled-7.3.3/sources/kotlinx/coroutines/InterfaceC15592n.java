package kotlinx.coroutines;

import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.u9c;

/* JADX INFO: renamed from: kotlinx.coroutines.n */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lkotlinx/coroutines/n;", "", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface InterfaceC15592n {

    /* JADX INFO: renamed from: kotlinx.coroutines.n$a */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B,\u0012#\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR1\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Lkotlinx/coroutines/n$a;", "Lkotlinx/coroutines/n;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class a implements InterfaceC15592n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Function1<Throwable, Unit> handler;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super Throwable, Unit> function1) {
            this.handler = function1;
        }

        @Override // kotlinx.coroutines.InterfaceC15592n
        /* JADX INFO: renamed from: a */
        public void mo94601a(@Nullable Throwable cause) {
            this.handler.invoke(cause);
        }

        @NotNull
        public String toString() {
            return "InternalCompletionHandler.UserSupplied[" + u9c.m195086a(this.handler) + '@' + u9c.m195087b(this) + ']';
        }
    }

    /* JADX INFO: renamed from: a */
    void mo94601a(@Nullable Throwable cause);
}
