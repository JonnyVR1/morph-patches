package p003l;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import java.net.URI;
import l.ahq;
import l.j2e0;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kfq extends ahq {

    /* JADX INFO: renamed from: l.kfq$a */
    public class C0377a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ URI f4917a;

        public C0377a(URI uri) {
            this.f4917a = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zvf0.r("e_paip_chat_quick", "p_chat_view");
            j2e0.m(xdl0.D(view.getContext()), Uri.parse(this.f4917a.toString()));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan m5649b(URI uri, boolean z, String str, String str2) {
        return new C0377a(uri);
    }

    /* JADX INFO: renamed from: c */
    public String m5650c() {
        return "<a href = \"tantan://create_ai_avatar\">.*</a>";
    }
}
