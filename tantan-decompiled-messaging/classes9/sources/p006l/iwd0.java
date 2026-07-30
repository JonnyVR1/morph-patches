package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p1.mobile.putong.data.ChatAppealCheckData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.PhoneNumber;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f30;
import l.lsi0;
import l.mkd0;
import l.vjf0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class iwd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        final String str = w2e0Var.m26160f().get("ticketId");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Act actM26156b = w2e0Var.m26156b();
        ChatAppealCheckData chatAppealCheckDataNew_ = ChatAppealCheckData.new_();
        chatAppealCheckDataNew_.ticketId = str;
        chatAppealCheckDataNew_.appeal_type = "content";
        vjf0.e().r(str);
        actM26156b.duringCreated(qib0.f19790N.userAppealCheck(chatAppealCheckDataNew_)).filter(new w9j() { // from class: l.fwd0
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((Envelope) obj));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.gwd0
            public final void call(Object obj) {
                this.f13545a.m17136i(actM26156b, str, (Envelope) obj);
            }
        }, new e30() { // from class: l.hwd0
            public final void call(Object obj) {
                lsi0.h(R$string.f2802p4);
            }
        }));
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public int m17135h(String str) {
        if (TextUtils.equals(str, "ready")) {
            return 1;
        }
        if (TextUtils.equals(str, "process")) {
            return 2;
        }
        if (TextUtils.equals(str, "finished")) {
            return 3;
        }
        if (TextUtils.equals(str, "normal")) {
            return 4;
        }
        if (TextUtils.equals(str, "failed")) {
            return 5;
        }
        return TextUtils.equals(str, "invalid") ? 6 : 0;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m17136i(Act act, String str, Envelope envelope) {
        if (NullChecker.a(envelope.data.getModuleData(CommonData.class))) {
            String str2 = envelope.data.getModuleData(CommonData.class).stage;
            if (1 == m17135h(str2)) {
                m17137j(act, str);
                return;
            }
            if (2 == m17135h(str2)) {
                lsi0.w(R$string.f2490f0);
                return;
            }
            if (5 == m17135h(str2)) {
                lsi0.w(R$string.f2429d0);
                return;
            }
            if (4 == m17135h(str2)) {
                lsi0.w(R$string.f2459e0);
            } else if (6 == m17135h(str2)) {
                lsi0.w(R$string.f2429d0);
            } else if (3 == m17135h(str2)) {
                lsi0.w(R$string.f2490f0);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m17137j(Act act, String str) {
        Intent intentZ1 = AppealAct.Z1(act, "content", PhoneNumber.new_(), "", str);
        intentZ1.setFlags(268435456);
        act.startActivity(intentZ1);
    }
}
