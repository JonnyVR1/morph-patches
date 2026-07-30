package p149l;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import org.json.JSONObject;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class wkg0 extends gpg0 {

    /* JADX INFO: renamed from: c */
    public Button f186747c;

    /* JADX INFO: renamed from: d */
    public ImageButton f186748d;

    /* JADX INFO: renamed from: e */
    public float f186749e;

    /* JADX INFO: renamed from: f */
    public final String f186750f;

    /* JADX INFO: renamed from: g */
    public String f186751g;

    /* JADX INFO: renamed from: h */
    public String f186752h;

    /* JADX INFO: renamed from: i */
    public int f186753i;

    /* JADX INFO: renamed from: j */
    public int f186754j;

    /* JADX INFO: renamed from: k */
    public int f186755k;

    /* JADX INFO: renamed from: l */
    public int f186756l;

    /* JADX INFO: renamed from: m */
    public String f186757m;

    /* JADX INFO: renamed from: n */
    public String f186758n;

    /* JADX INFO: renamed from: o */
    public String f186759o;

    /* JADX INFO: renamed from: p */
    public int f186760p;

    /* JADX INFO: renamed from: q */
    public int f186761q;

    /* JADX INFO: renamed from: r */
    public int f186762r;

    public wkg0(JSONObject jSONObject) {
        this.f186750f = jSONObject.optString("type");
        this.f186751g = jSONObject.optString("text");
        this.f186752h = jSONObject.optString("image");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("style");
        if (jSONObjectOptJSONObject != null) {
            this.f186753i = jSONObjectOptJSONObject.optInt(BLiveGiftBubblePopupTitlePosition.left);
            this.f186754j = jSONObjectOptJSONObject.optInt(StickStatus.top);
            this.f186755k = jSONObjectOptJSONObject.optInt("width");
            this.f186756l = jSONObjectOptJSONObject.optInt("height");
            this.f186757m = jSONObjectOptJSONObject.optString("color");
            this.f186758n = jSONObjectOptJSONObject.optString("backgroundColor");
            this.f186759o = jSONObjectOptJSONObject.optString("borderColor");
            this.f186760p = jSONObjectOptJSONObject.optInt("borderWidth");
            this.f186761q = jSONObjectOptJSONObject.optInt("borderRadius");
            jSONObjectOptJSONObject.optString("textAlign");
            this.f186762r = jSONObjectOptJSONObject.optInt("fontSize");
            jSONObjectOptJSONObject.optInt("lineHeight");
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m203669g(String str) {
        return ((str.length() == 7 || str.length() == 9) && str.charAt(0) == '#') ? Color.parseColor(str) : RoundedDrawable.DEFAULT_BORDER_COLOR;
    }

    @Override // p149l.gpg0
    /* JADX INFO: renamed from: a */
    public final void mo110226a() {
        h8g0 h8g0Var = this.f103801b;
        this.f186749e = h8g0Var.f106418i;
        FrameLayout frameLayout = h8g0Var.f106422m;
        if (this.f186750f.equals("image")) {
            ImageButton imageButton = new ImageButton(this.f103801b.f106411b);
            imageButton.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
            imageButton.setOnClickListener(new pqg0(this));
            imageButton.setBackgroundColor(0);
            imageButton.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f186748d = imageButton;
            String str = this.f186752h;
            if (str != null && !str.isEmpty()) {
                this.f186748d.setImageBitmap(BitmapFactory.decodeFile(this.f186752h));
            }
            frameLayout.addView(imageButton);
        } else {
            Button button = new Button(this.f103801b.f106411b);
            button.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
            this.f186747c = button;
            button.setPadding(0, 0, 0, 0);
            button.setMinWidth(0);
            button.setMinHeight(0);
            button.setMinimumHeight(0);
            button.setMinimumWidth(0);
            button.setText(this.f186751g);
            button.setBackground(new GradientDrawable());
            button.setTextSize(this.f186762r);
            button.setTextColor(m203669g(this.f186757m));
            m203670h();
            button.setOnClickListener(new esg0(this));
            frameLayout.addView(button);
        }
        Button button2 = this.f186747c;
        if (button2 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) button2.getLayoutParams();
            float f = this.f186755k;
            float f2 = this.f186749e;
            layoutParams.width = (int) (f * f2);
            layoutParams.height = (int) (this.f186756l * f2);
            layoutParams.leftMargin = (int) (this.f186753i * f2);
            layoutParams.topMargin = (int) (this.f186754j * f2);
            button2.setLayoutParams(layoutParams);
        }
        ImageButton imageButton2 = this.f186748d;
        if (imageButton2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageButton2.getLayoutParams();
            float f3 = this.f186755k;
            float f4 = this.f186749e;
            layoutParams2.width = (int) (f3 * f4);
            layoutParams2.height = (int) (this.f186756l * f4);
            layoutParams2.leftMargin = (int) (this.f186753i * f4);
            layoutParams2.topMargin = (int) (this.f186754j * f4);
            imageButton2.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p149l.gpg0
    /* JADX INFO: renamed from: c */
    public final boolean mo110227c(String str, JSONObject jSONObject) {
        str.getClass();
        switch (str) {
            case "hide":
                Button button = this.f186747c;
                if (button != null) {
                    button.setVisibility(4);
                }
                ImageButton imageButton = this.f186748d;
                if (imageButton != null) {
                    imageButton.setVisibility(4);
                }
                return true;
            case "prop":
                String strOptString = jSONObject.optString("prop");
                String strOptString2 = jSONObject.optString("value");
                strOptString.getClass();
                if (strOptString.equals("text")) {
                    this.f186751g = strOptString2;
                    Button button2 = this.f186747c;
                    if (button2 != null) {
                        button2.setText(strOptString2);
                    }
                } else if (strOptString.equals("image")) {
                    this.f186752h = strOptString2;
                    if (this.f186748d != null && strOptString2 != null && !strOptString2.isEmpty()) {
                        this.f186748d.setImageBitmap(BitmapFactory.decodeFile(this.f186752h));
                    }
                }
                return true;
            case "show":
                Button button3 = this.f186747c;
                if (button3 != null) {
                    button3.setVisibility(0);
                }
                ImageButton imageButton2 = this.f186748d;
                if (imageButton2 != null) {
                    imageButton2.setVisibility(0);
                }
                return true;
            case "style":
                String strOptString3 = jSONObject.optString("prop");
                strOptString3.getClass();
                switch (strOptString3) {
                    case "height":
                        this.f186756l = jSONObject.optInt("value");
                        Button button4 = this.f186747c;
                        if (button4 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) button4.getLayoutParams();
                            float f = this.f186755k;
                            float f2 = this.f186749e;
                            layoutParams.width = (int) (f * f2);
                            layoutParams.height = (int) (this.f186756l * f2);
                            layoutParams.leftMargin = (int) (this.f186753i * f2);
                            layoutParams.topMargin = (int) (this.f186754j * f2);
                            button4.setLayoutParams(layoutParams);
                        }
                        ImageButton imageButton3 = this.f186748d;
                        if (imageButton3 != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageButton3.getLayoutParams();
                            float f3 = this.f186755k;
                            float f4 = this.f186749e;
                            layoutParams2.width = (int) (f3 * f4);
                            layoutParams2.height = (int) (this.f186756l * f4);
                            layoutParams2.leftMargin = (int) (this.f186753i * f4);
                            layoutParams2.topMargin = (int) (this.f186754j * f4);
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
                        this.f186754j = jSONObject.optInt("value");
                        Button button5 = this.f186747c;
                        if (button5 != null) {
                            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) button5.getLayoutParams();
                            float f5 = this.f186755k;
                            float f6 = this.f186749e;
                            layoutParams3.width = (int) (f5 * f6);
                            layoutParams3.height = (int) (this.f186756l * f6);
                            layoutParams3.leftMargin = (int) (this.f186753i * f6);
                            layoutParams3.topMargin = (int) (this.f186754j * f6);
                            button5.setLayoutParams(layoutParams3);
                        }
                        ImageButton imageButton4 = this.f186748d;
                        if (imageButton4 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) imageButton4.getLayoutParams();
                            float f7 = this.f186755k;
                            float f8 = this.f186749e;
                            layoutParams4.width = (int) (f7 * f8);
                            layoutParams4.height = (int) (this.f186756l * f8);
                            layoutParams4.leftMargin = (int) (this.f186753i * f8);
                            layoutParams4.topMargin = (int) (this.f186754j * f8);
                            imageButton4.setLayoutParams(layoutParams4);
                        }
                        return true;
                    case "left":
                        this.f186753i = jSONObject.optInt("value");
                        Button button6 = this.f186747c;
                        if (button6 != null) {
                            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) button6.getLayoutParams();
                            float f9 = this.f186755k;
                            float f10 = this.f186749e;
                            layoutParams5.width = (int) (f9 * f10);
                            layoutParams5.height = (int) (this.f186756l * f10);
                            layoutParams5.leftMargin = (int) (this.f186753i * f10);
                            layoutParams5.topMargin = (int) (this.f186754j * f10);
                            button6.setLayoutParams(layoutParams5);
                        }
                        ImageButton imageButton5 = this.f186748d;
                        if (imageButton5 != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) imageButton5.getLayoutParams();
                            float f11 = this.f186755k;
                            float f12 = this.f186749e;
                            layoutParams6.width = (int) (f11 * f12);
                            layoutParams6.height = (int) (this.f186756l * f12);
                            layoutParams6.leftMargin = (int) (this.f186753i * f12);
                            layoutParams6.topMargin = (int) (this.f186754j * f12);
                            imageButton5.setLayoutParams(layoutParams6);
                        }
                        return true;
                    case "color":
                        String strOptString4 = jSONObject.optString("value");
                        this.f186757m = strOptString4;
                        Button button7 = this.f186747c;
                        if (button7 != null) {
                            button7.setTextColor(m203669g(strOptString4));
                        }
                        return true;
                    case "width":
                        this.f186755k = jSONObject.optInt("value");
                        Button button8 = this.f186747c;
                        if (button8 != null) {
                            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) button8.getLayoutParams();
                            float f13 = this.f186755k;
                            float f14 = this.f186749e;
                            layoutParams7.width = (int) (f13 * f14);
                            layoutParams7.height = (int) (this.f186756l * f14);
                            layoutParams7.leftMargin = (int) (this.f186753i * f14);
                            layoutParams7.topMargin = (int) (this.f186754j * f14);
                            button8.setLayoutParams(layoutParams7);
                        }
                        ImageButton imageButton6 = this.f186748d;
                        if (imageButton6 != null) {
                            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) imageButton6.getLayoutParams();
                            float f15 = this.f186755k;
                            float f16 = this.f186749e;
                            layoutParams8.width = (int) (f15 * f16);
                            layoutParams8.height = (int) (this.f186756l * f16);
                            layoutParams8.leftMargin = (int) (this.f186753i * f16);
                            layoutParams8.topMargin = (int) (this.f186754j * f16);
                            imageButton6.setLayoutParams(layoutParams8);
                        }
                        return true;
                    case "fontSize":
                        int iOptInt = jSONObject.optInt("value");
                        this.f186762r = iOptInt;
                        Button button9 = this.f186747c;
                        if (button9 != null) {
                            button9.setTextSize(iOptInt);
                        }
                        return true;
                    case "borderColor":
                        this.f186759o = jSONObject.optString("value");
                        m203670h();
                        return true;
                    case "borderWidth":
                        this.f186760p = jSONObject.optInt("value");
                        m203670h();
                        return true;
                    case "backgroundColor":
                        this.f186758n = jSONObject.optString("value");
                        m203670h();
                        return true;
                    case "borderRadius":
                        this.f186761q = jSONObject.optInt("value");
                        m203670h();
                        return true;
                    default:
                        return true;
                }
            default:
                return false;
        }
    }

    @Override // p149l.gpg0
    /* JADX INFO: renamed from: d */
    public final void mo110228d() {
        Button button = this.f186747c;
        if (button != null) {
            this.f103801b.f106422m.removeView(button);
            this.f186747c = null;
        }
        ImageButton imageButton = this.f186748d;
        if (imageButton != null) {
            this.f103801b.f106422m.removeView(imageButton);
            this.f186748d = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m203670h() {
        Button button = this.f186747c;
        if (button != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) button.getBackground();
            gradientDrawable.setColor(m203669g(this.f186758n));
            gradientDrawable.setCornerRadius(this.f186761q * this.f186749e);
            gradientDrawable.setStroke((int) (this.f186760p * this.f186749e), m203669g(this.f186759o));
            this.f186747c.setBackground(gradientDrawable);
        }
    }
}
