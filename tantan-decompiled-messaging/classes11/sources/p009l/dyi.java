package p009l;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a11;
import l.dcl0;
import l.f6c0;
import l.u4c0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dyi extends a11 {

    /* JADX INFO: renamed from: d */
    public static final int f12061d = f6c0.R6;

    /* JADX INFO: renamed from: a */
    public final View f12062a;

    /* JADX INFO: renamed from: b */
    public final View f12063b;

    /* JADX INFO: renamed from: c */
    public final VText f12064c;

    /* JADX INFO: renamed from: l.dyi$a */
    public static class C0861a extends dcl0 {
        /* JADX INFO: renamed from: a */
        public a11 m13522a(ViewGroup viewGroup) {
            return new dyi(LayoutInflater.from(viewGroup.getContext()).inflate(dyi.f12061d, viewGroup, false));
        }
    }

    public dyi(@NonNull View view) {
        super(view);
        this.f12062a = view.findViewById(u4c0.be);
        this.f12063b = view.findViewById(u4c0.vb);
        this.f12064c = view.findViewById(u4c0.wb);
    }

    /* JADX INFO: renamed from: a */
    public void m13520a(@Nullable final User user, boolean z) {
        if (user == null) {
            return;
        }
        xdl0.M(this.f12062a, !user.isMe());
        xdl0.M(this.f12063b, !user.isMe());
        this.f12064c.setText(user.name);
        xdl0.E0(this.f12063b, new View.OnClickListener() { // from class: l.cyi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10822a.m13521d(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m13521d(User user, View view) {
        Context context = this.f12064c.getContext();
        if (NullChecker.a(context) && (context instanceof Activity)) {
            StringBuilder sb = new StringBuilder();
            sb.append(juk.m17221e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
            sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-report/index.html?speed=true&_bid=1004397&hideNavigationBar=1&hideNotch=1&from=user&receive_report_user_id=");
            sb.append(((DbObject) user).id);
            context.startActivity(MkWebViewAct.m10587e2(context, "", sb.toString(), true, true, true, true, null));
        }
    }
}
