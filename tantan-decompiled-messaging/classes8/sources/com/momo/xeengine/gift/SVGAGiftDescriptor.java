package com.momo.xeengine.gift;

import android.text.TextUtils;
import com.momo.xeengine.svgaplayer.utils.SafeKit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
final class SVGAGiftDescriptor {
    private int loops;
    private SVGAInfo svgaInfo;
    private String video;

    public static class Item {
        private boolean isBold;
        private boolean isCircle;
        private int isClick;
        private String key;
        private String text;
        private int textAlignType;
        private int textColor = -1;
        private int textSize;
        private int type;

        public int getIsClick() {
            return this.isClick;
        }

        public String getKey() {
            return this.key;
        }

        public String getText() {
            return this.text;
        }

        public int getTextAlignType() {
            return this.textAlignType;
        }

        public int getTextColor() {
            return this.textColor;
        }

        public int getTextSize() {
            return this.textSize;
        }

        public int getType() {
            return this.type;
        }

        public boolean isBold() {
            return this.isBold;
        }

        public boolean isCircle() {
            return this.isCircle;
        }
    }

    public static class SVGAInfo {
        private List<Item> itemsList;
        private SVGAPositionType positionType;
        private SVGAScaleType scaleType;
        private String svgaPath;

        public SVGAInfo(JSONObject jSONObject) {
            SVGAPositionType sVGAPositionType;
            this.positionType = SVGAPositionType.fromValue(jSONObject.optInt("positionType", SVGAPositionType.CENTER.getValue()));
            SVGAScaleType sVGAScaleTypeFromValue = SVGAScaleType.fromValue(jSONObject.optInt("scaleType", SVGAScaleType.NONE.getValue()));
            this.scaleType = sVGAScaleTypeFromValue;
            if (sVGAScaleTypeFromValue == SVGAScaleType.ASPECT_FILL && ((sVGAPositionType = this.positionType) == SVGAPositionType.TOP || sVGAPositionType == SVGAPositionType.BOTTOM)) {
                this.scaleType = SVGAScaleType.ASPECT_FIT;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("itemslist");
            if (jSONArrayOptJSONArray != null) {
                this.itemsList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        Item item = new Item();
                        item.key = jSONObjectOptJSONObject.optString("key");
                        item.isCircle = jSONObjectOptJSONObject.optInt("isCircle", 0) != 0;
                        item.type = jSONObjectOptJSONObject.optInt("type", -1);
                        item.text = jSONObjectOptJSONObject.optString("text", "");
                        item.isBold = jSONObjectOptJSONObject.optBoolean("isBold", false);
                        item.textSize = jSONObjectOptJSONObject.optInt("textSize", 0);
                        item.textAlignType = jSONObjectOptJSONObject.optInt("textAlignType", 0);
                        item.textColor = SafeKit.parseColor(jSONObjectOptJSONObject.optString("textColor", ""));
                        item.isClick = jSONObjectOptJSONObject.optInt("isClick", 0);
                        this.itemsList.add(item);
                    }
                }
            }
        }

        public List<Item> getItemsList() {
            return this.itemsList;
        }

        public SVGAPositionType getPositionType() {
            return this.positionType;
        }

        public SVGAScaleType getScaleType() {
            return this.scaleType;
        }

        public String getSvgaPath() {
            return this.svgaPath;
        }

        public void setPositionType(SVGAPositionType sVGAPositionType) {
            this.positionType = sVGAPositionType;
        }

        public void setScaleType(SVGAScaleType sVGAScaleType) {
            this.scaleType = sVGAScaleType;
        }
    }

    public static SVGAGiftDescriptor createWithConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("svga_info");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            SVGAInfo sVGAInfo = new SVGAInfo(jSONObjectOptJSONObject);
            String strOptString = jSONObjectOptJSONObject.optString("svgaName");
            if (!TextUtils.isEmpty(strOptString)) {
                File file = new File(str, strOptString);
                if (!file.exists()) {
                    return null;
                }
                sVGAInfo.svgaPath = file.getAbsolutePath();
            }
            SVGAGiftDescriptor sVGAGiftDescriptor = new SVGAGiftDescriptor();
            sVGAGiftDescriptor.svgaInfo = sVGAInfo;
            String strOptString2 = jSONObject.optString("video");
            if (!TextUtils.isEmpty(strOptString2)) {
                String str2 = str + "/" + strOptString2;
                if (new File(str2).exists()) {
                    sVGAGiftDescriptor.video = str2;
                }
            }
            return sVGAGiftDescriptor;
        } catch (Exception unused) {
            return null;
        }
    }

    public static SVGAGiftDescriptor createWithSpec(String str, JSONObject jSONObject) {
        try {
            String strFindFirstSVGAFile = findFirstSVGAFile(str);
            if (TextUtils.isEmpty(strFindFirstSVGAFile)) {
                return null;
            }
            SVGAGiftDescriptor sVGAGiftDescriptor = new SVGAGiftDescriptor();
            SVGAInfo sVGAInfo = new SVGAInfo(jSONObject);
            sVGAGiftDescriptor.svgaInfo = sVGAInfo;
            sVGAInfo.svgaPath = strFindFirstSVGAFile;
            return sVGAGiftDescriptor;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String findFirstSVGAFile(String str) {
        File[] fileArrListFiles;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile() && file2.getName().toLowerCase().endsWith(".svga")) {
                return file2.getAbsolutePath();
            }
        }
        return null;
    }

    public int getLoops() {
        return this.loops;
    }

    public SVGAInfo getSvgaInfo() {
        return this.svgaInfo;
    }

    public String getVideo() {
        return this.video;
    }

    public void setLoops(int i) {
        this.loops = i;
    }
}
