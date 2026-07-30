package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentChildDetailsView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentParentDetailsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class pcj0 extends di5 {

    /* JADX INFO: renamed from: k */
    public final Act f151598k;

    /* JADX INFO: renamed from: l */
    public cdj0 f151599l;

    public pcj0(Act act, cdj0 cdj0Var) {
        this.f151598k = act;
        this.f151599l = cdj0Var;
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f88578c.isEmpty()) {
            return 1;
        }
        return this.f88578c.size();
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return (CommonEmptyView) this.f151598k.inflater().inflate(tec0.f173649e, viewGroup, false);
        }
        if (i == 5) {
            return this.f151598k.inflater().inflate(tec0.f173735q1, viewGroup, false);
        }
        Act act = this.f151598k;
        return i == 4 ? act.inflater().inflate(tec0.f173624a2, viewGroup, false) : act.inflater().inflate(tec0.f173638c2, viewGroup, false);
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: O */
    public void mo29822A(View view, MomentMessage momentMessage, int i, int i2) {
        if (i == 1) {
            m171695m0((CommonEmptyView) view);
            return;
        }
        if (i == 5) {
            cdj0 cdj0Var = this.f151599l;
            ucj0 ucj0Var = cdj0Var.f81224a;
            String str = cdj0Var.f81227d;
            String str2 = cdj0Var.f81226c;
            String str3 = momentMessage.parentCommentId;
            ((MomentDetailExpandBottomView) view).m64331m(ucj0Var, this, str, str2, str3, m115856T(str3), momentMessage.moreSubComments, this.f88582g.get(momentMessage.parentCommentId).booleanValue(), i2 - 1);
            return;
        }
        if (i == 4) {
            cdj0 cdj0Var2 = this.f151599l;
            ((PhotoAlbumCommentChildDetailsView) view).m64762t0(this, cdj0Var2.f81224a, momentMessage, cdj0Var2.f81236m, cdj0Var2.f81226c, cdj0Var2.f81227d, cdj0Var2.f81228e);
        } else if (i == 3) {
            cdj0 cdj0Var3 = this.f151599l;
            ((PhotoAlbumCommentParentDetailsView) view).m64762t0(this, cdj0Var3.f81224a, momentMessage, cdj0Var3.f81236m, cdj0Var3.f81226c, cdj0Var3.f81227d, cdj0Var3.f81228e);
        }
    }

    @Override // p153l.di5
    /* JADX INFO: renamed from: R */
    public int mo115854R(final String str) {
        return this.f88578c.indexOf((MomentMessage) jyb.m147529r(this.f88578c, new qcj() { // from class: l.ncj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                MomentMessage momentMessage = (MomentMessage) obj;
                return Boolean.valueOf(momentMessage.isBottom && momentMessage.parentCommentId.equals(str));
            }
        }));
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: U */
    public MomentMessage getItem(int i) {
        if (this.f88578c.isEmpty()) {
            return null;
        }
        return this.f88578c.get(i);
    }

    @Override // p153l.di5
    /* JADX INFO: renamed from: V */
    public String mo115858V(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ((MomentMessage) jyb.m147529r(this.f88578c, new qcj() { // from class: l.ocj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((MomentMessage) obj).f56856id));
            }
        })).moreSubComments;
    }

    @Override // p153l.di5
    /* JADX INFO: renamed from: a0 */
    public boolean mo115862a0(MomentMessage momentMessage) {
        return momentMessage.isBottom;
    }

    @Override // p153l.di5
    /* JADX INFO: renamed from: b0 */
    public boolean mo115863b0(MomentMessage momentMessage) {
        boolean zIsEmpty = TextUtils.isEmpty(momentMessage.moreSubComments);
        Map<String, List<MomentMessage>> map = this.f88581f;
        if (zIsEmpty) {
            map.put(momentMessage.f56856id, null);
            return true;
        }
        List<MomentMessage> list = map.get(momentMessage.moreSubComments);
        if (NullChecker.m82486a(list) && list.size() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                final MomentMessage momentMessage2 = list.get(i2);
                if (jyb.m147529r(this.f88580e.get(momentMessage.f56856id), new qcj() { // from class: l.mcj0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(momentMessage2.f56856id.equals(((MomentMessage) obj).f56856id));
                    }
                }) != null) {
                    return !NullChecker.m82486a(m115856T(momentMessage.f56856id)) || TextUtils.isEmpty(m115856T(momentMessage.f56856id).next);
                }
                if (!jyb.m147479J(this.f88584i) && this.f88584i.contains(momentMessage2.f56856id)) {
                    i++;
                }
            }
            if (i == list.size()) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.di5
    /* JADX INFO: renamed from: d0 */
    public void mo115865d0(List<MomentMessage> list) {
        this.f88582g.clear();
        this.f88583h.clear();
        for (int size = list.size() - 1; size >= 0; size--) {
            MomentMessage momentMessage = list.get(size);
            if (momentMessage.isChildComment()) {
                m115861Z(momentMessage, momentMessage.parentCommentId);
                list.remove(momentMessage);
            }
        }
        int size2 = 0;
        while (size2 < list.size()) {
            MomentMessage momentMessage2 = list.get(size2);
            List<MomentMessage> listM115853Q = m115853Q(momentMessage2, this.f88580e.get(momentMessage2.f56856id), true);
            if (!NullChecker.m82486a(listM115853Q) || listM115853Q.size() <= 0) {
                size2++;
            } else {
                list.addAll(size2 + 1, listM115853Q);
                size2 += listM115853Q.size() + 1;
            }
        }
        super.mo115865d0(list);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (!di5.m115850W(this.f151599l.f81233j) || this.f88578c.size() <= 0 || this.f88578c.size() - i >= 2) {
            return;
        }
        this.f151599l.f81224a.mo65703z();
    }

    @Override // p153l.di5
    /* JADX INFO: renamed from: e0 */
    public void mo115866e0(MomentMessage momentMessage) {
        if (momentMessage.isChildComment()) {
            this.f88580e.get(momentMessage.parentCommentId).remove(momentMessage);
            this.f88584i.add(momentMessage.f56856id);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f88578c.isEmpty()) {
            return 1;
        }
        MomentMessage item = getItem(i);
        if (mo115862a0(item)) {
            return 5;
        }
        return item.isChildComment() ? 4 : 3;
    }

    @Override // p153l.di5
    /* JADX INFO: renamed from: h0 */
    public void mo115869h0() {
        this.f151599l.m109212E0(this.f88578c);
    }

    /* JADX INFO: renamed from: m0 */
    public void m171695m0(CommonEmptyView commonEmptyView) {
        if (!this.f88578c.isEmpty()) {
            bnl0.m105525M0(commonEmptyView, false);
            return;
        }
        bnl0.m105525M0(commonEmptyView, true);
        bnl0.m105524M(commonEmptyView.f41668a, false);
        commonEmptyView.f41669b.setText(this.f151599l.m109213l0());
        bnl0.m105540X(commonEmptyView.f41668a, qa00.m175859d(21.0f));
    }
}
