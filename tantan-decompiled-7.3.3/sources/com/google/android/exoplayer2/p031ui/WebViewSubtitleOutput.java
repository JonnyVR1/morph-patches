package com.google.android.exoplayer2.p031ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.eclipse.jetty.http.MimeTypes;
import p153l.aml;
import p153l.bmk0;
import p153l.et4;
import p153l.myb;
import p153l.sg4;
import p153l.w11;
import p153l.wdg0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.InterfaceC2054a {

    /* JADX INFO: renamed from: a */
    public final CanvasSubtitleOutput f9458a;

    /* JADX INFO: renamed from: b */
    public final WebView f9459b;

    /* JADX INFO: renamed from: c */
    public List<myb> f9460c;

    /* JADX INFO: renamed from: d */
    public sg4 f9461d;

    /* JADX INFO: renamed from: e */
    public float f9462e;

    /* JADX INFO: renamed from: f */
    public int f9463f;

    /* JADX INFO: renamed from: g */
    public float f9464g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$a */
    public static /* synthetic */ class C2059a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9466a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f9466a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9466a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9466a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9460c = Collections.EMPTY_LIST;
        this.f9461d = sg4.f167788g;
        this.f9462e = 0.0533f;
        this.f9463f = 0;
        this.f9464g = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f9458a = canvasSubtitleOutput;
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
        this.f9459b = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    /* JADX INFO: renamed from: b */
    public static int m12109b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    /* JADX INFO: renamed from: c */
    public static String m12110c(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = C2059a.f9466a[alignment.ordinal()];
        if (i != 1) {
            return i != 2 ? "center" : "end";
        }
        return "start";
    }

    /* JADX INFO: renamed from: d */
    public static String m12111d(sg4 sg4Var) {
        int i = sg4Var.f167792d;
        if (i == 1) {
            return bmk0.m105071D("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", aml.m98849b(sg4Var.f167793e));
        }
        if (i == 2) {
            return bmk0.m105071D("0.1em 0.12em 0.15em %s", aml.m98849b(sg4Var.f167793e));
        }
        if (i != 3) {
            return i != 4 ? "unset" : bmk0.m105071D("-0.05em -0.05em 0.15em %s", aml.m98849b(sg4Var.f167793e));
        }
        return bmk0.m105071D("0.06em 0.08em 0.15em %s", aml.m98849b(sg4Var.f167793e));
    }

    /* JADX INFO: renamed from: f */
    public static String m12112f(int i) {
        if (i != 1) {
            return i != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    /* JADX INFO: renamed from: h */
    public static String m12113h(myb mybVar) {
        float f = mybVar.f139383q;
        if (f == 0.0f) {
            return "";
        }
        int i = mybVar.f139382p;
        return bmk0.m105071D("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f));
    }

    @Override // com.google.android.exoplayer2.p031ui.SubtitleView.InterfaceC2054a
    /* JADX INFO: renamed from: a */
    public void mo11861a(List<myb> list, sg4 sg4Var, float f, int i, float f2) {
        this.f9461d = sg4Var;
        this.f9462e = f;
        this.f9463f = i;
        this.f9464g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            myb mybVar = list.get(i2);
            if (mybVar.f139370d != null) {
                arrayList.add(mybVar);
            } else {
                arrayList2.add(mybVar);
            }
        }
        if (!this.f9460c.isEmpty() || !arrayList2.isEmpty()) {
            this.f9460c = arrayList2;
            m12116i();
        }
        this.f9458a.mo11861a(arrayList, sg4Var, f, i, f2);
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final String m12114e(int i, float f) {
        float fM205884f = wdg0.m205884f(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fM205884f == -3.4028235E38f ? "unset" : bmk0.m105071D("%.2fpx", Float.valueOf(fM205884f / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX INFO: renamed from: g */
    public void m12115g() {
        this.f9459b.destroy();
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
    public final void m12116i() {
        float f;
        String strM105071D;
        int iM12109b;
        boolean z;
        String str;
        float f2;
        String strM105071D2;
        int i;
        int i2;
        String str2;
        String str3;
        String str4;
        Object obj;
        String str5;
        C2060a.b bVarM12117a;
        Layout.Alignment alignment;
        String str6;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        float f3 = 1.2f;
        sb.append(bmk0.m105071D("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", aml.m98849b(this.f9461d.f167789a), m12114e(this.f9463f, this.f9462e), Float.valueOf(1.2f), m12111d(this.f9461d)));
        HashMap map = new HashMap();
        map.put(aml.m98848a("default_bg"), bmk0.m105071D("background-color:%s;", aml.m98849b(this.f9461d.f167790b)));
        int i3 = 0;
        while (i3 < this.f9460c.size()) {
            myb mybVar = this.f9460c.get(i3);
            float f4 = mybVar.f139374h;
            float f5 = f4 != -3.4028235E38f ? f4 * 100.0f : 50.0f;
            int iM12109b2 = m12109b(mybVar.f139375i);
            float f6 = mybVar.f139371e;
            float f7 = f3;
            if (f6 != -3.4028235E38f) {
                if (mybVar.f139372f != 1) {
                    String strM105071D3 = bmk0.m105071D("%.2f%%", Float.valueOf(f6 * 100.0f));
                    int i4 = mybVar.f139382p;
                    int i5 = mybVar.f139373g;
                    iM12109b = i4 == 1 ? -m12109b(i5) : m12109b(i5);
                    f = -3.4028235E38f;
                    str = strM105071D3;
                    z = false;
                } else {
                    f = -3.4028235E38f;
                    if (f6 >= 0.0f) {
                        strM105071D = bmk0.m105071D("%.2fem", Float.valueOf(f6 * f7));
                        z = false;
                        iM12109b = 0;
                    } else {
                        strM105071D = bmk0.m105071D("%.2fem", Float.valueOf(((-f6) - 1.0f) * f7));
                        iM12109b = 0;
                        z = true;
                    }
                }
                f2 = mybVar.f139376j;
                if (f2 != f) {
                    strM105071D2 = bmk0.m105071D("%.2f%%", Float.valueOf(f2 * 100.0f));
                } else {
                    strM105071D2 = "fit-content";
                }
                String str7 = strM105071D2;
                String strM12110c = m12110c(mybVar.f139368b);
                String strM12112f = m12112f(mybVar.f139382p);
                String strM12114e = m12114e(mybVar.f139380n, mybVar.f139381o);
                if (mybVar.f139378l) {
                    i = mybVar.f139379m;
                } else {
                    i = this.f9461d.f167791c;
                }
                String strM98849b = aml.m98849b(i);
                i2 = mybVar.f139382p;
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
                    int i6 = iM12109b;
                    iM12109b = iM12109b2;
                    iM12109b2 = i6;
                } else {
                    str5 = "width";
                }
                String str8 = str5;
                bVarM12117a = C2060a.m12117a(mybVar.f139367a, getContext().getResources().getDisplayMetrics().density);
                for (String str9 : map.keySet()) {
                    str6 = (String) map.put(str9, (String) map.get(str9));
                    if (str6 != null || str6.equals(map.get(str9))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    w11.m204371g(z2);
                }
                sb.append(bmk0.m105071D("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i3), obj, Float.valueOf(f5), str4, str, str8, str7, strM12110c, strM12112f, strM12114e, strM98849b, Integer.valueOf(iM12109b2), Integer.valueOf(iM12109b), m12113h(mybVar)));
                sb.append(bmk0.m105071D("<span class='%s'>", "default_bg"));
                alignment = mybVar.f139369c;
                if (alignment != null) {
                    sb.append(bmk0.m105071D("<span style='display:inline-block; text-align:%s;'>", m12110c(alignment)));
                    sb.append(bVarM12117a.f9468a);
                    sb.append("</span>");
                } else {
                    sb.append(bVarM12117a.f9468a);
                }
                sb.append("</span></div>");
                i3++;
                f3 = f7;
            } else {
                f = -3.4028235E38f;
                strM105071D = bmk0.m105071D("%.2f%%", Float.valueOf((1.0f - this.f9464g) * 100.0f));
                iM12109b = -100;
                z = false;
            }
            str = strM105071D;
            f2 = mybVar.f139376j;
            if (f2 != f) {
                strM105071D2 = bmk0.m105071D("%.2f%%", Float.valueOf(f2 * 100.0f));
            } else {
                strM105071D2 = "fit-content";
            }
            String str10 = strM105071D2;
            String strM12110c2 = m12110c(mybVar.f139368b);
            String strM12112f2 = m12112f(mybVar.f139382p);
            String strM12114e2 = m12114e(mybVar.f139380n, mybVar.f139381o);
            if (mybVar.f139378l) {
                i = mybVar.f139379m;
            } else {
                i = this.f9461d.f167791c;
            }
            String strM98849b2 = aml.m98849b(i);
            i2 = mybVar.f139382p;
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
                int i7 = iM12109b;
                iM12109b = iM12109b2;
                iM12109b2 = i7;
            } else {
                str5 = "height";
                int i8 = iM12109b;
                iM12109b = iM12109b2;
                iM12109b2 = i8;
            }
            String str11 = str5;
            bVarM12117a = C2060a.m12117a(mybVar.f139367a, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
                str6 = (String) map.put(str9, (String) map.get(str9));
                if (str6 != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                w11.m204371g(z2);
            }
            sb.append(bmk0.m105071D("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i3), obj, Float.valueOf(f5), str4, str, str11, str10, strM12110c2, strM12112f2, strM12114e2, strM98849b2, Integer.valueOf(iM12109b2), Integer.valueOf(iM12109b), m12113h(mybVar)));
            sb.append(bmk0.m105071D("<span class='%s'>", "default_bg"));
            alignment = mybVar.f139369c;
            if (alignment != null) {
                sb.append(bmk0.m105071D("<span style='display:inline-block; text-align:%s;'>", m12110c(alignment)));
                sb.append(bVarM12117a.f9468a);
                sb.append("</span>");
            } else {
                sb.append(bVarM12117a.f9468a);
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
        this.f9459b.loadData(Base64.encodeToString(sb.toString().getBytes(et4.f95689c), 1), MimeTypes.TEXT_HTML, "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f9460c.isEmpty()) {
            return;
        }
        m12116i();
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }
}
