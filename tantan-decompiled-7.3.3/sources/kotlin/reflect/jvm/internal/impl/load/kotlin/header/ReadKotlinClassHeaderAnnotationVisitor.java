package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.p051p1.mobile.putong.data.OMSMercuryType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
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
    public static boolean f65785j;

    /* JADX INFO: renamed from: k */
    public static final Map<ClassId, KotlinClassHeader.Kind> f65786k;

    /* JADX INFO: renamed from: a */
    public int[] f65787a = null;

    /* JADX INFO: renamed from: b */
    public String f65788b = null;

    /* JADX INFO: renamed from: c */
    public int f65789c = 0;

    /* JADX INFO: renamed from: d */
    public String f65790d = null;

    /* JADX INFO: renamed from: e */
    public String[] f65791e = null;

    /* JADX INFO: renamed from: f */
    public String[] f65792f = null;

    /* JADX INFO: renamed from: g */
    public String[] f65793g = null;

    /* JADX INFO: renamed from: h */
    public KotlinClassHeader.Kind f65794h = null;

    /* JADX INFO: renamed from: i */
    public String[] f65795i = null;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$b */
    public static abstract class AbstractC15338b implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

        /* JADX INFO: renamed from: a */
        public final List<String> f65796a = new ArrayList();

        /* JADX INFO: renamed from: e */
        private static /* synthetic */ void m91328e(int i) {
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
        public void mo91078a(@Nullable Object obj) {
            if (obj instanceof String) {
                this.f65796a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91079b(@NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            m91328e(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* JADX INFO: renamed from: c */
        public void mo91080c(@NotNull ClassId classId, @NotNull Name name) {
            if (classId == null) {
                m91328e(0);
            }
            if (name == null) {
                m91328e(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* JADX INFO: renamed from: d */
        public void mo91081d(@NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m91328e(2);
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo91329f(@NotNull String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnd() {
            mo91329f((String[]) this.f65796a.toArray(new String[0]));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c */
    public class C15339c implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c$a */
        public class a extends AbstractC15338b {
            public a() {
            }

            /* JADX INFO: renamed from: e */
            public static /* synthetic */ void m91333e(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", LovePlanetStage.result, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC15338b
            /* JADX INFO: renamed from: f */
            public void mo91329f(@NotNull String[] strArr) {
                if (strArr == null) {
                    m91333e(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65791e = strArr;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c$b */
        public class b extends AbstractC15338b {
            public b() {
            }

            /* JADX INFO: renamed from: e */
            private static /* synthetic */ void m91334e(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", LovePlanetStage.result, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC15338b
            /* JADX INFO: renamed from: f */
            public void mo91329f(@NotNull String[] strArr) {
                if (strArr == null) {
                    m91334e(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65792f = strArr;
            }
        }

        public C15339c() {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m91330f(int i) {
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
        public void mo91070a(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (classId == null) {
                m91330f(1);
            }
            if (name2 == null) {
                m91330f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91071b(@Nullable Name name, @NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            m91330f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public void mo91072c(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m91330f(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public void mo91073d(@Nullable Name name, @Nullable Object obj) {
            if (name == null) {
                return;
            }
            String strM91973b = name.m91973b();
            if ("k".equals(strM91973b)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f65794h = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if (OMSMercuryType.f39640mv.equals(strM91973b)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f65787a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strM91973b)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    ReadKotlinClassHeaderAnnotationVisitor.this.f65788b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strM91973b)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f65789c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strM91973b) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65790d = str2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: e */
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo91074e(@Nullable Name name) {
            String strM91973b = name != null ? name.m91973b() : null;
            if ("d1".equals(strM91973b)) {
                return m91331g();
            }
            if ("d2".equals(strM91973b)) {
                return m91332h();
            }
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m91331g() {
            return new a();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m91332h() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$d */
    public class C15340d implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$d$a */
        public class a extends AbstractC15338b {
            public a() {
            }

            /* JADX INFO: renamed from: e */
            private static /* synthetic */ void m91337e(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", LovePlanetStage.result, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC15338b
            /* JADX INFO: renamed from: f */
            public void mo91329f(@NotNull String[] strArr) {
                if (strArr == null) {
                    m91337e(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65795i = strArr;
            }
        }

        public C15340d() {
        }

        /* JADX INFO: renamed from: f */
        private static /* synthetic */ void m91335f(int i) {
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
        public void mo91070a(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (classId == null) {
                m91335f(1);
            }
            if (name2 == null) {
                m91335f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91071b(@Nullable Name name, @NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            m91335f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public void mo91072c(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m91335f(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public void mo91073d(@Nullable Name name, @Nullable Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: e */
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo91074e(@Nullable Name name) {
            if ("b".equals(name != null ? name.m91973b() : null)) {
                return m91336g();
            }
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m91336g() {
            return new a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e */
    public class C15341e implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e$a */
        public class a extends AbstractC15338b {
            public a() {
            }

            /* JADX INFO: renamed from: e */
            private static /* synthetic */ void m91341e(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC15338b
            /* JADX INFO: renamed from: f */
            public void mo91329f(@NotNull String[] strArr) {
                if (strArr == null) {
                    m91341e(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65791e = strArr;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e$b */
        public class b extends AbstractC15338b {
            public b() {
            }

            /* JADX INFO: renamed from: e */
            private static /* synthetic */ void m91342e(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC15338b
            /* JADX INFO: renamed from: f */
            public void mo91329f(@NotNull String[] strArr) {
                if (strArr == null) {
                    m91342e(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f65792f = strArr;
            }
        }

        public C15341e() {
        }

        /* JADX INFO: renamed from: f */
        private static /* synthetic */ void m91338f(int i) {
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
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m91339g() {
            return new a();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m91340h() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: a */
        public void mo91070a(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (classId == null) {
                m91338f(1);
            }
            if (name2 == null) {
                m91338f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91071b(@Nullable Name name, @NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            m91338f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public void mo91072c(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m91338f(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public void mo91073d(@Nullable Name name, @Nullable Object obj) {
            if (name == null) {
                return;
            }
            String strM91973b = name.m91973b();
            if (WBConstants.AUTH_PARAMS_VERSION.equals(strM91973b)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f65787a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strM91973b)) {
                ReadKotlinClassHeaderAnnotationVisitor.this.f65788b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: e */
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo91074e(@Nullable Name name) {
            String strM91973b = name != null ? name.m91973b() : null;
            if ("data".equals(strM91973b) || "filePartClassNames".equals(strM91973b)) {
                return m91339g();
            }
            if ("strings".equals(strM91973b)) {
                return m91340h();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }
    }

    static {
        try {
            f65785j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f65785j = false;
        }
        HashMap map = new HashMap();
        f65786k = map;
        map.put(ClassId.m91924k(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(ClassId.m91924k(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(ClassId.m91924k(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(ClassId.m91924k(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(ClassId.m91924k(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m91316c(int i) {
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
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo89023b(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            m91316c(0);
        }
        if (sourceElement == null) {
            m91316c(1);
        }
        FqName fqNameM91925a = classId.m91925a();
        if (fqNameM91925a.equals(JvmAnnotationNames.f65367a)) {
            return new C15339c();
        }
        if (fqNameM91925a.equals(JvmAnnotationNames.f65386t)) {
            return new C15340d();
        }
        if (f65785j || this.f65794h != null || (kind = f65786k.get(classId)) == null) {
            return null;
        }
        this.f65794h = kind;
        return new C15341e();
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public KotlinClassHeader m91325l(MetadataVersion metadataVersion) {
        if (this.f65794h == null || this.f65787a == null) {
            return null;
        }
        MetadataVersion metadataVersion2 = new MetadataVersion(this.f65787a, (this.f65789c & 8) != 0);
        if (!metadataVersion2.m91777h(metadataVersion)) {
            this.f65793g = this.f65791e;
            this.f65791e = null;
        } else if (m91327n() && this.f65791e == null) {
            return null;
        }
        String[] strArr = this.f65795i;
        return new KotlinClassHeader(this.f65794h, metadataVersion2, this.f65791e, this.f65793g, this.f65792f, this.f65788b, this.f65789c, this.f65790d, strArr != null ? BitEncoding.m91894e(strArr) : null);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public KotlinClassHeader m91326m() {
        return m91325l(MetadataVersion.INSTANCE);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m91327n() {
        KotlinClassHeader.Kind kind = this.f65794h;
        return kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }
}
