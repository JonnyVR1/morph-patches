package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentChildDetailsView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentParentDetailsView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class l3j0 extends dh5 {

    /* JADX INFO: renamed from: k */
    public final Act f9865k;

    /* JADX INFO: renamed from: l */
    public y3j0 f9866l;

    public l3j0(Act act, y3j0 y3j0Var) {
        this.f9865k = act;
        this.f9866l = y3j0Var;
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: C */
    public int mo9384C() {
        if (this.f6931c.isEmpty()) {
            return 1;
        }
        return this.f6931c.size();
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: D */
    public View mo9385D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return (CommonEmptyView) this.f9865k.inflater().inflate(o6c0.f11199e, viewGroup, false);
        }
        if (i == 5) {
            return this.f9865k.inflater().inflate(o6c0.f11285q1, viewGroup, false);
        }
        Act act = this.f9865k;
        return i == 4 ? act.inflater().inflate(o6c0.f11174a2, viewGroup, false) : act.inflater().inflate(o6c0.f11188c2, viewGroup, false);
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: O */
    public void mo9383A(View view, MomentMessage momentMessage, int i, int i2) {
        if (i == 1) {
            m11549m0((CommonEmptyView) view);
            return;
        }
        if (i == 5) {
            y3j0 y3j0Var = this.f9866l;
            q3j0 q3j0Var = y3j0Var.f15233a;
            String str = y3j0Var.f15236d;
            String str2 = y3j0Var.f15235c;
            String str3 = momentMessage.parentCommentId;
            ((MomentDetailExpandBottomView) view).m4164m(q3j0Var, this, str, str2, str3, m9391T(str3), momentMessage.moreSubComments, this.f6935g.get(momentMessage.parentCommentId).booleanValue(), i2 - 1);
            return;
        }
        if (i == 4) {
            y3j0 y3j0Var2 = this.f9866l;
            ((PhotoAlbumCommentChildDetailsView) view).m4596t0(this, y3j0Var2.f15233a, momentMessage, y3j0Var2.f15245m, y3j0Var2.f15235c, y3j0Var2.f15236d, y3j0Var2.f15237e);
        } else if (i == 3) {
            y3j0 y3j0Var3 = this.f9866l;
            ((PhotoAlbumCommentParentDetailsView) view).m4596t0(this, y3j0Var3.f15233a, momentMessage, y3j0Var3.f15245m, y3j0Var3.f15235c, y3j0Var3.f15236d, y3j0Var3.f15237e);
        }
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: R */
    public int mo9389R(final String str) {
        return this.f6931c.indexOf((MomentMessage) vwb.r(this.f6931c, new w9j() { // from class: l.j3j0
            public final Object call(Object obj) {
                MomentMessage momentMessage = (MomentMessage) obj;
                return Boolean.valueOf(momentMessage.isBottom && momentMessage.parentCommentId.equals(str));
            }
        }));
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: U */
    public MomentMessage getItem(int i) {
        if (this.f6931c.isEmpty()) {
            return null;
        }
        return this.f6931c.get(i);
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: V */
    public String mo9393V(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ((MomentMessage) vwb.r(this.f6931c, new w9j() { // from class: l.k3j0
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((CopyObject) ((MomentMessage) obj)).id));
            }
        })).moreSubComments;
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: a0 */
    public boolean mo9397a0(MomentMessage momentMessage) {
        return momentMessage.isBottom;
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: b0 */
    public boolean mo9398b0(MomentMessage momentMessage) {
        boolean zIsEmpty = TextUtils.isEmpty(momentMessage.moreSubComments);
        Map<String, List<MomentMessage>> map = this.f6934f;
        if (zIsEmpty) {
            map.put(((CopyObject) momentMessage).id, null);
            return true;
        }
        List<MomentMessage> list = map.get(momentMessage.moreSubComments);
        if (NullChecker.a(list) && list.size() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                final MomentMessage momentMessage2 = list.get(i2);
                if (vwb.r(this.f6933e.get(((CopyObject) momentMessage).id), new w9j() { // from class: l.i3j0
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CopyObject) momentMessage2).id.equals(((CopyObject) ((MomentMessage) obj)).id));
                    }
                }) != null) {
                    return !NullChecker.a(m9391T(((CopyObject) momentMessage).id)) || TextUtils.isEmpty(m9391T(((CopyObject) momentMessage).id).next);
                }
                if (!vwb.J(this.f6937i) && this.f6937i.contains(((CopyObject) momentMessage2).id)) {
                    i++;
                }
            }
            if (i == list.size()) {
                return true;
            }
        }
        return false;
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: d0 */
    public void mo9400d0(List<MomentMessage> list) {
        this.f6935g.clear();
        this.f6936h.clear();
        for (int size = list.size() - 1; size >= 0; size--) {
            MomentMessage momentMessage = list.get(size);
            if (momentMessage.isChildComment()) {
                m9396Z(momentMessage, momentMessage.parentCommentId);
                list.remove(momentMessage);
            }
        }
        int size2 = 0;
        while (size2 < list.size()) {
            MomentMessage momentMessage2 = list.get(size2);
            List<MomentMessage> listM9388Q = m9388Q(momentMessage2, this.f6933e.get(((CopyObject) momentMessage2).id), true);
            if (!NullChecker.a(listM9388Q) || listM9388Q.size() <= 0) {
                size2++;
            } else {
                list.addAll(size2 + 1, listM9388Q);
                size2 += listM9388Q.size() + 1;
            }
        }
        super.mo9400d0(list);
    }

    /* JADX INFO: renamed from: e */
    public void m11548e(int i) {
        if (!dh5.m9382W(this.f9866l.f15242j) || this.f6931c.size() <= 0 || this.f6931c.size() - i >= 2) {
            return;
        }
        this.f9866l.f15233a.mo5611z();
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: e0 */
    public void mo9401e0(MomentMessage momentMessage) {
        if (momentMessage.isChildComment()) {
            this.f6933e.get(momentMessage.parentCommentId).remove(momentMessage);
            this.f6937i.add(((CopyObject) momentMessage).id);
        }
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        if (this.f6931c.isEmpty()) {
            return 1;
        }
        MomentMessage item = getItem(i);
        if (mo9397a0(item)) {
            return 5;
        }
        return item.isChildComment() ? 4 : 3;
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: h0 */
    public void mo9404h0() {
        this.f9866l.m16908E0(this.f6931c);
    }

    /* JADX INFO: renamed from: m0 */
    public void m11549m0(CommonEmptyView commonEmptyView) {
        if (!this.f6931c.isEmpty()) {
            xdl0.M0(commonEmptyView, false);
            return;
        }
        xdl0.M0(commonEmptyView, true);
        xdl0.M(commonEmptyView.f2281a, false);
        commonEmptyView.f2282b.setText(this.f9866l.m16909l0());
        xdl0.X(commonEmptyView.f2281a, t100.d(21.0f));
    }
}
