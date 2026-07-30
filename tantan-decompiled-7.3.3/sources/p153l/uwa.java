package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.UserRights;
import com.p051p1.mobile.putong.core.data.UserRightsEnvelope;
import com.tantanapp.common.data.ProtobufAdapter;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class uwa extends dy6 {

    /* JADX INFO: renamed from: R */
    public final C20685a f181250R;

    /* JADX INFO: renamed from: l.uwa$a */
    public static final class C20685a extends mof0<List<UserRights>> {
        public C20685a(dji<List<UserRights>> djiVar, pcj<C22421c<List<UserRights>>> pcjVar) {
            super("user/me/rights", djiVar, pcjVar);
        }

        /* JADX INFO: renamed from: E */
        public static C20685a m198344E(final Network network, final String str) {
            return new C20685a(new dji(new vod("user_rights", "_v2", "_" + str), -1, ProtobufAdapter.ARRAY_ADAPTER(UserRights.PROTOBUF_ADAPTER)), new pcj() { // from class: l.rwa
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return qi20.m176656c(new pcj() { // from class: l.swa
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return network.auth().m209043q(C4879a.m32203G("/users/" + str + "/rights")).m209028b();
                        }
                    }, UserRightsEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.twa
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((UserRightsEnvelope) obj).data.rights;
                        }
                    });
                }
            });
        }
    }

    public uwa(C4883c c4883c) {
        super(c4883c);
        this.f181250R = C20685a.m198344E(C4879a.f20236P, CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: a3 */
    public boolean m198338a3() {
        return m198340c3().contains(UserRights.get(UserRights.allow_screen_shot));
    }

    /* JADX INFO: renamed from: b3 */
    public C22421c<uxj0> m198339b3() {
        return this.f181250R.m159280q();
    }

    @NonNull
    /* JADX INFO: renamed from: c3 */
    public List<UserRights> m198340c3() {
        List<UserRights> listM159277n = this.f181250R.m159277n();
        return listM159277n == null ? Collections.EMPTY_LIST : listM159277n;
    }
}
