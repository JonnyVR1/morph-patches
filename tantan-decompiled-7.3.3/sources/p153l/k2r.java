package p153l;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvAlreadyChooseSongItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class k2r extends jic0<BLiveVoiceKTVOrder> {

    /* JADX INFO: renamed from: c */
    public final y20<Pair<Integer, BLiveVoiceKTVOrder>> f123642c;

    /* JADX INFO: renamed from: d */
    public final Act f123643d;

    /* JADX INFO: renamed from: e */
    public boolean f123644e;

    /* JADX INFO: renamed from: f */
    public List<BLiveVoiceKTVOrder> f123645f = new ArrayList();

    public k2r(Act act, y20<Pair<Integer, BLiveVoiceKTVOrder>> y20Var, boolean z) {
        this.f123643d = act;
        this.f123642c = y20Var;
        this.f123644e = z;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f123645f.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f123643d.inflater().inflate(yec0.f199156l9, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveVoiceKTVOrder bLiveVoiceKTVOrder, int i, int i2) {
        ((KtvAlreadyChooseSongItem) view).m78215k0(this.f123642c, bLiveVoiceKTVOrder, i2, this.f123644e, zrv.f205799a.m207631D0().equals(bLiveVoiceKTVOrder.userId));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceKTVOrder getItem(int i) {
        return this.f123645f.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m147994G(List<BLiveVoiceKTVOrder> list) {
        this.f123645f.clear();
        this.f123645f.addAll(list);
        notifyDataSetChanged();
    }
}
