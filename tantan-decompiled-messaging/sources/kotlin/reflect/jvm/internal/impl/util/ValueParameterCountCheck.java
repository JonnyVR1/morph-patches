package kotlin.reflect.jvm.internal.impl.util;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ValueParameterCountCheck implements Check {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f66432a;

    public static final class AtLeast extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b */
        public final int f66433b;

        public AtLeast(int i) {
            StringBuilder sb = new StringBuilder("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? BLiveStormDanmakuGiftResourceType.f44446s : "");
            super(sb.toString(), null);
            this.f66433b = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* JADX INFO: renamed from: b */
        public boolean mo93134b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.mo88448g().size() >= this.f66433b;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b */
        public final int f66434b;

        public Equals(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.f66434b = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* JADX INFO: renamed from: b */
        public boolean mo93134b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.mo88448g().size() == this.f66434b;
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
        public boolean mo93134b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.mo88448g().isEmpty();
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
        public boolean mo93134b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.mo88448g().size() == 1;
        }
    }

    public ValueParameterCountCheck(String str) {
        this.f66432a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ String mo93133a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m93135a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f66432a;
    }

    public /* synthetic */ ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
