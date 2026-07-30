package androidx.datastore.preferences.core;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hq80;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/hq80;", Careers.f39580it, "<anonymous>", "(Ll/hq80;)Ll/hq80;"}, m88122k = 3, m88123mv = {1, 5, 1})
@DebugMetadata(m88262c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m88263f = "Preferences.kt", m88264l = {329}, m88265m = "invokeSuspend")
public final class PreferencesKt$edit$2 extends SuspendLambda implements Function2<hq80, Continuation<? super hq80>, Object> {
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
    public final Object invoke(@NotNull hq80 hq80Var, @Nullable Continuation<? super hq80> continuation) {
        return ((PreferencesKt$edit$2) create(hq80Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            ResultKt.m88128b(obj);
            return mutablePreferences;
        }
        ResultKt.m88128b(obj);
        MutablePreferences mutablePreferencesM136604c = ((hq80) this.L$0).m136604c();
        Function2<MutablePreferences, Continuation<? super Unit>, Object> function2 = this.$transform;
        this.L$0 = mutablePreferencesM136604c;
        this.label = 1;
        return function2.invoke(mutablePreferencesM136604c, this) == objM198688e ? objM198688e : mutablePreferencesM136604c;
    }
}
