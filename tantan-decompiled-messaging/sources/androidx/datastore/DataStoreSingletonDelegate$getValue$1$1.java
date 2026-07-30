package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;
import p149l.k5c;
import p149l.l5c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, m87232d2 = {"<anonymous>", "Ljava/io/File;", j6f.GPS_DIRECTION_TRUE}, m87233k = 3, m87234mv = {1, 5, 1}, m87236xi = 48)
final class DataStoreSingletonDelegate$getValue$1$1 extends Lambda implements Function0<File> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ l5c<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSingletonDelegate$getValue$1$1(Context context, l5c<Object> l5cVar) {
        super(0);
        this.$applicationContext = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final File invoke() {
        Context context = this.$applicationContext;
        context.getClass();
        return k5c.m144527a(context, l5c.m148619c(null));
    }
}
