package com.p000p1.mobile.putong.core.newui.fake;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.fake.C0010b;
import com.p000p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.ui.cropiwa.CropperAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.account.SwitchAccountAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.ark;
import l.c4g0;
import l.e30;
import l.hpd0;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.t100;
import l.ua20;
import l.w9j;
import l.xdl0;
import l.ya5;
import l.yd;
import l.ygh0;
import p009l.yij0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0010b {

    /* JADX INFO: renamed from: a */
    public final hpd0 f227a;

    /* JADX INFO: renamed from: b */
    public final hpd0 f228b;

    /* JADX INFO: renamed from: c */
    public boolean f229c;

    /* JADX INFO: renamed from: d */
    public c4g0 f230d;

    /* JADX INFO: renamed from: e */
    public rx.subjects.b<roj0> f231e;

    /* JADX INFO: renamed from: f */
    public final Application.ActivityLifecycleCallbacks f232f;

    /* JADX INFO: renamed from: g */
    public Set<Class> f233g;

    /* JADX INFO: renamed from: h */
    public boolean f234h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.b$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m373b(Activity activity) {
            User userP9;
            if (NullChecker.a(qib0.b0.a.userId()) && (userP9 = CoreModule.c.e0.p9()) != null && C0010b.this.m365t(userP9) && C0010b.this.m364s(activity) && !activity.isFinishing()) {
                C0010b.this.m356G(userP9, "fakeView", (Act) activity);
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
            if ((activity instanceof Act) && CoreModule.H().signedIn_() && C0010b.this.f234h) {
                ((Act) activity).postDelayed(new Runnable() { // from class: l.f1g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12748a.m373b(activity);
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
    public class b implements FakeHoldFragment.InterfaceC0008a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FakeHoldFragment.InterfaceC0008a f236a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f237b;

        public b(FakeHoldFragment.InterfaceC0008a interfaceC0008a, boolean z) {
            this.f236a = interfaceC0008a;
            this.f237b = z;
        }

        @Override // com.p000p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC0008a
        /* JADX INFO: renamed from: a */
        public void mo326a(ArrayList<Media> arrayList, String str) {
            if (NullChecker.a(this.f236a)) {
                this.f236a.mo326a(arrayList, str);
            }
            if (this.f237b) {
                C0010b.this.m351B(arrayList, str);
            }
        }

        @Override // com.p000p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC0008a
        public void onError() {
            if (NullChecker.a(this.f236a)) {
                this.f236a.onError();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static C0010b f239a = new C0010b();
    }

    public C0010b() {
        Class clsM357H;
        String str = "fake_bubble_show" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        this.f227a = new hpd0(str, bool);
        this.f228b = new hpd0("fake_svip_success_pop_show" + CoreModule.H().userId(), bool);
        this.f229c = false;
        this.f231e = rx.subjects.b.b();
        this.f232f = new a();
        HashSet hashSet = new HashSet();
        this.f233g = hashSet;
        this.f234h = true;
        hashSet.add(NewAlbumCropperAct.class);
        this.f233g.add(MediaPickerAct.class);
        this.f233g.add(MediaPreviewAct.class);
        this.f233g.add(MediaPickerBaseAct.class);
        this.f233g.add(com.p1.mobile.putong.core.ui.mediapicker.MediaPreviewAct.class);
        this.f233g.add(com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct.class);
        this.f233g.add(CoreModule.H().t5());
        this.f233g.add(CropperAct.class);
        this.f233g.add(CoreModule.H().getSignOutJumpAct());
        ComponentName component = SwitchAccountAct.V1(CoreModule.b, (String) null).getComponent();
        if (component != null && (clsM357H = m357H(component.getClassName())) != null) {
            this.f233g.add(clsM357H);
        }
        Class clsM357H2 = m357H("com.p1.mobile.putong.account.ui.account.SignInBaseActMVP");
        if (clsM357H2 != null) {
            this.f233g.add(clsM357H2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ rx.c m341f(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.c.e0.p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m343h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m344i() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m345j(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static C0010b m349r() {
        return c.f239a;
    }

    /* JADX INFO: renamed from: A */
    public void m350A() {
        this.f234h = true;
        c4g0 c4g0Var = this.f230d;
        if (c4g0Var != null) {
            mkd0.z(c4g0Var);
        }
        this.f230d = CoreModule.c.e0.o9().filter(new yd()).distinctUntilChanged(new w9j() { // from class: l.a1g
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.b1g
            public final void call(Object obj) {
                this.f9871a.m366u((User) obj);
            }
        }, new e30() { // from class: l.c1g
            public final void call(Object obj) {
                C0010b.m345j((Throwable) obj);
            }
        }));
        CoreModule.b.registerActivityLifecycleCallbacks(this.f232f);
    }

    /* JADX INFO: renamed from: B */
    public final void m351B(final ArrayList<Media> arrayList, final String str) {
        this.f234h = false;
        ya5.I(arrayList, "profile").compose(mkd0.C()).filter(new w9j() { // from class: l.w0g
            public final Object call(Object obj) {
                return this.f21833a.m368w((List) obj);
            }
        }).flatMap(new w9j() { // from class: l.x0g
            public final Object call(Object obj) {
                return C0010b.m341f((List) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.y0g
            public final void call(Object obj) {
                this.f22843a.m369x(arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.z0g
            public final void call(Object obj) {
                this.f23314a.m367v((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m370y(Act act, Intent intent) {
        m353D(act, intent, null);
    }

    /* JADX INFO: renamed from: D */
    public void m353D(Act act, Intent intent, FakeHoldFragment.InterfaceC0008a interfaceC0008a) {
        m354E(act, intent, interfaceC0008a, true);
    }

    /* JADX INFO: renamed from: E */
    public final void m354E(Act act, Intent intent, FakeHoldFragment.InterfaceC0008a interfaceC0008a, boolean z) {
        FakeHoldFragment.m324z4(1024, intent, new b(interfaceC0008a, z)).m325A4(act.getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: F */
    public void m355F(Act act, Intent intent, FakeHoldFragment.InterfaceC0008a interfaceC0008a) {
        m354E(act, intent, interfaceC0008a, false);
    }

    /* JADX INFO: renamed from: G */
    public void m356G(User user, String str, final Act act) {
        this.f231e.onNext(roj0.a);
        final Intent intentM9216X1 = MediaPickerAct.m9216X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).build());
        ark.W0(act, true, user.fp(), act.string(R.string.Ik), new Runnable() { // from class: l.u0g
            @Override // java.lang.Runnable
            public final void run() {
                this.f20944a.m370y(act, intentM9216X1);
            }
        }, str);
    }

    /* JADX INFO: renamed from: H */
    public final Class m357H(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m358I(final User user, final String str) {
        Act.foreground().filter(new ua20()).take(1).subscribe(mkd0.H(new e30() { // from class: l.e1g
            public final void call(Object obj) {
                this.f12141a.m371z(user, str, (Act.r) obj);
            }
        }, new e30() { // from class: l.v0g
            public final void call(Object obj) {
                C0010b.m343h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m359J() {
        mkd0.z(this.f230d);
        CoreModule.b.unregisterActivityLifecycleCallbacks(this.f232f);
    }

    /* JADX INFO: renamed from: n */
    public boolean m360n() {
        if (((Boolean) this.f227a.get()).booleanValue()) {
            return false;
        }
        return !this.f229c;
    }

    /* JADX INFO: renamed from: o */
    public void m361o() {
        this.f227a.put(Boolean.FALSE);
        this.f229c = false;
    }

    /* JADX INFO: renamed from: p */
    public void m362p() {
        this.f231e.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: q */
    public rx.c<roj0> m363q() {
        return this.f231e.asObservable();
    }

    /* JADX INFO: renamed from: s */
    public boolean m364s(Activity activity) {
        if (activity == null) {
            return false;
        }
        for (Class cls : this.f233g) {
            if (cls != null && cls.isAssignableFrom(activity.getClass())) {
                return false;
            }
        }
        return activity instanceof Act;
    }

    /* JADX INFO: renamed from: t */
    public boolean m365t(User user) {
        return user.status.contains(UserStatus.get("violation"));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m366u(User user) {
        if (m365t(user)) {
            m358I(user, "fakeView");
        } else {
            m362p();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m367v(Throwable th) {
        this.f234h = true;
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Boolean m368w(List list) {
        boolean z = NullChecker.a(CoreModule.H().userId()) && NullChecker.a(CoreModule.c.e0.p9());
        if (!z) {
            this.f234h = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m369x(ArrayList arrayList, String str, roj0 roj0Var) {
        this.f234h = true;
        CoreModule.c.e0.va(((Integer) App.i.get()).intValue());
        Act.r rVarForeground_ = Act.foreground_();
        if (rVarForeground_ == null || rVarForeground_.a.get() == null || !(rVarForeground_.a.get() instanceof Act)) {
            return;
        }
        Act act = (Act) rVarForeground_.a.get();
        ark.V0(act, false, (Media) arrayList.get(0), act.string(R.string.el), new Runnable() { // from class: l.d1g
            @Override // java.lang.Runnable
            public final void run() {
                C0010b.m344i();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.v();
        }
        CoreModule.c.e0.H7();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m371z(User user, String str, Act.r rVar) {
        if (CoreModule.H().signedIn_() && NullChecker.a(qib0.b0.a.userId())) {
            if (m364s((Activity) rVar.a.get())) {
                m356G(user, str, (Act) rVar.a.get());
                return;
            }
            return;
        }
        Activity activity = (Activity) rVar.a.get();
        CrashHelper.c(new IllegalStateException("FakeManager User is signed " + CoreModule.H().signedIn_() + "current user id is " + qib0.b0.a.userId() + " Activity is " + (activity == null ? "NULL" : activity.getClass().getSimpleName()) + "cache user " + ((DbObject) user).id));
    }
}
