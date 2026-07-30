package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import l.d30;
import l.e30;
import l.e51;
import l.f6c0;
import l.m9b;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.roj0;
import l.rzb0;
import l.u4c0;
import l.ura;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopCustomBirthdayTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public DateEditTextNew f1107F;

    /* JADX INFO: renamed from: G */
    public DateEditTextNew f1108G;

    /* JADX INFO: renamed from: H */
    public DateEditTextNew f1109H;

    /* JADX INFO: renamed from: I */
    public VText f1110I;

    /* JADX INFO: renamed from: J */
    public boolean f1111J = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomBirthdayTypeFrag$a */
    public class C0066a implements DateEditTextNew.InterfaceC0101d {

        /* JADX INFO: renamed from: a */
        public int f1112a;

        public C0066a() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: a */
        public void mo1733a(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m1726o5();
            if (i != this.f1112a) {
                xdl0.M0(ExpProfileLoopCustomBirthdayTypeFrag.this.f1110I, false);
            }
            this.f1112a = i;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: b */
        public void mo1734b(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.f1108G.requestFocus();
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: c */
        public void mo1735c() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: d */
        public void mo1736d(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m1724m5(i);
            ExpProfileLoopCustomBirthdayTypeFrag.this.m1719d5();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomBirthdayTypeFrag$b */
    public class C0067b implements DateEditTextNew.InterfaceC0101d {

        /* JADX INFO: renamed from: a */
        public int f1114a;

        public C0067b() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: a */
        public void mo1733a(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m1726o5();
            if (i != this.f1114a) {
                xdl0.M0(ExpProfileLoopCustomBirthdayTypeFrag.this.f1110I, false);
            }
            this.f1114a = i;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: b */
        public void mo1734b(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.f1109H.requestFocus();
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: c */
        public void mo1735c() {
            ExpProfileLoopCustomBirthdayTypeFrag expProfileLoopCustomBirthdayTypeFrag = ExpProfileLoopCustomBirthdayTypeFrag.this;
            expProfileLoopCustomBirthdayTypeFrag.m1725n5(expProfileLoopCustomBirthdayTypeFrag.f1107F);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: d */
        public void mo1736d(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m1724m5(i);
            ExpProfileLoopCustomBirthdayTypeFrag.this.m1719d5();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomBirthdayTypeFrag$c */
    public class C0068c implements DateEditTextNew.InterfaceC0101d {

        /* JADX INFO: renamed from: a */
        public int f1116a;

        public C0068c() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: a */
        public void mo1733a(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m1726o5();
            if (i != this.f1116a) {
                xdl0.M0(ExpProfileLoopCustomBirthdayTypeFrag.this.f1110I, false);
            }
            this.f1116a = i;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: b */
        public void mo1734b(int i) {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: c */
        public void mo1735c() {
            ExpProfileLoopCustomBirthdayTypeFrag expProfileLoopCustomBirthdayTypeFrag = ExpProfileLoopCustomBirthdayTypeFrag.this;
            expProfileLoopCustomBirthdayTypeFrag.m1725n5(expProfileLoopCustomBirthdayTypeFrag.f1108G);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.DateEditTextNew.InterfaceC0101d
        /* JADX INFO: renamed from: d */
        public void mo1736d(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m1724m5(i);
            ExpProfileLoopCustomBirthdayTypeFrag.this.m1719d5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public void m1719d5() {
        this.f1110I.startAnimation(AnimationUtils.loadAnimation(act(), rzb0.i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] */
    public void m1732k5(Throwable th) {
        if (act().isFinishing()) {
            return;
        }
        ura.e().d().Xs(act(), th, new d30() { // from class: l.egf
            public final void call() {
                this.f9761a.m1729f5();
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    private boolean m1721i5() {
        return NullChecker.a(m1702P4()) && NullChecker.a(m1702P4().settings) && m1702P4().settings.birthdate.doubleValue() != ((double) m1731g5().getTimeInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m1722j5(roj0 roj0Var) {
        m1729f5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public /* synthetic */ void m1723l5() {
        this.f1107F.requestFocus();
        act().showInput(this.f1107F, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public void m1724m5(int i) {
        if (i == 1) {
            this.f1110I.setText(act().getString(R.string.yo));
        } else if (i == 6) {
            this.f1110I.setText(act().getString(R.string.Q3));
        } else if (i == 2 || i == 3) {
            this.f1110I.setText(act().getString(R.string.Go));
        } else if (i == 4) {
            this.f1110I.setText(act().getString(R.string.Ao));
        } else if (i == 5) {
            this.f1110I.setText(act().getString(R.string.zo));
        }
        this.f1110I.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n5 */
    public void m1725n5(DateEditTextNew dateEditTextNew) {
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
    /* JADX INFO: renamed from: o5 */
    public void m1726o5() {
        if (m1721i5() && this.f1107F.m2124p() && this.f1108G.m2124p() && this.f1109H.m2124p()) {
            m1704R4(true);
        } else {
            m1704R4(false);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public void mo1706T4(User user) {
        this.f1101A.saveUserInfo(user);
        Calendar calendarM1731g5 = m1731g5();
        if (user.settings == null) {
            user.settings = Settings.new_();
        }
        user.settings.birthdate = Double.valueOf(calendarM1731g5.getTimeInMillis());
    }

    /* JADX INFO: renamed from: e5 */
    public void m1727e5() {
        duringCreated(CoreModule.c.B0.P3(m1731g5().getTimeInMillis())).subscribe(mkd0.H(new e30() { // from class: l.bgf
            public final void call(Object obj) {
                this.f8119a.m1722j5((roj0) obj);
            }
        }, new e30() { // from class: l.cgf
            public final void call(Object obj) {
                this.f8660a.m1732k5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    public void m1728f4() {
        super.f4();
    }

    /* JADX INFO: renamed from: f5 */
    public final void m1729f5() {
        this.f1111J = true;
        m1698M4().m1686a2().m24655q0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m1730g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        User userM1700N4 = m1700N4();
        boolean zSn = CoreModule.o.d().sn();
        if (userM1700N4.age.intValue() >= 23 && !zSn) {
            this.f1107F.setNormalAge(23);
            this.f1108G.setNormalAge(23);
            this.f1109H.setNormalAge(23);
        }
        String str = mqi0.k.format(userM1700N4.settings.birthdate);
        String str2 = new SimpleDateFormat("MM", Locale.getDefault()).format(userM1700N4.settings.birthdate);
        String str3 = mqi0.o.format(userM1700N4.settings.birthdate);
        this.f1108G.setText(str2);
        this.f1109H.setText(str3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, Integer.parseInt(str));
        calendar.set(2, Integer.parseInt(str2));
        calendar.set(5, Integer.parseInt(str3));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(qib0.H.guessedCurrentServerTime());
        int iO = m9b.O(calendar, calendar2);
        if (iO < 100 || (iO == 100 && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5))) {
            this.f1107F.setText(str);
            DateEditTextNew.m2115o(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
        } else {
            this.f1107F.setText("");
            this.f1108G.setText("");
            this.f1109H.setText("");
            DateEditTextNew.m2115o(-1, 0, -1);
        }
        m1726o5();
        e51.I(this, new Runnable() { // from class: l.dgf
            @Override // java.lang.Runnable
            public final void run() {
                this.f9220a.m1723l5();
            }
        }, 300L);
        this.f1107F.setTextChangedListener(new C0066a());
        this.f1108G.setTextChangedListener(new C0067b());
        this.f1109H.setTextChangedListener(new C0068c());
    }

    /* JADX INFO: renamed from: g5 */
    public Calendar m1731g5() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.o());
        calendar.set(1, this.f1107F.getFinalNum());
        calendar.set(2, this.f1108G.getFinalNum() - 1);
        calendar.set(5, this.f1109H.getFinalNum());
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.I2, viewGroup, false);
        this.f1107F = (DateEditTextNew) viewInflate.findViewById(u4c0.j2);
        this.f1108G = (DateEditTextNew) viewInflate.findViewById(u4c0.i2);
        this.f1109H = (DateEditTextNew) viewInflate.findViewById(u4c0.h2);
        this.f1110I = viewInflate.findViewById(u4c0.k2);
        return viewInflate;
    }

    public void onDestroy() {
        super/*com.p1.mobile.android.app.Frag*/.onDestroy();
        DateEditTextNew.m2115o(-1, 0, -1);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, p002l.gif
    /* JADX INFO: renamed from: x3 */
    public boolean mo1710x3() {
        if (this.f1111J) {
            return true;
        }
        m1727e5();
        return false;
    }
}
