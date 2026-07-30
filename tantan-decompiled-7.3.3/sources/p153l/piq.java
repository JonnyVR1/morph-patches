package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class piq extends ajq {

    /* JADX INFO: renamed from: l.piq$a */
    public class C19375a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f152592a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f152593b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f152594c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URI f152595d;

        public C19375a(boolean z, String str, String str2, URI uri) {
            this.f152592a = z;
            this.f152593b = str;
            this.f152594c = str2;
            this.f152595d = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (this.f152592a) {
                i4g0.m138495D("e_official_pic_video_handle", this.f152593b, new pf60("ext_data", this.f152594c));
            }
            try {
                view.getContext().startActivity(new Intent("android.intent.action.DIAL", Uri.parse(this.f152595d.toString())));
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo98010b(URI uri, boolean z, String str, String str2) {
        return new C19375a(z, str2, str, uri);
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: c */
    public String mo98011c() {
        return "<a href = \"tel://.*\">.*</a>";
    }
}
