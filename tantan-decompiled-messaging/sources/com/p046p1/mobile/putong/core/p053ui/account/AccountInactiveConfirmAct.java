package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.C16665eq;
import p149l.C20009sq;
import p149l.cwf0;
import p149l.vwb;

/* JADX INFO: loaded from: classes8.dex */
public class AccountInactiveConfirmAct extends PutongMvpAct<C16665eq, C20009sq> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m44105Y1(Act act, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(act, (Class<?>) AccountInactiveConfirmAct.class);
        intent.putExtra("InactivateCategoryKey", str);
        intent.putExtra("InactivateReasonKey", str2);
        intent.putExtra("InactivateReasonValue", str3);
        intent.putExtra("InactivateContent", str4);
        return intent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: Z1 */
    public String m44106Z1(String str) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2049471274:
                if (str.equals("reason_finded_partner_in_true_life")) {
                    b = 0;
                }
                break;
            case -2014436233:
                if (str.equals("reason_got_no_message")) {
                    b = 1;
                }
                break;
            case -1931307249:
                if (str.equals("reason_no_network_frequently")) {
                    b = 2;
                }
                break;
            case -1902698293:
                if (str.equals("reason_account_banned")) {
                    b = 3;
                }
                break;
            case -1709215591:
                if (str.equals("reason_finded_partner_in_other_platform")) {
                    b = 4;
                }
                break;
            case -1573551128:
                if (str.equals("reason_too_much_bug")) {
                    b = 5;
                }
                break;
            case -1534549556:
                if (str.equals("reason_custom")) {
                    b = 6;
                }
                break;
            case -785974473:
                if (str.equals("reason_finded_partner_in_tantan")) {
                    b = 7;
                }
                break;
            case -528945376:
                if (str.equals("reason_matches_disapear")) {
                    b = 8;
                }
                break;
            case -302618129:
                if (str.equals("reason_match_fraud")) {
                    b = 9;
                }
                break;
            case -208858259:
                if (str.equals("reason_reregister_or_change_phone")) {
                    b = 10;
                }
                break;
            case 3625194:
                if (str.equals("reason_no_suggested_person_nearby")) {
                    b = 11;
                }
                break;
            case 44229066:
                if (str.equals("reason_got_person_abuse")) {
                    b = 12;
                }
                break;
            case 370315917:
                if (str.equals("reason_want_back_to_true_life")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 492796074:
                if (str.equals("reason_no_person_i_like_nearby")) {
                    b = 14;
                }
                break;
            case 663706165:
                if (str.equals("reason_got_no_match")) {
                    b = 15;
                }
                break;
            case 879556053:
                if (str.equals("reason_use_too_much_memory")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 1177855695:
                if (str.equals("reason_not_want_seen_by_acquaintance")) {
                    b = 17;
                }
                break;
            case 1231944580:
                if (str.equals("reason_picture_embezzled")) {
                    b = 18;
                }
                break;
            case 1410739831:
                if (str.equals("reason_suggested_same_person")) {
                    b = 19;
                }
                break;
            case 1455672063:
                if (str.equals("reason_hang_seriously")) {
                    b = 20;
                }
                break;
            case 1539602702:
                if (str.equals("reason_crash_frequently")) {
                    b = 21;
                }
                break;
            case 1689165110:
                if (str.equals("reason_got_harass")) {
                    b = 22;
                }
                break;
            case 1700149074:
                if (str.equals("reason_no_people_can_talk_to")) {
                    b = 23;
                }
                break;
        }
        switch (b) {
            case 0:
            case 4:
            case 7:
            case 13:
                return "find_someone";
            case 1:
            case 14:
            case 15:
            case 23:
                return "no_match_and_like";
            case 2:
            case 5:
            case 16:
            case 20:
            case 21:
                return "product_problems";
            case 3:
            case 8:
            case 11:
            case 19:
                return "unusual_activities";
            case 6:
                return LiveRegionTag.others;
            case 9:
            case 12:
            case 18:
            case 22:
                return "privacy_report";
            case 10:
                return "switch_number";
            case 17:
                return "privacy_friends";
            default:
                return "";
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public C16665eq mo28672V1() {
        return new C16665eq(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public C20009sq mo28673X1() {
        return new C20009sq(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        cwf0 cwf0Var = new cwf0(this);
        this.pageHelper = cwf0Var;
        cwf0Var.m109040p(vwb.m200311Y("delete_account_reason_block_page", m44106Z1(getIntent().getStringExtra("InactivateReasonKey"))));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_delete_account_block";
    }
}
