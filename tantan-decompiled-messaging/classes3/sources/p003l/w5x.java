package p003l;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.match.view.ViewPagerClickChangeView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import l.bc70;
import l.dyq;
import l.e51;
import l.f6c0;
import l.ic50;
import l.jq2;
import l.mcr;
import l.mgh0;
import l.mkd0;
import l.mx0;
import l.o6j0;
import l.o7r;
import l.ogl0;
import l.qib0;
import l.r13;
import l.roj0;
import l.s7m;
import l.u4c0;
import l.u59;
import l.w660;
import l.xdl0;
import l.zub;
import org.spongycastle.i18n.TextBundle;
import p014rx.subjects.C1185a;
import p028v.VTexturePlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class w5x extends l5x<h6x> implements ViewPagerClickChangeView.InterfaceC0052a, VTexturePlayer.InterfaceC1376b {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f8491d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f8492e;

    /* JADX INFO: renamed from: f */
    public C1185a<roj0> f8493f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C0614b> f8494g;

    /* JADX INFO: renamed from: h */
    public C0615c f8495h;

    /* JADX INFO: renamed from: l.w5x$a */
    public class C0613a implements ValueAnimator.AnimatorUpdateListener {
        public C0613a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((h6x) ((jq2) w5x.this).viewModel).m4941K(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: l.w5x$b */
    public static class C0614b {

        /* JADX INFO: renamed from: a */
        public Media f8497a;

        /* JADX INFO: renamed from: b */
        public int f8498b = -2302756;

        /* JADX INFO: renamed from: c */
        public PictureView f8499c;

        public C0614b(Media media) {
            this.f8497a = media;
        }
    }

    /* JADX INFO: renamed from: l.w5x$c */
    public class C0615c extends w660 {
        public C0615c() {
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return w5x.this.f8494g.size();
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.a(w5x.this.act()).inflate(f6c0.e7, viewGroup, false);
            viewGroup.addView(viewInflate);
            PictureView pictureViewFindViewById = viewInflate.findViewById(u4c0.ha);
            pictureViewFindViewById.K(true, false, true);
            pictureViewFindViewById.X(((C0614b) w5x.this.f8494g.get(i)).f8497a);
            r13.e(pictureViewFindViewById.a, zub.f(((C0614b) w5x.this.f8494g.get(i)).f8497a).formatted(), new bc70() { // from class: l.x5x
                /* JADX INFO: renamed from: a */
                public final void m8689a(String str, int i2) {
                    this.f8735a.m8513k(str, i2);
                }
            });
            ((C0614b) w5x.this.f8494g.get(i)).f8499c = pictureViewFindViewById;
            xdl0.M(pictureViewFindViewById.g, false);
            pictureViewFindViewById.setPlayerListener(w5x.this);
            ((ViewPagerClickChangeView) viewInflate.findViewById(u4c0.x1)).setChangeClickListener(w5x.this);
            return viewInflate;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m8513k(String str, int i) {
            if (w5x.this.f8494g != null) {
                for (C0614b c0614b : w5x.this.f8494g) {
                    if (TextUtils.equals(zub.f(c0614b.f8497a).formatted(), str)) {
                        c0614b.f8498b = i;
                    }
                }
                ((h6x) ((jq2) w5x.this).viewModel).m4949s();
            }
        }
    }

    public w5x(mcr mcrVar) {
        super(mcrVar);
        this.f8493f = C1185a.m9970c(roj0.a);
        this.f8494g = new ArrayList<>();
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m8477E0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.c.f0.mq(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m8488W0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.s();
        if (this.f5219a == 13 && mx0.o().B()) {
            if (ogl0.F()) {
                ic50.j().f().b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            mx0.I(act(), false, 5.0f, "superlike");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m8489Y0(c cVar) {
        if (cVar == c.i) {
            s7m s7mVar = ((jq2) this).viewModel;
            ((h6x) s7mVar).f4140t.g(((h6x) s7mVar).act());
            m8497a1();
        } else if (cVar == c.j) {
            ((h6x) ((jq2) this).viewModel).f4140t.g((dyq) null);
            m8507i1();
        } else if (cVar == c.m) {
            ((h6x) ((jq2) this).viewModel).f4140t.b();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.match.view.ViewPagerClickChangeView.InterfaceC0052a
    /* JADX INFO: renamed from: B */
    public void mo825B() {
        ((h6x) ((jq2) this).viewModel).m4951v();
        int currentItem = ((h6x) ((jq2) this).viewModel).f4122b.getCurrentItem();
        C0615c c0615c = this.f8495h;
        if (currentItem <= 0) {
            m8508j1(false, true, c0615c.getCount());
            return;
        }
        m8508j1(true, true, c0615c.getCount());
        s7m s7mVar = ((jq2) this).viewModel;
        ((h6x) s7mVar).f4122b.T(((h6x) s7mVar).f4122b.getCurrentItem() - 1, false);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m8490R0() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1250);
        valueAnimatorOfInt.setDuration(1250L);
        valueAnimatorOfInt.addUpdateListener(new C0613a());
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: S0 */
    public ArrayList<C0614b> m8491S0() {
        return this.f8494g;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m8492U0(User user, int i, ArrayList<String> arrayList) {
        this.f5221c = user;
        this.f8495h = new C0615c();
        this.f8494g = new ArrayList<>();
        Iterator it = user.pictures.iterator();
        while (it.hasNext()) {
            this.f8494g.add(new C0614b((Media) it.next()));
        }
        ((h6x) ((jq2) this).viewModel).m4952w(user, this.f8495h, i, arrayList);
        m8490R0();
        e51.H(act(), new Runnable() { // from class: l.q5x
            @Override // java.lang.Runnable
            public final void run() {
                this.f6594a.m8493V0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m8493V0() {
        m8510l1(((h6x) ((jq2) this).viewModel).m4950u());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m8494X0(roj0 roj0Var) {
        m8492U0(CoreModule.c.e0.Pa(this.f5220b), this.f5219a, this.f8492e);
    }

    /* JADX INFO: renamed from: Z */
    public void m8495Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m8496a0() {
        super.a0();
        if (u59.f0()) {
            CoreModule.c.f0.Fo();
        }
        creates(new e30() { // from class: l.m5x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5555a.m8488W0((Bundle) obj);
            }
        });
        duringCreated(this.f8493f).subscribe((m250) mkd0.G(new e30() { // from class: l.n5x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5838a.m8494X0((roj0) obj);
            }
        }));
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.o5x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6046a.m8489Y0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m8498b1(Message message) {
        ccx.m3248f(R.string.Fh, this.f5221c.fp().profileSmall());
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m8499c1(Throwable th) {
        ccx.m3248f(R.string.yh, this.f5221c.fp().profileSmall());
    }

    @Override // p003l.l5x
    public void destroy() {
        super.destroy();
    }

    /* JADX INFO: renamed from: e1 */
    public void m8502e1() {
        if (this.f8491d.size() <= 1) {
            ((h6x) ((jq2) this).viewModel).m4937F();
            act().finish();
        } else {
            this.f5220b = this.f8491d.get(1);
            this.f8491d.remove(0);
            this.f8492e.remove(0);
            this.f8493f.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public void m8501d1(String str, boolean z) {
        if (z) {
            act().hideInput();
        }
        final Conversation conversationXe = CoreModule.c.f0.Xe(this.f5220b);
        if (NullChecker.a(conversationXe)) {
            e51.y(new Runnable() { // from class: l.s5x
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.v5x
                        @Override // p003l.d30
                        public final void call() {
                            w5x.m8477E0(conversation);
                        }
                    });
                }
            });
        }
        Message message = new Message();
        message.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        message.value = str;
        CoreModule.c.f0.Dn(this.f5220b, message, (Sticker) null).subscribe((m250) mkd0.H(new e30() { // from class: l.t5x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7410a.m8498b1((Message) obj);
            }
        }, new e30() { // from class: l.u5x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7929a.m8499c1((Throwable) obj);
            }
        }));
        m8502e1();
    }

    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final void m8497a1() {
        if (NullChecker.a(((jq2) this).viewModel) && NullChecker.a(((h6x) ((jq2) this).viewModel).f4122b)) {
            m8510l1(((h6x) ((jq2) this).viewModel).f4122b.getCurrentItem());
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m8506h1() {
        for (int i = 0; i < this.f8494g.size(); i++) {
            if (this.f8494g.get(i).f8497a instanceof Video) {
                PictureView pictureView = this.f8494g.get(i).f8499c;
                if (NullChecker.a(pictureView) && pictureView.W()) {
                    pictureView.U();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m8507i1() {
        m8506h1();
    }

    /* JADX INFO: renamed from: j1 */
    public final void m8508j1(boolean z, boolean z2, int i) {
        o6j0.c("e_matched_photo", "p_successful_match_view", new o6j0.a[]{o6j0.a.i("can_switch", z), o6j0.a.h("change_photo_direction", z2 ? "left" : "right"), o6j0.a.f("photo_numbers", i)});
    }

    /* JADX INFO: renamed from: k1 */
    public void m8509k1(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o6j0.c("e_matched_send_message", "p_successful_match_view", new o6j0.a[0]);
        if (!qib0.Z.K(str)) {
            m8501d1(str, z);
            return;
        }
        act().dialog().E0(R.string.zi).D(R.string.xi).k0(R.string.wi).t0(R.string.yi, new Runnable() { // from class: l.r5x
            @Override // java.lang.Runnable
            public final void run() {
                this.f6793a.m8501d1(str, z);
            }
        }).z0();
        HashSet hashSet = new HashSet((Collection) MessagesAct.f1526r.get());
        hashSet.add(((DbObject) CoreModule.c.e0.Pa(this.f5220b)).id);
        MessagesAct.f1526r.put(hashSet);
    }

    /* JADX INFO: renamed from: l1 */
    public void m8510l1(int i) {
        for (int i2 = 0; i2 < this.f8494g.size(); i2++) {
            if (this.f8494g.get(i2).f8497a instanceof Video) {
                PictureView pictureView = this.f8494g.get(i2).f8499c;
                if (i == i2) {
                    if (NullChecker.a(pictureView)) {
                        pictureView.V();
                    }
                } else if (NullChecker.a(pictureView) && pictureView.W()) {
                    pictureView.U();
                }
            }
        }
    }

    @Override // p028v.VTexturePlayer.InterfaceC1376b
    public void onComplete() {
        e51.H(act(), new Runnable() { // from class: l.p5x
            @Override // java.lang.Runnable
            public final void run() {
                this.f6322a.m8497a1();
            }
        }, 150L);
    }

    @Override // p003l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo5067q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo5067q0(str, i, arrayList, arrayList2);
        this.f8491d = arrayList;
        this.f8492e = arrayList2;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.match.view.ViewPagerClickChangeView.InterfaceC0052a
    /* JADX INFO: renamed from: w */
    public void mo826w() {
        ((h6x) ((jq2) this).viewModel).m4951v();
        int currentItem = ((h6x) ((jq2) this).viewModel).f4122b.getCurrentItem();
        int count = this.f8495h.getCount() - 1;
        C0615c c0615c = this.f8495h;
        if (currentItem >= count) {
            m8508j1(false, false, c0615c.getCount());
            return;
        }
        m8508j1(true, false, c0615c.getCount());
        s7m s7mVar = ((jq2) this).viewModel;
        ((h6x) s7mVar).f4122b.T(((h6x) s7mVar).f4122b.getCurrentItem() + 1, false);
    }

    @Override // p028v.VTexturePlayer.InterfaceC1376b
    /* JADX INFO: renamed from: d */
    public void mo8500d() {
    }

    @Override // p028v.VTexturePlayer.InterfaceC1376b
    /* JADX INFO: renamed from: h */
    public void mo8505h() {
    }

    @Override // p028v.VTexturePlayer.InterfaceC1376b
    public void onPause() {
    }

    @Override // p028v.VTexturePlayer.InterfaceC1376b
    public void onResume() {
    }

    @Override // p028v.VTexturePlayer.InterfaceC1376b
    /* JADX INFO: renamed from: y */
    public void mo8511y() {
    }

    @Override // p028v.VTexturePlayer.InterfaceC1376b
    public void onError(int i, int i2) {
    }
}
