package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleInHeaderItemIView;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class tjy extends jic0<BLiveVoiceSettle> {

    /* JADX INFO: renamed from: c */
    public final y20<BLiveVoiceSettle> f174629c;

    /* JADX INFO: renamed from: d */
    public final y20<BLiveVoiceSettle> f174630d;

    /* JADX INFO: renamed from: e */
    public final y20<BLiveVoiceSettle> f174631e;

    /* JADX INFO: renamed from: f */
    public final djy f174632f;

    /* JADX INFO: renamed from: g */
    public final Act f174633g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveVoiceSettle> f174634h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final int f174635i = 0;

    /* JADX INFO: renamed from: j */
    public final int f174636j;

    public tjy(djy djyVar, int i, y20<BLiveVoiceSettle> y20Var, y20<BLiveVoiceSettle> y20Var2, y20<BLiveVoiceSettle> y20Var3) {
        this.f174632f = djyVar;
        this.f174636j = i;
        this.f174633g = djyVar.act();
        this.f174629c = y20Var2;
        this.f174630d = y20Var3;
        this.f174631e = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f174634h.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        Act act = this.f174633g;
        return i == 0 ? act.inflater().inflate(yec0.f199131ja, viewGroup, false) : act.inflater().inflate(yec0.f199144ka, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveVoiceSettle bLiveVoiceSettle, int i, int i2) {
        if (i == 0) {
            ((MemberManagerSettleInHeaderItemIView) view).m79843l(this.f174636j, this.f174634h.size() > 0 ? this.f174634h.size() - 1 : 0);
        } else {
            ((MemberManagerSettleItemView) view).m79858v0(bLiveVoiceSettle, this.f174632f, this.f174636j, this.f174631e, this.f174629c, this.f174630d);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceSettle getItem(int i) {
        return this.f174634h.get(i);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m191468G(List<BLiveVoiceSettle> list) {
        return !jyb.m147479J(list) && list.size() > 1 && list.get(0).userId.equals(list.get(1).userId);
    }

    /* JADX INFO: renamed from: H */
    public void m191469H(int i, List<BLiveVoiceSettle> list) {
        this.f174634h.clear();
        notifyItemRemoved(i);
        this.f174634h.addAll(list);
        notifyItemChanged(0);
    }

    /* JADX INFO: renamed from: I */
    public void m191470I(List<BLiveVoiceSettle> list) {
        this.f174634h.clear();
        if (!jyb.m147479J(list) && !m191468G(list)) {
            list.add(0, list.get(0));
        }
        this.f174634h.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
