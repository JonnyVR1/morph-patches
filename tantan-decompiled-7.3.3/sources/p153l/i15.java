package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class i15 extends ar2<r15> {

    /* JADX INFO: renamed from: a */
    public List<ChatPartnerHistoryData> f112488a;

    /* JADX INFO: renamed from: b */
    public String f112489b;

    /* JADX INFO: renamed from: c */
    public String f112490c;

    public i15(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m138075i0(Bundle bundle) {
        ((r15) this.viewModel).m179378p();
        ((r15) this.viewModel).m179385y(this.f112488a);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m138078h0();
        creates(new y20() { // from class: l.h15
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107404a.m138075i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public List<ChatPartnerHistoryData> m138076f0() {
        return this.f112488a;
    }

    /* JADX INFO: renamed from: g0 */
    public String m138077g0() {
        return this.f112489b;
    }

    public String getFrom() {
        return this.f112490c;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m138078h0() {
        Bundle extras = act().getIntent().getExtras();
        if (NullChecker.m82486a(extras)) {
            this.f112488a = (ArrayList) extras.getSerializable("param_users");
            this.f112489b = extras.getString("param_text_id");
            this.f112490c = extras.getString("param_from");
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
