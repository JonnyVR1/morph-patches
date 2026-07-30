package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenu;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class r1o0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public long f157301i;

    /* JADX INFO: renamed from: j */
    public boolean f157302j;

    /* JADX INFO: renamed from: k */
    public v0o0 f157303k;

    /* JADX INFO: renamed from: l */
    public List<kcn0> f157304l;

    public r1o0(bsm bsmVar) {
        super(bsmVar);
        this.f157304l = new ArrayList();
        v0o0 v0o0Var = new v0o0();
        this.f157303k = v0o0Var;
        v0o0Var.mo21065i1(this);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m177507O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public void m177514c4(iqv iqvVar) {
        v0o0 v0o0Var;
        if (iqvVar.m137794a() != 4 || (v0o0Var = this.f157303k) == null) {
            return;
        }
        v0o0Var.m196501d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m177515l4(soj0 soj0Var) {
        m177523b4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    private void m177516n4(String str, final boolean z) {
        if (!m177518W3()) {
            lsi0.m151593w(R$string.f47657yg);
            return;
        }
        this.f157302j = z;
        this.f157301i = mqi0.m155944o();
        duringCreated(q0o0.m172338c(((nnn0) m206027E2()).m149818o(), ((nnn0) m206027E2()).m149814k(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.g1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100189a.m177530j4(z, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.h1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105446a.m177529i4(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    private void m177517o4(List<BLiveVoiceEmojiMenu> list) {
        this.f157304l.clear();
        vwb.m200354z(list, new e30() { // from class: l.n1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136678a.m177531k4((BLiveVoiceEmojiMenu) obj);
            }
        });
        this.f157303k.m196504i(this.f157304l);
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m177518W3() {
        return !this.f157302j || mqi0.m155944o() - this.f157301i >= 6000;
    }

    /* JADX INFO: renamed from: X3 */
    public final x0o0 m177519X3(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        x0o0 x0o0Var = new x0o0(bLiveVoiceEmojiMenuButton);
        x0o0Var.m181876K(new e30() { // from class: l.f1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94109a.m177524d4((BLiveVoiceEmojiMenuButton) obj);
            }
        });
        return x0o0Var;
    }

    /* JADX INFO: renamed from: Y3 */
    public final List<d1q<?>> m177520Y3(List<BLiveVoiceEmojiMenuButton> list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.o1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141467a.m177525e4(arrayList, (BLiveVoiceEmojiMenuButton) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: Z3 */
    public final d1o0 m177521Z3(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        d1o0 d1o0Var = new d1o0(bLiveVoiceEmojiMenuButton);
        d1o0Var.m181876K(new e30() { // from class: l.q1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152141a.m177526f4((BLiveVoiceEmojiMenuButton) obj);
            }
        });
        return d1o0Var;
    }

    /* JADX INFO: renamed from: a4 */
    public final List<d1q<?>> m177522a4(List<BLiveVoiceEmojiMenuButton> list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.p1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146750a.m177527g4(arrayList, (BLiveVoiceEmojiMenuButton) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: b4 */
    public void m177523b4() {
        duringCreated(q0o0.m172337b()).subscribe(ffw.m121194e(new e30() { // from class: l.m1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130843a.m177528h4((List) obj);
            }
        }, new z2k()));
        zvf0.m220396r("e_intl_emoticon_panel_enter_click", "p_intl_emoticon_panel_show");
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m177524d4(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        m177516n4(bLiveVoiceEmojiMenuButton.type, false);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m177525e4(List list, BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        list.add(m177519X3(bLiveVoiceEmojiMenuButton));
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m177526f4(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        m177516n4(bLiveVoiceEmojiMenuButton.type, true);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m177527g4(List list, BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        list.add(m177521Z3(bLiveVoiceEmojiMenuButton));
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m177528h4(List list) {
        m177517o4(list);
        this.f157303k.m196505j();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m177529i4(boolean z, Throwable th) {
        if (z) {
            this.f157303k.m196501d();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m177530j4(boolean z, BLiveEnvelope bLiveEnvelope) {
        zvf0.m220396r("e_intl_emoticon_click", "p_intl_emoticon_panel_show");
        if (z) {
            this.f157303k.m196501d();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m177531k4(BLiveVoiceEmojiMenu bLiveVoiceEmojiMenu) {
        boolean zEquals = LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC.equals(bLiveVoiceEmojiMenu.categoryType);
        List<kcn0> list = this.f157304l;
        if (zEquals) {
            list.add(new kcn0(m177520Y3(bLiveVoiceEmojiMenu.buttons), bLiveVoiceEmojiMenu.categoryTitle, bLiveVoiceEmojiMenu.categoryType));
        } else {
            list.add(new kcn0(m177522a4(bLiveVoiceEmojiMenu.buttons), bLiveVoiceEmojiMenu.categoryTitle, bLiveVoiceEmojiMenu.categoryType));
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m177532m4(cmn0 cmn0Var) {
        v0o0 v0o0Var;
        int iM107682j = cmn0Var.m107682j();
        if ((iM107682j == 4 || iM107682j == 9 || iM107682j == 12 || iM107682j == 13) && (v0o0Var = this.f157303k) != null) {
            v0o0Var.m196501d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189155x0()).filter(new w9j() { // from class: l.e1o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(alk0.m97311j(((cmn0) obj).m107677e()));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.i1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110478a.m177532m4((cmn0) obj);
            }
        }));
        duringCreated(m206028F2().VoiceMicEmojiEvent.showMicEmojiDialog().m172460g()).subscribe(ffw.m121194e(new e30() { // from class: l.j1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115825a.m177515l4((soj0) obj);
            }
        }, new e30() { // from class: l.k1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                r1o0.m177507O3((Throwable) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.l1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125674a.m177514c4((iqv) obj);
            }
        }));
    }
}
