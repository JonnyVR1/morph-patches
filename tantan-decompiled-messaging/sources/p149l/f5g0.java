package p149l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class f5g0 {

    /* JADX INFO: renamed from: a */
    public static List<j4m> f95181a;

    static {
        ArrayList arrayList = new ArrayList();
        f95181a = arrayList;
        arrayList.add(ssi0.m185748d());
        f95181a.add(fmr.m122197d());
        f95181a.add(a0r.m94462d());
        f95181a.add(few.m121071d());
        f95181a.add(ldw.m149473d());
        f95181a.add(i9j.m135056d());
        f95181a.add(yi3.m214881d());
        f95181a.add(v1g.m196548d());
        f95181a.add(icw.m135369d());
        f95181a.add(d9j.m110461d());
        f95181a.add(j9j.m140570d());
        f95181a.add(lwo.m151982d());
        f95181a.add(e9j.m115350d());
        f95181a.add(h9j.m130027d());
        f95181a.add(sau.m183099d());
        f95181a.add(g9j.m124784d());
        f95181a.add(amr.m97684d());
        f95181a.add(g7h0.m124693d());
        f95181a.add(sk80.m184577d());
        f95181a.add(uj30.m194001d());
        f95181a.add(ufh0.m193383d());
        f95181a.add(dtq.m113580d());
        f95181a.add(zzq.m221027d());
        f95181a.add(udc0.m193128d());
        f95181a.add(gs4.m127777d());
        f95181a.add(gt4.m127875d());
        f95181a.add(o4e.m162558d());
        f95181a.add(l5e0.m148621d());
        f95181a.add(qgc0.m174396d());
        f95181a.add(umf0.m194347d());
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m119495a() {
        SpannableString spannableString = new SpannableString(" · ");
        spannableString.setSpan(new ForegroundColorSpan(upa.m194847z() ? Color.parseColor("#4D4D4D") : -1879048192), 0, 3, 33);
        spannableString.setSpan(new StyleSpan(1), 0, 3, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: b */
    public static j760<CharSequence, j4m> m119496b(pi6 pi6Var, Message message) {
        j760<List<CharSequence>, j4m> j760VarM119498d = m119498d(pi6Var, message);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        j4m j4mVar = null;
        for (int i = 0; i < j760VarM119498d.f116564a.size(); i++) {
            CharSequence charSequence = j760VarM119498d.f116564a.get(i);
            if (!jji0.m141806b(spannableStringBuilder)) {
                spannableStringBuilder.append(m119495a());
            }
            spannableStringBuilder.append(charSequence);
            j4mVar = j760VarM119498d.f116565b;
        }
        return j760.m140076a(spannableStringBuilder, j4mVar);
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m119497c(pi6 pi6Var) {
        if (xp5.m210466f(pi6Var.f149101a)) {
            return pi6Var.f149124x.getString(R$string.f17666D9);
        }
        if (!ml6.m155119d(pi6Var.f149101a)) {
            boolean zM155121f = ml6.m155121f(pi6Var.f149101a);
            Act act = pi6Var.f149124x;
            return zM155121f ? act.getString(R$string.f17698Eb, mqi0.m155932G(pi6Var.f149101a.createdTime)) : act.getString(R$string.f19036wh, mqi0.m155932G(pi6Var.f149101a.createdTime));
        }
        return zz6.m221005v0(pi6Var.f149124x.getString(R$string.f19035wg), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + pi6Var.f149124x.getString(R$string.f19036wh, mqi0.m155932G(pi6Var.f149101a.createdTime)), Color.parseColor("#9D55E5"), Color.parseColor("#66000000"));
    }

    /* JADX INFO: renamed from: d */
    public static j760<List<CharSequence>, j4m> m119498d(pi6 pi6Var, Message message) {
        j4m j4mVar;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= f95181a.size()) {
                j4mVar = null;
                break;
            }
            j4mVar = f95181a.get(i);
            try {
                if (j4mVar.mo94463a(pi6Var, message)) {
                    CharSequence charSequenceMo94464b = j4mVar.mo94464b(pi6Var, message);
                    if (!jji0.m141806b(charSequenceMo94464b)) {
                        arrayList.add(charSequenceMo94464b);
                        break;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (Exception e) {
                CrashHelper.m81296c(new NullPointerException("SubtitleContentHelper err = " + e.toString()));
            }
            i++;
        }
        if (dsv.m113497d().mo94463a(pi6Var, message)) {
            arrayList.add(dsv.m113497d().mo94464b(pi6Var, message));
        }
        return j760.m140076a(arrayList, j4mVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX INFO: renamed from: e */
    public static j760<SpannableStringBuilder, j4m> m119499e(pi6 pi6Var, Message message) {
        j4m j4mVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m119501g(pi6Var, message)) {
            j760<CharSequence, j4m> j760VarM119496b = m119496b(pi6Var, message);
            if (jji0.m141806b(j760VarM119496b.f116564a)) {
                j4mVar = null;
            } else {
                spannableStringBuilder.append(j760VarM119496b.f116564a);
                j4mVar = j760VarM119496b.f116565b;
            }
        } else {
            j4mVar = null;
        }
        if (m119500f(pi6Var, message)) {
            CharSequence charSequenceM131208h = hi6.m131202g().m131208h(pi6Var, message);
            if (!jji0.m141806b(spannableStringBuilder) && !jji0.m141806b(charSequenceM131208h)) {
                spannableStringBuilder.append(m119495a());
            }
            boolean zM131210j = hi6.m131202g().m131210j(charSequenceM131208h);
            if (dsv.m113497d().mo94463a(pi6Var, message) && !zM131210j) {
                charSequenceM131208h = hi6.m131200e(pi6Var.f149101a.localDraft);
            }
            spannableStringBuilder.append(charSequenceM131208h);
        }
        return j760.m140076a(spannableStringBuilder, j4mVar);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m119500f(pi6 pi6Var, Message message) {
        return (v1g.m196548d().mo94463a(pi6Var, message) || few.m121071d().mo94463a(pi6Var, message)) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m119501g(pi6 pi6Var, Message message) {
        return (pi6Var.f149102b.isAccountCancellation() || pi6Var.f149102b.isBannedNew()) ? false : true;
    }
}
