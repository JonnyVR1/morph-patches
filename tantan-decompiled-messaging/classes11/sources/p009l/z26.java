package p009l;

import android.text.SpannableStringBuilder;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class z26 {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f23323a;

    /* JADX INFO: renamed from: b */
    public List<c36> f23324b = new ArrayList();

    public z26() {
        this.f23323a = null;
        this.f23323a = new SpannableStringBuilder();
    }

    /* JADX INFO: renamed from: a */
    public z26 m25578a(CharSequence charSequence, int i) {
        m25579b(charSequence, i, false);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public z26 m25579b(CharSequence charSequence, int i, boolean z) {
        m25580c(charSequence, i, false, z);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public z26 m25580c(CharSequence charSequence, int i, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b36(charSequence, i, 0));
        if (z2) {
            arrayList.add(new a36(charSequence, 0));
        }
        m25581d(charSequence, arrayList, z);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public z26 m25581d(CharSequence charSequence, List<c36> list, boolean z) {
        if (charSequence != null && (!m25584g() || !z)) {
            this.f23323a.insert(0, charSequence);
            m25586i(charSequence.length());
            if (!vwb.J(list)) {
                this.f23324b.addAll(list);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public z26 m25582e(CharSequence charSequence, int i) {
        if (charSequence != null) {
            this.f23324b.add(new b36(charSequence, i, this.f23323a.length()));
            this.f23323a.append(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public z26 m25583f(CharSequence charSequence, c36 c36Var) {
        if (charSequence != null) {
            this.f23323a.append(charSequence);
            this.f23324b.add(c36Var);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public boolean m25584g() {
        return this.f23323a.length() == 0;
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m25585h() {
        String string = this.f23323a.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f23323a);
        if (!vwb.J(this.f23324b)) {
            for (c36 c36Var : this.f23324b) {
                List<Object> listMo11184a = c36Var.mo11184a(string);
                if (!vwb.J(listMo11184a)) {
                    for (Object obj : listMo11184a) {
                        if (NullChecker.a(obj)) {
                            j760<Integer, Integer> index = c36Var.getIndex(string);
                            if (((Integer) index.a).intValue() >= 0) {
                                spannableStringBuilder.setSpan(obj, ((Integer) index.a).intValue(), ((Integer) index.b).intValue(), 33);
                            }
                        }
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: i */
    public final void m25586i(int i) {
        if (vwb.J(this.f23324b)) {
            return;
        }
        for (c36 c36Var : this.f23324b) {
            if (c36Var instanceof x26) {
                ((x26) c36Var).m24679b(i);
            }
        }
    }
}
