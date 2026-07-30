package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.requestsettlein.MemberRequestSettleInView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class pdy implements s7m<wdy> {

    /* JADX INFO: renamed from: a */
    public final MemberRequestSettleInView f148378a;

    /* JADX INFO: renamed from: b */
    public way f148379b;

    /* JADX INFO: renamed from: c */
    public wdy f148380c;

    public pdy(Act act) {
        this.f148378a = MemberRequestSettleInView.m78653i0(act.inflater());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m168445b(Boolean bool) {
        m168450i();
        this.f148378a.m78658m0(bool.booleanValue());
        boolean zBooleanValue = bool.booleanValue();
        wdy wdyVar = this.f148380c;
        if (zBooleanValue) {
            wdyVar.m206028F2().MemberManagerEvent.clearTabRedPoint().mo172463j(2);
        } else {
            wdyVar.m206028F2().MemberManagerEvent.addTabRedPoint().mo172463j(2);
        }
    }

    /* JADX INFO: renamed from: c */
    public <VM extends pdy> View m168446c() {
        return this.f148378a;
    }

    /* JADX INFO: renamed from: d */
    public void m168447d(wdy wdyVar, e30<BLiveVoiceSettle> e30Var, e30<BLiveVoiceSettle> e30Var2, e30<BLiveVoiceSettle> e30Var3) {
        this.f148380c = wdyVar;
        way wayVar = new way(wdyVar, 2, e30Var, e30Var2, e30Var3);
        this.f148379b = wayVar;
        this.f148378a.m78656k0(wayVar);
        this.f148379b.m202480I(new ArrayList());
    }

    /* JADX INFO: renamed from: e */
    public void m168448e(int i, List<BLiveVoiceSettle> list) {
        this.f148378a.m78657l0(i, list);
    }

    /* JADX INFO: renamed from: f */
    public void m168449f(List<BLiveVoiceSettle> list) {
        this.f148378a.setListData(list);
    }

    /* JADX INFO: renamed from: i */
    public void m168450i() {
        way wayVar = this.f148379b;
        if (wayVar == null || wayVar.getPageCount() <= 0) {
            return;
        }
        this.f148379b.notifyItemChanged(0);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wdy wdyVar) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
