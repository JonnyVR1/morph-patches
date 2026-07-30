package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView;
import com.tantanapp.media.ttmediautils.download.Action2;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class h1r implements s7m<s1r> {

    /* JADX INFO: renamed from: a */
    public final KtvChooseSongPageView f105454a;

    /* JADX INFO: renamed from: b */
    public o0r f105455b;

    /* JADX INFO: renamed from: c */
    public o0r f105456c;

    /* JADX INFO: renamed from: d */
    public s1r<nnn0, h1r> f105457d;

    public h1r(Act act) {
        this.f105454a = KtvChooseSongPageView.m77048r0(act.inflater());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f105454a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(s1r s1rVar) {
        this.f105457d = s1rVar;
    }

    /* JADX INFO: renamed from: b */
    public void m129069b() {
        this.f105454a.m77052q0();
        this.f105456c.m162166G(new ArrayList());
        this.f105455b.m162166G(new ArrayList());
    }

    /* JADX INFO: renamed from: c */
    public View m129070c() {
        return this.f105454a;
    }

    /* JADX INFO: renamed from: d */
    public void m129071d(final s1r s1rVar) {
        Objects.requireNonNull(s1rVar);
        this.f105455b = new o0r(s1rVar, new Action2() { // from class: l.g1r
            @Override // com.tantanapp.media.ttmediautils.download.Action2
            public final void call(Object obj, Object obj2) {
                s1rVar.m182031e4((BLiveVoiceKTVSong) obj, ((Integer) obj2).intValue());
            }
        });
        this.f105456c = new o0r(s1rVar, new Action2() { // from class: l.g1r
            @Override // com.tantanapp.media.ttmediautils.download.Action2
            public final void call(Object obj, Object obj2) {
                s1rVar.m182031e4((BLiveVoiceKTVSong) obj, ((Integer) obj2).intValue());
            }
        });
        this.f105454a.m77054t0(s1rVar);
        this.f105454a.m77053s0(this.f105455b, this.f105456c);
        this.f105455b.m162166G(new ArrayList());
    }

    /* JADX INFO: renamed from: e */
    public void m129072e(List<BLiveVoiceKTVSong> list) {
        this.f105454a.setListData(list);
    }

    /* JADX INFO: renamed from: f */
    public void m129073f(List<BLiveVoiceKTVSong> list) {
        this.f105454a.setSearchListData(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
