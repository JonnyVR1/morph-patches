package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemBreakIceMessage;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.j760;
import l.l1q;
import l.o6j0;
import l.roj0;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y19;
import l.zvf0;
import p003l.eqh0;
import p003l.r9m;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemBreakIceMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemBreakIceMessage f726a;

    /* JADX INFO: renamed from: b */
    public VLinear f727b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f728c;

    /* JADX INFO: renamed from: d */
    public VImage f729d;

    /* JADX INFO: renamed from: e */
    public VText f730e;

    /* JADX INFO: renamed from: f */
    public VImage f731f;

    /* JADX INFO: renamed from: g */
    public VLinear f732g;

    /* JADX INFO: renamed from: h */
    public VText f733h;

    /* JADX INFO: renamed from: i */
    public VImage f734i;

    /* JADX INFO: renamed from: j */
    public VLinear f735j;

    /* JADX INFO: renamed from: k */
    public VText f736k;

    /* JADX INFO: renamed from: l */
    public VImage f737l;

    /* JADX INFO: renamed from: m */
    public HashSet<String> f738m;

    /* JADX INFO: renamed from: n */
    public Runnable f739n;

    /* JADX INFO: renamed from: o */
    public boolean f740o;

    public ItemBreakIceMessage(Context context) {
        super(context);
        this.f738m = new HashSet<>();
        this.f739n = null;
        this.f740o = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1122b(Runnable runnable, MessagesAct messagesAct, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        zvf0.u("e_close_click", messagesAct.pageId(), new j760[]{j760.a("shortcut_type", "ice_break_write")});
    }

    /* JADX INFO: renamed from: d */
    public final void m1124d(View view) {
        l1q.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1125e(List list, Message message, MessagesAct messagesAct, View view) {
        CoreModule.c.f0.e0.onNext(roj0.a);
        m1130j(this.f733h.getText().toString(), ((BreakIce) list.get(0)).tipId, (BreakIce) list.get(0));
        CoreModule.c.e0.I9(message.cid, ((BreakIce) list.get(0)).tipId);
        m1132l(messagesAct, this.f733h.getText().toString());
        if (NullChecker.a(this.f739n)) {
            this.f739n.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m1126f(List list, Message message, MessagesAct messagesAct, View view) {
        CoreModule.c.f0.e0.onNext(roj0.a);
        m1130j(this.f736k.getText().toString(), ((BreakIce) list.get(1)).tipId, (BreakIce) list.get(0));
        CoreModule.c.e0.I9(message.cid, ((BreakIce) list.get(1)).tipId);
        m1132l(messagesAct, this.f736k.getText().toString());
        if (NullChecker.a(this.f739n)) {
            this.f739n.run();
        }
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
    /* JADX INFO: renamed from: g */
    public void m1127g(final MessagesAct messagesAct, final Message message) {
        if (NullChecker.a(message) && NullChecker.a(message.additionalData) && !vwb.J(message.additionalData.localBreakIce)) {
            xdl0.M(this.f731f, false);
            final List list = message.additionalData.localBreakIce;
            boolean zHm = CoreModule.P().i().hm();
            SVGAnimationView sVGAnimationView = this.f728c;
            if (zHm) {
                xdl0.M(sVGAnimationView, true);
                xdl0.M(this.f729d, false);
                m1129i(messagesAct, message);
                this.f727b.setBackgroundResource(c3c0.D1);
                this.f730e.setTextSize(15.0f);
                this.f730e.setTextColor(Color.parseColor("#9C6F7B"));
            } else {
                xdl0.M(sVGAnimationView, false);
                xdl0.M(this.f729d, true);
                this.f727b.setBackgroundResource(c3c0.w5);
                this.f730e.setTextSize(14.0f);
                this.f730e.setTextColor(Color.parseColor("#66000000"));
            }
            if (list.size() == 1) {
                xdl0.M(this.f735j, false);
                this.f730e.setText(String.format(messagesAct.string(R.string.M5), "1"));
                this.f733h.setText(((BreakIce) list.get(0)).content);
                m1131k(message, ((BreakIce) list.get(0)).content, ((BreakIce) list.get(0)).tipId, (BreakIce) list.get(0));
            } else if (list.size() > 1) {
                xdl0.M(this.f735j, true);
                this.f730e.setText(String.format(messagesAct.string(R.string.M5), "2"));
                this.f733h.setText(((BreakIce) list.get(0)).content);
                this.f736k.setText(((BreakIce) list.get(1)).content);
                m1131k(message, ((BreakIce) list.get(0)).content + ";" + ((BreakIce) list.get(1)).content, ((BreakIce) list.get(0)).tipId + ";" + ((BreakIce) list.get(1)).tipId, (BreakIce) list.get(0));
            }
            this.f732g.setOnClickListener(new View.OnClickListener() { // from class: l.i1q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4321a.m1125e(list, message, messagesAct, view);
                }
            });
            this.f735j.setOnClickListener(new View.OnClickListener() { // from class: l.j1q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4547a.m1126f(list, message, messagesAct, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1128h(final MessagesAct messagesAct, Message message, final Runnable runnable) {
        User userPa;
        this.f739n = runnable;
        m1127g(messagesAct, message);
        if (y19.J() && (userPa = CoreModule.c.e0.Pa(messagesAct.f1531f.m4295r3())) != null) {
            this.f730e.setText(String.format("和%s打个招呼吧", userPa.isFemale() ? "她" : "他"));
        }
        xdl0.V(this.f727b, t100.g);
        xdl0.W(this.f727b, t100.m);
        xdl0.X(this.f727b, 0);
        xdl0.U(this.f727b, 0);
        xdl0.M(this.f731f, true);
        xdl0.E0(this.f731f, new View.OnClickListener() { // from class: l.k1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemBreakIceMessage.m1122b(runnable, messagesAct, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m1129i(MessagesAct messagesAct, Message message) {
        if (this.f740o || TextUtils.equals(r9m.m7149r().m7157s(), message.cid)) {
            if (this.f728c.isAnimating()) {
                return;
            }
            this.f728c.setImageDrawable(messagesAct.drawable(c3c0.V1));
        } else {
            r9m.m7149r().m7153D(message.cid);
            this.f740o = true;
            this.f728c.setImageDrawable(null);
            this.f728c.startAnimation();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m1130j(String str, String str2, BreakIce breakIce) {
        if (CoreModule.P().i().hm()) {
            o6j0.c("e_chat_topic", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_content", str), o6j0.a.h("message_id", str2), o6j0.a.h("response_uuid", breakIce.response_uuid)});
        } else {
            o6j0.c("e_chat_topic", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_content", str), o6j0.a.h("message_id", str2)});
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1131k(Message message, String str, String str2, BreakIce breakIce) {
        if (this.f738m.contains(((DbObject) message).id)) {
            return;
        }
        this.f738m.add(((DbObject) message).id);
        if (CoreModule.P().i().hm()) {
            o6j0.h("e_chat_topic", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_content", str), o6j0.a.h("message_id", str2), o6j0.a.h("response_uuid", breakIce.response_uuid)});
        } else {
            o6j0.h("e_chat_topic", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_content", str), o6j0.a.h("message_id", str2)});
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1132l(MessagesAct messagesAct, String str) {
        messagesAct.f1531f.m4173S6(str);
        if (NullChecker.a(this.f739n)) {
            this.f739n.run();
        }
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
        m1124d(this);
        this.f733h.setTypeface(eqh0.m3924c(3), 1);
        this.f736k.setTypeface(eqh0.m3924c(3), 1);
        this.f730e.setTypeface(eqh0.m3924c(3), 1);
        if (CoreModule.P().i().hm()) {
            this.f727b.setBackgroundResource(c3c0.D1);
            this.f730e.setTextSize(15.0f);
            this.f730e.setTextColor(Color.parseColor("#9C6F7B"));
            SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/4a4c8be8-97f8-48e0-a98b-0d2cbd93f7d814.svga").repeatCount(1).autoPlay(false).into(this.f728c);
        }
        if (ura.e().d().I4()) {
            xdl0.N(this.f729d, c3c0.R1);
            xdl0.N(this.f731f, c3c0.n7);
            xdl0.N(this.f734i, c3c0.Q1);
            xdl0.N(this.f737l, c3c0.Q1);
            this.f730e.setTextColor(getResources().getColor(a1c0.i));
            this.f733h.setTextColor(getResources().getColor(a1c0.g));
            this.f736k.setTextColor(getResources().getColor(a1c0.g));
        }
    }

    public ItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f738m = new HashSet<>();
        this.f739n = null;
        this.f740o = false;
    }

    public ItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f738m = new HashSet<>();
        this.f739n = null;
        this.f740o = false;
    }
}
