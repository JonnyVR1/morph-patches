package androidx.datastore.preferences;

import androidx.datastore.preferences.core.MutablePreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hq80;
import p153l.jq80;
import p153l.q4f0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"Ll/q4f0;", "sharedPrefs", "Ll/hq80;", "currentData", "<anonymous>", "(Ll/q4f0;Ll/hq80;)Ll/hq80;"}, m88122k = 3, m88123mv = {1, 5, 1})
@DebugMetadata(m88262c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", m88263f = "SharedPreferencesMigration.kt", m88264l = {}, m88265m = "invokeSuspend")
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements Function3<q4f0, hq80, Continuation<? super hq80>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SharedPreferencesMigrationKt$getMigrationFunction$1(Continuation<? super SharedPreferencesMigrationKt$getMigrationFunction$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull q4f0 q4f0Var, @NotNull hq80 hq80Var, @Nullable Continuation<? super hq80> continuation) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(continuation);
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$0 = q4f0Var;
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$1 = hq80Var;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(Unit.INSTANCE);
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
        q4f0 q4f0Var = (q4f0) this.L$0;
        hq80 hq80Var = (hq80) this.L$1;
        Set<hq80.C17536a<?>> setKeySet = hq80Var.mo1480a().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((hq80.C17536a) it.next()).getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
        }
        Map<String, Object> mapM175212a = q4f0Var.m175212a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : mapM175212a.entrySet()) {
            if (Boxing.m88259a(!arrayList.contains(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MutablePreferences mutablePreferencesM136604c = hq80Var.m136604c();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                mutablePreferencesM136604c.m1487j(jq80.m146560a(str), value);
            } else if (value instanceof Float) {
                mutablePreferencesM136604c.m1487j(jq80.m146562c(str), value);
            } else if (value instanceof Integer) {
                mutablePreferencesM136604c.m1487j(jq80.m146563d(str), value);
            } else if (value instanceof Long) {
                mutablePreferencesM136604c.m1487j(jq80.m146564e(str), value);
            } else if (value instanceof String) {
                mutablePreferencesM136604c.m1487j(jq80.m146565f(str), value);
            } else if (value instanceof Set) {
                mutablePreferencesM136604c.m1487j(jq80.m146566g(str), (Set) value);
            }
        }
        return mutablePreferencesM136604c.m136605d();
    }
}
