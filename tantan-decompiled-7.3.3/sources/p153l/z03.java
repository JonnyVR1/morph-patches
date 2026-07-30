package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import cn.qqtheme.framework.wheelview.WheelView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.growth.agealert.birthdayverify.BirthdayVerifyAct;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes3.dex */
public class z03 implements iam<x03> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f202275a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f202276b;

    /* JADX INFO: renamed from: c */
    public WheelView f202277c;

    /* JADX INFO: renamed from: d */
    public WheelView f202278d;

    /* JADX INFO: renamed from: e */
    public WheelView f202279e;

    /* JADX INFO: renamed from: f */
    public TextView f202280f;

    /* JADX INFO: renamed from: g */
    public BirthdayVerifyAct f202281g;

    /* JADX INFO: renamed from: h */
    public x03 f202282h;

    /* JADX INFO: renamed from: i */
    public y20<User> f202283i = new y20() { // from class: l.y03
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f196946a.m218104d((User) obj);
        }
    };

    public z03(BirthdayVerifyAct birthdayVerifyAct) {
        this.f202281g = birthdayVerifyAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f202281g;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f202281g;
    }

    /* JADX INFO: renamed from: b */
    public View m218102b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a13.m95440b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(x03 x03Var) {
        this.f202282h = x03Var;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m218104d(User user) {
        this.f202282h.m208812m0(user);
    }

    /* JADX INFO: renamed from: e */
    public void m218105e() {
        new ob0(this.f202281g, this.f202280f).m166902w(this.f202276b, this.f202280f, this.f202283i);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m218102b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
