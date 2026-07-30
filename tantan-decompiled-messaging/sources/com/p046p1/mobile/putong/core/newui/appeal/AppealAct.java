package com.p046p1.mobile.putong.core.newui.appeal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.data.FaceidLiveData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.SchemeKey;
import java.util.List;
import p149l.iy0;
import p149l.o6j0;
import p149l.py0;
import p149l.rc2;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class AppealAct extends PutongMvpAct<iy0, py0> {

    /* JADX INFO: renamed from: e */
    public String f21275e = "";

    /* JADX INFO: renamed from: Y1 */
    public static Intent m36166Y1(Context context, String str, PhoneNumber phoneNumber, String str2) {
        Intent intent = new Intent(context, (Class<?>) AppealAct.class);
        intent.putExtra("verificationMethod", str);
        intent.putExtra("phoneNumber", phoneNumber);
        intent.putExtra("provider", str2);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m36167Z1(Context context, String str, PhoneNumber phoneNumber, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) AppealAct.class);
        intent.putExtra("verificationMethod", str);
        intent.putExtra("phoneNumber", phoneNumber);
        intent.putExtra("provider", str2);
        intent.putExtra("ticketId", str3);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public String m36168a2() {
        if (TextUtils.equals(this.f21275e, SchemeKey.chatAppeal)) {
            return "forbid_chat_appeal";
        }
        return TextUtils.equals(this.f21275e, "content") ? "content_appeal" : "";
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public iy0 mo28672V1() {
        return new iy0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public py0 mo28673X1() {
        return new py0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        FaceidLiveData faceidLiveDataM178726c = rc2.m178723e().m178726c();
        this.f21275e = getIntent().getStringExtra("verificationMethod");
        ((iy0) this.f17172c).m138908k0(faceidLiveDataM178726c, this.f21275e, (PhoneNumber) getIntent().getSerializableExtra("phoneNumber"), getIntent().getStringExtra("provider"), getIntent().getStringExtra("ticketId"));
        this.pageHelper.m109040p(vwb.m200311Y("appeal_type", m36168a2()));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        ((iy0) this.f17172c).mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        o6j0.m162859c("e_p_appeal_reason_back", pageId(), o6j0.C18854a.m162878h("appeal_type", m36168a2()));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        ((iy0) this.f17172c).m138911o0(list);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_appeal_reason";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }
}
