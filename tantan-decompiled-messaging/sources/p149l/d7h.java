package p149l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.feed.helper.exception.FeedAdapterTypeErrorException;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class d7h extends jxk {
    public d7h(@NonNull RecyclerView.Adapter adapter) {
        super(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i, @NonNull List list) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == abstractC0566d0.getItemViewType()) {
            if (itemViewType == -1 || itemViewType == -2) {
                return;
            }
            RecyclerView.Adapter adapter = this.f144262a;
            if (m143809A()) {
                i--;
            }
            adapter.onBindViewHolder(abstractC0566d0, i, list);
            return;
        }
        StringBuilder sb = new StringBuilder("with payloads:true;");
        sb.append("hasHeader:" + m143809A());
        sb.append(Constants.PACKNAME_END);
        sb.append("position:" + i);
        sb.append(Constants.PACKNAME_END);
        sb.append("getItemViewType:" + itemViewType);
        sb.append(Constants.PACKNAME_END);
        sb.append("holder.getItemViewType:" + abstractC0566d0.getItemViewType());
        sb.append(Constants.PACKNAME_END);
        FeedAdapterTypeErrorException.reportFeedAdapterTypeErrorException(sb.toString());
    }

    @Override // p149l.jxk, p149l.ojc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.AbstractC0566d0 abstractC0566d0OnCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        if (abstractC0566d0OnCreateViewHolder.itemView.getParent() != null) {
            RecyclerView.Adapter adapter = this.f144262a;
            CrashHelper.m81296c(new RuntimeException("FeedHeaderAndFooterAdapter  holder.itemView !=null  :viewType " + i + " className:" + (adapter != null ? adapter.getClass().getName() : "<null>")));
        }
        return abstractC0566d0OnCreateViewHolder;
    }

    @Override // p149l.jxk, p149l.ojc0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType != abstractC0566d0.getItemViewType()) {
            StringBuilder sb = new StringBuilder("with payloads:false;");
            sb.append("hasHeader:" + m143809A());
            sb.append(Constants.PACKNAME_END);
            sb.append("position:" + i);
            sb.append(Constants.PACKNAME_END);
            sb.append("getItemViewType:" + itemViewType);
            sb.append(Constants.PACKNAME_END);
            sb.append("holder.getItemViewType:" + abstractC0566d0.getItemViewType());
            sb.append(Constants.PACKNAME_END);
            FeedAdapterTypeErrorException.reportFeedAdapterTypeErrorException(sb.toString());
            return;
        }
        super.onBindViewHolder(abstractC0566d0, i);
    }
}
