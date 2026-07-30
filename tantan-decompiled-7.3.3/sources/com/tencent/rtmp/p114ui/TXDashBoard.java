package com.tencent.rtmp.p114ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public class TXDashBoard extends LinearLayout {

    /* JADX INFO: renamed from: a */
    protected TextView f61289a;

    /* JADX INFO: renamed from: b */
    protected TextView f61290b;

    /* JADX INFO: renamed from: c */
    protected ScrollView f61291c;

    /* JADX INFO: renamed from: d */
    protected StringBuffer f61292d;

    /* JADX INFO: renamed from: e */
    protected int f61293e;

    /* JADX INFO: renamed from: f */
    private final SimpleDateFormat f61294f;

    /* JADX INFO: renamed from: g */
    private boolean f61295g;

    public TXDashBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61292d = new StringBuffer("");
        this.f61293e = 3000;
        this.f61294f = new SimpleDateFormat("HH:mm:ss.SSS");
        this.f61295g = false;
        setOrientation(1);
        setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    private void m85783b() {
        if (this.f61289a != null) {
            return;
        }
        this.f61289a = new TextView(getContext());
        this.f61290b = new TextView(getContext());
        this.f61291c = new ScrollView(getContext());
        this.f61289a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f61289a.setTextColor(-49023);
        this.f61289a.setTypeface(Typeface.MONOSPACE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f61291c.setPadding(0, 10, 0, 0);
        this.f61291c.setLayoutParams(layoutParams);
        this.f61291c.setVerticalScrollBarEnabled(true);
        this.f61291c.setScrollbarFadingEnabled(true);
        this.f61290b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f61290b.setTextColor(-49023);
        this.f61291c.addView(this.f61290b);
        addView(this.f61289a);
        addView(this.f61291c);
        if (this.f61292d.length() <= 0) {
            this.f61292d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + SignParameters.NEW_LINE);
        }
        this.f61290b.setText(this.f61292d.toString());
    }

    /* JADX INFO: renamed from: a */
    public String m85784a(Bundle bundle) {
        return String.format("%-16s %-16s %-16s\n%-12s %-12s %-12s %-12s\n%-14s %-14s %-14s\n%-16s %-16s", "CPU:" + bundle.getString(TXLiveConstants.NET_STATUS_CPU_USAGE), "RES:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH) + "*" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT), "SPD:" + bundle.getInt(TXLiveConstants.NET_STATUS_NET_SPEED) + "Kbps", "JIT:" + bundle.getInt(TXLiveConstants.NET_STATUS_NET_JITTER), "FPS:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_FPS), "GOP:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP) + BLiveStormDanmakuGiftResourceType.f45294s, "ARA:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_BITRATE) + "Kbps", "QUE:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) + " | " + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE) + Constants.SEPARATOR_COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE) + Constants.SEPARATOR_COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE) + " | " + bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL) + Constants.SEPARATOR_COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL) + Constants.SEPARATOR_COMMA + String.format("%.1f", Float.valueOf(bundle.getFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD))).toString(), "VRA:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE) + "Kbps", "DRP:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_DROP) + "|" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_DROP), "SVR:" + bundle.getString(TXLiveConstants.NET_STATUS_SERVER_IP), "AUDIO:" + bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO));
    }

    public void setEventTextSize(float f) {
        TextView textView = this.f61290b;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setLogMsgLenLimit(int i) {
        this.f61293e = i;
    }

    public void setShowLevel(int i) {
        if (i == 0) {
            TextView textView = this.f61289a;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ScrollView scrollView = this.f61291c;
            if (scrollView != null) {
                scrollView.setVisibility(4);
            }
            setVisibility(4);
            return;
        }
        if (i != 1) {
            m85783b();
            this.f61289a.setVisibility(0);
            this.f61291c.setVisibility(0);
            setVisibility(0);
            return;
        }
        m85783b();
        this.f61289a.setVisibility(0);
        this.f61291c.setVisibility(4);
        setVisibility(0);
    }

    public void setStatusTextSize(float f) {
        TextView textView = this.f61289a;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public TXDashBoard(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public void m85789a(CharSequence charSequence) {
        TextView textView = this.f61289a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85790a(String str) {
        StringBuffer stringBuffer;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "[" + this.f61294f.format(Long.valueOf(System.currentTimeMillis())) + Constants.AES_SUFFIX + str + SignParameters.NEW_LINE;
        if (this.f61292d.length() <= 0) {
            this.f61292d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + SignParameters.NEW_LINE);
        }
        while (true) {
            int length = this.f61292d.length();
            int i = this.f61293e;
            stringBuffer = this.f61292d;
            if (length <= i) {
                break;
            }
            int iIndexOf = stringBuffer.indexOf(SignParameters.NEW_LINE);
            if (iIndexOf == 0) {
                iIndexOf = 1;
            }
            this.f61292d = this.f61292d.delete(0, iIndexOf);
        }
        stringBuffer.append(str2);
        this.f61292d = stringBuffer;
        TextView textView = this.f61290b;
        if (textView != null) {
            textView.setText(stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85791a(boolean z) {
        this.f61295g = z;
    }

    /* JADX INFO: renamed from: a */
    public void m85785a() {
        this.f61292d.setLength(0);
        TextView textView = this.f61289a;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.f61290b;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85788a(Bundle bundle, Bundle bundle2, int i) {
        String string;
        ScrollView scrollView;
        TextView textView;
        TextView textView2;
        if (this.f61295g || i == 2011 || i == 2012) {
            return;
        }
        if (bundle != null && (textView2 = this.f61289a) != null) {
            textView2.setText(m85784a(bundle));
        }
        if (this.f61292d.length() <= 0) {
            this.f61292d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + SignParameters.NEW_LINE);
        }
        if (bundle2 == null || (string = bundle2.getString(TXLiveConstants.EVT_DESCRIPTION)) == null || string.isEmpty()) {
            return;
        }
        m85787a(i, string);
        TextView textView3 = this.f61290b;
        if (textView3 != null) {
            textView3.setText(this.f61292d.toString());
        }
        if (getVisibility() != 0 || (scrollView = this.f61291c) == null || (textView = this.f61290b) == null) {
            return;
        }
        m85782a(scrollView, textView);
    }

    /* JADX INFO: renamed from: a */
    public void m85787a(int i, String str) {
        if (i == 1020) {
            return;
        }
        String str2 = new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(System.currentTimeMillis()));
        while (true) {
            int length = this.f61292d.length();
            int i2 = this.f61293e;
            StringBuffer stringBuffer = this.f61292d;
            if (length > i2) {
                int iIndexOf = stringBuffer.indexOf(SignParameters.NEW_LINE);
                if (iIndexOf == 0) {
                    iIndexOf = 1;
                }
                this.f61292d = this.f61292d.delete(0, iIndexOf);
            } else {
                stringBuffer.append("\n[" + str2 + Constants.AES_SUFFIX + str);
                this.f61292d = stringBuffer;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85786a(int i, int i2, int i3, int i4) {
        TextView textView = this.f61289a;
        if (textView != null) {
            textView.setPadding(i, i2, i3, 0);
        }
        ScrollView scrollView = this.f61291c;
        if (scrollView != null) {
            scrollView.setPadding(i, 0, i3, i4);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m85782a(ScrollView scrollView, View view) {
        if (scrollView == null || view == null) {
            return;
        }
        int measuredHeight = view.getMeasuredHeight() - scrollView.getMeasuredHeight();
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        scrollView.scrollTo(0, measuredHeight);
    }
}
