package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleInHeaderItemIView;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.t6c0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class way extends dac0<BLiveVoiceSettle> {

    /* JADX INFO: renamed from: c */
    public final e30<BLiveVoiceSettle> f21975c;

    /* JADX INFO: renamed from: d */
    public final e30<BLiveVoiceSettle> f21976d;

    /* JADX INFO: renamed from: e */
    public final e30<BLiveVoiceSettle> f21977e;

    /* JADX INFO: renamed from: f */
    public final gay f21978f;

    /* JADX INFO: renamed from: g */
    public final Act f21979g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveVoiceSettle> f21980h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final int f21981i = 0;

    /* JADX INFO: renamed from: j */
    public final int f21982j;

    public way(gay gayVar, int i, e30<BLiveVoiceSettle> e30Var, e30<BLiveVoiceSettle> e30Var2, e30<BLiveVoiceSettle> e30Var3) {
        this.f21978f = gayVar;
        this.f21982j = i;
        this.f21979g = gayVar.act();
        this.f21975c = e30Var2;
        this.f21976d = e30Var3;
        this.f21977e = e30Var;
    }

    /* JADX INFO: renamed from: C */
    public int m24035C() {
        return this.f21980h.size();
    }

    /* JADX INFO: renamed from: D */
    public View m24036D(ViewGroup viewGroup, int i) {
        Act act = this.f21979g;
        return i == 0 ? act.inflater().inflate(t6c0.ja, viewGroup, false) : act.inflater().inflate(t6c0.ka, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m24034A(View view, BLiveVoiceSettle bLiveVoiceSettle, int i, int i2) {
        if (i == 0) {
            ((MemberManagerSettleInHeaderItemIView) view).m8876l(this.f21982j, this.f21980h.size() > 0 ? this.f21980h.size() - 1 : 0);
        } else {
            ((MemberManagerSettleItemView) view).m8891v0(bLiveVoiceSettle, this.f21978f, this.f21982j, this.f21977e, this.f21975c, this.f21976d);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceSettle getItem(int i) {
        return this.f21980h.get(i);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m24039G(List<BLiveVoiceSettle> list) {
        return !vwb.J(list) && list.size() > 1 && list.get(0).userId.equals(list.get(1).userId);
    }

    /* JADX INFO: renamed from: H */
    public void m24040H(int i, List<BLiveVoiceSettle> list) {
        this.f21980h.clear();
        notifyItemRemoved(i);
        this.f21980h.addAll(list);
        notifyItemChanged(0);
    }

    /* JADX INFO: renamed from: I */
    public void m24041I(List<BLiveVoiceSettle> list) {
        this.f21980h.clear();
        if (!vwb.J(list) && !m24039G(list)) {
            list.add(0, list.get(0));
        }
        this.f21980h.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
