package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.data.Owner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.rkq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FunctionDescriptorImpl extends DeclarationDescriptorNonRootImpl implements FunctionDescriptor {

    /* JADX INFO: renamed from: A */
    public final FunctionDescriptor f64152A;

    /* JADX INFO: renamed from: B */
    public final CallableMemberDescriptor.Kind f64153B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public FunctionDescriptor f64154C;

    /* JADX INFO: renamed from: D */
    public Map<CallableDescriptor.UserDataKey<?>, Object> f64155D;

    /* JADX INFO: renamed from: e */
    public List<TypeParameterDescriptor> f64156e;

    /* JADX INFO: renamed from: f */
    public List<ValueParameterDescriptor> f64157f;

    /* JADX INFO: renamed from: g */
    public KotlinType f64158g;

    /* JADX INFO: renamed from: h */
    public List<ReceiverParameterDescriptor> f64159h;

    /* JADX INFO: renamed from: i */
    public ReceiverParameterDescriptor f64160i;

    /* JADX INFO: renamed from: j */
    public ReceiverParameterDescriptor f64161j;

    /* JADX INFO: renamed from: k */
    public Modality f64162k;

    /* JADX INFO: renamed from: l */
    public DescriptorVisibility f64163l;

    /* JADX INFO: renamed from: m */
    public boolean f64164m;

    /* JADX INFO: renamed from: n */
    public boolean f64165n;

    /* JADX INFO: renamed from: o */
    public boolean f64166o;

    /* JADX INFO: renamed from: p */
    public boolean f64167p;

    /* JADX INFO: renamed from: q */
    public boolean f64168q;

    /* JADX INFO: renamed from: r */
    public boolean f64169r;

    /* JADX INFO: renamed from: s */
    public boolean f64170s;

    /* JADX INFO: renamed from: t */
    public boolean f64171t;

    /* JADX INFO: renamed from: u */
    public boolean f64172u;

    /* JADX INFO: renamed from: v */
    public boolean f64173v;

    /* JADX INFO: renamed from: w */
    public boolean f64174w;

    /* JADX INFO: renamed from: x */
    public boolean f64175x;

    /* JADX INFO: renamed from: y */
    public Collection<? extends FunctionDescriptor> f64176y;

    /* JADX INFO: renamed from: z */
    public volatile Function0<Collection<FunctionDescriptor>> f64177z;

    public class CopyConfiguration implements FunctionDescriptor.CopyBuilder<FunctionDescriptor> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public TypeSubstitution f64178a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public DeclarationDescriptor f64179b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public Modality f64180c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public DescriptorVisibility f64181d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public FunctionDescriptor f64182e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public CallableMemberDescriptor.Kind f64183f;

        /* JADX INFO: renamed from: g */
        @NotNull
        public List<ValueParameterDescriptor> f64184g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public List<ReceiverParameterDescriptor> f64185h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public ReceiverParameterDescriptor f64186i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public ReceiverParameterDescriptor f64187j;

        /* JADX INFO: renamed from: k */
        @NotNull
        public KotlinType f64188k;

        /* JADX INFO: renamed from: l */
        @Nullable
        public Name f64189l;

        /* JADX INFO: renamed from: m */
        public boolean f64190m;

        /* JADX INFO: renamed from: n */
        public boolean f64191n;

        /* JADX INFO: renamed from: o */
        public boolean f64192o;

        /* JADX INFO: renamed from: p */
        public boolean f64193p;

        /* JADX INFO: renamed from: q */
        public boolean f64194q;

        /* JADX INFO: renamed from: r */
        public List<TypeParameterDescriptor> f64195r;

        /* JADX INFO: renamed from: s */
        public Annotations f64196s;

        /* JADX INFO: renamed from: t */
        public boolean f64197t;

        /* JADX INFO: renamed from: u */
        public Map<CallableDescriptor.UserDataKey<?>, Object> f64198u;

        /* JADX INFO: renamed from: v */
        public Boolean f64199v;

        /* JADX INFO: renamed from: w */
        public boolean f64200w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ FunctionDescriptorImpl f64201x;

        public CopyConfiguration(@NotNull FunctionDescriptorImpl functionDescriptorImpl, @NotNull TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @NotNull CallableMemberDescriptor.Kind kind, @NotNull List<ValueParameterDescriptor> list, @Nullable List<ReceiverParameterDescriptor> list2, @NotNull ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable KotlinType kotlinType, Name name) {
            if (typeSubstitution == null) {
                m88762u(0);
            }
            if (declarationDescriptor == null) {
                m88762u(1);
            }
            if (modality == null) {
                m88762u(2);
            }
            if (descriptorVisibility == null) {
                m88762u(3);
            }
            if (kind == null) {
                m88762u(4);
            }
            if (list == null) {
                m88762u(5);
            }
            if (list2 == null) {
                m88762u(6);
            }
            if (kotlinType == null) {
                m88762u(7);
            }
            this.f64201x = functionDescriptorImpl;
            this.f64182e = null;
            this.f64187j = functionDescriptorImpl.f64161j;
            this.f64190m = true;
            this.f64191n = false;
            this.f64192o = false;
            this.f64193p = false;
            this.f64194q = functionDescriptorImpl.mo88512A0();
            this.f64195r = null;
            this.f64196s = null;
            this.f64197t = functionDescriptorImpl.mo88513O();
            this.f64198u = new LinkedHashMap();
            this.f64199v = null;
            this.f64200w = false;
            this.f64178a = typeSubstitution;
            this.f64179b = declarationDescriptor;
            this.f64180c = modality;
            this.f64181d = descriptorVisibility;
            this.f64183f = kind;
            this.f64184g = list;
            this.f64185h = list2;
            this.f64186i = receiverParameterDescriptor;
            this.f64188k = kotlinType;
            this.f64189l = name;
        }

        /* JADX INFO: renamed from: A */
        public static /* synthetic */ Map m88761A(CopyConfiguration copyConfiguration) {
            return copyConfiguration.f64198u;
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m88762u(int i) {
            String str;
            int i2;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = Owner.TYPE;
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        /* JADX INFO: renamed from: v */
        public static /* synthetic */ Annotations m88763v(CopyConfiguration copyConfiguration) {
            return copyConfiguration.f64196s;
        }

        /* JADX INFO: renamed from: w */
        public static /* synthetic */ List m88764w(CopyConfiguration copyConfiguration) {
            return copyConfiguration.f64195r;
        }

        /* JADX INFO: renamed from: x */
        public static /* synthetic */ boolean m88765x(CopyConfiguration copyConfiguration) {
            return copyConfiguration.f64194q;
        }

        /* JADX INFO: renamed from: y */
        public static /* synthetic */ boolean m88766y(CopyConfiguration copyConfiguration) {
            return copyConfiguration.f64197t;
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ Boolean m88767z(CopyConfiguration copyConfiguration) {
            return copyConfiguration.f64199v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88527l(@NotNull Annotations annotations) {
            if (annotations == null) {
                m88762u(35);
            }
            this.f64196s = annotations;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88525j(boolean z) {
            this.f64190m = z;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88516a(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.f64187j = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88528m() {
            this.f64193p = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88517b(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.f64186i = receiverParameterDescriptor;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public CopyConfiguration m88773G(boolean z) {
            this.f64199v = Boolean.valueOf(z);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88530o() {
            this.f64197t = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88520e() {
            this.f64194q = true;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: J */
        public CopyConfiguration m88776J(boolean z) {
            this.f64200w = z;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88534s(@NotNull CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                m88762u(14);
            }
            this.f64183f = kind;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88532q(@NotNull Modality modality) {
            if (modality == null) {
                m88762u(10);
            }
            this.f64180c = modality;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88521f(@NotNull Name name) {
            if (name == null) {
                m88762u(17);
            }
            this.f64189l = name;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88524i(@Nullable CallableMemberDescriptor callableMemberDescriptor) {
            this.f64182e = (FunctionDescriptor) callableMemberDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88533r(@NotNull DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                m88762u(8);
            }
            this.f64179b = declarationDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88522g() {
            this.f64192o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88523h(@NotNull KotlinType kotlinType) {
            if (kotlinType == null) {
                m88762u(23);
            }
            this.f64188k = kotlinType;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88535t() {
            this.f64191n = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88518c(@NotNull TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                m88762u(37);
            }
            this.f64178a = typeSubstitution;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88526k(@NotNull List<TypeParameterDescriptor> list) {
            if (list == null) {
                m88762u(21);
            }
            this.f64195r = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88529n(@NotNull List<ValueParameterDescriptor> list) {
            if (list == null) {
                m88762u(19);
            }
            this.f64184g = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration mo88531p(@NotNull DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility == null) {
                m88762u(12);
            }
            this.f64181d = descriptorVisibility;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @Nullable
        public FunctionDescriptor build() {
            return this.f64201x.mo88322F0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        /* JADX INFO: renamed from: d */
        public <V> FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo88519d(@NotNull CallableDescriptor.UserDataKey<V> userDataKey, V v2) {
            if (userDataKey == null) {
                m88762u(39);
            }
            this.f64198u.put(userDataKey, v2);
            return this;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$a */
    public class C15206a implements Function0<Collection<FunctionDescriptor>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TypeSubstitutor f64202a;

        public C15206a(TypeSubstitutor typeSubstitutor) {
            this.f64202a = typeSubstitutor;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<FunctionDescriptor> invoke() {
            SmartList smartList = new SmartList();
            Iterator<? extends FunctionDescriptor> it = FunctionDescriptorImpl.this.mo88447e().iterator();
            while (it.hasNext()) {
                smartList.add(it.next().mo88453c(this.f64202a));
            }
            return smartList;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$b */
    public static class C15207b implements Function0<List<VariableDescriptor>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f64204a;

        public C15207b(List list) {
            this.f64204a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<VariableDescriptor> invoke() {
            return this.f64204a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (declarationDescriptor == null) {
            m88739P(0);
        }
        if (annotations == null) {
            m88739P(1);
        }
        if (name == null) {
            m88739P(2);
        }
        if (kind == null) {
            m88739P(3);
        }
        if (sourceElement == null) {
            m88739P(4);
        }
        this.f64163l = DescriptorVisibilities.f64030i;
        this.f64164m = false;
        this.f64165n = false;
        this.f64166o = false;
        this.f64167p = false;
        this.f64168q = false;
        this.f64169r = false;
        this.f64170s = false;
        this.f64171t = false;
        this.f64172u = false;
        this.f64173v = false;
        this.f64174w = true;
        this.f64175x = false;
        this.f64176y = null;
        this.f64177z = null;
        this.f64154C = null;
        this.f64155D = null;
        this.f64152A = functionDescriptor == null ? this : functionDescriptor;
        this.f64153B = kind;
    }

    @Nullable
    /* JADX INFO: renamed from: H0 */
    public static List<ValueParameterDescriptor> m88737H0(FunctionDescriptor functionDescriptor, @NotNull List<ValueParameterDescriptor> list, @NotNull TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            m88739P(28);
        }
        if (typeSubstitutor == null) {
            m88739P(29);
        }
        return m88738I0(functionDescriptor, list, typeSubstitutor, false, false, null);
    }

    @Nullable
    /* JADX INFO: renamed from: I0 */
    public static List<ValueParameterDescriptor> m88738I0(FunctionDescriptor functionDescriptor, @NotNull List<ValueParameterDescriptor> list, @NotNull TypeSubstitutor typeSubstitutor, boolean z, boolean z2, @Nullable boolean[] zArr) {
        if (list == null) {
            m88739P(30);
        }
        if (typeSubstitutor == null) {
            m88739P(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            KotlinType type = valueParameterDescriptor.getType();
            Variance variance = Variance.IN_VARIANCE;
            KotlinType kotlinTypeM92782q = typeSubstitutor.m92782q(type, variance);
            KotlinType kotlinTypeMo88618w0 = valueParameterDescriptor.mo88618w0();
            KotlinType kotlinTypeM92782q2 = kotlinTypeMo88618w0 == null ? null : typeSubstitutor.m92782q(kotlinTypeMo88618w0, variance);
            if (kotlinTypeM92782q == null) {
                return null;
            }
            if ((kotlinTypeM92782q != valueParameterDescriptor.getType() || kotlinTypeMo88618w0 != kotlinTypeM92782q2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(ValueParameterDescriptorImpl.m88927E0(functionDescriptor, z ? null : valueParameterDescriptor, valueParameterDescriptor.getIndex(), valueParameterDescriptor.getAnnotations(), valueParameterDescriptor.getName(), kotlinTypeM92782q, valueParameterDescriptor.mo88615M(), valueParameterDescriptor.mo88617t0(), valueParameterDescriptor.mo88616r0(), kotlinTypeM92782q2, z2 ? valueParameterDescriptor.getSource() : SourceElement.f64063a, valueParameterDescriptor instanceof ValueParameterDescriptorImpl.WithDestructuringDeclaration ? new C15207b(((ValueParameterDescriptorImpl.WithDestructuringDeclaration) valueParameterDescriptor).m88933J0()) : null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m88739P(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = Constants.COPY_TYPE;
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: W0 */
    private void m88740W0(@Nullable FunctionDescriptor functionDescriptor) {
        this.f64154C = functionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* JADX INFO: renamed from: A0 */
    public boolean mo88512A0() {
        return this.f64171t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public FunctionDescriptor mo88452a0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        FunctionDescriptor functionDescriptorBuild = mo88514k().mo88533r(declarationDescriptor).mo88532q(modality).mo88531p(descriptorVisibility).mo88534s(kind).mo88525j(z).build();
        if (functionDescriptorBuild == null) {
            m88739P(26);
        }
        return functionDescriptorBuild;
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public abstract FunctionDescriptorImpl mo88321E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement);

    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v50 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v50 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v51 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v57 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v57 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v58 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v58 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v16 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: boolean[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r1v50 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v50 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r1v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v51 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r1v57 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v57 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r1v58 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v58 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r3v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v16 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: boolean[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v1 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: F0 */
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor mo88322F0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration r20) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.mo88322F0(kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$CopyConfiguration):kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor");
    }

    @NotNull
    /* JADX INFO: renamed from: G0 */
    public final SourceElement m88741G0(boolean z, @Nullable FunctionDescriptor functionDescriptor) {
        SourceElement source;
        if (z) {
            if (functionDescriptor == null) {
                functionDescriptor = mo88445a();
            }
            source = functionDescriptor.getSource();
        } else {
            source = SourceElement.f64063a;
        }
        if (source == null) {
            m88739P(27);
        }
        return source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: J */
    public <V> V mo88443J(CallableDescriptor.UserDataKey<V> userDataKey) {
        Map<CallableDescriptor.UserDataKey<?>, Object> map = this.f64155D;
        if (map == null) {
            return null;
        }
        return (V) map.get(userDataKey);
    }

    /* JADX INFO: renamed from: J0 */
    public boolean mo88742J0() {
        return this.f64174w;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public FunctionDescriptorImpl mo88743K0(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<ReceiverParameterDescriptor> list, @NotNull List<? extends TypeParameterDescriptor> list2, @NotNull List<ValueParameterDescriptor> list3, @Nullable KotlinType kotlinType, @Nullable Modality modality, @NotNull DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            m88739P(5);
        }
        if (list2 == null) {
            m88739P(6);
        }
        if (list3 == null) {
            m88739P(7);
        }
        if (descriptorVisibility == null) {
            m88739P(8);
        }
        this.f64156e = CollectionsKt.toList(list2);
        this.f64157f = CollectionsKt.toList(list3);
        this.f64158g = kotlinType;
        this.f64162k = modality;
        this.f64163l = descriptorVisibility;
        this.f64160i = receiverParameterDescriptor;
        this.f64161j = receiverParameterDescriptor2;
        this.f64159h = list;
        for (int i = 0; i < list2.size(); i++) {
            TypeParameterDescriptor typeParameterDescriptor = list2.get(i);
            if (typeParameterDescriptor.getIndex() != i) {
                StringBuilder sb = new StringBuilder();
                sb.append(typeParameterDescriptor);
                int index = typeParameterDescriptor.getIndex();
                sb.append(" index is ");
                sb.append(index);
                sb.append(" but position is ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            ValueParameterDescriptor valueParameterDescriptor = list3.get(i2);
            if (valueParameterDescriptor.getIndex() != i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(valueParameterDescriptor);
                int index2 = valueParameterDescriptor.getIndex();
                sb2.append("index is ");
                sb2.append(index2);
                sb2.append(" but position is ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public CopyConfiguration m88744L0(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m88739P(24);
        }
        return new CopyConfiguration(this, typeSubstitutor.m92778k(), mo88299b(), mo88303i(), getVisibility(), getKind(), mo88448g(), mo88450x0(), mo88446b0(), getReturnType(), null);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m88745M0() {
        Function0<Collection<FunctionDescriptor>> function0 = this.f64177z;
        if (function0 != null) {
            this.f64176y = function0.invoke();
            this.f64177z = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public void mo88451N(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            m88739P(17);
        }
        this.f64176y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((FunctionDescriptor) it.next()).mo88513O()) {
                this.f64172u = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public <V> void m88746N0(CallableDescriptor.UserDataKey<V> userDataKey, Object obj) {
        if (this.f64155D == null) {
            this.f64155D = new LinkedHashMap();
        }
        this.f64155D.put(userDataKey, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* JADX INFO: renamed from: O */
    public boolean mo88513O() {
        return this.f64172u;
    }

    /* JADX INFO: renamed from: O0 */
    public void m88747O0(boolean z) {
        this.f64170s = z;
    }

    /* JADX INFO: renamed from: P0 */
    public void m88748P0(boolean z) {
        this.f64169r = z;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m88749Q0(boolean z) {
        this.f64166o = z;
    }

    /* JADX INFO: renamed from: R0 */
    public void mo88750R0(boolean z) {
        this.f64174w = z;
    }

    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo87671l(this, d);
    }

    /* JADX INFO: renamed from: S0 */
    public void mo88751S0(boolean z) {
        this.f64175x = z;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m88752T0(boolean z) {
        this.f64172u = z;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m88753U0(boolean z) {
        this.f64171t = z;
    }

    /* JADX INFO: renamed from: V0 */
    public void m88754V0(boolean z) {
        this.f64165n = z;
    }

    /* JADX INFO: renamed from: X0 */
    public void m88755X0(boolean z) {
        this.f64167p = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: Y */
    public ReceiverParameterDescriptor mo88444Y() {
        return this.f64161j;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m88756Y0(boolean z) {
        this.f64164m = z;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m88757Z0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88739P(11);
        }
        this.f64158g = kotlinType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public FunctionDescriptor mo88445a() {
        FunctionDescriptor functionDescriptorMo88445a;
        FunctionDescriptor functionDescriptor = this.f64152A;
        ?? r1 = this;
        if (functionDescriptor != this) {
            functionDescriptorMo88445a = functionDescriptor.mo88445a();
        }
        if (r1 == 0) {
            r1 = functionDescriptorMo88445a;
            m88739P(20);
        }
        r1 = functionDescriptorMo88445a;
        return r1;
    }

    /* JADX INFO: renamed from: a1 */
    public void m88758a1(boolean z) {
        this.f64173v = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public ReceiverParameterDescriptor mo88446b0() {
        return this.f64160i;
    }

    /* JADX INFO: renamed from: b1 */
    public void m88759b1(boolean z) {
        this.f64168q = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: c */
    public FunctionDescriptor mo88453c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m88739P(22);
        }
        return typeSubstitutor.m92779l() ? this : m88744L0(typeSubstitutor).mo88524i(mo88445a()).mo88522g().m88776J(true).build();
    }

    /* JADX INFO: renamed from: c1 */
    public void m88760c1(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            m88739P(10);
        }
        this.f64163l = descriptorVisibility;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<? extends FunctionDescriptor> mo88447e() {
        m88745M0();
        Collection<? extends FunctionDescriptor> collection = this.f64176y;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            m88739P(14);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo88301e0() {
        return this.f64170s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<ValueParameterDescriptor> mo88448g() {
        List<ValueParameterDescriptor> list = this.f64157f;
        if (list == null) {
            m88739P(19);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f64153B;
        if (kind == null) {
            m88739P(21);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.f64158g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.f64156e;
        if (list != null) {
            return list;
        }
        rkq0.m179764a("typeParameters == null for ", this);
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f64163l;
        if (descriptorVisibility == null) {
            m88739P(16);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo88303i() {
        Modality modality = this.f64162k;
        if (modality == null) {
            m88739P(15);
        }
        return modality;
    }

    public boolean isExternal() {
        return this.f64166o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        if (this.f64165n) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = mo88445a().mo88447e().iterator();
        while (it.hasNext()) {
            if (it.next().isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f64167p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        if (this.f64164m) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = mo88445a().mo88447e().iterator();
        while (it.hasNext()) {
            if (it.next().isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return this.f64173v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    /* JADX INFO: renamed from: k */
    public FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> mo88514k() {
        CopyConfiguration copyConfigurationM88744L0 = m88744L0(TypeSubstitutor.f66283b);
        if (copyConfigurationM88744L0 == null) {
            m88739P(23);
        }
        return copyConfigurationM88744L0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: k0 */
    public boolean mo88449k0() {
        return this.f64175x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo88307n0() {
        return this.f64169r;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo88324u() {
        return this.f64168q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @Nullable
    /* JADX INFO: renamed from: u0 */
    public FunctionDescriptor mo88515u0() {
        return this.f64154C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public List<ReceiverParameterDescriptor> mo88450x0() {
        List<ReceiverParameterDescriptor> list = this.f64159h;
        if (list == null) {
            m88739P(13);
        }
        return list;
    }
}
