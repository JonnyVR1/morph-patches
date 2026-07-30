package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.annotation.SuppressLint;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p153l.h9n;
import p153l.jxd0;
import p153l.l4g0;
import p153l.pk50;
import p153l.pzi0;
import p153l.spl0;
import p153l.tzi0;
import p153l.ur2;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n */
/* JADX INFO: loaded from: classes11.dex */
public class C8061n extends SwipeDialogOmsLimitStrategy {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public jxd0 f22852j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n$a */
    public class a extends ur2 {
        public a() {
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_profile_picture_popup";
        }
    }

    public C8061n(String str, boolean z) {
        super(str, z);
        this.f22852j = new jxd0("has_shown_crop_picture_guide_dlg_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo38503q(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo38505s(C8049j.a aVar) {
        if (aVar.f22839d != SwipeDirection.RIGHT || aVar.f22842g || (!spl0.m187354F() && this.f22852j.get().booleanValue())) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        if (NullChecker.m82486a(aVar.f22838c) && NullChecker.m82486a(aVar.f22838c.m140259d())) {
            for (int i = 0; i < aVar.f22838c.m140259d().pictures.size(); i++) {
                if (m38697t(aVar.f22838c.m140259d().picture(i))) {
                    User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                    long j = (long) CoreModule.f18264c.f20381e0.m116600p9().createdTime;
                    if (!spl0.m187354F() && !tzi0.m193670h(pzi0.m174454o(), j, 7)) {
                        return SwipeDialogOmsLimitStrategy.HandleState.refuse;
                    }
                    for (int i2 = 0; i2 < userM116600p9.pictures.size(); i2++) {
                        if (m38697t(userM116600p9.picture(i2))) {
                            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
                        }
                    }
                    this.f22852j.put(Boolean.TRUE);
                    aVar.f22837b.act();
                    l4g0 l4g0Var = new l4g0(new a());
                    l4g0Var.m152780o(pk50.m172568j().m172574f().m181657U(OmsDialog.p_profile_picture_popup.getIdentifier(), new JSONObject()));
                    l4g0Var.m152777l();
                    aVar.f22842g = true;
                    return SwipeDialogOmsLimitStrategy.HandleState.direct;
                }
            }
        }
        return SwipeDialogOmsLimitStrategy.HandleState.refuse;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m38697t(Picture picture) {
        if (h9n.m134081c()) {
            return !m38698u(picture);
        }
        Dimension dimension = picture.size;
        return Math.abs(((((float) dimension.width) * 1.0f) / ((float) dimension.height)) - 0.8f) < 0.06f;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m38698u(Picture picture) {
        Dimension dimension = picture.size;
        return Math.abs(((((float) dimension.width) * 1.0f) / ((float) dimension.height)) - 1.0f) < 0.05f;
    }
}
