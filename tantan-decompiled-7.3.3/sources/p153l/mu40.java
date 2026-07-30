package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomCover;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class mu40 extends dw40 {

    /* JADX INFO: renamed from: H */
    public String f138739H;

    /* JADX INFO: renamed from: I */
    public String f138740I;

    public mu40(ew40 ew40Var, ajt ajtVar) {
        super(ew40Var, ajtVar);
        this.f138739H = "normal";
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ C22421c m160103H2(String str, Picture picture, BLiveRoom bLiveRoom) {
        if (!BLiveRoom.EMPTY.equals(bLiveRoom)) {
            return C22421c.just(bLiveRoom);
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        bLiveRoomNew_.title = str;
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = picture;
        bLiveRoomNew_.cover = bLiveRoomCoverNew_;
        return LivingNormalApiProvider.m72664i4(bLiveRoomNew_);
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: F0 */
    public int mo146094F0() {
        return 1;
    }

    /* JADX INFO: renamed from: J2 */
    public String m160105J2() {
        return this.f138740I;
    }

    /* JADX INFO: renamed from: K2 */
    public String m160106K2() {
        return this.f138739H;
    }

    /* JADX INFO: renamed from: L2 */
    public C22421c<BLiveRoom> m160107L2(final String str, final Picture picture) {
        return !m118364B2() ? C22421c.just(m118363A2().mo122891j()) : LivingNormalApiProvider.m72530T5(true, null).flatMap(new qcj() { // from class: l.ku40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mu40.m160103H2(str, picture, (BLiveRoom) obj);
            }
        }).map(new qcj() { // from class: l.lu40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f133593a.m160111P2((BLiveRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M2 */
    public boolean m160108M2() {
        return m160109N2();
    }

    /* JADX INFO: renamed from: N2 */
    public boolean m160109N2() {
        return AnchorStartData.ANCHOR_SOURCE_MULTI_CALL_MATCH.equals(this.f138740I);
    }

    /* JADX INFO: renamed from: O2 */
    public boolean m160110O2() {
        return "obs".equals(this.f138739H);
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ BLiveRoom m160111P2(BLiveRoom bLiveRoom) {
        mo168522i(bLiveRoom);
        lej0.INSTANCE.m153909c("create_live_room", "getRoomInfoWithCreating");
        return bLiveRoom;
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ BLiveRoom m160112Q2(BLiveRoom bLiveRoom) {
        mo168522i(bLiveRoom);
        return bLiveRoom;
    }

    /* JADX INFO: renamed from: R2 */
    public C22421c<BLiveRoom> m160113R2() {
        return !m118364B2() ? C22421c.just(m118363A2().mo122891j()) : LivingNormalApiProvider.m72530T5(true, null).map(new qcj() { // from class: l.ju40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f122690a.m160112Q2((BLiveRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public void m160114S2(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f138740I = str;
    }

    /* JADX INFO: renamed from: T2 */
    public void m160115T2(String str) {
        this.f138739H = str;
    }

    @Override // p153l.vp20
    /* JADX INFO: renamed from: h */
    public void mo160116h(jsv jsvVar) {
        jsv jsvVarM222761e = this.f185208b.m222761e();
        if (jsvVarM222761e == null || jsvVarM222761e.m146875a() == 4) {
            return;
        }
        this.f185208b.onNext(jsvVar);
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: o0 */
    public String mo160117o0() {
        return this.f138740I;
    }

    @Override // p153l.dw40, p153l.vp20
    /* JADX INFO: renamed from: p */
    public boolean mo118373p() {
        return true;
    }
}
