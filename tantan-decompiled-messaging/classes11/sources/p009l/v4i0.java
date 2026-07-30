package p009l;

import android.text.TextUtils;
import android.view.View;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.User;
import l.e51;
import l.lsi0;
import l.w4i0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class v4i0 extends p3l {

    /* JADX INFO: renamed from: f */
    public VText_Medium f21441f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f21442g;

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m23257D(String str, View view) {
        e51.q(str);
        lsi0.w(R.string.Ak);
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        final String str = !TextUtils.isEmpty(user.publicId) ? user.publicId : "";
        if (TextUtils.isEmpty(str)) {
            xdl0.M(m24921m(), false);
            return;
        }
        xdl0.M(m24921m(), true);
        this.f21442g.setText(str);
        xdl0.E0(m24921m(), new View.OnClickListener() { // from class: l.u4i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v4i0.m23257D(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m23258E(View view) {
        w4i0.a(this, view);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m23258E(view);
    }
}
