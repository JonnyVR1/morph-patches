package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class z9t extends x6s<ho2, w9t> {
    public z9t(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new w9t(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m132160q1().f170361E1).subscribe(ffw.m121193d(new e30() { // from class: l.x9t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191650a.m217689X3((LongLinkBottomMenu.LivePictureTextAlert) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public void m217686U3(boolean z) {
        if (z) {
            m217688W3();
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m217687V3(Long l2) {
        m217688W3();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m217688W3() {
        m206028F2().OfficialShowEvent.switchOffAnchor().m172467p();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [l.ho2] */
    /* JADX INFO: renamed from: X3 */
    public final void m217689X3(LongLinkBottomMenu.LivePictureTextAlert livePictureTextAlert) {
        if (TextUtils.isEmpty(livePictureTextAlert.getText())) {
            return;
        }
        String pictureUrl = livePictureTextAlert.getPictureUrl();
        String text = livePictureTextAlert.getText();
        String buttonText = livePictureTextAlert.getButtonText();
        boolean z = livePictureTextAlert.getAction() == LongLinkBottomMenu.LivePictureTextAlert.ActionType.anchorKickOut;
        ((w9t) this.viewModel).m202350I(pictureUrl, text, buttonText, z);
        if (z) {
            m129299H3(m206027E2().m132135h2(3, TimeUnit.SECONDS)).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.y9t
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f196989a.m217687V3((Long) obj);
                }
            }));
        }
    }
}
