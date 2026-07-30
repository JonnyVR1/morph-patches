package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.profession.MarryEditProfileProfessionFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.SearchPriority;
import com.p046p1.mobile.putong.data.StudentVerification;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Work;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;

/* JADX INFO: loaded from: classes3.dex */
public class qyw extends iww<kyw> {

    /* JADX INFO: renamed from: c */
    public TextView f156970c;

    /* JADX INFO: renamed from: d */
    public VFrame f156971d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f156972e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f156973f;

    /* JADX INFO: renamed from: g */
    public kyw f156974g;

    /* JADX INFO: renamed from: h */
    public int f156975h;

    /* JADX INFO: renamed from: l.qyw$a */
    public static class C19609a {
        /* JADX INFO: renamed from: b */
        public static void m177106b(qyw qywVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            qywVar.f156970c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            qywVar.f156971d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            qywVar.f156972e = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            qywVar.f156973f = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m177107c(qyw qywVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137344c0, viewGroup, false);
            m177106b(qywVar, viewInflate);
            return viewInflate;
        }
    }

    public qyw(Act act, MarryEditProfileProfessionFrag marryEditProfileProfessionFrag) {
        super(act, marryEditProfileProfessionFrag);
        this.f156975h = -1;
    }

    /* JADX INFO: renamed from: y */
    private boolean m177092y() {
        List<String> listM147904l0 = this.f156974g.m147904l0();
        String string = this.f156972e.getSelectItem().toString();
        int i = this.f156975h;
        if (i > 0 && ((listM147904l0.get(i).contains("学生") && !string.contains("学生")) || (listM147904l0.get(this.f156975h).contains("Student") && !string.contains("Student")))) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9.settings) && NullChecker.m81304b(userM169527p9.settings.verification)) {
                return TEnum.equals(userM169527p9.settings.verification.studies.status, "verified");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m177093A(User user) {
        this.f156972e.setSelectedItemPosition(this.f156975h);
        m177098G(user, this.f156975h);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m177095C(User user, WheelPicker wheelPicker, Object obj, int i) {
        m177098G(user, i);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m177096E(User user, roj0 roj0Var) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Profile profile = user.profile;
        Studies studies = profile.studies;
        Profile profile2 = userM169527p9.profile;
        Studies studies2 = profile2.studies;
        studies.verified = studies2.verified;
        studies.school = studies2.school;
        profile.school = profile2.school;
        profile.work.active = true;
        studies.active = false;
        m177104z().progressDismiss();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m177097F(Throwable th) {
        m177104z().progressDismiss();
    }

    /* JADX INFO: renamed from: G */
    public void m177098G(User user, int i) {
        List<String> listM147905m0 = this.f156974g.m147905m0(i);
        if (vwb.m200296J(listM147905m0)) {
            return;
        }
        this.f156973f.setData(listM147905m0);
        if (i != this.f156975h) {
            this.f156973f.setSelectedItemPosition(0);
        } else {
            int iIndexOf = listM147905m0.indexOf(user.profile.work.department);
            this.f156973f.setSelectedItemPosition(iIndexOf != -1 ? iIndexOf : 0);
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void m177094B(final User user) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userMo223809clone = userM169527p9.mo223809clone();
        if (NullChecker.m81303a(userMo223809clone.settings)) {
            StudentVerification studentVerification = userMo223809clone.settings.verification.studies;
            studentVerification.school = "";
            studentVerification.status = StudentVerificationStatus.get("default");
            if (NullChecker.m81304b(userMo223809clone.settings.getSearchPriority())) {
                userMo223809clone.settings.getSearchPriority().remove(SearchPriority.get("student"));
            }
        }
        User userSubtract = userMo223809clone.subtract(userM169527p9);
        if (NullChecker.m81303a(userSubtract)) {
            m177104z().progress(R$string.f27771R0);
            m177104z().duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.oyw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146367a.m177096E(user, (roj0) obj);
                }
            }, new e30() { // from class: l.pyw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f151907a.m177097F((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m177100I(User user, int i) {
        List<String> listM147904l0 = this.f156974g.m147904l0();
        boolean zM200296J = vwb.m200296J(listM147904l0);
        VFrame vFrame = this.f156971d;
        if (zM200296J) {
            xdl0.m208345M0(vFrame, false);
            return;
        }
        xdl0.m208345M0(vFrame, true);
        this.f156972e.setData(listM147904l0);
        if (i == -1) {
            i = 0;
        }
        this.f156975h = i;
        this.f156972e.setSelectedItemPosition(i);
        m177098G(user, this.f156975h);
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: b */
    public boolean mo104515b(MarrySeriesType marrySeriesType, User user) {
        if (!m177092y()) {
            return true;
        }
        m177103x(user);
        return false;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f156972e.getSelectItem().toString());
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        String string = this.f156972e.getSelectItem().toString();
        String string2 = this.f156973f.getSelectItem().toString();
        user.profile.work.industry = "暂不透露".equals(string) ? "" : string;
        if (string.contains("学生") || string.contains("Student")) {
            Profile profile = user.profile;
            profile.studies.active = true;
            profile.work.active = false;
            return;
        }
        Profile profile2 = user.profile;
        profile2.studies.active = false;
        Work work = profile2.work;
        work.active = true;
        if ("暂不透露".equals(string2)) {
            string2 = "";
        }
        work.department = string2;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(MarrySeriesType marrySeriesType, final User user) {
        this.f156970c.setTypeface(eqh0.m117752c(3), 1);
        this.f156970c.setText(marrySeriesType.getTitleName());
        this.f156972e.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.lyw
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker, Object obj, int i) {
                this.f130611a.m177095C(user, wheelPicker, obj, i);
            }
        });
        List<String> listM147904l0 = this.f156974g.m147904l0();
        if (vwb.m200296J(listM147904l0)) {
            return;
        }
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = act().getString(R$string.f27768Q2);
        }
        if (TextUtils.isEmpty(string)) {
            m177100I(user, -1);
            return;
        }
        int iIndexOf = listM147904l0.indexOf(string);
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        m177100I(user, iIndexOf);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m177101v(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public View m177101v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19609a.m177107c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(kyw kywVar) {
        this.f156974g = kywVar;
    }

    /* JADX INFO: renamed from: x */
    public final void m177103x(final User user) {
        m177104z().dialog().m20503E0(R$string.f27860h2).m20500D(R$string.f27866i2).m20544n0(m177104z().getString(R$string.f27815a), new Runnable() { // from class: l.myw
            @Override // java.lang.Runnable
            public final void run() {
                this.f136335a.m177093A(user);
            }
        }).m20560v0(m177104z().getString(R$string.f27836d2), new Runnable() { // from class: l.nyw
            @Override // java.lang.Runnable
            public final void run() {
                this.f141167a.m177094B(user);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: z */
    public final MarryEditProfileSeriesAct m177104z() {
        return act();
    }
}
