package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomCover;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class yl40 extends pn40 {

    /* JADX INFO: renamed from: H */
    public String f198861H;

    /* JADX INFO: renamed from: I */
    public String f198862I;

    public yl40(qn40 qn40Var, zgt zgtVar) {
        super(qn40Var, zgtVar);
        this.f198861H = "normal";
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ C22306c m215214H2(String str, Picture picture, BLiveRoom bLiveRoom) {
        if (!BLiveRoom.EMPTY.equals(bLiveRoom)) {
            return C22306c.just(bLiveRoom);
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        bLiveRoomNew_.title = str;
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = picture;
        bLiveRoomNew_.cover = bLiveRoomCoverNew_;
        return LivingNormalApiProvider.m71481i4(bLiveRoomNew_);
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: F0 */
    public int mo120451F0() {
        return 1;
    }

    /* JADX INFO: renamed from: J2 */
    public String m215216J2() {
        return this.f198862I;
    }

    /* JADX INFO: renamed from: K2 */
    public String m215217K2() {
        return this.f198861H;
    }

    /* JADX INFO: renamed from: L2 */
    public C22306c<BLiveRoom> m215218L2(final String str, final Picture picture) {
        return !m170394B2() ? C22306c.just(m170393A2().mo165469j()) : LivingNormalApiProvider.m71347T5(true, null).flatMap(new w9j() { // from class: l.wl40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return yl40.m215214H2(str, picture, (BLiveRoom) obj);
            }
        }).map(new w9j() { // from class: l.xl40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f193382a.m215222P2((BLiveRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M2 */
    public boolean m215219M2() {
        return m215220N2();
    }

    /* JADX INFO: renamed from: N2 */
    public boolean m215220N2() {
        return AnchorStartData.ANCHOR_SOURCE_MULTI_CALL_MATCH.equals(this.f198862I);
    }

    /* JADX INFO: renamed from: O2 */
    public boolean m215221O2() {
        return "obs".equals(this.f198861H);
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ BLiveRoom m215222P2(BLiveRoom bLiveRoom) {
        mo132136i(bLiveRoom);
        h5j0.INSTANCE.m129404c("create_live_room", "getRoomInfoWithCreating");
        return bLiveRoom;
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ BLiveRoom m215223Q2(BLiveRoom bLiveRoom) {
        mo132136i(bLiveRoom);
        return bLiveRoom;
    }

    /* JADX INFO: renamed from: R2 */
    public C22306c<BLiveRoom> m215224R2() {
        return !m170394B2() ? C22306c.just(m170393A2().mo165469j()) : LivingNormalApiProvider.m71347T5(true, null).map(new w9j() { // from class: l.vl40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181915a.m215223Q2((BLiveRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public void m215225S2(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f198862I = str;
    }

    /* JADX INFO: renamed from: T2 */
    public void m215226T2(String str) {
        this.f198861H = str;
    }

    @Override // p149l.lh20
    /* JADX INFO: renamed from: h */
    public void mo149812h(iqv iqvVar) {
        iqv iqvVarM221515e = this.f128033b.m221515e();
        if (iqvVarM221515e == null || iqvVarM221515e.m137794a() == 4) {
            return;
        }
        this.f128033b.onNext(iqvVar);
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: o0 */
    public String mo132155o0() {
        return this.f198862I;
    }

    @Override // p149l.pn40, p149l.lh20
    /* JADX INFO: renamed from: p */
    public boolean mo97490p() {
        return true;
    }
}
