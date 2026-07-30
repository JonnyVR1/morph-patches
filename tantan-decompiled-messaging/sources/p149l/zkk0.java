package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class zkk0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public final tkk0 f203552i;

    public zkk0(bsm bsmVar, tkk0 tkk0Var) {
        super(bsmVar);
        this.f203552i = tkk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m219185M3(final BLiveVoiceCall bLiveVoiceCall) {
        gkh0.m126627j("[voice][call]", "addProcessCall ");
        C22306c<T> c22306cDuringCreated = duringCreated(VCallApiProvider.requestSdkToken(((nnn0) m206027E2()).m149818o(), ""));
        final tkk0 tkk0Var = this.f203552i;
        Objects.requireNonNull(tkk0Var);
        c22306cDuringCreated.subscribe(ffw.m121194e(new e30() { // from class: l.ukk0
            @Override // p149l.e30
            public final void call(Object obj) {
                tkk0Var.mo136827j4((BLiveRtcToken) obj);
            }
        }, new e30() { // from class: l.vkk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181824a.m219188P3(bLiveVoiceCall, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public final void m219186N3(String str) {
        C22306c c22306cDoOnNext = duringCreated(VCallApiProvider.deputyGoBack(str)).doOnNext(new e30() { // from class: l.ykk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198771a.m219191T3((BLiveVoiceCall) obj);
            }
        });
        tkk0 tkk0Var = this.f203552i;
        Objects.requireNonNull(tkk0Var);
        wkk0 wkk0Var = new wkk0(tkk0Var);
        tkk0 tkk0Var2 = this.f203552i;
        Objects.requireNonNull(tkk0Var2);
        c22306cDoOnNext.subscribe(ffw.m121194e(wkk0Var, new okk0(tkk0Var2)));
    }

    /* JADX INFO: renamed from: O3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m219189R3(Throwable th, BLiveVoiceCall bLiveVoiceCall) {
        s25.m182058c(th);
        this.f203552i.mo136826c4(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public void m219190S3(String str) {
        if (TextUtils.equals(str, ypv.f199493a.m199309D0())) {
            final BLiveVoiceCall bLiveVoiceCallM160261Y2 = ((nnn0) m206027E2()).m160261Y2();
            if (alk0.m97313l(bLiveVoiceCallM160261Y2)) {
                C22306c<T> c22306cDuringCreated = duringCreated(VCallApiProvider.reportConnect(bLiveVoiceCallM160261Y2.f44485id, true));
                tkk0 tkk0Var = this.f203552i;
                Objects.requireNonNull(tkk0Var);
                c22306cDuringCreated.subscribe(ffw.m121194e(new wkk0(tkk0Var), new e30() { // from class: l.xkk0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f193320a.m219189R3(bLiveVoiceCallM160261Y2, (Throwable) obj);
                    }
                }));
                return;
            }
            if (!alk0.m97309h(bLiveVoiceCallM160261Y2) || alk0.m97305d(bLiveVoiceCallM160261Y2)) {
                return;
            }
            m219186N3(bLiveVoiceCallM160261Y2.f44485id);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m219191T3(BLiveVoiceCall bLiveVoiceCall) {
        if (alk0.m97309h(bLiveVoiceCall)) {
            x1o0.m206755a(bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser, this);
        }
    }
}
