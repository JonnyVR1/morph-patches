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
import p149l.kz50;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <H> Collection<H> m91881b(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends CallableDescriptor> function1) {
        collection.getClass();
        function1.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetM93221a = SmartSet.Companion.m93221a();
        while (!linkedList.isEmpty()) {
            Object objFirst = CollectionsKt.first((List<? extends Object>) linkedList);
            SmartSet smartSetM93221a2 = SmartSet.Companion.m93221a();
            Collection<Suddo> collectionM91826p = OverridingUtil.m91826p(objFirst, linkedList, function1, new kz50(smartSetM93221a2));
            collectionM91826p.getClass();
            if (collectionM91826p.size() == 1 && smartSetM93221a2.isEmpty()) {
                Object objSingle = CollectionsKt.single(collectionM91826p);
                objSingle.getClass();
                smartSetM93221a.add(objSingle);
            } else {
                Sudfor sudfor = (Object) OverridingUtil.m91812L(collectionM91826p, function1);
                CallableDescriptor callableDescriptorInvoke = function1.invoke(sudfor);
                for (Suddo suddo : collectionM91826p) {
                    suddo.getClass();
                    if (!OverridingUtil.m91805B(callableDescriptorInvoke, function1.invoke(suddo))) {
                        smartSetM93221a2.add(suddo);
                    }
                }
                if (!smartSetM93221a2.isEmpty()) {
                    smartSetM93221a.addAll(smartSetM93221a2);
                }
                smartSetM93221a.add(sudfor);
            }
        }
        return smartSetM93221a;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m91882c(SmartSet smartSet, Object obj) {
        obj.getClass();
        smartSet.add(obj);
        return Unit.INSTANCE;
    }
}
