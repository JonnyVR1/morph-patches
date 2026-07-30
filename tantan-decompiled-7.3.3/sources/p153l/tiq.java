package p153l;

import android.text.style.ClickableSpan;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class tiq extends ajq {

    /* JADX INFO: renamed from: l.tiq$a */
    public class C20328a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f174491a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f174492b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f174493c;

        public C20328a(boolean z, String str, String str2) {
            this.f174491a = z;
            this.f174492b = str;
            this.f174493c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f174491a) {
                i4g0.m138495D("e_official_pic_video_handle", this.f174492b, new pf60("ext_data", this.f174493c));
            }
            CoreModule.m30933P().m143412i().mo180410V1(view.getContext(), "Chanel4.SchoolIdentifyPage.Shown", "");
        }
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo98010b(URI uri, boolean z, String str, String str2) {
        return new C20328a(z, str2, str);
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: c */
    public String mo98011c() {
        return "<a href = \"tantan://verification/school/prompt\">.*</a>";
    }
}
