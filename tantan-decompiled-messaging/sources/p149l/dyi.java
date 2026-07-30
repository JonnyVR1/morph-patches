package p149l;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class dyi extends a11 {

    /* JADX INFO: renamed from: d */
    public static final int f88394d = f6c0.f95545R6;

    /* JADX INFO: renamed from: a */
    public final View f88395a;

    /* JADX INFO: renamed from: b */
    public final View f88396b;

    /* JADX INFO: renamed from: c */
    public final VText f88397c;

    /* JADX INFO: renamed from: l.dyi$a */
    public static class C16501a extends dcl0 {
        @Override // p149l.dcl0
        /* JADX INFO: renamed from: a */
        public a11 mo103900a(ViewGroup viewGroup) {
            return new dyi(LayoutInflater.from(viewGroup.getContext()).inflate(dyi.f88394d, viewGroup, false));
        }
    }

    public dyi(@NonNull View view) {
        super(view);
        this.f88395a = view.findViewById(u4c0.f174183be);
        this.f88396b = view.findViewById(u4c0.f174519vb);
        this.f88397c = (VText) view.findViewById(u4c0.f174536wb);
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: a */
    public void mo94503a(@Nullable final User user, boolean z) {
        if (user == null) {
            return;
        }
        xdl0.m208344M(this.f88395a, !user.isMe());
        xdl0.m208344M(this.f88396b, !user.isMe());
        this.f88397c.setText(user.name);
        xdl0.m208329E0(this.f88396b, new View.OnClickListener() { // from class: l.cyi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82990a.m114075d(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m114075d(User user, View view) {
        Context context = this.f88397c.getContext();
        if (NullChecker.m81303a(context) && (context instanceof Activity)) {
            StringBuilder sb = new StringBuilder();
            sb.append(juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
            sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-report/index.html?speed=true&_bid=1004397&hideNavigationBar=1&hideNotch=1&from=user&receive_report_user_id=");
            sb.append(user.f56011id);
            context.startActivity(MkWebViewAct.m80240e2(context, "", sb.toString(), true, true, true, true, null));
        }
    }
}
