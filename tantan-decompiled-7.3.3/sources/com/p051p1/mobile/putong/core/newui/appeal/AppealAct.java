package com.p051p1.mobile.putong.core.newui.appeal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.data.FaceidLiveData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.SchemeKey;
import java.util.List;
import p153l.jyb;
import p153l.py0;
import p153l.sfj0;
import p153l.wy0;
import p153l.yc2;

/* JADX INFO: loaded from: classes11.dex */
public class AppealAct extends PutongMvpAct<py0, wy0> {

    /* JADX INFO: renamed from: e */
    public String f22017e = "";

    /* JADX INFO: renamed from: Z1 */
    public static Intent m37169Z1(Context context, String str, PhoneNumber phoneNumber, String str2) {
        Intent intent = new Intent(context, (Class<?>) AppealAct.class);
        intent.putExtra("verificationMethod", str);
        intent.putExtra("phoneNumber", phoneNumber);
        intent.putExtra("provider", str2);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m37170a2(Context context, String str, PhoneNumber phoneNumber, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) AppealAct.class);
        intent.putExtra("verificationMethod", str);
        intent.putExtra("phoneNumber", phoneNumber);
        intent.putExtra("provider", str2);
        intent.putExtra("ticketId", str3);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public String m37171b2() {
        if (TextUtils.equals(this.f22017e, SchemeKey.chatAppeal)) {
            return "forbid_chat_appeal";
        }
        return TextUtils.equals(this.f22017e, "content") ? "content_appeal" : "";
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public py0 mo29671X1() {
        return new py0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public wy0 mo29672Y1() {
        return new wy0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        FaceidLiveData faceidLiveDataM215121c = yc2.m215118e().m215121c();
        this.f22017e = getIntent().getStringExtra("verificationMethod");
        ((py0) this.f17891c).m174264k0(faceidLiveDataM215121c, this.f22017e, (PhoneNumber) getIntent().getSerializableExtra("phoneNumber"), getIntent().getStringExtra("provider"), getIntent().getStringExtra("ticketId"));
        this.pageHelper.m152781p(jyb.m147494Y("appeal_type", m37171b2()));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        ((py0) this.f17891c).mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        sfj0.m185596c("e_p_appeal_reason_back", pageId(), sfj0.C20032a.m185615h("appeal_type", m37171b2()));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        ((py0) this.f17891c).m174267o0(list);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_appeal_reason";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }
}
