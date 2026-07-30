package p153l;

import android.text.style.ClickableSpan;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class siq extends ajq {

    /* JADX INFO: renamed from: l.siq$a */
    public class C20050a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f168858a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f168859b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f168860c;

        public C20050a(boolean z, String str, String str2) {
            this.f168858a = z;
            this.f168859b = str;
            this.f168860c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f168858a) {
                i4g0.m138495D("e_official_pic_video_handle", this.f168859b, new pf60("ext_data", this.f168860c));
            }
            CoreModule.f18273l.m143412i().mo180410V1(view.getContext(), "Chanel5.SchoolIdentifyPage.Shown", "");
        }
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo98010b(URI uri, boolean z, String str, String str2) {
        return new C20050a(z, str2, str);
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: c */
    public String mo98011c() {
        return "<a href = \"tantan://verification/school/rejected\">.*</a>";
    }
}
