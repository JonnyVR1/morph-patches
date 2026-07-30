package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.f6c0;
import p149l.m9b;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qib0;
import p149l.roj0;
import p149l.rzb0;
import p149l.u4c0;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomBirthdayTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public DateEditTextNew f33285F;

    /* JADX INFO: renamed from: G */
    public DateEditTextNew f33286G;

    /* JADX INFO: renamed from: H */
    public DateEditTextNew f33287H;

    /* JADX INFO: renamed from: I */
    public VText f33288I;

    /* JADX INFO: renamed from: J */
    public boolean f33289J = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomBirthdayTypeFrag$a */
    public class C8641a implements DateEditTextNew.InterfaceC8676d {

        /* JADX INFO: renamed from: a */
        public int f33290a;

        public C8641a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: a */
        public void mo51275a(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m51270o5();
            if (i != this.f33290a) {
                xdl0.m208345M0(ExpProfileLoopCustomBirthdayTypeFrag.this.f33288I, false);
            }
            this.f33290a = i;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: b */
        public void mo51276b(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.f33286G.requestFocus();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: c */
        public void mo51277c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: d */
        public void mo51278d(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m51268m5(i);
            ExpProfileLoopCustomBirthdayTypeFrag.this.m51263d5();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomBirthdayTypeFrag$b */
    public class C8642b implements DateEditTextNew.InterfaceC8676d {

        /* JADX INFO: renamed from: a */
        public int f33292a;

        public C8642b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: a */
        public void mo51275a(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m51270o5();
            if (i != this.f33292a) {
                xdl0.m208345M0(ExpProfileLoopCustomBirthdayTypeFrag.this.f33288I, false);
            }
            this.f33292a = i;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: b */
        public void mo51276b(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.f33287H.requestFocus();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: c */
        public void mo51277c() {
            ExpProfileLoopCustomBirthdayTypeFrag expProfileLoopCustomBirthdayTypeFrag = ExpProfileLoopCustomBirthdayTypeFrag.this;
            expProfileLoopCustomBirthdayTypeFrag.m51269n5(expProfileLoopCustomBirthdayTypeFrag.f33285F);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: d */
        public void mo51278d(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m51268m5(i);
            ExpProfileLoopCustomBirthdayTypeFrag.this.m51263d5();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomBirthdayTypeFrag$c */
    public class C8643c implements DateEditTextNew.InterfaceC8676d {

        /* JADX INFO: renamed from: a */
        public int f33294a;

        public C8643c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: a */
        public void mo51275a(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m51270o5();
            if (i != this.f33294a) {
                xdl0.m208345M0(ExpProfileLoopCustomBirthdayTypeFrag.this.f33288I, false);
            }
            this.f33294a = i;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: b */
        public void mo51276b(int i) {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: c */
        public void mo51277c() {
            ExpProfileLoopCustomBirthdayTypeFrag expProfileLoopCustomBirthdayTypeFrag = ExpProfileLoopCustomBirthdayTypeFrag.this;
            expProfileLoopCustomBirthdayTypeFrag.m51269n5(expProfileLoopCustomBirthdayTypeFrag.f33286G);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: d */
        public void mo51278d(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m51268m5(i);
            ExpProfileLoopCustomBirthdayTypeFrag.this.m51263d5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public void m51263d5() {
        this.f33288I.startAnimation(AnimationUtils.loadAnimation(act(), rzb0.f161637i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] */
    public void m51274k5(Throwable th) {
        if (act().isFinishing()) {
            return;
        }
        ura.m195053e().m195057d().mo33786Xs(act(), th, new d30() { // from class: l.egf
            @Override // p149l.d30
            public final void call() {
                this.f90936a.m51272f5();
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    private boolean m51265i5() {
        return NullChecker.m81303a(m51247P4()) && NullChecker.m81303a(m51247P4().settings) && m51247P4().settings.birthdate.doubleValue() != ((double) m51273g5().getTimeInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m51266j5(roj0 roj0Var) {
        m51272f5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public /* synthetic */ void m51267l5() {
        this.f33285F.requestFocus();
        act().showInput(this.f33285F, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public void m51268m5(int i) {
        if (i == 1) {
            this.f33288I.setText(act().getString(R$string.f19103yo));
        } else if (i == 6) {
            this.f33288I.setText(act().getString(R$string.f18050Q3));
        } else if (i == 2 || i == 3) {
            this.f33288I.setText(act().getString(R$string.f17771Go));
        } else if (i == 4) {
            this.f33288I.setText(act().getString(R$string.f17591Ao));
        } else if (i == 5) {
            this.f33288I.setText(act().getString(R$string.f19133zo));
        }
        this.f33288I.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public void m51269n5(DateEditTextNew dateEditTextNew) {
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
    /* JADX INFO: renamed from: o5 */
    public void m51270o5() {
        if (m51265i5() && this.f33285F.m51633p() && this.f33286G.m51633p() && this.f33287H.m51633p()) {
            m51249R4(true);
        } else {
            m51249R4(false);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public void mo51251T4(User user) {
        this.f33279A.saveUserInfo(user);
        Calendar calendarM51273g5 = m51273g5();
        if (user.settings == null) {
            user.settings = Settings.new_();
        }
        user.settings.birthdate = Double.valueOf(calendarM51273g5.getTimeInMillis());
    }

    /* JADX INFO: renamed from: e5 */
    public void m51271e5() {
        duringCreated(CoreModule.f17545c.f19552B0.m31592P3(m51273g5().getTimeInMillis())).subscribe(mkd0.m154956H(new e30() { // from class: l.bgf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75428a.m51266j5((roj0) obj);
            }
        }, new e30() { // from class: l.cgf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80738a.m51274k5((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
    }

    /* JADX INFO: renamed from: f5 */
    public final void m51272f5() {
        this.f33289J = true;
        m51243M4().m51231a2().m203205q0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        User userM51245N4 = m51245N4();
        boolean zMo33921sn = CoreModule.f17557o.m195057d().mo33921sn();
        if (userM51245N4.age.intValue() >= 23 && !zMo33921sn) {
            this.f33285F.setNormalAge(23);
            this.f33286G.setNormalAge(23);
            this.f33287H.setNormalAge(23);
        }
        String str = mqi0.f135259k.format(userM51245N4.settings.birthdate);
        String str2 = new SimpleDateFormat("MM", Locale.getDefault()).format(userM51245N4.settings.birthdate);
        String str3 = mqi0.f135263o.format(userM51245N4.settings.birthdate);
        this.f33286G.setText(str2);
        this.f33287H.setText(str3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, Integer.parseInt(str));
        calendar.set(2, Integer.parseInt(str2));
        calendar.set(5, Integer.parseInt(str3));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(qib0.f154693H.guessedCurrentServerTime());
        int iM153611O = m9b.m153611O(calendar, calendar2);
        if (iM153611O < 100 || (iM153611O == 100 && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5))) {
            this.f33285F.setText(str);
            DateEditTextNew.m51624o(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
        } else {
            this.f33285F.setText("");
            this.f33286G.setText("");
            this.f33287H.setText("");
            DateEditTextNew.m51624o(-1, 0, -1);
        }
        m51270o5();
        e51.m114744I(this, new Runnable() { // from class: l.dgf
            @Override // java.lang.Runnable
            public final void run() {
                this.f86078a.m51267l5();
            }
        }, 300L);
        this.f33285F.setTextChangedListener(new C8641a());
        this.f33286G.setTextChangedListener(new C8642b());
        this.f33287H.setTextChangedListener(new C8643c());
    }

    /* JADX INFO: renamed from: g5 */
    public Calendar m51273g5() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m155944o());
        calendar.set(1, this.f33285F.getFinalNum());
        calendar.set(2, this.f33286G.getFinalNum() - 1);
        calendar.set(5, this.f33287H.getFinalNum());
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95397I2, viewGroup, false);
        this.f33285F = (DateEditTextNew) viewInflate.findViewById(u4c0.f174306j2);
        this.f33286G = (DateEditTextNew) viewInflate.findViewById(u4c0.f174290i2);
        this.f33287H = (DateEditTextNew) viewInflate.findViewById(u4c0.f174273h2);
        this.f33288I = (VText) viewInflate.findViewById(u4c0.f174323k2);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DateEditTextNew.m51624o(-1, 0, -1);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, p149l.gif
    /* JADX INFO: renamed from: x3 */
    public boolean mo51254x3() {
        if (this.f33289J) {
            return true;
        }
        m51271e5();
        return false;
    }
}
