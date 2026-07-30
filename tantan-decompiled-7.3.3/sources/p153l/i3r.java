package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView;
import com.tantanapp.media.ttmediautils.download.Action2;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class i3r implements iam<t3r> {

    /* JADX INFO: renamed from: a */
    public final KtvChooseSongPageView f112779a;

    /* JADX INFO: renamed from: b */
    public p2r f112780b;

    /* JADX INFO: renamed from: c */
    public p2r f112781c;

    /* JADX INFO: renamed from: d */
    public t3r<rwn0, i3r> f112782d;

    public i3r(Act act) {
        this.f112779a = KtvChooseSongPageView.m78231r0(act.inflater());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112779a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(t3r t3rVar) {
        this.f112782d = t3rVar;
    }

    /* JADX INFO: renamed from: b */
    public void m138333b() {
        this.f112779a.m78235q0();
        this.f112781c.m170382G(new ArrayList());
        this.f112780b.m170382G(new ArrayList());
    }

    /* JADX INFO: renamed from: c */
    public View m138334c() {
        return this.f112779a;
    }

    /* JADX INFO: renamed from: d */
    public void m138335d(final t3r t3rVar) {
        Objects.requireNonNull(t3rVar);
        this.f112780b = new p2r(t3rVar, new Action2() { // from class: l.h3r
            @Override // com.tantanapp.media.ttmediautils.download.Action2
            public final void call(Object obj, Object obj2) {
                t3rVar.m189124e4((BLiveVoiceKTVSong) obj, ((Integer) obj2).intValue());
            }
        });
        this.f112781c = new p2r(t3rVar, new Action2() { // from class: l.h3r
            @Override // com.tantanapp.media.ttmediautils.download.Action2
            public final void call(Object obj, Object obj2) {
                t3rVar.m189124e4((BLiveVoiceKTVSong) obj, ((Integer) obj2).intValue());
            }
        });
        this.f112779a.m78237t0(t3rVar);
        this.f112779a.m78236s0(this.f112780b, this.f112781c);
        this.f112780b.m170382G(new ArrayList());
    }

    /* JADX INFO: renamed from: e */
    public void m138336e(List<BLiveVoiceKTVSong> list) {
        this.f112779a.setListData(list);
    }

    /* JADX INFO: renamed from: f */
    public void m138337f(List<BLiveVoiceKTVSong> list) {
        this.f112779a.setSearchListData(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
