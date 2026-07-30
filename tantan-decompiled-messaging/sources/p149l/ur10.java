package p149l;

import com.p046p1.mobile.putong.live.external.intl.music.MusicPlaylistPageFrag;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ur10 extends bwr<is10> implements d0m {

    /* JADX INFO: renamed from: a */
    public final MusicPlaylistPageFrag f177801a;

    public ur10(MusicPlaylistPageFrag musicPlaylistPageFrag) {
        super(musicPlaylistPageFrag);
        this.f177801a = musicPlaylistPageFrag;
        pr10.m170951f1().m170969j1(l9s.m149093o0());
    }

    /* JADX INFO: renamed from: A2 */
    public void m195027A2() {
        pr10.m170951f1().m170982w1();
    }

    /* JADX INFO: renamed from: B2 */
    public void m195028B2() {
        pr10.m170951f1().m170954C1();
    }

    /* JADX INFO: renamed from: C2 */
    public void m195029C2(float f) {
        pr10.m170951f1().m170958G1(f, true);
    }

    @Override // p149l.d0m
    /* JADX INFO: renamed from: N */
    public void mo109523N(IntlMusicBean intlMusicBean, int i) {
        ((is10) this.viewModel).m137968V(intlMusicBean);
    }

    @Override // p149l.d0m
    /* JADX INFO: renamed from: e0 */
    public void mo109524e0(IntlMusicBean intlMusicBean) {
        ((is10) this.viewModel).m137962P(intlMusicBean);
    }

    @Override // p149l.d0m
    /* JADX INFO: renamed from: e1 */
    public void mo109525e1(List<IntlMusicBean> list) {
        ((is10) this.viewModel).m137965S(list);
    }

    @Override // p149l.d0m
    /* JADX INFO: renamed from: k1 */
    public void mo109526k1(IntlMusicBean intlMusicBean) {
        ((is10) this.viewModel).m137960N(intlMusicBean);
    }

    @Override // p149l.d0m
    /* JADX INFO: renamed from: o1 */
    public void mo109527o1(IntlMusicBean intlMusicBean) {
        ((is10) this.viewModel).m137961O(intlMusicBean);
    }

    /* JADX INFO: renamed from: r2 */
    public void m195030r2() {
        pr10.m170951f1().m170964d1();
    }

    /* JADX INFO: renamed from: s2 */
    public void m195031s2() {
        nnn0 nnn0Var = (nnn0) g4c.m124360a().m124361b();
        if (nnn0Var == null) {
            this.f177801a.getActivity().finish();
        } else {
            pr10.m170951f1().m170983x1(this, nnn0Var.m132067H0(), nnn0Var.m160262Z2());
            this.f177801a.duringCreated(pr10.m170951f1().m170979t1()).subscribe(ffw.m121197h(new e30() { // from class: l.tr10
                @Override // p149l.e30
                public final void call(Object obj) {
                    pr10.m170951f1().m170956E1((List) obj, false);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m195032u2() {
        this.f177801a.getActivity().startActivity(LiveIndependentSettingAct.m70698X1(this.f177801a.getActivity(), "intl_music_scanning_page_frag"));
    }

    /* JADX INFO: renamed from: v2 */
    public void m195033v2() {
        this.f177801a.getActivity().finish();
    }

    @Override // p149l.d0m
    /* JADX INFO: renamed from: w1 */
    public void mo109528w1(IntlMusicBean intlMusicBean) {
        ((is10) this.viewModel).m137959M(intlMusicBean);
    }

    /* JADX INFO: renamed from: w2 */
    public void m195034w2() {
        pr10.m170951f1().m170961J1(this);
    }

    /* JADX INFO: renamed from: y2 */
    public void m195035y2() {
        pr10.m170951f1().m170980u1();
    }

    /* JADX INFO: renamed from: z2 */
    public void m195036z2(IntlMusicBean intlMusicBean) {
        pr10.m170951f1().m170981v1(intlMusicBean);
    }
}
