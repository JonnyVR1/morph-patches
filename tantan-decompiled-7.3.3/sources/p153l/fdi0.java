package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class fdi0 extends f6l {

    /* JADX INFO: renamed from: f */
    public VText_Medium f98478f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f98479g;

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m125101D(String str, View view) {
        l51.m152911q(str);
        o1j0.m165649w(R$string.f18977Wk);
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        final String str = !TextUtils.isEmpty(user.publicId) ? user.publicId : "";
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(m116952m(), false);
            return;
        }
        bnl0.m105524M(m116952m(), true);
        this.f98479g.setText(str);
        bnl0.m105509E0(m116952m(), new View.OnClickListener() { // from class: l.edi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fdi0.m125101D(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m125102E(View view) {
        gdi0.m129927a(this, view);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m125102E(view);
    }
}
