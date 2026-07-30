package p153l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ndg0 {

    /* JADX INFO: renamed from: a */
    public static List<z6m> f141494a;

    static {
        ArrayList arrayList = new ArrayList();
        f141494a = arrayList;
        arrayList.add(v1j0.m199017d());
        f141494a.add(gor.m131130d());
        f141494a.add(b2r.m102220d());
        f141494a.add(dgw.m115757d());
        f141494a.add(jfw.m144729d());
        f141494a.add(ccj.m108710d());
        f141494a.add(mj3.m158568d());
        f141494a.add(j3g.m143349d());
        f141494a.add(gew.m130031d());
        f141494a.add(xbj.m209959d());
        f141494a.add(dcj.m115276d());
        f141494a.add(lyo.m156373d());
        f141494a.add(ybj.m215075d());
        f141494a.add(bcj.m103543d());
        f141494a.add(tcu.m190496d());
        f141494a.add(acj.m96858d());
        f141494a.add(bor.m105710d());
        f141494a.add(ofh0.m167454d());
        f141494a.add(ws80.m207748d());
        f141494a.add(is30.m141863d());
        f141494a.add(coh0.m111639d());
        f141494a.add(evq.m122812d());
        f141494a.add(a2r.m95723d());
        f141494a.add(bmc0.m105028d());
        f141494a.add(ft4.m127293d());
        f141494a.add(fu4.m127433d());
        f141494a.add(c6e.m108127d());
        f141494a.add(qde0.m176159d());
        f141494a.add(xoc0.m212464d());
        f141494a.add(dvf0.m118282d());
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m162705a() {
        SpannableString spannableString = new SpannableString(" · ");
        spannableString.setSpan(new ForegroundColorSpan(gra.m131778z() ? Color.parseColor("#4D4D4D") : -1879048192), 0, 3, 33);
        spannableString.setSpan(new StyleSpan(1), 0, 3, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: b */
    public static pf60<CharSequence, z6m> m162706b(sj6 sj6Var, Message message) {
        pf60<List<CharSequence>, z6m> pf60VarM162708d = m162708d(sj6Var, message);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z6m z6mVar = null;
        for (int i = 0; i < pf60VarM162708d.f152156a.size(); i++) {
            CharSequence charSequence = pf60VarM162708d.f152156a.get(i);
            if (!jsi0.m146843b(spannableStringBuilder)) {
                spannableStringBuilder.append(m162705a());
            }
            spannableStringBuilder.append(charSequence);
            z6mVar = pf60VarM162708d.f152157b;
        }
        return pf60.m172085a(spannableStringBuilder, z6mVar);
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m162707c(sj6 sj6Var) {
        if (br5.m106035f(sj6Var.f168926a)) {
            return sj6Var.f168949x.getString(R$string.f18605K9);
        }
        if (!pm6.m172916d(sj6Var.f168926a)) {
            boolean zM172918f = pm6.m172918f(sj6Var.f168926a);
            Act act = sj6Var.f168949x;
            return zM172918f ? act.getString(R$string.f18878Tb, pzi0.m174442G(sj6Var.f168926a.createdTime)) : act.getString(R$string.f18824Rh, pzi0.m174442G(sj6Var.f168926a.createdTime));
        }
        return c17.m107529v0(sj6Var.f168949x.getString(R$string.f18763Pg), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + sj6Var.f168949x.getString(R$string.f18824Rh, pzi0.m174442G(sj6Var.f168926a.createdTime)), Color.parseColor("#9D55E5"), Color.parseColor("#66000000"));
    }

    /* JADX INFO: renamed from: d */
    public static pf60<List<CharSequence>, z6m> m162708d(sj6 sj6Var, Message message) {
        z6m z6mVar;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= f141494a.size()) {
                z6mVar = null;
                break;
            }
            z6mVar = f141494a.get(i);
            try {
                if (z6mVar.mo95724a(sj6Var, message)) {
                    CharSequence charSequenceMo95725b = z6mVar.mo95725b(sj6Var, message);
                    if (!jsi0.m146843b(charSequenceMo95725b)) {
                        arrayList.add(charSequenceMo95725b);
                        break;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (Exception e) {
                CrashHelper.m82479c(new NullPointerException("SubtitleContentHelper err = " + e.toString()));
            }
            i++;
        }
        if (euv.m122757d().mo95724a(sj6Var, message)) {
            arrayList.add(euv.m122757d().mo95725b(sj6Var, message));
        }
        return pf60.m172085a(arrayList, z6mVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX INFO: renamed from: e */
    public static pf60<SpannableStringBuilder, z6m> m162709e(sj6 sj6Var, Message message) throws IOException {
        z6m z6mVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m162711g(sj6Var, message)) {
            pf60<CharSequence, z6m> pf60VarM162706b = m162706b(sj6Var, message);
            if (jsi0.m146843b(pf60VarM162706b.f152156a)) {
                z6mVar = null;
            } else {
                spannableStringBuilder.append(pf60VarM162706b.f152156a);
                z6mVar = pf60VarM162706b.f152157b;
            }
        } else {
            z6mVar = null;
        }
        if (m162710f(sj6Var, message)) {
            CharSequence charSequenceM150017h = kj6.m150011g().m150017h(sj6Var, message);
            if (!jsi0.m146843b(spannableStringBuilder) && !jsi0.m146843b(charSequenceM150017h)) {
                spannableStringBuilder.append(m162705a());
            }
            boolean zM150019j = kj6.m150011g().m150019j(charSequenceM150017h);
            if (euv.m122757d().mo95724a(sj6Var, message) && !zM150019j) {
                charSequenceM150017h = kj6.m150009e(sj6Var.f168926a.localDraft);
            }
            spannableStringBuilder.append(charSequenceM150017h);
        }
        return pf60.m172085a(spannableStringBuilder, z6mVar);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m162710f(sj6 sj6Var, Message message) {
        return (j3g.m143349d().mo95724a(sj6Var, message) || dgw.m115757d().mo95724a(sj6Var, message)) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m162711g(sj6 sj6Var, Message message) {
        return (sj6Var.f168927b.isAccountCancellation() || sj6Var.f168927b.isBannedNew()) ? false : true;
    }
}
