package com.p046p1.mobile.putong.live.base.apibean;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FanbaseGroupsBean extends BaseLiveBean {
    private FanbaseGroupSummary fanbaseGroupSummary;
    private List<FansbaseGroupsItem> fanbaseGroups;

    public class CategoryBean {
        private String color;

        /* JADX INFO: renamed from: id */
        private String f44233id;
        private String name;

        public CategoryBean() {
        }

        public String getColor() {
            return this.color;
        }

        public String getId() {
            return this.f44233id;
        }

        public String getName() {
            return this.name;
        }

        public void setColor(String str) {
            this.color = str;
        }

        public void setId(String str) {
            this.f44233id = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "CategoryBean{id='" + this.f44233id + "', name='" + this.name + "', color='" + this.color + "'}";
        }
    }

    public class FanbaseGroupSummary {
        private int maxGroupCount;

        public FanbaseGroupSummary() {
        }

        public int getMaxGroupCount() {
            return this.maxGroupCount;
        }

        public void setMaxGroupCount(int i) {
            this.maxGroupCount = i;
        }

        public String toString() {
            return "FanbaseGroupSummary{maxGroupCount=" + this.maxGroupCount + '}';
        }
    }

    public class FansbaseGroupsItem {
        private String avatar;
        private boolean canJoin;
        private String cannotJoinReason;
        private CategoryBean category;
        private int currentMemberCount;
        private String desc;

        /* JADX INFO: renamed from: id */
        private String f44234id;
        private int maxMemberCount;
        private String name;
        private String statusDesc;
        private List<TagItemBean> tags;

        public FansbaseGroupsItem() {
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getCannotJoinReason() {
            return this.cannotJoinReason;
        }

        public CategoryBean getCategory() {
            return this.category;
        }

        public int getCurrentMemberCount() {
            return this.currentMemberCount;
        }

        public String getDesc() {
            return this.desc;
        }

        public String getId() {
            return this.f44234id;
        }

        public int getMaxMemberCount() {
            return this.maxMemberCount;
        }

        public String getName() {
            return this.name;
        }

        public String getStatusDesc() {
            return this.statusDesc;
        }

        public List<TagItemBean> getTags() {
            return this.tags;
        }

        public boolean isCanJoin() {
            return this.canJoin;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setCanJoin(boolean z) {
            this.canJoin = z;
        }

        public void setCannotJoinReason(String str) {
            this.cannotJoinReason = str;
        }

        public void setCategory(CategoryBean categoryBean) {
            this.category = categoryBean;
        }

        public void setCurrentMemberCount(int i) {
            this.currentMemberCount = i;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setId(String str) {
            this.f44234id = str;
        }

        public void setMaxMemberCount(int i) {
            this.maxMemberCount = i;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setStatusDesc(String str) {
            this.statusDesc = str;
        }

        public void setTags(List<TagItemBean> list) {
            this.tags = list;
        }

        public String toString() {
            return "FansbaseGroupsItem{id='" + this.f44234id + "', name='" + this.name + "', tags=" + this.tags + ", desc='" + this.desc + "', avatar='" + this.avatar + "', canJoin=" + this.canJoin + ", cannotJoinReason='" + this.cannotJoinReason + "', statusDesc='" + this.statusDesc + "', category=" + this.category + ", maxMemberCount=" + this.maxMemberCount + ", currentMemberCount=" + this.currentMemberCount + '}';
        }
    }

    public class TagItemBean {
        private String name;

        public TagItemBean() {
        }

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "TagItemBean{name='" + this.name + "'}";
        }
    }

    public FanbaseGroupSummary getFanbaseGroupSummary() {
        return this.fanbaseGroupSummary;
    }

    public List<FansbaseGroupsItem> getFanbaseGroups() {
        return this.fanbaseGroups;
    }

    public void setFanbaseGroupSummary(FanbaseGroupSummary fanbaseGroupSummary) {
        this.fanbaseGroupSummary = fanbaseGroupSummary;
    }

    public void setFanbaseGroups(List<FansbaseGroupsItem> list) {
        this.fanbaseGroups = list;
    }

    public String toString() {
        return "FanbaseGroupsBean{fanbaseGroupSummary=" + this.fanbaseGroupSummary + ", fanbaseGroups=" + this.fanbaseGroups + '}';
    }
}
