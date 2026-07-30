package p149l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p046p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.operations.VoiceOperationsView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class m6o0 extends h4t<nnn0, VoiceOperationsView> {

    /* JADX INFO: renamed from: i */
    public final FrameLayout f131712i;

    /* JADX INFO: renamed from: j */
    public c4g0 f131713j;

    public m6o0(bsm<? extends nnn0> bsmVar, VoiceOperationsView voiceOperationsView, FrameLayout frameLayout) {
        super(bsmVar);
        this.f131712i = frameLayout;
        if (voiceOperationsView != null) {
            mo51532C(voiceOperationsView);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m153255M3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m153256N3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m153257O3(LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg refreshVoiceOperationMsg) {
        m153261T3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m153258P3(w1o0 w1o0Var) {
        m153261T3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m153259R3(BaseLiveListBean baseLiveListBean) {
        int iM186890d;
        List arrayList = baseLiveListBean.list;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (this.viewModel != 0) {
            if (((nnn0) m206027E2()).m149820r() && !TextUtils.equals(((nnn0) m206027E2()).mo149813j().onCallView, BLiveVoice.TEN_DEPUTY_STRATEGY)) {
                iM186890d = TextUtils.equals(((nnn0) m206027E2()).mo149813j().onCallView, BLiveVoice.THREE_DEPUTY_STRATEGY) ? t100.m186890d(19.0f) : 0;
            } else {
                iM186890d = t100.m186890d(44.0f);
            }
            ((VoiceOperationsView) this.viewModel).m78331f(arrayList, this.f131712i, iM186890d);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m153260S3(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (TextUtils.isEmpty(intlLiveOperationItemBean.schema)) {
            return;
        }
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(1300).m206701e(intlLiveOperationItemBean.schema).m206699c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189140s()).subscribe(ffw.m121193d(new e30() { // from class: l.h6o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106106a.m153257O3((LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg) obj);
            }
        }));
        duringCreated(m206028F2().VoiceMotionEvent.motionSwitch().m172460g()).subscribe(ffw.m121194e(new e30() { // from class: l.i6o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111758a.m153258P3((w1o0) obj);
            }
        }, new e30() { // from class: l.j6o0
            @Override // p149l.e30
            public final void call(Object obj) {
                m6o0.m153256N3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public void m153261T3() {
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        String str = ((nnn0) m206027E2()).mo149813j().liveMode;
        boolean zMo97490p = ((nnn0) m206027E2()).mo97490p();
        boolean z = false;
        if (((nnn0) m206027E2()).m160261Y2() != null && alk0.m97309h(((nnn0) m206027E2()).m160261Y2()) && !zMo97490p) {
            z = true;
        }
        String strConcat = (zMo97490p ? "anchor" : "audience").concat(z ? "-caller" : "");
        if (TextUtils.isEmpty(strM149818o) || TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(VoiceRoomApiProvider.getIntlLiveOperations(strM149818o, str, strConcat)).subscribe(ffw.m121194e(new e30() { // from class: l.k6o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121496a.m153259R3((BaseLiveListBean) obj);
            }
        }, new e30() { // from class: l.l6o0
            @Override // p149l.e30
            public final void call(Object obj) {
                m6o0.m153255M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m153262U3() {
        c4g0 c4g0Var = this.f131713j;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
            this.f131713j = null;
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m153262U3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m153261T3();
    }
}
