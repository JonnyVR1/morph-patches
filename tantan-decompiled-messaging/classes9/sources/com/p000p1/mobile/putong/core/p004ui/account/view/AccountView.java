package com.p000p1.mobile.putong.core.p004ui.account.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e3c0;
import l.f10;
import l.t100;
import p006l.qib0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4332a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4333b;

    /* JADX INFO: renamed from: c */
    public ImageView f4334c;

    /* JADX INFO: renamed from: d */
    public TextView f4335d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f4336e;

    /* JADX INFO: renamed from: f */
    public boolean f4337f;

    public AccountView(Context context) {
        super(context);
        this.f4337f = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m7148c(View view) {
        f10.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public boolean m7149d(final d30 d30Var) {
        boolean z = this.f4337f;
        this.f4337f = !z;
        ImageView imageView = this.f4334c;
        if (z) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            this.f4334c.setOnClickListener(new View.OnClickListener() { // from class: l.a10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8042a.m7151f(d30Var, view);
                }
            });
        }
        return this.f4337f;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7150e(d30 d30Var) {
        this.f4333b.setVisibility(8);
        this.f4335d.setText(getResources().getText(R.string.S3));
        this.f4335d.setTextColor(Color.parseColor("#999999"));
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m7151f(final d30 d30Var, View view) {
        getContext().dialog().D(R.string.Y).k0(R.string.W).t0(R.string.X, new Runnable() { // from class: l.b10
            @Override // java.lang.Runnable
            public final void run() {
                this.f8650a.m7150e(d30Var);
            }
        }).z0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7148c(this);
    }

    public void setData(RememberUserInfo rememberUserInfo) {
        boolean zA = NullChecker.a(rememberUserInfo);
        TextView textView = this.f4335d;
        if (zA) {
            textView.setText(rememberUserInfo.name);
            this.f4335d.setTextColor(Color.parseColor("#de000000"));
            this.f4333b.setVisibility(0);
            qib0.f19782G.m12738I0(this.f4333b, rememberUserInfo.imgUrl, t100.d(80.0f), t100.d(80.0f));
            setSelected(CoreModule.f1534c.f3616a0.m21766x3(rememberUserInfo));
            return;
        }
        textView.setText(getResources().getText(R.string.S3));
        this.f4335d.setTextColor(Color.parseColor("#999999"));
        this.f4333b.setVisibility(8);
        this.f4336e.setVisibility(4);
        setSelected(false);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (z) {
            this.f4332a.setBackgroundResource(e3c0.k);
            this.f4336e.setVisibility(0);
        } else {
            this.f4336e.setVisibility(4);
            this.f4332a.setBackgroundResource(0);
        }
    }

    public AccountView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4337f = false;
    }
}
