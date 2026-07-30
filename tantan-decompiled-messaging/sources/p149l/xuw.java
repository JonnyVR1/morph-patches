package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.Item;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m87232d2 = {"Ll/xuw;", "Ll/dac0;", "Lcom/p1/mobile/putong/core/data/BreakIce;", "", "list", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "E", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/BreakIce;II)V", "getItemViewType", "(I)I", "F", "(I)Lcom/p1/mobile/putong/core/data/BreakIce;", b2s.C_ZONE, "()I", "", "c", "Ljava/util/List;", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xuw extends dac0<BreakIce> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<BreakIce> list;

    public xuw(@NotNull List<? extends BreakIce> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        this.list = arrayList;
        arrayList.addAll(list);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo28825D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        View viewInflate = View.inflate(parent.getContext(), h6c0.f106030g, null);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@NotNull View convertView, @Nullable BreakIce item, int itemViewType, int position) {
        convertView.getClass();
        ((TextView) convertView).setText(item != null ? item.content : null);
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BreakIce getItem(int position) {
        return this.list.get(position % this.list.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        int size = this.list.size();
        if (size <= 0) {
            size = 1;
        }
        return super.getItemViewType(position % size);
    }
}
