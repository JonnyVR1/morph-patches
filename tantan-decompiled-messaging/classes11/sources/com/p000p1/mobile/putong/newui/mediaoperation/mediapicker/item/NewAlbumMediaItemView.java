package com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.C0469a;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.ikh0;
import l.qib0;
import l.rhi;
import l.s4c0;
import l.w2c0;
import l.xdl0;
import l.yf20;
import p009l.hf20;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewAlbumMediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public NewAlbumMediaItemView f7643a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7644b;

    /* JADX INFO: renamed from: c */
    public ImageView f7645c;

    /* JADX INFO: renamed from: d */
    public VText f7646d;

    /* JADX INFO: renamed from: e */
    public VImage f7647e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f7648f;

    /* JADX INFO: renamed from: g */
    public TextView f7649g;

    /* JADX INFO: renamed from: h */
    public View f7650h;

    /* JADX INFO: renamed from: i */
    public VText f7651i;

    /* JADX INFO: renamed from: j */
    public Media f7652j;

    /* JADX INFO: renamed from: k */
    public int f7653k;

    /* JADX INFO: renamed from: l */
    public hf20 f7654l;

    /* JADX INFO: renamed from: m */
    public MediaPickerParamsObject f7655m;

    public NewAlbumMediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9315a(View view) {
        yf20.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public boolean m9316b(Media media, hf20 hf20Var) {
        Video videoMo9296q0 = hf20Var.mo9296q0();
        if (!NullChecker.a(videoMo9296q0)) {
            return false;
        }
        if (videoMo9296q0.equals(media)) {
            return true;
        }
        if (NullChecker.a(((Media) videoMo9296q0).originUrl)) {
            return rhi.B(((Media) videoMo9296q0).originUrl).equals(media.url);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final String m9317c(float f) {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f / 1000.0f);
        if (i2 >= 60) {
            i = i2 / 60;
            i2 %= 60;
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append(":");
        if (i2 < 10) {
            sb.append("0");
            sb.append(i2);
        } else {
            sb.append(i2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public void m9318d(boolean z) {
        if (!z || this.f7655m.radioNeedCheckBox) {
            this.f7649g.setVisibility(0);
        } else {
            this.f7649g.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m9319e(Media media, int i, String str, hf20 hf20Var, Boolean bool, Boolean bool2, MediaPickerParamsObject mediaPickerParamsObject) {
        this.f7652j = media;
        this.f7653k = i;
        this.f7654l = hf20Var;
        this.f7655m = mediaPickerParamsObject;
        qib0.G.m0(this.f7644b, str);
        this.f7651i.setVisibility(8);
        if (media instanceof Video) {
            m9318d(mediaPickerParamsObject.videoPickConfig.isRadio());
            m9321g(media, hf20Var, bool);
        } else {
            m9318d(mediaPickerParamsObject.imagePickConfig.isRadio());
            m9320f(media, hf20Var, bool2);
        }
        xdl0.M(this.f7648f, mediaPickerParamsObject.fromType != 12);
    }

    /* JADX INFO: renamed from: f */
    public void m9320f(Media media, hf20 hf20Var, Boolean bool) {
        xdl0.M(this.f7650h, bool.booleanValue());
        setSelectPosition("");
        if (hf20Var.mo9297x().containsKey(media.url)) {
            setChecked(true);
            setSelectPosition((new ArrayList(hf20Var.mo9297x().keySet()).indexOf(this.f7652j.url) + 1) + "");
            xdl0.M(this.f7650h, false);
        } else if (hf20Var.mo9297x().containsKey(media.originUrl)) {
            setChecked(true);
            setSelectPosition((new ArrayList(hf20Var.mo9297x().keySet()).indexOf(this.f7652j.originUrl) + 1) + "");
            xdl0.M(this.f7650h, false);
        } else {
            setChecked(false);
        }
        this.f7646d.setVisibility(8);
    }

    /* JADX INFO: renamed from: g */
    public void m9321g(Media media, hf20 hf20Var, Boolean bool) {
        xdl0.M(this.f7650h, bool.booleanValue());
        if (m9316b(media, hf20Var)) {
            setChecked(true);
            xdl0.M(this.f7650h, false);
        } else {
            setChecked(false);
        }
        Video video = (Video) media;
        if (video.duration == 0.0f) {
            video.duration = C0469a.m9326d(hf20Var.mo9270C().act(), media.url);
        }
        float f = video.duration;
        VText vText = this.f7646d;
        if (f >= 0.0f) {
            vText.setText(m9317c(f));
        } else {
            vText.setText(R.string.v3);
        }
        this.f7646d.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == s4c0.p) {
            this.f7654l.mo9218G1(this, this.f7652j, this.f7653k);
        } else if (view.getId() == s4c0.o0) {
            this.f7654l.mo9235f(this, this.f7652j, this.f7653k);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9315a(this);
        this.f7648f.setOnClickListener(this);
        this.f7643a.setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iA = ikh0.a(i, i2);
        super.onMeasure(iA, iA);
    }

    public void setChecked(boolean z) {
        TextView textView = this.f7649g;
        if (z) {
            textView.setBackgroundResource(this.f7655m.isNewUIAb ? w2c0.C0 : w2c0.D0);
        } else {
            textView.setBackgroundResource(this.f7655m.isNewUIAb ? w2c0.E0 : w2c0.B0);
        }
        invalidate();
    }

    public void setSelectPosition(String str) {
        this.f7651i.setVisibility(0);
        this.f7651i.setText(str);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f7647e;
        if (zIsEmpty) {
            vImage.setVisibility(8);
        } else {
            vImage.setVisibility(0);
        }
    }

    public NewAlbumMediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewAlbumMediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
