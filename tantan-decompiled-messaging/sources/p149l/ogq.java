package p149l;

import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class ogq extends ahq {

    /* JADX INFO: renamed from: l.ogq$a */
    public class C18932a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f143892a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f143893b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f143894c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URI f143895d;

        public C18932a(boolean z, String str, String str2, URI uri) {
            this.f143892a = z;
            this.f143893b = str;
            this.f143894c = str2;
            this.f143895d = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f143892a) {
                zvf0.m220371D("e_official_pic_video_handle", this.f143893b, new j760("ext_data", this.f143894c));
            }
            j2e0.m139446m(xdl0.m208326D(view.getContext()), Uri.parse(this.f143895d.toString()));
        }
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo96321b(URI uri, boolean z, String str, String str2) {
        return new C18932a(z, str2, str, uri);
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: c */
    public String mo96322c() {
        return "<a href = \"tantan://switchaccount.*\">.*</a>";
    }
}
