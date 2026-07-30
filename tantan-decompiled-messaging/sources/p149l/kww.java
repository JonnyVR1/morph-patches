package p149l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class kww extends iww<jww> {

    /* JADX INFO: renamed from: c */
    public TextView f125024c;

    /* JADX INFO: renamed from: d */
    public VLinear f125025d;

    /* JADX INFO: renamed from: e */
    public DateEditTextNew f125026e;

    /* JADX INFO: renamed from: f */
    public DateEditTextNew f125027f;

    /* JADX INFO: renamed from: g */
    public DateEditTextNew f125028g;

    /* JADX INFO: renamed from: h */
    public VText f125029h;

    /* JADX INFO: renamed from: l.kww$b */
    public class C18103b implements DateEditTextNew.InterfaceC8676d {

        /* JADX INFO: renamed from: a */
        public int f125032a;

        public C18103b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: a */
        public void mo51275a(int i) {
            if (i != this.f125032a) {
                xdl0.m208345M0(kww.this.f125029h, false);
            }
            this.f125032a = i;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: b */
        public void mo51276b(int i) {
            kww.this.f125028g.requestFocus();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: c */
        public void mo51277c() {
            kww kwwVar = kww.this;
            kwwVar.m147664u(kwwVar.f125026e);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: d */
        public void mo51278d(int i) {
            kww.this.m147663s(i);
            kww.this.m147660n();
        }
    }

    public kww(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p149l.iww, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return (TextUtils.isEmpty(this.f125026e.getText()) || TextUtils.isEmpty(this.f125027f.getText()) || TextUtils.isEmpty(this.f125028g.getText())) ? false : true;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        Calendar calendarM147662q = m147662q();
        if (user.settings == null) {
            user.settings = Settings.new_();
        }
        user.settings.birthdate = Double.valueOf(calendarM147662q.getTimeInMillis());
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(MarrySeriesType marrySeriesType, User user) {
        this.f125024c.setTypeface(eqh0.m117752c(3), 1);
        if (user == null || user.settings == null) {
            return;
        }
        boolean zMo33921sn = CoreModule.f17557o.m195057d().mo33921sn();
        if (user.age.intValue() >= 23 && !zMo33921sn) {
            this.f125026e.setNormalAge(23);
            this.f125027f.setNormalAge(23);
            this.f125028g.setNormalAge(23);
        }
        String str = mqi0.f135259k.format(user.settings.birthdate);
        String str2 = new SimpleDateFormat("MM", Locale.getDefault()).format(user.settings.birthdate);
        String str3 = mqi0.f135263o.format(user.settings.birthdate);
        this.f125027f.setText(str2);
        this.f125028g.setText(str3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, Integer.parseInt(str));
        calendar.set(2, Integer.parseInt(str2));
        calendar.set(5, Integer.parseInt(str3));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(qib0.f154693H.guessedCurrentServerTime());
        int iM153611O = m9b.m153611O(calendar, calendar2);
        if (iM153611O < 100 || (iM153611O == 100 && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5))) {
            this.f125026e.setText(str);
            DateEditTextNew.m51624o(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
        } else {
            this.f125026e.setText("");
            this.f125027f.setText("");
            this.f125028g.setText("");
            DateEditTextNew.m51624o(-1, 0, -1);
        }
        this.f125026e.setTextChangedListener(new C18102a());
        this.f125027f.setTextChangedListener(new C18103b());
        this.f125028g.setTextChangedListener(new C18104c());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m147659m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m147659m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lww.m152018b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public final void m147660n() {
        this.f125029h.startAnimation(AnimationUtils.loadAnimation(act(), tzb0.f172714a));
    }

    /* JADX INFO: renamed from: q */
    public Calendar m147662q() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m155944o());
        calendar.set(1, this.f125026e.getFinalNum());
        calendar.set(2, this.f125027f.getFinalNum() - 1);
        calendar.set(5, this.f125028g.getFinalNum());
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: renamed from: s */
    public final void m147663s(int i) {
        if (i == 1) {
            this.f125029h.setText(act().getString(R$string.f27684A3));
        } else if (i == 6) {
            this.f125029h.setText(act().getString(R$string.f27828c0));
        } else if (i == 2 || i == 3) {
            this.f125029h.setText(act().getString(R$string.f27719G3));
        } else if (i == 4) {
            this.f125029h.setText(act().getString(R$string.f27696C3));
        } else if (i == 5) {
            this.f125029h.setText(act().getString(R$string.f27690B3));
        }
        this.f125029h.setVisibility(0);
    }

    /* JADX INFO: renamed from: u */
    public final void m147664u(DateEditTextNew dateEditTextNew) {
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

    /* JADX INFO: renamed from: l.kww$a */
    public class C18102a implements DateEditTextNew.InterfaceC8676d {

        /* JADX INFO: renamed from: a */
        public int f125030a;

        public C18102a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: a */
        public void mo51275a(int i) {
            if (i != this.f125030a) {
                xdl0.m208345M0(kww.this.f125029h, false);
            }
            this.f125030a = i;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: b */
        public void mo51276b(int i) {
            kww.this.f125027f.requestFocus();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: d */
        public void mo51278d(int i) {
            kww.this.m147663s(i);
            kww.this.m147660n();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: c */
        public void mo51277c() {
        }
    }

    @Override // p149l.iww, p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.kww$c */
    public class C18104c implements DateEditTextNew.InterfaceC8676d {

        /* JADX INFO: renamed from: a */
        public int f125034a;

        public C18104c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: a */
        public void mo51275a(int i) {
            if (i != this.f125034a) {
                xdl0.m208345M0(kww.this.f125029h, false);
            }
            this.f125034a = i;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: c */
        public void mo51277c() {
            kww kwwVar = kww.this;
            kwwVar.m147664u(kwwVar.f125027f);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: d */
        public void mo51278d(int i) {
            kww.this.m147663s(i);
            kww.this.m147660n();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew.InterfaceC8676d
        /* JADX INFO: renamed from: b */
        public void mo51276b(int i) {
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jww jwwVar) {
    }
}
