package kotlin.reflect.jvm.internal.impl.util;

import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ValueParameterCountCheck implements Check {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f67106a;

    public static final class AtLeast extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b */
        public final int f67107b;

        public AtLeast(int i) {
            StringBuilder sb = new StringBuilder("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? BLiveStormDanmakuGiftResourceType.f45294s : "");
            super(sb.toString(), null);
            this.f67107b = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* JADX INFO: renamed from: b */
        public boolean mo94025b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.mo89339g().size() >= this.f67107b;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b */
        public final int f67108b;

        public Equals(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.f67108b = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* JADX INFO: renamed from: b */
        public boolean mo94025b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.mo89339g().size() == this.f67108b;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {

        @NotNull
        public static final NoValueParameters INSTANCE = new NoValueParameters();

        private NoValueParameters() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* JADX INFO: renamed from: b */
        public boolean mo94025b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.mo89339g().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {

        @NotNull
        public static final SingleValueParameter INSTANCE = new SingleValueParameter();

        private SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* JADX INFO: renamed from: b */
        public boolean mo94025b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.mo89339g().size() == 1;
        }
    }

    public ValueParameterCountCheck(String str) {
        this.f67106a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ String mo94024a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m94026a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f67106a;
    }

    public /* synthetic */ ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
