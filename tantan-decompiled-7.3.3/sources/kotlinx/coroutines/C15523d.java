package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hxi0;

/* JADX INFO: renamed from: kotlinx.coroutines.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017J\u000f\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m88121d2 = {"Lkotlinx/coroutines/d;", "Ll/hxi0;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/CoroutineContext;", "context", "d0", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "oldState", "", "a0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "J", "Z", "()J", "id", "b", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@IgnoreJRERequirement
@PublishedApi
public final /* data */ class C15523d extends AbstractCoroutineContextElement implements hxi0<String> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long id;

    /* JADX INFO: renamed from: kotlinx.coroutines.d$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Lkotlinx/coroutines/d$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/d;", "<init>", "()V", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class Companion implements CoroutineContext.Key<C15523d> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Override // p153l.hxi0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void mo94904e(@NotNull CoroutineContext context, @NotNull String oldState) {
        Thread.currentThread().setName(oldState);
    }

    @Override // p153l.hxi0
    @NotNull
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public String mo94900U(@NotNull CoroutineContext context) {
        String str;
        C15530e c15530e = (C15530e) context.get(C15530e.INSTANCE);
        if (c15530e == null || (str = c15530e.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()) == null) {
            str = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iJ0 = StringsKt.m94334j0(name, " @", 0, false, 6, null);
        if (iJ0 < 0) {
            iJ0 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iJ0 + 10);
        sb.append(name.substring(0, iJ0));
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.id);
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C15523d) && this.id == ((C15523d) other).id;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    @NotNull
    public String toString() {
        return "CoroutineId(" + this.id + ')';
    }
}
