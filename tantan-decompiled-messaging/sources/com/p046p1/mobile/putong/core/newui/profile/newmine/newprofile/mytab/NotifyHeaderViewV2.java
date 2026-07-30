package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.FakeGuideData;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.eu40;
import p149l.j760;
import p149l.m020;
import p149l.o6j0;
import p149l.oyv;
import p149l.rc2;
import p149l.roj0;
import p149l.vwb;
import p149l.w1g;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class NotifyHeaderViewV2 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f26636a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f26637b;

    /* JADX INFO: renamed from: c */
    public m020 f26638c;

    /* JADX INFO: renamed from: d */
    public Act f26639d;

    /* JADX INFO: renamed from: e */
    public final C22392a<FakeGuideData> f26640e;

    /* JADX INFO: renamed from: f */
    public final oyv.InterfaceC19081a<roj0> f26641f;

    /* JADX INFO: renamed from: g */
    public final C22392a<j760<AppealInfo, User>> f26642g;

    /* JADX INFO: renamed from: h */
    public final oyv.InterfaceC19081a<roj0> f26643h;

    /* JADX INFO: renamed from: i */
    public final C22392a<Boolean> f26644i;

    /* JADX INFO: renamed from: j */
    public final oyv.InterfaceC19081a<roj0> f26645j;

    /* JADX INFO: renamed from: k */
    public final C22392a<Boolean> f26646k;

    /* JADX INFO: renamed from: l */
    public final oyv.InterfaceC19081a<roj0> f26647l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$a */
    public class C8225a implements oyv.InterfaceC19081a<roj0> {
        public C8225a() {
        }

        @Override // p149l.oyv.InterfaceC19081a
        @NonNull
        /* JADX INFO: renamed from: b */
        public String mo43390b() {
            return "fakeGuideStrategy";
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: c */
        public void mo43391c(View view) {
            NotifyHeaderViewV2.this.f26637b.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189486Kg, 0, 0, 0);
            NotifyHeaderViewV2.this.f26637b.setText("请立即更换真实头像，以免影响你在划卡的曝光");
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: d */
        public C22306c<Boolean> mo43392d() {
            return NotifyHeaderViewV2.this.f26640e.map(new w9j() { // from class: l.zt40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    FakeGuideData fakeGuideData = (FakeGuideData) obj;
                    return Boolean.valueOf(fakeGuideData != null && fakeGuideData.changeAvatar && "mainAvatar".equals(fakeGuideData.type));
                }
            });
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean mo43389a(roj0 roj0Var) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$b */
    public class C8226b implements oyv.InterfaceC19081a<roj0> {
        public C8226b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ Boolean m43394e(j760 j760Var) {
            AppealInfo appealInfo = (AppealInfo) j760Var.f116564a;
            User user = (User) j760Var.f116565b;
            if (NullChecker.m81303a(user)) {
                return Boolean.valueOf(user.status.contains(UserStatus.get(UserStatus.audit)) && !user.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL)) && NullChecker.m81303a(appealInfo) && !appealInfo.needAppeal);
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m43395f(View view) {
        }

        @Override // p149l.oyv.InterfaceC19081a
        @NonNull
        /* JADX INFO: renamed from: b */
        public String mo43390b() {
            return "auditStrategy";
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: c */
        public void mo43391c(View view) {
            NotifyHeaderViewV2.this.f26637b.setCompoundDrawablesWithIntrinsicBounds(x2c0.f190715xg, 0, 0, 0);
            NotifyHeaderViewV2 notifyHeaderViewV2 = NotifyHeaderViewV2.this;
            notifyHeaderViewV2.f26637b.setText(notifyHeaderViewV2.f26639d.string(R$string.f19057x8));
            xdl0.m208329E0(NotifyHeaderViewV2.this.f26636a, new View.OnClickListener() { // from class: l.au40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NotifyHeaderViewV2.C8226b.m43395f(view2);
                }
            });
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: d */
        public C22306c<Boolean> mo43392d() {
            return NotifyHeaderViewV2.this.f26642g.map(new w9j() { // from class: l.bu40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NotifyHeaderViewV2.C8226b.m43394e((j760) obj);
                }
            });
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean mo43389a(roj0 roj0Var) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$c */
    public class C8227c implements oyv.InterfaceC19081a<roj0> {
        public C8227c() {
        }

        @Override // p149l.oyv.InterfaceC19081a
        @NonNull
        /* JADX INFO: renamed from: b */
        public String mo43390b() {
            return "fakeStrategy";
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: c */
        public void mo43391c(View view) {
            NotifyHeaderViewV2.this.f26637b.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189486Kg, 0, 0, 0);
            String string = NotifyHeaderViewV2.this.f26639d.getString(R$string.f18993v4);
            if (w1g.m200928a()) {
                string = CoreModule.m29936Q().mo67285sj();
            }
            NotifyHeaderViewV2.this.f26637b.setText(string);
            if (!NotifyHeaderViewV2.this.f26638c.m152474o1()) {
                zvf0.m220402x("e_picture_fake_button", NotifyHeaderViewV2.this.f26638c.mo152480v());
            }
            xdl0.m208329E0(NotifyHeaderViewV2.this.f26636a, new View.OnClickListener() { // from class: l.cu40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f82527a.m43398f(view2);
                }
            });
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: d */
        public C22306c<Boolean> mo43392d() {
            return NotifyHeaderViewV2.this.f26644i;
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m43398f(View view) {
            NotifyHeaderViewV2.this.f26638c.m152464J1();
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean mo43389a(roj0 roj0Var) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$d */
    public class C8228d implements oyv.InterfaceC19081a<roj0> {
        public C8228d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void m43401f(View view) {
            NotifyHeaderViewV2.this.f26638c.m152463I1();
        }

        @Override // p149l.oyv.InterfaceC19081a
        @NonNull
        /* JADX INFO: renamed from: b */
        public String mo43390b() {
            return "appealStrategy";
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: c */
        public void mo43391c(View view) {
            NotifyHeaderViewV2.this.f26637b.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189486Kg, 0, 0, 0);
            VText_Medium vText_Medium = NotifyHeaderViewV2.this.f26637b;
            boolean zEquals = TextUtils.equals(rc2.m178723e().m178725b(), "under_review");
            NotifyHeaderViewV2 notifyHeaderViewV2 = NotifyHeaderViewV2.this;
            vText_Medium.setText(zEquals ? notifyHeaderViewV2.f26639d.getString(R$string.f18716m0) : notifyHeaderViewV2.f26639d.getString(R$string.f18747n0));
            if (!NotifyHeaderViewV2.this.f26638c.m152474o1()) {
                o6j0.m162864h("e_my_profile_navigation_appeal_guide", NotifyHeaderViewV2.this.f26638c.pageId(), o6j0.C18854a.m162878h("ban_user_appeal_state", rc2.m178723e().m178725b()));
            }
            xdl0.m208329E0(NotifyHeaderViewV2.this.f26636a, new View.OnClickListener() { // from class: l.du40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f87952a.m43401f(view2);
                }
            });
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: d */
        public C22306c<Boolean> mo43392d() {
            return NotifyHeaderViewV2.this.f26646k;
        }

        @Override // p149l.oyv.InterfaceC19081a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean mo43389a(roj0 roj0Var) {
            return true;
        }
    }

    public NotifyHeaderViewV2(@NonNull Context context) {
        super(context);
        this.f26640e = C22392a.m221513c(null);
        this.f26641f = new C8225a();
        this.f26642g = C22392a.m221513c(vwb.m200311Y(null, null));
        this.f26643h = new C8226b();
        Boolean bool = Boolean.FALSE;
        this.f26644i = C22392a.m221513c(bool);
        this.f26645j = new C8227c();
        this.f26646k = C22392a.m221513c(bool);
        this.f26647l = new C8228d();
    }

    /* JADX INFO: renamed from: c */
    public final void m43382c(View view) {
        eu40.m118156a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m43383d(m020 m020Var) {
        this.f26638c = m020Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m43384e() {
        Act act = (Act) xdl0.m208328E(this);
        this.f26639d = act;
        oyv oyvVar = new oyv(act, this);
        oyvVar.m166721l(0);
        oyvVar.m166720k(this.f26647l);
        oyvVar.m166720k(this.f26645j);
        oyvVar.m166720k(this.f26643h);
        oyvVar.m166720k(this.f26641f);
        oyvVar.m166722m();
    }

    /* JADX INFO: renamed from: f */
    public void m43385f(FakeGuideData fakeGuideData) {
        this.f26640e.onNext(fakeGuideData);
    }

    /* JADX INFO: renamed from: g */
    public void m43386g(boolean z, String str) {
        str.getClass();
        if (str.equals("appeal")) {
            this.f26646k.onNext(Boolean.valueOf(z));
        } else if (str.equals("picture_fake")) {
            this.f26644i.onNext(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m43387h(j760<AppealInfo, User> j760Var) {
        this.f26642g.onNext(j760Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43382c(this);
        m43384e();
    }

    public NotifyHeaderViewV2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26640e = C22392a.m221513c(null);
        this.f26641f = new C8225a();
        this.f26642g = C22392a.m221513c(vwb.m200311Y(null, null));
        this.f26643h = new C8226b();
        Boolean bool = Boolean.FALSE;
        this.f26644i = C22392a.m221513c(bool);
        this.f26645j = new C8227c();
        this.f26646k = C22392a.m221513c(bool);
        this.f26647l = new C8228d();
    }

    public NotifyHeaderViewV2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26640e = C22392a.m221513c(null);
        this.f26641f = new C8225a();
        this.f26642g = C22392a.m221513c(vwb.m200311Y(null, null));
        this.f26643h = new C8226b();
        Boolean bool = Boolean.FALSE;
        this.f26644i = C22392a.m221513c(bool);
        this.f26645j = new C8227c();
        this.f26646k = C22392a.m221513c(bool);
        this.f26647l = new C8228d();
    }
}
