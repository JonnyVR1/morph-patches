package com.p046p1.mobile.putong.core.api;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.GuideBoostMode;
import com.p046p1.mobile.putong.core.data.MonetizationConfiguration;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p149l.ax6;
import p149l.fgf0;
import p149l.ggi;
import p149l.hpd0;
import p149l.ia20;
import p149l.la20;
import p149l.qnd;
import p149l.roj0;
import p149l.v9j;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.t */
/* JADX INFO: loaded from: classes9.dex */
public class C4754t extends ax6 {

    /* JADX INFO: renamed from: R */
    public final a f20117R;

    /* JADX INFO: renamed from: S */
    public final hpd0 f20118S;

    /* JADX INFO: renamed from: T */
    public final hpd0 f20119T;

    /* JADX INFO: renamed from: U */
    public final hpd0 f20120U;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.t$a */
    public static class a extends fgf0<MonetizationConfiguration> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.t$a$a, reason: collision with other inner class name */
        public class C22698a implements v9j<C22306c<MonetizationConfiguration>> {
            @Override // p149l.v9j, java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C22306c<MonetizationConfiguration> call() {
                return new la20(new v9j() { // from class: l.c0a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31261W0()).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.d0a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).monetizationConfiguration;
                    }
                });
            }
        }

        public a() {
            super("high_risk_monetization", new ggi(new qnd("high_risk_monetization", "_v17", CoreModule.m29931H().userId()), -1, MonetizationConfiguration.PROTOBUF_ADAPTER), new C22698a());
        }

        /* JADX INFO: renamed from: B */
        public String m34748B() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            if (NullChecker.m81303a(monetizationConfigurationM121233n) && NullChecker.m81303a(monetizationConfigurationM121233n.extConfig)) {
                return monetizationConfigurationM121233n.extConfig.attributeChannel;
            }
            return null;
        }

        /* JADX INFO: renamed from: C */
        public boolean m34749C() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            if (NullChecker.m81303a(monetizationConfigurationM121233n) && NullChecker.m81303a(monetizationConfigurationM121233n.userTags)) {
                return monetizationConfigurationM121233n.userTags.showFemaleAdCardInsert;
            }
            return false;
        }

        /* JADX INFO: renamed from: D */
        public boolean m34750D() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            if (NullChecker.m81303a(monetizationConfigurationM121233n) && NullChecker.m81303a(monetizationConfigurationM121233n.userTags)) {
                return monetizationConfigurationM121233n.userTags.showFemaleAdPopUp;
            }
            return false;
        }

        /* JADX INFO: renamed from: E */
        public long m34751E() {
            MonetizationConfiguration monetizationConfigurationM121232m = m121232m();
            if (NullChecker.m81303a(monetizationConfigurationM121232m) && NullChecker.m81303a(monetizationConfigurationM121232m.seeTrial)) {
                return monetizationConfigurationM121232m.seeTrial.trialDuration;
            }
            return 43200L;
        }

        /* JADX INFO: renamed from: F */
        public long m34752F() {
            MonetizationConfiguration monetizationConfigurationM121232m = m121232m();
            if (NullChecker.m81303a(monetizationConfigurationM121232m) && NullChecker.m81303a(monetizationConfigurationM121232m.seeTrial)) {
                return monetizationConfigurationM121232m.seeTrial.waitDuration;
            }
            return 86400L;
        }

        /* JADX INFO: renamed from: G */
        public int m34753G() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            if (NullChecker.m81303a(monetizationConfigurationM121233n) && NullChecker.m81303a(monetizationConfigurationM121233n.extConfig)) {
                return monetizationConfigurationM121233n.extConfig.huaweiExpStrategy;
            }
            return -1;
        }

        /* JADX INFO: renamed from: H */
        public int m34754H() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            if (!NullChecker.m81303a(monetizationConfigurationM121233n) || !NullChecker.m81303a(monetizationConfigurationM121233n.membershipDesc) || !NullChecker.m81303a(monetizationConfigurationM121233n.membershipDesc.get("youthVip"))) {
                return 5;
            }
            Integer num = monetizationConfigurationM121233n.membershipDesc.get("youthVip").get(SummarizedPrivilegesId.blindBoxNum);
            if (!NullChecker.m81303a(num) || num.intValue() <= 0) {
                return 5;
            }
            return num.intValue();
        }

        /* JADX INFO: renamed from: I */
        public int m34755I() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            if (!NullChecker.m81303a(monetizationConfigurationM121233n) || !NullChecker.m81303a(monetizationConfigurationM121233n.membershipDesc) || !NullChecker.m81303a(monetizationConfigurationM121233n.membershipDesc.get("youthVip"))) {
                return 10;
            }
            Integer num = monetizationConfigurationM121233n.membershipDesc.get("youthVip").get("seekPartnerNum");
            if (!NullChecker.m81303a(num) || num.intValue() <= 0) {
                return 10;
            }
            return num.intValue();
        }

        /* JADX INFO: renamed from: J */
        public boolean m34756J() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            return NullChecker.m81303a(monetizationConfigurationM121233n) && NullChecker.m81303a(monetizationConfigurationM121233n.extConfig) && NullChecker.m81303a(monetizationConfigurationM121233n.extConfig.guideBoostMode) && TEnum.equals(monetizationConfigurationM121233n.extConfig.guideBoostMode, "swipe");
        }

        /* JADX INFO: renamed from: K */
        public boolean m34757K() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            return NullChecker.m81303a(monetizationConfigurationM121233n) && NullChecker.m81303a(monetizationConfigurationM121233n.extConfig) && NullChecker.m81303a(monetizationConfigurationM121233n.extConfig.guideBoostMode) && TEnum.equals(monetizationConfigurationM121233n.extConfig.guideBoostMode, GuideBoostMode.pop);
        }

        /* JADX INFO: renamed from: L */
        public boolean m34758L() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            if (NullChecker.m81303a(monetizationConfigurationM121233n) && NullChecker.m81303a(monetizationConfigurationM121233n.extConfig)) {
                return monetizationConfigurationM121233n.extConfig.crowdSvip;
            }
            return false;
        }

        /* JADX INFO: renamed from: M */
        public boolean m34759M() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            return NullChecker.m81303a(monetizationConfigurationM121233n) && NullChecker.m81303a(monetizationConfigurationM121233n.userTags) && monetizationConfigurationM121233n.userTags.liveBigR;
        }

        /* JADX INFO: renamed from: N */
        public boolean m34760N() {
            MonetizationConfiguration monetizationConfigurationM121233n = m121233n();
            return NullChecker.m81303a(monetizationConfigurationM121233n) && NullChecker.m81303a(monetizationConfigurationM121233n.userTags) && monetizationConfigurationM121233n.userTags.showODiamondBanner;
        }

        /* JADX INFO: renamed from: O */
        public boolean m34761O() {
            MonetizationConfiguration monetizationConfigurationM121232m = m121232m();
            if (NullChecker.m81303a(monetizationConfigurationM121232m)) {
                return monetizationConfigurationM121232m.showIndexNearbyTab;
            }
            return false;
        }

        @Override // p149l.fgf0
        /* JADX INFO: renamed from: z */
        public C22306c<roj0> m121236q() {
            return super.m121236q();
        }
    }

    public C4754t(C4732c c4732c) {
        super(c4732c);
        this.f20117R = new a();
        this.f20118S = new hpd0("monetization_hide_me_from_nearby_access_" + CoreModule.m29931H().userId(), Boolean.TRUE);
        String str = "monetization_hide_me_from_nearby_show_popup_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f20119T = new hpd0(str, bool);
        this.f20120U = new hpd0("monetization_hide_me_from_nearby_show_popup_shown_" + CoreModule.m29931H().userId(), bool);
    }

    /* JADX INFO: renamed from: d3 */
    public boolean m34739d3() {
        return this.f20117R.m34756J();
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m34740e3() {
        return this.f20117R.m34757K();
    }

    /* JADX INFO: renamed from: f3 */
    public boolean m34741f3() {
        return this.f20118S.get().booleanValue();
    }

    /* JADX INFO: renamed from: g3 */
    public boolean m34742g3() {
        return this.f20119T.get().booleanValue();
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m34743h3() {
        return this.f20120U.get().booleanValue();
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ MonetizationConfiguration m34744i3(Envelope envelope) {
        MonetizationConfiguration monetizationConfiguration = ((CoreData) envelope.getModuleData(CoreData.class)).monetizationConfiguration;
        if (NullChecker.m81303a(monetizationConfiguration) && NullChecker.m81303a(monetizationConfiguration.nearbyBlock)) {
            this.f20118S.put(Boolean.valueOf(monetizationConfiguration.nearbyBlock.access));
            this.f20119T.put(Boolean.valueOf(monetizationConfiguration.nearbyBlock.showPopUpInform));
        }
        return monetizationConfiguration;
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ C22306c m34745j3() {
        return ia20.m135117a(new v9j() { // from class: l.a0a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31265X0()).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.b0a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f72419a.m34744i3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public void m34746k3() {
        this.f72126Q.scheduled("monetization_configuration_nearby_block", 0, new v9j() { // from class: l.zz9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f205786a.m34745j3();
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public void m34747l3(boolean z) {
        this.f20120U.put(Boolean.valueOf(z));
    }
}
