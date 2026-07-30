package p153l;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class z0j extends h11 {

    /* JADX INFO: renamed from: d */
    public static final int f202350d = kec0.f125615S6;

    /* JADX INFO: renamed from: a */
    public final View f202351a;

    /* JADX INFO: renamed from: b */
    public final View f202352b;

    /* JADX INFO: renamed from: c */
    public final VText f202353c;

    /* JADX INFO: renamed from: l.z0j$a */
    public static class C21731a extends hll0 {
        @Override // p153l.hll0
        /* JADX INFO: renamed from: a */
        public h11 mo135759a(ViewGroup viewGroup) {
            return new z0j(LayoutInflater.from(viewGroup.getContext()).inflate(z0j.f202350d, viewGroup, false));
        }
    }

    public z0j(@NonNull View view) {
        super(view);
        this.f202351a = view.findViewById(adc0.f70325ee);
        this.f202352b = view.findViewById(adc0.f70644xb);
        this.f202353c = (VText) view.findViewById(adc0.f70661yb);
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: a */
    public void mo133267a(@Nullable final User user, boolean z) {
        if (user == null) {
            return;
        }
        bnl0.m105524M(this.f202351a, !user.isMe());
        bnl0.m105524M(this.f202352b, !user.isMe());
        this.f202353c.setText(user.name);
        bnl0.m105509E0(this.f202352b, new View.OnClickListener() { // from class: l.y0j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197014a.m218135d(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m218135d(User user, View view) {
        Context context = this.f202353c.getContext();
        if (NullChecker.m82486a(context) && (context instanceof Activity)) {
            StringBuilder sb = new StringBuilder();
            sb.append(zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
            sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-report/index.html?speed=true&_bid=1004397&hideNavigationBar=1&hideNotch=1&from=user&receive_report_user_id=");
            sb.append(user.f56859id);
            context.startActivity(MkWebViewAct.m81423g2(context, "", sb.toString(), true, true, true, true, null));
        }
    }
}
