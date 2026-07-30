package com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13067a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.hf20;
import p149l.ikh0;
import p149l.qib0;
import p149l.rhi;
import p149l.s4c0;
import p149l.w2c0;
import p149l.xdl0;
import p149l.yf20;

/* JADX INFO: loaded from: classes11.dex */
public class NewAlbumMediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public NewAlbumMediaItemView f54037a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54038b;

    /* JADX INFO: renamed from: c */
    public ImageView f54039c;

    /* JADX INFO: renamed from: d */
    public VText f54040d;

    /* JADX INFO: renamed from: e */
    public VImage f54041e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f54042f;

    /* JADX INFO: renamed from: g */
    public TextView f54043g;

    /* JADX INFO: renamed from: h */
    public View f54044h;

    /* JADX INFO: renamed from: i */
    public VText f54045i;

    /* JADX INFO: renamed from: j */
    public Media f54046j;

    /* JADX INFO: renamed from: k */
    public int f54047k;

    /* JADX INFO: renamed from: l */
    public hf20 f54048l;

    /* JADX INFO: renamed from: m */
    public MediaPickerParamsObject f54049m;

    public NewAlbumMediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79007a(View view) {
        yf20.m214465a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public boolean m79008b(Media media, hf20 hf20Var) {
        Video videoMo62549q0 = hf20Var.mo62549q0();
        if (!NullChecker.m81303a(videoMo62549q0)) {
            return false;
        }
        if (videoMo62549q0.equals(media)) {
            return true;
        }
        if (NullChecker.m81303a(videoMo62549q0.originUrl)) {
            return rhi.m179355B(videoMo62549q0.originUrl).equals(media.url);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final String m79009c(float f) {
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
    public void m79010d(boolean z) {
        if (!z || this.f54049m.radioNeedCheckBox) {
            this.f54043g.setVisibility(0);
        } else {
            this.f54043g.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m79011e(Media media, int i, String str, hf20 hf20Var, Boolean bool, Boolean bool2, MediaPickerParamsObject mediaPickerParamsObject) {
        this.f54046j = media;
        this.f54047k = i;
        this.f54048l = hf20Var;
        this.f54049m = mediaPickerParamsObject;
        qib0.f154691G.m102367m0(this.f54038b, str);
        this.f54045i.setVisibility(8);
        if (media instanceof Video) {
            m79010d(mediaPickerParamsObject.videoPickConfig.isRadio());
            m79013g(media, hf20Var, bool);
        } else {
            m79010d(mediaPickerParamsObject.imagePickConfig.isRadio());
            m79012f(media, hf20Var, bool2);
        }
        xdl0.m208344M(this.f54042f, mediaPickerParamsObject.fromType != 12);
    }

    /* JADX INFO: renamed from: f */
    public void m79012f(Media media, hf20 hf20Var, Boolean bool) {
        xdl0.m208344M(this.f54044h, bool.booleanValue());
        setSelectPosition("");
        if (hf20Var.mo62550x().containsKey(media.url)) {
            setChecked(true);
            setSelectPosition((new ArrayList(hf20Var.mo62550x().keySet()).indexOf(this.f54046j.url) + 1) + "");
            xdl0.m208344M(this.f54044h, false);
        } else if (hf20Var.mo62550x().containsKey(media.originUrl)) {
            setChecked(true);
            setSelectPosition((new ArrayList(hf20Var.mo62550x().keySet()).indexOf(this.f54046j.originUrl) + 1) + "");
            xdl0.m208344M(this.f54044h, false);
        } else {
            setChecked(false);
        }
        this.f54040d.setVisibility(8);
    }

    /* JADX INFO: renamed from: g */
    public void m79013g(Media media, hf20 hf20Var, Boolean bool) {
        xdl0.m208344M(this.f54044h, bool.booleanValue());
        if (m79008b(media, hf20Var)) {
            setChecked(true);
            xdl0.m208344M(this.f54044h, false);
        } else {
            setChecked(false);
        }
        Video video = (Video) media;
        if (video.duration == 0.0f) {
            video.duration = C13067a.m79018d(hf20Var.mo62514C().act(), media.url);
        }
        float f = video.duration;
        VText vText = this.f54040d;
        if (f >= 0.0f) {
            vText.setText(m79009c(f));
        } else {
            vText.setText(R$string.f17514v3);
        }
        this.f54040d.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == s4c0.f162353p) {
            this.f54048l.mo62517G1(this, this.f54046j, this.f54047k);
        } else if (view.getId() == s4c0.f162352o0) {
            this.f54048l.mo62547f(this, this.f54046j, this.f54047k);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79007a(this);
        this.f54042f.setOnClickListener(this);
        this.f54037a.setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM136799a = ikh0.m136799a(i, i2);
        super.onMeasure(iM136799a, iM136799a);
    }

    public void setChecked(boolean z) {
        TextView textView = this.f54043g;
        if (z) {
            textView.setBackgroundResource(this.f54049m.isNewUIAb ? w2c0.f184129C0 : w2c0.f184131D0);
        } else {
            textView.setBackgroundResource(this.f54049m.isNewUIAb ? w2c0.f184133E0 : w2c0.f184127B0);
        }
        invalidate();
    }

    public void setSelectPosition(String str) {
        this.f54045i.setVisibility(0);
        this.f54045i.setText(str);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f54041e;
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
