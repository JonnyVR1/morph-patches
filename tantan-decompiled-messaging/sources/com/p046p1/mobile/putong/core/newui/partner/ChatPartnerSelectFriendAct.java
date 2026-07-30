package com.p046p1.mobile.putong.core.newui.partner;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.p046p1.mobile.putong.core.data.ChatPartners;
import com.p046p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p149l.j05;
import p149l.j760;
import p149l.s05;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes11.dex */
public class ChatPartnerSelectFriendAct extends PutongMvpAct<j05, s05> {
    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ ChatPartnerHistoryData m43105Y1(User user) {
        ChatPartnerHistoryData chatPartnerHistoryDataNew_ = ChatPartnerHistoryData.new_();
        chatPartnerHistoryDataNew_.f20368id = user.f56011id;
        chatPartnerHistoryDataNew_.name = user.name;
        chatPartnerHistoryDataNew_.avatarUrl = user.m60124fp().profileMiddle().formatted();
        return chatPartnerHistoryDataNew_;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m43106Z1(Act act, ChatPartners chatPartners, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) ChatPartnerSelectFriendAct.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(vwb.m200303Q(chatPartners.users, new w9j() { // from class: l.h05
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ChatPartnerSelectFriendAct.m43105Y1((User) obj);
            }
        }));
        intent.putExtra("param_users", arrayList);
        intent.putExtra("param_from", str2);
        intent.putExtra("param_text_id", str);
        intent.putExtra("from", str2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public j05 mo28672V1() {
        return new j05(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public s05 mo28673X1() {
        return new s05(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.pageHelper.m109041q("p_chatting_partner_signal_result");
        this.pageHelper.m109040p(j760.m140076a("receive_number", Integer.valueOf(((j05) this.f17172c).m139126f0().size())));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_chatting_partner_signal_result";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        PutongAct.setLightStatusBar(act().getWindow(), 1024);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
