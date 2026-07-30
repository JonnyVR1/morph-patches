package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmEnumEntryExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmEnumEntry {

    /* JADX INFO: renamed from: a */
    @NotNull
    public String f64496a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<KmAnnotation> f64497b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmEnumEntryExtension> f64498c;

    public KmEnumEntry(@NotNull String str) {
        str.getClass();
        this.f64496a = str;
        this.f64497b = new ArrayList(0);
        List<MetadataExtensions> listM89283c = MetadataExtensions.Companion.m89283c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM89283c.iterator();
        while (it.hasNext()) {
            KmEnumEntryExtension kmEnumEntryExtensionMo89264b = ((MetadataExtensions) it.next()).mo89264b();
            if (kmEnumEntryExtensionMo89264b != null) {
                arrayList.add(kmEnumEntryExtensionMo89264b);
            }
        }
        this.f64498c = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m89137a() {
        return this.f64497b;
    }

    @NotNull
    public String toString() {
        return this.f64496a;
    }
}
