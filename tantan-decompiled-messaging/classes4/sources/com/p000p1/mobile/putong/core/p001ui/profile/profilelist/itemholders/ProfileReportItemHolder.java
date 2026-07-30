package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.ReportFrom;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.report.ReportAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.mcr;
import l.ora0;
import l.w85;
import l.xdl0;
import p002l.a1m;
import p002l.ah90;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileReportItemHolder extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f1901u;

    /* JADX INFO: renamed from: v */
    public VText f1902v;

    public ProfileReportItemHolder(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: S */
    public View m3433S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ora0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m3434T(String str, boolean z, View view) {
        CoreDlg.ProfileMenuBuildParam profileMenuBuildParam;
        HashMap map = new HashMap();
        map.put("Action", "Report");
        w85.INSTANCE.m("Action on Swipe page", map);
        String string = mo3351O().mo1514J1().getArguments().getString("from_group_id");
        Handler handler = null;
        if (!mo3351O().mo2651M() || TextUtils.isEmpty(string)) {
            profileMenuBuildParam = null;
        } else {
            profileMenuBuildParam = new CoreDlg.ProfileMenuBuildParam();
            profileMenuBuildParam.reportFrom = ReportFrom.CHAT_GROUP;
            profileMenuBuildParam.reportTypeId = string;
        }
        mo3351O().act().startActivity(ReportAct.b2(mo3351O().act(), str, z, new ResultReceiver(handler) { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileReportItemHolder.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    ProfileReportItemHolder.this.mo3351O().act().setResult(SwipeDirection.LEFT.getValue());
                    ProfileReportItemHolder.this.mo3351O().act().finish();
                }
            }
        }, profileMenuBuildParam));
    }

    /* JADX INFO: renamed from: U */
    public void m3435U() {
        this.f1902v.setText(String.format(mo3351O().act().getString(R.string.s), mo3351O().mo1517K2().name));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        if (!mo3351O().mo1570m0() && NullChecker.a(mo3351O().mo1517K2())) {
            boolean zMo2612G0 = mo3351O().mo2612G0(mo3351O().mo1517K2());
            String strUserId = mo3351O().userId();
            if ((!User.isTeamAccount(strUserId) && !TextUtils.equals(strUserId, CoreModule.H().userId())) || !zMo2612G0) {
                return true;
            }
        }
        return false;
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m3433S(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        if (NullChecker.a(mo3351O().mo1517K2())) {
            m3435U();
        }
        final boolean zMo2612G0 = mo3351O().mo2612G0(mo3351O().mo1517K2());
        final String strUserId = mo3351O().userId();
        xdl0.E0(this.f1902v, new View.OnClickListener() { // from class: l.nra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16169a.m3434T(strUserId, zMo2612G0, view);
            }
        });
    }
}
