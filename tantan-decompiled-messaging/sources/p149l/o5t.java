package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveMultiCallMatchStayView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/o5t;", "Ll/ho2;", j6f.GPS_DIRECTION_TRUE, "Ll/h4t;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/view/LiveMultiCallMatchStayView;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "K3", "()Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/view/LiveMultiCallMatchStayView;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class o5t<T extends ho2> extends h4t<T, LiveMultiCallMatchStayView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5t(@NotNull bsm<T> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m162803J3(o5t o5tVar, Boolean bool) {
        if (o5tVar.viewModel == 0) {
            o5tVar.mo51532C(o5tVar.m162804K3());
        }
        ((LiveMultiCallMatchStayView) o5tVar.viewModel).m75795n0();
    }

    /* JADX INFO: renamed from: K3 */
    public final LiveMultiCallMatchStayView m162804K3() {
        View viewInflate = this.f188513f.inflater().inflate(t6c0.f168484q4, (ViewGroup) null, false);
        viewInflate.getClass();
        return (LiveMultiCallMatchStayView) viewInflate;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c<T>) m206028F2().MultiCallEvent.openMatchStayDlg().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.n5t
            @Override // p149l.e30
            public final void call(Object obj) {
                o5t.m162803J3(this.f137232a, (Boolean) obj);
            }
        }));
    }
}
