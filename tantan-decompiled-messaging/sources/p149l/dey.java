package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberSettleInPageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class dey implements s7m<key> {

    /* JADX INFO: renamed from: a */
    public final MemberSettleInPageView f85866a;

    /* JADX INFO: renamed from: b */
    public way f85867b;

    /* JADX INFO: renamed from: c */
    public List<BLiveVoiceSettle> f85868c;

    public dey(Act act) {
        this.f85866a = MemberSettleInPageView.m78676i0(act.inflater());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public <VM extends dey> View m111405c() {
        return this.f85866a;
    }

    /* JADX INFO: renamed from: d */
    public void m111406d(key keyVar, e30<BLiveVoiceSettle> e30Var, e30<BLiveVoiceSettle> e30Var2, e30<BLiveVoiceSettle> e30Var3) {
        way wayVar = new way(keyVar, 1, e30Var, e30Var2, e30Var3);
        this.f85867b = wayVar;
        this.f85866a.m78679k0(wayVar);
        this.f85867b.m202480I(new ArrayList());
    }

    /* JADX INFO: renamed from: e */
    public void m111407e(List<BLiveVoiceSettle> list) {
        this.f85868c = list;
        this.f85866a.setListData(list);
    }

    /* JADX INFO: renamed from: f */
    public void m111408f(final BLiveVoiceSettle bLiveVoiceSettle) {
        if (this.f85867b == null || bLiveVoiceSettle == null) {
            return;
        }
        this.f85867b.notifyItemChanged(vwb.m200301O(this.f85868c, new w9j() { // from class: l.cey
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceSettle) obj).userId.equals(bLiveVoiceSettle.userId));
            }
        }));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(key keyVar) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
