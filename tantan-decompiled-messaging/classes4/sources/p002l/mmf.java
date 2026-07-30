package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ProfileListExpandedEditFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p1.mobile.putong.core.newui.home.card.expanded.base.ScrollState;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.e30;
import l.j760;
import l.mkd0;
import l.oql;
import l.q860;
import l.t100;
import l.u4c0;
import l.vi4;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.y9j;
import rx.c;
import rx.subjects.a;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mmf {

    /* JADX INFO: renamed from: a */
    public final ProfileListExpandedEditFrag f15477a;

    /* JADX INFO: renamed from: b */
    public Context f15478b;

    /* JADX INFO: renamed from: c */
    public VFrame f15479c;

    /* JADX INFO: renamed from: d */
    public UserProfileExpandedCard f15480d;

    /* JADX INFO: renamed from: e */
    public final a<User> f15481e;

    /* JADX INFO: renamed from: f */
    public int f15482f;

    /* JADX INFO: renamed from: g */
    public RecyclerView.t f15483g;

    /* JADX INFO: renamed from: l.mmf$a */
    public class C0679a implements oql {
        public C0679a() {
        }

        /* JADX INFO: renamed from: B */
        public void m18038B(int i, int i2, int i3, String str, int i4) {
            mmf mmfVar = mmf.this;
            RecyclerView.t tVar = mmfVar.f15483g;
            if (tVar != null) {
                tVar.onScrolled((RecyclerView) null, 0, mmfVar.f15482f - i);
            }
            mmf.this.f15482f = i;
        }

        /* JADX INFO: renamed from: s0 */
        public void m18039s0(ScrollState scrollState) {
            RecyclerView.t tVar = mmf.this.f15483g;
            if (tVar != null) {
                int i = 0;
                if (scrollState != ScrollState.IDLE) {
                    if (scrollState == ScrollState.DRAGGING) {
                        i = 1;
                    } else if (scrollState == ScrollState.SCROLL_ANIM) {
                        i = 2;
                    }
                }
                tVar.onScrollStateChanged((RecyclerView) null, i);
            }
        }
    }

    public mmf(final ProfileListExpandedEditFrag profileListExpandedEditFrag, Context context, VFrame vFrame) {
        a<User> aVarB = a.b();
        this.f15481e = aVarB;
        this.f15482f = 0;
        this.f15477a = profileListExpandedEditFrag;
        this.f15478b = context;
        this.f15479c = vFrame;
        m18033j();
        profileListExpandedEditFrag.duringCreated(mkd0.s(aVarB, CoreModule.c.e0.o9().distinctUntilChanged(), m18035l(), new y9j() { // from class: l.gmf
            /* JADX INFO: renamed from: a */
            public final Object m13943a(Object obj, Object obj2, Object obj3) {
                return mmf.m18028e((User) obj, (User) obj2, (q860) obj3);
            }
        })).filter(new w9j() { // from class: l.hmf
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(((xaj0) obj).a));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.imf
            public final void call(Object obj) {
                this.f13306a.m18034k(profileListExpandedEditFrag, (xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ q860 m18025b(List list) {
        return new q860(list, (DbLinks) null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ q860 m18026c(j760 j760Var) {
        return new q860((List) j760Var.b, (DbLinks) null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ xaj0 m18028e(User user, User user2, q860 q860Var) {
        return new xaj0(user, user2, q860Var);
    }

    /* JADX INFO: renamed from: h */
    public UserProfileExpandedCard m18031h() {
        return this.f15480d;
    }

    /* JADX INFO: renamed from: i */
    public final LinearLayout m18032i(View view) {
        LinearLayout linearLayout = new LinearLayout(this.f15478b);
        linearLayout.setOrientation(1);
        linearLayout.addView(view);
        return linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public void m18033j() {
        UserProfileExpandedCard userProfileExpandedCardInflate = LayoutInflater.from(this.f15479c.getContext()).inflate(vi4.a().a(true), (ViewGroup) null, true);
        UserProfileExpandedCard userProfileExpandedCard = userProfileExpandedCardInflate;
        this.f15480d = userProfileExpandedCard;
        userProfileExpandedCard.setBackgroundResource(w0c0.O0);
        UserProfileExpandedCard userProfileExpandedCard2 = this.f15480d;
        int i = t100.h;
        userProfileExpandedCard2.b1(i, t100.m, i, t100.d(114.0f));
        int i2 = xdl0.e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        if (NullChecker.a(this.f15478b)) {
            this.f15479c.addView(m18032i(userProfileExpandedCardInflate), layoutParams);
        }
        this.f15480d.X(new C0679a());
        this.f15480d.G();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m18034k(final ProfileListExpandedEditFrag profileListExpandedEditFrag, xaj0 xaj0Var) {
        User user = (User) xaj0Var.a;
        Object obj = xaj0Var.b;
        user.friendCommentInfo = ((User) obj).friendCommentInfo;
        user.verifications = ((User) obj).verifications;
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = ((DbObject) user).id;
        userInfo.renderFrom = CardInfoRenderFrom.PROFILE_PREVIEW;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(xaj0Var.c)) {
            List<CoreMomentInfo> list = ((q860) xaj0Var.c).a;
            if (!vwb.J(list)) {
                for (CoreMomentInfo coreMomentInfo : list) {
                    if (!vwb.J(coreMomentInfo.media)) {
                        for (Media media : coreMomentInfo.media) {
                            if ((media instanceof Picture) || (media instanceof Video)) {
                                arrayList.add(media);
                            }
                        }
                    }
                }
            }
        }
        userInfo.userMedia = arrayList;
        userInfo.coreMomentInfoList = ((q860) xaj0Var.c).a;
        UserProfileExpandedCard userProfileExpandedCard = this.f15480d;
        Objects.requireNonNull(profileListExpandedEditFrag);
        userProfileExpandedCard.setPageHelper(new NewNewProfileCard.d() { // from class: l.lmf
        });
        this.f15480d.T(user, userInfo, 0);
        xdl0.M(this.f15479c.findViewById(u4c0.Ha), false);
        if (xdl0.O0(this.f15479c)) {
            this.f15480d.G();
        }
    }

    /* JADX INFO: renamed from: l */
    public final c<q860<CoreMomentInfo>> m18035l() {
        String strUserId = CoreModule.H().userId();
        if (!TextUtils.equals(strUserId, CoreModule.H().userId())) {
            return CoreModule.N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER).map(new w9j() { // from class: l.kmf
                public final Object call(Object obj) {
                    return mmf.m18026c((j760) obj);
                }
            });
        }
        CoreModule.N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER);
        return CoreModule.N().di(CoreMomentInfo.JSON_ADAPTER).map(new w9j() { // from class: l.jmf
            public final Object call(Object obj) {
                return mmf.m18025b((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m18037n(RecyclerView.t tVar) {
        this.f15483g = tVar;
    }

    /* JADX INFO: renamed from: m */
    public void m18036m(User user) {
    }
}
