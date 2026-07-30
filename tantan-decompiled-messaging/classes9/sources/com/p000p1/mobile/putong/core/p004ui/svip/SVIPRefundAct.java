package com.p000p1.mobile.putong.core.p004ui.svip;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import l.hmb;
import l.k7c0;
import l.z4c0;
import p006l.cnd0;
import p006l.hnd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SVIPRefundAct extends PutongMvpAct<cnd0, hnd0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m9227Z1(Context context) {
        return new Intent(context, (Class<?>) SVIPRefundAct.class);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public cnd0 mo571V1() {
        return new cnd0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public hnd0 mo572X1() {
        return new hnd0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ boolean m9230c2(MenuItem menuItem) {
        String strM16253l = ((hnd0) this.f1162d).m16253l();
        if (TextUtils.isEmpty(strM16253l)) {
            return true;
        }
        startActivity(WithdrawRecordsAct.m9235Y1(this, strM16253l));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(k7c0.b, menu);
        MenuItem menuItemFindItem = menu.findItem(z4c0.s0);
        menuItemFindItem.setShowAsAction(2);
        menuItemFindItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.pmd0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f19198a.m9230c2(menuItem);
            }
        });
        hmb.x1(act());
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }
}
