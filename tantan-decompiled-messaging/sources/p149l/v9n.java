package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenu;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class v9n extends h4t<nnn0, aan> {

    /* JADX INFO: renamed from: i */
    public long f180661i;

    /* JADX INFO: renamed from: j */
    public boolean f180662j;

    public v9n(bsm bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        mo51532C(new aan(frameLayout));
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m197580L3(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, BLiveVoiceEmojiMenu bLiveVoiceEmojiMenu) {
        arrayList.add(bLiveVoiceEmojiMenu.categoryTitle);
        boolean zEquals = LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC.equals(bLiveVoiceEmojiMenu.categoryType);
        List<BLiveVoiceEmojiMenuButton> list = bLiveVoiceEmojiMenu.buttons;
        if (zEquals) {
            arrayList2.addAll(list);
        } else {
            arrayList3.addAll(list);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m197581M3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    private boolean m197582N3() {
        return !this.f180662j || mqi0.m155944o() - this.f180661i >= 6000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public void m197583P3(List<BLiveVoiceEmojiMenu> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList<BLiveVoiceEmojiMenuButton> arrayList2 = new ArrayList<>();
        final ArrayList<BLiveVoiceEmojiMenuButton> arrayList3 = new ArrayList<>();
        vwb.m200354z(list, new e30() { // from class: l.s9n
            @Override // p149l.e30
            public final void call(Object obj) {
                v9n.m197580L3(arrayList, arrayList2, arrayList3, (BLiveVoiceEmojiMenu) obj);
            }
        });
        ((aan) this.viewModel).m95561p(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m197584O3(String str, boolean z) {
        if (!m197582N3()) {
            lsi0.m151593w(R$string.f47657yg);
            return;
        }
        this.f180662j = z;
        this.f180661i = mqi0.m155944o();
        duringCreated(q0o0.m172338c(((nnn0) m206027E2()).m149818o(), ((nnn0) m206027E2()).m149814k(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.t9n
            @Override // p149l.e30
            public final void call(Object obj) {
                zvf0.m220396r("e_intl_emoticon_click", "p_intl_emoticon_panel_show");
            }
        }, new e30() { // from class: l.u9n
            @Override // p149l.e30
            public final void call(Object obj) {
                v9n.m197581M3((Throwable) obj);
            }
        }));
        if (z) {
            m206028F2().ChatEvent.dismissDialog().m172467p();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(q0o0.m172337b()).subscribe(ffw.m121194e(new e30() { // from class: l.r9n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158421a.m197583P3((List) obj);
            }
        }, new z2k()));
    }
}
