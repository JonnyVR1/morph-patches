package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.InterfaceC15513b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\\\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\n2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013Jg\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R1\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010'¨\u0006)"}, m88121d2 = {"Ll/so5;", "", LovePlanetStage.result, "Lkotlinx/coroutines/b;", "cancelHandler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "", "onCancellation", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/c;", "cont", Constants.INAPP_DATA_TAG, "(Lkotlinx/coroutines/c;Ljava/lang/Throwable;)V", "a", "(Ljava/lang/Object;Lkotlinx/coroutines/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)Ll/so5;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "b", "Lkotlinx/coroutines/b;", "c", "Lkotlin/jvm/functions/Function1;", "e", "Ljava/lang/Throwable;", "()Z", "cancelled", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final /* data */ class so5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final Object result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final InterfaceC15513b cancelHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final Function1<Throwable, Unit> onCancellation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final Object idempotentResume;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final Throwable cancelCause;

    public /* synthetic */ so5(Object obj, InterfaceC15513b interfaceC15513b, Function1 function1, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : interfaceC15513b, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ so5 m187152b(so5 so5Var, Object obj, InterfaceC15513b interfaceC15513b, Function1 function1, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = so5Var.result;
        }
        if ((i & 2) != 0) {
            interfaceC15513b = so5Var.cancelHandler;
        }
        if ((i & 4) != 0) {
            function1 = so5Var.onCancellation;
        }
        if ((i & 8) != 0) {
            obj2 = so5Var.idempotentResume;
        }
        if ((i & 16) != 0) {
            th = so5Var.cancelCause;
        }
        Throwable th2 = th;
        Function1 function2 = function1;
        return so5Var.m187153a(obj, interfaceC15513b, function2, obj2, th2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final so5 m187153a(@Nullable Object result, @Nullable InterfaceC15513b cancelHandler, @Nullable Function1<? super Throwable, Unit> onCancellation, @Nullable Object idempotentResume, @Nullable Throwable cancelCause) {
        return new so5(result, cancelHandler, onCancellation, idempotentResume, cancelCause);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m187154c() {
        return this.cancelCause != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m187155d(@NotNull C15514c<?> cont, @NotNull Throwable cause) {
        InterfaceC15513b interfaceC15513b = this.cancelHandler;
        if (interfaceC15513b != null) {
            cont.m94661l(interfaceC15513b, cause);
        }
        Function1<Throwable, Unit> function1 = this.onCancellation;
        if (function1 != null) {
            cont.m94663n(function1, cause);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof so5)) {
            return false;
        }
        so5 so5Var = (so5) other;
        return Intrinsics.m88377d(this.result, so5Var.result) && Intrinsics.m88377d(this.cancelHandler, so5Var.cancelHandler) && Intrinsics.m88377d(this.onCancellation, so5Var.onCancellation) && Intrinsics.m88377d(this.idempotentResume, so5Var.idempotentResume) && Intrinsics.m88377d(this.cancelCause, so5Var.cancelCause);
    }

    public int hashCode() {
        Object obj = this.result;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC15513b interfaceC15513b = this.cancelHandler;
        int iHashCode2 = (iHashCode + (interfaceC15513b == null ? 0 : interfaceC15513b.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.cancelCause;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public so5(@Nullable Object obj, @Nullable InterfaceC15513b interfaceC15513b, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th) {
        this.result = obj;
        this.cancelHandler = interfaceC15513b;
        this.onCancellation = function1;
        this.idempotentResume = obj2;
        this.cancelCause = th;
    }
}
