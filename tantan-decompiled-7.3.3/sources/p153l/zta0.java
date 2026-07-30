package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.profession.ProfileLoopSelectProfessionFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
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

/* JADX INFO: loaded from: classes4.dex */
public class zta0 implements iam<tta0> {

    /* JADX INFO: renamed from: a */
    public TextView f205945a;

    /* JADX INFO: renamed from: b */
    public TextView f205946b;

    /* JADX INFO: renamed from: c */
    public VFrame f205947c;

    /* JADX INFO: renamed from: d */
    public WheelPicker f205948d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f205949e;

    /* JADX INFO: renamed from: f */
    public HomeErrorNetView f205950f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopActionLayout f205951g;

    /* JADX INFO: renamed from: h */
    public final Context f205952h;

    /* JADX INFO: renamed from: i */
    public final ProfileLoopSelectProfessionFrag f205953i;

    /* JADX INFO: renamed from: j */
    public tta0 f205954j;

    /* JADX INFO: renamed from: k */
    public int f205955k = -1;

    /* JADX INFO: renamed from: l */
    public boolean f205956l = false;

    /* JADX INFO: renamed from: l.zta0$a */
    public static class C21886a {
        /* JADX INFO: renamed from: b */
        public static void m221485b(zta0 zta0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            zta0Var.f205945a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            zta0Var.f205946b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            zta0Var.f205947c = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            zta0Var.f205948d = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            zta0Var.f205949e = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            zta0Var.f205950f = (HomeErrorNetView) viewGroup.getChildAt(1);
            zta0Var.f205951g = (ProfileLoopActionLayout) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m221486c(zta0 zta0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167522L0, viewGroup, false);
            m221485b(zta0Var, viewInflate);
            return viewInflate;
        }
    }

    public zta0(Context context, ProfileLoopSelectProfessionFrag profileLoopSelectProfessionFrag) {
        this.f205952h = context;
        this.f205953i = profileLoopSelectProfessionFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m221454A(WheelPicker wheelPicker, Object obj, int i) {
        m221470E(i);
    }

    /* JADX INFO: renamed from: A3 */
    public void m221467A3(String str) {
        if (NullChecker.m82486a(str)) {
            this.f205945a.setText(str);
        }
        this.f205948d.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.uta0
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker, Object obj, int i) {
                this.f180901a.m221454A(wheelPicker, obj, i);
            }
        });
        this.f205951g.m54152l(this.f205953i);
        m221482y().m52692b2().m52731W0(this.f205953i);
        if (xra.m212787f() && this.f205953i.m52778U4()) {
            m221473H(true);
            bnl0.m105540X(this.f205945a, 0);
            String strM192426m = tr90.m192426m(this.f205953i.f34303z);
            if (TextUtils.isEmpty(strM192426m)) {
                return;
            }
            bnl0.m105524M(this.f205946b, true);
            bnl0.m105540X(this.f205947c, qa00.m175859d(27.0f));
            this.f205946b.setText(String.format("预计符合%s人的理想型", strM192426m));
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m221468B(uxj0 uxj0Var) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Profile profile = m221482y().m52692b2().m52742u0().profile;
        Studies studies = profile.studies;
        Profile profile2 = userM116600p9.profile;
        Studies studies2 = profile2.studies;
        studies.verified = studies2.verified;
        studies.school = studies2.school;
        profile.school = profile2.school;
        profile.work.active = true;
        studies.active = false;
        m221482y().progressDismiss();
        this.f205951g.m54146f();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m221469C(Throwable th) {
        m221482y().progressDismiss();
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f205952h;
    }

    /* JADX INFO: renamed from: E */
    public void m221470E(int i) {
        List<String> listM192662h0 = this.f205954j.m192662h0(i);
        if (jyb.m147479J(listM192662h0)) {
            return;
        }
        this.f205949e.setData(listM192662h0);
        if (i != this.f205955k) {
            this.f205949e.setSelectedItemPosition(0);
        } else {
            int iIndexOf = listM192662h0.indexOf(m221482y().m52692b2().m52742u0().profile.work.department);
            this.f205949e.setSelectedItemPosition(iIndexOf != -1 ? iIndexOf : 0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m221471F() {
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
            m221482y().progress(R$string.f28619R0);
            m221482y().duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.xta0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196196a.m221468B((uxj0) obj);
                }
            }, new y20() { // from class: l.yta0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201497a.m221469C((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m221472G(int i) {
        List<String> listM192661g0 = this.f205954j.m192661g0();
        boolean zM147479J = jyb.m147479J(listM192661g0);
        VFrame vFrame = this.f205947c;
        if (zM147479J) {
            bnl0.m105525M0(vFrame, false);
            return;
        }
        bnl0.m105525M0(vFrame, true);
        this.f205948d.setData(listM192661g0);
        if (i == -1) {
            i = 0;
        }
        this.f205955k = i;
        this.f205948d.setSelectedItemPosition(i);
        m221470E(this.f205955k);
    }

    /* JADX INFO: renamed from: H */
    public void m221473H(boolean z) {
        this.f205956l = z;
    }

    /* JADX INFO: renamed from: I */
    public void m221474I() {
        bnl0.m105525M0(this.f205950f, true);
        this.f205951g.m54147g();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m221475p(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public View m221475p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21886a.m221486c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tta0 tta0Var) {
        this.f205954j = tta0Var;
    }

    /* JADX INFO: renamed from: s */
    public void m221477s() {
        m221482y().dialog().m21502E0(R$string.f28708h2).m21499D(R$string.f28714i2).m21543n0(m221482y().getString(R$string.f28663a), new Runnable() { // from class: l.vta0
            @Override // java.lang.Runnable
            public final void run() {
                this.f185702a.m221483z();
            }
        }).m21559v0(m221482y().getString(R$string.f28684d2), new Runnable() { // from class: l.wta0
            @Override // java.lang.Runnable
            public final void run() {
                this.f190728a.m221471F();
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: u */
    public boolean m221478u() {
        return this.f205956l;
    }

    /* JADX INFO: renamed from: v */
    public boolean m221479v() {
        List<String> listM192661g0 = this.f205954j.m192661g0();
        String string = this.f205948d.getSelectItem().toString();
        int i = this.f205955k;
        if (i > 0 && ((listM192661g0.get(i).contains("学生") && !string.contains("学生")) || (listM192661g0.get(this.f205955k).contains("Student") && !string.contains("Student")))) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82487b(userM116600p9.settings.verification)) {
                return TEnum.equals(userM116600p9.settings.verification.studies.status, "verified");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public void m221480w(User user) {
        String string = this.f205948d.getSelectItem().toString();
        String string2 = this.f205949e.getSelectItem().toString();
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

    /* JADX INFO: renamed from: x */
    public Bundle m221481x() {
        return this.f205953i.getArguments();
    }

    /* JADX INFO: renamed from: y */
    public ProfileInfoLoopEditAct m221482y() {
        return (ProfileInfoLoopEditAct) this.f205952h;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m221483z() {
        this.f205948d.setSelectedItemPosition(this.f205955k);
        m221470E(this.f205955k);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
