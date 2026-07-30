package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.InactivateReason;
import com.p051p1.mobile.putong.core.data.InactivateReasonDetail;
import com.p051p1.mobile.putong.core.p058ui.account.AccountInactiveAct;
import com.p051p1.mobile.putong.core.p058ui.account.AccountInactiveConfirmAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.mp */
/* JADX INFO: loaded from: classes6.dex */
public class C18666mp extends ar2<C21159wp> {

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f137860a;

    /* JADX INFO: renamed from: b */
    public String f137861b;

    public C18666mp(ner nerVar) {
        super(nerVar);
        this.f137860a = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m159328j0(Bundle bundle) {
        if (act().getIntent().getIntExtra("page_type", 0) != 0) {
            InactivateReason inactivateReason = (InactivateReason) act().getIntent().getSerializableExtra("InactivateReason");
            InactivateReasonDetail inactivateReasonDetailNew_ = InactivateReasonDetail.new_();
            inactivateReasonDetailNew_.key = "reason_custom";
            inactivateReasonDetailNew_.name = "其他";
            inactivateReason.reasons.add(inactivateReasonDetailNew_);
            String str = inactivateReason.key;
            this.f137861b = str;
            boolean zEquals = "category_custom".equals(str);
            V v2 = this.viewModel;
            if (zEquals) {
                ((C21159wp) v2).m207385v();
                return;
            } else {
                ((C21159wp) v2).m207383s(inactivateReason);
                return;
            }
        }
        ArrayList<InactivateReason> arrayList = (NullChecker.m82486a(CoreModule.f18265d.m144645g()) && NullChecker.m82486a(CoreModule.f18265d.m144645g().inactivateReason)) ? new ArrayList(CoreModule.f18265d.m144645g().inactivateReason) : new ArrayList();
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
            if (!jyb.m147479J(inactivateReason2.reasons)) {
                Collections.shuffle(inactivateReason2.reasons);
            }
        }
        ((C21159wp) this.viewModel).m207384u(arrayList);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.lp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132992a.m159328j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m159329f0(InactivateReasonDetail inactivateReasonDetail) {
        this.f137860a.put(inactivateReasonDetail.key, inactivateReasonDetail.name);
    }

    /* JADX INFO: renamed from: g0 */
    public String m159330g0() {
        StringBuilder sb = new StringBuilder();
        if (this.f137860a.isEmpty()) {
            return "";
        }
        Iterator<String> it = this.f137860a.keySet().iterator();
        while (it.hasNext()) {
            sb.append(this.f137860a.get(it.next()));
            sb.append("；");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m159331h0() {
        return this.f137860a.containsKey("reason_custom");
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m159332i0() {
        return this.f137860a.isEmpty();
    }

    /* JADX INFO: renamed from: k0 */
    public void m159333k0(InactivateReason inactivateReason) {
        if (!"category_reregister_or_change_phone".equals(inactivateReason.key)) {
            m159335m0(AccountInactiveAct.m45285a2(act(), 1, inactivateReason), 1);
        } else {
            act().startActivity(AccountInactiveConfirmAct.m45288Z1(act(), "category_reregister_or_change_phone", "reason_reregister_or_change_phone", "重新注册/换绑手机", ""));
            m159336n0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m159334l0(InactivateReasonDetail inactivateReasonDetail) {
        this.f137860a.remove(inactivateReasonDetail.key);
    }

    /* JADX INFO: renamed from: m0 */
    public void m159335m0(Intent intent, int i) {
        ((C21159wp) this.viewModel).act().startActivityForResult(intent, i);
    }

    /* JADX INFO: renamed from: n0 */
    public void m159336n0() {
        act().setResult(-1);
        act().m68056e2();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
