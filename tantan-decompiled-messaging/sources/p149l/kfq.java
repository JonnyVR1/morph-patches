package p149l;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class kfq extends ahq {

    /* JADX INFO: renamed from: l.kfq$a */
    public class C18005a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ URI f122958a;

        public C18005a(URI uri) {
            this.f122958a = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zvf0.m220396r("e_paip_chat_quick", OMSDialogPositon.p_chat_view);
            j2e0.m139446m(xdl0.m208326D(view.getContext()), Uri.parse(this.f122958a.toString()));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo96321b(URI uri, boolean z, String str, String str2) {
        return new C18005a(uri);
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: c */
    public String mo96322c() {
        return "<a href = \"tantan://create_ai_avatar\">.*</a>";
    }
}
