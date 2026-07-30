package p002l;

import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.fld0;
import l.hdv;
import l.k4t;
import l.vwb;
import l.w9j;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sz0 extends h4t<ho2, Object> {

    /* JADX INFO: renamed from: i */
    public HashMap<Integer, fs3> f19341i;

    public sz0(bsm<ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ Integer m22762K3(fs3 fs3Var) {
        BLiveBottomButton bLiveBottomButton = fs3Var.f10616a;
        if (bLiveBottomButton != null) {
            return Integer.valueOf(bLiveBottomButton.id);
        }
        return -111;
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ fs3 m22764M3(fs3 fs3Var) {
        return fs3Var;
    }

    /* JADX INFO: renamed from: N3 */
    public void m22765N3() {
        HashMap map = ((k4t) this).b;
        if (map == null || map.isEmpty()) {
            return;
        }
        vwb.z(((k4t) this).b.values(), new oz0());
        ((k4t) this).b.clear();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m22766O3(List<fs3> list) {
        this.f19341i = vwb.d(list, new w9j() { // from class: l.pz0
            public final Object call(Object obj) {
                return sz0.m22762K3((fs3) obj);
            }
        }, new w9j() { // from class: l.qz0
            public final Object call(Object obj) {
                return sz0.m22764M3((fs3) obj);
            }
        });
        m14188d3(r25.class, new w9j() { // from class: l.rz0
            public final Object call(Object obj) {
                return this.f18727a.m22767P3((r25) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ Boolean m22767P3(r25 r25Var) {
        return Boolean.valueOf(this.f19341i.containsKey(Integer.valueOf(r25Var.f18331c)));
    }

    /* JADX INFO: renamed from: R3 */
    public final void m22768R3(fs3 fs3Var) {
        BLiveBottomButton bLiveBottomButton = fs3Var.f10616a;
        int i = fs3Var.f10617b;
        int i2 = fs3Var.f10618c;
        String str = fs3Var.f10619d;
        String str2 = fs3Var.f10620e;
        String string = bLiveBottomButton.localType.toString();
        string.getClass();
        switch (string) {
            case "shootGame":
                z2(new gt3(this.f22036e, bLiveBottomButton, i, i2, str, 0, str2));
                break;
            case "lotteryGiftRedpacket":
                z2(new hs3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "guideGift":
                z2(new es3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "giftResourceStatus":
                z2(new yr3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                ((hdv) ypv.l(fld0.e)).l.put(Boolean.TRUE);
                break;
            case "sticker":
                z2(new kt3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "chatManager":
                z2(new hr3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "beauty":
                z2(new cr3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "signIn":
                z2(new jt3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "unknown_":
                z2(new mw3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "summonFans":
                z2(new lt3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "firstRechargeButton":
                z2(new xr3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "switchCamera":
                z2(new mt3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "callButton":
                z2(new gr3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "blackList":
                z2(new dr3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
            case "magicGesture":
                z2(new bt3(this.f22036e, bLiveBottomButton, i, i2, str, str2));
                break;
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m22769S3(List<fs3> list, String str) {
        m22766O3(list);
        ((hdv) ypv.l(fld0.e)).l.put(Boolean.FALSE);
        vwb.z(list, new e30() { // from class: l.nz0
            public final void call(Object obj) {
                this.f16315a.m22768R3((fs3) obj);
            }
        });
    }
}
