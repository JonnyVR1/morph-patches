package p153l;

import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.net.URI;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ajq {

    /* JADX INFO: renamed from: a */
    public Pattern f71847a;

    /* JADX INFO: renamed from: b */
    public Pattern f71848b;

    /* JADX INFO: renamed from: l.ajq$a */
    public class C15727a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f71849a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f71850b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f71851c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URI f71852d;

        public C15727a(boolean z, String str, String str2, URI uri) {
            this.f71849a = z;
            this.f71850b = str;
            this.f71851c = str2;
            this.f71852d = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f71849a) {
                i4g0.m138495D("e_official_pic_video_handle", this.f71850b, new pf60("ext_data", this.f71851c));
                i4g0.m138523u("e_assistant_appeal", this.f71850b, jyb.m147494Y("ban_type", Integer.valueOf(uqb0.f180396b0.f170325b.me_().banStatus.code)));
                ajq.m98408h(this.f71852d, false);
            } else if (!TextUtils.isEmpty(this.f71851c)) {
                i4g0.m138520r(this.f71851c, this.f71850b);
            }
            nae0.m162083m(bnl0.m105506D(view.getContext()), Uri.parse(this.f71852d.toString()));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX INFO: renamed from: h */
    public static void m98408h(URI uri, boolean z) {
        String str;
        pf60[] pf60VarArr;
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
                    pf60VarArr = new pf60[]{jyb.m147494Y("vas_guide_type", "call2buysee")};
                } else if (TextUtils.equals("/partner", path)) {
                    pf60VarArr = new pf60[]{jyb.m147494Y("vas_guide_type", SummarizedPrivilegesId.supremePartner)};
                } else {
                    str = null;
                    pf60VarArr = null;
                }
            } else {
                str = null;
                pf60VarArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (z) {
                i4g0.m138492A(str, OMSDialogPositon.p_chat_view, pf60VarArr);
            } else {
                i4g0.m138523u(str, OMSDialogPositon.p_chat_view, pf60VarArr);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo98409a(URI uri) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan mo98010b(URI uri, boolean z, String str, String str2) {
        return new C15727a(z, str2, str, uri);
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo98011c();

    /* JADX INFO: renamed from: d */
    public Pattern m98410d() {
        if (this.f71847a == null) {
            this.f71847a = Pattern.compile(mo98011c());
        }
        return this.f71847a;
    }

    /* JADX INFO: renamed from: e */
    public String m98411e() {
        String strMo98011c = mo98011c();
        if (TextUtils.isEmpty(strMo98011c)) {
            return null;
        }
        int iIndexOf = strMo98011c.indexOf("\"") + 1;
        return strMo98011c.substring(iIndexOf, strMo98011c.indexOf("\"", iIndexOf));
    }

    /* JADX INFO: renamed from: f */
    public Pattern m98412f() {
        if (this.f71848b == null) {
            this.f71848b = Pattern.compile(m98411e());
        }
        return this.f71848b;
    }

    /* JADX INFO: renamed from: g */
    public ClickableSpan m98413g(URI uri, boolean z, String str, String str2) {
        if (uri != null && mo98409a(uri)) {
            return mo98010b(uri, z, str, str2);
        }
        return null;
    }
}
