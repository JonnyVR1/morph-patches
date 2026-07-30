package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoEnumFlagsUtilsKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66720a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f66721b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f66722c;

        static {
            int[] iArr = new int[ProtoBuf.MemberKind.values().length];
            try {
                iArr[ProtoBuf.MemberKind.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.MemberKind.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.MemberKind.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f66720a = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            try {
                iArr2[CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f66721b = iArr2;
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                iArr3[ProtoBuf.Visibility.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ProtoBuf.Visibility.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f66722c = iArr3;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final DescriptorVisibility m93139a(@NotNull ProtoEnumFlags protoEnumFlags, @Nullable ProtoBuf.Visibility visibility) {
        protoEnumFlags.getClass();
        switch (visibility == null ? -1 : WhenMappings.f66722c[visibility.ordinal()]) {
            case 1:
                DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f64699d;
                descriptorVisibility.getClass();
                return descriptorVisibility;
            case 2:
                DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.f64696a;
                descriptorVisibility2.getClass();
                return descriptorVisibility2;
            case 3:
                DescriptorVisibility descriptorVisibility3 = DescriptorVisibilities.f64697b;
                descriptorVisibility3.getClass();
                return descriptorVisibility3;
            case 4:
                DescriptorVisibility descriptorVisibility4 = DescriptorVisibilities.f64698c;
                descriptorVisibility4.getClass();
                return descriptorVisibility4;
            case 5:
                DescriptorVisibility descriptorVisibility5 = DescriptorVisibilities.f64700e;
                descriptorVisibility5.getClass();
                return descriptorVisibility5;
            case 6:
                DescriptorVisibility descriptorVisibility6 = DescriptorVisibilities.f64701f;
                descriptorVisibility6.getClass();
                return descriptorVisibility6;
            default:
                DescriptorVisibility descriptorVisibility7 = DescriptorVisibilities.f64696a;
                descriptorVisibility7.getClass();
                return descriptorVisibility7;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final CallableMemberDescriptor.Kind m93140b(@NotNull ProtoEnumFlags protoEnumFlags, @Nullable ProtoBuf.MemberKind memberKind) {
        protoEnumFlags.getClass();
        int i = memberKind == null ? -1 : WhenMappings.f66720a[memberKind.ordinal()];
        if (i == 1) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        if (i == 2) {
            return CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        }
        if (i != 3) {
            return i != 4 ? CallableMemberDescriptor.Kind.DECLARATION : CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return CallableMemberDescriptor.Kind.DELEGATION;
    }
}
