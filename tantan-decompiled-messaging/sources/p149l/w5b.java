package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.SurpriseGift;
import com.p046p1.mobile.putong.data.Envelope;
import java.util.Locale;
import p133rx.C22306c;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class w5b extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f184656R;

    /* JADX INFO: renamed from: S */
    public zpd0 f184657S;

    /* JADX INFO: renamed from: T */
    public zpd0 f184658T;

    /* JADX INFO: renamed from: U */
    public tpd0 f184659U;

    /* JADX INFO: renamed from: V */
    public zpd0 f184660V;

    /* JADX INFO: renamed from: W */
    public boolean f184661W;

    /* JADX INFO: renamed from: X */
    public long f184662X;

    /* JADX INFO: renamed from: Y */
    public zpd0 f184663Y;

    /* JADX INFO: renamed from: Z */
    public uqd0 f184664Z;

    /* JADX INFO: renamed from: a0 */
    public hpd0 f184665a0;

    /* JADX INFO: renamed from: b0 */
    public uqd0 f184666b0;

    public w5b(C4732c c4732c) {
        super(c4732c);
        this.f184656R = new zpd0("surprise_box_exp_time" + CoreModule.m29931H().userId(), 0L);
        this.f184657S = new zpd0("surprise_box_expose_time" + CoreModule.m29931H().userId(), 0L);
        this.f184658T = new zpd0("surprise_box_last_open_exp" + CoreModule.m29931H().userId(), 0L);
        this.f184659U = new tpd0("surprise_box_close_count" + CoreModule.m29931H().userId(), 0);
        this.f184660V = new zpd0("surprise_box_close_time" + CoreModule.m29931H().userId(), 0L);
        this.f184663Y = new zpd0("surprise_box_gift_box_expiration_date" + CoreModule.m29931H().userId(), 0L);
        this.f184664Z = new uqd0("surprise_box_is_reward_consume" + CoreModule.m29931H().userId(), "");
        this.f184665a0 = new hpd0("surprise_box_is_show_bubble" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f184666b0 = new uqd0("surprise_box_is_save_user_pic" + CoreModule.m29931H().userId(), "");
    }

    /* JADX INFO: renamed from: r3 */
    public static void m201606r3(VText vText) {
        int i;
        int i2;
        long jLongValue = CoreModule.f17545c.f19659k2.f184656R.get().longValue() - mqi0.m155944o();
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
        xdl0.m208344M(vText, true);
    }

    /* JADX INFO: renamed from: i3 */
    public void m201607i3() {
        this.f184656R.put(0L);
    }

    /* JADX INFO: renamed from: j3 */
    public void m201608j3() {
        this.f184659U.put(0);
        this.f184660V.put(0L);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ SurpriseGift m201609k3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return ((CoreData) envelope.getModuleData(CoreData.class)).surpriseGift;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ C22306c m201610l3() {
        return ia20.m135121e(new v9j() { // from class: l.u5b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/surprise-gift-box/open")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.v5b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180017a.m201609k3((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ SurpriseGift m201611m3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return ((CoreData) envelope.getModuleData(CoreData.class)).surpriseGift;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22306c m201612n3() {
        return ia20.m135121e(new v9j() { // from class: l.p5b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/surprise-gift-box-v2/open")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.q5b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f152752a.m201611m3((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: o3 */
    public C22306c<SurpriseGift> m201613o3() {
        return this.f72126Q.scheduled("open_surprise_box", 0, new v9j() { // from class: l.t5b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f167797a.m201610l3();
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public C22306c<SurpriseGift> m201614p3() {
        return this.f72126Q.scheduled("open_surprise_box_v2", 0, new v9j() { // from class: l.o5b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f141887a.m201612n3();
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public void m201615q3() {
        this.f72126Q.scheduled("receive_surprise_box_v2", 0, new v9j() { // from class: l.r5b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.s5b
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/surprise-gift-box-v2/receive")).m185887f().m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public void m201616s3() {
        long j = this.f184662X;
        if (j > 0) {
            this.f184656R.put(Long.valueOf(j));
            this.f184658T.put(Long.valueOf(this.f184662X));
        }
    }
}
