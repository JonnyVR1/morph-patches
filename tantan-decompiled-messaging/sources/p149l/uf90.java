package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class uf90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VFrame f176238u;

    /* JADX INFO: renamed from: v */
    public int f176239v;

    public uf90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return m131825w();
    }

    /* JADX INFO: renamed from: R */
    public View m193375R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vf90.m198275b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return u59.m191832i() && NullChecker.m81303a(u0n.m191353l().m191362j(2)) && !mo52800O().mo52295me().isFemale() && !mo52800O().mo52295me().isVIP() && NullChecker.m81303a(mo52800O().mo51069K2()) && mo52800O().mo51069K2().isFemale() && qqi0.m175940h(mqi0.m155944o(), (long) mo52800O().mo52295me().createdTime, u59.m191834j()) && mo52800O().mo52096I1();
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m193375R(mo52800O().act().inflater(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        if (mo52800O().act().hashCode() == this.f176239v || !mo52800O().mo52096I1()) {
            return;
        }
        u0n.m191353l().m191362j(2).m162162j("profileUserId", mo52800O().userId()).mo100438h(mo52800O().act(), this.f176238u);
        this.f176239v = mo52800O().act().hashCode();
    }
}
