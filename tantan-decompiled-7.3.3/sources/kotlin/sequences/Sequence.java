package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010(\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¨\u0006\u0005"}, m88121d2 = {"Lkotlin/sequences/Sequence;", p7f.GPS_DIRECTION_TRUE, "", "iterator", "", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface Sequence<T> {
    @NotNull
    Iterator<T> iterator();
}
