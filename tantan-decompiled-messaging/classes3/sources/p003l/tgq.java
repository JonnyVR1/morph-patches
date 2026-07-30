package p003l;

import android.text.style.ClickableSpan;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import java.net.URI;
import l.ahq;
import l.j760;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tgq extends ahq {

    /* JADX INFO: renamed from: l.tgq$a */
    public class C0549a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f7466a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f7467b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f7468c;

        public C0549a(boolean z, String str, String str2) {
            this.f7466a = z;
            this.f7467b = str;
            this.f7468c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f7466a) {
                zvf0.D("e_official_pic_video_handle", this.f7467b, new j760[]{new j760("ext_data", this.f7468c)});
            }
            CoreModule.P().i().V1(view.getContext(), "Chanel4.SchoolIdentifyPage.Shown", "");
        }
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan m7746b(URI uri, boolean z, String str, String str2) {
        return new C0549a(z, str2, str);
    }

    /* JADX INFO: renamed from: c */
    public String m7747c() {
        return "<a href = \"tantan://verification/school/prompt\">.*</a>";
    }
}
