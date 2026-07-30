package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.medallabel.MedalLabelItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class tox extends jic0<BLiveVoiceMedalWallItem> {

    /* JADX INFO: renamed from: c */
    public final y20<String> f175516c;

    /* JADX INFO: renamed from: d */
    public final y20<BLiveVoiceGiftItem> f175517d;

    /* JADX INFO: renamed from: e */
    public final y20<String> f175518e;

    /* JADX INFO: renamed from: f */
    public final Act f175519f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveVoiceMedalWallItem> f175520g = new ArrayList();

    public tox(jpx jpxVar, y20<String> y20Var, y20<BLiveVoiceGiftItem> y20Var2, y20<String> y20Var3) {
        this.f175519f = jpxVar.act();
        this.f175516c = y20Var;
        this.f175517d = y20Var2;
        this.f175518e = y20Var3;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f175520g.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f175519f.inflater().inflate(yec0.f198713B9, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem, int i, int i2) {
        ((MedalLabelItemView) view).m78170r0(bLiveVoiceMedalWallItem, this.f175516c, this.f175517d, this.f175518e);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceMedalWallItem getItem(int i) {
        return this.f175520g.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m192099G(List<BLiveVoiceMedalWallItem> list) {
        this.f175520g.clear();
        this.f175520g.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }
}
