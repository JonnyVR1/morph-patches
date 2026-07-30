package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class re90 extends AbstractC20482u4<bkj0<User, CoreLikers.C4870a, Integer>> implements lke0.InterfaceC18406a {
    public re90(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public int mo138035c() {
        throw null;
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
        return Integer.valueOf(dbc0.f86420Nr);
    }

    @Override // p153l.AbstractC20482u4
    /* JADX INFO: renamed from: m */
    public CharSequence mo119961m() {
        return m154643a() ? m194456j().getString(R$string.f18974Wh) : m194456j().getString(R$string.f19004Xh);
    }

    @Override // p153l.AbstractC20482u4
    /* JADX INFO: renamed from: n */
    public CharSequence mo119962n() {
        if (m154643a()) {
            return m194456j().getString(m154644b() ? R$string.f18944Vh : R$string.f18914Uh, q8g0.m175775G(m154644b() ? mo138035c() : mo142015d()));
        }
        return m194456j().getString(R$string.f19034Yh);
    }
}
