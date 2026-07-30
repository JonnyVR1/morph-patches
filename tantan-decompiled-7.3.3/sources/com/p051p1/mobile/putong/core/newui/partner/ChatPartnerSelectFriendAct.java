package com.p051p1.mobile.putong.core.newui.partner;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.p051p1.mobile.putong.core.data.ChatPartners;
import com.p051p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p153l.i15;
import p153l.jyb;
import p153l.pf60;
import p153l.qcj;
import p153l.r15;

/* JADX INFO: loaded from: classes11.dex */
public class ChatPartnerSelectFriendAct extends PutongMvpAct<i15, r15> {
    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ ChatPartnerHistoryData m44116Z1(User user) {
        ChatPartnerHistoryData chatPartnerHistoryDataNew_ = ChatPartnerHistoryData.new_();
        chatPartnerHistoryDataNew_.f21110id = user.f56859id;
        chatPartnerHistoryDataNew_.name = user.name;
        chatPartnerHistoryDataNew_.avatarUrl = user.m61308fp().profileMiddle().formatted();
        return chatPartnerHistoryDataNew_;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m44117a2(Act act, ChatPartners chatPartners, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) ChatPartnerSelectFriendAct.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(jyb.m147486Q(chatPartners.users, new qcj() { // from class: l.g15
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ChatPartnerSelectFriendAct.m44116Z1((User) obj);
            }
        }));
        intent.putExtra("param_users", arrayList);
        intent.putExtra("param_from", str2);
        intent.putExtra("param_text_id", str);
        intent.putExtra("from", str2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public i15 mo29671X1() {
        return new i15(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public r15 mo29672Y1() {
        return new r15(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.pageHelper.m152782q("p_chatting_partner_signal_result");
        this.pageHelper.m152781p(pf60.m172085a("receive_number", Integer.valueOf(((i15) this.f17891c).m138076f0().size())));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_chatting_partner_signal_result";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        PutongAct.setLightStatusBar(act().getWindow(), 1024);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
