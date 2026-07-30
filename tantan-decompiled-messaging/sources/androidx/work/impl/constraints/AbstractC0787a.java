package androidx.work.impl.constraints;

import com.p046p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.work.impl.constraints.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m87232d2 = {"Landroidx/work/impl/constraints/a;", "", "<init>", "()V", "a", "b", "Landroidx/work/impl/constraints/a$a;", "Landroidx/work/impl/constraints/a$b;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class AbstractC0787a {

    /* JADX INFO: renamed from: androidx.work.impl.constraints.a$a */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Landroidx/work/impl/constraints/a$a;", "Landroidx/work/impl/constraints/a;", "<init>", "()V", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class a extends AbstractC0787a {

        @NotNull
        public static final a INSTANCE = new a();

        public a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.constraints.a$b */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m87232d2 = {"Landroidx/work/impl/constraints/a$b;", "Landroidx/work/impl/constraints/a;", "", Reason.TYPE, "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final /* data */ class b extends AbstractC0787a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int reason;

        public b(int i) {
            super(null);
            this.reason = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getReason() {
            return this.reason;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.reason == ((b) other).reason;
        }

        public int hashCode() {
            return Integer.hashCode(this.reason);
        }

        @NotNull
        public String toString() {
            return "ConstraintsNotMet(reason=" + this.reason + ')';
        }
    }

    public /* synthetic */ AbstractC0787a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC0787a() {
    }
}
