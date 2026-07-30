package com.p000p1.mobile.putong.core.newui.partner;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.p1.mobile.putong.core.data.ChatPartners;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.j760;
import l.vwb;
import l.w9j;
import p009l.j05;
import p009l.s05;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ChatPartnerSelectFriendAct extends PutongMvpAct<j05, s05> {
    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ ChatPartnerHistoryData m7313Y1(User user) {
        ChatPartnerHistoryData chatPartnerHistoryDataNew_ = ChatPartnerHistoryData.new_();
        chatPartnerHistoryDataNew_.id = ((DbObject) user).id;
        chatPartnerHistoryDataNew_.name = user.name;
        chatPartnerHistoryDataNew_.avatarUrl = user.fp().profileMiddle().formatted();
        return chatPartnerHistoryDataNew_;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m7314Z1(Act act, ChatPartners chatPartners, String str, String str2) {
        Intent intent = new Intent((Context) act, (Class<?>) ChatPartnerSelectFriendAct.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(vwb.Q(chatPartners.users, new w9j() { // from class: l.h05
            public final Object call(Object obj) {
                return ChatPartnerSelectFriendAct.m7313Y1((User) obj);
            }
        }));
        intent.putExtra("param_users", arrayList);
        intent.putExtra("param_from", str2);
        intent.putExtra("param_text_id", str);
        intent.putExtra("from", str2);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public j05 m7315V1() {
        return new j05(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public s05 m7316X1() {
        return new s05(this);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((PutongAct) this).pageHelper.q("p_chatting_partner_signal_result");
        ((PutongAct) this).pageHelper.p(new j760[]{j760.a("receive_number", Integer.valueOf(((j05) ((PutongMvpAct) this).c).m16816f0().size()))});
    }

    public String pageId() {
        return "p_chatting_partner_signal_result";
    }

    public void setTransparentStatusBar() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTransparentStatusBar();
        PutongAct.setLightStatusBar(act().getWindow(), 1024);
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
