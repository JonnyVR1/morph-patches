package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicVerificationInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class uyw extends hzw<syw> {

    /* JADX INFO: renamed from: c */
    public VRelative f181665c;

    /* JADX INFO: renamed from: d */
    public VText f181666d;

    /* JADX INFO: renamed from: e */
    public VText f181667e;

    /* JADX INFO: renamed from: f */
    public VImage f181668f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f181669g;

    /* JADX INFO: renamed from: h */
    public VImage f181670h;

    /* JADX INFO: renamed from: i */
    public TextView f181671i;

    /* JADX INFO: renamed from: j */
    public VImage f181672j;

    /* JADX INFO: renamed from: k */
    public VImage f181673k;

    /* JADX INFO: renamed from: l */
    public VText f181674l;

    /* JADX INFO: renamed from: m */
    public syw f181675m;

    public uyw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m198713m(View view) {
        PicVerificationInfo picVerificationInfo;
        VerificationCenter verificationCenter = this.f181675m.f171322a;
        if (verificationCenter == null || (picVerificationInfo = verificationCenter.picVerificationInfo) == null) {
            return;
        }
        StudentVerificationStatus studentVerificationStatus = picVerificationInfo.status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            act().m48637b2().f74685k.performClick();
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            gta.m132210e().m132214d().mo34757U8(act());
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            act().m48637b2().f74685k.performClick();
        } else {
            gta.m132210e().m132214d().mo34682Eg(act());
        }
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return true;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(MarrySeriesType marrySeriesType, User user) {
        this.f181666d.setTypeface(lyh0.m156283c(3), 1);
        this.f181666d.setText(marrySeriesType.getTitleName());
        this.f181674l.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(this.f181674l, new View.OnClickListener() { // from class: l.tyw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176716a.m198713m(view);
            }
        });
        uqb0.f180374G.m127115L0(this.f181669g, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle().formatted());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m198714k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m198714k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vyw.m204043b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(syw sywVar) {
        this.f181675m = sywVar;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
    }
}
