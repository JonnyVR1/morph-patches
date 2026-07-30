package p009l;

import android.content.Context;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.x2c0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class n690 extends AbstractC1278w4<xaj0<User, CoreLikers.a, Integer>> implements gce0.InterfaceC0918a {
    public n690(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public int mo14912c() {
        throw null;
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
        return Integer.valueOf(x2c0.Zq);
    }

    @Override // p009l.AbstractC1278w4
    /* JADX INFO: renamed from: m */
    public CharSequence mo15382m() {
        return m14910a() ? m23864j().getString(R.string.Bh) : m23864j().getString(R.string.Ch);
    }

    @Override // p009l.AbstractC1278w4
    /* JADX INFO: renamed from: n */
    public CharSequence mo15383n() {
        if (m14910a()) {
            return m23864j().getString(m14911b() ? R.string.Ah : R.string.zh, i0g0.m16108G(m14911b() ? mo14912c() : mo14913d()));
        }
        return m23864j().getString(R.string.Dh);
    }
}
