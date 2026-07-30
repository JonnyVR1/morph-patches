package p009l;

import android.content.Context;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class uk40 extends pya0<xaj0<User, CoreLikers.a, Integer>> implements gce0.InterfaceC0918a {
    public uk40(Context context) {
        super(context);
    }

    @Override // p009l.gce0.InterfaceC0918a
    /* JADX INFO: renamed from: d */
    public int mo14913d() {
        if (NullChecker.a(this.f21884b) && NullChecker.a(((xaj0) this.f21884b).b)) {
            return ((CoreLikers.a) ((xaj0) this.f21884b).b).b;
        }
        return 0;
    }

    @Override // p009l.AbstractC1278w4
    /* JADX INFO: renamed from: i */
    public Picture.ImageUri mo15380i() {
        return w8e0.m24005b((CoreLikers.a) ((xaj0) this.f21884b).b);
    }

    @Override // p009l.AbstractC1278w4
    /* JADX INFO: renamed from: l */
    public Integer mo15381l() {
        return w8e0.m24004a();
    }
}
