package p153l;

import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class oiq extends ajq {

    /* JADX INFO: renamed from: l.oiq$a */
    public class C19145a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f147564a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f147565b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f147566c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URI f147567d;

        public C19145a(boolean z, String str, String str2, URI uri) {
            this.f147564a = z;
            this.f147565b = str;
            this.f147566c = str2;
            this.f147567d = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f147564a) {
                i4g0.m138495D("e_official_pic_video_handle", this.f147565b, new pf60("ext_data", this.f147566c));
            }
            nae0.m162083m(bnl0.m105506D(view.getContext()), Uri.parse(this.f147567d.toString()));
        }
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo98010b(URI uri, boolean z, String str, String str2) {
        return new C19145a(z, str2, str, uri);
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: c */
    public String mo98011c() {
        return "<a href = \"tantan://switchaccount.*\">.*</a>";
    }
}
