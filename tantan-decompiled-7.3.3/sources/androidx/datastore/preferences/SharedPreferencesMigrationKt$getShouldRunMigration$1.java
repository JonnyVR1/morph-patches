package androidx.datastore.preferences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hq80;
import p153l.l4f0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/hq80;", "prefs", "", "<anonymous>", "(Ll/hq80;)Z"}, m88122k = 3, m88123mv = {1, 5, 1})
@DebugMetadata(m88262c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", m88263f = "SharedPreferencesMigration.kt", m88264l = {}, m88265m = "invokeSuspend")
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements Function2<hq80, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Set<String> $keysToMigrate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigrationKt$getShouldRunMigration$1(Set<String> set, Continuation<? super SharedPreferencesMigrationKt$getShouldRunMigration$1> continuation) {
        super(2, continuation);
        this.$keysToMigrate = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.$keysToMigrate, continuation);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.L$0 = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull hq80 hq80Var, @Nullable Continuation<? super Boolean> continuation) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create(hq80Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        Set<hq80.C17536a<?>> setKeySet = ((hq80) this.L$0).mo1480a().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((hq80.C17536a) it.next()).getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
        }
        boolean z = true;
        if (this.$keysToMigrate != l4f0.m152765a()) {
            Set<String> set = this.$keysToMigrate;
            if ((set instanceof Collection) && set.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (Boxing.m88259a(!arrayList.contains((String) it2.next())).booleanValue()) {
                    }
                }
                z = false;
            }
        }
        return Boxing.m88259a(z);
    }
}
