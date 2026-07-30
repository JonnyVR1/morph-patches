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
import p149l.ci80;
import p149l.ei80;
import p149l.jwe0;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"Ll/jwe0;", "sharedPrefs", "Ll/ci80;", "currentData", "<anonymous>", "(Ll/jwe0;Ll/ci80;)Ll/ci80;"}, m87233k = 3, m87234mv = {1, 5, 1})
@DebugMetadata(m87373c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", m87374f = "SharedPreferencesMigration.kt", m87375l = {}, m87376m = "invokeSuspend")
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements Function3<jwe0, ci80, Continuation<? super ci80>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SharedPreferencesMigrationKt$getMigrationFunction$1(Continuation<? super SharedPreferencesMigrationKt$getMigrationFunction$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull jwe0 jwe0Var, @NotNull ci80 ci80Var, @Nullable Continuation<? super ci80> continuation) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(continuation);
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$0 = jwe0Var;
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$1 = ci80Var;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(Unit.INSTANCE);
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
        jwe0 jwe0Var = (jwe0) this.L$0;
        ci80 ci80Var = (ci80) this.L$1;
        Set<ci80.C16162a<?>> setKeySet = ci80Var.mo1479a().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((ci80.C16162a) it.next()).getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
        }
        Map<String, Object> mapM143656a = jwe0Var.m143656a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : mapM143656a.entrySet()) {
            if (Boxing.m87370a(!arrayList.contains(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MutablePreferences mutablePreferencesM107055c = ci80Var.m107055c();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                mutablePreferencesM107055c.m1486j(ei80.m116654a(str), value);
            } else if (value instanceof Float) {
                mutablePreferencesM107055c.m1486j(ei80.m116656c(str), value);
            } else if (value instanceof Integer) {
                mutablePreferencesM107055c.m1486j(ei80.m116657d(str), value);
            } else if (value instanceof Long) {
                mutablePreferencesM107055c.m1486j(ei80.m116658e(str), value);
            } else if (value instanceof String) {
                mutablePreferencesM107055c.m1486j(ei80.m116659f(str), value);
            } else if (value instanceof Set) {
                mutablePreferencesM107055c.m1486j(ei80.m116660g(str), (Set) value);
            }
        }
        return mutablePreferencesM107055c.m107056d();
    }
}
