package com.p051p1.mobile.putong.core.p058ui.svip;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.evd0;
import p153l.fdc0;
import p153l.jvd0;
import p153l.ofc0;
import p153l.vnb;

/* JADX INFO: loaded from: classes12.dex */
public class SVIPRefundAct extends PutongMvpAct<evd0, jvd0> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m57012a2(Context context) {
        return new Intent(context, (Class<?>) SVIPRefundAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public evd0 mo29671X1() {
        return new evd0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public jvd0 mo29672Y1() {
        return new jvd0(this);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ boolean m57015d2(MenuItem menuItem) {
        String strM147021l = ((jvd0) this.f17892d).m147021l();
        if (TextUtils.isEmpty(strM147021l)) {
            return true;
        }
        startActivity(WithdrawRecordsAct.m57020Z1(this, strM147021l));
        return true;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(ofc0.f147066b, menu);
        MenuItem menuItemFindItem = menu.findItem(fdc0.f98439s0);
        menuItemFindItem.setShowAsAction(2);
        menuItemFindItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.rud0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f164914a.m57015d2(menuItem);
            }
        });
        vnb.m201964x1(act());
        return super.onCreateOptionsMenu(menu);
    }
}
