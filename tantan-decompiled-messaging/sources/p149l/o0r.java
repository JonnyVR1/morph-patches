package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongItem;
import com.tantanapp.media.ttmediautils.download.Action2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class o0r extends dac0<BLiveVoiceKTVSong> {

    /* JADX INFO: renamed from: c */
    public final Action2<BLiveVoiceKTVSong, Integer> f141358c;

    /* JADX INFO: renamed from: d */
    public final Act f141359d;

    /* JADX INFO: renamed from: e */
    public final s1r f141360e;

    /* JADX INFO: renamed from: f */
    public final List<BLiveVoiceKTVSong> f141361f = new ArrayList();

    public o0r(s1r s1rVar, Action2<BLiveVoiceKTVSong, Integer> action2) {
        this.f141360e = s1rVar;
        this.f141359d = s1rVar.act();
        this.f141358c = action2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f141361f.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f141359d.inflater().inflate(t6c0.f168450n9, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveVoiceKTVSong bLiveVoiceKTVSong, int i, int i2) {
        bLiveVoiceKTVSong.position = i2;
        this.f141360e.m182040o4(true, bLiveVoiceKTVSong);
        ((KtvChooseSongItem) view).m77040m0(this.f141360e, this.f141358c, bLiveVoiceKTVSong);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceKTVSong getItem(int i) {
        return this.f141361f.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m162166G(List<BLiveVoiceKTVSong> list) {
        this.f141361f.clear();
        this.f141361f.addAll(list);
        notifyDataSetChanged();
    }
}
