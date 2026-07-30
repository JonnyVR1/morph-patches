package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d1q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ll/cxr;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "<init>", "()V", "", "Ll/xxr;", "list", "", "h0", "(Ljava/util/List;)V", "targetModel", "g0", "(Ll/xxr;)V", "e0", "", "f0", "()Z", "", "Ll/d1q;", "j", "Ljava/util/List;", "dataList", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class cxr extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final List<d1q<?>> dataList = new ArrayList();

    /* JADX INFO: renamed from: e0 */
    public final void m11402e0() {
        this.dataList.clear();
        Z(this.dataList);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m11403f0() {
        List<d1q<?>> list = this.dataList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof xxr) {
                arrayList.add(obj);
            }
        }
        return arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m11404g0(@NotNull xxr targetModel) {
        targetModel.getClass();
        Iterator<d1q<?>> it = this.dataList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            d1q<?> next = it.next();
            if (next instanceof xxr ? TextUtils.equals(((xxr) next).getItem().id, targetModel.getItem().id) : false) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || i >= this.dataList.size()) {
            return;
        }
        this.dataList.remove(i);
        ((LiveBaseAdapter) this).a.remove(i);
        notifyItemRemoved(i);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11405h0(@Nullable List<xxr> list) {
        List<xxr> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.dataList.clear();
        this.dataList.add(new m480(8));
        this.dataList.addAll(list2);
        this.dataList.add(new m480(72));
        Z(this.dataList);
    }
}
