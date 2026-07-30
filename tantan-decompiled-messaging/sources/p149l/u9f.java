package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditItemView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputBirthday;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputNickName;
import com.p046p1.mobile.putong.data.User;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class u9f extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public Map<String, String> f175256u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f175257v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f175258w;

    /* JADX INFO: renamed from: x */
    public ExpEditItemView f175259x;

    public u9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m192268U() {
        fif.m121508c(m51157i(), new ExpLoopInputBirthday());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m192269V() {
        fif.m121508c(m51157i(), new ExpLoopInputNickName());
    }

    /* JADX INFO: renamed from: W */
    public final void m192270W(User user) {
        this.f175257v.m50828c(user.name, 2);
        this.f175259x.m50828c(this.f175256u.get(user.gender.toString()), 2);
        this.f175258w.m50828c(mqi0.f135251c.format(user.settings.birthdate), 2);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "基本信息";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "basic";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
        m51170v(this.f175258w, new d30() { // from class: l.s9f
            @Override // p149l.d30
            public final void call() {
                this.f163177a.m192268U();
            }
        }, true);
        m51170v(this.f175257v, new d30() { // from class: l.t9f
            @Override // p149l.d30
            public final void call() {
                this.f169022a.m192269V();
            }
        }, true);
        e01 e01Var = new e01();
        this.f175256u = e01Var;
        e01Var.put("male", view.getResources().getString(R$string.f17711Eo));
        this.f175256u.put("female", view.getResources().getString(R$string.f17681Do));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f175257v = expEditItemView;
        expEditItemView.m50829d("名字", x2c0.f189342Fs);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f175258w = expEditItemView2;
        expEditItemView2.m50829d("生日", x2c0.f190375ms);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f175259x = expEditItemView3;
        expEditItemView3.m50829d("性别", x2c0.f190599ts);
        this.f175259x.setRightIconRes(0);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f175257v);
        linearLayout.addView(this.f175257v.getDividerView());
        linearLayout.addView(this.f175258w);
        linearLayout.addView(this.f175258w.getDividerView());
        linearLayout.addView(this.f175259x);
        return linearLayout;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        m192270W(m51172x().m94569i2());
    }
}
