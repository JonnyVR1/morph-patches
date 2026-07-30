package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ErrorValue extends ConstantValue<Unit> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ErrorValue m91928a(@NotNull String str) {
            str.getClass();
            return new ErrorValueWithMessage(str);
        }

        private Companion() {
        }
    }

    public static final class ErrorValueWithMessage extends ErrorValue {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final String f65852b;

        public ErrorValueWithMessage(@NotNull String str) {
            str.getClass();
            this.f65852b = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ErrorType mo91908a(@NotNull ModuleDescriptor moduleDescriptor) {
            moduleDescriptor.getClass();
            return ErrorUtils.m93002d(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f65852b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        @NotNull
        public String toString() {
            return this.f65852b;
        }
    }

    public ErrorValue() {
        super(Unit.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Unit mo91918b() {
        throw new UnsupportedOperationException();
    }
}
