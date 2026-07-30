package p153l;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileDoubleView;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileSingleView;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class m520 implements iam<d520> {

    /* JADX INFO: renamed from: g */
    public static jxd0 f134854g = new jxd0("liveShowTwoRoomInProfile", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f134855a;

    /* JADX INFO: renamed from: b */
    public VText f134856b;

    /* JADX INFO: renamed from: c */
    public VText f134857c;

    /* JADX INFO: renamed from: d */
    public ViewStub f134858d;

    /* JADX INFO: renamed from: e */
    public ViewStub f134859e;

    /* JADX INFO: renamed from: f */
    public MyRoomInProfileSingleView f134860f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m157087i(View view) {
        Activity activity = (Activity) this.f134855a.getContext();
        activity.startActivity(LiveIndependentSettingAct.m71882Z1(activity, "live_setting_page", null));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return (Act) bnl0.m105508E(this.f134858d);
    }

    /* JADX INFO: renamed from: c */
    public View m157088c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n520.m161631b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public void m157090e(i420 i420Var, boolean z) {
        MyRoomInProfileSingleView myRoomInProfileSingleView;
        if (i420Var == null || (myRoomInProfileSingleView = this.f134860f) == null) {
            return;
        }
        myRoomInProfileSingleView.m71726n0(Boolean.valueOf(z), i420Var.m138388c().m61308fp().profileMiddle().formatted());
    }

    /* JADX INFO: renamed from: f */
    public void m157091f(boolean z) {
        ConstraintLayout constraintLayout = this.f134855a;
        if (constraintLayout != null) {
            bnl0.m105524M(constraintLayout, !z);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m157088c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m157092j(i420 i420Var, i420 i420Var2, Boolean bool, y20<i420> y20Var, boolean z) {
        this.f134856b.setTextColor(-14606047);
        this.f134855a.setBackgroundColor(-1);
        this.f134856b.setTypeface(Typeface.SANS_SERIF, 1);
        this.f134856b.setText(tbs.f172989b.m203507R4());
        if (z) {
            this.f134857c.setText(tbs.f172989b.m203499Q4());
            this.f134857c.setOnClickListener(new View.OnClickListener() { // from class: l.k520
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123966a.m157087i(view);
                }
            });
        }
        bnl0.m105524M(this.f134857c, z);
        if (NullChecker.m82486a(i420Var2)) {
            m157093k(i420Var, i420Var2, bool.booleanValue(), y20Var);
        } else {
            m157094l(i420Var, bool, y20Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m157093k(i420 i420Var, i420 i420Var2, boolean z, y20<i420> y20Var) {
        ((MyRoomInProfileDoubleView) this.f134859e.inflate()).m71718d(i420Var, i420Var2, z, y20Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m157094l(final i420 i420Var, Boolean bool, final y20<i420> y20Var) {
        MyRoomInProfileSingleView myRoomInProfileSingleView = (MyRoomInProfileSingleView) this.f134858d.inflate();
        this.f134860f = myRoomInProfileSingleView;
        myRoomInProfileSingleView.m71725m0(i420Var, bool);
        bnl0.m105509E0(this.f134860f, new View.OnClickListener() { // from class: l.l520
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(i420Var);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(d520 d520Var) {
    }
}
