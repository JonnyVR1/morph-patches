package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.data.InactivateReason;
import com.tantanapp.common.utils.NullChecker;
import p149l.C15940bq;
import p149l.C19746rp;
import p149l.cwf0;
import p149l.vwb;

/* JADX INFO: loaded from: classes8.dex */
public class AccountInactiveAct extends PutongMvpAct<C19746rp, C15940bq> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m44101Y1(Act act, int i) {
        Intent intent = new Intent(act, (Class<?>) AccountInactiveAct.class);
        intent.putExtra("page_type", i);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m44102Z1(Act act, int i, InactivateReason inactivateReason) {
        Intent intent = new Intent(act, (Class<?>) AccountInactiveAct.class);
        intent.putExtra("InactivateReason", inactivateReason);
        intent.putExtra("page_type", i);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public C19746rp mo28672V1() {
        return new C19746rp(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public C15940bq mo28673X1() {
        return new C15940bq(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        hideInput();
        super.m66873d2();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        String str;
        this.pageHelper = new cwf0(this);
        if ("p_delete_account_edit_reason".equals(pageId()) || "p_delete_account_specific_reason".equals(pageId())) {
            Intent intent = getIntent();
            if (NullChecker.m81303a(intent)) {
                InactivateReason inactivateReason = (InactivateReason) intent.getSerializableExtra("InactivateReason");
                if (NullChecker.m81303a(inactivateReason)) {
                    str = inactivateReason.name;
                } else {
                    str = "";
                }
            } else {
                str = "";
            }
            this.pageHelper.m109040p(vwb.m200311Y("delete_account_reason_category", str));
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            m66873d2();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        Intent intent = getIntent();
        if (!NullChecker.m81303a(intent) || intent.getIntExtra("page_type", 0) == 0) {
            return "p_delete_account_reason";
        }
        return "category_custom".equals(((InactivateReason) act().getIntent().getSerializableExtra("InactivateReason")).key) ? "p_delete_account_edit_reason" : "p_delete_account_specific_reason";
    }
}
