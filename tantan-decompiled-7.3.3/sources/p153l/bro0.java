package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes10.dex */
public class bro0 extends qct<jqm0> implements c6m {

    /* JADX INFO: renamed from: i */
    public woo0 f78041i;

    public bro0(dum dumVar, woo0 woo0Var) {
        super(dumVar);
        this.f78041i = woo0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m106150R3(NetworkInfo networkInfo) {
        m106153W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m106151T3() {
        this.f78041i.m207343m(false);
    }

    /* JADX INFO: renamed from: V3 */
    private void m106152V3() {
        m213811F2().FragProxyEvent.initRoomInfo().m199277p();
    }

    /* JADX INFO: renamed from: W3 */
    private void m106153W3() {
        m106158X3("0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m106154Y3(Throwable th) {
        this.f78041i.m207339P0(true, "0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3, reason: merged with bridge method [inline-methods] */
    public final void m106157U3(BLiveVoice bLiveVoice, ugd0 ugd0Var) {
        m213811F2().FragProxyEvent.changeRoomData().mo199273j(ugd0Var);
        ((jqm0) m213810E2()).m168488W(ugd0Var.f138293c, TextUtils.equals(bLiveVoice.f45171id, ugd0Var.f138293c.f45171id) ? 0 : 2);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m106156S3() {
        this.f78041i.m207343m(true);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.vqo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.wqo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190423a.m106150R3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m106158X3(String str) {
        final BLiveVoice bLiveVoiceMo122892l = ((jqm0) m213810E2()).m183409O2().mo122892l();
        if (bLiveVoiceMo122892l == null) {
            m106152V3();
        } else {
            this.f78041i.m207339P0(false, "0");
            duringCreated(VoiceRoomApiProvider.getLiveInfoForError(bLiveVoiceMo122892l, str)).doOnSubscribe(new x20() { // from class: l.xqo0
                @Override // p153l.x20
                public final void call() {
                    this.f195822a.m106156S3();
                }
            }).doOnUnsubscribe(new x20() { // from class: l.yqo0
                @Override // p153l.x20
                public final void call() {
                    this.f201231a.m106151T3();
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.zqo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f205636a.m106157U3(bLiveVoiceMo122892l, (ugd0) obj);
                }
            }, new y20() { // from class: l.aro0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72976a.m106154Y3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
    }
}
