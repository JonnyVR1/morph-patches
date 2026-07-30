package p153l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class jzw extends hzw<izw> {

    /* JADX INFO: renamed from: c */
    public TextView f123325c;

    /* JADX INFO: renamed from: d */
    public VLinear f123326d;

    /* JADX INFO: renamed from: e */
    public DateEditTextNew f123327e;

    /* JADX INFO: renamed from: f */
    public DateEditTextNew f123328f;

    /* JADX INFO: renamed from: g */
    public DateEditTextNew f123329g;

    /* JADX INFO: renamed from: h */
    public VText f123330h;

    /* JADX INFO: renamed from: l.jzw$b */
    public class C18066b implements DateEditTextNew.InterfaceC8839d {

        /* JADX INFO: renamed from: a */
        public int f123333a;

        public C18066b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: a */
        public void mo52458a(int i) {
            if (i != this.f123333a) {
                bnl0.m105525M0(jzw.this.f123330h, false);
            }
            this.f123333a = i;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: b */
        public void mo52459b(int i) {
            jzw.this.f123329g.requestFocus();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: c */
        public void mo52460c() {
            jzw jzwVar = jzw.this;
            jzwVar.m147744u(jzwVar.f123327e);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: d */
        public void mo52461d(int i) {
            jzw.this.m147743s(i);
            jzw.this.m147740n();
        }
    }

    public jzw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p153l.hzw, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return (TextUtils.isEmpty(this.f123327e.getText()) || TextUtils.isEmpty(this.f123328f.getText()) || TextUtils.isEmpty(this.f123329g.getText())) ? false : true;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        Calendar calendarM147742q = m147742q();
        if (user.settings == null) {
            user.settings = Settings.new_();
        }
        user.settings.birthdate = Double.valueOf(calendarM147742q.getTimeInMillis());
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(MarrySeriesType marrySeriesType, User user) {
        this.f123325c.setTypeface(lyh0.m156283c(3), 1);
        if (user == null || user.settings == null) {
            return;
        }
        boolean zMo34924sn = CoreModule.f18276o.m132214d().mo34924sn();
        if (user.age.intValue() >= 23 && !zMo34924sn) {
            this.f123327e.setNormalAge(23);
            this.f123328f.setNormalAge(23);
            this.f123329g.setNormalAge(23);
        }
        String str = pzi0.f154864k.format(user.settings.birthdate);
        String str2 = new SimpleDateFormat("MM", Locale.getDefault()).format(user.settings.birthdate);
        String str3 = pzi0.f154868o.format(user.settings.birthdate);
        this.f123328f.setText(str2);
        this.f123329g.setText(str3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, Integer.parseInt(str));
        calendar.set(2, Integer.parseInt(str2));
        calendar.set(5, Integer.parseInt(str3));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(uqb0.f180376H.guessedCurrentServerTime());
        int iM219111O = zab.m219111O(calendar, calendar2);
        if (iM219111O < 100 || (iM219111O == 100 && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5))) {
            this.f123327e.setText(str);
            DateEditTextNew.m52807o(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
        } else {
            this.f123327e.setText("");
            this.f123328f.setText("");
            this.f123329g.setText("");
            DateEditTextNew.m52807o(-1, 0, -1);
        }
        this.f123327e.setTextChangedListener(new C18065a());
        this.f123328f.setTextChangedListener(new C18066b());
        this.f123329g.setTextChangedListener(new C18067c());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m147739m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m147739m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kzw.m152237b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public final void m147740n() {
        this.f123330h.startAnimation(AnimationUtils.loadAnimation(act(), z7c0.f203232a));
    }

    /* JADX INFO: renamed from: q */
    public Calendar m147742q() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
        calendar.set(1, this.f123327e.getFinalNum());
        calendar.set(2, this.f123328f.getFinalNum() - 1);
        calendar.set(5, this.f123329g.getFinalNum());
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: renamed from: s */
    public final void m147743s(int i) {
        if (i == 1) {
            this.f123330h.setText(act().getString(R$string.f28532A3));
        } else if (i == 6) {
            this.f123330h.setText(act().getString(R$string.f28676c0));
        } else if (i == 2 || i == 3) {
            this.f123330h.setText(act().getString(R$string.f28567G3));
        } else if (i == 4) {
            this.f123330h.setText(act().getString(R$string.f28544C3));
        } else if (i == 5) {
            this.f123330h.setText(act().getString(R$string.f28538B3));
        }
        this.f123330h.setVisibility(0);
    }

    /* JADX INFO: renamed from: u */
    public final void m147744u(DateEditTextNew dateEditTextNew) {
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

    /* JADX INFO: renamed from: l.jzw$a */
    public class C18065a implements DateEditTextNew.InterfaceC8839d {

        /* JADX INFO: renamed from: a */
        public int f123331a;

        public C18065a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: a */
        public void mo52458a(int i) {
            if (i != this.f123331a) {
                bnl0.m105525M0(jzw.this.f123330h, false);
            }
            this.f123331a = i;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: b */
        public void mo52459b(int i) {
            jzw.this.f123328f.requestFocus();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: d */
        public void mo52461d(int i) {
            jzw.this.m147743s(i);
            jzw.this.m147740n();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: c */
        public void mo52460c() {
        }
    }

    @Override // p153l.hzw, p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.jzw$c */
    public class C18067c implements DateEditTextNew.InterfaceC8839d {

        /* JADX INFO: renamed from: a */
        public int f123335a;

        public C18067c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: a */
        public void mo52458a(int i) {
            if (i != this.f123335a) {
                bnl0.m105525M0(jzw.this.f123330h, false);
            }
            this.f123335a = i;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: c */
        public void mo52460c() {
            jzw jzwVar = jzw.this;
            jzwVar.m147744u(jzwVar.f123328f);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: d */
        public void mo52461d(int i) {
            jzw.this.m147743s(i);
            jzw.this.m147740n();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew.InterfaceC8839d
        /* JADX INFO: renamed from: b */
        public void mo52459b(int i) {
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(izw izwVar) {
    }
}
