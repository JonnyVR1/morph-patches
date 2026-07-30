package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.FakeGuideData;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VCard;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.k3g;
import p153l.l51;
import p153l.lyh0;
import p153l.pf60;
import p153l.qa00;
import p153l.sfj0;
import p153l.u250;
import p153l.u820;
import p153l.yc2;

/* JADX INFO: loaded from: classes11.dex */
public class NotifyHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f27472a;

    /* JADX INFO: renamed from: b */
    public VCard f27473b;

    /* JADX INFO: renamed from: c */
    public VText f27474c;

    /* JADX INFO: renamed from: d */
    public CardView f27475d;

    /* JADX INFO: renamed from: e */
    public VText f27476e;

    /* JADX INFO: renamed from: f */
    public CardView f27477f;

    /* JADX INFO: renamed from: g */
    public VText f27478g;

    /* JADX INFO: renamed from: h */
    public VText f27479h;

    /* JADX INFO: renamed from: i */
    public ViewStub f27480i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<String> f27481j;

    /* JADX INFO: renamed from: k */
    public u820 f27482k;

    /* JADX INFO: renamed from: l */
    public int f27483l;

    public NotifyHeaderView(@NonNull Context context) {
        super(context);
        this.f27481j = jyb.m147482M("default");
        this.f27483l = 0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m44548d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m44549e(View view) {
    }

    /* JADX INFO: renamed from: f */
    public final void m44550f(View view) {
        u250.m194246a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final Act m44551g() {
        return (Act) bnl0.m105508E(this);
    }

    /* JADX INFO: renamed from: h */
    public void m44552h(u820 u820Var) {
        this.f27482k = u820Var;
    }

    /* JADX INFO: renamed from: i */
    public void m44553i() {
        this.f27474c.setTypeface(Typeface.create(lyh0.m156283c(3), 0));
        this.f27476e.setTypeface(Typeface.create(lyh0.m156283c(3), 0));
        bnl0.m105509E0(this.f27475d, new View.OnClickListener() { // from class: l.j250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyHeaderView.m44549e(view);
            }
        });
        bnl0.m105509E0(this.f27477f, new View.OnClickListener() { // from class: l.k250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyHeaderView.m44548d(view);
            }
        });
        bnl0.m105524M(this.f27477f, false);
        if (gra.m131778z()) {
            FrameLayout frameLayout = this.f27472a;
            int i = qa00.f156322i;
            bnl0.m105538V(frameLayout, i);
            bnl0.m105539W(this.f27472a, i);
            bnl0.m105505C0(this.f27472a, qa00.f156337x);
            this.f27473b.setCardBackgroundColor(Color.parseColor("#08000000"));
            this.f27475d.setCardBackgroundColor(Color.parseColor("#08000000"));
            this.f27477f.setCardBackgroundColor(Color.parseColor("#08000000"));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m44554j() {
        int i;
        if (!bnl0.m105529O0(this.f27477f) || (i = this.f27483l) == 0) {
            return;
        }
        if (i == 1) {
            sfj0.m185601h("e_navigation_edit_profile_guidance", this.f27482k.pageId(), sfj0.C20032a.m185615h("navigation_edit_profile_guidance_name", ReminderAction.photo));
        } else if (i == 2) {
            sfj0.m185601h("e_navigation_edit_profile_guidance", this.f27482k.pageId(), sfj0.C20032a.m185615h("navigation_edit_profile_guidance_name", "self_introduction"));
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m44555k(View view) {
        this.f27482k.m194962I1();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m44556l(View view) {
        this.f27482k.m194963J1();
    }

    /* JADX INFO: renamed from: m */
    public void m44557m() {
        if (gra.m131676e2() && CoreModule.f18264c.f20381e0.m116541a8() && NullChecker.m82486a(this.f27477f)) {
            bnl0.m105524M(this.f27477f, false);
            m44564t();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m44558n(FakeGuideData fakeGuideData) {
        if (bnl0.m105529O0(this.f27475d) || bnl0.m105529O0(this.f27473b)) {
            bnl0.m105524M(this.f27480i, false);
            return;
        }
        if (fakeGuideData == null || !fakeGuideData.changeAvatar || !"mainAvatar".equals(fakeGuideData.type) || bnl0.m105529O0(this.f27480i)) {
            return;
        }
        bnl0.m105524M(this.f27480i, true);
        if (gra.m131778z()) {
            ((CardView) this.f27480i.findViewById(adc0.f70128T0)).setCardBackgroundColor(Color.parseColor("#08000000"));
        }
        m44561q(false);
        m44564t();
    }

    /* JADX INFO: renamed from: o */
    public void m44559o() {
        l51.m152888H(m44551g(), new Runnable() { // from class: l.l250
            @Override // java.lang.Runnable
            public final void run() {
                this.f129742a.m44554j();
            }
        }, 1000L);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44550f(this);
        m44553i();
    }

    /* JADX INFO: renamed from: p */
    public final void m44560p() {
        String string = m44551g().getString(R$string.f19791x4);
        if (k3g.m148016a()) {
            string = CoreModule.m30934Q().mo68468sj();
        }
        this.f27474c.setText(string);
    }

    /* JADX INFO: renamed from: q */
    public final void m44561q(boolean z) {
        if (!gra.m131676e2() || !TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode)) {
            this.f27483l = 0;
        } else {
            bnl0.m105524M(this.f27477f, false);
            m44564t();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m44562r() {
        if (bnl0.m105529O0(this.f27475d) || bnl0.m105529O0(this.f27473b)) {
            bnl0.m105524M(this.f27480i, false);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m44563s(boolean z, String str) {
        String str2;
        String str3;
        if (gra.m131778z() && z) {
            this.f27474c.setTextColor(getResources().getColor(c9c0.f80469x));
            this.f27474c.setTextSize(12.0f);
            this.f27474c.setCompoundDrawablePadding(qa00.f156316c);
            this.f27474c.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87611yh, 0, 0, 0);
        }
        if (this.f27481j.isEmpty()) {
            str2 = "default";
        } else {
            ArrayList<String> arrayList = this.f27481j;
            str2 = arrayList.get(Math.max(arrayList.size() - 1, 0));
        }
        if (z) {
            str.getClass();
            if (str.equals("appeal")) {
                if (!this.f27481j.contains("appeal")) {
                    this.f27481j.add("appeal");
                }
                this.f27474c.setText(TextUtils.equals(yc2.m215118e().m215120b(), "under_review") ? m44551g().getString(R$string.f19446m0) : m44551g().getString(R$string.f19477n0));
            } else if (str.equals("picture_fake") && !this.f27481j.contains("picture_fake")) {
                boolean zContains = this.f27481j.contains("appeal");
                ArrayList<String> arrayList2 = this.f27481j;
                if (zContains) {
                    arrayList2.add(arrayList2.indexOf("appeal"), "picture_fake");
                } else {
                    arrayList2.add("picture_fake");
                }
            }
        } else {
            this.f27481j.remove(str);
        }
        if (this.f27481j.isEmpty()) {
            str3 = "default";
        } else {
            ArrayList<String> arrayList3 = this.f27481j;
            str3 = arrayList3.get(Math.max(arrayList3.size() - 1, 0));
        }
        if (!str2.equals(str3)) {
            str3.getClass();
            switch (str3) {
                case "appeal":
                    if (!this.f27482k.m194972o1()) {
                        sfj0.m185601h("e_my_profile_navigation_appeal_guide", this.f27482k.mo194978v(), sfj0.C20032a.m185615h("ban_user_appeal_state", yc2.m215118e().m215120b()));
                    }
                    bnl0.m105524M(this.f27473b, true);
                    bnl0.m105509E0(this.f27473b, new View.OnClickListener() { // from class: l.m250
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f134498a.m44555k(view);
                        }
                    });
                    break;
                case "picture_fake":
                    if (!this.f27482k.m194972o1()) {
                        i4g0.m138526x("e_picture_fake_button", this.f27482k.mo194978v());
                    }
                    bnl0.m105524M(this.f27473b, true);
                    m44560p();
                    this.f27473b.setOnClickListener(new View.OnClickListener() { // from class: l.n250
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f139813a.m44556l(view);
                        }
                    });
                    break;
                case "default":
                    bnl0.m105524M(this.f27473b, false);
                    break;
            }
        } else if (TextUtils.equals(str3, "picture_fake")) {
            m44560p();
        }
        m44561q(false);
        m44564t();
    }

    /* JADX INFO: renamed from: t */
    public final void m44564t() {
        boolean z = bnl0.m105529O0(this.f27473b) || bnl0.m105529O0(this.f27475d) || bnl0.m105529O0(this.f27477f) || bnl0.m105529O0(this.f27480i);
        bnl0.m105524M(this.f27472a, z);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f27472a.getLayoutParams();
        if (z) {
            layoutParams.height = qa00.m175859d(38.0f);
            layoutParams.topMargin = qa00.m175859d(8.0f);
        } else {
            layoutParams.height = 0;
            layoutParams.topMargin = 0;
        }
        this.f27472a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public void m44565u(pf60<AppealInfo, User> pf60Var) {
        AppealInfo appealInfo = pf60Var.f152156a;
        User user = pf60Var.f152157b;
        if (NullChecker.m82486a(user)) {
            boolean z = user.status.contains(UserStatus.get(UserStatus.audit)) && !user.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL)) && NullChecker.m82486a(appealInfo) && !appealInfo.needAppeal;
            bnl0.m105524M(this.f27475d, z);
            if (gra.m131778z() && z) {
                this.f27476e.setTextSize(12.0f);
                this.f27476e.setTextColor(getResources().getColor(c9c0.f80469x));
                this.f27476e.setCompoundDrawablePadding(qa00.f156316c);
                this.f27476e.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87186lh, 0, 0, 0);
            }
        }
        m44561q(false);
        m44564t();
    }

    public NotifyHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27481j = jyb.m147482M("default");
        this.f27483l = 0;
    }

    public NotifyHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27481j = jyb.m147482M("default");
        this.f27483l = 0;
    }
}
