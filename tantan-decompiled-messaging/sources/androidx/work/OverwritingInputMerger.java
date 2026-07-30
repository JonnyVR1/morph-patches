package androidx.work;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.usm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Landroidx/work/OverwritingInputMerger;", "Ll/usm;", "<init>", "()V", "", "Landroidx/work/Data;", "inputs", "a", "(Ljava/util/List;)Landroidx/work/Data;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class OverwritingInputMerger extends usm {
    @Override // p149l.usm
    @NotNull
    /* JADX INFO: renamed from: a */
    public Data mo4346a(@NotNull List<Data> inputs) {
        inputs.getClass();
        Data.C0753a c0753a = new Data.C0753a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Data> it = inputs.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().m4316c());
        }
        c0753a.m4323d(linkedHashMap);
        return c0753a.m4320a();
    }
}
