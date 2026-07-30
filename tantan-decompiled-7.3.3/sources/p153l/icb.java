package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Questionnaire;
import com.p051p1.mobile.putong.core.data.QuestionnaireScene;
import com.p051p1.mobile.putong.core.data.QuestionnaireStrategy;
import com.p051p1.mobile.putong.data.Envelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class icb extends C4879a {

    /* JADX INFO: renamed from: Q */
    public final C4883c f114293Q;

    /* JADX INFO: renamed from: R */
    public byd0 f114294R;

    /* JADX INFO: renamed from: S */
    public vxd0 f114295S;

    /* JADX INFO: renamed from: T */
    public byd0 f114296T;

    /* JADX INFO: renamed from: U */
    public vxd0 f114297U;

    /* JADX INFO: renamed from: V */
    public byd0 f114298V;

    /* JADX INFO: renamed from: W */
    public vxd0 f114299W;

    /* JADX INFO: renamed from: X */
    public byd0 f114300X;

    public icb(C4883c c4883c) {
        super(c4883c);
        this.f114293Q = c4883c;
        this.f114295S = new vxd0("swipe_ux_questionnaire_show_count" + CoreModule.m30929H().userId(), 0);
        this.f114294R = new byd0("swipe_ux_questionnaire_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f114297U = new vxd0("msg_list_ux_questionnaire_show_count" + CoreModule.m30929H().userId(), 0);
        this.f114296T = new byd0("msg_list_ux_questionnaire_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f114299W = new vxd0("msg_detail_ux_questionnaire_show_count" + CoreModule.m30929H().userId(), 0);
        this.f114298V = new byd0("msg_detail_ux_questionnaire_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f114300X = new byd0("msg_detail_show_time" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: c3 */
    public C22421c<Questionnaire> m139433c3(QuestionnaireScene questionnaireScene, QuestionnaireStrategy questionnaireStrategy) {
        final String strM32216J0 = C4879a.m32216J0("/experience-questionnaire?scene=" + questionnaireScene.toString());
        if (questionnaireStrategy != null) {
            strM32216J0 = strM32216J0 + "&strategy=" + questionnaireStrategy.toString();
        }
        return this.f114293Q.scheduled(strM32216J0, 0, new pcj() { // from class: l.fcb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.gcb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.hcb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).questionnaire;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }
}
