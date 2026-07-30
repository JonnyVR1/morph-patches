package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.VText_Medium;
import l.d30;
import l.t100;
import l.u4c0;
import l.upa;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UploadGuideImageView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f5527a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f5528b;

    /* JADX INFO: renamed from: c */
    public ImageView f5529c;

    /* JADX INFO: renamed from: d */
    public TextView f5530d;

    /* JADX INFO: renamed from: e */
    public View f5531e;

    /* JADX INFO: renamed from: f */
    public ViewGroup f5532f;

    /* JADX INFO: renamed from: g */
    public d30 f5533g;

    public UploadGuideImageView(@NonNull Context context) {
        super(context);
        this.f5527a = 1;
    }

    private void setImage(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f5528b.setImageUrl(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m7756b(int i, String str) {
        ImageView imageView = new ImageView(getContext());
        int i2 = t100.s;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = t100.r;
        if (i == 4) {
            imageView.setImageResource(x2c0.gq);
        } else if (i == 5) {
            imageView.setImageResource(x2c0.aq);
        }
        this.f5532f.addView(imageView, layoutParams);
        VText_Medium vText_Medium = new VText_Medium(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xdl0.e, t100.x);
        layoutParams2.leftMargin = t100.d(27.0f);
        layoutParams2.rightMargin = t100.d(27.0f);
        layoutParams2.topMargin = t100.F;
        layoutParams2.gravity = 1;
        vText_Medium.setGravity(1);
        vText_Medium.setTextSize(1, 13.0f);
        vText_Medium.setTextColor(getContext().getResources().getColor(w0c0.v0));
        vText_Medium.setText(str);
        this.f5532f.addView((View) vText_Medium, (ViewGroup.LayoutParams) layoutParams2);
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(t100.K, t100.w);
        layoutParams3.topMargin = t100.d(104.0f);
        layoutParams3.gravity = 1;
        textView.setBackgroundResource(x2c0.Y0);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(getContext().getResources().getColor(w0c0.P0));
        textView.setText("重新上传");
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.ztj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23901a.m7757c(view);
            }
        });
        this.f5532f.addView(textView, layoutParams3);
        this.f5532f.setBackgroundResource(x2c0.X0);
        xdl0.M(this.f5532f, true);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m7757c(View view) {
        d30 d30Var = this.f5533g;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m7758d(int i, String str, String str2) {
        m7759e(i, str);
        setImage(str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m7759e(int i, String str) {
        xdl0.M(this.f5531e, true);
        xdl0.M(this.f5532f, false);
        View view = this.f5531e;
        if (view != null) {
            xdl0.U(view, t100.h);
            int i2 = this.f5527a;
            if (i2 == 0) {
                xdl0.U(this.f5531e, t100.g);
            } else if (i2 == 2) {
                xdl0.U(this.f5531e, t100.i);
            }
        }
        this.f5532f.removeAllViews();
        this.f5530d.setText(str);
        if (i == 1) {
            this.f5529c.setImageResource(upa.z() ? x2c0.eq : x2c0.dq);
            this.f5531e.setBackgroundResource(x2c0.Z0);
            return;
        }
        if (i == 2) {
            this.f5529c.setImageResource(x2c0.fq);
            this.f5531e.setBackgroundResource(x2c0.a1);
        } else {
            if (i == 3) {
                this.f5529c.setImageResource(upa.z() ? x2c0.cq : x2c0.bq);
                this.f5531e.setBackgroundResource(x2c0.b1);
                return;
            }
            View view2 = this.f5531e;
            if (i != 4) {
                xdl0.M(view2, false);
            } else {
                xdl0.M(view2, false);
                m7756b(i, str);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5528b = findViewById(u4c0.x9);
        this.f5529c = (ImageView) findViewById(u4c0.u5);
        this.f5530d = (TextView) findViewById(u4c0.Pd);
        this.f5531e = findViewById(u4c0.Gd);
        this.f5532f = (ViewGroup) findViewById(u4c0.rb);
    }

    public void setRefusedClickCallback(d30 d30Var) {
        this.f5533g = d30Var;
    }

    public void setSizeType(int i) {
        this.f5527a = i;
    }

    public UploadGuideImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5527a = 1;
    }

    public UploadGuideImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5527a = 1;
    }
}
