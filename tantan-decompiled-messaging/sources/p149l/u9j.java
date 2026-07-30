package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.LucyParadiseEntranceView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class u9j extends mim0<LucyParadiseEntranceView> {

    /* JADX INFO: renamed from: r */
    public c4g0 f175332r;

    public u9j(bsm<? extends nnn0> bsmVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(bsmVar, bLiveBottomButton, area);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public void m192329u4(long j) {
        if (j / 1000 > 0) {
            m154731X3().m77766z0(j);
        } else {
            mkd0.m154992z(this.f175332r);
            m154731X3().m77758p0();
        }
    }

    @Override // p149l.ub3
    /* JADX INFO: renamed from: C1 */
    public boolean mo116693C1(Area area) {
        return area == Area.BOTTOM;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: b4 */
    public int mo116704b4() {
        return i3c0.f110869T8;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: c4 */
    public int mo116705c4() {
        return 0;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: m4 */
    public void mo116707m4(View view, BLiveButtonType bLiveButtonType, String str) {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(100).m206701e(str).m206699c());
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f175332r);
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: r4, reason: merged with bridge method [inline-methods] */
    public LucyParadiseEntranceView mo108804T3(int i, boolean z) {
        LucyParadiseEntranceView lucyParadiseEntranceView = (LucyParadiseEntranceView) this.f134018l.f77095a.inflater().inflate(t6c0.f168528t9, (ViewGroup) null);
        lucyParadiseEntranceView.setLayoutParams(new SweetGalleryLayoutManager.C13038d(t100.m186890d(44.0f), t100.m186890d(38.0f)));
        String strMo154734e4 = mo154734e4(this.f134019m, this.f134022p);
        if (TextUtils.isEmpty(strMo154734e4)) {
            lucyParadiseEntranceView.setIcon(i);
        } else {
            lucyParadiseEntranceView.setIcon(strMo154734e4);
        }
        xdl0.m208345M0(lucyParadiseEntranceView, true);
        return lucyParadiseEntranceView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final void m192331s4() {
        duringCreated(VirtualVoiceRoomApiProvider.getFunFairEntranceInfo(((nnn0) m206027E2()).m132140j0(), ((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121197h(new r9j(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m192331s4();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189086a()).subscribe(ffw.m121197h(new r9j(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m192332t4(final BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance) {
        m154731X3().m77765y0(bLiveLuckyParadiseBottomEntrance);
        mkd0.m154992z(this.f175332r);
        if ((bLiveLuckyParadiseBottomEntrance.buff || bLiveLuckyParadiseBottomEntrance.isCrazyNow) && bLiveLuckyParadiseBottomEntrance.endTime > bLiveLuckyParadiseBottomEntrance.currentTime) {
            this.f175332r = m129299H3(((nnn0) m206027E2()).m132139i2(TimeUnit.SECONDS)).take((int) ((bLiveLuckyParadiseBottomEntrance.endTime - bLiveLuckyParadiseBottomEntrance.currentTime) / 1000)).map(new w9j() { // from class: l.s9j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance2 = bLiveLuckyParadiseBottomEntrance;
                    return Long.valueOf((bLiveLuckyParadiseBottomEntrance2.endTime - bLiveLuckyParadiseBottomEntrance2.currentTime) - (((Long) obj).longValue() * 1000));
                }
            }).subscribe(ffw.m121197h(new e30() { // from class: l.t9j
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169036a.m192329u4(((Long) obj).longValue());
                }
            }));
        }
    }
}
