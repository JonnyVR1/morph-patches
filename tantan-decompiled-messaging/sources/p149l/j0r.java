package p149l;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvAlreadyChooseSongItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class j0r extends dac0<BLiveVoiceKTVOrder> {

    /* JADX INFO: renamed from: c */
    public final e30<Pair<Integer, BLiveVoiceKTVOrder>> f115705c;

    /* JADX INFO: renamed from: d */
    public final Act f115706d;

    /* JADX INFO: renamed from: e */
    public boolean f115707e;

    /* JADX INFO: renamed from: f */
    public List<BLiveVoiceKTVOrder> f115708f = new ArrayList();

    public j0r(Act act, e30<Pair<Integer, BLiveVoiceKTVOrder>> e30Var, boolean z) {
        this.f115706d = act;
        this.f115705c = e30Var;
        this.f115707e = z;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f115708f.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f115706d.inflater().inflate(t6c0.f168424l9, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveVoiceKTVOrder bLiveVoiceKTVOrder, int i, int i2) {
        ((KtvAlreadyChooseSongItem) view).m77032k0(this.f115705c, bLiveVoiceKTVOrder, i2, this.f115707e, ypv.f199493a.m199309D0().equals(bLiveVoiceKTVOrder.userId));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceKTVOrder getItem(int i) {
        return this.f115708f.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m139201G(List<BLiveVoiceKTVOrder> list) {
        this.f115708f.clear();
        this.f115708f.addAll(list);
        notifyDataSetChanged();
    }
}
