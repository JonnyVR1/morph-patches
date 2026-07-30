package p149l;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11245a;
import com.tantanapp.common.utils.NullChecker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class zyi0 {

    /* JADX INFO: renamed from: a */
    public f2j0 f205682a;

    /* JADX INFO: renamed from: b */
    public C21822a f205683b;

    /* JADX INFO: renamed from: c */
    public EditText f205684c;

    /* JADX INFO: renamed from: d */
    public boolean f205685d;

    /* JADX INFO: renamed from: e */
    public C11245a f205686e;

    /* JADX INFO: renamed from: f */
    public String f205687f = "";

    /* JADX INFO: renamed from: l.zyi0$a */
    public static class C21822a {

        /* JADX INFO: renamed from: a */
        public String f205688a;

        /* JADX INFO: renamed from: b */
        public String f205689b;

        /* JADX INFO: renamed from: c */
        public int f205690c;

        /* JADX INFO: renamed from: d */
        public int f205691d;

        public C21822a(String str, String str2, int i, int i2) {
            this.f205688a = str;
            this.f205689b = str2;
            this.f205690c = i;
            this.f205691d = i2;
        }
    }

    public zyi0(C11245a c11245a, f2j0 f2j0Var) {
        this.f205686e = c11245a;
        this.f205682a = f2j0Var;
        f2j0Var.m119218y(new d30() { // from class: l.xyi0
            @Override // p149l.d30
            public final void call() {
                this.f195053a.m220929i();
            }
        });
        this.f205682a.m119219z(new d30() { // from class: l.yyi0
            @Override // p149l.d30
            public final void call() {
                this.f200775a.m220930j();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m220923c() {
        this.f205683b = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m220924d() {
        if (NullChecker.m81303a(this.f205684c)) {
            Editable text = this.f205684c.getText();
            int selectionStart = this.f205684c.getSelectionStart();
            if (selectionStart > 0) {
                int i = selectionStart - 1;
                if ("#".equals(text.toString().substring(i, selectionStart))) {
                    text.delete(i, selectionStart);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m220925e(CharSequence charSequence) {
        C11245a c11245a = this.f205686e;
        if (c11245a == null || c11245a.f40655F == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f205687f = "";
            this.f205686e.f40655F.m191417b("");
            return;
        }
        String strReplaceAll = Pattern.compile("[^\\x{4e00}-\\x{9fa5}A-Za-z0-9]+").matcher(charSequence.toString()).replaceAll("");
        if (TextUtils.equals(this.f205687f, strReplaceAll)) {
            return;
        }
        this.f205687f = strReplaceAll;
        int length = strReplaceAll.length();
        C11245a c11245a2 = this.f205686e;
        if (length >= 30) {
            c11245a2.f40655F.m191417b(strReplaceAll.substring(0, 30));
        } else {
            c11245a2.f40655F.m191417b(strReplaceAll);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m220926f(Editable editable, int i, boolean z) {
        Matcher matcher = Pattern.compile("#[\\x{4e00}-\\x{9fa5}A-Za-z0-9]+").matcher(editable.toString());
        String str = "";
        if (!matcher.find()) {
            if (!z) {
                this.f205683b = null;
                m220928h();
                return;
            } else {
                this.f205683b = null;
                this.f205682a.m119198F();
                this.f205682a.m119217x("");
                return;
            }
        }
        String strGroup = matcher.group();
        int iIndexOf = editable.toString().indexOf(strGroup);
        int length = strGroup.length() + iIndexOf;
        if (i <= iIndexOf || i > length) {
            m220927g(editable, strGroup, iIndexOf);
            return;
        }
        String strSubstring = editable.toString().substring(iIndexOf, i);
        if (strSubstring.length() > 31) {
            osi0.m165783g("话题字数超出限制");
            this.f205685d = true;
            editable.replace(iIndexOf, i, strSubstring.substring(0, 31));
            return;
        }
        if (strSubstring.length() > 1) {
            C21822a c21822a = new C21822a(strSubstring, strSubstring.substring(1), iIndexOf, i);
            this.f205683b = c21822a;
            str = c21822a.f205689b;
        }
        if (!this.f205682a.m119208o()) {
            this.f205682a.m119198F();
        }
        this.f205682a.m119217x(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m220927g(Editable editable, String str, int i) {
        this.f205683b = null;
        editable.delete(i, i + 1);
        m220928h();
    }

    /* JADX INFO: renamed from: h */
    public final void m220928h() {
        if (this.f205682a.m119208o()) {
            this.f205682a.m119217x("");
            this.f205682a.m119205l();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m220929i() {
        EditText editText;
        if (this.f205683b == null || (editText = this.f205684c) == null) {
            m220924d();
            return;
        }
        Editable text = editText.getText();
        int iIndexOf = text.toString().indexOf(this.f205683b.f205688a);
        int length = this.f205683b.f205688a.length() + iIndexOf;
        if (iIndexOf >= 0) {
            text.delete(iIndexOf, length);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m220930j() {
        EditText editText;
        if (this.f205683b == null || (editText = this.f205684c) == null) {
            m220924d();
            return;
        }
        Editable text = editText.getText();
        int iIndexOf = text.toString().indexOf(this.f205683b.f205688a);
        int i = iIndexOf + 1;
        if (iIndexOf >= 0) {
            text.delete(iIndexOf, i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m220931k(EditText editText, CharSequence charSequence, int i, int i2, int i3) {
        boolean zContains;
        String str;
        int iIndexOf;
        this.f205684c = editText;
        m220925e(charSequence);
        Editable text = editText.getText();
        int selectionStart = editText.getSelectionStart();
        if (i3 > 0) {
            zContains = charSequence.subSequence(i, i3 + i).toString().contains("#");
            if (zContains && !this.f205685d && NullChecker.m81303a(this.f205683b)) {
                this.f205685d = false;
                String str2 = this.f205683b.f205688a;
                int iIndexOf2 = text.toString().indexOf(str2);
                if (iIndexOf2 >= 0) {
                    m220927g(text, str2, iIndexOf2);
                    return;
                }
                this.f205683b = null;
            }
        } else {
            int i4 = i - 1;
            if (i4 >= 0) {
                zContains = charSequence.subSequence(i4, i).toString().contains("#");
                if (zContains && NullChecker.m81303a(this.f205683b) && (iIndexOf = text.toString().indexOf((str = this.f205683b.f205688a))) >= 0) {
                    m220927g(text, str, iIndexOf);
                    return;
                }
            } else {
                zContains = false;
            }
        }
        this.f205685d = false;
        m220926f(text, selectionStart, zContains);
    }
}
