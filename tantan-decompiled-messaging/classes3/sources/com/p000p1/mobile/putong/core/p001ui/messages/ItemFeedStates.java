package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemFeedStates;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.view.MessageLinearMaxWidth;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.e51;
import l.ffx;
import l.j760;
import l.knb0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p003l.dml;
import p003l.e30;
import p003l.m250;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemFeedStates extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: j */
    public static int f834j;

    /* JADX INFO: renamed from: a */
    public ItemFeedStates f835a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f836b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f837c;

    /* JADX INFO: renamed from: d */
    public MessageLinearMaxWidth f838d;

    /* JADX INFO: renamed from: e */
    public MessageLinearMaxWidth f839e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f840f;

    /* JADX INFO: renamed from: g */
    public VText f841g;

    /* JADX INFO: renamed from: h */
    public VText f842h;

    /* JADX INFO: renamed from: i */
    public ItemText f843i;

    public ItemFeedStates(@NonNull Context context) {
        super(context);
        onFinishInflate();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m1220e(View view) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m1221f(InterfaceC0102a.a aVar, View view) {
        aVar.mo1435a();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m1222g(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m1223k(Message message, View view) {
        m1231q(message);
        osi0.g("状态已结束");
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return vwb.f0(new knb0[]{vwb.Z(getContext().getString(R.string.c), new Runnable() { // from class: l.y2q
            @Override // java.lang.Runnable
            public final void run() {
                this.f8896a.m1225i();
            }
        }, Integer.valueOf(c3c0.x1), (Object) null)});
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: U */
    public void mo1068U(dml dmlVar, Message message, final InterfaceC0102a.a aVar) {
        this.f843i.mo1210y(message, aVar);
        this.f843i.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.z2q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemFeedStates.m1221f(aVar, view);
            }
        });
        this.f836b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.a3q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemFeedStates.m1220e(view);
            }
        });
        m1228n(dmlVar, message);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1224h(BubbleInfo bubbleInfo) {
        return NullChecker.a(bubbleInfo) && !TextUtils.isEmpty(bubbleInfo.id) && bubbleInfo.createdTime + 8.64E7d > ((double) System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1225i() {
        e51.q(this.f843i.getText().toString());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m1226j(Message message, BubbleInfo bubbleInfo, View view) {
        m1231q(message);
        if (!message.isMe()) {
            CoreModule.N().Dk(getContext(), ((DbObject) CoreModule.K().me_()).id, bubbleInfo.id, "p_messages_view");
        } else if (getContext() instanceof MessagesAct) {
            CoreModule.N().Sg(getContext(), bubbleInfo.id, bubbleInfo.owner.id, true, "p_messages_view");
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m1227l(final Message message, final BubbleInfo bubbleInfo) {
        if (!NullChecker.a(bubbleInfo) || !m1224h(bubbleInfo)) {
            m1232r(true);
            this.f839e.setOnClickListener(new View.OnClickListener() { // from class: l.e3q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3194a.m1223k(message, view);
                }
            });
        } else {
            m1232r(false);
            m1230p(bubbleInfo);
            m1229o(bubbleInfo);
            this.f838d.setOnClickListener(new View.OnClickListener() { // from class: l.d3q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2892a.m1226j(message, bubbleInfo, view);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public void m1228n(dml dmlVar, final Message message) {
        if (TEnum.equals(message.messageType, "state_like")) {
            message.value = "赞了你的状态";
        }
        this.f843i.mo1056A(message);
        dmlVar.mo3522c(getContext(), CoreModule.c.q1.v3(message.isMe() ? message.cid : ((DbObject) CoreModule.c.e0.p9()).id, message.referenceMsgId).take(1)).subscribe((m250) mkd0.H(new e30() { // from class: l.b3q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2338a.m1227l(message, (BubbleInfo) obj);
            }
        }, new e30() { // from class: l.c3q
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemFeedStates.m1222g((Throwable) obj);
            }
        }));
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
    /* JADX INFO: renamed from: o */
    public final void m1229o(@NonNull BubbleInfo bubbleInfo) {
        boolean zIsEmpty = TextUtils.isEmpty(bubbleInfo.value);
        AppCompatTextView appCompatTextView = this.f842h;
        if (zIsEmpty) {
            xdl0.M(appCompatTextView, false);
            ViewGroup.LayoutParams layoutParams = this.f840f.getLayoutParams();
            int i = t100.x;
            layoutParams.width = i;
            layoutParams.height = i;
            this.f840f.setLayoutParams(layoutParams);
            this.f841g.setTextSize(2, 16.0f);
            this.f841g.setTextColor(Color.parseColor("#000000"));
            return;
        }
        xdl0.M(appCompatTextView, true);
        ViewGroup.LayoutParams layoutParams2 = this.f840f.getLayoutParams();
        int i2 = t100.A;
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        this.f840f.setLayoutParams(layoutParams2);
        this.f841g.setTextSize(2, 13.0f);
        this.f841g.setTextColor(Color.parseColor("#4c000000"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f835a = (ItemFeedStates) findViewById(y4c0.Z);
        this.f836b = (FrameLayout) findViewById(y4c0.h4);
        this.f837c = (FrameLayout) findViewById(y4c0.O0);
        this.f838d = findViewById(y4c0.i4);
        this.f839e = findViewById(y4c0.j4);
        this.f840f = (VDraweeView) findViewById(y4c0.G0);
        this.f841g = (VText) findViewById(y4c0.M0);
        this.f842h = (VText) findViewById(y4c0.r0);
        this.f843i = (ItemText) findViewById(y4c0.A4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iD = ffx.d(i);
        f834j = iD;
        this.f838d.setMaxWidth(iD);
        this.f839e.setMaxWidth(f834j);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p */
    public void m1230p(@NonNull BubbleInfo bubbleInfo) {
        qib0.G.N0(this.f840f, bubbleInfo.emotion.emojiUrl, false);
        xdl0.H0(this.f841g, bubbleInfo.emotion.text);
        xdl0.H0(this.f842h, bubbleInfo.value);
    }

    /* JADX INFO: renamed from: q */
    public final void m1231q(Message message) {
        zvf0.u("e_other_state", "p_chat_view", new j760[]{new j760("state_id", message.referenceMsgId), new j760("owner_id", message.owner)});
    }

    /* JADX INFO: renamed from: r */
    public final void m1232r(boolean z) {
        FrameLayout frameLayout = this.f836b;
        if (z) {
            frameLayout.setVisibility(8);
            this.f837c.setVisibility(0);
        } else {
            frameLayout.setVisibility(0);
            this.f837c.setVisibility(8);
        }
    }

    public ItemFeedStates(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFeedStates(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
