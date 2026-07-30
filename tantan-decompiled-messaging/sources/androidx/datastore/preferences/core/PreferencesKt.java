package androidx.datastore.preferences.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ci80;
import p149l.i5c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m87232d2 = {"Ll/i5c;", "Ll/ci80;", "Lkotlin/Function2;", "Landroidx/datastore/preferences/core/MutablePreferences;", "Lkotlin/coroutines/Continuation;", "", "", "transform", "a", "(Ll/i5c;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-preferences-core"}, m87233k = 2, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class PreferencesKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m1489a(@NotNull i5c<ci80> i5cVar, @NotNull Function2<? super MutablePreferences, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super ci80> continuation) {
        return i5cVar.mo1413a(new PreferencesKt$edit$2(function2, null), continuation);
    }
}
