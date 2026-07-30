package p009l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.jji0;
import l.ml6;
import l.upa;
import l.xp5;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class f5g0 {

    /* JADX INFO: renamed from: a */
    public static List<j4m> f12817a;

    static {
        ArrayList arrayList = new ArrayList();
        f12817a = arrayList;
        arrayList.add(ssi0.m22364d());
        f12817a.add(fmr.m14529d());
        f12817a.add(a0r.m11179d());
        f12817a.add(few.m14433d());
        f12817a.add(ldw.m17855d());
        f12817a.add(i9j.m16284d());
        f12817a.add(yi3.m25376d());
        f12817a.add(v1g.m23231d());
        f12817a.add(icw.m16340d());
        f12817a.add(d9j.m13021d());
        f12817a.add(j9j.m16916d());
        f12817a.add(lwo.m18070d());
        f12817a.add(e9j.m13795d());
        f12817a.add(h9j.m15432d());
        f12817a.add(sau.m22015d());
        f12817a.add(g9j.m14845d());
        f12817a.add(amr.m11524d());
        f12817a.add(g7h0.m14797d());
        f12817a.add(sk80.m22228d());
        f12817a.add(uj30.m23056d());
        f12817a.add(ufh0.m22811d());
        f12817a.add(dtq.m13481d());
        f12817a.add(zzq.m26150d());
        f12817a.add(udc0.m22803d());
        f12817a.add(gs4.m15223d());
        f12817a.add(gt4.m15260d());
        f12817a.add(o4e.m19612d());
        f12817a.add(l5e0.m17692d());
        f12817a.add(qgc0.m20972d());
        f12817a.add(umf0.m23070d());
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m14262a() {
        SpannableString spannableString = new SpannableString(" · ");
        spannableString.setSpan(new ForegroundColorSpan(upa.z() ? Color.parseColor("#4D4D4D") : -1879048192), 0, 3, 33);
        spannableString.setSpan(new StyleSpan(1), 0, 3, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: b */
    public static j760<CharSequence, j4m> m14263b(pi6 pi6Var, Message message) {
        j760<List<CharSequence>, j4m> j760VarM14265d = m14265d(pi6Var, message);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        j4m j4mVar = null;
        for (int i = 0; i < ((List) j760VarM14265d.a).size(); i++) {
            CharSequence charSequence = (CharSequence) ((List) j760VarM14265d.a).get(i);
            if (!jji0.b(spannableStringBuilder)) {
                spannableStringBuilder.append(m14262a());
            }
            spannableStringBuilder.append(charSequence);
            j4mVar = (j4m) j760VarM14265d.b;
        }
        return j760.a(spannableStringBuilder, j4mVar);
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m14264c(pi6 pi6Var) {
        if (xp5.f(pi6Var.f18622a)) {
            return pi6Var.f18645x.getString(R.string.D9);
        }
        if (!ml6.d(pi6Var.f18622a)) {
            boolean zF = ml6.f(pi6Var.f18622a);
            Act act = pi6Var.f18645x;
            return zF ? act.getString(R.string.Eb, mqi0.m18538G(pi6Var.f18622a.createdTime)) : act.getString(R.string.wh, mqi0.m18538G(pi6Var.f18622a.createdTime));
        }
        return zz6.v0(pi6Var.f18645x.getString(R.string.wg), " " + pi6Var.f18645x.getString(R.string.wh, mqi0.m18538G(pi6Var.f18622a.createdTime)), Color.parseColor("#9D55E5"), Color.parseColor("#66000000"));
    }

    /* JADX INFO: renamed from: d */
    public static j760<List<CharSequence>, j4m> m14265d(pi6 pi6Var, Message message) {
        j4m j4mVar;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= f12817a.size()) {
                j4mVar = null;
                break;
            }
            j4mVar = f12817a.get(i);
            try {
                if (j4mVar.mo11180a(pi6Var, message)) {
                    CharSequence charSequenceMo11181b = j4mVar.mo11181b(pi6Var, message);
                    if (!jji0.b(charSequenceMo11181b)) {
                        arrayList.add(charSequenceMo11181b);
                        break;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (Exception e) {
                CrashHelper.c(new NullPointerException("SubtitleContentHelper err = " + e.toString()));
            }
            i++;
        }
        if (dsv.m13468d().mo11180a(pi6Var, message)) {
            arrayList.add(dsv.m13468d().mo11181b(pi6Var, message));
        }
        return j760.a(arrayList, j4mVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX INFO: renamed from: e */
    public static j760<SpannableStringBuilder, j4m> m14266e(pi6 pi6Var, Message message) {
        j4m j4mVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m14268g(pi6Var, message)) {
            j760<CharSequence, j4m> j760VarM14263b = m14263b(pi6Var, message);
            if (jji0.b((CharSequence) j760VarM14263b.a)) {
                j4mVar = null;
            } else {
                spannableStringBuilder.append((CharSequence) j760VarM14263b.a);
                j4mVar = (j4m) j760VarM14263b.b;
            }
        } else {
            j4mVar = null;
        }
        if (m14267f(pi6Var, message)) {
            CharSequence charSequenceM15850h = hi6.m15844g().m15850h(pi6Var, message);
            if (!jji0.b(spannableStringBuilder) && !jji0.b(charSequenceM15850h)) {
                spannableStringBuilder.append(m14262a());
            }
            boolean zM15852j = hi6.m15844g().m15852j(charSequenceM15850h);
            if (dsv.m13468d().mo11180a(pi6Var, message) && !zM15852j) {
                charSequenceM15850h = hi6.m15842e(pi6Var.f18622a.localDraft);
            }
            spannableStringBuilder.append(charSequenceM15850h);
        }
        return j760.a(spannableStringBuilder, j4mVar);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m14267f(pi6 pi6Var, Message message) {
        return (v1g.m23231d().mo11180a(pi6Var, message) || few.m14433d().mo11180a(pi6Var, message)) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m14268g(pi6 pi6Var, Message message) {
        return (pi6Var.f18623b.isAccountCancellation() || pi6Var.f18623b.isBannedNew()) ? false : true;
    }
}
