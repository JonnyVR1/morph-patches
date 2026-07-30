package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import p149l.b2s;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassMapperLite {

    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f65444a = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', Character.valueOf(Constants.INAPP_POSITION_TOP), Character.valueOf(Constants.INAPP_POSITION_LEFT), 'i', 'n'}), "", null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, String> f65445b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"Boolean", "Z", "Char", b2s.C_ZONE, "Byte", "B", "Short", j6f.LATITUDE_SOUTH, "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        int iM87391c = ProgressionUtilKt.m87391c(0, listListOf.size() - 1, 2);
        if (iM87391c >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f65444a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listListOf.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listListOf.get(i2));
                linkedHashMap.put(str + '/' + ((String) listListOf.get(i)) + "Array", "[" + ((String) listListOf.get(i2)));
                if (i == iM87391c) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f65444a + "/Unit", j6f.GPS_MEASUREMENT_INTERRUPTED);
        m91005a(linkedHashMap, "Any", "java/lang/Object");
        m91005a(linkedHashMap, "Nothing", "java/lang/Void");
        m91005a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            m91005a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt.listOf((Object[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            m91005a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m91005a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m91005a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m91005a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m91005a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m91005a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f65444a;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i3);
            m91005a(linkedHashMap, "Function" + i3, sb2.toString());
            m91005a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt.listOf((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            m91005a(linkedHashMap, str5 + ".Companion", f65444a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f65445b = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m91005a(Map<String, String> map, String str, String str2) {
        map.put(f65444a + '/' + str, "L" + str2 + ';');
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m91006b(@NotNull String str) {
        str.getClass();
        String str2 = f65445b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + C15386d.m93478E(str, '.', '$', false, 4, null) + ';';
    }
}
