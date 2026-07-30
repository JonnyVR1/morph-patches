package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreAiStoryShareStatus;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.a1c0;
import l.c3c0;
import l.e51;
import l.j760;
import l.osi0;
import l.ue7;
import l.xdl0;
import l.zvf0;
import p003l.e30;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CoreChatAiSendMomentItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CoreChatAiSendMomentItem f595a;

    /* JADX INFO: renamed from: b */
    public VLinear f596b;

    /* JADX INFO: renamed from: c */
    public VImage f597c;

    /* JADX INFO: renamed from: d */
    public VText f598d;

    /* JADX INFO: renamed from: e */
    public boolean f599e;

    public CoreChatAiSendMomentItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m958d(View view) {
        ue7.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m959e() {
        return getContext();
    }

    /* JADX INFO: renamed from: f */
    public String m960f(Message message) {
        if (message != null && User.isAiStory(message.owner) && !TextUtils.isEmpty(message.msgData)) {
            try {
                CoreAiStoryShareStatus coreAiStoryShareStatus = (CoreAiStoryShareStatus) CoreAiStoryShareStatus.JSON_ADAPTER.parse(message.msgData);
                if (NullChecker.a(coreAiStoryShareStatus)) {
                    return coreAiStoryShareStatus.shareStatus;
                }
            } catch (IOException e) {
                CrashHelper.c(e);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m961g(Message message, String str) {
        if (TextUtils.isEmpty(str)) {
            osi0.g("分享失败，请重试");
            return;
        }
        zvf0.u("e_ai_story_share_to_moment", "p_chat_view", new j760[]{new j760("moment_id", str), new j760("message_id", message == null ? "" : ((DbObject) message).id)});
        CoreModule.c.f0.Kn(message.owner, ((DbObject) message).id);
        e51.M(new Runnable() { // from class: l.te7
            @Override // java.lang.Runnable
            public final void run() {
                this.f7457a.m964j();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m962h(final Message message, View view) {
        if (CoreModule.N().isPostingMoment()) {
            return;
        }
        CoreModule.N().Kr(m959e(), message.value, ((DbObject) message).id, new e30() { // from class: l.se7
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7223a.m961g(message, (String) obj);
            }
        });
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
    /* JADX INFO: renamed from: i */
    public void m963i(final Message message) {
        if (message == null) {
            setVisibility(8);
            return;
        }
        if (m966l(message)) {
            xdl0.E0(this.f596b, new View.OnClickListener() { // from class: l.re7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6893a.m962h(message, view);
                }
            });
            setVisibility(0);
            this.f597c.setImageResource(c3c0.j);
            this.f598d.setText("分享至动态");
            this.f598d.setTextColor(CoreModule.b.getResources().getColor(a1c0.v));
        } else {
            if (!m965k(message)) {
                this.f596b.setOnClickListener(null);
                setVisibility(8);
                return;
            }
            m964j();
        }
        if (this.f599e) {
            return;
        }
        this.f599e = true;
        zvf0.A("e_ai_story_share_to_moment", "p_chat_view", new j760[]{new j760("message_id", ((DbObject) message).id)});
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
    /* JADX INFO: renamed from: j */
    public final void m964j() {
        this.f596b.setOnClickListener(null);
        setVisibility(0);
        this.f597c.setImageResource(c3c0.i);
        this.f598d.setText("已分享至动态");
        this.f598d.setTextColor(CoreModule.b.getResources().getColor(a1c0.s));
    }

    /* JADX INFO: renamed from: k */
    public boolean m965k(Message message) {
        return TextUtils.equals(m960f(message), "shared");
    }

    /* JADX INFO: renamed from: l */
    public boolean m966l(Message message) {
        return TextUtils.equals(m960f(message), "toShare");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m958d(this);
    }

    public CoreChatAiSendMomentItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreChatAiSendMomentItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
