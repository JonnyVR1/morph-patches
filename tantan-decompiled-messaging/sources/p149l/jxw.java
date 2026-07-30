package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class jxw extends hww<mxw> {

    /* JADX INFO: renamed from: a */
    public MarrySeriesType f120268a;

    public jxw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m143834l0(Bundle bundle) {
        if (NullChecker.m81303a(bundle) && bundle.containsKey("marry_series_type")) {
            this.f120268a = (MarrySeriesType) bundle.getSerializable("marry_series_type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m143835m0() {
        m133274f0().hideInput();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.hxw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109935a.m143834l0((Bundle) obj);
            }
        }, new d30() { // from class: l.ixw
            @Override // p149l.d30
            public final void call() {
                this.f115405a.m143835m0();
            }
        });
    }

    @Override // p149l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo104384g0(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == null) {
            return;
        }
        this.f120268a = marrySeriesType;
    }
}
