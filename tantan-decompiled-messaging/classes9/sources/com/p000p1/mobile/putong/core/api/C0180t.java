package com.p000p1.mobile.putong.core.api;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.MonetizationConfiguration;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.fgf0;
import l.ggi;
import l.hpd0;
import l.roj0;
import l.v9j;
import l.w9j;
import p006l.ax6;
import p006l.ia20;
import p006l.la20;
import p006l.qnd;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.t */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0180t extends ax6 {

    /* JADX INFO: renamed from: R */
    public final a f4106R;

    /* JADX INFO: renamed from: S */
    public final hpd0 f4107S;

    /* JADX INFO: renamed from: T */
    public final hpd0 f4108T;

    /* JADX INFO: renamed from: U */
    public final hpd0 f4109U;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.t$a */
    public static class a extends fgf0<MonetizationConfiguration> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.t$a$a, reason: collision with other inner class name */
        public class C1548a implements v9j<c<MonetizationConfiguration>> {
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c<MonetizationConfiguration> call() {
                return new la20(new v9j() { // from class: l.c0a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3191W0()).f().b();
                    }
                }).map(new w9j() { // from class: l.d0a
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).monetizationConfiguration;
                    }
                });
            }
        }

        public a() {
            super("high_risk_monetization", new ggi(new qnd("high_risk_monetization", "_v17", CoreModule.m1850H().userId()), -1, MonetizationConfiguration.PROTOBUF_ADAPTER), new C1548a());
        }

        /* JADX INFO: renamed from: B */
        public String m6685B() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            if (NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.extConfig)) {
                return monetizationConfiguration.extConfig.attributeChannel;
            }
            return null;
        }

        /* JADX INFO: renamed from: C */
        public boolean m6686C() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            if (NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.userTags)) {
                return monetizationConfiguration.userTags.showFemaleAdCardInsert;
            }
            return false;
        }

        /* JADX INFO: renamed from: D */
        public boolean m6687D() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            if (NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.userTags)) {
                return monetizationConfiguration.userTags.showFemaleAdPopUp;
            }
            return false;
        }

        /* JADX INFO: renamed from: E */
        public long m6688E() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) m();
            if (NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.seeTrial)) {
                return monetizationConfiguration.seeTrial.trialDuration;
            }
            return 43200L;
        }

        /* JADX INFO: renamed from: F */
        public long m6689F() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) m();
            if (NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.seeTrial)) {
                return monetizationConfiguration.seeTrial.waitDuration;
            }
            return 86400L;
        }

        /* JADX INFO: renamed from: G */
        public int m6690G() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            if (NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.extConfig)) {
                return monetizationConfiguration.extConfig.huaweiExpStrategy;
            }
            return -1;
        }

        /* JADX INFO: renamed from: H */
        public int m6691H() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            if (!NullChecker.a(monetizationConfiguration) || !NullChecker.a(monetizationConfiguration.membershipDesc) || !NullChecker.a(monetizationConfiguration.membershipDesc.get("youthVip"))) {
                return 5;
            }
            Integer num = (Integer) ((Map) monetizationConfiguration.membershipDesc.get("youthVip")).get("blindBoxNum");
            if (!NullChecker.a(num) || num.intValue() <= 0) {
                return 5;
            }
            return num.intValue();
        }

        /* JADX INFO: renamed from: I */
        public int m6692I() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            if (!NullChecker.a(monetizationConfiguration) || !NullChecker.a(monetizationConfiguration.membershipDesc) || !NullChecker.a(monetizationConfiguration.membershipDesc.get("youthVip"))) {
                return 10;
            }
            Integer num = (Integer) ((Map) monetizationConfiguration.membershipDesc.get("youthVip")).get("seekPartnerNum");
            if (!NullChecker.a(num) || num.intValue() <= 0) {
                return 10;
            }
            return num.intValue();
        }

        /* JADX INFO: renamed from: J */
        public boolean m6693J() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            return NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.extConfig) && NullChecker.a(monetizationConfiguration.extConfig.guideBoostMode) && TEnum.equals(monetizationConfiguration.extConfig.guideBoostMode, "swipe");
        }

        /* JADX INFO: renamed from: K */
        public boolean m6694K() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            return NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.extConfig) && NullChecker.a(monetizationConfiguration.extConfig.guideBoostMode) && TEnum.equals(monetizationConfiguration.extConfig.guideBoostMode, "pop");
        }

        /* JADX INFO: renamed from: L */
        public boolean m6695L() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            if (NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.extConfig)) {
                return monetizationConfiguration.extConfig.crowdSvip;
            }
            return false;
        }

        /* JADX INFO: renamed from: M */
        public boolean m6696M() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            return NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.userTags) && monetizationConfiguration.userTags.liveBigR;
        }

        /* JADX INFO: renamed from: N */
        public boolean m6697N() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) n();
            return NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.userTags) && monetizationConfiguration.userTags.showODiamondBanner;
        }

        /* JADX INFO: renamed from: O */
        public boolean m6698O() {
            MonetizationConfiguration monetizationConfiguration = (MonetizationConfiguration) m();
            if (NullChecker.a(monetizationConfiguration)) {
                return monetizationConfiguration.showIndexNearbyTab;
            }
            return false;
        }

        /* JADX INFO: renamed from: z */
        public c<roj0> m6699z() {
            return super.z();
        }
    }

    public C0180t(C0158c c0158c) {
        super(c0158c);
        this.f4106R = new a();
        this.f4107S = new hpd0("monetization_hide_me_from_nearby_access_" + CoreModule.m1850H().userId(), Boolean.TRUE);
        String str = "monetization_hide_me_from_nearby_show_popup_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f4108T = new hpd0(str, bool);
        this.f4109U = new hpd0("monetization_hide_me_from_nearby_show_popup_shown_" + CoreModule.m1850H().userId(), bool);
    }

    /* JADX INFO: renamed from: d3 */
    public boolean m6676d3() {
        return this.f4106R.m6693J();
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m6677e3() {
        return this.f4106R.m6694K();
    }

    /* JADX INFO: renamed from: f3 */
    public boolean m6678f3() {
        return ((Boolean) this.f4107S.get()).booleanValue();
    }

    /* JADX INFO: renamed from: g3 */
    public boolean m6679g3() {
        return ((Boolean) this.f4108T.get()).booleanValue();
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m6680h3() {
        return ((Boolean) this.f4109U.get()).booleanValue();
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ MonetizationConfiguration m6681i3(Envelope envelope) {
        MonetizationConfiguration monetizationConfiguration = envelope.getModuleData(CoreData.class).monetizationConfiguration;
        if (NullChecker.a(monetizationConfiguration) && NullChecker.a(monetizationConfiguration.nearbyBlock)) {
            this.f4107S.put(Boolean.valueOf(monetizationConfiguration.nearbyBlock.access));
            this.f4108T.put(Boolean.valueOf(monetizationConfiguration.nearbyBlock.showPopUpInform));
        }
        return monetizationConfiguration;
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ c m6682j3() {
        return ia20.m16567a(new v9j() { // from class: l.a0a
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3195X0()).f().b();
            }
        }).map(new w9j() { // from class: l.b0a
            public final Object call(Object obj) {
                return this.f8640a.m6681i3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public void m6683k3() {
        this.f8580Q.scheduled("monetization_configuration_nearby_block", 0, new v9j() { // from class: l.zz9
            public final Object call() {
                return this.f29049a.m6682j3();
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public void m6684l3(boolean z) {
        this.f4109U.put(Boolean.valueOf(z));
    }
}
