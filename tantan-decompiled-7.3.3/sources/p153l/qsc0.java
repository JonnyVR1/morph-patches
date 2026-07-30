package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.ReceiveRecords;
import com.p051p1.mobile.putong.core.data.RedPacket;
import com.p051p1.mobile.putong.core.p058ui.messages.redpacket.RedPacketCustomizeHeaderView;
import com.p051p1.mobile.putong.core.p058ui.messages.redpacket.RedPacketUserItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qsc0 extends jic0<ReceiveRecords> {

    /* JADX INFO: renamed from: c */
    public PutongAct f159278c;

    /* JADX INFO: renamed from: d */
    public ztc0 f159279d;

    /* JADX INFO: renamed from: e */
    public List<ReceiveRecords> f159280e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public RedPacket f159281f = RedPacket.new_();

    /* JADX INFO: renamed from: g */
    public boolean f159282g = false;

    /* JADX INFO: renamed from: h */
    public long f159283h;

    public qsc0(PutongAct putongAct, ztc0 ztc0Var) {
        this.f159278c = putongAct;
        this.f159279d = ztc0Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f159280e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        PutongAct putongAct = this.f159278c;
        return i == 1 ? putongAct.inflater().inflate(qec0.f157083n4, viewGroup, false) : putongAct.inflater().inflate(qec0.f157097p4, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, ReceiveRecords receiveRecords, int i, int i2) {
        if (i == 1) {
            ((RedPacketCustomizeHeaderView) view).m50927f(this.f159280e.get(i2), this.f159282g, this.f159281f, this.f159279d, this.f159280e, this, this.f159283h);
        } else if (i == 2) {
            ((RedPacketUserItemView) view).m50935e(this.f159280e.get(i2), this.f159282g, this.f159281f, this, this.f159283h);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ReceiveRecords getItem(int i) {
        return this.f159280e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m177759G(List<ReceiveRecords> list, RedPacket redPacket, boolean z, long j) {
        this.f159280e = list;
        this.f159281f = redPacket;
        this.f159282g = z;
        this.f159283h = j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }
}
