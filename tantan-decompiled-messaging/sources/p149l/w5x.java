package p149l;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.match.view.ViewPagerClickChangeView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p133rx.subjects.C22392a;
import p147v.VTexturePlayer;

/* JADX INFO: loaded from: classes3.dex */
public class w5x extends l5x<h6x> implements ViewPagerClickChangeView.InterfaceC8469a, VTexturePlayer.InterfaceC22583b {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f184777d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f184778e;

    /* JADX INFO: renamed from: f */
    public C22392a<roj0> f184779f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C20809b> f184780g;

    /* JADX INFO: renamed from: h */
    public C20810c f184781h;

    /* JADX INFO: renamed from: l.w5x$a */
    public class C20808a implements ValueAnimator.AnimatorUpdateListener {
        public C20808a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((h6x) w5x.this.viewModel).m129555K(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: l.w5x$b */
    public static class C20809b {

        /* JADX INFO: renamed from: a */
        public Media f184783a;

        /* JADX INFO: renamed from: b */
        public int f184784b = -2302756;

        /* JADX INFO: renamed from: c */
        public PictureView f184785c;

        public C20809b(Media media) {
            this.f184783a = media;
        }
    }

    /* JADX INFO: renamed from: l.w5x$c */
    public class C20810c extends w660 {
        public C20810c() {
        }

        @Override // p149l.w660
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.w660
        public int getCount() {
            return w5x.this.f184780g.size();
        }

        @Override // p149l.w660
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.m163037a(w5x.this.act()).inflate(f6c0.f95758e7, viewGroup, false);
            viewGroup.addView(viewInflate);
            PictureView pictureView = (PictureView) viewInflate.findViewById(u4c0.f174281ha);
            pictureView.m43983K(true, false, true);
            pictureView.m43993X(((C20809b) w5x.this.f184780g.get(i)).f184783a);
            r13.m177440e(pictureView.f28070a, zub.m220207f(((C20809b) w5x.this.f184780g.get(i)).f184783a).formatted(), new bc70() { // from class: l.x5x
                @Override // p149l.bc70
                /* JADX INFO: renamed from: a */
                public final void mo101047a(String str, int i2) {
                    this.f191202a.m201727k(str, i2);
                }
            });
            ((C20809b) w5x.this.f184780g.get(i)).f184785c = pictureView;
            xdl0.m208344M(pictureView.f28076g, false);
            pictureView.setPlayerListener(w5x.this);
            ((ViewPagerClickChangeView) viewInflate.findViewById(u4c0.f174543x1)).setChangeClickListener(w5x.this);
            return viewInflate;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m201727k(String str, int i) {
            if (w5x.this.f184780g != null) {
                for (C20809b c20809b : w5x.this.f184780g) {
                    if (TextUtils.equals(zub.m220207f(c20809b.f184783a).formatted(), str)) {
                        c20809b.f184784b = i;
                    }
                }
                ((h6x) w5x.this.viewModel).m129562s();
            }
        }
    }

    public w5x(mcr mcrVar) {
        super(mcrVar);
        this.f184779f = C22392a.m221513c(roj0.f160388a);
        this.f184780g = new ArrayList<>();
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m201696E0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.f17545c.f19642f0.m33050mq(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m201707W0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.m154563s();
        if (this.f126210a == 13 && mx0.m156802o().m156804B()) {
            if (ogl0.m164227F()) {
                ic50.m135327j().m135333f().m145241b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            mx0.m156782I(act(), false, 5.0f, "superlike");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m201708Y0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            V v2 = this.viewModel;
            ((h6x) v2).f106142t.m123794g(((h6x) v2).act());
            m201714a1();
        } else if (c4319c == C4319c.f15549j) {
            ((h6x) this.viewModel).f106142t.m123794g(null);
            m201722i1();
        } else if (c4319c == C4319c.f15552m) {
            ((h6x) this.viewModel).f106142t.m123789b();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.match.view.ViewPagerClickChangeView.InterfaceC8469a
    /* JADX INFO: renamed from: B */
    public void mo47761B() {
        ((h6x) this.viewModel).m129564v();
        int currentItem = ((h6x) this.viewModel).f106124b.getCurrentItem();
        C20810c c20810c = this.f184781h;
        if (currentItem <= 0) {
            m201723j1(false, true, c20810c.getCount());
            return;
        }
        m201723j1(true, true, c20810c.getCount());
        V v2 = this.viewModel;
        ((h6x) v2).f106124b.m4176T(((h6x) v2).f106124b.getCurrentItem() - 1, false);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m201709R0() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1250);
        valueAnimatorOfInt.setDuration(1250L);
        valueAnimatorOfInt.addUpdateListener(new C20808a());
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: S0 */
    public ArrayList<C20809b> m201710S0() {
        return this.f184780g;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m201711U0(User user, int i, ArrayList<String> arrayList) {
        this.f126212c = user;
        this.f184781h = new C20810c();
        this.f184780g = new ArrayList<>();
        Iterator<Media> it = user.pictures.iterator();
        while (it.hasNext()) {
            this.f184780g.add(new C20809b(it.next()));
        }
        ((h6x) this.viewModel).m129565w(user, this.f184781h, i, arrayList);
        m201709R0();
        e51.m114743H(act(), new Runnable() { // from class: l.q5x
            @Override // java.lang.Runnable
            public final void run() {
                this.f152831a.m201712V0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m201712V0() {
        m201725l1(((h6x) this.viewModel).m129563u());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m201713X0(roj0 roj0Var) {
        m201711U0(CoreModule.f17545c.f19639e0.m169430Pa(this.f126211b), this.f126210a, this.f184778e);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        if (u59.m191827f0()) {
            CoreModule.f17545c.f19642f0.m32650Fo();
        }
        creates(new e30() { // from class: l.m5x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131431a.m201707W0((Bundle) obj);
            }
        });
        duringCreated(this.f184779f).subscribe(mkd0.m154955G(new e30() { // from class: l.n5x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137257a.m201713X0((roj0) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.o5x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141951a.m201708Y0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m201715b1(Message message) {
        ccx.m106209f(R$string.f17734Fh, this.f126212c.m60124fp().profileSmall());
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m201716c1(Throwable th) {
        ccx.m106209f(R$string.f19096yh, this.f126212c.m60124fp().profileSmall());
    }

    @Override // p149l.l5x, p149l.q0m
    public void destroy() {
        super.destroy();
    }

    /* JADX INFO: renamed from: e1 */
    public void m201718e1() {
        if (this.f184777d.size() <= 1) {
            ((h6x) this.viewModel).m129551F();
            act().m66873d2();
        } else {
            this.f126211b = this.f184777d.get(1);
            this.f184777d.remove(0);
            this.f184778e.remove(0);
            this.f184779f.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public void m201717d1(String str, boolean z) {
        if (z) {
            act().hideInput();
        }
        final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f126211b);
        if (NullChecker.m81303a(conversationM32856Xe)) {
            e51.m114774y(new Runnable() { // from class: l.s5x
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.v5x
                        @Override // p149l.d30
                        public final void call() {
                            w5x.m201696E0(conversation);
                        }
                    });
                }
            });
        }
        Message message = new Message();
        message.messageType = MessageType.get("text");
        message.value = str;
        CoreModule.f17545c.f19642f0.m32623Dn(this.f126211b, message, null).subscribe(mkd0.m154956H(new e30() { // from class: l.t5x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167888a.m201715b1((Message) obj);
            }
        }, new e30() { // from class: l.u5x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174780a.m201716c1((Throwable) obj);
            }
        }));
        m201718e1();
    }

    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final void m201714a1() {
        if (NullChecker.m81303a(this.viewModel) && NullChecker.m81303a(((h6x) this.viewModel).f106124b)) {
            m201725l1(((h6x) this.viewModel).f106124b.getCurrentItem());
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m201721h1() {
        for (int i = 0; i < this.f184780g.size(); i++) {
            if (this.f184780g.get(i).f184783a instanceof Video) {
                PictureView pictureView = this.f184780g.get(i).f184785c;
                if (NullChecker.m81303a(pictureView) && pictureView.m43992W()) {
                    pictureView.m43990U();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m201722i1() {
        m201721h1();
    }

    /* JADX INFO: renamed from: j1 */
    public final void m201723j1(boolean z, boolean z2, int i) {
        o6j0.m162859c("e_matched_photo", "p_successful_match_view", o6j0.C18854a.m162879i("can_switch", z), o6j0.C18854a.m162878h("change_photo_direction", z2 ? BLiveGiftBubblePopupTitlePosition.left : "right"), o6j0.C18854a.m162876f("photo_numbers", i));
    }

    /* JADX INFO: renamed from: k1 */
    public void m201724k1(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o6j0.m162859c("e_matched_send_message", "p_successful_match_view", new o6j0.C18854a[0]);
        if (!qib0.f154711Z.m119125K(str)) {
            m201717d1(str, z);
            return;
        }
        act().dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20556t0(R$string.f19097yi, new Runnable() { // from class: l.r5x
            @Override // java.lang.Runnable
            public final void run() {
                this.f157877a.m201717d1(str, z);
            }
        }).m20568z0();
        HashSet hashSet = new HashSet(MessagesAct.f31635r.get());
        hashSet.add(CoreModule.f17545c.f19639e0.m169430Pa(this.f126211b).f56011id);
        MessagesAct.f31635r.put(hashSet);
    }

    /* JADX INFO: renamed from: l1 */
    public void m201725l1(int i) {
        for (int i2 = 0; i2 < this.f184780g.size(); i2++) {
            if (this.f184780g.get(i2).f184783a instanceof Video) {
                PictureView pictureView = this.f184780g.get(i2).f184785c;
                if (i == i2) {
                    if (NullChecker.m81303a(pictureView)) {
                        pictureView.m43991V();
                    }
                } else if (NullChecker.m81303a(pictureView) && pictureView.m43992W()) {
                    pictureView.m43990U();
                }
            }
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onComplete() {
        e51.m114743H(act(), new Runnable() { // from class: l.p5x
            @Override // java.lang.Runnable
            public final void run() {
                this.f147343a.m201714a1();
            }
        }, 150L);
    }

    @Override // p149l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo134431q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo134431q0(str, i, arrayList, arrayList2);
        this.f184777d = arrayList;
        this.f184778e = arrayList2;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.match.view.ViewPagerClickChangeView.InterfaceC8469a
    /* JADX INFO: renamed from: w */
    public void mo47762w() {
        ((h6x) this.viewModel).m129564v();
        int currentItem = ((h6x) this.viewModel).f106124b.getCurrentItem();
        int count = this.f184781h.getCount() - 1;
        C20810c c20810c = this.f184781h;
        if (currentItem >= count) {
            m201723j1(false, false, c20810c.getCount());
            return;
        }
        m201723j1(true, false, c20810c.getCount());
        V v2 = this.viewModel;
        ((h6x) v2).f106124b.m4176T(((h6x) v2).f106124b.getCurrentItem() + 1, false);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: d */
    public void mo36116d() {
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: h */
    public void mo36117h() {
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onPause() {
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onResume() {
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: y */
    public void mo36127y() {
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onError(int i, int i2) {
    }
}
