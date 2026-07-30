package com.p051p1.mobile.putong.core.p058ui.breaking;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IceBreakingQA;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.breaking.SwapAnswerBottomSheetAct;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tencent.connect.common.Constants;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.List;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.h39;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.nfh0;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.wpe;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes9.dex */
public class SwapAnswerBottomSheetAct extends ProfileLikeBaseAct {

    /* JADX INFO: renamed from: d */
    public VFrame f29487d;

    /* JADX INFO: renamed from: e */
    public View f29488e;

    /* JADX INFO: renamed from: f */
    public VLinear f29489f;

    /* JADX INFO: renamed from: g */
    public VImage f29490g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f29491h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f29492i;

    /* JADX INFO: renamed from: j */
    public VLinear f29493j;

    /* JADX INFO: renamed from: k */
    public VImage f29494k;

    /* JADX INFO: renamed from: l */
    public VText_Bold f29495l;

    /* JADX INFO: renamed from: m */
    public VEditText f29496m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f29497n;

    /* JADX INFO: renamed from: o */
    public String f29498o;

    /* JADX INFO: renamed from: p */
    public String f29499p;

    /* JADX INFO: renamed from: q */
    public String f29500q;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m45630A2(View view) {
        String strTrim = this.f29496m.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            o1j0.m165651y("不能发送空白信息");
        } else {
            m45645C2(this.f29498o, this.f29500q, strTrim, this.f29499p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m45631B2(View view) {
        String str;
        List<String> listM133415D = h39.m133415D();
        if (listM133415D.size() <= 1) {
            return;
        }
        if (new HashSet(listM133415D).size() == 1 && listM133415D.get(0).equals(this.f29500q)) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        do {
            str = listM133415D.get(secureRandom.nextInt(listM133415D.size()));
        } while (str.equals(this.f29500q));
        this.f29500q = str;
        this.f29492i.setText(str);
        i4g0.m138523u("e_change_one", pageId(), pf60.m172085a("answer_write", this.f29500q));
    }

    /* JADX INFO: renamed from: D2 */
    public static void m45632D2(@NonNull Act act, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        Intent intent = new Intent(act, (Class<?>) SwapAnswerBottomSheetAct.class);
        intent.putExtra("userId", str);
        intent.putExtra("msgId", str2);
        intent.putExtra("question", str3);
        act.startActivityForResult(intent, Constants.REQUEST_JOIN_GROUP);
        act.overridePendingTransition(y7c0.f197767e, 0);
    }

    /* JADX INFO: renamed from: E2 */
    public static void m45633E2(@NonNull Act act, @NonNull String str, @Nullable String str2) {
        Intent intent = new Intent(act, (Class<?>) SwapAnswerBottomSheetAct.class);
        intent.putExtra("userId", str);
        intent.putExtra("question", str2);
        act.startActivityForResult(intent, Constants.REQUEST_JOIN_GROUP);
        act.overridePendingTransition(y7c0.f197767e, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m45634e2(Bundle bundle) {
        m45638r();
    }

    /* JADX INFO: renamed from: r */
    private void m45638r() {
        if (TextUtils.isEmpty(this.f29500q) && jyb.m147479J(h39.m133415D())) {
            m45610i2();
            return;
        }
        l51.m152888H(this, new Runnable() { // from class: l.hfh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f109296a.m45643y2();
            }
        }, 200L);
        this.f29492i.setText(this.f29500q);
        bnl0.m105524M(this.f29493j, TextUtils.isEmpty(this.f29499p));
        bnl0.m105509E0(this.f29490g, new View.OnClickListener() { // from class: l.ifh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114665a.m45644z2(view);
            }
        });
        bnl0.m105509E0(this.f29497n, new View.OnClickListener() { // from class: l.jfh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120588a.m45630A2(view);
            }
        });
        bnl0.m105509E0(this.f29493j, new View.OnClickListener() { // from class: l.kfh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126397a.m45631B2(view);
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ void m45639r2(Throwable th) {
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m45640s2(Message message) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m45643y2() {
        SVGALoader.with(this.act).from("https://fe-static.tancdn.com/v1/raw/5266f729-e0ff-4677-96f9-09373278f58214.svga").autoPlay(true).repeatCount(1).into(this.f29491h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m45644z2(View view) {
        m45610i2();
        i4g0.m138520r("e_close_click", pageId());
    }

    /* JADX INFO: renamed from: C2 */
    public final void m45645C2(String str, String str2, String str3, String str4) {
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
        CoreModule.f18264c.f20384f0.m33626Dn(str, messageNew_, null).subscribe(psd0.m173597H(new y20() { // from class: l.lfh0
            @Override // p153l.y20
            public final void call(Object obj) {
                SwapAnswerBottomSheetAct.m45640s2((Message) obj);
            }
        }, new y20() { // from class: l.mfh0
            @Override // p153l.y20
            public final void call(Object obj) {
                SwapAnswerBottomSheetAct.m45639r2((Throwable) obj);
            }
        }));
        i4g0.m138523u("e_sent_answer", pageId(), pf60.m172085a("to_uid", this.f29498o), pf60.m172085a("answer_write", this.f29500q));
        setResult(-1);
        m45610i2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM45646w2 = m45646w2(layoutInflater, viewGroup);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f29495l.setTextColor(getResources().getColor(g9c0.f102819i));
            bnl0.m105526N(this.f29494k, ibc0.f113795F7);
            this.f29496m.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f29496m.setHintTextColor(getResources().getColor(g9c0.f102819i));
            wpe.m207454a(this.f29496m);
            this.f29497n.setTextColor(getResources().getColor(g9c0.f102820j));
            bnl0.m105526N(this.f29490g, ibc0.f114083m7);
        }
        return viewM45646w2;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f29498o = getIntent().getStringExtra("userId");
        this.f29499p = getIntent().getStringExtra("msgId");
        String stringExtra = getIntent().getStringExtra("question");
        this.f29500q = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            List<String> listM133415D = h39.m133415D();
            this.f29500q = listM133415D.get(new SecureRandom().nextInt(listM133415D.size()));
        }
        super.initDataOnCreate();
        creates(new y20() { // from class: l.gfh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103929a.m45634e2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m152781p(pf60.m172085a("answer_write", this.f29500q));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: k2 */
    public View mo45611k2() {
        return this.f29488e;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: l2 */
    public ViewGroup mo45612l2() {
        return this.f29489f;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: m2 */
    public EditText mo45613m2() {
        return this.f29496m;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct
    /* JADX INFO: renamed from: n2 */
    public ViewGroup mo45614n2() {
        return this.f29487d;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return !TextUtils.isEmpty(getIntent().getStringExtra("msgId")) ? "p_exchange_answer_question_pop" : "p_exchange_answer_pop";
    }

    /* JADX INFO: renamed from: w2 */
    public View m45646w2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nfh0.m162928b(this, layoutInflater, viewGroup);
    }
}
