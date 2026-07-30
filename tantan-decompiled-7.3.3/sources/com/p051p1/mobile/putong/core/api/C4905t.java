package com.p051p1.mobile.putong.core.api;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.GuideBoostMode;
import com.p051p1.mobile.putong.core.data.MonetizationConfiguration;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p153l.dji;
import p153l.dy6;
import p153l.jxd0;
import p153l.mof0;
import p153l.pcj;
import p153l.qcj;
import p153l.qi20;
import p153l.ti20;
import p153l.uxj0;
import p153l.vod;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.t */
/* JADX INFO: loaded from: classes9.dex */
public class C4905t extends dy6 {

    /* JADX INFO: renamed from: R */
    public final a f20859R;

    /* JADX INFO: renamed from: S */
    public final jxd0 f20860S;

    /* JADX INFO: renamed from: T */
    public final jxd0 f20861T;

    /* JADX INFO: renamed from: U */
    public final jxd0 f20862U;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.t$a */
    public static class a extends mof0<MonetizationConfiguration> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.t$a$a, reason: collision with other inner class name */
        public class C22814a implements pcj<C22421c<MonetizationConfiguration>> {
            @Override // p153l.pcj, java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C22421c<MonetizationConfiguration> call() {
                return new ti20(new pcj() { // from class: l.n1a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32264W0()).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.o1a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).monetizationConfiguration;
                    }
                });
            }
        }

        public a() {
            super("high_risk_monetization", new dji(new vod("high_risk_monetization", "_v17", CoreModule.m30929H().userId()), -1, MonetizationConfiguration.PROTOBUF_ADAPTER), new C22814a());
        }

        /* JADX INFO: renamed from: B */
        public String m35751B() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            if (NullChecker.m82486a(monetizationConfigurationM159277n) && NullChecker.m82486a(monetizationConfigurationM159277n.extConfig)) {
                return monetizationConfigurationM159277n.extConfig.attributeChannel;
            }
            return null;
        }

        /* JADX INFO: renamed from: C */
        public boolean m35752C() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            if (NullChecker.m82486a(monetizationConfigurationM159277n) && NullChecker.m82486a(monetizationConfigurationM159277n.userTags)) {
                return monetizationConfigurationM159277n.userTags.showFemaleAdCardInsert;
            }
            return false;
        }

        /* JADX INFO: renamed from: D */
        public boolean m35753D() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            if (NullChecker.m82486a(monetizationConfigurationM159277n) && NullChecker.m82486a(monetizationConfigurationM159277n.userTags)) {
                return monetizationConfigurationM159277n.userTags.showFemaleAdPopUp;
            }
            return false;
        }

        /* JADX INFO: renamed from: E */
        public long m35754E() {
            MonetizationConfiguration monetizationConfigurationM159276m = m159276m();
            if (NullChecker.m82486a(monetizationConfigurationM159276m) && NullChecker.m82486a(monetizationConfigurationM159276m.seeTrial)) {
                return monetizationConfigurationM159276m.seeTrial.trialDuration;
            }
            return 43200L;
        }

        /* JADX INFO: renamed from: F */
        public long m35755F() {
            MonetizationConfiguration monetizationConfigurationM159276m = m159276m();
            if (NullChecker.m82486a(monetizationConfigurationM159276m) && NullChecker.m82486a(monetizationConfigurationM159276m.seeTrial)) {
                return monetizationConfigurationM159276m.seeTrial.waitDuration;
            }
            return 86400L;
        }

        /* JADX INFO: renamed from: G */
        public int m35756G() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            if (NullChecker.m82486a(monetizationConfigurationM159277n) && NullChecker.m82486a(monetizationConfigurationM159277n.extConfig)) {
                return monetizationConfigurationM159277n.extConfig.huaweiExpStrategy;
            }
            return -1;
        }

        /* JADX INFO: renamed from: H */
        public int m35757H() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            if (!NullChecker.m82486a(monetizationConfigurationM159277n) || !NullChecker.m82486a(monetizationConfigurationM159277n.membershipDesc) || !NullChecker.m82486a(monetizationConfigurationM159277n.membershipDesc.get("youthVip"))) {
                return 5;
            }
            Integer num = monetizationConfigurationM159277n.membershipDesc.get("youthVip").get(SummarizedPrivilegesId.blindBoxNum);
            if (!NullChecker.m82486a(num) || num.intValue() <= 0) {
                return 5;
            }
            return num.intValue();
        }

        /* JADX INFO: renamed from: I */
        public int m35758I() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            if (!NullChecker.m82486a(monetizationConfigurationM159277n) || !NullChecker.m82486a(monetizationConfigurationM159277n.membershipDesc) || !NullChecker.m82486a(monetizationConfigurationM159277n.membershipDesc.get("youthVip"))) {
                return 10;
            }
            Integer num = monetizationConfigurationM159277n.membershipDesc.get("youthVip").get("seekPartnerNum");
            if (!NullChecker.m82486a(num) || num.intValue() <= 0) {
                return 10;
            }
            return num.intValue();
        }

        /* JADX INFO: renamed from: J */
        public boolean m35759J() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            return NullChecker.m82486a(monetizationConfigurationM159277n) && NullChecker.m82486a(monetizationConfigurationM159277n.extConfig) && NullChecker.m82486a(monetizationConfigurationM159277n.extConfig.guideBoostMode) && TEnum.equals(monetizationConfigurationM159277n.extConfig.guideBoostMode, "swipe");
        }

        /* JADX INFO: renamed from: K */
        public boolean m35760K() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            return NullChecker.m82486a(monetizationConfigurationM159277n) && NullChecker.m82486a(monetizationConfigurationM159277n.extConfig) && NullChecker.m82486a(monetizationConfigurationM159277n.extConfig.guideBoostMode) && TEnum.equals(monetizationConfigurationM159277n.extConfig.guideBoostMode, GuideBoostMode.pop);
        }

        /* JADX INFO: renamed from: L */
        public boolean m35761L() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            if (NullChecker.m82486a(monetizationConfigurationM159277n) && NullChecker.m82486a(monetizationConfigurationM159277n.extConfig)) {
                return monetizationConfigurationM159277n.extConfig.crowdSvip;
            }
            return false;
        }

        /* JADX INFO: renamed from: M */
        public boolean m35762M() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            return NullChecker.m82486a(monetizationConfigurationM159277n) && NullChecker.m82486a(monetizationConfigurationM159277n.userTags) && monetizationConfigurationM159277n.userTags.liveBigR;
        }

        /* JADX INFO: renamed from: N */
        public boolean m35763N() {
            MonetizationConfiguration monetizationConfigurationM159277n = m159277n();
            return NullChecker.m82486a(monetizationConfigurationM159277n) && NullChecker.m82486a(monetizationConfigurationM159277n.userTags) && monetizationConfigurationM159277n.userTags.showODiamondBanner;
        }

        /* JADX INFO: renamed from: O */
        public boolean m35764O() {
            MonetizationConfiguration monetizationConfigurationM159276m = m159276m();
            if (NullChecker.m82486a(monetizationConfigurationM159276m)) {
                return monetizationConfigurationM159276m.showIndexNearbyTab;
            }
            return false;
        }

        @Override // p153l.mof0
        /* JADX INFO: renamed from: z */
        public C22421c<uxj0> m159280q() {
            return super.m159280q();
        }
    }

    public C4905t(C4883c c4883c) {
        super(c4883c);
        this.f20859R = new a();
        this.f20860S = new jxd0("monetization_hide_me_from_nearby_access_" + CoreModule.m30929H().userId(), Boolean.TRUE);
        String str = "monetization_hide_me_from_nearby_show_popup_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f20861T = new jxd0(str, bool);
        this.f20862U = new jxd0("monetization_hide_me_from_nearby_show_popup_shown_" + CoreModule.m30929H().userId(), bool);
    }

    /* JADX INFO: renamed from: d3 */
    public boolean m35742d3() {
        return this.f20859R.m35759J();
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m35743e3() {
        return this.f20859R.m35760K();
    }

    /* JADX INFO: renamed from: f3 */
    public boolean m35744f3() {
        return this.f20860S.get().booleanValue();
    }

    /* JADX INFO: renamed from: g3 */
    public boolean m35745g3() {
        return this.f20861T.get().booleanValue();
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m35746h3() {
        return this.f20862U.get().booleanValue();
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ MonetizationConfiguration m35747i3(Envelope envelope) {
        MonetizationConfiguration monetizationConfiguration = ((CoreData) envelope.getModuleData(CoreData.class)).monetizationConfiguration;
        if (NullChecker.m82486a(monetizationConfiguration) && NullChecker.m82486a(monetizationConfiguration.nearbyBlock)) {
            this.f20860S.put(Boolean.valueOf(monetizationConfiguration.nearbyBlock.access));
            this.f20861T.put(Boolean.valueOf(monetizationConfiguration.nearbyBlock.showPopUpInform));
        }
        return monetizationConfiguration;
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ C22421c m35748j3() {
        return qi20.m176654a(new pcj() { // from class: l.l1a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32268X0()).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.m1a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134402a.m35747i3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public void m35749k3() {
        this.f91137Q.scheduled("monetization_configuration_nearby_block", 0, new pcj() { // from class: l.k1a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f123464a.m35748j3();
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public void m35750l3(boolean z) {
        this.f20862U.put(Boolean.valueOf(z));
    }
}
