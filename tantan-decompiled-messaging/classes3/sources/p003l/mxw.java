package p003l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.view.AboutMeNewCaseLayout;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.j760;
import l.nxw;
import l.osi0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.yij0;
import org.eclipse.jetty.http.HttpStatus;
import p028v.VEditText;
import p028v.VFrame;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mxw extends iww<jxw> {

    /* JADX INFO: renamed from: c */
    public VLinear f5793c;

    /* JADX INFO: renamed from: d */
    public VText f5794d;

    /* JADX INFO: renamed from: e */
    public VText f5795e;

    /* JADX INFO: renamed from: f */
    public VFrame f5796f;

    /* JADX INFO: renamed from: g */
    public VEditText f5797g;

    /* JADX INFO: renamed from: h */
    public TextView f5798h;

    /* JADX INFO: renamed from: i */
    public TextView f5799i;

    /* JADX INFO: renamed from: j */
    public AboutMeNewCaseLayout f5800j;

    /* JADX INFO: renamed from: k */
    public VLinear f5801k;

    /* JADX INFO: renamed from: l */
    public TextView f5802l;

    /* JADX INFO: renamed from: m */
    public TextView f5803m;

    /* JADX INFO: renamed from: n */
    public int f5804n;

    /* JADX INFO: renamed from: o */
    public int f5805o;

    public mxw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
        this.f5804n = 0;
        this.f5805o = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m6509u() {
        act().showInput(this.f5797g, 0);
        try {
            if (TextUtils.isEmpty(this.f5797g.getText()) || this.f5797g.getText().toString().length() <= 0) {
                return;
            }
            VEditText vEditText = this.f5797g;
            vEditText.setSelection(vEditText.getText().length());
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: b */
    public boolean mo3207b(MarrySeriesType marrySeriesType, User user) {
        if (!NullChecker.a(this.f5797g.getText())) {
            return true;
        }
        int length = this.f5797g.getText().toString().trim().length();
        int i = this.f5805o;
        if (length >= i) {
            return true;
        }
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
            osi0.g(String.format("请至少用%d个字介绍一下你自己", Integer.valueOf(i)));
            return false;
        }
        osi0.g(String.format("请至少填写%d个字，请勿凑字数或填写无关内容", Integer.valueOf(i)));
        return false;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return NullChecker.a(this.f5797g.getText()) && !TextUtils.isEmpty(this.f5797g.getText().toString().trim());
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: d */
    public j760<Boolean, String> mo5255d(MarrySeriesType marrySeriesType) {
        if (marrySeriesType == MarrySeriesType.NICK_NAME && !TextUtils.isEmpty(this.f5797g.getText())) {
            String strL = yij0.L(this.f5797g.getText().toString());
            if (!TextUtils.isEmpty(strL)) {
                return j760.a(Boolean.FALSE, strL);
            }
        }
        return super.mo5255d(marrySeriesType);
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        String strTrim = (!NullChecker.a(this.f5797g.getText()) || TextUtils.isEmpty(this.f5797g.getText().toString())) ? "" : this.f5797g.getText().toString().trim();
        user.nullCheck();
        user.profile.nullCheck();
        user.profile.extensions.nullCheck();
        if (marrySeriesType == MarrySeriesType.DECLARATION) {
            user.profile.extensions.marriage.nullCheck();
            user.profile.extensions.marriage.declaration = vwb.M(strTrim);
            return;
        }
        if (marrySeriesType == MarrySeriesType.FAMILY_BACKGROUND) {
            user.profile.extensions.basic.nullCheck();
            user.profile.extensions.basic.familyBackground = vwb.M(strTrim);
            return;
        }
        if (marrySeriesType == MarrySeriesType.BRIDE_PRICE) {
            user.profile.extensions.marriage.nullCheck();
            user.profile.extensions.marriage.bridePrice = vwb.M(strTrim);
        } else {
            if (marrySeriesType == MarrySeriesType.NICK_NAME) {
                user.name = strTrim;
                return;
            }
            if (marrySeriesType == MarrySeriesType.PROLOGUE) {
                user.profile.extensions.marriage.nullCheck();
                user.profile.extensions.marriage.prologue = vwb.M(strTrim);
            } else if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
                user.description = strTrim;
            }
        }
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(final MarrySeriesType marrySeriesType, User user) {
        String marriagePrologue;
        xdl0.M(this.f5799i, false);
        this.f5794d.setTypeface(eqh0.m3924c(3), 1);
        this.f5794d.setText(marrySeriesType.getTitleName());
        this.f5797g.addTextChangedListener(new C0437a());
        this.f5797g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.kxw
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f5118a.m6514s(marrySeriesType, view, z);
            }
        });
        this.f5797g.setHint("添加" + marrySeriesType.getTitleName());
        if (marrySeriesType == MarrySeriesType.DECLARATION) {
            this.f5795e.setText("介绍一下你的工作&生活状态、处事风格、优缺点、成长、求学经历等…");
            this.f5803m.setText("ENTP直女一枚，父母均为公务员还未退休，在北京工作7年有余，是个有事业心的恋爱脑，如果有共同目标也期待和另一半一起创业，喜欢小孩但也可以接受丁克");
            this.f5797g.setHint("认真介绍一下自己，让心仪的人更了解你");
            marriagePrologue = user.getMarriageDeclaration();
            this.f5804n = HttpStatus.MULTIPLE_CHOICES_300;
            this.f5805o = 20;
        } else if (marrySeriesType == MarrySeriesType.FAMILY_BACKGROUND) {
            this.f5795e.setText("介绍一下你的父母职业、兄弟姐妹情况，帮你找到门当户对的另一半");
            this.f5803m.setText("独生子女，生长在小康家庭，父亲是老师，妈妈是家庭主妇，两位老人性格都比较温和，小有存款可支持在婚前购房");
            this.f5797g.setHint("认真介绍一下你的家庭背景，让心仪的人更了解你");
            marriagePrologue = user.getMarriageFamilyBackground();
            this.f5804n = HttpStatus.MULTIPLE_CHOICES_300;
            this.f5805o = 20;
        } else if (marrySeriesType == MarrySeriesType.BRIDE_PRICE) {
            this.f5795e.setText("关于婚礼和彩礼，你有什么样的主张？");
            this.f5803m.setText("如果是真心想要过一辈子的人，彩礼不会是我们在一起的阻碍，到时候可以双方商量。彩礼也是为我们的小家的积累建设基金。本人对婚礼形式没有太多要求，只要是和对的人一起用心布置就可以。");
            this.f5797g.setHint("说说你对婚礼/彩礼的想法");
            marriagePrologue = user.getMarriageFamilyBridePrice();
            this.f5804n = HttpStatus.MULTIPLE_CHOICES_300;
        } else if (marrySeriesType == MarrySeriesType.NICK_NAME) {
            xdl0.M(this.f5795e, false);
            xdl0.M(this.f5801k, false);
            marriagePrologue = user.name;
            this.f5804n = 50;
            this.f5805o = 1;
        } else if (marrySeriesType == MarrySeriesType.PROLOGUE) {
            this.f5795e.setText("设置一段专属的开场白，让对方更加了解你");
            xdl0.M(this.f5801k, false);
            marriagePrologue = user.getMarriagePrologue();
            if (TextUtils.isEmpty(marriagePrologue)) {
                marriagePrologue = gzw.m4903a(user);
            }
            this.f5804n = HttpStatus.MULTIPLE_CHOICES_300;
            this.f5805o = 20;
        } else if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
            String strN3 = CoreModule.c.q2.n3();
            if (!TextUtils.isEmpty(user.description) && !TextUtils.isEmpty(strN3) && !ura.e().d().am()) {
                xdl0.M(this.f5799i, true);
                this.f5799i.setText(strN3 + " ，请修改");
            }
            boolean zM502b2 = act().m502b2();
            AppCompatTextView appCompatTextView = this.f5795e;
            if (zM502b2) {
                appCompatTextView.setText("请至少用15个字介绍一下你的性格特点、兴趣爱好等");
            } else {
                appCompatTextView.setText("介绍一下你的性格特点、兴趣爱好、理想型等，让对方更了解你");
            }
            this.f5802l.setText("这样写更受欢迎：");
            boolean zIsFemale = user.isFemale();
            TextView textView = this.f5803m;
            if (zIsFemale) {
                textView.setText("enfp，性格开朗、喜欢结交新朋友。\n喜欢跳舞、美食、宠物，热爱自由。\n想要认识一位真诚恋爱的男性，希望你温柔稳重、认真对待感情。");
            } else {
                textView.setText("enfp，直率、真诚、靠谱。\n喜欢滑雪、徒步，一直坚持锻炼。\n希望认识一个认真恋爱的女孩儿，一起分享美好。");
            }
            marriagePrologue = user.description;
            this.f5804n = HttpStatus.MULTIPLE_CHOICES_300;
            this.f5805o = 15;
        } else {
            marriagePrologue = "";
        }
        this.f5797g.setText(marriagePrologue);
        int i = this.f5804n;
        if (i > 0) {
            this.f5797g.setMaxLength(i);
            m6515v(this.f5804n, marriagePrologue);
        }
        if (m5256f().m546P4()) {
            e51.F(act(), new Runnable() { // from class: l.lxw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5477a.m6509u();
                }
            });
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m6511n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m6511n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nxw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public String m6513q() {
        return this.f5797g.getText().toString();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m6514s(MarrySeriesType marrySeriesType, View view, boolean z) {
        if (z && marrySeriesType == MarrySeriesType.PROFILE_FEATURED_ABOUT_ME) {
            xdl0.M(this.f5799i, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m6515v(int i, String str) {
        if (str == null) {
            str = "";
        }
        if (str.length() > 0 && TextUtils.isEmpty(str.trim())) {
            this.f5797g.setText("");
            this.f5797g.setSelection(0);
        }
        this.f5798h.setText((i - str.toString().length()) + "");
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m6510i1(jxw jxwVar) {
    }

    /* JADX INFO: renamed from: l.mxw$a */
    public class C0437a implements TextWatcher {
        public C0437a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null) {
                return;
            }
            mxw mxwVar = mxw.this;
            mxwVar.m6515v(mxwVar.f5804n, editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
