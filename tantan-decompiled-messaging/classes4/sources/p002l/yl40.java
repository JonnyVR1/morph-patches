package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.p1.mobile.putong.live.base.data.BLiveRoomCover;
import l.h5j0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yl40 extends pn40 {

    /* JADX INFO: renamed from: H */
    public String f22962H;

    /* JADX INFO: renamed from: I */
    public String f22963I;

    public yl40(qn40 qn40Var, zgt zgtVar) {
        super(qn40Var, zgtVar);
        this.f22962H = "normal";
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ c m26785H2(String str, Picture picture, BLiveRoom bLiveRoom) {
        if (!BLiveRoom.EMPTY.equals(bLiveRoom)) {
            return c.just(bLiveRoom);
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        ((BLiveAbsRoom) bLiveRoomNew_).title = str;
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = picture;
        ((BLiveAbsRoom) bLiveRoomNew_).cover = bLiveRoomCoverNew_;
        return LivingNormalApiProvider.m4847i4(bLiveRoomNew_);
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: F0 */
    public int mo14499F0() {
        return 1;
    }

    /* JADX INFO: renamed from: J2 */
    public String m26787J2() {
        return this.f22963I;
    }

    /* JADX INFO: renamed from: K2 */
    public String m26788K2() {
        return this.f22962H;
    }

    /* JADX INFO: renamed from: L2 */
    public c<BLiveRoom> m26789L2(final String str, final Picture picture) {
        return !m20502B2() ? c.just(m20501A2().mo19689j()) : LivingNormalApiProvider.m4713T5(true, null).flatMap(new w9j() { // from class: l.wl40
            public final Object call(Object obj) {
                return yl40.m26785H2(str, picture, (BLiveRoom) obj);
            }
        }).map(new w9j() { // from class: l.xl40
            public final Object call(Object obj) {
                return this.f22343a.m26793P2((BLiveRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M2 */
    public boolean m26790M2() {
        return m26791N2();
    }

    /* JADX INFO: renamed from: N2 */
    public boolean m26791N2() {
        return "moment-nearby-match".equals(this.f22963I);
    }

    /* JADX INFO: renamed from: O2 */
    public boolean m26792O2() {
        return "obs".equals(this.f22962H);
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ BLiveRoom m26793P2(BLiveRoom bLiveRoom) {
        mo14572i(bLiveRoom);
        h5j0.INSTANCE.c("create_live_room", "getRoomInfoWithCreating");
        return bLiveRoom;
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ BLiveRoom m26794Q2(BLiveRoom bLiveRoom) {
        mo14572i(bLiveRoom);
        return bLiveRoom;
    }

    /* JADX INFO: renamed from: R2 */
    public c<BLiveRoom> m26795R2() {
        return !m20502B2() ? c.just(m20501A2().mo19689j()) : LivingNormalApiProvider.m4713T5(true, null).map(new w9j() { // from class: l.vl40
            public final Object call(Object obj) {
                return this.f21200a.m26794Q2((BLiveRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public void m26796S2(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f22963I = str;
    }

    /* JADX INFO: renamed from: T2 */
    public void m26797T2(String str) {
        this.f22962H = str;
    }

    @Override // p002l.lh20
    /* JADX INFO: renamed from: h */
    public void mo17233h(iqv iqvVar) {
        iqv iqvVar2 = (iqv) this.f14866b.e();
        if (iqvVar2 == null || iqvVar2.m15298a() == 4) {
            return;
        }
        this.f14866b.onNext(iqvVar);
    }

    @Override // p002l.ho2
    /* JADX INFO: renamed from: o0 */
    public String mo14591o0() {
        return this.f22963I;
    }

    @Override // p002l.pn40, p002l.lh20
    /* JADX INFO: renamed from: p */
    public boolean mo9893p() {
        return true;
    }
}
