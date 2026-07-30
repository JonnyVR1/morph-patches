package p149l;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class j4u {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ u3u m139778a(u3u u3uVar, BLiveEnvelope bLiveEnvelope) {
        u3uVar.m191622d(bLiveEnvelope.data.teenagerLives);
        u3uVar.m191624f(bLiveEnvelope.pagination);
        return u3uVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ u3u m139779b(BLiveEnvelope bLiveEnvelope) {
        return new u3u(bLiveEnvelope.data.teenagerLives, bLiveEnvelope.pagination);
    }

    /* JADX INFO: renamed from: c */
    public C22306c<u3u> m139780c(int i) {
        cll.C16188a c16188aM107524p = cll.m107501r(ytr.m216073b("/teenage-lives")).m107524p();
        c16188aM107524p.m107536c(Constants.KEY_LIMIT, String.valueOf(i));
        return LiveExternalApi.buildLiveReadReq(c16188aM107524p.m107537d(), "teen_mode_load_all").map(new w9j() { // from class: l.h4u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j4u.m139779b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public C22306c<u3u> m139781d(@NonNull final u3u u3uVar) {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/teenage-lives?") + u3uVar.f173651b.links.next), "teen_mode_load_next_page").map(new w9j() { // from class: l.i4u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j4u.m139778a(u3uVar, (BLiveEnvelope) obj);
            }
        });
    }
}
