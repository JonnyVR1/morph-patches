package p003l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import l.lww;
import l.m9b;
import l.mqi0;
import l.qib0;
import l.tzb0;
import l.xdl0;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kww extends iww<jww> {

    /* JADX INFO: renamed from: c */
    public TextView f5102c;

    /* JADX INFO: renamed from: d */
    public VLinear f5103d;

    /* JADX INFO: renamed from: e */
    public DateEditTextNew f5104e;

    /* JADX INFO: renamed from: f */
    public DateEditTextNew f5105f;

    /* JADX INFO: renamed from: g */
    public DateEditTextNew f5106g;

    /* JADX INFO: renamed from: h */
    public VText f5107h;

    /* JADX INFO: renamed from: l.kww$b */
    public class C0393b implements DateEditTextNew.d {

        /* JADX INFO: renamed from: a */
        public int f5110a;

        public C0393b() {
        }

        /* JADX INFO: renamed from: a */
        public void m5885a(int i) {
            if (i != this.f5110a) {
                xdl0.M0(kww.this.f5107h, false);
            }
            this.f5110a = i;
        }

        /* JADX INFO: renamed from: b */
        public void m5886b(int i) {
            kww.this.f5106g.requestFocus();
        }

        /* JADX INFO: renamed from: c */
        public void m5887c() {
            kww kwwVar = kww.this;
            kwwVar.m5880u(kwwVar.f5104e);
        }

        /* JADX INFO: renamed from: d */
        public void m5888d(int i) {
            kww.this.m5879s(i);
            kww.this.m5876n();
        }
    }

    public kww(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p003l.iww
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5253C0() {
        return act();
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return (TextUtils.isEmpty(this.f5104e.getText()) || TextUtils.isEmpty(this.f5105f.getText()) || TextUtils.isEmpty(this.f5106g.getText())) ? false : true;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        Calendar calendarM5878q = m5878q();
        if (user.settings == null) {
            user.settings = Settings.new_();
        }
        user.settings.birthdate = Double.valueOf(calendarM5878q.getTimeInMillis());
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(MarrySeriesType marrySeriesType, User user) {
        this.f5102c.setTypeface(eqh0.m3924c(3), 1);
        if (user == null || user.settings == null) {
            return;
        }
        boolean zSn = CoreModule.o.d().sn();
        if (user.age.intValue() >= 23 && !zSn) {
            this.f5104e.setNormalAge(23);
            this.f5105f.setNormalAge(23);
            this.f5106g.setNormalAge(23);
        }
        String str = mqi0.k.format(user.settings.birthdate);
        String str2 = new SimpleDateFormat("MM", Locale.getDefault()).format(user.settings.birthdate);
        String str3 = mqi0.o.format(user.settings.birthdate);
        this.f5105f.setText(str2);
        this.f5106g.setText(str3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, Integer.parseInt(str));
        calendar.set(2, Integer.parseInt(str2));
        calendar.set(5, Integer.parseInt(str3));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(qib0.H.guessedCurrentServerTime());
        int iO = m9b.O(calendar, calendar2);
        if (iO < 100 || (iO == 100 && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5))) {
            this.f5104e.setText(str);
            DateEditTextNew.o(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
        } else {
            this.f5104e.setText("");
            this.f5105f.setText("");
            this.f5106g.setText("");
            DateEditTextNew.o(-1, 0, -1);
        }
        this.f5104e.setTextChangedListener(new C0392a());
        this.f5105f.setTextChangedListener(new C0393b());
        this.f5106g.setTextChangedListener(new C0394c());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m5875m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m5875m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lww.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public final void m5876n() {
        this.f5107h.startAnimation(AnimationUtils.loadAnimation(act(), tzb0.a));
    }

    /* JADX INFO: renamed from: q */
    public Calendar m5878q() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.o());
        calendar.set(1, this.f5104e.getFinalNum());
        calendar.set(2, this.f5105f.getFinalNum() - 1);
        calendar.set(5, this.f5106g.getFinalNum());
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: renamed from: s */
    public final void m5879s(int i) {
        if (i == 1) {
            this.f5107h.setText(act().getString(R.string.A3));
        } else if (i == 6) {
            this.f5107h.setText(act().getString(R.string.c0));
        } else if (i == 2 || i == 3) {
            this.f5107h.setText(act().getString(R.string.G3));
        } else if (i == 4) {
            this.f5107h.setText(act().getString(R.string.C3));
        } else if (i == 5) {
            this.f5107h.setText(act().getString(R.string.B3));
        }
        this.f5107h.setVisibility(0);
    }

    /* JADX INFO: renamed from: u */
    public final void m5880u(DateEditTextNew dateEditTextNew) {
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

    /* JADX INFO: renamed from: l.kww$a */
    public class C0392a implements DateEditTextNew.d {

        /* JADX INFO: renamed from: a */
        public int f5108a;

        public C0392a() {
        }

        /* JADX INFO: renamed from: a */
        public void m5881a(int i) {
            if (i != this.f5108a) {
                xdl0.M0(kww.this.f5107h, false);
            }
            this.f5108a = i;
        }

        /* JADX INFO: renamed from: b */
        public void m5882b(int i) {
            kww.this.f5105f.requestFocus();
        }

        /* JADX INFO: renamed from: d */
        public void m5884d(int i) {
            kww.this.m5879s(i);
            kww.this.m5876n();
        }

        /* JADX INFO: renamed from: c */
        public void m5883c() {
        }
    }

    @Override // p003l.iww
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.kww$c */
    public class C0394c implements DateEditTextNew.d {

        /* JADX INFO: renamed from: a */
        public int f5112a;

        public C0394c() {
        }

        /* JADX INFO: renamed from: a */
        public void m5889a(int i) {
            if (i != this.f5112a) {
                xdl0.M0(kww.this.f5107h, false);
            }
            this.f5112a = i;
        }

        /* JADX INFO: renamed from: c */
        public void m5891c() {
            kww kwwVar = kww.this;
            kwwVar.m5880u(kwwVar.f5105f);
        }

        /* JADX INFO: renamed from: d */
        public void m5892d(int i) {
            kww.this.m5879s(i);
            kww.this.m5876n();
        }

        /* JADX INFO: renamed from: b */
        public void m5890b(int i) {
        }
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m5874i1(jww jwwVar) {
    }
}
