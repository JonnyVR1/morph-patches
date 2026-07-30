package androidx.datastore.preferences;

import android.content.Context;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.C15531f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.hq80;
import p153l.j0d0;
import p153l.o6c;
import p153l.r5e;
import p153l.z5c;
import p153l.z6h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/j0d0;", "Ll/hq80;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Ll/z5c;", "produceMigrations", "Ll/drb;", "scope", "Lkotlin/properties/ReadOnlyProperty;", "Ll/o6c;", "a", "(Ljava/lang/String;Ll/j0d0;Lkotlin/jvm/functions/Function1;Ll/drb;)Lkotlin/properties/ReadOnlyProperty;", "datastore-preferences_release"}, m88122k = 2, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class PreferenceDataStoreDelegateKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ReadOnlyProperty<Context, o6c<hq80>> m1434a(@NotNull String str, @Nullable j0d0<hq80> j0d0Var, @NotNull Function1<? super Context, ? extends List<? extends z5c<hq80>>> function1, @NotNull drb drbVar) {
        str.getClass();
        function1.getClass();
        drbVar.getClass();
        return new PreferenceDataStoreSingletonDelegate(str, j0d0Var, function1, drbVar);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ReadOnlyProperty m1435b(String str, j0d0 j0d0Var, Function1 function1, drb drbVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j0d0Var = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1<Context, List<? extends z5c<hq80>>>() { // from class: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final List<z5c<hq80>> invoke(@NotNull Context context) {
                    context.getClass();
                    return CollectionsKt.emptyList();
                }
            };
        }
        if ((i & 8) != 0) {
            drbVar = C15531f.m94947a(r5e.m179861b().plus(z6h0.m218802b(null, 1, null)));
        }
        return m1434a(str, j0d0Var, function1, drbVar);
    }
}
