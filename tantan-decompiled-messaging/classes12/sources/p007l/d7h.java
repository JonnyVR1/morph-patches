package p007l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.helper.exception.FeedAdapterTypeErrorException;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import l.jxk;
import l.ojc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class d7h extends jxk {
    public d7h(@NonNull RecyclerView.Adapter adapter) {
        super(adapter);
    }

    public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, int i, @NonNull List list) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == d0Var.getItemViewType()) {
            if (itemViewType == -1 || itemViewType == -2) {
                return;
            }
            RecyclerView.Adapter adapter = ((ojc0) this).a;
            if (A()) {
                i--;
            }
            adapter.onBindViewHolder(d0Var, i, list);
            return;
        }
        StringBuilder sb = new StringBuilder("with payloads:true;");
        sb.append("hasHeader:" + A());
        sb.append(";");
        sb.append("position:" + i);
        sb.append(";");
        sb.append("getItemViewType:" + itemViewType);
        sb.append(";");
        sb.append("holder.getItemViewType:" + d0Var.getItemViewType());
        sb.append(";");
        FeedAdapterTypeErrorException.reportFeedAdapterTypeErrorException(sb.toString());
    }

    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.d0 d0VarOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        if (d0VarOnCreateViewHolder.itemView.getParent() != null) {
            RecyclerView.Adapter adapter = ((ojc0) this).a;
            CrashHelper.c(new RuntimeException("FeedHeaderAndFooterAdapter  holder.itemView !=null  :viewType " + i + " className:" + (adapter != null ? adapter.getClass().getName() : "<null>")));
        }
        return d0VarOnCreateViewHolder;
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType != d0Var.getItemViewType()) {
            StringBuilder sb = new StringBuilder("with payloads:false;");
            sb.append("hasHeader:" + A());
            sb.append(";");
            sb.append("position:" + i);
            sb.append(";");
            sb.append("getItemViewType:" + itemViewType);
            sb.append(";");
            sb.append("holder.getItemViewType:" + d0Var.getItemViewType());
            sb.append(";");
            FeedAdapterTypeErrorException.reportFeedAdapterTypeErrorException(sb.toString());
            return;
        }
        super.onBindViewHolder(d0Var, i);
    }
}
