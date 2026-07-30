package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class j05 extends jq2<s05> {

    /* JADX INFO: renamed from: a */
    public List<ChatPartnerHistoryData> f115636a;

    /* JADX INFO: renamed from: b */
    public String f115637b;

    /* JADX INFO: renamed from: c */
    public String f115638c;

    public j05(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m139125i0(Bundle bundle) {
        ((s05) this.viewModel).m181838p();
        ((s05) this.viewModel).m181845y(this.f115636a);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m139128h0();
        creates(new e30() { // from class: l.i05
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110258a.m139125i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public List<ChatPartnerHistoryData> m139126f0() {
        return this.f115636a;
    }

    /* JADX INFO: renamed from: g0 */
    public String m139127g0() {
        return this.f115637b;
    }

    public String getFrom() {
        return this.f115638c;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m139128h0() {
        Bundle extras = act().getIntent().getExtras();
        if (NullChecker.m81303a(extras)) {
            this.f115636a = (ArrayList) extras.getSerializable("param_users");
            this.f115637b = extras.getString("param_text_id");
            this.f115638c = extras.getString("param_from");
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
