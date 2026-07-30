package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class uk40 extends pya0<xaj0<User, CoreLikers.C4719a, Integer>> implements gce0.InterfaceC17057a {
    public uk40(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.gce0.InterfaceC17057a
    /* JADX INFO: renamed from: d */
    public int mo125497d() {
        if (NullChecker.m81303a(this.f184459b) && NullChecker.m81303a(((xaj0) this.f184459b).f191752b)) {
            return ((CoreLikers.C4719a) ((xaj0) this.f184459b).f191752b).f19270b;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC20796w4
    /* JADX INFO: renamed from: i */
    public Picture.ImageUri mo128981i() {
        return w8e0.m202164b((CoreLikers.C4719a) ((xaj0) this.f184459b).f191752b);
    }

    @Override // p149l.AbstractC20796w4
    /* JADX INFO: renamed from: l */
    public Integer mo128982l() {
        return w8e0.m202163a();
    }
}
