package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberSettleInPageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class any implements iam<hny> {

    /* JADX INFO: renamed from: a */
    public final MemberSettleInPageView f72398a;

    /* JADX INFO: renamed from: b */
    public tjy f72399b;

    /* JADX INFO: renamed from: c */
    public List<BLiveVoiceSettle> f72400c;

    public any(Act act) {
        this.f72398a = MemberSettleInPageView.m79859i0(act.inflater());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public <VM extends any> View m99043c() {
        return this.f72398a;
    }

    /* JADX INFO: renamed from: d */
    public void m99044d(hny hnyVar, y20<BLiveVoiceSettle> y20Var, y20<BLiveVoiceSettle> y20Var2, y20<BLiveVoiceSettle> y20Var3) {
        tjy tjyVar = new tjy(hnyVar, 1, y20Var, y20Var2, y20Var3);
        this.f72399b = tjyVar;
        this.f72398a.m79862k0(tjyVar);
        this.f72399b.m191470I(new ArrayList());
    }

    /* JADX INFO: renamed from: e */
    public void m99045e(List<BLiveVoiceSettle> list) {
        this.f72400c = list;
        this.f72398a.setListData(list);
    }

    /* JADX INFO: renamed from: f */
    public void m99046f(final BLiveVoiceSettle bLiveVoiceSettle) {
        if (this.f72399b == null || bLiveVoiceSettle == null) {
            return;
        }
        this.f72399b.notifyItemChanged(jyb.m147484O(this.f72400c, new qcj() { // from class: l.zmy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceSettle) obj).userId.equals(bLiveVoiceSettle.userId));
            }
        }));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hny hnyVar) {
    }
}
