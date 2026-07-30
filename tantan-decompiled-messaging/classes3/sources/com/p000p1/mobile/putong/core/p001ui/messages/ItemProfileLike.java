package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemProfileLike;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.ProfileLikeComment;
import com.p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.view.MessageLinearMaxWidth;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.a1c0;
import l.c3c0;
import l.e51;
import l.ffx;
import l.j760;
import l.jdm;
import l.knb0;
import l.qib0;
import l.t100;
import l.ura;
import l.vwb;
import l.wmz;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p003l.dml;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VText;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemProfileLike extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: j */
    public static int f1289j;

    /* JADX INFO: renamed from: a */
    public ItemProfileLike f1290a;

    /* JADX INFO: renamed from: b */
    public MessageLinearMaxWidth f1291b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1292c;

    /* JADX INFO: renamed from: d */
    public VImage f1293d;

    /* JADX INFO: renamed from: e */
    public VText f1294e;

    /* JADX INFO: renamed from: f */
    public VText f1295f;

    /* JADX INFO: renamed from: g */
    public ItemText f1296g;

    /* JADX INFO: renamed from: h */
    public ProfileLikeComment f1297h;

    /* JADX INFO: renamed from: i */
    public Set<String> f1298i;

    public ItemProfileLike(@NonNull Context context) {
        super(context);
        this.f1298i = new HashSet();
        onFinishInflate();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m1668b(View view) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m1669c(View view) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m1670d() {
        e51.q(this.f1296g.getText().toString());
    }

    /* JADX INFO: renamed from: e */
    private void m1671e(Message message) {
        if (!NullChecker.a(this.f1297h) || TextUtils.isEmpty(this.f1297h.snapshot) || message.tempProfileLikeSnapshot == null || this.f1298i.contains(this.f1297h.id)) {
            return;
        }
        this.f1298i.add(this.f1297h.id);
        zvf0.A("e_profile_like_message", "p_chat_view", new j760[]{new j760("other_user_id", message.owner), new j760("profile_module", getModuleName()), new j760("have_comment", Boolean.valueOf(message.tempProfileLikeSnapshot.hasComment))});
    }

    private String getModuleName() {
        if (TextUtils.isEmpty(this.f1297h.module)) {
            return "NA";
        }
        String str = this.f1297h.module;
        str.getClass();
        switch (str) {
            case "aboutMe":
                return "self_introduction";
            case "question":
                return "answer";
            case "pet":
                return "pet";
            case "game":
                return "game";
            case "mbti":
                return "mbti";
            case "life_pic":
                return "photo";
            default:
                return IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN;
        }
    }

    private void setContent(Message message) {
        ProfileLikeSnapshot profileLikeSnapshot;
        if (!NullChecker.a(this.f1297h) || TextUtils.isEmpty(this.f1297h.snapshot)) {
            xdl0.M(this.f1291b, false);
            return;
        }
        if (message.tempProfileLikeSnapshot == null) {
            try {
                profileLikeSnapshot = (ProfileLikeSnapshot) ProfileLikeSnapshot.JSON_ADAPTER.parse(this.f1297h.snapshot);
            } catch (IOException unused) {
                profileLikeSnapshot = null;
            }
            message.tempProfileLikeSnapshot = profileLikeSnapshot;
        }
        xdl0.M(this.f1291b, NullChecker.a(message.tempProfileLikeSnapshot));
        if (message.tempProfileLikeSnapshot == null) {
            return;
        }
        xdl0.M(this.f1292c, false);
        xdl0.M(this.f1293d, false);
        this.f1294e.setText(message.tempProfileLikeSnapshot.title);
        xdl0.M(this.f1295f, !TextUtils.isEmpty(message.tempProfileLikeSnapshot.desc));
        if (!TextUtils.isEmpty(message.tempProfileLikeSnapshot.desc)) {
            this.f1295f.setText(message.tempProfileLikeSnapshot.desc);
        }
        this.f1296g.setText(this.f1297h.comment);
        String str = this.f1297h.module;
        str.getClass();
        if (str.equals("aboutMe")) {
            if (ura.e().d().I4()) {
                xdl0.N(this.f1293d, c3c0.O5);
            } else {
                xdl0.A0(getContext(), this.f1293d, c3c0.x);
                xdl0.N(this.f1293d, c3c0.N5);
            }
            xdl0.M(this.f1293d, true);
            return;
        }
        if (!str.equals("question")) {
            xdl0.M(this.f1292c, true);
            qib0.G.N0(this.f1292c, message.tempProfileLikeSnapshot.picture, false);
            return;
        }
        if (ura.e().d().I4()) {
            xdl0.N(this.f1293d, c3c0.Q5);
        } else {
            xdl0.A0(getContext(), this.f1293d, c3c0.y);
            xdl0.N(this.f1293d, c3c0.P5);
        }
        xdl0.M(this.f1293d, true);
    }

    private void setWarmingUp(Message message) {
        if (message != null && CoreModule.H().userId().equals(message.owner) && (getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f1531f instanceof wmz)) {
            MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM4265l3 = ((MessagesAct) getContext()).f1531f.m4265l3();
            if (warmingUpLevelM4265l3.value > MessageWarmingUpHelper.WarmingUpLevel.first.value) {
                AppCompatTextView appCompatTextView = this.f1296g;
                int iM2298i = MessageWarmingUpHelper.m2298i(warmingUpLevelM4265l3);
                int i = t100.i;
                jdm.b(appCompatTextView, iM2298i, i, -1, 0, 0, 0);
                jdm.b(this.f1291b, MessageWarmingUpHelper.m2298i(warmingUpLevelM4265l3), i, -1, 0, 0, 0);
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1296g.mo1056A(message);
        try {
            this.f1297h = (ProfileLikeComment) ProfileLikeComment.JSON_ADAPTER.parse(message.msgData);
        } catch (Exception unused) {
        }
        if (NullChecker.a(this.f1297h) && NullChecker.a(this.f1297h.snapshot)) {
            setContent(message);
            m1671e(message);
            setWarmingUp(message);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return vwb.f0(new knb0[]{vwb.Z(getContext().getString(R.string.c), new Runnable() { // from class: l.icq
            @Override // java.lang.Runnable
            public final void run() {
                this.f4391a.m1670d();
            }
        }, Integer.valueOf(c3c0.x1), (Object) null)});
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: U */
    public void mo1068U(dml dmlVar, Message message, InterfaceC0102a.a aVar) {
        this.f1296g.mo1210y(message, aVar);
        this.f1296g.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jcq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemProfileLike.m1669c(view);
            }
        });
        this.f1291b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.kcq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemProfileLike.m1668b(view);
            }
        });
        mo1056A(message);
        setWarmingUp(message);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1290a = (ItemProfileLike) findViewById(y4c0.Z);
        this.f1291b = findViewById(y4c0.a0);
        this.f1292c = (VDraweeView) findViewById(y4c0.h0);
        this.f1293d = (VImage) findViewById(y4c0.k1);
        this.f1294e = (VText) findViewById(y4c0.Q4);
        this.f1295f = (VText) findViewById(y4c0.r0);
        this.f1296g = (ItemText) findViewById(y4c0.A4);
        if (ura.e().d().I4()) {
            this.f1294e.setTextColor(getResources().getColor(a1c0.g));
            this.f1295f.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iD = ffx.d(i);
        f1289j = iD;
        this.f1291b.setMaxWidth(iD);
        super.onMeasure(i, i2);
    }

    public ItemProfileLike(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1298i = new HashSet();
    }

    public ItemProfileLike(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1298i = new HashSet();
    }
}
