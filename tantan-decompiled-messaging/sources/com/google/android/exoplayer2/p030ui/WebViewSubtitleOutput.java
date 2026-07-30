package com.google.android.exoplayer2.p030ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.eclipse.jetty.http.MimeTypes;
import p149l.fs4;
import p149l.jjl;
import p149l.o5g0;
import p149l.p11;
import p149l.tf4;
import p149l.vck0;
import p149l.ywb;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.InterfaceC2031a {

    /* JADX INFO: renamed from: a */
    public final CanvasSubtitleOutput f9421a;

    /* JADX INFO: renamed from: b */
    public final WebView f9422b;

    /* JADX INFO: renamed from: c */
    public List<ywb> f9423c;

    /* JADX INFO: renamed from: d */
    public tf4 f9424d;

    /* JADX INFO: renamed from: e */
    public float f9425e;

    /* JADX INFO: renamed from: f */
    public int f9426f;

    /* JADX INFO: renamed from: g */
    public float f9427g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$a */
    public static /* synthetic */ class C2036a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9429a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f9429a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9429a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9429a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9423c = Collections.EMPTY_LIST;
        this.f9424d = tf4.f169938g;
        this.f9425e = 0.0533f;
        this.f9426f = 0;
        this.f9427g = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f9421a = canvasSubtitleOutput;
        WebView webView = new WebView(context, attributeSet) { // from class: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.f9422b = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    /* JADX INFO: renamed from: b */
    public static int m12055b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    /* JADX INFO: renamed from: c */
    public static String m12056c(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = C2036a.f9429a[alignment.ordinal()];
        if (i != 1) {
            return i != 2 ? "center" : "end";
        }
        return "start";
    }

    /* JADX INFO: renamed from: d */
    public static String m12057d(tf4 tf4Var) {
        int i = tf4Var.f169942d;
        if (i == 1) {
            return vck0.m197793D("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", jjl.m141808b(tf4Var.f169943e));
        }
        if (i == 2) {
            return vck0.m197793D("0.1em 0.12em 0.15em %s", jjl.m141808b(tf4Var.f169943e));
        }
        if (i != 3) {
            return i != 4 ? "unset" : vck0.m197793D("-0.05em -0.05em 0.15em %s", jjl.m141808b(tf4Var.f169943e));
        }
        return vck0.m197793D("0.06em 0.08em 0.15em %s", jjl.m141808b(tf4Var.f169943e));
    }

    /* JADX INFO: renamed from: f */
    public static String m12058f(int i) {
        if (i != 1) {
            return i != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    /* JADX INFO: renamed from: h */
    public static String m12059h(ywb ywbVar) {
        float f = ywbVar.f200447q;
        if (f == 0.0f) {
            return "";
        }
        int i = ywbVar.f200446p;
        return vck0.m197793D("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f));
    }

    @Override // com.google.android.exoplayer2.p030ui.SubtitleView.InterfaceC2031a
    /* JADX INFO: renamed from: a */
    public void mo11807a(List<ywb> list, tf4 tf4Var, float f, int i, float f2) {
        this.f9424d = tf4Var;
        this.f9425e = f;
        this.f9426f = i;
        this.f9427g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ywb ywbVar = list.get(i2);
            if (ywbVar.f200434d != null) {
                arrayList.add(ywbVar);
            } else {
                arrayList2.add(ywbVar);
            }
        }
        if (!this.f9423c.isEmpty() || !arrayList2.isEmpty()) {
            this.f9423c = arrayList2;
            m12062i();
        }
        this.f9421a.mo11807a(arrayList, tf4Var, f, i, f2);
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final String m12060e(int i, float f) {
        float fM162786f = o5g0.m162786f(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fM162786f == -3.4028235E38f ? "unset" : vck0.m197793D("%.2fpx", Float.valueOf(fM162786f / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX INFO: renamed from: g */
    public void m12061g() {
        this.f9422b.destroy();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:28:0x0107  */
    /* JADX WARN: Code duplicated, block: B:31:0x0122  */
    /* JADX WARN: Code duplicated, block: B:32:0x0125  */
    /* JADX WARN: Code duplicated, block: B:35:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x013c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0146  */
    /* JADX WARN: Code duplicated, block: B:43:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0159  */
    /* JADX WARN: Code duplicated, block: B:54:0x0183  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01db  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f7  */
    /* JADX INFO: renamed from: i */
    public final void m12062i() {
        float f;
        String strM197793D;
        int iM12055b;
        boolean z;
        String str;
        float f2;
        String strM197793D2;
        int i;
        int i2;
        String str2;
        String str3;
        String str4;
        Object obj;
        String str5;
        C2037a.b bVarM12063a;
        Layout.Alignment alignment;
        String str6;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        float f3 = 1.2f;
        sb.append(vck0.m197793D("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", jjl.m141808b(this.f9424d.f169939a), m12060e(this.f9426f, this.f9425e), Float.valueOf(1.2f), m12057d(this.f9424d)));
        HashMap map = new HashMap();
        map.put(jjl.m141807a("default_bg"), vck0.m197793D("background-color:%s;", jjl.m141808b(this.f9424d.f169940b)));
        int i3 = 0;
        while (i3 < this.f9423c.size()) {
            ywb ywbVar = this.f9423c.get(i3);
            float f4 = ywbVar.f200438h;
            float f5 = f4 != -3.4028235E38f ? f4 * 100.0f : 50.0f;
            int iM12055b2 = m12055b(ywbVar.f200439i);
            float f6 = ywbVar.f200435e;
            float f7 = f3;
            if (f6 != -3.4028235E38f) {
                if (ywbVar.f200436f != 1) {
                    String strM197793D3 = vck0.m197793D("%.2f%%", Float.valueOf(f6 * 100.0f));
                    int i4 = ywbVar.f200446p;
                    int i5 = ywbVar.f200437g;
                    iM12055b = i4 == 1 ? -m12055b(i5) : m12055b(i5);
                    f = -3.4028235E38f;
                    str = strM197793D3;
                    z = false;
                } else {
                    f = -3.4028235E38f;
                    if (f6 >= 0.0f) {
                        strM197793D = vck0.m197793D("%.2fem", Float.valueOf(f6 * f7));
                        z = false;
                        iM12055b = 0;
                    } else {
                        strM197793D = vck0.m197793D("%.2fem", Float.valueOf(((-f6) - 1.0f) * f7));
                        iM12055b = 0;
                        z = true;
                    }
                }
                f2 = ywbVar.f200440j;
                if (f2 != f) {
                    strM197793D2 = vck0.m197793D("%.2f%%", Float.valueOf(f2 * 100.0f));
                } else {
                    strM197793D2 = "fit-content";
                }
                String str7 = strM197793D2;
                String strM12056c = m12056c(ywbVar.f200432b);
                String strM12058f = m12058f(ywbVar.f200446p);
                String strM12060e = m12060e(ywbVar.f200444n, ywbVar.f200445o);
                if (ywbVar.f200442l) {
                    i = ywbVar.f200443m;
                } else {
                    i = this.f9424d.f169941c;
                }
                String strM141808b = jjl.m141808b(i);
                i2 = ywbVar.f200446p;
                str2 = "right";
                str3 = StickStatus.top;
                if (i2 != 1) {
                    if (z) {
                        str2 = BLiveGiftBubblePopupTitlePosition.left;
                    }
                    str4 = str2;
                    obj = StickStatus.top;
                } else if (i2 != 2) {
                    if (z) {
                        str3 = "bottom";
                    }
                    obj = BLiveGiftBubblePopupTitlePosition.left;
                    str4 = str3;
                } else {
                    if (!z) {
                        str2 = BLiveGiftBubblePopupTitlePosition.left;
                    }
                    str4 = str2;
                    obj = StickStatus.top;
                }
                if (i2 != 2 || i2 == 1) {
                    str5 = "height";
                    int i6 = iM12055b;
                    iM12055b = iM12055b2;
                    iM12055b2 = i6;
                } else {
                    str5 = "width";
                }
                String str8 = str5;
                bVarM12063a = C2037a.m12063a(ywbVar.f200431a, getContext().getResources().getDisplayMetrics().density);
                for (String str9 : map.keySet()) {
                    str6 = (String) map.put(str9, (String) map.get(str9));
                    if (str6 != null || str6.equals(map.get(str9))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    p11.m167013g(z2);
                }
                sb.append(vck0.m197793D("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i3), obj, Float.valueOf(f5), str4, str, str8, str7, strM12056c, strM12058f, strM12060e, strM141808b, Integer.valueOf(iM12055b2), Integer.valueOf(iM12055b), m12059h(ywbVar)));
                sb.append(vck0.m197793D("<span class='%s'>", "default_bg"));
                alignment = ywbVar.f200433c;
                if (alignment != null) {
                    sb.append(vck0.m197793D("<span style='display:inline-block; text-align:%s;'>", m12056c(alignment)));
                    sb.append(bVarM12063a.f9431a);
                    sb.append("</span>");
                } else {
                    sb.append(bVarM12063a.f9431a);
                }
                sb.append("</span></div>");
                i3++;
                f3 = f7;
            } else {
                f = -3.4028235E38f;
                strM197793D = vck0.m197793D("%.2f%%", Float.valueOf((1.0f - this.f9427g) * 100.0f));
                iM12055b = -100;
                z = false;
            }
            str = strM197793D;
            f2 = ywbVar.f200440j;
            if (f2 != f) {
                strM197793D2 = vck0.m197793D("%.2f%%", Float.valueOf(f2 * 100.0f));
            } else {
                strM197793D2 = "fit-content";
            }
            String str10 = strM197793D2;
            String strM12056c2 = m12056c(ywbVar.f200432b);
            String strM12058f2 = m12058f(ywbVar.f200446p);
            String strM12060e2 = m12060e(ywbVar.f200444n, ywbVar.f200445o);
            if (ywbVar.f200442l) {
                i = ywbVar.f200443m;
            } else {
                i = this.f9424d.f169941c;
            }
            String strM141808b2 = jjl.m141808b(i);
            i2 = ywbVar.f200446p;
            str2 = "right";
            str3 = StickStatus.top;
            if (i2 != 1) {
                if (z) {
                    str2 = BLiveGiftBubblePopupTitlePosition.left;
                }
                str4 = str2;
                obj = StickStatus.top;
            } else if (i2 != 2) {
                if (z) {
                    str3 = "bottom";
                }
                obj = BLiveGiftBubblePopupTitlePosition.left;
                str4 = str3;
            } else {
                if (!z) {
                    str2 = BLiveGiftBubblePopupTitlePosition.left;
                }
                str4 = str2;
                obj = StickStatus.top;
            }
            if (i2 != 2) {
                str5 = "height";
                int i7 = iM12055b;
                iM12055b = iM12055b2;
                iM12055b2 = i7;
            } else {
                str5 = "height";
                int i8 = iM12055b;
                iM12055b = iM12055b2;
                iM12055b2 = i8;
            }
            String str11 = str5;
            bVarM12063a = C2037a.m12063a(ywbVar.f200431a, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
                str6 = (String) map.put(str9, (String) map.get(str9));
                if (str6 != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                p11.m167013g(z2);
            }
            sb.append(vck0.m197793D("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i3), obj, Float.valueOf(f5), str4, str, str11, str10, strM12056c2, strM12058f2, strM12060e2, strM141808b2, Integer.valueOf(iM12055b2), Integer.valueOf(iM12055b), m12059h(ywbVar)));
            sb.append(vck0.m197793D("<span class='%s'>", "default_bg"));
            alignment = ywbVar.f200433c;
            if (alignment != null) {
                sb.append(vck0.m197793D("<span style='display:inline-block; text-align:%s;'>", m12056c(alignment)));
                sb.append(bVarM12063a.f9431a);
                sb.append("</span>");
            } else {
                sb.append(bVarM12063a.f9431a);
            }
            sb.append("</span></div>");
            i3++;
            f3 = f7;
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder("<html><head><style>");
        for (String str12 : map.keySet()) {
            sb2.append(str12);
            sb2.append("{");
            sb2.append((String) map.get(str12));
            sb2.append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.f9422b.loadData(Base64.encodeToString(sb.toString().getBytes(fs4.f99036c), 1), MimeTypes.TEXT_HTML, "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f9423c.isEmpty()) {
            return;
        }
        m12062i();
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }
}
