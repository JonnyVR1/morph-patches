package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmValueParameterExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmValueParameter {

    /* JADX INFO: renamed from: a */
    public int f64562a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f64563b;

    /* JADX INFO: renamed from: c */
    public KmType f64564c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public KmType f64565d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public KmAnnotationArgument f64566e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmAnnotation> f64567f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmValueParameterExtension> f64568g;

    public KmValueParameter(int i, @NotNull String str) {
        str.getClass();
        this.f64562a = i;
        this.f64563b = str;
        this.f64567f = new ArrayList(0);
        List<MetadataExtensions> listM89283c = MetadataExtensions.Companion.m89283c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM89283c.iterator();
        while (it.hasNext()) {
            KmValueParameterExtension kmValueParameterExtensionMo89271i = ((MetadataExtensions) it.next()).mo89271i();
            if (kmValueParameterExtensionMo89271i != null) {
                arrayList.add(kmValueParameterExtensionMo89271i);
            }
        }
        this.f64568g = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m89190a() {
        return this.f64567f;
    }

    /* JADX INFO: renamed from: b */
    public final int m89191b() {
        return this.f64562a;
    }

    /* JADX INFO: renamed from: c */
    public final void m89192c(@Nullable KmAnnotationArgument kmAnnotationArgument) {
        this.f64566e = kmAnnotationArgument;
    }

    /* JADX INFO: renamed from: d */
    public final void m89193d(int i) {
        this.f64562a = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m89194e(@NotNull KmType kmType) {
        kmType.getClass();
        this.f64564c = kmType;
    }

    /* JADX INFO: renamed from: f */
    public final void m89195f(@Nullable KmType kmType) {
        this.f64565d = kmType;
    }
}
