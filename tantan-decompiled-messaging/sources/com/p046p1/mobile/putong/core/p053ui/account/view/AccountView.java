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
import p149l.e3c0;
import p149l.f10;
import p149l.qib0;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class AccountView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f28265a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f28266b;

    /* JADX INFO: renamed from: c */
    public ImageView f28267c;

    /* JADX INFO: renamed from: d */
    public TextView f28268d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f28269e;

    /* JADX INFO: renamed from: f */
    public boolean f28270f;

    public AccountView(Context context) {
        super(context);
        this.f28270f = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m44200c(View view) {
        f10.m119059a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public boolean m44201d(final d30 d30Var) {
        boolean z = this.f28270f;
        this.f28270f = !z;
        ImageView imageView = this.f28267c;
        if (z) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            this.f28267c.setOnClickListener(new View.OnClickListener() { // from class: l.a10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f67089a.m44203f(d30Var, view);
                }
            });
        }
        return this.f28270f;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m44202e(d30 d30Var) {
        this.f28266b.setVisibility(8);
        this.f28268d.setText(getResources().getText(R$string.f27779S3));
        this.f28268d.setTextColor(Color.parseColor("#999999"));
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m44203f(final d30 d30Var, View view) {
        ((Act) getContext()).dialog().m20500D(R$string.f27805Y).m20541k0(R$string.f27795W).m20556t0(R$string.f27800X, new Runnable() { // from class: l.b10
            @Override // java.lang.Runnable
            public final void run() {
                this.f72480a.m44202e(d30Var);
            }
        }).m20568z0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44200c(this);
    }

    public void setData(RememberUserInfo rememberUserInfo) {
        boolean zM81303a = NullChecker.m81303a(rememberUserInfo);
        TextView textView = this.f28268d;
        if (zM81303a) {
            textView.setText(rememberUserInfo.name);
            this.f28268d.setTextColor(Color.parseColor("#de000000"));
            this.f28266b.setVisibility(0);
            qib0.f154691G.m102325I0(this.f28266b, rememberUserInfo.imgUrl, t100.m186890d(80.0f), t100.m186890d(80.0f));
            setSelected(CoreModule.f17545c.f19627a0.m171574x3(rememberUserInfo));
            return;
        }
        textView.setText(getResources().getText(R$string.f27779S3));
        this.f28268d.setTextColor(Color.parseColor("#999999"));
        this.f28266b.setVisibility(8);
        this.f28269e.setVisibility(4);
        setSelected(false);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (z) {
            this.f28265a.setBackgroundResource(e3c0.f89120k);
            this.f28269e.setVisibility(0);
        } else {
            this.f28269e.setVisibility(4);
            this.f28265a.setBackgroundResource(0);
        }
    }

    public AccountView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28270f = false;
    }
}
