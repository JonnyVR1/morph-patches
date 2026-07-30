package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;
import p153l.q6c;
import p153l.r6c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, m88121d2 = {"<anonymous>", "Ljava/io/File;", p7f.GPS_DIRECTION_TRUE}, m88122k = 3, m88123mv = {1, 5, 1}, m88125xi = 48)
final class DataStoreSingletonDelegate$getValue$1$1 extends Lambda implements Function0<File> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ r6c<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSingletonDelegate$getValue$1$1(Context context, r6c<Object> r6cVar) {
        super(0);
        this.$applicationContext = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final File invoke() {
        Context context = this.$applicationContext;
        context.getClass();
        return q6c.m175547a(context, r6c.m180004c(null));
    }
}
