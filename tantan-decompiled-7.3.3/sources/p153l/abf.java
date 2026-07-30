package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditItemView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputBirthday;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputNickName;
import com.p051p1.mobile.putong.data.User;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class abf extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public Map<String, String> f69615u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f69616v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f69617w;

    /* JADX INFO: renamed from: x */
    public ExpEditItemView f69618x;

    public abf(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m96751U() {
        ljf.m154506c(m52340i(), new ExpLoopInputBirthday());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m96752V() {
        ljf.m154506c(m52340i(), new ExpLoopInputNickName());
    }

    /* JADX INFO: renamed from: W */
    public final void m96753W(User user) {
        this.f69616v.m52011c(user.name, 2);
        this.f69618x.m52011c(this.f69615u.get(user.gender.toString()), 2);
        this.f69617w.m52011c(pzi0.f154856c.format(user.settings.birthdate), 2);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "基本信息";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "basic";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
        m52353v(this.f69617w, new x20() { // from class: l.yaf
            @Override // p153l.x20
            public final void call() {
                this.f198178a.m96751U();
            }
        }, true);
        m52353v(this.f69616v, new x20() { // from class: l.zaf
            @Override // p153l.x20
            public final void call() {
                this.f203558a.m96752V();
            }
        }, true);
        l01 l01Var = new l01();
        this.f69615u = l01Var;
        l01Var.put("male", view.getResources().getString(R$string.f19102ap));
        this.f69615u.put("female", view.getResources().getString(R$string.f19071Zo));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f69616v = expEditItemView;
        expEditItemView.m52012d("名字", dbc0.f87495ut);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f69617w = expEditItemView2;
        expEditItemView2.m52012d("生日", dbc0.f86838at);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f69618x = expEditItemView3;
        expEditItemView3.m52012d("性别", dbc0.f87068ht);
        this.f69618x.setRightIconRes(0);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f69616v);
        linearLayout.addView(this.f69616v.getDividerView());
        linearLayout.addView(this.f69617w);
        linearLayout.addView(this.f69617w.getDividerView());
        linearLayout.addView(this.f69618x);
        return linearLayout;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        m96753W(m52355x().m189086i2());
    }
}
