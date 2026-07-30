package com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.view.LoveRadarSwitchView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.qib0;
import p149l.x2c0;
import p149l.xbc0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class RadarSwitchView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f25399a;

    /* JADX INFO: renamed from: b */
    public VImage f25400b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f25401c;

    /* JADX INFO: renamed from: d */
    public VText f25402d;

    /* JADX INFO: renamed from: e */
    public LoveRadarSwitchView f25403e;

    /* JADX INFO: renamed from: f */
    public String f25404f;

    /* JADX INFO: renamed from: g */
    public e30<String> f25405g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView$a */
    public class ViewOnClickListenerC8156a implements View.OnClickListener {
        public ViewOnClickListenerC8156a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean zEquals = TextUtils.equals(RadarSwitchView.this.f25404f, "open");
            RadarSwitchView radarSwitchView = RadarSwitchView.this;
            if (zEquals) {
                radarSwitchView.m41916d("close");
            } else {
                radarSwitchView.m41916d("open");
            }
            if (RadarSwitchView.this.f25405g != null) {
                RadarSwitchView.this.f25405g.call(RadarSwitchView.this.f25404f);
            }
        }
    }

    public RadarSwitchView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25404f = "close";
    }

    /* JADX INFO: renamed from: c */
    public final void m41915c(View view) {
        xbc0.m207725a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m41916d(String str) {
        this.f25404f = str;
        boolean zEquals = TextUtils.equals(str, "open");
        VImage vImage = this.f25400b;
        if (zEquals) {
            vImage.setBackgroundResource(x2c0.f189194B8);
            qib0.f154691G.m102314D(this.f25399a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ik5QSkgzQzJRRTQ3TkxKNUpPVFVSQ0hRTTRFQjJBTDE0IiwidyI6MTAwNSwiaCI6MzMzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzIzNzM0MjAwMjEyMzc0MTI3Mn0.webp");
            this.f25403e.m43732e("open");
            this.f25401c.setText("缘分雷达已开启");
            this.f25402d.setText("自动发送招呼语给合适配对好友，避免和缘分擦肩而过");
            return;
        }
        vImage.setBackgroundResource(x2c0.f189162A8);
        qib0.f154691G.m102314D(this.f25399a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJTU1ZDU1BHTUxPS081UUFIV1gzWFNGVlBCRFIzNjE0IiwidyI6MTAwNSwiaCI6MzMzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzgxNDM2NjgwODMwNDc1MzM3Mn0.webp");
        this.f25403e.m43732e("close");
        this.f25401c.setText("缘分雷达已关闭");
        this.f25402d.setText("系统会停止对配对用户自动发送招呼语");
    }

    public String getCurState() {
        return this.f25404f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41915c(this);
        xdl0.m208329E0(this.f25403e, new ViewOnClickListenerC8156a());
    }

    public void setAfterChangeStateListener(e30<String> e30Var) {
        this.f25405g = e30Var;
    }

    public void setCurState(String str) {
        this.f25404f = str;
        m41916d(str);
    }

    public RadarSwitchView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadarSwitchView(Context context) {
        this(context, null);
    }
}
