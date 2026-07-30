package p153l;

import android.text.SpannableStringBuilder;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class e46 {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f92057a;

    /* JADX INFO: renamed from: b */
    public List<h46> f92058b = new ArrayList();

    public e46() {
        this.f92057a = null;
        this.f92057a = new SpannableStringBuilder();
    }

    /* JADX INFO: renamed from: a */
    public e46 m119379a(CharSequence charSequence, int i) {
        m119380b(charSequence, i, false);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public e46 m119380b(CharSequence charSequence, int i, boolean z) {
        m119381c(charSequence, i, false, z);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public e46 m119381c(CharSequence charSequence, int i, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g46(charSequence, i, 0));
        if (z2) {
            arrayList.add(new f46(charSequence, 0));
        }
        m119382d(charSequence, arrayList, z);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public e46 m119382d(CharSequence charSequence, List<h46> list, boolean z) {
        if (charSequence != null && (!m119385g() || !z)) {
            this.f92057a.insert(0, charSequence);
            m119387i(charSequence.length());
            if (!jyb.m147479J(list)) {
                this.f92058b.addAll(list);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public e46 m119383e(CharSequence charSequence, int i) {
        if (charSequence != null) {
            this.f92058b.add(new g46(charSequence, i, this.f92057a.length()));
            this.f92057a.append(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public e46 m119384f(CharSequence charSequence, h46 h46Var) {
        if (charSequence != null) {
            this.f92057a.append(charSequence);
            this.f92058b.add(h46Var);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public boolean m119385g() {
        return this.f92057a.length() == 0;
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m119386h() {
        String string = this.f92057a.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f92057a);
        if (!jyb.m147479J(this.f92058b)) {
            for (h46 h46Var : this.f92058b) {
                List<Object> listMo114109a = h46Var.mo114109a(string);
                if (!jyb.m147479J(listMo114109a)) {
                    for (Object obj : listMo114109a) {
                        if (NullChecker.m82486a(obj)) {
                            pf60<Integer, Integer> index = h46Var.getIndex(string);
                            if (index.f152156a.intValue() >= 0) {
                                spannableStringBuilder.setSpan(obj, index.f152156a.intValue(), index.f152157b.intValue(), 33);
                            }
                        }
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: i */
    public final void m119387i(int i) {
        if (jyb.m147479J(this.f92058b)) {
            return;
        }
        for (h46 h46Var : this.f92058b) {
            if (h46Var instanceof c46) {
                ((c46) h46Var).m107861b(i);
            }
        }
    }
}
