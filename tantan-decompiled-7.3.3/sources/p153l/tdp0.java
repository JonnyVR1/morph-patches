package p153l;

import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/tdp0;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "<init>", "()V", "", "Ll/v35;", "list", "", "f0", "(Ljava/util/List;)V", "e0", "", "j", "Ljava/util/List;", "dataList", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class tdp0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final List<v35> dataList = new ArrayList();

    /* JADX INFO: renamed from: e0 */
    public final void m190635e0() {
        this.dataList.clear();
        m68554Z(this.dataList);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m190636f0(@NotNull List<v35> list) {
        list.getClass();
        List<v35> list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        this.dataList.clear();
        this.dataList.addAll(list2);
        m68554Z(this.dataList);
    }
}
