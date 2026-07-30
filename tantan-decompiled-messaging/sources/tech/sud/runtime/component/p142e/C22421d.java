package tech.sud.runtime.component.p142e;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import org.json.JSONObject;
import tech.sud.gip.core.view.round.RoundedDrawable;
import tech.sud.runtime.component.p145h.C22435f;
import tech.sud.runtime.core.C22448g;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.d */
/* JADX INFO: loaded from: classes3.dex */
public class C22421d extends ScrollView {

    /* JADX INFO: renamed from: a */
    private final C22420c f207717a;

    /* JADX INFO: renamed from: b */
    private int f207718b;

    /* JADX INFO: renamed from: c */
    private double f207719c;

    /* JADX INFO: renamed from: d */
    private double f207720d;

    /* JADX INFO: renamed from: e */
    private final float f207721e;

    /* JADX INFO: renamed from: f */
    private final C22448g f207722f;

    /* JADX INFO: renamed from: g */
    private final C22420c.a f207723g;

    /* JADX INFO: renamed from: h */
    private boolean f207724h;

    public C22421d(Context context, C22448g c22448g) {
        super(context);
        this.f207718b = 0;
        this.f207723g = new C22420c.a();
        this.f207724h = false;
        this.f207722f = c22448g;
        this.f207721e = context.getApplicationContext().getResources().getDisplayMetrics().density;
        C22420c c22420c = new C22420c(context, c22448g);
        this.f207717a = c22420c;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setVerticalScrollBarEnabled(false);
        addView(c22420c);
        setVisibility(4);
    }

    /* JADX INFO: renamed from: a */
    public void m221788a(String str, int i, float f, float f2, boolean z) {
        int i2;
        int i3;
        this.f207718b = i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f207723g.f207714f = jSONObject.getString("inputType");
            this.f207723g.f207715g = jSONObject.getInt("maxLength");
            String string = jSONObject.getString("text");
            this.f207719c = jSONObject.getDouble(BaseSei.f13930X) * ((double) this.f207721e);
            this.f207720d = jSONObject.getDouble(BaseSei.f13931Y) * ((double) this.f207721e);
            this.f207723g.f207709a = ((float) jSONObject.getDouble("w")) * this.f207721e;
            this.f207723g.f207710b = ((float) jSONObject.getDouble("h")) * this.f207721e;
            this.f207723g.f207711c = ((float) jSONObject.getDouble("font_size")) * this.f207721e;
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
            if (string3.equals(BLiveGiftBubblePopupTitlePosition.middle)) {
                i3 = i2 | 16;
            } else {
                i3 = string3.equals("bottom") ? i2 | 80 : i2 | 48;
            }
            C22420c.a aVar = this.f207723g;
            aVar.f207712d = i3;
            aVar.f207713e = z;
            aVar.f207716h = (float) (jSONObject.getDouble("lineHeight") * ((double) this.f207721e));
            C22435f.m221860e("lineHeight", this.f207723g.f207716h + "");
            m221784a(this.f207719c, this.f207720d);
            this.f207717a.m221783a(string, this.f207723g);
            this.f207717a.setTextColor(i4);
            setVisibility(0);
            this.f207717a.requestFocus();
            ((InputMethodManager) this.f207717a.getContext().getSystemService("input_method")).showSoftInput(this.f207717a, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f207724h = true;
    }

    /* JADX INFO: renamed from: b */
    public void m221789b() {
        if (this.f207724h) {
            this.f207724h = false;
            ((InputMethodManager) this.f207717a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f207717a.getWindowToken(), 0);
            setVisibility(4);
            this.f207722f.m221994b(7, this.f207718b);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m221790c() {
        return this.f207724h;
    }

    /* JADX INFO: renamed from: a */
    private void m221784a(double d, double d2) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins((getPaddingLeft() * (-1)) + ((int) (d + 0.5d)), (getPaddingTop() * (-1)) + ((int) d2), -1, -1);
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public void m221785a() {
    }

    /* JADX INFO: renamed from: a */
    public void m221787a(String str, int i) {
        if ((i & RoundedDrawable.DEFAULT_BORDER_COLOR) == 0) {
            i |= RoundedDrawable.DEFAULT_BORDER_COLOR;
        }
        this.f207717a.setTextColor(i);
        this.f207717a.m221782a(str);
        this.f207717a.setSelection(str.length());
    }

    /* JADX INFO: renamed from: a */
    public void m221786a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            double dOptDouble = jSONObject.optDouble(BaseSei.f13931Y) * ((double) this.f207721e);
            jSONObject.optDouble("height");
            m221784a(this.f207719c, dOptDouble);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
