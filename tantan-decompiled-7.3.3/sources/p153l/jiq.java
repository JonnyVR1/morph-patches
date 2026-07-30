package p153l;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class jiq extends ajq {

    /* JADX INFO: renamed from: l.jiq$a */
    public class C17958a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f121113a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f121114b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f121115c;

        public C17958a(boolean z, String str, String str2) {
            this.f121113a = z;
            this.f121114b = str;
            this.f121115c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f121113a) {
                i4g0.m138495D("e_official_pic_video_handle", this.f121114b, new pf60("ext_data", this.f121115c));
            }
            Context context = view.getContext();
            context.startActivity(AccessTokenWebViewAct.m81333a2(context, "", "https://invite.tantanapp.com/index.html"));
        }
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo98010b(URI uri, boolean z, String str, String str2) {
        return new C17958a(z, str2, str);
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: c */
    public String mo98011c() {
        return "<a href = \"tantan://redPacket/link\">.*</a>";
    }
}
