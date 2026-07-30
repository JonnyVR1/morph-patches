package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.requestsettlein.MemberRequestSettleInView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pdy implements s7m<wdy> {

    /* JADX INFO: renamed from: a */
    public final MemberRequestSettleInView f18502a;

    /* JADX INFO: renamed from: b */
    public way f18503b;

    /* JADX INFO: renamed from: c */
    public wdy f18504c;

    public pdy(Act act) {
        this.f18502a = MemberRequestSettleInView.m8869i0(act.inflater());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20177C0() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m20179b(Boolean bool) {
        m20184i();
        this.f18502a.m8874m0(bool.booleanValue());
        boolean zBooleanValue = bool.booleanValue();
        wdy wdyVar = this.f18504c;
        if (zBooleanValue) {
            wdyVar.F2().MemberManagerEvent.clearTabRedPoint().j(2);
        } else {
            wdyVar.F2().MemberManagerEvent.addTabRedPoint().j(2);
        }
    }

    /* JADX INFO: renamed from: c */
    public <VM extends pdy> View m20180c() {
        return this.f18502a;
    }

    /* JADX INFO: renamed from: d */
    public void m20181d(wdy wdyVar, e30<BLiveVoiceSettle> e30Var, e30<BLiveVoiceSettle> e30Var2, e30<BLiveVoiceSettle> e30Var3) {
        this.f18504c = wdyVar;
        way wayVar = new way(wdyVar, 2, e30Var, e30Var2, e30Var3);
        this.f18503b = wayVar;
        this.f18502a.m8872k0(wayVar);
        this.f18503b.m24041I(new ArrayList());
    }

    /* JADX INFO: renamed from: e */
    public void m20182e(int i, List<BLiveVoiceSettle> list) {
        this.f18502a.m8873l0(i, list);
    }

    /* JADX INFO: renamed from: f */
    public void m20183f(List<BLiveVoiceSettle> list) {
        this.f18502a.setListData(list);
    }

    /* JADX INFO: renamed from: i */
    public void m20184i() {
        way wayVar = this.f18503b;
        if (wayVar == null || wayVar.m24035C() <= 0) {
            return;
        }
        this.f18503b.notifyItemChanged(0);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m20185i1(wdy wdyVar) {
    }

    public void destroy() {
    }
}
