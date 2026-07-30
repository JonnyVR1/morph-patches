package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomMomentGreetView;
import com.p051p1.mobile.putong.data.RecommendMessage;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class i7j extends em2 {
    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        CardBottomMomentGreetView cardBottomMomentGreetView = (CardBottomMomentGreetView) view;
        m121321k(cardBottomMomentGreetView.f24285c, c8021d, i);
        m121323m(cardBottomMomentGreetView.f24287e, c8021d, i);
        bnl0.m105524M(cardBottomMomentGreetView.f24287e, c8021d.f22779j.f22782a == CardBottomFrame.MOMENT_GREET);
        cardBottomMomentGreetView.m39949Y(c8021d, frameLayout, (Act) context);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: d */
    public void mo96471d(FrameLayout.LayoutParams layoutParams) {
        super.mo96471d(layoutParams);
        layoutParams.leftMargin = qa00.m175859d(16.0f);
        layoutParams.rightMargin = qa00.m175859d(110.0f);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: i */
    public boolean mo96366i() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final List<RecommendMessage> m138959q(List<RecommendMessage> list) {
        return jyb.m147522n(list, new qcj() { // from class: l.h7j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RecommendMessage) obj).messageType, MessageType.chat_gift));
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final boolean m138960r() {
        try {
            return RemoteConfig.m80481x().m80513s("card_greeting_entrance");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        boolean z = false;
        if (gra.m131613P1()) {
            if (c8021d.getUserInfo() == null || !jyb.m147479J(m138959q(c8021d.getUserInfo().getRecommendMessage())) || !m138960r()) {
                return false;
            }
            z = c8021d.getUserInfo().canGreet || !jyb.m147479J(m138962t(c8021d.getUserInfo().getRecommendMessage()));
            if (z) {
                if (c8021d.f22779j.f22782a == null || i == 0) {
                    c8021d.m38498w(cardBottomFrame, qa00.m175859d(162.0f));
                } else {
                    c8021d.m38498w(cardBottomFrame, qa00.m175859d(172.0f));
                }
                c8021d.m38497v(cardBottomFrame, qa00.m175859d(170.0f));
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: t */
    public final List<RecommendMessage> m138962t(List<RecommendMessage> list) {
        return jyb.m147522n(list, new qcj() { // from class: l.g7j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RecommendMessage) obj).messageType, "text"));
            }
        });
    }
}
