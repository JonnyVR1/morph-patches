package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.requestmic.MemberRequestMicPageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.s7m;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class scy implements s7m<ody> {

    /* JADX INFO: renamed from: a */
    public final MemberRequestMicPageView f20172a;

    /* JADX INFO: renamed from: b */
    public ody f20173b;

    /* JADX INFO: renamed from: c */
    public LiveBaseAdapter f20174c;

    public scy(Act act) {
        this.f20172a = MemberRequestMicPageView.m8862j0(act.inflater());
    }

    /* JADX INFO: renamed from: c */
    private void m22056c() {
        boolean z = this.f20174c.J().size() == 0;
        xdl0.M(this.f20172a._empty, z);
        xdl0.M(this.f20172a._recyclerView, !z);
        ody odyVar = this.f20173b;
        if (z) {
            odyVar.F2().MemberManagerEvent.clearTabRedPoint().j(3);
        } else {
            odyVar.F2().MemberManagerEvent.addTabRedPoint().j(3);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22057C0() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final qcy m22059d(final BLiveVoiceCall bLiveVoiceCall) {
        d1q d1qVar = (d1q) vwb.r(this.f20174c.J(), new w9j() { // from class: l.rcy
            public final Object call(Object obj) {
                d1q d1qVar2 = (d1q) obj;
                return Boolean.valueOf((d1qVar2 instanceof qcy) && TextUtils.equals(((qcy) d1qVar2).f19145a, bLiveVoiceCall.id));
            }
        });
        if (d1qVar != null) {
            return (qcy) d1qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public <VM extends scy> View m22060e() {
        return this.f20172a;
    }

    /* JADX INFO: renamed from: f */
    public void m22061f(ody odyVar) {
        this.f20173b = odyVar;
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f20174c = liveBaseAdapter;
        this.f20172a.m8866l0(liveBaseAdapter, odyVar);
        this.f20174c.Z(new ArrayList());
    }

    /* JADX INFO: renamed from: i */
    public void m22062i(BLiveVoiceCall bLiveVoiceCall) {
        qcy qcyVarM22059d = m22059d(bLiveVoiceCall);
        if (qcyVarM22059d != null) {
            this.f20174c.W(qcyVarM22059d);
            m22056c();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m22064j(BLiveVoiceCall bLiveVoiceCall) {
        m22062i(bLiveVoiceCall);
        m22067m();
        m22056c();
    }

    /* JADX INFO: renamed from: k */
    public void m22065k(List<d1q<?>> list) {
        xdl0.M(this.f20172a._free_call_container, !this.f20173b.m19727x4());
        if (!vwb.J(list)) {
            list.add(0, new pcy(list.size()));
        }
        this.f20174c.Z(list);
        m22056c();
    }

    /* JADX INFO: renamed from: l */
    public void m22066l(boolean z) {
        this.f20172a.m8867n0(z);
    }

    /* JADX INFO: renamed from: m */
    public void m22067m() {
        if (this.f20174c.J().size() > 0 && (this.f20174c.H(0) instanceof pcy)) {
            pcy pcyVar = (pcy) this.f20174c.H(0);
            if (this.f20174c.J().size() <= 1) {
                this.f20174c.J().remove(pcyVar);
                this.f20174c.notifyItemRemoved(0);
            } else {
                pcyVar.m20152I(this.f20173b.m19725t4());
                this.f20174c.notifyItemChanged(0);
            }
        }
        m22056c();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m22063i1(ody odyVar) {
    }

    public void destroy() {
    }
}
