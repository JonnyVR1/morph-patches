package com.immomo.momomediaext.filter.beauty;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ByteDanceBeautyConfig implements Serializable {
    private FolderConfig beauty;
    private FolderConfig body;
    private MakeupConfig makeup;

    @SerializedName("makeup_style")
    private MakeupConfig makeupStyle;
    private FolderConfig reshape;

    public static class FolderConfig {
        private String folder;
        private List<ItemConfig> objects;

        public FolderConfig(String str, List<ItemConfig> list) {
            this.folder = str;
            this.objects = list;
        }

        public String getFolder() {
            String str = this.folder;
            return str == null ? "" : str;
        }

        public List<ItemConfig> getObjects() {
            List<ItemConfig> list = this.objects;
            return list == null ? new ArrayList() : list;
        }
    }

    public static class ItemConfig {

        /* JADX INFO: renamed from: id */
        private String f13923id;
        private String key;
        private String key1;

        public ItemConfig(String str, String str2, String str3) {
            this.f13923id = str;
            this.key = str2;
            this.key1 = str3;
        }

        public String getId() {
            String str = this.f13923id;
            return str == null ? "" : str;
        }

        public String getKey() {
            String str = this.key;
            return str == null ? "" : str;
        }

        public String getKey1() {
            String str = this.key1;
            return str == null ? "" : str;
        }
    }

    public static class MakeupConfig {
        private String folder;
        private List<FolderConfig> objects;

        public MakeupConfig(String str, List<FolderConfig> list) {
            this.folder = str;
            this.objects = list;
        }

        public String getFolder() {
            String str = this.folder;
            return str == null ? "" : str;
        }

        public List<FolderConfig> getObjects() {
            List<FolderConfig> list = this.objects;
            return list == null ? new ArrayList() : list;
        }
    }

    public FolderConfig getBeauty() {
        return this.beauty;
    }

    public FolderConfig getBody() {
        return this.body;
    }

    public MakeupConfig getMakeup() {
        return this.makeup;
    }

    public MakeupConfig getMakeupStyle() {
        return this.makeupStyle;
    }

    public FolderConfig getReshape() {
        return this.reshape;
    }
}
