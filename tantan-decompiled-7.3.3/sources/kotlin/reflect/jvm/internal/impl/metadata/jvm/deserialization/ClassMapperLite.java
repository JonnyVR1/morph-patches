package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p153l.c4s;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassMapperLite {

    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f66118a = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', Character.valueOf(Constants.INAPP_POSITION_TOP), Character.valueOf(Constants.INAPP_POSITION_LEFT), 'i', 'n'}), "", null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, String> f66119b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"Boolean", "Z", "Char", c4s.C_ZONE, "Byte", "B", "Short", p7f.LATITUDE_SOUTH, "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        int iM88280c = ProgressionUtilKt.m88280c(0, listListOf.size() - 1, 2);
        if (iM88280c >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f66118a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listListOf.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listListOf.get(i2));
                linkedHashMap.put(str + '/' + ((String) listListOf.get(i)) + "Array", "[" + ((String) listListOf.get(i2)));
                if (i == iM88280c) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f66118a + "/Unit", p7f.GPS_MEASUREMENT_INTERRUPTED);
        m91896a(linkedHashMap, "Any", "java/lang/Object");
        m91896a(linkedHashMap, "Nothing", "java/lang/Void");
        m91896a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            m91896a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt.listOf((Object[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            m91896a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m91896a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m91896a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m91896a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m91896a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m91896a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f66118a;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i3);
            m91896a(linkedHashMap, "Function" + i3, sb2.toString());
            m91896a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt.listOf((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            m91896a(linkedHashMap, str5 + ".Companion", f66118a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f66119b = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m91896a(Map<String, String> map, String str, String str2) {
        map.put(f66118a + '/' + str, "L" + str2 + ';');
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m91897b(@NotNull String str) {
        str.getClass();
        String str2 = f66119b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + C15493d.m94369E(str, '.', '$', false, 4, null) + ';';
    }
}
