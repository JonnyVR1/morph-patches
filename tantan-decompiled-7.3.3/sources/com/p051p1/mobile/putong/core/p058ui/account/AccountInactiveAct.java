package com.p051p1.mobile.putong.core.p058ui.account;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.data.InactivateReason;
import com.tantanapp.common.utils.NullChecker;
import p153l.C18666mp;
import p153l.C21159wp;
import p153l.jyb;
import p153l.l4g0;

/* JADX INFO: loaded from: classes6.dex */
public class AccountInactiveAct extends PutongMvpAct<C18666mp, C21159wp> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m45284Z1(Act act, int i) {
        Intent intent = new Intent(act, (Class<?>) AccountInactiveAct.class);
        intent.putExtra("page_type", i);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m45285a2(Act act, int i, InactivateReason inactivateReason) {
        Intent intent = new Intent(act, (Class<?>) AccountInactiveAct.class);
        intent.putExtra("InactivateReason", inactivateReason);
        intent.putExtra("page_type", i);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public C18666mp mo29671X1() {
        return new C18666mp(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public C21159wp mo29672Y1() {
        return new C21159wp(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        hideInput();
        super.m68056e2();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        String str;
        this.pageHelper = new l4g0(this);
        if ("p_delete_account_edit_reason".equals(pageId()) || "p_delete_account_specific_reason".equals(pageId())) {
            Intent intent = getIntent();
            if (NullChecker.m82486a(intent)) {
                InactivateReason inactivateReason = (InactivateReason) intent.getSerializableExtra("InactivateReason");
                if (NullChecker.m82486a(inactivateReason)) {
                    str = inactivateReason.name;
                } else {
                    str = "";
                }
            } else {
                str = "";
            }
            this.pageHelper.m152781p(jyb.m147494Y("delete_account_reason_category", str));
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            m68056e2();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        Intent intent = getIntent();
        if (!NullChecker.m82486a(intent) || intent.getIntExtra("page_type", 0) == 0) {
            return "p_delete_account_reason";
        }
        return "category_custom".equals(((InactivateReason) act().getIntent().getSerializableExtra("InactivateReason")).key) ? "p_delete_account_edit_reason" : "p_delete_account_specific_reason";
    }
}
