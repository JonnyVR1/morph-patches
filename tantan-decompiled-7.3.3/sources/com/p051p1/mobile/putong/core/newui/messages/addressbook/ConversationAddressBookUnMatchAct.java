package com.p051p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.b66;
import p153l.w56;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookUnMatchAct extends PutongCoreMvpAct<w56, b66> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m42894a2(Context context) {
        return new Intent(context, (Class<?>) ConversationAddressBookUnMatchAct.class);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public w56 mo30949Y1() {
        return new w56(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public b66 mo30950Z1() {
        return new b66(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_contacts_unmatch_list";
    }
}
