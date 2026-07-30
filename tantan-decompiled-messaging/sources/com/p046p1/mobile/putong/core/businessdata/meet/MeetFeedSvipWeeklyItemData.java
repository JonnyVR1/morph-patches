package com.p046p1.mobile.putong.core.businessdata.meet;

import androidx.annotation.DrawableRes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MeetFeedSvipWeeklyItemData extends AbsMeetListData {
    public String subTitle;
    public List<SvipWeeklyItem> svipWeeklyItems;
    public String title;

    public static class SvipWeeklyItem {

        @DrawableRes
        public int iconRes;
        public String itemType;
        public String lable;
        public String numberValue;
        public String otherUserId;
        public int svipWeeklyItemRenderType;
        public String userImgUrl;
        public String userName;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SvipWeeklyItemRenderType {
        public static final int TYPE_NUMBER_ICON = 1;
        public static final int TYPE_USER = 2;
    }
}
