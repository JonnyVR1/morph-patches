package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.PkBottomMenuView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class va2 extends df2<PkBottomMenuView> {
    public va2(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f168144P4, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m197614k4(soj0 soj0Var) {
        m197617n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m197615l4(soj0 soj0Var) {
        m197618o4();
    }

    @Override // p149l.df2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().BottomEvent.startPkAnim().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ta2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169089a.m197614k4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.stopPkAnim().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ua2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175546a.m197615l4((soj0) obj);
            }
        }));
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        if (this.f188512e.f77104j.m201577L3(MotionType.multi_call)) {
            Boolean bool = (Boolean) m129297F3(new ik10(800).m136756e(ypv.f199493a.m199309D0()));
            Boolean bool2 = (Boolean) m129297F3(new jk10(800));
            if (bool.booleanValue() && bool2.booleanValue()) {
                m206028F2().MultiCallEvent.clickPkOver().mo172463j((List) m129297F3(new qk10(800)));
            } else if (bool2.booleanValue()) {
                lsi0.m151595y("正在PK中，请稍后再试");
            } else {
                m206028F2().MultiCallEvent.clickBottomPkIcon().m172467p();
            }
        }
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.multiCallPkButton);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: m4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(PkBottomMenuView pkBottomMenuView) {
        super.mo108215d4(pkBottomMenuView);
        pkBottomMenuView.setLayoutParams(new LinearLayout.LayoutParams(df2.f85884o, df2.f85885p));
        String strMo111417Z3 = mo111417Z3();
        if (!TextUtils.isEmpty(strMo111417Z3)) {
            pkBottomMenuView.setIcon(strMo111417Z3);
        } else if (this.f85888l.fillUp) {
            pkBottomMenuView.setIcon(i3c0.f111028h6);
            pkBottomMenuView.setPkBackGround(true);
        } else {
            pkBottomMenuView.setIcon(i3c0.f111016g6);
            pkBottomMenuView.setPkBackGround(false);
        }
        m206028F2().BootBubbleEvent.showBubbleById().mo172463j("301");
    }

    /* JADX INFO: renamed from: n4 */
    public void m197617n4() {
        ((PkBottomMenuView) this.f85887k).m72187b();
    }

    /* JADX INFO: renamed from: o4 */
    public void m197618o4() {
        ((PkBottomMenuView) this.f85887k).m72188c();
    }
}
