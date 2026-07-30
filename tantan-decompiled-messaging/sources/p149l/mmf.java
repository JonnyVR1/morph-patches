package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.base.ScrollState;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ProfileListExpandedEditFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class mmf {

    /* JADX INFO: renamed from: a */
    public final ProfileListExpandedEditFrag f134620a;

    /* JADX INFO: renamed from: b */
    public Context f134621b;

    /* JADX INFO: renamed from: c */
    public VFrame f134622c;

    /* JADX INFO: renamed from: d */
    public UserProfileExpandedCard f134623d;

    /* JADX INFO: renamed from: e */
    public final C22392a<User> f134624e;

    /* JADX INFO: renamed from: f */
    public int f134625f;

    /* JADX INFO: renamed from: g */
    public RecyclerView.AbstractC0582t f134626g;

    /* JADX INFO: renamed from: l.mmf$a */
    public class C18502a implements oql {
        public C18502a() {
        }

        @Override // p149l.oql
        /* JADX INFO: renamed from: B */
        public void mo37396B(int i, int i2, int i3, String str, int i4) {
            mmf mmfVar = mmf.this;
            RecyclerView.AbstractC0582t abstractC0582t = mmfVar.f134626g;
            if (abstractC0582t != null) {
                abstractC0582t.onScrolled(null, 0, mmfVar.f134625f - i);
            }
            mmf.this.f134625f = i;
        }

        @Override // p149l.oql
        /* JADX INFO: renamed from: s0 */
        public void mo155391s0(ScrollState scrollState) {
            RecyclerView.AbstractC0582t abstractC0582t = mmf.this.f134626g;
            if (abstractC0582t != null) {
                int i = 0;
                if (scrollState != ScrollState.IDLE) {
                    if (scrollState == ScrollState.DRAGGING) {
                        i = 1;
                    } else if (scrollState == ScrollState.SCROLL_ANIM) {
                        i = 2;
                    }
                }
                abstractC0582t.onScrollStateChanged(null, i);
            }
        }
    }

    public mmf(final ProfileListExpandedEditFrag profileListExpandedEditFrag, Context context, VFrame vFrame) {
        C22392a<User> c22392aM221512b = C22392a.m221512b();
        this.f134624e = c22392aM221512b;
        this.f134625f = 0;
        this.f134620a = profileListExpandedEditFrag;
        this.f134621b = context;
        this.f134622c = vFrame;
        m155386j();
        profileListExpandedEditFrag.duringCreated(mkd0.m154985s(c22392aM221512b, CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), m155388l(), new y9j() { // from class: l.gmf
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return mmf.m155381e((User) obj, (User) obj2, (q860) obj3);
            }
        })).filter(new w9j() { // from class: l.hmf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(((xaj0) obj).f191751a));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.imf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113916a.m155387k(profileListExpandedEditFrag, (xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ q860 m155378b(List list) {
        return new q860(list, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ q860 m155379c(j760 j760Var) {
        return new q860((List) j760Var.f116565b, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ xaj0 m155381e(User user, User user2, q860 q860Var) {
        return new xaj0(user, user2, q860Var);
    }

    /* JADX INFO: renamed from: h */
    public UserProfileExpandedCard m155384h() {
        return this.f134623d;
    }

    /* JADX INFO: renamed from: i */
    public final LinearLayout m155385i(View view) {
        LinearLayout linearLayout = new LinearLayout(this.f134621b);
        linearLayout.setOrientation(1);
        linearLayout.addView(view);
        return linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public void m155386j() {
        View viewInflate = LayoutInflater.from(this.f134622c.getContext()).inflate(vi4.m198495a().mo102628a(true), (ViewGroup) null, true);
        UserProfileExpandedCard userProfileExpandedCard = (UserProfileExpandedCard) viewInflate;
        this.f134623d = userProfileExpandedCard;
        userProfileExpandedCard.setBackgroundResource(w0c0.f183792O0);
        UserProfileExpandedCard userProfileExpandedCard2 = this.f134623d;
        int i = t100.f167259h;
        userProfileExpandedCard2.m38020b1(i, t100.f167264m, i, t100.m186890d(114.0f));
        int i2 = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        if (NullChecker.m81303a(this.f134621b)) {
            this.f134622c.addView(m155385i(viewInflate), layoutParams);
        }
        this.f134623d.m38015X(new C18502a());
        this.f134623d.mo36817G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m155387k(final ProfileListExpandedEditFrag profileListExpandedEditFrag, xaj0 xaj0Var) {
        User user = (User) xaj0Var.f191751a;
        B b = xaj0Var.f191752b;
        user.friendCommentInfo = ((User) b).friendCommentInfo;
        user.verifications = ((User) b).verifications;
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = user.f56011id;
        userInfo.renderFrom = CardInfoRenderFrom.PROFILE_PREVIEW;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(xaj0Var.f191753c)) {
            List<T> list = ((q860) xaj0Var.f191753c).f153135a;
            if (!vwb.m200296J(list)) {
                for (T t : list) {
                    if (!vwb.m200296J(t.media)) {
                        for (Media media : t.media) {
                            if ((media instanceof Picture) || (media instanceof Video)) {
                                arrayList.add(media);
                            }
                        }
                    }
                }
            }
        }
        userInfo.userMedia = arrayList;
        userInfo.coreMomentInfoList = ((q860) xaj0Var.f191753c).f153135a;
        UserProfileExpandedCard userProfileExpandedCard = this.f134623d;
        Objects.requireNonNull(profileListExpandedEditFrag);
        userProfileExpandedCard.setPageHelper(new NewNewProfileCard.InterfaceC7863d() { // from class: l.lmf
        });
        this.f134623d.mo36852T(user, userInfo, 0);
        xdl0.m208344M(this.f134622c.findViewById(u4c0.f173846Ha), false);
        if (xdl0.m208349O0(this.f134622c)) {
            this.f134623d.mo36817G();
        }
    }

    /* JADX INFO: renamed from: l */
    public final C22306c<q860<CoreMomentInfo>> m155388l() {
        String strUserId = CoreModule.m29931H().userId();
        if (!TextUtils.equals(strUserId, CoreModule.m29931H().userId())) {
            return CoreModule.m29934N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER).map(new w9j() { // from class: l.kmf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return mmf.m155379c((j760) obj);
                }
            });
        }
        CoreModule.m29934N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER);
        return CoreModule.m29934N().mo60346di(CoreMomentInfo.JSON_ADAPTER).map(new w9j() { // from class: l.jmf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mmf.m155378b((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m155390n(RecyclerView.AbstractC0582t abstractC0582t) {
        this.f134626g = abstractC0582t;
    }

    /* JADX INFO: renamed from: m */
    public void m155389m(User user) {
    }
}
