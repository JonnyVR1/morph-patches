package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zkf extends alf<p3l> {

    /* JADX INFO: renamed from: c */
    public List<j760<HomeCardExpandedType, Integer>> f203531c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Context f203532d;

    /* JADX INFO: renamed from: e */
    public User f203533e;

    /* JADX INFO: renamed from: f */
    public CoreSuggested.UserInfo f203534f;

    /* JADX INFO: renamed from: g */
    public int f203535g;

    /* JADX INFO: renamed from: h */
    public ce50 f203536h;

    /* JADX INFO: renamed from: i */
    public zwk f203537i;

    public zkf(Context context) {
        this.f203532d = context;
    }

    @Override // p149l.alf
    /* JADX INFO: renamed from: c */
    public int mo97283c() {
        return this.f203531c.size();
    }

    @Override // p149l.alf
    /* JADX INFO: renamed from: e */
    public int mo97285e(int i) {
        return this.f203531c.get(i).f116564a.getType();
    }

    @Override // p149l.alf
    /* JADX INFO: renamed from: f */
    public String mo97286f() {
        CoreSuggested.UserInfo userInfo = this.f203534f;
        if (userInfo == null || TextUtils.isEmpty(userInfo.f19472id)) {
            return null;
        }
        return this.f203534f.f19472id;
    }

    @Override // p149l.alf
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo97281a(p3l p3lVar, int i, int i2) {
        j760<HomeCardExpandedType, Integer> j760Var = this.f203531c.get(i);
        p3lVar.m167251C(this.f203536h);
        p3lVar.mo38150B(this.f203534f, this.f203533e, this.f203535g, i, j760Var.f116565b.intValue());
        if (p3lVar instanceof zwk) {
            this.f203537i = (zwk) p3lVar;
        }
    }

    @Override // p149l.alf
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p3l mo97282b(@NonNull ViewGroup viewGroup, int i) {
        return HomeCardExpandedType.createType(i).createHolder(this.f203532d, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public zwk m219177k() {
        return this.f203537i;
    }

    /* JADX INFO: renamed from: l */
    public final void m219178l(User user, CoreSuggested.UserInfo userInfo) {
        int i = -1;
        if (!upa.m194718Y1() || user.isMe() || ((upa.m194639G2() && userInfo.isShowFakePhotoFeedback) || User.isTeamAccount(user.f56011id) || userInfo.isMomentInfoCard())) {
            userInfo.autoAvatarIndex = -1;
            return;
        }
        List<String> idealList = CoreModule.f17545c.f19639e0.m169520na().getIdealList();
        if (!vwb.m200296J(idealList)) {
            for (int i2 = 1; i2 < user.pictures.size(); i2++) {
                Media media = user.pictures.get(i2);
                if (media.isPortrait && !vwb.m200296J(media.tagIdealInfo)) {
                    Iterator<IdealTag> it = media.tagIdealInfo.iterator();
                    while (it.hasNext()) {
                        if (idealList.contains(it.next().f38760id)) {
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
    public void m219179m(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f203533e = user;
        this.f203534f = userInfo;
        this.f203535g = i;
        m219178l(user, userInfo);
        m97288h(user.name);
        this.f203531c.clear();
        this.f203531c = plf.m170172d((Act) this.f203532d, user, userInfo);
        m97287g();
    }

    /* JADX INFO: renamed from: n */
    public void m219180n(ce50 ce50Var) {
        this.f203536h = ce50Var;
    }
}
