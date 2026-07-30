package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentChildDetailsView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentParentDetailsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class l3j0 extends dh5 {

    /* JADX INFO: renamed from: k */
    public final Act f125921k;

    /* JADX INFO: renamed from: l */
    public y3j0 f125922l;

    public l3j0(Act act, y3j0 y3j0Var) {
        this.f125921k = act;
        this.f125922l = y3j0Var;
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f86234c.isEmpty()) {
            return 1;
        }
        return this.f86234c.size();
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return (CommonEmptyView) this.f125921k.inflater().inflate(o6c0.f142180e, viewGroup, false);
        }
        if (i == 5) {
            return this.f125921k.inflater().inflate(o6c0.f142266q1, viewGroup, false);
        }
        Act act = this.f125921k;
        return i == 4 ? act.inflater().inflate(o6c0.f142155a2, viewGroup, false) : act.inflater().inflate(o6c0.f142169c2, viewGroup, false);
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: O */
    public void mo28823A(View view, MomentMessage momentMessage, int i, int i2) {
        if (i == 1) {
            m148401m0((CommonEmptyView) view);
            return;
        }
        if (i == 5) {
            y3j0 y3j0Var = this.f125922l;
            q3j0 q3j0Var = y3j0Var.f195817a;
            String str = y3j0Var.f195820d;
            String str2 = y3j0Var.f195819c;
            String str3 = momentMessage.parentCommentId;
            ((MomentDetailExpandBottomView) view).m63148m(q3j0Var, this, str, str2, str3, m111796T(str3), momentMessage.moreSubComments, this.f86238g.get(momentMessage.parentCommentId).booleanValue(), i2 - 1);
            return;
        }
        if (i == 4) {
            y3j0 y3j0Var2 = this.f125922l;
            ((PhotoAlbumCommentChildDetailsView) view).m63579t0(this, y3j0Var2.f195817a, momentMessage, y3j0Var2.f195829m, y3j0Var2.f195819c, y3j0Var2.f195820d, y3j0Var2.f195821e);
        } else if (i == 3) {
            y3j0 y3j0Var3 = this.f125922l;
            ((PhotoAlbumCommentParentDetailsView) view).m63579t0(this, y3j0Var3.f195817a, momentMessage, y3j0Var3.f195829m, y3j0Var3.f195819c, y3j0Var3.f195820d, y3j0Var3.f195821e);
        }
    }

    @Override // p149l.dh5
    /* JADX INFO: renamed from: R */
    public int mo111794R(final String str) {
        return this.f86234c.indexOf((MomentMessage) vwb.m200346r(this.f86234c, new w9j() { // from class: l.j3j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                MomentMessage momentMessage = (MomentMessage) obj;
                return Boolean.valueOf(momentMessage.isBottom && momentMessage.parentCommentId.equals(str));
            }
        }));
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: U */
    public MomentMessage getItem(int i) {
        if (this.f86234c.isEmpty()) {
            return null;
        }
        return this.f86234c.get(i);
    }

    @Override // p149l.dh5
    /* JADX INFO: renamed from: V */
    public String mo111798V(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ((MomentMessage) vwb.m200346r(this.f86234c, new w9j() { // from class: l.k3j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((MomentMessage) obj).f56008id));
            }
        })).moreSubComments;
    }

    @Override // p149l.dh5
    /* JADX INFO: renamed from: a0 */
    public boolean mo111802a0(MomentMessage momentMessage) {
        return momentMessage.isBottom;
    }

    @Override // p149l.dh5
    /* JADX INFO: renamed from: b0 */
    public boolean mo111803b0(MomentMessage momentMessage) {
        boolean zIsEmpty = TextUtils.isEmpty(momentMessage.moreSubComments);
        Map<String, List<MomentMessage>> map = this.f86237f;
        if (zIsEmpty) {
            map.put(momentMessage.f56008id, null);
            return true;
        }
        List<MomentMessage> list = map.get(momentMessage.moreSubComments);
        if (NullChecker.m81303a(list) && list.size() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                final MomentMessage momentMessage2 = list.get(i2);
                if (vwb.m200346r(this.f86236e.get(momentMessage.f56008id), new w9j() { // from class: l.i3j0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(momentMessage2.f56008id.equals(((MomentMessage) obj).f56008id));
                    }
                }) != null) {
                    return !NullChecker.m81303a(m111796T(momentMessage.f56008id)) || TextUtils.isEmpty(m111796T(momentMessage.f56008id).next);
                }
                if (!vwb.m200296J(this.f86240i) && this.f86240i.contains(momentMessage2.f56008id)) {
                    i++;
                }
            }
            if (i == list.size()) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.dh5
    /* JADX INFO: renamed from: d0 */
    public void mo111805d0(List<MomentMessage> list) {
        this.f86238g.clear();
        this.f86239h.clear();
        for (int size = list.size() - 1; size >= 0; size--) {
            MomentMessage momentMessage = list.get(size);
            if (momentMessage.isChildComment()) {
                m111801Z(momentMessage, momentMessage.parentCommentId);
                list.remove(momentMessage);
            }
        }
        int size2 = 0;
        while (size2 < list.size()) {
            MomentMessage momentMessage2 = list.get(size2);
            List<MomentMessage> listM111793Q = m111793Q(momentMessage2, this.f86236e.get(momentMessage2.f56008id), true);
            if (!NullChecker.m81303a(listM111793Q) || listM111793Q.size() <= 0) {
                size2++;
            } else {
                list.addAll(size2 + 1, listM111793Q);
                size2 += listM111793Q.size() + 1;
            }
        }
        super.mo111805d0(list);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (!dh5.m111790W(this.f125922l.f195826j) || this.f86234c.size() <= 0 || this.f86234c.size() - i >= 2) {
            return;
        }
        this.f125922l.f195817a.mo64520z();
    }

    @Override // p149l.dh5
    /* JADX INFO: renamed from: e0 */
    public void mo111806e0(MomentMessage momentMessage) {
        if (momentMessage.isChildComment()) {
            this.f86236e.get(momentMessage.parentCommentId).remove(momentMessage);
            this.f86240i.add(momentMessage.f56008id);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f86234c.isEmpty()) {
            return 1;
        }
        MomentMessage item = getItem(i);
        if (mo111802a0(item)) {
            return 5;
        }
        return item.isChildComment() ? 4 : 3;
    }

    @Override // p149l.dh5
    /* JADX INFO: renamed from: h0 */
    public void mo111809h0() {
        this.f125922l.m212832E0(this.f86234c);
    }

    /* JADX INFO: renamed from: m0 */
    public void m148401m0(CommonEmptyView commonEmptyView) {
        if (!this.f86234c.isEmpty()) {
            xdl0.m208345M0(commonEmptyView, false);
            return;
        }
        xdl0.m208345M0(commonEmptyView, true);
        xdl0.m208344M(commonEmptyView.f40820a, false);
        commonEmptyView.f40821b.setText(this.f125922l.m212833l0());
        xdl0.m208360X(commonEmptyView.f40820a, t100.m186890d(21.0f));
    }
}
