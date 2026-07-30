package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.annotation.SuppressLint;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p149l.cwf0;
import p149l.er2;
import p149l.h7n;
import p149l.hpd0;
import p149l.ic50;
import p149l.mqi0;
import p149l.ogl0;
import p149l.qqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n */
/* JADX INFO: loaded from: classes11.dex */
public class C7910n extends SwipeDialogOmsLimitStrategy {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public hpd0 f22110j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n$a */
    public class a extends er2 {
        public a() {
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_profile_picture_popup";
        }
    }

    public C7910n(String str, boolean z) {
        super(str, z);
        this.f22110j = new hpd0("has_shown_crop_picture_guide_dlg_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo37500q(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo37502s(C7898j.a aVar) {
        if (aVar.f22097d != SwipeDirection.RIGHT || aVar.f22100g || (!ogl0.m164227F() && this.f22110j.get().booleanValue())) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        if (NullChecker.m81303a(aVar.f22096c) && NullChecker.m81303a(aVar.f22096c.m141745d())) {
            for (int i = 0; i < aVar.f22096c.m141745d().pictures.size(); i++) {
                if (m37694t(aVar.f22096c.m141745d().picture(i))) {
                    User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                    long j = (long) CoreModule.f17545c.f19639e0.m169527p9().createdTime;
                    if (!ogl0.m164227F() && !qqi0.m175940h(mqi0.m155944o(), j, 7)) {
                        return SwipeDialogOmsLimitStrategy.HandleState.refuse;
                    }
                    for (int i2 = 0; i2 < userM169527p9.pictures.size(); i2++) {
                        if (m37694t(userM169527p9.picture(i2))) {
                            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
                        }
                    }
                    this.f22110j.put(Boolean.TRUE);
                    aVar.f22095b.act();
                    cwf0 cwf0Var = new cwf0(new a());
                    cwf0Var.m109039o(ic50.m135327j().m135333f().m145234U(OmsDialog.p_profile_picture_popup.getIdentifier(), new JSONObject()));
                    cwf0Var.m109036l();
                    aVar.f22100g = true;
                    return SwipeDialogOmsLimitStrategy.HandleState.direct;
                }
            }
        }
        return SwipeDialogOmsLimitStrategy.HandleState.refuse;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m37694t(Picture picture) {
        if (h7n.m129754c()) {
            return !m37695u(picture);
        }
        Dimension dimension = picture.size;
        return Math.abs(((((float) dimension.width) * 1.0f) / ((float) dimension.height)) - 0.8f) < 0.06f;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m37695u(Picture picture) {
        Dimension dimension = picture.size;
        return Math.abs(((((float) dimension.width) * 1.0f) / ((float) dimension.height)) - 1.0f) < 0.05f;
    }
}
