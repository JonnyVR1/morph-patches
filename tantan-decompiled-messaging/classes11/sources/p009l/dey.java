package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberSettleInPageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.s7m;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dey implements s7m<key> {

    /* JADX INFO: renamed from: a */
    public final MemberSettleInPageView f11811a;

    /* JADX INFO: renamed from: b */
    public way f11812b;

    /* JADX INFO: renamed from: c */
    public List<BLiveVoiceSettle> f11813c;

    public dey(Act act) {
        this.f11811a = MemberSettleInPageView.m8892i0(act.inflater());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13294C0() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public <VM extends dey> View m13296c() {
        return this.f11811a;
    }

    /* JADX INFO: renamed from: d */
    public void m13297d(key keyVar, e30<BLiveVoiceSettle> e30Var, e30<BLiveVoiceSettle> e30Var2, e30<BLiveVoiceSettle> e30Var3) {
        way wayVar = new way(keyVar, 1, e30Var, e30Var2, e30Var3);
        this.f11812b = wayVar;
        this.f11811a.m8895k0(wayVar);
        this.f11812b.m24041I(new ArrayList());
    }

    /* JADX INFO: renamed from: e */
    public void m13298e(List<BLiveVoiceSettle> list) {
        this.f11813c = list;
        this.f11811a.setListData(list);
    }

    /* JADX INFO: renamed from: f */
    public void m13299f(final BLiveVoiceSettle bLiveVoiceSettle) {
        if (this.f11812b == null || bLiveVoiceSettle == null) {
            return;
        }
        this.f11812b.notifyItemChanged(vwb.O(this.f11813c, new w9j() { // from class: l.cey
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceSettle) obj).userId.equals(bLiveVoiceSettle.userId));
            }
        }));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m13300i1(key keyVar) {
    }

    public void destroy() {
    }
}
