package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class n690 extends AbstractC20796w4<xaj0<User, CoreLikers.C4719a, Integer>> implements gce0.InterfaceC17057a {
    public n690(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public int mo125496c() {
        throw null;
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
        return Integer.valueOf(x2c0.f189961Zq);
    }

    @Override // p149l.AbstractC20796w4
    /* JADX INFO: renamed from: m */
    public CharSequence mo128983m() {
        return m125494a() ? m201439j().getString(R$string.f17614Bh) : m201439j().getString(R$string.f17644Ch);
    }

    @Override // p149l.AbstractC20796w4
    /* JADX INFO: renamed from: n */
    public CharSequence mo128984n() {
        if (m125494a()) {
            return m201439j().getString(m125495b() ? R$string.f17584Ah : R$string.f19126zh, i0g0.m133840G(m125495b() ? mo125496c() : mo125497d()));
        }
        return m201439j().getString(R$string.f17674Dh);
    }
}
