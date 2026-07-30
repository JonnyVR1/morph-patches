package p006l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.UserRights;
import com.p1.mobile.putong.core.data.UserRightsEnvelope;
import com.tantanapp.common.data.ProtobufAdapter;
import java.util.Collections;
import java.util.List;
import l.fgf0;
import l.ggi;
import l.roj0;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class iva extends ax6 {

    /* JADX INFO: renamed from: R */
    public final C0857a f14803R;

    /* JADX INFO: renamed from: l.iva$a */
    public static final class C0857a extends fgf0<List<UserRights>> {
        public C0857a(ggi<List<UserRights>> ggiVar, v9j<c<List<UserRights>>> v9jVar) {
            super("user/me/rights", ggiVar, v9jVar);
        }

        /* JADX INFO: renamed from: E */
        public static C0857a m17060E(final Network network, final String str) {
            return new C0857a(new ggi(new qnd("user_rights", "_v2", "_" + str), -1, ProtobufAdapter.ARRAY_ADAPTER(UserRights.PROTOBUF_ADAPTER)), new v9j() { // from class: l.fva
                public final Object call() {
                    return ia20.m16569c(new v9j() { // from class: l.gva
                        public final Object call() {
                            return network.auth().q(C0154a.m3130G("/users/" + str + "/rights")).b();
                        }
                    }, UserRightsEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.hva
                        public final Object call(Object obj) {
                            return ((UserRightsEnvelope) obj).data.rights;
                        }
                    });
                }
            });
        }
    }

    public iva(C0158c c0158c) {
        super(c0158c);
        this.f14803R = C0857a.m17060E(C0154a.f3483P, CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: a3 */
    public boolean m17054a3() {
        return m17056c3().contains(UserRights.get("allow_screen_shot"));
    }

    /* JADX INFO: renamed from: b3 */
    public c<roj0> m17055b3() {
        return this.f14803R.z();
    }

    @NonNull
    /* JADX INFO: renamed from: c3 */
    public List<UserRights> m17056c3() {
        List<UserRights> list = (List) this.f14803R.n();
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
