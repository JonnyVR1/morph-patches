package com.p000p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p009l.r46;
import p009l.w46;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationAddressBookUnMatchAct extends PutongCoreMvpAct<r46, w46> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m6017Z1(Context context) {
        return new Intent(context, (Class<?>) ConversationAddressBookUnMatchAct.class);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public r46 m6018X1() {
        return new r46(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public w46 m6019Y1() {
        return new w46(this);
    }

    public String pageId() {
        return "p_contacts_unmatch_list";
    }
}
