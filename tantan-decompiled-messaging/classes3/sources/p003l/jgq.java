package p003l;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import java.net.URI;
import l.ahq;
import l.j760;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class jgq extends ahq {

    /* JADX INFO: renamed from: l.jgq$a */
    public class C0352a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f4639a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f4640b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f4641c;

        public C0352a(boolean z, String str, String str2) {
            this.f4639a = z;
            this.f4640b = str;
            this.f4641c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f4639a) {
                zvf0.D("e_official_pic_video_handle", this.f4640b, new j760[]{new j760("ext_data", this.f4641c)});
            }
            Context context = view.getContext();
            context.startActivity(AccessTokenWebViewAct.Z1(context, "", "https://invite.tantanapp.com/index.html"));
        }
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan m5329b(URI uri, boolean z, String str, String str2) {
        return new C0352a(z, str2, str);
    }

    /* JADX INFO: renamed from: c */
    public String m5330c() {
        return "<a href = \"tantan://redPacket/link\">.*</a>";
    }
}
