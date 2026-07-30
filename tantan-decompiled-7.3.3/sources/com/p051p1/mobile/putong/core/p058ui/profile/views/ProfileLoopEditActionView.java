package com.p051p1.mobile.putong.core.p058ui.profile.views;

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
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopEditInfo;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.bsj0;
import p153l.cqa0;
import p153l.fsb0;
import p153l.hna0;
import p153l.jyb;
import p153l.lyh0;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;
import p153l.xra;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEditActionView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f35015a;

    /* JADX INFO: renamed from: b */
    public TextView f35016b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f35017c;

    /* JADX INFO: renamed from: d */
    public TextView f35018d;

    /* JADX INFO: renamed from: e */
    public VEditText f35019e;

    /* JADX INFO: renamed from: f */
    public TextView f35020f;

    /* JADX INFO: renamed from: g */
    public TextView f35021g;

    /* JADX INFO: renamed from: h */
    public VLinear f35022h;

    /* JADX INFO: renamed from: i */
    public TextView f35023i;

    /* JADX INFO: renamed from: j */
    public TextView f35024j;

    /* JADX INFO: renamed from: k */
    public VText f35025k;

    /* JADX INFO: renamed from: l */
    public VLinear f35026l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f35027m;

    /* JADX INFO: renamed from: n */
    public VText_Medium f35028n;

    /* JADX INFO: renamed from: o */
    public VText f35029o;

    /* JADX INFO: renamed from: p */
    public TextView f35030p;

    /* JADX INFO: renamed from: q */
    public LoopEditInfo f35031q;

    /* JADX INFO: renamed from: r */
    public InterfaceC8909b f35032r;

    /* JADX INFO: renamed from: s */
    public String f35033s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.ProfileLoopEditActionView$a */
    public class C8908a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoopEditInfo f35034a;

        public C8908a(LoopEditInfo loopEditInfo) {
            this.f35034a = loopEditInfo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LoopInputType loopInputType;
            String string = editable.toString();
            if (string.indexOf(SignParameters.NEW_LINE) >= 0 && (loopInputType = this.f35034a.loopInputType) != LoopInputType.ABOUT_ME && loopInputType != LoopInputType.HANGOUTS && loopInputType != LoopInputType.QUESTION_EDIT && loopInputType != LoopInputType.QUESTION_CHOICE && loopInputType != LoopInputType.SIGNATURE) {
                int selectionStart = ProfileLoopEditActionView.this.f35019e.getSelectionStart();
                String strM54157d = ProfileLoopEditActionView.this.m54157d(string);
                ProfileLoopEditActionView.this.f35019e.setText(strM54157d);
                int i = selectionStart - 1;
                ProfileLoopEditActionView.this.f35019e.setSelection(Math.min(strM54157d.length(), i >= 0 ? i : 0));
                return;
            }
            String strCall = bsj0.f78170j.call(editable);
            boolean zIsEmpty = TextUtils.isEmpty(strCall);
            ProfileLoopEditActionView profileLoopEditActionView = ProfileLoopEditActionView.this;
            if (zIsEmpty) {
                bnl0.m105524M(profileLoopEditActionView.f35021g, false);
            } else {
                bnl0.m105524M(profileLoopEditActionView.f35021g, true);
                ProfileLoopEditActionView.this.f35021g.setText(strCall);
            }
            ProfileLoopEditActionView.this.m54160g(editable.toString());
            if (NullChecker.m82486a(ProfileLoopEditActionView.this.f35032r)) {
                ProfileLoopEditActionView.this.f35032r.mo54161a(editable.toString(), strCall);
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
    public interface InterfaceC8909b {
        /* JADX INFO: renamed from: a */
        void mo54161a(String str, String str2);
    }

    public ProfileLoopEditActionView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m54155b(View view) {
        hna0.m136042a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m54156c(LoopEditInfo loopEditInfo) {
        this.f35031q = loopEditInfo;
        bnl0.m105524M(this.f35015a, loopEditInfo.showTitle);
        this.f35015a.setTypeface(Typeface.DEFAULT_BOLD);
        if (!loopEditInfo.showTitle) {
            bnl0.m105524M(this.f35018d, false);
        }
        if (loopEditInfo.editTitle && !TextUtils.isEmpty(loopEditInfo.subTitle)) {
            bnl0.m105524M(this.f35018d, true);
            this.f35018d.setText(loopEditInfo.subTitle);
        } else if (!loopEditInfo.editTitle && !TextUtils.isEmpty(loopEditInfo.subTitle)) {
            bnl0.m105524M(this.f35016b, true);
            this.f35016b.setText(loopEditInfo.subTitle);
            bnl0.m105537U(this.f35015a, 0);
            bnl0.m105537U(this.f35016b, qa00.m175859d(30.0f));
        }
        cqa0.m111886a(this.f35015a);
        this.f35020f.setText(loopEditInfo.maxInput + "");
        this.f35015a.setText(loopEditInfo.title);
        this.f35019e.addTextChangedListener(new C8908a(loopEditInfo));
        if (!TextUtils.isEmpty(loopEditInfo.defaultContent)) {
            this.f35019e.setText(loopEditInfo.defaultContent);
            this.f35019e.setSelection(loopEditInfo.defaultContent.length());
        }
        this.f35019e.setHint(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + loopEditInfo.editHint.replaceAll(SignParameters.NEW_LINE, "\n "));
        this.f35019e.setMaxLength(loopEditInfo.maxInput);
    }

    /* JADX INFO: renamed from: d */
    public String m54157d(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll(SignParameters.NEW_LINE, "");
    }

    /* JADX INFO: renamed from: e */
    public void m54158e(User user, LoopInputType loopInputType) {
        if (!xra.m212804w() || loopInputType != LoopInputType.SIGNATURE) {
            bnl0.m105524M(this.f35022h, false);
            bnl0.m105524M(this.f35025k, false);
            bnl0.m105524M(this.f35026l, false);
            return;
        }
        bnl0.m105524M(this.f35022h, false);
        bnl0.m105524M(this.f35025k, true);
        bnl0.m105524M(this.f35026l, true);
        if (user.isFemale()) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f35027m;
            int i = qa00.f156336w;
            fsb0Var.m127109I0(vDraweeView, "https://auto.tancdn.com/v1/images/eyJpZCI6IkpOSzJBVlhNSE9ETExRVkZINUdRWUg2QkRPQTZZNzE0IiwidyI6MTAyLCJoIjoxMDIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTM2MTUyNzQ0NzAzMzAwOTM5fQ.png", i, i);
            this.f35030p.setText("重庆妹子，性格开朗，铲屎官一枚。平时喜欢打羽毛球、桌游，偶尔晨跑或游泳。希望认识一个爱好、精神契合，可以认真恋爱的男孩。");
            this.f35025k.setText("她们这样写，更受欢迎");
            this.f35028n.setText("陈姗姗 25");
            this.f35029o.setText(q8g0.m175796b0("她在探探收到了 1630个喜欢", jyb.m147507f0("1630个喜欢"), Color.parseColor("#99000000"), Typeface.create(lyh0.m156283c(3), 0)));
            return;
        }
        fsb0 fsb0Var2 = uqb0.f180374G;
        VDraweeView vDraweeView2 = this.f35027m;
        int i2 = qa00.f156336w;
        fsb0Var2.m127109I0(vDraweeView2, "https://auto.tancdn.com/v1/images/eyJpZCI6IlhXNVFYWFJBNlE3VERFWDQ3Q1c3RkZVTTVWNElINjE0IiwidyI6MTAyLCJoIjoxMDIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTYwNjcyMjU4Mzg5NjQ2NjExfQ.png", i2, i2);
        this.f35030p.setText("情绪稳定，有事业心。平时喜欢打篮球、羽毛球，有时间会去旅游打卡。希望认识一个乐观善良、有共同话题的女孩。");
        this.f35025k.setText("他们这样写，更受欢迎");
        this.f35028n.setText("李泽楷 26");
        this.f35029o.setText(q8g0.m175796b0("他在探探收到了 1630个喜欢", jyb.m147507f0("1630个喜欢"), Color.parseColor("#99000000"), Typeface.create(lyh0.m156283c(3), 0)));
    }

    /* JADX INFO: renamed from: f */
    public void m54159f(int i, int i2) {
        bnl0.m105540X(this.f35016b, i);
        bnl0.m105537U(this.f35016b, i2);
    }

    /* JADX INFO: renamed from: g */
    public void m54160g(String str) {
        this.f35020f.setText((this.f35031q.maxInput - str.length()) + "");
    }

    public String getInputValue() {
        return this.f35019e.getText().toString().trim();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54155b(this);
    }

    public void setFrom(String str) {
        this.f35033s = str;
    }

    public void setInputTextChangeListener(InterfaceC8909b interfaceC8909b) {
        this.f35032r = interfaceC8909b;
    }

    public ProfileLoopEditActionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileLoopEditActionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
