package tech.sud.runtime.component.p023e;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import org.json.JSONObject;
import org.seamless.xhtml.XHTMLElement;
import org.spongycastle.i18n.TextBundle;
import tech.sud.gip.core.view.round.RoundedDrawable;
import tech.sud.runtime.component.p026h.C1228f;
import tech.sud.runtime.core.C1241g;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1214d extends ScrollView {

    /* JADX INFO: renamed from: a */
    private final C1213c f11342a;

    /* JADX INFO: renamed from: b */
    private int f11343b;

    /* JADX INFO: renamed from: c */
    private double f11344c;

    /* JADX INFO: renamed from: d */
    private double f11345d;

    /* JADX INFO: renamed from: e */
    private final float f11346e;

    /* JADX INFO: renamed from: f */
    private final C1241g f11347f;

    /* JADX INFO: renamed from: g */
    private final C1213c.a f11348g;

    /* JADX INFO: renamed from: h */
    private boolean f11349h;

    public C1214d(Context context, C1241g c1241g) {
        super(context);
        this.f11343b = 0;
        this.f11348g = new C1213c.a();
        this.f11349h = false;
        this.f11347f = c1241g;
        this.f11346e = context.getApplicationContext().getResources().getDisplayMetrics().density;
        C1213c c1213c = new C1213c(context, c1241g);
        this.f11342a = c1213c;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setVerticalScrollBarEnabled(false);
        addView(c1213c);
        setVisibility(4);
    }

    /* JADX INFO: renamed from: a */
    public void m10259a(String str, int i, float f, float f2, boolean z) {
        int i2;
        int i3;
        this.f11343b = i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f11348g.f11339f = jSONObject.getString("inputType");
            this.f11348g.f11340g = jSONObject.getInt("maxLength");
            String string = jSONObject.getString(TextBundle.TEXT_ENTRY);
            this.f11344c = jSONObject.getDouble("x") * ((double) this.f11346e);
            this.f11345d = jSONObject.getDouble("y") * ((double) this.f11346e);
            this.f11348g.f11334a = ((float) jSONObject.getDouble("w")) * this.f11346e;
            this.f11348g.f11335b = ((float) jSONObject.getDouble(XHTMLElement.XPATH_PREFIX)) * this.f11346e;
            this.f11348g.f11336c = ((float) jSONObject.getDouble("font_size")) * this.f11346e;
            int i4 = jSONObject.getInt("font_color");
            if ((i4 & RoundedDrawable.DEFAULT_BORDER_COLOR) == 0) {
                i4 |= RoundedDrawable.DEFAULT_BORDER_COLOR;
            }
            String string2 = jSONObject.getString("textAlign");
            String string3 = jSONObject.getString("verticalAlign");
            if (string2.equals("center")) {
                i2 = 1;
            } else {
                i2 = string2.equals("right") ? 8388613 : 8388611;
            }
            if (string3.equals("middle")) {
                i3 = i2 | 16;
            } else {
                i3 = string3.equals("bottom") ? i2 | 80 : i2 | 48;
            }
            C1213c.a aVar = this.f11348g;
            aVar.f11337d = i3;
            aVar.f11338e = z;
            aVar.f11341h = (float) (jSONObject.getDouble("lineHeight") * ((double) this.f11346e));
            C1228f.m10331e("lineHeight", this.f11348g.f11341h + "");
            m10255a(this.f11344c, this.f11345d);
            this.f11342a.m10254a(string, this.f11348g);
            this.f11342a.setTextColor(i4);
            setVisibility(0);
            this.f11342a.requestFocus();
            ((InputMethodManager) this.f11342a.getContext().getSystemService("input_method")).showSoftInput(this.f11342a, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f11349h = true;
    }

    /* JADX INFO: renamed from: b */
    public void m10260b() {
        if (this.f11349h) {
            this.f11349h = false;
            ((InputMethodManager) this.f11342a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f11342a.getWindowToken(), 0);
            setVisibility(4);
            this.f11347f.m10465b(7, this.f11343b);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m10261c() {
        return this.f11349h;
    }

    /* JADX INFO: renamed from: a */
    private void m10255a(double d, double d2) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins((getPaddingLeft() * (-1)) + ((int) (d + 0.5d)), (getPaddingTop() * (-1)) + ((int) d2), -1, -1);
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public void m10256a() {
    }

    /* JADX INFO: renamed from: a */
    public void m10258a(String str, int i) {
        if ((i & RoundedDrawable.DEFAULT_BORDER_COLOR) == 0) {
            i |= RoundedDrawable.DEFAULT_BORDER_COLOR;
        }
        this.f11342a.setTextColor(i);
        this.f11342a.m10253a(str);
        this.f11342a.setSelection(str.length());
    }

    /* JADX INFO: renamed from: a */
    public void m10257a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            double dOptDouble = jSONObject.optDouble("y") * ((double) this.f11346e);
            jSONObject.optDouble(IjkMediaMeta.IJKM_KEY_HEIGHT);
            m10255a(this.f11344c, dOptDouble);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
