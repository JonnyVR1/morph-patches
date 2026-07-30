package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VText;
import p149l.ikh0;
import p149l.qib0;
import p149l.rhi;
import p149l.vum;

/* JADX INFO: loaded from: classes12.dex */
public class InstaMediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40352a;

    /* JADX INFO: renamed from: b */
    public ImageView f40353b;

    /* JADX INFO: renamed from: c */
    public VText f40354c;

    /* JADX INFO: renamed from: d */
    public View f40355d;

    /* JADX INFO: renamed from: e */
    public MarkView f40356e;

    /* JADX INFO: renamed from: f */
    public Media f40357f;

    /* JADX INFO: renamed from: g */
    public int f40358g;

    /* JADX INFO: renamed from: h */
    public MediaPickerBaseAct.InterfaceC13127a f40359h;

    public InstaMediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m62317a(View view) {
        vum.m200085a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m62318b(float f) {
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
    public void m62319c(Media media, int i, boolean z, MediaPickerBaseAct.InterfaceC13127a interfaceC13127a) {
        this.f40357f = media;
        this.f40358g = i;
        this.f40359h = interfaceC13127a;
        qib0.f154691G.m102367m0(this.f40352a, media.url);
        int iMo47791G = interfaceC13127a.mo47791G();
        View view = this.f40355d;
        if (iMo47791G == i) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        if (z) {
            this.f40356e.setVisibility(0);
            boolean zContainsKey = interfaceC13127a.mo47800x().containsKey(media.url);
            MarkView markView = this.f40356e;
            if (zContainsKey) {
                markView.setChecked(true);
                this.f40356e.setSelectPosition(new ArrayList(interfaceC13127a.mo47800x().keySet()).indexOf(this.f40357f.url) + 1);
            } else {
                markView.setChecked(false);
            }
        } else {
            int iMo47791G2 = interfaceC13127a.mo47791G();
            MarkView markView2 = this.f40356e;
            if (iMo47791G2 == i) {
                markView2.setVisibility(0);
                this.f40356e.setChecked(true);
                this.f40356e.setSelectPosition(0);
            } else {
                markView2.setVisibility(4);
                this.f40356e.setChecked(false);
            }
        }
        if (!(media instanceof Video)) {
            this.f40354c.setVisibility(8);
            return;
        }
        Video video = (Video) media;
        if (video.duration == 0.0f) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(rhi.m179382z(media.url));
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (!TextUtils.isEmpty(strExtractMetadata)) {
                        ((Video) media).duration = Long.parseLong(strExtractMetadata);
                    }
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
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
        VText vText = this.f40354c;
        if (f >= 0.0f) {
            vText.setText(m62318b(f));
        } else {
            vText.setText(R$string.f39128p5);
        }
        this.f40354c.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f40359h.mo47801y(this.f40357f, this.f40358g);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62317a(this);
        setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM136799a = ikh0.m136799a(i, i2);
        super.onMeasure(iM136799a, iM136799a);
    }

    public InstaMediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstaMediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
