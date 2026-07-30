package p153l;

import com.p051p1.mobile.putong.live.external.intl.music.MusicPlaylistPageFrag;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class c020 extends cyr<q020> implements x2m {

    /* JADX INFO: renamed from: a */
    public final MusicPlaylistPageFrag f79198a;

    public c020(MusicPlaylistPageFrag musicPlaylistPageFrag) {
        super(musicPlaylistPageFrag);
        this.f79198a = musicPlaylistPageFrag;
        xz10.m213668f1().m213686j1(mbs.m157870o0());
    }

    /* JADX INFO: renamed from: A2 */
    public void m107302A2() {
        xz10.m213668f1().m213699w1();
    }

    /* JADX INFO: renamed from: B2 */
    public void m107303B2() {
        xz10.m213668f1().m213671C1();
    }

    /* JADX INFO: renamed from: C2 */
    public void m107304C2(float f) {
        xz10.m213668f1().m213675G1(f, true);
    }

    @Override // p153l.x2m
    /* JADX INFO: renamed from: N */
    public void mo107305N(IntlMusicBean intlMusicBean, int i) {
        ((q020) this.viewModel).m174676V(intlMusicBean);
    }

    @Override // p153l.x2m
    /* JADX INFO: renamed from: e0 */
    public void mo107306e0(IntlMusicBean intlMusicBean) {
        ((q020) this.viewModel).m174670P(intlMusicBean);
    }

    @Override // p153l.x2m
    /* JADX INFO: renamed from: e1 */
    public void mo107307e1(List<IntlMusicBean> list) {
        ((q020) this.viewModel).m174673S(list);
    }

    @Override // p153l.x2m
    /* JADX INFO: renamed from: k1 */
    public void mo107308k1(IntlMusicBean intlMusicBean) {
        ((q020) this.viewModel).m174668N(intlMusicBean);
    }

    @Override // p153l.x2m
    /* JADX INFO: renamed from: o1 */
    public void mo107309o1(IntlMusicBean intlMusicBean) {
        ((q020) this.viewModel).m174669O(intlMusicBean);
    }

    /* JADX INFO: renamed from: r2 */
    public void m107310r2() {
        xz10.m213668f1().m213681d1();
    }

    /* JADX INFO: renamed from: s2 */
    public void m107311s2() {
        rwn0 rwn0Var = (rwn0) o5c.m166095a().m166096b();
        if (rwn0Var == null) {
            this.f79198a.getActivity().finish();
        } else {
            xz10.m213668f1().m213700x1(this, rwn0Var.m168456H0(), rwn0Var.m183424Z2());
            this.f79198a.duringCreated(xz10.m213668f1().m213696t1()).subscribe(dhw.m115829h(new y20() { // from class: l.b020
                @Override // p153l.y20
                public final void call(Object obj) {
                    xz10.m213668f1().m213673E1((List) obj, false);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m107312u2() {
        this.f79198a.getActivity().startActivity(LiveIndependentSettingAct.m71881Y1(this.f79198a.getActivity(), "intl_music_scanning_page_frag"));
    }

    /* JADX INFO: renamed from: v2 */
    public void m107313v2() {
        this.f79198a.getActivity().finish();
    }

    @Override // p153l.x2m
    /* JADX INFO: renamed from: w1 */
    public void mo107314w1(IntlMusicBean intlMusicBean) {
        ((q020) this.viewModel).m174667M(intlMusicBean);
    }

    /* JADX INFO: renamed from: w2 */
    public void m107315w2() {
        xz10.m213668f1().m213678J1(this);
    }

    /* JADX INFO: renamed from: y2 */
    public void m107316y2() {
        xz10.m213668f1().m213697u1();
    }

    /* JADX INFO: renamed from: z2 */
    public void m107317z2(IntlMusicBean intlMusicBean) {
        xz10.m213668f1().m213698v1(intlMusicBean);
    }
}
