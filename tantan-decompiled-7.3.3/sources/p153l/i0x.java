package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class i0x extends gzw<l0x> {

    /* JADX INFO: renamed from: a */
    public MarrySeriesType f112457a;

    public i0x(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m138044l0(Bundle bundle) {
        if (NullChecker.m82486a(bundle) && bundle.containsKey("marry_series_type")) {
            this.f112457a = (MarrySeriesType) bundle.getSerializable("marry_series_type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m138045m0() {
        m133134f0().hideInput();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.g0x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101690a.m138044l0((Bundle) obj);
            }
        }, new x20() { // from class: l.h0x
            @Override // p153l.x20
            public final void call() {
                this.f107338a.m138045m0();
            }
        });
    }

    @Override // p153l.gzw
    /* JADX INFO: renamed from: g0 */
    public void mo95433g0(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == null) {
            return;
        }
        this.f112457a = marrySeriesType;
    }
}
