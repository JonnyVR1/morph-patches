package kotlin.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.MatcherMatchResult$groups$1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", FirebaseAnalytics.Param.INDEX, "get", "(I)Lkotlin/text/MatchGroup;", "getSize", "()I", "size", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MatcherMatchResult$groups$1 extends AbstractCollection<MatchGroup> implements MatchNamedGroupCollection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MatcherMatchResult f67306a;

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f67306a = matcherMatchResult;
    }

    /* JADX INFO: renamed from: c */
    public static MatchGroup m94262c(MatcherMatchResult$groups$1 matcherMatchResult$groups$1, int i) {
        return matcherMatchResult$groups$1.get(i);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return m94263f((MatchGroup) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public /* bridge */ boolean m94263f(MatchGroup matchGroup) {
        return super.contains(matchGroup);
    }

    @Override // kotlin.text.MatchGroupCollection
    public MatchGroup get(int index) {
        IntRange intRangeM94277i = RegexKt.m94277i(this.f67306a.m94259e(), index);
        if (intRangeM94277i.m88476l().intValue() < 0) {
            return null;
        }
        String strGroup = this.f67306a.m94259e().group(index);
        strGroup.getClass();
        return new MatchGroup(strGroup, intRangeM94277i);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f67306a.m94259e().groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<MatchGroup> iterator() {
        return SequencesKt___SequencesKt.m94185N(CollectionsKt.asSequence(CollectionsKt.getIndices(this)), new Function1() { // from class: l.chx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatcherMatchResult$groups$1.m94262c(this.f81879a, ((Integer) obj).intValue());
            }
        }).iterator();
    }
}
