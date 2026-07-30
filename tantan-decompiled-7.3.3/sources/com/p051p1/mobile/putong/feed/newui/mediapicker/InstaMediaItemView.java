package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VText;
import p153l.oki;
import p153l.psh0;
import p153l.uqb0;
import p153l.wwm;

/* JADX INFO: loaded from: classes13.dex */
public class InstaMediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f41200a;

    /* JADX INFO: renamed from: b */
    public ImageView f41201b;

    /* JADX INFO: renamed from: c */
    public VText f41202c;

    /* JADX INFO: renamed from: d */
    public View f41203d;

    /* JADX INFO: renamed from: e */
    public MarkView f41204e;

    /* JADX INFO: renamed from: f */
    public Media f41205f;

    /* JADX INFO: renamed from: g */
    public int f41206g;

    /* JADX INFO: renamed from: h */
    public MediaPickerBaseAct.InterfaceC13290a f41207h;

    public InstaMediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m63500a(View view) {
        wwm.m208261a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m63501b(float f) {
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

    /* JADX INFO: renamed from: c */
    public void m63502c(Media media, int i, boolean z, MediaPickerBaseAct.InterfaceC13290a interfaceC13290a) {
        this.f41205f = media;
        this.f41206g = i;
        this.f41207h = interfaceC13290a;
        uqb0.f180374G.m127150m0(this.f41200a, media.url);
        int iMo48974H = interfaceC13290a.mo48974H();
        View view = this.f41203d;
        if (iMo48974H == i) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        if (z) {
            this.f41204e.setVisibility(0);
            boolean zContainsKey = interfaceC13290a.mo48983x().containsKey(media.url);
            MarkView markView = this.f41204e;
            if (zContainsKey) {
                markView.setChecked(true);
                this.f41204e.setSelectPosition(new ArrayList(interfaceC13290a.mo48983x().keySet()).indexOf(this.f41205f.url) + 1);
            } else {
                markView.setChecked(false);
            }
        } else {
            int iMo48974H2 = interfaceC13290a.mo48974H();
            MarkView markView2 = this.f41204e;
            if (iMo48974H2 == i) {
                markView2.setVisibility(0);
                this.f41204e.setChecked(true);
                this.f41204e.setSelectPosition(0);
            } else {
                markView2.setVisibility(4);
                this.f41204e.setChecked(false);
            }
        }
        if (!(media instanceof Video)) {
            this.f41202c.setVisibility(8);
            return;
        }
        Video video = (Video) media;
        if (video.duration == 0.0f) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(oki.m168038z(media.url));
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (!TextUtils.isEmpty(strExtractMetadata)) {
                        ((Video) media).duration = Long.parseLong(strExtractMetadata);
                    }
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                    ((Video) media).duration = -1.0f;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        float f = video.duration;
        VText vText = this.f41202c;
        if (f >= 0.0f) {
            vText.setText(m63501b(f));
        } else {
            vText.setText(R$string.f39976p5);
        }
        this.f41202c.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f41207h.mo48984y(this.f41205f, this.f41206g);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63500a(this);
        setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM173642a = psh0.m173642a(i, i2);
        super.onMeasure(iM173642a, iM173642a);
    }

    public InstaMediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstaMediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
