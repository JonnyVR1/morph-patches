package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.medallabel.MedalLabelItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class vfx extends dac0<BLiveVoiceMedalWallItem> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f181322c;

    /* JADX INFO: renamed from: d */
    public final e30<BLiveVoiceGiftItem> f181323d;

    /* JADX INFO: renamed from: e */
    public final e30<String> f181324e;

    /* JADX INFO: renamed from: f */
    public final Act f181325f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveVoiceMedalWallItem> f181326g = new ArrayList();

    public vfx(lgx lgxVar, e30<String> e30Var, e30<BLiveVoiceGiftItem> e30Var2, e30<String> e30Var3) {
        this.f181325f = lgxVar.act();
        this.f181322c = e30Var;
        this.f181323d = e30Var2;
        this.f181324e = e30Var3;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f181326g.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f181325f.inflater().inflate(t6c0.f167981B9, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem, int i, int i2) {
        ((MedalLabelItemView) view).m76987r0(bLiveVoiceMedalWallItem, this.f181322c, this.f181323d, this.f181324e);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceMedalWallItem getItem(int i) {
        return this.f181326g.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m198297G(List<BLiveVoiceMedalWallItem> list) {
        this.f181326g.clear();
        this.f181326g.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }
}
