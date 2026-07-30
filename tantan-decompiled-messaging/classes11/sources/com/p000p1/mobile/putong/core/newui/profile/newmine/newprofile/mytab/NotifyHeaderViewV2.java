package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.data.FakeGuideData;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import l.eu40;
import l.j760;
import l.o6j0;
import l.oyv;
import l.roj0;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.m020;
import p009l.rc2;
import p009l.w1g;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NotifyHeaderViewV2 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5414a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f5415b;

    /* JADX INFO: renamed from: c */
    public m020 f5416c;

    /* JADX INFO: renamed from: d */
    public Act f5417d;

    /* JADX INFO: renamed from: e */
    public final a<FakeGuideData> f5418e;

    /* JADX INFO: renamed from: f */
    public final oyv.a<roj0> f5419f;

    /* JADX INFO: renamed from: g */
    public final a<j760<AppealInfo, User>> f5420g;

    /* JADX INFO: renamed from: h */
    public final oyv.a<roj0> f5421h;

    /* JADX INFO: renamed from: i */
    public final a<Boolean> f5422i;

    /* JADX INFO: renamed from: j */
    public final oyv.a<roj0> f5423j;

    /* JADX INFO: renamed from: k */
    public final a<Boolean> f5424k;

    /* JADX INFO: renamed from: l */
    public final oyv.a<roj0> f5425l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$a */
    public class C0389a implements oyv.a<roj0> {
        public C0389a() {
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public String m7617b() {
            return "fakeGuideStrategy";
        }

        /* JADX INFO: renamed from: c */
        public void m7618c(View view) {
            NotifyHeaderViewV2.this.f5415b.setCompoundDrawablesWithIntrinsicBounds(x2c0.Kg, 0, 0, 0);
            NotifyHeaderViewV2.this.f5415b.setText("请立即更换真实头像，以免影响你在划卡的曝光");
        }

        /* JADX INFO: renamed from: d */
        public c<Boolean> m7619d() {
            return NotifyHeaderViewV2.this.f5418e.map(new w9j() { // from class: l.zt40
                public final Object call(Object obj) {
                    FakeGuideData fakeGuideData = (FakeGuideData) obj;
                    return Boolean.valueOf(fakeGuideData != null && fakeGuideData.changeAvatar && "mainAvatar".equals(fakeGuideData.type));
                }
            });
        }

        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean m7616a(roj0 roj0Var) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$b */
    public class C0390b implements oyv.a<roj0> {
        public C0390b() {
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ Boolean m7621e(j760 j760Var) {
            AppealInfo appealInfo = (AppealInfo) j760Var.a;
            User user = (User) j760Var.b;
            if (NullChecker.a(user)) {
                return Boolean.valueOf(user.status.contains(UserStatus.get("audit")) && !user.status.contains(UserStatus.get("RISK_TAG_UNREAL")) && NullChecker.a(appealInfo) && !appealInfo.needAppeal);
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m7622f(View view) {
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public String m7624b() {
            return "auditStrategy";
        }

        /* JADX INFO: renamed from: c */
        public void m7625c(View view) {
            NotifyHeaderViewV2.this.f5415b.setCompoundDrawablesWithIntrinsicBounds(x2c0.xg, 0, 0, 0);
            NotifyHeaderViewV2 notifyHeaderViewV2 = NotifyHeaderViewV2.this;
            notifyHeaderViewV2.f5415b.setText(notifyHeaderViewV2.f5417d.string(R.string.x8));
            xdl0.E0(NotifyHeaderViewV2.this.f5414a, new View.OnClickListener() { // from class: l.au40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NotifyHeaderViewV2.C0390b.m7622f(view2);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public c<Boolean> m7626d() {
            return NotifyHeaderViewV2.this.f5420g.map(new w9j() { // from class: l.bu40
                public final Object call(Object obj) {
                    return NotifyHeaderViewV2.C0390b.m7621e((j760) obj);
                }
            });
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean m7623a(roj0 roj0Var) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$c */
    public class C0391c implements oyv.a<roj0> {
        public C0391c() {
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public String m7630b() {
            return "fakeStrategy";
        }

        /* JADX INFO: renamed from: c */
        public void m7631c(View view) {
            NotifyHeaderViewV2.this.f5415b.setCompoundDrawablesWithIntrinsicBounds(x2c0.Kg, 0, 0, 0);
            String string = NotifyHeaderViewV2.this.f5417d.getString(R.string.v4);
            if (w1g.m23770a()) {
                string = CoreModule.Q().m9070sj();
            }
            NotifyHeaderViewV2.this.f5415b.setText(string);
            if (!NotifyHeaderViewV2.this.f5416c.m18200o1()) {
                zvf0.x("e_picture_fake_button", NotifyHeaderViewV2.this.f5416c.mo18206v());
            }
            xdl0.E0(NotifyHeaderViewV2.this.f5414a, new View.OnClickListener() { // from class: l.cu40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10769a.m7633f(view2);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public c<Boolean> m7632d() {
            return NotifyHeaderViewV2.this.f5422i;
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m7633f(View view) {
            NotifyHeaderViewV2.this.f5416c.m18189J1();
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean m7629a(roj0 roj0Var) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2$d */
    public class C0392d implements oyv.a<roj0> {
        public C0392d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void m7636f(View view) {
            NotifyHeaderViewV2.this.f5416c.m18188I1();
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public String m7638b() {
            return "appealStrategy";
        }

        /* JADX INFO: renamed from: c */
        public void m7639c(View view) {
            NotifyHeaderViewV2.this.f5415b.setCompoundDrawablesWithIntrinsicBounds(x2c0.Kg, 0, 0, 0);
            VText_Medium vText_Medium = NotifyHeaderViewV2.this.f5415b;
            boolean zEquals = TextUtils.equals(rc2.m21492e().m21494b(), "under_review");
            NotifyHeaderViewV2 notifyHeaderViewV2 = NotifyHeaderViewV2.this;
            vText_Medium.setText(zEquals ? notifyHeaderViewV2.f5417d.getString(R.string.m0) : notifyHeaderViewV2.f5417d.getString(R.string.n0));
            if (!NotifyHeaderViewV2.this.f5416c.m18200o1()) {
                o6j0.h("e_my_profile_navigation_appeal_guide", NotifyHeaderViewV2.this.f5416c.pageId(), new o6j0.a[]{o6j0.a.h("ban_user_appeal_state", rc2.m21492e().m21494b())});
            }
            xdl0.E0(NotifyHeaderViewV2.this.f5414a, new View.OnClickListener() { // from class: l.du40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11999a.m7636f(view2);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public c<Boolean> m7640d() {
            return NotifyHeaderViewV2.this.f5424k;
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean m7637a(roj0 roj0Var) {
            return true;
        }
    }

    public NotifyHeaderViewV2(@NonNull Context context) {
        super(context);
        this.f5418e = a.c((Object) null);
        this.f5419f = new C0389a();
        this.f5420g = a.c(vwb.Y((Object) null, (Object) null));
        this.f5421h = new C0390b();
        Boolean bool = Boolean.FALSE;
        this.f5422i = a.c(bool);
        this.f5423j = new C0391c();
        this.f5424k = a.c(bool);
        this.f5425l = new C0392d();
    }

    /* JADX INFO: renamed from: c */
    public final void m7609c(View view) {
        eu40.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m7610d(m020 m020Var) {
        this.f5416c = m020Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m7611e() {
        Act actE = xdl0.E(this);
        this.f5417d = actE;
        oyv oyvVar = new oyv(actE, this);
        oyvVar.l(0);
        oyvVar.k(this.f5425l);
        oyvVar.k(this.f5423j);
        oyvVar.k(this.f5421h);
        oyvVar.k(this.f5419f);
        oyvVar.m();
    }

    /* JADX INFO: renamed from: f */
    public void m7612f(FakeGuideData fakeGuideData) {
        this.f5418e.onNext(fakeGuideData);
    }

    /* JADX INFO: renamed from: g */
    public void m7613g(boolean z, String str) {
        str.getClass();
        if (str.equals("appeal")) {
            this.f5424k.onNext(Boolean.valueOf(z));
        } else if (str.equals("picture_fake")) {
            this.f5422i.onNext(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m7614h(j760<AppealInfo, User> j760Var) {
        this.f5420g.onNext(j760Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7609c(this);
        m7611e();
    }

    public NotifyHeaderViewV2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5418e = a.c((Object) null);
        this.f5419f = new C0389a();
        this.f5420g = a.c(vwb.Y((Object) null, (Object) null));
        this.f5421h = new C0390b();
        Boolean bool = Boolean.FALSE;
        this.f5422i = a.c(bool);
        this.f5423j = new C0391c();
        this.f5424k = a.c(bool);
        this.f5425l = new C0392d();
    }

    public NotifyHeaderViewV2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5418e = a.c((Object) null);
        this.f5419f = new C0389a();
        this.f5420g = a.c(vwb.Y((Object) null, (Object) null));
        this.f5421h = new C0390b();
        Boolean bool = Boolean.FALSE;
        this.f5422i = a.c(bool);
        this.f5423j = new C0391c();
        this.f5424k = a.c(bool);
        this.f5425l = new C0392d();
    }
}
