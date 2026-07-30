package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.SurpriseGift;
import com.p051p1.mobile.putong.data.Envelope;
import java.util.Locale;
import p137rx.C22421c;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class j7b extends dy6 {

    /* JADX INFO: renamed from: R */
    public byd0 f118659R;

    /* JADX INFO: renamed from: S */
    public byd0 f118660S;

    /* JADX INFO: renamed from: T */
    public byd0 f118661T;

    /* JADX INFO: renamed from: U */
    public vxd0 f118662U;

    /* JADX INFO: renamed from: V */
    public byd0 f118663V;

    /* JADX INFO: renamed from: W */
    public boolean f118664W;

    /* JADX INFO: renamed from: X */
    public long f118665X;

    /* JADX INFO: renamed from: Y */
    public byd0 f118666Y;

    /* JADX INFO: renamed from: Z */
    public wyd0 f118667Z;

    /* JADX INFO: renamed from: a0 */
    public jxd0 f118668a0;

    /* JADX INFO: renamed from: b0 */
    public wyd0 f118669b0;

    public j7b(C4883c c4883c) {
        super(c4883c);
        this.f118659R = new byd0("surprise_box_exp_time" + CoreModule.m30929H().userId(), 0L);
        this.f118660S = new byd0("surprise_box_expose_time" + CoreModule.m30929H().userId(), 0L);
        this.f118661T = new byd0("surprise_box_last_open_exp" + CoreModule.m30929H().userId(), 0L);
        this.f118662U = new vxd0("surprise_box_close_count" + CoreModule.m30929H().userId(), 0);
        this.f118663V = new byd0("surprise_box_close_time" + CoreModule.m30929H().userId(), 0L);
        this.f118666Y = new byd0("surprise_box_gift_box_expiration_date" + CoreModule.m30929H().userId(), 0L);
        this.f118667Z = new wyd0("surprise_box_is_reward_consume" + CoreModule.m30929H().userId(), "");
        this.f118668a0 = new jxd0("surprise_box_is_show_bubble" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f118669b0 = new wyd0("surprise_box_is_save_user_pic" + CoreModule.m30929H().userId(), "");
    }

    /* JADX INFO: renamed from: r3 */
    public static void m143757r3(VText vText) {
        int i;
        int i2;
        long jLongValue = CoreModule.f18264c.f20401k2.f118659R.get().longValue() - pzi0.m174454o();
        if (jLongValue <= 0) {
            vText.setText("");
        } else {
            if (jLongValue < Constants.ONE_MIN_IN_MILLIS) {
                i = (int) (jLongValue / 1000);
                i2 = 0;
            } else {
                int i3 = (int) (jLongValue / 3600000);
                i = (int) ((jLongValue - (((long) i3) * 3600000)) / Constants.ONE_MIN_IN_MILLIS);
                i2 = i3;
            }
            vText.setText(String.format(Locale.getDefault(), "有效期 %02d:%02d", Integer.valueOf(i2), Integer.valueOf(i)));
        }
        bnl0.m105524M(vText, true);
    }

    /* JADX INFO: renamed from: i3 */
    public void m143758i3() {
        this.f118659R.put(0L);
    }

    /* JADX INFO: renamed from: j3 */
    public void m143759j3() {
        this.f118662U.put(0);
        this.f118663V.put(0L);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ SurpriseGift m143760k3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return ((CoreData) envelope.getModuleData(CoreData.class)).surpriseGift;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ C22421c m143761l3() {
        return qi20.m176658e(new pcj() { // from class: l.h7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/surprise-gift-box/open")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.i7b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f113248a.m143760k3((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ SurpriseGift m143762m3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return ((CoreData) envelope.getModuleData(CoreData.class)).surpriseGift;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22421c m143763n3() {
        return qi20.m176658e(new pcj() { // from class: l.c7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/surprise-gift-box-v2/open")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.d7b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f85497a.m143762m3((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: o3 */
    public C22421c<SurpriseGift> m143764o3() {
        return this.f91137Q.scheduled("open_surprise_box", 0, new pcj() { // from class: l.g7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f102523a.m143761l3();
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public C22421c<SurpriseGift> m143765p3() {
        return this.f91137Q.scheduled("open_surprise_box_v2", 0, new pcj() { // from class: l.b7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f75273a.m143763n3();
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public void m143766q3() {
        this.f91137Q.scheduled("receive_surprise_box_v2", 0, new pcj() { // from class: l.e7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.f7b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/surprise-gift-box-v2/receive")).m209032f().m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public void m143767s3() {
        long j = this.f118665X;
        if (j > 0) {
            this.f118659R.put(Long.valueOf(j));
            this.f118661T.put(Long.valueOf(this.f118665X));
        }
    }
}
