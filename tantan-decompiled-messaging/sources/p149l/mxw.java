package p149l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.view.AboutMeNewCaseLayout;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class mxw extends iww<jxw> {

    /* JADX INFO: renamed from: c */
    public VLinear f136217c;

    /* JADX INFO: renamed from: d */
    public VText f136218d;

    /* JADX INFO: renamed from: e */
    public VText f136219e;

    /* JADX INFO: renamed from: f */
    public VFrame f136220f;

    /* JADX INFO: renamed from: g */
    public VEditText f136221g;

    /* JADX INFO: renamed from: h */
    public TextView f136222h;

    /* JADX INFO: renamed from: i */
    public TextView f136223i;

    /* JADX INFO: renamed from: j */
    public AboutMeNewCaseLayout f136224j;

    /* JADX INFO: renamed from: k */
    public VLinear f136225k;

    /* JADX INFO: renamed from: l */
    public TextView f136226l;

    /* JADX INFO: renamed from: m */
    public TextView f136227m;

    /* JADX INFO: renamed from: n */
    public int f136228n;

    /* JADX INFO: renamed from: o */
    public int f136229o;

    public mxw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
        this.f136228n = 0;
        this.f136229o = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m156937u() {
        act().showInput(this.f136221g, 0);
        try {
            if (TextUtils.isEmpty(this.f136221g.getText()) || this.f136221g.getText().toString().length() <= 0) {
                return;
            }
            VEditText vEditText = this.f136221g;
            vEditText.setSelection(vEditText.getText().length());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: b */
    public boolean mo104515b(MarrySeriesType marrySeriesType, User user) {
        if (!NullChecker.m81303a(this.f136221g.getText())) {
            return true;
        }
        int length = this.f136221g.getText().toString().trim().length();
        int i = this.f136229o;
        if (length >= i) {
            return true;
        }
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
            osi0.m165783g(String.format("请至少用%d个字介绍一下你自己", Integer.valueOf(i)));
            return false;
        }
        osi0.m165783g(String.format("请至少填写%d个字，请勿凑字数或填写无关内容", Integer.valueOf(i)));
        return false;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return NullChecker.m81303a(this.f136221g.getText()) && !TextUtils.isEmpty(this.f136221g.getText().toString().trim());
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: d */
    public j760<Boolean, String> mo138776d(MarrySeriesType marrySeriesType) {
        if (marrySeriesType == MarrySeriesType.NICK_NAME && !TextUtils.isEmpty(this.f136221g.getText())) {
            String strM214934L = yij0.m214934L(this.f136221g.getText().toString());
            if (!TextUtils.isEmpty(strM214934L)) {
                return j760.m140076a(Boolean.FALSE, strM214934L);
            }
        }
        return super.mo138776d(marrySeriesType);
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        String strTrim = (!NullChecker.m81303a(this.f136221g.getText()) || TextUtils.isEmpty(this.f136221g.getText().toString())) ? "" : this.f136221g.getText().toString().trim();
        user.nullCheck();
        user.profile.nullCheck();
        user.profile.extensions.nullCheck();
        if (marrySeriesType == MarrySeriesType.DECLARATION) {
            user.profile.extensions.marriage.nullCheck();
            user.profile.extensions.marriage.declaration = vwb.m200299M(strTrim);
            return;
        }
        if (marrySeriesType == MarrySeriesType.FAMILY_BACKGROUND) {
            user.profile.extensions.basic.nullCheck();
            user.profile.extensions.basic.familyBackground = vwb.m200299M(strTrim);
            return;
        }
        if (marrySeriesType == MarrySeriesType.BRIDE_PRICE) {
            user.profile.extensions.marriage.nullCheck();
            user.profile.extensions.marriage.bridePrice = vwb.m200299M(strTrim);
        } else {
            if (marrySeriesType == MarrySeriesType.NICK_NAME) {
                user.name = strTrim;
                return;
            }
            if (marrySeriesType == MarrySeriesType.PROLOGUE) {
                user.profile.extensions.marriage.nullCheck();
                user.profile.extensions.marriage.prologue = vwb.m200299M(strTrim);
            } else if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
                user.description = strTrim;
            }
        }
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(final MarrySeriesType marrySeriesType, User user) {
        String marriagePrologue;
        xdl0.m208344M(this.f136223i, false);
        this.f136218d.setTypeface(eqh0.m117752c(3), 1);
        this.f136218d.setText(marrySeriesType.getTitleName());
        this.f136221g.addTextChangedListener(new C18586a());
        this.f136221g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.kxw
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f125230a.m156941s(marrySeriesType, view, z);
            }
        });
        this.f136221g.setHint("添加" + marrySeriesType.getTitleName());
        if (marrySeriesType == MarrySeriesType.DECLARATION) {
            this.f136219e.setText("介绍一下你的工作&生活状态、处事风格、优缺点、成长、求学经历等…");
            this.f136227m.setText("ENTP直女一枚，父母均为公务员还未退休，在北京工作7年有余，是个有事业心的恋爱脑，如果有共同目标也期待和另一半一起创业，喜欢小孩但也可以接受丁克");
            this.f136221g.setHint("认真介绍一下自己，让心仪的人更了解你");
            marriagePrologue = user.getMarriageDeclaration();
            this.f136228n = 300;
            this.f136229o = 20;
        } else if (marrySeriesType == MarrySeriesType.FAMILY_BACKGROUND) {
            this.f136219e.setText("介绍一下你的父母职业、兄弟姐妹情况，帮你找到门当户对的另一半");
            this.f136227m.setText("独生子女，生长在小康家庭，父亲是老师，妈妈是家庭主妇，两位老人性格都比较温和，小有存款可支持在婚前购房");
            this.f136221g.setHint("认真介绍一下你的家庭背景，让心仪的人更了解你");
            marriagePrologue = user.getMarriageFamilyBackground();
            this.f136228n = 300;
            this.f136229o = 20;
        } else if (marrySeriesType == MarrySeriesType.BRIDE_PRICE) {
            this.f136219e.setText("关于婚礼和彩礼，你有什么样的主张？");
            this.f136227m.setText("如果是真心想要过一辈子的人，彩礼不会是我们在一起的阻碍，到时候可以双方商量。彩礼也是为我们的小家的积累建设基金。本人对婚礼形式没有太多要求，只要是和对的人一起用心布置就可以。");
            this.f136221g.setHint("说说你对婚礼/彩礼的想法");
            marriagePrologue = user.getMarriageFamilyBridePrice();
            this.f136228n = 300;
        } else if (marrySeriesType == MarrySeriesType.NICK_NAME) {
            xdl0.m208344M(this.f136219e, false);
            xdl0.m208344M(this.f136225k, false);
            marriagePrologue = user.name;
            this.f136228n = 50;
            this.f136229o = 1;
        } else if (marrySeriesType == MarrySeriesType.PROLOGUE) {
            this.f136219e.setText("设置一段专属的开场白，让对方更加了解你");
            xdl0.m208344M(this.f136225k, false);
            marriagePrologue = user.getMarriagePrologue();
            if (TextUtils.isEmpty(marriagePrologue)) {
                marriagePrologue = gzw.m128917a(user);
            }
            this.f136228n = 300;
            this.f136229o = 20;
        } else if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
            String strM137708n3 = CoreModule.f17545c.f19677q2.m137708n3();
            if (!TextUtils.isEmpty(user.description) && !TextUtils.isEmpty(strM137708n3) && !ura.m195053e().m195057d().mo33799am()) {
                xdl0.m208344M(this.f136223i, true);
                this.f136223i.setText(strM137708n3 + " ，请修改");
            }
            boolean zM47455b2 = act().m47455b2();
            VText vText = this.f136219e;
            if (zM47455b2) {
                vText.setText("请至少用15个字介绍一下你的性格特点、兴趣爱好等");
            } else {
                vText.setText("介绍一下你的性格特点、兴趣爱好、理想型等，让对方更了解你");
            }
            this.f136226l.setText("这样写更受欢迎：");
            boolean zIsFemale = user.isFemale();
            TextView textView = this.f136227m;
            if (zIsFemale) {
                textView.setText("enfp，性格开朗、喜欢结交新朋友。\n喜欢跳舞、美食、宠物，热爱自由。\n想要认识一位真诚恋爱的男性，希望你温柔稳重、认真对待感情。");
            } else {
                textView.setText("enfp，直率、真诚、靠谱。\n喜欢滑雪、徒步，一直坚持锻炼。\n希望认识一个认真恋爱的女孩儿，一起分享美好。");
            }
            marriagePrologue = user.description;
            this.f136228n = 300;
            this.f136229o = 15;
        } else {
            marriagePrologue = "";
        }
        this.f136221g.setText(marriagePrologue);
        int i = this.f136228n;
        if (i > 0) {
            this.f136221g.setMaxLength(i);
            m156942v(this.f136228n, marriagePrologue);
        }
        if (m138777f().m47498P4()) {
            e51.m114741F(act(), new Runnable() { // from class: l.lxw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130448a.m156937u();
                }
            });
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m156938n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m156938n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nxw.m161956b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public String m156940q() {
        return this.f136221g.getText().toString();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m156941s(MarrySeriesType marrySeriesType, View view, boolean z) {
        if (z && marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
            xdl0.m208344M(this.f136223i, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m156942v(int i, String str) {
        if (str == null) {
            str = "";
        }
        if (str.length() > 0 && TextUtils.isEmpty(str.trim())) {
            this.f136221g.setText("");
            this.f136221g.setSelection(0);
        }
        this.f136222h.setText((i - str.toString().length()) + "");
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jxw jxwVar) {
    }

    /* JADX INFO: renamed from: l.mxw$a */
    public class C18586a implements TextWatcher {
        public C18586a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null) {
                return;
            }
            mxw mxwVar = mxw.this;
            mxwVar.m156942v(mxwVar.f136228n, editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
