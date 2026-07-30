package p153l;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class k6u {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ v5u m148573a(v5u v5uVar, BLiveEnvelope bLiveEnvelope) {
        v5uVar.m199922d(bLiveEnvelope.data.teenagerLives);
        v5uVar.m199924f(bLiveEnvelope.pagination);
        return v5uVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ v5u m148574b(BLiveEnvelope bLiveEnvelope) {
        return new v5u(bLiveEnvelope.data.teenagerLives, bLiveEnvelope.pagination);
    }

    /* JADX INFO: renamed from: c */
    public C22421c<v5u> m148575c(int i) {
        rnl.C19886a c19886aM182288p = rnl.m182265r(zvr.m221802b("/teenage-lives")).m182288p();
        c19886aM182288p.m182300c(Constants.KEY_LIMIT, String.valueOf(i));
        return LiveExternalApi.buildLiveReadReq(c19886aM182288p.m182301d(), "teen_mode_load_all").map(new qcj() { // from class: l.i6u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k6u.m148574b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public C22421c<v5u> m148576d(@NonNull final v5u v5uVar) {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/teenage-lives?") + v5uVar.f182569b.links.next), "teen_mode_load_next_page").map(new qcj() { // from class: l.j6u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k6u.m148573a(v5uVar, (BLiveEnvelope) obj);
            }
        });
    }
}
