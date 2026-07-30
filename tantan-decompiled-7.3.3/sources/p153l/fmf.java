package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class fmf extends gmf<f6l> {

    /* JADX INFO: renamed from: c */
    public List<pf60<HomeCardExpandedType, Integer>> f99769c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Context f99770d;

    /* JADX INFO: renamed from: e */
    public User f99771e;

    /* JADX INFO: renamed from: f */
    public CoreSuggested.UserInfo f99772f;

    /* JADX INFO: renamed from: g */
    public int f99773g;

    /* JADX INFO: renamed from: h */
    public jm50 f99774h;

    /* JADX INFO: renamed from: i */
    public pzk f99775i;

    public fmf(Context context) {
        this.f99770d = context;
    }

    @Override // p153l.gmf
    /* JADX INFO: renamed from: c */
    public int mo126226c() {
        return this.f99769c.size();
    }

    @Override // p153l.gmf
    /* JADX INFO: renamed from: e */
    public int mo126227e(int i) {
        return this.f99769c.get(i).f152156a.getType();
    }

    @Override // p153l.gmf
    /* JADX INFO: renamed from: f */
    public String mo126228f() {
        CoreSuggested.UserInfo userInfo = this.f99772f;
        if (userInfo == null || TextUtils.isEmpty(userInfo.f20214id)) {
            return null;
        }
        return this.f99772f.f20214id;
    }

    @Override // p153l.gmf
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo126224a(f6l f6lVar, int i, int i2) {
        pf60<HomeCardExpandedType, Integer> pf60Var = this.f99769c.get(i);
        f6lVar.m124282C(this.f99774h);
        f6lVar.mo39153B(this.f99772f, this.f99771e, this.f99773g, i, pf60Var.f152157b.intValue());
        if (f6lVar instanceof pzk) {
            this.f99775i = (pzk) f6lVar;
        }
    }

    @Override // p153l.gmf
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f6l mo126225b(@NonNull ViewGroup viewGroup, int i) {
        return HomeCardExpandedType.createType(i).createHolder(this.f99770d, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public pzk m126231k() {
        return this.f99775i;
    }

    /* JADX INFO: renamed from: l */
    public final void m126232l(User user, CoreSuggested.UserInfo userInfo) {
        int i = -1;
        if (!gra.m131649Y1() || user.isMe() || ((gra.m131570G2() && userInfo.isShowFakePhotoFeedback) || User.isTeamAccount(user.f56859id) || userInfo.isMomentInfoCard())) {
            userInfo.autoAvatarIndex = -1;
            return;
        }
        List<String> idealList = CoreModule.f18264c.f20381e0.m116593na().getIdealList();
        if (!jyb.m147479J(idealList)) {
            for (int i2 = 1; i2 < user.pictures.size(); i2++) {
                Media media = user.pictures.get(i2);
                if (media.isPortrait && !jyb.m147479J(media.tagIdealInfo)) {
                    Iterator<IdealTag> it = media.tagIdealInfo.iterator();
                    while (it.hasNext()) {
                        if (idealList.contains(it.next().f39608id)) {
                            i = i2;
                            break;
                        }
                    }
                }
                if (i > 0) {
                    break;
                }
            }
        }
        userInfo.autoAvatarIndex = i;
    }

    /* JADX INFO: renamed from: m */
    public void m126233m(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f99771e = user;
        this.f99772f = userInfo;
        this.f99773g = i;
        m126232l(user, userInfo);
        m130778h(user.name);
        this.f99769c.clear();
        this.f99769c = vmf.m201734d((Act) this.f99770d, user, userInfo);
        m130777g();
    }

    /* JADX INFO: renamed from: n */
    public void m126234n(jm50 jm50Var) {
        this.f99774h = jm50Var;
    }
}
