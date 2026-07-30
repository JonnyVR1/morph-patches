package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenu;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class vbn extends i6t<rwn0, acn> {

    /* JADX INFO: renamed from: i */
    public long f183263i;

    /* JADX INFO: renamed from: j */
    public boolean f183264j;

    public vbn(dum dumVar, FrameLayout frameLayout) {
        super(dumVar);
        mo52715C(new acn(frameLayout));
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m200719L3(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, BLiveVoiceEmojiMenu bLiveVoiceEmojiMenu) {
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
    public static /* synthetic */ void m200720M3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    private boolean m200721N3() {
        return !this.f183264j || pzi0.m174454o() - this.f183263i >= 6000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public void m200722P3(List<BLiveVoiceEmojiMenu> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList<BLiveVoiceEmojiMenuButton> arrayList2 = new ArrayList<>();
        final ArrayList<BLiveVoiceEmojiMenuButton> arrayList3 = new ArrayList<>();
        jyb.m147537z(list, new y20() { // from class: l.sbn
            @Override // p153l.y20
            public final void call(Object obj) {
                vbn.m200719L3(arrayList, arrayList2, arrayList3, (BLiveVoiceEmojiMenu) obj);
            }
        });
        ((acn) this.viewModel).m96871p(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m200723O3(String str, boolean z) {
        if (!m200721N3()) {
            o1j0.m165649w(R$string.f48505yg);
            return;
        }
        this.f183264j = z;
        this.f183263i = pzi0.m174454o();
        duringCreated(u9o0.m195109c(((rwn0) m213810E2()).m202194o(), ((rwn0) m213810E2()).m202191k(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.tbn
            @Override // p153l.y20
            public final void call(Object obj) {
                i4g0.m138520r("e_intl_emoticon_click", "p_intl_emoticon_panel_show");
            }
        }, new y20() { // from class: l.ubn
            @Override // p153l.y20
            public final void call(Object obj) {
                vbn.m200720M3((Throwable) obj);
            }
        }));
        if (z) {
            m213811F2().ChatEvent.dismissDialog().m199277p();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(u9o0.m195108b()).subscribe(dhw.m115826e(new y20() { // from class: l.rbn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162031a.m200722P3((List) obj);
            }
        }, new r5k()));
    }
}
