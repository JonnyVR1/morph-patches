package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ReportFrom;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.report.ReportAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VLinear_Dividers;
import p151v.VText;
import p153l.bnl0;
import p153l.ep90;
import p153l.ner;
import p153l.sza0;
import p153l.t3m;
import p153l.x95;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileReportItemHolder extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f34927u;

    /* JADX INFO: renamed from: v */
    public VText f34928v;

    public ProfileReportItemHolder(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: S */
    public View m54063S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sza0.m188632b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m54064T(String str, boolean z, View view) {
        CoreDlg.ProfileMenuBuildParam profileMenuBuildParam;
        HashMap map = new HashMap();
        map.put("Action", "Report");
        x95.INSTANCE.m209793m("Action on Swipe page", map);
        String string = mo53983O().mo52249J1().getArguments().getString("from_group_id");
        Handler handler = null;
        if (!mo53983O().mo53305M() || TextUtils.isEmpty(string)) {
            profileMenuBuildParam = null;
        } else {
            profileMenuBuildParam = new CoreDlg.ProfileMenuBuildParam();
            profileMenuBuildParam.reportFrom = ReportFrom.CHAT_GROUP;
            profileMenuBuildParam.reportTypeId = string;
        }
        mo53983O().act().startActivity(ReportAct.m55812c2(mo53983O().act(), str, z, new ResultReceiver(handler) { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileReportItemHolder.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    ProfileReportItemHolder.this.mo53983O().act().setResult(SwipeDirection.LEFT.getValue());
                    ProfileReportItemHolder.this.mo53983O().act().lambda$debugItems$19();
                }
            }
        }, profileMenuBuildParam));
    }

    /* JADX INFO: renamed from: U */
    public void m54065U() {
        this.f34928v.setText(String.format(mo53983O().act().getString(R$string.f19631s), mo53983O().mo52252K2().name));
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
        if (!mo53983O().mo52302m0() && NullChecker.m82486a(mo53983O().mo52252K2())) {
            boolean zMo53266G0 = mo53983O().mo53266G0(mo53983O().mo52252K2());
            String strUserId = mo53983O().userId();
            if ((!User.isTeamAccount(strUserId) && !TextUtils.equals(strUserId, CoreModule.m30929H().userId())) || !zMo53266G0) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m54063S(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        if (NullChecker.m82486a(mo53983O().mo52252K2())) {
            m54065U();
        }
        final boolean zMo53266G0 = mo53983O().mo53266G0(mo53983O().mo52252K2());
        final String strUserId = mo53983O().userId();
        bnl0.m105509E0(this.f34928v, new View.OnClickListener() { // from class: l.rza0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165504a.m54064T(strUserId, zMo53266G0, view);
            }
        });
    }
}
