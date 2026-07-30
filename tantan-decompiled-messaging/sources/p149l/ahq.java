package p149l;

import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.net.URI;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ahq {

    /* JADX INFO: renamed from: a */
    public Pattern f69676a;

    /* JADX INFO: renamed from: b */
    public Pattern f69677b;

    /* JADX INFO: renamed from: l.ahq$a */
    public class C15625a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f69678a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f69679b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f69680c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URI f69681d;

        public C15625a(boolean z, String str, String str2, URI uri) {
            this.f69678a = z;
            this.f69679b = str;
            this.f69680c = str2;
            this.f69681d = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f69678a) {
                zvf0.m220371D("e_official_pic_video_handle", this.f69679b, new j760("ext_data", this.f69680c));
                zvf0.m220399u("e_assistant_appeal", this.f69679b, vwb.m200311Y("ban_type", Integer.valueOf(qib0.f154713b0.f139231b.me_().banStatus.code)));
                ahq.m96550h(this.f69681d, false);
            } else if (!TextUtils.isEmpty(this.f69680c)) {
                zvf0.m220396r(this.f69680c, this.f69679b);
            }
            j2e0.m139446m(xdl0.m208326D(view.getContext()), Uri.parse(this.f69681d.toString()));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX INFO: renamed from: h */
    public static void m96550h(URI uri, boolean z) {
        String str;
        j760[] j760VarArr;
        if (uri == null) {
            return;
        }
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.startsWith("tantan")) {
            String authority = uri.getAuthority();
            String path = uri.getPath();
            if (TextUtils.equals("vip", authority)) {
                str = "e_vas_guide_assistant";
                if (TextUtils.equals("/see", path)) {
                    j760VarArr = new j760[]{vwb.m200311Y("vas_guide_type", "call2buysee")};
                } else if (TextUtils.equals("/partner", path)) {
                    j760VarArr = new j760[]{vwb.m200311Y("vas_guide_type", SummarizedPrivilegesId.supremePartner)};
                } else {
                    str = null;
                    j760VarArr = null;
                }
            } else {
                str = null;
                j760VarArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (z) {
                zvf0.m220368A(str, OMSDialogPositon.p_chat_view, j760VarArr);
            } else {
                zvf0.m220399u(str, OMSDialogPositon.p_chat_view, j760VarArr);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo96551a(URI uri) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan mo96321b(URI uri, boolean z, String str, String str2) {
        return new C15625a(z, str2, str, uri);
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo96322c();

    /* JADX INFO: renamed from: d */
    public Pattern m96552d() {
        if (this.f69676a == null) {
            this.f69676a = Pattern.compile(mo96322c());
        }
        return this.f69676a;
    }

    /* JADX INFO: renamed from: e */
    public String m96553e() {
        String strMo96322c = mo96322c();
        if (TextUtils.isEmpty(strMo96322c)) {
            return null;
        }
        int iIndexOf = strMo96322c.indexOf("\"") + 1;
        return strMo96322c.substring(iIndexOf, strMo96322c.indexOf("\"", iIndexOf));
    }

    /* JADX INFO: renamed from: f */
    public Pattern m96554f() {
        if (this.f69677b == null) {
            this.f69677b = Pattern.compile(m96553e());
        }
        return this.f69677b;
    }

    /* JADX INFO: renamed from: g */
    public ClickableSpan m96555g(URI uri, boolean z, String str, String str2) {
        if (uri != null && mo96551a(uri)) {
            return mo96321b(uri, z, str, str2);
        }
        return null;
    }
}
