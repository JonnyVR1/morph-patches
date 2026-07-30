package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Context;
import android.content.Intent;
import com.p003p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.data.InactivateReason;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import l.cwf0;
import l.j760;
import l.vwb;
import p007l.C0499bq;
import p007l.C0684rp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AccountInactiveAct extends PutongMvpAct<C0684rp, C0499bq> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y1 */
    public static Intent m8439Y1(Act act, int i) {
        Intent intent = new Intent((Context) act, (Class<?>) AccountInactiveAct.class);
        intent.putExtra("page_type", i);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z1 */
    public static Intent m8440Z1(Act act, int i, InactivateReason inactivateReason) {
        Intent intent = new Intent((Context) act, (Class<?>) AccountInactiveAct.class);
        intent.putExtra("InactivateReason", (Serializable) inactivateReason);
        intent.putExtra("page_type", i);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public C0684rp m8441V1() {
        return new C0684rp(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public C0499bq m8442X1() {
        return new C0499bq(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        hideInput();
        super/*com.p1.mobile.android.app.Act*/.lambda$debugItems$19();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Multi-variable type inference failed */
    public void initPageHelper() {
        String str;
        ((PutongAct) this).pageHelper = new cwf0(this);
        if ("p_delete_account_edit_reason".equals(pageId()) || "p_delete_account_specific_reason".equals(pageId())) {
            Intent intent = getIntent();
            if (NullChecker.a(intent)) {
                InactivateReason serializableExtra = intent.getSerializableExtra("InactivateReason");
                if (NullChecker.a(serializableExtra)) {
                    str = serializableExtra.name;
                } else {
                    str = "";
                }
            } else {
                str = "";
            }
            ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("delete_account_reason_category", str)});
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pageId() {
        Intent intent = getIntent();
        if (!NullChecker.a(intent) || intent.getIntExtra("page_type", 0) == 0) {
            return "p_delete_account_reason";
        }
        return "category_custom".equals(act().getIntent().getSerializableExtra("InactivateReason").key) ? "p_delete_account_edit_reason" : "p_delete_account_specific_reason";
    }
}
