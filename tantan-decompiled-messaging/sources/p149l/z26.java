package p149l;

import android.text.SpannableStringBuilder;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class z26 {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f201159a;

    /* JADX INFO: renamed from: b */
    public List<c36> f201160b = new ArrayList();

    public z26() {
        this.f201159a = null;
        this.f201159a = new SpannableStringBuilder();
    }

    /* JADX INFO: renamed from: a */
    public z26 m216869a(CharSequence charSequence, int i) {
        m216870b(charSequence, i, false);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public z26 m216870b(CharSequence charSequence, int i, boolean z) {
        m216871c(charSequence, i, false, z);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public z26 m216871c(CharSequence charSequence, int i, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b36(charSequence, i, 0));
        if (z2) {
            arrayList.add(new a36(charSequence, 0));
        }
        m216872d(charSequence, arrayList, z);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public z26 m216872d(CharSequence charSequence, List<c36> list, boolean z) {
        if (charSequence != null && (!m216875g() || !z)) {
            this.f201159a.insert(0, charSequence);
            m216877i(charSequence.length());
            if (!vwb.m200296J(list)) {
                this.f201160b.addAll(list);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public z26 m216873e(CharSequence charSequence, int i) {
        if (charSequence != null) {
            this.f201160b.add(new b36(charSequence, i, this.f201159a.length()));
            this.f201159a.append(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public z26 m216874f(CharSequence charSequence, c36 c36Var) {
        if (charSequence != null) {
            this.f201159a.append(charSequence);
            this.f201160b.add(c36Var);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public boolean m216875g() {
        return this.f201159a.length() == 0;
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m216876h() {
        String string = this.f201159a.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f201159a);
        if (!vwb.m200296J(this.f201160b)) {
            for (c36 c36Var : this.f201160b) {
                List<Object> listMo94649a = c36Var.mo94649a(string);
                if (!vwb.m200296J(listMo94649a)) {
                    for (Object obj : listMo94649a) {
                        if (NullChecker.m81303a(obj)) {
                            j760<Integer, Integer> index = c36Var.getIndex(string);
                            if (index.f116564a.intValue() >= 0) {
                                spannableStringBuilder.setSpan(obj, index.f116564a.intValue(), index.f116565b.intValue(), 33);
                            }
                        }
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: i */
    public final void m216877i(int i) {
        if (vwb.m200296J(this.f201160b)) {
            return;
        }
        for (c36 c36Var : this.f201160b) {
            if (c36Var instanceof x26) {
                ((x26) c36Var).m206845b(i);
            }
        }
    }
}
