package com.immomo.velib.anim.model;

import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Element {
    public static final int IMAGE = 1;
    public static final int TEXT = 2;
    private List<ElementAnimation> anim;
    private String background;
    private int duration;
    private String folder;
    private int fontSize;
    private float height;

    /* JADX INFO: renamed from: id */
    private String f14130id;
    private int maxLen;
    private List<ElementNewAnimation> new_anim;
    private String text;
    private String textColor;
    private int type;
    private String url;
    private float width;
    private int fontPixel = 0;
    public boolean useCircle = false;
    public int vWidth = 720;
    public int vHeight = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Element element = (Element) obj;
            if (Float.compare(element.width, this.width) != 0 || Float.compare(element.height, this.height) != 0 || this.fontSize != element.fontSize || this.maxLen != element.maxLen || this.vWidth != element.vWidth || this.vHeight != element.vHeight) {
                return false;
            }
            String str = this.text;
            String str2 = element.text;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.background;
            String str4 = element.background;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.textColor;
            String str6 = element.textColor;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            List<ElementNewAnimation> list = this.new_anim;
            List<ElementNewAnimation> list2 = element.new_anim;
            if (list == null ? list2 != null : !list.equals(list2)) {
                return false;
            }
            List<ElementAnimation> list3 = this.anim;
            List<ElementAnimation> list4 = element.anim;
            if (list3 == null ? list4 != null : !list3.equals(list4)) {
                return false;
            }
            String str7 = this.folder;
            String str8 = element.folder;
            if (str7 != null) {
                return str7.equals(str8);
            }
            if (str8 == null) {
                return true;
            }
        }
        return false;
    }

    public List<ElementAnimation> getAnim() {
        return this.anim;
    }

    public String getBackground() {
        return this.background;
    }

    public String getBackgroundPath() {
        return this.folder + "/" + this.background;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getFolder() {
        return this.folder;
    }

    public int getFontPixel() {
        return this.fontPixel;
    }

    public int getFontSize() {
        return this.fontSize;
    }

    public float getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f14130id;
    }

    public int getMaxLen() {
        return this.maxLen;
    }

    public List<ElementNewAnimation> getNew_anim() {
        return this.new_anim;
    }

    public String getText() {
        return this.text;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public float getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        float f = this.width;
        int iFloatToIntBits = (iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.height;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        String str2 = this.background;
        int iHashCode2 = (((iFloatToIntBits2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.fontSize) * 31;
        String str3 = this.textColor;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.maxLen) * 31;
        List<ElementNewAnimation> list = this.new_anim;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<ElementAnimation> list2 = this.anim;
        int iHashCode5 = (iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str4 = this.folder;
        return ((((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.vWidth) * 31) + this.vHeight;
    }

    public void setAnim(List<ElementAnimation> list) {
        this.anim = list;
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setFolder(String str) {
        this.folder = str;
    }

    public void setFontPixel(int i) {
        this.fontPixel = i;
    }

    public void setFontSize(int i) {
        this.fontSize = i;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setId(String str) {
        this.f14130id = str;
    }

    public void setMaxLen(int i) {
        this.maxLen = i;
    }

    public Element setNew_anim(List<ElementNewAnimation> list) {
        this.new_anim = list;
        return this;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(float f) {
        this.width = f;
    }
}
