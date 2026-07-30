package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveMultiCallMatchStayView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/p7t;", "Ll/oo2;", p7f.GPS_DIRECTION_TRUE, "Ll/i6t;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/view/LiveMultiCallMatchStayView;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "K3", "()Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/view/LiveMultiCallMatchStayView;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class p7t<T extends oo2> extends i6t<T, LiveMultiCallMatchStayView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7t(@NotNull dum<T> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m171166J3(p7t p7tVar, Boolean bool) {
        if (p7tVar.viewModel == 0) {
            p7tVar.mo52715C(p7tVar.m171167K3());
        }
        ((LiveMultiCallMatchStayView) p7tVar.viewModel).m76978n0();
    }

    /* JADX INFO: renamed from: K3 */
    public final LiveMultiCallMatchStayView m171167K3() {
        View viewInflate = this.f196919f.inflater().inflate(yec0.f199216q4, (ViewGroup) null, false);
        viewInflate.getClass();
        return (LiveMultiCallMatchStayView) viewInflate;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c<T>) m213811F2().MultiCallEvent.openMatchStayDlg().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.o7t
            @Override // p153l.y20
            public final void call(Object obj) {
                p7t.m171166J3(this.f145297a, (Boolean) obj);
            }
        }));
    }
}
