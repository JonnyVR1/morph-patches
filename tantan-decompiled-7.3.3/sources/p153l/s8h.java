package p153l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.feed.helper.exception.FeedAdapterTypeErrorException;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class s8h extends zzk {
    public s8h(@NonNull RecyclerView.Adapter adapter) {
        super(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i, @NonNull List list) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == abstractC0569e0.getItemViewType()) {
            if (itemViewType == -1 || itemViewType == -2) {
                return;
            }
            RecyclerView.Adapter adapter = this.f185444a;
            if (m222259A()) {
                i--;
            }
            adapter.onBindViewHolder(abstractC0569e0, i, list);
            return;
        }
        StringBuilder sb = new StringBuilder("with payloads:true;");
        sb.append("hasHeader:" + m222259A());
        sb.append(Constants.PACKNAME_END);
        sb.append("position:" + i);
        sb.append(Constants.PACKNAME_END);
        sb.append("getItemViewType:" + itemViewType);
        sb.append(Constants.PACKNAME_END);
        sb.append("holder.getItemViewType:" + abstractC0569e0.getItemViewType());
        sb.append(Constants.PACKNAME_END);
        FeedAdapterTypeErrorException.reportFeedAdapterTypeErrorException(sb.toString());
    }

    @Override // p153l.zzk, p153l.vrc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.AbstractC0569e0 abstractC0569e0OnCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        if (abstractC0569e0OnCreateViewHolder.itemView.getParent() != null) {
            RecyclerView.Adapter adapter = this.f185444a;
            CrashHelper.m82479c(new RuntimeException("FeedHeaderAndFooterAdapter  holder.itemView !=null  :viewType " + i + " className:" + (adapter != null ? adapter.getClass().getName() : "<null>")));
        }
        return abstractC0569e0OnCreateViewHolder;
    }

    @Override // p153l.zzk, p153l.vrc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType != abstractC0569e0.getItemViewType()) {
            StringBuilder sb = new StringBuilder("with payloads:false;");
            sb.append("hasHeader:" + m222259A());
            sb.append(Constants.PACKNAME_END);
            sb.append("position:" + i);
            sb.append(Constants.PACKNAME_END);
            sb.append("getItemViewType:" + itemViewType);
            sb.append(Constants.PACKNAME_END);
            sb.append("holder.getItemViewType:" + abstractC0569e0.getItemViewType());
            sb.append(Constants.PACKNAME_END);
            FeedAdapterTypeErrorException.reportFeedAdapterTypeErrorException(sb.toString());
            return;
        }
        super.onBindViewHolder(abstractC0569e0, i);
    }
}
