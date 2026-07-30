package com.p000p1.mobile.putong.core.p001ui.messages.question;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.question.MaleChatGuideView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p1.mobile.putong.core.ui.messages.b;
import com.p1.mobile.putong.core.ui.view.GradientBgButton;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.crw;
import l.e30;
import l.gu4;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.qvy;
import l.vwb;
import l.xdl0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MaleChatGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f0a;

    /* JADX INFO: renamed from: b */
    public VImage f1b;

    /* JADX INFO: renamed from: c */
    public GradientBgButton f2c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f3d;

    /* JADX INFO: renamed from: e */
    public VText f4e;

    /* JADX INFO: renamed from: f */
    public VLinear f5f;

    /* JADX INFO: renamed from: g */
    public VText f6g;

    /* JADX INFO: renamed from: h */
    public VText f7h;

    /* JADX INFO: renamed from: i */
    public VLinear f8i;

    /* JADX INFO: renamed from: j */
    public VText f9j;

    /* JADX INFO: renamed from: k */
    public VText f10k;

    /* JADX INFO: renamed from: l */
    public VLinear f11l;

    /* JADX INFO: renamed from: m */
    public VText f12m;

    /* JADX INFO: renamed from: n */
    public VText f13n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.question.MaleChatGuideView$a */
    public class C0000a implements b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qvy f14a;

        public C0000a(qvy qvyVar) {
            this.f14a = qvyVar;
        }

        /* JADX INFO: renamed from: a */
        public String m17a() {
            return this.f14a.p0();
        }

        /* JADX INFO: renamed from: b */
        public String m18b() {
            return this.f14a.p0();
        }

        /* JADX INFO: renamed from: c */
        public boolean m19c() {
            return CoreModule.P().i().D() && !User.isTeamAccount(this.f14a.p0());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.question.MaleChatGuideView$b */
    public interface InterfaceC0001b {
        /* JADX INFO: renamed from: a */
        void m20a(IceBreakingQuestion iceBreakingQuestion);
    }

    public MaleChatGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5a(InterfaceC0001b interfaceC0001b, List list, View view) {
        interfaceC0001b.m20a((IceBreakingQuestion) list.get(1));
        gu4.b("2", (IceBreakingQuestion) list.get(1));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6b(qvy qvyVar, String str, View view) {
        o6j0.c("e_chat_avatar", qvyVar.pageId(), new o6j0.a[]{o6j0.a.h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.H().userId(), str)))});
        qvyVar.C0("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8d(InterfaceC0001b interfaceC0001b, List list, View view) {
        interfaceC0001b.m20a((IceBreakingQuestion) list.get(2));
        gu4.b("3", (IceBreakingQuestion) list.get(2));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m9e(qvy qvyVar, String str, View view) {
        o6j0.c("e_chat_avatar", qvyVar.pageId(), new o6j0.a[]{o6j0.a.h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.H().userId(), str)))});
        qvyVar.C0("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m10f(InterfaceC0001b interfaceC0001b, List list, View view) {
        interfaceC0001b.m20a((IceBreakingQuestion) list.get(0));
        gu4.b("1", (IceBreakingQuestion) list.get(0));
    }

    /* JADX INFO: renamed from: g */
    public final void m11g(View view) {
        crw.a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m13i(final List<IceBreakingQuestion> list, @NonNull final InterfaceC0001b interfaceC0001b) {
        if (vwb.J(list)) {
            xdl0.M(this, false);
            return;
        }
        xdl0.M(this, true);
        xdl0.M(this.f5f, list.size() > 0);
        xdl0.M(this.f8i, list.size() > 1);
        xdl0.M(this.f11l, list.size() > 2);
        if (list.size() > 0) {
            m14j(this.f6g, list.get(0));
        }
        if (list.size() > 1) {
            m14j(this.f9j, list.get(1));
        }
        if (list.size() > 2) {
            m14j(this.f12m, list.get(2));
        }
        gu4.a(list);
        xdl0.E0(this.f7h, new View.OnClickListener() { // from class: l.wqw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m10f(interfaceC0001b, list, view);
            }
        });
        xdl0.E0(this.f10k, new View.OnClickListener() { // from class: l.xqw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m5a(interfaceC0001b, list, view);
            }
        });
        xdl0.E0(this.f13n, new View.OnClickListener() { // from class: l.yqw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m8d(interfaceC0001b, list, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m14j(VText vText, IceBreakingQuestion iceBreakingQuestion) {
        vText.setText(iceBreakingQuestion.content);
    }

    /* JADX INFO: renamed from: k */
    public void m15k(final qvy qvyVar, final e30<VDraweeView> e30Var, final String str) {
        if (CoreModule.P().i().D() && !User.isTeamAccount(qvyVar.p0())) {
            b.r(this.f0a, new C0000a(qvyVar), new View.OnClickListener() { // from class: l.zqw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaleChatGuideView.m6b(qvyVar, str, view);
                }
            });
        }
        xdl0.E0(this.f0a, new View.OnClickListener() { // from class: l.arw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaleChatGuideView.m9e(qvyVar, str, view);
            }
        });
        qvyVar.duringCreated(CoreModule.c.e0.Ka(str)).subscribe(mkd0.G(new e30() { // from class: l.brw
            public final void call(Object obj) {
                this.f8321a.m12h(qvyVar, e30Var, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void m12h(qvy qvyVar, e30<VDraweeView> e30Var, User user) {
        if (e30Var != null) {
            e30Var.call(this.f0a);
        }
        qib0.G.Q0(this.f0a, user.fp().profileSmall());
        xdl0.M(this.f1b, false);
        if (CoreModule.P().i().G1()) {
            xdl0.M(this.f2c, false);
        } else {
            qvyVar.q0().E().m23535y0().j(this.f2c, this.f1b, user);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11g(this);
    }

    public MaleChatGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaleChatGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
