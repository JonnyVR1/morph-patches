package p153l;

import android.text.style.ClickableSpan;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.NavigationIntent;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class diq extends ajq {

    /* JADX INFO: renamed from: l.diq$a */
    public class C16538a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f88698a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f88699b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f88700c;

        public C16538a(boolean z, String str, String str2) {
            this.f88698a = z;
            this.f88699b = str;
            this.f88700c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(final View view) {
            if (this.f88698a) {
                i4g0.m138495D("e_official_pic_video_handle", this.f88699b, new pf60("ext_data", this.f88700c));
            }
            if (CoreModule.m30933P().m143412i().mo34547m9() >= 1) {
                view.getContext().startActivity(CoreModule.m30933P().m143412i().getMainWithNav(view.getContext(), NavigationIntent.get("quickchat")));
            } else {
                final x20 x20Var = new x20() { // from class: l.biq
                    @Override // p153l.x20
                    public final void call() {
                        CoreModule.f18273l.m143412i().mo180434Z4((Act) view.getContext(), "p_wallet,vas");
                    }
                };
                tcz.m190529G((Act) view.getContext(), joa.m146380c4(SummarizedPrivilegesId.get("quickchatMembership")) ? "抱歉，您今日的闪聊次数已经用完，可充值购买闪聊使用次数！" : "抱歉，您的免费闪聊次数已经用完！", new Runnable() { // from class: l.ciq
                    @Override // java.lang.Runnable
                    public final void run() {
                        x20Var.call();
                    }
                });
            }
        }
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo98010b(URI uri, boolean z, String str, String str2) {
        return new C16538a(z, str2, str);
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: c */
    public String mo98011c() {
        return "<a href = \"tantanapp://conversations/quickchat.*\">.*</a>";
    }
}
