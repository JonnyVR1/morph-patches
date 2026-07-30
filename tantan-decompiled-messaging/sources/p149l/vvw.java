package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicVerificationInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class vvw extends iww<tvw> {

    /* JADX INFO: renamed from: c */
    public VRelative f183261c;

    /* JADX INFO: renamed from: d */
    public VText f183262d;

    /* JADX INFO: renamed from: e */
    public VText f183263e;

    /* JADX INFO: renamed from: f */
    public VImage f183264f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f183265g;

    /* JADX INFO: renamed from: h */
    public VImage f183266h;

    /* JADX INFO: renamed from: i */
    public TextView f183267i;

    /* JADX INFO: renamed from: j */
    public VImage f183268j;

    /* JADX INFO: renamed from: k */
    public VImage f183269k;

    /* JADX INFO: renamed from: l */
    public VText f183270l;

    /* JADX INFO: renamed from: m */
    public tvw f183271m;

    public vvw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m200209m(View view) {
        PicVerificationInfo picVerificationInfo;
        VerificationCenter verificationCenter = this.f183271m.f172347a;
        if (verificationCenter == null || (picVerificationInfo = verificationCenter.picVerificationInfo) == null) {
            return;
        }
        StudentVerificationStatus studentVerificationStatus = picVerificationInfo.status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            act().m47454a2().f83131k.performClick();
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            ura.m195053e().m195057d().mo33754U8(act());
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            act().m47454a2().f83131k.performClick();
        } else {
            ura.m195053e().m195057d().mo33679Eg(act());
        }
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return true;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(MarrySeriesType marrySeriesType, User user) {
        this.f183262d.setTypeface(eqh0.m117752c(3), 1);
        this.f183262d.setText(marrySeriesType.getTitleName());
        this.f183270l.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(this.f183270l, new View.OnClickListener() { // from class: l.uvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178566a.m200209m(view);
            }
        });
        qib0.f154691G.m102331L0(this.f183265g, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle().formatted());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m200210k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m200210k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wvw.m205783b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tvw tvwVar) {
        this.f183271m = tvwVar;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
    }
}
