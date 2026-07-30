package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmEnumEntryExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmEnumEntry {

    /* JADX INFO: renamed from: a */
    @NotNull
    public String f65170a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<KmAnnotation> f65171b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmEnumEntryExtension> f65172c;

    public KmEnumEntry(@NotNull String str) {
        str.getClass();
        this.f65170a = str;
        this.f65171b = new ArrayList(0);
        List<MetadataExtensions> listM90174c = MetadataExtensions.Companion.m90174c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM90174c.iterator();
        while (it.hasNext()) {
            KmEnumEntryExtension kmEnumEntryExtensionMo90155b = ((MetadataExtensions) it.next()).mo90155b();
            if (kmEnumEntryExtensionMo90155b != null) {
                arrayList.add(kmEnumEntryExtensionMo90155b);
            }
        }
        this.f65172c = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m90028a() {
        return this.f65171b;
    }

    @NotNull
    public String toString() {
        return this.f65170a;
    }
}
