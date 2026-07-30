package com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.view.LoveRadarSwitchView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.ekc0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class RadarSwitchView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f26141a;

    /* JADX INFO: renamed from: b */
    public VImage f26142b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f26143c;

    /* JADX INFO: renamed from: d */
    public VText f26144d;

    /* JADX INFO: renamed from: e */
    public LoveRadarSwitchView f26145e;

    /* JADX INFO: renamed from: f */
    public String f26146f;

    /* JADX INFO: renamed from: g */
    public y20<String> f26147g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView$a */
    public class ViewOnClickListenerC8307a implements View.OnClickListener {
        public ViewOnClickListenerC8307a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean zEquals = TextUtils.equals(RadarSwitchView.this.f26146f, "open");
            RadarSwitchView radarSwitchView = RadarSwitchView.this;
            if (zEquals) {
                radarSwitchView.m42927d("close");
            } else {
                radarSwitchView.m42927d("open");
            }
            if (RadarSwitchView.this.f26147g != null) {
                RadarSwitchView.this.f26147g.call(RadarSwitchView.this.f26146f);
            }
        }
    }

    public RadarSwitchView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26146f = "close";
    }

    /* JADX INFO: renamed from: c */
    public final void m42926c(View view) {
        ekc0.m121035a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m42927d(String str) {
        this.f26146f = str;
        boolean zEquals = TextUtils.equals(str, "open");
        VImage vImage = this.f26142b;
        if (zEquals) {
            vImage.setBackgroundResource(dbc0.f86049C8);
            uqb0.f180374G.m127098D(this.f26141a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ik5QSkgzQzJRRTQ3TkxKNUpPVFVSQ0hRTTRFQjJBTDE0IiwidyI6MTAwNSwiaCI6MzMzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzIzNzM0MjAwMjEyMzc0MTI3Mn0.webp");
            this.f26145e.m44918e("open");
            this.f26143c.setText("缘分雷达已开启");
            this.f26144d.setText("自动发送招呼语给合适配对好友，避免和缘分擦肩而过");
            return;
        }
        vImage.setBackgroundResource(dbc0.f86017B8);
        uqb0.f180374G.m127098D(this.f26141a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJTU1ZDU1BHTUxPS081UUFIV1gzWFNGVlBCRFIzNjE0IiwidyI6MTAwNSwiaCI6MzMzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzgxNDM2NjgwODMwNDc1MzM3Mn0.webp");
        this.f26145e.m44918e("close");
        this.f26143c.setText("缘分雷达已关闭");
        this.f26144d.setText("系统会停止对配对用户自动发送招呼语");
    }

    public String getCurState() {
        return this.f26146f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42926c(this);
        bnl0.m105509E0(this.f26145e, new ViewOnClickListenerC8307a());
    }

    public void setAfterChangeStateListener(y20<String> y20Var) {
        this.f26147g = y20Var;
    }

    public void setCurState(String str) {
        this.f26146f = str;
        m42927d(str);
    }

    public RadarSwitchView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadarSwitchView(Context context) {
        this(context, null);
    }
}
