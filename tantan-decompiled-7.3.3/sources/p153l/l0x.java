package p153l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.view.AboutMeNewCaseLayout;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class l0x extends hzw<i0x> {

    /* JADX INFO: renamed from: c */
    public VLinear f129608c;

    /* JADX INFO: renamed from: d */
    public VText f129609d;

    /* JADX INFO: renamed from: e */
    public VText f129610e;

    /* JADX INFO: renamed from: f */
    public VFrame f129611f;

    /* JADX INFO: renamed from: g */
    public VEditText f129612g;

    /* JADX INFO: renamed from: h */
    public TextView f129613h;

    /* JADX INFO: renamed from: i */
    public TextView f129614i;

    /* JADX INFO: renamed from: j */
    public AboutMeNewCaseLayout f129615j;

    /* JADX INFO: renamed from: k */
    public VLinear f129616k;

    /* JADX INFO: renamed from: l */
    public TextView f129617l;

    /* JADX INFO: renamed from: m */
    public TextView f129618m;

    /* JADX INFO: renamed from: n */
    public int f129619n;

    /* JADX INFO: renamed from: o */
    public int f129620o;

    public l0x(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
        this.f129619n = 0;
        this.f129620o = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m152395u() {
        act().showInput(this.f129612g, 0);
        try {
            if (TextUtils.isEmpty(this.f129612g.getText()) || this.f129612g.getText().toString().length() <= 0) {
                return;
            }
            VEditText vEditText = this.f129612g;
            vEditText.setSelection(vEditText.getText().length());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: b */
    public boolean mo95575b(MarrySeriesType marrySeriesType, User user) {
        if (!NullChecker.m82486a(this.f129612g.getText())) {
            return true;
        }
        int length = this.f129612g.getText().toString().trim().length();
        int i = this.f129620o;
        if (length >= i) {
            return true;
        }
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
            r1j0.m179420g(String.format("请至少用%d个字介绍一下你自己", Integer.valueOf(i)));
            return false;
        }
        r1j0.m179420g(String.format("请至少填写%d个字，请勿凑字数或填写无关内容", Integer.valueOf(i)));
        return false;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return NullChecker.m82486a(this.f129612g.getText()) && !TextUtils.isEmpty(this.f129612g.getText().toString().trim());
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: d */
    public pf60<Boolean, String> mo137939d(MarrySeriesType marrySeriesType) {
        if (marrySeriesType == MarrySeriesType.NICK_NAME && !TextUtils.isEmpty(this.f129612g.getText())) {
            String strM106254L = bsj0.m106254L(this.f129612g.getText().toString());
            if (!TextUtils.isEmpty(strM106254L)) {
                return pf60.m172085a(Boolean.FALSE, strM106254L);
            }
        }
        return super.mo137939d(marrySeriesType);
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        String strTrim = (!NullChecker.m82486a(this.f129612g.getText()) || TextUtils.isEmpty(this.f129612g.getText().toString())) ? "" : this.f129612g.getText().toString().trim();
        user.nullCheck();
        user.profile.nullCheck();
        user.profile.extensions.nullCheck();
        if (marrySeriesType == MarrySeriesType.DECLARATION) {
            user.profile.extensions.marriage.nullCheck();
            user.profile.extensions.marriage.declaration = jyb.m147482M(strTrim);
            return;
        }
        if (marrySeriesType == MarrySeriesType.FAMILY_BACKGROUND) {
            user.profile.extensions.basic.nullCheck();
            user.profile.extensions.basic.familyBackground = jyb.m147482M(strTrim);
            return;
        }
        if (marrySeriesType == MarrySeriesType.BRIDE_PRICE) {
            user.profile.extensions.marriage.nullCheck();
            user.profile.extensions.marriage.bridePrice = jyb.m147482M(strTrim);
        } else {
            if (marrySeriesType == MarrySeriesType.NICK_NAME) {
                user.name = strTrim;
                return;
            }
            if (marrySeriesType == MarrySeriesType.PROLOGUE) {
                user.profile.extensions.marriage.nullCheck();
                user.profile.extensions.marriage.prologue = jyb.m147482M(strTrim);
            } else if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
                user.description = strTrim;
            }
        }
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(final MarrySeriesType marrySeriesType, User user) {
        String marriagePrologue;
        bnl0.m105524M(this.f129614i, false);
        this.f129609d.setTypeface(lyh0.m156283c(3), 1);
        this.f129609d.setText(marrySeriesType.getTitleName());
        this.f129612g.addTextChangedListener(new C18330a());
        this.f129612g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.j0x
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f117893a.m152399s(marrySeriesType, view, z);
            }
        });
        this.f129612g.setHint("添加" + marrySeriesType.getTitleName());
        if (marrySeriesType == MarrySeriesType.DECLARATION) {
            this.f129610e.setText("介绍一下你的工作&生活状态、处事风格、优缺点、成长、求学经历等…");
            this.f129618m.setText("ENTP直女一枚，父母均为公务员还未退休，在北京工作7年有余，是个有事业心的恋爱脑，如果有共同目标也期待和另一半一起创业，喜欢小孩但也可以接受丁克");
            this.f129612g.setHint("认真介绍一下自己，让心仪的人更了解你");
            marriagePrologue = user.getMarriageDeclaration();
            this.f129619n = 300;
            this.f129620o = 20;
        } else if (marrySeriesType == MarrySeriesType.FAMILY_BACKGROUND) {
            this.f129610e.setText("介绍一下你的父母职业、兄弟姐妹情况，帮你找到门当户对的另一半");
            this.f129618m.setText("独生子女，生长在小康家庭，父亲是老师，妈妈是家庭主妇，两位老人性格都比较温和，小有存款可支持在婚前购房");
            this.f129612g.setHint("认真介绍一下你的家庭背景，让心仪的人更了解你");
            marriagePrologue = user.getMarriageFamilyBackground();
            this.f129619n = 300;
            this.f129620o = 20;
        } else if (marrySeriesType == MarrySeriesType.BRIDE_PRICE) {
            this.f129610e.setText("关于婚礼和彩礼，你有什么样的主张？");
            this.f129618m.setText("如果是真心想要过一辈子的人，彩礼不会是我们在一起的阻碍，到时候可以双方商量。彩礼也是为我们的小家的积累建设基金。本人对婚礼形式没有太多要求，只要是和对的人一起用心布置就可以。");
            this.f129612g.setHint("说说你对婚礼/彩礼的想法");
            marriagePrologue = user.getMarriageFamilyBridePrice();
            this.f129619n = 300;
        } else if (marrySeriesType == MarrySeriesType.NICK_NAME) {
            bnl0.m105524M(this.f129610e, false);
            bnl0.m105524M(this.f129616k, false);
            marriagePrologue = user.name;
            this.f129619n = 50;
            this.f129620o = 1;
        } else if (marrySeriesType == MarrySeriesType.PROLOGUE) {
            this.f129610e.setText("设置一段专属的开场白，让对方更加了解你");
            bnl0.m105524M(this.f129616k, false);
            marriagePrologue = user.getMarriagePrologue();
            if (TextUtils.isEmpty(marriagePrologue)) {
                marriagePrologue = f2x.m123681a(user);
            }
            this.f129619n = 300;
            this.f129620o = 20;
        } else if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
            String strM197489n3 = CoreModule.f18264c.f20419q2.m197489n3();
            if (!TextUtils.isEmpty(user.description) && !TextUtils.isEmpty(strM197489n3) && !gta.m132210e().m132214d().mo34802am()) {
                bnl0.m105524M(this.f129614i, true);
                this.f129614i.setText(strM197489n3 + " ，请修改");
            }
            boolean zM48638c2 = act().m48638c2();
            VText vText = this.f129610e;
            if (zM48638c2) {
                vText.setText("请至少用15个字介绍一下你的性格特点、兴趣爱好等");
            } else {
                vText.setText("介绍一下你的性格特点、兴趣爱好、理想型等，让对方更了解你");
            }
            this.f129617l.setText("这样写更受欢迎：");
            boolean zIsFemale = user.isFemale();
            TextView textView = this.f129618m;
            if (zIsFemale) {
                textView.setText("enfp，性格开朗、喜欢结交新朋友。\n喜欢跳舞、美食、宠物，热爱自由。\n想要认识一位真诚恋爱的男性，希望你温柔稳重、认真对待感情。");
            } else {
                textView.setText("enfp，直率、真诚、靠谱。\n喜欢滑雪、徒步，一直坚持锻炼。\n希望认识一个认真恋爱的女孩儿，一起分享美好。");
            }
            marriagePrologue = user.description;
            this.f129619n = 300;
            this.f129620o = 15;
        } else {
            marriagePrologue = "";
        }
        this.f129612g.setText(marriagePrologue);
        int i = this.f129619n;
        if (i > 0) {
            this.f129612g.setMaxLength(i);
            m152400v(this.f129619n, marriagePrologue);
        }
        if (m137940f().m48681P4()) {
            l51.m152886F(act(), new Runnable() { // from class: l.k0x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123433a.m152395u();
                }
            });
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m152396n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m152396n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m0x.m156545b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public String m152398q() {
        return this.f129612g.getText().toString();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m152399s(MarrySeriesType marrySeriesType, View view, boolean z) {
        if (z && marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
            bnl0.m105524M(this.f129614i, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m152400v(int i, String str) {
        if (str == null) {
            str = "";
        }
        if (str.length() > 0 && TextUtils.isEmpty(str.trim())) {
            this.f129612g.setText("");
            this.f129612g.setSelection(0);
        }
        this.f129613h.setText((i - str.toString().length()) + "");
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(i0x i0xVar) {
    }

    /* JADX INFO: renamed from: l.l0x$a */
    public class C18330a implements TextWatcher {
        public C18330a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null) {
                return;
            }
            l0x l0xVar = l0x.this;
            l0xVar.m152400v(l0xVar.f129619n, editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
