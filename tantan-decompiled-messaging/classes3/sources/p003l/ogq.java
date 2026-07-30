package p003l;

import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import java.net.URI;
import l.ahq;
import l.j2e0;
import l.j760;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ogq extends ahq {

    /* JADX INFO: renamed from: l.ogq$a */
    public class C0455a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f6155a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f6156b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f6157c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URI f6158d;

        public C0455a(boolean z, String str, String str2, URI uri) {
            this.f6155a = z;
            this.f6156b = str;
            this.f6157c = str2;
            this.f6158d = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f6155a) {
                zvf0.D("e_official_pic_video_handle", this.f6156b, new j760[]{new j760("ext_data", this.f6157c)});
            }
            j2e0.m(xdl0.D(view.getContext()), Uri.parse(this.f6158d.toString()));
        }
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan m6708b(URI uri, boolean z, String str, String str2) {
        return new C0455a(z, str2, str, uri);
    }

    /* JADX INFO: renamed from: c */
    public String m6709c() {
        return "<a href = \"tantan://switchaccount.*\">.*</a>";
    }
}
