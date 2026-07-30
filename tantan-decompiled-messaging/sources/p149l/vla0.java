package p149l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.profession.ProfileLoopSelectProfessionFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
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

/* JADX INFO: loaded from: classes4.dex */
public class vla0 implements s7m<pla0> {

    /* JADX INFO: renamed from: a */
    public TextView f181926a;

    /* JADX INFO: renamed from: b */
    public TextView f181927b;

    /* JADX INFO: renamed from: c */
    public VFrame f181928c;

    /* JADX INFO: renamed from: d */
    public WheelPicker f181929d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f181930e;

    /* JADX INFO: renamed from: f */
    public HomeErrorNetView f181931f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopActionLayout f181932g;

    /* JADX INFO: renamed from: h */
    public final Context f181933h;

    /* JADX INFO: renamed from: i */
    public final ProfileLoopSelectProfessionFrag f181934i;

    /* JADX INFO: renamed from: j */
    public pla0 f181935j;

    /* JADX INFO: renamed from: k */
    public int f181936k = -1;

    /* JADX INFO: renamed from: l */
    public boolean f181937l = false;

    /* JADX INFO: renamed from: l.vla0$a */
    public static class C20658a {
        /* JADX INFO: renamed from: b */
        public static void m198793b(vla0 vla0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            vla0Var.f181926a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            vla0Var.f181927b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            vla0Var.f181928c = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            vla0Var.f181929d = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            vla0Var.f181930e = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            vla0Var.f181931f = (HomeErrorNetView) viewGroup.getChildAt(1);
            vla0Var.f181932g = (ProfileLoopActionLayout) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m198794c(vla0 vla0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137308L0, viewGroup, false);
            m198793b(vla0Var, viewInflate);
            return viewInflate;
        }
    }

    public vla0(Context context, ProfileLoopSelectProfessionFrag profileLoopSelectProfessionFrag) {
        this.f181933h = context;
        this.f181934i = profileLoopSelectProfessionFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m198762A(WheelPicker wheelPicker, Object obj, int i) {
        m198778E(i);
    }

    /* JADX INFO: renamed from: A3 */
    public void m198775A3(String str) {
        if (NullChecker.m81303a(str)) {
            this.f181926a.setText(str);
        }
        this.f181929d.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.qla0
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker, Object obj, int i) {
                this.f155203a.m198762A(wheelPicker, obj, i);
            }
        });
        this.f181932g.m52969l(this.f181934i);
        m198790y().m51509a2().m51548W0(this.f181934i);
        if (lqa.m150968f() && this.f181934i.m51595U4()) {
            m198781H(true);
            xdl0.m208360X(this.f181926a, 0);
            String strM169801m = pj90.m169801m(this.f181934i.f33455z);
            if (TextUtils.isEmpty(strM169801m)) {
                return;
            }
            xdl0.m208344M(this.f181927b, true);
            xdl0.m208360X(this.f181928c, t100.m186890d(27.0f));
            this.f181927b.setText(String.format("预计符合%s人的理想型", strM169801m));
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m198776B(roj0 roj0Var) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Profile profile = m198790y().m51509a2().m51559u0().profile;
        Studies studies = profile.studies;
        Profile profile2 = userM169527p9.profile;
        Studies studies2 = profile2.studies;
        studies.verified = studies2.verified;
        studies.school = studies2.school;
        profile.school = profile2.school;
        profile.work.active = true;
        studies.active = false;
        m198790y().progressDismiss();
        this.f181932g.m52963f();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m198777C(Throwable th) {
        m198790y().progressDismiss();
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f181933h;
    }

    /* JADX INFO: renamed from: E */
    public void m198778E(int i) {
        List<String> listM170117h0 = this.f181935j.m170117h0(i);
        if (vwb.m200296J(listM170117h0)) {
            return;
        }
        this.f181930e.setData(listM170117h0);
        if (i != this.f181936k) {
            this.f181930e.setSelectedItemPosition(0);
        } else {
            int iIndexOf = listM170117h0.indexOf(m198790y().m51509a2().m51559u0().profile.work.department);
            this.f181930e.setSelectedItemPosition(iIndexOf != -1 ? iIndexOf : 0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m198779F() {
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
            m198790y().progress(R$string.f27771R0);
            m198790y().duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.tla0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171010a.m198776B((roj0) obj);
                }
            }, new e30() { // from class: l.ula0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177026a.m198777C((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m198780G(int i) {
        List<String> listM170116g0 = this.f181935j.m170116g0();
        boolean zM200296J = vwb.m200296J(listM170116g0);
        VFrame vFrame = this.f181928c;
        if (zM200296J) {
            xdl0.m208345M0(vFrame, false);
            return;
        }
        xdl0.m208345M0(vFrame, true);
        this.f181929d.setData(listM170116g0);
        if (i == -1) {
            i = 0;
        }
        this.f181936k = i;
        this.f181929d.setSelectedItemPosition(i);
        m198778E(this.f181936k);
    }

    /* JADX INFO: renamed from: H */
    public void m198781H(boolean z) {
        this.f181937l = z;
    }

    /* JADX INFO: renamed from: I */
    public void m198782I() {
        xdl0.m208345M0(this.f181931f, true);
        this.f181932g.m52964g();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m198783p(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public View m198783p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20658a.m198794c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pla0 pla0Var) {
        this.f181935j = pla0Var;
    }

    /* JADX INFO: renamed from: s */
    public void m198785s() {
        m198790y().dialog().m20503E0(R$string.f27860h2).m20500D(R$string.f27866i2).m20544n0(m198790y().getString(R$string.f27815a), new Runnable() { // from class: l.rla0
            @Override // java.lang.Runnable
            public final void run() {
                this.f159940a.m198791z();
            }
        }).m20560v0(m198790y().getString(R$string.f27836d2), new Runnable() { // from class: l.sla0
            @Override // java.lang.Runnable
            public final void run() {
                this.f165148a.m198779F();
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: u */
    public boolean m198786u() {
        return this.f181937l;
    }

    /* JADX INFO: renamed from: v */
    public boolean m198787v() {
        List<String> listM170116g0 = this.f181935j.m170116g0();
        String string = this.f181929d.getSelectItem().toString();
        int i = this.f181936k;
        if (i > 0 && ((listM170116g0.get(i).contains("学生") && !string.contains("学生")) || (listM170116g0.get(this.f181936k).contains("Student") && !string.contains("Student")))) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9.settings) && NullChecker.m81304b(userM169527p9.settings.verification)) {
                return TEnum.equals(userM169527p9.settings.verification.studies.status, "verified");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public void m198788w(User user) {
        String string = this.f181929d.getSelectItem().toString();
        String string2 = this.f181930e.getSelectItem().toString();
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
    public Bundle m198789x() {
        return this.f181934i.getArguments();
    }

    /* JADX INFO: renamed from: y */
    public ProfileInfoLoopEditAct m198790y() {
        return (ProfileInfoLoopEditAct) this.f181933h;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m198791z() {
        this.f181929d.setSelectedItemPosition(this.f181936k);
        m198778E(this.f181936k);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
