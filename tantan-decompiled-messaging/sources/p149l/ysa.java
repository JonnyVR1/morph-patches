package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.ProfileSelectedQue;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class ysa extends ax6 {

    /* JADX INFO: renamed from: R */
    public fgf0<List<String>> f199753R;

    /* JADX INFO: renamed from: S */
    public ProfileSelectedQue f199754S;

    /* JADX INFO: renamed from: T */
    public zpd0 f199755T;

    public ysa(C4732c c4732c) {
        super(c4732c);
        this.f199754S = null;
        this.f199755T = new zpd0("core_selected_time_" + CoreModule.m29931H().userId(), 0L);
        this.f199753R = new fgf0<>(this.f72126Q, "questionsCurrent", new ggi(new qnd("questions_current_protobuf", "_v1", CoreModule.m29931H().userId()), 1, ProtobufAdapter.ARRAY_ADAPTER(ProtobufAdapter.STRING_ADAPTER)), new v9j() { // from class: l.qsa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f156150a.m215899n3();
            }
        });
        CoreModule.f17553k.f91942e.warmUp(100, 1000);
    }

    /* JADX INFO: renamed from: i3 */
    public Question m215894i3(User user) {
        if (!NullChecker.m81303a(this.f199754S) || TextUtils.isEmpty(this.f199754S.questionId)) {
            return null;
        }
        Question questionM215900o3 = m215900o3(this.f199754S.questionId);
        List<Answer> list = (NullChecker.m81303a(user) && NullChecker.m81303a(user.profile)) ? user.profile.answers : null;
        if (!vwb.m200296J(list) && NullChecker.m81303a(questionM215900o3)) {
            Iterator<Answer> it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().question, questionM215900o3.f56011id)) {
                    return null;
                }
            }
        }
        return questionM215900o3;
    }

    /* JADX INFO: renamed from: j3 */
    public C22306c<Envelope> m215895j3() {
        this.f199754S = null;
        final String str = "/tacittest/profile-questions?lastCheckTimestamp=" + this.f199755T.get();
        return this.f72126Q.scheduled("profile-questions", 0, new v9j() { // from class: l.tsa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.wsa
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(xh5.m208761i(str)).m185887f().m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.usa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f177950a.m215897l3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m215896k3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ Envelope m215897l3(final Envelope envelope) {
        if (NullChecker.m81303a(envelope)) {
            ProfileSelectedQue profileSelectedQue = ((CoreData) envelope.getModuleData(CoreData.class)).selectedQuestion;
            List<Question> list = ((CoreData) envelope.getModuleData(CoreData.class)).questions;
            if (NullChecker.m81303a(profileSelectedQue)) {
                this.f199754S = profileSelectedQue;
            }
            if (!vwb.m200296J(list)) {
                this.f199755T.put(Long.valueOf(mqi0.m155944o()));
                e51.m114774y(new Runnable() { // from class: l.vsa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f182814a.m215896k3(envelope);
                    }
                });
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ List m215898m3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return vwb.m200303Q(((CoreData) envelope.getModuleData(CoreData.class)).questions, new w9j() { // from class: l.xsa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Question) obj).f56011id;
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22306c m215899n3() {
        return new la20(new v9j() { // from class: l.rsa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/questions?filter=current")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.ssa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166171a.m215898m3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public Question m215900o3(String str) {
        return (Question) CoreModule.f17553k.f91942e.queryCache(str);
    }
}
