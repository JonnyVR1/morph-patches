package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.InactivateReason;
import com.p046p1.mobile.putong.core.data.InactivateReasonDetail;
import com.p046p1.mobile.putong.core.p053ui.account.AccountInactiveAct;
import com.p046p1.mobile.putong.core.p053ui.account.AccountInactiveConfirmAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.rp */
/* JADX INFO: loaded from: classes8.dex */
public class C19746rp extends jq2<C15940bq> {

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f160461a;

    /* JADX INFO: renamed from: b */
    public String f160462b;

    public C19746rp(mcr mcrVar) {
        super(mcrVar);
        this.f160461a = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m180277j0(Bundle bundle) {
        if (act().getIntent().getIntExtra("page_type", 0) != 0) {
            InactivateReason inactivateReason = (InactivateReason) act().getIntent().getSerializableExtra("InactivateReason");
            InactivateReasonDetail inactivateReasonDetailNew_ = InactivateReasonDetail.new_();
            inactivateReasonDetailNew_.key = "reason_custom";
            inactivateReasonDetailNew_.name = "其他";
            inactivateReason.reasons.add(inactivateReasonDetailNew_);
            String str = inactivateReason.key;
            this.f160462b = str;
            boolean zEquals = "category_custom".equals(str);
            V v2 = this.viewModel;
            if (zEquals) {
                ((C15940bq) v2).m103301v();
                return;
            } else {
                ((C15940bq) v2).m103299s(inactivateReason);
                return;
            }
        }
        ArrayList<InactivateReason> arrayList = (NullChecker.m81303a(CoreModule.f17546d.m95177g()) && NullChecker.m81303a(CoreModule.f17546d.m95177g().inactivateReason)) ? new ArrayList(CoreModule.f17546d.m95177g().inactivateReason) : new ArrayList();
        InactivateReason inactivateReasonNew_ = InactivateReason.new_();
        inactivateReasonNew_.key = "category_reregister_or_change_phone";
        inactivateReasonNew_.name = "重新注册/换绑手机";
        inactivateReasonNew_.reasons = new ArrayList();
        InactivateReasonDetail inactivateReasonDetailNew_2 = InactivateReasonDetail.new_();
        inactivateReasonDetailNew_2.key = "reason_reregister_or_change_phone";
        inactivateReasonNew_.reasons.add(inactivateReasonDetailNew_2);
        arrayList.add(inactivateReasonNew_);
        Collections.shuffle(arrayList);
        for (InactivateReason inactivateReason2 : arrayList) {
            if (!vwb.m200296J(inactivateReason2.reasons)) {
                Collections.shuffle(inactivateReason2.reasons);
            }
        }
        ((C15940bq) this.viewModel).m103300u(arrayList);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.qp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155655a.m180277j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m180278f0(InactivateReasonDetail inactivateReasonDetail) {
        this.f160461a.put(inactivateReasonDetail.key, inactivateReasonDetail.name);
    }

    /* JADX INFO: renamed from: g0 */
    public String m180279g0() {
        StringBuilder sb = new StringBuilder();
        if (this.f160461a.isEmpty()) {
            return "";
        }
        Iterator<String> it = this.f160461a.keySet().iterator();
        while (it.hasNext()) {
            sb.append(this.f160461a.get(it.next()));
            sb.append("；");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m180280h0() {
        return this.f160461a.containsKey("reason_custom");
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m180281i0() {
        return this.f160461a.isEmpty();
    }

    /* JADX INFO: renamed from: k0 */
    public void m180282k0(InactivateReason inactivateReason) {
        if (!"category_reregister_or_change_phone".equals(inactivateReason.key)) {
            m180284m0(AccountInactiveAct.m44102Z1(act(), 1, inactivateReason), 1);
        } else {
            act().startActivity(AccountInactiveConfirmAct.m44105Y1(act(), "category_reregister_or_change_phone", "reason_reregister_or_change_phone", "重新注册/换绑手机", ""));
            m180285n0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m180283l0(InactivateReasonDetail inactivateReasonDetail) {
        this.f160461a.remove(inactivateReasonDetail.key);
    }

    /* JADX INFO: renamed from: m0 */
    public void m180284m0(Intent intent, int i) {
        ((C15940bq) this.viewModel).act().startActivityForResult(intent, i);
    }

    /* JADX INFO: renamed from: n0 */
    public void m180285n0() {
        act().setResult(-1);
        act().m66873d2();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
