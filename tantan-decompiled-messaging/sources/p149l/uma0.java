package p149l;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopEditInfo;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopTextInputFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditActionView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class uma0 implements s7m<rma0> {

    /* JADX INFO: renamed from: a */
    public ProfileLoopEditActionView f177211a;

    /* JADX INFO: renamed from: b */
    public ProfileLoopActionLayout f177212b;

    /* JADX INFO: renamed from: c */
    public rma0 f177213c;

    /* JADX INFO: renamed from: d */
    public Context f177214d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopTextInputFrag f177215e;

    /* JADX INFO: renamed from: f */
    public LoopInputType f177216f;

    /* JADX INFO: renamed from: g */
    public LoopEditInfo f177217g;

    /* JADX INFO: renamed from: h */
    public String f177218h;

    public uma0(Context context, ProfileLoopTextInputFrag profileLoopTextInputFrag) {
        this.f177214d = context;
        this.f177215e = profileLoopTextInputFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m194328n() {
        this.f177211a.f34171e.requestFocus();
        act().showInput(this.f177211a.f34171e, 0);
    }

    /* JADX INFO: renamed from: r */
    private void m194329r() {
        if (this.f177215e.m51597W4()) {
            this.f177212b.m52970m();
        }
        this.f177212b.m52969l(this.f177215e);
        m194337l().m51509a2().m51548W0(this.f177215e);
        this.f177211a.setFrom(this.f177218h);
        this.f177211a.setInputTextChangeListener(new ProfileLoopEditActionView.InterfaceC8746b() { // from class: l.sma0
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditActionView.InterfaceC8746b
            /* JADX INFO: renamed from: a */
            public final void mo52978a(String str, String str2) {
                this.f165336a.m194338m(str, str2);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f177214d;
    }

    /* JADX INFO: renamed from: c */
    public View m194330c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vma0.m198906b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rma0 rma0Var) {
        this.f177213c = rma0Var;
    }

    /* JADX INFO: renamed from: e */
    public boolean m194332e() {
        Editable text = this.f177211a.f34171e.getText();
        return NullChecker.m81303a(text) && !TextUtils.isEmpty(text.toString());
    }

    /* JADX INFO: renamed from: f */
    public boolean m194333f(LoopInputType loopInputType) {
        String strMo33893ob = ura.m195053e().m195057d().mo33893ob(this.f177211a.f34171e.getText().toString().trim());
        if (!TextUtils.isEmpty(strMo33893ob)) {
            zvf0.m220369B("e_profile_unsuccessful", this.f177216f.pageId, vwb.m200311Y("about_me_finish_failed_reason", strMo33893ob));
            lsi0.m151595y(CoreModule.f17544b.getString(R$string.f27876k0));
            return false;
        }
        xdl0.m208344M(this.f177211a.f34173g, false);
        if (!TextUtils.isEmpty(yij0.f198513j.call(this.f177211a.f34171e.getText()))) {
            lsi0.m151578h(R$string.f27788U2);
            return false;
        }
        if (loopInputType == LoopInputType.NICKNAME) {
            String strM214934L = yij0.m214934L(this.f177211a.f34171e.getText().toString());
            if (!TextUtils.isEmpty(strM214934L)) {
                xdl0.m208344M(this.f177211a.f34173g, true);
                this.f177211a.f34173g.setText(strM214934L);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m194334i() {
        User userM51559u0 = m194337l().m51509a2().m51559u0();
        LoopInputType loopInputType = this.f177216f;
        if (loopInputType == LoopInputType.ABOUT_ME) {
            String str = userM51559u0.description;
            if (!TextUtils.isEmpty(str)) {
                this.f177211a.f34171e.setText(str);
            }
        } else if (loopInputType == LoopInputType.COMPANY) {
            String str2 = userM51559u0.profile.work.company;
            if (!TextUtils.isEmpty(str2)) {
                this.f177211a.f34171e.setText(str2);
            }
        } else if (loopInputType == LoopInputType.MAJOR) {
            String str3 = userM51559u0.profile.studies.major;
            if (!TextUtils.isEmpty(str3)) {
                this.f177211a.f34171e.setText(str3);
            }
        } else if (loopInputType == LoopInputType.SCHOOL) {
            String str4 = userM51559u0.profile.studies.school;
            if (!TextUtils.isEmpty(str4)) {
                this.f177211a.f34171e.setText(str4);
            }
        } else if (loopInputType == LoopInputType.NICKNAME) {
            String str5 = userM51559u0.name;
            if (!TextUtils.isEmpty(str5)) {
                this.f177211a.f34171e.setText(str5);
            }
        } else if (loopInputType == LoopInputType.SIGNATURE) {
            String str6 = userM51559u0.description;
            if (!TextUtils.isEmpty(str6)) {
                this.f177211a.f34171e.setText(str6);
            }
        } else if (loopInputType == LoopInputType.FAMILY) {
            String strM116013a = eex.m116013a(userM51559u0.profile.extensions.mate.familyBackground);
            if (!TextUtils.isEmpty(strM116013a)) {
                this.f177211a.f34171e.setText(strM116013a);
            }
        } else if (loopInputType == LoopInputType.LOVE) {
            String strM116013a2 = eex.m116013a(userM51559u0.profile.extensions.mate.loveView);
            if (!TextUtils.isEmpty(strM116013a2)) {
                this.f177211a.f34171e.setText(strM116013a2);
            }
        } else if (loopInputType == LoopInputType.HALF) {
            String strM116013a3 = eex.m116013a(userM51559u0.profile.extensions.mate.idealPartner);
            if (!TextUtils.isEmpty(strM116013a3)) {
                this.f177211a.f34171e.setText(strM116013a3);
            }
        } else if (loopInputType == LoopInputType.INTEREST) {
            String strM116013a4 = eex.m116013a(userM51559u0.profile.extensions.mate.hobbies);
            if (!TextUtils.isEmpty(strM116013a4)) {
                this.f177211a.f34171e.setText(strM116013a4);
            }
        } else if (loopInputType == LoopInputType.DO_NOT_WISH && pj90.m169805r(userM51559u0)) {
            this.f177211a.f34171e.setText(userM51559u0.profile.extensions.basic.unideal.get(0));
        }
        String string = this.f177211a.f34171e.getText().toString();
        if (!TextUtils.isEmpty(string) || this.f177217g.couldInputEmpty) {
            this.f177211a.f34171e.setSelection(string.length());
        } else {
            boolean zM51597W4 = this.f177215e.m51597W4();
            ProfileLoopActionLayout profileLoopActionLayout = this.f177212b;
            if (zM51597W4) {
                profileLoopActionLayout.m52970m();
                this.f177212b.f34164c.setEnabled(false);
            } else {
                profileLoopActionLayout.f34163b.setEnabled(false);
                this.f177212b.f34163b.setClickable(false);
                this.f177212b.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89143r1));
            }
        }
        if (lqa.m150968f() && this.f177215e.m51595U4()) {
            String strM169801m = pj90.m169801m(this.f177215e.f33455z);
            xdl0.m208360X(this.f177211a.f34167a, 0);
            boolean zIsEmpty = TextUtils.isEmpty(strM169801m);
            ProfileLoopEditActionView profileLoopEditActionView = this.f177211a;
            if (zIsEmpty) {
                xdl0.m208357U(profileLoopEditActionView.f34167a, t100.m186890d(32.0f));
                return;
            }
            xdl0.m208344M(profileLoopEditActionView.f34168b, true);
            xdl0.m208360X(this.f177211a.f34168b, t100.m186890d(12.0f));
            xdl0.m208357U(this.f177211a.f34168b, t100.m186890d(20.0f));
            this.f177211a.f34168b.setTextSize(15.0f);
            this.f177211a.f34168b.setTextColor(Color.parseColor("#a9a9a9"));
            this.f177211a.f34168b.setText(String.format("预计符合%s人的理想型", strM169801m));
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM194330c = m194330c(layoutInflater, viewGroup);
        m194329r();
        return viewM194330c;
    }

    /* JADX INFO: renamed from: j */
    public void m194335j(User user) {
        String strM200333k = vwb.m200333k(this.f177211a.f34171e.getText().toString().trim());
        LoopInputType loopInputType = this.f177216f;
        if (loopInputType == LoopInputType.ABOUT_ME) {
            user.description = strM200333k;
            return;
        }
        if (loopInputType == LoopInputType.COMPANY) {
            user.profile.work.company = strM200333k;
            return;
        }
        if (loopInputType == LoopInputType.MAJOR) {
            user.profile.studies.major = strM200333k;
            return;
        }
        if (loopInputType == LoopInputType.SCHOOL) {
            user.profile.studies.school = strM200333k;
            return;
        }
        if (loopInputType == LoopInputType.NICKNAME) {
            user.name = strM200333k;
            return;
        }
        if (loopInputType == LoopInputType.SIGNATURE) {
            user.description = strM200333k;
            return;
        }
        if (loopInputType == LoopInputType.FAMILY) {
            eex.m116014b(user.profile.extensions.mate.familyBackground, strM200333k);
            return;
        }
        if (loopInputType == LoopInputType.HALF) {
            eex.m116014b(user.profile.extensions.mate.idealPartner, strM200333k);
            return;
        }
        if (loopInputType == LoopInputType.INTEREST) {
            eex.m116014b(user.profile.extensions.mate.hobbies, strM200333k);
            return;
        }
        if (loopInputType == LoopInputType.LOVE) {
            eex.m116014b(user.profile.extensions.mate.loveView, strM200333k);
        } else if (loopInputType == LoopInputType.DO_NOT_WISH) {
            user.profile.extensions.basic.unideal = vwb.m200324f0(strM200333k);
        }
    }

    /* JADX INFO: renamed from: k */
    public Bundle m194336k() {
        return this.f177215e.getArguments();
    }

    /* JADX INFO: renamed from: l */
    public ProfileInfoLoopEditAct m194337l() {
        return (ProfileInfoLoopEditAct) this.f177214d;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m194338m(String str, String str2) {
        if (!TextUtils.isEmpty(str2) || (TextUtils.isEmpty(str) && !this.f177217g.couldInputEmpty)) {
            boolean zM51597W4 = this.f177215e.m51597W4();
            ProfileLoopActionLayout profileLoopActionLayout = this.f177212b;
            if (zM51597W4) {
                profileLoopActionLayout.m52970m();
                this.f177212b.f34164c.setEnabled(false);
                return;
            } else {
                profileLoopActionLayout.f34163b.setEnabled(false);
                this.f177212b.f34163b.setClickable(false);
                this.f177212b.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89143r1));
                return;
            }
        }
        LoopInputType loopInputType = this.f177216f;
        LoopInputType loopInputType2 = LoopInputType.NICKNAME;
        if (loopInputType == loopInputType2) {
            boolean zIsEmpty = TextUtils.isEmpty(yij0.m214934L(str));
            ProfileLoopActionLayout profileLoopActionLayout2 = this.f177212b;
            if (zIsEmpty) {
                profileLoopActionLayout2.f34163b.setEnabled(true);
                this.f177212b.f34163b.setClickable(true);
                this.f177212b.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89103f));
            } else {
                profileLoopActionLayout2.f34163b.setEnabled(false);
                this.f177212b.f34163b.setClickable(false);
                this.f177212b.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89143r1));
            }
        } else if (!TextUtils.isEmpty(str.trim()) || (this.f177217g.couldInputEmpty && !TextUtils.equals(m194337l().m51509a2().getFrom(), CoreStaticData.ProfileFromType.FROM_FILTER_PURPOSE_DIALOG))) {
            this.f177212b.f34163b.setEnabled(true);
            this.f177212b.f34163b.setClickable(true);
            this.f177212b.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89103f));
        } else {
            this.f177212b.f34163b.setEnabled(false);
            this.f177212b.f34163b.setClickable(false);
            this.f177212b.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89143r1));
        }
        if (this.f177215e.f33455z == loopInputType2) {
            String strM214934L = yij0.m214934L(this.f177211a.f34171e.getText().toString());
            if (TextUtils.isEmpty(strM214934L)) {
                return;
            }
            xdl0.m208344M(this.f177211a.f34173g, true);
            this.f177211a.f34173g.setText(strM214934L);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m194339p(LoopInputType loopInputType) {
        this.f177216f = loopInputType;
        LoopEditInfo loopEditInfoM51494o = LoopFragmentFactory.m51494o(loopInputType, m194337l().m51509a2().m51559u0(), act());
        this.f177217g = loopEditInfoM51494o;
        loopEditInfoM51494o.showTitle = true;
        if (this.f177215e.m51596V4() || this.f177215e.m51597W4()) {
            this.f177217g.setSubTitle("介绍一下你的性格特点、兴趣爱好、理想型等，让对方更了解你", false);
            this.f177217g.editHint = "添加自我介绍";
            if (this.f177215e.m51597W4()) {
                this.f177217g.couldInputEmpty = false;
            }
        }
        this.f177211a.m52973c(this.f177217g);
        if (this.f177215e.m51596V4() || this.f177215e.m51597W4()) {
            this.f177211a.f34168b.setTextColor(Color.parseColor("#999999"));
            this.f177211a.m52976f(t100.f167261j, t100.f167266o);
            this.f177211a.f34169c.setBackgroundResource(e3c0.f89149t1);
            this.f177211a.f34171e.addTextChangedListener(new C20458a());
        }
        this.f177211a.m52975e(m194337l().m51509a2().m51559u0(), loopInputType);
        if (TextUtils.isEmpty(this.f177217g.defaultContent) && !this.f177217g.couldInputEmpty) {
            boolean zM51597W4 = this.f177215e.m51597W4();
            ProfileLoopActionLayout profileLoopActionLayout = this.f177212b;
            if (zM51597W4) {
                profileLoopActionLayout.m52970m();
                this.f177212b.f34164c.setEnabled(false);
            } else {
                profileLoopActionLayout.f34163b.setEnabled(false);
                this.f177212b.f34163b.setClickable(false);
                this.f177212b.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89143r1));
            }
        }
        if (!this.f177215e.m51597W4()) {
            e51.m114744I(this.f177215e, new Runnable() { // from class: l.tma0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171143a.m194328n();
                }
            }, 300L);
        }
        m194334i();
    }

    /* JADX INFO: renamed from: q */
    public void m194340q() {
        LoopInputType loopInputType = this.f177216f;
        if (loopInputType == LoopInputType.INDUSTRY || loopInputType == LoopInputType.DEPARTMENT) {
            return;
        }
        zvf0.m220399u("e_edit_specific_profile_next", loopInputType.pageId, vwb.m200311Y("specific_edit_page_name", loopInputType.pageName));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.uma0$a */
    public class C20458a implements TextWatcher {
        public C20458a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            uma0.this.f177212b.m52968k();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
