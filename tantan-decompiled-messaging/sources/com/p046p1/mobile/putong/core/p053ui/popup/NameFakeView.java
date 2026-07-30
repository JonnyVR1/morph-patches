package com.p046p1.mobile.putong.core.p053ui.popup;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.popup.NameFakeView;
import com.p046p1.mobile.putong.data.StatusesItem;
import com.p046p1.mobile.putong.data.User;
import java.util.Objects;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.g320;
import p149l.h320;
import p149l.mkd0;
import p149l.nu0;
import p149l.roj0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.yij0;

/* JADX INFO: loaded from: classes4.dex */
public class NameFakeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public NameFakeView f32818a;

    /* JADX INFO: renamed from: b */
    public VText f32819b;

    /* JADX INFO: renamed from: c */
    public TextView f32820c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f32821d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f32822e;

    public NameFakeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m50416a(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m50417b(Act act, d30 d30Var, roj0 roj0Var) {
        Objects.requireNonNull(act);
        e51.m114743H(act, new g320(act), 500L);
        act.progressDismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: e */
    public final void m50420e(View view) {
        h320.m129156a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m50421f(Act act, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f32822e.setBackground(nu0.m161424b(act, x2c0.f189871Wt));
            this.f32822e.setTextColor(Color.parseColor("#bdbdbd"));
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(yij0.m214934L(charSequence.toString()));
        VButton_FakeShadow vButton_FakeShadow = this.f32822e;
        if (zIsEmpty) {
            vButton_FakeShadow.setBackground(nu0.m161424b(act, x2c0.f189344Fu));
            this.f32822e.setTextColor(-1);
        } else {
            vButton_FakeShadow.setBackground(nu0.m161424b(act, x2c0.f189871Wt));
            this.f32822e.setTextColor(Color.parseColor("#bdbdbd"));
        }
        this.f32821d.setError(yij0.m214934L(charSequence.toString()));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m50422g(final Act act, final d30 d30Var, View view) {
        String string = this.f32821d.getText().toString();
        if (TextUtils.isEmpty(yij0.m214934L(string))) {
            User user = new User();
            user.name = string;
            act.progress(act.getString(R$string.f17842J5), true);
            CoreModule.f17545c.f19639e0.m169547u9(user).subscribe(mkd0.m154956H(new e30() { // from class: l.e320
                @Override // p149l.e30
                public final void call(Object obj) {
                    NameFakeView.m50417b(act, d30Var, (roj0) obj);
                }
            }, new e30() { // from class: l.f320
                @Override // p149l.e30
                public final void call(Object obj) {
                    NameFakeView.m50416a(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m50423h(final Act act) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        this.f32821d.setSingleLine();
        this.f32821d.setMaxLines(1);
        this.f32821d.setMaxCharacters(50);
        this.f32821d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        this.f32821d.setFloatingLabel(0);
        this.f32821d.setPrimaryColor(Color.parseColor("#e5e5e5"));
        this.f32821d.m223127H().subscribe(mkd0.m154955G(new e30() { // from class: l.d320
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83448a.m50421f(act, (CharSequence) obj);
            }
        }));
        TextView textView = this.f32820c;
        StatusesItem statusesItem = userM169527p9.nameStatus;
        textView.setText(Html.fromHtml(statusesItem != null ? statusesItem.text : act.getString(R$string.f18103Rq)));
        this.f32820c.setGravity(17);
        this.f32819b.setText(R$string.f18133Sq);
    }

    /* JADX INFO: renamed from: i */
    public void m50424i(final Act act, final d30 d30Var) {
        xdl0.m208329E0(this.f32822e, new View.OnClickListener() { // from class: l.c320
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78432a.m50422g(act, d30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50420e(this);
    }

    public NameFakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NameFakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
