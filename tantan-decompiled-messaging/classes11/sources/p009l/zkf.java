package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.IdealTag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.j760;
import l.upa;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zkf extends alf<p3l> {

    /* JADX INFO: renamed from: c */
    public List<j760<HomeCardExpandedType, Integer>> f23716c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Context f23717d;

    /* JADX INFO: renamed from: e */
    public User f23718e;

    /* JADX INFO: renamed from: f */
    public CoreSuggested.UserInfo f23719f;

    /* JADX INFO: renamed from: g */
    public int f23720g;

    /* JADX INFO: renamed from: h */
    public ce50 f23721h;

    /* JADX INFO: renamed from: i */
    public zwk f23722i;

    public zkf(Context context) {
        this.f23717d = context;
    }

    @Override // p009l.alf
    /* JADX INFO: renamed from: c */
    public int mo11505c() {
        return this.f23716c.size();
    }

    @Override // p009l.alf
    /* JADX INFO: renamed from: e */
    public int mo11507e(int i) {
        return ((HomeCardExpandedType) this.f23716c.get(i).a).getType();
    }

    @Override // p009l.alf
    /* JADX INFO: renamed from: f */
    public String mo11508f() {
        CoreSuggested.UserInfo userInfo = this.f23719f;
        if (userInfo == null || TextUtils.isEmpty(userInfo.id)) {
            return null;
        }
        return this.f23719f.id;
    }

    @Override // p009l.alf
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo11503a(p3l p3lVar, int i, int i2) {
        j760<HomeCardExpandedType, Integer> j760Var = this.f23716c.get(i);
        p3lVar.m20097C(this.f23721h);
        p3lVar.mo2124B(this.f23719f, this.f23718e, this.f23720g, i, ((Integer) j760Var.b).intValue());
        if (p3lVar instanceof zwk) {
            this.f23722i = (zwk) p3lVar;
        }
    }

    @Override // p009l.alf
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p3l mo11504b(@NonNull ViewGroup viewGroup, int i) {
        return HomeCardExpandedType.createType(i).createHolder(this.f23717d, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public zwk m25847k() {
        return this.f23722i;
    }

    /* JADX INFO: renamed from: l */
    public final void m25848l(User user, CoreSuggested.UserInfo userInfo) {
        int i = -1;
        if (!upa.Y1() || user.isMe() || ((upa.G2() && userInfo.isShowFakePhotoFeedback) || User.isTeamAccount(((DbObject) user).id) || userInfo.isMomentInfoCard())) {
            userInfo.autoAvatarIndex = -1;
            return;
        }
        List idealList = CoreModule.c.e0.na().getIdealList();
        if (!vwb.J(idealList)) {
            for (int i2 = 1; i2 < user.pictures.size(); i2++) {
                Media media = (Media) user.pictures.get(i2);
                if (media.isPortrait && !vwb.J(media.tagIdealInfo)) {
                    Iterator it = media.tagIdealInfo.iterator();
                    while (it.hasNext()) {
                        if (idealList.contains(((IdealTag) it.next()).id)) {
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
    public void m25849m(CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f23718e = user;
        this.f23719f = userInfo;
        this.f23720g = i;
        m25848l(user, userInfo);
        m11510h(user.name);
        this.f23716c.clear();
        this.f23716c = plf.m20501d(this.f23717d, user, userInfo);
        m11509g();
    }

    /* JADX INFO: renamed from: n */
    public void m25850n(ce50 ce50Var) {
        this.f23721h = ce50Var;
    }
}
