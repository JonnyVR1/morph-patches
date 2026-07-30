package p153l;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\fB'\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m88121d2 = {"Ll/yl90;", p7f.GPS_DIRECTION_TRUE, "Ll/q7;", "Ll/wk90;", "producer", "Ll/eve0;", "settableProducerContext", "Ll/k2d0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ll/wk90;Ll/eve0;Ll/k2d0;)V", "Companion", "a", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class yl90<T> extends AbstractC19532q7<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ yl90(wk90 wk90Var, eve0 eve0Var, k2d0 k2d0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(wk90Var, eve0Var, k2d0Var);
    }

    /* JADX INFO: renamed from: l.yl90$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/yl90$a;", "", "<init>", "()V", p7f.GPS_DIRECTION_TRUE, "Ll/wk90;", "producer", "Ll/eve0;", "settableProducerContext", "Ll/k2d0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ll/i6c;", "a", "(Ll/wk90;Ll/eve0;Ll/k2d0;)Ll/i6c;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final <T> i6c<T> m216565a(@NotNull wk90<T> producer, @NotNull eve0 settableProducerContext, @NotNull k2d0 listener) {
            producer.getClass();
            settableProducerContext.getClass();
            listener.getClass();
            return new yl90(producer, settableProducerContext, listener, null);
        }

        public Companion() {
        }
    }

    public yl90(wk90<T> wk90Var, eve0 eve0Var, k2d0 k2d0Var) {
        super(wk90Var, eve0Var, k2d0Var);
    }
}
