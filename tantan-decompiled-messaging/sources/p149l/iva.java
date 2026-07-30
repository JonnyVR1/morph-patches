package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.UserRights;
import com.p046p1.mobile.putong.core.data.UserRightsEnvelope;
import com.tantanapp.common.data.ProtobufAdapter;
import java.util.Collections;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class iva extends ax6 {

    /* JADX INFO: renamed from: R */
    public final C17622a f115106R;

    /* JADX INFO: renamed from: l.iva$a */
    public static final class C17622a extends fgf0<List<UserRights>> {
        public C17622a(ggi<List<UserRights>> ggiVar, v9j<C22306c<List<UserRights>>> v9jVar) {
            super("user/me/rights", ggiVar, v9jVar);
        }

        /* JADX INFO: renamed from: E */
        public static C17622a m138539E(final Network network, final String str) {
            return new C17622a(new ggi(new qnd("user_rights", "_v2", "_" + str), -1, ProtobufAdapter.ARRAY_ADAPTER(UserRights.PROTOBUF_ADAPTER)), new v9j() { // from class: l.fva
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return ia20.m135119c(new v9j() { // from class: l.gva
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return network.auth().m185898q(C4728a.m31200G("/users/" + str + "/rights")).m185883b();
                        }
                    }, UserRightsEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.hva
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((UserRightsEnvelope) obj).data.rights;
                        }
                    });
                }
            });
        }
    }

    public iva(C4732c c4732c) {
        super(c4732c);
        this.f115106R = C17622a.m138539E(C4728a.f19494P, CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: a3 */
    public boolean m138533a3() {
        return m138535c3().contains(UserRights.get(UserRights.allow_screen_shot));
    }

    /* JADX INFO: renamed from: b3 */
    public C22306c<roj0> m138534b3() {
        return this.f115106R.m121236q();
    }

    @NonNull
    /* JADX INFO: renamed from: c3 */
    public List<UserRights> m138535c3() {
        List<UserRights> listM121233n = this.f115106R.m121233n();
        return listM121233n == null ? Collections.EMPTY_LIST : listM121233n;
    }
}
