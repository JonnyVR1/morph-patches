package androidx.datastore.preferences.core;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ci80;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ci80;", Careers.f38732it, "<anonymous>", "(Ll/ci80;)Ll/ci80;"}, m87233k = 3, m87234mv = {1, 5, 1})
@DebugMetadata(m87373c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m87374f = "Preferences.kt", m87375l = {329}, m87376m = "invokeSuspend")
public final class PreferencesKt$edit$2 extends SuspendLambda implements Function2<ci80, Continuation<? super ci80>, Object> {
    final /* synthetic */ Function2<MutablePreferences, Continuation<? super Unit>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferencesKt$edit$2(Function2<? super MutablePreferences, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super PreferencesKt$edit$2> continuation) {
        super(2, continuation);
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.$transform, continuation);
        preferencesKt$edit$2.L$0 = obj;
        return preferencesKt$edit$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ci80 ci80Var, @Nullable Continuation<? super ci80> continuation) {
        return ((PreferencesKt$edit$2) create(ci80Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            ResultKt.m87239b(obj);
            return mutablePreferences;
        }
        ResultKt.m87239b(obj);
        MutablePreferences mutablePreferencesM107055c = ((ci80) this.L$0).m107055c();
        Function2<MutablePreferences, Continuation<? super Unit>, Object> function2 = this.$transform;
        this.L$0 = mutablePreferencesM107055c;
        this.label = 1;
        return function2.invoke(mutablePreferencesM107055c, this) == objM196133e ? objM196133e : mutablePreferencesM107055c;
    }
}
