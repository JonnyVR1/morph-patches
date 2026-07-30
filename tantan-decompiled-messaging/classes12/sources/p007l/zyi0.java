package p007l;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2089a;
import com.tantanapp.common.utils.NullChecker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.d30;
import l.osi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zyi0 {

    /* JADX INFO: renamed from: a */
    public f2j0 f15957a;

    /* JADX INFO: renamed from: b */
    public C2558a f15958b;

    /* JADX INFO: renamed from: c */
    public EditText f15959c;

    /* JADX INFO: renamed from: d */
    public boolean f15960d;

    /* JADX INFO: renamed from: e */
    public C2089a f15961e;

    /* JADX INFO: renamed from: f */
    public String f15962f = "";

    /* JADX INFO: renamed from: l.zyi0$a */
    public static class C2558a {

        /* JADX INFO: renamed from: a */
        public String f15963a;

        /* JADX INFO: renamed from: b */
        public String f15964b;

        /* JADX INFO: renamed from: c */
        public int f15965c;

        /* JADX INFO: renamed from: d */
        public int f15966d;

        public C2558a(String str, String str2, int i, int i2) {
            this.f15963a = str;
            this.f15964b = str2;
            this.f15965c = i;
            this.f15966d = i2;
        }
    }

    public zyi0(C2089a c2089a, f2j0 f2j0Var) {
        this.f15961e = c2089a;
        this.f15957a = f2j0Var;
        f2j0Var.m10029y(new d30() { // from class: l.xyi0
            public final void call() {
                this.f15182a.m17603i();
            }
        });
        this.f15957a.m10030z(new d30() { // from class: l.yyi0
            public final void call() {
                this.f15532a.m17604j();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m17597c() {
        this.f15958b = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m17598d() {
        if (NullChecker.a(this.f15959c)) {
            Editable text = this.f15959c.getText();
            int selectionStart = this.f15959c.getSelectionStart();
            if (selectionStart > 0) {
                int i = selectionStart - 1;
                if ("#".equals(text.toString().substring(i, selectionStart))) {
                    text.delete(i, selectionStart);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m17599e(CharSequence charSequence) {
        C2089a c2089a = this.f15961e;
        if (c2089a == null || c2089a.f2116F == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f15962f = "";
            this.f15961e.f2116F.m14707b("");
            return;
        }
        String strReplaceAll = Pattern.compile("[^\\x{4e00}-\\x{9fa5}A-Za-z0-9]+").matcher(charSequence.toString()).replaceAll("");
        if (TextUtils.equals(this.f15962f, strReplaceAll)) {
            return;
        }
        this.f15962f = strReplaceAll;
        int length = strReplaceAll.length();
        C2089a c2089a2 = this.f15961e;
        if (length >= 30) {
            c2089a2.f2116F.m14707b(strReplaceAll.substring(0, 30));
        } else {
            c2089a2.f2116F.m14707b(strReplaceAll);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m17600f(Editable editable, int i, boolean z) {
        Matcher matcher = Pattern.compile("#[\\x{4e00}-\\x{9fa5}A-Za-z0-9]+").matcher(editable.toString());
        String str = "";
        if (!matcher.find()) {
            if (!z) {
                this.f15958b = null;
                m17602h();
                return;
            } else {
                this.f15958b = null;
                this.f15957a.m10009F();
                this.f15957a.m10028x("");
                return;
            }
        }
        String strGroup = matcher.group();
        int iIndexOf = editable.toString().indexOf(strGroup);
        int length = strGroup.length() + iIndexOf;
        if (i <= iIndexOf || i > length) {
            m17601g(editable, strGroup, iIndexOf);
            return;
        }
        String strSubstring = editable.toString().substring(iIndexOf, i);
        if (strSubstring.length() > 31) {
            osi0.g("话题字数超出限制");
            this.f15960d = true;
            editable.replace(iIndexOf, i, strSubstring.substring(0, 31));
            return;
        }
        if (strSubstring.length() > 1) {
            C2558a c2558a = new C2558a(strSubstring, strSubstring.substring(1), iIndexOf, i);
            this.f15958b = c2558a;
            str = c2558a.f15964b;
        }
        if (!this.f15957a.m10019o()) {
            this.f15957a.m10009F();
        }
        this.f15957a.m10028x(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m17601g(Editable editable, String str, int i) {
        this.f15958b = null;
        editable.delete(i, i + 1);
        m17602h();
    }

    /* JADX INFO: renamed from: h */
    public final void m17602h() {
        if (this.f15957a.m10019o()) {
            this.f15957a.m10028x("");
            this.f15957a.m10016l();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m17603i() {
        EditText editText;
        if (this.f15958b == null || (editText = this.f15959c) == null) {
            m17598d();
            return;
        }
        Editable text = editText.getText();
        int iIndexOf = text.toString().indexOf(this.f15958b.f15963a);
        int length = this.f15958b.f15963a.length() + iIndexOf;
        if (iIndexOf >= 0) {
            text.delete(iIndexOf, length);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m17604j() {
        EditText editText;
        if (this.f15958b == null || (editText = this.f15959c) == null) {
            m17598d();
            return;
        }
        Editable text = editText.getText();
        int iIndexOf = text.toString().indexOf(this.f15958b.f15963a);
        int i = iIndexOf + 1;
        if (iIndexOf >= 0) {
            text.delete(iIndexOf, i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m17605k(EditText editText, CharSequence charSequence, int i, int i2, int i3) {
        boolean zContains;
        String str;
        int iIndexOf;
        this.f15959c = editText;
        m17599e(charSequence);
        Editable text = editText.getText();
        int selectionStart = editText.getSelectionStart();
        if (i3 > 0) {
            zContains = charSequence.subSequence(i, i3 + i).toString().contains("#");
            if (zContains && !this.f15960d && NullChecker.a(this.f15958b)) {
                this.f15960d = false;
                String str2 = this.f15958b.f15963a;
                int iIndexOf2 = text.toString().indexOf(str2);
                if (iIndexOf2 >= 0) {
                    m17601g(text, str2, iIndexOf2);
                    return;
                }
                this.f15958b = null;
            }
        } else {
            int i4 = i - 1;
            if (i4 >= 0) {
                zContains = charSequence.subSequence(i4, i).toString().contains("#");
                if (zContains && NullChecker.a(this.f15958b) && (iIndexOf = text.toString().indexOf((str = this.f15958b.f15963a))) >= 0) {
                    m17601g(text, str, iIndexOf);
                    return;
                }
            } else {
                zContains = false;
            }
        }
        this.f15960d = false;
        m17600f(text, selectionStart, zContains);
    }
}
