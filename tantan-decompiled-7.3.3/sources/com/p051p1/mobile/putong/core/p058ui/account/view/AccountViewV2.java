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
import p153l.qa00;
import p153l.uqb0;
import p153l.x20;
import p153l.y00;

/* JADX INFO: loaded from: classes9.dex */
public class AccountViewV2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f29119a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f29120b;

    /* JADX INFO: renamed from: c */
    public ImageView f29121c;

    /* JADX INFO: renamed from: d */
    public TextView f29122d;

    /* JADX INFO: renamed from: e */
    public TextView f29123e;

    /* JADX INFO: renamed from: f */
    public boolean f29124f;

    public AccountViewV2(Context context) {
        super(context);
        this.f29124f = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m45389c(View view) {
        y00.m213826a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public boolean m45390d(final x20 x20Var) {
        boolean z = this.f29124f;
        this.f29124f = !z;
        ImageView imageView = this.f29121c;
        if (z) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            this.f29121c.setOnClickListener(new View.OnClickListener() { // from class: l.w00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f186524a.m45392f(x20Var, view);
                }
            });
        }
        return this.f29124f;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m45391e(x20 x20Var) {
        this.f29120b.setVisibility(8);
        this.f29122d.setText(getResources().getText(R$string.f28627S3));
        this.f29122d.setTextColor(Color.parseColor("#66000000"));
        x20Var.call();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m45392f(final x20 x20Var, View view) {
        ((Act) getContext()).dialog().m21499D(R$string.f28653Y).m21540k0(R$string.f28643W).m21555t0(R$string.f28648X, new Runnable() { // from class: l.x00
            @Override // java.lang.Runnable
            public final void run() {
                this.f191858a.m45391e(x20Var);
            }
        }).m21567z0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45389c(this);
    }

    public void setData(RememberUserInfo rememberUserInfo) {
        boolean zM82486a = NullChecker.m82486a(rememberUserInfo);
        TextView textView = this.f29122d;
        if (zM82486a) {
            textView.setText(rememberUserInfo.name);
            this.f29122d.setTextColor(Color.parseColor("#ff000000"));
            this.f29120b.setVisibility(0);
            uqb0.f180374G.m127109I0(this.f29120b, rememberUserInfo.imgUrl, qa00.m175859d(98.0f), qa00.m175859d(98.0f));
            setSelected(CoreModule.f18264c.f20369a0.m188270x3(rememberUserInfo));
            return;
        }
        textView.setText(getResources().getText(R$string.f28627S3));
        this.f29122d.setTextColor(Color.parseColor("#66000000"));
        this.f29120b.setVisibility(8);
        this.f29123e.setVisibility(4);
        setSelected(false);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        TextView textView = this.f29123e;
        if (z) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
    }

    public AccountViewV2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29124f = false;
    }
}
