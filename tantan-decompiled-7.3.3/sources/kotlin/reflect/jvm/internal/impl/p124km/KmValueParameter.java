package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmValueParameterExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmValueParameter {

    /* JADX INFO: renamed from: a */
    public int f65236a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f65237b;

    /* JADX INFO: renamed from: c */
    public KmType f65238c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public KmType f65239d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public KmAnnotationArgument f65240e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmAnnotation> f65241f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmValueParameterExtension> f65242g;

    public KmValueParameter(int i, @NotNull String str) {
        str.getClass();
        this.f65236a = i;
        this.f65237b = str;
        this.f65241f = new ArrayList(0);
        List<MetadataExtensions> listM90174c = MetadataExtensions.Companion.m90174c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM90174c.iterator();
        while (it.hasNext()) {
            KmValueParameterExtension kmValueParameterExtensionMo90162i = ((MetadataExtensions) it.next()).mo90162i();
            if (kmValueParameterExtensionMo90162i != null) {
                arrayList.add(kmValueParameterExtensionMo90162i);
            }
        }
        this.f65242g = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m90081a() {
        return this.f65241f;
    }

    /* JADX INFO: renamed from: b */
    public final int m90082b() {
        return this.f65236a;
    }

    /* JADX INFO: renamed from: c */
    public final void m90083c(@Nullable KmAnnotationArgument kmAnnotationArgument) {
        this.f65240e = kmAnnotationArgument;
    }

    /* JADX INFO: renamed from: d */
    public final void m90084d(int i) {
        this.f65236a = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m90085e(@NotNull KmType kmType) {
        kmType.getClass();
        this.f65238c = kmType;
    }

    /* JADX INFO: renamed from: f */
    public final void m90086f(@Nullable KmType kmType) {
        this.f65239d = kmType;
    }
}
