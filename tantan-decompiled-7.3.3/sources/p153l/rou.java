package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatMissedCall;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatMissedCallItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class rou extends jic0<BLiveVideoChatMissedCall> {

    /* JADX INFO: renamed from: c */
    public final Act f164244c;

    /* JADX INFO: renamed from: d */
    public final wou f164245d;

    /* JADX INFO: renamed from: e */
    public List<BLiveVideoChatMissedCall> f164246e = new ArrayList();

    public rou(Act act, wou wouVar) {
        this.f164244c = act;
        this.f164245d = wouVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f164246e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f164244c.inflater().inflate(xec0.f193774D1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveVideoChatMissedCall bLiveVideoChatMissedCall, int i, int i2) {
        ((LiveVChatMissedCallItem) view).m70928l0(this.f164245d, bLiveVideoChatMissedCall);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVideoChatMissedCall getItem(int i) {
        return this.f164246e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m182446G(List<BLiveVideoChatMissedCall> list) {
        this.f164246e.clear();
        this.f164246e.addAll(list);
        notifyDataSetChanged();
    }
}
