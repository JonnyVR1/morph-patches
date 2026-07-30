package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.OptiMVParams;
import com.p046p1.mobile.putong.core.data.SeeSwitchName;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes11.dex */
public class kc30 implements bzl {

    /* JADX INFO: renamed from: a */
    public static final DecimalFormat f122285a = new DecimalFormat("##");

    @Override // p149l.bzl
    /* JADX INFO: renamed from: a */
    public void mo104624a(OptiMVParams optiMVParams) {
        if (TextUtils.isEmpty(optiMVParams.chat_guide)) {
            optiMVParams.chat_guide = "";
        }
        o6j0.m162864h("e_messages_view_match", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("create_time", f122285a.format(optiMVParams.createTime)), o6j0.C18854a.m162878h("is_online", optiMVParams.isOnline), o6j0.C18854a.m162878h("new_match_rank", optiMVParams.newMatchRank), o6j0.C18854a.m162878h("moments_user_id", optiMVParams.momentsUserId), o6j0.C18854a.m162878h("operation_id", ""), o6j0.C18854a.m162878h("is_new_moment", optiMVParams.isNewMoment), o6j0.C18854a.m162878h("new_msg_page_module", optiMVParams.newMsgPageModule), o6j0.C18854a.m162878h("is_onlive_anchor", optiMVParams.isOnliveAnchor), o6j0.C18854a.m162878h("is_red_dot", optiMVParams.isRedDot), o6j0.C18854a.m162878h("other_uid", optiMVParams.otherUid), o6j0.C18854a.m162878h("red_dot_num", optiMVParams.redDotNum), o6j0.C18854a.m162879i("is_fake", optiMVParams.is_fake), o6j0.C18854a.m162878h("messagec_cell_type", optiMVParams.messagecCellType), o6j0.C18854a.m162878h(DetectCategoryType.user_tag, optiMVParams.user_tag), o6j0.C18854a.m162878h("pairing_type", optiMVParams.pairing_type), o6j0.C18854a.m162878h(SeeSwitchName.message_tab, optiMVParams.messageTab), o6j0.C18854a.m162878h("equipment_type", optiMVParams.equipment_type), o6j0.C18854a.m162878h("day_number", optiMVParams.day_number), o6j0.C18854a.m162878h("chat_guide", optiMVParams.chat_guide), o6j0.C18854a.m162879i("chat_game_show", optiMVParams.chat_game_show), o6j0.C18854a.m162878h(MessageType.love_letter, optiMVParams.love_letter), o6j0.C18854a.m162878h("is_platinum_top_chat", optiMVParams.is_platinum_top_chat ? "yes" : "no"), o6j0.C18854a.m162878h("guide_type", optiMVParams.guide_type), o6j0.C18854a.m162876f("spark_level", optiMVParams.spark_level), o6j0.C18854a.m162876f("message_pairs", optiMVParams.message_pairs), o6j0.C18854a.m162876f("is_close_friend", optiMVParams.is_close_friend), o6j0.C18854a.m162876f("is_top_recommend", optiMVParams.is_top_recommend));
    }
}
