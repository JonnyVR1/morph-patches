package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Questionnaire;
import com.p046p1.mobile.putong.core.data.QuestionnaireScene;
import com.p046p1.mobile.putong.core.data.QuestionnaireStrategy;
import com.p046p1.mobile.putong.data.Envelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class uab extends C4728a {

    /* JADX INFO: renamed from: Q */
    public final C4732c f175584Q;

    /* JADX INFO: renamed from: R */
    public zpd0 f175585R;

    /* JADX INFO: renamed from: S */
    public tpd0 f175586S;

    /* JADX INFO: renamed from: T */
    public zpd0 f175587T;

    /* JADX INFO: renamed from: U */
    public tpd0 f175588U;

    /* JADX INFO: renamed from: V */
    public zpd0 f175589V;

    /* JADX INFO: renamed from: W */
    public tpd0 f175590W;

    /* JADX INFO: renamed from: X */
    public zpd0 f175591X;

    public uab(C4732c c4732c) {
        super(c4732c);
        this.f175584Q = c4732c;
        this.f175586S = new tpd0("swipe_ux_questionnaire_show_count" + CoreModule.m29931H().userId(), 0);
        this.f175585R = new zpd0("swipe_ux_questionnaire_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f175588U = new tpd0("msg_list_ux_questionnaire_show_count" + CoreModule.m29931H().userId(), 0);
        this.f175587T = new zpd0("msg_list_ux_questionnaire_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f175590W = new tpd0("msg_detail_ux_questionnaire_show_count" + CoreModule.m29931H().userId(), 0);
        this.f175589V = new zpd0("msg_detail_ux_questionnaire_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f175591X = new zpd0("msg_detail_show_time" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: c3 */
    public C22306c<Questionnaire> m192750c3(QuestionnaireScene questionnaireScene, QuestionnaireStrategy questionnaireStrategy) {
        final String strM31213J0 = C4728a.m31213J0("/experience-questionnaire?scene=" + questionnaireScene.toString());
        if (questionnaireStrategy != null) {
            strM31213J0 = strM31213J0 + "&strategy=" + questionnaireStrategy.toString();
        }
        return this.f175584Q.scheduled(strM31213J0, 0, new v9j() { // from class: l.rab
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.sab
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.tab
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).questionnaire;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }
}
