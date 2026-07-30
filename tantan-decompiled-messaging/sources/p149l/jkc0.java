package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.ReceiveRecords;
import com.p046p1.mobile.putong.core.data.RedPacket;
import com.p046p1.mobile.putong.core.p053ui.messages.redpacket.RedPacketCustomizeHeaderView;
import com.p046p1.mobile.putong.core.p053ui.messages.redpacket.RedPacketUserItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jkc0 extends dac0<ReceiveRecords> {

    /* JADX INFO: renamed from: c */
    public PutongAct f118359c;

    /* JADX INFO: renamed from: d */
    public slc0 f118360d;

    /* JADX INFO: renamed from: e */
    public List<ReceiveRecords> f118361e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public RedPacket f118362f = RedPacket.new_();

    /* JADX INFO: renamed from: g */
    public boolean f118363g = false;

    /* JADX INFO: renamed from: h */
    public long f118364h;

    public jkc0(PutongAct putongAct, slc0 slc0Var) {
        this.f118359c = putongAct;
        this.f118360d = slc0Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f118361e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        PutongAct putongAct = this.f118359c;
        return i == 1 ? putongAct.inflater().inflate(l6c0.f126527n4, viewGroup, false) : putongAct.inflater().inflate(l6c0.f126541p4, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, ReceiveRecords receiveRecords, int i, int i2) {
        if (i == 1) {
            ((RedPacketCustomizeHeaderView) view).m49744f(this.f118361e.get(i2), this.f118363g, this.f118362f, this.f118360d, this.f118361e, this, this.f118364h);
        } else if (i == 2) {
            ((RedPacketUserItemView) view).m49752e(this.f118361e.get(i2), this.f118363g, this.f118362f, this, this.f118364h);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ReceiveRecords getItem(int i) {
        return this.f118361e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m141858G(List<ReceiveRecords> list, RedPacket redPacket, boolean z, long j) {
        this.f118361e = list;
        this.f118362f = redPacket;
        this.f118363g = z;
        this.f118364h = j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }
}
