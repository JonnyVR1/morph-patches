package p149l;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class pgq extends ahq {

    /* JADX INFO: renamed from: l.pgq$a */
    public class C19208a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f148794a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f148795b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f148796c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URI f148797d;

        public C19208a(boolean z, String str, String str2, URI uri) {
            this.f148794a = z;
            this.f148795b = str;
            this.f148796c = str2;
            this.f148797d = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (this.f148794a) {
                zvf0.m220371D("e_official_pic_video_handle", this.f148795b, new j760("ext_data", this.f148796c));
            }
            try {
                view.getContext().startActivity(new Intent("android.intent.action.DIAL", Uri.parse(this.f148797d.toString())));
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo96321b(URI uri, boolean z, String str, String str2) {
        return new C19208a(z, str2, str, uri);
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: c */
    public String mo96322c() {
        return "<a href = \"tel://.*\">.*</a>";
    }
}
