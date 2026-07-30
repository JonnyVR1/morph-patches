package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsEmptyView;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsFooterView;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsItemView;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsMenuView;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m87232d2 = {"Ll/r120;", "Ll/dac0;", "Ll/i120;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "position", "getItemViewType", "(I)I", "F", "(I)Ll/i120;", b2s.C_ZONE, "()I", "convertView", Item.TYPE, "", "E", "(Landroid/view/View;Ll/i120;II)V", "", FirebaseAnalytics.Param.ITEMS, "G", "(Ljava/util/List;)V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "myVisitorItems", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class r120 extends dac0<i120> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<i120> myVisitorItems;

    public r120(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.myVisitorItems = new ArrayList();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.myVisitorItems.size();
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo28825D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType == 1) {
            View viewInflate = this.act.inflater().inflate(k6c0.f121344V1, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }
        if (itemViewType == 2) {
            View viewInflate2 = this.act.inflater().inflate(k6c0.f121335S1, parent, false);
            viewInflate2.getClass();
            return viewInflate2;
        }
        Act act = this.act;
        if (itemViewType != 3) {
            View viewInflate3 = act.inflater().inflate(k6c0.f121338T1, parent, false);
            viewInflate3.getClass();
            return viewInflate3;
        }
        View viewInflate4 = act.inflater().inflate(k6c0.f121332R1, parent, false);
        viewInflate4.getClass();
        return viewInflate4;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@NotNull View convertView, @NotNull i120 item, int itemViewType, int position) {
        convertView.getClass();
        item.getClass();
        if (item.m133962e()) {
            ((MyVisitorsMenuView) convertView).m58068e(this.act);
            return;
        }
        if (item.m133961d()) {
            ((MyVisitorsFooterView) convertView).m58036Q();
        } else if (item.m133960c()) {
            ((MyVisitorsEmptyView) convertView).m58034b();
        } else {
            ((MyVisitorsItemView) convertView).m58060l(this, this.act, item);
        }
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public i120 getItem(int position) {
        return this.myVisitorItems.get(position);
    }

    /* JADX INFO: renamed from: G */
    public final void m177435G(@NotNull List<i120> items) {
        items.getClass();
        this.myVisitorItems.clear();
        this.myVisitorItems.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getType();
    }
}
