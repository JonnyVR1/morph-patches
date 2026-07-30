package kotlin.text;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.Grouping;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010(\n\u0002\b\u0006\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"kotlin/text/StringsKt___StringsKt$groupingBy$1", "Lkotlin/collections/Grouping;", "", "", "sourceIterator", "()Ljava/util/Iterator;", "element", "a", "(C)Ljava/lang/Object;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 176)
@SourceDebugExtension
public final class StringsKt___StringsKt$groupingBy$1 implements Grouping<Character, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CharSequence f66640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1<Character, Object> f66641b;

    /* JADX INFO: renamed from: a */
    public Object m93460a(char element) {
        return this.f66641b.invoke(Character.valueOf(element));
    }

    @Override // kotlin.collections.Grouping
    public /* bridge */ /* synthetic */ Object keyOf(Character ch) {
        return m93460a(ch.charValue());
    }

    @Override // kotlin.collections.Grouping
    public Iterator<Character> sourceIterator() {
        return StringsKt__StringsKt.m93439f0(this.f66640a);
    }
}
