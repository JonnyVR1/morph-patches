package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoCoverItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoTitleGradeItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoTitleItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoCheckInItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoSwitchItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoTagsItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoTitleItem;
import p151v.VImage;
import p151v.VScroll;

/* JADX INFO: loaded from: classes4.dex */
public class lip0 {
    /* JADX INFO: renamed from: a */
    public static void m154378a(nhp0 nhp0Var, View view) {
        nhp0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nhp0Var._top_bg = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        nhp0Var._scroll_view = (VScroll) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nhp0Var._switch_container = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        nhp0Var._cover_item = (VirtualRoomInfoCoverItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        nhp0Var._name_item = (VirtualRoomInfoTitleItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        nhp0Var._notice_item = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        nhp0Var._notice_item_root = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        nhp0Var._notice_item_announce_title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        nhp0Var._notice_item_announce_content = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        nhp0Var._hot_item = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        nhp0Var._hot_item_root = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        nhp0Var._hot_item_host_bg = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        nhp0Var._hot_item_iv_hot = (SvgAndImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        nhp0Var._hot_item_hot_title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        nhp0Var._hot_item_hot_desc = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3);
        nhp0Var._hot_item_go_arrow = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(4);
        nhp0Var._hot_item_debugText = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(5);
        nhp0Var._group_category = (VoiceVirtualRoomInfoTitleItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        nhp0Var._group_tags = (VoiceVirtualRoomInfoTagsItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        nhp0Var._check_in_view = (VoiceVirtualRoomInfoCheckInItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        nhp0Var._message_remind = (VoiceVirtualRoomInfoTitleItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        nhp0Var._top_caht_switch = (VoiceVirtualRoomInfoSwitchItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(8);
        nhp0Var._settle_free_switch = (VoiceVirtualRoomInfoSwitchItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(9);
        nhp0Var._call_switch = (VoiceVirtualRoomInfoSwitchItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(10);
        nhp0Var._personal_room_switch = (VoiceVirtualRoomInfoSwitchItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(11);
        nhp0Var._gift_effect_switch = (VoiceVirtualRoomInfoSwitchItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(12);
        nhp0Var._set_room_bg = (VoiceVirtualRoomInfoTitleItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(13);
        nhp0Var._privilege = (VoiceVirtualRoomInfoTitleItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(14);
        nhp0Var._info_item = (VirtualRoomInfoTitleGradeItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        nhp0Var._float_btn = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m154379b(nhp0 nhp0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199067eb, viewGroup, false);
        m154378a(nhp0Var, viewInflate);
        return viewInflate;
    }
}
