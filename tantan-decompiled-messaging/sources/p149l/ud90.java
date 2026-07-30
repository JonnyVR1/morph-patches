package p149l;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\fB'\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m87232d2 = {"Ll/ud90;", j6f.GPS_DIRECTION_TRUE, "Ll/v7;", "Ll/sc90;", "producer", "Ll/xme0;", "settableProducerContext", "Ll/huc0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ll/sc90;Ll/xme0;Ll/huc0;)V", "Companion", "a", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ud90<T> extends AbstractC20588v7<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ ud90(sc90 sc90Var, xme0 xme0Var, huc0 huc0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(sc90Var, xme0Var, huc0Var);
    }

    /* JADX INFO: renamed from: l.ud90$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/ud90$a;", "", "<init>", "()V", j6f.GPS_DIRECTION_TRUE, "Ll/sc90;", "producer", "Ll/xme0;", "settableProducerContext", "Ll/huc0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ll/c5c;", "a", "(Ll/sc90;Ll/xme0;Ll/huc0;)Ll/c5c;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final <T> c5c<T> m193127a(@NotNull sc90<T> producer, @NotNull xme0 settableProducerContext, @NotNull huc0 listener) {
            producer.getClass();
            settableProducerContext.getClass();
            listener.getClass();
            return new ud90(producer, settableProducerContext, listener, null);
        }

        public Companion() {
        }
    }

    public ud90(sc90<T> sc90Var, xme0 xme0Var, huc0 huc0Var) {
        super(sc90Var, xme0Var, huc0Var);
    }
}
