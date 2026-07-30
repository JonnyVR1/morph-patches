package p009l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundFrameLayout;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.f6c0;
import l.ftd0;
import l.jp00;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.upa;
import l.vi90;
import l.vsd0;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import rx.c;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ip00 extends p3l {

    /* JADX INFO: renamed from: z */
    public static final int f14733z = f6c0.N0;

    /* JADX INFO: renamed from: f */
    public VLinear f14734f;

    /* JADX INFO: renamed from: g */
    public VLinear f14735g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f14736h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f14737i;

    /* JADX INFO: renamed from: j */
    public SimpleDraweeView f14738j;

    /* JADX INFO: renamed from: k */
    public SimpleDraweeView f14739k;

    /* JADX INFO: renamed from: l */
    public SimpleDraweeView f14740l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f14741m;

    /* JADX INFO: renamed from: n */
    public SimpleDraweeView f14742n;

    /* JADX INFO: renamed from: o */
    public SimpleDraweeView f14743o;

    /* JADX INFO: renamed from: p */
    public VFrame f14744p;

    /* JADX INFO: renamed from: q */
    public SimpleDraweeView f14745q;

    /* JADX INFO: renamed from: r */
    public VFrame f14746r;

    /* JADX INFO: renamed from: s */
    public RoundFrameLayout f14747s;

    /* JADX INFO: renamed from: t */
    public VText f14748t;

    /* JADX INFO: renamed from: u */
    public VText f14749u;

    /* JADX INFO: renamed from: v */
    public List<SimpleDraweeView> f14750v = new ArrayList();

    /* JADX INFO: renamed from: w */
    public d30 f14751w;

    /* JADX INFO: renamed from: x */
    public User f14752x;

    /* JADX INFO: renamed from: y */
    public CoreSuggested.UserInfo f14753y;

    /* JADX INFO: renamed from: l.ip00$a */
    public class ViewOnClickListenerC0962a implements View.OnClickListener {
        public ViewOnClickListenerC0962a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ip00.this.m16674O().call();
        }
    }

    /* JADX INFO: renamed from: l.ip00$b */
    public class ViewOnClickListenerC0963b implements View.OnClickListener {
        public ViewOnClickListenerC0963b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ip00.this.m16674O().call();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ c m16662F(String str, Boolean bool) {
        return bool.booleanValue() ? CoreModule.N().coreMomentMoments(str, CoreMomentInfo.JSON_ADAPTER) : CoreModule.N().coreMomentCachedMoments(str, 0, CoreMomentInfo.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m16663G(Throwable th) {
    }

    @NonNull
    /* JADX INFO: renamed from: N */
    public static List<Media> m16668N(List<CoreMomentInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (CoreMomentInfo coreMomentInfo : list) {
            if (!vwb.J(coreMomentInfo.media)) {
                for (Video video : coreMomentInfo.media) {
                    if (video instanceof Picture) {
                        arrayList.add(video);
                    } else if (video instanceof Video) {
                        Video video2 = video;
                        if (NullChecker.b(video2.cover) && NullChecker.b(((Media) video2.cover).url)) {
                            arrayList.add(video);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m16669P(CoreMomentInfo coreMomentInfo) {
        return NullChecker.a(coreMomentInfo) && m16670Q(coreMomentInfo.media);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m16670Q(List<Media> list) {
        return list.size() > 0 && (list.get(0) instanceof Audio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m16671R(View view) {
        m16674O().call();
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(final CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f14752x = user;
        this.f14753y = userInfo;
        xdl0.M(m24921m(), false);
        if (vwb.J(userInfo.coreMomentInfoList)) {
            m24919k(m20098w(), m16679W()).subscribe(mkd0.H(new e30() { // from class: l.ep00
                public final void call(Object obj) {
                    this.f12639a.m16677U(userInfo, (q860) obj);
                }
            }, new e30() { // from class: l.fp00
                public final void call(Object obj) {
                    ip00.m16663G((Throwable) obj);
                }
            }));
        } else {
            m16681Y(userInfo.coreMomentInfoList);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m16672L(View view) {
        jp00.a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public final List<CoreMomentInfo> m16673M(List<CoreMomentInfo> list) {
        return vwb.n(list, new w9j() { // from class: l.gp00
            public final Object call(Object obj) {
                return Boolean.valueOf(!ip00.m16669P((CoreMomentInfo) obj));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final d30 m16674O() {
        if (this.f14751w == null) {
            this.f14751w = new d30() { // from class: l.dp00
                public final void call() {
                    this.f11932a.m16676T();
                }
            };
        }
        return this.f14751w;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m16675S(View view) {
        m16674O().call();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m16676T() {
        CoreSuggested.UserInfo userInfo = this.f14753y;
        if (userInfo != null) {
            vi90 vi90Var = userInfo.profileContext;
            if ((vi90Var instanceof vi90) && "from_guess_liker_result".equals(vi90Var.b)) {
                return;
            }
        }
        if (this.f14752x == null) {
            return;
        }
        m24921m().getContext().startActivity(CoreModule.N().argsToMomentsInProfileAct(m24921m().getContext(), ((DbObject) this.f14752x).id, "from_ProfileFrag"));
        o6j0.c("e_moment", "p_suggest_user_profile_info_view", new o6j0.a[]{o6j0.a.h("owner_id", ((DbObject) this.f14752x).id)});
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m16677U(CoreSuggested.UserInfo userInfo, q860 q860Var) {
        List<T> list = q860Var.f19068a;
        userInfo.coreMomentInfoList = list;
        m16681Y(list);
    }

    /* JADX INFO: renamed from: V */
    public void m16678V(Media media, SimpleDraweeView simpleDraweeView) {
        if (media instanceof Picture) {
            xdl0.M0(simpleDraweeView, true);
            qib0.G.Q0(simpleDraweeView, ((Picture) media).momentPictureSmall());
            simpleDraweeView.setOnClickListener(new ViewOnClickListenerC0962a());
        } else if (media instanceof Video) {
            Video video = (Video) media;
            if (NullChecker.b(video.cover) && NullChecker.b(((Media) video.cover).url)) {
                xdl0.M0(simpleDraweeView, true);
                qib0.G.Q0(simpleDraweeView, video.cover.momentPictureSmall());
                simpleDraweeView.getHierarchy().c(new vsd0(CoreModule.b.getResources().getDrawable(upa.z() ? x2c0.dh : x2c0.Zr), ftd0.g));
                simpleDraweeView.setOnClickListener(new ViewOnClickListenerC0963b());
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final c<q860<CoreMomentInfo>> m16679W() {
        User user = this.f14752x;
        final String str = ((DbObject) user).id;
        return user.isMe() ? CoreModule.N().coreMomentMoments(str, CoreMomentInfo.JSON_ADAPTER) : CoreModule.c.f0.wh(str).flatMap(new w9j() { // from class: l.hp00
            public final Object call(Object obj) {
                return ip00.m16662F(str, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final boolean m16680X(List<CoreMomentInfo> list) {
        CoreMomentInfo coreMomentInfo = list.get(0);
        if (vwb.J(coreMomentInfo.media) || !(coreMomentInfo.media.get(0) instanceof Audio)) {
            return false;
        }
        xdl0.M(this.f14747s, true);
        this.f14748t.setText(App.e.getString(R.string.Ff));
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final void m16681Y(List<CoreMomentInfo> list) {
        List<CoreMomentInfo> listM16673M = m16673M(list);
        if (!vwb.J(listM16673M)) {
            xdl0.M(m24921m(), true);
            xdl0.M(this.f14735g, true);
            xdl0.M(this.f14737i, false);
            xdl0.M(this.f14741m, false);
            xdl0.M(this.f14747s, false);
            xdl0.M(this.f14749u, false);
            List<Media> listM16668N = m16668N(listM16673M);
            if (vwb.J(listM16668N)) {
                m16683a0(listM16673M);
                return;
            } else {
                m16682Z(listM16668N);
                return;
            }
        }
        if (!vwb.J(list)) {
            xdl0.M(m24921m(), true);
            xdl0.M(this.f14735g, true);
            xdl0.M(this.f14737i, false);
            xdl0.M(this.f14741m, false);
            xdl0.M(this.f14749u, false);
            m16680X(list);
            return;
        }
        if (!this.f14752x.isMe() || !m20099x(this.f14752x)) {
            xdl0.M(m24921m(), false);
            return;
        }
        xdl0.M(m24921m(), true);
        xdl0.M(this.f14735g, true);
        xdl0.M(this.f14737i, false);
        xdl0.M(this.f14741m, false);
        xdl0.M(this.f14747s, false);
        xdl0.M(this.f14749u, true);
    }

    /* JADX INFO: renamed from: Z */
    public final void m16682Z(List<Media> list) {
        User user;
        int size = list.size();
        ConstraintLayout constraintLayout = this.f14737i;
        if (size > 3) {
            xdl0.M(constraintLayout, true);
            xdl0.M(this.f14741m, true);
            for (int i = 0; i < 6; i++) {
                SimpleDraweeView simpleDraweeView = this.f14750v.get(i);
                if (i < list.size()) {
                    m16678V(list.get(i), simpleDraweeView);
                } else {
                    xdl0.M0(simpleDraweeView, false);
                }
            }
        } else {
            xdl0.M(constraintLayout, true);
            xdl0.M(this.f14741m, false);
            for (int i2 = 0; i2 < 3; i2++) {
                SimpleDraweeView simpleDraweeView2 = this.f14750v.get(i2);
                if (i2 < list.size()) {
                    m16678V(list.get(i2), simpleDraweeView2);
                } else {
                    xdl0.M0(simpleDraweeView2, false);
                }
            }
        }
        int size2 = list.size();
        VFrame vFrame = this.f14746r;
        if (size2 > 6) {
            xdl0.M(vFrame, true);
        } else {
            xdl0.M(vFrame, false);
        }
        if (!m24922n() || (user = this.f14752x) == null) {
            return;
        }
        o6j0.h("e_moment", "p_suggest_user_profile_info_view", new o6j0.a[]{o6j0.a.h("owner_id", ((DbObject) user).id)});
    }

    /* JADX INFO: renamed from: a0 */
    public final void m16683a0(List<CoreMomentInfo> list) {
        Iterator<CoreMomentInfo> it = list.iterator();
        while (it.hasNext()) {
            String strReplaceAll = it.next().value.replaceAll("\r|\n", "");
            if (!TextUtils.isEmpty(strReplaceAll)) {
                xdl0.M(this.f14747s, true);
                this.f14748t.setText(strReplaceAll);
                return;
            }
        }
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m16672L(view);
        this.f14750v.clear();
        this.f14750v.add(this.f14738j);
        this.f14750v.add(this.f14739k);
        this.f14750v.add(this.f14740l);
        this.f14750v.add(this.f14742n);
        this.f14750v.add(this.f14743o);
        this.f14750v.add(this.f14745q);
        xdl0.E0(this.f14734f, new View.OnClickListener() { // from class: l.bp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10226a.m16671R(view2);
            }
        });
        xdl0.E0(this.f14747s, new View.OnClickListener() { // from class: l.cp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10717a.m16675S(view2);
            }
        });
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: q */
    public void mo2128q(boolean z) {
        User user;
        super.mo2128q(z);
        if (z && xdl0.O0(m24921m()) && (user = this.f14752x) != null) {
            o6j0.h("e_moment", "p_suggest_user_profile_info_view", new o6j0.a[]{o6j0.a.h("owner_id", ((DbObject) user).id)});
        }
    }
}
