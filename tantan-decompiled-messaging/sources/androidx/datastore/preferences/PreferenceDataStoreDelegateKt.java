package androidx.datastore.preferences;

import android.content.Context;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ci80;
import p149l.d4e;
import p149l.esc0;
import p149l.i5c;
import p149l.ppb;
import p149l.r4c;
import p149l.ryg0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/esc0;", "Ll/ci80;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Ll/r4c;", "produceMigrations", "Ll/ppb;", "scope", "Lkotlin/properties/ReadOnlyProperty;", "Ll/i5c;", "a", "(Ljava/lang/String;Ll/esc0;Lkotlin/jvm/functions/Function1;Ll/ppb;)Lkotlin/properties/ReadOnlyProperty;", "datastore-preferences_release"}, m87233k = 2, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class PreferenceDataStoreDelegateKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ReadOnlyProperty<Context, i5c<ci80>> m1433a(@NotNull String str, @Nullable esc0<ci80> esc0Var, @NotNull Function1<? super Context, ? extends List<? extends r4c<ci80>>> function1, @NotNull ppb ppbVar) {
        str.getClass();
        function1.getClass();
        ppbVar.getClass();
        return new PreferenceDataStoreSingletonDelegate(str, esc0Var, function1, ppbVar);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ReadOnlyProperty m1434b(String str, esc0 esc0Var, Function1 function1, ppb ppbVar, int i, Object obj) {
        if ((i & 2) != 0) {
            esc0Var = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1<Context, List<? extends r4c<ci80>>>() { // from class: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final List<r4c<ci80>> invoke(@NotNull Context context) {
                    context.getClass();
                    return CollectionsKt.emptyList();
                }
            };
        }
        if ((i & 8) != 0) {
            ppbVar = C15424f.m94055a(d4e.m109981b().plus(ryg0.m181663b(null, 1, null)));
        }
        return m1433a(str, esc0Var, function1, ppbVar);
    }
}
