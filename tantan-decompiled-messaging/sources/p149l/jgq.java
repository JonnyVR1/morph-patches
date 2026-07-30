package p149l;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class jgq extends ahq {

    /* JADX INFO: renamed from: l.jgq$a */
    public class C17770a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f117818a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f117819b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f117820c;

        public C17770a(boolean z, String str, String str2) {
            this.f117818a = z;
            this.f117819b = str;
            this.f117820c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f117818a) {
                zvf0.m220371D("e_official_pic_video_handle", this.f117819b, new j760("ext_data", this.f117820c));
            }
            Context context = view.getContext();
            context.startActivity(AccessTokenWebViewAct.m80150Z1(context, "", "https://invite.tantanapp.com/index.html"));
        }
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo96321b(URI uri, boolean z, String str, String str2) {
        return new C17770a(z, str2, str);
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: c */
    public String mo96322c() {
        return "<a href = \"tantan://redPacket/link\">.*</a>";
    }
}
