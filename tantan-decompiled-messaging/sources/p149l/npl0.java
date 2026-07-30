package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.endSuggest.SuggestedStopped;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/npl0;", "Ll/x6s;", "Ll/nnn0;", "Ll/epl0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "e", "", "b4", "(Ljava/lang/Throwable;)V", j6f.GPS_DIRECTION_TRUE, "()V", Constants.KEY_T, "a4", "c4", "d4", "Lcom/p1/mobile/putong/live/livingroom/virtual/endSuggest/SuggestedStopped;", "data", "f4", "(Lcom/p1/mobile/putong/live/livingroom/virtual/endSuggest/SuggestedStopped;)V", "", "times", "e4", "(Lcom/p1/mobile/putong/live/livingroom/virtual/endSuggest/SuggestedStopped;I)V", "Ll/c4g0;", "j", "Ll/c4g0;", SubSampleInformationBox.TYPE, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class npl0 extends x6s<nnn0, epl0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public c4g0 subs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npl0(@NotNull bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m160509S3(npl0 npl0Var, bik0.C15867a c15867a) {
        npl0Var.m160519c4();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m160510T3(npl0 npl0Var, int i, SuggestedStopped suggestedStopped, Long l2) {
        epl0 epl0Var = (epl0) npl0Var.viewModel;
        if (epl0Var != null) {
            epl0Var.m117654I(i - ((int) l2.longValue()));
        }
        if (i - ((int) l2.longValue()) <= 0) {
            if (suggestedStopped != null && suggestedStopped.getGoAction() != null) {
                ypv.f199493a.m199378w(npl0Var.act(), suggestedStopped.getGoAction());
            }
            npl0Var.m160518a4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public static void m160511U3(npl0 npl0Var, BLiveExtraResponse bLiveExtraResponse) {
        if (bLiveExtraResponse.data.voiceSettles.isEmpty()) {
            return;
        }
        BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem = bLiveExtraResponse.data.voiceSettles.get(0);
        bLiveVoiceVirtualRoomSettleItem.getClass();
        if (bLiveVoiceVirtualRoomSettleItem.isSettled() || TextUtils.equals(((nnn0) npl0Var.m206027E2()).mo121373R2(), "audio_group_chat")) {
            return;
        }
        npl0Var.m160520d4();
    }

    /* JADX INFO: renamed from: V3 */
    public static void m160512V3(npl0 npl0Var, Throwable th) {
        npl0Var.m160517b4(th);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m160513W3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X3 */
    public static void m160514X3(npl0 npl0Var, Throwable th) {
        npl0Var.m160518a4();
    }

    /* JADX INFO: renamed from: Y3 */
    public static Boolean m160515Y3(bik0.C15867a c15867a) {
        return Boolean.valueOf(c15867a.f75773b == 1);
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m160516Z3(npl0 npl0Var, SuggestedStopped suggestedStopped) {
        suggestedStopped.getClass();
        npl0Var.m160522f4(suggestedStopped);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        C22306c<T> c22306cDuringCreated = duringCreated(((nnn0) m206027E2()).m160251Q2());
        final Function1 function1 = new Function1() { // from class: l.fpl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return npl0.m160515Y3((bik0.C15867a) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.gpl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return npl0.m160513W3(function1, obj);
            }
        }).take(1).subscribe(ffw.m121197h(new e30() { // from class: l.hpl0
            @Override // p149l.e30
            public final void call(Object obj) {
                npl0.m160509S3(this.f108945a, (bik0.C15867a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m160518a4() {
        mkd0.m154992z(this.subs);
        epl0 epl0Var = (epl0) this.viewModel;
        if (epl0Var != null) {
            epl0Var.mo71838p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m160519c4() {
        w3o0 w3o0VarM102069r = ((nnn0) m206027E2()).m160249P2().m102069r();
        if ((w3o0VarM102069r != null ? w3o0VarM102069r.m201357J() : 0L) <= 1) {
            String strM149818o = ((nnn0) m206027E2()).m149818o();
            strM149818o.getClass();
            String strM199309D0 = ypv.f199493a.m199309D0();
            strM199309D0.getClass();
            duringCreated(VirtualVoiceRoomApiProvider.getUserSettlesStatus(strM149818o, strM199309D0)).subscribe(ffw.m121197h(new e30() { // from class: l.ipl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    npl0.m160511U3(this.f114329a, (BLiveExtraResponse) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public final void m160520d4() {
        duringCreated(bpl0.m103079a(((nnn0) m206027E2()).m132060D0(), ((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.jpl0
            @Override // p149l.e30
            public final void call(Object obj) {
                npl0.m160516Z3(this.f119208a, (SuggestedStopped) obj);
            }
        }, new e30() { // from class: l.kpl0
            @Override // p149l.e30
            public final void call(Object obj) {
                npl0.m160512V3(this.f124171a, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final void m160521e4(final SuggestedStopped data, final int times) {
        if (times <= 0) {
            m160518a4();
            return;
        }
        epl0 epl0Var = (epl0) this.viewModel;
        if (epl0Var != null) {
            epl0Var.m117654I(times);
        }
        this.subs = duringCreated(((nnn0) m206027E2()).m132135h2(1, TimeUnit.SECONDS)).take(times).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.lpl0
            @Override // p149l.e30
            public final void call(Object obj) {
                npl0.m160510T3(this.f129227a, times, data, (Long) obj);
            }
        }, new e30() { // from class: l.mpl0
            @Override // p149l.e30
            public final void call(Object obj) {
                npl0.m160514X3(this.f135069a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    public final void m160522f4(SuggestedStopped data) {
        if (data == null || TextUtils.isEmpty(data.getTitle())) {
            epl0 epl0Var = (epl0) this.viewModel;
            if (epl0Var != null) {
                epl0Var.mo71838p();
                return;
            }
            return;
        }
        if (this.viewModel == 0) {
            Act act = this.f188512e.f77095a;
            act.getClass();
            epl0 epl0Var2 = new epl0(act, this);
            this.viewModel = epl0Var2;
            mo51532C(epl0Var2);
        }
        epl0 epl0Var3 = (epl0) this.viewModel;
        if (epl0Var3 != null) {
            epl0Var3.m117656K(data);
        }
        m160521e4(data, data.getTimes());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
    }

    /* JADX INFO: renamed from: b4 */
    private final void m160517b4(Throwable e) {
    }
}
