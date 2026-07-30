package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class it40 extends t6b0<bkj0<User, CoreLikers.C4870a, Integer>> implements lke0.InterfaceC18406a {
    public it40(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.lke0.InterfaceC18406a
    /* JADX INFO: renamed from: d */
    public int mo142015d() {
        if (NullChecker.m82486a(this.f177418b) && NullChecker.m82486a(((bkj0) this.f177418b).f77082b)) {
            return ((CoreLikers.C4870a) ((bkj0) this.f177418b).f77082b).f20012b;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC20482u4
    /* JADX INFO: renamed from: i */
    public Picture.ImageUri mo119959i() {
        return bhe0.m104329b((CoreLikers.C4870a) ((bkj0) this.f177418b).f77082b);
    }

    @Override // p153l.AbstractC20482u4
    /* JADX INFO: renamed from: l */
    public Integer mo119960l() {
        return bhe0.m104328a();
    }
}
