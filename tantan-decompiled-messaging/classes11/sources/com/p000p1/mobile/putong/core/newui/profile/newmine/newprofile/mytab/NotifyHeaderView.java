package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab;

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
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.data.FakeGuideData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e51;
import l.eqh0;
import l.fu40;
import l.j760;
import l.o6j0;
import l.t100;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.m020;
import p009l.rc2;
import p009l.w1g;
import v.VCard;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NotifyHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5402a;

    /* JADX INFO: renamed from: b */
    public VCard f5403b;

    /* JADX INFO: renamed from: c */
    public VText f5404c;

    /* JADX INFO: renamed from: d */
    public CardView f5405d;

    /* JADX INFO: renamed from: e */
    public VText f5406e;

    /* JADX INFO: renamed from: f */
    public CardView f5407f;

    /* JADX INFO: renamed from: g */
    public VText f5408g;

    /* JADX INFO: renamed from: h */
    public VText f5409h;

    /* JADX INFO: renamed from: i */
    public ViewStub f5410i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<String> f5411j;

    /* JADX INFO: renamed from: k */
    public m020 f5412k;

    /* JADX INFO: renamed from: l */
    public int f5413l;

    public NotifyHeaderView(@NonNull Context context) {
        super(context);
        this.f5411j = vwb.M("default");
        this.f5413l = 0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m7589d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m7590e(View view) {
    }

    /* JADX INFO: renamed from: f */
    public final void m7591f(View view) {
        fu40.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final Act m7592g() {
        return xdl0.E(this);
    }

    /* JADX INFO: renamed from: h */
    public void m7593h(m020 m020Var) {
        this.f5412k = m020Var;
    }

    /* JADX INFO: renamed from: i */
    public void m7594i() {
        this.f5404c.setTypeface(Typeface.create(eqh0.c(3), 0));
        this.f5406e.setTypeface(Typeface.create(eqh0.c(3), 0));
        xdl0.E0(this.f5405d, new View.OnClickListener() { // from class: l.ut40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyHeaderView.m7590e(view);
            }
        });
        xdl0.E0(this.f5407f, new View.OnClickListener() { // from class: l.vt40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyHeaderView.m7589d(view);
            }
        });
        xdl0.M(this.f5407f, false);
        if (upa.z()) {
            FrameLayout frameLayout = this.f5402a;
            int i = t100.i;
            xdl0.V(frameLayout, i);
            xdl0.W(this.f5402a, i);
            xdl0.C0(this.f5402a, t100.x);
            this.f5403b.setCardBackgroundColor(Color.parseColor("#08000000"));
            this.f5405d.setCardBackgroundColor(Color.parseColor("#08000000"));
            this.f5407f.setCardBackgroundColor(Color.parseColor("#08000000"));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7595j() {
        int i;
        if (!xdl0.O0(this.f5407f) || (i = this.f5413l) == 0) {
            return;
        }
        if (i == 1) {
            o6j0.h("e_navigation_edit_profile_guidance", this.f5412k.pageId(), new o6j0.a[]{o6j0.a.h("navigation_edit_profile_guidance_name", "photo")});
        } else if (i == 2) {
            o6j0.h("e_navigation_edit_profile_guidance", this.f5412k.pageId(), new o6j0.a[]{o6j0.a.h("navigation_edit_profile_guidance_name", "self_introduction")});
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7596k(View view) {
        this.f5412k.m18188I1();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m7597l(View view) {
        this.f5412k.m18189J1();
    }

    /* JADX INFO: renamed from: m */
    public void m7598m() {
        if (upa.e2() && CoreModule.c.e0.a8() && NullChecker.a(this.f5407f)) {
            xdl0.M(this.f5407f, false);
            m7605t();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m7599n(FakeGuideData fakeGuideData) {
        if (xdl0.O0(this.f5405d) || xdl0.O0(this.f5403b)) {
            xdl0.M(this.f5410i, false);
            return;
        }
        if (fakeGuideData == null || !fakeGuideData.changeAvatar || !"mainAvatar".equals(fakeGuideData.type) || xdl0.O0(this.f5410i)) {
            return;
        }
        xdl0.M(this.f5410i, true);
        if (upa.z()) {
            this.f5410i.findViewById(u4c0.T0).setCardBackgroundColor(Color.parseColor("#08000000"));
        }
        m7602q(false);
        m7605t();
    }

    /* JADX INFO: renamed from: o */
    public void m7600o() {
        e51.H(m7592g(), new Runnable() { // from class: l.wt40
            @Override // java.lang.Runnable
            public final void run() {
                this.f22308a.m7595j();
            }
        }, 1000L);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7591f(this);
        m7594i();
    }

    /* JADX INFO: renamed from: p */
    public final void m7601p() {
        String string = m7592g().getString(R.string.v4);
        if (w1g.m23770a()) {
            string = CoreModule.Q().m9070sj();
        }
        this.f5404c.setText(string);
    }

    /* JADX INFO: renamed from: q */
    public final void m7602q(boolean z) {
        if (!upa.e2() || !TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode")) {
            this.f5413l = 0;
        } else {
            xdl0.M(this.f5407f, false);
            m7605t();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m7603r() {
        if (xdl0.O0(this.f5405d) || xdl0.O0(this.f5403b)) {
            xdl0.M(this.f5410i, false);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m7604s(boolean z, String str) {
        String str2;
        String str3;
        if (upa.z() && z) {
            this.f5404c.setTextColor(getResources().getColor(w0c0.x));
            this.f5404c.setTextSize(12.0f);
            this.f5404c.setCompoundDrawablePadding(t100.c);
            this.f5404c.setCompoundDrawablesWithIntrinsicBounds(x2c0.Kg, 0, 0, 0);
        }
        if (this.f5411j.isEmpty()) {
            str2 = "default";
        } else {
            ArrayList<String> arrayList = this.f5411j;
            str2 = arrayList.get(Math.max(arrayList.size() - 1, 0));
        }
        if (z) {
            str.getClass();
            if (str.equals("appeal")) {
                if (!this.f5411j.contains("appeal")) {
                    this.f5411j.add("appeal");
                }
                this.f5404c.setText(TextUtils.equals(rc2.m21492e().m21494b(), "under_review") ? m7592g().getString(R.string.m0) : m7592g().getString(R.string.n0));
            } else if (str.equals("picture_fake") && !this.f5411j.contains("picture_fake")) {
                boolean zContains = this.f5411j.contains("appeal");
                ArrayList<String> arrayList2 = this.f5411j;
                if (zContains) {
                    arrayList2.add(arrayList2.indexOf("appeal"), "picture_fake");
                } else {
                    arrayList2.add("picture_fake");
                }
            }
        } else {
            this.f5411j.remove(str);
        }
        if (this.f5411j.isEmpty()) {
            str3 = "default";
        } else {
            ArrayList<String> arrayList3 = this.f5411j;
            str3 = arrayList3.get(Math.max(arrayList3.size() - 1, 0));
        }
        if (!str2.equals(str3)) {
            str3.getClass();
            switch (str3) {
                case "appeal":
                    if (!this.f5412k.m18200o1()) {
                        o6j0.h("e_my_profile_navigation_appeal_guide", this.f5412k.mo18206v(), new o6j0.a[]{o6j0.a.h("ban_user_appeal_state", rc2.m21492e().m21494b())});
                    }
                    xdl0.M(this.f5403b, true);
                    xdl0.E0(this.f5403b, new View.OnClickListener() { // from class: l.xt40
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f22714a.m7596k(view);
                        }
                    });
                    break;
                case "picture_fake":
                    if (!this.f5412k.m18200o1()) {
                        zvf0.x("e_picture_fake_button", this.f5412k.mo18206v());
                    }
                    xdl0.M(this.f5403b, true);
                    m7601p();
                    this.f5403b.setOnClickListener(new View.OnClickListener() { // from class: l.yt40
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f23225a.m7597l(view);
                        }
                    });
                    break;
                case "default":
                    xdl0.M(this.f5403b, false);
                    break;
            }
        } else if (TextUtils.equals(str3, "picture_fake")) {
            m7601p();
        }
        m7602q(false);
        m7605t();
    }

    /* JADX INFO: renamed from: t */
    public final void m7605t() {
        boolean z = xdl0.O0(this.f5403b) || xdl0.O0(this.f5405d) || xdl0.O0(this.f5407f) || xdl0.O0(this.f5410i);
        xdl0.M(this.f5402a, z);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5402a.getLayoutParams();
        if (z) {
            layoutParams.height = t100.d(38.0f);
            layoutParams.topMargin = t100.d(8.0f);
        } else {
            layoutParams.height = 0;
            layoutParams.topMargin = 0;
        }
        this.f5402a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public void m7606u(j760<AppealInfo, User> j760Var) {
        AppealInfo appealInfo = (AppealInfo) j760Var.a;
        User user = (User) j760Var.b;
        if (NullChecker.a(user)) {
            boolean z = user.status.contains(UserStatus.get("audit")) && !user.status.contains(UserStatus.get("RISK_TAG_UNREAL")) && NullChecker.a(appealInfo) && !appealInfo.needAppeal;
            xdl0.M(this.f5405d, z);
            if (upa.z() && z) {
                this.f5406e.setTextSize(12.0f);
                this.f5406e.setTextColor(getResources().getColor(w0c0.x));
                this.f5406e.setCompoundDrawablePadding(t100.c);
                this.f5406e.setCompoundDrawablesWithIntrinsicBounds(x2c0.xg, 0, 0, 0);
            }
        }
        m7602q(false);
        m7605t();
    }

    public NotifyHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5411j = vwb.M("default");
        this.f5413l = 0;
    }

    public NotifyHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5411j = vwb.M("default");
        this.f5413l = 0;
    }
}
