package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.SurpriseGift;
import com.p1.mobile.putong.data.Envelope;
import java.util.Locale;
import l.hpd0;
import l.mkd0;
import l.mqi0;
import l.tpd0;
import l.uqd0;
import l.v9j;
import l.w9j;
import l.xdl0;
import l.zpd0;
import rx.c;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class w5b extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f24982R;

    /* JADX INFO: renamed from: S */
    public zpd0 f24983S;

    /* JADX INFO: renamed from: T */
    public zpd0 f24984T;

    /* JADX INFO: renamed from: U */
    public tpd0 f24985U;

    /* JADX INFO: renamed from: V */
    public zpd0 f24986V;

    /* JADX INFO: renamed from: W */
    public boolean f24987W;

    /* JADX INFO: renamed from: X */
    public long f24988X;

    /* JADX INFO: renamed from: Y */
    public zpd0 f24989Y;

    /* JADX INFO: renamed from: Z */
    public uqd0 f24990Z;

    /* JADX INFO: renamed from: a0 */
    public hpd0 f24991a0;

    /* JADX INFO: renamed from: b0 */
    public uqd0 f24992b0;

    public w5b(C0158c c0158c) {
        super(c0158c);
        this.f24982R = new zpd0("surprise_box_exp_time" + CoreModule.m1850H().userId(), 0L);
        this.f24983S = new zpd0("surprise_box_expose_time" + CoreModule.m1850H().userId(), 0L);
        this.f24984T = new zpd0("surprise_box_last_open_exp" + CoreModule.m1850H().userId(), 0L);
        this.f24985U = new tpd0("surprise_box_close_count" + CoreModule.m1850H().userId(), 0);
        this.f24986V = new zpd0("surprise_box_close_time" + CoreModule.m1850H().userId(), 0L);
        this.f24989Y = new zpd0("surprise_box_gift_box_expiration_date" + CoreModule.m1850H().userId(), 0L);
        this.f24990Z = new uqd0("surprise_box_is_reward_consume" + CoreModule.m1850H().userId(), "");
        this.f24991a0 = new hpd0("surprise_box_is_show_bubble" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.f24992b0 = new uqd0("surprise_box_is_save_user_pic" + CoreModule.m1850H().userId(), "");
    }

    /* JADX INFO: renamed from: r3 */
    public static void m26214r3(VText vText) {
        int i;
        int i2;
        long jLongValue = ((Long) CoreModule.f1534c.f3648k2.f24982R.get()).longValue() - mqi0.o();
        if (jLongValue <= 0) {
            vText.setText("");
        } else {
            if (jLongValue < 60000) {
                i = (int) (jLongValue / 1000);
                i2 = 0;
            } else {
                int i3 = (int) (jLongValue / 3600000);
                i = (int) ((jLongValue - (((long) i3) * 3600000)) / 60000);
                i2 = i3;
            }
            vText.setText(String.format(Locale.getDefault(), "有效期 %02d:%02d", Integer.valueOf(i2), Integer.valueOf(i)));
        }
        xdl0.M(vText, true);
    }

    /* JADX INFO: renamed from: i3 */
    public void m26215i3() {
        this.f24982R.put(0L);
    }

    /* JADX INFO: renamed from: j3 */
    public void m26216j3() {
        this.f24985U.put(0);
        this.f24986V.put(0L);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ SurpriseGift m26217k3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope.getModuleData(CoreData.class).surpriseGift;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ c m26218l3() {
        return ia20.m16571e(new v9j() { // from class: l.u5b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/surprise-gift-box/open")).f().b();
            }
        }).map(new w9j() { // from class: l.v5b
            public final Object call(Object obj) {
                return this.f24151a.m26217k3((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ SurpriseGift m26219m3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope.getModuleData(CoreData.class).surpriseGift;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ c m26220n3() {
        return ia20.m16571e(new v9j() { // from class: l.p5b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/surprise-gift-box-v2/open")).f().b();
            }
        }).map(new w9j() { // from class: l.q5b
            public final Object call(Object obj) {
                return this.f19641a.m26219m3((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: o3 */
    public c<SurpriseGift> m26221o3() {
        return this.f8580Q.scheduled("open_surprise_box", 0, new v9j() { // from class: l.t5b
            public final Object call() {
                return this.f21880a.m26218l3();
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public c<SurpriseGift> m26222p3() {
        return this.f8580Q.scheduled("open_surprise_box_v2", 0, new v9j() { // from class: l.o5b
            public final Object call() {
                return this.f18023a.m26220n3();
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public void m26223q3() {
        this.f8580Q.scheduled("receive_surprise_box_v2", 0, new v9j() { // from class: l.r5b
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.s5b
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/surprise-gift-box-v2/receive")).f().b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public void m26224s3() {
        long j = this.f24988X;
        if (j > 0) {
            this.f24982R.put(Long.valueOf(j));
            this.f24984T.put(Long.valueOf(this.f24988X));
        }
    }
}
