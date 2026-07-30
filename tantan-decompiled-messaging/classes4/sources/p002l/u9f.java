package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditItemView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputBirthday;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputNickName;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import java.util.Map;
import l.d30;
import l.e01;
import l.mcr;
import l.mqi0;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u9f extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public Map<String, String> f20552u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f20553v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f20554w;

    /* JADX INFO: renamed from: x */
    public ExpEditItemView f20555x;

    public u9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m23386U() {
        fif.m13250c(m1609i(), new ExpLoopInputBirthday());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m23387V() {
        fif.m13250c(m1609i(), new ExpLoopInputNickName());
    }

    /* JADX INFO: renamed from: W */
    public final void m23388W(User user) {
        this.f20553v.m1274c(user.name, 2);
        this.f20555x.m1274c(this.f20552u.get(user.gender.toString()), 2);
        this.f20554w.m1274c(mqi0.c.format(user.settings.birthdate), 2);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "基本信息";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "basic";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
        m1622v(this.f20554w, new d30() { // from class: l.s9f
            public final void call() {
                this.f18850a.m23386U();
            }
        }, true);
        m1622v(this.f20553v, new d30() { // from class: l.t9f
            public final void call() {
                this.f20138a.m23387V();
            }
        }, true);
        e01 e01Var = new e01();
        this.f20552u = e01Var;
        e01Var.put("male", view.getResources().getString(R.string.Eo));
        this.f20552u.put("female", view.getResources().getString(R.string.Do));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f20553v = expEditItemView;
        expEditItemView.m1275d("名字", x2c0.Fs);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f20554w = expEditItemView2;
        expEditItemView2.m1275d("生日", x2c0.ms);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f20555x = expEditItemView3;
        expEditItemView3.m1275d("性别", x2c0.ts);
        this.f20555x.setRightIconRes(0);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f20553v);
        linearLayout.addView(this.f20553v.getDividerView());
        linearLayout.addView(this.f20554w);
        linearLayout.addView(this.f20554w.getDividerView());
        linearLayout.addView(this.f20555x);
        return linearLayout;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        m23388W(m1624x().m9268i2());
    }
}
