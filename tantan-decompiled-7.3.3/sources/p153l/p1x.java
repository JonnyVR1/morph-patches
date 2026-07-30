package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.profession.MarryEditProfileProfessionFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.SearchPriority;
import com.p051p1.mobile.putong.data.StudentVerification;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Work;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;

/* JADX INFO: loaded from: classes3.dex */
public class p1x extends hzw<j1x> {

    /* JADX INFO: renamed from: c */
    public TextView f150217c;

    /* JADX INFO: renamed from: d */
    public VFrame f150218d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f150219e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f150220f;

    /* JADX INFO: renamed from: g */
    public j1x f150221g;

    /* JADX INFO: renamed from: h */
    public int f150222h;

    /* JADX INFO: renamed from: l.p1x$a */
    public static class C19273a {
        /* JADX INFO: renamed from: b */
        public static void m170317b(p1x p1xVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            p1xVar.f150217c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            p1xVar.f150218d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            p1xVar.f150219e = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            p1xVar.f150220f = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m170318c(p1x p1xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167558c0, viewGroup, false);
            m170317b(p1xVar, viewInflate);
            return viewInflate;
        }
    }

    public p1x(Act act, MarryEditProfileProfessionFrag marryEditProfileProfessionFrag) {
        super(act, marryEditProfileProfessionFrag);
        this.f150222h = -1;
    }

    /* JADX INFO: renamed from: y */
    private boolean m170303y() {
        List<String> listM143157l0 = this.f150221g.m143157l0();
        String string = this.f150219e.getSelectItem().toString();
        int i = this.f150222h;
        if (i > 0 && ((listM143157l0.get(i).contains("学生") && !string.contains("学生")) || (listM143157l0.get(this.f150222h).contains("Student") && !string.contains("Student")))) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82487b(userM116600p9.settings.verification)) {
                return TEnum.equals(userM116600p9.settings.verification.studies.status, "verified");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m170304A(User user) {
        this.f150219e.setSelectedItemPosition(this.f150222h);
        m170309G(user, this.f150222h);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m170306C(User user, WheelPicker wheelPicker, Object obj, int i) {
        m170309G(user, i);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m170307E(User user, uxj0 uxj0Var) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Profile profile = user.profile;
        Studies studies = profile.studies;
        Profile profile2 = userM116600p9.profile;
        Studies studies2 = profile2.studies;
        studies.verified = studies2.verified;
        studies.school = studies2.school;
        profile.school = profile2.school;
        profile.work.active = true;
        studies.active = false;
        m170315z().progressDismiss();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m170308F(Throwable th) {
        m170315z().progressDismiss();
    }

    /* JADX INFO: renamed from: G */
    public void m170309G(User user, int i) {
        List<String> listM143158m0 = this.f150221g.m143158m0(i);
        if (jyb.m147479J(listM143158m0)) {
            return;
        }
        this.f150220f.setData(listM143158m0);
        if (i != this.f150222h) {
            this.f150220f.setSelectedItemPosition(0);
        } else {
            int iIndexOf = listM143158m0.indexOf(user.profile.work.department);
            this.f150220f.setSelectedItemPosition(iIndexOf != -1 ? iIndexOf : 0);
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void m170305B(final User user) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userMo225055clone = userM116600p9.mo225055clone();
        if (NullChecker.m82486a(userMo225055clone.settings)) {
            StudentVerification studentVerification = userMo225055clone.settings.verification.studies;
            studentVerification.school = "";
            studentVerification.status = StudentVerificationStatus.get("default");
            if (NullChecker.m82487b(userMo225055clone.settings.getSearchPriority())) {
                userMo225055clone.settings.getSearchPriority().remove(SearchPriority.get("student"));
            }
        }
        User userSubtract = userMo225055clone.subtract(userM116600p9);
        if (NullChecker.m82486a(userSubtract)) {
            m170315z().progress(R$string.f28619R0);
            m170315z().duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.n1x
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139797a.m170307E(user, (uxj0) obj);
                }
            }, new y20() { // from class: l.o1x
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144695a.m170308F((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m170311I(User user, int i) {
        List<String> listM143157l0 = this.f150221g.m143157l0();
        boolean zM147479J = jyb.m147479J(listM143157l0);
        VFrame vFrame = this.f150218d;
        if (zM147479J) {
            bnl0.m105525M0(vFrame, false);
            return;
        }
        bnl0.m105525M0(vFrame, true);
        this.f150219e.setData(listM143157l0);
        if (i == -1) {
            i = 0;
        }
        this.f150222h = i;
        this.f150219e.setSelectedItemPosition(i);
        m170309G(user, this.f150222h);
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: b */
    public boolean mo95575b(MarrySeriesType marrySeriesType, User user) {
        if (!m170303y()) {
            return true;
        }
        m170314x(user);
        return false;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f150219e.getSelectItem().toString());
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        String string = this.f150219e.getSelectItem().toString();
        String string2 = this.f150220f.getSelectItem().toString();
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

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(MarrySeriesType marrySeriesType, final User user) {
        this.f150217c.setTypeface(lyh0.m156283c(3), 1);
        this.f150217c.setText(marrySeriesType.getTitleName());
        this.f150219e.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.k1x
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker, Object obj, int i) {
                this.f123552a.m170306C(user, wheelPicker, obj, i);
            }
        });
        List<String> listM143157l0 = this.f150221g.m143157l0();
        if (jyb.m147479J(listM143157l0)) {
            return;
        }
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = act().getString(R$string.f28616Q2);
        }
        if (TextUtils.isEmpty(string)) {
            m170311I(user, -1);
            return;
        }
        int iIndexOf = listM143157l0.indexOf(string);
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        m170311I(user, iIndexOf);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m170312v(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public View m170312v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19273a.m170318c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(j1x j1xVar) {
        this.f150221g = j1xVar;
    }

    /* JADX INFO: renamed from: x */
    public final void m170314x(final User user) {
        m170315z().dialog().m21502E0(R$string.f28708h2).m21499D(R$string.f28714i2).m21543n0(m170315z().getString(R$string.f28663a), new Runnable() { // from class: l.l1x
            @Override // java.lang.Runnable
            public final void run() {
                this.f129727a.m170304A(user);
            }
        }).m21559v0(m170315z().getString(R$string.f28684d2), new Runnable() { // from class: l.m1x
            @Override // java.lang.Runnable
            public final void run() {
                this.f134478a.m170305B(user);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: z */
    public final MarryEditProfileSeriesAct m170315z() {
        return act();
    }
}
