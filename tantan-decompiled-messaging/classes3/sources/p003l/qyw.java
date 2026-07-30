package p003l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.profession.MarryEditProfileProfessionFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.profile.views.WheelPicker;
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
import l.mkd0;
import l.n6c0;
import l.roj0;
import l.vwb;
import l.xdl0;
import org.eclipse.jetty.servlet.ServletHandler;
import p028v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class qyw extends iww<kyw> {

    /* JADX INFO: renamed from: c */
    public TextView f6729c;

    /* JADX INFO: renamed from: d */
    public VFrame f6730d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f6731e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f6732f;

    /* JADX INFO: renamed from: g */
    public kyw f6733g;

    /* JADX INFO: renamed from: h */
    public int f6734h;

    /* JADX INFO: renamed from: l.qyw$a */
    public static class C0496a {
        /* JADX INFO: renamed from: b */
        public static void m7101b(qyw qywVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            qywVar.f6729c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            qywVar.f6730d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            qywVar.f6731e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            qywVar.f6732f = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m7102c(qyw qywVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.c0, viewGroup, false);
            m7101b(qywVar, viewInflate);
            return viewInflate;
        }
    }

    public qyw(Act act, MarryEditProfileProfessionFrag marryEditProfileProfessionFrag) {
        super(act, marryEditProfileProfessionFrag);
        this.f6734h = -1;
    }

    /* JADX INFO: renamed from: y */
    private boolean m7086y() {
        List<String> listM5917l0 = this.f6733g.m5917l0();
        String string = this.f6731e.getSelectItem().toString();
        int i = this.f6734h;
        if (i > 0 && ((listM5917l0.get(i).contains("学生") && !string.contains("学生")) || (listM5917l0.get(this.f6734h).contains("Student") && !string.contains("Student")))) {
            User userP9 = CoreModule.c.e0.p9();
            if (NullChecker.a(userP9.settings) && NullChecker.b(userP9.settings.verification)) {
                return TEnum.equals(userP9.settings.verification.studies.status, "verified");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m7087A(User user) {
        this.f6731e.setSelectedItemPosition(this.f6734h);
        m7092G(user, this.f6734h);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m7089C(User user, WheelPicker wheelPicker, Object obj, int i) {
        m7092G(user, i);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m7090E(User user, roj0 roj0Var) {
        User userP9 = CoreModule.c.e0.p9();
        Profile profile = user.profile;
        Studies studies = profile.studies;
        Profile profile2 = userP9.profile;
        Studies studies2 = profile2.studies;
        studies.verified = studies2.verified;
        studies.school = studies2.school;
        profile.school = profile2.school;
        profile.work.active = true;
        studies.active = false;
        m7099z().progressDismiss();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m7091F(Throwable th) {
        m7099z().progressDismiss();
    }

    /* JADX INFO: renamed from: G */
    public void m7092G(User user, int i) {
        List<String> listM5918m0 = this.f6733g.m5918m0(i);
        if (vwb.J(listM5918m0)) {
            return;
        }
        this.f6732f.setData(listM5918m0);
        if (i != this.f6734h) {
            this.f6732f.setSelectedItemPosition(0);
        } else {
            int iIndexOf = listM5918m0.indexOf(user.profile.work.department);
            this.f6732f.setSelectedItemPosition(iIndexOf != -1 ? iIndexOf : 0);
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void m7088B(final User user) {
        User userP9 = CoreModule.c.e0.p9();
        User userClone = userP9.clone();
        if (NullChecker.a(userClone.settings)) {
            StudentVerification studentVerification = userClone.settings.verification.studies;
            studentVerification.school = "";
            studentVerification.status = StudentVerificationStatus.get(ServletHandler.__DEFAULT_SERVLET);
            if (NullChecker.b(userClone.settings.getSearchPriority())) {
                userClone.settings.getSearchPriority().remove(SearchPriority.get("student"));
            }
        }
        User userSubtract = userClone.subtract(userP9);
        if (NullChecker.a(userSubtract)) {
            m7099z().progress(R.string.R0);
            m7099z().duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe((m250) mkd0.H(new e30() { // from class: l.oyw
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6286a.m7090E(user, (roj0) obj);
                }
            }, new e30() { // from class: l.pyw
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6554a.m7091F((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m7094I(User user, int i) {
        List<String> listM5917l0 = this.f6733g.m5917l0();
        boolean zJ = vwb.J(listM5917l0);
        VFrame vFrame = this.f6730d;
        if (zJ) {
            xdl0.M0(vFrame, false);
            return;
        }
        xdl0.M0(vFrame, true);
        this.f6731e.setData(listM5917l0);
        if (i == -1) {
            i = 0;
        }
        this.f6734h = i;
        this.f6731e.setSelectedItemPosition(i);
        m7092G(user, this.f6734h);
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: b */
    public boolean mo3207b(MarrySeriesType marrySeriesType, User user) {
        if (!m7086y()) {
            return true;
        }
        m7098x(user);
        return false;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f6731e.getSelectItem().toString());
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        String string = this.f6731e.getSelectItem().toString();
        String string2 = this.f6732f.getSelectItem().toString();
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

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(MarrySeriesType marrySeriesType, final User user) {
        this.f6729c.setTypeface(eqh0.m3924c(3), 1);
        this.f6729c.setText(marrySeriesType.getTitleName());
        this.f6731e.setOnItemSelectedListener(new WheelPicker.a() { // from class: l.lyw
            /* JADX INFO: renamed from: a */
            public final void m6191a(WheelPicker wheelPicker, Object obj, int i) {
                this.f5479a.m7089C(user, wheelPicker, obj, i);
            }
        });
        List<String> listM5917l0 = this.f6733g.m5917l0();
        if (vwb.J(listM5917l0)) {
            return;
        }
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = act().getString(R.string.Q2);
        }
        if (TextUtils.isEmpty(string)) {
            m7094I(user, -1);
            return;
        }
        int iIndexOf = listM5917l0.indexOf(string);
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        m7094I(user, iIndexOf);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7096v(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public View m7096v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0496a.m7102c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m7095i1(kyw kywVar) {
        this.f6733g = kywVar;
    }

    /* JADX INFO: renamed from: x */
    public final void m7098x(final User user) {
        m7099z().dialog().E0(R.string.h2).D(R.string.i2).n0(m7099z().getString(R.string.a), new Runnable() { // from class: l.myw
            @Override // java.lang.Runnable
            public final void run() {
                this.f5809a.m7087A(user);
            }
        }).v0(m7099z().getString(R.string.d2), new Runnable() { // from class: l.nyw
            @Override // java.lang.Runnable
            public final void run() {
                this.f6002a.m7088B(user);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: z */
    public final MarryEditProfileSeriesAct m7099z() {
        return act();
    }
}
