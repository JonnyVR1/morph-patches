package com.p051p1.mobile.putong.core.p058ui.account.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.kbc0;
import p153l.qa00;
import p153l.uqb0;
import p153l.x20;
import p153l.z00;

/* JADX INFO: loaded from: classes9.dex */
public class AccountView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f29113a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f29114b;

    /* JADX INFO: renamed from: c */
    public ImageView f29115c;

    /* JADX INFO: renamed from: d */
    public TextView f29116d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f29117e;

    /* JADX INFO: renamed from: f */
    public boolean f29118f;

    public AccountView(Context context) {
        super(context);
        this.f29118f = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m45383c(View view) {
        z00.m218098a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public boolean m45384d(final x20 x20Var) {
        boolean z = this.f29118f;
        this.f29118f = !z;
        ImageView imageView = this.f29115c;
        if (z) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            this.f29115c.setOnClickListener(new View.OnClickListener() { // from class: l.u00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176838a.m45386f(x20Var, view);
                }
            });
        }
        return this.f29118f;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m45385e(x20 x20Var) {
        this.f29114b.setVisibility(8);
        this.f29116d.setText(getResources().getText(R$string.f28627S3));
        this.f29116d.setTextColor(Color.parseColor("#999999"));
        x20Var.call();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m45386f(final x20 x20Var, View view) {
        ((Act) getContext()).dialog().m21499D(R$string.f28653Y).m21540k0(R$string.f28643W).m21555t0(R$string.f28648X, new Runnable() { // from class: l.v00
            @Override // java.lang.Runnable
            public final void run() {
                this.f181829a.m45385e(x20Var);
            }
        }).m21567z0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45383c(this);
    }

    public void setData(RememberUserInfo rememberUserInfo) {
        boolean zM82486a = NullChecker.m82486a(rememberUserInfo);
        TextView textView = this.f29116d;
        if (zM82486a) {
            textView.setText(rememberUserInfo.name);
            this.f29116d.setTextColor(Color.parseColor("#de000000"));
            this.f29114b.setVisibility(0);
            uqb0.f180374G.m127109I0(this.f29114b, rememberUserInfo.imgUrl, qa00.m175859d(80.0f), qa00.m175859d(80.0f));
            setSelected(CoreModule.f18264c.f20369a0.m188270x3(rememberUserInfo));
            return;
        }
        textView.setText(getResources().getText(R$string.f28627S3));
        this.f29116d.setTextColor(Color.parseColor("#999999"));
        this.f29114b.setVisibility(8);
        this.f29117e.setVisibility(4);
        setSelected(false);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (z) {
            this.f29113a.setBackgroundResource(kbc0.f124883k);
            this.f29117e.setVisibility(0);
        } else {
            this.f29117e.setVisibility(4);
            this.f29113a.setBackgroundResource(0);
        }
    }

    public AccountView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29118f = false;
    }
}
