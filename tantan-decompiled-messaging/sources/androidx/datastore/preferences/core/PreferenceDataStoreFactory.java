package androidx.datastore.preferences.core;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bii;
import p149l.ci80;
import p149l.esc0;
import p149l.i5c;
import p149l.ii80;
import p149l.j5c;
import p149l.ppb;
import p149l.r4c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStoreFactory;", "", "<init>", "()V", "Ll/esc0;", "Ll/ci80;", "corruptionHandler", "", "Ll/r4c;", "migrations", "Ll/ppb;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Ll/i5c;", "a", "(Ll/esc0;Ljava/util/List;Ll/ppb;Lkotlin/jvm/functions/Function0;)Ll/i5c;", "datastore-preferences-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class PreferenceDataStoreFactory {

    @NotNull
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: a */
    public final i5c<ci80> m1488a(@Nullable esc0<ci80> corruptionHandler, @NotNull List<? extends r4c<ci80>> migrations, @NotNull ppb scope, @NotNull final Function0<? extends File> produceFile) {
        migrations.getClass();
        scope.getClass();
        produceFile.getClass();
        return new PreferenceDataStore(j5c.INSTANCE.m139837a(ii80.INSTANCE, corruptionHandler, migrations, scope, new Function0<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
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
                String strM102043s = bii.m102043s(fileInvoke);
                ii80 ii80Var = ii80.INSTANCE;
                if (Intrinsics.m87488d(strM102043s, ii80Var.m136356f())) {
                    return fileInvoke;
                }
                StringBuilder sb = new StringBuilder("File extension for file: ");
                sb.append(fileInvoke);
                String strM136356f = ii80Var.m136356f();
                sb.append(" does not match required extension for Preferences file: ");
                sb.append(strM136356f);
                throw new IllegalStateException(sb.toString().toString());
            }
        }));
    }
}
