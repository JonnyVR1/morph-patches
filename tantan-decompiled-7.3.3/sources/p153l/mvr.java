package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bR#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Ll/mvr;", "Ll/i6t;", "Ll/oo2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/annoncements/view/LiveAnnouncementEntryView;", "Ll/dum;", BaseSei.INFO, "entryView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/annoncements/view/LiveAnnouncementEntryView;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", Constants.KEY_T, "M3", "Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;", "kotlin.jvm.PlatformType", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "L3", "()Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;", "roomAnnouncement", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mvr extends i6t<oo2, LiveAnnouncementEntryView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy roomAnnouncement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvr(@NotNull dum<?> dumVar, @NotNull LiveAnnouncementEntryView liveAnnouncementEntryView) {
        super(dumVar);
        dumVar.getClass();
        liveAnnouncementEntryView.getClass();
        mo52715C(liveAnnouncementEntryView);
        this.roomAnnouncement = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.kvr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mvr.m160321J3();
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public static BLiveCommonConfig m160321J3() {
        return zrv.m221193k().m203659k5();
    }

    /* JADX INFO: renamed from: K3 */
    public static void m160322K3(mvr mvrVar, BLive bLive) {
        ((LiveAnnouncementEntryView) mvrVar.viewModel).setVisibility(mvrVar.m160323L3().f45198on && bLive.isFriendLive());
    }

    /* JADX INFO: renamed from: L3 */
    private final BLiveCommonConfig m160323L3() {
        return (BLiveCommonConfig) this.roomAnnouncement.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public final void m160324M3() {
        m213811F2().MultiCallEvent.showAnnouncementDlg().mo199273j(Boolean.TRUE);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((LiveAnnouncementEntryView) this.viewModel).m76848j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (m213810E2() instanceof dw40) {
            D dM213810E2 = m213810E2();
            dM213810E2.getClass();
            duringCreated(((dw40) dM213810E2).m118363A2().m122888d()).subscribe(dhw.m115829h(new y20() { // from class: l.lvr
                @Override // p153l.y20
                public final void call(Object obj) {
                    mvr.m160322K3(this.f133727a, (BLive) obj);
                }
            }));
        }
    }
}
