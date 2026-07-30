package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ContainerLabelsType;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class nn4 extends AbstractC17382h4 {
    public nn4(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
        m163854k();
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        User user = this.f107713a;
        if (user != null && !user.isMe()) {
            boolean z = this.f107713a.superLikedMe() || this.f107713a.letter();
            if (TextUtils.isEmpty(k1l.m147864a(this.f107713a, this.f107714b.getRecommendMessage())) && !z && !this.f107714b.isUserLikeMe() && CoreModule.m30932N().mo61478M8()) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: d */
    public String mo116207d() {
        return ContainerLabelsType.user_state;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: g */
    public boolean mo116208g() {
        return true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        CoreSuggested.UserInfo userInfo = this.f107714b;
        if (userInfo == null) {
            return false;
        }
        BubbleInfo bubbleInfo = userInfo.userState;
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m163854k() {
        this.f107715c.mo37836M();
    }
}
