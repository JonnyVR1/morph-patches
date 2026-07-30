package com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLogEntity extends LogEntity<ProfileLogName> {

    @SerializedName("durationLast")
    public long durationLast = -1;

    @SerializedName("durationTrace")
    public long durationTrace = -1;

    @SerializedName("durationBegin")
    public long durationBegin = -1;

    public static class ProfileLogBuilder extends LogEntity.Builder<ProfileLogName, ProfileLogEntity> {
        @Override // com.p1.mobile.putong.core.ui.profile.helpers.performance.LogEntity.Builder
        public ProfileLogEntity build() {
            ProfileLogEntity profileLogEntity = (ProfileLogEntity) super.build();
            if (profileLogEntity.logDescription == null) {
                profileLogEntity.logDescription = ((ProfileLogName) profileLogEntity.logName).description();
            }
            return profileLogEntity;
        }

        @Override // com.p1.mobile.putong.core.ui.profile.helpers.performance.LogEntity.Builder
        public ProfileLogEntity newInstance() {
            return new ProfileLogEntity();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class ProfileLogName implements LogName {
        public static final ProfileLogName ACT_CREATE;
        public static final ProfileLogName AFTER_GET_USER_INFO;
        public static final ProfileLogName ANIM_ON_CREATE;
        public static final ProfileLogName CARD_CLICK;
        public static final ProfileLogName DURATION_RESUME;
        public static final ProfileLogName DURATION_START;
        public static final ProfileLogName ENTER_ANIM;
        public static final ProfileLogName FRAG_VP_OBTAIN_VIEW;
        public static final ProfileLogName INFLATE_VIEW;
        public static final ProfileLogName INIT_VIEW;
        public static final ProfileLogName ITEM_INFLATE;
        public static final ProfileLogName PRE_CREATE_VIEW;
        public static final ProfileLogName SHOW_HIDE;
        public static final ProfileLogName CUSTOM = new ProfileLogName("CUSTOM", 0);
        private static final /* synthetic */ ProfileLogName[] $VALUES = $values();

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$1 */
        public final enum C00811 extends ProfileLogName {
            private C00811(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "item,Inflate";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$10 */
        public final enum C008210 extends ProfileLogName {
            private C008210(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "Profile页InflateView";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$11 */
        public final enum C008311 extends ProfileLogName {
            private C008311(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "Profile页initView";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$12 */
        public final enum C008412 extends ProfileLogName {
            private C008412(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "Profile页preCreateView";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$13 */
        public final enum C008513 extends ProfileLogName {
            private C008513(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "Profile页afterGetUserInfo";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$2 */
        public final enum C00862 extends ProfileLogName {
            private C00862(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "卡片入场动画";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$3 */
        public final enum C00873 extends ProfileLogName {
            private C00873(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "viewPager生产ImageView";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$4 */
        public final enum C00884 extends ProfileLogName {
            private C00884(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "frag动画初始化";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$5 */
        public final enum C00895 extends ProfileLogName {
            private C00895(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "fragShowOrHide";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$6 */
        public final enum C00906 extends ProfileLogName {
            private C00906(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "onStart间隔";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$7 */
        public final enum C00917 extends ProfileLogName {
            private C00917(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "onResume间隔";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$8 */
        public final enum C00928 extends ProfileLogName {
            private C00928(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "profileFrag创建";
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity$ProfileLogName$9 */
        public final enum C00939 extends ProfileLogName {
            private C00939(String str, int i) {
                super(str, i);
            }

            @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName
            public String description() {
                return "卡片点击到动画开始执行";
            }
        }

        private static /* synthetic */ ProfileLogName[] $values() {
            return new ProfileLogName[]{CUSTOM, ITEM_INFLATE, ENTER_ANIM, FRAG_VP_OBTAIN_VIEW, ANIM_ON_CREATE, SHOW_HIDE, DURATION_START, DURATION_RESUME, ACT_CREATE, CARD_CLICK, INFLATE_VIEW, INIT_VIEW, PRE_CREATE_VIEW, AFTER_GET_USER_INFO};
        }

        static {
            ITEM_INFLATE = new C00811("ITEM_INFLATE", 1);
            ENTER_ANIM = new C00862("ENTER_ANIM", 2);
            FRAG_VP_OBTAIN_VIEW = new C00873("FRAG_VP_OBTAIN_VIEW", 3);
            ANIM_ON_CREATE = new C00884("ANIM_ON_CREATE", 4);
            SHOW_HIDE = new C00895("SHOW_HIDE", 5);
            DURATION_START = new C00906("DURATION_START", 6);
            DURATION_RESUME = new C00917("DURATION_RESUME", 7);
            ACT_CREATE = new C00928("ACT_CREATE", 8);
            CARD_CLICK = new C00939("CARD_CLICK", 9);
            INFLATE_VIEW = new C008210("INFLATE_VIEW", 10);
            INIT_VIEW = new C008311("INIT_VIEW", 11);
            PRE_CREATE_VIEW = new C008412("PRE_CREATE_VIEW", 12);
            AFTER_GET_USER_INFO = new C008513("AFTER_GET_USER_INFO", 13);
        }

        public static ProfileLogName valueOf(String str) {
            return (ProfileLogName) Enum.valueOf(ProfileLogName.class, str);
        }

        public static ProfileLogName[] values() {
            return (ProfileLogName[]) $VALUES.clone();
        }

        private ProfileLogName(String str, int i) {
            super(str, i);
        }
    }

    public static ProfileLogBuilder builder() {
        return new ProfileLogBuilder();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogEntity
    public String toString() {
        return "LOG{, logName=" + this.logName + ", type=" + this.type + ", traceHash=" + (this.traceHash >> 16) + ", bindHash=" + (this.bindHash >> 16) + ", durTrace=" + this.durationTrace + ", durLast=" + this.durationLast + ", durBegin=" + this.durationBegin + ", des='" + this.logDescription + "'}";
    }
}
