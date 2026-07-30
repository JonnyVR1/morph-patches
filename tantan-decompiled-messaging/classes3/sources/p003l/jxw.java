package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class jxw extends hww<mxw> {

    /* JADX INFO: renamed from: a */
    public MarrySeriesType f4761a;

    public jxw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m5460l0(Bundle bundle) {
        if (NullChecker.a(bundle) && bundle.containsKey("marry_series_type")) {
            this.f4761a = (MarrySeriesType) bundle.getSerializable("marry_series_type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m5461m0() {
        m5005f0().hideInput();
    }

    /* JADX INFO: renamed from: a0 */
    public void m5462a0() {
        super.a0();
        creates(new e30() { // from class: l.hxw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4301a.m5460l0((Bundle) obj);
            }
        }, new d30() { // from class: l.ixw
            @Override // p003l.d30
            public final void call() {
                this.f4520a.m5461m0();
            }
        });
    }

    @Override // p003l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo3202g0(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == null) {
            return;
        }
        this.f4761a = marrySeriesType;
    }
}
