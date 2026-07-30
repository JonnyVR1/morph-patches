package tech.sud.runtime.component.p146e;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import org.json.JSONObject;
import tech.sud.gip.core.view.round.RoundedDrawable;
import tech.sud.runtime.component.p149h.C22550f;
import tech.sud.runtime.core.C22563g;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.d */
/* JADX INFO: loaded from: classes3.dex */
public class C22536d extends ScrollView {

    /* JADX INFO: renamed from: a */
    private final C22535c f208639a;

    /* JADX INFO: renamed from: b */
    private int f208640b;

    /* JADX INFO: renamed from: c */
    private double f208641c;

    /* JADX INFO: renamed from: d */
    private double f208642d;

    /* JADX INFO: renamed from: e */
    private final float f208643e;

    /* JADX INFO: renamed from: f */
    private final C22563g f208644f;

    /* JADX INFO: renamed from: g */
    private final C22535c.a f208645g;

    /* JADX INFO: renamed from: h */
    private boolean f208646h;

    public C22536d(Context context, C22563g c22563g) {
        super(context);
        this.f208640b = 0;
        this.f208645g = new C22535c.a();
        this.f208646h = false;
        this.f208644f = c22563g;
        this.f208643e = context.getApplicationContext().getResources().getDisplayMetrics().density;
        C22535c c22535c = new C22535c(context, c22563g);
        this.f208639a = c22535c;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setVerticalScrollBarEnabled(false);
        addView(c22535c);
        setVisibility(4);
    }

    /* JADX INFO: renamed from: a */
    public void m223034a(String str, int i, float f, float f2, boolean z) {
        int i2;
        int i3;
        this.f208640b = i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f208645g.f208636f = jSONObject.getString("inputType");
            this.f208645g.f208637g = jSONObject.getInt("maxLength");
            String string = jSONObject.getString("text");
            this.f208641c = jSONObject.getDouble(BaseSei.f14624X) * ((double) this.f208643e);
            this.f208642d = jSONObject.getDouble(BaseSei.f14625Y) * ((double) this.f208643e);
            this.f208645g.f208631a = ((float) jSONObject.getDouble("w")) * this.f208643e;
            this.f208645g.f208632b = ((float) jSONObject.getDouble("h")) * this.f208643e;
            this.f208645g.f208633c = ((float) jSONObject.getDouble("font_size")) * this.f208643e;
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
            C22535c.a aVar = this.f208645g;
            aVar.f208634d = i3;
            aVar.f208635e = z;
            aVar.f208638h = (float) (jSONObject.getDouble("lineHeight") * ((double) this.f208643e));
            C22550f.m223106e("lineHeight", this.f208645g.f208638h + "");
            m223030a(this.f208641c, this.f208642d);
            this.f208639a.m223029a(string, this.f208645g);
            this.f208639a.setTextColor(i4);
            setVisibility(0);
            this.f208639a.requestFocus();
            ((InputMethodManager) this.f208639a.getContext().getSystemService("input_method")).showSoftInput(this.f208639a, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f208646h = true;
    }

    /* JADX INFO: renamed from: b */
    public void m223035b() {
        if (this.f208646h) {
            this.f208646h = false;
            ((InputMethodManager) this.f208639a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f208639a.getWindowToken(), 0);
            setVisibility(4);
            this.f208644f.m223240b(7, this.f208640b);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m223036c() {
        return this.f208646h;
    }

    /* JADX INFO: renamed from: a */
    private void m223030a(double d, double d2) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins((getPaddingLeft() * (-1)) + ((int) (d + 0.5d)), (getPaddingTop() * (-1)) + ((int) d2), -1, -1);
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public void m223031a() {
    }

    /* JADX INFO: renamed from: a */
    public void m223033a(String str, int i) {
        if ((i & RoundedDrawable.DEFAULT_BORDER_COLOR) == 0) {
            i |= RoundedDrawable.DEFAULT_BORDER_COLOR;
        }
        this.f208639a.setTextColor(i);
        this.f208639a.m223028a(str);
        this.f208639a.setSelection(str.length());
    }

    /* JADX INFO: renamed from: a */
    public void m223032a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            double dOptDouble = jSONObject.optDouble(BaseSei.f14625Y) * ((double) this.f208643e);
            jSONObject.optDouble("height");
            m223030a(this.f208641c, dOptDouble);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
