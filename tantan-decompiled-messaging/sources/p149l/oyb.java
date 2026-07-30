package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateException;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateType;
import com.clevertap.android.sdk.inapp.customtemplates.TemplateArgumentType;
import com.facebook.AuthenticationTokenClaims;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0002\u001b\u0018BE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001b\u0010#R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001a\u0010\r\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b'\u0010!¨\u0006("}, m87232d2 = {"Ll/oyb;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/qyb;", "presenter", "", "isVisual", "", "Ll/zgi0;", "args", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", "type", "isSystemDefined", "<init>", "(Ljava/lang/String;Ll/qyb;ZLjava/util/List;Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "Ll/qyb;", Constants.INAPP_DATA_TAG, "()Ll/qyb;", "Z", "g", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "e", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", "f", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class oyb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final qyb<?> presenter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isVisual;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<zgi0> args;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CustomTemplateType type;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isSystemDefined;

    /* JADX INFO: renamed from: l.oyb$b */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00008\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/oyb$b;", "Ll/oyb$a;", "Ll/jaj;", "", "isVisual", "<init>", "(Z)V", RXScreenCaptureService.KEY_INDEX, "Ll/oyb$b;", "k", "()Ll/oyb$b;", "thisRef", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C19079b extends AbstractC19078a<jaj, C19079b> {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        private final C19079b thisRef;

        public C19079b(boolean z) {
            super(CustomTemplateType.FUNCTION, z, null);
            this.thisRef = this;
        }

        @Override // p149l.oyb.AbstractC19078a
        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter and merged with bridge method [inline-methods] */
        public C19079b mo166642e() {
            return this.thisRef;
        }
    }

    private oyb(String str, qyb<?> qybVar, boolean z, List<zgi0> list, CustomTemplateType customTemplateType, boolean z2) {
        this.name = str;
        this.presenter = qybVar;
        this.isVisual = z;
        this.args = list;
        this.type = customTemplateType;
        this.isSystemDefined = z2;
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m166630a(zgi0 zgi0Var) {
        zgi0Var.getClass();
        StringBuilder sb = new StringBuilder("\t");
        sb.append(zgi0Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
        sb.append(" = ");
        Object defaultValue = zgi0Var.getDefaultValue();
        if (defaultValue == null) {
            defaultValue = zgi0Var.getType();
        }
        sb.append(defaultValue);
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<zgi0> m166631b() {
        return this.args;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final qyb<?> m166633d() {
        return this.presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final CustomTemplateType getType() {
        return this.type;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m87488d(oyb.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        return Intrinsics.m87488d(this.name, ((oyb) other).name);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSystemDefined() {
        return this.isSystemDefined;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsVisual() {
        return this.isVisual;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomTemplate {\nname = " + this.name + ",\nisVisual = " + this.isVisual + ",\ntype = " + this.type + ",\nargs = {\n" + CollectionsKt.joinToString$default(this.args, ",\n", null, null, 0, null, new Function1() { // from class: l.nyb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oyb.m166630a((zgi0) obj);
            }
        }, 30, null) + "\n}}";
    }

    public /* synthetic */ oyb(String str, qyb qybVar, boolean z, List list, CustomTemplateType customTemplateType, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, qybVar, z, list, customTemplateType, z2);
    }

    /* JADX INFO: renamed from: l.oyb$a */
    @Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u00020\u0004B\u0019\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J)\u0010\"\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020!2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%R\"\u0010*\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0011028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103R\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00105R\u0014\u00107\u001a\u00028\u00018$X¤\u0004¢\u0006\u0006\u001a\u0004\b.\u00106\u0082\u0001\u00018¨\u00069"}, m87232d2 = {"Ll/oyb$a;", "Ll/qyb;", "P", j6f.GPS_DIRECTION_TRUE, "", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", "type", "", "isVisual", "<init>", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;Z)V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "j", "(Ljava/lang/String;)V", "", "Ll/zgi0;", Constants.INAPP_DATA_TAG, "()Ljava/util/List;", "f", "(Ljava/lang/String;)Ll/oyb$a;", "defaultValue", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;)Ll/oyb$a;", "b", "(Ljava/lang/String;Z)Ll/oyb$a;", "presenter", "g", "(Ll/qyb;)Ll/oyb$a;", "Ll/oyb;", "c", "()Ll/oyb;", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "a", "(Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;Ljava/lang/Object;)V", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", "Z", "isSystemDefined$clevertap_core_release", "()Z", "h", "(Z)V", "isSystemDefined", "Ljava/lang/String;", CustomTemplateInAppData.KEY_TEMPLATE_NAME, "", "e", "Ljava/util/Set;", "argsNames", "parentArgsNames", "", "Ljava/util/List;", "args", "Ll/qyb;", "()Ll/oyb$a;", "thisRef", "Ll/oyb$b;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static abstract class AbstractC19078a<P extends qyb<?>, T extends AbstractC19078a<P, T>> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final CustomTemplateType type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isVisual;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean isSystemDefined;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private String templateName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final Set<String> argsNames;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final Set<String> parentArgsNames;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private final List<zgi0> args;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        private P presenter;

        /* JADX INFO: renamed from: l.oyb$a$a */
        @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return cn5.m107733d(((zgi0) t).getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), ((zgi0) t2).getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
            }
        }

        private AbstractC19078a(CustomTemplateType customTemplateType, boolean z) {
            this.type = customTemplateType;
            this.isVisual = z;
            this.argsNames = new LinkedHashSet();
            this.parentArgsNames = new LinkedHashSet();
            this.args = new ArrayList();
        }

        /* JADX INFO: renamed from: d */
        private final List<zgi0> m166637d() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (zgi0 zgi0Var : this.args) {
                String str = (String) CollectionsKt.first(StringsKt.split$default(zgi0Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), new String[]{"."}, false, 2, 2, null));
                if (linkedHashMap.containsKey(str)) {
                    List list = (List) linkedHashMap.get(str);
                    if (list != null) {
                        list.add(zgi0Var);
                    }
                } else {
                    linkedHashMap.put(str, CollectionsKt.mutableListOf(zgi0Var));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, CollectionsKt.sortedWith(CollectionsKt.toList((Iterable) ((Map.Entry) it.next()).getValue()), new a()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: j */
        private final void m166638j(String name) {
            int iB0 = StringsKt.m93435b0(name, '.', 0, false, 4, null);
            while (iB0 != -1) {
                String strSubstring = name.substring(0, iB0);
                if (this.argsNames.contains(strSubstring)) {
                    throw new CustomTemplateException("Argument with name \"" + name + "\" is already defined", null, 2, null);
                }
                this.parentArgsNames.add(strSubstring);
                iB0 = StringsKt.m93435b0(name, '.', iB0 + 1, false, 4, null);
            }
            if (this.parentArgsNames.contains(name)) {
                throw new CustomTemplateException("Argument with name \"" + name + "\" is already defined", null, 2, null);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m166639a(@NotNull String name, @NotNull TemplateArgumentType type, @Nullable Object defaultValue) {
            name.getClass();
            type.getClass();
            if (StringsKt.m93438e0(name)) {
                throw new CustomTemplateException("Argument name must not be blank", null, 2, null);
            }
            if (C15386d.m93483J(name, ".", false, 2, null) || C15386d.m93489w(name, ".", false, 2, null) || StringsKt.m93412P(name, "..", false, 2, null)) {
                throw new CustomTemplateException("Argument name must not begin or end with a \".\" nor have consecutive \".\"", null, 2, null);
            }
            if (this.argsNames.contains(name)) {
                throw new CustomTemplateException("Argument with name \"" + name + "\" is already defined", null, 2, null);
            }
            m166638j(name);
            this.args.add(new zgi0(name, type, defaultValue));
            this.argsNames.add(name);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final T m166640b(@NotNull String name, boolean defaultValue) {
            name.getClass();
            m166639a(name, TemplateArgumentType.BOOLEAN, Boolean.valueOf(defaultValue));
            return (T) mo166642e();
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final oyb m166641c() {
            P p = this.presenter;
            if (p == null) {
                throw new CustomTemplateException("CustomTemplate must have a presenter", null, 2, null);
            }
            String str = this.templateName;
            if (str != null) {
                return new oyb(str, p, this.isVisual, m166637d(), this.type, this.isSystemDefined, null);
            }
            throw new CustomTemplateException("CustomTemplate must have a name", null, 2, null);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public abstract T mo166642e();

        @NotNull
        /* JADX INFO: renamed from: f */
        public final T m166643f(@NotNull String name) {
            name.getClass();
            if (this.templateName == null) {
                if (StringsKt.m93438e0(name)) {
                    throw new CustomTemplateException("CustomTemplate must have a non-blank name", null, 2, null);
                }
                this.templateName = name;
                return (T) mo166642e();
            }
            throw new CustomTemplateException("CustomTemplate name is already set as \"" + this.templateName + '\"', null, 2, null);
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final T m166644g(@NotNull P presenter) {
            presenter.getClass();
            this.presenter = presenter;
            return (T) mo166642e();
        }

        /* JADX INFO: renamed from: h */
        public final void m166645h(boolean z) {
            this.isSystemDefined = z;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final T m166646i(@NotNull String name, @NotNull String defaultValue) {
            name.getClass();
            defaultValue.getClass();
            m166639a(name, TemplateArgumentType.STRING, defaultValue);
            return (T) mo166642e();
        }

        public /* synthetic */ AbstractC19078a(CustomTemplateType customTemplateType, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(customTemplateType, z);
        }
    }
}
