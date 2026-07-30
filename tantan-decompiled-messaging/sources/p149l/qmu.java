package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatMissedCall;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatMissedCallItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class qmu extends dac0<BLiveVideoChatMissedCall> {

    /* JADX INFO: renamed from: c */
    public final Act f155339c;

    /* JADX INFO: renamed from: d */
    public final vmu f155340d;

    /* JADX INFO: renamed from: e */
    public List<BLiveVideoChatMissedCall> f155341e = new ArrayList();

    public qmu(Act act, vmu vmuVar) {
        this.f155339c = act;
        this.f155340d = vmuVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f155341e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f155339c.inflater().inflate(s6c0.f162660D1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveVideoChatMissedCall bLiveVideoChatMissedCall, int i, int i2) {
        ((LiveVChatMissedCallItem) view).m69745l0(this.f155340d, bLiveVideoChatMissedCall);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVideoChatMissedCall getItem(int i) {
        return this.f155341e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m175581G(List<BLiveVideoChatMissedCall> list) {
        this.f155341e.clear();
        this.f155341e.addAll(list);
        notifyDataSetChanged();
    }
}
