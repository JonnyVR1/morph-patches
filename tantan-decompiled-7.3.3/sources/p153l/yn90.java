package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class yn90 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VFrame f200801u;

    /* JADX INFO: renamed from: v */
    public int f200802v;

    public yn90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return m168325w();
    }

    /* JADX INFO: renamed from: R */
    public View m216779R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zn90.m220587b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return d79.m114682i() && NullChecker.m82486a(u2n.m194285l().m194294j(2)) && !mo53983O().mo53478me().isFemale() && !mo53983O().mo53478me().isVIP() && NullChecker.m82486a(mo53983O().mo52252K2()) && mo53983O().mo52252K2().isFemale() && tzi0.m193670h(pzi0.m174454o(), (long) mo53983O().mo53478me().createdTime, d79.m114684j()) && mo53983O().mo53279I1();
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m216779R(mo53983O().act().inflater(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        if (mo53983O().act().hashCode() == this.f200802v || !mo53983O().mo53279I1()) {
            return;
        }
        u2n.m194285l().m194294j(2).m165740j("profileUserId", mo53983O().userId()).mo125406h(mo53983O().act(), this.f200801u);
        this.f200802v = mo53983O().act().hashCode();
    }
}
