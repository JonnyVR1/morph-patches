package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopEditInfo;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;
import p149l.bkb0;
import p149l.dfa0;
import p149l.eqh0;
import p149l.i0g0;
import p149l.lqa;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.yha0;
import p149l.yij0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEditActionView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f34167a;

    /* JADX INFO: renamed from: b */
    public TextView f34168b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f34169c;

    /* JADX INFO: renamed from: d */
    public TextView f34170d;

    /* JADX INFO: renamed from: e */
    public VEditText f34171e;

    /* JADX INFO: renamed from: f */
    public TextView f34172f;

    /* JADX INFO: renamed from: g */
    public TextView f34173g;

    /* JADX INFO: renamed from: h */
    public VLinear f34174h;

    /* JADX INFO: renamed from: i */
    public TextView f34175i;

    /* JADX INFO: renamed from: j */
    public TextView f34176j;

    /* JADX INFO: renamed from: k */
    public VText f34177k;

    /* JADX INFO: renamed from: l */
    public VLinear f34178l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f34179m;

    /* JADX INFO: renamed from: n */
    public VText_Medium f34180n;

    /* JADX INFO: renamed from: o */
    public VText f34181o;

    /* JADX INFO: renamed from: p */
    public TextView f34182p;

    /* JADX INFO: renamed from: q */
    public LoopEditInfo f34183q;

    /* JADX INFO: renamed from: r */
    public InterfaceC8746b f34184r;

    /* JADX INFO: renamed from: s */
    public String f34185s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.ProfileLoopEditActionView$a */
    public class C8745a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoopEditInfo f34186a;

        public C8745a(LoopEditInfo loopEditInfo) {
            this.f34186a = loopEditInfo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LoopInputType loopInputType;
            String string = editable.toString();
            if (string.indexOf(SignParameters.NEW_LINE) >= 0 && (loopInputType = this.f34186a.loopInputType) != LoopInputType.ABOUT_ME && loopInputType != LoopInputType.HANGOUTS && loopInputType != LoopInputType.QUESTION_EDIT && loopInputType != LoopInputType.QUESTION_CHOICE && loopInputType != LoopInputType.SIGNATURE) {
                int selectionStart = ProfileLoopEditActionView.this.f34171e.getSelectionStart();
                String strM52974d = ProfileLoopEditActionView.this.m52974d(string);
                ProfileLoopEditActionView.this.f34171e.setText(strM52974d);
                int i = selectionStart - 1;
                ProfileLoopEditActionView.this.f34171e.setSelection(Math.min(strM52974d.length(), i >= 0 ? i : 0));
                return;
            }
            String strCall = yij0.f198513j.call(editable);
            boolean zIsEmpty = TextUtils.isEmpty(strCall);
            ProfileLoopEditActionView profileLoopEditActionView = ProfileLoopEditActionView.this;
            if (zIsEmpty) {
                xdl0.m208344M(profileLoopEditActionView.f34173g, false);
            } else {
                xdl0.m208344M(profileLoopEditActionView.f34173g, true);
                ProfileLoopEditActionView.this.f34173g.setText(strCall);
            }
            ProfileLoopEditActionView.this.m52977g(editable.toString());
            if (NullChecker.m81303a(ProfileLoopEditActionView.this.f34184r)) {
                ProfileLoopEditActionView.this.f34184r.mo52978a(editable.toString(), strCall);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.ProfileLoopEditActionView$b */
    public interface InterfaceC8746b {
        /* JADX INFO: renamed from: a */
        void mo52978a(String str, String str2);
    }

    public ProfileLoopEditActionView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m52972b(View view) {
        dfa0.m111440a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m52973c(LoopEditInfo loopEditInfo) {
        this.f34183q = loopEditInfo;
        xdl0.m208344M(this.f34167a, loopEditInfo.showTitle);
        this.f34167a.setTypeface(Typeface.DEFAULT_BOLD);
        if (!loopEditInfo.showTitle) {
            xdl0.m208344M(this.f34170d, false);
        }
        if (loopEditInfo.editTitle && !TextUtils.isEmpty(loopEditInfo.subTitle)) {
            xdl0.m208344M(this.f34170d, true);
            this.f34170d.setText(loopEditInfo.subTitle);
        } else if (!loopEditInfo.editTitle && !TextUtils.isEmpty(loopEditInfo.subTitle)) {
            xdl0.m208344M(this.f34168b, true);
            this.f34168b.setText(loopEditInfo.subTitle);
            xdl0.m208357U(this.f34167a, 0);
            xdl0.m208357U(this.f34168b, t100.m186890d(30.0f));
        }
        yha0.m214796a(this.f34167a);
        this.f34172f.setText(loopEditInfo.maxInput + "");
        this.f34167a.setText(loopEditInfo.title);
        this.f34171e.addTextChangedListener(new C8745a(loopEditInfo));
        if (!TextUtils.isEmpty(loopEditInfo.defaultContent)) {
            this.f34171e.setText(loopEditInfo.defaultContent);
            this.f34171e.setSelection(loopEditInfo.defaultContent.length());
        }
        this.f34171e.setHint(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + loopEditInfo.editHint.replaceAll(SignParameters.NEW_LINE, "\n "));
        this.f34171e.setMaxLength(loopEditInfo.maxInput);
    }

    /* JADX INFO: renamed from: d */
    public String m52974d(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll(SignParameters.NEW_LINE, "");
    }

    /* JADX INFO: renamed from: e */
    public void m52975e(User user, LoopInputType loopInputType) {
        if (!lqa.m150985w() || loopInputType != LoopInputType.SIGNATURE) {
            xdl0.m208344M(this.f34174h, false);
            xdl0.m208344M(this.f34177k, false);
            xdl0.m208344M(this.f34178l, false);
            return;
        }
        xdl0.m208344M(this.f34174h, false);
        xdl0.m208344M(this.f34177k, true);
        xdl0.m208344M(this.f34178l, true);
        if (user.isFemale()) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f34179m;
            int i = t100.f167274w;
            bkb0Var.m102325I0(vDraweeView, "https://auto.tancdn.com/v1/images/eyJpZCI6IkpOSzJBVlhNSE9ETExRVkZINUdRWUg2QkRPQTZZNzE0IiwidyI6MTAyLCJoIjoxMDIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTM2MTUyNzQ0NzAzMzAwOTM5fQ.png", i, i);
            this.f34182p.setText("重庆妹子，性格开朗，铲屎官一枚。平时喜欢打羽毛球、桌游，偶尔晨跑或游泳。希望认识一个爱好、精神契合，可以认真恋爱的男孩。");
            this.f34177k.setText("她们这样写，更受欢迎");
            this.f34180n.setText("陈姗姗 25");
            this.f34181o.setText(i0g0.m133861b0("她在探探收到了 1630个喜欢", vwb.m200324f0("1630个喜欢"), Color.parseColor("#99000000"), Typeface.create(eqh0.m117752c(3), 0)));
            return;
        }
        bkb0 bkb0Var2 = qib0.f154691G;
        VDraweeView vDraweeView2 = this.f34179m;
        int i2 = t100.f167274w;
        bkb0Var2.m102325I0(vDraweeView2, "https://auto.tancdn.com/v1/images/eyJpZCI6IlhXNVFYWFJBNlE3VERFWDQ3Q1c3RkZVTTVWNElINjE0IiwidyI6MTAyLCJoIjoxMDIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTYwNjcyMjU4Mzg5NjQ2NjExfQ.png", i2, i2);
        this.f34182p.setText("情绪稳定，有事业心。平时喜欢打篮球、羽毛球，有时间会去旅游打卡。希望认识一个乐观善良、有共同话题的女孩。");
        this.f34177k.setText("他们这样写，更受欢迎");
        this.f34180n.setText("李泽楷 26");
        this.f34181o.setText(i0g0.m133861b0("他在探探收到了 1630个喜欢", vwb.m200324f0("1630个喜欢"), Color.parseColor("#99000000"), Typeface.create(eqh0.m117752c(3), 0)));
    }

    /* JADX INFO: renamed from: f */
    public void m52976f(int i, int i2) {
        xdl0.m208360X(this.f34168b, i);
        xdl0.m208357U(this.f34168b, i2);
    }

    /* JADX INFO: renamed from: g */
    public void m52977g(String str) {
        this.f34172f.setText((this.f34183q.maxInput - str.length()) + "");
    }

    public String getInputValue() {
        return this.f34171e.getText().toString().trim();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m52972b(this);
    }

    public void setFrom(String str) {
        this.f34185s = str;
    }

    public void setInputTextChangeListener(InterfaceC8746b interfaceC8746b) {
        this.f34184r = interfaceC8746b;
    }

    public ProfileLoopEditActionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileLoopEditActionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
