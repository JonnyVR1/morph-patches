package p149l;

import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/x610;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "<init>", "()V", "", "Ll/d1q;", "g0", "()Ljava/util/List;", "", "f0", "ids", "", "h0", "(Ljava/util/List;)V", "Ll/v610;", Item.TYPE, "e0", "(Ll/v610;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class x610 extends LiveBaseAdapter {
    /* JADX INFO: renamed from: e0 */
    public final void m207163e0(@NotNull v610 item) {
        item.getClass();
        List<d1q<?>> list = this.f44238a;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d1q d1qVar = (d1q) it.next();
            d1qVar.getClass();
            v610 v610Var = (v610) d1qVar;
            if (Intrinsics.m87488d(v610Var.uniqueId, item.uniqueId)) {
                d1qVar.getClass();
                v610Var.m197195R(!v610Var.getChecked());
                return;
            }
        }
        kgj0.m145892a("Collection contains no element matching the predicate.");
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final List<String> m207164f0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m207165g0().iterator();
        while (it.hasNext()) {
            d1q d1qVar = (d1q) it.next();
            if (d1qVar instanceof v610) {
                String str = ((v610) d1qVar).getCallInvite().toUserId;
                str.getClass();
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final List<d1q<?>> m207165g0() {
        List<d1q<?>> list = this.f44238a;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d1q d1qVar = (d1q) obj;
            d1qVar.getClass();
            if (((v610) d1qVar).getChecked()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m207166h0(@NotNull List<String> ids) {
        Object next;
        d1q d1qVar;
        ids.getClass();
        for (String str : ids) {
            List<d1q<?>> list = this.f44238a;
            list.getClass();
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    d1qVar = (d1q) next;
                    d1qVar.getClass();
                }
            } while (!Intrinsics.m87488d(str, ((v610) d1qVar).getCallInvite().toUserId));
            m67368W((d1q) next);
        }
    }
}
