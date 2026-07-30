package p153l;

import com.google.common.collect.InterfaceC3002r;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes7.dex */
public interface qnd0<R, C, V> extends InterfaceC3002r<R, C, V> {
    @Override // com.google.common.collect.InterfaceC3002r
    SortedSet<R> rowKeySet();

    @Override // com.google.common.collect.InterfaceC3002r
    SortedMap<R, Map<C, V>> rowMap();
}
