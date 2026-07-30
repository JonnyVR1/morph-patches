package p009l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.group.GroupNotificationItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.GroupApply;
import com.p1.mobile.putong.core.data.GroupNotification;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.dac0;
import l.l6c0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qfk extends dac0<GroupNotification> {

    /* JADX INFO: renamed from: c */
    public final List<GroupNotification> f19222c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Act f19223d;

    /* JADX INFO: renamed from: e */
    public final igk f19224e;

    public qfk(Act act, igk igkVar) {
        this.f19223d = act;
        this.f19224e = igkVar;
    }

    /* JADX INFO: renamed from: C */
    public int m20966C() {
        return this.f19222c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m20967D(ViewGroup viewGroup, int i) {
        Act act = this.f19223d;
        return i == 1 ? act.inflater().inflate(l6c0.t0, viewGroup, false) : act.inflater().inflate(l6c0.u0, viewGroup, false);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public GroupNotification getItem(int i) {
        if (i < 0 || i >= this.f19222c.size()) {
            return null;
        }
        return this.f19222c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m20970H(List<GroupNotification> list) {
        if (vwb.J(list)) {
            GroupNotification groupNotificationNew_ = GroupNotification.new_();
            groupNotificationNew_.id = "-1";
            list = vwb.f0(new GroupNotification[]{groupNotificationNew_});
        }
        this.f19222c.clear();
        this.f19222c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public void m20971I(final GroupApply groupApply) {
        if (NullChecker.a(groupApply)) {
            GroupNotification groupNotification = (GroupNotification) vwb.r(this.f19222c, new w9j() { // from class: l.pfk
                public final Object call(Object obj) {
                    return Boolean.valueOf(Objects.equals(groupApply.id, ((GroupNotification) obj).groupApply.id));
                }
            });
            if (NullChecker.a(groupNotification)) {
                int iIndexOf = this.f19222c.indexOf(groupNotification);
                groupNotification.groupApplyData = groupApply;
                notifyItemChanged(iIndexOf, "status");
            }
        }
    }

    public int getItemViewType(int i) {
        GroupNotification item = getItem(i);
        return (NullChecker.a(item) && TextUtils.equals(item.id, "-1")) ? 1 : 0;
    }

    public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, int i, @NonNull List<Object> list) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onBindViewHolder(d0Var, i, list);
        if (getItemViewType(i) == 1) {
            return;
        }
        GroupNotificationItemView groupNotificationItemView = (GroupNotificationItemView) d0Var.itemView;
        GroupNotification item = getItem(i);
        boolean zIsEmpty = list.isEmpty();
        igk igkVar = this.f19224e;
        if (zIsEmpty) {
            groupNotificationItemView.m507p(item, igkVar);
            this.f19224e.m16540p0(item);
        } else {
            groupNotificationItemView.m508q(item, igkVar);
        }
        if (!this.f19224e.m16543r0() || this.f19222c.size() <= 0 || this.f19222c.size() - i >= 2) {
            return;
        }
        this.f19224e.m16542r();
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m20965A(View view, GroupNotification groupNotification, int i, int i2) {
    }
}
