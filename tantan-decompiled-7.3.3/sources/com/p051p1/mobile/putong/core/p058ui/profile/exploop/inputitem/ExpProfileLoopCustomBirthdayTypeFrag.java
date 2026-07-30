package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.gta;
import p153l.kec0;
import p153l.l51;
import p153l.psd0;
import p153l.pzi0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.x20;
import p153l.x7c0;
import p153l.y20;
import p153l.zab;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomBirthdayTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public DateEditTextNew f34133F;

    /* JADX INFO: renamed from: G */
    public DateEditTextNew f34134G;

    /* JADX INFO: renamed from: H */
    public DateEditTextNew f34135H;

    /* JADX INFO: renamed from: I */
    public VText f34136I;

    /* JADX INFO: renamed from: J */
    public boolean f34137J = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomBirthdayTypeFrag$a */
    public class C8804a implements DateEditTextNew.InterfaceC8839d {

        /* JADX INFO: renamed from: a */
        public int f34138a;

        public C8804a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: a */
        public void mo52458a(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m52453o5();
            if (i != this.f34138a) {
                bnl0.m105525M0(ExpProfileLoopCustomBirthdayTypeFrag.this.f34136I, false);
            }
            this.f34138a = i;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: b */
        public void mo52459b(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.f34134G.requestFocus();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: c */
        public void mo52460c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: d */
        public void mo52461d(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m52451m5(i);
            ExpProfileLoopCustomBirthdayTypeFrag.this.m52446d5();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomBirthdayTypeFrag$b */
    public class C8805b implements DateEditTextNew.InterfaceC8839d {

        /* JADX INFO: renamed from: a */
        public int f34140a;

        public C8805b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: a */
        public void mo52458a(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m52453o5();
            if (i != this.f34140a) {
                bnl0.m105525M0(ExpProfileLoopCustomBirthdayTypeFrag.this.f34136I, false);
            }
            this.f34140a = i;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: b */
        public void mo52459b(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.f34135H.requestFocus();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: c */
        public void mo52460c() {
            ExpProfileLoopCustomBirthdayTypeFrag expProfileLoopCustomBirthdayTypeFrag = ExpProfileLoopCustomBirthdayTypeFrag.this;
            expProfileLoopCustomBirthdayTypeFrag.m52452n5(expProfileLoopCustomBirthdayTypeFrag.f34133F);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: d */
        public void mo52461d(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m52451m5(i);
            ExpProfileLoopCustomBirthdayTypeFrag.this.m52446d5();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomBirthdayTypeFrag$c */
    public class C8806c implements DateEditTextNew.InterfaceC8839d {

        /* JADX INFO: renamed from: a */
        public int f34142a;

        public C8806c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: a */
        public void mo52458a(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m52453o5();
            if (i != this.f34142a) {
                bnl0.m105525M0(ExpProfileLoopCustomBirthdayTypeFrag.this.f34136I, false);
            }
            this.f34142a = i;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: b */
        public void mo52459b(int i) {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: c */
        public void mo52460c() {
            ExpProfileLoopCustomBirthdayTypeFrag expProfileLoopCustomBirthdayTypeFrag = ExpProfileLoopCustomBirthdayTypeFrag.this;
            expProfileLoopCustomBirthdayTypeFrag.m52452n5(expProfileLoopCustomBirthdayTypeFrag.f34134G);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: d */
        public void mo52461d(int i) {
            ExpProfileLoopCustomBirthdayTypeFrag.this.m52451m5(i);
            ExpProfileLoopCustomBirthdayTypeFrag.this.m52446d5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public void m52446d5() {
        this.f34136I.startAnimation(AnimationUtils.loadAnimation(act(), x7c0.f192694i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] */
    public void m52457k5(Throwable th) {
        if (act().isFinishing()) {
            return;
        }
        gta.m132210e().m132214d().mo34789Xs(act(), th, new x20() { // from class: l.khf
            @Override // p153l.x20
            public final void call() {
                this.f126867a.m52455f5();
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    private boolean m52448i5() {
        return NullChecker.m82486a(m52430P4()) && NullChecker.m82486a(m52430P4().settings) && m52430P4().settings.birthdate.doubleValue() != ((double) m52456g5().getTimeInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m52449j5(uxj0 uxj0Var) {
        m52455f5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public /* synthetic */ void m52450l5() {
        this.f34133F.requestFocus();
        act().showInput(this.f34133F, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public void m52451m5(int i) {
        if (i == 1) {
            this.f34136I.setText(act().getString(R$string.f18921Uo));
        } else if (i == 6) {
            this.f34136I.setText(act().getString(R$string.f18840S3));
        } else if (i == 2 || i == 3) {
            this.f34136I.setText(act().getString(R$string.f19164cp));
        } else if (i == 4) {
            this.f34136I.setText(act().getString(R$string.f18981Wo));
        } else if (i == 5) {
            this.f34136I.setText(act().getString(R$string.f18951Vo));
        }
        this.f34136I.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public void m52452n5(DateEditTextNew dateEditTextNew) {
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
    /* JADX INFO: renamed from: o5 */
    public void m52453o5() {
        if (m52448i5() && this.f34133F.m52816p() && this.f34134G.m52816p() && this.f34135H.m52816p()) {
            m52432R4(true);
        } else {
            m52432R4(false);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public void mo52434T4(User user) {
        this.f34127A.saveUserInfo(user);
        Calendar calendarM52456g5 = m52456g5();
        if (user.settings == null) {
            user.settings = Settings.new_();
        }
        user.settings.birthdate = Double.valueOf(calendarM52456g5.getTimeInMillis());
    }

    /* JADX INFO: renamed from: e5 */
    public void m52454e5() {
        duringCreated(CoreModule.f18264c.f20294B0.m32595P3(m52456g5().getTimeInMillis())).subscribe(psd0.m173597H(new y20() { // from class: l.hhf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109882a.m52449j5((uxj0) obj);
            }
        }, new y20() { // from class: l.ihf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114934a.m52457k5((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
    }

    /* JADX INFO: renamed from: f5 */
    public final void m52455f5() {
        this.f34137J = true;
        m52426M4().m52414b2().m110171q0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        User userM52428N4 = m52428N4();
        boolean zMo34924sn = CoreModule.f18276o.m132214d().mo34924sn();
        if (userM52428N4.age.intValue() >= 23 && !zMo34924sn) {
            this.f34133F.setNormalAge(23);
            this.f34134G.setNormalAge(23);
            this.f34135H.setNormalAge(23);
        }
        String str = pzi0.f154864k.format(userM52428N4.settings.birthdate);
        String str2 = new SimpleDateFormat("MM", Locale.getDefault()).format(userM52428N4.settings.birthdate);
        String str3 = pzi0.f154868o.format(userM52428N4.settings.birthdate);
        this.f34134G.setText(str2);
        this.f34135H.setText(str3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, Integer.parseInt(str));
        calendar.set(2, Integer.parseInt(str2));
        calendar.set(5, Integer.parseInt(str3));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(uqb0.f180376H.guessedCurrentServerTime());
        int iM219111O = zab.m219111O(calendar, calendar2);
        if (iM219111O < 100 || (iM219111O == 100 && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5))) {
            this.f34133F.setText(str);
            DateEditTextNew.m52807o(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
        } else {
            this.f34133F.setText("");
            this.f34134G.setText("");
            this.f34135H.setText("");
            DateEditTextNew.m52807o(-1, 0, -1);
        }
        m52453o5();
        l51.m152889I(this, new Runnable() { // from class: l.jhf
            @Override // java.lang.Runnable
            public final void run() {
                this.f120969a.m52450l5();
            }
        }, 300L);
        this.f34133F.setTextChangedListener(new C8804a());
        this.f34134G.setTextChangedListener(new C8805b());
        this.f34135H.setTextChangedListener(new C8806c());
    }

    /* JADX INFO: renamed from: g5 */
    public Calendar m52456g5() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
        calendar.set(1, this.f34133F.getFinalNum());
        calendar.set(2, this.f34134G.getFinalNum() - 1);
        calendar.set(5, this.f34135H.getFinalNum());
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125451I2, viewGroup, false);
        this.f34133F = (DateEditTextNew) viewInflate.findViewById(adc0.f70431l2);
        this.f34134G = (DateEditTextNew) viewInflate.findViewById(adc0.f70414k2);
        this.f34135H = (DateEditTextNew) viewInflate.findViewById(adc0.f70397j2);
        this.f34136I = (VText) viewInflate.findViewById(adc0.f70448m2);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DateEditTextNew.m52807o(-1, 0, -1);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, p153l.mjf
    /* JADX INFO: renamed from: x3 */
    public boolean mo52437x3() {
        if (this.f34137J) {
            return true;
        }
        m52454e5();
        return false;
    }
}
