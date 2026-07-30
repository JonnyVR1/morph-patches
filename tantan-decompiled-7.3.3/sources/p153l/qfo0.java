package p153l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p051p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.operations.VoiceOperationsView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class qfo0 extends i6t<rwn0, VoiceOperationsView> {

    /* JADX INFO: renamed from: i */
    public final FrameLayout f157319i;

    /* JADX INFO: renamed from: j */
    public kcg0 f157320j;

    public qfo0(dum<? extends rwn0> dumVar, VoiceOperationsView voiceOperationsView, FrameLayout frameLayout) {
        super(dumVar);
        this.f157319i = frameLayout;
        if (voiceOperationsView != null) {
            mo52715C(voiceOperationsView);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m176381M3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m176382N3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m176383O3(LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg refreshVoiceOperationMsg) {
        m176387T3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m176384P3(abo0 abo0Var) {
        m176387T3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m176385R3(BaseLiveListBean baseLiveListBean) {
        int iM175859d;
        List arrayList = baseLiveListBean.list;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (this.viewModel != 0) {
            if (((rwn0) m213810E2()).m202195r() && !TextUtils.equals(((rwn0) m213810E2()).mo183435j().onCallView, BLiveVoice.TEN_DEPUTY_STRATEGY)) {
                iM175859d = TextUtils.equals(((rwn0) m213810E2()).mo183435j().onCallView, BLiveVoice.THREE_DEPUTY_STRATEGY) ? qa00.m175859d(19.0f) : 0;
            } else {
                iM175859d = qa00.m175859d(44.0f);
            }
            ((VoiceOperationsView) this.viewModel).m79514f(arrayList, this.f157319i, iM175859d);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m176386S3(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (TextUtils.isEmpty(intlLiveOperationItemBean.schema)) {
            return;
        }
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(1300).m103154e(intlLiveOperationItemBean.schema).m103152c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98322s()).subscribe(dhw.m115825d(new y20() { // from class: l.lfo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131890a.m176383O3((LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg) obj);
            }
        }));
        duringCreated(m213811F2().VoiceMotionEvent.motionSwitch().m199270g()).subscribe(dhw.m115826e(new y20() { // from class: l.mfo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136662a.m176384P3((abo0) obj);
            }
        }, new y20() { // from class: l.nfo0
            @Override // p153l.y20
            public final void call(Object obj) {
                qfo0.m176382N3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public void m176387T3() {
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        String str = ((rwn0) m213810E2()).mo183435j().liveMode;
        boolean zMo118373p = ((rwn0) m213810E2()).mo118373p();
        boolean z = false;
        if (((rwn0) m213810E2()).m183423Y2() != null && guk0.m132329h(((rwn0) m213810E2()).m183423Y2()) && !zMo118373p) {
            z = true;
        }
        String strConcat = (zMo118373p ? "anchor" : "audience").concat(z ? "-caller" : "");
        if (TextUtils.isEmpty(strM202194o) || TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(VoiceRoomApiProvider.getIntlLiveOperations(strM202194o, str, strConcat)).subscribe(dhw.m115826e(new y20() { // from class: l.ofo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147091a.m176385R3((BaseLiveListBean) obj);
            }
        }, new y20() { // from class: l.pfo0
            @Override // p153l.y20
            public final void call(Object obj) {
                qfo0.m176381M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m176388U3() {
        kcg0 kcg0Var = this.f157320j;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
            this.f157320j = null;
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m176388U3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m176387T3();
    }
}
