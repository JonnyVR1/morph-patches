package p009l;

import android.os.Bundle;
import com.p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class j05 extends jq2<s05> {

    /* JADX INFO: renamed from: a */
    public List<ChatPartnerHistoryData> f14879a;

    /* JADX INFO: renamed from: b */
    public String f14880b;

    /* JADX INFO: renamed from: c */
    public String f14881c;

    public j05(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m16814i0(Bundle bundle) {
        ((s05) ((jq2) this).viewModel).m21971p();
        ((s05) ((jq2) this).viewModel).m21978y(this.f14879a);
    }

    /* JADX INFO: renamed from: Z */
    public void m16815Z() {
        super.Z();
        m16818h0();
        creates(new e30() { // from class: l.i05
            public final void call(Object obj) {
                this.f14324a.m16814i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public List<ChatPartnerHistoryData> m16816f0() {
        return this.f14879a;
    }

    /* JADX INFO: renamed from: g0 */
    public String m16817g0() {
        return this.f14880b;
    }

    public String getFrom() {
        return this.f14881c;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m16818h0() {
        Bundle extras = act().getIntent().getExtras();
        if (NullChecker.a(extras)) {
            this.f14879a = (ArrayList) extras.getSerializable("param_users");
            this.f14880b = extras.getString("param_text_id");
            this.f14881c = extras.getString("param_from");
        }
    }

    public void destroy() {
    }
}
