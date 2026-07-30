package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class act extends y8s<oo2, xbt> {
    public act(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new xbt(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m168545q1().f71628E1).subscribe(dhw.m115825d(new y20() { // from class: l.ybt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198361a.m96975X3((LongLinkBottomMenu.LivePictureTextAlert) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public void m96972U3(boolean z) {
        if (z) {
            m96974W3();
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m96973V3(Long l2) {
        m96974W3();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m96974W3() {
        m213811F2().OfficialShowEvent.switchOffAnchor().m199277p();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [l.oo2] */
    /* JADX INFO: renamed from: X3 */
    public final void m96975X3(LongLinkBottomMenu.LivePictureTextAlert livePictureTextAlert) {
        if (TextUtils.isEmpty(livePictureTextAlert.getText())) {
            return;
        }
        String pictureUrl = livePictureTextAlert.getPictureUrl();
        String text = livePictureTextAlert.getText();
        String buttonText = livePictureTextAlert.getButtonText();
        boolean z = livePictureTextAlert.getAction() == LongLinkBottomMenu.LivePictureTextAlert.ActionType.anchorKickOut;
        ((xbt) this.viewModel).m210002I(pictureUrl, text, buttonText, z);
        if (z) {
            m138858H3(m213810E2().m168521h2(3, TimeUnit.SECONDS)).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.zbt
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203703a.m96973V3((Long) obj);
                }
            }));
        }
    }
}
