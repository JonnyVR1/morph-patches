package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.data.OptiMVParams;
import java.text.DecimalFormat;
import l.o6j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kc30 implements bzl {

    /* JADX INFO: renamed from: a */
    public static final DecimalFormat f15599a = new DecimalFormat("##");

    @Override // p009l.bzl
    /* JADX INFO: renamed from: a */
    public void mo12325a(OptiMVParams optiMVParams) {
        if (TextUtils.isEmpty(optiMVParams.chat_guide)) {
            optiMVParams.chat_guide = "";
        }
        o6j0.h("e_messages_view_match", "p_messages_view", new o6j0.a[]{o6j0.a.h("create_time", f15599a.format(optiMVParams.createTime)), o6j0.a.h("is_online", optiMVParams.isOnline), o6j0.a.h("new_match_rank", optiMVParams.newMatchRank), o6j0.a.h("moments_user_id", optiMVParams.momentsUserId), o6j0.a.h("operation_id", ""), o6j0.a.h("is_new_moment", optiMVParams.isNewMoment), o6j0.a.h("new_msg_page_module", optiMVParams.newMsgPageModule), o6j0.a.h("is_onlive_anchor", optiMVParams.isOnliveAnchor), o6j0.a.h("is_red_dot", optiMVParams.isRedDot), o6j0.a.h("other_uid", optiMVParams.otherUid), o6j0.a.h("red_dot_num", optiMVParams.redDotNum), o6j0.a.i("is_fake", optiMVParams.is_fake), o6j0.a.h("messagec_cell_type", optiMVParams.messagecCellType), o6j0.a.h("user_tag", optiMVParams.user_tag), o6j0.a.h("pairing_type", optiMVParams.pairing_type), o6j0.a.h("message_tab", optiMVParams.messageTab), o6j0.a.h("equipment_type", optiMVParams.equipment_type), o6j0.a.h("day_number", optiMVParams.day_number), o6j0.a.h("chat_guide", optiMVParams.chat_guide), o6j0.a.i("chat_game_show", optiMVParams.chat_game_show), o6j0.a.h("love_letter", optiMVParams.love_letter), o6j0.a.h("is_platinum_top_chat", optiMVParams.is_platinum_top_chat ? "yes" : "no"), o6j0.a.h("guide_type", optiMVParams.guide_type), o6j0.a.f("spark_level", optiMVParams.spark_level), o6j0.a.f("message_pairs", optiMVParams.message_pairs), o6j0.a.f("is_close_friend", optiMVParams.is_close_friend), o6j0.a.f("is_top_recommend", optiMVParams.is_top_recommend)});
    }
}
