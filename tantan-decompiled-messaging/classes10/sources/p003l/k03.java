package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import cn.qqtheme.framework.wheelview.WheelView;
import com.p000p1.mobile.putong.core.p001ui.growth.agealert.birthdayverify.BirthdayVerifyAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import l.e30;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k03 implements s7m<i03> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f5401a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5402b;

    /* JADX INFO: renamed from: c */
    public WheelView f5403c;

    /* JADX INFO: renamed from: d */
    public WheelView f5404d;

    /* JADX INFO: renamed from: e */
    public WheelView f5405e;

    /* JADX INFO: renamed from: f */
    public TextView f5406f;

    /* JADX INFO: renamed from: g */
    public BirthdayVerifyAct f5407g;

    /* JADX INFO: renamed from: h */
    public i03 f5408h;

    /* JADX INFO: renamed from: i */
    public e30<User> f5409i = new e30() { // from class: l.j03
        public final void call(Object obj) {
            this.f5233a.m7476d((User) obj);
        }
    };

    public k03(BirthdayVerifyAct birthdayVerifyAct) {
        this.f5407g = birthdayVerifyAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7473C0() {
        return this.f5407g;
    }

    @Nullable
    public Act act() {
        return this.f5407g;
    }

    /* JADX INFO: renamed from: b */
    public View m7474b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l03.m7652b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m7478i1(i03 i03Var) {
        this.f5408h = i03Var;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m7476d(User user) {
        this.f5408h.m7121m0(user);
    }

    /* JADX INFO: renamed from: e */
    public void m7477e() {
        new sb0(this.f5407g, this.f5406f).m9296w(this.f5402b, this.f5406f, this.f5409i);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7474b(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
