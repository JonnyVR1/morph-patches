package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.AbstractFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B6\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eR;\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/fod0;", j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/AbstractFlow;", "Lkotlin/Function2;", "Ll/fri;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "collector", Constants.INAPP_DATA_TAG, "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class fod0<T> extends AbstractFlow<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function2<fri<? super T>, Continuation<? super Unit>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public fod0(@NotNull Function2<? super fri<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.block = function2;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo94062d(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation) {
        Object objInvoke = this.block.invoke(friVar, continuation);
        return objInvoke == uwp.m196133e() ? objInvoke : Unit.INSTANCE;
    }
}
