package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

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
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.AutoVDraweeView;
import p149l.d30;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class UploadGuideImageView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f26749a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f26750b;

    /* JADX INFO: renamed from: c */
    public ImageView f26751c;

    /* JADX INFO: renamed from: d */
    public TextView f26752d;

    /* JADX INFO: renamed from: e */
    public View f26753e;

    /* JADX INFO: renamed from: f */
    public ViewGroup f26754f;

    /* JADX INFO: renamed from: g */
    public d30 f26755g;

    public UploadGuideImageView(@NonNull Context context) {
        super(context);
        this.f26749a = 1;
    }

    private void setImage(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26750b.setImageUrl(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m43510b(int i, String str) {
        ImageView imageView = new ImageView(getContext());
        int i2 = t100.f167270s;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = t100.f167269r;
        if (i == 4) {
            imageView.setImageResource(x2c0.f190183gq);
        } else if (i == 5) {
            imageView.setImageResource(x2c0.f189992aq);
        }
        this.f26754f.addView(imageView, layoutParams);
        VText_Medium vText_Medium = new VText_Medium(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xdl0.f192403e, t100.f167275x);
        layoutParams2.leftMargin = t100.m186890d(27.0f);
        layoutParams2.rightMargin = t100.m186890d(27.0f);
        layoutParams2.topMargin = t100.f167231F;
        layoutParams2.gravity = 1;
        vText_Medium.setGravity(1);
        vText_Medium.setTextSize(1, 13.0f);
        vText_Medium.setTextColor(getContext().getResources().getColor(w0c0.f183894v0));
        vText_Medium.setText(str);
        this.f26754f.addView(vText_Medium, layoutParams2);
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(t100.f167236K, t100.f167274w);
        layoutParams3.topMargin = t100.m186890d(104.0f);
        layoutParams3.gravity = 1;
        textView.setBackgroundResource(x2c0.f189904Y0);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(getContext().getResources().getColor(w0c0.f183795P0));
        textView.setText("重新上传");
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.ztj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204729a.m43511c(view);
            }
        });
        this.f26754f.addView(textView, layoutParams3);
        this.f26754f.setBackgroundResource(x2c0.f189873X0);
        xdl0.m208344M(this.f26754f, true);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m43511c(View view) {
        d30 d30Var = this.f26755g;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m43512d(int i, String str, String str2) {
        m43513e(i, str);
        setImage(str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m43513e(int i, String str) {
        xdl0.m208344M(this.f26753e, true);
        xdl0.m208344M(this.f26754f, false);
        View view = this.f26753e;
        if (view != null) {
            xdl0.m208357U(view, t100.f167259h);
            int i2 = this.f26749a;
            if (i2 == 0) {
                xdl0.m208357U(this.f26753e, t100.f167258g);
            } else if (i2 == 2) {
                xdl0.m208357U(this.f26753e, t100.f167260i);
            }
        }
        this.f26754f.removeAllViews();
        this.f26752d.setText(str);
        if (i == 1) {
            this.f26751c.setImageResource(upa.m194847z() ? x2c0.f190119eq : x2c0.f190087dq);
            this.f26753e.setBackgroundResource(x2c0.f189935Z0);
            return;
        }
        if (i == 2) {
            this.f26751c.setImageResource(x2c0.f190151fq);
            this.f26753e.setBackgroundResource(x2c0.f189967a1);
        } else {
            if (i == 3) {
                this.f26751c.setImageResource(upa.m194847z() ? x2c0.f190056cq : x2c0.f190024bq);
                this.f26753e.setBackgroundResource(x2c0.f189999b1);
                return;
            }
            View view2 = this.f26753e;
            if (i != 4) {
                xdl0.m208344M(view2, false);
            } else {
                xdl0.m208344M(view2, false);
                m43510b(i, str);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f26750b = (AutoVDraweeView) findViewById(u4c0.f174551x9);
        this.f26751c = (ImageView) findViewById(u4c0.f174496u5);
        this.f26752d = (TextView) findViewById(u4c0.f173985Pd);
        this.f26753e = findViewById(u4c0.f173832Gd);
        this.f26754f = (ViewGroup) findViewById(u4c0.f174451rb);
    }

    public void setRefusedClickCallback(d30 d30Var) {
        this.f26755g = d30Var;
    }

    public void setSizeType(int i) {
        this.f26749a = i;
    }

    public UploadGuideImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26749a = 1;
    }

    public UploadGuideImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26749a = 1;
    }
}
