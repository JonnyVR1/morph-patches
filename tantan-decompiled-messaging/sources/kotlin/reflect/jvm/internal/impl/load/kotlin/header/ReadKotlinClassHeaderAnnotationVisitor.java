package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.p046p1.mobile.putong.data.OMSMercuryType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.sina.weibo.sdk.constant.WBConstants;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

    /* JADX INFO: renamed from: j */
    public static boolean f65111j;

    /* JADX INFO: renamed from: k */
    public static final Map<ClassId, KotlinClassHeader.Kind> f65112k;

    /* JADX INFO: renamed from: a */
    public int[] f65113a = null;

    /* JADX INFO: renamed from: b */
    public String f65114b = null;

    /* JADX INFO: renamed from: c */
    public int f65115c = 0;

    /* JADX INFO: renamed from: d */
    public String f65116d = null;

    /* JADX INFO: renamed from: e */
    public String[] f65117e = null;

    /* JADX INFO: renamed from: f */
    public String[] f65118f = null;

    /* JADX INFO: renamed from: g */
    public String[] f65119g = null;

    /* JADX INFO: renamed from: h */
    public KotlinClassHeader.Kind f65120h = null;

    /* JADX INFO: renamed from: i */
    public String[] f65121i = null;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$b */
    public static abstract class AbstractC15231b implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

        /* JADX INFO: renamed from: a */
        public final List<String> f65122a = new ArrayList();

        /* JADX INFO: renamed from: e */
        private static /* synthetic */ void m90437e(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* JADX INFO: renamed from: a */
        public void mo90187a(@Nullable Object obj) {
            if (obj instanceof String) {
                this.f65122a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90188b(@NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            m90437e(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* JADX INFO: renamed from: c */
        public void mo90189c(@NotNull ClassId classId, @NotNull Name name) {
            if (classId == null) {
                m90437e(0);
            }
            if (name == null) {
                m90437e(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* JADX INFO: renamed from: d */
        public void mo90190d(@NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m90437e(2);
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo90438f(@NotNull String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnd() {
            mo90438f((String[]) this.f65122a.toArray(new String[0]));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c */
    public class C15232c implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c$a */
        public class a extends AbstractC15231b {
            public a() {
            }

            /* JADX INFO: renamed from: e */
            public static /* synthetic */ void m90442e(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", LovePlanetStage.result, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC15231b
            /* JADX INFO: renamed from: f */
            public void mo90438f(@NotNull String[] strArr) {
                if (strArr == null) {
                    m90442e(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65117e = strArr;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c$b */
        public class b extends AbstractC15231b {
            public b() {
            }

            /* JADX INFO: renamed from: e */
            private static /* synthetic */ void m90443e(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", LovePlanetStage.result, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC15231b
            /* JADX INFO: renamed from: f */
            public void mo90438f(@NotNull String[] strArr) {
                if (strArr == null) {
                    m90443e(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65118f = strArr;
            }
        }

        public C15232c() {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m90439f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: a */
        public void mo90179a(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (classId == null) {
                m90439f(1);
            }
            if (name2 == null) {
                m90439f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90180b(@Nullable Name name, @NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            m90439f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public void mo90181c(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m90439f(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public void mo90182d(@Nullable Name name, @Nullable Object obj) {
            if (name == null) {
                return;
            }
            String strM91082b = name.m91082b();
            if ("k".equals(strM91082b)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f65120h = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if (OMSMercuryType.f38792mv.equals(strM91082b)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f65113a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strM91082b)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    ReadKotlinClassHeaderAnnotationVisitor.this.f65114b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strM91082b)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f65115c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strM91082b) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65116d = str2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: e */
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo90183e(@Nullable Name name) {
            String strM91082b = name != null ? name.m91082b() : null;
            if ("d1".equals(strM91082b)) {
                return m90440g();
            }
            if ("d2".equals(strM91082b)) {
                return m90441h();
            }
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m90440g() {
            return new a();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m90441h() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$d */
    public class C15233d implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$d$a */
        public class a extends AbstractC15231b {
            public a() {
            }

            /* JADX INFO: renamed from: e */
            private static /* synthetic */ void m90446e(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", LovePlanetStage.result, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC15231b
            /* JADX INFO: renamed from: f */
            public void mo90438f(@NotNull String[] strArr) {
                if (strArr == null) {
                    m90446e(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65121i = strArr;
            }
        }

        public C15233d() {
        }

        /* JADX INFO: renamed from: f */
        private static /* synthetic */ void m90444f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: a */
        public void mo90179a(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (classId == null) {
                m90444f(1);
            }
            if (name2 == null) {
                m90444f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90180b(@Nullable Name name, @NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            m90444f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public void mo90181c(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m90444f(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public void mo90182d(@Nullable Name name, @Nullable Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: e */
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo90183e(@Nullable Name name) {
            if ("b".equals(name != null ? name.m91082b() : null)) {
                return m90445g();
            }
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m90445g() {
            return new a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e */
    public class C15234e implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e$a */
        public class a extends AbstractC15231b {
            public a() {
            }

            /* JADX INFO: renamed from: e */
            private static /* synthetic */ void m90450e(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC15231b
            /* JADX INFO: renamed from: f */
            public void mo90438f(@NotNull String[] strArr) {
                if (strArr == null) {
                    m90450e(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65117e = strArr;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e$b */
        public class b extends AbstractC15231b {
            public b() {
            }

            /* JADX INFO: renamed from: e */
            private static /* synthetic */ void m90451e(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC15231b
            /* JADX INFO: renamed from: f */
            public void mo90438f(@NotNull String[] strArr) {
                if (strArr == null) {
                    m90451e(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65118f = strArr;
            }
        }

        public C15234e() {
        }

        /* JADX INFO: renamed from: f */
        private static /* synthetic */ void m90447f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m90448g() {
            return new a();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m90449h() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: a */
        public void mo90179a(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (classId == null) {
                m90447f(1);
            }
            if (name2 == null) {
                m90447f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90180b(@Nullable Name name, @NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            m90447f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public void mo90181c(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m90447f(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public void mo90182d(@Nullable Name name, @Nullable Object obj) {
            if (name == null) {
                return;
            }
            String strM91082b = name.m91082b();
            if (WBConstants.AUTH_PARAMS_VERSION.equals(strM91082b)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f65113a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strM91082b)) {
                ReadKotlinClassHeaderAnnotationVisitor.this.f65114b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: e */
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo90183e(@Nullable Name name) {
            String strM91082b = name != null ? name.m91082b() : null;
            if ("data".equals(strM91082b) || "filePartClassNames".equals(strM91082b)) {
                return m90448g();
            }
            if ("strings".equals(strM91082b)) {
                return m90449h();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }
    }

    static {
        try {
            f65111j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f65111j = false;
        }
        HashMap map = new HashMap();
        f65112k = map;
        map.put(ClassId.m91033k(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(ClassId.m91033k(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(ClassId.m91033k(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(ClassId.m91033k(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(ClassId.m91033k(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m90425c(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    @Nullable
    /* JADX INFO: renamed from: b */
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo88132b(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            m90425c(0);
        }
        if (sourceElement == null) {
            m90425c(1);
        }
        FqName fqNameM91034a = classId.m91034a();
        if (fqNameM91034a.equals(JvmAnnotationNames.f64693a)) {
            return new C15232c();
        }
        if (fqNameM91034a.equals(JvmAnnotationNames.f64712t)) {
            return new C15233d();
        }
        if (f65111j || this.f65120h != null || (kind = f65112k.get(classId)) == null) {
            return null;
        }
        this.f65120h = kind;
        return new C15234e();
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public KotlinClassHeader m90434l(MetadataVersion metadataVersion) {
        if (this.f65120h == null || this.f65113a == null) {
            return null;
        }
        MetadataVersion metadataVersion2 = new MetadataVersion(this.f65113a, (this.f65115c & 8) != 0);
        if (!metadataVersion2.m90886h(metadataVersion)) {
            this.f65119g = this.f65117e;
            this.f65117e = null;
        } else if (m90436n() && this.f65117e == null) {
            return null;
        }
        String[] strArr = this.f65121i;
        return new KotlinClassHeader(this.f65120h, metadataVersion2, this.f65117e, this.f65119g, this.f65118f, this.f65114b, this.f65115c, this.f65116d, strArr != null ? BitEncoding.m91003e(strArr) : null);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public KotlinClassHeader m90435m() {
        return m90434l(MetadataVersion.INSTANCE);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m90436n() {
        KotlinClassHeader.Kind kind = this.f65120h;
        return kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }
}
