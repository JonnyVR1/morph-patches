package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.User;
import l.uyk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class om4 extends AbstractC0925h4 {
    public om4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
        m19972k();
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        User user = this.f13854a;
        if (user != null && !user.isMe()) {
            boolean z = this.f13854a.superLikedMe() || this.f13854a.letter();
            if (TextUtils.isEmpty(uyk.a(this.f13854a, this.f13855b.getRecommendMessage())) && !z && !this.f13855b.isUserLikeMe() && CoreModule.N().M8()) {
                return true;
            }
        }
        return false;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: d */
    public String mo13955d() {
        return "user_state";
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: g */
    public boolean mo13956g() {
        return true;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        CoreSuggested.UserInfo userInfo = this.f13855b;
        if (userInfo == null) {
            return false;
        }
        BubbleInfo bubbleInfo = userInfo.userState;
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m19972k() {
        this.f13856c.mo789M();
    }
}
