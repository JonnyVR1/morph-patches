package com.p046p1.mobile.putong.core.p053ui.breaking;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IceBreakingQA;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.breaking.SwapAnswerBottomSheetAct;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tencent.connect.common.Constants;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.List;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.e51;
import p149l.f7h0;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.soe;
import p149l.szb0;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.y19;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class SwapAnswerBottomSheetAct extends ProfileLikeBaseAct {

    /* JADX INFO: renamed from: d */
    public VFrame f28639d;

    /* JADX INFO: renamed from: e */
    public View f28640e;

    /* JADX INFO: renamed from: f */
    public VLinear f28641f;

    /* JADX INFO: renamed from: g */
    public VImage f28642g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f28643h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f28644i;

    /* JADX INFO: renamed from: j */
    public VLinear f28645j;

    /* JADX INFO: renamed from: k */
    public VImage f28646k;

    /* JADX INFO: renamed from: l */
    public VText_Bold f28647l;

    /* JADX INFO: renamed from: m */
    public VEditText f28648m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f28649n;

    /* JADX INFO: renamed from: o */
    public String f28650o;

    /* JADX INFO: renamed from: p */
    public String f28651p;

    /* JADX INFO: renamed from: q */
    public String f28652q;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m44447A2(View view) {
        String str;
        List<String> listM212144D = y19.m212144D();
        if (listM212144D.size() <= 1) {
            return;
        }
        if (new HashSet(listM212144D).size() == 1 && listM212144D.get(0).equals(this.f28652q)) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        do {
            str = listM212144D.get(secureRandom.nextInt(listM212144D.size()));
        } while (str.equals(this.f28652q));
        this.f28652q = str;
        this.f28644i.setText(str);
        zvf0.m220399u("e_change_one", pageId(), j760.m140076a("answer_write", this.f28652q));
    }

    /* JADX INFO: renamed from: C2 */
    public static void m44448C2(@NonNull Act act, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        Intent intent = new Intent(act, (Class<?>) SwapAnswerBottomSheetAct.class);
        intent.putExtra("userId", str);
        intent.putExtra("msgId", str2);
        intent.putExtra("question", str3);
        act.startActivityForResult(intent, Constants.REQUEST_JOIN_GROUP);
        act.overridePendingTransition(szb0.f167030e, 0);
    }

    /* JADX INFO: renamed from: D2 */
    public static void m44449D2(@NonNull Act act, @NonNull String str, @Nullable String str2) {
        Intent intent = new Intent(act, (Class<?>) SwapAnswerBottomSheetAct.class);
        intent.putExtra("userId", str);
        intent.putExtra("question", str2);
        act.startActivityForResult(intent, Constants.REQUEST_JOIN_GROUP);
        act.overridePendingTransition(szb0.f167030e, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m44450d2(Bundle bundle) {
        m44455r();
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m44454q2(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    private void m44455r() {
        if (TextUtils.isEmpty(this.f28652q) && vwb.m200296J(y19.m212144D())) {
            m44427h2();
            return;
        }
        e51.m114743H(this, new Runnable() { // from class: l.z6h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f201924a.m44459w2();
            }
        }, 200L);
        this.f28644i.setText(this.f28652q);
        xdl0.m208344M(this.f28645j, TextUtils.isEmpty(this.f28651p));
        xdl0.m208329E0(this.f28642g, new View.OnClickListener() { // from class: l.a7h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67929a.m44460y2(view);
            }
        });
        xdl0.m208329E0(this.f28649n, new View.OnClickListener() { // from class: l.b7h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73972a.m44461z2(view);
            }
        });
        xdl0.m208329E0(this.f28645j, new View.OnClickListener() { // from class: l.c7h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79618a.m44447A2(view);
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ void m44456r2(Message message) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m44459w2() {
        SVGALoader.with(this.act).from("https://fe-static.tancdn.com/v1/raw/5266f729-e0ff-4677-96f9-09373278f58214.svga").autoPlay(true).repeatCount(1).into(this.f28643h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m44460y2(View view) {
        m44427h2();
        zvf0.m220396r("e_close_click", pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m44461z2(View view) {
        String strTrim = this.f28648m.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            lsi0.m151595y("不能发送空白信息");
        } else {
            m44462B2(this.f28650o, this.f28652q, strTrim, this.f28651p);
        }
    }

    /* JADX INFO: renamed from: B2 */
    public final void m44462B2(String str, String str2, String str3, String str4) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.icebreak_qa);
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        if (!TextUtils.isEmpty(str2)) {
            messageNew_.additionalData.iceBreakingQA.title = str2;
        }
        messageNew_.additionalData.iceBreakingQA.answer = str3;
        if (!TextUtils.isEmpty(str4)) {
            messageNew_.additionalData.iceBreakingQA.refMsgID = str4;
        }
        CoreModule.f17545c.f19642f0.m32623Dn(str, messageNew_, null).subscribe(mkd0.m154956H(new e30() { // from class: l.d7h0
            @Override // p149l.e30
            public final void call(Object obj) {
                SwapAnswerBottomSheetAct.m44456r2((Message) obj);
            }
        }, new e30() { // from class: l.e7h0
            @Override // p149l.e30
            public final void call(Object obj) {
                SwapAnswerBottomSheetAct.m44454q2((Throwable) obj);
            }
        }));
        zvf0.m220399u("e_sent_answer", pageId(), j760.m140076a("to_uid", this.f28650o), j760.m140076a("answer_write", this.f28652q));
        setResult(-1);
        m44427h2();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: i2 */
    public View mo44428i2() {
        return this.f28640e;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM44463v2 = m44463v2(layoutInflater, viewGroup);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f28647l.setTextColor(getResources().getColor(a1c0.f67155i));
            xdl0.m208346N(this.f28646k, c3c0.f78520F7);
            this.f28648m.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f28648m.setHintTextColor(getResources().getColor(a1c0.f67155i));
            soe.m185291a(this.f28648m);
            this.f28649n.setTextColor(getResources().getColor(a1c0.f67156j));
            xdl0.m208346N(this.f28642g, c3c0.f78808m7);
        }
        return viewM44463v2;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f28650o = getIntent().getStringExtra("userId");
        this.f28651p = getIntent().getStringExtra("msgId");
        String stringExtra = getIntent().getStringExtra("question");
        this.f28652q = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            List<String> listM212144D = y19.m212144D();
            this.f28652q = listM212144D.get(new SecureRandom().nextInt(listM212144D.size()));
        }
        super.initDataOnCreate();
        creates(new e30() { // from class: l.y6h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196561a.m44450d2((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m109040p(j760.m140076a("answer_write", this.f28652q));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: k2 */
    public ViewGroup mo44429k2() {
        return this.f28641f;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: l2 */
    public EditText mo44430l2() {
        return this.f28648m;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: m2 */
    public ViewGroup mo44431m2() {
        return this.f28639d;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return !TextUtils.isEmpty(getIntent().getStringExtra("msgId")) ? "p_exchange_answer_question_pop" : "p_exchange_answer_pop";
    }

    /* JADX INFO: renamed from: v2 */
    public View m44463v2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f7h0.m119807b(this, layoutInflater, viewGroup);
    }
}
