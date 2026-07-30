package kotlin.sequences;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lkotlin/sequences/DropTakeSequence;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "", "n", "a", "(I)Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface DropTakeSequence<T> extends Sequence<T> {
    @NotNull
    /* JADX INFO: renamed from: a */
    Sequence<T> mo93237a(int n);
}
