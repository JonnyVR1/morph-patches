package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p147v.VLinear;
import p147v.VText;
import p149l.e3c0;
import p149l.e51;
import p149l.m9b;
import p149l.mqi0;
import p149l.qib0;
import p149l.s7m;
import p149l.tzb0;
import p149l.vea0;
import p149l.xdl0;
import p149l.xea0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8683b implements s7m<vea0> {

    /* JADX INFO: renamed from: a */
    public TextView f33552a;

    /* JADX INFO: renamed from: b */
    public VLinear f33553b;

    /* JADX INFO: renamed from: c */
    public DateEditTextNew f33554c;

    /* JADX INFO: renamed from: d */
    public DateEditTextNew f33555d;

    /* JADX INFO: renamed from: e */
    public DateEditTextNew f33556e;

    /* JADX INFO: renamed from: f */
    public VText f33557f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopActionLayout f33558g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f33559h;

    /* JADX INFO: renamed from: i */
    public vea0 f33560i;

    /* JADX INFO: renamed from: j */
    public Context f33561j;

    /* JADX INFO: renamed from: k */
    public ProfileLoopBirthdayFrag f33562k;

    /* JADX INFO: renamed from: l */
    public LoopInputType f33563l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b$a */
    public class a implements DateEditTextNew.InterfaceC8676d {

        /* JADX INFO: renamed from: a */
        public int f33564a;

        public a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: a */
        public void mo51275a(int i) {
            C8683b.this.m51719y();
            if (i != this.f33564a) {
                xdl0.m208345M0(C8683b.this.f33557f, false);
            }
            this.f33564a = i;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: b */
        public void mo51276b(int i) {
            C8683b.this.f33555d.requestFocus();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: c */
        public void mo51277c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: d */
        public void mo51278d(int i) {
            C8683b.this.m51717w(i);
            C8683b.this.m51715i();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b$b */
    public class b implements DateEditTextNew.InterfaceC8676d {

        /* JADX INFO: renamed from: a */
        public int f33566a;

        public b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: a */
        public void mo51275a(int i) {
            C8683b.this.m51719y();
            if (i != this.f33566a) {
                xdl0.m208345M0(C8683b.this.f33557f, false);
            }
            this.f33566a = i;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: b */
        public void mo51276b(int i) {
            C8683b.this.f33556e.requestFocus();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: c */
        public void mo51277c() {
            C8683b c8683b = C8683b.this;
            c8683b.m51718x(c8683b.f33554c);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: d */
        public void mo51278d(int i) {
            C8683b.this.m51717w(i);
            C8683b.this.m51715i();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b$c */
    public class c implements DateEditTextNew.InterfaceC8676d {

        /* JADX INFO: renamed from: a */
        public int f33568a;

        public c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: a */
        public void mo51275a(int i) {
            C8683b.this.m51719y();
            if (i != this.f33568a) {
                xdl0.m208345M0(C8683b.this.f33557f, false);
            }
            this.f33568a = i;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: b */
        public void mo51276b(int i) {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: c */
        public void mo51277c() {
            C8683b c8683b = C8683b.this;
            c8683b.m51718x(c8683b.f33555d);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: d */
        public void mo51278d(int i) {
            C8683b.this.m51717w(i);
            C8683b.this.m51715i();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public C8683b(Context context, ProfileLoopBirthdayFrag profileLoopBirthdayFrag) {
        this.f33561j = context;
        this.f33562k = profileLoopBirthdayFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m51715i() {
        this.f33557f.startAnimation(AnimationUtils.loadAnimation(this.f33562k.act(), tzb0.f172714a));
    }

    /* JADX INFO: renamed from: r */
    private void m51716r() {
        this.f33558g.m52969l(this.f33562k);
        m51727q().m51509a2().m51548W0(this.f33562k);
        this.f33559h.setOnClickListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m51717w(int i) {
        if (i == 1) {
            this.f33557f.setText(act().getString(R$string.f27684A3));
        } else if (i == 6) {
            this.f33557f.setText(act().getString(R$string.f27828c0));
        } else if (i == 2 || i == 3) {
            this.f33557f.setText(act().getString(R$string.f27719G3));
        } else if (i == 4) {
            this.f33557f.setText(act().getString(R$string.f27696C3));
        } else if (i == 5) {
            this.f33557f.setText(act().getString(R$string.f27690B3));
        }
        this.f33557f.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m51718x(DateEditTextNew dateEditTextNew) {
        Editable text = dateEditTextNew.getText();
        if (NullChecker.m81303a(text)) {
            if (text.length() == 1) {
                dateEditTextNew.setText("");
            } else if (text.length() > 1) {
                dateEditTextNew.setText(text.subSequence(0, text.length() - 1));
            }
        }
        dateEditTextNew.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m51719y() {
        if (this.f33554c.m51633p() && this.f33555d.m51633p() && this.f33556e.m51633p()) {
            this.f33558g.f34163b.setEnabled(true);
            this.f33558g.f34163b.setClickable(true);
            this.f33558g.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89103f));
        } else {
            this.f33558g.f34163b.setEnabled(false);
            this.f33558g.f34163b.setClickable(false);
            this.f33558g.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89143r1));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f33561j;
    }

    @Override // p149l.s7m
    public void destroy() {
        DateEditTextNew.m51624o(-1, 0, -1);
    }

    /* JADX INFO: renamed from: f */
    public View m51720f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xea0.m208524b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM51720f = m51720f(layoutInflater, viewGroup);
        m51716r();
        return viewM51720f;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(vea0 vea0Var) {
        this.f33560i = vea0Var;
    }

    /* JADX INFO: renamed from: k */
    public boolean m51722k() {
        vea0 vea0Var = this.f33560i;
        if (vea0Var.f181166b) {
            return true;
        }
        vea0Var.m198162i0();
        xdl0.m208344M(this.f33559h, true);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void m51723l(User user) {
        user.settings.birthdate = Double.valueOf(m51725n().getTimeInMillis());
    }

    /* JADX INFO: renamed from: m */
    public void m51724m() {
        this.f33562k.mo51586H();
    }

    /* JADX INFO: renamed from: n */
    public Calendar m51725n() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m155944o());
        calendar.set(1, this.f33554c.getFinalNum());
        calendar.set(2, this.f33555d.getFinalNum() - 1);
        calendar.set(5, this.f33556e.getFinalNum());
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: renamed from: p */
    public Bundle m51726p() {
        return this.f33562k.getArguments();
    }

    /* JADX INFO: renamed from: q */
    public ProfileInfoLoopEditAct m51727q() {
        return (ProfileInfoLoopEditAct) this.f33561j;
    }

    /* JADX INFO: renamed from: s */
    public void m51728s() {
        xdl0.m208344M(this.f33559h, false);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m51729u() {
        this.f33554c.requestFocus();
        this.f33562k.act().showInput(this.f33554c, 0);
    }

    /* JADX INFO: renamed from: v */
    public void m51730v(LoopInputType loopInputType) {
        User userM51559u0 = m51727q().m51509a2().m51559u0();
        this.f33563l = loopInputType;
        boolean zMo33921sn = CoreModule.f17557o.m195057d().mo33921sn();
        if (userM51559u0.age.intValue() >= 23 && !zMo33921sn) {
            this.f33554c.setNormalAge(23);
            this.f33555d.setNormalAge(23);
            this.f33556e.setNormalAge(23);
        }
        String str = mqi0.f135259k.format(userM51559u0.settings.birthdate);
        String str2 = new SimpleDateFormat("MM", Locale.getDefault()).format(userM51559u0.settings.birthdate);
        String str3 = mqi0.f135263o.format(userM51559u0.settings.birthdate);
        this.f33555d.setText(str2);
        this.f33556e.setText(str3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, Integer.parseInt(str));
        calendar.set(2, Integer.parseInt(str2));
        calendar.set(5, Integer.parseInt(str3));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(qib0.f154693H.guessedCurrentServerTime());
        int iM153611O = m9b.m153611O(calendar, calendar2);
        if (iM153611O < 100 || (iM153611O == 100 && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5))) {
            this.f33554c.setText(str);
            DateEditTextNew.m51624o(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
        } else {
            this.f33554c.setText("");
            this.f33555d.setText("");
            this.f33556e.setText("");
            DateEditTextNew.m51624o(-1, 0, -1);
        }
        m51719y();
        e51.m114744I(this.f33562k, new Runnable() { // from class: l.wea0
            @Override // java.lang.Runnable
            public final void run() {
                this.f185918a.m51729u();
            }
        }, 300L);
        this.f33554c.setTextChangedListener(new a());
        this.f33555d.setTextChangedListener(new b());
        this.f33556e.setTextChangedListener(new c());
    }
}
