package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p046p1.mobile.putong.data.ChatAppealCheckData;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class iwd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        final String str = w2e0Var.m201098f().get("ticketId");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Act act = (Act) w2e0Var.m201094b();
        ChatAppealCheckData chatAppealCheckDataNew_ = ChatAppealCheckData.new_();
        chatAppealCheckDataNew_.ticketId = str;
        chatAppealCheckDataNew_.appeal_type = "content";
        vjf0.m198623e().m198639r(str);
        act.duringCreated(qib0.f154699N.userAppealCheck(chatAppealCheckDataNew_)).filter(new w9j() { // from class: l.fwd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((Envelope) obj));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.gwd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104697a.m138729i(act, str, (Envelope) obj);
            }
        }, new e30() { // from class: l.hwd0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f18813p4);
            }
        }));
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public int m138728h(String str) {
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
    public final /* synthetic */ void m138729i(Act act, String str, Envelope envelope) {
        if (NullChecker.m81303a(envelope.data.getModuleData(CommonData.class))) {
            String str2 = ((CommonData) envelope.data.getModuleData(CommonData.class)).stage;
            if (1 == m138728h(str2)) {
                m138730j(act, str);
                return;
            }
            if (2 == m138728h(str2)) {
                lsi0.m151593w(R$string.f18501f0);
                return;
            }
            if (5 == m138728h(str2)) {
                lsi0.m151593w(R$string.f18440d0);
                return;
            }
            if (4 == m138728h(str2)) {
                lsi0.m151593w(R$string.f18470e0);
            } else if (6 == m138728h(str2)) {
                lsi0.m151593w(R$string.f18440d0);
            } else if (3 == m138728h(str2)) {
                lsi0.m151593w(R$string.f18501f0);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m138730j(Act act, String str) {
        Intent intentM36167Z1 = AppealAct.m36167Z1(act, "content", PhoneNumber.new_(), "", str);
        intentM36167Z1.setFlags(268435456);
        act.startActivity(intentM36167Z1);
    }
}
