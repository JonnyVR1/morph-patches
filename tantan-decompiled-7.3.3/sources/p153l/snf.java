package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.base.ScrollState;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ProfileListExpandedEditFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class snf {

    /* JADX INFO: renamed from: a */
    public final ProfileListExpandedEditFrag f169679a;

    /* JADX INFO: renamed from: b */
    public Context f169680b;

    /* JADX INFO: renamed from: c */
    public VFrame f169681c;

    /* JADX INFO: renamed from: d */
    public UserProfileExpandedCard f169682d;

    /* JADX INFO: renamed from: e */
    public final C22507a<User> f169683e;

    /* JADX INFO: renamed from: f */
    public int f169684f;

    /* JADX INFO: renamed from: g */
    public RecyclerView.AbstractC0584t f169685g;

    /* JADX INFO: renamed from: l.snf$a */
    public class C20115a implements atl {
        public C20115a() {
        }

        @Override // p153l.atl
        /* JADX INFO: renamed from: B */
        public void mo38399B(int i, int i2, int i3, String str, int i4) {
            snf snfVar = snf.this;
            RecyclerView.AbstractC0584t abstractC0584t = snfVar.f169685g;
            if (abstractC0584t != null) {
                abstractC0584t.onScrolled(null, 0, snfVar.f169684f - i);
            }
            snf.this.f169684f = i;
        }

        @Override // p153l.atl
        /* JADX INFO: renamed from: s0 */
        public void mo100195s0(ScrollState scrollState) {
            RecyclerView.AbstractC0584t abstractC0584t = snf.this.f169685g;
            if (abstractC0584t != null) {
                int i = 0;
                if (scrollState != ScrollState.IDLE) {
                    if (scrollState == ScrollState.DRAGGING) {
                        i = 1;
                    } else if (scrollState == ScrollState.SCROLL_ANIM) {
                        i = 2;
                    }
                }
                abstractC0584t.onScrollStateChanged(null, i);
            }
        }
    }

    public snf(final ProfileListExpandedEditFrag profileListExpandedEditFrag, Context context, VFrame vFrame) {
        C22507a<User> c22507aM222758b = C22507a.m222758b();
        this.f169683e = c22507aM222758b;
        this.f169684f = 0;
        this.f169679a = profileListExpandedEditFrag;
        this.f169680b = context;
        this.f169681c = vFrame;
        m186909j();
        profileListExpandedEditFrag.duringCreated(psd0.m173626s(c22507aM222758b, CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), m186911l(), new scj() { // from class: l.mnf
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return snf.m186904e((User) obj, (User) obj2, (vg60) obj3);
            }
        })).filter(new qcj() { // from class: l.nnf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(((bkj0) obj).f77081a));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.onf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148083a.m186910k(profileListExpandedEditFrag, (bkj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ vg60 m186901b(List list) {
        return new vg60(list, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ vg60 m186902c(pf60 pf60Var) {
        return new vg60((List) pf60Var.f152157b, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ bkj0 m186904e(User user, User user2, vg60 vg60Var) {
        return new bkj0(user, user2, vg60Var);
    }

    /* JADX INFO: renamed from: h */
    public UserProfileExpandedCard m186907h() {
        return this.f169682d;
    }

    /* JADX INFO: renamed from: i */
    public final LinearLayout m186908i(View view) {
        LinearLayout linearLayout = new LinearLayout(this.f169680b);
        linearLayout.setOrientation(1);
        linearLayout.addView(view);
        return linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public void m186909j() {
        View viewInflate = LayoutInflater.from(this.f169681c.getContext()).inflate(uj4.m196316a().mo136048a(true), (ViewGroup) null, true);
        UserProfileExpandedCard userProfileExpandedCard = (UserProfileExpandedCard) viewInflate;
        this.f169682d = userProfileExpandedCard;
        userProfileExpandedCard.setBackgroundResource(c9c0.f80364P0);
        UserProfileExpandedCard userProfileExpandedCard2 = this.f169682d;
        int i = qa00.f156321h;
        userProfileExpandedCard2.m39023b1(i, qa00.f156326m, i, qa00.m175859d(114.0f));
        int i2 = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        if (NullChecker.m82486a(this.f169680b)) {
            this.f169681c.addView(m186908i(viewInflate), layoutParams);
        }
        this.f169682d.m39018X(new C20115a());
        this.f169682d.mo37820G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m186910k(final ProfileListExpandedEditFrag profileListExpandedEditFrag, bkj0 bkj0Var) {
        User user = (User) bkj0Var.f77081a;
        B b = bkj0Var.f77082b;
        user.friendCommentInfo = ((User) b).friendCommentInfo;
        user.verifications = ((User) b).verifications;
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = user.f56859id;
        userInfo.renderFrom = CardInfoRenderFrom.PROFILE_PREVIEW;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(bkj0Var.f77083c)) {
            List<T> list = ((vg60) bkj0Var.f77083c).f184001a;
            if (!jyb.m147479J(list)) {
                for (T t : list) {
                    if (!jyb.m147479J(t.media)) {
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
        userInfo.coreMomentInfoList = ((vg60) bkj0Var.f77083c).f184001a;
        UserProfileExpandedCard userProfileExpandedCard = this.f169682d;
        Objects.requireNonNull(profileListExpandedEditFrag);
        userProfileExpandedCard.setPageHelper(new NewNewProfileCard.InterfaceC8014d() { // from class: l.rnf
        });
        this.f169682d.mo37855T(user, userInfo, 0);
        bnl0.m105524M(this.f169681c.findViewById(adc0.f69968Ja), false);
        if (bnl0.m105529O0(this.f169681c)) {
            this.f169682d.mo37820G();
        }
    }

    /* JADX INFO: renamed from: l */
    public final C22421c<vg60<CoreMomentInfo>> m186911l() {
        String strUserId = CoreModule.m30929H().userId();
        if (!TextUtils.equals(strUserId, CoreModule.m30929H().userId())) {
            return CoreModule.m30932N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER).map(new qcj() { // from class: l.qnf
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return snf.m186902c((pf60) obj);
                }
            });
        }
        CoreModule.m30932N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER);
        return CoreModule.m30932N().mo61530di(CoreMomentInfo.JSON_ADAPTER).map(new qcj() { // from class: l.pnf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return snf.m186901b((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m186913n(RecyclerView.AbstractC0584t abstractC0584t) {
        this.f169685g = abstractC0584t;
    }

    /* JADX INFO: renamed from: m */
    public void m186912m(User user) {
    }
}
