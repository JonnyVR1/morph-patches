package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.GroupApply;
import com.p051p1.mobile.putong.core.data.GroupNotification;
import com.p051p1.mobile.putong.core.newui.group.GroupNotificationItemView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class gik extends jic0<GroupNotification> {

    /* JADX INFO: renamed from: c */
    public final List<GroupNotification> f104499c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Act f104500d;

    /* JADX INFO: renamed from: e */
    public final yik f104501e;

    public gik(Act act, yik yikVar) {
        this.f104500d = act;
        this.f104501e = yikVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f104499c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        Act act = this.f104500d;
        return i == 1 ? act.inflater().inflate(qec0.f157121t0, viewGroup, false) : act.inflater().inflate(qec0.f157128u0, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public GroupNotification getItem(int i) {
        if (i < 0 || i >= this.f104499c.size()) {
            return null;
        }
        return this.f104499c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m130329H(List<GroupNotification> list) {
        if (jyb.m147479J(list)) {
            GroupNotification groupNotificationNew_ = GroupNotification.new_();
            groupNotificationNew_.f21148id = User.ID_TEAM_ACCOUNT;
            list = jyb.m147507f0(groupNotificationNew_);
        }
        this.f104499c.clear();
        this.f104499c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public void m130330I(final GroupApply groupApply) {
        if (NullChecker.m82486a(groupApply)) {
            GroupNotification groupNotification = (GroupNotification) jyb.m147529r(this.f104499c, new qcj() { // from class: l.fik
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(Objects.equals(groupApply.f21146id, ((GroupNotification) obj).groupApply.f21146id));
                }
            });
            if (NullChecker.m82486a(groupNotification)) {
                int iIndexOf = this.f104499c.indexOf(groupNotification);
                groupNotification.groupApplyData = groupApply;
                notifyItemChanged(iIndexOf, NotificationCompat.CATEGORY_STATUS);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        GroupNotification item = getItem(i);
        return (NullChecker.m82486a(item) && TextUtils.equals(item.f21148id, User.ID_TEAM_ACCOUNT)) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i, @NonNull List<Object> list) {
        super.onBindViewHolder(abstractC0569e0, i, list);
        if (getItemViewType(i) == 1) {
            return;
        }
        GroupNotificationItemView groupNotificationItemView = (GroupNotificationItemView) abstractC0569e0.itemView;
        GroupNotification item = getItem(i);
        boolean zIsEmpty = list.isEmpty();
        yik yikVar = this.f104501e;
        if (zIsEmpty) {
            groupNotificationItemView.m37571p(item, yikVar);
            this.f104501e.m216108p0(item);
        } else {
            groupNotificationItemView.m37572q(item, yikVar);
        }
        if (!this.f104501e.m216111r0() || this.f104499c.size() <= 0 || this.f104499c.size() - i >= 2) {
            return;
        }
        this.f104501e.m216110r();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, GroupNotification groupNotification, int i, int i2) {
    }
}
