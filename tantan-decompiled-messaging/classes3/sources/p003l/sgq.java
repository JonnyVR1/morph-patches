package p003l;

import android.text.style.ClickableSpan;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import java.net.URI;
import l.ahq;
import l.j760;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class sgq extends ahq {

    /* JADX INFO: renamed from: l.sgq$a */
    public class C0533a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f7250a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f7251b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f7252c;

        public C0533a(boolean z, String str, String str2) {
            this.f7250a = z;
            this.f7251b = str;
            this.f7252c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f7250a) {
                zvf0.D("e_official_pic_video_handle", this.f7251b, new j760[]{new j760("ext_data", this.f7252c)});
            }
            CoreModule.l.i().V1(view.getContext(), "Chanel5.SchoolIdentifyPage.Shown", "");
        }
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan m7595b(URI uri, boolean z, String str, String str2) {
        return new C0533a(z, str2, str);
    }

    /* JADX INFO: renamed from: c */
    public String m7596c() {
        return "<a href = \"tantan://verification/school/rejected\">.*</a>";
    }
}
