package p153l;

import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/hf10;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "<init>", "()V", "", "Ll/d3q;", "g0", "()Ljava/util/List;", "", "f0", "ids", "", "h0", "(Ljava/util/List;)V", "Ll/ff10;", Item.TYPE, "e0", "(Ll/ff10;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class hf10 extends LiveBaseAdapter {
    /* JADX INFO: renamed from: e0 */
    public final void m134681e0(@NotNull ff10 item) {
        item.getClass();
        List<d3q<?>> list = this.f45086a;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d3q d3qVar = (d3q) it.next();
            d3qVar.getClass();
            ff10 ff10Var = (ff10) d3qVar;
            if (Intrinsics.m88377d(ff10Var.uniqueId, item.uniqueId)) {
                d3qVar.getClass();
                ff10Var.m125349R(!ff10Var.getChecked());
                return;
            }
        }
        npj0.m164229a("Collection contains no element matching the predicate.");
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final List<String> m134682f0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m134683g0().iterator();
        while (it.hasNext()) {
            d3q d3qVar = (d3q) it.next();
            if (d3qVar instanceof ff10) {
                String str = ((ff10) d3qVar).getCallInvite().toUserId;
                str.getClass();
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final List<d3q<?>> m134683g0() {
        List<d3q<?>> list = this.f45086a;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d3q d3qVar = (d3q) obj;
            d3qVar.getClass();
            if (((ff10) d3qVar).getChecked()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m134684h0(@NotNull List<String> ids) {
        Object next;
        d3q d3qVar;
        ids.getClass();
        for (String str : ids) {
            List<d3q<?>> list = this.f45086a;
            list.getClass();
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    d3qVar = (d3q) next;
                    d3qVar.getClass();
                }
            } while (!Intrinsics.m88377d(str, ((ff10) d3qVar).getCallInvite().toUserId));
            m68551W((d3q) next);
        }
    }
}
