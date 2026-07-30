package com.p000p1.mobile.putong.core.newui.appeal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.data.FaceidLiveData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PhoneNumber;
import java.io.Serializable;
import java.util.List;
import l.j760;
import l.o6j0;
import l.vwb;
import p009l.iy0;
import p009l.py0;
import p009l.rc2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AppealAct extends PutongMvpAct<iy0, py0> {

    /* JADX INFO: renamed from: e */
    public String f53e = "";

    /* JADX INFO: renamed from: Y1 */
    public static Intent m63Y1(Context context, String str, PhoneNumber phoneNumber, String str2) {
        Intent intent = new Intent(context, (Class<?>) AppealAct.class);
        intent.putExtra("verificationMethod", str);
        intent.putExtra("phoneNumber", (Serializable) phoneNumber);
        intent.putExtra("provider", str2);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m64Z1(Context context, String str, PhoneNumber phoneNumber, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) AppealAct.class);
        intent.putExtra("verificationMethod", str);
        intent.putExtra("phoneNumber", (Serializable) phoneNumber);
        intent.putExtra("provider", str2);
        intent.putExtra("ticketId", str3);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public String m67a2() {
        if (TextUtils.equals(this.f53e, "chatAppeal")) {
            return "forbid_chat_appeal";
        }
        return TextUtils.equals(this.f53e, "content") ? "content_appeal" : "";
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public iy0 m65V1() {
        return new iy0(this);
    }

    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public py0 m66X1() {
        return new py0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        FaceidLiveData faceidLiveDataM21495c = rc2.m21492e().m21495c();
        this.f53e = getIntent().getStringExtra("verificationMethod");
        ((iy0) ((PutongMvpAct) this).c).m16797k0(faceidLiveDataM21495c, this.f53e, getIntent().getSerializableExtra("phoneNumber"), getIntent().getStringExtra("provider"), getIntent().getStringExtra("ticketId"));
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("appeal_type", m67a2())});
    }

    public void initSubscription() {
        super.initSubscription();
        ((iy0) ((PutongMvpAct) this).c).m16794a0();
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        o6j0.c("e_p_appeal_reason_back", pageId(), new o6j0.a[]{o6j0.a.h("appeal_type", m67a2())});
    }

    public void onPickImagesResult(List<Media> list) {
        ((iy0) ((PutongMvpAct) this).c).m16800o0(list);
    }

    public String pageId() {
        return "p_appeal_reason";
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setSwipeBackEnable(false);
    }
}
