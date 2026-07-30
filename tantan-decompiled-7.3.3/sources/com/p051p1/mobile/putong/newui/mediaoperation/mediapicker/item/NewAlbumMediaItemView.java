package com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13230a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.cbc0;
import p153l.io20;
import p153l.oki;
import p153l.psh0;
import p153l.rn20;
import p153l.uqb0;
import p153l.ycc0;

/* JADX INFO: loaded from: classes10.dex */
public class NewAlbumMediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public NewAlbumMediaItemView f54885a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54886b;

    /* JADX INFO: renamed from: c */
    public ImageView f54887c;

    /* JADX INFO: renamed from: d */
    public VText f54888d;

    /* JADX INFO: renamed from: e */
    public VImage f54889e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f54890f;

    /* JADX INFO: renamed from: g */
    public TextView f54891g;

    /* JADX INFO: renamed from: h */
    public View f54892h;

    /* JADX INFO: renamed from: i */
    public VText f54893i;

    /* JADX INFO: renamed from: j */
    public Media f54894j;

    /* JADX INFO: renamed from: k */
    public int f54895k;

    /* JADX INFO: renamed from: l */
    public rn20 f54896l;

    /* JADX INFO: renamed from: m */
    public MediaPickerParamsObject f54897m;

    public NewAlbumMediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m80190a(View view) {
        io20.m141244a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public boolean m80191b(Media media, rn20 rn20Var) {
        Video videoMo63732q0 = rn20Var.mo63732q0();
        if (!NullChecker.m82486a(videoMo63732q0)) {
            return false;
        }
        if (videoMo63732q0.equals(media)) {
            return true;
        }
        if (NullChecker.m82486a(videoMo63732q0.originUrl)) {
            return oki.m168011B(videoMo63732q0.originUrl).equals(media.url);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final String m80192c(float f) {
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
    public void m80193d(boolean z) {
        if (!z || this.f54897m.radioNeedCheckBox) {
            this.f54891g.setVisibility(0);
        } else {
            this.f54891g.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m80194e(Media media, int i, String str, rn20 rn20Var, Boolean bool, Boolean bool2, MediaPickerParamsObject mediaPickerParamsObject) {
        this.f54894j = media;
        this.f54895k = i;
        this.f54896l = rn20Var;
        this.f54897m = mediaPickerParamsObject;
        uqb0.f180374G.m127150m0(this.f54886b, str);
        this.f54893i.setVisibility(8);
        if (media instanceof Video) {
            m80193d(mediaPickerParamsObject.videoPickConfig.isRadio());
            m80196g(media, rn20Var, bool);
        } else {
            m80193d(mediaPickerParamsObject.imagePickConfig.isRadio());
            m80195f(media, rn20Var, bool2);
        }
        bnl0.m105524M(this.f54890f, mediaPickerParamsObject.fromType != 12);
    }

    /* JADX INFO: renamed from: f */
    public void m80195f(Media media, rn20 rn20Var, Boolean bool) {
        bnl0.m105524M(this.f54892h, bool.booleanValue());
        setSelectPosition("");
        if (rn20Var.mo63733x().containsKey(media.url)) {
            setChecked(true);
            setSelectPosition((new ArrayList(rn20Var.mo63733x().keySet()).indexOf(this.f54894j.url) + 1) + "");
            bnl0.m105524M(this.f54892h, false);
        } else if (rn20Var.mo63733x().containsKey(media.originUrl)) {
            setChecked(true);
            setSelectPosition((new ArrayList(rn20Var.mo63733x().keySet()).indexOf(this.f54894j.originUrl) + 1) + "");
            bnl0.m105524M(this.f54892h, false);
        } else {
            setChecked(false);
        }
        this.f54888d.setVisibility(8);
    }

    /* JADX INFO: renamed from: g */
    public void m80196g(Media media, rn20 rn20Var, Boolean bool) {
        bnl0.m105524M(this.f54892h, bool.booleanValue());
        if (m80191b(media, rn20Var)) {
            setChecked(true);
            bnl0.m105524M(this.f54892h, false);
        } else {
            setChecked(false);
        }
        Video video = (Video) media;
        if (video.duration == 0.0f) {
            video.duration = C13230a.m80201d(rn20Var.mo63697C().act(), media.url);
        }
        float f = video.duration;
        VText vText = this.f54888d;
        if (f >= 0.0f) {
            vText.setText(m80192c(f));
        } else {
            vText.setText(R$string.f18233v3);
        }
        this.f54888d.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == ycc0.f198474p) {
            this.f54896l.mo63700G1(this, this.f54894j, this.f54895k);
        } else if (view.getId() == ycc0.f198473o0) {
            this.f54896l.mo63730f(this, this.f54894j, this.f54895k);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m80190a(this);
        this.f54890f.setOnClickListener(this);
        this.f54885a.setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM173642a = psh0.m173642a(i, i2);
        super.onMeasure(iM173642a, iM173642a);
    }

    public void setChecked(boolean z) {
        TextView textView = this.f54891g;
        if (z) {
            textView.setBackgroundResource(this.f54897m.isNewUIAb ? cbc0.f80725C0 : cbc0.f80727D0);
        } else {
            textView.setBackgroundResource(this.f54897m.isNewUIAb ? cbc0.f80729E0 : cbc0.f80723B0);
        }
        invalidate();
    }

    public void setSelectPosition(String str) {
        this.f54893i.setVisibility(0);
        this.f54893i.setText(str);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f54889e;
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
