package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class ValueClassRepresentation<Type extends RigidTypeMarker> {
    public /* synthetic */ ValueClassRepresentation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo89427a(@NotNull Name name);

    @NotNull
    /* JADX INFO: renamed from: b */
    public final <Other extends SimpleTypeMarker> ValueClassRepresentation<Other> m89504b(@NotNull Function1<? super Type, ? extends Other> function1) {
        function1.getClass();
        if (this instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) this;
            return new InlineClassRepresentation(inlineClassRepresentation.m89428c(), function1.invoke(inlineClassRepresentation.m89429d()));
        }
        if (!(this instanceof MultiFieldValueClassRepresentation)) {
            nbr.m162172a();
            return null;
        }
        List<Pair<Name, Type>> listM89442c = ((MultiFieldValueClassRepresentation) this).m89442c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM89442c, 10));
        Iterator<T> it = listM89442c.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(TuplesKt.m88129a((Name) pair.component1(), function1.invoke((RigidTypeMarker) pair.component2())));
        }
        return new MultiFieldValueClassRepresentation(arrayList);
    }

    private ValueClassRepresentation() {
    }
}
