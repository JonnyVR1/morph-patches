package p003l;

import android.text.style.ClickableSpan;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.data.NavigationIntent;
import java.net.URI;
import l.ahq;
import l.j760;
import l.xma;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dgq extends ahq {

    /* JADX INFO: renamed from: l.dgq$a */
    public class C0229a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f2994a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f2995b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f2996c;

        public C0229a(boolean z, String str, String str2) {
            this.f2994a = z;
            this.f2995b = str;
            this.f2996c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(final View view) {
            if (this.f2994a) {
                zvf0.D("e_official_pic_video_handle", this.f2995b, new j760[]{new j760("ext_data", this.f2996c)});
            }
            if (CoreModule.P().i().m9() >= 1) {
                view.getContext().startActivity(CoreModule.P().i().getMainWithNav(view.getContext(), NavigationIntent.get("quickchat")));
            } else {
                final d30 d30Var = new d30() { // from class: l.bgq
                    @Override // p003l.d30
                    public final void call() {
                        CoreModule.l.i().Z4(view.getContext(), "p_wallet,vas");
                    }
                };
                w3z.m8435G(view.getContext(), xma.b4(SummarizedPrivilegesId.get("quickchatMembership")) ? "抱歉，您今日的闪聊次数已经用完，可充值购买闪聊使用次数！" : "抱歉，您的免费闪聊次数已经用完！", new Runnable() { // from class: l.cgq
                    @Override // java.lang.Runnable
                    public final void run() {
                        d30Var.call();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan m3574b(URI uri, boolean z, String str, String str2) {
        return new C0229a(z, str2, str);
    }

    /* JADX INFO: renamed from: c */
    public String m3575c() {
        return "<a href = \"tantanapp://conversations/quickchat.*\">.*</a>";
    }
}
