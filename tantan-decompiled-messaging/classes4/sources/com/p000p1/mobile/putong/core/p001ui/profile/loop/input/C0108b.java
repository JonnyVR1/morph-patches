package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

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
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import l.e3c0;
import l.e51;
import l.m9b;
import l.mqi0;
import l.qib0;
import l.s7m;
import l.tzb0;
import l.xdl0;
import l.xea0;
import p002l.vea0;
import v.VLinear;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0108b implements s7m<vea0> {

    /* JADX INFO: renamed from: a */
    public TextView f1374a;

    /* JADX INFO: renamed from: b */
    public VLinear f1375b;

    /* JADX INFO: renamed from: c */
    public DateEditTextNew f1376c;

    /* JADX INFO: renamed from: d */
    public DateEditTextNew f1377d;

    /* JADX INFO: renamed from: e */
    public DateEditTextNew f1378e;

    /* JADX INFO: renamed from: f */
    public VText f1379f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopActionLayout f1380g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f1381h;

    /* JADX INFO: renamed from: i */
    public vea0 f1382i;

    /* JADX INFO: renamed from: j */
    public Context f1383j;

    /* JADX INFO: renamed from: k */
    public ProfileLoopBirthdayFrag f1384k;

    /* JADX INFO: renamed from: l */
    public LoopInputType f1385l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b$a */
    public class a implements DateEditTextNew.InterfaceC0101d {

        /* JADX INFO: renamed from: a */
        public int f1386a;

        public a() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: a */
        public void mo1733a(int i) {
            C0108b.this.m2241y();
            if (i != this.f1386a) {
                xdl0.M0(C0108b.this.f1379f, false);
            }
            this.f1386a = i;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: b */
        public void mo1734b(int i) {
            C0108b.this.f1377d.requestFocus();
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: c */
        public void mo1735c() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: d */
        public void mo1736d(int i) {
            C0108b.this.m2239w(i);
            C0108b.this.m2237i();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b$b */
    public class b implements DateEditTextNew.InterfaceC0101d {

        /* JADX INFO: renamed from: a */
        public int f1388a;

        public b() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: a */
        public void mo1733a(int i) {
            C0108b.this.m2241y();
            if (i != this.f1388a) {
                xdl0.M0(C0108b.this.f1379f, false);
            }
            this.f1388a = i;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: b */
        public void mo1734b(int i) {
            C0108b.this.f1378e.requestFocus();
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: c */
        public void mo1735c() {
            C0108b c0108b = C0108b.this;
            c0108b.m2240x(c0108b.f1376c);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: d */
        public void mo1736d(int i) {
            C0108b.this.m2239w(i);
            C0108b.this.m2237i();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b$c */
    public class c implements DateEditTextNew.InterfaceC0101d {

        /* JADX INFO: renamed from: a */
        public int f1390a;

        public c() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: a */
        public void mo1733a(int i) {
            C0108b.this.m2241y();
            if (i != this.f1390a) {
                xdl0.M0(C0108b.this.f1379f, false);
            }
            this.f1390a = i;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: b */
        public void mo1734b(int i) {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: c */
        public void mo1735c() {
            C0108b c0108b = C0108b.this;
            c0108b.m2240x(c0108b.f1377d);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: d */
        public void mo1736d(int i) {
            C0108b.this.m2239w(i);
            C0108b.this.m2237i();
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

    public C0108b(Context context, ProfileLoopBirthdayFrag profileLoopBirthdayFrag) {
        this.f1383j = context;
        this.f1384k = profileLoopBirthdayFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m2237i() {
        this.f1379f.startAnimation(AnimationUtils.loadAnimation(this.f1384k.act(), tzb0.a));
    }

    /* JADX INFO: renamed from: r */
    private void m2238r() {
        this.f1380g.m3527l(this.f1384k);
        m2251q().m1991a2().m2030W0(this.f1384k);
        this.f1381h.setOnClickListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m2239w(int i) {
        if (i == 1) {
            this.f1379f.setText(act().getString(R.string.A3));
        } else if (i == 6) {
            this.f1379f.setText(act().getString(R.string.c0));
        } else if (i == 2 || i == 3) {
            this.f1379f.setText(act().getString(R.string.G3));
        } else if (i == 4) {
            this.f1379f.setText(act().getString(R.string.C3));
        } else if (i == 5) {
            this.f1379f.setText(act().getString(R.string.B3));
        }
        this.f1379f.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public void m2240x(DateEditTextNew dateEditTextNew) {
        Editable text = dateEditTextNew.getText();
        if (NullChecker.a(text)) {
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
    public void m2241y() {
        if (this.f1376c.m2124p() && this.f1377d.m2124p() && this.f1378e.m2124p()) {
            this.f1380g.f1985b.setEnabled(true);
            this.f1380g.f1985b.setClickable(true);
            this.f1380g.f1985b.setBackgroundDrawable(act().drawable(e3c0.f));
        } else {
            this.f1380g.f1985b.setEnabled(false);
            this.f1380g.f1985b.setClickable(false);
            this.f1380g.f1985b.setBackgroundDrawable(act().drawable(e3c0.r1));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m2242C0() {
        return this.f1383j;
    }

    public void destroy() {
        DateEditTextNew.m2115o(-1, 0, -1);
    }

    /* JADX INFO: renamed from: f */
    public View m2243f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xea0.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM2243f = m2243f(layoutInflater, viewGroup);
        m2238r();
        return viewM2243f;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m2244i1(vea0 vea0Var) {
        this.f1382i = vea0Var;
    }

    /* JADX INFO: renamed from: k */
    public boolean m2246k() {
        vea0 vea0Var = this.f1382i;
        if (vea0Var.f21096b) {
            return true;
        }
        vea0Var.m23897i0();
        xdl0.M(this.f1381h, true);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void m2247l(User user) {
        user.settings.birthdate = Double.valueOf(m2249n().getTimeInMillis());
    }

    /* JADX INFO: renamed from: m */
    public void m2248m() {
        this.f1384k.mo2072H();
    }

    /* JADX INFO: renamed from: n */
    public Calendar m2249n() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.o());
        calendar.set(1, this.f1376c.getFinalNum());
        calendar.set(2, this.f1377d.getFinalNum() - 1);
        calendar.set(5, this.f1378e.getFinalNum());
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: renamed from: p */
    public Bundle m2250p() {
        return this.f1384k.getArguments();
    }

    /* JADX INFO: renamed from: q */
    public ProfileInfoLoopEditAct m2251q() {
        return (ProfileInfoLoopEditAct) this.f1383j;
    }

    /* JADX INFO: renamed from: s */
    public void m2252s() {
        xdl0.M(this.f1381h, false);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m2253u() {
        this.f1376c.requestFocus();
        this.f1384k.act().showInput(this.f1376c, 0);
    }

    /* JADX INFO: renamed from: v */
    public void m2254v(LoopInputType loopInputType) {
        User userM2043u0 = m2251q().m1991a2().m2043u0();
        this.f1385l = loopInputType;
        boolean zSn = CoreModule.o.d().sn();
        if (userM2043u0.age.intValue() >= 23 && !zSn) {
            this.f1376c.setNormalAge(23);
            this.f1377d.setNormalAge(23);
            this.f1378e.setNormalAge(23);
        }
        String str = mqi0.k.format(userM2043u0.settings.birthdate);
        String str2 = new SimpleDateFormat("MM", Locale.getDefault()).format(userM2043u0.settings.birthdate);
        String str3 = mqi0.o.format(userM2043u0.settings.birthdate);
        this.f1377d.setText(str2);
        this.f1378e.setText(str3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, Integer.parseInt(str));
        calendar.set(2, Integer.parseInt(str2));
        calendar.set(5, Integer.parseInt(str3));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(qib0.H.guessedCurrentServerTime());
        int iO = m9b.O(calendar, calendar2);
        if (iO < 100 || (iO == 100 && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5))) {
            this.f1376c.setText(str);
            DateEditTextNew.m2115o(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
        } else {
            this.f1376c.setText("");
            this.f1377d.setText("");
            this.f1378e.setText("");
            DateEditTextNew.m2115o(-1, 0, -1);
        }
        m2241y();
        e51.I(this.f1384k, new Runnable() { // from class: l.wea0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21667a.m2253u();
            }
        }, 300L);
        this.f1376c.setTextChangedListener(new a());
        this.f1377d.setTextChangedListener(new b());
        this.f1378e.setTextChangedListener(new c());
    }
}
