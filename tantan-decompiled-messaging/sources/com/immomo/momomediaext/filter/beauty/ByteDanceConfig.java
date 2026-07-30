package com.immomo.momomediaext.filter.beauty;

import android.content.Context;
import android.text.TextUtils;
import com.core.glcore.util.JsonUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p149l.eyx;

/* JADX INFO: loaded from: classes7.dex */
public class ByteDanceConfig {
    private static ByteDanceBeautyConfig configs = null;
    private static String resourceRootPath = "";

    public static List<ByteDanceBeautyConfig.ItemConfig> availableBeautyItems() {
        ByteDanceBeautyConfig byteDanceBeautyConfig = configs;
        return (byteDanceBeautyConfig == null || byteDanceBeautyConfig.getBeauty() == null) ? new ArrayList() : configs.getBeauty().getObjects();
    }

    public static String availableBeautyPath() {
        ByteDanceBeautyConfig byteDanceBeautyConfig;
        if (TextUtils.isEmpty(resourceRootPath) || (byteDanceBeautyConfig = configs) == null || byteDanceBeautyConfig.getBeauty() == null || configs.getBeauty().getObjects() == null || configs.getBeauty().getObjects().size() <= 0 || configs.getBeauty().getObjects().get(0) == null || TextUtils.isEmpty(configs.getBeauty().getObjects().get(0).getId())) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(resourceRootPath);
        String str = File.separator;
        sb.append(str);
        sb.append(configs.getBeauty().getObjects().get(0).getId().replace("_", str));
        return sb.toString();
    }

    public static List<ByteDanceBeautyConfig.FolderConfig> availableMakeupItems() {
        ByteDanceBeautyConfig byteDanceBeautyConfig = configs;
        return (byteDanceBeautyConfig == null || byteDanceBeautyConfig.getMakeup() == null) ? new ArrayList() : configs.getMakeup().getObjects();
    }

    public static String availableMakeupPath() {
        ByteDanceBeautyConfig byteDanceBeautyConfig;
        if (TextUtils.isEmpty(resourceRootPath) || (byteDanceBeautyConfig = configs) == null || byteDanceBeautyConfig.getMakeup() == null || configs.getMakeup().getFolder() == null) {
            return "";
        }
        return resourceRootPath + File.separator + configs.getMakeup().getFolder();
    }

    public static List<ByteDanceBeautyConfig.FolderConfig> availableMakeupStyleItems() {
        ByteDanceBeautyConfig byteDanceBeautyConfig = configs;
        return (byteDanceBeautyConfig == null || byteDanceBeautyConfig.getMakeupStyle() == null) ? new ArrayList() : configs.getMakeupStyle().getObjects();
    }

    public static String availableMakeupStylePath() {
        ByteDanceBeautyConfig byteDanceBeautyConfig;
        return (TextUtils.isEmpty(resourceRootPath) || (byteDanceBeautyConfig = configs) == null || byteDanceBeautyConfig.getMakeupStyle() == null || configs.getMakeupStyle().getFolder() == null) ? "" : configs.getMakeupStyle().getFolder();
    }

    public static List<ByteDanceBeautyConfig.ItemConfig> availableReshapeItems() {
        ByteDanceBeautyConfig byteDanceBeautyConfig = configs;
        return (byteDanceBeautyConfig == null || byteDanceBeautyConfig.getReshape() == null) ? new ArrayList() : configs.getReshape().getObjects();
    }

    public static String availableReshapePath() {
        ByteDanceBeautyConfig byteDanceBeautyConfig;
        if (TextUtils.isEmpty(resourceRootPath) || (byteDanceBeautyConfig = configs) == null || byteDanceBeautyConfig.getReshape() == null || configs.getReshape().getObjects() == null || configs.getReshape().getObjects().size() <= 0 || configs.getReshape().getObjects().get(0) == null || TextUtils.isEmpty(configs.getReshape().getObjects().get(0).getId())) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(resourceRootPath);
        String str = File.separator;
        sb.append(str);
        sb.append(configs.getReshape().getObjects().get(0).getId().replace("_", str));
        return sb.toString();
    }

    public static void parseBeautyConfig(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            resourceRootPath = str;
            String strJsonStringFromFile = JsonUtil.getInstance().jsonStringFromFile(file.getPath() + File.separator + "config.json");
            if (TextUtils.isEmpty(strJsonStringFromFile)) {
                return;
            }
            try {
                configs = (ByteDanceBeautyConfig) JsonUtil.getInstance().fromJson(strJsonStringFromFile, ByteDanceBeautyConfig.class);
            } catch (Exception e) {
                eyx.m118802c().m118808g("ByteDaceConfig", "parse error: " + e + " jsonStr: " + strJsonStringFromFile);
            }
        }
    }

    @Deprecated
    public static void parseBeautyConfig(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            resourceRootPath = str;
            String strJsonStringFromFile = JsonUtil.getInstance().jsonStringFromFile(file.getPath() + File.separator + "config.json");
            if (TextUtils.isEmpty(strJsonStringFromFile)) {
                return;
            }
            try {
                configs = (ByteDanceBeautyConfig) JsonUtil.getInstance().fromJson(strJsonStringFromFile, ByteDanceBeautyConfig.class);
            } catch (Exception e) {
                eyx.m118802c().m118808g("ByteDaceConfig", "parse error: " + e + " jsonStr: " + strJsonStringFromFile);
            }
        }
    }
}
