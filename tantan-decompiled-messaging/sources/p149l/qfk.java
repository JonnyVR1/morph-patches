package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.data.GroupNotification;
import com.p046p1.mobile.putong.core.newui.group.GroupNotificationItemView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class qfk extends dac0<GroupNotification> {

    /* JADX INFO: renamed from: c */
    public final List<GroupNotification> f154137c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Act f154138d;

    /* JADX INFO: renamed from: e */
    public final igk f154139e;

    public qfk(Act act, igk igkVar) {
        this.f154138d = act;
        this.f154139e = igkVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f154137c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        Act act = this.f154138d;
        return i == 1 ? act.inflater().inflate(l6c0.f126565t0, viewGroup, false) : act.inflater().inflate(l6c0.f126572u0, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public GroupNotification getItem(int i) {
        if (i < 0 || i >= this.f154137c.size()) {
            return null;
        }
        return this.f154137c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m174355H(List<GroupNotification> list) {
        if (vwb.m200296J(list)) {
            GroupNotification groupNotificationNew_ = GroupNotification.new_();
            groupNotificationNew_.f20406id = User.ID_TEAM_ACCOUNT;
            list = vwb.m200324f0(groupNotificationNew_);
        }
        this.f154137c.clear();
        this.f154137c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public void m174356I(final GroupApply groupApply) {
        if (NullChecker.m81303a(groupApply)) {
            GroupNotification groupNotification = (GroupNotification) vwb.m200346r(this.f154137c, new w9j() { // from class: l.pfk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(Objects.equals(groupApply.f20404id, ((GroupNotification) obj).groupApply.f20404id));
                }
            });
            if (NullChecker.m81303a(groupNotification)) {
                int iIndexOf = this.f154137c.indexOf(groupNotification);
                groupNotification.groupApplyData = groupApply;
                notifyItemChanged(iIndexOf, NotificationCompat.CATEGORY_STATUS);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        GroupNotification item = getItem(i);
        return (NullChecker.m81303a(item) && TextUtils.equals(item.f20406id, User.ID_TEAM_ACCOUNT)) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i, @NonNull List<Object> list) {
        super.onBindViewHolder(abstractC0566d0, i, list);
        if (getItemViewType(i) == 1) {
            return;
        }
        GroupNotificationItemView groupNotificationItemView = (GroupNotificationItemView) abstractC0566d0.itemView;
        GroupNotification item = getItem(i);
        boolean zIsEmpty = list.isEmpty();
        igk igkVar = this.f154139e;
        if (zIsEmpty) {
            groupNotificationItemView.m36568p(item, igkVar);
            this.f154139e.m136067p0(item);
        } else {
            groupNotificationItemView.m36569q(item, igkVar);
        }
        if (!this.f154139e.m136070r0() || this.f154137c.size() <= 0 || this.f154137c.size() - i >= 2) {
            return;
        }
        this.f154139e.m136069r();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, GroupNotification groupNotification, int i, int i2) {
    }
}
