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
import l.e10;
import l.t100;
import p006l.qib0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountViewV2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4338a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4339b;

    /* JADX INFO: renamed from: c */
    public ImageView f4340c;

    /* JADX INFO: renamed from: d */
    public TextView f4341d;

    /* JADX INFO: renamed from: e */
    public TextView f4342e;

    /* JADX INFO: renamed from: f */
    public boolean f4343f;

    public AccountViewV2(Context context) {
        super(context);
        this.f4343f = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m7154c(View view) {
        e10.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public boolean m7155d(final d30 d30Var) {
        boolean z = this.f4343f;
        this.f4343f = !z;
        ImageView imageView = this.f4340c;
        if (z) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            this.f4340c.setOnClickListener(new View.OnClickListener() { // from class: l.c10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9269a.m7157f(d30Var, view);
                }
            });
        }
        return this.f4343f;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7156e(d30 d30Var) {
        this.f4339b.setVisibility(8);
        this.f4341d.setText(getResources().getText(R.string.S3));
        this.f4341d.setTextColor(Color.parseColor("#66000000"));
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m7157f(final d30 d30Var, View view) {
        getContext().dialog().D(R.string.Y).k0(R.string.W).t0(R.string.X, new Runnable() { // from class: l.d10
            @Override // java.lang.Runnable
            public final void run() {
                this.f9967a.m7156e(d30Var);
            }
        }).z0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7154c(this);
    }

    public void setData(RememberUserInfo rememberUserInfo) {
        boolean zA = NullChecker.a(rememberUserInfo);
        TextView textView = this.f4341d;
        if (zA) {
            textView.setText(rememberUserInfo.name);
            this.f4341d.setTextColor(Color.parseColor("#ff000000"));
            this.f4339b.setVisibility(0);
            qib0.f19782G.m12738I0(this.f4339b, rememberUserInfo.imgUrl, t100.d(98.0f), t100.d(98.0f));
            setSelected(CoreModule.f1534c.f3616a0.m21766x3(rememberUserInfo));
            return;
        }
        textView.setText(getResources().getText(R.string.S3));
        this.f4341d.setTextColor(Color.parseColor("#66000000"));
        this.f4339b.setVisibility(8);
        this.f4342e.setVisibility(4);
        setSelected(false);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        TextView textView = this.f4342e;
        if (z) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
    }

    public AccountViewV2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4343f = false;
    }
}
