package p153l;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.match.view.ViewPagerClickChangeView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p137rx.subjects.C22507a;
import p151v.VTexturePlayer;

/* JADX INFO: loaded from: classes3.dex */
public class v8x extends k8x<g9x> implements ViewPagerClickChangeView.InterfaceC8632a, VTexturePlayer.InterfaceC22698b {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f182900d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f182901e;

    /* JADX INFO: renamed from: f */
    public C22507a<uxj0> f182902f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C20788b> f182903g;

    /* JADX INFO: renamed from: h */
    public C20789c f182904h;

    /* JADX INFO: renamed from: l.v8x$a */
    public class C20787a implements ValueAnimator.AnimatorUpdateListener {
        public C20787a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((g9x) v8x.this.viewModel).m129662K(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: l.v8x$b */
    public static class C20788b {

        /* JADX INFO: renamed from: a */
        public Media f182906a;

        /* JADX INFO: renamed from: b */
        public int f182907b = -2302756;

        /* JADX INFO: renamed from: c */
        public PictureView f182908c;

        public C20788b(Media media) {
            this.f182906a = media;
        }
    }

    /* JADX INFO: renamed from: l.v8x$c */
    public class C20789c extends cf60 {
        public C20789c() {
        }

        @Override // p153l.cf60
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            return v8x.this.f182903g.size();
        }

        @Override // p153l.cf60
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = p9r.m171370a(v8x.this.act()).inflate(kec0.f125829f7, viewGroup, false);
            viewGroup.addView(viewInflate);
            PictureView pictureView = (PictureView) viewInflate.findViewById(adc0.f70405ja);
            pictureView.m45166K(true, false, true);
            pictureView.m45176X(((C20788b) v8x.this.f182903g.get(i)).f182906a);
            g23.m128588e(pictureView.f28918a, nwb.m164968f(((C20788b) v8x.this.f182903g.get(i)).f182906a).formatted(), new hk70() { // from class: l.w8x
                @Override // p153l.hk70
                /* JADX INFO: renamed from: a */
                public final void mo119505a(String str, int i2) {
                    this.f187940a.m200361k(str, i2);
                }
            });
            ((C20788b) v8x.this.f182903g.get(i)).f182908c = pictureView;
            bnl0.m105524M(pictureView.f28924g, false);
            pictureView.setPlayerListener(v8x.this);
            ((ViewPagerClickChangeView) viewInflate.findViewById(adc0.f70634x1)).setChangeClickListener(v8x.this);
            return viewInflate;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m200361k(String str, int i) {
            if (v8x.this.f182903g != null) {
                for (C20788b c20788b : v8x.this.f182903g) {
                    if (TextUtils.equals(nwb.m164968f(c20788b.f182906a).formatted(), str)) {
                        c20788b.f182907b = i;
                    }
                }
                ((g9x) v8x.this.viewModel).m129668s();
            }
        }
    }

