package p153l;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import org.json.JSONObject;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class etg0 extends oxg0 {

    /* JADX INFO: renamed from: c */
    public Button f95738c;

    /* JADX INFO: renamed from: d */
    public ImageButton f95739d;

    /* JADX INFO: renamed from: e */
    public float f95740e;

    /* JADX INFO: renamed from: f */
    public final String f95741f;

    /* JADX INFO: renamed from: g */
    public String f95742g;

    /* JADX INFO: renamed from: h */
    public String f95743h;

    /* JADX INFO: renamed from: i */
    public int f95744i;

    /* JADX INFO: renamed from: j */
    public int f95745j;

    /* JADX INFO: renamed from: k */
    public int f95746k;

    /* JADX INFO: renamed from: l */
    public int f95747l;

    /* JADX INFO: renamed from: m */
    public String f95748m;

    /* JADX INFO: renamed from: n */
    public String f95749n;

    /* JADX INFO: renamed from: o */
    public String f95750o;

    /* JADX INFO: renamed from: p */
    public int f95751p;

    /* JADX INFO: renamed from: q */
    public int f95752q;

    /* JADX INFO: renamed from: r */
    public int f95753r;

    public etg0(JSONObject jSONObject) {
        this.f95741f = jSONObject.optString("type");
        this.f95742g = jSONObject.optString("text");
        this.f95743h = jSONObject.optString("image");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("style");
        if (jSONObjectOptJSONObject != null) {
            this.f95744i = jSONObjectOptJSONObject.optInt(BLiveGiftBubblePopupTitlePosition.left);
            this.f95745j = jSONObjectOptJSONObject.optInt(StickStatus.top);
            this.f95746k = jSONObjectOptJSONObject.optInt("width");
            this.f95747l = jSONObjectOptJSONObject.optInt("height");
            this.f95748m = jSONObjectOptJSONObject.optString("color");
            this.f95749n = jSONObjectOptJSONObject.optString("backgroundColor");
            this.f95750o = jSONObjectOptJSONObject.optString("borderColor");
            this.f95751p = jSONObjectOptJSONObject.optInt("borderWidth");
            this.f95752q = jSONObjectOptJSONObject.optInt("borderRadius");
            jSONObjectOptJSONObject.optString("textAlign");
            this.f95753r = jSONObjectOptJSONObject.optInt("fontSize");
            jSONObjectOptJSONObject.optInt("lineHeight");
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m122457g(String str) {
        return ((str.length() == 7 || str.length() == 9) && str.charAt(0) == '#') ? Color.parseColor(str) : RoundedDrawable.DEFAULT_BORDER_COLOR;
    }

    @Override // p153l.oxg0
    /* JADX INFO: renamed from: a */
    public final void mo112981a() {
        pgg0 pgg0Var = this.f149667b;
        this.f95740e = pgg0Var.f152272i;
        FrameLayout frameLayout = pgg0Var.f152276m;
        if (this.f95741f.equals("image")) {
            ImageButton imageButton = new ImageButton(this.f149667b.f152265b);
            imageButton.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
            imageButton.setOnClickListener(new xyg0(this));
            imageButton.setBackgroundColor(0);
            imageButton.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f95739d = imageButton;
            String str = this.f95743h;
            if (str != null && !str.isEmpty()) {
                this.f95739d.setImageBitmap(BitmapFactory.decodeFile(this.f95743h));
            }
            frameLayout.addView(imageButton);
        } else {
            Button button = new Button(this.f149667b.f152265b);
            button.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
            this.f95738c = button;
            button.setPadding(0, 0, 0, 0);
            button.setMinWidth(0);
            button.setMinHeight(0);
            button.setMinimumHeight(0);
            button.setMinimumWidth(0);
            button.setText(this.f95742g);
            button.setBackground(new GradientDrawable());
            button.setTextSize(this.f95753r);
            button.setTextColor(m122457g(this.f95748m));
            m122458h();
            button.setOnClickListener(new m0h0(this));
            frameLayout.addView(button);
        }
        Button button2 = this.f95738c;
        if (button2 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) button2.getLayoutParams();
            float f = this.f95746k;
            float f2 = this.f95740e;
            layoutParams.width = (int) (f * f2);
            layoutParams.height = (int) (this.f95747l * f2);
            layoutParams.leftMargin = (int) (this.f95744i * f2);
            layoutParams.topMargin = (int) (this.f95745j * f2);
            button2.setLayoutParams(layoutParams);
        }
        ImageButton imageButton2 = this.f95739d;
        if (imageButton2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageButton2.getLayoutParams();
            float f3 = this.f95746k;
            float f4 = this.f95740e;
            layoutParams2.width = (int) (f3 * f4);
            layoutParams2.height = (int) (this.f95747l * f4);
            layoutParams2.leftMargin = (int) (this.f95744i * f4);
            layoutParams2.topMargin = (int) (this.f95745j * f4);
            imageButton2.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p153l.oxg0
    /* JADX INFO: renamed from: c */
    public final boolean mo112982c(String str, JSONObject jSONObject) {
        str.getClass();
        switch (str) {
            case "hide":
                Button button = this.f95738c;
                if (button != null) {
                    button.setVisibility(4);
                }
                ImageButton imageButton = this.f95739d;
                if (imageButton != null) {
                    imageButton.setVisibility(4);
                }
                return true;
            case "prop":
                String strOptString = jSONObject.optString("prop");
                String strOptString2 = jSONObject.optString("value");
                strOptString.getClass();
                if (strOptString.equals("text")) {
                    this.f95742g = strOptString2;
                    Button button2 = this.f95738c;
                    if (button2 != null) {
                        button2.setText(strOptString2);
                    }
                } else if (strOptString.equals("image")) {
                    this.f95743h = strOptString2;
                    if (this.f95739d != null && strOptString2 != null && !strOptString2.isEmpty()) {
                        this.f95739d.setImageBitmap(BitmapFactory.decodeFile(this.f95743h));
                    }
                }
                return true;
            case "show":
                Button button3 = this.f95738c;
                if (button3 != null) {
                    button3.setVisibility(0);
                }
                ImageButton imageButton2 = this.f95739d;
                if (imageButton2 != null) {
                    imageButton2.setVisibility(0);
                }
                return true;
            case "style":
                String strOptString3 = jSONObject.optString("prop");
                strOptString3.getClass();
                switch (strOptString3) {
                    case "height":
                        this.f95747l = jSONObject.optInt("value");
                        Button button4 = this.f95738c;
                        if (button4 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) button4.getLayoutParams();
                            float f = this.f95746k;
                            float f2 = this.f95740e;
                            layoutParams.width = (int) (f * f2);
                            layoutParams.height = (int) (this.f95747l * f2);
                            layoutParams.leftMargin = (int) (this.f95744i * f2);
                            layoutParams.topMargin = (int) (this.f95745j * f2);
                            button4.setLayoutParams(layoutParams);
                        }
                        ImageButton imageButton3 = this.f95739d;
                        if (imageButton3 != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageButton3.getLayoutParams();
                            float f3 = this.f95746k;
                            float f4 = this.f95740e;
                            layoutParams2.width = (int) (f3 * f4);
                            layoutParams2.height = (int) (this.f95747l * f4);
                            layoutParams2.leftMargin = (int) (this.f95744i * f4);
                            layoutParams2.topMargin = (int) (this.f95745j * f4);
                            imageButton3.setLayoutParams(layoutParams2);
                        }
                        return true;
                    case "textAlign":
                        jSONObject.optString("value");
                        return true;
                    case "lineHeight":
                        jSONObject.optInt("value");
                        return true;
                    case "top":
                        this.f95745j = jSONObject.optInt("value");
                        Button button5 = this.f95738c;
                        if (button5 != null) {
                            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) button5.getLayoutParams();
                            float f5 = this.f95746k;
                            float f6 = this.f95740e;
                            layoutParams3.width = (int) (f5 * f6);
                            layoutParams3.height = (int) (this.f95747l * f6);
                            layoutParams3.leftMargin = (int) (this.f95744i * f6);
                            layoutParams3.topMargin = (int) (this.f95745j * f6);
                            button5.setLayoutParams(layoutParams3);
                        }
                        ImageButton imageButton4 = this.f95739d;
                        if (imageButton4 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) imageButton4.getLayoutParams();
                            float f7 = this.f95746k;
                            float f8 = this.f95740e;
                            layoutParams4.width = (int) (f7 * f8);
                            layoutParams4.height = (int) (this.f95747l * f8);
                            layoutParams4.leftMargin = (int) (this.f95744i * f8);
                            layoutParams4.topMargin = (int) (this.f95745j * f8);
                            imageButton4.setLayoutParams(layoutParams4);
                        }
                        return true;
                    case "left":
                        this.f95744i = jSONObject.optInt("value");
                        Button button6 = this.f95738c;
                        if (button6 != null) {
                            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) button6.getLayoutParams();
                            float f9 = this.f95746k;
                            float f10 = this.f95740e;
                            layoutParams5.width = (int) (f9 * f10);
                            layoutParams5.height = (int) (this.f95747l * f10);
                            layoutParams5.leftMargin = (int) (this.f95744i * f10);
                            layoutParams5.topMargin = (int) (this.f95745j * f10);
                            button6.setLayoutParams(layoutParams5);
                        }
                        ImageButton imageButton5 = this.f95739d;
                        if (imageButton5 != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) imageButton5.getLayoutParams();
                            float f11 = this.f95746k;
                            float f12 = this.f95740e;
                            layoutParams6.width = (int) (f11 * f12);
                            layoutParams6.height = (int) (this.f95747l * f12);
                            layoutParams6.leftMargin = (int) (this.f95744i * f12);
                            layoutParams6.topMargin = (int) (this.f95745j * f12);
                            imageButton5.setLayoutParams(layoutParams6);
                        }
                        return true;
                    case "color":
                        String strOptString4 = jSONObject.optString("value");
                        this.f95748m = strOptString4;
                        Button button7 = this.f95738c;
                        if (button7 != null) {
                            button7.setTextColor(m122457g(strOptString4));
                        }
                        return true;
                    case "width":
                        this.f95746k = jSONObject.optInt("value");
                        Button button8 = this.f95738c;
                        if (button8 != null) {
                            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) button8.getLayoutParams();
                            float f13 = this.f95746k;
                            float f14 = this.f95740e;
                            layoutParams7.width = (int) (f13 * f14);
                            layoutParams7.height = (int) (this.f95747l * f14);
                            layoutParams7.leftMargin = (int) (this.f95744i * f14);
                            layoutParams7.topMargin = (int) (this.f95745j * f14);
                            button8.setLayoutParams(layoutParams7);
                        }
                        ImageButton imageButton6 = this.f95739d;
                        if (imageButton6 != null) {
                            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) imageButton6.getLayoutParams();
                            float f15 = this.f95746k;
                            float f16 = this.f95740e;
                            layoutParams8.width = (int) (f15 * f16);
                            layoutParams8.height = (int) (this.f95747l * f16);
                            layoutParams8.leftMargin = (int) (this.f95744i * f16);
                            layoutParams8.topMargin = (int) (this.f95745j * f16);
                            imageButton6.setLayoutParams(layoutParams8);
                        }
                        return true;
                    case "fontSize":
                        int iOptInt = jSONObject.optInt("value");
                        this.f95753r = iOptInt;
                        Button button9 = this.f95738c;
                        if (button9 != null) {
                            button9.setTextSize(iOptInt);
                        }
                        return true;
                    case "borderColor":
                        this.f95750o = jSONObject.optString("value");
                        m122458h();
                        return true;
                    case "borderWidth":
                        this.f95751p = jSONObject.optInt("value");
                        m122458h();
                        return true;
                    case "backgroundColor":
                        this.f95749n = jSONObject.optString("value");
                        m122458h();
                        return true;
                    case "borderRadius":
                        this.f95752q = jSONObject.optInt("value");
                        m122458h();
                        return true;
                    default:
                        return true;
                }
            default:
                return false;
        }
    }

    @Override // p153l.oxg0
    /* JADX INFO: renamed from: d */
    public final void mo112983d() {
        Button button = this.f95738c;
        if (button != null) {
            this.f149667b.f152276m.removeView(button);
            this.f95738c = null;
        }
        ImageButton imageButton = this.f95739d;
        if (imageButton != null) {
            this.f149667b.f152276m.removeView(imageButton);
            this.f95739d = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m122458h() {
        Button button = this.f95738c;
        if (button != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) button.getBackground();
            gradientDrawable.setColor(m122457g(this.f95749n));
            gradientDrawable.setCornerRadius(this.f95752q * this.f95740e);
            gradientDrawable.setStroke((int) (this.f95751p * this.f95740e), m122457g(this.f95750o));
            this.f95738c.setBackground(gradientDrawable);
        }
    }
}
