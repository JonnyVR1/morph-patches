package kotlin.reflect.jvm.internal.impl.resolve;

import Sudchar.Suddo;
import Sudchar.Sudfor;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import p153l.p760;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <H> Collection<H> m92772b(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends CallableDescriptor> function1) {
        collection.getClass();
        function1.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetM94112a = SmartSet.Companion.m94112a();
        while (!linkedList.isEmpty()) {
            Object objFirst = CollectionsKt.first((List<? extends Object>) linkedList);
            SmartSet smartSetM94112a2 = SmartSet.Companion.m94112a();
            Collection<Suddo> collectionM92717p = OverridingUtil.m92717p(objFirst, linkedList, function1, new p760(smartSetM94112a2));
            collectionM92717p.getClass();
            if (collectionM92717p.size() == 1 && smartSetM94112a2.isEmpty()) {
                Object objSingle = CollectionsKt.single(collectionM92717p);
                objSingle.getClass();
                smartSetM94112a.add(objSingle);
            } else {
                Sudfor sudfor = (Object) OverridingUtil.m92703L(collectionM92717p, function1);
                CallableDescriptor callableDescriptorInvoke = function1.invoke(sudfor);
                for (Suddo suddo : collectionM92717p) {
                    suddo.getClass();
                    if (!OverridingUtil.m92696B(callableDescriptorInvoke, function1.invoke(suddo))) {
                        smartSetM94112a2.add(suddo);
                    }
                }
                if (!smartSetM94112a2.isEmpty()) {
                    smartSetM94112a.addAll(smartSetM94112a2);
                }
                smartSetM94112a.add(sudfor);
            }
        }
        return smartSetM94112a;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m92773c(SmartSet smartSet, Object obj) {
        obj.getClass();
        smartSet.add(obj);
        return Unit.INSTANCE;
    }
}