    public v8x(ner nerVar) {
        super(nerVar);
        this.f182902f = C22507a.m222759c(uxj0.f181467a);
        this.f182903g = new ArrayList<>();
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m200330E0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.f18264c.f20384f0.m34053mq(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m200341W0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        toh0.m192059s();
        if (this.f124420a == 13 && tx0.m193439o().m193441B()) {
            if (spl0.m187354F()) {
                pk50.m172568j().m172574f().m181664b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            tx0.m193419I(act(), false, 5.0f, "superlike");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m200342Y0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            V v2 = this.viewModel;
            ((g9x) v2).f102920t.m123509g(((g9x) v2).act());
            m200348a1();
        } else if (c4470c == C4470c.f16268j) {
            ((g9x) this.viewModel).f102920t.m123509g(null);
            m200356i1();
        } else if (c4470c == C4470c.f16271m) {
            ((g9x) this.viewModel).f102920t.m123504b();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.match.view.ViewPagerClickChangeView.InterfaceC8632a
    /* JADX INFO: renamed from: B */
    public void mo48944B() {
        ((g9x) this.viewModel).m129670v();
        int currentItem = ((g9x) this.viewModel).f102902b.getCurrentItem();
        C20789c c20789c = this.f182904h;
        if (currentItem <= 0) {
            m200357j1(false, true, c20789c.getCount());
            return;
        }
        m200357j1(true, true, c20789c.getCount());
        V v2 = this.viewModel;
        ((g9x) v2).f102902b.m4178T(((g9x) v2).f102902b.getCurrentItem() - 1, false);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m200343R0() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1250);
        valueAnimatorOfInt.setDuration(1250L);
        valueAnimatorOfInt.addUpdateListener(new C20787a());
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: S0 */
    public ArrayList<C20788b> m200344S0() {
        return this.f182903g;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m200345U0(User user, int i, ArrayList<String> arrayList) {
        this.f124422c = user;
        this.f182904h = new C20789c();
        this.f182903g = new ArrayList<>();
        Iterator<Media> it = user.pictures.iterator();
        while (it.hasNext()) {
            this.f182903g.add(new C20788b(it.next()));
        }
        ((g9x) this.viewModel).m129671w(user, this.f182904h, i, arrayList);
        m200343R0();
        l51.m152888H(act(), new Runnable() { // from class: l.p8x
            @Override // java.lang.Runnable
            public final void run() {
                this.f151069a.m200346V0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m200346V0() {
        m200359l1(((g9x) this.viewModel).m129669u());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m200347X0(uxj0 uxj0Var) {
        m200345U0(CoreModule.f18264c.f20381e0.m116503Pa(this.f124421b), this.f124420a, this.f182901e);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        if (d79.m114685j0()) {
            CoreModule.f18264c.f20384f0.m33653Fo();
        }
        creates(new y20() { // from class: l.l8x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130517a.m200341W0((Bundle) obj);
            }
        });
        duringCreated(this.f182902f).subscribe(psd0.m173596G(new y20() { // from class: l.m8x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135301a.m200347X0((uxj0) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.n8x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140721a.m200342Y0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m200349b1(Message message) {
        bfx.m104083f(R$string.f19095ai, this.f124422c.m61308fp().profileSmall());
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m200350c1(Throwable th) {
        bfx.m104083f(R$string.f18884Th, this.f124422c.m61308fp().profileSmall());
    }

    @Override // p153l.k8x, p153l.k3m
    public void destroy() {
        super.destroy();
    }

    /* JADX INFO: renamed from: e1 */
    public void m200352e1() {
        if (this.f182900d.size() <= 1) {
            ((g9x) this.viewModel).m129658F();
            act().m68056e2();
        } else {
            this.f124421b = this.f182900d.get(1);
            this.f182900d.remove(0);
            this.f182901e.remove(0);
            this.f182902f.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public void m200351d1(String str, boolean z) {
        if (z) {
            act().hideInput();
        }
        final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f124421b);
        if (NullChecker.m82486a(conversationM33859Xe)) {
            l51.m152919y(new Runnable() { // from class: l.r8x
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.u8x
                        @Override // p153l.x20
                        public final void call() {
                            v8x.m200330E0(conversation);
                        }
                    });
                }
            });
        }
        Message message = new Message();
        message.messageType = MessageType.get("text");
        message.value = str;
        CoreModule.f18264c.f20384f0.m33626Dn(this.f124421b, message, null).subscribe(psd0.m173597H(new y20() { // from class: l.s8x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166868a.m200349b1((Message) obj);
            }
        }, new y20() { // from class: l.t8x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172587a.m200350c1((Throwable) obj);
            }
        }));
        m200352e1();
    }

    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final void m200348a1() {
        if (NullChecker.m82486a(this.viewModel) && NullChecker.m82486a(((g9x) this.viewModel).f102902b)) {
            m200359l1(((g9x) this.viewModel).f102902b.getCurrentItem());
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m200355h1() {
        for (int i = 0; i < this.f182903g.size(); i++) {
            if (this.f182903g.get(i).f182906a instanceof Video) {
                PictureView pictureView = this.f182903g.get(i).f182908c;
                if (NullChecker.m82486a(pictureView) && pictureView.m45175W()) {
                    pictureView.m45173U();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m200356i1() {
        m200355h1();
    }

    /* JADX INFO: renamed from: j1 */
    public final void m200357j1(boolean z, boolean z2, int i) {
        sfj0.m185596c("e_matched_photo", "p_successful_match_view", sfj0.C20032a.m185616i("can_switch", z), sfj0.C20032a.m185615h("change_photo_direction", z2 ? BLiveGiftBubblePopupTitlePosition.left : "right"), sfj0.C20032a.m185613f("photo_numbers", i));
    }

    /* JADX INFO: renamed from: k1 */
    public void m200358k1(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sfj0.m185596c("e_matched_send_message", "p_successful_match_view", new sfj0.C20032a[0]);
        if (!uqb0.f180394Z.m95954K(str)) {
            m200351d1(str, z);
            return;
        }
        act().dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21555t0(R$string.f18915Ui, new Runnable() { // from class: l.q8x
            @Override // java.lang.Runnable
            public final void run() {
                this.f156170a.m200351d1(str, z);
            }
        }).m21567z0();
        HashSet hashSet = new HashSet(MessagesAct.f32483r.get());
        hashSet.add(CoreModule.f18264c.f20381e0.m116503Pa(this.f124421b).f56859id);
        MessagesAct.f32483r.put(hashSet);
    }

    /* JADX INFO: renamed from: l1 */
    public void m200359l1(int i) {
        for (int i2 = 0; i2 < this.f182903g.size(); i2++) {
            if (this.f182903g.get(i2).f182906a instanceof Video) {
                PictureView pictureView = this.f182903g.get(i2).f182908c;
                if (i == i2) {
                    if (NullChecker.m82486a(pictureView)) {
                        pictureView.m45174V();
                    }
                } else if (NullChecker.m82486a(pictureView) && pictureView.m45175W()) {
                    pictureView.m45173U();
                }
            }
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onComplete() {
        l51.m152888H(act(), new Runnable() { // from class: l.o8x
            @Override // java.lang.Runnable
            public final void run() {
                this.f145478a.m200348a1();
            }
        }, 150L);
    }

    @Override // p153l.k8x
    /* JADX INFO: renamed from: q0 */
    public void mo96040q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo96040q0(str, i, arrayList, arrayList2);
        this.f182900d = arrayList;
        this.f182901e = arrayList2;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.match.view.ViewPagerClickChangeView.InterfaceC8632a
    /* JADX INFO: renamed from: w */
    public void mo48945w() {
        ((g9x) this.viewModel).m129670v();
        int currentItem = ((g9x) this.viewModel).f102902b.getCurrentItem();
        int count = this.f182904h.getCount() - 1;
        C20789c c20789c = this.f182904h;
        if (currentItem >= count) {
            m200357j1(false, false, c20789c.getCount());
            return;
        }
        m200357j1(true, false, c20789c.getCount());
        V v2 = this.viewModel;
        ((g9x) v2).f102902b.m4178T(((g9x) v2).f102902b.getCurrentItem() + 1, false);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: d */
    public void mo37119d() {
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: h */
    public void mo37120h() {
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onPause() {
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onResume() {
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: y */
    public void mo37130y() {
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onError(int i, int i2) {
    }
}
