package p149l;

import androidx.datastore.core.DataMigrationInitializer;
import androidx.datastore.core.SingleProcessDataStore;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/j5c;", "", "<init>", "()V", j6f.GPS_DIRECTION_TRUE, "Ll/wie0;", "serializer", "Ll/esc0;", "corruptionHandler", "", "Ll/r4c;", "migrations", "Ll/ppb;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Ll/i5c;", "a", "(Ll/wie0;Ll/esc0;Ljava/util/List;Ll/ppb;Lkotlin/jvm/functions/Function0;)Ll/i5c;", "datastore-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class j5c {

    @NotNull
    public static final j5c INSTANCE = new j5c();

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: a */
    public final <T> i5c<T> m139837a(@NotNull wie0<T> serializer, @Nullable esc0<T> corruptionHandler, @NotNull List<? extends r4c<T>> migrations, @NotNull ppb scope, @NotNull Function0<? extends File> produceFile) {
        serializer.getClass();
        migrations.getClass();
        scope.getClass();
        produceFile.getClass();
        if (corruptionHandler == null) {
            corruptionHandler = (esc0<T>) new ok40();
        }
        return new SingleProcessDataStore(produceFile, serializer, CollectionsKt.listOf(DataMigrationInitializer.INSTANCE.m1392b(migrations)), corruptionHandler, scope);
    }
}
