package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.ProfileSelectedQue;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.e51;
import l.fgf0;
import l.ggi;
import l.mqi0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ysa extends ax6 {

    /* JADX INFO: renamed from: R */
    public fgf0<List<String>> f28368R;

    /* JADX INFO: renamed from: S */
    public ProfileSelectedQue f28369S;

    /* JADX INFO: renamed from: T */
    public zpd0 f28370T;

    public ysa(C0158c c0158c) {
        super(c0158c);
        this.f28369S = null;
        this.f28370T = new zpd0("core_selected_time_" + CoreModule.m1850H().userId(), 0L);
        this.f28368R = new fgf0<>(this.f8580Q, "questionsCurrent", new ggi(new qnd("questions_current_protobuf", "_v1", CoreModule.m1850H().userId()), 1, ProtobufAdapter.ARRAY_ADAPTER(ProtobufAdapter.STRING_ADAPTER)), new v9j() { // from class: l.qsa
            public final Object call() {
                return this.f20006a.m28387n3();
            }
        });
        CoreModule.f1542k.f11197e.warmUp(100, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }

    /* JADX INFO: renamed from: i3 */
    public Question m28382i3(User user) {
        if (!NullChecker.a(this.f28369S) || TextUtils.isEmpty(this.f28369S.questionId)) {
            return null;
        }
        Question questionM28388o3 = m28388o3(this.f28369S.questionId);
        List list = (NullChecker.a(user) && NullChecker.a(user.profile)) ? user.profile.answers : null;
        if (!vwb.J(list) && NullChecker.a(questionM28388o3)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(((Answer) it.next()).question, ((DbObject) questionM28388o3).id)) {
                    return null;
                }
            }
        }
        return questionM28388o3;
    }

    /* JADX INFO: renamed from: j3 */
    public c<Envelope> m28383j3() {
        this.f28369S = null;
        final String str = "/tacittest/profile-questions?lastCheckTimestamp=" + this.f28370T.get();
        return this.f8580Q.scheduled("profile-questions", 0, new v9j() { // from class: l.tsa
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.wsa
                    public final Object call() {
                        return C0154a.f3483P.auth().q(xh5.m27250i(str)).f().b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.usa
            public final Object call(Object obj) {
                return this.f23730a.m28385l3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m28384k3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ Envelope m28385l3(final Envelope envelope) {
        if (NullChecker.a(envelope)) {
            ProfileSelectedQue profileSelectedQue = envelope.getModuleData(CoreData.class).selectedQuestion;
            List list = envelope.getModuleData(CoreData.class).questions;
            if (NullChecker.a(profileSelectedQue)) {
                this.f28369S = profileSelectedQue;
            }
            if (!vwb.J(list)) {
                this.f28370T.put(Long.valueOf(mqi0.o()));
                e51.y(new Runnable() { // from class: l.vsa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24442a.m28384k3(envelope);
                    }
                });
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ List m28386m3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return vwb.Q(envelope.getModuleData(CoreData.class).questions, new w9j() { // from class: l.xsa
            public final Object call(Object obj) {
                return ((DbObject) ((Question) obj)).id;
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ c m28387n3() {
        return new la20(new v9j() { // from class: l.rsa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/questions?filter=current")).f().b();
            }
        }).map(new w9j() { // from class: l.ssa
            public final Object call(Object obj) {
                return this.f21636a.m28386m3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public Question m28388o3(String str) {
        return CoreModule.f1542k.f11197e.queryCache(str);
    }
}
