package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class ckt {

    /* JADX INFO: renamed from: a */
    public final String f82312a;

    /* JADX INFO: renamed from: b */
    public final String f82313b;

    public ckt(String str, String str2) {
        this.f82313b = str;
        this.f82312a = str2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m110388a() {
        return vxr.m203876d().m170976G0();
    }

    /* JADX INFO: renamed from: b */
    public C22421c<ubu> m110389b() {
        String str;
        String str2 = this.f82313b;
        int i = LivingNormalApiProvider.f48533b;
        if (TextUtils.isEmpty(this.f82312a)) {
            str = null;
        } else {
            str = "subSource=" + this.f82312a;
        }
        return LivingNormalApiProvider.m72692l5(RelationshipStatus.suggested, str2, "swipe-in-room", i, null, false, str, m110388a());
    }

    /* JADX INFO: renamed from: c */
    public C22421c<ubu> m110390c(ubu ubuVar) {
        String str;
        if (ubuVar == null || !ubuVar.m195327t()) {
            return C22421c.create(new ek20());
        }
        String str2 = this.f82313b;
        int i = LivingNormalApiProvider.f48533b;
        Pagination paginationM195325r = ubuVar.m195325r();
        if (TextUtils.isEmpty(this.f82312a)) {
            str = null;
        } else {
            str = "subSource=" + this.f82312a;
        }
        return LivingNormalApiProvider.m72809y5(RelationshipStatus.suggested, str2, "swipe-in-room", i, paginationM195325r, str, m110388a());
    }
}
