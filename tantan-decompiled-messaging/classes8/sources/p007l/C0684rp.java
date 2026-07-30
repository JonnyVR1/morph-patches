package p007l;

import android.content.Intent;
import android.os.Bundle;
import com.p003p1.mobile.putong.core.p006ui.account.AccountInactiveAct;
import com.p003p1.mobile.putong.core.p006ui.account.AccountInactiveConfirmAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p1.mobile.putong.core.data.InactivateReason;
import com.p1.mobile.putong.core.data.InactivateReasonDetail;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import l.e30;
import l.vwb;

/* JADX INFO: renamed from: l.rp */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0684rp extends jq2<C0499bq> {

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f4081a;

    /* JADX INFO: renamed from: b */
    public String f4082b;

    public C0684rp(mcr mcrVar) {
        super(mcrVar);
        this.f4081a = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m10594j0(Bundle bundle) {
        if (act().getIntent().getIntExtra("page_type", 0) != 0) {
            InactivateReason serializableExtra = act().getIntent().getSerializableExtra("InactivateReason");
            InactivateReasonDetail inactivateReasonDetailNew_ = InactivateReasonDetail.new_();
            inactivateReasonDetailNew_.key = "reason_custom";
            inactivateReasonDetailNew_.name = "其他";
            serializableExtra.reasons.add(inactivateReasonDetailNew_);
            String str = serializableExtra.key;
            this.f4082b = str;
            boolean zEquals = "category_custom".equals(str);
            V v = this.viewModel;
            if (zEquals) {
                ((C0499bq) v).m8642v();
                return;
            } else {
                ((C0499bq) v).m8640s(serializableExtra);
                return;
            }
        }
        ArrayList<InactivateReason> arrayList = (NullChecker.a(CoreModule.d.g()) && NullChecker.a(((CoreAssetsSettings) CoreModule.d.g()).inactivateReason)) ? new ArrayList(((CoreAssetsSettings) CoreModule.d.g()).inactivateReason) : new ArrayList();
        InactivateReason inactivateReasonNew_ = InactivateReason.new_();
        inactivateReasonNew_.key = "category_reregister_or_change_phone";
        inactivateReasonNew_.name = "重新注册/换绑手机";
        inactivateReasonNew_.reasons = new ArrayList();
        InactivateReasonDetail inactivateReasonDetailNew_2 = InactivateReasonDetail.new_();
        inactivateReasonDetailNew_2.key = "reason_reregister_or_change_phone";
        inactivateReasonNew_.reasons.add(inactivateReasonDetailNew_2);
        arrayList.add(inactivateReasonNew_);
        Collections.shuffle(arrayList);
        for (InactivateReason inactivateReason : arrayList) {
            if (!vwb.J(inactivateReason.reasons)) {
                Collections.shuffle(inactivateReason.reasons);
            }
        }
        ((C0499bq) this.viewModel).m8641u(arrayList);
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.qp
            public final void call(Object obj) {
                this.f3969a.m10594j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m10595f0(InactivateReasonDetail inactivateReasonDetail) {
        this.f4081a.put(inactivateReasonDetail.key, inactivateReasonDetail.name);
    }

    /* JADX INFO: renamed from: g0 */
    public String m10596g0() {
        StringBuilder sb = new StringBuilder();
        if (this.f4081a.isEmpty()) {
            return "";
        }
        Iterator<String> it = this.f4081a.keySet().iterator();
        while (it.hasNext()) {
            sb.append(this.f4081a.get(it.next()));
            sb.append("；");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m10597h0() {
        return this.f4081a.containsKey("reason_custom");
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m10598i0() {
        return this.f4081a.isEmpty();
    }

    /* JADX INFO: renamed from: k0 */
    public void m10599k0(InactivateReason inactivateReason) {
        if (!"category_reregister_or_change_phone".equals(inactivateReason.key)) {
            m10601m0(AccountInactiveAct.m8440Z1(act(), 1, inactivateReason), 1);
        } else {
            act().startActivity(AccountInactiveConfirmAct.m8445Y1(act(), "category_reregister_or_change_phone", "reason_reregister_or_change_phone", "重新注册/换绑手机", ""));
            m10602n0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m10600l0(InactivateReasonDetail inactivateReasonDetail) {
        this.f4081a.remove(inactivateReasonDetail.key);
    }

    /* JADX INFO: renamed from: m0 */
    public void m10601m0(Intent intent, int i) {
        ((C0499bq) this.viewModel).act().startActivityForResult(intent, i);
    }

    /* JADX INFO: renamed from: n0 */
    public void m10602n0() {
        act().setResult(-1);
        act().lambda$debugItems$19();
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
