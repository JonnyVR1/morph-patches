package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureEnhancementBuilder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<String, PredefinedFunctionEnhancementInfo> f64980a = new LinkedHashMap();

    public final class ClassEnhancementBuilder {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f64981a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SignatureEnhancementBuilder f64982b;

        @SourceDebugExtension
        public final class FunctionEnhancementBuilder {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final String f64983a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public final String f64984b;

            /* JADX INFO: renamed from: c */
            @NotNull
            public final List<Pair<String, TypeEnhancementInfo>> f64985c;

            /* JADX INFO: renamed from: d */
            @NotNull
            public Pair<String, TypeEnhancementInfo> f64986d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ClassEnhancementBuilder f64987e;

            public FunctionEnhancementBuilder(@NotNull ClassEnhancementBuilder classEnhancementBuilder, @Nullable String str, String str2) {
                str.getClass();
                this.f64987e = classEnhancementBuilder;
                this.f64983a = str;
                this.f64984b = str2;
                this.f64985c = new ArrayList();
                this.f64986d = TuplesKt.m87240a(j6f.GPS_MEASUREMENT_INTERRUPTED, null);
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Pair<String, PredefinedFunctionEnhancementInfo> m90098a() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String strM90097c = this.f64987e.m90097c();
                String str = this.f64983a;
                List<Pair<String, TypeEnhancementInfo>> list = this.f64985c;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).getFirst());
                }
                String strM90396m = signatureBuildingComponents.m90396m(strM90097c, signatureBuildingComponents.m90395k(str, arrayList, this.f64986d.getFirst()));
                TypeEnhancementInfo second = this.f64986d.getSecond();
                List<Pair<String, TypeEnhancementInfo>> list2 = this.f64985c;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((TypeEnhancementInfo) ((Pair) it2.next()).getSecond());
                }
                return TuplesKt.m87240a(strM90396m, new PredefinedFunctionEnhancementInfo(second, arrayList2, this.f64984b));
            }

            /* JADX INFO: renamed from: b */
            public final void m90099b(@NotNull String str, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                TypeEnhancementInfo typeEnhancementInfo;
                str.getClass();
                javaTypeQualifiersArr.getClass();
                List<Pair<String, TypeEnhancementInfo>> list = this.f64985c;
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(javaTypeQualifiersArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
                    for (IndexedValue indexedValue : iterableWithIndex) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.getIndex()), (JavaTypeQualifiers) indexedValue.getValue());
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                list.add(TuplesKt.m87240a(str, typeEnhancementInfo));
            }

            /* JADX INFO: renamed from: c */
            public final void m90100c(@NotNull String str, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                str.getClass();
                javaTypeQualifiersArr.getClass();
                Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(javaTypeQualifiersArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
                for (IndexedValue indexedValue : iterableWithIndex) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.getIndex()), (JavaTypeQualifiers) indexedValue.getValue());
                }
                this.f64986d = TuplesKt.m87240a(str, new TypeEnhancementInfo(linkedHashMap));
            }

            /* JADX INFO: renamed from: d */
            public final void m90101d(@NotNull JvmPrimitiveType jvmPrimitiveType) {
                jvmPrimitiveType.getClass();
                String desc = jvmPrimitiveType.getDesc();
                desc.getClass();
                this.f64986d = TuplesKt.m87240a(desc, null);
            }
        }

        public ClassEnhancementBuilder(@NotNull SignatureEnhancementBuilder signatureEnhancementBuilder, String str) {
            str.getClass();
            this.f64982b = signatureEnhancementBuilder;
            this.f64981a = str;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m90095b(ClassEnhancementBuilder classEnhancementBuilder, String str, String str2, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            classEnhancementBuilder.m90096a(str, str2, function1);
        }

        /* JADX INFO: renamed from: a */
        public final void m90096a(@NotNull String str, @Nullable String str2, @NotNull Function1<? super FunctionEnhancementBuilder, Unit> function1) {
            str.getClass();
            function1.getClass();
            Map map = this.f64982b.f64980a;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, str, str2);
            function1.invoke(functionEnhancementBuilder);
            Pair<String, PredefinedFunctionEnhancementInfo> pairM90098a = functionEnhancementBuilder.m90098a();
            map.put(pairM90098a.getFirst(), pairM90098a.getSecond());
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final String m90097c() {
            return this.f64981a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, PredefinedFunctionEnhancementInfo> m90094b() {
        return this.f64980a;
    }
}
