package kotlinx.coroutines.flow;

import com.facebook.AuthenticationTokenClaims;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.gvf0;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001aw\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042:\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"$\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0010\"*\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "a", "(Ll/eri;)Ll/eri;", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, ShareConstants.OLD_VERSION, ShareConstants.NEW_VERSION, "", "areEquivalent", "b", "(Ll/eri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ll/eri;", "Lkotlin/jvm/functions/Function1;", "defaultKeySelector", "Lkotlin/jvm/functions/Function2;", "defaultAreEquivalent", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__DistinctKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function1<Object, Object> f66808a = new Function1<Object, Object>() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Object obj) {
            return obj;
        }
    };

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Function2<Object, Object, Boolean> f66809b = new Function2<Object, Object, Boolean>() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Boolean invoke(@Nullable Object obj, @Nullable Object obj2) {
            return Boolean.valueOf(Intrinsics.m87488d(obj, obj2));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> eri<T> m94081a(@NotNull eri<? extends T> eriVar) {
        return eriVar instanceof gvf0 ? eriVar : m94082b(eriVar, f66808a, f66809b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final <T> eri<T> m94082b(eri<? extends T> eriVar, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (eriVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) eriVar;
            if (distinctFlowImpl.keySelector == function1 && distinctFlowImpl.areEquivalent == function2) {
                return eriVar;
            }
        }
        return new DistinctFlowImpl(eriVar, function1, function2);
    }
}
