package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import cn.qqtheme.framework.wheelview.WheelView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.growth.agealert.birthdayverify.BirthdayVerifyAct;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes10.dex */
public class k03 implements s7m<i03> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f120441a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f120442b;

    /* JADX INFO: renamed from: c */
    public WheelView f120443c;

    /* JADX INFO: renamed from: d */
    public WheelView f120444d;

    /* JADX INFO: renamed from: e */
    public WheelView f120445e;

    /* JADX INFO: renamed from: f */
    public TextView f120446f;

    /* JADX INFO: renamed from: g */
    public BirthdayVerifyAct f120447g;

    /* JADX INFO: renamed from: h */
    public i03 f120448h;

    /* JADX INFO: renamed from: i */
    public e30<User> f120449i = new e30() { // from class: l.j03
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f115632a.m143986d((User) obj);
        }
    };

    public k03(BirthdayVerifyAct birthdayVerifyAct) {
        this.f120447g = birthdayVerifyAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f120447g;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f120447g;
    }

    /* JADX INFO: renamed from: b */
    public View m143984b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l03.m148004b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(i03 i03Var) {
        this.f120448h = i03Var;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m143986d(User user) {
        this.f120448h.m133750m0(user);
    }

    /* JADX INFO: renamed from: e */
    public void m143987e() {
        new sb0(this.f120447g, this.f120446f).m183169w(this.f120442b, this.f120446f, this.f120449i);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m143984b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
