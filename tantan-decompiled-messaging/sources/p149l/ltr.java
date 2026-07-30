package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bR#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Ll/ltr;", "Ll/h4t;", "Ll/ho2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/annoncements/view/LiveAnnouncementEntryView;", "Ll/bsm;", BaseSei.INFO, "entryView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/annoncements/view/LiveAnnouncementEntryView;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", Constants.KEY_T, "M3", "Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;", "kotlin.jvm.PlatformType", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "L3", "()Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;", "roomAnnouncement", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ltr extends h4t<ho2, LiveAnnouncementEntryView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy roomAnnouncement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltr(@NotNull bsm<?> bsmVar, @NotNull LiveAnnouncementEntryView liveAnnouncementEntryView) {
        super(bsmVar);
        bsmVar.getClass();
        liveAnnouncementEntryView.getClass();
        mo51532C(liveAnnouncementEntryView);
        this.roomAnnouncement = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.jtr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ltr.m151713J3();
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public static BLiveCommonConfig m151713J3() {
        return ypv.m215672k().m195872k5();
    }

    /* JADX INFO: renamed from: K3 */
    public static void m151714K3(ltr ltrVar, BLive bLive) {
        ((LiveAnnouncementEntryView) ltrVar.viewModel).setVisibility(ltrVar.m151715L3().f44350on && bLive.isFriendLive());
    }

    /* JADX INFO: renamed from: L3 */
    private final BLiveCommonConfig m151715L3() {
        return (BLiveCommonConfig) this.roomAnnouncement.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public final void m151716M3() {
        m206028F2().MultiCallEvent.showAnnouncementDlg().mo172463j(Boolean.TRUE);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((LiveAnnouncementEntryView) this.viewModel).m75665j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (m206027E2() instanceof pn40) {
            D dM206027E2 = m206027E2();
            dM206027E2.getClass();
            duringCreated(((pn40) dM206027E2).m170393A2().m175586d()).subscribe(ffw.m121197h(new e30() { // from class: l.ktr
                @Override // p149l.e30
                public final void call(Object obj) {
                    ltr.m151714K3(this.f124610a, (BLive) obj);
                }
            }));
        }
    }
}
