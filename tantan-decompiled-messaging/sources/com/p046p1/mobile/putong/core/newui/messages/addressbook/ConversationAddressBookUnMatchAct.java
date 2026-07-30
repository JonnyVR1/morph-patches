package com.p046p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.r46;
import p149l.w46;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookUnMatchAct extends PutongCoreMvpAct<r46, w46> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m41883Z1(Context context) {
        return new Intent(context, (Class<?>) ConversationAddressBookUnMatchAct.class);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public r46 mo29951X1() {
        return new r46(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public w46 mo29952Y1() {
        return new w46(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_contacts_unmatch_list";
    }
}
