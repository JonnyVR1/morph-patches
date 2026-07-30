package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

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
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.AutoVDraweeView;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.gra;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class UploadGuideImageView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f27597a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f27598b;

    /* JADX INFO: renamed from: c */
    public ImageView f27599c;

    /* JADX INFO: renamed from: d */
    public TextView f27600d;

    /* JADX INFO: renamed from: e */
    public View f27601e;

    /* JADX INFO: renamed from: f */
    public ViewGroup f27602f;

    /* JADX INFO: renamed from: g */
    public x20 f27603g;

    public UploadGuideImageView(@NonNull Context context) {
        super(context);
        this.f27597a = 1;
    }

    private void setImage(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f27598b.setImageUrl(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m44696b(int i, String str) {
        ImageView imageView = new ImageView(getContext());
        int i2 = qa00.f156332s;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = qa00.f156331r;
        if (i == 4) {
            imageView.setImageResource(dbc0.f86643Uq);
        } else if (i == 5) {
            imageView.setImageResource(dbc0.f86451Oq);
        }
        this.f27602f.addView(imageView, layoutParams);
        VText_Medium vText_Medium = new VText_Medium(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(bnl0.f77544e, qa00.f156337x);
        layoutParams2.leftMargin = qa00.m175859d(27.0f);
        layoutParams2.rightMargin = qa00.m175859d(27.0f);
        layoutParams2.topMargin = qa00.f156293F;
        layoutParams2.gravity = 1;
        vText_Medium.setGravity(1);
        vText_Medium.setTextSize(1, 13.0f);
        vText_Medium.setTextColor(getContext().getResources().getColor(c9c0.f80467w0));
        vText_Medium.setText(str);
        this.f27602f.addView(vText_Medium, layoutParams2);
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(qa00.f156298K, qa00.f156336w);
        layoutParams3.topMargin = qa00.m175859d(104.0f);
        layoutParams3.gravity = 1;
        textView.setBackgroundResource(dbc0.f86777Z0);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(getContext().getResources().getColor(c9c0.f80367Q0));
        textView.setText("重新上传");
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.c3k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79629a.m44697c(view);
            }
        });
        this.f27602f.addView(textView, layoutParams3);
        this.f27602f.setBackgroundResource(dbc0.f86745Y0);
        bnl0.m105524M(this.f27602f, true);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m44697c(View view) {
        x20 x20Var = this.f27603g;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m44698d(int i, String str, String str2) {
        m44699e(i, str);
        setImage(str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m44699e(int i, String str) {
        bnl0.m105524M(this.f27601e, true);
        bnl0.m105524M(this.f27602f, false);
        View view = this.f27601e;
        if (view != null) {
            bnl0.m105537U(view, qa00.f156321h);
            int i2 = this.f27597a;
            if (i2 == 0) {
                bnl0.m105537U(this.f27601e, qa00.f156320g);
            } else if (i2 == 2) {
                bnl0.m105537U(this.f27601e, qa00.f156322i);
            }
        }
        this.f27602f.removeAllViews();
        this.f27600d.setText(str);
        if (i == 1) {
            this.f27599c.setImageResource(gra.m131778z() ? dbc0.f86579Sq : dbc0.f86547Rq);
            this.f27601e.setBackgroundResource(dbc0.f86810a1);
            return;
        }
        if (i == 2) {
            this.f27599c.setImageResource(dbc0.f86611Tq);
            this.f27601e.setBackgroundResource(dbc0.f86843b1);
        } else {
            if (i == 3) {
                this.f27599c.setImageResource(gra.m131778z() ? dbc0.f86515Qq : dbc0.f86483Pq);
                this.f27601e.setBackgroundResource(dbc0.f86876c1);
                return;
            }
            View view2 = this.f27601e;
            if (i != 4) {
                bnl0.m105524M(view2, false);
            } else {
                bnl0.m105524M(view2, false);
                m44696b(i, str);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f27598b = (AutoVDraweeView) findViewById(adc0.f70676z9);
        this.f27599c = (ImageView) findViewById(adc0.f70621w5);
        this.f27600d = (TextView) findViewById(adc0.f70124Sd);
        this.f27601e = findViewById(adc0.f69954Id);
        this.f27602f = (ViewGroup) findViewById(adc0.f70576tb);
    }

    public void setRefusedClickCallback(x20 x20Var) {
        this.f27603g = x20Var;
    }

    public void setSizeType(int i) {
        this.f27597a = i;
    }

    public UploadGuideImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27597a = 1;
    }

    public UploadGuideImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27597a = 1;
    }
}
