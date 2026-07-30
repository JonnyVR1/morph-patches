package p153l;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class khq extends ajq {

    /* JADX INFO: renamed from: l.khq$a */
    public class C18167a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ URI f126899a;

        public C18167a(URI uri) {
            this.f126899a = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            i4g0.m138520r("e_paip_chat_quick", OMSDialogPositon.p_chat_view);
            nae0.m162083m(bnl0.m105506D(view.getContext()), Uri.parse(this.f126899a.toString()));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo98010b(URI uri, boolean z, String str, String str2) {
        return new C18167a(uri);
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: c */
    public String mo98011c() {
        return "<a href = \"tantan://create_ai_avatar\">.*</a>";
    }
}
