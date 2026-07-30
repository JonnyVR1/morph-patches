package p009l;

import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import java.net.URI;
import java.util.regex.Pattern;
import l.j2e0;
import l.j760;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class ahq {

    /* JADX INFO: renamed from: a */
    public Pattern f9519a;

    /* JADX INFO: renamed from: b */
    public Pattern f9520b;

    /* JADX INFO: renamed from: l.ahq$a */
    public class C0764a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f9521a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f9522b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f9523c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URI f9524d;

        public C0764a(boolean z, String str, String str2, URI uri) {
            this.f9521a = z;
            this.f9522b = str;
            this.f9523c = str2;
            this.f9524d = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f9521a) {
                zvf0.D("e_official_pic_video_handle", this.f9522b, new j760[]{new j760("ext_data", this.f9523c)});
                zvf0.u("e_assistant_appeal", this.f9522b, new j760[]{vwb.Y("ban_type", Integer.valueOf(qib0.b0.b.me_().banStatus.code))});
                ahq.m11442h(this.f9524d, false);
            } else if (!TextUtils.isEmpty(this.f9523c)) {
                zvf0.r(this.f9523c, this.f9522b);
            }
            j2e0.m(xdl0.D(view.getContext()), Uri.parse(this.f9524d.toString()));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX INFO: renamed from: h */
    public static void m11442h(URI uri, boolean z) {
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
                    j760VarArr = new j760[]{vwb.Y("vas_guide_type", "call2buysee")};
                } else if (TextUtils.equals("/partner", path)) {
                    j760VarArr = new j760[]{vwb.Y("vas_guide_type", "supremePartner")};
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
                zvf0.A(str, "p_chat_view", j760VarArr);
            } else {
                zvf0.u(str, "p_chat_view", j760VarArr);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m11443a(URI uri) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan m11444b(URI uri, boolean z, String str, String str2) {
        return new C0764a(z, str2, str, uri);
    }

    /* JADX INFO: renamed from: c */
    public abstract String m11445c();

    /* JADX INFO: renamed from: d */
    public Pattern m11446d() {
        if (this.f9519a == null) {
            this.f9519a = Pattern.compile(m11445c());
        }
        return this.f9519a;
    }

    /* JADX INFO: renamed from: e */
    public String m11447e() {
        String strM11445c = m11445c();
        if (TextUtils.isEmpty(strM11445c)) {
            return null;
        }
        int iIndexOf = strM11445c.indexOf("\"") + 1;
        return strM11445c.substring(iIndexOf, strM11445c.indexOf("\"", iIndexOf));
    }

    /* JADX INFO: renamed from: f */
    public Pattern m11448f() {
        if (this.f9520b == null) {
            this.f9520b = Pattern.compile(m11447e());
        }
        return this.f9520b;
    }

    /* JADX INFO: renamed from: g */
    public ClickableSpan m11449g(URI uri, boolean z, String str, String str2) {
        if (uri != null && m11443a(uri)) {
            return m11444b(uri, z, str, str2);
        }
        return null;
    }
}
