package com.p046p1.mobile.putong.core.p053ui.svip;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.cnd0;
import p149l.hmb;
import p149l.hnd0;
import p149l.k7c0;
import p149l.z4c0;

/* JADX INFO: loaded from: classes9.dex */
public class SVIPRefundAct extends PutongMvpAct<cnd0, hnd0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m55829Z1(Context context) {
        return new Intent(context, (Class<?>) SVIPRefundAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public cnd0 mo28672V1() {
        return new cnd0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public hnd0 mo28673X1() {
        return new hnd0(this);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ boolean m55832c2(MenuItem menuItem) {
        String strM131899l = ((hnd0) this.f17173d).m131899l();
        if (TextUtils.isEmpty(strM131899l)) {
            return true;
        }
        startActivity(WithdrawRecordsAct.m55837Y1(this, strM131899l));
        return true;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(k7c0.f121569b, menu);
        MenuItem menuItemFindItem = menu.findItem(z4c0.f201563s0);
        menuItemFindItem.setShowAsAction(2);
        menuItemFindItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.pmd0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f150205a.m55832c2(menuItem);
            }
        });
        hmb.m131719x1(act());
        return super.onCreateOptionsMenu(menu);
    }
}
