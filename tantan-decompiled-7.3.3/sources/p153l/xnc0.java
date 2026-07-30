package p153l;

import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\rJ\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m88121d2 = {"Ll/xnc0;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "<init>", "()V", "", "Ll/aoc0;", "list", "", "l0", "(Ljava/util/List;)V", "", "isSelect", "k0", "(Z)V", "", "f0", "()I", "i0", "()Z", "e0", "()Ljava/util/List;", "g0", "()Ll/aoc0;", "isPacketPanel", "h0", "targetSelectModel", "j0", "(Ll/aoc0;)V", "", "j", "Ljava/util/List;", "dataList", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xnc0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final List<aoc0> dataList = new ArrayList();

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final List<aoc0> m212134e0() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: f0 */
    public final int m212135f0() {
        List<aoc0> list = this.dataList;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            List<aoc0> list2 = this.dataList;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return 0;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((aoc0) it.next()).getCallInfo().m111666h() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i;
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public final aoc0 m212136g0() {
        Object obj = null;
        if (m212135f0() != 1) {
            return null;
        }
        for (Object obj2 : this.dataList) {
            if (((aoc0) obj2).getCallInfo().m111666h()) {
                obj = obj2;
                break;
            }
        }
        return (aoc0) obj;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m212137h0(boolean isPacketPanel) {
        int i = 0;
        for (aoc0 aoc0Var : this.dataList) {
            aoc0Var.m99065O(isPacketPanel);
            if (aoc0Var.getCallInfo().m111666h()) {
                i++;
            }
        }
        if (i == 1) {
            return;
        }
        for (aoc0 aoc0Var2 : this.dataList) {
            aoc0Var2.m99065O(isPacketPanel);
            aoc0Var2.getCallInfo().m111668j(false);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m212138i0() {
        return this.dataList.size() == m212135f0();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m212139j0(@NotNull aoc0 targetSelectModel) {
        Object next;
        targetSelectModel.getClass();
        if (targetSelectModel.getCallInfo().m111666h() && !zrv.f205799a.m207637H()) {
            int iIndexOf = this.dataList.indexOf(targetSelectModel);
            targetSelectModel.getCallInfo().m111668j(false);
            notifyItemChanged(iIndexOf, 0);
            return;
        }
        Iterator<T> it = this.dataList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((aoc0) next).getCallInfo().m111666h());
        aoc0 aoc0Var = (aoc0) next;
        if (aoc0Var != null) {
            aoc0Var.getCallInfo().m111668j(false);
            notifyItemChanged(this.dataList.indexOf(aoc0Var), 0);
        }
        int iIndexOf2 = this.dataList.indexOf(targetSelectModel);
        targetSelectModel.getCallInfo().m111668j(true);
        notifyItemChanged(iIndexOf2, 0);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m212140k0(boolean isSelect) {
        List<aoc0> list = this.dataList;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<T> it = this.dataList.iterator();
        while (it.hasNext()) {
            ((aoc0) it.next()).getCallInfo().m111668j(isSelect);
        }
        notifyItemRangeChanged(0, this.dataList.size(), 0);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m212141l0(@NotNull List<aoc0> list) {
        list.getClass();
        List<aoc0> list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        this.dataList.clear();
        this.dataList.addAll(list2);
        m68554Z(this.dataList);
    }
}
