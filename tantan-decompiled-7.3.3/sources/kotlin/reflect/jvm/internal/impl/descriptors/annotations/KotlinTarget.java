package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.seamless.xhtml.XHTML;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public enum KotlinTarget {
    CLASS(XHTML.ATTR.CLASS, false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY(XHTML.ATTR.CLASS, false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);


    @NotNull
    private static final Set<KotlinTarget> ALL_TARGET_SET;

    @NotNull
    private static final List<KotlinTarget> ANNOTATION_CLASS_LIST;

    @NotNull
    private static final List<KotlinTarget> CLASS_LIST;

    @NotNull
    private static final List<KotlinTarget> COMPANION_OBJECT_LIST;

    @NotNull
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET;

    @NotNull
    private static final List<KotlinTarget> ENUM_ENTRY_LIST;

    @NotNull
    private static final List<KotlinTarget> ENUM_LIST;

    @NotNull
    private static final List<KotlinTarget> FILE_LIST;

    @NotNull
    private static final List<KotlinTarget> FUNCTION_LIST;

    @NotNull
    private static final List<KotlinTarget> INTERFACE_LIST;

    @NotNull
    private static final List<KotlinTarget> LOCAL_CLASS_LIST;

    @NotNull
    private static final List<KotlinTarget> OBJECT_LIST;

    @NotNull
    private static final List<KotlinTarget> PROPERTY_GETTER_LIST;

    @NotNull
    private static final List<KotlinTarget> PROPERTY_SETTER_LIST;

    @NotNull
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING;

    @NotNull
    private final String description;
    private final boolean isDefault;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final HashMap<String, KotlinTarget> map = new HashMap<>();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        for (KotlinTarget kotlinTarget : getEntries()) {
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        EnumEntries<KotlinTarget> entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : entries) {
            if (kotlinTarget2.isDefault) {
                arrayList.add(kotlinTarget2);
            }
        }
        DEFAULT_TARGET_SET = CollectionsKt.toSet(arrayList);
        ALL_TARGET_SET = CollectionsKt.toSet(getEntries());
        KotlinTarget kotlinTarget3 = ANNOTATION_CLASS;
        KotlinTarget kotlinTarget4 = CLASS;
        ANNOTATION_CLASS_LIST = CollectionsKt.listOf((Object[]) new KotlinTarget[]{kotlinTarget3, kotlinTarget4});
        LOCAL_CLASS_LIST = CollectionsKt.listOf((Object[]) new KotlinTarget[]{LOCAL_CLASS, kotlinTarget4});
        CLASS_LIST = CollectionsKt.listOf((Object[]) new KotlinTarget[]{CLASS_ONLY, kotlinTarget4});
        KotlinTarget kotlinTarget5 = COMPANION_OBJECT;
        KotlinTarget kotlinTarget6 = OBJECT;
        COMPANION_OBJECT_LIST = CollectionsKt.listOf((Object[]) new KotlinTarget[]{kotlinTarget5, kotlinTarget6, kotlinTarget4});
        OBJECT_LIST = CollectionsKt.listOf((Object[]) new KotlinTarget[]{STANDALONE_OBJECT, kotlinTarget6, kotlinTarget4});
        INTERFACE_LIST = CollectionsKt.listOf((Object[]) new KotlinTarget[]{INTERFACE, kotlinTarget4});
        ENUM_LIST = CollectionsKt.listOf((Object[]) new KotlinTarget[]{ENUM_CLASS, kotlinTarget4});
        KotlinTarget kotlinTarget7 = ENUM_ENTRY;
        KotlinTarget kotlinTarget8 = PROPERTY;
        KotlinTarget kotlinTarget9 = FIELD;
        ENUM_ENTRY_LIST = CollectionsKt.listOf((Object[]) new KotlinTarget[]{kotlinTarget7, kotlinTarget8, kotlinTarget9});
        KotlinTarget kotlinTarget10 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = CollectionsKt.listOf(kotlinTarget10);
        KotlinTarget kotlinTarget11 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = CollectionsKt.listOf(kotlinTarget11);
        FUNCTION_LIST = CollectionsKt.listOf(FUNCTION);
        KotlinTarget kotlinTarget12 = FILE;
        FILE_LIST = CollectionsKt.listOf(kotlinTarget12);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget13 = VALUE_PARAMETER;
        USE_SITE_MAPPING = MapsKt.mapOf(TuplesKt.m88129a(annotationUseSiteTarget, kotlinTarget13), TuplesKt.m88129a(AnnotationUseSiteTarget.FIELD, kotlinTarget9), TuplesKt.m88129a(AnnotationUseSiteTarget.PROPERTY, kotlinTarget8), TuplesKt.m88129a(AnnotationUseSiteTarget.FILE, kotlinTarget12), TuplesKt.m88129a(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget11), TuplesKt.m88129a(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget10), TuplesKt.m88129a(AnnotationUseSiteTarget.RECEIVER, kotlinTarget13), TuplesKt.m88129a(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget13), TuplesKt.m88129a(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget9));
    }

    /* synthetic */ KotlinTarget(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }

    @NotNull
    public static EnumEntries<KotlinTarget> getEntries() {
        return $ENTRIES;
    }

    KotlinTarget(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }
}
