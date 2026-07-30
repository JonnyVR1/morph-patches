package com.p046p1.mobile.putong.core.newui.fake;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.p053ui.account.SwitchAccountAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.C21368yd;
import p149l.ark;
import p149l.c4g0;
import p149l.e30;
import p149l.hpd0;
import p149l.mkd0;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.ua20;
import p149l.w9j;
import p149l.xdl0;
import p149l.ya5;
import p149l.ygh0;
import p149l.yij0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.b */
/* JADX INFO: loaded from: classes11.dex */
public class C7846b {

    /* JADX INFO: renamed from: a */
    public final hpd0 f21449a;

    /* JADX INFO: renamed from: b */
    public final hpd0 f21450b;

    /* JADX INFO: renamed from: c */
    public boolean f21451c;

    /* JADX INFO: renamed from: d */
    public c4g0 f21452d;

    /* JADX INFO: renamed from: e */
    public C22393b<roj0> f21453e;

    /* JADX INFO: renamed from: f */
    public final Application.ActivityLifecycleCallbacks f21454f;

    /* JADX INFO: renamed from: g */
    public Set<Class> f21455g;

    /* JADX INFO: renamed from: h */
    public boolean f21456h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.b$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m36444b(Activity activity) {
            User userM169527p9;
            if (NullChecker.m81303a(qib0.f154713b0.f139230a.userId()) && (userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9()) != null && C7846b.this.m36436t(userM169527p9) && C7846b.this.m36435s(activity) && !activity.isFinishing()) {
                C7846b.this.m36427G(userM169527p9, "fakeView", (Act) activity);
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
            if ((activity instanceof Act) && CoreModule.m29931H().signedIn_() && C7846b.this.f21456h) {
                ((Act) activity).postDelayed(new Runnable() { // from class: l.f1g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94094a.m36444b(activity);
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
    public class b implements FakeHoldFragment.InterfaceC7844a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FakeHoldFragment.InterfaceC7844a f21458a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f21459b;

        public b(FakeHoldFragment.InterfaceC7844a interfaceC7844a, boolean z) {
            this.f21458a = interfaceC7844a;
            this.f21459b = z;
        }

        @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
        /* JADX INFO: renamed from: a */
        public void mo36397a(ArrayList<Media> arrayList, String str) {
            if (NullChecker.m81303a(this.f21458a)) {
                this.f21458a.mo36397a(arrayList, str);
            }
            if (this.f21459b) {
                C7846b.this.m36422B(arrayList, str);
            }
        }

        @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
        public void onError() {
            if (NullChecker.m81303a(this.f21458a)) {
                this.f21458a.onError();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static C7846b f21461a = new C7846b();
    }

    public C7846b() {
        Class clsM36428H;
        String str = "fake_bubble_show" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f21449a = new hpd0(str, bool);
        this.f21450b = new hpd0("fake_svip_success_pop_show" + CoreModule.m29931H().userId(), bool);
        this.f21451c = false;
        this.f21453e = C22393b.m221521b();
        this.f21454f = new a();
        HashSet hashSet = new HashSet();
        this.f21455g = hashSet;
        this.f21456h = true;
        hashSet.add(NewAlbumCropperAct.class);
        this.f21455g.add(MediaPickerAct.class);
        this.f21455g.add(MediaPreviewAct.class);
        this.f21455g.add(MediaPickerBaseAct.class);
        this.f21455g.add(com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPreviewAct.class);
        this.f21455g.add(com.p046p1.mobile.putong.core.p053ui.mediapreview.MediaPreviewAct.class);
        this.f21455g.add(CoreModule.m29931H().mo28173t5());
        this.f21455g.add(CropperAct.class);
        this.f21455g.add(CoreModule.m29931H().getSignOutJumpAct());
        ComponentName component = SwitchAccountAct.m44196V1(CoreModule.f17544b, null).getComponent();
        if (component != null && (clsM36428H = m36428H(component.getClassName())) != null) {
            this.f21455g.add(clsM36428H);
        }
        Class clsM36428H2 = m36428H("com.p1.mobile.putong.account.ui.account.SignInBaseActMVP");
        if (clsM36428H2 != null) {
            this.f21455g.add(clsM36428H2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C22306c m36412f(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f17545c.f19639e0.m169527p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m36414h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m36415i() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m36416j(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static C7846b m36420r() {
        return c.f21461a;
    }

    /* JADX INFO: renamed from: A */
    public void m36421A() {
        this.f21456h = true;
        c4g0 c4g0Var = this.f21452d;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
        }
        this.f21452d = CoreModule.f17545c.f19639e0.m169523o9().filter(new C21368yd()).distinctUntilChanged(new w9j() { // from class: l.a1g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.b1g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72594a.m36437u((User) obj);
            }
        }, new e30() { // from class: l.c1g
            @Override // p149l.e30
            public final void call(Object obj) {
                C7846b.m36416j((Throwable) obj);
            }
        }));
        CoreModule.f17544b.registerActivityLifecycleCallbacks(this.f21454f);
    }

    /* JADX INFO: renamed from: B */
    public final void m36422B(final ArrayList<Media> arrayList, final String str) {
        this.f21456h = false;
        ya5.m213793I(arrayList, "profile").compose(mkd0.m154951C()).filter(new w9j() { // from class: l.w0g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f183916a.m36439w((List) obj);
            }
        }).flatMap(new w9j() { // from class: l.x0g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C7846b.m36412f((List) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.y0g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195305a.m36440x(arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.z0g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200994a.m36438v((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m36441y(Act act, Intent intent) {
        m36424D(act, intent, null);
    }

    /* JADX INFO: renamed from: D */
    public void m36424D(Act act, Intent intent, FakeHoldFragment.InterfaceC7844a interfaceC7844a) {
        m36425E(act, intent, interfaceC7844a, true);
    }

    /* JADX INFO: renamed from: E */
    public final void m36425E(Act act, Intent intent, FakeHoldFragment.InterfaceC7844a interfaceC7844a, boolean z) {
        FakeHoldFragment.m36395z4(1024, intent, new b(interfaceC7844a, z)).m36396A4(act.getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: F */
    public void m36426F(Act act, Intent intent, FakeHoldFragment.InterfaceC7844a interfaceC7844a) {
        m36425E(act, intent, interfaceC7844a, false);
    }

    /* JADX INFO: renamed from: G */
    public void m36427G(User user, String str, final Act act) {
        this.f21453e.m132487l(roj0.f160388a);
        final Intent intentM78919X1 = MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).build());
        ark.m98455W0(act, true, user.m60124fp(), act.string(R$string.f17827Ik), new Runnable() { // from class: l.u0g
            @Override // java.lang.Runnable
            public final void run() {
                this.f172905a.m36441y(act, intentM78919X1);
            }
        }, str);
    }

    /* JADX INFO: renamed from: H */
    public final Class m36428H(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m36429I(final User user, final String str) {
        Act.foreground().filter(new ua20()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.e1g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88818a.m36442z(user, str, (Act.C4299r) obj);
            }
        }, new e30() { // from class: l.v0g
            @Override // p149l.e30
            public final void call(Object obj) {
                C7846b.m36414h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m36430J() {
        mkd0.m154992z(this.f21452d);
        CoreModule.f17544b.unregisterActivityLifecycleCallbacks(this.f21454f);
    }

    /* JADX INFO: renamed from: n */
    public boolean m36431n() {
        if (this.f21449a.get().booleanValue()) {
            return false;
        }
        return !this.f21451c;
    }

    /* JADX INFO: renamed from: o */
    public void m36432o() {
        this.f21449a.put(Boolean.FALSE);
        this.f21451c = false;
    }

    /* JADX INFO: renamed from: p */
    public void m36433p() {
        this.f21453e.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: q */
    public C22306c<roj0> m36434q() {
        return this.f21453e.asObservable();
    }

    /* JADX INFO: renamed from: s */
    public boolean m36435s(Activity activity) {
        if (activity == null) {
            return false;
        }
        for (Class cls : this.f21455g) {
            if (cls != null && cls.isAssignableFrom(activity.getClass())) {
                return false;
            }
        }
        return activity instanceof Act;
    }

    /* JADX INFO: renamed from: t */
    public boolean m36436t(User user) {
        return user.status.contains(UserStatus.get(UserStatus.violation));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m36437u(User user) {
        if (m36436t(user)) {
            m36429I(user, "fakeView");
        } else {
            m36433p();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m36438v(Throwable th) {
        this.f21456h = true;
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Boolean m36439w(List list) {
        boolean z = NullChecker.m81303a(CoreModule.m29931H().userId()) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9());
        if (!z) {
            this.f21456h = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m36440x(ArrayList arrayList, String str, roj0 roj0Var) {
        this.f21456h = true;
        CoreModule.f17545c.f19639e0.m169552va(App.f15373i.get().intValue());
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (c4299rForeground_ == null || c4299rForeground_.f15343a.get() == null || !(c4299rForeground_.f15343a.get() instanceof Act)) {
            return;
        }
        Act act = (Act) c4299rForeground_.f15343a.get();
        ark.m98453V0(act, false, (Media) arrayList.get(0), act.string(R$string.f18491el), new Runnable() { // from class: l.d1g
            @Override // java.lang.Runnable
            public final void run() {
                C7846b.m36415i();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.m214648G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.m214703v();
        }
        CoreModule.f17545c.f19639e0.m169395H7();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m36442z(User user, String str, Act.C4299r c4299r) {
        if (CoreModule.m29931H().signedIn_() && NullChecker.m81303a(qib0.f154713b0.f139230a.userId())) {
            if (m36435s(c4299r.f15343a.get())) {
                m36427G(user, str, (Act) c4299r.f15343a.get());
                return;
            }
            return;
        }
        Activity activity = c4299r.f15343a.get();
        CrashHelper.m81296c(new IllegalStateException("FakeManager User is signed " + CoreModule.m29931H().signedIn_() + "current user id is " + qib0.f154713b0.f139230a.userId() + " Activity is " + (activity == null ? "NULL" : activity.getClass().getSimpleName()) + "cache user " + user.f56011id));
    }
}
