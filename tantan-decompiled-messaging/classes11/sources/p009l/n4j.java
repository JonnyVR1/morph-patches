package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomMomentGreetView;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.RecommendMessage;
import java.util.List;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class n4j extends wl2 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        CardBottomMomentGreetView cardBottomMomentGreetView = (CardBottomMomentGreetView) view;
        m24310k(cardBottomMomentGreetView.f2321c, c0034d, i);
        m24312m(cardBottomMomentGreetView.f2323e, c0034d, i);
        xdl0.M(cardBottomMomentGreetView.f2323e, c0034d.f815j.f818a == CardBottomFrame.MOMENT_GREET);
        cardBottomMomentGreetView.m2953Y(c0034d, frameLayout, (Act) context);
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: d */
    public void mo11839d(FrameLayout.LayoutParams layoutParams) {
        super.mo11839d(layoutParams);
        layoutParams.leftMargin = t100.d(16.0f);
        layoutParams.rightMargin = t100.d(110.0f);
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo11842i() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final List<RecommendMessage> m18774q(List<RecommendMessage> list) {
        return vwb.n(list, new w9j() { // from class: l.m4j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RecommendMessage) obj).messageType, "chat_gift"));
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final boolean m18775r() {
        try {
            return RemoteConfig.m9619x().m9651s("card_greeting_entrance");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        boolean z = false;
        if (upa.P1()) {
            if (c0034d.getUserInfo() == null || !vwb.J(m18774q(c0034d.getUserInfo().getRecommendMessage())) || !m18775r()) {
                return false;
            }
            z = c0034d.getUserInfo().canGreet || !vwb.J(m18777t(c0034d.getUserInfo().getRecommendMessage()));
            if (z) {
                if (c0034d.f815j.f818a == null || i == 0) {
                    c0034d.m1466w(cardBottomFrame, t100.d(162.0f));
                } else {
                    c0034d.m1466w(cardBottomFrame, t100.d(172.0f));
                }
                c0034d.m1465v(cardBottomFrame, t100.d(170.0f));
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: t */
    public final List<RecommendMessage> m18777t(List<RecommendMessage> list) {
        return vwb.n(list, new w9j() { // from class: l.l4j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RecommendMessage) obj).messageType, "text"));
            }
        });
    }
}
