package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.e30;
import l.ffw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z9t extends x6s<ho2, w9t> {
    public z9t(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        C(new w9t(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m27136T() {
        super.T();
        duringCreated(m25547E2().m14596q1().E1).subscribe(ffw.d(new e30() { // from class: l.x9t
            public final void call(Object obj) {
                this.f22189a.m27140X3((LongLinkBottomMenu.LivePictureTextAlert) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public void m27137U3(boolean z) {
        if (z) {
            m27139W3();
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m27138V3(Long l2) {
        m27139W3();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m27139W3() {
        m25548F2().OfficialShowEvent.switchOffAnchor().p();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [l.ho2] */
    /* JADX INFO: renamed from: X3 */
    public final void m27140X3(LongLinkBottomMenu.LivePictureTextAlert livePictureTextAlert) {
        if (TextUtils.isEmpty(livePictureTextAlert.getText())) {
            return;
        }
        String pictureUrl = livePictureTextAlert.getPictureUrl();
        String text = livePictureTextAlert.getText();
        String buttonText = livePictureTextAlert.getButtonText();
        boolean z = livePictureTextAlert.getAction() == LongLinkBottomMenu.LivePictureTextAlert.ActionType.anchorKickOut;
        ((w9t) ((bwr) this).viewModel).m24448I(pictureUrl, text, buttonText, z);
        if (z) {
            m14186H3(m25547E2().m14571h2(3, TimeUnit.SECONDS)).take(1).subscribe(ffw.d(new e30() { // from class: l.y9t
                public final void call(Object obj) {
                    this.f22748a.m27138V3((Long) obj);
                }
            }));
        }
    }
}
