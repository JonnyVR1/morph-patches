package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditItemView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputFoodFlavor;
import java.util.ArrayList;
import java.util.List;
import l.et4;
import l.lm90;
import l.mcr;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w9f extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f21573u;

    public w9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m24440T(View view) {
        m24441U();
        fif.m13250c(m1609i(), new ExpLoopInputFoodFlavor());
    }

    /* JADX INFO: renamed from: U */
    public void m24441U() {
        zvf0.r("e_edit_flavor_preference_entrance", "p_edit_profile_view");
    }

    /* JADX INFO: renamed from: V */
    public void m24442V() {
        zvf0.x("e_edit_flavor_preference_entrance", "p_edit_profile_view");
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "美食偏好";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "food";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f21573u = expEditItemView;
        expEditItemView.m1275d("风味喜好", x2c0.qs);
        return this.f21573u;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        List<String> list = m1624x().m9268i2().profile.extensions.interest.taste;
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    String strA = lm90.a(str);
                    if (!TextUtils.isEmpty(strA)) {
                        arrayList.add(strA);
                    }
                }
            }
        }
        m1681Q(this.f21573u, et4.a("、", arrayList));
        xdl0.E0(this.f21573u, new View.OnClickListener() { // from class: l.v9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21043a.m24440T(view);
            }
        });
        m24442V();
    }
}
