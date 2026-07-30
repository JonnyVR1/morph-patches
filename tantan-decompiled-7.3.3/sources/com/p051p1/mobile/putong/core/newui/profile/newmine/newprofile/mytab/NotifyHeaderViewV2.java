package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.FakeGuideData;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.k3g;
import p153l.l0w;
import p153l.pf60;
import p153l.qcj;
import p153l.sfj0;
import p153l.t250;
import p153l.u820;
import p153l.uxj0;
import p153l.yc2;

/* JADX INFO: loaded from: classes11.dex */
public class NotifyHeaderViewV2 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f27484a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f27485b;

    /* JADX INFO: renamed from: c */
    public u820 f27486c;

    /* JADX INFO: renamed from: d */
    public Act f27487d;

    /* JADX INFO: renamed from: e */
    public final C22507a<FakeGuideData> f27488e;

    /* JADX INFO: renamed from: f */
    public final l0w.InterfaceC18329a<uxj0> f27489f;

    /* JADX INFO: renamed from: g */
    public final C22507a<pf60<AppealInfo, User>> f27490g;

    /* JADX INFO: renamed from: h */
    public final l0w.InterfaceC18329a<uxj0> f27491h;

    /* JADX INFO: renamed from: i */
    public final C22507a<Boolean> f27492i;

    /* JADX INFO: renamed from: j */
    public final l0w.InterfaceC18329a<uxj0> f27493j;

    /* JADX INFO: renamed from: k */
    public final C22507a<Boolean> f27494k;

    /* JADX INFO: renamed from: l */
    public final l0w.InterfaceC18329a<uxj0> f27495l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$a */
    public class C8388a implements l0w.InterfaceC18329a<uxj0> {
        public C8388a() {
        }

        @Override // p153l.l0w.InterfaceC18329a
        @NonNull
        /* JADX INFO: renamed from: b */
        public String mo44576b() {
            return "fakeGuideStrategy";
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: c */
        public void mo44577c(View view) {
            NotifyHeaderViewV2.this.f27485b.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87611yh, 0, 0, 0);
            NotifyHeaderViewV2.this.f27485b.setText("请立即更换真实头像，以免影响你在划卡的曝光");
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: d */
        public C22421c<Boolean> mo44578d() {
            return NotifyHeaderViewV2.this.f27488e.map(new qcj() { // from class: l.o250
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    FakeGuideData fakeGuideData = (FakeGuideData) obj;
                    return Boolean.valueOf(fakeGuideData != null && fakeGuideData.changeAvatar && "mainAvatar".equals(fakeGuideData.type));
                }
            });
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean mo44575a(uxj0 uxj0Var) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$b */
    public class C8389b implements l0w.InterfaceC18329a<uxj0> {
        public C8389b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ Boolean m44580e(pf60 pf60Var) {
            AppealInfo appealInfo = (AppealInfo) pf60Var.f152156a;
            User user = (User) pf60Var.f152157b;
            if (NullChecker.m82486a(user)) {
                return Boolean.valueOf(user.status.contains(UserStatus.get(UserStatus.audit)) && !user.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL)) && NullChecker.m82486a(appealInfo) && !appealInfo.needAppeal);
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m44581f(View view) {
        }

        @Override // p153l.l0w.InterfaceC18329a
        @NonNull
        /* JADX INFO: renamed from: b */
        public String mo44576b() {
            return "auditStrategy";
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: c */
        public void mo44577c(View view) {
            NotifyHeaderViewV2.this.f27485b.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87186lh, 0, 0, 0);
            NotifyHeaderViewV2 notifyHeaderViewV2 = NotifyHeaderViewV2.this;
            notifyHeaderViewV2.f27485b.setText(notifyHeaderViewV2.f27487d.string(R$string.f19857z8));
            bnl0.m105509E0(NotifyHeaderViewV2.this.f27484a, new View.OnClickListener() { // from class: l.p250
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NotifyHeaderViewV2.C8389b.m44581f(view2);
                }
            });
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: d */
        public C22421c<Boolean> mo44578d() {
            return NotifyHeaderViewV2.this.f27490g.map(new qcj() { // from class: l.q250
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NotifyHeaderViewV2.C8389b.m44580e((pf60) obj);
                }
            });
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean mo44575a(uxj0 uxj0Var) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$c */
    public class C8390c implements l0w.InterfaceC18329a<uxj0> {
        public C8390c() {
        }

        @Override // p153l.l0w.InterfaceC18329a
        @NonNull
        /* JADX INFO: renamed from: b */
        public String mo44576b() {
            return "fakeStrategy";
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: c */
        public void mo44577c(View view) {
            NotifyHeaderViewV2.this.f27485b.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87611yh, 0, 0, 0);
            String string = NotifyHeaderViewV2.this.f27487d.getString(R$string.f19791x4);
            if (k3g.m148016a()) {
                string = CoreModule.m30934Q().mo68468sj();
            }
            NotifyHeaderViewV2.this.f27485b.setText(string);
            if (!NotifyHeaderViewV2.this.f27486c.m194972o1()) {
                i4g0.m138526x("e_picture_fake_button", NotifyHeaderViewV2.this.f27486c.mo194978v());
            }
            bnl0.m105509E0(NotifyHeaderViewV2.this.f27484a, new View.OnClickListener() { // from class: l.r250
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f160915a.m44584f(view2);
                }
            });
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: d */
        public C22421c<Boolean> mo44578d() {
            return NotifyHeaderViewV2.this.f27492i;
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m44584f(View view) {
            NotifyHeaderViewV2.this.f27486c.m194963J1();
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean mo44575a(uxj0 uxj0Var) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$d */
    public class C8391d implements l0w.InterfaceC18329a<uxj0> {
        public C8391d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void m44587f(View view) {
            NotifyHeaderViewV2.this.f27486c.m194962I1();
        }

        @Override // p153l.l0w.InterfaceC18329a
        @NonNull
        /* JADX INFO: renamed from: b */
        public String mo44576b() {
            return "appealStrategy";
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: c */
        public void mo44577c(View view) {
            NotifyHeaderViewV2.this.f27485b.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87611yh, 0, 0, 0);
            VText_Medium vText_Medium = NotifyHeaderViewV2.this.f27485b;
            boolean zEquals = TextUtils.equals(yc2.m215118e().m215120b(), "under_review");
            NotifyHeaderViewV2 notifyHeaderViewV2 = NotifyHeaderViewV2.this;
            vText_Medium.setText(zEquals ? notifyHeaderViewV2.f27487d.getString(R$string.f19446m0) : notifyHeaderViewV2.f27487d.getString(R$string.f19477n0));
            if (!NotifyHeaderViewV2.this.f27486c.m194972o1()) {
                sfj0.m185601h("e_my_profile_navigation_appeal_guide", NotifyHeaderViewV2.this.f27486c.pageId(), sfj0.C20032a.m185615h("ban_user_appeal_state", yc2.m215118e().m215120b()));
            }
            bnl0.m105509E0(NotifyHeaderViewV2.this.f27484a, new View.OnClickListener() { // from class: l.s250
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f165864a.m44587f(view2);
                }
            });
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: d */
        public C22421c<Boolean> mo44578d() {
            return NotifyHeaderViewV2.this.f27494k;
        }

        @Override // p153l.l0w.InterfaceC18329a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean mo44575a(uxj0 uxj0Var) {
            return true;
        }
    }

    public NotifyHeaderViewV2(@NonNull Context context) {
        super(context);
        this.f27488e = C22507a.m222759c(null);
        this.f27489f = new C8388a();
        this.f27490g = C22507a.m222759c(jyb.m147494Y(null, null));
        this.f27491h = new C8389b();
        Boolean bool = Boolean.FALSE;
        this.f27492i = C22507a.m222759c(bool);
        this.f27493j = new C8390c();
        this.f27494k = C22507a.m222759c(bool);
        this.f27495l = new C8391d();
    }

    /* JADX INFO: renamed from: c */
    public final void m44568c(View view) {
        t250.m188951a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m44569d(u820 u820Var) {
        this.f27486c = u820Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m44570e() {
        Act act = (Act) bnl0.m105508E(this);
        this.f27487d = act;
        l0w l0wVar = new l0w(act, this);
        l0wVar.m152388l(0);
        l0wVar.m152387k(this.f27495l);
        l0wVar.m152387k(this.f27493j);
        l0wVar.m152387k(this.f27491h);
        l0wVar.m152387k(this.f27489f);
        l0wVar.m152389m();
    }

    /* JADX INFO: renamed from: f */
    public void m44571f(FakeGuideData fakeGuideData) {
        this.f27488e.onNext(fakeGuideData);
    }

    /* JADX INFO: renamed from: g */
    public void m44572g(boolean z, String str) {
        str.getClass();
        if (str.equals("appeal")) {
            this.f27494k.onNext(Boolean.valueOf(z));
        } else if (str.equals("picture_fake")) {
            this.f27492i.onNext(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m44573h(pf60<AppealInfo, User> pf60Var) {
        this.f27490g.onNext(pf60Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44568c(this);
        m44570e();
    }

    public NotifyHeaderViewV2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27488e = C22507a.m222759c(null);
        this.f27489f = new C8388a();
        this.f27490g = C22507a.m222759c(jyb.m147494Y(null, null));
        this.f27491h = new C8389b();
        Boolean bool = Boolean.FALSE;
        this.f27492i = C22507a.m222759c(bool);
        this.f27493j = new C8390c();
        this.f27494k = C22507a.m222759c(bool);
        this.f27495l = new C8391d();
    }

    public NotifyHeaderViewV2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27488e = C22507a.m222759c(null);
        this.f27489f = new C8388a();
        this.f27490g = C22507a.m222759c(jyb.m147494Y(null, null));
        this.f27491h = new C8389b();
        Boolean bool = Boolean.FALSE;
        this.f27492i = C22507a.m222759c(bool);
        this.f27493j = new C8390c();
        this.f27494k = C22507a.m222759c(bool);
        this.f27495l = new C8391d();
    }
}
