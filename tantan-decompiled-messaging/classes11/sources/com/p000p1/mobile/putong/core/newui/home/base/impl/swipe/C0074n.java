package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.annotation.SuppressLint;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.er2;
import l.h7n;
import l.hpd0;
import l.ogl0;
import l.qqi0;
import org.json.JSONObject;
import p009l.ic50;
import p009l.mqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0074n extends SwipeDialogOmsLimitStrategy {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public hpd0 f888j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n$a */
    public class a extends er2 {
        public a() {
        }

        public String pageId() {
            return "p_profile_picture_popup";
        }
    }

    public C0074n(String str, boolean z) {
        super(str, z);
        this.f888j = new hpd0("has_shown_crop_picture_guide_dlg_" + CoreModule.H().userId(), Boolean.FALSE);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo1471q(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo1473s(C0062j.a aVar) {
        if (aVar.f875d != SwipeDirection.RIGHT || aVar.f878g || (!ogl0.F() && ((Boolean) this.f888j.get()).booleanValue())) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        if (NullChecker.a(aVar.f874c) && NullChecker.a(aVar.f874c.m17130d())) {
            for (int i = 0; i < aVar.f874c.m17130d().pictures.size(); i++) {
                if (m1665t(aVar.f874c.m17130d().picture(i))) {
                    User userP9 = CoreModule.c.e0.p9();
                    long j = (long) CoreModule.c.e0.p9().createdTime;
                    if (!ogl0.F() && !qqi0.h(mqi0.m18550o(), j, 7)) {
                        return SwipeDialogOmsLimitStrategy.HandleState.refuse;
                    }
                    for (int i2 = 0; i2 < userP9.pictures.size(); i2++) {
                        if (m1665t(userP9.picture(i2))) {
                            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
                        }
                    }
                    this.f888j.put(Boolean.TRUE);
                    aVar.f873b.act();
                    cwf0 cwf0Var = new cwf0(new a());
                    cwf0Var.o(ic50.m16316j().m16322f().m17400U(OmsDialog.p_profile_picture_popup.getIdentifier(), new JSONObject()));
                    cwf0Var.l();
                    aVar.f878g = true;
                    return SwipeDialogOmsLimitStrategy.HandleState.direct;
                }
            }
        }
        return SwipeDialogOmsLimitStrategy.HandleState.refuse;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1665t(Picture picture) {
        if (h7n.c()) {
            return !m1666u(picture);
        }
        Dimension dimension = picture.size;
        return Math.abs(((((float) dimension.width) * 1.0f) / ((float) dimension.height)) - 0.8f) < 0.06f;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1666u(Picture picture) {
        Dimension dimension = picture.size;
        return Math.abs(((((float) dimension.width) * 1.0f) / ((float) dimension.height)) - 1.0f) < 0.05f;
    }
}
