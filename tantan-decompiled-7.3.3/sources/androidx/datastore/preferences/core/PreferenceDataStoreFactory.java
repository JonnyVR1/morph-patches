package androidx.datastore.preferences.core;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.hq80;
import p153l.j0d0;
import p153l.nq80;
import p153l.o6c;
import p153l.p6c;
import p153l.yki;
import p153l.z5c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStoreFactory;", "", "<init>", "()V", "Ll/j0d0;", "Ll/hq80;", "corruptionHandler", "", "Ll/z5c;", "migrations", "Ll/drb;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Ll/o6c;", "a", "(Ll/j0d0;Ljava/util/List;Ll/drb;Lkotlin/jvm/functions/Function0;)Ll/o6c;", "datastore-preferences-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class PreferenceDataStoreFactory {

    @NotNull
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: a */
    public final o6c<hq80> m1489a(@Nullable j0d0<hq80> corruptionHandler, @NotNull List<? extends z5c<hq80>> migrations, @NotNull drb scope, @NotNull final Function0<? extends File> produceFile) {
        migrations.getClass();
        scope.getClass();
        produceFile.getClass();
        return new PreferenceDataStore(p6c.INSTANCE.m170846a(nq80.INSTANCE, corruptionHandler, migrations, scope, new Function0<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                File fileInvoke = produceFile.invoke();
                String strM216471s = yki.m216471s(fileInvoke);
                nq80 nq80Var = nq80.INSTANCE;
                if (Intrinsics.m88377d(strM216471s, nq80Var.m164291f())) {
                    return fileInvoke;
                }
                StringBuilder sb = new StringBuilder("File extension for file: ");
                sb.append(fileInvoke);
                String strM164291f = nq80Var.m164291f();
                sb.append(" does not match required extension for Preferences file: ");
                sb.append(strM164291f);
                throw new IllegalStateException(sb.toString().toString());
            }
        }));
    }
}
