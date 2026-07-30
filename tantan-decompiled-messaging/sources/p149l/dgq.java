package p149l;

import android.text.style.ClickableSpan;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.NavigationIntent;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class dgq extends ahq {

    /* JADX INFO: renamed from: l.dgq$a */
    public class C16366a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f86152a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f86153b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f86154c;

        public C16366a(boolean z, String str, String str2) {
            this.f86152a = z;
            this.f86153b = str;
            this.f86154c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(final View view) {
            if (this.f86152a) {
                zvf0.m220371D("e_official_pic_video_handle", this.f86153b, new j760("ext_data", this.f86154c));
            }
            if (CoreModule.m29935P().m94658i().mo33544m9() >= 1) {
                view.getContext().startActivity(CoreModule.m29935P().m94658i().getMainWithNav(view.getContext(), NavigationIntent.get("quickchat")));
            } else {
                final d30 d30Var = new d30() { // from class: l.bgq
                    @Override // p149l.d30
                    public final void call() {
                        CoreModule.f17554l.m94658i().mo158342Z4((Act) view.getContext(), "p_wallet,vas");
                    }
                };
                w3z.m201401G((Act) view.getContext(), xma.m210065b4(SummarizedPrivilegesId.get("quickchatMembership")) ? "抱歉，您今日的闪聊次数已经用完，可充值购买闪聊使用次数！" : "抱歉，您的免费闪聊次数已经用完！", new Runnable() { // from class: l.cgq
                    @Override // java.lang.Runnable
                    public final void run() {
                        d30Var.call();
                    }
                });
            }
        }
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo96321b(URI uri, boolean z, String str, String str2) {
        return new C16366a(z, str2, str);
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: c */
    public String mo96322c() {
        return "<a href = \"tantanapp://conversations/quickchat.*\">.*</a>";
    }
}
