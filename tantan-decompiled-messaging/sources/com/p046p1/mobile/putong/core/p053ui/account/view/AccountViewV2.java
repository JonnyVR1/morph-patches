package com.p046p1.mobile.putong.core.p053ui.account.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.d30;
import p149l.e10;
import p149l.qib0;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class AccountViewV2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f28271a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f28272b;

    /* JADX INFO: renamed from: c */
    public ImageView f28273c;

    /* JADX INFO: renamed from: d */
    public TextView f28274d;

    /* JADX INFO: renamed from: e */
    public TextView f28275e;

    /* JADX INFO: renamed from: f */
    public boolean f28276f;

    public AccountViewV2(Context context) {
        super(context);
        this.f28276f = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m44206c(View view) {
        e10.m114357a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public boolean m44207d(final d30 d30Var) {
        boolean z = this.f28276f;
        this.f28276f = !z;
        ImageView imageView = this.f28273c;
        if (z) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            this.f28273c.setOnClickListener(new View.OnClickListener() { // from class: l.c10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f78193a.m44209f(d30Var, view);
                }
            });
        }
        return this.f28276f;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m44208e(d30 d30Var) {
        this.f28272b.setVisibility(8);
        this.f28274d.setText(getResources().getText(R$string.f27779S3));
        this.f28274d.setTextColor(Color.parseColor("#66000000"));
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m44209f(final d30 d30Var, View view) {
        ((Act) getContext()).dialog().m20500D(R$string.f27805Y).m20541k0(R$string.f27795W).m20556t0(R$string.f27800X, new Runnable() { // from class: l.d10
            @Override // java.lang.Runnable
            public final void run() {
                this.f83221a.m44208e(d30Var);
            }
        }).m20568z0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44206c(this);
    }

    public void setData(RememberUserInfo rememberUserInfo) {
        boolean zM81303a = NullChecker.m81303a(rememberUserInfo);
        TextView textView = this.f28274d;
        if (zM81303a) {
            textView.setText(rememberUserInfo.name);
            this.f28274d.setTextColor(Color.parseColor("#ff000000"));
            this.f28272b.setVisibility(0);
            qib0.f154691G.m102325I0(this.f28272b, rememberUserInfo.imgUrl, t100.m186890d(98.0f), t100.m186890d(98.0f));
            setSelected(CoreModule.f17545c.f19627a0.m171574x3(rememberUserInfo));
            return;
        }
        textView.setText(getResources().getText(R$string.f27779S3));
        this.f28274d.setTextColor(Color.parseColor("#66000000"));
        this.f28272b.setVisibility(8);
        this.f28275e.setVisibility(4);
        setSelected(false);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        TextView textView = this.f28275e;
        if (z) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
    }

    public AccountViewV2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28276f = false;
    }
}
