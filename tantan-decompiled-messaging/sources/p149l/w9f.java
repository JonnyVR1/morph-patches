package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditItemView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputFoodFlavor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class w9f extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f185346u;

    public w9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m202306T(View view) {
        m202307U();
        fif.m121508c(m51157i(), new ExpLoopInputFoodFlavor());
    }

    /* JADX INFO: renamed from: U */
    public void m202307U() {
        zvf0.m220396r("e_edit_flavor_preference_entrance", "p_edit_profile_view");
    }

    /* JADX INFO: renamed from: V */
    public void m202308V() {
        zvf0.m220402x("e_edit_flavor_preference_entrance", "p_edit_profile_view");
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "美食偏好";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "food";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f185346u = expEditItemView;
        expEditItemView.m50829d("风味喜好", x2c0.f190503qs);
        return this.f185346u;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        List<String> list = m51172x().m94569i2().profile.extensions.interest.taste;
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    String strM150558a = lm90.m150558a(str);
                    if (!TextUtils.isEmpty(strM150558a)) {
                        arrayList.add(strM150558a);
                    }
                }
            }
        }
        m51226Q(this.f185346u, et4.m117971a("、", arrayList));
        xdl0.m208329E0(this.f185346u, new View.OnClickListener() { // from class: l.v9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180636a.m202306T(view);
            }
        });
        m202308V();
    }
}
