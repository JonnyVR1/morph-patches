package p149l;

import android.text.style.ClickableSpan;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class sgq extends ahq {

    /* JADX INFO: renamed from: l.sgq$a */
    public class C19942a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f164460a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f164461b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f164462c;

        public C19942a(boolean z, String str, String str2) {
            this.f164460a = z;
            this.f164461b = str;
            this.f164462c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f164460a) {
                zvf0.m220371D("e_official_pic_video_handle", this.f164461b, new j760("ext_data", this.f164462c));
            }
            CoreModule.f17554l.m94658i().mo158318V1(view.getContext(), "Chanel5.SchoolIdentifyPage.Shown", "");
        }
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo96321b(URI uri, boolean z, String str, String str2) {
        return new C19942a(z, str2, str);
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: c */
    public String mo96322c() {
        return "<a href = \"tantan://verification/school/rejected\">.*</a>";
    }
}
