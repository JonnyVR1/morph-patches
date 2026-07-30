package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class u8f0 {

    /* JADX INFO: renamed from: a */
    public final BLiveEntrance f178038a;

    /* JADX INFO: renamed from: b */
    public final String f178039b;

    public u8f0(BLiveEntrance bLiveEntrance, String str) {
        this.f178038a = bLiveEntrance;
        this.f178039b = str;
    }

    /* JADX INFO: renamed from: a */
    public C22421c<ubu> m195034a() {
        String str;
        BLiveEntrance bLiveEntrance = this.f178038a;
        if (!bLiveEntrance.showFollow) {
            return C22421c.error(new RuntimeException("This entrance should not request followData"));
        }
        String str2 = bLiveEntrance.source;
        if (TextUtils.isEmpty(this.f178039b)) {
            str = null;
        } else {
            str = "subSource=" + this.f178039b;
        }
        return LivingNormalApiProvider.m72692l5("following-suggested", str2, "swipe-side-bar", 100, null, false, str, false);
    }

    /* JADX INFO: renamed from: b */
    public C22421c<ubu> m195035b() {
        String str;
        BLiveEntrance bLiveEntrance = this.f178038a;
        if (!bLiveEntrance.showHourlySuggested) {
            return C22421c.error(new RuntimeException("This entrance should not request hourRankings"));
        }
        String str2 = bLiveEntrance.source;
        int i = LivingNormalApiProvider.f48533b;
        if (TextUtils.isEmpty(this.f178039b)) {
            str = null;
        } else {
            str = "subSource=" + this.f178039b;
        }
        return LivingNormalApiProvider.m72692l5("hour-ranking-suggested", str2, "swipe-side-bar", i, null, false, str, false);
    }

    /* JADX INFO: renamed from: c */
    public C22421c<ubu> m195036c(ubu ubuVar) {
        String str;
        if (ubuVar == null || !ubuVar.m195327t()) {
            return C22421c.create(new ek20());
        }
        String str2 = this.f178038a.source;
        int i = LivingNormalApiProvider.f48533b;
        Pagination paginationM195325r = ubuVar.m195325r();
        if (TextUtils.isEmpty(this.f178039b)) {
            str = null;
        } else {
            str = "subSource=" + this.f178039b;
        }
        return LivingNormalApiProvider.m72809y5(RelationshipStatus.suggested, str2, "swipe-side-bar", i, paginationM195325r, str, m195038e());
    }

    /* JADX INFO: renamed from: d */
    public C22421c<ubu> m195037d() {
        String str;
        String str2 = this.f178038a.source;
        int i = LivingNormalApiProvider.f48533b;
        if (TextUtils.isEmpty(this.f178039b)) {
            str = null;
        } else {
            str = "subSource=" + this.f178039b;
        }
        return LivingNormalApiProvider.m72692l5(RelationshipStatus.suggested, str2, "swipe-side-bar", i, null, false, str, m195038e());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m195038e() {
        return vxr.m203876d().m170976G0();
    }

    /* JADX INFO: renamed from: f */
    public C22421c<List<j7u>> m195039f(List<String> list) {
        return LivingNormalApiProvider.m72432I6(list, m195038e());
    }
}
