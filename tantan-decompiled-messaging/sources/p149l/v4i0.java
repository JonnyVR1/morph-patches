package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class v4i0 extends p3l {

    /* JADX INFO: renamed from: f */
    public VText_Medium f179933f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f179934g;

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m196991D(String str, View view) {
        e51.m114766q(str);
        lsi0.m151593w(R$string.f17587Ak);
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        final String str = !TextUtils.isEmpty(user.publicId) ? user.publicId : "";
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(m209783m(), false);
            return;
        }
        xdl0.m208344M(m209783m(), true);
        this.f179934g.setText(str);
        xdl0.m208329E0(m209783m(), new View.OnClickListener() { // from class: l.u4i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v4i0.m196991D(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m196992E(View view) {
        w4i0.m201513a(this, view);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m196992E(view);
    }
}
