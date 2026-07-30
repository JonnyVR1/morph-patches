package p149l;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileDoubleView;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileSingleView;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ex10 implements s7m<vw10> {

    /* JADX INFO: renamed from: g */
    public static hpd0 f93564g = new hpd0("liveShowTwoRoomInProfile", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f93565a;

    /* JADX INFO: renamed from: b */
    public VText f93566b;

    /* JADX INFO: renamed from: c */
    public VText f93567c;

    /* JADX INFO: renamed from: d */
    public ViewStub f93568d;

    /* JADX INFO: renamed from: e */
    public ViewStub f93569e;

    /* JADX INFO: renamed from: f */
    public MyRoomInProfileSingleView f93570f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m118533i(View view) {
        Activity activity = (Activity) this.f93565a.getContext();
        activity.startActivity(LiveIndependentSettingAct.m70699Y1(activity, "live_setting_page", null));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return (Act) xdl0.m208328E(this.f93568d);
    }

    /* JADX INFO: renamed from: c */
    public View m118534c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fx10.m123617b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public void m118536e(aw10 aw10Var, boolean z) {
        MyRoomInProfileSingleView myRoomInProfileSingleView;
        if (aw10Var == null || (myRoomInProfileSingleView = this.f93570f) == null) {
            return;
        }
        myRoomInProfileSingleView.m70543n0(Boolean.valueOf(z), aw10Var.m99225c().m60124fp().profileMiddle().formatted());
    }

    /* JADX INFO: renamed from: f */
    public void m118537f(boolean z) {
        ConstraintLayout constraintLayout = this.f93565a;
        if (constraintLayout != null) {
            xdl0.m208344M(constraintLayout, !z);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m118534c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m118538j(aw10 aw10Var, aw10 aw10Var2, Boolean bool, e30<aw10> e30Var, boolean z) {
        this.f93566b.setTextColor(-14606047);
        this.f93565a.setBackgroundColor(-1);
        this.f93566b.setTypeface(Typeface.SANS_SERIF, 1);
        this.f93566b.setText(s9s.f163228b.m195720R4());
        if (z) {
            this.f93567c.setText(s9s.f163228b.m195712Q4());
            this.f93567c.setOnClickListener(new View.OnClickListener() { // from class: l.cx10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f82825a.m118533i(view);
                }
            });
        }
        xdl0.m208344M(this.f93567c, z);
        if (NullChecker.m81303a(aw10Var2)) {
            m118539k(aw10Var, aw10Var2, bool.booleanValue(), e30Var);
        } else {
            m118540l(aw10Var, bool, e30Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m118539k(aw10 aw10Var, aw10 aw10Var2, boolean z, e30<aw10> e30Var) {
        ((MyRoomInProfileDoubleView) this.f93569e.inflate()).m70535d(aw10Var, aw10Var2, z, e30Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m118540l(final aw10 aw10Var, Boolean bool, final e30<aw10> e30Var) {
        MyRoomInProfileSingleView myRoomInProfileSingleView = (MyRoomInProfileSingleView) this.f93568d.inflate();
        this.f93570f = myRoomInProfileSingleView;
        myRoomInProfileSingleView.m70542m0(aw10Var, bool);
        xdl0.m208329E0(this.f93570f, new View.OnClickListener() { // from class: l.dx10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(aw10Var);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(vw10 vw10Var) {
    }
}
