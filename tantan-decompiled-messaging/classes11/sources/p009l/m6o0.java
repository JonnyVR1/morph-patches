package p009l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.operations.VoiceOperationsView;
import com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.List;
import l.alk0;
import l.bsm;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.h4t;
import l.mkd0;
import l.nnn0;
import l.t100;
import l.x1e0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class m6o0 extends h4t<nnn0, VoiceOperationsView> {

    /* JADX INFO: renamed from: i */
    public final FrameLayout f16740i;

    /* JADX INFO: renamed from: j */
    public c4g0 f16741j;

    public m6o0(bsm<? extends nnn0> bsmVar, VoiceOperationsView voiceOperationsView, FrameLayout frameLayout) {
        super(bsmVar);
        this.f16740i = frameLayout;
        if (voiceOperationsView != null) {
            C(voiceOperationsView);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m18271M3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m18272N3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m18273O3(LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg refreshVoiceOperationMsg) {
        m18278T3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m18274P3(w1o0 w1o0Var) {
        m18278T3();
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m18275R3(BaseLiveListBean baseLiveListBean) {
        int iD;
        List<IntlLiveOperationItemBean> arrayList = baseLiveListBean.list;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (((bwr) this).viewModel != null) {
            if (E2().r() && !TextUtils.equals(E2().V2().onCallView, BLiveVoice.TEN_DEPUTY_STRATEGY)) {
                iD = TextUtils.equals(E2().V2().onCallView, BLiveVoice.THREE_DEPUTY_STRATEGY) ? t100.d(19.0f) : 0;
            } else {
                iD = t100.d(44.0f);
            }
            ((VoiceOperationsView) ((bwr) this).viewModel).m8525f(arrayList, this.f16740i, iD);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m18276S3(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (TextUtils.isEmpty(intlLiveOperationItemBean.schema)) {
            return;
        }
        F2().SchemeHandleEvent.handleScheme().j(new x1e0.a(1300).e(intlLiveOperationItemBean.schema).c());
    }

    /* JADX INFO: renamed from: T */
    public void m18277T() {
        super/*l.k4t*/.T();
        duringCreated(E2().q1().s()).subscribe(ffw.d(new e30() { // from class: l.h6o0
            public final void call(Object obj) {
                this.f13892a.m18273O3((LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg) obj);
            }
        }));
        duringCreated((c) F2().VoiceMotionEvent.motionSwitch().g()).subscribe(ffw.e(new e30() { // from class: l.i6o0
            public final void call(Object obj) {
                this.f14414a.m18274P3((w1o0) obj);
            }
        }, new e30() { // from class: l.j6o0
            public final void call(Object obj) {
                m6o0.m18272N3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m18278T3() {
        String strO = E2().o();
        String str = ((BLiveAbsData) E2().V2()).liveMode;
        boolean zP = E2().p();
        boolean z = false;
        if (E2().Y2() != null && alk0.h(E2().Y2()) && !zP) {
            z = true;
        }
        String strConcat = (zP ? "anchor" : "audience").concat(z ? "-caller" : "");
        if (TextUtils.isEmpty(strO) || TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(VoiceRoomApiProvider.getIntlLiveOperations(strO, str, strConcat)).subscribe(ffw.e(new e30() { // from class: l.k6o0
            public final void call(Object obj) {
                this.f15431a.m18275R3((BaseLiveListBean) obj);
            }
        }, new e30() { // from class: l.l6o0
            public final void call(Object obj) {
                m6o0.m18271M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m18279U3() {
        c4g0 c4g0Var = this.f16741j;
        if (c4g0Var != null) {
            mkd0.z(c4g0Var);
            this.f16741j = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m18280n() {
        super.n();
        m18279U3();
    }

    /* JADX INFO: renamed from: t */
    public void m18281t() {
        super/*l.k4t*/.t();
        m18278T3();
    }
}
