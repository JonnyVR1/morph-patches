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
import p149l.ci80;
import p149l.ewe0;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/ci80;", "prefs", "", "<anonymous>", "(Ll/ci80;)Z"}, m87233k = 3, m87234mv = {1, 5, 1})
@DebugMetadata(m87373c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", m87374f = "SharedPreferencesMigration.kt", m87375l = {}, m87376m = "invokeSuspend")
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements Function2<ci80, Continuation<? super Boolean>, Object> {
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
    public final Object invoke(@NotNull ci80 ci80Var, @Nullable Continuation<? super Boolean> continuation) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create(ci80Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        Set<ci80.C16162a<?>> setKeySet = ((ci80) this.L$0).mo1479a().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((ci80.C16162a) it.next()).getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
        }
        boolean z = true;
        if (this.$keysToMigrate != ewe0.m118468a()) {
            Set<String> set = this.$keysToMigrate;
            if ((set instanceof Collection) && set.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (Boxing.m87370a(!arrayList.contains((String) it2.next())).booleanValue()) {
                    }
                }
                z = false;
            }
        }
        return Boxing.m87370a(z);
    }
}
