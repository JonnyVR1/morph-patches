package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.FakeGuideData;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VCard;
import p147v.VText;
import p149l.e51;
import p149l.eqh0;
import p149l.fu40;
import p149l.j760;
import p149l.m020;
import p149l.o6j0;
import p149l.rc2;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.vwb;
import p149l.w0c0;
import p149l.w1g;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class NotifyHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f26624a;

    /* JADX INFO: renamed from: b */
    public VCard f26625b;

    /* JADX INFO: renamed from: c */
    public VText f26626c;

    /* JADX INFO: renamed from: d */
    public CardView f26627d;

    /* JADX INFO: renamed from: e */
    public VText f26628e;

    /* JADX INFO: renamed from: f */
    public CardView f26629f;

    /* JADX INFO: renamed from: g */
    public VText f26630g;

    /* JADX INFO: renamed from: h */
    public VText f26631h;

    /* JADX INFO: renamed from: i */
    public ViewStub f26632i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<String> f26633j;

    /* JADX INFO: renamed from: k */
    public m020 f26634k;

    /* JADX INFO: renamed from: l */
    public int f26635l;

    public NotifyHeaderView(@NonNull Context context) {
        super(context);
        this.f26633j = vwb.m200299M("default");
        this.f26635l = 0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m43362d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m43363e(View view) {
    }

    /* JADX INFO: renamed from: f */
    public final void m43364f(View view) {
        fu40.m123135a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final Act m43365g() {
        return (Act) xdl0.m208328E(this);
    }

    /* JADX INFO: renamed from: h */
    public void m43366h(m020 m020Var) {
        this.f26634k = m020Var;
    }

    /* JADX INFO: renamed from: i */
    public void m43367i() {
        this.f26626c.setTypeface(Typeface.create(eqh0.m117752c(3), 0));
        this.f26628e.setTypeface(Typeface.create(eqh0.m117752c(3), 0));
        xdl0.m208329E0(this.f26627d, new View.OnClickListener() { // from class: l.ut40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyHeaderView.m43363e(view);
            }
        });
        xdl0.m208329E0(this.f26629f, new View.OnClickListener() { // from class: l.vt40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyHeaderView.m43362d(view);
            }
        });
        xdl0.m208344M(this.f26629f, false);
        if (upa.m194847z()) {
            FrameLayout frameLayout = this.f26624a;
            int i = t100.f167260i;
            xdl0.m208358V(frameLayout, i);
            xdl0.m208359W(this.f26624a, i);
            xdl0.m208325C0(this.f26624a, t100.f167275x);
            this.f26625b.setCardBackgroundColor(Color.parseColor("#08000000"));
            this.f26627d.setCardBackgroundColor(Color.parseColor("#08000000"));
            this.f26629f.setCardBackgroundColor(Color.parseColor("#08000000"));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m43368j() {
        int i;
        if (!xdl0.m208349O0(this.f26629f) || (i = this.f26635l) == 0) {
            return;
        }
        if (i == 1) {
            o6j0.m162864h("e_navigation_edit_profile_guidance", this.f26634k.pageId(), o6j0.C18854a.m162878h("navigation_edit_profile_guidance_name", ReminderAction.photo));
        } else if (i == 2) {
            o6j0.m162864h("e_navigation_edit_profile_guidance", this.f26634k.pageId(), o6j0.C18854a.m162878h("navigation_edit_profile_guidance_name", "self_introduction"));
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m43369k(View view) {
        this.f26634k.m152463I1();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m43370l(View view) {
        this.f26634k.m152464J1();
    }

    /* JADX INFO: renamed from: m */
    public void m43371m() {
        if (upa.m194745e2() && CoreModule.f17545c.f19639e0.m169468a8() && NullChecker.m81303a(this.f26629f)) {
            xdl0.m208344M(this.f26629f, false);
            m43378t();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m43372n(FakeGuideData fakeGuideData) {
        if (xdl0.m208349O0(this.f26627d) || xdl0.m208349O0(this.f26625b)) {
            xdl0.m208344M(this.f26632i, false);
            return;
        }
        if (fakeGuideData == null || !fakeGuideData.changeAvatar || !"mainAvatar".equals(fakeGuideData.type) || xdl0.m208349O0(this.f26632i)) {
            return;
        }
        xdl0.m208344M(this.f26632i, true);
        if (upa.m194847z()) {
            ((CardView) this.f26632i.findViewById(u4c0.f174040T0)).setCardBackgroundColor(Color.parseColor("#08000000"));
        }
        m43375q(false);
        m43378t();
    }

    /* JADX INFO: renamed from: o */
    public void m43373o() {
        e51.m114743H(m43365g(), new Runnable() { // from class: l.wt40
            @Override // java.lang.Runnable
            public final void run() {
                this.f187995a.m43368j();
            }
        }, 1000L);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43364f(this);
        m43367i();
    }

    /* JADX INFO: renamed from: p */
    public final void m43374p() {
        String string = m43365g().getString(R$string.f18993v4);
        if (w1g.m200928a()) {
            string = CoreModule.m29936Q().mo67285sj();
        }
        this.f26626c.setText(string);
    }

    /* JADX INFO: renamed from: q */
    public final void m43375q(boolean z) {
        if (!upa.m194745e2() || !TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode)) {
            this.f26635l = 0;
        } else {
            xdl0.m208344M(this.f26629f, false);
            m43378t();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m43376r() {
        if (xdl0.m208349O0(this.f26627d) || xdl0.m208349O0(this.f26625b)) {
            xdl0.m208344M(this.f26632i, false);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m43377s(boolean z, String str) {
        String str2;
        String str3;
        if (upa.m194847z() && z) {
            this.f26626c.setTextColor(getResources().getColor(w0c0.f183899x));
            this.f26626c.setTextSize(12.0f);
            this.f26626c.setCompoundDrawablePadding(t100.f167254c);
            this.f26626c.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189486Kg, 0, 0, 0);
        }
        if (this.f26633j.isEmpty()) {
            str2 = "default";
        } else {
            ArrayList<String> arrayList = this.f26633j;
            str2 = arrayList.get(Math.max(arrayList.size() - 1, 0));
        }
        if (z) {
            str.getClass();
            if (str.equals("appeal")) {
                if (!this.f26633j.contains("appeal")) {
                    this.f26633j.add("appeal");
                }
                this.f26626c.setText(TextUtils.equals(rc2.m178723e().m178725b(), "under_review") ? m43365g().getString(R$string.f18716m0) : m43365g().getString(R$string.f18747n0));
            } else if (str.equals("picture_fake") && !this.f26633j.contains("picture_fake")) {
                boolean zContains = this.f26633j.contains("appeal");
                ArrayList<String> arrayList2 = this.f26633j;
                if (zContains) {
                    arrayList2.add(arrayList2.indexOf("appeal"), "picture_fake");
                } else {
                    arrayList2.add("picture_fake");
                }
            }
        } else {
            this.f26633j.remove(str);
        }
        if (this.f26633j.isEmpty()) {
            str3 = "default";
        } else {
            ArrayList<String> arrayList3 = this.f26633j;
            str3 = arrayList3.get(Math.max(arrayList3.size() - 1, 0));
        }
        if (!str2.equals(str3)) {
            str3.getClass();
            switch (str3) {
                case "appeal":
                    if (!this.f26634k.m152474o1()) {
                        o6j0.m162864h("e_my_profile_navigation_appeal_guide", this.f26634k.mo152480v(), o6j0.C18854a.m162878h("ban_user_appeal_state", rc2.m178723e().m178725b()));
                    }
                    xdl0.m208344M(this.f26625b, true);
                    xdl0.m208329E0(this.f26625b, new View.OnClickListener() { // from class: l.xt40
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f194351a.m43369k(view);
                        }
                    });
                    break;
                case "picture_fake":
                    if (!this.f26634k.m152474o1()) {
                        zvf0.m220402x("e_picture_fake_button", this.f26634k.mo152480v());
                    }
                    xdl0.m208344M(this.f26625b, true);
                    m43374p();
                    this.f26625b.setOnClickListener(new View.OnClickListener() { // from class: l.yt40
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f199887a.m43370l(view);
                        }
                    });
                    break;
                case "default":
                    xdl0.m208344M(this.f26625b, false);
                    break;
            }
        } else if (TextUtils.equals(str3, "picture_fake")) {
            m43374p();
        }
        m43375q(false);
        m43378t();
    }

    /* JADX INFO: renamed from: t */
    public final void m43378t() {
        boolean z = xdl0.m208349O0(this.f26625b) || xdl0.m208349O0(this.f26627d) || xdl0.m208349O0(this.f26629f) || xdl0.m208349O0(this.f26632i);
        xdl0.m208344M(this.f26624a, z);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26624a.getLayoutParams();
        if (z) {
            layoutParams.height = t100.m186890d(38.0f);
            layoutParams.topMargin = t100.m186890d(8.0f);
        } else {
            layoutParams.height = 0;
            layoutParams.topMargin = 0;
        }
        this.f26624a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public void m43379u(j760<AppealInfo, User> j760Var) {
        AppealInfo appealInfo = j760Var.f116564a;
        User user = j760Var.f116565b;
        if (NullChecker.m81303a(user)) {
            boolean z = user.status.contains(UserStatus.get(UserStatus.audit)) && !user.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL)) && NullChecker.m81303a(appealInfo) && !appealInfo.needAppeal;
            xdl0.m208344M(this.f26627d, z);
            if (upa.m194847z() && z) {
                this.f26628e.setTextSize(12.0f);
                this.f26628e.setTextColor(getResources().getColor(w0c0.f183899x));
                this.f26628e.setCompoundDrawablePadding(t100.f167254c);
                this.f26628e.setCompoundDrawablesWithIntrinsicBounds(x2c0.f190715xg, 0, 0, 0);
            }
        }
        m43375q(false);
        m43378t();
    }

    public NotifyHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26633j = vwb.m200299M("default");
        this.f26635l = 0;
    }

    public NotifyHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26633j = vwb.m200299M("default");
        this.f26635l = 0;
    }
}
