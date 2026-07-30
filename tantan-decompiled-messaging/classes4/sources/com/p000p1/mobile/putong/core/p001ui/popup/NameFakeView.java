package com.p000p1.mobile.putong.core.p001ui.popup;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.popup.NameFakeView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.StatusesItem;
import com.p1.mobile.putong.data.User;
import java.util.Objects;
import l.d30;
import l.e30;
import l.e51;
import l.h320;
import l.mkd0;
import l.nu0;
import l.roj0;
import l.x2c0;
import l.xdl0;
import l.yij0;
import v.VButton_FakeShadow;
import v.VMaterialEdit;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class NameFakeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public NameFakeView f640a;

    /* JADX INFO: renamed from: b */
    public VText f641b;

    /* JADX INFO: renamed from: c */
    public TextView f642c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f643d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f644e;

    public NameFakeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m851a(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m852b(final Act act, d30 d30Var, roj0 roj0Var) {
        Objects.requireNonNull(act);
        e51.H(act, new Runnable() { // from class: l.g320
            @Override // java.lang.Runnable
            public final void run() {
                act.hideInput();
            }
        }, 500L);
        act.progressDismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: e */
    public final void m855e(View view) {
        h320.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m856f(Act act, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f644e.setBackground(nu0.b(act, x2c0.Wt));
            this.f644e.setTextColor(Color.parseColor("#bdbdbd"));
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(yij0.L(charSequence.toString()));
        VButton_FakeShadow vButton_FakeShadow = this.f644e;
        if (zIsEmpty) {
            vButton_FakeShadow.setBackground(nu0.b(act, x2c0.Fu));
            this.f644e.setTextColor(-1);
        } else {
            vButton_FakeShadow.setBackground(nu0.b(act, x2c0.Wt));
            this.f644e.setTextColor(Color.parseColor("#bdbdbd"));
        }
        this.f643d.setError(yij0.L(charSequence.toString()));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m857g(final Act act, final d30 d30Var, View view) {
        String string = this.f643d.getText().toString();
        if (TextUtils.isEmpty(yij0.L(string))) {
            User user = new User();
            user.name = string;
            act.progress(act.getString(R.string.J5), true);
            CoreModule.c.e0.u9(user).subscribe(mkd0.H(new e30() { // from class: l.e320
                public final void call(Object obj) {
                    NameFakeView.m852b(act, d30Var, (roj0) obj);
                }
            }, new e30() { // from class: l.f320
                public final void call(Object obj) {
                    NameFakeView.m851a(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m858h(final Act act) {
        User userP9 = CoreModule.c.e0.p9();
        this.f643d.setSingleLine();
        this.f643d.setMaxLines(1);
        this.f643d.setMaxCharacters(50);
        this.f643d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        this.f643d.setFloatingLabel(0);
        this.f643d.setPrimaryColor(Color.parseColor("#e5e5e5"));
        this.f643d.H().subscribe(mkd0.G(new e30() { // from class: l.d320
            public final void call(Object obj) {
                this.f9050a.m856f(act, (CharSequence) obj);
            }
        }));
        TextView textView = this.f642c;
        StatusesItem statusesItem = userP9.nameStatus;
        textView.setText(Html.fromHtml(statusesItem != null ? statusesItem.text : act.getString(R.string.Rq)));
        this.f642c.setGravity(17);
        this.f641b.setText(R.string.Sq);
    }

    /* JADX INFO: renamed from: i */
    public void m859i(final Act act, final d30 d30Var) {
        xdl0.E0(this.f644e, new View.OnClickListener() { // from class: l.c320
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8470a.m857g(act, d30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m855e(this);
    }

    public NameFakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NameFakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
