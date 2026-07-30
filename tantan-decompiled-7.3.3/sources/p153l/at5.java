package p153l;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/at5;", "Ll/ut2;", "<init>", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "b", "(Ll/ut2;)V", "Lorg/json/JSONArray;", "batch", "", "success", "a", "(Lorg/json/JSONArray;Z)V", "", "Ljava/util/List;", "listeners", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class at5 implements ut2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<ut2> listeners = new ArrayList();

    @Override // p153l.ut2
    /* JADX INFO: renamed from: a */
    public void mo100022a(@NotNull JSONArray batch, boolean success) {
        batch.getClass();
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((ut2) it.next()).mo100022a(batch, success);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m100023b(@NotNull ut2 listener) {
        listener.getClass();
        this.listeners.add(listener);
    }
}
