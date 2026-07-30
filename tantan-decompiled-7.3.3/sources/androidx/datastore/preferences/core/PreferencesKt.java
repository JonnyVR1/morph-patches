package androidx.datastore.preferences.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hq80;
import p153l.o6c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m88121d2 = {"Ll/o6c;", "Ll/hq80;", "Lkotlin/Function2;", "Landroidx/datastore/preferences/core/MutablePreferences;", "Lkotlin/coroutines/Continuation;", "", "", "transform", "a", "(Ll/o6c;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-preferences-core"}, m88122k = 2, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class PreferencesKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m1490a(@NotNull o6c<hq80> o6cVar, @NotNull Function2<? super MutablePreferences, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super hq80> continuation) {
        return o6cVar.mo1414a(new PreferencesKt$edit$2(function2, null), continuation);
    }
}
