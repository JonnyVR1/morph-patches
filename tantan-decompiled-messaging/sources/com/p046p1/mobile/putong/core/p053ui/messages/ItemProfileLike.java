package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemProfileLike;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageLinearMaxWidth;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.dml;
import p149l.e51;
import p149l.ffx;
import p149l.j760;
import p149l.jdm;
import p149l.knb0;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.wmz;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemProfileLike extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: j */
    public static int f31398j;

    /* JADX INFO: renamed from: a */
    public ItemProfileLike f31399a;

    /* JADX INFO: renamed from: b */
    public MessageLinearMaxWidth f31400b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31401c;

    /* JADX INFO: renamed from: d */
    public VImage f31402d;

    /* JADX INFO: renamed from: e */
    public VText f31403e;

    /* JADX INFO: renamed from: f */
    public VText f31404f;

    /* JADX INFO: renamed from: g */
    public ItemText f31405g;

    /* JADX INFO: renamed from: h */
    public ProfileLikeComment f31406h;

    /* JADX INFO: renamed from: i */
    public Set<String> f31407i;

    public ItemProfileLike(@NonNull Context context) {
        super(context);
        this.f31407i = new HashSet();
        onFinishInflate();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m48584b(View view) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m48585c(View view) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m48586d() {
        e51.m114766q(this.f31405g.getText().toString());
    }

    /* JADX INFO: renamed from: e */
    private void m48587e(Message message) {
        if (!NullChecker.m81303a(this.f31406h) || TextUtils.isEmpty(this.f31406h.snapshot) || message.tempProfileLikeSnapshot == null || this.f31407i.contains(this.f31406h.f20475id)) {
            return;
        }
        this.f31407i.add(this.f31406h.f20475id);
        zvf0.m220368A("e_profile_like_message", OMSDialogPositon.p_chat_view, new j760("other_user_id", message.owner), new j760("profile_module", getModuleName()), new j760("have_comment", Boolean.valueOf(message.tempProfileLikeSnapshot.hasComment)));
    }

    private String getModuleName() {
        if (TextUtils.isEmpty(this.f31406h.module)) {
            return "NA";
        }
        String str = this.f31406h.module;
        str.getClass();
        switch (str) {
            case "aboutMe":
                return "self_introduction";
            case "question":
                return Answer.TYPE;
            case "pet":
                return "pet";
            case "game":
                return "game";
            case "mbti":
                return ProfileLikeType.mbti;
            case "life_pic":
                return ReminderAction.photo;
            default:
                return "unknown";
        }
    }

    private void setContent(Message message) {
        ProfileLikeSnapshot profileLikeSnapshot;
        if (!NullChecker.m81303a(this.f31406h) || TextUtils.isEmpty(this.f31406h.snapshot)) {
            xdl0.m208344M(this.f31400b, false);
            return;
        }
        if (message.tempProfileLikeSnapshot == null) {
            try {
                profileLikeSnapshot = ProfileLikeSnapshot.JSON_ADAPTER.parse(this.f31406h.snapshot);
            } catch (IOException unused) {
                profileLikeSnapshot = null;
            }
            message.tempProfileLikeSnapshot = profileLikeSnapshot;
        }
        xdl0.m208344M(this.f31400b, NullChecker.m81303a(message.tempProfileLikeSnapshot));
        if (message.tempProfileLikeSnapshot == null) {
            return;
        }
        xdl0.m208344M(this.f31401c, false);
        xdl0.m208344M(this.f31402d, false);
        this.f31403e.setText(message.tempProfileLikeSnapshot.title);
        xdl0.m208344M(this.f31404f, !TextUtils.isEmpty(message.tempProfileLikeSnapshot.desc));
        if (!TextUtils.isEmpty(message.tempProfileLikeSnapshot.desc)) {
            this.f31404f.setText(message.tempProfileLikeSnapshot.desc);
        }
        this.f31405g.setText(this.f31406h.comment);
        String str = this.f31406h.module;
        str.getClass();
        if (str.equals("aboutMe")) {
            if (ura.m195053e().m195057d().mo33699I4()) {
                xdl0.m208346N(this.f31402d, c3c0.f78599O5);
            } else {
                xdl0.m208321A0(getContext(), this.f31402d, c3c0.f78899x);
                xdl0.m208346N(this.f31402d, c3c0.f78590N5);
            }
            xdl0.m208344M(this.f31402d, true);
            return;
        }
        if (!str.equals("question")) {
            xdl0.m208344M(this.f31401c, true);
            qib0.f154691G.m102335N0(this.f31401c, message.tempProfileLikeSnapshot.picture, false);
            return;
        }
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f31402d, c3c0.f78617Q5);
        } else {
            xdl0.m208321A0(getContext(), this.f31402d, c3c0.f78908y);
            xdl0.m208346N(this.f31402d, c3c0.f78608P5);
        }
        xdl0.m208344M(this.f31402d, true);
    }

    private void setWarmingUp(Message message) {
        if (message != null && CoreModule.m29931H().userId().equals(message.owner) && (getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f31640f instanceof wmz)) {
            MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM120798l3 = ((wmz) ((MessagesAct) getContext()).f31640f).m120798l3();
            if (warmingUpLevelM120798l3.value > MessageWarmingUpHelper.WarmingUpLevel.first.value) {
                ItemText itemText = this.f31405g;
                int iM49179i = MessageWarmingUpHelper.m49179i(warmingUpLevelM120798l3);
                int i = t100.f167260i;
                jdm.m141040b(itemText, iM49179i, i, -1, 0, 0, 0);
                jdm.m141040b(this.f31400b, MessageWarmingUpHelper.m49179i(warmingUpLevelM120798l3), i, -1, 0, 0, 0);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31405g.mo42388A(message);
        try {
            this.f31406h = ProfileLikeComment.JSON_ADAPTER.parse(message.msgData);
        } catch (Exception unused) {
        }
        if (NullChecker.m81303a(this.f31406h) && NullChecker.m81303a(this.f31406h.snapshot)) {
            setContent(message);
            m48587e(message);
            setWarmingUp(message);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return vwb.m200324f0(vwb.m200312Z(getContext().getString(R$string.f20934c), new Runnable() { // from class: l.icq
            @Override // java.lang.Runnable
            public final void run() {
                this.f112474a.m48586d();
            }
        }, Integer.valueOf(c3c0.f78901x1), null));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(dml dmlVar, Message message, InterfaceC8519a.a aVar) {
        this.f31405g.mo48130y(message, aVar);
        this.f31405g.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jcq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemProfileLike.m48585c(view);
            }
        });
        this.f31400b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.kcq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemProfileLike.m48584b(view);
            }
        });
        mo42388A(message);
        setWarmingUp(message);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31399a = (ItemProfileLike) findViewById(y4c0.f196081Z);
        this.f31400b = (MessageLinearMaxWidth) findViewById(y4c0.f196088a0);
        this.f31401c = (VDraweeView) findViewById(y4c0.f196137h0);
        this.f31402d = (VImage) findViewById(y4c0.f196159k1);
        this.f31403e = (VText) findViewById(y4c0.f196032Q4);
        this.f31404f = (VText) findViewById(y4c0.f196207r0);
        this.f31405g = (ItemText) findViewById(y4c0.f195933A4);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31403e.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31404f.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM121201d = ffx.m121201d(i);
        f31398j = iM121201d;
        this.f31400b.setMaxWidth(iM121201d);
        super.onMeasure(i, i2);
    }

    public ItemProfileLike(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31407i = new HashSet();
    }

    public ItemProfileLike(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31407i = new HashSet();
    }
}
