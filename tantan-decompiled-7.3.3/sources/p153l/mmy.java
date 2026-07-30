package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.requestsettlein.MemberRequestSettleInView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mmy implements iam<tmy> {

    /* JADX INFO: renamed from: a */
    public final MemberRequestSettleInView f137639a;

    /* JADX INFO: renamed from: b */
    public tjy f137640b;

    /* JADX INFO: renamed from: c */
    public tmy f137641c;

    public mmy(Act act) {
        this.f137639a = MemberRequestSettleInView.m79836i0(act.inflater());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m159106b(Boolean bool) {
        m159111i();
        this.f137639a.m79841m0(bool.booleanValue());
        boolean zBooleanValue = bool.booleanValue();
        tmy tmyVar = this.f137641c;
        if (zBooleanValue) {
            tmyVar.m213811F2().MemberManagerEvent.clearTabRedPoint().mo199273j(2);
        } else {
            tmyVar.m213811F2().MemberManagerEvent.addTabRedPoint().mo199273j(2);
        }
    }

    /* JADX INFO: renamed from: c */
    public <VM extends mmy> View m159107c() {
        return this.f137639a;
    }

    /* JADX INFO: renamed from: d */
    public void m159108d(tmy tmyVar, y20<BLiveVoiceSettle> y20Var, y20<BLiveVoiceSettle> y20Var2, y20<BLiveVoiceSettle> y20Var3) {
        this.f137641c = tmyVar;
        tjy tjyVar = new tjy(tmyVar, 2, y20Var, y20Var2, y20Var3);
        this.f137640b = tjyVar;
        this.f137639a.m79839k0(tjyVar);
        this.f137640b.m191470I(new ArrayList());
    }

    /* JADX INFO: renamed from: e */
    public void m159109e(int i, List<BLiveVoiceSettle> list) {
        this.f137639a.m79840l0(i, list);
    }

    /* JADX INFO: renamed from: f */
    public void m159110f(List<BLiveVoiceSettle> list) {
        this.f137639a.setListData(list);
    }

    /* JADX INFO: renamed from: i */
    public void m159111i() {
        tjy tjyVar = this.f137640b;
        if (tjyVar == null || tjyVar.getPageCount() <= 0) {
            return;
        }
        this.f137640b.notifyItemChanged(0);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tmy tmyVar) {
    }
}
