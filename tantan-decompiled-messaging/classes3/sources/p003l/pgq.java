package p003l;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URI;
import l.ahq;
import l.j760;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class pgq extends ahq {

    /* JADX INFO: renamed from: l.pgq$a */
    public class C0476a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f6408a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f6409b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f6410c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URI f6411d;

        public C0476a(boolean z, String str, String str2, URI uri) {
            this.f6408a = z;
            this.f6409b = str;
            this.f6410c = str2;
            this.f6411d = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (this.f6408a) {
                zvf0.D("e_official_pic_video_handle", this.f6409b, new j760[]{new j760("ext_data", this.f6410c)});
            }
            try {
                view.getContext().startActivity(new Intent("android.intent.action.DIAL", Uri.parse(this.f6411d.toString())));
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan m6858b(URI uri, boolean z, String str, String str2) {
        return new C0476a(z, str2, str, uri);
    }

    /* JADX INFO: renamed from: c */
    public String m6859c() {
        return "<a href = \"tel://.*\">.*</a>";
    }
}
