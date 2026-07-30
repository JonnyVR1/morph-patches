package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditItemView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputFoodFlavor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cbf extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f80812u;

    public cbf(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m108636T(View view) {
        m108637U();
        ljf.m154506c(m52340i(), new ExpLoopInputFoodFlavor());
    }

    /* JADX INFO: renamed from: U */
    public void m108637U() {
        i4g0.m138520r("e_edit_flavor_preference_entrance", "p_edit_profile_view");
    }

    /* JADX INFO: renamed from: V */
    public void m108638V() {
        i4g0.m138526x("e_edit_flavor_preference_entrance", "p_edit_profile_view");
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "美食偏好";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "food";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f80812u = expEditItemView;
        expEditItemView.m52012d("风味喜好", dbc0.f86969et);
        return this.f80812u;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        List<String> list = m52355x().m189086i2().profile.extensions.interest.taste;
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    String strM173837a = pu90.m173837a(str);
                    if (!TextUtils.isEmpty(strM173837a)) {
                        arrayList.add(strM173837a);
                    }
                }
            }
        }
        m52409Q(this.f80812u, du4.m118067a("、", arrayList));
        bnl0.m105509E0(this.f80812u, new View.OnClickListener() { // from class: l.bbf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75943a.m108636T(view);
            }
        });
        m108638V();
    }
}
