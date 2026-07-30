package p153l;

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
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/p6c;", "", "<init>", "()V", p7f.GPS_DIRECTION_TRUE, "Ll/bre0;", "serializer", "Ll/j0d0;", "corruptionHandler", "", "Ll/z5c;", "migrations", "Ll/drb;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Ll/o6c;", "a", "(Ll/bre0;Ll/j0d0;Ljava/util/List;Ll/drb;Lkotlin/jvm/functions/Function0;)Ll/o6c;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class p6c {

    @NotNull
    public static final p6c INSTANCE = new p6c();

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: a */
    public final <T> o6c<T> m170846a(@NotNull bre0<T> serializer, @Nullable j0d0<T> corruptionHandler, @NotNull List<? extends z5c<T>> migrations, @NotNull drb scope, @NotNull Function0<? extends File> produceFile) {
        serializer.getClass();
        migrations.getClass();
        scope.getClass();
        produceFile.getClass();
        if (corruptionHandler == null) {
            corruptionHandler = (j0d0<T>) new ct40();
        }
        return new SingleProcessDataStore(produceFile, serializer, CollectionsKt.listOf(DataMigrationInitializer.INSTANCE.m1393b(migrations)), corruptionHandler, scope);
    }
}
