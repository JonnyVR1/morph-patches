package com.p051p1.mobile.putong.core.newui.fake;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.p058ui.account.SwitchAccountAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.C20291td;
import p153l.bnl0;
import p153l.bsj0;
import p153l.dj20;
import p153l.fph0;
import p153l.jxd0;
import p153l.kcg0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qtk;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;
import p153l.yb5;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.b */
/* JADX INFO: loaded from: classes11.dex */
public class C7997b {

    /* JADX INFO: renamed from: a */
    public final jxd0 f22191a;

    /* JADX INFO: renamed from: b */
    public final jxd0 f22192b;

    /* JADX INFO: renamed from: c */
    public boolean f22193c;

    /* JADX INFO: renamed from: d */
    public kcg0 f22194d;

    /* JADX INFO: renamed from: e */
    public C22508b<uxj0> f22195e;

    /* JADX INFO: renamed from: f */
    public final Application.ActivityLifecycleCallbacks f22196f;

    /* JADX INFO: renamed from: g */
    public Set<Class> f22197g;

    /* JADX INFO: renamed from: h */
    public boolean f22198h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.b$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m37447b(Activity activity) {
            User userM116600p9;
            if (NullChecker.m82486a(uqb0.f180396b0.f170324a.userId()) && (userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9()) != null && C7997b.this.m37439t(userM116600p9) && C7997b.this.m37438s(activity) && !activity.isFinishing()) {
                C7997b.this.m37430G(userM116600p9, "fakeView", (Act) activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(final Activity activity) {
            if ((activity instanceof Act) && CoreModule.m30929H().signedIn_() && C7997b.this.f22198h) {
                ((Act) activity).postDelayed(new Runnable() { // from class: l.t2g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f171755a.m37447b(activity);
                    }
                }, 120L);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.b$b */
    public class b implements FakeHoldFragment.InterfaceC7995a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FakeHoldFragment.InterfaceC7995a f22200a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f22201b;

        public b(FakeHoldFragment.InterfaceC7995a interfaceC7995a, boolean z) {
            this.f22200a = interfaceC7995a;
            this.f22201b = z;
        }

        @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
        /* JADX INFO: renamed from: a */
        public void mo37400a(ArrayList<Media> arrayList, String str) {
            if (NullChecker.m82486a(this.f22200a)) {
                this.f22200a.mo37400a(arrayList, str);
            }
            if (this.f22201b) {
                C7997b.this.m37425B(arrayList, str);
            }
        }

        @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
        public void onError() {
            if (NullChecker.m82486a(this.f22200a)) {
                this.f22200a.onError();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static C7997b f22203a = new C7997b();
    }

    public C7997b() {
        Class clsM37431H;
        String str = "fake_bubble_show" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f22191a = new jxd0(str, bool);
        this.f22192b = new jxd0("fake_svip_success_pop_show" + CoreModule.m30929H().userId(), bool);
        this.f22193c = false;
        this.f22195e = C22508b.m222767b();
        this.f22196f = new a();
        HashSet hashSet = new HashSet();
        this.f22197g = hashSet;
        this.f22198h = true;
        hashSet.add(NewAlbumCropperAct.class);
        this.f22197g.add(MediaPickerAct.class);
        this.f22197g.add(MediaPreviewAct.class);
        this.f22197g.add(MediaPickerBaseAct.class);
        this.f22197g.add(com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPreviewAct.class);
        this.f22197g.add(com.p051p1.mobile.putong.core.p058ui.mediapreview.MediaPreviewAct.class);
        this.f22197g.add(CoreModule.m30929H().mo29172t5());
        this.f22197g.add(CropperAct.class);
        this.f22197g.add(CoreModule.m30929H().getSignOutJumpAct());
        ComponentName component = SwitchAccountAct.m45379X1(CoreModule.f18263b, null).getComponent();
        if (component != null && (clsM37431H = m37431H(component.getClassName())) != null) {
            this.f22197g.add(clsM37431H);
        }
        Class clsM37431H2 = m37431H("com.p1.mobile.putong.account.ui.account.SignInBaseActMVP");
        if (clsM37431H2 != null) {
            this.f22197g.add(clsM37431H2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C22421c m37415f(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f18264c.f20381e0.m116600p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m37417h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m37418i() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m37419j(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static C7997b m37423r() {
        return c.f22203a;
    }

    /* JADX INFO: renamed from: A */
    public void m37424A() {
        this.f22198h = true;
        kcg0 kcg0Var = this.f22194d;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
        this.f22194d = CoreModule.f18264c.f20381e0.m116596o9().filter(new C20291td()).distinctUntilChanged(new qcj() { // from class: l.o2g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.p2g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150264a.m37440u((User) obj);
            }
        }, new y20() { // from class: l.q2g
            @Override // p153l.y20
            public final void call(Object obj) {
                C7997b.m37419j((Throwable) obj);
            }
        }));
        CoreModule.f18263b.registerActivityLifecycleCallbacks(this.f22196f);
    }

    /* JADX INFO: renamed from: B */
    public final void m37425B(final ArrayList<Media> arrayList, final String str) {
        this.f22198h = false;
        yb5.m214980I(arrayList, "profile").compose(psd0.m173592C()).filter(new qcj() { // from class: l.k2g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f123595a.m37442w((List) obj);
            }
        }).flatMap(new qcj() { // from class: l.l2g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C7997b.m37415f((List) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.m2g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134572a.m37443x(arrayList, str, (uxj0) obj);
            }
        }, new y20() { // from class: l.n2g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139860a.m37441v((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m37444y(Act act, Intent intent) {
        m37427D(act, intent, null);
    }

    /* JADX INFO: renamed from: D */
    public void m37427D(Act act, Intent intent, FakeHoldFragment.InterfaceC7995a interfaceC7995a) {
        m37428E(act, intent, interfaceC7995a, true);
    }

    /* JADX INFO: renamed from: E */
    public final void m37428E(Act act, Intent intent, FakeHoldFragment.InterfaceC7995a interfaceC7995a, boolean z) {
        FakeHoldFragment.m37398z4(1024, intent, new b(interfaceC7995a, z)).m37399A4(act.getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: F */
    public void m37429F(Act act, Intent intent, FakeHoldFragment.InterfaceC7995a interfaceC7995a) {
        m37428E(act, intent, interfaceC7995a, false);
    }

    /* JADX INFO: renamed from: G */
    public void m37430G(User user, String str, final Act act) {
        this.f22195e.m137019l(uxj0.f181467a);
        final Intent intentM80102Y1 = MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).build());
        qtk.m178005W0(act, true, user.m61308fp(), act.string(R$string.f19221el), new Runnable() { // from class: l.i2g
            @Override // java.lang.Runnable
            public final void run() {
                this.f112612a.m37444y(act, intentM80102Y1);
            }
        }, str);
    }

    /* JADX INFO: renamed from: H */
    public final Class m37431H(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m37432I(final User user, final String str) {
        Act.foreground().filter(new dj20()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.s2g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165887a.m37445z(user, str, (Act.C4450r) obj);
            }
        }, new y20() { // from class: l.j2g
            @Override // p153l.y20
            public final void call(Object obj) {
                C7997b.m37417h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m37433J() {
        psd0.m173633z(this.f22194d);
        CoreModule.f18263b.unregisterActivityLifecycleCallbacks(this.f22196f);
    }

    /* JADX INFO: renamed from: n */
    public boolean m37434n() {
        if (this.f22191a.get().booleanValue()) {
            return false;
        }
        return !this.f22193c;
    }

    /* JADX INFO: renamed from: o */
    public void m37435o() {
        this.f22191a.put(Boolean.FALSE);
        this.f22193c = false;
    }

    /* JADX INFO: renamed from: p */
    public void m37436p() {
        this.f22195e.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: q */
    public C22421c<uxj0> m37437q() {
        return this.f22195e.asObservable();
    }

    /* JADX INFO: renamed from: s */
    public boolean m37438s(Activity activity) {
        if (activity == null) {
            return false;
        }
        for (Class cls : this.f22197g) {
            if (cls != null && cls.isAssignableFrom(activity.getClass())) {
                return false;
            }
        }
        return activity instanceof Act;
    }

    /* JADX INFO: renamed from: t */
    public boolean m37439t(User user) {
        return user.status.contains(UserStatus.get(UserStatus.violation));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m37440u(User user) {
        if (m37439t(user)) {
            m37432I(user, "fakeView");
        } else {
            m37436p();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m37441v(Throwable th) {
        this.f22198h = true;
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Boolean m37442w(List list) {
        boolean z = NullChecker.m82486a(CoreModule.m30929H().userId()) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9());
        if (!z) {
            this.f22198h = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m37443x(ArrayList arrayList, String str, uxj0 uxj0Var) {
        this.f22198h = true;
        CoreModule.f18264c.f20381e0.m116625va(App.f16092i.get().intValue());
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (c4450rForeground_ == null || c4450rForeground_.f16062a.get() == null || !(c4450rForeground_.f16062a.get() instanceof Act)) {
            return;
        }
        Act act = (Act) c4450rForeground_.f16062a.get();
        qtk.m178003V0(act, false, (Media) arrayList.get(0), act.string(R$string.f18307Al), new Runnable() { // from class: l.r2g
            @Override // java.lang.Runnable
            public final void run() {
                C7997b.m37418i();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            fph0.m126636G();
        } else if (TextUtils.equals(str, "fakeView")) {
            fph0.m126691v();
        }
        CoreModule.f18264c.f20381e0.m116468H7();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m37445z(User user, String str, Act.C4450r c4450r) {
        if (CoreModule.m30929H().signedIn_() && NullChecker.m82486a(uqb0.f180396b0.f170324a.userId())) {
            if (m37438s(c4450r.f16062a.get())) {
                m37430G(user, str, (Act) c4450r.f16062a.get());
                return;
            }
            return;
        }
        Activity activity = c4450r.f16062a.get();
        CrashHelper.m82479c(new IllegalStateException("FakeManager User is signed " + CoreModule.m30929H().signedIn_() + "current user id is " + uqb0.f180396b0.f170324a.userId() + " Activity is " + (activity == null ? "NULL" : activity.getClass().getSimpleName()) + "cache user " + user.f56859id));
    }
}
