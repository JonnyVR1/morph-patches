package androidx.core.os;

import android.p005os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import p149l.dz50;

/* JADX INFO: renamed from: androidx.core.os.a */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
@Metadata(m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"R", "", "E", "Lkotlin/coroutines/Continuation;", "Landroid/os/OutcomeReceiver;", "a", "(Lkotlin/coroutines/Continuation;)Landroid/os/OutcomeReceiver;", "core-ktx_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C0254a {
    @RequiresApi(31)
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <R, E extends Throwable> OutcomeReceiver m1327a(@NotNull Continuation<? super R> continuation) {
        return dz50.m114111a(new ContinuationOutcomeReceiver(continuation));
    }
}
