package com.p000p1.mobile.putong.core.p001ui.profile.views;

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
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopEditInfo;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.bkb0;
import l.dfa0;
import l.eqh0;
import l.i0g0;
import l.lqa;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yij0;
import p002l.yha0;
import v.VDraweeView;
import v.VEditText;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopEditActionView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f1989a;

    /* JADX INFO: renamed from: b */
    public TextView f1990b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f1991c;

    /* JADX INFO: renamed from: d */
    public TextView f1992d;

    /* JADX INFO: renamed from: e */
    public VEditText f1993e;

    /* JADX INFO: renamed from: f */
    public TextView f1994f;

    /* JADX INFO: renamed from: g */
    public TextView f1995g;

    /* JADX INFO: renamed from: h */
    public VLinear f1996h;

    /* JADX INFO: renamed from: i */
    public TextView f1997i;

    /* JADX INFO: renamed from: j */
    public TextView f1998j;

    /* JADX INFO: renamed from: k */
    public VText f1999k;

    /* JADX INFO: renamed from: l */
    public VLinear f2000l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f2001m;

    /* JADX INFO: renamed from: n */
    public VText_Medium f2002n;

    /* JADX INFO: renamed from: o */
    public VText f2003o;

    /* JADX INFO: renamed from: p */
    public TextView f2004p;

    /* JADX INFO: renamed from: q */
    public LoopEditInfo f2005q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0171b f2006r;

    /* JADX INFO: renamed from: s */
    public String f2007s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.ProfileLoopEditActionView$a */
    public class C0170a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoopEditInfo f2008a;

        public C0170a(LoopEditInfo loopEditInfo) {
            this.f2008a = loopEditInfo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LoopInputType loopInputType;
            String string = editable.toString();
            if (string.indexOf("\n") >= 0 && (loopInputType = this.f2008a.loopInputType) != LoopInputType.ABOUT_ME && loopInputType != LoopInputType.HANGOUTS && loopInputType != LoopInputType.QUESTION_EDIT && loopInputType != LoopInputType.QUESTION_CHOICE && loopInputType != LoopInputType.SIGNATURE) {
                int selectionStart = ProfileLoopEditActionView.this.f1993e.getSelectionStart();
                String strM3532d = ProfileLoopEditActionView.this.m3532d(string);
                ProfileLoopEditActionView.this.f1993e.setText(strM3532d);
                int i = selectionStart - 1;
                ProfileLoopEditActionView.this.f1993e.setSelection(Math.min(strM3532d.length(), i >= 0 ? i : 0));
                return;
            }
            String str = (String) yij0.j.call(editable);
            boolean zIsEmpty = TextUtils.isEmpty(str);
            ProfileLoopEditActionView profileLoopEditActionView = ProfileLoopEditActionView.this;
            if (zIsEmpty) {
                xdl0.M(profileLoopEditActionView.f1995g, false);
            } else {
                xdl0.M(profileLoopEditActionView.f1995g, true);
                ProfileLoopEditActionView.this.f1995g.setText(str);
            }
            ProfileLoopEditActionView.this.m3535g(editable.toString());
            if (NullChecker.a(ProfileLoopEditActionView.this.f2006r)) {
                ProfileLoopEditActionView.this.f2006r.mo3536a(editable.toString(), str);
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
    public interface InterfaceC0171b {
        /* JADX INFO: renamed from: a */
        void mo3536a(String str, String str2);
    }

    public ProfileLoopEditActionView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m3530b(View view) {
        dfa0.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m3531c(LoopEditInfo loopEditInfo) {
        this.f2005q = loopEditInfo;
        xdl0.M(this.f1989a, loopEditInfo.showTitle);
        this.f1989a.setTypeface(Typeface.DEFAULT_BOLD);
        if (!loopEditInfo.showTitle) {
            xdl0.M(this.f1992d, false);
        }
        if (loopEditInfo.editTitle && !TextUtils.isEmpty(loopEditInfo.subTitle)) {
            xdl0.M(this.f1992d, true);
            this.f1992d.setText(loopEditInfo.subTitle);
        } else if (!loopEditInfo.editTitle && !TextUtils.isEmpty(loopEditInfo.subTitle)) {
            xdl0.M(this.f1990b, true);
            this.f1990b.setText(loopEditInfo.subTitle);
            xdl0.U(this.f1989a, 0);
            xdl0.U(this.f1990b, t100.d(30.0f));
        }
        yha0.m26717a(this.f1989a);
        this.f1994f.setText(loopEditInfo.maxInput + "");
        this.f1989a.setText(loopEditInfo.title);
        this.f1993e.addTextChangedListener(new C0170a(loopEditInfo));
        if (!TextUtils.isEmpty(loopEditInfo.defaultContent)) {
            this.f1993e.setText(loopEditInfo.defaultContent);
            this.f1993e.setSelection(loopEditInfo.defaultContent.length());
        }
        this.f1993e.setHint(" " + loopEditInfo.editHint.replaceAll("\n", "\n "));
        this.f1993e.setMaxLength(loopEditInfo.maxInput);
    }

    /* JADX INFO: renamed from: d */
    public String m3532d(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll("\n", "");
    }

    /* JADX INFO: renamed from: e */
    public void m3533e(User user, LoopInputType loopInputType) {
        if (!lqa.w() || loopInputType != LoopInputType.SIGNATURE) {
            xdl0.M(this.f1996h, false);
            xdl0.M(this.f1999k, false);
            xdl0.M(this.f2000l, false);
            return;
        }
        xdl0.M(this.f1996h, false);
        xdl0.M(this.f1999k, true);
        xdl0.M(this.f2000l, true);
        if (user.isFemale()) {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f2001m;
            int i = t100.w;
            bkb0Var.I0(vDraweeView, "https://auto.tancdn.com/v1/images/eyJpZCI6IkpOSzJBVlhNSE9ETExRVkZINUdRWUg2QkRPQTZZNzE0IiwidyI6MTAyLCJoIjoxMDIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTM2MTUyNzQ0NzAzMzAwOTM5fQ.png", i, i);
            this.f2004p.setText("重庆妹子，性格开朗，铲屎官一枚。平时喜欢打羽毛球、桌游，偶尔晨跑或游泳。希望认识一个爱好、精神契合，可以认真恋爱的男孩。");
            this.f1999k.setText("她们这样写，更受欢迎");
            this.f2002n.setText("陈姗姗 25");
            this.f2003o.setText(i0g0.b0("她在探探收到了 1630个喜欢", vwb.f0(new String[]{"1630个喜欢"}), Color.parseColor("#99000000"), Typeface.create(eqh0.c(3), 0)));
            return;
        }
        bkb0 bkb0Var2 = qib0.G;
        VDraweeView vDraweeView2 = this.f2001m;
        int i2 = t100.w;
        bkb0Var2.I0(vDraweeView2, "https://auto.tancdn.com/v1/images/eyJpZCI6IlhXNVFYWFJBNlE3VERFWDQ3Q1c3RkZVTTVWNElINjE0IiwidyI6MTAyLCJoIjoxMDIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTYwNjcyMjU4Mzg5NjQ2NjExfQ.png", i2, i2);
        this.f2004p.setText("情绪稳定，有事业心。平时喜欢打篮球、羽毛球，有时间会去旅游打卡。希望认识一个乐观善良、有共同话题的女孩。");
        this.f1999k.setText("他们这样写，更受欢迎");
        this.f2002n.setText("李泽楷 26");
        this.f2003o.setText(i0g0.b0("他在探探收到了 1630个喜欢", vwb.f0(new String[]{"1630个喜欢"}), Color.parseColor("#99000000"), Typeface.create(eqh0.c(3), 0)));
    }

    /* JADX INFO: renamed from: f */
    public void m3534f(int i, int i2) {
        xdl0.X(this.f1990b, i);
        xdl0.U(this.f1990b, i2);
    }

    /* JADX INFO: renamed from: g */
    public void m3535g(String str) {
        this.f1994f.setText((this.f2005q.maxInput - str.length()) + "");
    }

    public String getInputValue() {
        return this.f1993e.getText().toString().trim();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3530b(this);
    }

    public void setFrom(String str) {
        this.f2007s = str;
    }

    public void setInputTextChangeListener(InterfaceC0171b interfaceC0171b) {
        this.f2006r = interfaceC0171b;
    }

    public ProfileLoopEditActionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileLoopEditActionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
