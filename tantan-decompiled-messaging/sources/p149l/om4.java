package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ContainerLabelsType;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class om4 extends AbstractC17222h4 {
    public om4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
        m164993k();
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        User user = this.f105774a;
        if (user != null && !user.isMe()) {
            boolean z = this.f105774a.superLikedMe() || this.f105774a.letter();
            if (TextUtils.isEmpty(uyk.m196292a(this.f105774a, this.f105775b.getRecommendMessage())) && !z && !this.f105775b.isUserLikeMe() && CoreModule.m29934N().mo60294M8()) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: d */
    public String mo116770d() {
        return ContainerLabelsType.user_state;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: g */
    public boolean mo116771g() {
        return true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        CoreSuggested.UserInfo userInfo = this.f105775b;
        if (userInfo == null) {
            return false;
        }
        BubbleInfo bubbleInfo = userInfo.userState;
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m164993k() {
        this.f105776c.mo36833M();
    }
}
