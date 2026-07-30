package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.OptiMVParams;
import com.p051p1.mobile.putong.core.data.SeeSwitchName;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes11.dex */
public class yk30 implements w1m {

    /* JADX INFO: renamed from: a */
    public static final DecimalFormat f200370a = new DecimalFormat("##");

    @Override // p153l.w1m
    /* JADX INFO: renamed from: a */
    public void mo204451a(OptiMVParams optiMVParams) {
        if (TextUtils.isEmpty(optiMVParams.chat_guide)) {
            optiMVParams.chat_guide = "";
        }
        sfj0.m185601h("e_messages_view_match", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("create_time", f200370a.format(optiMVParams.createTime)), sfj0.C20032a.m185615h("is_online", optiMVParams.isOnline), sfj0.C20032a.m185615h("new_match_rank", optiMVParams.newMatchRank), sfj0.C20032a.m185615h("moments_user_id", optiMVParams.momentsUserId), sfj0.C20032a.m185615h("operation_id", ""), sfj0.C20032a.m185615h("is_new_moment", optiMVParams.isNewMoment), sfj0.C20032a.m185615h("new_msg_page_module", optiMVParams.newMsgPageModule), sfj0.C20032a.m185615h("is_onlive_anchor", optiMVParams.isOnliveAnchor), sfj0.C20032a.m185615h("is_red_dot", optiMVParams.isRedDot), sfj0.C20032a.m185615h("other_uid", optiMVParams.otherUid), sfj0.C20032a.m185615h("red_dot_num", optiMVParams.redDotNum), sfj0.C20032a.m185616i("is_fake", optiMVParams.is_fake), sfj0.C20032a.m185615h("messagec_cell_type", optiMVParams.messagecCellType), sfj0.C20032a.m185615h(DetectCategoryType.user_tag, optiMVParams.user_tag), sfj0.C20032a.m185615h("pairing_type", optiMVParams.pairing_type), sfj0.C20032a.m185615h(SeeSwitchName.message_tab, optiMVParams.messageTab), sfj0.C20032a.m185615h("equipment_type", optiMVParams.equipment_type), sfj0.C20032a.m185615h("day_number", optiMVParams.day_number), sfj0.C20032a.m185615h("chat_guide", optiMVParams.chat_guide), sfj0.C20032a.m185616i("chat_game_show", optiMVParams.chat_game_show), sfj0.C20032a.m185615h(MessageType.love_letter, optiMVParams.love_letter), sfj0.C20032a.m185615h("is_platinum_top_chat", optiMVParams.is_platinum_top_chat ? "yes" : "no"), sfj0.C20032a.m185615h("guide_type", optiMVParams.guide_type), sfj0.C20032a.m185613f("spark_level", optiMVParams.spark_level), sfj0.C20032a.m185613f("message_pairs", optiMVParams.message_pairs), sfj0.C20032a.m185613f("is_close_friend", optiMVParams.is_close_friend), sfj0.C20032a.m185613f("is_top_recommend", optiMVParams.is_top_recommend));
    }
}
