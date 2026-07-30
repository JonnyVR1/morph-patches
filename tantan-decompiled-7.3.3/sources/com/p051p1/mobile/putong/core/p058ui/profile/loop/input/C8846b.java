package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p151v.VLinear;
import p151v.VText;
import p153l.bna0;
import p153l.bnl0;
import p153l.iam;
import p153l.kbc0;
import p153l.l51;
import p153l.pzi0;
import p153l.uqb0;
import p153l.z7c0;
import p153l.zab;
import p153l.zma0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8846b implements iam<zma0> {

    /* JADX INFO: renamed from: a */
    public TextView f34400a;

    /* JADX INFO: renamed from: b */
    public VLinear f34401b;

    /* JADX INFO: renamed from: c */
    public DateEditTextNew f34402c;

    /* JADX INFO: renamed from: d */
    public DateEditTextNew f34403d;

    /* JADX INFO: renamed from: e */
    public DateEditTextNew f34404e;

    /* JADX INFO: renamed from: f */
    public VText f34405f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopActionLayout f34406g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f34407h;

    /* JADX INFO: renamed from: i */
    public zma0 f34408i;

    /* JADX INFO: renamed from: j */
    public Context f34409j;

    /* JADX INFO: renamed from: k */
    public ProfileLoopBirthdayFrag f34410k;

    /* JADX INFO: renamed from: l */
    public LoopInputType f34411l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b$a */
    public class a implements DateEditTextNew.InterfaceC8839d {

        /* JADX INFO: renamed from: a */
        public int f34412a;

        public a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: a */
        public void mo52458a(int i) {
            C8846b.this.m52902y();
            if (i != this.f34412a) {
                bnl0.m105525M0(C8846b.this.f34405f, false);
            }
            this.f34412a = i;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: b */
        public void mo52459b(int i) {
            C8846b.this.f34403d.requestFocus();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: c */
        public void mo52460c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: d */
        public void mo52461d(int i) {
            C8846b.this.m52900w(i);
            C8846b.this.m52898i();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b$b */
    public class b implements DateEditTextNew.InterfaceC8839d {

        /* JADX INFO: renamed from: a */
        public int f34414a;

        public b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: a */
        public void mo52458a(int i) {
            C8846b.this.m52902y();
            if (i != this.f34414a) {
                bnl0.m105525M0(C8846b.this.f34405f, false);
            }
            this.f34414a = i;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: b */
        public void mo52459b(int i) {
            C8846b.this.f34404e.requestFocus();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: c */
        public void mo52460c() {
            C8846b c8846b = C8846b.this;
            c8846b.m52901x(c8846b.f34402c);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: d */
        public void mo52461d(int i) {
            C8846b.this.m52900w(i);
            C8846b.this.m52898i();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.b$c */
    public class c implements DateEditTextNew.InterfaceC8839d {

        /* JADX INFO: renamed from: a */
        public int f34416a;

        public c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: a */
        public void mo52458a(int i) {
            C8846b.this.m52902y();
            if (i != this.f34416a) {
                bnl0.m105525M0(C8846b.this.f34405f, false);
            }
            this.f34416a = i;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: b */
        public void mo52459b(int i) {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: c */
        public void mo52460c() {
            C8846b c8846b = C8846b.this;
            c8846b.m52901x(c8846b.f34403d);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: d */
        public void mo52461d(int i) {
            C8846b.this.m52900w(i);
            C8846b.this.m52898i();
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

    public C8846b(Context context, ProfileLoopBirthdayFrag profileLoopBirthdayFrag) {
        this.f34409j = context;
        this.f34410k = profileLoopBirthdayFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m52898i() {
        this.f34405f.startAnimation(AnimationUtils.loadAnimation(this.f34410k.act(), z7c0.f203232a));
    }

    /* JADX INFO: renamed from: r */
    private void m52899r() {
        this.f34406g.m54152l(this.f34410k);
        m52910q().m52692b2().m52731W0(this.f34410k);
        this.f34407h.setOnClickListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m52900w(int i) {
        if (i == 1) {
            this.f34405f.setText(act().getString(R$string.f28532A3));
        } else if (i == 6) {
            this.f34405f.setText(act().getString(R$string.f28676c0));
        } else if (i == 2 || i == 3) {
            this.f34405f.setText(act().getString(R$string.f28567G3));
        } else if (i == 4) {
            this.f34405f.setText(act().getString(R$string.f28544C3));
        } else if (i == 5) {
            this.f34405f.setText(act().getString(R$string.f28538B3));
        }
        this.f34405f.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m52901x(DateEditTextNew dateEditTextNew) {
        Editable text = dateEditTextNew.getText();
        if (NullChecker.m82486a(text)) {
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
    public void m52902y() {
        if (this.f34402c.m52816p() && this.f34403d.m52816p() && this.f34404e.m52816p()) {
            this.f34406g.f35011b.setEnabled(true);
            this.f34406g.f35011b.setClickable(true);
            this.f34406g.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124866f));
        } else {
            this.f34406g.f35011b.setEnabled(false);
            this.f34406g.f35011b.setClickable(false);
            this.f34406g.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124906r1));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f34409j;
    }

    @Override // p153l.iam
    public void destroy() {
        DateEditTextNew.m52807o(-1, 0, -1);
    }

    /* JADX INFO: renamed from: f */
    public View m52903f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bna0.m105370b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM52903f = m52903f(layoutInflater, viewGroup);
        m52899r();
        return viewM52903f;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zma0 zma0Var) {
        this.f34408i = zma0Var;
    }

    /* JADX INFO: renamed from: k */
    public boolean m52905k() {
        zma0 zma0Var = this.f34408i;
        if (zma0Var.f205053b) {
            return true;
        }
        zma0Var.m220375i0();
        bnl0.m105524M(this.f34407h, true);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void m52906l(User user) {
        user.settings.birthdate = Double.valueOf(m52908n().getTimeInMillis());
    }

    /* JADX INFO: renamed from: m */
    public void m52907m() {
        this.f34410k.mo52769H();
    }

    /* JADX INFO: renamed from: n */
    public Calendar m52908n() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
        calendar.set(1, this.f34402c.getFinalNum());
        calendar.set(2, this.f34403d.getFinalNum() - 1);
        calendar.set(5, this.f34404e.getFinalNum());
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: renamed from: p */
    public Bundle m52909p() {
        return this.f34410k.getArguments();
    }

    /* JADX INFO: renamed from: q */
    public ProfileInfoLoopEditAct m52910q() {
        return (ProfileInfoLoopEditAct) this.f34409j;
    }

    /* JADX INFO: renamed from: s */
    public void m52911s() {
        bnl0.m105524M(this.f34407h, false);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m52912u() {
        this.f34402c.requestFocus();
        this.f34410k.act().showInput(this.f34402c, 0);
    }

    /* JADX INFO: renamed from: v */
    public void m52913v(LoopInputType loopInputType) {
        User userM52742u0 = m52910q().m52692b2().m52742u0();
        this.f34411l = loopInputType;
        boolean zMo34924sn = CoreModule.f18276o.m132214d().mo34924sn();
        if (userM52742u0.age.intValue() >= 23 && !zMo34924sn) {
            this.f34402c.setNormalAge(23);
            this.f34403d.setNormalAge(23);
            this.f34404e.setNormalAge(23);
        }
        String str = pzi0.f154864k.format(userM52742u0.settings.birthdate);
        String str2 = new SimpleDateFormat("MM", Locale.getDefault()).format(userM52742u0.settings.birthdate);
        String str3 = pzi0.f154868o.format(userM52742u0.settings.birthdate);
        this.f34403d.setText(str2);
        this.f34404e.setText(str3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, Integer.parseInt(str));
        calendar.set(2, Integer.parseInt(str2));
        calendar.set(5, Integer.parseInt(str3));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(uqb0.f180376H.guessedCurrentServerTime());
        int iM219111O = zab.m219111O(calendar, calendar2);
        if (iM219111O < 100 || (iM219111O == 100 && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5))) {
            this.f34402c.setText(str);
            DateEditTextNew.m52807o(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
        } else {
            this.f34402c.setText("");
            this.f34403d.setText("");
            this.f34404e.setText("");
            DateEditTextNew.m52807o(-1, 0, -1);
        }
        m52902y();
        l51.m152889I(this.f34410k, new Runnable() { // from class: l.ana0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72332a.m52912u();
            }
        }, 300L);
        this.f34402c.setTextChangedListener(new a());
        this.f34403d.setTextChangedListener(new b());
        this.f34404e.setTextChangedListener(new c());
    }
}
