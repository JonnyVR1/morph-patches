package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenu;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class vao0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public long f183135i;

    /* JADX INFO: renamed from: j */
    public boolean f183136j;

    /* JADX INFO: renamed from: k */
    public z9o0 f183137k;

    /* JADX INFO: renamed from: l */
    public List<oln0> f183138l;

    public vao0(dum dumVar) {
        super(dumVar);
        this.f183138l = new ArrayList();
        z9o0 z9o0Var = new z9o0();
        this.f183137k = z9o0Var;
        z9o0Var.mo22064i1(this);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m200557O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public void m200564c4(jsv jsvVar) {
        z9o0 z9o0Var;
        if (jsvVar.m146875a() != 4 || (z9o0Var = this.f183137k) == null) {
            return;
        }
        z9o0Var.m219080d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m200565l4(vxj0 vxj0Var) {
        m200573b4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    private void m200566n4(String str, final boolean z) {
        if (!m200568W3()) {
            o1j0.m165649w(R$string.f48505yg);
            return;
        }
        this.f183136j = z;
        this.f183135i = pzi0.m174454o();
        duringCreated(u9o0.m195109c(((rwn0) m213810E2()).m202194o(), ((rwn0) m213810E2()).m202191k(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.kao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124703a.m200580j4(z, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.lao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130720a.m200579i4(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    private void m200567o4(List<BLiveVoiceEmojiMenu> list) {
        this.f183138l.clear();
        jyb.m147537z(list, new y20() { // from class: l.rao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161939a.m200581k4((BLiveVoiceEmojiMenu) obj);
            }
        });
        this.f183137k.m219083i(this.f183138l);
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m200568W3() {
        return !this.f183136j || pzi0.m174454o() - this.f183135i >= 6000;
    }

    /* JADX INFO: renamed from: X3 */
    public final bao0 m200569X3(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        bao0 bao0Var = new bao0(bLiveVoiceEmojiMenuButton);
        bao0Var.m205610K(new y20() { // from class: l.jao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119002a.m200574d4((BLiveVoiceEmojiMenuButton) obj);
            }
        });
        return bao0Var;
    }

    /* JADX INFO: renamed from: Y3 */
    public final List<d3q<?>> m200570Y3(List<BLiveVoiceEmojiMenuButton> list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.sao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167060a.m200575e4(arrayList, (BLiveVoiceEmojiMenuButton) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: Z3 */
    public final hao0 m200571Z3(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        hao0 hao0Var = new hao0(bLiveVoiceEmojiMenuButton);
        hao0Var.m205610K(new y20() { // from class: l.uao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178220a.m200576f4((BLiveVoiceEmojiMenuButton) obj);
            }
        });
        return hao0Var;
    }

    /* JADX INFO: renamed from: a4 */
    public final List<d3q<?>> m200572a4(List<BLiveVoiceEmojiMenuButton> list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.tao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172751a.m200577g4(arrayList, (BLiveVoiceEmojiMenuButton) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: b4 */
    public void m200573b4() {
        duringCreated(u9o0.m195108b()).subscribe(dhw.m115826e(new y20() { // from class: l.qao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156401a.m200578h4((List) obj);
            }
        }, new r5k()));
        i4g0.m138520r("e_intl_emoticon_panel_enter_click", "p_intl_emoticon_panel_show");
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m200574d4(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        m200566n4(bLiveVoiceEmojiMenuButton.type, false);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m200575e4(List list, BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        list.add(m200569X3(bLiveVoiceEmojiMenuButton));
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m200576f4(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        m200566n4(bLiveVoiceEmojiMenuButton.type, true);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m200577g4(List list, BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        list.add(m200571Z3(bLiveVoiceEmojiMenuButton));
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m200578h4(List list) {
        m200567o4(list);
        this.f183137k.m219084j();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m200579i4(boolean z, Throwable th) {
        if (z) {
            this.f183137k.m219080d();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m200580j4(boolean z, BLiveEnvelope bLiveEnvelope) {
        i4g0.m138520r("e_intl_emoticon_click", "p_intl_emoticon_panel_show");
        if (z) {
            this.f183137k.m219080d();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m200581k4(BLiveVoiceEmojiMenu bLiveVoiceEmojiMenu) {
        boolean zEquals = LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC.equals(bLiveVoiceEmojiMenu.categoryType);
        List<oln0> list = this.f183138l;
        if (zEquals) {
            list.add(new oln0(m200570Y3(bLiveVoiceEmojiMenu.buttons), bLiveVoiceEmojiMenu.categoryTitle, bLiveVoiceEmojiMenu.categoryType));
        } else {
            list.add(new oln0(m200572a4(bLiveVoiceEmojiMenu.buttons), bLiveVoiceEmojiMenu.categoryTitle, bLiveVoiceEmojiMenu.categoryType));
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m200582m4(gvn0 gvn0Var) {
        z9o0 z9o0Var;
        int iM132569j = gvn0Var.m132569j();
        if ((iM132569j == 4 || iM132569j == 9 || iM132569j == 12 || iM132569j == 13) && (z9o0Var = this.f183137k) != null) {
            z9o0Var.m219080d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98337x0()).filter(new qcj() { // from class: l.iao0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(guk0.m132331j(((gvn0) obj).m132564e()));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.mao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135566a.m200582m4((gvn0) obj);
            }
        }));
        duringCreated(m213811F2().VoiceMicEmojiEvent.showMicEmojiDialog().m199270g()).subscribe(dhw.m115826e(new y20() { // from class: l.nao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141034a.m200565l4((vxj0) obj);
            }
        }, new y20() { // from class: l.oao0
            @Override // p153l.y20
            public final void call(Object obj) {
                vao0.m200557O3((Throwable) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.pao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151315a.m200564c4((jsv) obj);
            }
        }));
    }
}
