package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PicVerificationInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.qib0;
import l.ura;
import l.wvw;
import l.xdl0;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vvw extends iww<tvw> {

    /* JADX INFO: renamed from: c */
    public VRelative f8433c;

    /* JADX INFO: renamed from: d */
    public VText f8434d;

    /* JADX INFO: renamed from: e */
    public VText f8435e;

    /* JADX INFO: renamed from: f */
    public VImage f8436f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f8437g;

    /* JADX INFO: renamed from: h */
    public VImage f8438h;

    /* JADX INFO: renamed from: i */
    public TextView f8439i;

    /* JADX INFO: renamed from: j */
    public VImage f8440j;

    /* JADX INFO: renamed from: k */
    public VImage f8441k;

    /* JADX INFO: renamed from: l */
    public VText f8442l;

    /* JADX INFO: renamed from: m */
    public tvw f8443m;

    public vvw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m8412m(View view) {
        PicVerificationInfo picVerificationInfo;
        VerificationCenter verificationCenter = this.f8443m.f7806a;
        if (verificationCenter == null || (picVerificationInfo = verificationCenter.picVerificationInfo) == null) {
            return;
        }
        StudentVerificationStatus studentVerificationStatus = picVerificationInfo.status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            act().m501a2().f2884k.performClick();
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            ura.e().d().U8(act());
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            act().m501a2().f2884k.performClick();
        } else {
            ura.e().d().Eg(act());
        }
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return true;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(MarrySeriesType marrySeriesType, User user) {
        this.f8434d.setTypeface(eqh0.m3924c(3), 1);
        this.f8434d.setText(marrySeriesType.getTitleName());
        this.f8442l.setTypeface(eqh0.m3924c(3), 1);
        xdl0.E0(this.f8442l, new View.OnClickListener() { // from class: l.uvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8107a.m8412m(view);
            }
        });
        qib0.G.L0(this.f8437g, CoreModule.c.e0.p9().fp().profileMiddle().formatted());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8414k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m8414k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wvw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m8413i1(tvw tvwVar) {
        this.f8443m = tvwVar;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
    }
}
