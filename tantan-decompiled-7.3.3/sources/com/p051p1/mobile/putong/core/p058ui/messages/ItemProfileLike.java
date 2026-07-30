package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.ProfileLikeComment;
import com.p051p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemProfileLike;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageLinearMaxWidth;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dox;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.ovb0;
import p153l.pf60;
import p153l.pol;
import p153l.qa00;
import p153l.tvz;
import p153l.uqb0;
import p153l.zfm;

/* JADX INFO: loaded from: classes3.dex */
public class ItemProfileLike extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: j */
    public static int f32246j;

    /* JADX INFO: renamed from: a */
    public ItemProfileLike f32247a;

    /* JADX INFO: renamed from: b */
    public MessageLinearMaxWidth f32248b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32249c;

    /* JADX INFO: renamed from: d */
    public VImage f32250d;

    /* JADX INFO: renamed from: e */
    public VText f32251e;

    /* JADX INFO: renamed from: f */
    public VText f32252f;

    /* JADX INFO: renamed from: g */
    public ItemText f32253g;

    /* JADX INFO: renamed from: h */
    public ProfileLikeComment f32254h;

    /* JADX INFO: renamed from: i */
    public Set<String> f32255i;

    public ItemProfileLike(@NonNull Context context) {
        super(context);
        this.f32255i = new HashSet();
        onFinishInflate();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m49767b(View view) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m49768c(View view) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m49769d() {
        l51.m152911q(this.f32253g.getText().toString());
    }

    /* JADX INFO: renamed from: e */
    private void m49770e(Message message) {
        if (!NullChecker.m82486a(this.f32254h) || TextUtils.isEmpty(this.f32254h.snapshot) || message.tempProfileLikeSnapshot == null || this.f32255i.contains(this.f32254h.f21217id)) {
            return;
        }
        this.f32255i.add(this.f32254h.f21217id);
        i4g0.m138492A("e_profile_like_message", OMSDialogPositon.p_chat_view, new pf60("other_user_id", message.owner), new pf60("profile_module", getModuleName()), new pf60("have_comment", Boolean.valueOf(message.tempProfileLikeSnapshot.hasComment)));
    }

    private String getModuleName() {
        if (TextUtils.isEmpty(this.f32254h.module)) {
            return "NA";
        }
        String str = this.f32254h.module;
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
        if (!NullChecker.m82486a(this.f32254h) || TextUtils.isEmpty(this.f32254h.snapshot)) {
            bnl0.m105524M(this.f32248b, false);
            return;
        }
        if (message.tempProfileLikeSnapshot == null) {
            try {
                profileLikeSnapshot = ProfileLikeSnapshot.JSON_ADAPTER.parse(this.f32254h.snapshot);
            } catch (IOException unused) {
                profileLikeSnapshot = null;
            }
            message.tempProfileLikeSnapshot = profileLikeSnapshot;
        }
        bnl0.m105524M(this.f32248b, NullChecker.m82486a(message.tempProfileLikeSnapshot));
        if (message.tempProfileLikeSnapshot == null) {
            return;
        }
        bnl0.m105524M(this.f32249c, false);
        bnl0.m105524M(this.f32250d, false);
        this.f32251e.setText(message.tempProfileLikeSnapshot.title);
        bnl0.m105524M(this.f32252f, !TextUtils.isEmpty(message.tempProfileLikeSnapshot.desc));
        if (!TextUtils.isEmpty(message.tempProfileLikeSnapshot.desc)) {
            this.f32252f.setText(message.tempProfileLikeSnapshot.desc);
        }
        this.f32253g.setText(this.f32254h.comment);
        String str = this.f32254h.module;
        str.getClass();
        if (str.equals("aboutMe")) {
            if (gta.m132210e().m132214d().mo34702I4()) {
                bnl0.m105526N(this.f32250d, ibc0.f113874O5);
            } else {
                bnl0.m105501A0(getContext(), this.f32250d, ibc0.f114174x);
                bnl0.m105526N(this.f32250d, ibc0.f113865N5);
            }
            bnl0.m105524M(this.f32250d, true);
            return;
        }
        if (!str.equals("question")) {
            bnl0.m105524M(this.f32249c, true);
            uqb0.f180374G.m127119N0(this.f32249c, message.tempProfileLikeSnapshot.picture, false);
            return;
        }
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f32250d, ibc0.f113892Q5);
        } else {
            bnl0.m105501A0(getContext(), this.f32250d, ibc0.f114183y);
            bnl0.m105526N(this.f32250d, ibc0.f113883P5);
        }
        bnl0.m105524M(this.f32250d, true);
    }

    private void setWarmingUp(Message message) {
        if (message != null && CoreModule.m30929H().userId().equals(message.owner) && (getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f32488f instanceof tvz)) {
            MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM111004l3 = ((tvz) ((MessagesAct) getContext()).f32488f).m111004l3();
            if (warmingUpLevelM111004l3.value > MessageWarmingUpHelper.WarmingUpLevel.first.value) {
                ItemText itemText = this.f32253g;
                int iM50362i = MessageWarmingUpHelper.m50362i(warmingUpLevelM111004l3);
                int i = qa00.f156322i;
                zfm.m219546b(itemText, iM50362i, i, -1, 0, 0, 0);
                zfm.m219546b(this.f32248b, MessageWarmingUpHelper.m50362i(warmingUpLevelM111004l3), i, -1, 0, 0, 0);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32253g.mo43399A(message);
        try {
            this.f32254h = ProfileLikeComment.JSON_ADAPTER.parse(message.msgData);
        } catch (Exception unused) {
        }
        if (NullChecker.m82486a(this.f32254h) && NullChecker.m82486a(this.f32254h.snapshot)) {
            setContent(message);
            m49770e(message);
            setWarmingUp(message);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return jyb.m147507f0(jyb.m147495Z(getContext().getString(R$string.f21676c), new Runnable() { // from class: l.ieq
            @Override // java.lang.Runnable
            public final void run() {
                this.f114606a.m49769d();
            }
        }, Integer.valueOf(ibc0.f114176x1), null));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(pol polVar, Message message, InterfaceC8682a.a aVar) {
        this.f32253g.mo49313y(message, aVar);
        this.f32253g.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jeq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemProfileLike.m49768c(view);
            }
        });
        this.f32248b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.keq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemProfileLike.m49767b(view);
            }
        });
        mo43399A(message);
        setWarmingUp(message);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32247a = (ItemProfileLike) findViewById(edc0.f93316Z);
        this.f32248b = (MessageLinearMaxWidth) findViewById(edc0.f93323a0);
        this.f32249c = (VDraweeView) findViewById(edc0.f93372h0);
        this.f32250d = (VImage) findViewById(edc0.f93394k1);
        this.f32251e = (VText) findViewById(edc0.f93267Q4);
        this.f32252f = (VText) findViewById(edc0.f93442r0);
        this.f32253g = (ItemText) findViewById(edc0.f93168A4);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32251e.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32252f.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM117366d = dox.m117366d(i);
        f32246j = iM117366d;
        this.f32248b.setMaxWidth(iM117366d);
        super.onMeasure(i, i2);
    }

    public ItemProfileLike(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32255i = new HashSet();
    }

    public ItemProfileLike(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32255i = new HashSet();
    }
}
