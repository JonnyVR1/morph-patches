package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopEditInfo;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopTextInputFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditActionView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class yua0 implements iam<vua0> {

    /* JADX INFO: renamed from: a */
    public ProfileLoopEditActionView f201599a;

    /* JADX INFO: renamed from: b */
    public ProfileLoopActionLayout f201600b;

    /* JADX INFO: renamed from: c */
    public vua0 f201601c;

    /* JADX INFO: renamed from: d */
    public Context f201602d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopTextInputFrag f201603e;

    /* JADX INFO: renamed from: f */
    public LoopInputType f201604f;

    /* JADX INFO: renamed from: g */
    public LoopEditInfo f201605g;

    /* JADX INFO: renamed from: h */
    public String f201606h;

    public yua0(Context context, ProfileLoopTextInputFrag profileLoopTextInputFrag) {
        this.f201602d = context;
        this.f201603e = profileLoopTextInputFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m217362n() {
        this.f201599a.f35019e.requestFocus();
        act().showInput(this.f201599a.f35019e, 0);
    }

    /* JADX INFO: renamed from: r */
    private void m217363r() {
        if (this.f201603e.m52780W4()) {
            this.f201600b.m54153m();
        }
        this.f201600b.m54152l(this.f201603e);
        m217371l().m52692b2().m52731W0(this.f201603e);
        this.f201599a.setFrom(this.f201606h);
        this.f201599a.setInputTextChangeListener(new ProfileLoopEditActionView.InterfaceC8909b() { // from class: l.wua0
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditActionView.InterfaceC8909b
            /* JADX INFO: renamed from: a */
            public final void mo54161a(String str, String str2) {
                this.f190851a.m217372m(str, str2);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f201602d;
    }

    /* JADX INFO: renamed from: c */
    public View m217364c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zua0.m221606b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vua0 vua0Var) {
        this.f201601c = vua0Var;
    }

    /* JADX INFO: renamed from: e */
    public boolean m217366e() {
        Editable text = this.f201599a.f35019e.getText();
        return NullChecker.m82486a(text) && !TextUtils.isEmpty(text.toString());
    }

    /* JADX INFO: renamed from: f */
    public boolean m217367f(LoopInputType loopInputType) {
        String strMo34896ob = gta.m132210e().m132214d().mo34896ob(this.f201599a.f35019e.getText().toString().trim());
        if (!TextUtils.isEmpty(strMo34896ob)) {
            i4g0.m138493B("e_profile_unsuccessful", this.f201604f.pageId, jyb.m147494Y("about_me_finish_failed_reason", strMo34896ob));
            o1j0.m165651y(CoreModule.f18263b.getString(R$string.f28724k0));
            return false;
        }
        bnl0.m105524M(this.f201599a.f35021g, false);
        if (!TextUtils.isEmpty(bsj0.f78170j.call(this.f201599a.f35019e.getText()))) {
            o1j0.m165634h(R$string.f28636U2);
            return false;
        }
        if (loopInputType == LoopInputType.NICKNAME) {
            String strM106254L = bsj0.m106254L(this.f201599a.f35019e.getText().toString());
            if (!TextUtils.isEmpty(strM106254L)) {
                bnl0.m105524M(this.f201599a.f35021g, true);
                this.f201599a.f35021g.setText(strM106254L);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m217368i() {
        User userM52742u0 = m217371l().m52692b2().m52742u0();
        LoopInputType loopInputType = this.f201604f;
        if (loopInputType == LoopInputType.ABOUT_ME) {
            String str = userM52742u0.description;
            if (!TextUtils.isEmpty(str)) {
                this.f201599a.f35019e.setText(str);
            }
        } else if (loopInputType == LoopInputType.COMPANY) {
            String str2 = userM52742u0.profile.work.company;
            if (!TextUtils.isEmpty(str2)) {
                this.f201599a.f35019e.setText(str2);
            }
        } else if (loopInputType == LoopInputType.MAJOR) {
            String str3 = userM52742u0.profile.studies.major;
            if (!TextUtils.isEmpty(str3)) {
                this.f201599a.f35019e.setText(str3);
            }
        } else if (loopInputType == LoopInputType.SCHOOL) {
            String str4 = userM52742u0.profile.studies.school;
            if (!TextUtils.isEmpty(str4)) {
                this.f201599a.f35019e.setText(str4);
            }
        } else if (loopInputType == LoopInputType.NICKNAME) {
            String str5 = userM52742u0.name;
            if (!TextUtils.isEmpty(str5)) {
                this.f201599a.f35019e.setText(str5);
            }
        } else if (loopInputType == LoopInputType.SIGNATURE) {
            String str6 = userM52742u0.description;
            if (!TextUtils.isEmpty(str6)) {
                this.f201599a.f35019e.setText(str6);
            }
        } else if (loopInputType == LoopInputType.FAMILY) {
            String strM115830a = dhx.m115830a(userM52742u0.profile.extensions.mate.familyBackground);
            if (!TextUtils.isEmpty(strM115830a)) {
                this.f201599a.f35019e.setText(strM115830a);
            }
        } else if (loopInputType == LoopInputType.LOVE) {
            String strM115830a2 = dhx.m115830a(userM52742u0.profile.extensions.mate.loveView);
            if (!TextUtils.isEmpty(strM115830a2)) {
                this.f201599a.f35019e.setText(strM115830a2);
            }
        } else if (loopInputType == LoopInputType.HALF) {
            String strM115830a3 = dhx.m115830a(userM52742u0.profile.extensions.mate.idealPartner);
            if (!TextUtils.isEmpty(strM115830a3)) {
                this.f201599a.f35019e.setText(strM115830a3);
            }
        } else if (loopInputType == LoopInputType.INTEREST) {
            String strM115830a4 = dhx.m115830a(userM52742u0.profile.extensions.mate.hobbies);
            if (!TextUtils.isEmpty(strM115830a4)) {
                this.f201599a.f35019e.setText(strM115830a4);
            }
        } else if (loopInputType == LoopInputType.DO_NOT_WISH && tr90.m192430r(userM52742u0)) {
            this.f201599a.f35019e.setText(userM52742u0.profile.extensions.basic.unideal.get(0));
        }
        String string = this.f201599a.f35019e.getText().toString();
        if (!TextUtils.isEmpty(string) || this.f201605g.couldInputEmpty) {
            this.f201599a.f35019e.setSelection(string.length());
        } else {
            boolean zM52780W4 = this.f201603e.m52780W4();
            ProfileLoopActionLayout profileLoopActionLayout = this.f201600b;
            if (zM52780W4) {
                profileLoopActionLayout.m54153m();
                this.f201600b.f35012c.setEnabled(false);
            } else {
                profileLoopActionLayout.f35011b.setEnabled(false);
                this.f201600b.f35011b.setClickable(false);
                this.f201600b.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124906r1));
            }
        }
        if (xra.m212787f() && this.f201603e.m52778U4()) {
            String strM192426m = tr90.m192426m(this.f201603e.f34303z);
            bnl0.m105540X(this.f201599a.f35015a, 0);
            boolean zIsEmpty = TextUtils.isEmpty(strM192426m);
            ProfileLoopEditActionView profileLoopEditActionView = this.f201599a;
            if (zIsEmpty) {
                bnl0.m105537U(profileLoopEditActionView.f35015a, qa00.m175859d(32.0f));
                return;
            }
            bnl0.m105524M(profileLoopEditActionView.f35016b, true);
            bnl0.m105540X(this.f201599a.f35016b, qa00.m175859d(12.0f));
            bnl0.m105537U(this.f201599a.f35016b, qa00.m175859d(20.0f));
            this.f201599a.f35016b.setTextSize(15.0f);
            this.f201599a.f35016b.setTextColor(Color.parseColor("#a9a9a9"));
            this.f201599a.f35016b.setText(String.format("预计符合%s人的理想型", strM192426m));
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM217364c = m217364c(layoutInflater, viewGroup);
        m217363r();
        return viewM217364c;
    }

    /* JADX INFO: renamed from: j */
    public void m217369j(User user) {
        String strM147516k = jyb.m147516k(this.f201599a.f35019e.getText().toString().trim());
        LoopInputType loopInputType = this.f201604f;
        if (loopInputType == LoopInputType.ABOUT_ME) {
            user.description = strM147516k;
            return;
        }
        if (loopInputType == LoopInputType.COMPANY) {
            user.profile.work.company = strM147516k;
            return;
        }
        if (loopInputType == LoopInputType.MAJOR) {
            user.profile.studies.major = strM147516k;
            return;
        }
        if (loopInputType == LoopInputType.SCHOOL) {
            user.profile.studies.school = strM147516k;
            return;
        }
        if (loopInputType == LoopInputType.NICKNAME) {
            user.name = strM147516k;
            return;
        }
        if (loopInputType == LoopInputType.SIGNATURE) {
            user.description = strM147516k;
            return;
        }
        if (loopInputType == LoopInputType.FAMILY) {
            dhx.m115831b(user.profile.extensions.mate.familyBackground, strM147516k);
            return;
        }
        if (loopInputType == LoopInputType.HALF) {
            dhx.m115831b(user.profile.extensions.mate.idealPartner, strM147516k);
            return;
        }
        if (loopInputType == LoopInputType.INTEREST) {
            dhx.m115831b(user.profile.extensions.mate.hobbies, strM147516k);
            return;
        }
        if (loopInputType == LoopInputType.LOVE) {
            dhx.m115831b(user.profile.extensions.mate.loveView, strM147516k);
        } else if (loopInputType == LoopInputType.DO_NOT_WISH) {
            user.profile.extensions.basic.unideal = jyb.m147507f0(strM147516k);
        }
    }

    /* JADX INFO: renamed from: k */
    public Bundle m217370k() {
        return this.f201603e.getArguments();
    }

    /* JADX INFO: renamed from: l */
    public ProfileInfoLoopEditAct m217371l() {
        return (ProfileInfoLoopEditAct) this.f201602d;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m217372m(String str, String str2) {
        if (!TextUtils.isEmpty(str2) || (TextUtils.isEmpty(str) && !this.f201605g.couldInputEmpty)) {
            boolean zM52780W4 = this.f201603e.m52780W4();
            ProfileLoopActionLayout profileLoopActionLayout = this.f201600b;
            if (zM52780W4) {
                profileLoopActionLayout.m54153m();
                this.f201600b.f35012c.setEnabled(false);
                return;
            } else {
                profileLoopActionLayout.f35011b.setEnabled(false);
                this.f201600b.f35011b.setClickable(false);
                this.f201600b.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124906r1));
                return;
            }
        }
        LoopInputType loopInputType = this.f201604f;
        LoopInputType loopInputType2 = LoopInputType.NICKNAME;
        if (loopInputType == loopInputType2) {
            boolean zIsEmpty = TextUtils.isEmpty(bsj0.m106254L(str));
            ProfileLoopActionLayout profileLoopActionLayout2 = this.f201600b;
            if (zIsEmpty) {
                profileLoopActionLayout2.f35011b.setEnabled(true);
                this.f201600b.f35011b.setClickable(true);
                this.f201600b.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124866f));
            } else {
                profileLoopActionLayout2.f35011b.setEnabled(false);
                this.f201600b.f35011b.setClickable(false);
                this.f201600b.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124906r1));
            }
        } else if (!TextUtils.isEmpty(str.trim()) || (this.f201605g.couldInputEmpty && !TextUtils.equals(m217371l().m52692b2().getFrom(), CoreStaticData.ProfileFromType.FROM_FILTER_PURPOSE_DIALOG))) {
            this.f201600b.f35011b.setEnabled(true);
            this.f201600b.f35011b.setClickable(true);
            this.f201600b.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124866f));
        } else {
            this.f201600b.f35011b.setEnabled(false);
            this.f201600b.f35011b.setClickable(false);
            this.f201600b.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124906r1));
        }
        if (this.f201603e.f34303z == loopInputType2) {
            String strM106254L = bsj0.m106254L(this.f201599a.f35019e.getText().toString());
            if (TextUtils.isEmpty(strM106254L)) {
                return;
            }
            bnl0.m105524M(this.f201599a.f35021g, true);
            this.f201599a.f35021g.setText(strM106254L);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m217373p(LoopInputType loopInputType) {
        this.f201604f = loopInputType;
        LoopEditInfo loopEditInfoM52677o = LoopFragmentFactory.m52677o(loopInputType, m217371l().m52692b2().m52742u0(), act());
        this.f201605g = loopEditInfoM52677o;
        loopEditInfoM52677o.showTitle = true;
        if (this.f201603e.m52779V4() || this.f201603e.m52780W4()) {
            this.f201605g.setSubTitle("介绍一下你的性格特点、兴趣爱好、理想型等，让对方更了解你", false);
            this.f201605g.editHint = "添加自我介绍";
            if (this.f201603e.m52780W4()) {
                this.f201605g.couldInputEmpty = false;
            }
        }
        this.f201599a.m54156c(this.f201605g);
        if (this.f201603e.m52779V4() || this.f201603e.m52780W4()) {
            this.f201599a.f35016b.setTextColor(Color.parseColor("#999999"));
            this.f201599a.m54159f(qa00.f156323j, qa00.f156328o);
            this.f201599a.f35017c.setBackgroundResource(kbc0.f124912t1);
            this.f201599a.f35019e.addTextChangedListener(new C21685a());
        }
        this.f201599a.m54158e(m217371l().m52692b2().m52742u0(), loopInputType);
        if (TextUtils.isEmpty(this.f201605g.defaultContent) && !this.f201605g.couldInputEmpty) {
            boolean zM52780W4 = this.f201603e.m52780W4();
            ProfileLoopActionLayout profileLoopActionLayout = this.f201600b;
            if (zM52780W4) {
                profileLoopActionLayout.m54153m();
                this.f201600b.f35012c.setEnabled(false);
            } else {
                profileLoopActionLayout.f35011b.setEnabled(false);
                this.f201600b.f35011b.setClickable(false);
                this.f201600b.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124906r1));
            }
        }
        if (!this.f201603e.m52780W4()) {
            l51.m152889I(this.f201603e, new Runnable() { // from class: l.xua0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f196269a.m217362n();
                }
            }, 300L);
        }
        m217368i();
    }

    /* JADX INFO: renamed from: q */
    public void m217374q() {
        LoopInputType loopInputType = this.f201604f;
        if (loopInputType == LoopInputType.INDUSTRY || loopInputType == LoopInputType.DEPARTMENT) {
            return;
        }
        i4g0.m138523u("e_edit_specific_profile_next", loopInputType.pageId, jyb.m147494Y("specific_edit_page_name", loopInputType.pageName));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.yua0$a */
    public class C21685a implements TextWatcher {
        public C21685a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            yua0.this.f201600b.m54151k();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
