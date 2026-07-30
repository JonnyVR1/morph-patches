package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.ProfileSelectedQue;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class kua extends dy6 {

    /* JADX INFO: renamed from: R */
    public mof0<List<String>> f128826R;

    /* JADX INFO: renamed from: S */
    public ProfileSelectedQue f128827S;

    /* JADX INFO: renamed from: T */
    public byd0 f128828T;

    public kua(C4883c c4883c) {
        super(c4883c);
        this.f128827S = null;
        this.f128828T = new byd0("core_selected_time_" + CoreModule.m30929H().userId(), 0L);
        this.f128826R = new mof0<>(this.f91137Q, "questionsCurrent", new dji(new vod("questions_current_protobuf", "_v1", CoreModule.m30929H().userId()), 1, ProtobufAdapter.ARRAY_ADAPTER(ProtobufAdapter.STRING_ADAPTER)), new pcj() { // from class: l.cua
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f83832a.m151464n3();
            }
        });
        CoreModule.f18272k.f115537e.warmUp(100, 1000);
    }

    /* JADX INFO: renamed from: i3 */
    public Question m151459i3(User user) {
        if (!NullChecker.m82486a(this.f128827S) || TextUtils.isEmpty(this.f128827S.questionId)) {
            return null;
        }
        Question questionM151465o3 = m151465o3(this.f128827S.questionId);
        List<Answer> list = (NullChecker.m82486a(user) && NullChecker.m82486a(user.profile)) ? user.profile.answers : null;
        if (!jyb.m147479J(list) && NullChecker.m82486a(questionM151465o3)) {
            Iterator<Answer> it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().question, questionM151465o3.f56859id)) {
                    return null;
                }
            }
        }
        return questionM151465o3;
    }

    /* JADX INFO: renamed from: j3 */
    public C22421c<Envelope> m151460j3() {
        this.f128827S = null;
        final String str = "/tacittest/profile-questions?lastCheckTimestamp=" + this.f128828T.get();
        return this.f91137Q.scheduled("profile-questions", 0, new pcj() { // from class: l.fua
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.iua
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(xi5.m211107i(str)).m209032f().m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.gua
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f106476a.m151462l3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m151461k3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ Envelope m151462l3(final Envelope envelope) {
        if (NullChecker.m82486a(envelope)) {
            ProfileSelectedQue profileSelectedQue = ((CoreData) envelope.getModuleData(CoreData.class)).selectedQuestion;
            List<Question> list = ((CoreData) envelope.getModuleData(CoreData.class)).questions;
            if (NullChecker.m82486a(profileSelectedQue)) {
                this.f128827S = profileSelectedQue;
            }
            if (!jyb.m147479J(list)) {
                this.f128828T.put(Long.valueOf(pzi0.m174454o()));
                l51.m152919y(new Runnable() { // from class: l.hua
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f111626a.m151461k3(envelope);
                    }
                });
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ List m151463m3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return jyb.m147486Q(((CoreData) envelope.getModuleData(CoreData.class)).questions, new qcj() { // from class: l.jua
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Question) obj).f56859id;
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22421c m151464n3() {
        return new ti20(new pcj() { // from class: l.dua
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/questions?filter=current")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.eua
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f95848a.m151463m3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public Question m151465o3(String str) {
        return (Question) CoreModule.f18272k.f115537e.queryCache(str);
    }
}
