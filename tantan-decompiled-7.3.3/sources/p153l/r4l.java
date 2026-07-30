package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.module.api.LivePrivacyApiProvider;
import com.p051p1.mobile.putong.live.external.page.setting.privacy.frag.HideWealthIconFrag;
import com.tantanapp.media.ttmediautils.download.Action1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J9\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/r4l;", "Ll/cyr;", "Ll/o4l;", "Lcom/p1/mobile/putong/live/external/page/setting/privacy/frag/HideWealthIconFrag;", "hideWealthIconFrag", "<init>", "(Lcom/p1/mobile/putong/live/external/page/setting/privacy/frag/HideWealthIconFrag;)V", "", "position", "", "isChecked", "Lcom/tantanapp/media/ttmediautils/download/Action1;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "onSuccessAction", "", "onFailAction", "", "s2", "(Ljava/lang/String;ZLcom/tantanapp/media/ttmediautils/download/Action1;Lcom/tantanapp/media/ttmediautils/download/Action1;)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class r4l extends cyr<o4l> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4l(@NotNull HideWealthIconFrag hideWealthIconFrag) {
        super(hideWealthIconFrag);
        hideWealthIconFrag.getClass();
    }

    /* JADX INFO: renamed from: q2 */
    public static void m179772q2(Action1 action1, BLiveEnvelope bLiveEnvelope) {
        action1.call(bLiveEnvelope);
    }

    /* JADX INFO: renamed from: r2 */
    public static void m179773r2(Action1 action1, Throwable th) {
        action1.call(th);
    }

    /* JADX INFO: renamed from: s2 */
    public final void m179774s2(@NotNull String position, boolean isChecked, @NotNull final Action1<BLiveEnvelope> onSuccessAction, @NotNull final Action1<Throwable> onFailAction) {
        position.getClass();
        onSuccessAction.getClass();
        onFailAction.getClass();
        duringCreated(LivePrivacyApiProvider.changeWealthIconShowStatusNew(position, isChecked)).subscribe(dhw.m115826e(new y20() { // from class: l.p4l
            @Override // p153l.y20
            public final void call(Object obj) {
                r4l.m179772q2(onSuccessAction, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.q4l
            @Override // p153l.y20
            public final void call(Object obj) {
                r4l.m179773r2(onFailAction, (Throwable) obj);
            }
        }));
    }
}
