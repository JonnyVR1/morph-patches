package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentGreetView;
import com.p046p1.mobile.putong.data.RecommendMessage;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class n4j extends wl2 {
    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        CardBottomMomentGreetView cardBottomMomentGreetView = (CardBottomMomentGreetView) view;
        m203741k(cardBottomMomentGreetView.f23543c, c7870d, i);
        m203743m(cardBottomMomentGreetView.f23545e, c7870d, i);
        xdl0.m208344M(cardBottomMomentGreetView.f23545e, c7870d.f22037j.f22040a == CardBottomFrame.MOMENT_GREET);
        cardBottomMomentGreetView.m38946Y(c7870d, frameLayout, (Act) context);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: d */
    public void mo100262d(FrameLayout.LayoutParams layoutParams) {
        super.mo100262d(layoutParams);
        layoutParams.leftMargin = t100.m186890d(16.0f);
        layoutParams.rightMargin = t100.m186890d(110.0f);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo100265i() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final List<RecommendMessage> m157869q(List<RecommendMessage> list) {
        return vwb.m200339n(list, new w9j() { // from class: l.m4j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RecommendMessage) obj).messageType, MessageType.chat_gift));
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final boolean m157870r() {
        try {
            return RemoteConfig.m79298x().m79330s("card_greeting_entrance");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        boolean z = false;
        if (upa.m194682P1()) {
            if (c7870d.getUserInfo() == null || !vwb.m200296J(m157869q(c7870d.getUserInfo().getRecommendMessage())) || !m157870r()) {
                return false;
            }
            z = c7870d.getUserInfo().canGreet || !vwb.m200296J(m157872t(c7870d.getUserInfo().getRecommendMessage()));
            if (z) {
                if (c7870d.f22037j.f22040a == null || i == 0) {
                    c7870d.m37495w(cardBottomFrame, t100.m186890d(162.0f));
                } else {
                    c7870d.m37495w(cardBottomFrame, t100.m186890d(172.0f));
                }
                c7870d.m37494v(cardBottomFrame, t100.m186890d(170.0f));
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: t */
    public final List<RecommendMessage> m157872t(List<RecommendMessage> list) {
        return vwb.m200339n(list, new w9j() { // from class: l.l4j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RecommendMessage) obj).messageType, "text"));
            }
        });
    }
}
