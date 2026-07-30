package com.p051p1.mobile.putong.core.p058ui.popup;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.popup.NameFakeView;
import com.p051p1.mobile.putong.data.StatusesItem;
import com.p051p1.mobile.putong.data.User;
import java.util.Objects;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;
import p151v.VText;
import p153l.bnl0;
import p153l.bsj0;
import p153l.dbc0;
import p153l.l51;
import p153l.ob20;
import p153l.pb20;
import p153l.psd0;
import p153l.tu0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class NameFakeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public NameFakeView f33666a;

    /* JADX INFO: renamed from: b */
    public VText f33667b;

    /* JADX INFO: renamed from: c */
    public TextView f33668c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f33669d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f33670e;

    public NameFakeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m51599a(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m51600b(Act act, x20 x20Var, uxj0 uxj0Var) {
        Objects.requireNonNull(act);
        l51.m152888H(act, new ob20(act), 500L);
        act.progressDismiss();
        x20Var.call();
    }

    /* JADX INFO: renamed from: e */
    public final void m51603e(View view) {
        pb20.m171479a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m51604f(Act act, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f33670e.setBackground(tu0.m192702b(act, dbc0.f86327Ku));
            this.f33670e.setTextColor(Color.parseColor("#bdbdbd"));
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(bsj0.m106254L(charSequence.toString()));
        VButton_FakeShadow vButton_FakeShadow = this.f33670e;
        if (zIsEmpty) {
            vButton_FakeShadow.setBackground(tu0.m192702b(act, dbc0.f87464tv));
            this.f33670e.setTextColor(-1);
        } else {
            vButton_FakeShadow.setBackground(tu0.m192702b(act, dbc0.f86327Ku));
            this.f33670e.setTextColor(Color.parseColor("#bdbdbd"));
        }
        this.f33669d.setError(bsj0.m106254L(charSequence.toString()));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m51605g(final Act act, final x20 x20Var, View view) {
        String string = this.f33669d.getText().toString();
        if (TextUtils.isEmpty(bsj0.m106254L(string))) {
            User user = new User();
            user.name = string;
            act.progress(act.getString(R$string.f18632L5), true);
            CoreModule.f18264c.f20381e0.m116620u9(user).subscribe(psd0.m173597H(new y20() { // from class: l.mb20
                @Override // p153l.y20
                public final void call(Object obj) {
                    NameFakeView.m51600b(act, x20Var, (uxj0) obj);
                }
            }, new y20() { // from class: l.nb20
                @Override // p153l.y20
                public final void call(Object obj) {
                    NameFakeView.m51599a(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m51606h(final Act act) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        this.f33669d.setSingleLine();
        this.f33669d.setMaxLines(1);
        this.f33669d.setMaxCharacters(50);
        this.f33669d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        this.f33669d.setFloatingLabel(0);
        this.f33669d.setPrimaryColor(Color.parseColor("#e5e5e5"));
        this.f33669d.m224373H().subscribe(psd0.m173596G(new y20() { // from class: l.lb20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130767a.m51604f(act, (CharSequence) obj);
            }
        }));
        TextView textView = this.f33668c;
        StatusesItem statusesItem = userM116600p9.nameStatus;
        textView.setText(Html.fromHtml(statusesItem != null ? statusesItem.text : act.getString(R$string.f19473mr)));
        this.f33668c.setGravity(17);
        this.f33667b.setText(R$string.f19504nr);
    }

    /* JADX INFO: renamed from: i */
    public void m51607i(final Act act, final x20 x20Var) {
        bnl0.m105509E0(this.f33670e, new View.OnClickListener() { // from class: l.kb20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124748a.m51605g(act, x20Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51603e(this);
    }

    public NameFakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NameFakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
