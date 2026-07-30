package com.p000p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.view.LoveRadarSwitchView;
import com.p1.mobile.putong.core.ui.VText_Bold;
import l.e30;
import l.qib0;
import l.x2c0;
import l.xbc0;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RadarSwitchView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f4177a;

    /* JADX INFO: renamed from: b */
    public VImage f4178b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f4179c;

    /* JADX INFO: renamed from: d */
    public VText f4180d;

    /* JADX INFO: renamed from: e */
    public LoveRadarSwitchView f4181e;

    /* JADX INFO: renamed from: f */
    public String f4182f;

    /* JADX INFO: renamed from: g */
    public e30<String> f4183g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView$a */
    public class ViewOnClickListenerC0320a implements View.OnClickListener {
        public ViewOnClickListenerC0320a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean zEquals = TextUtils.equals(RadarSwitchView.this.f4182f, "open");
            RadarSwitchView radarSwitchView = RadarSwitchView.this;
            if (zEquals) {
                radarSwitchView.m6058d("close");
            } else {
                radarSwitchView.m6058d("open");
            }
            if (RadarSwitchView.this.f4183g != null) {
                RadarSwitchView.this.f4183g.call(RadarSwitchView.this.f4182f);
            }
        }
    }

    public RadarSwitchView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4182f = "close";
    }

    /* JADX INFO: renamed from: c */
    public final void m6057c(View view) {
        xbc0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m6058d(String str) {
        this.f4182f = str;
        boolean zEquals = TextUtils.equals(str, "open");
        VImage vImage = this.f4178b;
        if (zEquals) {
            vImage.setBackgroundResource(x2c0.B8);
            qib0.G.D(this.f4177a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ik5QSkgzQzJRRTQ3TkxKNUpPVFVSQ0hRTTRFQjJBTDE0IiwidyI6MTAwNSwiaCI6MzMzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzIzNzM0MjAwMjEyMzc0MTI3Mn0.webp");
            this.f4181e.m7996e("open");
            this.f4179c.setText("缘分雷达已开启");
            this.f4180d.setText("自动发送招呼语给合适配对好友，避免和缘分擦肩而过");
            return;
        }
        vImage.setBackgroundResource(x2c0.A8);
        qib0.G.D(this.f4177a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJTU1ZDU1BHTUxPS081UUFIV1gzWFNGVlBCRFIzNjE0IiwidyI6MTAwNSwiaCI6MzMzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzgxNDM2NjgwODMwNDc1MzM3Mn0.webp");
        this.f4181e.m7996e("close");
        this.f4179c.setText("缘分雷达已关闭");
        this.f4180d.setText("系统会停止对配对用户自动发送招呼语");
    }

    public String getCurState() {
        return this.f4182f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6057c(this);
        xdl0.E0(this.f4181e, new ViewOnClickListenerC0320a());
    }

    public void setAfterChangeStateListener(e30<String> e30Var) {
        this.f4183g = e30Var;
    }

    public void setCurState(String str) {
        this.f4182f = str;
        m6058d(str);
    }

    public RadarSwitchView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadarSwitchView(Context context) {
        this(context, null);
    }
}
