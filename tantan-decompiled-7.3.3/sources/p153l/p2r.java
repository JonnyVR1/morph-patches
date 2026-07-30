package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongItem;
import com.tantanapp.media.ttmediautils.download.Action2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class p2r extends jic0<BLiveVoiceKTVSong> {

    /* JADX INFO: renamed from: c */
    public final Action2<BLiveVoiceKTVSong, Integer> f150289c;

    /* JADX INFO: renamed from: d */
    public final Act f150290d;

    /* JADX INFO: renamed from: e */
    public final t3r f150291e;

    /* JADX INFO: renamed from: f */
    public final List<BLiveVoiceKTVSong> f150292f = new ArrayList();

    public p2r(t3r t3rVar, Action2<BLiveVoiceKTVSong, Integer> action2) {
        this.f150291e = t3rVar;
        this.f150290d = t3rVar.act();
        this.f150289c = action2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f150292f.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f150290d.inflater().inflate(yec0.f199182n9, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveVoiceKTVSong bLiveVoiceKTVSong, int i, int i2) {
        bLiveVoiceKTVSong.position = i2;
        this.f150291e.m189133o4(true, bLiveVoiceKTVSong);
        ((KtvChooseSongItem) view).m78223m0(this.f150291e, this.f150289c, bLiveVoiceKTVSong);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceKTVSong getItem(int i) {
        return this.f150292f.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m170382G(List<BLiveVoiceKTVSong> list) {
        this.f150292f.clear();
        this.f150292f.addAll(list);
        notifyDataSetChanged();
    }
}
