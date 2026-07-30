package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p051p1.mobile.putong.data.ChatAppealCheckData;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public class m4e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        final String str = abe0Var.m96743f().get("ticketId");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Act act = (Act) abe0Var.m96739b();
        ChatAppealCheckData chatAppealCheckDataNew_ = ChatAppealCheckData.new_();
        chatAppealCheckDataNew_.ticketId = str;
        chatAppealCheckDataNew_.appeal_type = "content";
        esf0.m122324e().m122340r(str);
        act.duringCreated(uqb0.f180382N.userAppealCheck(chatAppealCheckDataNew_)).filter(new qcj() { // from class: l.j4e0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((Envelope) obj));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.k4e0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123885a.m157001i(act, str, (Envelope) obj);
            }
        }, new y20() { // from class: l.l4e0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f19605r4);
            }
        }));
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public int m157000h(String str) {
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
    public final /* synthetic */ void m157001i(Act act, String str, Envelope envelope) {
        if (NullChecker.m82486a(envelope.data.getModuleData(CommonData.class))) {
            String str2 = ((CommonData) envelope.data.getModuleData(CommonData.class)).stage;
            if (1 == m157000h(str2)) {
                m157002j(act, str);
                return;
            }
            if (2 == m157000h(str2)) {
                o1j0.m165649w(R$string.f19231f0);
                return;
            }
            if (5 == m157000h(str2)) {
                o1j0.m165649w(R$string.f19170d0);
                return;
            }
            if (4 == m157000h(str2)) {
                o1j0.m165649w(R$string.f19200e0);
            } else if (6 == m157000h(str2)) {
                o1j0.m165649w(R$string.f19170d0);
            } else if (3 == m157000h(str2)) {
                o1j0.m165649w(R$string.f19231f0);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m157002j(Act act, String str) {
        Intent intentM37170a2 = AppealAct.m37170a2(act, "content", PhoneNumber.new_(), "", str);
        intentM37170a2.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        act.startActivity(intentM37170a2);
    }
}
