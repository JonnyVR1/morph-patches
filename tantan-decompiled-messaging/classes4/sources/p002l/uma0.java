package p002l;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopEditInfo;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopTextInputFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopEditActionView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e3c0;
import l.e51;
import l.eex;
import l.j760;
import l.lqa;
import l.lsi0;
import l.pj90;
import l.s7m;
import l.t100;
import l.ura;
import l.vma0;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uma0 implements s7m<rma0> {

    /* JADX INFO: renamed from: a */
    public ProfileLoopEditActionView f20710a;

    /* JADX INFO: renamed from: b */
    public ProfileLoopActionLayout f20711b;

    /* JADX INFO: renamed from: c */
    public rma0 f20712c;

    /* JADX INFO: renamed from: d */
    public Context f20713d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopTextInputFrag f20714e;

    /* JADX INFO: renamed from: f */
    public LoopInputType f20715f;

    /* JADX INFO: renamed from: g */
    public LoopEditInfo f20716g;

    /* JADX INFO: renamed from: h */
    public String f20717h;

    public uma0(Context context, ProfileLoopTextInputFrag profileLoopTextInputFrag) {
        this.f20713d = context;
        this.f20714e = profileLoopTextInputFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m23539n() {
        this.f20710a.f1993e.requestFocus();
        act().showInput(this.f20710a.f1993e, 0);
    }

    /* JADX INFO: renamed from: r */
    private void m23540r() {
        if (this.f20714e.m2083W4()) {
            this.f20711b.m3528m();
        }
        this.f20711b.m3527l(this.f20714e);
        m23550l().m1991a2().m2030W0(this.f20714e);
        this.f20710a.setFrom(this.f20717h);
        this.f20710a.setInputTextChangeListener(new ProfileLoopEditActionView.InterfaceC0171b() { // from class: l.sma0
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopEditActionView.InterfaceC0171b
            /* JADX INFO: renamed from: a */
            public final void mo3536a(String str, String str2) {
                this.f19123a.m23551m(str, str2);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m23541C0() {
        return this.f20713d;
    }

    /* JADX INFO: renamed from: c */
    public View m23542c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vma0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m23547i1(rma0 rma0Var) {
        this.f20712c = rma0Var;
    }

    /* JADX INFO: renamed from: e */
    public boolean m23544e() {
        Editable text = this.f20710a.f1993e.getText();
        return NullChecker.a(text) && !TextUtils.isEmpty(text.toString());
    }

    /* JADX INFO: renamed from: f */
    public boolean m23545f(LoopInputType loopInputType) {
        String strOb = ura.e().d().ob(this.f20710a.f1993e.getText().toString().trim());
        if (!TextUtils.isEmpty(strOb)) {
            zvf0.B("e_profile_unsuccessful", this.f20715f.pageId, new j760[]{vwb.Y("about_me_finish_failed_reason", strOb)});
            lsi0.y(CoreModule.b.getString(R.string.k0));
            return false;
        }
        xdl0.M(this.f20710a.f1995g, false);
        if (!TextUtils.isEmpty((String) yij0.j.call(this.f20710a.f1993e.getText()))) {
            lsi0.h(R.string.U2);
            return false;
        }
        if (loopInputType == LoopInputType.NICKNAME) {
            String strL = yij0.L(this.f20710a.f1993e.getText().toString());
            if (!TextUtils.isEmpty(strL)) {
                xdl0.M(this.f20710a.f1995g, true);
                this.f20710a.f1995g.setText(strL);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m23546i() {
        User userM2043u0 = m23550l().m1991a2().m2043u0();
        LoopInputType loopInputType = this.f20715f;
        if (loopInputType == LoopInputType.ABOUT_ME) {
            String str = userM2043u0.description;
            if (!TextUtils.isEmpty(str)) {
                this.f20710a.f1993e.setText(str);
            }
        } else if (loopInputType == LoopInputType.COMPANY) {
            String str2 = userM2043u0.profile.work.company;
            if (!TextUtils.isEmpty(str2)) {
                this.f20710a.f1993e.setText(str2);
            }
        } else if (loopInputType == LoopInputType.MAJOR) {
            String str3 = userM2043u0.profile.studies.major;
            if (!TextUtils.isEmpty(str3)) {
                this.f20710a.f1993e.setText(str3);
            }
        } else if (loopInputType == LoopInputType.SCHOOL) {
            String str4 = userM2043u0.profile.studies.school;
            if (!TextUtils.isEmpty(str4)) {
                this.f20710a.f1993e.setText(str4);
            }
        } else if (loopInputType == LoopInputType.NICKNAME) {
            String str5 = userM2043u0.name;
            if (!TextUtils.isEmpty(str5)) {
                this.f20710a.f1993e.setText(str5);
            }
        } else if (loopInputType == LoopInputType.SIGNATURE) {
            String str6 = userM2043u0.description;
            if (!TextUtils.isEmpty(str6)) {
                this.f20710a.f1993e.setText(str6);
            }
        } else if (loopInputType == LoopInputType.FAMILY) {
            String strA = eex.a(userM2043u0.profile.extensions.mate.familyBackground);
            if (!TextUtils.isEmpty(strA)) {
                this.f20710a.f1993e.setText(strA);
            }
        } else if (loopInputType == LoopInputType.LOVE) {
            String strA2 = eex.a(userM2043u0.profile.extensions.mate.loveView);
            if (!TextUtils.isEmpty(strA2)) {
                this.f20710a.f1993e.setText(strA2);
            }
        } else if (loopInputType == LoopInputType.HALF) {
            String strA3 = eex.a(userM2043u0.profile.extensions.mate.idealPartner);
            if (!TextUtils.isEmpty(strA3)) {
                this.f20710a.f1993e.setText(strA3);
            }
        } else if (loopInputType == LoopInputType.INTEREST) {
            String strA4 = eex.a(userM2043u0.profile.extensions.mate.hobbies);
            if (!TextUtils.isEmpty(strA4)) {
                this.f20710a.f1993e.setText(strA4);
            }
        } else if (loopInputType == LoopInputType.DO_NOT_WISH && pj90.r(userM2043u0)) {
            this.f20710a.f1993e.setText((CharSequence) userM2043u0.profile.extensions.basic.unideal.get(0));
        }
        String string = this.f20710a.f1993e.getText().toString();
        if (!TextUtils.isEmpty(string) || this.f20716g.couldInputEmpty) {
            this.f20710a.f1993e.setSelection(string.length());
        } else {
            boolean zM2083W4 = this.f20714e.m2083W4();
            ProfileLoopActionLayout profileLoopActionLayout = this.f20711b;
            if (zM2083W4) {
                profileLoopActionLayout.m3528m();
                this.f20711b.f1986c.setEnabled(false);
            } else {
                profileLoopActionLayout.f1985b.setEnabled(false);
                this.f20711b.f1985b.setClickable(false);
                this.f20711b.f1985b.setBackgroundDrawable(act().drawable(e3c0.r1));
            }
        }
        if (lqa.f() && this.f20714e.m2081U4()) {
            String strM = pj90.m(this.f20714e.f1277z);
            xdl0.X(this.f20710a.f1989a, 0);
            boolean zIsEmpty = TextUtils.isEmpty(strM);
            ProfileLoopEditActionView profileLoopEditActionView = this.f20710a;
            if (zIsEmpty) {
                xdl0.U(profileLoopEditActionView.f1989a, t100.d(32.0f));
                return;
            }
            xdl0.M(profileLoopEditActionView.f1990b, true);
            xdl0.X(this.f20710a.f1990b, t100.d(12.0f));
            xdl0.U(this.f20710a.f1990b, t100.d(20.0f));
            this.f20710a.f1990b.setTextSize(15.0f);
            this.f20710a.f1990b.setTextColor(Color.parseColor("#a9a9a9"));
            this.f20710a.f1990b.setText(String.format("预计符合%s人的理想型", strM));
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM23542c = m23542c(layoutInflater, viewGroup);
        m23540r();
        return viewM23542c;
    }

    /* JADX INFO: renamed from: j */
    public void m23548j(User user) {
        String strK = vwb.k(this.f20710a.f1993e.getText().toString().trim());
        LoopInputType loopInputType = this.f20715f;
        if (loopInputType == LoopInputType.ABOUT_ME) {
            user.description = strK;
            return;
        }
        if (loopInputType == LoopInputType.COMPANY) {
            user.profile.work.company = strK;
            return;
        }
        if (loopInputType == LoopInputType.MAJOR) {
            user.profile.studies.major = strK;
            return;
        }
        if (loopInputType == LoopInputType.SCHOOL) {
            user.profile.studies.school = strK;
            return;
        }
        if (loopInputType == LoopInputType.NICKNAME) {
            user.name = strK;
            return;
        }
        if (loopInputType == LoopInputType.SIGNATURE) {
            user.description = strK;
            return;
        }
        if (loopInputType == LoopInputType.FAMILY) {
            eex.b(user.profile.extensions.mate.familyBackground, strK);
            return;
        }
        if (loopInputType == LoopInputType.HALF) {
            eex.b(user.profile.extensions.mate.idealPartner, strK);
            return;
        }
        if (loopInputType == LoopInputType.INTEREST) {
            eex.b(user.profile.extensions.mate.hobbies, strK);
            return;
        }
        if (loopInputType == LoopInputType.LOVE) {
            eex.b(user.profile.extensions.mate.loveView, strK);
        } else if (loopInputType == LoopInputType.DO_NOT_WISH) {
            user.profile.extensions.basic.unideal = vwb.f0(new String[]{strK});
        }
    }

    /* JADX INFO: renamed from: k */
    public Bundle m23549k() {
        return this.f20714e.getArguments();
    }

    /* JADX INFO: renamed from: l */
    public ProfileInfoLoopEditAct m23550l() {
        return (ProfileInfoLoopEditAct) this.f20713d;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m23551m(String str, String str2) {
        if (!TextUtils.isEmpty(str2) || (TextUtils.isEmpty(str) && !this.f20716g.couldInputEmpty)) {
            boolean zM2083W4 = this.f20714e.m2083W4();
            ProfileLoopActionLayout profileLoopActionLayout = this.f20711b;
            if (zM2083W4) {
                profileLoopActionLayout.m3528m();
                this.f20711b.f1986c.setEnabled(false);
                return;
            } else {
                profileLoopActionLayout.f1985b.setEnabled(false);
                this.f20711b.f1985b.setClickable(false);
                this.f20711b.f1985b.setBackgroundDrawable(act().drawable(e3c0.r1));
                return;
            }
        }
        LoopInputType loopInputType = this.f20715f;
        LoopInputType loopInputType2 = LoopInputType.NICKNAME;
        if (loopInputType == loopInputType2) {
            boolean zIsEmpty = TextUtils.isEmpty(yij0.L(str));
            ProfileLoopActionLayout profileLoopActionLayout2 = this.f20711b;
            if (zIsEmpty) {
                profileLoopActionLayout2.f1985b.setEnabled(true);
                this.f20711b.f1985b.setClickable(true);
                this.f20711b.f1985b.setBackgroundDrawable(act().drawable(e3c0.f));
            } else {
                profileLoopActionLayout2.f1985b.setEnabled(false);
                this.f20711b.f1985b.setClickable(false);
                this.f20711b.f1985b.setBackgroundDrawable(act().drawable(e3c0.r1));
            }
        } else if (!TextUtils.isEmpty(str.trim()) || (this.f20716g.couldInputEmpty && !TextUtils.equals(m23550l().m1991a2().getFrom(), "from_filter_purpose_dialog"))) {
            this.f20711b.f1985b.setEnabled(true);
            this.f20711b.f1985b.setClickable(true);
            this.f20711b.f1985b.setBackgroundDrawable(act().drawable(e3c0.f));
        } else {
            this.f20711b.f1985b.setEnabled(false);
            this.f20711b.f1985b.setClickable(false);
            this.f20711b.f1985b.setBackgroundDrawable(act().drawable(e3c0.r1));
        }
        if (this.f20714e.f1277z == loopInputType2) {
            String strL = yij0.L(this.f20710a.f1993e.getText().toString());
            if (TextUtils.isEmpty(strL)) {
                return;
            }
            xdl0.M(this.f20710a.f1995g, true);
            this.f20710a.f1995g.setText(strL);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m23552p(LoopInputType loopInputType) {
        this.f20715f = loopInputType;
        LoopEditInfo loopEditInfoM1976o = LoopFragmentFactory.m1976o(loopInputType, m23550l().m1991a2().m2043u0(), act());
        this.f20716g = loopEditInfoM1976o;
        loopEditInfoM1976o.showTitle = true;
        if (this.f20714e.m2082V4() || this.f20714e.m2083W4()) {
            this.f20716g.setSubTitle("介绍一下你的性格特点、兴趣爱好、理想型等，让对方更了解你", false);
            this.f20716g.editHint = "添加自我介绍";
            if (this.f20714e.m2083W4()) {
                this.f20716g.couldInputEmpty = false;
            }
        }
        this.f20710a.m3531c(this.f20716g);
        if (this.f20714e.m2082V4() || this.f20714e.m2083W4()) {
            this.f20710a.f1990b.setTextColor(Color.parseColor("#999999"));
            this.f20710a.m3534f(t100.j, t100.o);
            this.f20710a.f1991c.setBackgroundResource(e3c0.t1);
            this.f20710a.f1993e.addTextChangedListener(new C0853a());
        }
        this.f20710a.m3533e(m23550l().m1991a2().m2043u0(), loopInputType);
        if (TextUtils.isEmpty(this.f20716g.defaultContent) && !this.f20716g.couldInputEmpty) {
            boolean zM2083W4 = this.f20714e.m2083W4();
            ProfileLoopActionLayout profileLoopActionLayout = this.f20711b;
            if (zM2083W4) {
                profileLoopActionLayout.m3528m();
                this.f20711b.f1986c.setEnabled(false);
            } else {
                profileLoopActionLayout.f1985b.setEnabled(false);
                this.f20711b.f1985b.setClickable(false);
                this.f20711b.f1985b.setBackgroundDrawable(act().drawable(e3c0.r1));
            }
        }
        if (!this.f20714e.m2083W4()) {
            e51.I(this.f20714e, new Runnable() { // from class: l.tma0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20305a.m23539n();
                }
            }, 300L);
        }
        m23546i();
    }

    /* JADX INFO: renamed from: q */
    public void m23553q() {
        LoopInputType loopInputType = this.f20715f;
        if (loopInputType == LoopInputType.INDUSTRY || loopInputType == LoopInputType.DEPARTMENT) {
            return;
        }
        zvf0.u("e_edit_specific_profile_next", loopInputType.pageId, new j760[]{vwb.Y("specific_edit_page_name", loopInputType.pageName)});
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.uma0$a */
    public class C0853a implements TextWatcher {
        public C0853a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            uma0.this.f20711b.m3526k();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
