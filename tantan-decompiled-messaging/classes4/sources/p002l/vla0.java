package p002l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.profession.ProfileLoopSelectProfessionFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.SearchPriority;
import com.p1.mobile.putong.data.StudentVerification;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Work;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.lqa;
import l.mkd0;
import l.n6c0;
import l.pj90;
import l.roj0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vla0 implements s7m<pla0> {

    /* JADX INFO: renamed from: a */
    public TextView f21204a;

    /* JADX INFO: renamed from: b */
    public TextView f21205b;

    /* JADX INFO: renamed from: c */
    public VFrame f21206c;

    /* JADX INFO: renamed from: d */
    public WheelPicker f21207d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f21208e;

    /* JADX INFO: renamed from: f */
    public HomeErrorNetView f21209f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopActionLayout f21210g;

    /* JADX INFO: renamed from: h */
    public final Context f21211h;

    /* JADX INFO: renamed from: i */
    public final ProfileLoopSelectProfessionFrag f21212i;

    /* JADX INFO: renamed from: j */
    public pla0 f21213j;

    /* JADX INFO: renamed from: k */
    public int f21214k = -1;

    /* JADX INFO: renamed from: l */
    public boolean f21215l = false;

    /* JADX INFO: renamed from: l.vla0$a */
    public static class C0865a {
        /* JADX INFO: renamed from: b */
        public static void m24055b(vla0 vla0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            vla0Var.f21204a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            vla0Var.f21205b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            vla0Var.f21206c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            vla0Var.f21207d = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            vla0Var.f21208e = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            vla0Var.f21209f = viewGroup.getChildAt(1);
            vla0Var.f21210g = (ProfileLoopActionLayout) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m24056c(vla0 vla0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.L0, viewGroup, false);
            m24055b(vla0Var, viewInflate);
            return viewInflate;
        }
    }

    public vla0(Context context, ProfileLoopSelectProfessionFrag profileLoopSelectProfessionFrag) {
        this.f21211h = context;
        this.f21212i = profileLoopSelectProfessionFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m24022A(WheelPicker wheelPicker, Object obj, int i) {
        m24039E(i);
    }

    /* JADX INFO: renamed from: A3 */
    public void m24035A3(String str) {
        if (NullChecker.a(str)) {
            this.f21204a.setText(str);
        }
        this.f21207d.setOnItemSelectedListener(new WheelPicker.InterfaceC0174a() { // from class: l.qla0
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker.InterfaceC0174a
            /* JADX INFO: renamed from: a */
            public final void mo3621a(WheelPicker wheelPicker, Object obj, int i) {
                this.f18081a.m24022A(wheelPicker, obj, i);
            }
        });
        this.f21210g.m3527l(this.f21212i);
        m24052y().m1991a2().m2030W0(this.f21212i);
        if (lqa.f() && this.f21212i.m2081U4()) {
            m24042H(true);
            xdl0.X(this.f21204a, 0);
            String strM = pj90.m(this.f21212i.f1277z);
            if (TextUtils.isEmpty(strM)) {
                return;
            }
            xdl0.M(this.f21205b, true);
            xdl0.X(this.f21206c, t100.d(27.0f));
            this.f21205b.setText(String.format("预计符合%s人的理想型", strM));
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m24036B(roj0 roj0Var) {
        User userP9 = CoreModule.c.e0.p9();
        Profile profile = m24052y().m1991a2().m2043u0().profile;
        Studies studies = profile.studies;
        Profile profile2 = userP9.profile;
        Studies studies2 = profile2.studies;
        studies.verified = studies2.verified;
        studies.school = studies2.school;
        profile.school = profile2.school;
        profile.work.active = true;
        studies.active = false;
        m24052y().progressDismiss();
        this.f21210g.m3521f();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m24037C(Throwable th) {
        m24052y().progressDismiss();
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m24038C0() {
        return this.f21211h;
    }

    /* JADX INFO: renamed from: E */
    public void m24039E(int i) {
        List<String> listM20423h0 = this.f21213j.m20423h0(i);
        if (vwb.J(listM20423h0)) {
            return;
        }
        this.f21208e.setData(listM20423h0);
        if (i != this.f21214k) {
            this.f21208e.setSelectedItemPosition(0);
        } else {
            int iIndexOf = listM20423h0.indexOf(m24052y().m1991a2().m2043u0().profile.work.department);
            this.f21208e.setSelectedItemPosition(iIndexOf != -1 ? iIndexOf : 0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m24040F() {
        User userP9 = CoreModule.c.e0.p9();
        User userClone = userP9.clone();
        if (NullChecker.a(userClone.settings)) {
            StudentVerification studentVerification = userClone.settings.verification.studies;
            studentVerification.school = "";
            studentVerification.status = StudentVerificationStatus.get("default");
            if (NullChecker.b(userClone.settings.getSearchPriority())) {
                userClone.settings.getSearchPriority().remove(SearchPriority.get("student"));
            }
        }
        User userSubtract = userClone.subtract(userP9);
        if (NullChecker.a(userSubtract)) {
            m24052y().progress(R.string.R0);
            m24052y().duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.tla0
                public final void call(Object obj) {
                    this.f20298a.m24036B((roj0) obj);
                }
            }, new e30() { // from class: l.ula0
                public final void call(Object obj) {
                    this.f20696a.m24037C((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m24041G(int i) {
        List<String> listM20422g0 = this.f21213j.m20422g0();
        boolean zJ = vwb.J(listM20422g0);
        VFrame vFrame = this.f21206c;
        if (zJ) {
            xdl0.M0(vFrame, false);
            return;
        }
        xdl0.M0(vFrame, true);
        this.f21207d.setData(listM20422g0);
        if (i == -1) {
            i = 0;
        }
        this.f21214k = i;
        this.f21207d.setSelectedItemPosition(i);
        m24039E(this.f21214k);
    }

    /* JADX INFO: renamed from: H */
    public void m24042H(boolean z) {
        this.f21215l = z;
    }

    /* JADX INFO: renamed from: I */
    public void m24043I() {
        xdl0.M0(this.f21209f, true);
        this.f21210g.m3522g();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m24045p(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public View m24045p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0865a.m24056c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m24044i1(pla0 pla0Var) {
        this.f21213j = pla0Var;
    }

    /* JADX INFO: renamed from: s */
    public void m24047s() {
        m24052y().dialog().E0(R.string.h2).D(R.string.i2).n0(m24052y().getString(R.string.a), new Runnable() { // from class: l.rla0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18597a.m24053z();
            }
        }).v0(m24052y().getString(R.string.d2), new Runnable() { // from class: l.sla0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19083a.m24040F();
            }
        }).z0();
    }

    /* JADX INFO: renamed from: u */
    public boolean m24048u() {
        return this.f21215l;
    }

    /* JADX INFO: renamed from: v */
    public boolean m24049v() {
        List<String> listM20422g0 = this.f21213j.m20422g0();
        String string = this.f21207d.getSelectItem().toString();
        int i = this.f21214k;
        if (i > 0 && ((listM20422g0.get(i).contains("学生") && !string.contains("学生")) || (listM20422g0.get(this.f21214k).contains("Student") && !string.contains("Student")))) {
            User userP9 = CoreModule.c.e0.p9();
            if (NullChecker.a(userP9.settings) && NullChecker.b(userP9.settings.verification)) {
                return TEnum.equals(userP9.settings.verification.studies.status, "verified");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public void m24050w(User user) {
        String string = this.f21207d.getSelectItem().toString();
        String string2 = this.f21208e.getSelectItem().toString();
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
    public Bundle m24051x() {
        return this.f21212i.getArguments();
    }

    /* JADX INFO: renamed from: y */
    public ProfileInfoLoopEditAct m24052y() {
        return (ProfileInfoLoopEditAct) this.f21211h;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m24053z() {
        this.f21207d.setSelectedItemPosition(this.f21214k);
        m24039E(this.f21214k);
    }

    public void destroy() {
    }
}
