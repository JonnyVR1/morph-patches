package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import l.ikh0;
import l.qib0;
import l.rhi;
import p007l.vum;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class InstaMediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1813a;

    /* JADX INFO: renamed from: b */
    public ImageView f1814b;

    /* JADX INFO: renamed from: c */
    public VText f1815c;

    /* JADX INFO: renamed from: d */
    public View f1816d;

    /* JADX INFO: renamed from: e */
    public MarkView f1817e;

    /* JADX INFO: renamed from: f */
    public Media f1818f;

    /* JADX INFO: renamed from: g */
    public int f1819g;

    /* JADX INFO: renamed from: h */
    public MediaPickerBaseAct.a f1820h;

    public InstaMediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m3309a(View view) {
        vum.m15585a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m3310b(float f) {
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
    public void m3311c(Media media, int i, boolean z, MediaPickerBaseAct.a aVar) {
        this.f1818f = media;
        this.f1819g = i;
        this.f1820h = aVar;
        qib0.G.m0(this.f1813a, media.url);
        int iG = aVar.G();
        View view = this.f1816d;
        if (iG == i) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        if (z) {
            this.f1817e.setVisibility(0);
            boolean zContainsKey = aVar.x().containsKey(media.url);
            MarkView markView = this.f1817e;
            if (zContainsKey) {
                markView.setChecked(true);
                this.f1817e.setSelectPosition(new ArrayList(aVar.x().keySet()).indexOf(this.f1818f.url) + 1);
            } else {
                markView.setChecked(false);
            }
        } else {
            int iG2 = aVar.G();
            MarkView markView2 = this.f1817e;
            if (iG2 == i) {
                markView2.setVisibility(0);
                this.f1817e.setChecked(true);
                this.f1817e.setSelectPosition(0);
            } else {
                markView2.setVisibility(4);
                this.f1817e.setChecked(false);
            }
        }
        if (!(media instanceof Video)) {
            this.f1815c.setVisibility(8);
            return;
        }
        Video video = (Video) media;
        if (video.duration == 0.0f) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(rhi.z(media.url));
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (!TextUtils.isEmpty(strExtractMetadata)) {
                        ((Video) media).duration = Long.parseLong(strExtractMetadata);
                    }
                } catch (Exception e) {
                    CrashHelper.c(e);
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
        VText vText = this.f1815c;
        if (f >= 0.0f) {
            vText.setText(m3310b(f));
        } else {
            vText.setText(R$string.f589p5);
        }
        this.f1815c.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f1820h.y(this.f1818f, this.f1819g);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3309a(this);
        setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iA = ikh0.a(i, i2);
        super.onMeasure(iA, iA);
    }

    public InstaMediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstaMediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
