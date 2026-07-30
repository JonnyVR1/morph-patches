package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.requestmic.MemberRequestMicPageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class scy implements s7m<ody> {

    /* JADX INFO: renamed from: a */
    public final MemberRequestMicPageView f163789a;

    /* JADX INFO: renamed from: b */
    public ody f163790b;

    /* JADX INFO: renamed from: c */
    public LiveBaseAdapter f163791c;

    public scy(Act act) {
        this.f163789a = MemberRequestMicPageView.m78646j0(act.inflater());
    }

    /* JADX INFO: renamed from: c */
    private void m183432c() {
        boolean z = this.f163791c.m67355J().size() == 0;
        xdl0.m208344M(this.f163789a._empty, z);
        xdl0.m208344M(this.f163789a._recyclerView, !z);
        ody odyVar = this.f163790b;
        if (z) {
            odyVar.m206028F2().MemberManagerEvent.clearTabRedPoint().mo172463j(3);
        } else {
            odyVar.m206028F2().MemberManagerEvent.addTabRedPoint().mo172463j(3);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final qcy m183434d(final BLiveVoiceCall bLiveVoiceCall) {
        d1q d1qVar = (d1q) vwb.m200346r(this.f163791c.m67355J(), new w9j() { // from class: l.rcy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                d1q d1qVar2 = (d1q) obj;
                return Boolean.valueOf((d1qVar2 instanceof qcy) && TextUtils.equals(((qcy) d1qVar2).f153847a, bLiveVoiceCall.f44485id));
            }
        });
        if (d1qVar != null) {
            return (qcy) d1qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public <VM extends scy> View m183435e() {
        return this.f163789a;
    }

    /* JADX INFO: renamed from: f */
    public void m183436f(ody odyVar) {
        this.f163790b = odyVar;
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f163791c = liveBaseAdapter;
        this.f163789a.m78650l0(liveBaseAdapter, odyVar);
        this.f163791c.m67371Z(new ArrayList());
    }

    /* JADX INFO: renamed from: i */
    public void m183437i(BLiveVoiceCall bLiveVoiceCall) {
        qcy qcyVarM183434d = m183434d(bLiveVoiceCall);
        if (qcyVarM183434d != null) {
            this.f163791c.m67368W(qcyVarM183434d);
            m183432c();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m183438j(BLiveVoiceCall bLiveVoiceCall) {
        m183437i(bLiveVoiceCall);
        m183441m();
        m183432c();
    }

    /* JADX INFO: renamed from: k */
    public void m183439k(List<d1q<?>> list) {
        xdl0.m208344M(this.f163789a._free_call_container, !this.f163790b.m163776x4());
        if (!vwb.m200296J(list)) {
            list.add(0, new pcy(list.size()));
        }
        this.f163791c.m67371Z(list);
        m183432c();
    }

    /* JADX INFO: renamed from: l */
    public void m183440l(boolean z) {
        this.f163789a.m78651n0(z);
    }

    /* JADX INFO: renamed from: m */
    public void m183441m() {
        if (this.f163791c.m67355J().size() > 0 && (this.f163791c.m67353H(0) instanceof pcy)) {
            pcy pcyVar = (pcy) this.f163791c.m67353H(0);
            if (this.f163791c.m67355J().size() <= 1) {
                this.f163791c.m67355J().remove(pcyVar);
                this.f163791c.notifyItemRemoved(0);
            } else {
                pcyVar.m168377I(this.f163790b.m163774t4());
                this.f163791c.notifyItemChanged(0);
            }
        }
        m183432c();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ody odyVar) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
