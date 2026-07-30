package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Questionnaire;
import com.p1.mobile.putong.core.data.QuestionnaireScene;
import com.p1.mobile.putong.core.data.QuestionnaireStrategy;
import com.p1.mobile.putong.data.Envelope;
import l.tpd0;
import l.v9j;
import l.w9j;
import l.zpd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class uab extends C0154a {

    /* JADX INFO: renamed from: Q */
    public final C0158c f23466Q;

    /* JADX INFO: renamed from: R */
    public zpd0 f23467R;

    /* JADX INFO: renamed from: S */
    public tpd0 f23468S;

    /* JADX INFO: renamed from: T */
    public zpd0 f23469T;

    /* JADX INFO: renamed from: U */
    public tpd0 f23470U;

    /* JADX INFO: renamed from: V */
    public zpd0 f23471V;

    /* JADX INFO: renamed from: W */
    public tpd0 f23472W;

    /* JADX INFO: renamed from: X */
    public zpd0 f23473X;

    public uab(C0158c c0158c) {
        super(c0158c);
        this.f23466Q = c0158c;
        this.f23468S = new tpd0("swipe_ux_questionnaire_show_count" + CoreModule.m1850H().userId(), 0);
        this.f23467R = new zpd0("swipe_ux_questionnaire_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f23470U = new tpd0("msg_list_ux_questionnaire_show_count" + CoreModule.m1850H().userId(), 0);
        this.f23469T = new zpd0("msg_list_ux_questionnaire_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f23472W = new tpd0("msg_detail_ux_questionnaire_show_count" + CoreModule.m1850H().userId(), 0);
        this.f23471V = new zpd0("msg_detail_ux_questionnaire_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f23473X = new zpd0("msg_detail_show_time" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: c3 */
    public c<Questionnaire> m25170c3(QuestionnaireScene questionnaireScene, QuestionnaireStrategy questionnaireStrategy) {
        final String strM3143J0 = C0154a.m3143J0("/experience-questionnaire?scene=" + questionnaireScene.toString());
        if (questionnaireStrategy != null) {
            strM3143J0 = strM3143J0 + "&strategy=" + questionnaireStrategy.toString();
        }
        return this.f23466Q.scheduled(strM3143J0, 0, new v9j() { // from class: l.rab
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.sab
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }).map(new w9j() { // from class: l.tab
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).questionnaire;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }
}
