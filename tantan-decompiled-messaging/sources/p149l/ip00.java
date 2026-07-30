package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundFrameLayout;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ip00 extends p3l {

    /* JADX INFO: renamed from: z */
    public static final int f114219z = f6c0.f95475N0;

    /* JADX INFO: renamed from: f */
    public VLinear f114220f;

    /* JADX INFO: renamed from: g */
    public VLinear f114221g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f114222h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f114223i;

    /* JADX INFO: renamed from: j */
    public SimpleDraweeView f114224j;

    /* JADX INFO: renamed from: k */
    public SimpleDraweeView f114225k;

    /* JADX INFO: renamed from: l */
    public SimpleDraweeView f114226l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f114227m;

    /* JADX INFO: renamed from: n */
    public SimpleDraweeView f114228n;

    /* JADX INFO: renamed from: o */
    public SimpleDraweeView f114229o;

    /* JADX INFO: renamed from: p */
    public VFrame f114230p;

    /* JADX INFO: renamed from: q */
    public SimpleDraweeView f114231q;

    /* JADX INFO: renamed from: r */
    public VFrame f114232r;

    /* JADX INFO: renamed from: s */
    public RoundFrameLayout f114233s;

    /* JADX INFO: renamed from: t */
    public VText f114234t;

    /* JADX INFO: renamed from: u */
    public VText f114235u;

    /* JADX INFO: renamed from: v */
    public List<SimpleDraweeView> f114236v = new ArrayList();

    /* JADX INFO: renamed from: w */
    public d30 f114237w;

    /* JADX INFO: renamed from: x */
    public User f114238x;

    /* JADX INFO: renamed from: y */
    public CoreSuggested.UserInfo f114239y;

    /* JADX INFO: renamed from: l.ip00$a */
    public class ViewOnClickListenerC17594a implements View.OnClickListener {
        public ViewOnClickListenerC17594a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ip00.this.m137426O().call();
        }
    }

    /* JADX INFO: renamed from: l.ip00$b */
    public class ViewOnClickListenerC17595b implements View.OnClickListener {
        public ViewOnClickListenerC17595b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ip00.this.m137426O().call();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ C22306c m137414F(String str, Boolean bool) {
        return bool.booleanValue() ? CoreModule.m29934N().coreMomentMoments(str, CoreMomentInfo.JSON_ADAPTER) : CoreModule.m29934N().coreMomentCachedMoments(str, 0, CoreMomentInfo.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m137415G(Throwable th) {
    }

    @NonNull
    /* JADX INFO: renamed from: N */
    public static List<Media> m137420N(List<CoreMomentInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (CoreMomentInfo coreMomentInfo : list) {
            if (!vwb.m200296J(coreMomentInfo.media)) {
                for (Media media : coreMomentInfo.media) {
                    if (media instanceof Picture) {
                        arrayList.add(media);
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        if (NullChecker.m81304b(video.cover) && NullChecker.m81304b(video.cover.url)) {
                            arrayList.add(media);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m137421P(CoreMomentInfo coreMomentInfo) {
        return NullChecker.m81303a(coreMomentInfo) && m137422Q(coreMomentInfo.media);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m137422Q(List<Media> list) {
        return list.size() > 0 && (list.get(0) instanceof Audio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m137423R(View view) {
        m137426O().call();
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(final CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f114238x = user;
        this.f114239y = userInfo;
        xdl0.m208344M(m209783m(), false);
        if (vwb.m200296J(userInfo.coreMomentInfoList)) {
            m209781k(m167252w(), m137431W()).subscribe(mkd0.m154956H(new e30() { // from class: l.ep00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92527a.m137429U(userInfo, (q860) obj);
                }
            }, new e30() { // from class: l.fp00
                @Override // p149l.e30
                public final void call(Object obj) {
                    ip00.m137415G((Throwable) obj);
                }
            }));
        } else {
            m137433Y(userInfo.coreMomentInfoList);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m137424L(View view) {
        jp00.m142558a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public final List<CoreMomentInfo> m137425M(List<CoreMomentInfo> list) {
        return vwb.m200339n(list, new w9j() { // from class: l.gp00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!ip00.m137421P((CoreMomentInfo) obj));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final d30 m137426O() {
        if (this.f114237w == null) {
            this.f114237w = new d30() { // from class: l.dp00
                @Override // p149l.d30
                public final void call() {
                    this.f87222a.m137428T();
                }
            };
        }
        return this.f114237w;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m137427S(View view) {
        m137426O().call();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m137428T() {
        CoreSuggested.UserInfo userInfo = this.f114239y;
        if (userInfo != null) {
            bj90 bj90Var = userInfo.profileContext;
            if ((bj90Var instanceof vi90) && "from_guess_liker_result".equals(((vi90) bj90Var).f181562b)) {
                return;
            }
        }
        if (this.f114238x == null) {
            return;
        }
        m209783m().getContext().startActivity(CoreModule.m29934N().argsToMomentsInProfileAct(m209783m().getContext(), this.f114238x.f56011id, "from_ProfileFrag"));
        o6j0.m162859c("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, o6j0.C18854a.m162878h("owner_id", this.f114238x.f56011id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m137429U(CoreSuggested.UserInfo userInfo, q860 q860Var) {
        List list = q860Var.f153135a;
        userInfo.coreMomentInfoList = list;
        m137433Y(list);
    }

    /* JADX INFO: renamed from: V */
    public void m137430V(Media media, SimpleDraweeView simpleDraweeView) {
        if (media instanceof Picture) {
            xdl0.m208345M0(simpleDraweeView, true);
            qib0.f154691G.m102341Q0(simpleDraweeView, ((Picture) media).momentPictureSmall());
            simpleDraweeView.setOnClickListener(new ViewOnClickListenerC17594a());
        } else if (media instanceof Video) {
            Video video = (Video) media;
            if (NullChecker.m81304b(video.cover) && NullChecker.m81304b(video.cover.url)) {
                xdl0.m208345M0(simpleDraweeView, true);
                qib0.f154691G.m102341Q0(simpleDraweeView, video.cover.momentPictureSmall());
                simpleDraweeView.getHierarchy().mo112056c(new vsd0(CoreModule.f17544b.getResources().getDrawable(upa.m194847z() ? x2c0.f190079dh : x2c0.f189962Zr), ftd0.f99183g));
                simpleDraweeView.setOnClickListener(new ViewOnClickListenerC17595b());
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final C22306c<q860<CoreMomentInfo>> m137431W() {
        User user = this.f114238x;
        final String str = user.f56011id;
        return user.isMe() ? CoreModule.m29934N().coreMomentMoments(str, CoreMomentInfo.JSON_ADAPTER) : CoreModule.f17545c.f19642f0.m33170wh(str).flatMap(new w9j() { // from class: l.hp00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ip00.m137414F(str, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final boolean m137432X(List<CoreMomentInfo> list) {
        CoreMomentInfo coreMomentInfo = list.get(0);
        if (vwb.m200296J(coreMomentInfo.media) || !(coreMomentInfo.media.get(0) instanceof Audio)) {
            return false;
        }
        xdl0.m208344M(this.f114233s, true);
        this.f114234t.setText(App.f15369e.getString(R$string.f17732Ff));
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final void m137433Y(List<CoreMomentInfo> list) {
        List<CoreMomentInfo> listM137425M = m137425M(list);
        if (!vwb.m200296J(listM137425M)) {
            xdl0.m208344M(m209783m(), true);
            xdl0.m208344M(this.f114221g, true);
            xdl0.m208344M(this.f114223i, false);
            xdl0.m208344M(this.f114227m, false);
            xdl0.m208344M(this.f114233s, false);
            xdl0.m208344M(this.f114235u, false);
            List<Media> listM137420N = m137420N(listM137425M);
            if (vwb.m200296J(listM137420N)) {
                m137435a0(listM137425M);
                return;
            } else {
                m137434Z(listM137420N);
                return;
            }
        }
        if (!vwb.m200296J(list)) {
            xdl0.m208344M(m209783m(), true);
            xdl0.m208344M(this.f114221g, true);
            xdl0.m208344M(this.f114223i, false);
            xdl0.m208344M(this.f114227m, false);
            xdl0.m208344M(this.f114235u, false);
            m137432X(list);
            return;
        }
        if (!this.f114238x.isMe() || !m167253x(this.f114238x)) {
            xdl0.m208344M(m209783m(), false);
            return;
        }
        xdl0.m208344M(m209783m(), true);
        xdl0.m208344M(this.f114221g, true);
        xdl0.m208344M(this.f114223i, false);
        xdl0.m208344M(this.f114227m, false);
        xdl0.m208344M(this.f114233s, false);
        xdl0.m208344M(this.f114235u, true);
    }

    /* JADX INFO: renamed from: Z */
    public final void m137434Z(List<Media> list) {
        User user;
        int size = list.size();
        ConstraintLayout constraintLayout = this.f114223i;
        if (size > 3) {
            xdl0.m208344M(constraintLayout, true);
            xdl0.m208344M(this.f114227m, true);
            for (int i = 0; i < 6; i++) {
                SimpleDraweeView simpleDraweeView = this.f114236v.get(i);
                if (i < list.size()) {
                    m137430V(list.get(i), simpleDraweeView);
                } else {
                    xdl0.m208345M0(simpleDraweeView, false);
                }
            }
        } else {
            xdl0.m208344M(constraintLayout, true);
            xdl0.m208344M(this.f114227m, false);
            for (int i2 = 0; i2 < 3; i2++) {
                SimpleDraweeView simpleDraweeView2 = this.f114236v.get(i2);
                if (i2 < list.size()) {
                    m137430V(list.get(i2), simpleDraweeView2);
                } else {
                    xdl0.m208345M0(simpleDraweeView2, false);
                }
            }
        }
        int size2 = list.size();
        VFrame vFrame = this.f114232r;
        if (size2 > 6) {
            xdl0.m208344M(vFrame, true);
        } else {
            xdl0.m208344M(vFrame, false);
        }
        if (!m209784n() || (user = this.f114238x) == null) {
            return;
        }
        o6j0.m162864h("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, o6j0.C18854a.m162878h("owner_id", user.f56011id));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m137435a0(List<CoreMomentInfo> list) {
        Iterator<CoreMomentInfo> it = list.iterator();
        while (it.hasNext()) {
            String strReplaceAll = it.next().value.replaceAll("\r|\n", "");
            if (!TextUtils.isEmpty(strReplaceAll)) {
                xdl0.m208344M(this.f114233s, true);
                this.f114234t.setText(strReplaceAll);
                return;
            }
        }
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m137424L(view);
        this.f114236v.clear();
        this.f114236v.add(this.f114224j);
        this.f114236v.add(this.f114225k);
        this.f114236v.add(this.f114226l);
        this.f114236v.add(this.f114228n);
        this.f114236v.add(this.f114229o);
        this.f114236v.add(this.f114231q);
        xdl0.m208329E0(this.f114220f, new View.OnClickListener() { // from class: l.bp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f76586a.m137423R(view2);
            }
        });
        xdl0.m208329E0(this.f114233s, new View.OnClickListener() { // from class: l.cp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f81895a.m137427S(view2);
            }
        });
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: q */
    public void mo38154q(boolean z) {
        User user;
        super.mo38154q(z);
        if (z && xdl0.m208349O0(m209783m()) && (user = this.f114238x) != null) {
            o6j0.m162864h("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, o6j0.C18854a.m162878h("owner_id", user.f56011id));
        }
    }
}
