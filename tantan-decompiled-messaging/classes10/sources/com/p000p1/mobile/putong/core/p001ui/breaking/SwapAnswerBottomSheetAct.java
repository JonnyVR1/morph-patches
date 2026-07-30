package com.p000p1.mobile.putong.core.p001ui.breaking;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.IceBreakingQA;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageAdditionalData;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.data.Sticker;
import com.p000p1.mobile.putong.core.p001ui.breaking.SwapAnswerBottomSheetAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.List;
import l.e30;
import l.e51;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.soe;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.a1c0;
import p003l.c3c0;
import p003l.f7h0;
import p003l.szb0;
import p003l.y19;
import v.VEditText;
import v.VFrame;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SwapAnswerBottomSheetAct extends ProfileLikeBaseAct {

    /* JADX INFO: renamed from: d */
    public VFrame f1033d;

    /* JADX INFO: renamed from: e */
    public View f1034e;

    /* JADX INFO: renamed from: f */
    public VLinear f1035f;

    /* JADX INFO: renamed from: g */
    public VImage f1036g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f1037h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f1038i;

    /* JADX INFO: renamed from: j */
    public VLinear f1039j;

    /* JADX INFO: renamed from: k */
    public VImage f1040k;

    /* JADX INFO: renamed from: l */
    public VText_Bold f1041l;

    /* JADX INFO: renamed from: m */
    public VEditText f1042m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f1043n;

    /* JADX INFO: renamed from: o */
    public String f1044o;

    /* JADX INFO: renamed from: p */
    public String f1045p;

    /* JADX INFO: renamed from: q */
    public String f1046q;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m1746A2(View view) {
        String str;
        List<String> listM11080D = y19.m11080D();
        if (listM11080D.size() <= 1) {
            return;
        }
        if (new HashSet(listM11080D).size() == 1 && listM11080D.get(0).equals(this.f1046q)) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        do {
            str = listM11080D.get(secureRandom.nextInt(listM11080D.size()));
        } while (str.equals(this.f1046q));
        this.f1046q = str;
        this.f1038i.setText(str);
        zvf0.u("e_change_one", pageId(), new j760[]{j760.a("answer_write", this.f1046q)});
    }

    /* JADX INFO: renamed from: C2 */
    public static void m1747C2(@NonNull Act act, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        Intent intent = new Intent((Context) act, (Class<?>) SwapAnswerBottomSheetAct.class);
        intent.putExtra("userId", str);
        intent.putExtra("msgId", str2);
        intent.putExtra("question", str3);
        act.startActivityForResult(intent, 10111);
        act.overridePendingTransition(szb0.f7494e, 0);
    }

    /* JADX INFO: renamed from: D2 */
    public static void m1748D2(@NonNull Act act, @NonNull String str, @Nullable String str2) {
        Intent intent = new Intent((Context) act, (Class<?>) SwapAnswerBottomSheetAct.class);
        intent.putExtra("userId", str);
        intent.putExtra("question", str2);
        act.startActivityForResult(intent, 10111);
        act.overridePendingTransition(szb0.f7494e, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m1749d2(Bundle bundle) {
        m1754r();
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m1753q2(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m1754r() {
        if (TextUtils.isEmpty(this.f1046q) && vwb.J(y19.m11080D())) {
            m1726h2();
            return;
        }
        e51.H(this, new Runnable() { // from class: l.z6h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9193a.m1758w2();
            }
        }, 200L);
        this.f1038i.setText(this.f1046q);
        xdl0.M(this.f1039j, TextUtils.isEmpty(this.f1045p));
        xdl0.E0(this.f1036g, new View.OnClickListener() { // from class: l.a7h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2740a.m1759y2(view);
            }
        });
        xdl0.E0(this.f1043n, new View.OnClickListener() { // from class: l.b7h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3336a.m1760z2(view);
            }
        });
        xdl0.E0(this.f1039j, new View.OnClickListener() { // from class: l.c7h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3982a.m1746A2(view);
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ void m1755r2(Message message) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m1758w2() {
        SVGALoader.with(((Act) this).act).from("https://fe-static.tancdn.com/v1/raw/5266f729-e0ff-4677-96f9-09373278f58214.svga").autoPlay(true).repeatCount(1).into(this.f1037h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m1759y2(View view) {
        m1726h2();
        zvf0.r("e_close_click", pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m1760z2(View view) {
        String strTrim = this.f1042m.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            lsi0.y("不能发送空白信息");
        } else {
            m1761B2(this.f1044o, this.f1046q, strTrim, this.f1045p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B2 */
    public final void m1761B2(String str, String str2, String str3, String str4) {
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
        CoreModule.c.f0.Dn(str, messageNew_, (Sticker) null).subscribe(mkd0.H(new e30() { // from class: l.d7h0
            public final void call(Object obj) {
                SwapAnswerBottomSheetAct.m1755r2((Message) obj);
            }
        }, new e30() { // from class: l.e7h0
            public final void call(Object obj) {
                SwapAnswerBottomSheetAct.m1753q2((Throwable) obj);
            }
        }));
        zvf0.u("e_sent_answer", pageId(), new j760[]{j760.a("to_uid", this.f1044o), j760.a("answer_write", this.f1046q)});
        setResult(-1);
        m1726h2();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: i2 */
    public View mo1727i2() {
        return this.f1034e;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM1762v2 = m1762v2(layoutInflater, viewGroup);
        if (ura.e().d().I4()) {
            this.f1041l.setTextColor(getResources().getColor(a1c0.f2701i));
            xdl0.N(this.f1040k, c3c0.f3557F7);
            this.f1042m.setTextColor(getResources().getColor(a1c0.f2699g));
            this.f1042m.setHintTextColor(getResources().getColor(a1c0.f2701i));
            soe.a(this.f1042m);
            this.f1043n.setTextColor(getResources().getColor(a1c0.f2702j));
            xdl0.N(this.f1036g, c3c0.f3845m7);
        }
        return viewM1762v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct
    public void initDataOnCreate() {
        this.f1044o = getIntent().getStringExtra("userId");
        this.f1045p = getIntent().getStringExtra("msgId");
        String stringExtra = getIntent().getStringExtra("question");
        this.f1046q = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            List<String> listM11080D = y19.m11080D();
            this.f1046q = listM11080D.get(new SecureRandom().nextInt(listM11080D.size()));
        }
        super.initDataOnCreate();
        creates(new e30() { // from class: l.y6h0
            public final void call(Object obj) {
                this.f9000a.m1749d2((Bundle) obj);
            }
        });
    }

    public void initPageHelper() {
        super.initPageHelper();
        ((PutongAct) this).pageHelper.p(new j760[]{j760.a("answer_write", this.f1046q)});
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: k2 */
    public ViewGroup mo1728k2() {
        return this.f1035f;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: l2 */
    public EditText mo1729l2() {
        return this.f1042m;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: m2 */
    public ViewGroup mo1730m2() {
        return this.f1033d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pageId() {
        return !TextUtils.isEmpty(getIntent().getStringExtra("msgId")) ? "p_exchange_answer_question_pop" : "p_exchange_answer_pop";
    }

    /* JADX INFO: renamed from: v2 */
    public View m1762v2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f7h0.m6457b(this, layoutInflater, viewGroup);
    }
}
