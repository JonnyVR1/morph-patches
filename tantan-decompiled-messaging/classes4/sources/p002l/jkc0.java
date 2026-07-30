package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.messages.redpacket.RedPacketCustomizeHeaderView;
import com.p000p1.mobile.putong.core.p001ui.messages.redpacket.RedPacketUserItemView;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.data.ReceiveRecords;
import com.p1.mobile.putong.core.data.RedPacket;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.l6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jkc0 extends dac0<ReceiveRecords> {

    /* JADX INFO: renamed from: c */
    public PutongAct f13840c;

    /* JADX INFO: renamed from: d */
    public slc0 f13841d;

    /* JADX INFO: renamed from: e */
    public List<ReceiveRecords> f13842e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public RedPacket f13843f = RedPacket.new_();

    /* JADX INFO: renamed from: g */
    public boolean f13844g = false;

    /* JADX INFO: renamed from: h */
    public long f13845h;

    public jkc0(PutongAct putongAct, slc0 slc0Var) {
        this.f13840c = putongAct;
        this.f13841d = slc0Var;
    }

    /* JADX INFO: renamed from: C */
    public int m15981C() {
        return this.f13842e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m15982D(ViewGroup viewGroup, int i) {
        PutongAct putongAct = this.f13840c;
        return i == 1 ? putongAct.inflater().inflate(l6c0.n4, viewGroup, false) : putongAct.inflater().inflate(l6c0.p4, viewGroup, false);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m15980A(View view, ReceiveRecords receiveRecords, int i, int i2) {
        if (i == 1) {
            ((RedPacketCustomizeHeaderView) view).m158f(this.f13842e.get(i2), this.f13844g, this.f13843f, this.f13841d, this.f13842e, this, this.f13845h);
        } else if (i == 2) {
            ((RedPacketUserItemView) view).m168e(this.f13842e.get(i2), this.f13844g, this.f13843f, this, this.f13845h);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ReceiveRecords getItem(int i) {
        return this.f13842e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m15985G(List<ReceiveRecords> list, RedPacket redPacket, boolean z, long j) {
        this.f13842e = list;
        this.f13843f = redPacket;
        this.f13844g = z;
        this.f13845h = j;
    }

    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }
}
