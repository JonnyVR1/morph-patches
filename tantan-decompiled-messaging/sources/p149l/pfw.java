package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.LucyParadiseEntranceView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class pfw extends mim0<LucyParadiseEntranceView> {

    /* JADX INFO: renamed from: r */
    public c4g0 f148599r;

    public pfw(bsm<? extends nnn0> bsmVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(bsmVar, bLiveBottomButton, area);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    private void m168653s4() {
        duringCreated(VirtualVoiceRoomApiProvider.getLuckyParadiseEntranceInfo(((nnn0) m206027E2()).m132140j0(), ((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121197h(new mfw(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public void m168654u4(long j) {
        if (j / 1000 > 0) {
            m154731X3().m77766z0(j);
        } else {
            mkd0.m154992z(this.f148599r);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.mim0
    /* JADX INFO: renamed from: m4 */
    public void mo116707m4(View view, BLiveButtonType bLiveButtonType, String str) {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(100).m206701e(str).m206699c());
        zvf0.m220399u(ycu.f197488f, fbp0.m120390f(((nnn0) m206027E2()).mo97490p()), j760.m140076a("is_crazy", m154731X3().m77759q0()));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f148599r);
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: r4, reason: merged with bridge method [inline-methods] */
    public LucyParadiseEntranceView mo108804T3(int i, boolean z) {
        LucyParadiseEntranceView lucyParadiseEntranceView = (LucyParadiseEntranceView) this.f134018l.f77095a.inflater().inflate(t6c0.f168528t9, (ViewGroup) null);
        lucyParadiseEntranceView.setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(44.0f), t100.m186890d(38.0f)));
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
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m168653s4();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189089b()).subscribe(ffw.m121197h(new mfw(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m168656t4(final BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance) {
        m154731X3().m77765y0(bLiveLuckyParadiseBottomEntrance);
        mkd0.m154992z(this.f148599r);
        if (!bLiveLuckyParadiseBottomEntrance.isCrazyNow || bLiveLuckyParadiseBottomEntrance.endTime <= bLiveLuckyParadiseBottomEntrance.currentTime) {
            return;
        }
        this.f148599r = m129299H3(((nnn0) m206027E2()).m132139i2(TimeUnit.SECONDS)).take((int) ((bLiveLuckyParadiseBottomEntrance.endTime - bLiveLuckyParadiseBottomEntrance.currentTime) / 1000)).map(new w9j() { // from class: l.nfw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance2 = bLiveLuckyParadiseBottomEntrance;
                return Long.valueOf((bLiveLuckyParadiseBottomEntrance2.endTime - bLiveLuckyParadiseBottomEntrance2.currentTime) - (((Long) obj).longValue() * 1000));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ofw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143762a.m168654u4(((Long) obj).longValue());
            }
        }));
    }
}
