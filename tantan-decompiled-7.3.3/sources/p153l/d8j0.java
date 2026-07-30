package p153l;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11408a;
import com.tantanapp.common.utils.NullChecker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class d8j0 {

    /* JADX INFO: renamed from: a */
    public jbj0 f85604a;

    /* JADX INFO: renamed from: b */
    public C16483a f85605b;

    /* JADX INFO: renamed from: c */
    public EditText f85606c;

    /* JADX INFO: renamed from: d */
    public boolean f85607d;

    /* JADX INFO: renamed from: e */
    public C11408a f85608e;

    /* JADX INFO: renamed from: f */
    public String f85609f = "";

    /* JADX INFO: renamed from: l.d8j0$a */
    public static class C16483a {

        /* JADX INFO: renamed from: a */
        public String f85610a;

        /* JADX INFO: renamed from: b */
        public String f85611b;

        /* JADX INFO: renamed from: c */
        public int f85612c;

        /* JADX INFO: renamed from: d */
        public int f85613d;

        public C16483a(String str, String str2, int i, int i2) {
            this.f85610a = str;
            this.f85611b = str2;
            this.f85612c = i;
            this.f85613d = i2;
        }
    }

    public d8j0(C11408a c11408a, jbj0 jbj0Var) {
        this.f85608e = c11408a;
        this.f85604a = jbj0Var;
        jbj0Var.m144317y(new x20() { // from class: l.b8j0
            @Override // p153l.x20
            public final void call() {
                this.f75438a.m114845i();
            }
        });
        this.f85604a.m144318z(new x20() { // from class: l.c8j0
            @Override // p153l.x20
            public final void call() {
                this.f80218a.m114846j();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m114839c() {
        this.f85605b = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m114840d() {
        if (NullChecker.m82486a(this.f85606c)) {
            Editable text = this.f85606c.getText();
            int selectionStart = this.f85606c.getSelectionStart();
            if (selectionStart > 0) {
                int i = selectionStart - 1;
                if ("#".equals(text.toString().substring(i, selectionStart))) {
                    text.delete(i, selectionStart);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m114841e(CharSequence charSequence) {
        C11408a c11408a = this.f85608e;
        if (c11408a == null || c11408a.f41503F == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f85609f = "";
            this.f85608e.f41503F.m214890b("");
            return;
        }
        String strReplaceAll = Pattern.compile("[^\\x{4e00}-\\x{9fa5}A-Za-z0-9]+").matcher(charSequence.toString()).replaceAll("");
        if (TextUtils.equals(this.f85609f, strReplaceAll)) {
            return;
        }
        this.f85609f = strReplaceAll;
        int length = strReplaceAll.length();
        C11408a c11408a2 = this.f85608e;
        if (length >= 30) {
            c11408a2.f41503F.m214890b(strReplaceAll.substring(0, 30));
        } else {
            c11408a2.f41503F.m214890b(strReplaceAll);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m114842f(Editable editable, int i, boolean z) {
        Matcher matcher = Pattern.compile("#[\\x{4e00}-\\x{9fa5}A-Za-z0-9]+").matcher(editable.toString());
        String str = "";
        if (!matcher.find()) {
            if (!z) {
                this.f85605b = null;
                m114844h();
                return;
            } else {
                this.f85605b = null;
                this.f85604a.m144297F();
                this.f85604a.m144316x("");
                return;
            }
        }
        String strGroup = matcher.group();
        int iIndexOf = editable.toString().indexOf(strGroup);
        int length = strGroup.length() + iIndexOf;
        if (i <= iIndexOf || i > length) {
            m114843g(editable, strGroup, iIndexOf);
            return;
        }
        String strSubstring = editable.toString().substring(iIndexOf, i);
        if (strSubstring.length() > 31) {
            r1j0.m179420g("话题字数超出限制");
            this.f85607d = true;
            editable.replace(iIndexOf, i, strSubstring.substring(0, 31));
            return;
        }
        if (strSubstring.length() > 1) {
            C16483a c16483a = new C16483a(strSubstring, strSubstring.substring(1), iIndexOf, i);
            this.f85605b = c16483a;
            str = c16483a.f85611b;
        }
        if (!this.f85604a.m144307o()) {
            this.f85604a.m144297F();
        }
        this.f85604a.m144316x(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m114843g(Editable editable, String str, int i) {
        this.f85605b = null;
        editable.delete(i, i + 1);
        m114844h();
    }

    /* JADX INFO: renamed from: h */
    public final void m114844h() {
        if (this.f85604a.m144307o()) {
            this.f85604a.m144316x("");
            this.f85604a.m144304l();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m114845i() {
        EditText editText;
        if (this.f85605b == null || (editText = this.f85606c) == null) {
            m114840d();
            return;
        }
        Editable text = editText.getText();
        int iIndexOf = text.toString().indexOf(this.f85605b.f85610a);
        int length = this.f85605b.f85610a.length() + iIndexOf;
        if (iIndexOf >= 0) {
            text.delete(iIndexOf, length);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m114846j() {
        EditText editText;
        if (this.f85605b == null || (editText = this.f85606c) == null) {
            m114840d();
            return;
        }
        Editable text = editText.getText();
        int iIndexOf = text.toString().indexOf(this.f85605b.f85610a);
        int i = iIndexOf + 1;
        if (iIndexOf >= 0) {
            text.delete(iIndexOf, i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m114847k(EditText editText, CharSequence charSequence, int i, int i2, int i3) {
        boolean zContains;
        String str;
        int iIndexOf;
        this.f85606c = editText;
        m114841e(charSequence);
        Editable text = editText.getText();
        int selectionStart = editText.getSelectionStart();
        if (i3 > 0) {
            zContains = charSequence.subSequence(i, i3 + i).toString().contains("#");
            if (zContains && !this.f85607d && NullChecker.m82486a(this.f85605b)) {
                this.f85607d = false;
                String str2 = this.f85605b.f85610a;
                int iIndexOf2 = text.toString().indexOf(str2);
                if (iIndexOf2 >= 0) {
                    m114843g(text, str2, iIndexOf2);
                    return;
                }
                this.f85605b = null;
            }
        } else {
            int i4 = i - 1;
            if (i4 >= 0) {
                zContains = charSequence.subSequence(i4, i).toString().contains("#");
                if (zContains && NullChecker.m82486a(this.f85605b) && (iIndexOf = text.toString().indexOf((str = this.f85605b.f85610a))) >= 0) {
                    m114843g(text, str, iIndexOf);
                    return;
                }
            } else {
                zContains = false;
            }
        }
        this.f85607d = false;
        m114842f(text, selectionStart, zContains);
    }
}
