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
import kotlin.ranges.C15274a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureEnhancementBuilder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<String, PredefinedFunctionEnhancementInfo> f65654a = new LinkedHashMap();

    public final class ClassEnhancementBuilder {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f65655a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SignatureEnhancementBuilder f65656b;

        @SourceDebugExtension
        public final class FunctionEnhancementBuilder {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final String f65657a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public final String f65658b;

            /* JADX INFO: renamed from: c */
            @NotNull
            public final List<Pair<String, TypeEnhancementInfo>> f65659c;

            /* JADX INFO: renamed from: d */
            @NotNull
            public Pair<String, TypeEnhancementInfo> f65660d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ClassEnhancementBuilder f65661e;

            public FunctionEnhancementBuilder(@NotNull ClassEnhancementBuilder classEnhancementBuilder, @Nullable String str, String str2) {
                str.getClass();
                this.f65661e = classEnhancementBuilder;
                this.f65657a = str;
                this.f65658b = str2;
                this.f65659c = new ArrayList();
                this.f65660d = TuplesKt.m88129a(p7f.GPS_MEASUREMENT_INTERRUPTED, null);
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Pair<String, PredefinedFunctionEnhancementInfo> m90989a() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String strM90988c = this.f65661e.m90988c();
                String str = this.f65657a;
                List<Pair<String, TypeEnhancementInfo>> list = this.f65659c;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).getFirst());
                }
                String strM91287m = signatureBuildingComponents.m91287m(strM90988c, signatureBuildingComponents.m91286k(str, arrayList, this.f65660d.getFirst()));
                TypeEnhancementInfo second = this.f65660d.getSecond();
                List<Pair<String, TypeEnhancementInfo>> list2 = this.f65659c;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((TypeEnhancementInfo) ((Pair) it2.next()).getSecond());
                }
                return TuplesKt.m88129a(strM91287m, new PredefinedFunctionEnhancementInfo(second, arrayList2, this.f65658b));
            }

            /* JADX INFO: renamed from: b */
            public final void m90990b(@NotNull String str, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                TypeEnhancementInfo typeEnhancementInfo;
                str.getClass();
                javaTypeQualifiersArr.getClass();
                List<Pair<String, TypeEnhancementInfo>> list = this.f65659c;
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(javaTypeQualifiersArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
                    for (IndexedValue indexedValue : iterableWithIndex) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.getIndex()), (JavaTypeQualifiers) indexedValue.getValue());
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                list.add(TuplesKt.m88129a(str, typeEnhancementInfo));
            }

            /* JADX INFO: renamed from: c */
            public final void m90991c(@NotNull String str, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                str.getClass();
                javaTypeQualifiersArr.getClass();
                Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(javaTypeQualifiersArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
                for (IndexedValue indexedValue : iterableWithIndex) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.getIndex()), (JavaTypeQualifiers) indexedValue.getValue());
                }
                this.f65660d = TuplesKt.m88129a(str, new TypeEnhancementInfo(linkedHashMap));
            }

            /* JADX INFO: renamed from: d */
            public final void m90992d(@NotNull JvmPrimitiveType jvmPrimitiveType) {
                jvmPrimitiveType.getClass();
                String desc = jvmPrimitiveType.getDesc();
                desc.getClass();
                this.f65660d = TuplesKt.m88129a(desc, null);
            }
        }

        public ClassEnhancementBuilder(@NotNull SignatureEnhancementBuilder signatureEnhancementBuilder, String str) {
            str.getClass();
            this.f65656b = signatureEnhancementBuilder;
            this.f65655a = str;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m90986b(ClassEnhancementBuilder classEnhancementBuilder, String str, String str2, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            classEnhancementBuilder.m90987a(str, str2, function1);
        }

        /* JADX INFO: renamed from: a */
        public final void m90987a(@NotNull String str, @Nullable String str2, @NotNull Function1<? super FunctionEnhancementBuilder, Unit> function1) {
            str.getClass();
            function1.getClass();
            Map map = this.f65656b.f65654a;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, str, str2);
            function1.invoke(functionEnhancementBuilder);
            Pair<String, PredefinedFunctionEnhancementInfo> pairM90989a = functionEnhancementBuilder.m90989a();
            map.put(pairM90989a.getFirst(), pairM90989a.getSecond());
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final String m90988c() {
            return this.f65655a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, PredefinedFunctionEnhancementInfo> m90985b() {
        return this.f65654a;
    }
}
