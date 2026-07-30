package com.tencent.rtmp.p109ui;

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
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public class TXDashBoard extends LinearLayout {

    /* JADX INFO: renamed from: a */
    protected TextView f60441a;

    /* JADX INFO: renamed from: b */
    protected TextView f60442b;

    /* JADX INFO: renamed from: c */
    protected ScrollView f60443c;

    /* JADX INFO: renamed from: d */
    protected StringBuffer f60444d;

    /* JADX INFO: renamed from: e */
    protected int f60445e;

    /* JADX INFO: renamed from: f */
    private final SimpleDateFormat f60446f;

    /* JADX INFO: renamed from: g */
    private boolean f60447g;

    public TXDashBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60444d = new StringBuffer("");
        this.f60445e = 3000;
        this.f60446f = new SimpleDateFormat("HH:mm:ss.SSS");
        this.f60447g = false;
        setOrientation(1);
        setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    private void m84600b() {
        if (this.f60441a != null) {
            return;
        }
        this.f60441a = new TextView(getContext());
        this.f60442b = new TextView(getContext());
        this.f60443c = new ScrollView(getContext());
        this.f60441a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f60441a.setTextColor(-49023);
        this.f60441a.setTypeface(Typeface.MONOSPACE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f60443c.setPadding(0, 10, 0, 0);
        this.f60443c.setLayoutParams(layoutParams);
        this.f60443c.setVerticalScrollBarEnabled(true);
        this.f60443c.setScrollbarFadingEnabled(true);
        this.f60442b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f60442b.setTextColor(-49023);
        this.f60443c.addView(this.f60442b);
        addView(this.f60441a);
        addView(this.f60443c);
        if (this.f60444d.length() <= 0) {
            this.f60444d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + SignParameters.NEW_LINE);
        }
        this.f60442b.setText(this.f60444d.toString());
    }

    /* JADX INFO: renamed from: a */
    public String m84601a(Bundle bundle) {
        return String.format("%-16s %-16s %-16s\n%-12s %-12s %-12s %-12s\n%-14s %-14s %-14s\n%-16s %-16s", "CPU:" + bundle.getString(TXLiveConstants.NET_STATUS_CPU_USAGE), "RES:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH) + "*" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT), "SPD:" + bundle.getInt(TXLiveConstants.NET_STATUS_NET_SPEED) + "Kbps", "JIT:" + bundle.getInt(TXLiveConstants.NET_STATUS_NET_JITTER), "FPS:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_FPS), "GOP:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP) + BLiveStormDanmakuGiftResourceType.f44446s, "ARA:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_BITRATE) + "Kbps", "QUE:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) + " | " + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE) + Constants.SEPARATOR_COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE) + Constants.SEPARATOR_COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE) + " | " + bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL) + Constants.SEPARATOR_COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL) + Constants.SEPARATOR_COMMA + String.format("%.1f", Float.valueOf(bundle.getFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD))).toString(), "VRA:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE) + "Kbps", "DRP:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_DROP) + "|" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_DROP), "SVR:" + bundle.getString(TXLiveConstants.NET_STATUS_SERVER_IP), "AUDIO:" + bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO));
    }

    public void setEventTextSize(float f) {
        TextView textView = this.f60442b;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setLogMsgLenLimit(int i) {
        this.f60445e = i;
    }

    public void setShowLevel(int i) {
        if (i == 0) {
            TextView textView = this.f60441a;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ScrollView scrollView = this.f60443c;
            if (scrollView != null) {
                scrollView.setVisibility(4);
            }
            setVisibility(4);
            return;
        }
        if (i != 1) {
            m84600b();
            this.f60441a.setVisibility(0);
            this.f60443c.setVisibility(0);
            setVisibility(0);
            return;
        }
        m84600b();
        this.f60441a.setVisibility(0);
        this.f60443c.setVisibility(4);
        setVisibility(0);
    }

    public void setStatusTextSize(float f) {
        TextView textView = this.f60441a;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public TXDashBoard(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public void m84606a(CharSequence charSequence) {
        TextView textView = this.f60441a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84607a(String str) {
        StringBuffer stringBuffer;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "[" + this.f60446f.format(Long.valueOf(System.currentTimeMillis())) + Constants.AES_SUFFIX + str + SignParameters.NEW_LINE;
        if (this.f60444d.length() <= 0) {
            this.f60444d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + SignParameters.NEW_LINE);
        }
        while (true) {
            int length = this.f60444d.length();
            int i = this.f60445e;
            stringBuffer = this.f60444d;
            if (length <= i) {
                break;
            }
            int iIndexOf = stringBuffer.indexOf(SignParameters.NEW_LINE);
            if (iIndexOf == 0) {
                iIndexOf = 1;
            }
            this.f60444d = this.f60444d.delete(0, iIndexOf);
        }
        stringBuffer.append(str2);
        this.f60444d = stringBuffer;
        TextView textView = this.f60442b;
        if (textView != null) {
            textView.setText(stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84608a(boolean z) {
        this.f60447g = z;
    }

    /* JADX INFO: renamed from: a */
    public void m84602a() {
        this.f60444d.setLength(0);
        TextView textView = this.f60441a;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.f60442b;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84605a(Bundle bundle, Bundle bundle2, int i) {
        String string;
        ScrollView scrollView;
        TextView textView;
        TextView textView2;
        if (this.f60447g || i == 2011 || i == 2012) {
            return;
        }
        if (bundle != null && (textView2 = this.f60441a) != null) {
            textView2.setText(m84601a(bundle));
        }
        if (this.f60444d.length() <= 0) {
            this.f60444d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + SignParameters.NEW_LINE);
        }
        if (bundle2 == null || (string = bundle2.getString(TXLiveConstants.EVT_DESCRIPTION)) == null || string.isEmpty()) {
            return;
        }
        m84604a(i, string);
        TextView textView3 = this.f60442b;
        if (textView3 != null) {
            textView3.setText(this.f60444d.toString());
        }
        if (getVisibility() != 0 || (scrollView = this.f60443c) == null || (textView = this.f60442b) == null) {
            return;
        }
        m84599a(scrollView, textView);
    }

    /* JADX INFO: renamed from: a */
    public void m84604a(int i, String str) {
        if (i == 1020) {
            return;
        }
        String str2 = new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(System.currentTimeMillis()));
        while (true) {
            int length = this.f60444d.length();
            int i2 = this.f60445e;
            StringBuffer stringBuffer = this.f60444d;
            if (length > i2) {
                int iIndexOf = stringBuffer.indexOf(SignParameters.NEW_LINE);
                if (iIndexOf == 0) {
                    iIndexOf = 1;
                }
                this.f60444d = this.f60444d.delete(0, iIndexOf);
            } else {
                stringBuffer.append("\n[" + str2 + Constants.AES_SUFFIX + str);
                this.f60444d = stringBuffer;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84603a(int i, int i2, int i3, int i4) {
        TextView textView = this.f60441a;
        if (textView != null) {
            textView.setPadding(i, i2, i3, 0);
        }
        ScrollView scrollView = this.f60443c;
        if (scrollView != null) {
            scrollView.setPadding(i, 0, i3, i4);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84599a(ScrollView scrollView, View view) {
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
