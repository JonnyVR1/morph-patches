package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class fuk0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public final ztk0 f100925i;

    public fuk0(dum dumVar, ztk0 ztk0Var) {
        super(dumVar);
        this.f100925i = ztk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m127511M3(final BLiveVoiceCall bLiveVoiceCall) {
        nsh0.m164608j("[voice][call]", "addProcessCall ");
        C22421c<T> c22421cDuringCreated = duringCreated(VCallApiProvider.requestSdkToken(((rwn0) m213810E2()).m202194o(), ""));
        final ztk0 ztk0Var = this.f100925i;
        Objects.requireNonNull(ztk0Var);
        c22421cDuringCreated.subscribe(dhw.m115826e(new y20() { // from class: l.auk0
            @Override // p153l.y20
            public final void call(Object obj) {
                ztk0Var.mo169120j4((BLiveRtcToken) obj);
            }
        }, new y20() { // from class: l.buk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78525a.m127514P3(bLiveVoiceCall, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public final void m127512N3(String str) {
        C22421c c22421cDoOnNext = duringCreated(VCallApiProvider.deputyGoBack(str)).doOnNext(new y20() { // from class: l.euk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95882a.m127517T3((BLiveVoiceCall) obj);
            }
        });
        ztk0 ztk0Var = this.f100925i;
        Objects.requireNonNull(ztk0Var);
        cuk0 cuk0Var = new cuk0(ztk0Var);
        ztk0 ztk0Var2 = this.f100925i;
        Objects.requireNonNull(ztk0Var2);
        c22421cDoOnNext.subscribe(dhw.m115826e(cuk0Var, new utk0(ztk0Var2)));
    }

    /* JADX INFO: renamed from: O3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m127515R3(Throwable th, BLiveVoiceCall bLiveVoiceCall) {
        r35.m179578c(th);
        this.f100925i.mo169119c4(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public void m127516S3(String str) {
        if (TextUtils.equals(str, zrv.f205799a.m207631D0())) {
            final BLiveVoiceCall bLiveVoiceCallM183423Y2 = ((rwn0) m213810E2()).m183423Y2();
            if (guk0.m132333l(bLiveVoiceCallM183423Y2)) {
                C22421c<T> c22421cDuringCreated = duringCreated(VCallApiProvider.reportConnect(bLiveVoiceCallM183423Y2.f45333id, true));
                ztk0 ztk0Var = this.f100925i;
                Objects.requireNonNull(ztk0Var);
                c22421cDuringCreated.subscribe(dhw.m115826e(new cuk0(ztk0Var), new y20() { // from class: l.duk0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f90812a.m127515R3(bLiveVoiceCallM183423Y2, (Throwable) obj);
                    }
                }));
                return;
            }
            if (!guk0.m132329h(bLiveVoiceCallM183423Y2) || guk0.m132325d(bLiveVoiceCallM183423Y2)) {
                return;
            }
            m127512N3(bLiveVoiceCallM183423Y2.f45333id);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m127517T3(BLiveVoiceCall bLiveVoiceCall) {
        if (guk0.m132329h(bLiveVoiceCall)) {
            bbo0.m103305a(bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser, this);
        }
    }
}
