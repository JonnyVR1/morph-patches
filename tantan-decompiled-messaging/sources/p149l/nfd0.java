package p149l;

import com.google.common.collect.InterfaceC2979r;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes7.dex */
public interface nfd0<R, C, V> extends InterfaceC2979r<R, C, V> {
    @Override // com.google.common.collect.InterfaceC2979r
    SortedSet<R> rowKeySet();

    @Override // com.google.common.collect.InterfaceC2979r
    SortedMap<R, Map<C, V>> rowMap();
}
