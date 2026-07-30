package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundFrameLayout;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class rx00 extends f6l {

    /* JADX INFO: renamed from: z */
    public static final int f165265z = kec0.f125529N0;

    /* JADX INFO: renamed from: f */
    public VLinear f165266f;

    /* JADX INFO: renamed from: g */
    public VLinear f165267g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f165268h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f165269i;

    /* JADX INFO: renamed from: j */
    public SimpleDraweeView f165270j;

    /* JADX INFO: renamed from: k */
    public SimpleDraweeView f165271k;

    /* JADX INFO: renamed from: l */
    public SimpleDraweeView f165272l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f165273m;

    /* JADX INFO: renamed from: n */
    public SimpleDraweeView f165274n;

    /* JADX INFO: renamed from: o */
    public SimpleDraweeView f165275o;

    /* JADX INFO: renamed from: p */
    public VFrame f165276p;

    /* JADX INFO: renamed from: q */
    public SimpleDraweeView f165277q;

    /* JADX INFO: renamed from: r */
    public VFrame f165278r;

    /* JADX INFO: renamed from: s */
    public RoundFrameLayout f165279s;

    /* JADX INFO: renamed from: t */
    public VText f165280t;

    /* JADX INFO: renamed from: u */
    public VText f165281u;

    /* JADX INFO: renamed from: v */
    public List<SimpleDraweeView> f165282v = new ArrayList();

    /* JADX INFO: renamed from: w */
    public x20 f165283w;

    /* JADX INFO: renamed from: x */
    public User f165284x;

    /* JADX INFO: renamed from: y */
    public CoreSuggested.UserInfo f165285y;

    /* JADX INFO: renamed from: l.rx00$a */
    public class ViewOnClickListenerC19926a implements View.OnClickListener {
        public ViewOnClickListenerC19926a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rx00.this.m183517O().call();
        }
    }

    /* JADX INFO: renamed from: l.rx00$b */
    public class ViewOnClickListenerC19927b implements View.OnClickListener {
        public ViewOnClickListenerC19927b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rx00.this.m183517O().call();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ C22421c m183505F(String str, Boolean bool) {
        return bool.booleanValue() ? CoreModule.m30932N().coreMomentMoments(str, CoreMomentInfo.JSON_ADAPTER) : CoreModule.m30932N().coreMomentCachedMoments(str, 0, CoreMomentInfo.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m183506G(Throwable th) {
    }

    @NonNull
    /* JADX INFO: renamed from: N */
    public static List<Media> m183511N(List<CoreMomentInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (CoreMomentInfo coreMomentInfo : list) {
            if (!jyb.m147479J(coreMomentInfo.media)) {
                for (Media media : coreMomentInfo.media) {
                    if (media instanceof Picture) {
                        arrayList.add(media);
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        if (NullChecker.m82487b(video.cover) && NullChecker.m82487b(video.cover.url)) {
                            arrayList.add(media);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m183512P(CoreMomentInfo coreMomentInfo) {
        return NullChecker.m82486a(coreMomentInfo) && m183513Q(coreMomentInfo.media);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m183513Q(List<Media> list) {
        return list.size() > 0 && (list.get(0) instanceof Audio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m183514R(View view) {
        m183517O().call();
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(final CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f165284x = user;
        this.f165285y = userInfo;
        bnl0.m105524M(m116952m(), false);
        if (jyb.m147479J(userInfo.coreMomentInfoList)) {
            m116950k(m124283w(), m183522W()).subscribe(psd0.m173597H(new y20() { // from class: l.nx00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144059a.m183520U(userInfo, (vg60) obj);
                }
            }, new y20() { // from class: l.ox00
                @Override // p153l.y20
                public final void call(Object obj) {
                    rx00.m183506G((Throwable) obj);
                }
            }));
        } else {
            m183524Y(userInfo.coreMomentInfoList);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m183515L(View view) {
        sx00.m188417a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public final List<CoreMomentInfo> m183516M(List<CoreMomentInfo> list) {
        return jyb.m147522n(list, new qcj() { // from class: l.px00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!rx00.m183512P((CoreMomentInfo) obj));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final x20 m183517O() {
        if (this.f165283w == null) {
            this.f165283w = new x20() { // from class: l.mx00
                @Override // p153l.x20
                public final void call() {
                    this.f139173a.m183519T();
                }
            };
        }
        return this.f165283w;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m183518S(View view) {
        m183517O().call();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m183519T() {
        CoreSuggested.UserInfo userInfo = this.f165285y;
        if (userInfo != null) {
            fr90 fr90Var = userInfo.profileContext;
            if ((fr90Var instanceof zq90) && "from_guess_liker_result".equals(((zq90) fr90Var).f205577b)) {
                return;
            }
        }
        if (this.f165284x == null) {
            return;
        }
        m116952m().getContext().startActivity(CoreModule.m30932N().argsToMomentsInProfileAct(m116952m().getContext(), this.f165284x.f56859id, "from_ProfileFrag"));
        sfj0.m185596c("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, sfj0.C20032a.m185615h("owner_id", this.f165284x.f56859id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m183520U(CoreSuggested.UserInfo userInfo, vg60 vg60Var) {
        List list = vg60Var.f184001a;
        userInfo.coreMomentInfoList = list;
        m183524Y(list);
    }

    /* JADX INFO: renamed from: V */
    public void m183521V(Media media, SimpleDraweeView simpleDraweeView) {
        if (media instanceof Picture) {
            bnl0.m105525M0(simpleDraweeView, true);
            uqb0.f180374G.m127125Q0(simpleDraweeView, ((Picture) media).momentPictureSmall());
            simpleDraweeView.setOnClickListener(new ViewOnClickListenerC19926a());
        } else if (media instanceof Video) {
            Video video = (Video) media;
            if (NullChecker.m82487b(video.cover) && NullChecker.m82487b(video.cover.url)) {
                bnl0.m105525M0(simpleDraweeView, true);
                uqb0.f180374G.m127125Q0(simpleDraweeView, video.cover.momentPictureSmall());
                simpleDraweeView.getHierarchy().mo118277c(new x0e0(CoreModule.f18263b.getResources().getDrawable(gra.m131778z() ? dbc0.f86538Rh : dbc0.f86421Ns), h1e0.f107450g));
                simpleDraweeView.setOnClickListener(new ViewOnClickListenerC19927b());
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final C22421c<vg60<CoreMomentInfo>> m183522W() {
        User user = this.f165284x;
        final String str = user.f56859id;
        return user.isMe() ? CoreModule.m30932N().coreMomentMoments(str, CoreMomentInfo.JSON_ADAPTER) : CoreModule.f18264c.f20384f0.m34173wh(str).flatMap(new qcj() { // from class: l.qx00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rx00.m183505F(str, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final boolean m183523X(List<CoreMomentInfo> list) {
        CoreMomentInfo coreMomentInfo = list.get(0);
        if (jyb.m147479J(coreMomentInfo.media) || !(coreMomentInfo.media.get(0) instanceof Audio)) {
            return false;
        }
        bnl0.m105524M(this.f165279s, true);
        this.f165280t.setText(App.f16088e.getString(R$string.f19002Xf));
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final void m183524Y(List<CoreMomentInfo> list) {
        List<CoreMomentInfo> listM183516M = m183516M(list);
        if (!jyb.m147479J(listM183516M)) {
            bnl0.m105524M(m116952m(), true);
            bnl0.m105524M(this.f165267g, true);
            bnl0.m105524M(this.f165269i, false);
            bnl0.m105524M(this.f165273m, false);
            bnl0.m105524M(this.f165279s, false);
            bnl0.m105524M(this.f165281u, false);
            List<Media> listM183511N = m183511N(listM183516M);
            if (jyb.m147479J(listM183511N)) {
                m183526a0(listM183516M);
                return;
            } else {
                m183525Z(listM183511N);
                return;
            }
        }
        if (!jyb.m147479J(list)) {
            bnl0.m105524M(m116952m(), true);
            bnl0.m105524M(this.f165267g, true);
            bnl0.m105524M(this.f165269i, false);
            bnl0.m105524M(this.f165273m, false);
            bnl0.m105524M(this.f165281u, false);
            m183523X(list);
            return;
        }
        if (!this.f165284x.isMe() || !m124284x(this.f165284x)) {
            bnl0.m105524M(m116952m(), false);
            return;
        }
        bnl0.m105524M(m116952m(), true);
        bnl0.m105524M(this.f165267g, true);
        bnl0.m105524M(this.f165269i, false);
        bnl0.m105524M(this.f165273m, false);
        bnl0.m105524M(this.f165279s, false);
        bnl0.m105524M(this.f165281u, true);
    }

    /* JADX INFO: renamed from: Z */
    public final void m183525Z(List<Media> list) {
        User user;
        int size = list.size();
        ConstraintLayout constraintLayout = this.f165269i;
        if (size > 3) {
            bnl0.m105524M(constraintLayout, true);
            bnl0.m105524M(this.f165273m, true);
            for (int i = 0; i < 6; i++) {
                SimpleDraweeView simpleDraweeView = this.f165282v.get(i);
                if (i < list.size()) {
                    m183521V(list.get(i), simpleDraweeView);
                } else {
                    bnl0.m105525M0(simpleDraweeView, false);
                }
            }
        } else {
            bnl0.m105524M(constraintLayout, true);
            bnl0.m105524M(this.f165273m, false);
            for (int i2 = 0; i2 < 3; i2++) {
                SimpleDraweeView simpleDraweeView2 = this.f165282v.get(i2);
                if (i2 < list.size()) {
                    m183521V(list.get(i2), simpleDraweeView2);
                } else {
                    bnl0.m105525M0(simpleDraweeView2, false);
                }
            }
        }
        int size2 = list.size();
        VFrame vFrame = this.f165278r;
        if (size2 > 6) {
            bnl0.m105524M(vFrame, true);
        } else {
            bnl0.m105524M(vFrame, false);
        }
        if (!m116953n() || (user = this.f165284x) == null) {
            return;
        }
        sfj0.m185601h("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, sfj0.C20032a.m185615h("owner_id", user.f56859id));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m183526a0(List<CoreMomentInfo> list) {
        Iterator<CoreMomentInfo> it = list.iterator();
        while (it.hasNext()) {
            String strReplaceAll = it.next().value.replaceAll("\r|\n", "");
            if (!TextUtils.isEmpty(strReplaceAll)) {
                bnl0.m105524M(this.f165279s, true);
                this.f165280t.setText(strReplaceAll);
                return;
            }
        }
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m183515L(view);
        this.f165282v.clear();
        this.f165282v.add(this.f165270j);
        this.f165282v.add(this.f165271k);
        this.f165282v.add(this.f165272l);
        this.f165282v.add(this.f165274n);
        this.f165282v.add(this.f165275o);
        this.f165282v.add(this.f165277q);
        bnl0.m105509E0(this.f165266f, new View.OnClickListener() { // from class: l.kx00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f129160a.m183514R(view2);
            }
        });
        bnl0.m105509E0(this.f165279s, new View.OnClickListener() { // from class: l.lx00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f133877a.m183518S(view2);
            }
        });
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: q */
    public void mo39157q(boolean z) {
        User user;
        super.mo39157q(z);
        if (z && bnl0.m105529O0(m116952m()) && (user = this.f165284x) != null) {
            sfj0.m185601h("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, sfj0.C20032a.m185615h("owner_id", user.f56859id));
        }
    }
}
