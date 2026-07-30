package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.LucyParadiseEntranceView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class nhw extends qrm0<LucyParadiseEntranceView> {

    /* JADX INFO: renamed from: r */
    public kcg0 f142074r;

    public nhw(dum<? extends rwn0> dumVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(dumVar, bLiveBottomButton, area);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    private void m163248s4() {
        duringCreated(VirtualVoiceRoomApiProvider.getLuckyParadiseEntranceInfo(((rwn0) m213810E2()).m168526j0(), ((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115829h(new khw(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public void m163249u4(long j) {
        if (j / 1000 > 0) {
            m177578X3().m78949z0(j);
        } else {
            psd0.m173633z(this.f142074r);
            m177578X3().m78941p0();
        }
    }

    @Override // p153l.jc3
    /* JADX INFO: renamed from: C1 */
    public boolean mo105687C1(Area area) {
        return area == Area.BOTTOM;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: b4 */
    public int mo105689b4() {
        return obc0.f146197T8;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: c4 */
    public int mo105690c4() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.qrm0
    /* JADX INFO: renamed from: m4 */
    public void mo105691m4(View view, BLiveButtonType bLiveButtonType, String str) {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(100).m103154e(str).m103152c());
        i4g0.m138523u(zeu.f204079f, jkp0.m145875f(((rwn0) m213810E2()).mo118373p()), pf60.m172085a("is_crazy", m177578X3().m78942q0()));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f142074r);
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: r4, reason: merged with bridge method [inline-methods] */
    public LucyParadiseEntranceView mo105688T3(int i, boolean z) {
        LucyParadiseEntranceView lucyParadiseEntranceView = (LucyParadiseEntranceView) this.f159147l.f90815a.inflater().inflate(yec0.f199260t9, (ViewGroup) null);
        lucyParadiseEntranceView.setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(44.0f), qa00.m175859d(38.0f)));
        String strMo107630e4 = mo107630e4(this.f159148m, this.f159151p);
        if (TextUtils.isEmpty(strMo107630e4)) {
            lucyParadiseEntranceView.setIcon(i);
        } else {
            lucyParadiseEntranceView.setIcon(strMo107630e4);
        }
        bnl0.m105525M0(lucyParadiseEntranceView, true);
        return lucyParadiseEntranceView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m163248s4();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98271b()).subscribe(dhw.m115829h(new khw(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m163251t4(final BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance) {
        m177578X3().m78948y0(bLiveLuckyParadiseBottomEntrance);
        psd0.m173633z(this.f142074r);
        if (!bLiveLuckyParadiseBottomEntrance.isCrazyNow || bLiveLuckyParadiseBottomEntrance.endTime <= bLiveLuckyParadiseBottomEntrance.currentTime) {
            return;
        }
        this.f142074r = m138858H3(((rwn0) m213810E2()).m168525i2(TimeUnit.SECONDS)).take((int) ((bLiveLuckyParadiseBottomEntrance.endTime - bLiveLuckyParadiseBottomEntrance.currentTime) / 1000)).map(new qcj() { // from class: l.lhw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance2 = bLiveLuckyParadiseBottomEntrance;
                return Long.valueOf((bLiveLuckyParadiseBottomEntrance2.endTime - bLiveLuckyParadiseBottomEntrance2.currentTime) - (((Long) obj).longValue() * 1000));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.mhw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136885a.m163249u4(((Long) obj).longValue());
            }
        }));
    }
}
