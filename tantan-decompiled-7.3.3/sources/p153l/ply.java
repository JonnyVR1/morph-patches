package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.requestmic.MemberRequestMicPageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ply implements iam<lmy> {

    /* JADX INFO: renamed from: a */
    public final MemberRequestMicPageView f153105a;

    /* JADX INFO: renamed from: b */
    public lmy f153106b;

    /* JADX INFO: renamed from: c */
    public LiveBaseAdapter f153107c;

    public ply(Act act) {
        this.f153105a = MemberRequestMicPageView.m79829j0(act.inflater());
    }

    /* JADX INFO: renamed from: c */
    private void m172902c() {
        boolean z = this.f153107c.m68538J().size() == 0;
        bnl0.m105524M(this.f153105a._empty, z);
        bnl0.m105524M(this.f153105a._recyclerView, !z);
        lmy lmyVar = this.f153106b;
        if (z) {
            lmyVar.m213811F2().MemberManagerEvent.clearTabRedPoint().mo199273j(3);
        } else {
            lmyVar.m213811F2().MemberManagerEvent.addTabRedPoint().mo199273j(3);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final nly m172904d(final BLiveVoiceCall bLiveVoiceCall) {
        d3q d3qVar = (d3q) jyb.m147529r(this.f153107c.m68538J(), new qcj() { // from class: l.oly
            @Override // p153l.qcj
            public final Object call(Object obj) {
                d3q d3qVar2 = (d3q) obj;
                return Boolean.valueOf((d3qVar2 instanceof nly) && TextUtils.equals(((nly) d3qVar2).f142600a, bLiveVoiceCall.f45333id));
            }
        });
        if (d3qVar != null) {
            return (nly) d3qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public <VM extends ply> View m172905e() {
        return this.f153105a;
    }

    /* JADX INFO: renamed from: f */
    public void m172906f(lmy lmyVar) {
        this.f153106b = lmyVar;
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f153107c = liveBaseAdapter;
        this.f153105a.m79833l0(liveBaseAdapter, lmyVar);
        this.f153107c.m68554Z(new ArrayList());
    }

    /* JADX INFO: renamed from: i */
    public void m172907i(BLiveVoiceCall bLiveVoiceCall) {
        nly nlyVarM172904d = m172904d(bLiveVoiceCall);
        if (nlyVarM172904d != null) {
            this.f153107c.m68551W(nlyVarM172904d);
            m172902c();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m172908j(BLiveVoiceCall bLiveVoiceCall) {
        m172907i(bLiveVoiceCall);
        m172911m();
        m172902c();
    }

    /* JADX INFO: renamed from: k */
    public void m172909k(List<d3q<?>> list) {
        bnl0.m105524M(this.f153105a._free_call_container, !this.f153106b.m154939x4());
        if (!jyb.m147479J(list)) {
            list.add(0, new mly(list.size()));
        }
        this.f153107c.m68554Z(list);
        m172902c();
    }

    /* JADX INFO: renamed from: l */
    public void m172910l(boolean z) {
        this.f153105a.m79834n0(z);
    }

    /* JADX INFO: renamed from: m */
    public void m172911m() {
        if (this.f153107c.m68538J().size() > 0 && (this.f153107c.m68536H(0) instanceof mly)) {
            mly mlyVar = (mly) this.f153107c.m68536H(0);
            if (this.f153107c.m68538J().size() <= 1) {
                this.f153107c.m68538J().remove(mlyVar);
                this.f153107c.notifyItemRemoved(0);
            } else {
                mlyVar.m158950I(this.f153106b.m154937t4());
                this.f153107c.notifyItemChanged(0);
            }
        }
        m172902c();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lmy lmyVar) {
    }
}
