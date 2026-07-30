package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.endSuggest.SuggestedStopped;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Ll/ryl0;", "Ll/y8s;", "Ll/rwn0;", "Ll/iyl0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "e", "", "b4", "(Ljava/lang/Throwable;)V", p7f.GPS_DIRECTION_TRUE, "()V", Constants.KEY_T, "a4", "c4", "d4", "Lcom/p1/mobile/putong/live/livingroom/virtual/endSuggest/SuggestedStopped;", "data", "f4", "(Lcom/p1/mobile/putong/live/livingroom/virtual/endSuggest/SuggestedStopped;)V", "", "times", "e4", "(Lcom/p1/mobile/putong/live/livingroom/virtual/endSuggest/SuggestedStopped;I)V", "Ll/kcg0;", "j", "Ll/kcg0;", SubSampleInformationBox.TYPE, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ryl0 extends y8s<rwn0, iyl0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public kcg0 subs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryl0(@NotNull dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m183616S3(ryl0 ryl0Var, hrk0.C17564a c17564a) {
        ryl0Var.m183626c4();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m183617T3(ryl0 ryl0Var, int i, SuggestedStopped suggestedStopped, Long l2) {
        iyl0 iyl0Var = (iyl0) ryl0Var.viewModel;
        if (iyl0Var != null) {
            iyl0Var.m142704I(i - ((int) l2.longValue()));
        }
        if (i - ((int) l2.longValue()) <= 0) {
            if (suggestedStopped != null && suggestedStopped.getGoAction() != null) {
                zrv.f205799a.m207700w(ryl0Var.act(), suggestedStopped.getGoAction());
            }
            ryl0Var.m183625a4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public static void m183618U3(ryl0 ryl0Var, BLiveExtraResponse bLiveExtraResponse) {
        if (bLiveExtraResponse.data.voiceSettles.isEmpty()) {
            return;
        }
        BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem = bLiveExtraResponse.data.voiceSettles.get(0);
        bLiveVoiceVirtualRoomSettleItem.getClass();
        if (bLiveVoiceVirtualRoomSettleItem.isSettled() || TextUtils.equals(((rwn0) ryl0Var.m213810E2()).mo146599R2(), "audio_group_chat")) {
            return;
        }
        ryl0Var.m183627d4();
    }

    /* JADX INFO: renamed from: V3 */
    public static void m183619V3(ryl0 ryl0Var, Throwable th) {
        ryl0Var.m183624b4(th);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m183620W3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X3 */
    public static void m183621X3(ryl0 ryl0Var, Throwable th) {
        ryl0Var.m183625a4();
    }

    /* JADX INFO: renamed from: Y3 */
    public static Boolean m183622Y3(hrk0.C17564a c17564a) {
        return Boolean.valueOf(c17564a.f111360b == 1);
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m183623Z3(ryl0 ryl0Var, SuggestedStopped suggestedStopped) {
        suggestedStopped.getClass();
        ryl0Var.m183629f4(suggestedStopped);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        C22421c<T> c22421cDuringCreated = duringCreated(((rwn0) m213810E2()).m183413Q2());
        final Function1 function1 = new Function1() { // from class: l.jyl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ryl0.m183622Y3((hrk0.C17564a) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.kyl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ryl0.m183620W3(function1, obj);
            }
        }).take(1).subscribe(dhw.m115829h(new y20() { // from class: l.lyl0
            @Override // p153l.y20
            public final void call(Object obj) {
                ryl0.m183616S3(this.f134114a, (hrk0.C17564a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m183625a4() {
        psd0.m173633z(this.subs);
        iyl0 iyl0Var = (iyl0) this.viewModel;
        if (iyl0Var != null) {
            iyl0Var.mo73021p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m183626c4() {
        ado0 ado0VarM136879r = ((rwn0) m213810E2()).m183411P2().m136879r();
        if ((ado0VarM136879r != null ? ado0VarM136879r.m97114J() : 0L) <= 1) {
            String strM202194o = ((rwn0) m213810E2()).m202194o();
            strM202194o.getClass();
            String strM207631D0 = zrv.f205799a.m207631D0();
            strM207631D0.getClass();
            duringCreated(VirtualVoiceRoomApiProvider.getUserSettlesStatus(strM202194o, strM207631D0)).subscribe(dhw.m115829h(new y20() { // from class: l.myl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ryl0.m183618U3(this.f139417a, (BLiveExtraResponse) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public final void m183627d4() {
        duringCreated(fyl0.m128122a(((rwn0) m213810E2()).m168449D0(), ((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.nyl0
            @Override // p153l.y20
            public final void call(Object obj) {
                ryl0.m183623Z3(this.f144332a, (SuggestedStopped) obj);
            }
        }, new y20() { // from class: l.oyl0
            @Override // p153l.y20
            public final void call(Object obj) {
                ryl0.m183619V3(this.f149809a, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final void m183628e4(final SuggestedStopped data, final int times) {
        if (times <= 0) {
            m183625a4();
            return;
        }
        iyl0 iyl0Var = (iyl0) this.viewModel;
        if (iyl0Var != null) {
            iyl0Var.m142704I(times);
        }
        this.subs = duringCreated(((rwn0) m213810E2()).m168521h2(1, TimeUnit.SECONDS)).take(times).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.pyl0
            @Override // p153l.y20
            public final void call(Object obj) {
                ryl0.m183617T3(this.f154667a, times, data, (Long) obj);
            }
        }, new y20() { // from class: l.qyl0
            @Override // p153l.y20
            public final void call(Object obj) {
                ryl0.m183621X3(this.f160164a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    public final void m183629f4(SuggestedStopped data) {
        if (data == null || TextUtils.isEmpty(data.getTitle())) {
            iyl0 iyl0Var = (iyl0) this.viewModel;
            if (iyl0Var != null) {
                iyl0Var.mo73021p();
                return;
            }
            return;
        }
        if (this.viewModel == 0) {
            Act act = this.f196918e.f90815a;
            act.getClass();
            iyl0 iyl0Var2 = new iyl0(act, this);
            this.viewModel = iyl0Var2;
            mo52715C(iyl0Var2);
        }
        iyl0 iyl0Var3 = (iyl0) this.viewModel;
        if (iyl0Var3 != null) {
            iyl0Var3.m142706K(data);
        }
        m183628e4(data, data.getTimes());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
    }

    /* JADX INFO: renamed from: b4 */
    private final void m183624b4(Throwable e) {
    }
}
