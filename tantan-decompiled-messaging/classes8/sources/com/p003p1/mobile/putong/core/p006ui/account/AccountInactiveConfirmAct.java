package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Context;
import android.content.Intent;
import com.p003p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.cwf0;
import l.j760;
import l.vwb;
import p007l.C0532eq;
import p007l.C0697sq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AccountInactiveConfirmAct extends PutongMvpAct<C0532eq, C0697sq> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y1 */
    public static Intent m8445Y1(Act act, String str, String str2, String str3, String str4) {
        Intent intent = new Intent((Context) act, (Class<?>) AccountInactiveConfirmAct.class);
        intent.putExtra("InactivateCategoryKey", str);
        intent.putExtra("InactivateReasonKey", str2);
        intent.putExtra("InactivateReasonValue", str3);
        intent.putExtra("InactivateContent", str4);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public String m8448Z1(String str) {
        str.getClass();
        switch (str) {
            case "reason_finded_partner_in_true_life":
            case "reason_finded_partner_in_other_platform":
            case "reason_finded_partner_in_tantan":
            case "reason_want_back_to_true_life":
                return "find_someone";
            case "reason_got_no_message":
            case "reason_no_person_i_like_nearby":
            case "reason_got_no_match":
            case "reason_no_people_can_talk_to":
                return "no_match_and_like";
            case "reason_no_network_frequently":
            case "reason_too_much_bug":
            case "reason_use_too_much_memory":
            case "reason_hang_seriously":
            case "reason_crash_frequently":
                return "product_problems";
            case "reason_account_banned":
            case "reason_matches_disapear":
            case "reason_no_suggested_person_nearby":
            case "reason_suggested_same_person":
                return "unusual_activities";
            case "reason_custom":
                return "others";
            case "reason_match_fraud":
            case "reason_got_person_abuse":
            case "reason_picture_embezzled":
            case "reason_got_harass":
                return "privacy_report";
            case "reason_reregister_or_change_phone":
                return "switch_number";
            case "reason_not_want_seen_by_acquaintance":
                return "privacy_friends";
            default:
                return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public C0532eq m8446V1() {
        return new C0532eq(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public C0697sq m8447X1() {
        return new C0697sq(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initPageHelper() {
        cwf0 cwf0Var = new cwf0(this);
        ((PutongAct) this).pageHelper = cwf0Var;
        cwf0Var.p(new j760[]{vwb.Y("delete_account_reason_block_page", m8448Z1(getIntent().getStringExtra("InactivateReasonKey")))});
    }

    public String pageId() {
        return "p_delete_account_block";
    }
}
