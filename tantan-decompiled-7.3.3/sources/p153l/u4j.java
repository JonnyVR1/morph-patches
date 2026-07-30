package p153l;

import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;

/* JADX INFO: loaded from: classes4.dex */
public class u4j extends mer {

    /* JADX INFO: renamed from: g */
    public AudienceStartData f177467g;

    /* JADX INFO: renamed from: h */
    public hpp0 f177468h;

    /* JADX INFO: renamed from: i */
    public kyt f177469i;

    public u4j(RoomFrag roomFrag, String str, AudienceStartData audienceStartData) {
        super(roomFrag);
        this.f177467g = audienceStartData;
        this.f177468h = new hpp0(roomFrag, str);
        if (audienceStartData.withMute) {
            this.f177469i = new kyt(roomFrag);
        }
    }

    @Override // p153l.mer
    /* JADX INFO: renamed from: F2 */
    public void mo136576F2(dum dumVar) {
        m158074H2(this.f177468h, dumVar);
        kyt kytVar = this.f177469i;
        if (kytVar != null) {
            m158074H2(kytVar, dumVar);
        }
        super.mo136576F2(dumVar);
    }

    @Override // p153l.l6t
    /* JADX INFO: renamed from: s2 */
    public void mo120629s2() {
        this.f177468h.mo120629s2();
    }
}
