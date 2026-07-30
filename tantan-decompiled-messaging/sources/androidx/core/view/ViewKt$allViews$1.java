package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m87232d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "androidx.core.view.ViewKt$allViews$1", m87374f = "View.kt", m87375l = {409, HttpStatus.LENGTH_REQUIRED_411}, m87376m = "invokeSuspend")
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, Continuation<? super ViewKt$allViews$1> continuation) {
        super(2, continuation);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, continuation);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super View> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ViewKt$allViews$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r1.m93260e(r6, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r5.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            kotlin.ResultKt.m87239b(r6)
            goto L4d
        L13:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r5)
            return r2
        L19:
            java.lang.Object r1 = r5.L$0
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.ResultKt.m87239b(r6)
            goto L36
        L21:
            kotlin.ResultKt.m87239b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            android.view.View r6 = r5.$this_allViews
            r5.L$0 = r1
            r5.label = r4
            java.lang.Object r6 = r1.mo93258c(r6, r5)
            if (r6 != r0) goto L36
            goto L4c
        L36:
            android.view.View r6 = r5.$this_allViews
            boolean r4 = r6 instanceof android.view.ViewGroup
            if (r4 == 0) goto L4d
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            kotlin.sequences.Sequence r6 = androidx.core.view.ViewGroupKt.m1330c(r6)
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r5 = r1.m93260e(r6, r5)
            if (r5 != r0) goto L4d
        L4c:
            return r0
        L4d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
