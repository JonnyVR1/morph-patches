package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ReportFrom;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.report.ReportAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VLinear_Dividers;
import p147v.VText;
import p149l.a1m;
import p149l.ah90;
import p149l.mcr;
import p149l.ora0;
import p149l.w85;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileReportItemHolder extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f34079u;

    /* JADX INFO: renamed from: v */
    public VText f34080v;

    public ProfileReportItemHolder(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: S */
    public View m52880S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ora0.m165529b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m52881T(String str, boolean z, View view) {
        CoreDlg.ProfileMenuBuildParam profileMenuBuildParam;
        HashMap map = new HashMap();
        map.put("Action", "Report");
        w85.INSTANCE.m202145m("Action on Swipe page", map);
        String string = mo52800O().mo51066J1().getArguments().getString("from_group_id");
        Handler handler = null;
        if (!mo52800O().mo52122M() || TextUtils.isEmpty(string)) {
            profileMenuBuildParam = null;
        } else {
            profileMenuBuildParam = new CoreDlg.ProfileMenuBuildParam();
            profileMenuBuildParam.reportFrom = ReportFrom.CHAT_GROUP;
            profileMenuBuildParam.reportTypeId = string;
        }
        mo52800O().act().startActivity(ReportAct.m54629b2(mo52800O().act(), str, z, new ResultReceiver(handler) { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileReportItemHolder.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    ProfileReportItemHolder.this.mo52800O().act().setResult(SwipeDirection.LEFT.getValue());
                    ProfileReportItemHolder.this.mo52800O().act().lambda$debugItems$19();
                }
            }
        }, profileMenuBuildParam));
    }

    /* JADX INFO: renamed from: U */
    public void m52882U() {
        this.f34080v.setText(String.format(mo52800O().act().getString(R$string.f18898s), mo52800O().mo51069K2().name));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        if (!mo52800O().mo51119m0() && NullChecker.m81303a(mo52800O().mo51069K2())) {
            boolean zMo52083G0 = mo52800O().mo52083G0(mo52800O().mo51069K2());
            String strUserId = mo52800O().userId();
            if ((!User.isTeamAccount(strUserId) && !TextUtils.equals(strUserId, CoreModule.m29931H().userId())) || !zMo52083G0) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m52880S(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        if (NullChecker.m81303a(mo52800O().mo51069K2())) {
            m52882U();
        }
        final boolean zMo52083G0 = mo52800O().mo52083G0(mo52800O().mo51069K2());
        final String strUserId = mo52800O().userId();
        xdl0.m208329E0(this.f34080v, new View.OnClickListener() { // from class: l.nra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140172a.m52881T(strUserId, zMo52083G0, view);
            }
        });
    }
}
