package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleInHeaderItemIView;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class way extends dac0<BLiveVoiceSettle> {

    /* JADX INFO: renamed from: c */
    public final e30<BLiveVoiceSettle> f185517c;

    /* JADX INFO: renamed from: d */
    public final e30<BLiveVoiceSettle> f185518d;

    /* JADX INFO: renamed from: e */
    public final e30<BLiveVoiceSettle> f185519e;

    /* JADX INFO: renamed from: f */
    public final gay f185520f;

    /* JADX INFO: renamed from: g */
    public final Act f185521g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveVoiceSettle> f185522h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final int f185523i = 0;

    /* JADX INFO: renamed from: j */
    public final int f185524j;

    public way(gay gayVar, int i, e30<BLiveVoiceSettle> e30Var, e30<BLiveVoiceSettle> e30Var2, e30<BLiveVoiceSettle> e30Var3) {
        this.f185520f = gayVar;
        this.f185524j = i;
        this.f185521g = gayVar.act();
        this.f185517c = e30Var2;
        this.f185518d = e30Var3;
        this.f185519e = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f185522h.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        Act act = this.f185521g;
        return i == 0 ? act.inflater().inflate(t6c0.f168399ja, viewGroup, false) : act.inflater().inflate(t6c0.f168412ka, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveVoiceSettle bLiveVoiceSettle, int i, int i2) {
        if (i == 0) {
            ((MemberManagerSettleInHeaderItemIView) view).m78660l(this.f185524j, this.f185522h.size() > 0 ? this.f185522h.size() - 1 : 0);
        } else {
            ((MemberManagerSettleItemView) view).m78675v0(bLiveVoiceSettle, this.f185520f, this.f185524j, this.f185519e, this.f185517c, this.f185518d);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceSettle getItem(int i) {
        return this.f185522h.get(i);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m202478G(List<BLiveVoiceSettle> list) {
        return !vwb.m200296J(list) && list.size() > 1 && list.get(0).userId.equals(list.get(1).userId);
    }

    /* JADX INFO: renamed from: H */
    public void m202479H(int i, List<BLiveVoiceSettle> list) {
        this.f185522h.clear();
        notifyItemRemoved(i);
        this.f185522h.addAll(list);
        notifyItemChanged(0);
    }

    /* JADX INFO: renamed from: I */
    public void m202480I(List<BLiveVoiceSettle> list) {
        this.f185522h.clear();
        if (!vwb.m200296J(list) && !m202478G(list)) {
            list.add(0, list.get(0));
        }
        this.f185522h.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
